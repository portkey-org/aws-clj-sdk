(ns portkey.aws.shield.-2016-06-02 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "shield", :region "us-east-1"},
    :ssl-common-name "shield.us-east-1.amazonaws.com",
    :endpoint "https://shield.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-attack-timestamp)

(clojure.core/declare ser-protection-name)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-emergency-contact-list)

(clojure.core/declare ser-attack-id)

(clojure.core/declare ser-auto-renew)

(clojure.core/declare ser-resource-arn-filter-list)

(clojure.core/declare ser-emergency-contact)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-time-range)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-log-bucket)

(clojure.core/declare ser-email-address)

(clojure.core/declare ser-token)

(clojure.core/declare ser-protection-id)

(clojure.core/defn- ser-attack-timestamp [input] #:http.request.field{:value input, :shape "AttackTimestamp"})

(clojure.core/defn- ser-protection-name [input] #:http.request.field{:value input, :shape "ProtectionName"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-emergency-contact-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-emergency-contact coll) #:http.request.field{:shape "EmergencyContact"}))) input), :shape "EmergencyContactList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-attack-id [input] #:http.request.field{:value input, :shape "AttackId"})

(clojure.core/defn- ser-auto-renew [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "AutoRenew"})

(clojure.core/defn- ser-resource-arn-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-arn coll) #:http.request.field{:shape "ResourceArn"}))) input), :shape "ResourceArnFilterList", :type "list"})

(clojure.core/defn- ser-emergency-contact [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-email-address (:email-address input)) #:http.request.field{:name "EmailAddress", :shape "EmailAddress"})], :shape "EmergencyContact", :type "structure"}))

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-time-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimeRange", :type "structure"} (clojure.core/contains? input :from-inclusive) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attack-timestamp (input :from-inclusive)) #:http.request.field{:name "FromInclusive", :shape "AttackTimestamp"})) (clojure.core/contains? input :to-exclusive) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attack-timestamp (input :to-exclusive)) #:http.request.field{:name "ToExclusive", :shape "AttackTimestamp"}))))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-log-bucket [input] #:http.request.field{:value input, :shape "LogBucket"})

(clojure.core/defn- ser-email-address [input] #:http.request.field{:value input, :shape "EmailAddress"})

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-protection-id [input] #:http.request.field{:value input, :shape "ProtectionId"})

(clojure.core/defn- req-describe-emergency-contact-settings-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-attacks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :resource-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn-filter-list (input :resource-arns)) #:http.request.field{:name "ResourceArns", :shape "ResourceArnFilterList"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-range (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimeRange"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-range (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimeRange"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-subscription-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-attack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attack-id (input :attack-id)) #:http.request.field{:name "AttackId", :shape "AttackId"})]}))

(clojure.core/defn- req-update-emergency-contact-settings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :emergency-contact-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-emergency-contact-list (input :emergency-contact-list)) #:http.request.field{:name "EmergencyContactList", :shape "EmergencyContactList"}))))

(clojure.core/defn- req-list-protections-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-update-subscription-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-renew) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-renew (input :auto-renew)) #:http.request.field{:name "AutoRenew", :shape "AutoRenew"}))))

(clojure.core/defn- req-disassociate-drt-role-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-delete-subscription-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-associate-drt-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})]}))

(clojure.core/defn- req-associate-drt-log-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-bucket (input :log-bucket)) #:http.request.field{:name "LogBucket", :shape "LogBucket"})]}))

(clojure.core/defn- req-describe-protection-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :protection-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protection-id (input :protection-id)) #:http.request.field{:name "ProtectionId", :shape "ProtectionId"})) (clojure.core/contains? input :resource-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}))))

(clojure.core/defn- req-delete-protection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-protection-id (input :protection-id)) #:http.request.field{:name "ProtectionId", :shape "ProtectionId"})]}))

(clojure.core/defn- req-get-subscription-state-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-subscription-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-create-protection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-protection-name (input :name)) #:http.request.field{:name "Name", :shape "ProtectionName"}) (clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-disassociate-drt-log-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-bucket (input :log-bucket)) #:http.request.field{:name "LogBucket", :shape "LogBucket"})]}))

(clojure.core/defn- req-describe-drt-access-request [input] (clojure.core/cond-> {}))

(clojure.core/declare deser-double)

(clojure.core/declare deser-attack-timestamp)

(clojure.core/declare deser-unit)

(clojure.core/declare deser-protection-name)

(clojure.core/declare deser-limit-number)

(clojure.core/declare deser-attack-layer)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-attack-vector-description-list)

(clojure.core/declare deser-summarized-attack-vector)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-attack-detail)

(clojure.core/declare deser-limit)

(clojure.core/declare deser-mitigation-list)

(clojure.core/declare deser-emergency-contact-list)

(clojure.core/declare deser-attack-summary)

(clojure.core/declare deser-limits)

(clojure.core/declare deser-protections)

(clojure.core/declare deser-attack-id)

(clojure.core/declare deser-duration-in-seconds)

(clojure.core/declare deser-auto-renew)

(clojure.core/declare deser-summarized-counter)

(clojure.core/declare deser-attack-properties)

(clojure.core/declare deser-attack-summaries)

(clojure.core/declare deser-sub-resource-type)

(clojure.core/declare deser-summarized-counter-list)

(clojure.core/declare deser-sub-resource-summary-list)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-top-contributors)

(clojure.core/declare deser-mitigation)

(clojure.core/declare deser-emergency-contact)

(clojure.core/declare deser-long)

(clojure.core/declare deser-protection)

(clojure.core/declare deser-subscription-state)

(clojure.core/declare deser-sub-resource-summary)

(clojure.core/declare deser-subscription)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-summarized-attack-vector-list)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-limit-type)

(clojure.core/declare deser-attack-vector-description)

(clojure.core/declare deser-attack-property-identifier)

(clojure.core/declare deser-log-bucket)

(clojure.core/declare deser-email-address)

(clojure.core/declare deser-token)

(clojure.core/declare deser-log-bucket-list)

(clojure.core/declare deser-attack-property)

(clojure.core/declare deser-protection-id)

(clojure.core/declare deser-contributor)

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-attack-timestamp [input] input)

(clojure.core/defn- deser-unit [input] (clojure.core/get {"BITS" :bits, "BYTES" :bytes, "PACKETS" :packets, "REQUESTS" :requests} input))

(clojure.core/defn- deser-protection-name [input] input)

(clojure.core/defn- deser-limit-number [input] input)

(clojure.core/defn- deser-attack-layer [input] (clojure.core/get {"NETWORK" :network, "APPLICATION" :application} input))

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-attack-vector-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attack-vector-description coll))) input))

(clojure.core/defn- deser-summarized-attack-vector [input] (clojure.core/cond-> {:vector-type (deser-string (input "VectorType"))} (clojure.core/contains? input "VectorCounters") (clojure.core/assoc :vector-counters (deser-summarized-counter-list (input "VectorCounters")))))

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-attack-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "AttackId") (clojure.core/assoc :attack-id (deser-attack-id (input "AttackId"))) (clojure.core/contains? input "ResourceArn") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceArn"))) (clojure.core/contains? input "SubResources") (clojure.core/assoc :sub-resources (deser-sub-resource-summary-list (input "SubResources"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-attack-timestamp (input "StartTime"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-attack-timestamp (input "EndTime"))) (clojure.core/contains? input "AttackCounters") (clojure.core/assoc :attack-counters (deser-summarized-counter-list (input "AttackCounters"))) (clojure.core/contains? input "AttackProperties") (clojure.core/assoc :attack-properties (deser-attack-properties (input "AttackProperties"))) (clojure.core/contains? input "Mitigations") (clojure.core/assoc :mitigations (deser-mitigation-list (input "Mitigations")))))

(clojure.core/defn- deser-limit [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string (input "Type"))) (clojure.core/contains? input "Max") (clojure.core/assoc :max (deser-long (input "Max")))))

(clojure.core/defn- deser-mitigation-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-mitigation coll))) input))

(clojure.core/defn- deser-emergency-contact-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-emergency-contact coll))) input))

(clojure.core/defn- deser-attack-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "AttackId") (clojure.core/assoc :attack-id (deser-string (input "AttackId"))) (clojure.core/contains? input "ResourceArn") (clojure.core/assoc :resource-arn (deser-string (input "ResourceArn"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-attack-timestamp (input "StartTime"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-attack-timestamp (input "EndTime"))) (clojure.core/contains? input "AttackVectors") (clojure.core/assoc :attack-vectors (deser-attack-vector-description-list (input "AttackVectors")))))

(clojure.core/defn- deser-limits [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-limit coll))) input))

(clojure.core/defn- deser-protections [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-protection coll))) input))

(clojure.core/defn- deser-attack-id [input] input)

(clojure.core/defn- deser-duration-in-seconds [input] input)

(clojure.core/defn- deser-auto-renew [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-summarized-counter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Max") (clojure.core/assoc :max (deser-double (input "Max"))) (clojure.core/contains? input "Average") (clojure.core/assoc :average (deser-double (input "Average"))) (clojure.core/contains? input "Sum") (clojure.core/assoc :sum (deser-double (input "Sum"))) (clojure.core/contains? input "N") (clojure.core/assoc :n (deser-integer (input "N"))) (clojure.core/contains? input "Unit") (clojure.core/assoc :unit (deser-string (input "Unit")))))

(clojure.core/defn- deser-attack-properties [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attack-property coll))) input))

(clojure.core/defn- deser-attack-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attack-summary coll))) input))

(clojure.core/defn- deser-sub-resource-type [input] (clojure.core/get {"IP" :ip, "URL" :url} input))

(clojure.core/defn- deser-summarized-counter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-summarized-counter coll))) input))

(clojure.core/defn- deser-sub-resource-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sub-resource-summary coll))) input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-top-contributors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-contributor coll))) input))

(clojure.core/defn- deser-mitigation [input] (clojure.core/cond-> {} (clojure.core/contains? input "MitigationName") (clojure.core/assoc :mitigation-name (deser-string (input "MitigationName")))))

(clojure.core/defn- deser-emergency-contact [input] (clojure.core/cond-> {:email-address (deser-email-address (input "EmailAddress"))}))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-protection [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-protection-id (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-protection-name (input "Name"))) (clojure.core/contains? input "ResourceArn") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceArn")))))

(clojure.core/defn- deser-subscription-state [input] (clojure.core/get {"ACTIVE" :active, "INACTIVE" :inactive} input))

(clojure.core/defn- deser-sub-resource-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-sub-resource-type (input "Type"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-string (input "Id"))) (clojure.core/contains? input "AttackVectors") (clojure.core/assoc :attack-vectors (deser-summarized-attack-vector-list (input "AttackVectors"))) (clojure.core/contains? input "Counters") (clojure.core/assoc :counters (deser-summarized-counter-list (input "Counters")))))

(clojure.core/defn- deser-subscription [input] (clojure.core/cond-> {} (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-timestamp (input "StartTime"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "TimeCommitmentInSeconds") (clojure.core/assoc :time-commitment-in-seconds (deser-duration-in-seconds (input "TimeCommitmentInSeconds"))) (clojure.core/contains? input "AutoRenew") (clojure.core/assoc :auto-renew (deser-auto-renew (input "AutoRenew"))) (clojure.core/contains? input "Limits") (clojure.core/assoc :limits (deser-limits (input "Limits")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-summarized-attack-vector-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-summarized-attack-vector coll))) input))

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-limit-type [input] input)

(clojure.core/defn- deser-attack-vector-description [input] (clojure.core/cond-> {:vector-type (deser-string (input "VectorType"))}))

(clojure.core/defn- deser-attack-property-identifier [input] (clojure.core/get {"DESTINATION_URL" :destination-url, "REFERRER" :referrer, "SOURCE_ASN" :source-asn, "SOURCE_COUNTRY" :source-country, "SOURCE_IP_ADDRESS" :source-ip-address, "SOURCE_USER_AGENT" :source-user-agent} input))

(clojure.core/defn- deser-log-bucket [input] input)

(clojure.core/defn- deser-email-address [input] input)

(clojure.core/defn- deser-token [input] input)

(clojure.core/defn- deser-log-bucket-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-log-bucket coll))) input))

(clojure.core/defn- deser-attack-property [input] (clojure.core/cond-> {} (clojure.core/contains? input "AttackLayer") (clojure.core/assoc :attack-layer (deser-attack-layer (input "AttackLayer"))) (clojure.core/contains? input "AttackPropertyIdentifier") (clojure.core/assoc :attack-property-identifier (deser-attack-property-identifier (input "AttackPropertyIdentifier"))) (clojure.core/contains? input "TopContributors") (clojure.core/assoc :top-contributors (deser-top-contributors (input "TopContributors"))) (clojure.core/contains? input "Unit") (clojure.core/assoc :unit (deser-unit (input "Unit"))) (clojure.core/contains? input "Total") (clojure.core/assoc :total (deser-long (input "Total")))))

(clojure.core/defn- deser-protection-id [input] input)

(clojure.core/defn- deser-contributor [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-long (input "Value")))))

(clojure.core/defn- response-invalid-resource-exception ([input] (response-invalid-resource-exception nil input)) ([resultWrapper1730590 input] (clojure.core/let [rawinput1730589 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730591 {"message" (rawinput1730589 "message")}] (clojure.core/cond-> {} (letvar1730591 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730591 ["message"])))))))

(clojure.core/defn- response-disassociate-drt-role-response ([input] (response-disassociate-drt-role-response nil input)) ([resultWrapper1730593 input] (clojure.core/let [rawinput1730592 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730594 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-subscription-response ([input] (response-create-subscription-response nil input)) ([resultWrapper1730596 input] (clojure.core/let [rawinput1730595 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730597 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-protection-response ([input] (response-delete-protection-response nil input)) ([resultWrapper1730599 input] (clojure.core/let [rawinput1730598 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730600 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-drt-log-bucket-response ([input] (response-disassociate-drt-log-bucket-response nil input)) ([resultWrapper1730602 input] (clojure.core/let [rawinput1730601 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730603 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper1730605 input] (clojure.core/let [rawinput1730604 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730606 {"message" (rawinput1730604 "message")}] (clojure.core/cond-> {} (letvar1730606 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730606 ["message"])))))))

(clojure.core/defn- response-limits-exceeded-exception ([input] (response-limits-exceeded-exception nil input)) ([resultWrapper1730608 input] (clojure.core/let [rawinput1730607 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730609 {"message" (rawinput1730607 "message"), "Type" (rawinput1730607 "Type"), "Limit" (rawinput1730607 "Limit")}] (clojure.core/cond-> {} (letvar1730609 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730609 ["message"]))) (letvar1730609 "Type") (clojure.core/assoc :type (deser-limit-type (clojure.core/get-in letvar1730609 ["Type"]))) (letvar1730609 "Limit") (clojure.core/assoc :limit (deser-limit-number (clojure.core/get-in letvar1730609 ["Limit"])))))))

(clojure.core/defn- response-associate-drt-log-bucket-response ([input] (response-associate-drt-log-bucket-response nil input)) ([resultWrapper1730611 input] (clojure.core/let [rawinput1730610 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730612 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-emergency-contact-settings-response ([input] (response-describe-emergency-contact-settings-response nil input)) ([resultWrapper1730614 input] (clojure.core/let [rawinput1730613 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730615 {"EmergencyContactList" (rawinput1730613 "EmergencyContactList")}] (clojure.core/cond-> {} (letvar1730615 "EmergencyContactList") (clojure.core/assoc :emergency-contact-list (deser-emergency-contact-list (clojure.core/get-in letvar1730615 ["EmergencyContactList"])))))))

(clojure.core/defn- response-invalid-operation-exception ([input] (response-invalid-operation-exception nil input)) ([resultWrapper1730617 input] (clojure.core/let [rawinput1730616 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730618 {"message" (rawinput1730616 "message")}] (clojure.core/cond-> {} (letvar1730618 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730618 ["message"])))))))

(clojure.core/defn- response-internal-error-exception ([input] (response-internal-error-exception nil input)) ([resultWrapper1730620 input] (clojure.core/let [rawinput1730619 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730621 {"message" (rawinput1730619 "message")}] (clojure.core/cond-> {} (letvar1730621 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730621 ["message"])))))))

(clojure.core/defn- response-locked-subscription-exception ([input] (response-locked-subscription-exception nil input)) ([resultWrapper1730623 input] (clojure.core/let [rawinput1730622 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730624 {"message" (rawinput1730622 "message")}] (clojure.core/cond-> {} (letvar1730624 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730624 ["message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1730626 input] (clojure.core/let [rawinput1730625 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730627 {"message" (rawinput1730625 "message")}] (clojure.core/cond-> {} (letvar1730627 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730627 ["message"])))))))

(clojure.core/defn- response-no-associated-role-exception ([input] (response-no-associated-role-exception nil input)) ([resultWrapper1730629 input] (clojure.core/let [rawinput1730628 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730630 {"message" (rawinput1730628 "message")}] (clojure.core/cond-> {} (letvar1730630 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730630 ["message"])))))))

(clojure.core/defn- response-describe-drt-access-response ([input] (response-describe-drt-access-response nil input)) ([resultWrapper1730632 input] (clojure.core/let [rawinput1730631 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730633 {"RoleArn" (rawinput1730631 "RoleArn"), "LogBucketList" (rawinput1730631 "LogBucketList")}] (clojure.core/cond-> {} (letvar1730633 "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (clojure.core/get-in letvar1730633 ["RoleArn"]))) (letvar1730633 "LogBucketList") (clojure.core/assoc :log-bucket-list (deser-log-bucket-list (clojure.core/get-in letvar1730633 ["LogBucketList"])))))))

(clojure.core/defn- response-describe-protection-response ([input] (response-describe-protection-response nil input)) ([resultWrapper1730635 input] (clojure.core/let [rawinput1730634 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730636 {"Protection" (rawinput1730634 "Protection")}] (clojure.core/cond-> {} (letvar1730636 "Protection") (clojure.core/assoc :protection (deser-protection (clojure.core/get-in letvar1730636 ["Protection"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1730638 input] (clojure.core/let [rawinput1730637 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730639 {"message" (rawinput1730637 "message")}] (clojure.core/cond-> {} (letvar1730639 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730639 ["message"])))))))

(clojure.core/defn- response-list-attacks-response ([input] (response-list-attacks-response nil input)) ([resultWrapper1730641 input] (clojure.core/let [rawinput1730640 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730642 {"AttackSummaries" (rawinput1730640 "AttackSummaries"), "NextToken" (rawinput1730640 "NextToken")}] (clojure.core/cond-> {} (letvar1730642 "AttackSummaries") (clojure.core/assoc :attack-summaries (deser-attack-summaries (clojure.core/get-in letvar1730642 ["AttackSummaries"]))) (letvar1730642 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1730642 ["NextToken"])))))))

(clojure.core/defn- response-get-subscription-state-response ([input] (response-get-subscription-state-response nil input)) ([resultWrapper1730644 input] (clojure.core/let [rawinput1730643 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730645 {"SubscriptionState" (rawinput1730643 "SubscriptionState")}] (clojure.core/cond-> {:subscription-state (deser-subscription-state (clojure.core/get-in letvar1730645 ["SubscriptionState"]))}))))

(clojure.core/defn- response-update-subscription-response ([input] (response-update-subscription-response nil input)) ([resultWrapper1730647 input] (clojure.core/let [rawinput1730646 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730648 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-emergency-contact-settings-response ([input] (response-update-emergency-contact-settings-response nil input)) ([resultWrapper1730650 input] (clojure.core/let [rawinput1730649 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730651 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-attack-response ([input] (response-describe-attack-response nil input)) ([resultWrapper1730653 input] (clojure.core/let [rawinput1730652 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730654 {"Attack" (rawinput1730652 "Attack")}] (clojure.core/cond-> {} (letvar1730654 "Attack") (clojure.core/assoc :attack (deser-attack-detail (clojure.core/get-in letvar1730654 ["Attack"])))))))

(clojure.core/defn- response-access-denied-for-dependency-exception ([input] (response-access-denied-for-dependency-exception nil input)) ([resultWrapper1730656 input] (clojure.core/let [rawinput1730655 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730657 {"message" (rawinput1730655 "message")}] (clojure.core/cond-> {} (letvar1730657 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730657 ["message"])))))))

(clojure.core/defn- response-describe-subscription-response ([input] (response-describe-subscription-response nil input)) ([resultWrapper1730659 input] (clojure.core/let [rawinput1730658 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730660 {"Subscription" (rawinput1730658 "Subscription")}] (clojure.core/cond-> {} (letvar1730660 "Subscription") (clojure.core/assoc :subscription (deser-subscription (clojure.core/get-in letvar1730660 ["Subscription"])))))))

(clojure.core/defn- response-optimistic-lock-exception ([input] (response-optimistic-lock-exception nil input)) ([resultWrapper1730662 input] (clojure.core/let [rawinput1730661 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730663 {"message" (rawinput1730661 "message")}] (clojure.core/cond-> {} (letvar1730663 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730663 ["message"])))))))

(clojure.core/defn- response-create-protection-response ([input] (response-create-protection-response nil input)) ([resultWrapper1730665 input] (clojure.core/let [rawinput1730664 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730666 {"ProtectionId" (rawinput1730664 "ProtectionId")}] (clojure.core/cond-> {} (letvar1730666 "ProtectionId") (clojure.core/assoc :protection-id (deser-protection-id (clojure.core/get-in letvar1730666 ["ProtectionId"])))))))

(clojure.core/defn- response-associate-drt-role-response ([input] (response-associate-drt-role-response nil input)) ([resultWrapper1730668 input] (clojure.core/let [rawinput1730667 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730669 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1730671 input] (clojure.core/let [rawinput1730670 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730672 {"message" (rawinput1730670 "message")}] (clojure.core/cond-> {} (letvar1730672 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730672 ["message"])))))))

(clojure.core/defn- response-delete-subscription-response ([input] (response-delete-subscription-response nil input)) ([resultWrapper1730674 input] (clojure.core/let [rawinput1730673 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730675 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-protections-response ([input] (response-list-protections-response nil input)) ([resultWrapper1730677 input] (clojure.core/let [rawinput1730676 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730678 {"Protections" (rawinput1730676 "Protections"), "NextToken" (rawinput1730676 "NextToken")}] (clojure.core/cond-> {} (letvar1730678 "Protections") (clojure.core/assoc :protections (deser-protections (clojure.core/get-in letvar1730678 ["Protections"]))) (letvar1730678 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1730678 ["NextToken"])))))))

(clojure.core/defn- response-invalid-pagination-token-exception ([input] (response-invalid-pagination-token-exception nil input)) ([resultWrapper1730680 input] (clojure.core/let [rawinput1730679 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1730681 {"message" (rawinput1730679 "message")}] (clojure.core/cond-> {} (letvar1730681 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar1730681 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/unit #{"BITS" "REQUESTS" :requests :bits :bytes "BYTES" :packets "PACKETS"})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.invalid-resource-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/invalid-resource-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.invalid-resource-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/disassociate-drt-role-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/protection-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[ a-zA-Z0-9_\\.\\-]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/limit-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-attacks-request/resource-arns (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/resource-arn-filter-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-attacks-request/start-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/time-range))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-attacks-request/end-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/time-range))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-attacks-request/next-token (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/token))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/list-attacks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.list-attacks-request/resource-arns :portkey.aws.shield.-2016-06-02.list-attacks-request/start-time :portkey.aws.shield.-2016-06-02.list-attacks-request/end-time :portkey.aws.shield.-2016-06-02.list-attacks-request/next-token :portkey.aws.shield.-2016-06-02/max-results]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-layer #{:application "NETWORK" "APPLICATION" :network})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/create-subscription-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/create-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-attack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/attack-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-vector-description-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/attack-vector-description))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/emergency-contact-list]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-attack-vector/vector-type (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-attack-vector/vector-counters (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/summarized-counter-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/summarized-attack-vector (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02.summarized-attack-vector/vector-type] :opt-un [:portkey.aws.shield.-2016-06-02.summarized-attack-vector/vector-counters]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/delete-protection-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-protections-request/next-token (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/token))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/list-protections-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.list-protections-request/next-token :portkey.aws.shield.-2016-06-02/max-results]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-detail/sub-resources (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/sub-resource-summary-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-detail/start-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-detail/end-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-detail/attack-counters (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/summarized-counter-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-detail/mitigations (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/mitigation-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/attack-id :portkey.aws.shield.-2016-06-02/resource-arn :portkey.aws.shield.-2016-06-02.attack-detail/sub-resources :portkey.aws.shield.-2016-06-02.attack-detail/start-time :portkey.aws.shield.-2016-06-02.attack-detail/end-time :portkey.aws.shield.-2016-06-02.attack-detail/attack-counters :portkey.aws.shield.-2016-06-02/attack-properties :portkey.aws.shield.-2016-06-02.attack-detail/mitigations]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/update-subscription-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/auto-renew]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.limit/type (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.limit/max (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/long))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.limit/type :portkey.aws.shield.-2016-06-02.limit/max]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/mitigation-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/mitigation))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/emergency-contact-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/emergency-contact :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.limits-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.limits-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/limit-type))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.limits-exceeded-exception/limit (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/limit-number))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/limits-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.limits-exceeded-exception/message :portkey.aws.shield.-2016-06-02.limits-exceeded-exception/type :portkey.aws.shield.-2016-06-02.limits-exceeded-exception/limit]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/emergency-contact-list]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.invalid-operation-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.invalid-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/disassociate-drt-role-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-summary/attack-id (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-summary/resource-arn (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-summary/start-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-summary/end-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-summary/attack-vectors (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-vector-description-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.attack-summary/attack-id :portkey.aws.shield.-2016-06-02.attack-summary/resource-arn :portkey.aws.shield.-2016-06-02.attack-summary/start-time :portkey.aws.shield.-2016-06-02.attack-summary/end-time :portkey.aws.shield.-2016-06-02.attack-summary/attack-vectors]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/delete-subscription-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/limits (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/limit))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/protections (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/protection))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\\-]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.locked-subscription-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/locked-subscription-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.locked-subscription-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/duration-in-seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.no-associated-role-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/no-associated-role-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.no-associated-role-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/auto-renew #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/associate-drt-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/log-bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/name (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/max (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/double))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/average (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/double))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/sum (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/double))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/n (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/integer))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/unit (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/summarized-counter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.summarized-counter/name :portkey.aws.shield.-2016-06-02.summarized-counter/max :portkey.aws.shield.-2016-06-02.summarized-counter/average :portkey.aws.shield.-2016-06-02.summarized-counter/sum :portkey.aws.shield.-2016-06-02.summarized-counter/n :portkey.aws.shield.-2016-06-02.summarized-counter/unit]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-properties (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/attack-property))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-protection-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/protection-id :portkey.aws.shield.-2016-06-02/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-summaries (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/attack-summary))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/delete-protection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/protection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-drt-access-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/role-arn :portkey.aws.shield.-2016-06-02/log-bucket-list]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/sub-resource-type #{"URL" :ip "IP" :url})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-protection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/protection]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/summarized-counter-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/summarized-counter))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/sub-resource-summary-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/sub-resource-summary))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/get-subscription-state-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-attacks-response/next-token (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/token))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/list-attacks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/attack-summaries :portkey.aws.shield.-2016-06-02.list-attacks-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/top-contributors (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/contributor))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/resource-arn-filter-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/resource-arn))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-subscription-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.mitigation/mitigation-name (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/mitigation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.mitigation/mitigation-name]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/get-subscription-state-response (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/subscription-state] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/emergency-contact (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/email-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.create-protection-request/name (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/protection-name))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/create-protection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02.create-protection-request/name :portkey.aws.shield.-2016-06-02/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.protection/id (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/protection-id))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.protection/name (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/protection-name))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/protection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.protection/id :portkey.aws.shield.-2016-06-02.protection/name :portkey.aws.shield.-2016-06-02/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/subscription-state #{:inactive :active "INACTIVE" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.sub-resource-summary/type (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/sub-resource-type))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.sub-resource-summary/id (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.sub-resource-summary/attack-vectors (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/summarized-attack-vector-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.sub-resource-summary/counters (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/summarized-counter-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/sub-resource-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.sub-resource-summary/type :portkey.aws.shield.-2016-06-02.sub-resource-summary/id :portkey.aws.shield.-2016-06-02.sub-resource-summary/attack-vectors :portkey.aws.shield.-2016-06-02.sub-resource-summary/counters]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/update-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.subscription/start-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.subscription/end-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.subscription/time-commitment-in-seconds (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/duration-in-seconds))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/subscription (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.subscription/start-time :portkey.aws.shield.-2016-06-02.subscription/end-time :portkey.aws.shield.-2016-06-02.subscription/time-commitment-in-seconds :portkey.aws.shield.-2016-06-02/auto-renew :portkey.aws.shield.-2016-06-02/limits]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/summarized-attack-vector-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/summarized-attack-vector))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:aws.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/log-bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.time-range/from-inclusive (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.time-range/to-exclusive (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/time-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.time-range/from-inclusive :portkey.aws.shield.-2016-06-02.time-range/to-exclusive]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/max-results (clojure.spec.alpha/int-in 0 10000))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.describe-attack-response/attack (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-detail))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-attack-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.describe-attack-response/attack]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/limit-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.access-denied-for-dependency-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/access-denied-for-dependency-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.access-denied-for-dependency-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/subscription]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.optimistic-lock-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/optimistic-lock-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.optimistic-lock-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-vector-description/vector-type (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-vector-description (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02.attack-vector-description/vector-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-property-identifier #{"DESTINATION_URL" :source-ip-address "SOURCE_IP_ADDRESS" :source-country :destination-url "REFERRER" "SOURCE_USER_AGENT" :source-asn :referrer "SOURCE_ASN" "SOURCE_COUNTRY" :source-user-agent})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-drt-access-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/log-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 63)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([a-z]|(\d(?!\d{0,2}\.\d{1,3}\.\d{1,3}\.\d{1,3})))([a-z\d]|(\.(?!(\.|-)))|(-(?!\.))){1,61}[a-z\d]$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/create-protection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/protection-id]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/associate-drt-role-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/email-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 150)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\S+@\S+\.\S+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4096)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^.*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/delete-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/log-bucket-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/log-bucket :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-property/total (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/long))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-property (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/attack-layer :portkey.aws.shield.-2016-06-02/attack-property-identifier :portkey.aws.shield.-2016-06-02/top-contributors :portkey.aws.shield.-2016-06-02/unit :portkey.aws.shield.-2016-06-02.attack-property/total]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-protections-response/next-token (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/token))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/list-protections-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/protections :portkey.aws.shield.-2016-06-02.list-protections-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.invalid-pagination-token-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/invalid-pagination-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.invalid-pagination-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/protection-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 36)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\\-]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.contributor/name (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.contributor/value (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/long))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/contributor (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.contributor/name :portkey.aws.shield.-2016-06-02.contributor/value]))

(clojure.core/defn delete-protection "Deletes an AWS Shield Advanced Protection." ([delete-protection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-protection-request delete-protection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/delete-protection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/delete-protection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProtection", :http.request.configuration/output-deser-fn response-delete-protection-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception}})))))
(clojure.spec.alpha/fdef delete-protection :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/delete-protection-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/delete-protection-response))

(clojure.core/defn associate-drt-log-bucket "Authorizes the DDoS Response team (DRT) to access the specified Amazon S3 bucket\ncontaining your flow logs. You can associate up to 10 Amazon S3 buckets with\nyour subscription.\n To use the services of the DRT and make an AssociateDRTLogBucket request, you\nmust be subscribed to the Business Support plan\n(https://aws.amazon.com/premiumsupport/business-support/) or the Enterprise\nSupport plan (https://aws.amazon.com/premiumsupport/enterprise-support/)." ([associate-drt-log-bucket-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-drt-log-bucket-request associate-drt-log-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateDRTLogBucket", :http.request.configuration/output-deser-fn response-associate-drt-log-bucket-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception, "NoAssociatedRoleException" :portkey.aws.shield.-2016-06-02/no-associated-role-exception, "LimitsExceededException" :portkey.aws.shield.-2016-06-02/limits-exceeded-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "AccessDeniedForDependencyException" :portkey.aws.shield.-2016-06-02/access-denied-for-dependency-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-drt-log-bucket :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-response))

(clojure.core/defn describe-attack "Describes the details of a DDoS attack." ([describe-attack-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-attack-request describe-attack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/describe-attack-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/describe-attack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAttack", :http.request.configuration/output-deser-fn response-describe-attack-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "AccessDeniedException" :portkey.aws.shield.-2016-06-02/access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-attack :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/describe-attack-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/describe-attack-response))

(clojure.core/defn describe-drt-access "Returns the current role and list of Amazon S3 log buckets used by the DDoS\nResponse team (DRT) to access your AWS account while assisting with attack\nmitigation." ([] (describe-drt-access {})) ([describe-drt-access-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-drt-access-request describe-drt-access-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/describe-drt-access-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/describe-drt-access-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDRTAccess", :http.request.configuration/output-deser-fn response-describe-drt-access-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-drt-access :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/describe-drt-access-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/describe-drt-access-response))

(clojure.core/defn create-protection "Enables AWS Shield Advanced for a specific AWS resource. The resource can be an\nAmazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global\nAccelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone.\n You can add protection to only a single resource with each CreateProtection\nrequest. If you want to add protection to multiple resources at once, use the\nAWS WAF console (https://console.aws.amazon.com/waf/). For more information see\nGetting Started with AWS Shield Advanced\n(https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html)\nand Add AWS Shield Advanced Protection to more AWS Resources\n(https://docs.aws.amazon.com/waf/latest/developerguide/configure-new-protection.html)." ([create-protection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-protection-request create-protection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/create-protection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/create-protection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProtection", :http.request.configuration/output-deser-fn response-create-protection-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidResourceException" :portkey.aws.shield.-2016-06-02/invalid-resource-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception, "LimitsExceededException" :portkey.aws.shield.-2016-06-02/limits-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.shield.-2016-06-02/resource-already-exists-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-protection :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/create-protection-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/create-protection-response))

(clojure.core/defn describe-protection "Lists the details of a Protection object." ([] (describe-protection {})) ([describe-protection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-protection-request describe-protection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/describe-protection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/describe-protection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProtection", :http.request.configuration/output-deser-fn response-describe-protection-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-protection :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/describe-protection-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/describe-protection-response))

(clojure.core/defn list-protections "Lists all Protection objects for the account." ([] (list-protections {})) ([list-protections-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-protections-request list-protections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/list-protections-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/list-protections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProtections", :http.request.configuration/output-deser-fn response-list-protections-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception, "InvalidPaginationTokenException" :portkey.aws.shield.-2016-06-02/invalid-pagination-token-exception}})))))
(clojure.spec.alpha/fdef list-protections :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/list-protections-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/list-protections-response))

(clojure.core/defn update-emergency-contact-settings "Updates the details of the list of email addresses that the DRT can use to\ncontact you during a suspected attack." ([] (update-emergency-contact-settings {})) ([update-emergency-contact-settings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-emergency-contact-settings-request update-emergency-contact-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateEmergencyContactSettings", :http.request.configuration/output-deser-fn response-update-emergency-contact-settings-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-emergency-contact-settings :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-response))

(clojure.core/defn describe-emergency-contact-settings "Lists the email addresses that the DRT can use to contact you during a suspected\nattack." ([] (describe-emergency-contact-settings {})) ([describe-emergency-contact-settings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-emergency-contact-settings-request describe-emergency-contact-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEmergencyContactSettings", :http.request.configuration/output-deser-fn response-describe-emergency-contact-settings-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-emergency-contact-settings :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-response))

(clojure.core/defn disassociate-drt-role "Removes the DDoS Response team's (DRT) access to your AWS account.\n To make a DisassociateDRTRole request, you must be subscribed to the Business\nSupport plan (https://aws.amazon.com/premiumsupport/business-support/) or the\nEnterprise Support plan\n(https://aws.amazon.com/premiumsupport/enterprise-support/). However, if you are\nnot subscribed to one of these support plans, but had been previously and had\ngranted the DRT access to your account, you can submit a DisassociateDRTRole\nrequest to remove this access." ([] (disassociate-drt-role {})) ([disassociate-drt-role-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-drt-role-request disassociate-drt-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/disassociate-drt-role-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/disassociate-drt-role-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateDRTRole", :http.request.configuration/output-deser-fn response-disassociate-drt-role-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-drt-role :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/disassociate-drt-role-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/disassociate-drt-role-response))

(clojure.core/defn update-subscription "Updates the details of an existing subscription. Only enter values for\nparameters you want to change. Empty parameters are not updated." ([] (update-subscription {})) ([update-subscription-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-subscription-request update-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/update-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/update-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSubscription", :http.request.configuration/output-deser-fn response-update-subscription-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "LockedSubscriptionException" :portkey.aws.shield.-2016-06-02/locked-subscription-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception}})))))
(clojure.spec.alpha/fdef update-subscription :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/update-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/update-subscription-response))

(clojure.core/defn create-subscription "Activates AWS Shield Advanced for an account.\n As part of this request you can specify EmergencySettings that automaticaly\ngrant the DDoS response team (DRT) needed permissions to assist you during a\nsuspected DDoS attack. For more information see Authorize the DDoS Response Team\nto Create Rules and Web ACLs on Your Behalf\n(https://docs.aws.amazon.com/waf/latest/developerguide/authorize-DRT.html).\n When you initally create a subscription, your subscription is set to be\nautomatically renewed at the end of the existing subscription period. You can\nchange this by submitting an UpdateSubscription request." ([] (create-subscription {})) ([create-subscription-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-subscription-request create-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/create-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/create-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSubscription", :http.request.configuration/output-deser-fn response-create-subscription-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceAlreadyExistsException" :portkey.aws.shield.-2016-06-02/resource-already-exists-exception}})))))
(clojure.spec.alpha/fdef create-subscription :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/create-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/create-subscription-response))

(clojure.core/defn disassociate-drt-log-bucket "Removes the DDoS Response team's (DRT) access to the specified Amazon S3 bucket\ncontaining your flow logs.\n To make a DisassociateDRTLogBucket request, you must be subscribed to the\nBusiness Support plan (https://aws.amazon.com/premiumsupport/business-support/)\nor the Enterprise Support plan\n(https://aws.amazon.com/premiumsupport/enterprise-support/). However, if you are\nnot subscribed to one of these support plans, but had been previously and had\ngranted the DRT access to your account, you can submit a\nDisassociateDRTLogBucket request to remove this access." ([disassociate-drt-log-bucket-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-drt-log-bucket-request disassociate-drt-log-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateDRTLogBucket", :http.request.configuration/output-deser-fn response-disassociate-drt-log-bucket-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception, "NoAssociatedRoleException" :portkey.aws.shield.-2016-06-02/no-associated-role-exception, "AccessDeniedForDependencyException" :portkey.aws.shield.-2016-06-02/access-denied-for-dependency-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-drt-log-bucket :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-response))

(clojure.core/defn associate-drt-role "Authorizes the DDoS Response team (DRT), using the specified role, to access\nyour AWS account to assist with DDoS attack mitigation during potential attacks.\nThis enables the DRT to inspect your AWS WAF configuration and create or update\nAWS WAF rules and web ACLs.\n You can associate only one RoleArn with your subscription. If you submit an\nAssociateDRTRole request for an account that already has an associated role, the\nnew RoleArn will replace the existing RoleArn.\n Prior to making the AssociateDRTRole request, you must attach the\nAWSShieldDRTAccessPolicy\n(https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy)\nmanaged policy to the role you will specify in the request. For more information\nsee Attaching and Detaching IAM Policies\n(https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html).\nThe role must also trust the service principal drt.shield.amazonaws.com. For\nmore information, see IAM JSON Policy Elements: Principal\n(https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html).\n The DRT will have access only to your AWS WAF and Shield resources. By\nsubmitting this request, you authorize the DRT to inspect your AWS WAF and\nShield configuration and create and update AWS WAF rules and web ACLs on your\nbehalf. The DRT takes these actions only if explicitly authorized by you.\n You must have the iam:PassRole permission to make an AssociateDRTRole request.\nFor more information, see Granting a User Permissions to Pass a Role to an AWS\nService\n(https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html).\n To use the services of the DRT and make an AssociateDRTRole request, you must\nbe subscribed to the Business Support plan\n(https://aws.amazon.com/premiumsupport/business-support/) or the Enterprise\nSupport plan (https://aws.amazon.com/premiumsupport/enterprise-support/)." ([associate-drt-role-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-drt-role-request associate-drt-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/associate-drt-role-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/associate-drt-role-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateDRTRole", :http.request.configuration/output-deser-fn response-associate-drt-role-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "AccessDeniedForDependencyException" :portkey.aws.shield.-2016-06-02/access-denied-for-dependency-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-drt-role :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/associate-drt-role-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/associate-drt-role-response))

(clojure.core/defn delete-subscription "Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a\n1-year subscription commitment. You cannot delete a subscription prior to the\ncompletion of that commitment." ([] (delete-subscription {})) ([delete-subscription-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-subscription-request delete-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/delete-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/delete-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSubscription", :http.request.configuration/output-deser-fn response-delete-subscription-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "LockedSubscriptionException" :portkey.aws.shield.-2016-06-02/locked-subscription-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-subscription :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/delete-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/delete-subscription-response))

(clojure.core/defn list-attacks "Returns all ongoing DDoS attacks or all DDoS attacks during a specified time\nperiod." ([] (list-attacks {})) ([list-attacks-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-attacks-request list-attacks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/list-attacks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/list-attacks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAttacks", :http.request.configuration/output-deser-fn response-list-attacks-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef list-attacks :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/list-attacks-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/list-attacks-response))

(clojure.core/defn describe-subscription "Provides details about the AWS Shield Advanced subscription for an account." ([] (describe-subscription {})) ([describe-subscription-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-subscription-request describe-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/describe-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/describe-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSubscription", :http.request.configuration/output-deser-fn response-describe-subscription-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-subscription :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/describe-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/describe-subscription-response))

(clojure.core/defn get-subscription-state "Returns the SubscriptionState, either Active or Inactive." ([] (get-subscription-state {})) ([get-subscription-state-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-subscription-state-request get-subscription-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.configuration/target-prefix "AWSShield_20160616", :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/get-subscription-state-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id "Shield", :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/get-subscription-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSubscriptionState", :http.request.configuration/output-deser-fn response-get-subscription-state-response, :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-subscription-state :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/get-subscription-state-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/get-subscription-state-response))
