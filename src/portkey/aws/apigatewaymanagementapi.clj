(ns portkey.aws.apigatewaymanagementapi (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-string)

(clojure.core/declare ser-data)

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-data [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Data"})

(clojure.core/defn- req-post-to-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :connection-id)) #:http.request.field{:name "ConnectionId", :shape "__string", :location "uri", :location-name "connectionId"})], :body [(clojure.core/into (ser-data (input :data)) #:http.request.field{:name "Data", :shape "Data"})]}))

(clojure.core/declare deser-string)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1033405 input] (clojure.core/let [rawinput1033404 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1033406 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1033408 input] (clojure.core/let [rawinput1033407 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1033409 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-payload-too-large-exception ([input] (response-payload-too-large-exception nil input)) ([resultWrapper1033411 input] (clojure.core/let [rawinput1033410 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1033412 {"message" (rawinput1033410 "message")}] (clojure.core/cond-> {} (letvar1033412 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1033412 ["message"])))))))

(clojure.core/defn- response-gone-exception ([input] (response-gone-exception nil input)) ([resultWrapper1033414 input] (clojure.core/let [rawinput1033413 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1033415 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.apigatewaymanagementapi/data clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.apigatewaymanagementapi/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigatewaymanagementapi/gone-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigatewaymanagementapi/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigatewaymanagementapi.payload-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.apigatewaymanagementapi/string))
(clojure.spec.alpha/def :portkey.aws.apigatewaymanagementapi/payload-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.apigatewaymanagementapi.payload-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.apigatewaymanagementapi.post-to-connection-request/connection-id (clojure.spec.alpha/and :portkey.aws.apigatewaymanagementapi/string))
(clojure.spec.alpha/def :portkey.aws.apigatewaymanagementapi/post-to-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.apigatewaymanagementapi.post-to-connection-request/connection-id :portkey.aws.apigatewaymanagementapi/data] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigatewaymanagementapi/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn post-to-connection ([post-to-connection-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-post-to-connection-request post-to-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.apigatewaymanagementapi/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/@connections/{connectionId}", :http.request.configuration/version "2018-11-29", :http.request.configuration/service-id "ApiGatewayManagementApi", :http.request.spec/input-spec :portkey.aws.apigatewaymanagementapi/post-to-connection-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostToConnection", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"GoneException" :portkey.aws.apigatewaymanagementapi/gone-exception, "LimitExceededException" :portkey.aws.apigatewaymanagementapi/limit-exceeded-exception, "PayloadTooLargeException" :portkey.aws.apigatewaymanagementapi/payload-too-large-exception, "ForbiddenException" :portkey.aws.apigatewaymanagementapi/forbidden-exception}})))))
(clojure.spec.alpha/fdef post-to-connection :args (clojure.spec.alpha/tuple :portkey.aws.apigatewaymanagementapi/post-to-connection-request) :ret clojure.core/true?)
