(ns portkey.awsgen
  (:require [cheshire.core :as json]

            [clojure.java.io :as io]
            [clojure.spec.alpha :as spec]
            [clojure.string :as str]

            [net.cgrand.xforms :as x]

            [portkey.aws :as aws]))


;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃                 ___                      ___          _     _                ┃
;; ┃                / __|_ __  ___ __   ___  | _ \__ _ _ _| |_  / |               ┃
;; ┃                \__ \ '_ \/ -_) _| |___| |  _/ _` | '_|  _| | |               ┃
;; ┃                |___/ .__/\___\__|       |_| \__,_|_|  \__| |_|               ┃
;; ┃                    |_|                                                       ┃
;; ┃     There are two blocks of code related to spec, the first one is used      ┃
;; ┃      at compile time. It let us validate that we know all description        ┃
;; ┃                      format from aws api-2.json files.                       ┃
;; ┃     The second block of specs is used at runtime to validate user input.     ┃
;; ┃      We generate spec/def that will be part of the final lib.clj file.       ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

;;;;;;;;;;;;;;;;;;
;; SPEC HELPERS ;;
;;;;;;;;;;;;;;;;;;


(defmacro ^:private strict-strs
  "Allows to specify a string-keyed map in a strict manner (any unknown key
   triggers a validation error).
   This brittle behavior is on purpose: strict-strs is meant to be used to
   validate the API json files and we want to know when something new appears
   in a json file."
  [& {:keys [req opt]}]
  `(spec/and
    (spec/every
     (spec/or
      ~@(mapcat (fn [[field spec]]
                  [(keyword field)
                   `(spec/tuple #{~field} ~spec)]) (concat req opt)))
     :kind map?)
    (fn [m#]
      (every? #(contains? m# %) [~@(keys req)]))))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; COMPILE TIME SHAPE SPECS ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defmulti compile-time-shape-spec #(get % "type"))


(spec/def ::shape (spec/multi-spec compile-time-shape-spec #(assoc %1 "type" %2)))


(defmethod compile-time-shape-spec "string" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"max"        int?
         "min"        int?
         "pattern"    string?
         "enum"       (spec/coll-of string?)
         "sensitive"  boolean?
         "deprecated" boolean?}))


(defmethod compile-time-shape-spec "integer" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"max"        int?
         "min"        int?
         "box"        boolean?
         "deprecated" boolean?}))


(defmethod compile-time-shape-spec "boolean" [_]
  (strict-strs :req {"type" string?}
               :opt {"box" boolean?}))


(defmethod compile-time-shape-spec "timestamp" [_]
  (strict-strs :req {"type" string?}
               :opt {"timestampFormat" #{"iso8601" "unixTimestamp"}}))


(defmethod compile-time-shape-spec "blob" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"streaming" boolean?
         "max"       int?
         "min"       int?
         "sensitive" boolean?}))


(defmethod compile-time-shape-spec "float" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"min" int?
         "max" int?}))


(defmethod compile-time-shape-spec "long" [_]
  (strict-strs
   :req {"type" string?}
   :opt {"min" #(or (pos-int? %) (zero? %))
         "max" int?}))


(defmethod compile-time-shape-spec "double" [_]
  (strict-strs :req {"type" string?}
               :opt {"min" number?
                     "max" number?
                     "box" boolean?}))


(defmethod compile-time-shape-spec "list" [_]
  (strict-strs
   :req {"type"   string?
         "member" (strict-strs :req {"shape" string?}
                               :opt {"locationName" string?
                                     "jsonvalue"    boolean?})}
   :opt {"max"        int?
         "min"        int?
         "deprecated" boolean?
         "flattened"  boolean?
         "sensitive"  boolean?}))


(defmethod compile-time-shape-spec "map" [_]
  (strict-strs
   :req {"type"  string?
         "key"   (strict-strs :req {"shape" string?} :opt {"locationName" string?})
         "value" (strict-strs :req {"shape" string?} :opt {"locationName" string?})}
   :opt {"sensitive"    boolean?
         "max"          int?
         "min"          int?
         "flattened"    boolean?
         "locationName" string?}))


;;@NOTE - @dupuchba : the structure aws type is always at the root of
;;a payload if present
(defmethod compile-time-shape-spec "structure" [_]
  (strict-strs
   :req {"type"    string?
         "members" (spec/map-of string?
                                (strict-strs
                                 :req {"shape" string?}
                                 :opt {"location"                         #{"uri" "querystring" "header" "headers" "statusCode"}
                                       "locationName"                     string?
                                       "queryName"                        string?
                                       "deprecated"                       boolean?
                                       "eventpayload"                     boolean? ;; @TODO : validate what it does - rest-xml protocol / S3
                                       "idempotencyToken"                 boolean?
                                       "xmlNamespace"
                                       (strict-strs :req {"uri" string?}) ; TODO validate
                                       "xmlAttribute"                     boolean?
                                       "box"                              boolean?
                                       "jsonValue"                        boolean?
                                       "jsonvalue"                        boolean?
                                       "streaming"                        boolean?
                                       "flattened"                        boolean?}))}
   :opt {"required"          (spec/coll-of string?)
         "error"             (strict-strs
                              :req {"httpStatusCode" int?}
                              :opt {"code" string? "senderFault" boolean?})
         "exception"         boolean?
         "fault"             boolean?
         "payload"           string?
         "event"             boolean? ;; @TODO: validate what it does ! WTF !!! rest-xml protocol / s3
         "eventstream"       boolean? ;; @TODO: validate what it does ! rest-xml protocol / s3
         "deprecated"        boolean?
         "deprecatedMessage" string?
         "locationName"      string?
         "sensitive"         boolean?
         "synthetic"         boolean?
         "wrapper"           boolean?
         "xmlOrder"          (spec/coll-of string?)
         "xmlNamespace"
         (strict-strs :req {"uri" string?} ; TODO validate
                      :opt {"prefix" string?})}))


(defn assert-shape-spec
  "Assert a shape. This function is here to fail when AWS introduce new
  element into it's description api-2.json that we don't know yet"
  [[name shape :as element]]
  (spec/check-asserts true)
  (spec/assert ::shape shape)
  element)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; SHAPE TYPE RUNTIME SPEC ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn runtime-spec-name
  "Returns name spec given it's ns and shape name"
  [ns name]
  (keyword ns (aws/dashed name)))


(defmulti ^:private runtime-shape-type-spec
  "Takes a shape and retuns a spec (as unevaluated code)."
  (fn [ns [name {:strs [type]}]] type))


(defmethod runtime-shape-type-spec :default [ns [name {:strs [type]} :as kv]]
  (throw (ex-info (str "runtime-shape-type-spec exception : unsupported type " type " for shape with name : " name) {:shape kv})))


(defmethod runtime-shape-type-spec "string" [ns [name {:strs [min max sensitive pattern enum]}]]
  (if enum
    `(spec/def ~(runtime-spec-name ns name) ~(into #{} (mapcat (fn [s] [s s] [(keyword (aws/dashed s)) s])) enum))
    `(spec/def ~(runtime-spec-name ns name)
       (spec/and string?
                 ~@(when min [`(fn [s#] (<= ~min (count s#)))])
                 ~@(when max [`(fn [s#] (< (count s#) ~max))])
                 ~@(when pattern [`(fn [s#] (re-matches ~(re-pattern pattern) s#))])))))


(defmethod runtime-shape-type-spec "integer" [ns [name {:strs [min max]}]]
  (if (or min max)
    `(spec/def ~(runtime-spec-name ns name) (spec/int-in ~(or min 'Long/MIN_VALUE) ~(or max 'Long/MAX_VALUE)))
    `(spec/def ~(runtime-spec-name ns name) int?)))


(defmethod runtime-shape-type-spec "long" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) int?))


(defmethod runtime-shape-type-spec "double" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) double?))


(defmethod runtime-shape-type-spec "float" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) float?))


(defmethod runtime-shape-type-spec "boolean" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) boolean?))


;; @TODO : pattern matching
(defmethod runtime-shape-type-spec "timestamp" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) inst?))


(defmethod runtime-shape-type-spec "blob" [ns [name _]]
  `(spec/def ~(runtime-spec-name ns name) bytes?))


(defmethod runtime-shape-type-spec "structure" [ns [name {:strs [members required payload deprecated error exception]}]]
  (let [spec-names (into {} (for [[k {:strs [shape]}] members]
                              ;; when key name and shape name for
                              ;; some reasons are different, we need
                              ;; prerequisites
                              [k (keyword (if (not= shape k) (str ns "." (aws/dashed name)) ns) (aws/dashed k))]))]
    `(do
       ;; we specialy create spec that reference the right spec when
       ;; key and shape name are different. Offcourse, prerequisites
       ;; are only necessary for compound types
       ~@(for [[k {:strs [shape] :as v}] members
               :when                     (not= shape k)]
           `(spec/def ~(keyword (str ns "." (aws/dashed name)) (aws/dashed k)) (spec/and ~(keyword ns (aws/dashed shape))))) ; spec/and is a hack to delay resolution
       (spec/def ~(runtime-spec-name ns name)
         (spec/keys :req-un ~(into [] (map spec-names) required)
                    :opt-un ~(into [] (comp (remove (set required)) (map spec-names)) (keys members)))))))


(defmethod runtime-shape-type-spec "list" [ns [name {{:strs [shape]} "member" :strs [min max]}]]
  `(spec/def ~(runtime-spec-name ns name)
     (spec/coll-of ~(keyword ns (aws/dashed shape)) ~@(when min `[:min-count ~min]) ~@(when max `[:max-count ~max]))))


;; @TODO : figure out what sensitive means
(defmethod runtime-shape-type-spec "map" [ns [name {:strs [key value sensitive]}]]
  `(spec/def ~(runtime-spec-name ns name)
     (spec/map-of ~(keyword ns (aws/dashed (key "shape"))) ~(keyword ns (aws/dashed (value "shape"))))))





;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃          ___           _____                  ___          _     ___         ┃
;; ┃         / __| ___ _ _ / / _ \___ __ _   ___  | _ \__ _ _ _| |_  |_  )        ┃
;; ┃         \__ \/ -_) '_/ /|   / -_) _` | |___| |  _/ _` | '_|  _|  / /         ┃
;; ┃         |___/\___|_|/_/ |_|_\___\__, |       |_| \__,_|_|  \__| /___|        ┃
;; ┃                                    |_|                                       ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                To be defined                                 ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; SERIALIZATION HELPERS ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;


(defn shapes-by-usage
  "Takes an api description and returns a map categoriizing shapes by their usage.
  This map has 4 keys: :inputs, :input-roots, :outputs
  and :output-roots, all mapping to collections of shapes.  Root
  shapes are shapes that appear as top-level paylods (including
  errors).  A shape may appear in several categories."
  [{:strs [shapes operations] :as api}]
  (let [shapes-seq-fn      (fn [shape]
                             (tree-seq #(and (map? %) (#{"structure" "list" "map"} (% "type")))
                                       #(case (% "type")
                                          "structure" (vals (% "members"))
                                          "list"      [(% "member")]
                                          "map"       [(% "key") (% "value")]) shape))
        shapes-refs        (into {}
                                 (x/by-key
                                  (comp (mapcat shapes-seq-fn) (keep #(get % "shape")) (x/into #{})))
                                 shapes)
        fixpoint-fn        (fn [f init]
                             (let [x (f init)]
                               (if (= x init)
                                 init
                                 (recur f x))))
        reachable-shapes   (fixpoint-fn (fn [reachable-shapes]
                                          (x/into {}
                                                  (x/for [[shape reachables] %]
                                                    [shape (into reachables (mapcat shapes-refs) reachables)])
                                                  reachable-shapes))
                                        shapes-refs)
        input-roots        (into #{} (keep #(get-in % ["input" "shape"]) (vals operations)))
        output-roots       (into #{} (for [{:strs [errors output]} (vals operations)
                                           {:strs [shape]}         (cons output errors)
                                           :when                   shape]
                                       shape))
        inputs             (into #{} (mapcat reachable-shapes) input-roots)
        outputs            (into #{} (mapcat reachable-shapes) output-roots)
        nested-shape-names (into #{} (vals shapes-refs))]
    ;; @NOTE (@dupuchba) : figure out what master @cgrand did with this culprit stuff
                                        ; How likely it is that this assertion will break in the future?
                                        ; I (cgrand) believe this assertion was mostly useful before the req/deser/ser/resp unbundling
    (when-some [culprit (first (filter #(or (get % "location") (get % "payload")) (mapcat (comp shapes-seq-fn shapes) nested-shape-names)))]
      (throw (ex-info "Attribute payload or location found on nested shape." {:culprit culprit :api api})))
    {:inputs       inputs
     :input-roots  input-roots
     :outputs      outputs
     :output-roots output-roots}))

(defn- shape-name-helper
  "Given a shape name, transorm it to a ser-*/req-*/deser-* name."
  [prefix shape-name]
  (->> shape-name (str prefix) portkey.aws/dashed symbol))

(def shape-name->ser-name (partial shape-name-helper "ser-"))


(def shape-name->req-name (partial shape-name-helper "req<-"))


(def shape-name->deser-name (partial shape-name-helper "deser-"))


(def shape-name->response-name (partial shape-name-helper "response->"))


;; @NOTE : Needs way more documentation /cc @dupuchbba
(defmacro defserialization
  "Helper macro that defines a private var named name with a map of {protocol {type fn}}.

  To use it, call like that :

  (QUERY REST-XML integer string [api shape-name input] (string input))"

  [name shape-name->fun-name & args]
  (let [serialization-map-fns (into {}
                                    (comp (x/for [expr %
                                                  :let [[protocols types+args+fn-body]              (split-with symbol? expr)
                                                        [types args+fn-body]                        (split-with string? types+args+fn-body)
                                                        args+fn-body                                (vec args+fn-body)
                                                        [api-sym shape-name-sym input-sym :as args] (if (= 2 (count args+fn-body)) (first args+fn-body) '[api shape-name input])
                                                        fn-body                                     (peek args+fn-body)]
                                                  protocol protocols
                                                  type     types]
                                            [(clojure.string/lower-case (clojure.core/name protocol))
                                             {type `(fn [~api-sym ~shape-name-sym]
                                                      (let [function-name# (~shape-name->fun-name ~shape-name-sym)
                                                            input-symbol#                '~input-sym
                                                            body#                        '~fn-body]

                                                        ;; @NOTE : necessary because of the 'method call too large' exception
                                                        (def api-description-map ~api-sym)


                                                        `(defn- ~function-name# [~input-symbol#]
                                                           ~(eval (list 'let
                                                                        ['~api-sym (symbol "api-description-map") '~shape-name-sym ~shape-name-sym input-symbol# '(symbol (name '~input-sym))]
                                                                        body#)))))}])
                                          (x/by-key (x/into {})))
                                    args)]
    `(def ^:private ~name ~serialization-map-fns)))



;;;;;;;;;;;;;;;;;;;;;;;;
;; SERIALIZATION PART ;;
;;;;;;;;;;;;;;;;;;;;;;;;

;; @NOTE - @dupuchba : all compound optionals arguments should be
;; managed here and in the generate-request-function - e.g. : locationName, deprecated, flattened & co
(defserialization aws-serialization-functions shape-name->ser-name
  (EC2 QUERY REST-XML REST-JSON JSON "string"
       [api shape-name input]
       {:http.request.field/value (if-let [enums (get-in api ["shapes" shape-name "enum"])]
                                    `(get ~(into {}
                                                 (mapcat (fn [s] [[s s] [(keyword (aws/dashed s)) s]]))
                                                 enums) ~input)
                                    input)
        :http.request.field/shape shape-name})

  (EC2 QUERY REST-XML REST-JSON JSON "long" "integer" "boolean" "timestamp" "double"
       [api shape-name input]
       {:http.request.field/value input
        :http.request.field/shape shape-name})

  (JSON "float"
        [api shape-name input]
        {:http.request.field/value input
         :http.request.field/shape shape-name})

  (EC2 REST-XML QUERY REST-JSON JSON "structure"
       [api shape-name input]
       (let [required                      (get-in api ["shapes" shape-name "required"])
             request-function-input-symbol (symbol "input")
             x-filter                      (comp (filter (fn [[k v]]
                                                           (not (contains? #{"members" "required"} k))))
                                                 (map (fn [[k v]]
                                                        [(keyword "http.request.field" (aws/dashed k)) v])))
             handled-attributes            #{"shape" "box" "locationName" "deprecated" "sensitive" "flattened" "xmlAttribute" "streaming" "queryName"}
             required-function-body-part   (into [] (comp (x/for [required-name %
                                                                  :let [{:strs [shape] :as sh} (get-in api ["shapes" shape-name "members" required-name])
                                                                        ser-name               (shape-name->ser-name shape)
                                                                        dashed-name            (-> required-name aws/dashed keyword)
                                                                        test-form#             `(~dashed-name ~request-function-input-symbol)]]
                                                            (if-not  (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                                     handled-attributes))
                                                              (throw (ex-info "Structure Type / REST-XML : Field not handled" {:sh sh}))
                                                              `(into ~(list ser-name test-form#)
                                                                     ~(into {:http.request.field/name required-name}
                                                                            x-filter sh)))))
                                                 required)
             optional-function-body-part   (into [] (comp (x/for [[optional-name {:strs [shape] :as sh}] %
                                                                  :when (not (contains? (set required) optional-name))
                                                                  :let [ser-name    (shape-name->ser-name shape)
                                                                        dashed-name (-> optional-name aws/dashed keyword)]]
                                                            (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                                    handled-attributes))
                                                              (throw (ex-info "Structure Type / REST-XML : Field not handled" {:sh sh}))
                                                              `[(contains? ~request-function-input-symbol ~dashed-name)
                                                                (update-in [:http.request.field/value]
                                                                           (fnil conj [])
                                                                           (into ~(list ser-name
                                                                                        (list request-function-input-symbol dashed-name))
                                                                                 ~(into {:http.request.field/name optional-name} x-filter sh)))]))
                                                          cat)
                                                 (get-in api ["shapes" shape-name "members"]))]
         (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) (get-in api ["shapes" shape-name]))
                                                 #{"type" "members" "required" "deprecated" "sensitive" "locationName" "xmlNamespace" "xmlOrder"}))
           (throw (ex-info "Structure REST-XML protocol does not handle type" {:shape (get-in api ["shapes" shape-name])}))
           `(cond-> ~(into {:http.request.field/value required-function-body-part
                            :http.request.field/shape shape-name}
                           (into {} x-filter (get-in api ["shapes" shape-name])))
              ~@optional-function-body-part))))

  (EC2 QUERY "list"
       [api shape-name input]
       (let [x-filter                                     (comp (filter (fn [[k v]]
                                                                          (not (contains? #{"member" "members"} k))))
                                                                (map (fn [[k v]]
                                                                       [(keyword "http.request.field" (aws/dashed k)) v])))
             {{:strs [shape] :as member} "member" :as sh} (get-in api ["shapes" shape-name])]
         (if-not (and (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh) #{"type" "member" "max" "min" "flattened"}))
                      (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) member) #{"shape" "locationName"})))
           (throw (ex-info "Type : list, aws-serialization-functions macro with sh and member : " {:sh     sh
                                                                                                   :member member}))
           (into #:http.request.field{:value `(into []
                                                    (map (fn [~'coll]
                                                           (merge ~(list (shape-name->ser-name shape) 'coll)
                                                                  ~(into {} x-filter member))))
                                                    ~'input)
                                      :shape shape-name}
                 (into {} x-filter sh)))))

  ;; @NOTE : flattened & locationName handled
  ;; @NOTE : min & max not handled (should it be as it can be checked by specs
  ;; @NOTE : deprecated & sensitive not found for rest-xml protocol
  (REST-XML REST-JSON JSON "list"
            [api shape-name input]
            (let [x-filter                                     (comp (filter (fn [[k v]]
                                                                               (not (contains? #{"member" "members"} k))))
                                                                     (map (fn [[k v]]
                                                                            [(keyword "http.request.field" (aws/dashed k)) v])))
                  {{:strs [shape] :as member} "member" :as sh} (get-in api ["shapes" shape-name])]
              (if-not (and (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh) #{"type" "member" "flattened" "min" "sensitive" "max" "deprecated"}))
                           (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) member) #{"shape" "locationName"})))
                (throw (ex-info "Type : list, aws-serialization-functions macro with sh and member : " {:sh     sh
                                                                                                        :member member}))
                (into #:http.request.field{:value `(into []
                                                         (map (fn [~'coll]
                                                                (merge ~(list (shape-name->ser-name shape) 'coll)
                                                                       ~(into {} x-filter member))))
                                                         ~'input)
                                           :shape shape-name}
                      (into {} x-filter sh)))))

  (EC2 REST-XML QUERY REST-JSON JSON "blob"
       [api shape-name input]
       {:http.request.field/value `(aws/base64-encode ~input)
        :http.request.field/shape shape-name}) ;; @TODO : to implement blob

  (QUERY "map"
         [api shape-name input]
         (let [x-filter                   (comp (filter (fn [[k v]]
                                                          (not (contains? #{"key" "value" "required" "members"} k))))
                                                (map (fn [[k v]]
                                                       [(keyword "http.request.field" (aws/dashed k)) v])))
               {:strs [key value] :as sh} (get-in api ["shapes" shape-name])
               key-shape-name             (key "shape")
               value-shape-name           (value "shape")]
           (when-not (and (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh) #{"shape" "type" "key" "value" "flattened" "locationName"}))
                          (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) key) #{"shape" "locationName"}))
                          (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) value) #{"shape" "locationName"})))
             (throw (ex-info "Map type / QUERY : Sensitive/flattened not handled" {:sh sh})))
           (into #:http.request.field{:value `(into []
                                                    (map (fn [[~'k ~'v]]
                                                           [(into ~(list (shape-name->ser-name key-shape-name) 'k)
                                                                  ~(into {:http.request.field/map-info "key"} x-filter key))
                                                            (into ~(list (shape-name->ser-name value-shape-name) 'v)
                                                                  ~(into {:http.request.field/map-info "value"} x-filter value))]))
                                                    ~'input)
                                      :shape shape-name}
                 (into {} x-filter sh))))


  ;; @NOTE : key & value handled for the rest-xml protocol
  ;; @NOTE : only used in headers for rest-xml
  ;; @NOTE : others attributes not found for rest-xml
  (REST-XML REST-JSON JSON "map"
            [api shape-name input]
            (let [x-filter                   (comp (filter (fn [[k v]]
                                                             (not (contains? #{"key" "value" "required" "members"} k))))
                                                   (map (fn [[k v]]
                                                          [(keyword "http.request.field" (aws/dashed k)) v])))
                  {:strs [key value] :as sh} (get-in api ["shapes" shape-name])
                  key-shape-name             (key "shape")
                  value-shape-name           (value "shape")]
              (when-not (and (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh) #{"shape" "type" "key" "value" "max" "min" "sensitive"}))
                             (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) key) #{"shape"}))
                             (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) value) #{"shape"})))
                (throw (ex-info "Map type / REST-XML : Sensitive/flattened not handled" {:sh sh})))
              (into #:http.request.field{:value `(into []
                                                       (map (fn [[~'k ~'v]]
                                                              [(into ~(list (shape-name->ser-name key-shape-name) 'k)
                                                                     ~(into {:http.request.field/map-info "key"} x-filter key))
                                                               (into ~(list (shape-name->ser-name value-shape-name) 'v)
                                                                     ~(into {:http.request.field/map-info "value"} x-filter value))]))
                                                       ~'input)
                                         :shape shape-name}
                    (into {} x-filter sh)))))


(defn generate-serialization-declare
  "Generate declare statement for input shape (other than input-roots)."
  [shape-name]
  `(declare ~(shape-name->ser-name shape-name)))


(defn generate-serialization-function
  "Given an api description file and a shape-name, find and return the
  call of it's serialization function previously defined by the macro
  defserialization."
  [{{:strs [protocol]} "metadata" :as api} shape-name]
  (let [{:strs [type] :as shape} (get-in api ["shapes" shape-name])]
    (if-let [serialization-function (get-in aws-serialization-functions [protocol type])]
      (serialization-function api shape-name)
      (throw (ex-info "There is no serialization function implementing this protocol or type." {:protocol protocol
                                                                                                :type     type})))))

;;;;;;;;;;;;;;;;;;;;;
;; DESERIALIZATION ;;
;;;;;;;;;;;;;;;;;;;;;

(defserialization aws-deserialization-functions shape-name->deser-name
  (JSON "string"
        [api shape-name input]
        (if-let [enums (get-in api ["shapes" shape-name "enum"])]
          `(get ~(into {}
                       (map (fn [s] [s (keyword (aws/dashed s))]))
                       enums) ~input)
          input))

  (QUERY REST-XML EC2 "string"
            [api shape-name input]
            (if-let [enums (get-in api ["shapes" shape-name "enum"])]
              `(get ~(into {}
                           (map (fn [s] [s (keyword (aws/dashed s))]))
                           enums)
                    (if (seq? ~input)
                      (first ~input)
                      ~input))
              `(if (seq? ~input)
                 (first ~input)
                 ~input)))

  (JSON "float" "long" "integer" "boolean" "timestamp" "double" "boolean" [api shape-name input] input)

  (QUERY REST-XML EC2 "timestamp"
            [api shape-name input]
            `(if (seq? ~input)
               (first ~input)
               ~input))

  (REST-XML EC2 "float"
            [api shape-name input]
            `(Float. (if (seq? ~input)
                       (first ~input)
                       ~input)))

  (REST-XML EC2 QUERY "double"
            [api shape-name input]
            `(Double. (if (seq? ~input)
                        (first ~input)
                        ~input)))

  (QUERY REST-XML EC2 "integer"
            [api shape-name input]
            `(Integer. (if (seq? ~input)
                         (first ~input)
                         ~input)))

  (QUERY REST-XML EC2 "long"
            [api shape-name input]
            `(Long. (if (seq? ~input)
                      (first ~input)
                      ~input)))

  (QUERY REST-XML EC2 "boolean"
            [api shape-name input]
            `(when-let [boolstr# (if (seq? ~input)
                                   (first ~input)
                                   ~input)]
               (cond
                 (= "true" boolstr#)  true
                 (= "false" boolstr#) false)))

  (JSON "blob"
        [api shape-name input]
        `(aws/base64-decode ~input))

  ;;@TODO : fix this blob stuff properly @dupuchba - Wed Mar  6 22:12:46 2019
  (QUERY REST-XML EC2 "blob"
            [api shape-name input]
            ;;`(aws/base64-decode (first ~input))
            input)

  (JSON "structure"
        [api shape-name input]
        (let [required                      (get-in api ["shapes" shape-name "required"])
              request-function-input-symbol (symbol "input")
              handled-attributes            #{"shape" "exception" "fault" "synthetic" "box" "sensitive" #_"location" #_"locationName" "deprecated" #_"idempotencyToken" #_"streaming" #_"xmlNamespace" #_"box" #_"jsonvalue"}
              required-function-body-part   (into {}
                                                  (x/for [required-name %
                                                          :let [shape                           (get-in api ["shapes" shape-name "members" required-name])
                                                                {:strs [shape location] :as sh} shape
                                                                deser-name                      (shape-name->deser-name shape)
                                                                dashed-name                     (-> required-name aws/dashed keyword)]]
                                                    (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                            handled-attributes))
                                                      (throw (ex-info "deserialization attrs not recognized" {:sh sh}))
                                                      [dashed-name (list deser-name (list request-function-input-symbol required-name))]))
                                                  required)
              optional-function-body-part   (into [] (comp (x/for [[optional-name {:strs [shape location] :as sh}] %
                                                                   :when (not (contains? (set required) optional-name))
                                                                   :let [deser-name  (shape-name->deser-name shape)
                                                                         dashed-name (-> optional-name aws/dashed keyword)]]
                                                             (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                                     handled-attributes))
                                                               (throw (ex-info "deserialization attrs not recognized" {:sh sh}))
                                                               `[(contains? ~request-function-input-symbol ~optional-name)
                                                                 (assoc ~dashed-name
                                                                        ~(list deser-name (list request-function-input-symbol optional-name)))]))
                                                           cat)
                                                  (get-in api ["shapes" shape-name "members"]))]
          (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) (get-in api ["shapes" shape-name]))
                                                  #{"type" "exception" "synthetic" "members" "box" "fault" "required" #_"locationName" #_"xmlNamespace" #_"payload" "sensitive" "deprecated" #_"jsonvalue"}))
            (throw (ex-info "deserialization attrs not recognized" {:shape (get-in api ["shapes" shape-name])}))
            `(cond-> ~required-function-body-part
               ~@optional-function-body-part))))

  (QUERY REST-XML EC2 "structure"
            [api shape-name input]
            (let [required                      (get-in api ["shapes" shape-name "required"])
                  request-function-input-symbol (symbol "input")
                  handled-attributes            #{"shape" "flattened" "eventpayload" "xmlAttribute" "error" "payload" "exception" "fault" "synthetic" "box" "sensitive"
                                                  "location" "locationName" "queryName" "deprecated" "event" "eventstream" #_"idempotencyToken" #_"streaming" "xmlNamespace" #_"box" #_"jsonvalue"}
                  let-declaration               (into {}
                                                      (x/for [[sname {:strs [shape locationName] :as sh}] %
                                                              :let [shape                           (get-in api ["shapes" shape-name "members" sname])
                                                                    {:strs [shape locationName xmlAttribute] :as sh} shape
                                                                    {:strs [type member flattened]} (get-in api ["shapes" shape])
                                                                    locationName                    (or (and (= "list" type) flattened (member "locationName")) locationName sname)
                                                                    deser-name                      (shape-name->deser-name shape)
                                                                    dashed-name                     (-> sname aws/dashed keyword)
                                                                    flattened? (if (and (= "list" type) (true? flattened)) true false)]]
                                                        [locationName `(aws/search-for-tag ~request-function-input-symbol
                                                                                           ~locationName
                                                                                           :flattened? ~flattened?
                                                                                           :xmlAttribute? ~xmlAttribute)])
                                                      (get-in api ["shapes" shape-name "members"]))
                  let-var-sym                   (gensym "letvar")
                  required-function-body-part   (into {}
                                                      (x/for [required-name %
                                                              :let [shape                           (get-in api ["shapes" shape-name "members" required-name])
                                                                    {:strs [shape locationName xmlAttribute] :as sh} shape
                                                                    {:strs [type member flattened]} (get-in api ["shapes" shape])
                                                                    locationName                    (or (and (= "list" type) flattened (member "locationName")) locationName required-name)
                                                                    deser-name                      (shape-name->deser-name shape)
                                                                    dashed-name                     (-> required-name aws/dashed keyword)]]
                                                        (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                                handled-attributes))
                                                          (throw (ex-info "AAAA deserialization attrs not recognized" {:sh sh}))
                                                          [dashed-name (list deser-name `(get-in ~let-var-sym ~(cond
                                                                                                                 (and (= "list" type) (true? flattened)) [locationName]
                                                                                                                 (true? xmlAttribute)                    [locationName]
                                                                                                                 :defautl                                [locationName :content])))]))
                                                      required)
                  optional-function-body-part   (into [] (comp (x/for [[optional-name {:strs [shape locationName xmlAttribute] :as sh}] %
                                                                       :when (not (contains? (set required) optional-name))
                                                                       :let [{:strs [type member flattened]} (get-in api ["shapes" shape])
                                                                             locationName (or (and (= "list" type) flattened (member "locationName")) locationName optional-name)
                                                                             deser-name   (shape-name->deser-name shape)
                                                                             dashed-name  (-> optional-name aws/dashed keyword)]]
                                                                 (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                                         handled-attributes))
                                                                   (throw (ex-info "deserialization attrs not recognized" {:sh sh}))
                                                                   `[(~let-var-sym ~locationName)
                                                                     (assoc ~dashed-name
                                                                            ~(list deser-name `(get-in ~let-var-sym  ~(cond
                                                                                                                        (and (= "list" type) (true? flattened)) [locationName]
                                                                                                                        (true? xmlAttribute)                    [locationName]
                                                                                                                        :defautl                                [locationName :content]))))]))
                                                               cat)
                                                      (get-in api ["shapes" shape-name "members"]))]
              (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) (get-in api ["shapes" shape-name]))
                                                      #{"type" "event" "flattened" "eventstream" "error" "exception" "synthetic" "members" "box" "fault" "required" "xmlOrder"
                                                        "queryName" "location" "locationName" "eventpayload" "xmlNamespace" "payload" "sensitive" "deprecated" "wrapper" #_"jsonvalue"}))
                (throw (ex-info "deserialization attrs dsfdsfsdnot recognized" {:shape (get-in api ["shapes" shape-name])}))
                `(let [~let-var-sym ~let-declaration]
                   (cond-> ~required-function-body-part
                     ~@optional-function-body-part)))))

  (QUERY REST-XML EC2 JSON "list"
            [api shape-name input]
            (let [{{:strs [shape] :as member} "member"
                   flattened                  "flattened" :as sh} (get-in api ["shapes" shape-name])]
              (if-not (and (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh) #{"type" "member" "max" "min" "sensitive" "flattened"}))
                           (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) member) #{"shape" "locationName"})))
                (throw (ex-info "LIST/deserialization, attrs not recognized " {:sh         sh
                                                                               :member     member
                                                                               :shape-name shape-name}))
                `(into []
                       (map (fn [~'coll]
                              ~(list (shape-name->deser-name shape) (if flattened `(:content ~'coll) 'coll))))
                       ~'input))))

  (REST-XML JSON "map"
            [api shape-name input]
            (let [{:strs [key value] :as sh} (get-in api ["shapes" shape-name])
                  key-shape-name             (key "shape")
                  value-shape-name           (value "shape")]
              (when-not (and (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh) #{"shape" "type" "key" "value" "min" "max" #_"flattened" #_"locationName"}))
                             (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) key) #{"shape" #_"locationName"}))
                             (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) value) #{"shape" #_"locationName"})))
                (throw (ex-info "map/deser, attrs not recognized" {:sh sh})))
              `(into {}
                     (map (fn [[~'k ~'v]]
                            [~(list (shape-name->deser-name key-shape-name) 'k)
                             ~(list (shape-name->deser-name value-shape-name) 'v)]))
                     ~'input)))

  (QUERY "map"
            [api shape-name input]
            (let [{:strs [key value] :as sh} (get-in api ["shapes" shape-name])
                  key-shape-name             (key "shape")
                  value-shape-name           (value "shape")]
              (when-not (and (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh) #{"shape" "type" "key" "value" "min" "max" "flattened" "locationName"}))
                             (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) key) #{"shape" "locationName"}))
                             (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) value) #{"shape" "locationName"})))
                (throw (ex-info "map/deser, attrs not recognized" {:sh sh})))
              `(into {}
                     (map (fn [[~'k ~'v]]
                            [~(list (shape-name->deser-name key-shape-name) 'k)
                             ~(list (shape-name->deser-name value-shape-name) 'v)]))
                     ~'input))))


(defn generate-deserialization-declare
  "Generate declare statement for deserialization functions. (other than ouputs-roots)."
  [shape-name]
  `(declare ~(shape-name->deser-name shape-name)))


(defn generate-deserialization-function
  "Given an api description file and a shape-name, find and return the
  call of it's deserialization function previously defined by the macro
  defserialization."
  [{{:strs [protocol]} "metadata" :as api} shape-name]
  (let [{:strs [type] :as shape} (get-in api ["shapes" shape-name])]
    (if-let [deserialization-function (get-in aws-deserialization-functions [protocol type])]
      (deserialization-function api shape-name)
      (throw (ex-info "There is no deserialization function implementing this protocol or type." {:protocol   protocol
                                                                                                  :type       type
                                                                                                  :shape-name shape-name})))))


;;;;;;;;;;;;;;;;;;;;;;;;
;; REQUEST GENERATION ;;
;;;;;;;;;;;;;;;;;;;;;;;;



(defn generate-request-function
  "Given an api description and a shape-name, returns a list representing
  the request function. Request function is split into HTTP configuration
  type as define by the ring request specification and calls
  serialization functions."
  [api shape-name]
  (let [required                      (get-in api ["shapes" shape-name "required"])
        request-function-input-symbol (symbol "input")
        x-filter                      (comp (filter (fn [[k v]]
                                                      (not (contains? #{"members" "required"} k))))
                                            (map (fn [[k v]]
                                                   [(keyword "http.request.field" (aws/dashed k)) v])))
        handled-attributes            #{"shape" "location" "locationName" "deprecated" "idempotencyToken" "streaming" "xmlNamespace" "box" "jsonvalue"}
        required-function-body-part   (into {}
                                            (comp (x/for [required-name %
                                                          :let [shape                           (get-in api ["shapes" shape-name "members" required-name])
                                                                {:strs [shape location] :as sh} shape
                                                                ser-name                        (shape-name->ser-name shape)
                                                                dashed-name                     (-> required-name aws/dashed keyword)
                                                                location                        (if (nil? location)
                                                                                                  (keyword "http.request.configuration" "body")
                                                                                                  (keyword "http.request.configuration" location))]]
                                                    (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                            handled-attributes))
                                                      (throw (ex-info "generate-request-function, field not recognized" {:sh sh}))
                                                      [location
                                                       `(into ~(list ser-name (list request-function-input-symbol dashed-name))
                                                              ~(into {:http.request.field/name required-name} x-filter sh))]))
                                                  (x/by-key (x/into [])))
                                            required)
        optional-function-body-part   (into [] (comp (x/for [[optional-name {:strs [shape location] :as sh}] %
                                                             :when (not (contains? (set required) optional-name))
                                                             :let [ser-name    (shape-name->ser-name shape)
                                                                   dashed-name (-> optional-name aws/dashed keyword)
                                                                   location    (if (nil? location)
                                                                                 (keyword "http.request.configuration" "body")
                                                                                 (keyword "http.request.configuration" location))
                                                                   ;; @NOTE : keep this until I am sure payload check is not necessary
                                                                   #_(or (and (nil? location)
                                                                              (= optional-name (get-in api ["shapes" shape-name "payload"]))
                                                                              :body)
                                                                         location)]]
                                                       (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                               handled-attributes))

                                                         (throw (ex-info "generate-request-function field not recognized" {:sh sh}))
                                                         `[(contains? ~request-function-input-symbol ~dashed-name)
                                                           (update-in [~location]
                                                                      (fnil conj [])
                                                                      (into ~(list ser-name (list request-function-input-symbol dashed-name))
                                                                            ~(into {:http.request.field/name optional-name} x-filter sh)))]))
                                                     cat)
                                            (get-in api ["shapes" shape-name "members"]))]
    (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) (get-in api ["shapes" shape-name]))
                                            #{"type" "members" "required" "locationName" "xmlNamespace" "payload" "sensitive" "deprecated" "jsonvalue"}))
      (throw (ex-info "Structure REST-XML protocol does not handle type" {:shape (get-in api ["shapes" shape-name])}))
      `(defn- ~(shape-name->req-name shape-name) [~request-function-input-symbol]
         (cond-> ~required-function-body-part
           ~@optional-function-body-part)))))


;;;;;;;;;;;;;;;;;;;;;;;;;
;; RESPONSE GENERATION ;;
;;;;;;;;;;;;;;;;;;;;;;;;;


(defn generate-response-function
  [api shape-name]
  (let [required                          (get-in api ["shapes" shape-name "required"])
        protocol                          (get-in api ["metadata" "protocol"])
        raw-response-input-symbol         (symbol "input")
        transformed-response-input-symbol (gensym "rawinput")
        result-wrapper-symbol             (gensym "resultWrapper")
        handled-attributes                #{"shape" "location" "locationName" "streaming"}
        let-declaration                   (into {}
                                                (x/for [[sname {:strs [shape] :as sh}] %
                                                        :let [shape                           (get-in api ["shapes" shape-name "members" sname])
                                                              {:strs [shape locationName location streaming] :as sh} shape
                                                              {:strs [type member flattened]} (get-in api ["shapes" shape])
                                                              locationName                    (or (and (= "list" type) flattened (member "locationName")) locationName sname)
                                                              deser-name                      (shape-name->deser-name shape)
                                                              dashed-name                     (-> sname aws/dashed keyword)]]
                                                  [locationName (if location
                                                                  (if (or (= location "header")  (= location "headers"))
                                                                    `(get-in ~raw-response-input-symbol [:headers ~locationName])
                                                                    (throw (ex-info "location no header" {:location   location
                                                                                                          :shape-name shape-name
                                                                                                          :shape      sh})))
                                                                  (case protocol
                                                                    ("ec2" "query" "rest-xml") (if streaming
                                                                                                 transformed-response-input-symbol
                                                                                                 `(aws/search-for-tag ~transformed-response-input-symbol
                                                                                                                      ~locationName
                                                                                                                      :flattened? ~(if (and (= "list" type) (true? flattened)) true false)
                                                                                                                      :result-wrapper ~result-wrapper-symbol))))])
                                                (get-in api ["shapes" shape-name "members"]))
        let-var-sym                       (gensym "letvar")
        required-function-body-part       (into {}
                                                (x/for [required-name %
                                                        :let [shape                           (get-in api ["shapes" shape-name "members" required-name])
                                                              {:strs [shape locationName location streaming] :as sh} shape
                                                              {:strs [type member flattened]} (get-in api ["shapes" shape])
                                                              locationName                    (or (and (= "list" type) flattened (member "locationName")) locationName required-name)
                                                              deser-name                      (shape-name->deser-name shape)
                                                              dashed-name                     (-> required-name aws/dashed keyword)]]
                                                  (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                          handled-attributes))
                                                    (throw (ex-info "generate-response-function / required-function-body-part" {:output-root shape-name
                                                                                                                                :shape-name  required-name
                                                                                                                                :shape       sh}))
                                                    [dashed-name (list deser-name `(get-in ~let-var-sym ~(cond
                                                                                                           (= location "header")                            [locationName]
                                                                                                           (true? streaming)                                [locationName]
                                                                                                           (contains? #{"rest-xml" "query" "ec2"} protocol) (if (and (= "list" type) (true? flattened)) [locationName] [locationName :content])
                                                                                                           :exception                                       (throw (ex-info "protocol or location not known :" {:protocol protocol})))))]))
                                                required)
        optional-function-body-part       (into [] (comp (x/for [[optional-name {:strs [shape locationName location streaming] :as sh}] %
                                                                 :when (not (contains? (set required) optional-name))
                                                                 :let [{:strs [type member flattened]} (get-in api ["shapes" shape])
                                                                       locationName (or (and (= "list" type) flattened (member "locationName")) locationName optional-name)
                                                                       deser-name   (shape-name->deser-name shape)
                                                                       dashed-name  (-> optional-name aws/dashed keyword)]]
                                                           (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) sh)
                                                                                                   handled-attributes))
                                                             (throw (ex-info "generate-response-function / optional-function-body-part" {:output-root shape-name
                                                                                                                                         :shape-name  optional-name
                                                                                                                                         :shape       sh}))
                                                             `[(~let-var-sym ~locationName)
                                                               (assoc ~dashed-name
                                                                      ~(list deser-name `(get-in ~let-var-sym ~(cond
                                                                                                                 (= location "header")                            [locationName]
                                                                                                                 (true? streaming)                                [locationName]
                                                                                                                 (contains? #{"rest-xml" "ec2" "query"} protocol) (if (and (= "list" type) (true? flattened)) [locationName] [locationName :content])
                                                                                                                 :exception                                       (throw (ex-info "protocol or location not known :" {:protocol protocol}))))))]))
                                                         cat)
                                                (get-in api ["shapes" shape-name "members"]))]
    (if-not (empty? (clojure.set/difference (into #{} (map (fn [[k _]] k)) (get-in api ["shapes" shape-name]))
                                            #{"type" "event" "flattened" "eventstream" "error" "exception" "synthetic" "members" "box" "fault" "required" "deprecatedMessage"
                                              "queryName" "location" "locationName" "eventpayload" "xmlOrder" "payload" "sensitive" "deprecated" #_"jsonvalue"}))
      (throw (ex-info "generate-response-function / defn-part" {:output-root shape-name
                                                                :shape-name  shape-name
                                                                :shape       (get-in api ["shapes" shape-name])}))
      `(defn- ~(shape-name->response-name shape-name)
         ([~raw-response-input-symbol]
          ~(list (shape-name->response-name shape-name) nil raw-response-input-symbol ))
         ([~result-wrapper-symbol ~raw-response-input-symbol]
          (let [~transformed-response-input-symbol ~(case protocol
                                                      ("ec2" "rest-xml" "query") (if (true? (as-> (get-in api ["shapes" shape-name "payload"]) payload-shape
                                                                                              (get-in api ["shapes" shape-name "members" payload-shape "streaming"])))
                                                                                   `(:body ~raw-response-input-symbol)
                                                                                   `(some-> ~raw-response-input-symbol
                                                                                            :body
                                                                                            aws/parse-xml-body)))
                ~let-var-sym                       ~let-declaration]
            (cond-> ~required-function-body-part
              ~@optional-function-body-part)))))))



;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃     ___                     _   _                  ___          _     ____   ┃
;; ┃    / _ \ _ __  ___ _ _ __ _| |_(_)___ _ _    ___  | _ \__ _ _ _| |_  |__ /   ┃
;; ┃   | (_) | '_ \/ -_) '_/ _` |  _| / _ \ ' \  |___| |  _/ _` | '_|  _|  |_ \   ┃
;; ┃    \___/| .__/\___|_| \__,_|\__|_\___/_||_|       |_| \__,_|_|  \__| |___/   ┃
;; ┃         |_|                                                                  ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┃                                To be defined                                 ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

(spec/def ::operation
  (strict-strs
   :req {"name" string?
         "http" (strict-strs
                 :req {"method"     #{"POST" "DELETE" "GET" "PATCH" "PUT" "HEAD"}
                       "requestUri" string?}
                 :opt {"responseCode" int?})}
   :opt {"input"                                             (strict-strs :req {"shape" string?}
                                                                          :opt {"xmlNamespace"
                                                                                (strict-strs :req {"uri" string?})
                                                                                "locationName" string?}) ; TODO validate
         "output"                                            (strict-strs :req {"shape" string?}
                                                                          :opt {"resultWrapper" string?})
         "idempotent"                                        boolean?
         "errors"
         (spec/coll-of
          (strict-strs :req {"shape" string?}
                       :opt {"exception" boolean?
                             "fault"     true?
                             "error"     (strict-strs
                                          :req {"httpStatusCode" int?}
                                          :opt {"code" string?, "senderFault" boolean?})}))
         "documentationUrl"                                  string? ; TODO
         "alias"                                             string?
         "authtype"                                          #{"none" "v4-unsigned-body"}
         "deprecated"                                        boolean?
         "deprecatedMessage"                                 string?
         "endpointdiscovery" (every-pred empty? map?)
         "endpointoperation" boolean?}))


(defn mime-type
  "Retourne the request mime type given it's protocol."
  [protocol]
  (case protocol
    ("rest-xml" "ec2" "query") {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}
    "rest-json"                {"content-type" "application/json"}
    "json"                     {"content-type" "application/x-amz-json-1.1"}))


(defn generate-operation-function
  "This function generates the final defn that the user is going to use.
  The request has been made to build a map representing the http
  request configuration needed to make the request at runtime.

  It calls the req<-* function which is then merged with other http
  request informations from the operation shape."

  ;; @TODO : add the unused informations to the request map => e.g. : xmlNamespace / locationName / documentationUrl / alias / authtype / deprecated
  [api ns [n {{:strs [method requestUri responseCode]} "http"
              {input-shape-name "shape"}               "input"
              {output-shape-name "shape" resultWrapper "resultWrapper"} "output"
              :strs                                    [name errors]
              :as                                      operation}]]
  (spec/check-asserts true)
  (spec/assert ::operation operation)
  (let [varname                     (symbol (aws/dashed name))
        input-spec                  (some->> input-shape-name aws/dashed (keyword ns))
        output-spec                 (some->> output-shape-name aws/dashed (keyword ns))
        operation-input             (or (some-> input-shape-name (str "-input") aws/dashed symbol) '_)
        operation-default-arguments (if input-spec (some #(when (spec/valid? input-spec %) %) [[] {}]) {})
        error-specs                 (into {}
                                          (map (fn [{:strs [shape] {:strs [httpStatusCode]} "error"}]
                                                 [shape (keyword ns (aws/dashed shape))]))
                                          errors)
        protocol                    (get-in api ["metadata" "protocol"])
        service-id                  (get-in api ["metadata" "serviceId"])
        version                     (get-in api ["metadata" "apiVersion"])
        target-prefix               (get-in api ["metadata" "targetPrefix"])]
    `(do
       (defn ~varname
         ~@(when operation-default-arguments `[([] ~(list varname operation-default-arguments))])
         ([~operation-input]
          (let [request-function-result# ~(if input-shape-name (list (shape-name->req-name input-shape-name) operation-input) {})]
            ;; @TODO : call-to-be-implemented-function needs to be implemented
            (aws/-call-http
             (into request-function-result#
                   {:http.request.configuration/method          ~(-> method str/lower-case keyword)
                    :http.request.configuration/request-uri     ~requestUri
                    :http.request.configuration/response-code   ~responseCode
                    :http.request.configuration/endpoints       ~(symbol ns "endpoints")
                    :http.request.configuration/mime-type       ~(mime-type protocol)
                    :http.request.configuration/protocol        ~protocol
                    :http.request.configuration/service-id      ~service-id
                    :http.request.configuration/version         ~version
                    :http.request.configuration/action          ~name
                    :http.request.configuration/target-prefix   ~target-prefix
                    :http.request.configuration/output-deser-fn ~(if output-shape-name (shape-name->response-name output-shape-name) `(fn [& args#] {}))
                    :http.request.configuration/result-wrapper  ~resultWrapper
                    :http.request.spec/input-spec               ~input-spec
                    :http.request.spec/output-spec              ~output-spec
                    :http.request.spec/error-spec               ~error-specs})))))

       (spec/fdef ~varname
         :args ~(if input-spec
                  `(~(if operation-default-arguments `spec/? `spec/tuple) ~input-spec)
                  `empty?)
         :ret ~(if output-spec `(spec/and ~output-spec) `true?)))))




;; ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
;; ┃       _   ___ ___    ___ ___ _  _ ___ ___    _ _____ ___ ___  _  _           ┃
;; ┃      /_\ | _ \_ _|  / __| __| \| | __| _ \  /_\_   _|_ _/ _ \| \| |  ___     ┃
;; ┃     / _ \|  _/| |  | (_ | _|| .` | _||   / / _ \| |  | | (_) | .` | |___|    ┃
;; ┃    /_/ \_\_| |___|  \___|___|_|\_|___|_|_\/_/ \_\_| |___\___/|_|\_|          ┃
;; ┃                                                                              ┃
;; ┃                           ___  _   ___ _____   _ _                           ┃
;; ┃                          | _ \/_\ | _ \_   _| | | |                          ┃
;; ┃                          |  _/ _ \|   / | |   |_  _|                         ┃
;; ┃                          |_|/_/ \_\_|_\ |_|     |_|                          ┃
;; ┃                                                                              ┃
;; ┃                                                                              ┃
;; ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛


;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; GENERATE API CLJ FILES ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn generate-api-forms
  "This is the root function where you can generate all forms that an
  sdk is going to need namespaced by ns-sym.

  It gather specs + serialization + declares + request + operation
  functions."
  [ns-sym {:strs [operations] :as api}]
  (case (get-in api ["metadata" "protocol"])
    ("rest-xml" "ec2" "query" "rest-json" "json")
    (let [inputs+inputs-root            (shapes-by-usage api)
          serialization+request-defns   (for [[k gen]
                                              {:inputs       [generate-serialization-declare
                                                              (partial generate-serialization-function api)]
                                               :input-roots  [(partial generate-request-function api)]
                                               :outputs      [generate-deserialization-declare
                                                              (partial generate-deserialization-function api)]
                                               :output-roots [(partial generate-response-function api)]}
                                              gen              gen
                                              input-shape-name (inputs+inputs-root k)]
                                          (gen input-shape-name))
          runtime-specs+operation-defns (for [[k gen] {"shapes"     (comp #(doto % eval) (partial runtime-shape-type-spec (name ns-sym)) assert-shape-spec)
                                                       ;; @NOTE : eval to make specs available right away
                                                       "operations" (partial generate-operation-function api (name ns-sym))}
                                              desc    (api k)]
                                          (gen desc))]
      (concat serialization+request-defns
              runtime-specs+operation-defns))
    (do
      (binding [*out* *err*] (prn 'skipping ns-sym 'protocol (get-in api ["metadata" "protocol"])))
      [(list 'comment 'TODO 'support (get-in api ["metadata" "protocol"]))])))


(defn parse-endpoints! [src]
  (let [endpoints (with-open [r (io/reader src)] (json/parse-stream r))]
    (reduce (fn [m [p v]] (assoc-in m p v)) {}
            (for [{:as   partition
                   :strs [defaults services regions dnsSuffix]}                        (endpoints "partitions")
                  :let                                                                 [regions (set (keys regions))]
                  [service {defaults' "defaults" :strs [endpoints partitionEndpoint]}] services
                  :let                                                                 [defaults (into defaults defaults')]
                  region                                                               (into regions (keys endpoints))
                  :let                                                                 [desc (or (endpoints region) (endpoints partitionEndpoint))]
                  :when                                                                desc
                  :let                                                                 [{:strs [hostname sslCommonName protocols credentialScope signatureVersions]} (into defaults desc)
                                                                                        protocol (or (some #{"https"} protocols) (first protocols)) ; prefer https
                                                                                        credentialScope (into {"service" service "region" region} credentialScope)
                                                                                        sslCommonName (or sslCommonName hostname)
                                                                                        env #(case % "{region}" region "{service}" service "{dnsSuffix}" dnsSuffix)
                                                                                        hostname (str/replace hostname #"\{(?:region|service|dnsSuffix)}" env)
                                                                                        sslCommonName (str/replace sslCommonName #"\{(?:region|service|dnsSuffix)}" env)
                                                                                        endpoint (str protocol "://" hostname)
                                                                                        signature-version (some->
                                                                                                           (or (some (set signatureVersions) ["v4" "s3v4" "v2" "s3"]) ; most recent first
                                                                                                               (first signatureVersions))
                                                                                                           keyword)]]
              [[service region] {:credential-scope (x/into {} (x/for [[k v] %] [(keyword k) v]) credentialScope)
                                 :ssl-common-name  sslCommonName :endpoint endpoint :signature-version signature-version}]))))


(defn generate-files!
  "This function generates all the sdk files (clj) from the api-2.json
  files.

  It's the entry-point of the generation part."
  [& {:keys [verbose api-name protocol]
      :or   {verbose false api-name nil protocol nil}}]
  (let [endpoints    (parse-endpoints! "api-resources/aws-sdk-ruby/gems/aws-partitions/partitions.json")
        entries      (into []
                           (comp
                            (x/for [^java.io.File f %
                                    :when (-> f .getName (.endsWith "api-2.json"))]
                              [(-> f .getParentFile .getParentFile .getName)
                               [(-> f .getParentFile .getName) (.getPath f)]])
                            (x/by-key (x/into (sorted-map)))
                            (x/sort))
                           (file-seq (java.io.File. "api-resources/aws-sdk-ruby/apis/")))
        gen-results  (for [[api versions]     entries
                           :let               [apifile (str/replace api #"[-.]" "_")
                                               apins (str/replace api #"[.]" "-")
                                               [latest f] (first (rseq versions))]
                           :when              (or (nil? api-name) (= apins api-name))
                           [version api-json] (cons [nil f] versions)
                           :when              (or (nil? protocol) (= protocol (get-in (with-open [r (io/reader api-json)] (json/parse-stream r)) ["metadata" "protocol"])))
                           :let               [[file ns] (if version
                                                           [(java.io.File. (str "src/portkey/aws/" apifile "/_" version ".clj"))
                                                            (symbol (str "portkey.aws." apins ".-" version))]
                                                           [(java.io.File. (str "src/portkey/aws/" apifile ".clj"))
                                                            (symbol (str "portkey.aws." apins))])]]
                       (try
                         (prn 'generating api (or version 'LATEST))
                         (with-open [w (io/writer (doto file (-> .getParentFile .mkdirs)))
                                     ;; @TODO : rework on documentation
                                     ;;docs-json (-> api-json io/file .getParentFile (io/file "docs-2.json") java.io.FileInputStream.)
                                     ]
                           (let [api-json'       (json/parse-stream (io/reader (java.io.FileInputStream. api-json)))
                                 endpoint-prefix (get-in api-json'["metadata" "endpointPrefix"])]
                             (binding [*out*          w
                                       *print-length* 1000000]
                               (prn (list 'ns ns '(:require [portkey.aws])))
                               (newline)
                               (clojure.pprint/pprint (list 'def 'endpoints (list 'quote (get endpoints endpoint-prefix))))
                               ;; @TODO : rework on documentation.
                               (doseq [form (generate-api-forms ns api-json' #_docs-json)]
                                 (newline)
                                 (if (and (seq? form) (= 'do (first form)))
                                   (run! prn (next form))
                                   (prn form))))))
                         {:gen-status :ok}
                         (catch Throwable t
                           (println "Failed to generate" api (.getMessage t))
                           #_(when verbose (println t))
                           (println t)
                           {:gen-status :fail :api api :file file})))
        gen-failures (filter #(-> % :gen-status (= :fail)) gen-results)]
    (if (seq gen-failures)
      (do
        (printf "Encountered %d errors while generating, failed for APIs: %s\n"
                (count gen-failures)
                (str/join ", " (map :api gen-failures)))
        (doseq [failure gen-failures]
          (-> failure :file (.delete))))
      (println "Generation OK!"))))

(comment


  (do (require '[portkey.aws.budgets :as bu])
      (require '[portkey.aws.sts :as sts])

      (require '[clojure.java.io :as io])
      (require '[clojure.spec.alpha :as spec])
      (require '[portkey.helpers :as h])
      (use 'clojure.repl)

      (h/def-api-2-json "ec2")
      (require '[portkey.aws.ec2 :as ec2])

      )
  ;; @TODO: error management

  (generate-files! :api-name "ec2")
  (generate-files! :protocol "rest-xml")

  (dir ec2)

  (apropos #".*spot.*")
  (spec/exercise ::ec2/describe-spot-price-history-request)
  (spec/exercise ::ec2/request-spot-instances-request)

  (ec2/describe-spot-price-history {:instance-types [:c-1medium]})

  (spec/exercise ::ec2/describe-regions-request)
  (ec2/describe-regions)



  ;; chopper toutes les outputs et checker les locations
  (let [api                    ec2-protocol-ec2-api-2-json
        {:keys [output-roots]} (shapes-by-usage api)]
    (into #{} (for [shape-name                                       output-roots
                    :let                                             [shape (get-in api ["shapes" shape-name "members"])]
                    [_ {:strs [shape locationName location] :as sh}] shape
                    :when                                            location]
                shape-name)))

  (let [api ec2-protocol-ec2-api-2-json
        {:keys [outputs]} (shapes-by-usage api)]
    (into #{} (for [shape-name outputs
                    :let       [{:strs [type flattened] :as shape} (get-in api ["shapes" shape-name])]
                    :when      (and (= "list" type) (not flattened))]
                shape-name)))








  )
