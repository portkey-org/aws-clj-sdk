(ns portkey.aws.glacier (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "glacier", :region "ap-northeast-1"},
    :ssl-common-name "glacier.ap-northeast-1.amazonaws.com",
    :endpoint "https://glacier.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "glacier", :region "eu-west-1"},
    :ssl-common-name "glacier.eu-west-1.amazonaws.com",
    :endpoint "https://glacier.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "glacier", :region "us-east-2"},
    :ssl-common-name "glacier.us-east-2.amazonaws.com",
    :endpoint "https://glacier.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "glacier", :region "ap-southeast-2"},
    :ssl-common-name "glacier.ap-southeast-2.amazonaws.com",
    :endpoint "https://glacier.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "glacier", :region "cn-north-1"},
    :ssl-common-name "glacier.cn-north-1.amazonaws.com.cn",
    :endpoint "https://glacier.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "glacier", :region "sa-east-1"},
    :ssl-common-name "glacier.sa-east-1.amazonaws.com",
    :endpoint "https://glacier.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "glacier", :region "ap-southeast-1"},
    :ssl-common-name "glacier.ap-southeast-1.amazonaws.com",
    :endpoint "https://glacier.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "glacier", :region "cn-northwest-1"},
    :ssl-common-name "glacier.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://glacier.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "glacier", :region "ap-northeast-2"},
    :ssl-common-name "glacier.ap-northeast-2.amazonaws.com",
    :endpoint "https://glacier.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "glacier", :region "eu-west-3"},
    :ssl-common-name "glacier.eu-west-3.amazonaws.com",
    :endpoint "https://glacier.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "glacier", :region "ca-central-1"},
    :ssl-common-name "glacier.ca-central-1.amazonaws.com",
    :endpoint "https://glacier.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "glacier", :region "eu-central-1"},
    :ssl-common-name "glacier.eu-central-1.amazonaws.com",
    :endpoint "https://glacier.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "glacier", :region "eu-west-2"},
    :ssl-common-name "glacier.eu-west-2.amazonaws.com",
    :endpoint "https://glacier.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "glacier", :region "us-gov-west-1"},
    :ssl-common-name "glacier.us-gov-west-1.amazonaws.com",
    :endpoint "https://glacier.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "glacier", :region "us-west-2"},
    :ssl-common-name "glacier.us-west-2.amazonaws.com",
    :endpoint "https://glacier.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "glacier", :region "us-east-1"},
    :ssl-common-name "glacier.us-east-1.amazonaws.com",
    :endpoint "https://glacier.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "glacier", :region "us-west-1"},
    :ssl-common-name "glacier.us-west-1.amazonaws.com",
    :endpoint "https://glacier.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "glacier", :region "ap-south-1"},
    :ssl-common-name "glacier.ap-south-1.amazonaws.com",
    :endpoint "https://glacier.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-data-retrieval-rule)

(clojure.core/declare ser-input-serialization)

(clojure.core/declare ser-vault-access-policy)

(clojure.core/declare serstring)

(clojure.core/declare ser-type)

(clojure.core/declare ser-permission)

(clojure.core/declare ser-canned-acl)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-vault-notification-config)

(clojure.core/declare ser-access-control-policy-list)

(clojure.core/declare ser-output-serialization)

(clojure.core/declare ser-data-retrieval-policy)

(clojure.core/declare ser-encryption-type)

(clojure.core/declare ser-grant)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-csv-output)

(clojure.core/declare serhashmap)

(clojure.core/declare ser-nullable-long)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-vault-lock-policy)

(clojure.core/declare ser-tag-map)

(clojure.core/declare ser-select-parameters)

(clojure.core/declare ser-s-3-location)

(clojure.core/declare ser-stream)

(clojure.core/declare ser-encryption)

(clojure.core/declare ser-expression-type)

(clojure.core/declare ser-storage-class)

(clojure.core/declare ser-grantee)

(clojure.core/declare ser-file-header-info)

(clojure.core/declare ser-inventory-retrieval-job-input)

(clojure.core/declare ser-output-location)

(clojure.core/declare ser-data-retrieval-rules-list)

(clojure.core/declare ser-job-parameters)

(clojure.core/declare ser-csv-input)

(clojure.core/declare ser-quote-fields)

(clojure.core/declare ser-notification-event-list)

(clojure.core/defn- ser-data-retrieval-rule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DataRetrievalRule", :type "structure"} (clojure.core/contains? input :strategy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :strategy)) #:http.request.field{:name "Strategy", :shape "string"})) (clojure.core/contains? input :bytes-per-hour) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-long (input :bytes-per-hour)) #:http.request.field{:name "BytesPerHour", :shape "NullableLong"}))))

(clojure.core/defn- ser-input-serialization [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputSerialization", :type "structure"} (clojure.core/contains? input :csv) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-csv-input (input :csv)) #:http.request.field{:name "csv", :shape "CSVInput"}))))

(clojure.core/defn- ser-vault-access-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VaultAccessPolicy", :type "structure"} (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :policy)) #:http.request.field{:name "Policy", :shape "string"}))))

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-type [input] #:http.request.field{:value (clojure.core/get {"AmazonCustomerByEmail" "AmazonCustomerByEmail", :amazon-customer-by-email "AmazonCustomerByEmail", "CanonicalUser" "CanonicalUser", :canonical-user "CanonicalUser", "Group" "Group", :group "Group"} input), :shape "Type"})

(clojure.core/defn- ser-permission [input] #:http.request.field{:value (clojure.core/get {"WRITE" "WRITE", "FULL_CONTROL" "FULL_CONTROL", :read "READ", :read-acp "READ_ACP", "READ_ACP" "READ_ACP", :write-acp "WRITE_ACP", :write "WRITE", "WRITE_ACP" "WRITE_ACP", "READ" "READ", :full-control "FULL_CONTROL"} input), :shape "Permission"})

(clojure.core/defn- ser-canned-acl [input] #:http.request.field{:value (clojure.core/get {"authenticated-read" "authenticated-read", :bucketownerfullcontrol "bucket-owner-full-control", "public-read-write" "public-read-write", :private "private", "bucket-owner-full-control" "bucket-owner-full-control", "private" "private", :bucketownerread "bucket-owner-read", :publicread "public-read", "aws-exec-read" "aws-exec-read", :publicreadwrite "public-read-write", :awsexecread "aws-exec-read", "bucket-owner-read" "bucket-owner-read", "public-read" "public-read", :authenticatedread "authenticated-read"} input), :shape "CannedACL"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-vault-notification-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VaultNotificationConfig", :type "structure"} (clojure.core/contains? input :sns-topic) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :sns-topic)) #:http.request.field{:name "SNSTopic", :shape "string"})) (clojure.core/contains? input :events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-event-list (input :events)) #:http.request.field{:name "Events", :shape "NotificationEventList"}))))

(clojure.core/defn- ser-access-control-policy-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-grant coll) #:http.request.field{:shape "Grant"}))) input), :shape "AccessControlPolicyList", :type "list"})

(clojure.core/defn- ser-output-serialization [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputSerialization", :type "structure"} (clojure.core/contains? input :csv) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-csv-output (input :csv)) #:http.request.field{:name "csv", :shape "CSVOutput"}))))

(clojure.core/defn- ser-data-retrieval-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DataRetrievalPolicy", :type "structure"} (clojure.core/contains? input :rules) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-retrieval-rules-list (input :rules)) #:http.request.field{:name "Rules", :shape "DataRetrievalRulesList"}))))

(clojure.core/defn- ser-encryption-type [input] #:http.request.field{:value (clojure.core/get {"aws:kms" "aws:kms", :awskms "aws:kms", "AES256" "AES256", :aes-256 "AES256"} input), :shape "EncryptionType"})

(clojure.core/defn- ser-grant [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Grant", :type "structure"} (clojure.core/contains? input :grantee) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grantee (input :grantee)) #:http.request.field{:name "Grantee", :shape "Grantee"})) (clojure.core/contains? input :permission) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-permission (input :permission)) #:http.request.field{:name "Permission", :shape "Permission"}))))

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-csv-output [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CSVOutput", :type "structure"} (clojure.core/contains? input :quote-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-quote-fields (input :quote-fields)) #:http.request.field{:name "QuoteFields", :shape "QuoteFields"})) (clojure.core/contains? input :quote-escape-character) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :quote-escape-character)) #:http.request.field{:name "QuoteEscapeCharacter", :shape "string"})) (clojure.core/contains? input :record-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :record-delimiter)) #:http.request.field{:name "RecordDelimiter", :shape "string"})) (clojure.core/contains? input :field-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-delimiter)) #:http.request.field{:name "FieldDelimiter", :shape "string"})) (clojure.core/contains? input :quote-character) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :quote-character)) #:http.request.field{:name "QuoteCharacter", :shape "string"}))))

(clojure.core/defn- serhashmap [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (serstring k) #:http.request.field{:map-info "key", :shape "string"}) (clojure.core/into (serstring v) #:http.request.field{:map-info "value", :shape "string"})])) input), :shape "hashmap", :type "map"})

(clojure.core/defn- ser-nullable-long [input] #:http.request.field{:value input, :shape "NullableLong"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-vault-lock-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VaultLockPolicy", :type "structure"} (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :policy)) #:http.request.field{:name "Policy", :shape "string"}))))

(clojure.core/defn- ser-tag-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "TagMap", :type "map"})

(clojure.core/defn- ser-select-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SelectParameters", :type "structure"} (clojure.core/contains? input :input-serialization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-serialization (input :input-serialization)) #:http.request.field{:name "InputSerialization", :shape "InputSerialization"})) (clojure.core/contains? input :expression-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expression-type (input :expression-type)) #:http.request.field{:name "ExpressionType", :shape "ExpressionType"})) (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :expression)) #:http.request.field{:name "Expression", :shape "string"})) (clojure.core/contains? input :output-serialization) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-serialization (input :output-serialization)) #:http.request.field{:name "OutputSerialization", :shape "OutputSerialization"}))))

(clojure.core/defn- ser-s-3-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Location", :type "structure"} (clojure.core/contains? input :bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :bucket-name)) #:http.request.field{:name "BucketName", :shape "string"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :prefix)) #:http.request.field{:name "Prefix", :shape "string"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "Encryption"})) (clojure.core/contains? input :canned-acl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-canned-acl (input :canned-acl)) #:http.request.field{:name "CannedACL", :shape "CannedACL"})) (clojure.core/contains? input :access-control-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-control-policy-list (input :access-control-list)) #:http.request.field{:name "AccessControlList", :shape "AccessControlPolicyList"})) (clojure.core/contains? input :tagging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serhashmap (input :tagging)) #:http.request.field{:name "Tagging", :shape "hashmap"})) (clojure.core/contains? input :user-metadata) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serhashmap (input :user-metadata)) #:http.request.field{:name "UserMetadata", :shape "hashmap"})) (clojure.core/contains? input :storage-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :storage-class)) #:http.request.field{:name "StorageClass", :shape "StorageClass"}))))

(clojure.core/defn- ser-stream [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Stream"})

(clojure.core/defn- ser-encryption [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Encryption", :type "structure"} (clojure.core/contains? input :encryption-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-type (input :encryption-type)) #:http.request.field{:name "EncryptionType", :shape "EncryptionType"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :kms-key-id)) #:http.request.field{:name "KMSKeyId", :shape "string"})) (clojure.core/contains? input :kms-context) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :kms-context)) #:http.request.field{:name "KMSContext", :shape "string"}))))

(clojure.core/defn- ser-expression-type [input] #:http.request.field{:value (clojure.core/get {"SQL" "SQL", :sql "SQL"} input), :shape "ExpressionType"})

(clojure.core/defn- ser-storage-class [input] #:http.request.field{:value (clojure.core/get {"STANDARD" "STANDARD", :standard "STANDARD", "REDUCED_REDUNDANCY" "REDUCED_REDUNDANCY", :reduced-redundancy "REDUCED_REDUNDANCY", "STANDARD_IA" "STANDARD_IA", :standard-ia "STANDARD_IA"} input), :shape "StorageClass"})

(clojure.core/defn- ser-grantee [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-type (:type input)) #:http.request.field{:name "Type", :shape "Type"})], :shape "Grantee", :type "structure"} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :display-name)) #:http.request.field{:name "DisplayName", :shape "string"})) (clojure.core/contains? input :uri) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :uri)) #:http.request.field{:name "URI", :shape "string"})) (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "ID", :shape "string"})) (clojure.core/contains? input :email-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :email-address)) #:http.request.field{:name "EmailAddress", :shape "string"}))))

(clojure.core/defn- ser-file-header-info [input] #:http.request.field{:value (clojure.core/get {"USE" "USE", :use "USE", "IGNORE" "IGNORE", :ignore "IGNORE", "NONE" "NONE", :none "NONE"} input), :shape "FileHeaderInfo"})

(clojure.core/defn- ser-inventory-retrieval-job-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InventoryRetrievalJobInput", :type "structure"} (clojure.core/contains? input :start-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :start-date)) #:http.request.field{:name "StartDate", :shape "string"})) (clojure.core/contains? input :end-date) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :end-date)) #:http.request.field{:name "EndDate", :shape "string"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :limit)) #:http.request.field{:name "Limit", :shape "string"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string"}))))

(clojure.core/defn- ser-output-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputLocation", :type "structure"} (clojure.core/contains? input :s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-location (input :s-3)) #:http.request.field{:name "S3", :shape "S3Location"}))))

(clojure.core/defn- ser-data-retrieval-rules-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-data-retrieval-rule coll) #:http.request.field{:shape "DataRetrievalRule"}))) input), :shape "DataRetrievalRulesList", :type "list"})

(clojure.core/defn- ser-job-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobParameters", :type "structure"} (clojure.core/contains? input :tier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :tier)) #:http.request.field{:name "Tier", :shape "string"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :type)) #:http.request.field{:name "Type", :shape "string"})) (clojure.core/contains? input :archive-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :archive-id)) #:http.request.field{:name "ArchiveId", :shape "string"})) (clojure.core/contains? input :sns-topic) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :sns-topic)) #:http.request.field{:name "SNSTopic", :shape "string"})) (clojure.core/contains? input :format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :format)) #:http.request.field{:name "Format", :shape "string"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :description)) #:http.request.field{:name "Description", :shape "string"})) (clojure.core/contains? input :inventory-retrieval-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-retrieval-job-input (input :inventory-retrieval-parameters)) #:http.request.field{:name "InventoryRetrievalParameters", :shape "InventoryRetrievalJobInput"})) (clojure.core/contains? input :select-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-select-parameters (input :select-parameters)) #:http.request.field{:name "SelectParameters", :shape "SelectParameters"})) (clojure.core/contains? input :output-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-location (input :output-location)) #:http.request.field{:name "OutputLocation", :shape "OutputLocation"})) (clojure.core/contains? input :retrieval-byte-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :retrieval-byte-range)) #:http.request.field{:name "RetrievalByteRange", :shape "string"}))))

(clojure.core/defn- ser-csv-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CSVInput", :type "structure"} (clojure.core/contains? input :file-header-info) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-header-info (input :file-header-info)) #:http.request.field{:name "FileHeaderInfo", :shape "FileHeaderInfo"})) (clojure.core/contains? input :comments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :comments)) #:http.request.field{:name "Comments", :shape "string"})) (clojure.core/contains? input :quote-escape-character) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :quote-escape-character)) #:http.request.field{:name "QuoteEscapeCharacter", :shape "string"})) (clojure.core/contains? input :record-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :record-delimiter)) #:http.request.field{:name "RecordDelimiter", :shape "string"})) (clojure.core/contains? input :field-delimiter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-delimiter)) #:http.request.field{:name "FieldDelimiter", :shape "string"})) (clojure.core/contains? input :quote-character) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :quote-character)) #:http.request.field{:name "QuoteCharacter", :shape "string"}))))

(clojure.core/defn- ser-quote-fields [input] #:http.request.field{:value (clojure.core/get {"ALWAYS" "ALWAYS", :always "ALWAYS", "ASNEEDED" "ASNEEDED", :asneeded "ASNEEDED"} input), :shape "QuoteFields"})

(clojure.core/defn- ser-notification-event-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string"}))) input), :shape "NotificationEventList", :type "list"})

(clojure.core/defn- req-list-multipart-uploads-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "marker", :shape "string", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :limit)) #:http.request.field{:name "limit", :shape "string", :location "querystring", :location-name "limit"}))))

(clojure.core/defn- req-set-vault-access-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]} (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vault-access-policy (input :policy)) #:http.request.field{:name "policy", :shape "VaultAccessPolicy"}))))

(clojure.core/defn- req-get-job-output-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"}) (clojure.core/into (serstring (input :job-id)) #:http.request.field{:name "jobId", :shape "string", :location "uri", :location-name "jobId"})]} (clojure.core/contains? input :range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :range)) #:http.request.field{:name "range", :shape "string", :location "header", :location-name "Range"}))))

(clojure.core/defn- req-create-vault-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]}))

(clojure.core/defn- req-initiate-multipart-upload-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]} (clojure.core/contains? input :archive-description) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :archive-description)) #:http.request.field{:name "archiveDescription", :shape "string", :location "header", :location-name "x-amz-archive-description"})) (clojure.core/contains? input :part-size) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :part-size)) #:http.request.field{:name "partSize", :shape "string", :location "header", :location-name "x-amz-part-size"}))))

(clojure.core/defn- req-complete-vault-lock-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"}) (clojure.core/into (serstring (input :lock-id)) #:http.request.field{:name "lockId", :shape "string", :location "uri", :location-name "lockId"})]}))

(clojure.core/defn- req-complete-multipart-upload-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"}) (clojure.core/into (serstring (input :upload-id)) #:http.request.field{:name "uploadId", :shape "string", :location "uri", :location-name "uploadId"})]} (clojure.core/contains? input :archive-size) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :archive-size)) #:http.request.field{:name "archiveSize", :shape "string", :location "header", :location-name "x-amz-archive-size"})) (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :checksum)) #:http.request.field{:name "checksum", :shape "string", :location "header", :location-name "x-amz-sha256-tree-hash"}))))

(clojure.core/defn- req-list-provisioned-capacity-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"})]}))

(clojure.core/defn- req-delete-archive-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"}) (clojure.core/into (serstring (input :archive-id)) #:http.request.field{:name "archiveId", :shape "string", :location "uri", :location-name "archiveId"})]}))

(clojure.core/defn- req-set-data-retrieval-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"})]} (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-retrieval-policy (input :policy)) #:http.request.field{:name "Policy", :shape "DataRetrievalPolicy"}))))

(clojure.core/defn- req-get-vault-lock-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]}))

(clojure.core/defn- req-upload-multipart-part-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"}) (clojure.core/into (serstring (input :upload-id)) #:http.request.field{:name "uploadId", :shape "string", :location "uri", :location-name "uploadId"})]} (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :checksum)) #:http.request.field{:name "checksum", :shape "string", :location "header", :location-name "x-amz-sha256-tree-hash"})) (clojure.core/contains? input :range) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :range)) #:http.request.field{:name "range", :shape "string", :location "header", :location-name "Content-Range"})) (clojure.core/contains? input :body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream (input :body)) #:http.request.field{:name "body", :shape "Stream"}))))

(clojure.core/defn- req-initiate-vault-lock-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]} (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vault-lock-policy (input :policy)) #:http.request.field{:name "policy", :shape "VaultLockPolicy"}))))

(clojure.core/defn- req-delete-vault-access-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]}))

(clojure.core/defn- req-get-vault-notifications-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]}))

(clojure.core/defn- req-get-data-retrieval-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"})]}))

(clojure.core/defn- req-abort-multipart-upload-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"}) (clojure.core/into (serstring (input :upload-id)) #:http.request.field{:name "uploadId", :shape "string", :location "uri", :location-name "uploadId"})]}))

(clojure.core/defn- req-get-vault-access-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]}))

(clojure.core/defn- req-delete-vault-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]}))

(clojure.core/defn- req-purchase-provisioned-capacity-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"})]}))

(clojure.core/defn- req-add-tags-to-vault-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagMap"}))))

(clojure.core/defn- req-list-jobs-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :limit)) #:http.request.field{:name "limit", :shape "string", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "marker", :shape "string", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :statuscode) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :statuscode)) #:http.request.field{:name "statuscode", :shape "string", :location "querystring", :location-name "statuscode"})) (clojure.core/contains? input :completed) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :completed)) #:http.request.field{:name "completed", :shape "string", :location "querystring", :location-name "completed"}))))

(clojure.core/defn- req-list-vaults-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "marker", :shape "string", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :limit)) #:http.request.field{:name "limit", :shape "string", :location "querystring", :location-name "limit"}))))

(clojure.core/defn- req-initiate-job-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]} (clojure.core/contains? input :job-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-parameters (input :job-parameters)) #:http.request.field{:name "jobParameters", :shape "JobParameters"}))))

(clojure.core/defn- req-describe-vault-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]}))

(clojure.core/defn- req-remove-tags-from-vault-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]} (clojure.core/contains? input :tag-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"}))))

(clojure.core/defn- req-list-tags-for-vault-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]}))

(clojure.core/defn- req-delete-vault-notifications-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]}))

(clojure.core/defn- req-describe-job-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"}) (clojure.core/into (serstring (input :job-id)) #:http.request.field{:name "jobId", :shape "string", :location "uri", :location-name "jobId"})]}))

(clojure.core/defn- req-list-parts-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"}) (clojure.core/into (serstring (input :upload-id)) #:http.request.field{:name "uploadId", :shape "string", :location "uri", :location-name "uploadId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "marker", :shape "string", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :limit)) #:http.request.field{:name "limit", :shape "string", :location "querystring", :location-name "limit"}))))

(clojure.core/defn- req-upload-archive-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"}) (clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"})]} (clojure.core/contains? input :archive-description) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :archive-description)) #:http.request.field{:name "archiveDescription", :shape "string", :location "header", :location-name "x-amz-archive-description"})) (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :checksum)) #:http.request.field{:name "checksum", :shape "string", :location "header", :location-name "x-amz-sha256-tree-hash"})) (clojure.core/contains? input :body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream (input :body)) #:http.request.field{:name "body", :shape "Stream"}))))

(clojure.core/defn- req-abort-vault-lock-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]}))

(clojure.core/defn- req-set-vault-notifications-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :account-id)) #:http.request.field{:name "accountId", :shape "string", :location "uri", :location-name "accountId"}) (clojure.core/into (serstring (input :vault-name)) #:http.request.field{:name "vaultName", :shape "string", :location "uri", :location-name "vaultName"})]} (clojure.core/contains? input :vault-notification-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vault-notification-config (input :vault-notification-config)) #:http.request.field{:name "vaultNotificationConfig", :shape "VaultNotificationConfig"}))))

(clojure.spec.alpha/def :portkey.aws.glacier.list-multipart-uploads-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-multipart-uploads-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-multipart-uploads-input/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-multipart-uploads-input/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-multipart-uploads-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.list-multipart-uploads-input/account-id :portkey.aws.glacier.list-multipart-uploads-input/vault-name] :opt-un [:portkey.aws.glacier.list-multipart-uploads-input/marker :portkey.aws.glacier.list-multipart-uploads-input/limit]))

(clojure.spec.alpha/def :portkey.aws.glacier/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.glacier.provisioned-capacity-description/capacity-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.provisioned-capacity-description/start-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.provisioned-capacity-description/expiration-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/provisioned-capacity-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.provisioned-capacity-description/capacity-id :portkey.aws.glacier.provisioned-capacity-description/start-date :portkey.aws.glacier.provisioned-capacity-description/expiration-date]))

(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-access-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-access-policy-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-access-policy-input/policy (clojure.spec.alpha/and :portkey.aws.glacier/vault-access-policy))
(clojure.spec.alpha/def :portkey.aws.glacier/set-vault-access-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.set-vault-access-policy-input/account-id :portkey.aws.glacier.set-vault-access-policy-input/vault-name] :opt-un [:portkey.aws.glacier.set-vault-access-policy-input/policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-input/job-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-input/range (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-job-output-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.get-job-output-input/account-id :portkey.aws.glacier.get-job-output-input/vault-name :portkey.aws.glacier.get-job-output-input/job-id] :opt-un [:portkey.aws.glacier.get-job-output-input/range]))

(clojure.spec.alpha/def :portkey.aws.glacier.data-retrieval-rule/strategy (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.data-retrieval-rule/bytes-per-hour (clojure.spec.alpha/and :portkey.aws.glacier/nullable-long))
(clojure.spec.alpha/def :portkey.aws.glacier/data-retrieval-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.data-retrieval-rule/strategy :portkey.aws.glacier.data-retrieval-rule/bytes-per-hour]))

(clojure.spec.alpha/def :portkey.aws.glacier/uploads-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/upload-list-element))

(clojure.spec.alpha/def :portkey.aws.glacier.input-serialization/csv (clojure.spec.alpha/and :portkey.aws.glacier/csv-input))
(clojure.spec.alpha/def :portkey.aws.glacier/input-serialization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.input-serialization/csv]))

(clojure.spec.alpha/def :portkey.aws.glacier.create-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.create-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/create-vault-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.create-vault-input/account-id :portkey.aws.glacier.create-vault-input/vault-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/body (clojure.spec.alpha/and :portkey.aws.glacier/stream))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/status (clojure.spec.alpha/and :portkey.aws.glacier/httpstatus))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/content-range (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/accept-ranges (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/content-type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/archive-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-job-output-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.get-job-output-output/body :portkey.aws.glacier.get-job-output-output/checksum :portkey.aws.glacier.get-job-output-output/status :portkey.aws.glacier.get-job-output-output/content-range :portkey.aws.glacier.get-job-output-output/accept-ranges :portkey.aws.glacier.get-job-output-output/content-type :portkey.aws.glacier.get-job-output-output/archive-description]))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-input/archive-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-input/part-size (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-multipart-upload-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.initiate-multipart-upload-input/account-id :portkey.aws.glacier.initiate-multipart-upload-input/vault-name] :opt-un [:portkey.aws.glacier.initiate-multipart-upload-input/archive-description :portkey.aws.glacier.initiate-multipart-upload-input/part-size]))

(clojure.spec.alpha/def :portkey.aws.glacier.complete-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-vault-lock-input/lock-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/complete-vault-lock-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.complete-vault-lock-input/account-id :portkey.aws.glacier.complete-vault-lock-input/vault-name :portkey.aws.glacier.complete-vault-lock-input/lock-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.part-list-element/range-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.part-list-element/sha-256-tree-hash (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/part-list-element (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.part-list-element/range-in-bytes :portkey.aws.glacier.part-list-element/sha-256-tree-hash]))

(clojure.spec.alpha/def :portkey.aws.glacier.vault-access-policy/policy (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/vault-access-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.vault-access-policy/policy]))

(clojure.spec.alpha/def :portkey.aws.glacier/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glacier/job-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/glacier-job-description))

(clojure.spec.alpha/def :portkey.aws.glacier.complete-multipart-upload-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-multipart-upload-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-multipart-upload-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-multipart-upload-input/archive-size (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-multipart-upload-input/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/complete-multipart-upload-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.complete-multipart-upload-input/account-id :portkey.aws.glacier.complete-multipart-upload-input/vault-name :portkey.aws.glacier.complete-multipart-upload-input/upload-id] :opt-un [:portkey.aws.glacier.complete-multipart-upload-input/archive-size :portkey.aws.glacier.complete-multipart-upload-input/checksum]))

(clojure.spec.alpha/def :portkey.aws.glacier/type #{:group :canonical-user "CanonicalUser" "AmazonCustomerByEmail" "Group" :amazon-customer-by-email})

(clojure.spec.alpha/def :portkey.aws.glacier/status-code #{"Failed" :in-progress "Succeeded" "InProgress" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.glacier/permission #{"WRITE" "FULL_CONTROL" :read :read-acp "READ_ACP" :write-acp :write "WRITE_ACP" "READ" :full-control})

(clojure.spec.alpha/def :portkey.aws.glacier.list-multipart-uploads-output/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-multipart-uploads-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier/uploads-list :portkey.aws.glacier.list-multipart-uploads-output/marker]))

(clojure.spec.alpha/def :portkey.aws.glacier/canned-acl #{"authenticated-read" :bucketownerfullcontrol "public-read-write" :private "bucket-owner-full-control" "private" :bucketownerread :publicread "aws-exec-read" :publicreadwrite :awsexecread "bucket-owner-read" "public-read" :authenticatedread})

(clojure.spec.alpha/def :portkey.aws.glacier.create-vault-output/location (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/create-vault-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.create-vault-output/location]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-provisioned-capacity-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-provisioned-capacity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.list-provisioned-capacity-input/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glacier.purchase-provisioned-capacity-output/capacity-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/purchase-provisioned-capacity-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.purchase-provisioned-capacity-output/capacity-id]))

(clojure.spec.alpha/def :portkey.aws.glacier/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glacier.get-data-retrieval-policy-output/policy (clojure.spec.alpha/and :portkey.aws.glacier/data-retrieval-policy))
(clojure.spec.alpha/def :portkey.aws.glacier/get-data-retrieval-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.get-data-retrieval-policy-output/policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-description/format (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-description/start-date (clojure.spec.alpha/and :portkey.aws.glacier/date-time))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-description/end-date (clojure.spec.alpha/and :portkey.aws.glacier/date-time))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-description/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-description/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/inventory-retrieval-job-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.inventory-retrieval-job-description/format :portkey.aws.glacier.inventory-retrieval-job-description/start-date :portkey.aws.glacier.inventory-retrieval-job-description/end-date :portkey.aws.glacier.inventory-retrieval-job-description/limit :portkey.aws.glacier.inventory-retrieval-job-description/marker]))

(clojure.spec.alpha/def :portkey.aws.glacier.limit-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.limit-exceeded-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.limit-exceeded-exception/type :portkey.aws.glacier.limit-exceeded-exception/code :portkey.aws.glacier.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.delete-archive-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.delete-archive-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.delete-archive-input/archive-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/delete-archive-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.delete-archive-input/account-id :portkey.aws.glacier.delete-archive-input/vault-name :portkey.aws.glacier.delete-archive-input/archive-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.set-data-retrieval-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.set-data-retrieval-policy-input/policy (clojure.spec.alpha/and :portkey.aws.glacier/data-retrieval-policy))
(clojure.spec.alpha/def :portkey.aws.glacier/set-data-retrieval-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.set-data-retrieval-policy-input/account-id] :opt-un [:portkey.aws.glacier.set-data-retrieval-policy-input/policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-lock-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.get-vault-lock-input/account-id :portkey.aws.glacier.get-vault-lock-input/vault-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.vault-notification-config/sns-topic (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.vault-notification-config/events (clojure.spec.alpha/and :portkey.aws.glacier/notification-event-list))
(clojure.spec.alpha/def :portkey.aws.glacier/vault-notification-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.vault-notification-config/sns-topic :portkey.aws.glacier.vault-notification-config/events]))

(clojure.spec.alpha/def :portkey.aws.glacier/provisioned-capacity-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/provisioned-capacity-description))

(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/multipart-upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/vault-arn (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/archive-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/part-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/long))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/creation-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/parts (clojure.spec.alpha/and :portkey.aws.glacier/part-list))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-parts-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.list-parts-output/multipart-upload-id :portkey.aws.glacier.list-parts-output/vault-arn :portkey.aws.glacier.list-parts-output/archive-description :portkey.aws.glacier.list-parts-output/part-size-in-bytes :portkey.aws.glacier.list-parts-output/creation-date :portkey.aws.glacier.list-parts-output/parts :portkey.aws.glacier.list-parts-output/marker]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-output/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-jobs-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier/job-list :portkey.aws.glacier.list-jobs-output/marker]))

(clojure.spec.alpha/def :portkey.aws.glacier/access-control-policy-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/grant))

(clojure.spec.alpha/def :portkey.aws.glacier/vault-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/describe-vault-output))

(clojure.spec.alpha/def :portkey.aws.glacier.service-unavailable-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.service-unavailable-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.service-unavailable-exception/type :portkey.aws.glacier.service-unavailable-exception/code :portkey.aws.glacier.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/range (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/body (clojure.spec.alpha/and :portkey.aws.glacier/stream))
(clojure.spec.alpha/def :portkey.aws.glacier/upload-multipart-part-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.upload-multipart-part-input/account-id :portkey.aws.glacier.upload-multipart-part-input/vault-name :portkey.aws.glacier.upload-multipart-part-input/upload-id] :opt-un [:portkey.aws.glacier.upload-multipart-part-input/checksum :portkey.aws.glacier.upload-multipart-part-input/range :portkey.aws.glacier.upload-multipart-part-input/body]))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-vault-lock-input/policy (clojure.spec.alpha/and :portkey.aws.glacier/vault-lock-policy))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-vault-lock-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.initiate-vault-lock-input/account-id :portkey.aws.glacier.initiate-vault-lock-input/vault-name] :opt-un [:portkey.aws.glacier.initiate-vault-lock-input/policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.output-serialization/csv (clojure.spec.alpha/and :portkey.aws.glacier/csv-output))
(clojure.spec.alpha/def :portkey.aws.glacier/output-serialization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.output-serialization/csv]))

(clojure.spec.alpha/def :portkey.aws.glacier.data-retrieval-policy/rules (clojure.spec.alpha/and :portkey.aws.glacier/data-retrieval-rules-list))
(clojure.spec.alpha/def :portkey.aws.glacier/data-retrieval-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.data-retrieval-policy/rules]))

(clojure.spec.alpha/def :portkey.aws.glacier/encryption-type #{:awskms :aes-256 "aws:kms" "AES256"})

(clojure.spec.alpha/def :portkey.aws.glacier/action-code #{"InventoryRetrieval" :inventory-retrieval :archive-retrieval "ArchiveRetrieval" "Select" :select})

(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-access-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-access-policy-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/delete-vault-access-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.delete-vault-access-policy-input/account-id :portkey.aws.glacier.delete-vault-access-policy-input/vault-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.list-tags-for-vault-output/tags (clojure.spec.alpha/and :portkey.aws.glacier/tag-map))
(clojure.spec.alpha/def :portkey.aws.glacier/list-tags-for-vault-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.list-tags-for-vault-output/tags]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-notifications-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-notifications-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-notifications-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.get-vault-notifications-input/account-id :portkey.aws.glacier.get-vault-notifications-input/vault-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.get-data-retrieval-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-data-retrieval-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.get-data-retrieval-policy-input/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.abort-multipart-upload-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.abort-multipart-upload-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.abort-multipart-upload-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/abort-multipart-upload-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.abort-multipart-upload-input/account-id :portkey.aws.glacier.abort-multipart-upload-input/vault-name :portkey.aws.glacier.abort-multipart-upload-input/upload-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier/grant (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier/grantee :portkey.aws.glacier/permission]))

(clojure.spec.alpha/def :portkey.aws.glacier/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/string))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-access-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-access-policy-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-access-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.get-vault-access-policy-input/account-id :portkey.aws.glacier.get-vault-access-policy-input/vault-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/delete-vault-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.delete-vault-input/account-id :portkey.aws.glacier.delete-vault-input/vault-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.csv-output/quote-escape-character (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.csv-output/record-delimiter (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.csv-output/field-delimiter (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.csv-output/quote-character (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/csv-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier/quote-fields :portkey.aws.glacier.csv-output/quote-escape-character :portkey.aws.glacier.csv-output/record-delimiter :portkey.aws.glacier.csv-output/field-delimiter :portkey.aws.glacier.csv-output/quote-character]))

(clojure.spec.alpha/def :portkey.aws.glacier.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.resource-not-found-exception/type :portkey.aws.glacier.resource-not-found-exception/code :portkey.aws.glacier.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier/hashmap (clojure.spec.alpha/map-of :portkey.aws.glacier/string :portkey.aws.glacier/string))

(clojure.spec.alpha/def :portkey.aws.glacier.policy-enforced-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.policy-enforced-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.policy-enforced-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/policy-enforced-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.policy-enforced-exception/type :portkey.aws.glacier.policy-enforced-exception/code :portkey.aws.glacier.policy-enforced-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glacier.purchase-provisioned-capacity-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/purchase-provisioned-capacity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.purchase-provisioned-capacity-input/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/vault-arn (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/creation-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/last-inventory-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/number-of-archives (clojure.spec.alpha/and :portkey.aws.glacier/long))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/long))
(clojure.spec.alpha/def :portkey.aws.glacier/describe-vault-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.describe-vault-output/vault-arn :portkey.aws.glacier.describe-vault-output/vault-name :portkey.aws.glacier.describe-vault-output/creation-date :portkey.aws.glacier.describe-vault-output/last-inventory-date :portkey.aws.glacier.describe-vault-output/number-of-archives :portkey.aws.glacier.describe-vault-output/size-in-bytes]))

(clojure.spec.alpha/def :portkey.aws.glacier/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glacier.vault-lock-policy/policy (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/vault-lock-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.vault-lock-policy/policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-output/policy (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-output/state (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-output/expiration-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-output/creation-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-lock-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.get-vault-lock-output/policy :portkey.aws.glacier.get-vault-lock-output/state :portkey.aws.glacier.get-vault-lock-output/expiration-date :portkey.aws.glacier.get-vault-lock-output/creation-date]))

(clojure.spec.alpha/def :portkey.aws.glacier.add-tags-to-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.add-tags-to-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.add-tags-to-vault-input/tags (clojure.spec.alpha/and :portkey.aws.glacier/tag-map))
(clojure.spec.alpha/def :portkey.aws.glacier/add-tags-to-vault-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.add-tags-to-vault-input/account-id :portkey.aws.glacier.add-tags-to-vault-input/vault-name] :opt-un [:portkey.aws.glacier.add-tags-to-vault-input/tags]))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-output/location (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-output/job-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-output/job-output-path (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.initiate-job-output/location :portkey.aws.glacier.initiate-job-output/job-id :portkey.aws.glacier.initiate-job-output/job-output-path]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-notifications-output/vault-notification-config (clojure.spec.alpha/and :portkey.aws.glacier/vault-notification-config))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-notifications-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.get-vault-notifications-output/vault-notification-config]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/statuscode (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/completed (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-jobs-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.list-jobs-input/account-id :portkey.aws.glacier.list-jobs-input/vault-name] :opt-un [:portkey.aws.glacier.list-jobs-input/limit :portkey.aws.glacier.list-jobs-input/marker :portkey.aws.glacier.list-jobs-input/statuscode :portkey.aws.glacier.list-jobs-input/completed]))

(clojure.spec.alpha/def :portkey.aws.glacier/part-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/part-list-element))

(clojure.spec.alpha/def :portkey.aws.glacier/tag-map (clojure.spec.alpha/map-of :portkey.aws.glacier/tag-key :portkey.aws.glacier/tag-value))

(clojure.spec.alpha/def :portkey.aws.glacier/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glacier.request-timeout-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.request-timeout-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.request-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/request-timeout-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.request-timeout-exception/type :portkey.aws.glacier.request-timeout-exception/code :portkey.aws.glacier.request-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.upload-list-element/multipart-upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-list-element/vault-arn (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-list-element/archive-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-list-element/part-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/long))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-list-element/creation-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/upload-list-element (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.upload-list-element/multipart-upload-id :portkey.aws.glacier.upload-list-element/vault-arn :portkey.aws.glacier.upload-list-element/archive-description :portkey.aws.glacier.upload-list-element/part-size-in-bytes :portkey.aws.glacier.upload-list-element/creation-date]))

(clojure.spec.alpha/def :portkey.aws.glacier.select-parameters/expression (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/select-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier/input-serialization :portkey.aws.glacier/expression-type :portkey.aws.glacier.select-parameters/expression :portkey.aws.glacier/output-serialization]))

(clojure.spec.alpha/def :portkey.aws.glacier.s-3-location/bucket-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.s-3-location/prefix (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.s-3-location/access-control-list (clojure.spec.alpha/and :portkey.aws.glacier/access-control-policy-list))
(clojure.spec.alpha/def :portkey.aws.glacier.s-3-location/tagging (clojure.spec.alpha/and :portkey.aws.glacier/hashmap))
(clojure.spec.alpha/def :portkey.aws.glacier.s-3-location/user-metadata (clojure.spec.alpha/and :portkey.aws.glacier/hashmap))
(clojure.spec.alpha/def :portkey.aws.glacier/s-3-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.s-3-location/bucket-name :portkey.aws.glacier.s-3-location/prefix :portkey.aws.glacier/encryption :portkey.aws.glacier/canned-acl :portkey.aws.glacier.s-3-location/access-control-list :portkey.aws.glacier.s-3-location/tagging :portkey.aws.glacier.s-3-location/user-metadata :portkey.aws.glacier/storage-class]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-vaults-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-vaults-input/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-vaults-input/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-vaults-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.list-vaults-input/account-id] :opt-un [:portkey.aws.glacier.list-vaults-input/marker :portkey.aws.glacier.list-vaults-input/limit]))

(clojure.spec.alpha/def :portkey.aws.glacier/stream clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-input/job-parameters (clojure.spec.alpha/and :portkey.aws.glacier/job-parameters))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-job-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.initiate-job-input/account-id :portkey.aws.glacier.initiate-job-input/vault-name] :opt-un [:portkey.aws.glacier.initiate-job-input/job-parameters]))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-vault-lock-output/lock-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-vault-lock-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.initiate-vault-lock-output/lock-id]))

(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/describe-vault-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.describe-vault-input/account-id :portkey.aws.glacier.describe-vault-input/vault-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.remove-tags-from-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.remove-tags-from-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.remove-tags-from-vault-input/tag-keys (clojure.spec.alpha/and :portkey.aws.glacier/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.glacier/remove-tags-from-vault-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.remove-tags-from-vault-input/account-id :portkey.aws.glacier.remove-tags-from-vault-input/vault-name] :opt-un [:portkey.aws.glacier.remove-tags-from-vault-input/tag-keys]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-tags-for-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-tags-for-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-tags-for-vault-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.list-tags-for-vault-input/account-id :portkey.aws.glacier.list-tags-for-vault-input/vault-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.insufficient-capacity-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.insufficient-capacity-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.insufficient-capacity-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/insufficient-capacity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.insufficient-capacity-exception/type :portkey.aws.glacier.insufficient-capacity-exception/code :portkey.aws.glacier.insufficient-capacity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-notifications-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-notifications-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/delete-vault-notifications-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.delete-vault-notifications-input/account-id :portkey.aws.glacier.delete-vault-notifications-input/vault-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.describe-job-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-job-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-job-input/job-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/describe-job-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.describe-job-input/account-id :portkey.aws.glacier.describe-job-input/vault-name :portkey.aws.glacier.describe-job-input/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.encryption/kms-key-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.encryption/kms-context (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier/encryption-type :portkey.aws.glacier.encryption/kms-key-id :portkey.aws.glacier.encryption/kms-context]))

(clojure.spec.alpha/def :portkey.aws.glacier/expression-type #{:sql "SQL"})

(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/tier (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/job-output-path (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/completion-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/archive-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/status-message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/archive-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/size))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/sns-topic (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/vault-arn (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/inventory-retrieval-parameters (clojure.spec.alpha/and :portkey.aws.glacier/inventory-retrieval-job-description))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/archive-sha-256-tree-hash (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/sha-256-tree-hash (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/creation-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/inventory-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/size))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/completed (clojure.spec.alpha/and :portkey.aws.glacier/boolean))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/action (clojure.spec.alpha/and :portkey.aws.glacier/action-code))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/job-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/retrieval-byte-range (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/job-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/glacier-job-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.glacier-job-description/tier :portkey.aws.glacier.glacier-job-description/job-output-path :portkey.aws.glacier.glacier-job-description/completion-date :portkey.aws.glacier/status-code :portkey.aws.glacier.glacier-job-description/archive-id :portkey.aws.glacier.glacier-job-description/status-message :portkey.aws.glacier.glacier-job-description/archive-size-in-bytes :portkey.aws.glacier.glacier-job-description/sns-topic :portkey.aws.glacier.glacier-job-description/vault-arn :portkey.aws.glacier.glacier-job-description/inventory-retrieval-parameters :portkey.aws.glacier.glacier-job-description/archive-sha-256-tree-hash :portkey.aws.glacier/select-parameters :portkey.aws.glacier.glacier-job-description/sha-256-tree-hash :portkey.aws.glacier.glacier-job-description/creation-date :portkey.aws.glacier.glacier-job-description/inventory-size-in-bytes :portkey.aws.glacier.glacier-job-description/completed :portkey.aws.glacier/output-location :portkey.aws.glacier.glacier-job-description/action :portkey.aws.glacier.glacier-job-description/job-description :portkey.aws.glacier.glacier-job-description/retrieval-byte-range :portkey.aws.glacier.glacier-job-description/job-id]))

(clojure.spec.alpha/def :portkey.aws.glacier.missing-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.missing-parameter-value-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.missing-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/missing-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.missing-parameter-value-exception/type :portkey.aws.glacier.missing-parameter-value-exception/code :portkey.aws.glacier.missing-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-output/location (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-output/upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-multipart-upload-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.initiate-multipart-upload-output/location :portkey.aws.glacier.initiate-multipart-upload-output/upload-id]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-input/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-input/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-parts-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.list-parts-input/account-id :portkey.aws.glacier.list-parts-input/vault-name :portkey.aws.glacier.list-parts-input/upload-id] :opt-un [:portkey.aws.glacier.list-parts-input/marker :portkey.aws.glacier.list-parts-input/limit]))

(clojure.spec.alpha/def :portkey.aws.glacier/storage-class #{:standard-ia :reduced-redundancy "STANDARD_IA" "STANDARD" :standard "REDUCED_REDUNDANCY"})

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-access-policy-output/policy (clojure.spec.alpha/and :portkey.aws.glacier/vault-access-policy))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-access-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.get-vault-access-policy-output/policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.archive-creation-output/location (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.archive-creation-output/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.archive-creation-output/archive-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/archive-creation-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.archive-creation-output/location :portkey.aws.glacier.archive-creation-output/checksum :portkey.aws.glacier.archive-creation-output/archive-id]))

(clojure.spec.alpha/def :portkey.aws.glacier/list-provisioned-capacity-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier/provisioned-capacity-list]))

(clojure.spec.alpha/def :portkey.aws.glacier.grantee/display-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.grantee/uri (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.grantee/id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.grantee/email-address (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/grantee (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier/type] :opt-un [:portkey.aws.glacier.grantee/display-name :portkey.aws.glacier.grantee/uri :portkey.aws.glacier.grantee/id :portkey.aws.glacier.grantee/email-address]))

(clojure.spec.alpha/def :portkey.aws.glacier/file-header-info #{"USE" :use :ignore "NONE" "IGNORE" :none})

(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-input/start-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-input/end-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-input/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-input/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/inventory-retrieval-job-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.inventory-retrieval-job-input/start-date :portkey.aws.glacier.inventory-retrieval-job-input/end-date :portkey.aws.glacier.inventory-retrieval-job-input/limit :portkey.aws.glacier.inventory-retrieval-job-input/marker]))

(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-output/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/upload-multipart-part-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.upload-multipart-part-output/checksum]))

(clojure.spec.alpha/def :portkey.aws.glacier.output-location/s-3 (clojure.spec.alpha/and :portkey.aws.glacier/s-3-location))
(clojure.spec.alpha/def :portkey.aws.glacier/output-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.output-location/s-3]))

(clojure.spec.alpha/def :portkey.aws.glacier.upload-archive-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-archive-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-archive-input/archive-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-archive-input/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-archive-input/body (clojure.spec.alpha/and :portkey.aws.glacier/stream))
(clojure.spec.alpha/def :portkey.aws.glacier/upload-archive-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.upload-archive-input/vault-name :portkey.aws.glacier.upload-archive-input/account-id] :opt-un [:portkey.aws.glacier.upload-archive-input/archive-description :portkey.aws.glacier.upload-archive-input/checksum :portkey.aws.glacier.upload-archive-input/body]))

(clojure.spec.alpha/def :portkey.aws.glacier/data-retrieval-rules-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/data-retrieval-rule))

(clojure.spec.alpha/def :portkey.aws.glacier.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.invalid-parameter-value-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.invalid-parameter-value-exception/type :portkey.aws.glacier.invalid-parameter-value-exception/code :portkey.aws.glacier.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.abort-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.abort-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/abort-vault-lock-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.abort-vault-lock-input/account-id :portkey.aws.glacier.abort-vault-lock-input/vault-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.list-vaults-output/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-vaults-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier/vault-list :portkey.aws.glacier.list-vaults-output/marker]))

(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/tier (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/archive-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/sns-topic (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/format (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/inventory-retrieval-parameters (clojure.spec.alpha/and :portkey.aws.glacier/inventory-retrieval-job-input))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/retrieval-byte-range (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/job-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier.job-parameters/tier :portkey.aws.glacier.job-parameters/type :portkey.aws.glacier.job-parameters/archive-id :portkey.aws.glacier.job-parameters/sns-topic :portkey.aws.glacier.job-parameters/format :portkey.aws.glacier.job-parameters/description :portkey.aws.glacier.job-parameters/inventory-retrieval-parameters :portkey.aws.glacier/select-parameters :portkey.aws.glacier/output-location :portkey.aws.glacier.job-parameters/retrieval-byte-range]))

(clojure.spec.alpha/def :portkey.aws.glacier.csv-input/comments (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.csv-input/quote-escape-character (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.csv-input/record-delimiter (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.csv-input/field-delimiter (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.csv-input/quote-character (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/csv-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.glacier/file-header-info :portkey.aws.glacier.csv-input/comments :portkey.aws.glacier.csv-input/quote-escape-character :portkey.aws.glacier.csv-input/record-delimiter :portkey.aws.glacier.csv-input/field-delimiter :portkey.aws.glacier.csv-input/quote-character]))

(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-notifications-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-notifications-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-notifications-input/vault-notification-config (clojure.spec.alpha/and :portkey.aws.glacier/vault-notification-config))
(clojure.spec.alpha/def :portkey.aws.glacier/set-vault-notifications-input (clojure.spec.alpha/keys :req-un [:portkey.aws.glacier.set-vault-notifications-input/account-id :portkey.aws.glacier.set-vault-notifications-input/vault-name] :opt-un [:portkey.aws.glacier.set-vault-notifications-input/vault-notification-config]))

(clojure.spec.alpha/def :portkey.aws.glacier/quote-fields #{:asneeded "ALWAYS" "ASNEEDED" :always})

(clojure.spec.alpha/def :portkey.aws.glacier/notification-event-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/string))

(clojure.spec.alpha/def :portkey.aws.glacier/httpstatus clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glacier/date-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn initiate-multipart-upload ([initiate-multipart-upload-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-initiate-multipart-upload-input initiate-multipart-upload-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/initiate-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/initiate-multipart-upload-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "InitiateMultipartUpload", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef initiate-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier/initiate-multipart-upload-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/initiate-multipart-upload-output))

(clojure.core/defn describe-vault ([describe-vault-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-vault-input describe-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/describe-vault-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/describe-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeVault", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/describe-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/describe-vault-output))

(clojure.core/defn initiate-job ([initiate-job-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-initiate-job-input initiate-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/initiate-job-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/jobs", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/initiate-job-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/action "InitiateJob", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "PolicyEnforcedException" :portkey.aws.glacier/policy-enforced-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "InsufficientCapacityException" :portkey.aws.glacier/insufficient-capacity-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef initiate-job :args (clojure.spec.alpha/tuple :portkey.aws.glacier/initiate-job-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/initiate-job-output))

(clojure.core/defn delete-vault-notifications ([delete-vault-notifications-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-vault-notifications-input delete-vault-notifications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/notification-configuration", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/delete-vault-notifications-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteVaultNotifications", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-vault-notifications-input) :ret clojure.core/true?)

(clojure.core/defn get-vault-notifications ([get-vault-notifications-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-vault-notifications-input get-vault-notifications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/get-vault-notifications-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/notification-configuration", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/get-vault-notifications-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetVaultNotifications", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-vault-notifications-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-vault-notifications-output))

(clojure.core/defn set-vault-notifications ([set-vault-notifications-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-set-vault-notifications-input set-vault-notifications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/notification-configuration", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/set-vault-notifications-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/action "SetVaultNotifications", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier/set-vault-notifications-input) :ret clojure.core/true?)

(clojure.core/defn list-tags-for-vault ([list-tags-for-vault-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-tags-for-vault-input list-tags-for-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/list-tags-for-vault-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/tags", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-tags-for-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForVault", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-tags-for-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-tags-for-vault-output))

(clojure.core/defn list-multipart-uploads ([list-multipart-uploads-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-multipart-uploads-input list-multipart-uploads-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/list-multipart-uploads-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-multipart-uploads-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListMultipartUploads", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-multipart-uploads :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-multipart-uploads-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-multipart-uploads-output))

(clojure.core/defn delete-vault-access-policy ([delete-vault-access-policy-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-vault-access-policy-input delete-vault-access-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/access-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/delete-vault-access-policy-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteVaultAccessPolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-vault-access-policy-input) :ret clojure.core/true?)

(clojure.core/defn get-data-retrieval-policy ([get-data-retrieval-policy-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-data-retrieval-policy-input get-data-retrieval-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/get-data-retrieval-policy-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/policies/data-retrieval", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/get-data-retrieval-policy-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDataRetrievalPolicy", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-data-retrieval-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-data-retrieval-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-data-retrieval-policy-output))

(clojure.core/defn purchase-provisioned-capacity ([purchase-provisioned-capacity-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-purchase-provisioned-capacity-input purchase-provisioned-capacity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/purchase-provisioned-capacity-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/provisioned-capacity", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/purchase-provisioned-capacity-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "PurchaseProvisionedCapacity", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "LimitExceededException" :portkey.aws.glacier/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef purchase-provisioned-capacity :args (clojure.spec.alpha/tuple :portkey.aws.glacier/purchase-provisioned-capacity-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/purchase-provisioned-capacity-output))

(clojure.core/defn delete-archive ([delete-archive-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-archive-input delete-archive-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/archives/{archiveId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/delete-archive-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteArchive", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-archive :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-archive-input) :ret clojure.core/true?)

(clojure.core/defn describe-job ([describe-job-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-job-input describe-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/glacier-job-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/jobs/{jobId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/describe-job-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeJob", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-job :args (clojure.spec.alpha/tuple :portkey.aws.glacier/describe-job-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/glacier-job-description))

(clojure.core/defn complete-multipart-upload ([complete-multipart-upload-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-complete-multipart-upload-input complete-multipart-upload-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/archive-creation-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/complete-multipart-upload-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CompleteMultipartUpload", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef complete-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier/complete-multipart-upload-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/archive-creation-output))

(clojure.core/defn abort-multipart-upload ([abort-multipart-upload-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-abort-multipart-upload-input abort-multipart-upload-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/abort-multipart-upload-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "AbortMultipartUpload", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef abort-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier/abort-multipart-upload-input) :ret clojure.core/true?)

(clojure.core/defn add-tags-to-vault ([add-tags-to-vault-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-add-tags-to-vault-input add-tags-to-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/tags?operation=add", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/add-tags-to-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "AddTagsToVault", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "LimitExceededException" :portkey.aws.glacier/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/add-tags-to-vault-input) :ret clojure.core/true?)

(clojure.core/defn initiate-vault-lock ([initiate-vault-lock-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-initiate-vault-lock-input initiate-vault-lock-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/initiate-vault-lock-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/lock-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/initiate-vault-lock-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "InitiateVaultLock", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef initiate-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/initiate-vault-lock-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/initiate-vault-lock-output))

(clojure.core/defn delete-vault ([delete-vault-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-vault-input delete-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/delete-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteVault", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-vault-input) :ret clojure.core/true?)

(clojure.core/defn list-provisioned-capacity ([list-provisioned-capacity-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-provisioned-capacity-input list-provisioned-capacity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/list-provisioned-capacity-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/provisioned-capacity", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-provisioned-capacity-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProvisionedCapacity", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-provisioned-capacity :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-provisioned-capacity-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-provisioned-capacity-output))

(clojure.core/defn get-vault-lock ([get-vault-lock-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-vault-lock-input get-vault-lock-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/get-vault-lock-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/lock-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/get-vault-lock-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetVaultLock", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-vault-lock-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-vault-lock-output))

(clojure.core/defn list-vaults ([list-vaults-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-vaults-input list-vaults-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/list-vaults-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-vaults-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListVaults", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-vaults :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-vaults-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-vaults-output))

(clojure.core/defn set-data-retrieval-policy ([set-data-retrieval-policy-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-set-data-retrieval-policy-input set-data-retrieval-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/policies/data-retrieval", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/set-data-retrieval-policy-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/action "SetDataRetrievalPolicy", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-data-retrieval-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/set-data-retrieval-policy-input) :ret clojure.core/true?)

(clojure.core/defn get-job-output ([get-job-output-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-job-output-input get-job-output-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/get-job-output-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/jobs/{jobId}/output", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/get-job-output-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetJobOutput", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-job-output :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-job-output-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-job-output-output))

(clojure.core/defn remove-tags-from-vault ([remove-tags-from-vault-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-remove-tags-from-vault-input remove-tags-from-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/tags?operation=remove", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/remove-tags-from-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "RemoveTagsFromVault", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/remove-tags-from-vault-input) :ret clojure.core/true?)

(clojure.core/defn abort-vault-lock ([abort-vault-lock-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-abort-vault-lock-input abort-vault-lock-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/lock-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/abort-vault-lock-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "AbortVaultLock", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef abort-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/abort-vault-lock-input) :ret clojure.core/true?)

(clojure.core/defn list-parts ([list-parts-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-parts-input list-parts-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/list-parts-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-parts-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListParts", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-parts :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-parts-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-parts-output))

(clojure.core/defn set-vault-access-policy ([set-vault-access-policy-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-set-vault-access-policy-input set-vault-access-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/access-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/set-vault-access-policy-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/action "SetVaultAccessPolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/set-vault-access-policy-input) :ret clojure.core/true?)

(clojure.core/defn create-vault ([create-vault-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-vault-input create-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/create-vault-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/create-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateVault", :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception, "LimitExceededException" :portkey.aws.glacier/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/create-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/create-vault-output))

(clojure.core/defn complete-vault-lock ([complete-vault-lock-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-complete-vault-lock-input complete-vault-lock-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/lock-policy/{lockId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/complete-vault-lock-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "CompleteVaultLock", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef complete-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/complete-vault-lock-input) :ret clojure.core/true?)

(clojure.core/defn upload-multipart-part ([upload-multipart-part-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-upload-multipart-part-input upload-multipart-part-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/upload-multipart-part-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/upload-multipart-part-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/action "UploadMultipartPart", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "RequestTimeoutException" :portkey.aws.glacier/request-timeout-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef upload-multipart-part :args (clojure.spec.alpha/tuple :portkey.aws.glacier/upload-multipart-part-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/upload-multipart-part-output))

(clojure.core/defn upload-archive ([upload-archive-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-upload-archive-input upload-archive-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/archive-creation-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/archives", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/upload-archive-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "UploadArchive", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "RequestTimeoutException" :portkey.aws.glacier/request-timeout-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef upload-archive :args (clojure.spec.alpha/tuple :portkey.aws.glacier/upload-archive-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/archive-creation-output))

(clojure.core/defn get-vault-access-policy ([get-vault-access-policy-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-vault-access-policy-input get-vault-access-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/get-vault-access-policy-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/access-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/get-vault-access-policy-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetVaultAccessPolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-vault-access-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-vault-access-policy-output))

(clojure.core/defn list-jobs ([list-jobs-inputinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-jobs-input list-jobs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.spec/output-spec :portkey.aws.glacier/list-jobs-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/jobs", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-jobs-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListJobs", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-jobs-output))
