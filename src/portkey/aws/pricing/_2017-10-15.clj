(ns portkey.aws.pricing.-2017-10-15 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "pricing", :region "us-east-1"},
    :ssl-common-name "api.pricing.us-east-1.amazonaws.com",
    :endpoint "https://api.pricing.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "pricing", :region "ap-south-1"},
    :ssl-common-name "api.pricing.ap-south-1.amazonaws.com",
    :endpoint "https://api.pricing.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-filter)

(clojure.core/declare ser-boxed-integer)

(clojure.core/declare ser-filter-type)

(clojure.core/declare ser-string)

(clojure.core/declare ser-filters)

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-filter-type (:type input)) #:http.request.field{:name "Type", :shape "FilterType"}) (clojure.core/into (ser-string (:field input)) #:http.request.field{:name "Field", :shape "String"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "Value", :shape "String"})], :shape "Filter", :type "structure"}))

(clojure.core/defn- ser-boxed-integer [input] #:http.request.field{:value input, :shape "BoxedInteger"})

(clojure.core/defn- ser-filter-type [input] #:http.request.field{:value (clojure.core/get {"TERM_MATCH" "TERM_MATCH", :term-match "TERM_MATCH"} input), :shape "FilterType"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "Filters", :type "list"})

(clojure.core/defn- req-describe-services-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :service-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-code)) #:http.request.field{:name "ServiceCode", :shape "String"})) (clojure.core/contains? input :format-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :format-version)) #:http.request.field{:name "FormatVersion", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxedInteger", :box true}))))

(clojure.core/defn- req-get-attribute-values-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :service-code)) #:http.request.field{:name "ServiceCode", :shape "String"}) (clojure.core/into (ser-string (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "String"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxedInteger", :box true}))))

(clojure.core/defn- req-get-products-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :service-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-code)) #:http.request.field{:name "ServiceCode", :shape "String"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"})) (clojure.core/contains? input :format-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :format-version)) #:http.request.field{:name "FormatVersion", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxedInteger", :box true}))))

(clojure.core/declare deser-service-list)

(clojure.core/declare deser-price-list)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-price-list-item-json)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-attribute-name-list)

(clojure.core/declare deser-string)

(clojure.core/declare deser-attribute-value-list)

(clojure.core/declare deser-service)

(clojure.core/defn- deser-service-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service coll))) input))

(clojure.core/defn- deser-price-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-price-list-item-json coll))) input))

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-price-list-item-json [input] input)

(clojure.core/defn- deser-attribute-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-attribute-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-attribute-value-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-value coll))) input))

(clojure.core/defn- deser-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServiceCode") (clojure.core/assoc :service-code (deser-string (input "ServiceCode"))) (clojure.core/contains? input "AttributeNames") (clojure.core/assoc :attribute-names (deser-attribute-name-list (input "AttributeNames")))))

(clojure.core/defn- response-get-products-response ([input] (response-get-products-response nil input)) ([resultWrapper1469267 input] (clojure.core/let [rawinput1469266 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1469268 {"FormatVersion" (rawinput1469266 "FormatVersion"), "PriceList" (rawinput1469266 "PriceList"), "NextToken" (rawinput1469266 "NextToken")}] (clojure.core/cond-> {} (letvar1469268 "FormatVersion") (clojure.core/assoc :format-version (deser-string (clojure.core/get-in letvar1469268 ["FormatVersion"]))) (letvar1469268 "PriceList") (clojure.core/assoc :price-list (deser-price-list (clojure.core/get-in letvar1469268 ["PriceList"]))) (letvar1469268 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1469268 ["NextToken"])))))))

(clojure.core/defn- response-expired-next-token-exception ([input] (response-expired-next-token-exception nil input)) ([resultWrapper1469270 input] (clojure.core/let [rawinput1469269 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1469271 {"Message" (rawinput1469269 "Message")}] (clojure.core/cond-> {} (letvar1469271 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1469271 ["Message"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1469273 input] (clojure.core/let [rawinput1469272 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1469274 {"Message" (rawinput1469272 "Message")}] (clojure.core/cond-> {} (letvar1469274 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1469274 ["Message"])))))))

(clojure.core/defn- response-internal-error-exception ([input] (response-internal-error-exception nil input)) ([resultWrapper1469276 input] (clojure.core/let [rawinput1469275 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1469277 {"Message" (rawinput1469275 "Message")}] (clojure.core/cond-> {} (letvar1469277 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1469277 ["Message"])))))))

(clojure.core/defn- response-describe-services-response ([input] (response-describe-services-response nil input)) ([resultWrapper1469279 input] (clojure.core/let [rawinput1469278 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1469280 {"Services" (rawinput1469278 "Services"), "FormatVersion" (rawinput1469278 "FormatVersion"), "NextToken" (rawinput1469278 "NextToken")}] (clojure.core/cond-> {} (letvar1469280 "Services") (clojure.core/assoc :services (deser-service-list (clojure.core/get-in letvar1469280 ["Services"]))) (letvar1469280 "FormatVersion") (clojure.core/assoc :format-version (deser-string (clojure.core/get-in letvar1469280 ["FormatVersion"]))) (letvar1469280 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1469280 ["NextToken"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1469282 input] (clojure.core/let [rawinput1469281 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1469283 {"Message" (rawinput1469281 "Message")}] (clojure.core/cond-> {} (letvar1469283 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1469283 ["Message"])))))))

(clojure.core/defn- response-get-attribute-values-response ([input] (response-get-attribute-values-response nil input)) ([resultWrapper1469285 input] (clojure.core/let [rawinput1469284 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1469286 {"AttributeValues" (rawinput1469284 "AttributeValues"), "NextToken" (rawinput1469284 "NextToken")}] (clojure.core/cond-> {} (letvar1469286 "AttributeValues") (clojure.core/assoc :attribute-values (deser-attribute-value-list (clojure.core/get-in letvar1469286 ["AttributeValues"]))) (letvar1469286 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1469286 ["NextToken"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1469288 input] (clojure.core/let [rawinput1469287 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1469289 {"Message" (rawinput1469287 "Message")}] (clojure.core/cond-> {} (letvar1469289 "Message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1469289 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/service-list (clojure.spec.alpha/coll-of :portkey.aws.pricing.-2017-10-15/service))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.filter/type (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/filter-type))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.filter/field (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.filter/value (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/filter (clojure.spec.alpha/keys :req-un [:portkey.aws.pricing.-2017-10-15.filter/type :portkey.aws.pricing.-2017-10-15.filter/field :portkey.aws.pricing.-2017-10-15.filter/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/price-list (clojure.spec.alpha/coll-of :portkey.aws.pricing.-2017-10-15/price-list-item-json))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-products-response/format-version (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-products-response/next-token (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/get-products-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.get-products-response/format-version :portkey.aws.pricing.-2017-10-15/price-list :portkey.aws.pricing.-2017-10-15.get-products-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/boxed-integer (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.expired-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/error-message))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/expired-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.expired-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.describe-services-request/service-code (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.describe-services-request/format-version (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.describe-services-request/next-token (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.describe-services-request/max-results (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/describe-services-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.describe-services-request/service-code :portkey.aws.pricing.-2017-10-15.describe-services-request/format-version :portkey.aws.pricing.-2017-10-15.describe-services-request/next-token :portkey.aws.pricing.-2017-10-15.describe-services-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-attribute-values-request/service-code (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-attribute-values-request/attribute-name (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-attribute-values-request/next-token (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-attribute-values-request/max-results (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/get-attribute-values-request (clojure.spec.alpha/keys :req-un [:portkey.aws.pricing.-2017-10-15.get-attribute-values-request/service-code :portkey.aws.pricing.-2017-10-15.get-attribute-values-request/attribute-name] :opt-un [:portkey.aws.pricing.-2017-10-15.get-attribute-values-request/next-token :portkey.aws.pricing.-2017-10-15.get-attribute-values-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/price-list-item-json (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/error-message))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/error-message))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-products-request/service-code (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-products-request/format-version (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-products-request/next-token (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-products-request/max-results (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/get-products-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.get-products-request/service-code :portkey.aws.pricing.-2017-10-15/filters :portkey.aws.pricing.-2017-10-15.get-products-request/format-version :portkey.aws.pricing.-2017-10-15.get-products-request/next-token :portkey.aws.pricing.-2017-10-15.get-products-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.describe-services-response/services (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/service-list))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.describe-services-response/format-version (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.describe-services-response/next-token (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/describe-services-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.describe-services-response/services :portkey.aws.pricing.-2017-10-15.describe-services-response/format-version :portkey.aws.pricing.-2017-10-15.describe-services-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.attribute-value/value (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.attribute-value/value]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.pricing.-2017-10-15/string))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/error-message))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/filter-type #{"TERM_MATCH" :term-match})

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/filters (clojure.spec.alpha/coll-of :portkey.aws.pricing.-2017-10-15/filter))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/attribute-value-list (clojure.spec.alpha/coll-of :portkey.aws.pricing.-2017-10-15/attribute-value))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.service/service-code (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.service/attribute-names (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.service/service-code :portkey.aws.pricing.-2017-10-15.service/attribute-names]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-attribute-values-response/attribute-values (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/attribute-value-list))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.get-attribute-values-response/next-token (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/string))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/get-attribute-values-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.get-attribute-values-response/attribute-values :portkey.aws.pricing.-2017-10-15.get-attribute-values-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/error-message))
(clojure.spec.alpha/def :portkey.aws.pricing.-2017-10-15/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.pricing.-2017-10-15.invalid-parameter-exception/message]))

(clojure.core/defn describe-services "Returns the metadata for one service or a list of the metadata for all services.\nUse this without a service code to get the service codes for all services. Use\nit with a service code, such as AmazonEC2, to get information specific to that\nservice, such as the attribute names available for that service. For example,\nsome of the attribute names available for EC2 are volumeType, maxIopsVolume,\noperation, locationType, and instanceCapacity10xlarge." ([] (describe-services {})) ([describe-services-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-services-request describe-services-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pricing.-2017-10-15/endpoints, :http.request.configuration/target-prefix "AWSPriceListService", :http.request.spec/output-spec :portkey.aws.pricing.-2017-10-15/describe-services-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.pricing.-2017-10-15/describe-services-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeServices", :http.request.configuration/output-deser-fn response-describe-services-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.pricing.-2017-10-15/internal-error-exception, "InvalidParameterException" :portkey.aws.pricing.-2017-10-15/invalid-parameter-exception, "NotFoundException" :portkey.aws.pricing.-2017-10-15/not-found-exception, "InvalidNextTokenException" :portkey.aws.pricing.-2017-10-15/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.pricing.-2017-10-15/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-services :args (clojure.spec.alpha/? :portkey.aws.pricing.-2017-10-15/describe-services-request) :ret (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/describe-services-response))

(clojure.core/defn get-attribute-values "Returns a list of attribute values. Attibutes are similar to the details in a\nPrice List API offer file. For a list of available attributes, see Offer File\nDefinitions\n(http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/reading-an-offer.html#pps-defs)\nin the AWS Billing and Cost Management User Guide\n(http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-what-is.html)." ([get-attribute-values-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-attribute-values-request get-attribute-values-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pricing.-2017-10-15/endpoints, :http.request.configuration/target-prefix "AWSPriceListService", :http.request.spec/output-spec :portkey.aws.pricing.-2017-10-15/get-attribute-values-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.pricing.-2017-10-15/get-attribute-values-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAttributeValues", :http.request.configuration/output-deser-fn response-get-attribute-values-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.pricing.-2017-10-15/internal-error-exception, "InvalidParameterException" :portkey.aws.pricing.-2017-10-15/invalid-parameter-exception, "NotFoundException" :portkey.aws.pricing.-2017-10-15/not-found-exception, "InvalidNextTokenException" :portkey.aws.pricing.-2017-10-15/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.pricing.-2017-10-15/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef get-attribute-values :args (clojure.spec.alpha/tuple :portkey.aws.pricing.-2017-10-15/get-attribute-values-request) :ret (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/get-attribute-values-response))

(clojure.core/defn get-products "Returns a list of all products that match the filter criteria." ([] (get-products {})) ([get-products-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-products-request get-products-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.pricing.-2017-10-15/endpoints, :http.request.configuration/target-prefix "AWSPriceListService", :http.request.spec/output-spec :portkey.aws.pricing.-2017-10-15/get-products-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.pricing.-2017-10-15/get-products-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetProducts", :http.request.configuration/output-deser-fn response-get-products-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.pricing.-2017-10-15/internal-error-exception, "InvalidParameterException" :portkey.aws.pricing.-2017-10-15/invalid-parameter-exception, "NotFoundException" :portkey.aws.pricing.-2017-10-15/not-found-exception, "InvalidNextTokenException" :portkey.aws.pricing.-2017-10-15/invalid-next-token-exception, "ExpiredNextTokenException" :portkey.aws.pricing.-2017-10-15/expired-next-token-exception}})))))
(clojure.spec.alpha/fdef get-products :args (clojure.spec.alpha/? :portkey.aws.pricing.-2017-10-15/get-products-request) :ret (clojure.spec.alpha/and :portkey.aws.pricing.-2017-10-15/get-products-response))
