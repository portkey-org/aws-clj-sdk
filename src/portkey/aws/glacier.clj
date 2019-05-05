(ns portkey.aws.glacier (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "glacier", :region "us-gov-east-1"},
    :ssl-common-name "glacier.us-gov-east-1.amazonaws.com",
    :endpoint "https://glacier.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "glacier", :region "eu-north-1"},
    :ssl-common-name "glacier.eu-north-1.amazonaws.com",
    :endpoint "https://glacier.eu-north-1.amazonaws.com",
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

(clojure.core/declare deserboolean)

(clojure.core/declare deser-provisioned-capacity-description)

(clojure.core/declare deser-data-retrieval-rule)

(clojure.core/declare deser-uploads-list)

(clojure.core/declare deser-input-serialization)

(clojure.core/declare deser-part-list-element)

(clojure.core/declare deser-vault-access-policy)

(clojure.core/declare deserstring)

(clojure.core/declare deser-job-list)

(clojure.core/declare deser-type)

(clojure.core/declare deser-status-code)

(clojure.core/declare deser-permission)

(clojure.core/declare deser-canned-acl)

(clojure.core/declare deserlong)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-inventory-retrieval-job-description)

(clojure.core/declare deser-vault-notification-config)

(clojure.core/declare deser-provisioned-capacity-list)

(clojure.core/declare deser-access-control-policy-list)

(clojure.core/declare deser-vault-list)

(clojure.core/declare deser-output-serialization)

(clojure.core/declare deser-data-retrieval-policy)

(clojure.core/declare deser-encryption-type)

(clojure.core/declare deser-action-code)

(clojure.core/declare deser-grant)

(clojure.core/declare deser-csv-output)

(clojure.core/declare deserhashmap)

(clojure.core/declare deser-nullable-long)

(clojure.core/declare deser-describe-vault-output)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-part-list)

(clojure.core/declare deser-tag-map)

(clojure.core/declare deser-size)

(clojure.core/declare deser-upload-list-element)

(clojure.core/declare deser-select-parameters)

(clojure.core/declare deser-s-3-location)

(clojure.core/declare deser-stream)

(clojure.core/declare deser-encryption)

(clojure.core/declare deser-expression-type)

(clojure.core/declare deser-glacier-job-description)

(clojure.core/declare deser-storage-class)

(clojure.core/declare deser-grantee)

(clojure.core/declare deser-file-header-info)

(clojure.core/declare deser-output-location)

(clojure.core/declare deser-data-retrieval-rules-list)

(clojure.core/declare deser-csv-input)

(clojure.core/declare deser-quote-fields)

(clojure.core/declare deser-notification-event-list)

(clojure.core/declare deserhttpstatus)

(clojure.core/declare deser-date-time)

(clojure.core/defn- deserboolean [input] input)

(clojure.core/defn- deser-provisioned-capacity-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "CapacityId") (clojure.core/assoc :capacity-id (deserstring (input "CapacityId"))) (clojure.core/contains? input "StartDate") (clojure.core/assoc :start-date (deserstring (input "StartDate"))) (clojure.core/contains? input "ExpirationDate") (clojure.core/assoc :expiration-date (deserstring (input "ExpirationDate")))))

(clojure.core/defn- deser-data-retrieval-rule [input] (clojure.core/cond-> {} (clojure.core/contains? input "Strategy") (clojure.core/assoc :strategy (deserstring (input "Strategy"))) (clojure.core/contains? input "BytesPerHour") (clojure.core/assoc :bytes-per-hour (deser-nullable-long (input "BytesPerHour")))))

(clojure.core/defn- deser-uploads-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-upload-list-element coll))) input))

(clojure.core/defn- deser-input-serialization [input] (clojure.core/cond-> {} (clojure.core/contains? input "csv") (clojure.core/assoc :csv (deser-csv-input (input "csv")))))

(clojure.core/defn- deser-part-list-element [input] (clojure.core/cond-> {} (clojure.core/contains? input "RangeInBytes") (clojure.core/assoc :range-in-bytes (deserstring (input "RangeInBytes"))) (clojure.core/contains? input "SHA256TreeHash") (clojure.core/assoc :sha-256-tree-hash (deserstring (input "SHA256TreeHash")))))

(clojure.core/defn- deser-vault-access-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "Policy") (clojure.core/assoc :policy (deserstring (input "Policy")))))

(clojure.core/defn- deserstring [input] input)

(clojure.core/defn- deser-job-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-glacier-job-description coll))) input))

(clojure.core/defn- deser-type [input] (clojure.core/get {"AmazonCustomerByEmail" :amazon-customer-by-email, "CanonicalUser" :canonical-user, "Group" :group} input))

(clojure.core/defn- deser-status-code [input] (clojure.core/get {"InProgress" :in-progress, "Succeeded" :succeeded, "Failed" :failed} input))

(clojure.core/defn- deser-permission [input] (clojure.core/get {"FULL_CONTROL" :full-control, "WRITE" :write, "WRITE_ACP" :write-acp, "READ" :read, "READ_ACP" :read-acp} input))

(clojure.core/defn- deser-canned-acl [input] (clojure.core/get {"private" :private, "public-read" :publicread, "public-read-write" :publicreadwrite, "aws-exec-read" :awsexecread, "authenticated-read" :authenticatedread, "bucket-owner-read" :bucketownerread, "bucket-owner-full-control" :bucketownerfullcontrol} input))

(clojure.core/defn- deserlong [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-inventory-retrieval-job-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "Format") (clojure.core/assoc :format (deserstring (input "Format"))) (clojure.core/contains? input "StartDate") (clojure.core/assoc :start-date (deser-date-time (input "StartDate"))) (clojure.core/contains? input "EndDate") (clojure.core/assoc :end-date (deser-date-time (input "EndDate"))) (clojure.core/contains? input "Limit") (clojure.core/assoc :limit (deserstring (input "Limit"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deserstring (input "Marker")))))

(clojure.core/defn- deser-vault-notification-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "SNSTopic") (clojure.core/assoc :sns-topic (deserstring (input "SNSTopic"))) (clojure.core/contains? input "Events") (clojure.core/assoc :events (deser-notification-event-list (input "Events")))))

(clojure.core/defn- deser-provisioned-capacity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provisioned-capacity-description coll))) input))

(clojure.core/defn- deser-access-control-policy-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-grant coll))) input))

(clojure.core/defn- deser-vault-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-describe-vault-output coll))) input))

(clojure.core/defn- deser-output-serialization [input] (clojure.core/cond-> {} (clojure.core/contains? input "csv") (clojure.core/assoc :csv (deser-csv-output (input "csv")))))

(clojure.core/defn- deser-data-retrieval-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "Rules") (clojure.core/assoc :rules (deser-data-retrieval-rules-list (input "Rules")))))

(clojure.core/defn- deser-encryption-type [input] (clojure.core/get {"aws:kms" :awskms, "AES256" :aes-256} input))

(clojure.core/defn- deser-action-code [input] (clojure.core/get {"ArchiveRetrieval" :archive-retrieval, "InventoryRetrieval" :inventory-retrieval, "Select" :select} input))

(clojure.core/defn- deser-grant [input] (clojure.core/cond-> {} (clojure.core/contains? input "Grantee") (clojure.core/assoc :grantee (deser-grantee (input "Grantee"))) (clojure.core/contains? input "Permission") (clojure.core/assoc :permission (deser-permission (input "Permission")))))

(clojure.core/defn- deser-csv-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "QuoteFields") (clojure.core/assoc :quote-fields (deser-quote-fields (input "QuoteFields"))) (clojure.core/contains? input "QuoteEscapeCharacter") (clojure.core/assoc :quote-escape-character (deserstring (input "QuoteEscapeCharacter"))) (clojure.core/contains? input "RecordDelimiter") (clojure.core/assoc :record-delimiter (deserstring (input "RecordDelimiter"))) (clojure.core/contains? input "FieldDelimiter") (clojure.core/assoc :field-delimiter (deserstring (input "FieldDelimiter"))) (clojure.core/contains? input "QuoteCharacter") (clojure.core/assoc :quote-character (deserstring (input "QuoteCharacter")))))

(clojure.core/defn- deserhashmap [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deserstring k) (deserstring v)])) input))

(clojure.core/defn- deser-nullable-long [input] input)

(clojure.core/defn- deser-describe-vault-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "VaultARN") (clojure.core/assoc :vault-arn (deserstring (input "VaultARN"))) (clojure.core/contains? input "VaultName") (clojure.core/assoc :vault-name (deserstring (input "VaultName"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deserstring (input "CreationDate"))) (clojure.core/contains? input "LastInventoryDate") (clojure.core/assoc :last-inventory-date (deserstring (input "LastInventoryDate"))) (clojure.core/contains? input "NumberOfArchives") (clojure.core/assoc :number-of-archives (deserlong (input "NumberOfArchives"))) (clojure.core/contains? input "SizeInBytes") (clojure.core/assoc :size-in-bytes (deserlong (input "SizeInBytes")))))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-part-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-part-list-element coll))) input))

(clojure.core/defn- deser-tag-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-size [input] input)

(clojure.core/defn- deser-upload-list-element [input] (clojure.core/cond-> {} (clojure.core/contains? input "MultipartUploadId") (clojure.core/assoc :multipart-upload-id (deserstring (input "MultipartUploadId"))) (clojure.core/contains? input "VaultARN") (clojure.core/assoc :vault-arn (deserstring (input "VaultARN"))) (clojure.core/contains? input "ArchiveDescription") (clojure.core/assoc :archive-description (deserstring (input "ArchiveDescription"))) (clojure.core/contains? input "PartSizeInBytes") (clojure.core/assoc :part-size-in-bytes (deserlong (input "PartSizeInBytes"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deserstring (input "CreationDate")))))

(clojure.core/defn- deser-select-parameters [input] (clojure.core/cond-> {} (clojure.core/contains? input "InputSerialization") (clojure.core/assoc :input-serialization (deser-input-serialization (input "InputSerialization"))) (clojure.core/contains? input "ExpressionType") (clojure.core/assoc :expression-type (deser-expression-type (input "ExpressionType"))) (clojure.core/contains? input "Expression") (clojure.core/assoc :expression (deserstring (input "Expression"))) (clojure.core/contains? input "OutputSerialization") (clojure.core/assoc :output-serialization (deser-output-serialization (input "OutputSerialization")))))

(clojure.core/defn- deser-s-3-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "BucketName") (clojure.core/assoc :bucket-name (deserstring (input "BucketName"))) (clojure.core/contains? input "Prefix") (clojure.core/assoc :prefix (deserstring (input "Prefix"))) (clojure.core/contains? input "Encryption") (clojure.core/assoc :encryption (deser-encryption (input "Encryption"))) (clojure.core/contains? input "CannedACL") (clojure.core/assoc :canned-acl (deser-canned-acl (input "CannedACL"))) (clojure.core/contains? input "AccessControlList") (clojure.core/assoc :access-control-list (deser-access-control-policy-list (input "AccessControlList"))) (clojure.core/contains? input "Tagging") (clojure.core/assoc :tagging (deserhashmap (input "Tagging"))) (clojure.core/contains? input "UserMetadata") (clojure.core/assoc :user-metadata (deserhashmap (input "UserMetadata"))) (clojure.core/contains? input "StorageClass") (clojure.core/assoc :storage-class (deser-storage-class (input "StorageClass")))))

(clojure.core/defn- deser-stream [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-encryption [input] (clojure.core/cond-> {} (clojure.core/contains? input "EncryptionType") (clojure.core/assoc :encryption-type (deser-encryption-type (input "EncryptionType"))) (clojure.core/contains? input "KMSKeyId") (clojure.core/assoc :kms-key-id (deserstring (input "KMSKeyId"))) (clojure.core/contains? input "KMSContext") (clojure.core/assoc :kms-context (deserstring (input "KMSContext")))))

(clojure.core/defn- deser-expression-type [input] (clojure.core/get {"SQL" :sql} input))

(clojure.core/defn- deser-glacier-job-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "Tier") (clojure.core/assoc :tier (deserstring (input "Tier"))) (clojure.core/contains? input "JobOutputPath") (clojure.core/assoc :job-output-path (deserstring (input "JobOutputPath"))) (clojure.core/contains? input "CompletionDate") (clojure.core/assoc :completion-date (deserstring (input "CompletionDate"))) (clojure.core/contains? input "StatusCode") (clojure.core/assoc :status-code (deser-status-code (input "StatusCode"))) (clojure.core/contains? input "ArchiveId") (clojure.core/assoc :archive-id (deserstring (input "ArchiveId"))) (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deserstring (input "StatusMessage"))) (clojure.core/contains? input "ArchiveSizeInBytes") (clojure.core/assoc :archive-size-in-bytes (deser-size (input "ArchiveSizeInBytes"))) (clojure.core/contains? input "SNSTopic") (clojure.core/assoc :sns-topic (deserstring (input "SNSTopic"))) (clojure.core/contains? input "VaultARN") (clojure.core/assoc :vault-arn (deserstring (input "VaultARN"))) (clojure.core/contains? input "InventoryRetrievalParameters") (clojure.core/assoc :inventory-retrieval-parameters (deser-inventory-retrieval-job-description (input "InventoryRetrievalParameters"))) (clojure.core/contains? input "ArchiveSHA256TreeHash") (clojure.core/assoc :archive-sha-256-tree-hash (deserstring (input "ArchiveSHA256TreeHash"))) (clojure.core/contains? input "SelectParameters") (clojure.core/assoc :select-parameters (deser-select-parameters (input "SelectParameters"))) (clojure.core/contains? input "SHA256TreeHash") (clojure.core/assoc :sha-256-tree-hash (deserstring (input "SHA256TreeHash"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deserstring (input "CreationDate"))) (clojure.core/contains? input "InventorySizeInBytes") (clojure.core/assoc :inventory-size-in-bytes (deser-size (input "InventorySizeInBytes"))) (clojure.core/contains? input "Completed") (clojure.core/assoc :completed (deserboolean (input "Completed"))) (clojure.core/contains? input "OutputLocation") (clojure.core/assoc :output-location (deser-output-location (input "OutputLocation"))) (clojure.core/contains? input "Action") (clojure.core/assoc :action (deser-action-code (input "Action"))) (clojure.core/contains? input "JobDescription") (clojure.core/assoc :job-description (deserstring (input "JobDescription"))) (clojure.core/contains? input "RetrievalByteRange") (clojure.core/assoc :retrieval-byte-range (deserstring (input "RetrievalByteRange"))) (clojure.core/contains? input "JobId") (clojure.core/assoc :job-id (deserstring (input "JobId")))))

(clojure.core/defn- deser-storage-class [input] (clojure.core/get {"STANDARD" :standard, "REDUCED_REDUNDANCY" :reduced-redundancy, "STANDARD_IA" :standard-ia} input))

(clojure.core/defn- deser-grantee [input] (clojure.core/cond-> {:type (deser-type (input "Type"))} (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deserstring (input "DisplayName"))) (clojure.core/contains? input "URI") (clojure.core/assoc :uri (deserstring (input "URI"))) (clojure.core/contains? input "ID") (clojure.core/assoc :id (deserstring (input "ID"))) (clojure.core/contains? input "EmailAddress") (clojure.core/assoc :email-address (deserstring (input "EmailAddress")))))

(clojure.core/defn- deser-file-header-info [input] (clojure.core/get {"USE" :use, "IGNORE" :ignore, "NONE" :none} input))

(clojure.core/defn- deser-output-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "S3") (clojure.core/assoc :s-3 (deser-s-3-location (input "S3")))))

(clojure.core/defn- deser-data-retrieval-rules-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-data-retrieval-rule coll))) input))

(clojure.core/defn- deser-csv-input [input] (clojure.core/cond-> {} (clojure.core/contains? input "FileHeaderInfo") (clojure.core/assoc :file-header-info (deser-file-header-info (input "FileHeaderInfo"))) (clojure.core/contains? input "Comments") (clojure.core/assoc :comments (deserstring (input "Comments"))) (clojure.core/contains? input "QuoteEscapeCharacter") (clojure.core/assoc :quote-escape-character (deserstring (input "QuoteEscapeCharacter"))) (clojure.core/contains? input "RecordDelimiter") (clojure.core/assoc :record-delimiter (deserstring (input "RecordDelimiter"))) (clojure.core/contains? input "FieldDelimiter") (clojure.core/assoc :field-delimiter (deserstring (input "FieldDelimiter"))) (clojure.core/contains? input "QuoteCharacter") (clojure.core/assoc :quote-character (deserstring (input "QuoteCharacter")))))

(clojure.core/defn- deser-quote-fields [input] (clojure.core/get {"ALWAYS" :always, "ASNEEDED" :asneeded} input))

(clojure.core/defn- deser-notification-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deserhttpstatus [input] input)

(clojure.core/defn- deser-date-time [input] input)

(clojure.core/defn- response-get-job-output-output ([input] (response-get-job-output-output nil input)) ([resultWrapper1157603 input] (clojure.core/let [rawinput1157602 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157604 {"body" (rawinput1157602 "body"), "x-amz-sha256-tree-hash" (clojure.core/get-in input [:headers "x-amz-sha256-tree-hash"]), "status" (clojure.core/get-in input [:status "status"]), "Content-Range" (clojure.core/get-in input [:headers "Content-Range"]), "Accept-Ranges" (clojure.core/get-in input [:headers "Accept-Ranges"]), "Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "x-amz-archive-description" (clojure.core/get-in input [:headers "x-amz-archive-description"])}] (clojure.core/cond-> {} (letvar1157604 "body") (clojure.core/assoc :body (deser-stream (clojure.core/get-in letvar1157604 ["body"]))) (letvar1157604 "x-amz-sha256-tree-hash") (clojure.core/assoc :checksum (deserstring (clojure.core/get-in letvar1157604 ["x-amz-sha256-tree-hash"]))) (letvar1157604 "status") (clojure.core/assoc :status (deserhttpstatus (clojure.core/get-in letvar1157604 ["status"]))) (letvar1157604 "Content-Range") (clojure.core/assoc :content-range (deserstring (clojure.core/get-in letvar1157604 ["Content-Range"]))) (letvar1157604 "Accept-Ranges") (clojure.core/assoc :accept-ranges (deserstring (clojure.core/get-in letvar1157604 ["Accept-Ranges"]))) (letvar1157604 "Content-Type") (clojure.core/assoc :content-type (deserstring (clojure.core/get-in letvar1157604 ["Content-Type"]))) (letvar1157604 "x-amz-archive-description") (clojure.core/assoc :archive-description (deserstring (clojure.core/get-in letvar1157604 ["x-amz-archive-description"])))))))

(clojure.core/defn- response-list-multipart-uploads-output ([input] (response-list-multipart-uploads-output nil input)) ([resultWrapper1157606 input] (clojure.core/let [rawinput1157605 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157607 {"UploadsList" (rawinput1157605 "UploadsList"), "Marker" (rawinput1157605 "Marker")}] (clojure.core/cond-> {} (letvar1157607 "UploadsList") (clojure.core/assoc :uploads-list (deser-uploads-list (clojure.core/get-in letvar1157607 ["UploadsList"]))) (letvar1157607 "Marker") (clojure.core/assoc :marker (deserstring (clojure.core/get-in letvar1157607 ["Marker"])))))))

(clojure.core/defn- response-create-vault-output ([input] (response-create-vault-output nil input)) ([resultWrapper1157609 input] (clojure.core/let [rawinput1157608 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157610 {"Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {} (letvar1157610 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1157610 ["Location"])))))))

(clojure.core/defn- response-purchase-provisioned-capacity-output ([input] (response-purchase-provisioned-capacity-output nil input)) ([resultWrapper1157612 input] (clojure.core/let [rawinput1157611 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157613 {"x-amz-capacity-id" (clojure.core/get-in input [:headers "x-amz-capacity-id"])}] (clojure.core/cond-> {} (letvar1157613 "x-amz-capacity-id") (clojure.core/assoc :capacity-id (deserstring (clojure.core/get-in letvar1157613 ["x-amz-capacity-id"])))))))

(clojure.core/defn- response-get-data-retrieval-policy-output ([input] (response-get-data-retrieval-policy-output nil input)) ([resultWrapper1157615 input] (clojure.core/let [rawinput1157614 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157616 {"Policy" (rawinput1157614 "Policy")}] (clojure.core/cond-> {} (letvar1157616 "Policy") (clojure.core/assoc :policy (deser-data-retrieval-policy (clojure.core/get-in letvar1157616 ["Policy"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1157618 input] (clojure.core/let [rawinput1157617 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157619 {"type" (rawinput1157617 "type"), "code" (rawinput1157617 "code"), "message" (rawinput1157617 "message")}] (clojure.core/cond-> {} (letvar1157619 "type") (clojure.core/assoc :type (deserstring (clojure.core/get-in letvar1157619 ["type"]))) (letvar1157619 "code") (clojure.core/assoc :code (deserstring (clojure.core/get-in letvar1157619 ["code"]))) (letvar1157619 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1157619 ["message"])))))))

(clojure.core/defn- response-list-parts-output ([input] (response-list-parts-output nil input)) ([resultWrapper1157621 input] (clojure.core/let [rawinput1157620 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157622 {"MultipartUploadId" (rawinput1157620 "MultipartUploadId"), "VaultARN" (rawinput1157620 "VaultARN"), "ArchiveDescription" (rawinput1157620 "ArchiveDescription"), "PartSizeInBytes" (rawinput1157620 "PartSizeInBytes"), "CreationDate" (rawinput1157620 "CreationDate"), "Parts" (rawinput1157620 "Parts"), "Marker" (rawinput1157620 "Marker")}] (clojure.core/cond-> {} (letvar1157622 "MultipartUploadId") (clojure.core/assoc :multipart-upload-id (deserstring (clojure.core/get-in letvar1157622 ["MultipartUploadId"]))) (letvar1157622 "VaultARN") (clojure.core/assoc :vault-arn (deserstring (clojure.core/get-in letvar1157622 ["VaultARN"]))) (letvar1157622 "ArchiveDescription") (clojure.core/assoc :archive-description (deserstring (clojure.core/get-in letvar1157622 ["ArchiveDescription"]))) (letvar1157622 "PartSizeInBytes") (clojure.core/assoc :part-size-in-bytes (deserlong (clojure.core/get-in letvar1157622 ["PartSizeInBytes"]))) (letvar1157622 "CreationDate") (clojure.core/assoc :creation-date (deserstring (clojure.core/get-in letvar1157622 ["CreationDate"]))) (letvar1157622 "Parts") (clojure.core/assoc :parts (deser-part-list (clojure.core/get-in letvar1157622 ["Parts"]))) (letvar1157622 "Marker") (clojure.core/assoc :marker (deserstring (clojure.core/get-in letvar1157622 ["Marker"])))))))

(clojure.core/defn- response-list-jobs-output ([input] (response-list-jobs-output nil input)) ([resultWrapper1157624 input] (clojure.core/let [rawinput1157623 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157625 {"JobList" (rawinput1157623 "JobList"), "Marker" (rawinput1157623 "Marker")}] (clojure.core/cond-> {} (letvar1157625 "JobList") (clojure.core/assoc :job-list (deser-job-list (clojure.core/get-in letvar1157625 ["JobList"]))) (letvar1157625 "Marker") (clojure.core/assoc :marker (deserstring (clojure.core/get-in letvar1157625 ["Marker"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1157627 input] (clojure.core/let [rawinput1157626 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157628 {"type" (rawinput1157626 "type"), "code" (rawinput1157626 "code"), "message" (rawinput1157626 "message")}] (clojure.core/cond-> {} (letvar1157628 "type") (clojure.core/assoc :type (deserstring (clojure.core/get-in letvar1157628 ["type"]))) (letvar1157628 "code") (clojure.core/assoc :code (deserstring (clojure.core/get-in letvar1157628 ["code"]))) (letvar1157628 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1157628 ["message"])))))))

(clojure.core/defn- response-list-tags-for-vault-output ([input] (response-list-tags-for-vault-output nil input)) ([resultWrapper1157630 input] (clojure.core/let [rawinput1157629 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157631 {"Tags" (rawinput1157629 "Tags")}] (clojure.core/cond-> {} (letvar1157631 "Tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar1157631 ["Tags"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1157633 input] (clojure.core/let [rawinput1157632 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157634 {"type" (rawinput1157632 "type"), "code" (rawinput1157632 "code"), "message" (rawinput1157632 "message")}] (clojure.core/cond-> {} (letvar1157634 "type") (clojure.core/assoc :type (deserstring (clojure.core/get-in letvar1157634 ["type"]))) (letvar1157634 "code") (clojure.core/assoc :code (deserstring (clojure.core/get-in letvar1157634 ["code"]))) (letvar1157634 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1157634 ["message"])))))))

(clojure.core/defn- response-policy-enforced-exception ([input] (response-policy-enforced-exception nil input)) ([resultWrapper1157636 input] (clojure.core/let [rawinput1157635 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157637 {"type" (rawinput1157635 "type"), "code" (rawinput1157635 "code"), "message" (rawinput1157635 "message")}] (clojure.core/cond-> {} (letvar1157637 "type") (clojure.core/assoc :type (deserstring (clojure.core/get-in letvar1157637 ["type"]))) (letvar1157637 "code") (clojure.core/assoc :code (deserstring (clojure.core/get-in letvar1157637 ["code"]))) (letvar1157637 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1157637 ["message"])))))))

(clojure.core/defn- response-describe-vault-output ([input] (response-describe-vault-output nil input)) ([resultWrapper1157639 input] (clojure.core/let [rawinput1157638 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157640 {"VaultARN" (rawinput1157638 "VaultARN"), "VaultName" (rawinput1157638 "VaultName"), "CreationDate" (rawinput1157638 "CreationDate"), "LastInventoryDate" (rawinput1157638 "LastInventoryDate"), "NumberOfArchives" (rawinput1157638 "NumberOfArchives"), "SizeInBytes" (rawinput1157638 "SizeInBytes")}] (clojure.core/cond-> {} (letvar1157640 "VaultARN") (clojure.core/assoc :vault-arn (deserstring (clojure.core/get-in letvar1157640 ["VaultARN"]))) (letvar1157640 "VaultName") (clojure.core/assoc :vault-name (deserstring (clojure.core/get-in letvar1157640 ["VaultName"]))) (letvar1157640 "CreationDate") (clojure.core/assoc :creation-date (deserstring (clojure.core/get-in letvar1157640 ["CreationDate"]))) (letvar1157640 "LastInventoryDate") (clojure.core/assoc :last-inventory-date (deserstring (clojure.core/get-in letvar1157640 ["LastInventoryDate"]))) (letvar1157640 "NumberOfArchives") (clojure.core/assoc :number-of-archives (deserlong (clojure.core/get-in letvar1157640 ["NumberOfArchives"]))) (letvar1157640 "SizeInBytes") (clojure.core/assoc :size-in-bytes (deserlong (clojure.core/get-in letvar1157640 ["SizeInBytes"])))))))

(clojure.core/defn- response-get-vault-lock-output ([input] (response-get-vault-lock-output nil input)) ([resultWrapper1157642 input] (clojure.core/let [rawinput1157641 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157643 {"Policy" (rawinput1157641 "Policy"), "State" (rawinput1157641 "State"), "ExpirationDate" (rawinput1157641 "ExpirationDate"), "CreationDate" (rawinput1157641 "CreationDate")}] (clojure.core/cond-> {} (letvar1157643 "Policy") (clojure.core/assoc :policy (deserstring (clojure.core/get-in letvar1157643 ["Policy"]))) (letvar1157643 "State") (clojure.core/assoc :state (deserstring (clojure.core/get-in letvar1157643 ["State"]))) (letvar1157643 "ExpirationDate") (clojure.core/assoc :expiration-date (deserstring (clojure.core/get-in letvar1157643 ["ExpirationDate"]))) (letvar1157643 "CreationDate") (clojure.core/assoc :creation-date (deserstring (clojure.core/get-in letvar1157643 ["CreationDate"])))))))

(clojure.core/defn- response-initiate-job-output ([input] (response-initiate-job-output nil input)) ([resultWrapper1157645 input] (clojure.core/let [rawinput1157644 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157646 {"Location" (clojure.core/get-in input [:headers "Location"]), "x-amz-job-id" (clojure.core/get-in input [:headers "x-amz-job-id"]), "x-amz-job-output-path" (clojure.core/get-in input [:headers "x-amz-job-output-path"])}] (clojure.core/cond-> {} (letvar1157646 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1157646 ["Location"]))) (letvar1157646 "x-amz-job-id") (clojure.core/assoc :job-id (deserstring (clojure.core/get-in letvar1157646 ["x-amz-job-id"]))) (letvar1157646 "x-amz-job-output-path") (clojure.core/assoc :job-output-path (deserstring (clojure.core/get-in letvar1157646 ["x-amz-job-output-path"])))))))

(clojure.core/defn- response-get-vault-notifications-output ([input] (response-get-vault-notifications-output nil input)) ([resultWrapper1157648 input] (clojure.core/let [rawinput1157647 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157649 {"vaultNotificationConfig" (rawinput1157647 "vaultNotificationConfig")}] (clojure.core/cond-> {} (letvar1157649 "vaultNotificationConfig") (clojure.core/assoc :vault-notification-config (deser-vault-notification-config (clojure.core/get-in letvar1157649 ["vaultNotificationConfig"])))))))

(clojure.core/defn- response-request-timeout-exception ([input] (response-request-timeout-exception nil input)) ([resultWrapper1157651 input] (clojure.core/let [rawinput1157650 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157652 {"type" (rawinput1157650 "type"), "code" (rawinput1157650 "code"), "message" (rawinput1157650 "message")}] (clojure.core/cond-> {} (letvar1157652 "type") (clojure.core/assoc :type (deserstring (clojure.core/get-in letvar1157652 ["type"]))) (letvar1157652 "code") (clojure.core/assoc :code (deserstring (clojure.core/get-in letvar1157652 ["code"]))) (letvar1157652 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1157652 ["message"])))))))

(clojure.core/defn- response-initiate-vault-lock-output ([input] (response-initiate-vault-lock-output nil input)) ([resultWrapper1157654 input] (clojure.core/let [rawinput1157653 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157655 {"x-amz-lock-id" (clojure.core/get-in input [:headers "x-amz-lock-id"])}] (clojure.core/cond-> {} (letvar1157655 "x-amz-lock-id") (clojure.core/assoc :lock-id (deserstring (clojure.core/get-in letvar1157655 ["x-amz-lock-id"])))))))

(clojure.core/defn- response-insufficient-capacity-exception ([input] (response-insufficient-capacity-exception nil input)) ([resultWrapper1157657 input] (clojure.core/let [rawinput1157656 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157658 {"type" (rawinput1157656 "type"), "code" (rawinput1157656 "code"), "message" (rawinput1157656 "message")}] (clojure.core/cond-> {} (letvar1157658 "type") (clojure.core/assoc :type (deserstring (clojure.core/get-in letvar1157658 ["type"]))) (letvar1157658 "code") (clojure.core/assoc :code (deserstring (clojure.core/get-in letvar1157658 ["code"]))) (letvar1157658 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1157658 ["message"])))))))

(clojure.core/defn- response-glacier-job-description ([input] (response-glacier-job-description nil input)) ([resultWrapper1157660 input] (clojure.core/let [rawinput1157659 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157661 {"Tier" (rawinput1157659 "Tier"), "JobOutputPath" (rawinput1157659 "JobOutputPath"), "CompletionDate" (rawinput1157659 "CompletionDate"), "StatusCode" (rawinput1157659 "StatusCode"), "ArchiveId" (rawinput1157659 "ArchiveId"), "StatusMessage" (rawinput1157659 "StatusMessage"), "ArchiveSizeInBytes" (rawinput1157659 "ArchiveSizeInBytes"), "SNSTopic" (rawinput1157659 "SNSTopic"), "VaultARN" (rawinput1157659 "VaultARN"), "InventoryRetrievalParameters" (rawinput1157659 "InventoryRetrievalParameters"), "ArchiveSHA256TreeHash" (rawinput1157659 "ArchiveSHA256TreeHash"), "SelectParameters" (rawinput1157659 "SelectParameters"), "SHA256TreeHash" (rawinput1157659 "SHA256TreeHash"), "CreationDate" (rawinput1157659 "CreationDate"), "InventorySizeInBytes" (rawinput1157659 "InventorySizeInBytes"), "Completed" (rawinput1157659 "Completed"), "OutputLocation" (rawinput1157659 "OutputLocation"), "Action" (rawinput1157659 "Action"), "JobDescription" (rawinput1157659 "JobDescription"), "RetrievalByteRange" (rawinput1157659 "RetrievalByteRange"), "JobId" (rawinput1157659 "JobId")}] (clojure.core/cond-> {} (letvar1157661 "Tier") (clojure.core/assoc :tier (deserstring (clojure.core/get-in letvar1157661 ["Tier"]))) (letvar1157661 "JobOutputPath") (clojure.core/assoc :job-output-path (deserstring (clojure.core/get-in letvar1157661 ["JobOutputPath"]))) (letvar1157661 "CompletionDate") (clojure.core/assoc :completion-date (deserstring (clojure.core/get-in letvar1157661 ["CompletionDate"]))) (letvar1157661 "StatusCode") (clojure.core/assoc :status-code (deser-status-code (clojure.core/get-in letvar1157661 ["StatusCode"]))) (letvar1157661 "ArchiveId") (clojure.core/assoc :archive-id (deserstring (clojure.core/get-in letvar1157661 ["ArchiveId"]))) (letvar1157661 "StatusMessage") (clojure.core/assoc :status-message (deserstring (clojure.core/get-in letvar1157661 ["StatusMessage"]))) (letvar1157661 "ArchiveSizeInBytes") (clojure.core/assoc :archive-size-in-bytes (deser-size (clojure.core/get-in letvar1157661 ["ArchiveSizeInBytes"]))) (letvar1157661 "SNSTopic") (clojure.core/assoc :sns-topic (deserstring (clojure.core/get-in letvar1157661 ["SNSTopic"]))) (letvar1157661 "VaultARN") (clojure.core/assoc :vault-arn (deserstring (clojure.core/get-in letvar1157661 ["VaultARN"]))) (letvar1157661 "InventoryRetrievalParameters") (clojure.core/assoc :inventory-retrieval-parameters (deser-inventory-retrieval-job-description (clojure.core/get-in letvar1157661 ["InventoryRetrievalParameters"]))) (letvar1157661 "ArchiveSHA256TreeHash") (clojure.core/assoc :archive-sha-256-tree-hash (deserstring (clojure.core/get-in letvar1157661 ["ArchiveSHA256TreeHash"]))) (letvar1157661 "SelectParameters") (clojure.core/assoc :select-parameters (deser-select-parameters (clojure.core/get-in letvar1157661 ["SelectParameters"]))) (letvar1157661 "SHA256TreeHash") (clojure.core/assoc :sha-256-tree-hash (deserstring (clojure.core/get-in letvar1157661 ["SHA256TreeHash"]))) (letvar1157661 "CreationDate") (clojure.core/assoc :creation-date (deserstring (clojure.core/get-in letvar1157661 ["CreationDate"]))) (letvar1157661 "InventorySizeInBytes") (clojure.core/assoc :inventory-size-in-bytes (deser-size (clojure.core/get-in letvar1157661 ["InventorySizeInBytes"]))) (letvar1157661 "Completed") (clojure.core/assoc :completed (deserboolean (clojure.core/get-in letvar1157661 ["Completed"]))) (letvar1157661 "OutputLocation") (clojure.core/assoc :output-location (deser-output-location (clojure.core/get-in letvar1157661 ["OutputLocation"]))) (letvar1157661 "Action") (clojure.core/assoc :action (deser-action-code (clojure.core/get-in letvar1157661 ["Action"]))) (letvar1157661 "JobDescription") (clojure.core/assoc :job-description (deserstring (clojure.core/get-in letvar1157661 ["JobDescription"]))) (letvar1157661 "RetrievalByteRange") (clojure.core/assoc :retrieval-byte-range (deserstring (clojure.core/get-in letvar1157661 ["RetrievalByteRange"]))) (letvar1157661 "JobId") (clojure.core/assoc :job-id (deserstring (clojure.core/get-in letvar1157661 ["JobId"])))))))

(clojure.core/defn- response-missing-parameter-value-exception ([input] (response-missing-parameter-value-exception nil input)) ([resultWrapper1157663 input] (clojure.core/let [rawinput1157662 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157664 {"type" (rawinput1157662 "type"), "code" (rawinput1157662 "code"), "message" (rawinput1157662 "message")}] (clojure.core/cond-> {} (letvar1157664 "type") (clojure.core/assoc :type (deserstring (clojure.core/get-in letvar1157664 ["type"]))) (letvar1157664 "code") (clojure.core/assoc :code (deserstring (clojure.core/get-in letvar1157664 ["code"]))) (letvar1157664 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1157664 ["message"])))))))

(clojure.core/defn- response-initiate-multipart-upload-output ([input] (response-initiate-multipart-upload-output nil input)) ([resultWrapper1157666 input] (clojure.core/let [rawinput1157665 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157667 {"Location" (clojure.core/get-in input [:headers "Location"]), "x-amz-multipart-upload-id" (clojure.core/get-in input [:headers "x-amz-multipart-upload-id"])}] (clojure.core/cond-> {} (letvar1157667 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1157667 ["Location"]))) (letvar1157667 "x-amz-multipart-upload-id") (clojure.core/assoc :upload-id (deserstring (clojure.core/get-in letvar1157667 ["x-amz-multipart-upload-id"])))))))

(clojure.core/defn- response-get-vault-access-policy-output ([input] (response-get-vault-access-policy-output nil input)) ([resultWrapper1157669 input] (clojure.core/let [rawinput1157668 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157670 {"policy" (rawinput1157668 "policy")}] (clojure.core/cond-> {} (letvar1157670 "policy") (clojure.core/assoc :policy (deser-vault-access-policy (clojure.core/get-in letvar1157670 ["policy"])))))))

(clojure.core/defn- response-archive-creation-output ([input] (response-archive-creation-output nil input)) ([resultWrapper1157672 input] (clojure.core/let [rawinput1157671 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157673 {"Location" (clojure.core/get-in input [:headers "Location"]), "x-amz-sha256-tree-hash" (clojure.core/get-in input [:headers "x-amz-sha256-tree-hash"]), "x-amz-archive-id" (clojure.core/get-in input [:headers "x-amz-archive-id"])}] (clojure.core/cond-> {} (letvar1157673 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar1157673 ["Location"]))) (letvar1157673 "x-amz-sha256-tree-hash") (clojure.core/assoc :checksum (deserstring (clojure.core/get-in letvar1157673 ["x-amz-sha256-tree-hash"]))) (letvar1157673 "x-amz-archive-id") (clojure.core/assoc :archive-id (deserstring (clojure.core/get-in letvar1157673 ["x-amz-archive-id"])))))))

(clojure.core/defn- response-list-provisioned-capacity-output ([input] (response-list-provisioned-capacity-output nil input)) ([resultWrapper1157675 input] (clojure.core/let [rawinput1157674 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157676 {"ProvisionedCapacityList" (rawinput1157674 "ProvisionedCapacityList")}] (clojure.core/cond-> {} (letvar1157676 "ProvisionedCapacityList") (clojure.core/assoc :provisioned-capacity-list (deser-provisioned-capacity-list (clojure.core/get-in letvar1157676 ["ProvisionedCapacityList"])))))))

(clojure.core/defn- response-upload-multipart-part-output ([input] (response-upload-multipart-part-output nil input)) ([resultWrapper1157678 input] (clojure.core/let [rawinput1157677 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157679 {"x-amz-sha256-tree-hash" (clojure.core/get-in input [:headers "x-amz-sha256-tree-hash"])}] (clojure.core/cond-> {} (letvar1157679 "x-amz-sha256-tree-hash") (clojure.core/assoc :checksum (deserstring (clojure.core/get-in letvar1157679 ["x-amz-sha256-tree-hash"])))))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper1157681 input] (clojure.core/let [rawinput1157680 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157682 {"type" (rawinput1157680 "type"), "code" (rawinput1157680 "code"), "message" (rawinput1157680 "message")}] (clojure.core/cond-> {} (letvar1157682 "type") (clojure.core/assoc :type (deserstring (clojure.core/get-in letvar1157682 ["type"]))) (letvar1157682 "code") (clojure.core/assoc :code (deserstring (clojure.core/get-in letvar1157682 ["code"]))) (letvar1157682 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1157682 ["message"])))))))

(clojure.core/defn- response-list-vaults-output ([input] (response-list-vaults-output nil input)) ([resultWrapper1157684 input] (clojure.core/let [rawinput1157683 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1157685 {"VaultList" (rawinput1157683 "VaultList"), "Marker" (rawinput1157683 "Marker")}] (clojure.core/cond-> {} (letvar1157685 "VaultList") (clojure.core/assoc :vault-list (deser-vault-list (clojure.core/get-in letvar1157685 ["VaultList"]))) (letvar1157685 "Marker") (clojure.core/assoc :marker (deserstring (clojure.core/get-in letvar1157685 ["Marker"])))))))

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

(clojure.core/defn initiate-multipart-upload ([initiate-multipart-upload-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-initiate-multipart-upload-input initiate-multipart-upload-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/initiate-multipart-upload-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/initiate-multipart-upload-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InitiateMultipartUpload", :http.request.configuration/output-deser-fn response-initiate-multipart-upload-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef initiate-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier/initiate-multipart-upload-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/initiate-multipart-upload-output))

(clojure.core/defn describe-vault ([describe-vault-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-vault-input describe-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/describe-vault-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/describe-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeVault", :http.request.configuration/output-deser-fn response-describe-vault-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/describe-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/describe-vault-output))

(clojure.core/defn initiate-job ([initiate-job-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-initiate-job-input initiate-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/initiate-job-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/jobs", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/initiate-job-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InitiateJob", :http.request.configuration/output-deser-fn response-initiate-job-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "PolicyEnforcedException" :portkey.aws.glacier/policy-enforced-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "InsufficientCapacityException" :portkey.aws.glacier/insufficient-capacity-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef initiate-job :args (clojure.spec.alpha/tuple :portkey.aws.glacier/initiate-job-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/initiate-job-output))

(clojure.core/defn delete-vault-notifications ([delete-vault-notifications-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-vault-notifications-input delete-vault-notifications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/notification-configuration", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/delete-vault-notifications-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVaultNotifications", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-vault-notifications-input) :ret clojure.core/true?)

(clojure.core/defn get-vault-notifications ([get-vault-notifications-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-vault-notifications-input get-vault-notifications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/get-vault-notifications-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/notification-configuration", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/get-vault-notifications-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetVaultNotifications", :http.request.configuration/output-deser-fn response-get-vault-notifications-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-vault-notifications-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-vault-notifications-output))

(clojure.core/defn set-vault-notifications ([set-vault-notifications-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-set-vault-notifications-input set-vault-notifications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/notification-configuration", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/set-vault-notifications-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetVaultNotifications", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier/set-vault-notifications-input) :ret clojure.core/true?)

(clojure.core/defn list-tags-for-vault ([list-tags-for-vault-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-tags-for-vault-input list-tags-for-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/list-tags-for-vault-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/tags", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-tags-for-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForVault", :http.request.configuration/output-deser-fn response-list-tags-for-vault-output, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-tags-for-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-tags-for-vault-output))

(clojure.core/defn list-multipart-uploads ([list-multipart-uploads-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-multipart-uploads-input list-multipart-uploads-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/list-multipart-uploads-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-multipart-uploads-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMultipartUploads", :http.request.configuration/output-deser-fn response-list-multipart-uploads-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-multipart-uploads :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-multipart-uploads-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-multipart-uploads-output))

(clojure.core/defn delete-vault-access-policy ([delete-vault-access-policy-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-vault-access-policy-input delete-vault-access-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/access-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/delete-vault-access-policy-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVaultAccessPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-vault-access-policy-input) :ret clojure.core/true?)

(clojure.core/defn get-data-retrieval-policy ([get-data-retrieval-policy-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-data-retrieval-policy-input get-data-retrieval-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/get-data-retrieval-policy-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/policies/data-retrieval", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/get-data-retrieval-policy-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDataRetrievalPolicy", :http.request.configuration/output-deser-fn response-get-data-retrieval-policy-output, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-data-retrieval-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-data-retrieval-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-data-retrieval-policy-output))

(clojure.core/defn purchase-provisioned-capacity ([purchase-provisioned-capacity-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-purchase-provisioned-capacity-input purchase-provisioned-capacity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/purchase-provisioned-capacity-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/provisioned-capacity", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/purchase-provisioned-capacity-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PurchaseProvisionedCapacity", :http.request.configuration/output-deser-fn response-purchase-provisioned-capacity-output, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "LimitExceededException" :portkey.aws.glacier/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef purchase-provisioned-capacity :args (clojure.spec.alpha/tuple :portkey.aws.glacier/purchase-provisioned-capacity-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/purchase-provisioned-capacity-output))

(clojure.core/defn delete-archive ([delete-archive-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-archive-input delete-archive-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/archives/{archiveId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/delete-archive-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteArchive", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-archive :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-archive-input) :ret clojure.core/true?)

(clojure.core/defn describe-job ([describe-job-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-job-input describe-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/glacier-job-description, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/jobs/{jobId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/describe-job-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeJob", :http.request.configuration/output-deser-fn response-glacier-job-description, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-job :args (clojure.spec.alpha/tuple :portkey.aws.glacier/describe-job-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/glacier-job-description))

(clojure.core/defn complete-multipart-upload ([complete-multipart-upload-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-complete-multipart-upload-input complete-multipart-upload-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/archive-creation-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/complete-multipart-upload-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CompleteMultipartUpload", :http.request.configuration/output-deser-fn response-archive-creation-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef complete-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier/complete-multipart-upload-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/archive-creation-output))

(clojure.core/defn abort-multipart-upload ([abort-multipart-upload-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-abort-multipart-upload-input abort-multipart-upload-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/abort-multipart-upload-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AbortMultipartUpload", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef abort-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier/abort-multipart-upload-input) :ret clojure.core/true?)

(clojure.core/defn add-tags-to-vault ([add-tags-to-vault-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-add-tags-to-vault-input add-tags-to-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/tags?operation=add", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/add-tags-to-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTagsToVault", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "LimitExceededException" :portkey.aws.glacier/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/add-tags-to-vault-input) :ret clojure.core/true?)

(clojure.core/defn initiate-vault-lock ([initiate-vault-lock-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-initiate-vault-lock-input initiate-vault-lock-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/initiate-vault-lock-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/lock-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/initiate-vault-lock-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InitiateVaultLock", :http.request.configuration/output-deser-fn response-initiate-vault-lock-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef initiate-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/initiate-vault-lock-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/initiate-vault-lock-output))

(clojure.core/defn delete-vault ([delete-vault-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-vault-input delete-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/delete-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVault", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-vault-input) :ret clojure.core/true?)

(clojure.core/defn list-provisioned-capacity ([list-provisioned-capacity-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-provisioned-capacity-input list-provisioned-capacity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/list-provisioned-capacity-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/provisioned-capacity", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-provisioned-capacity-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProvisionedCapacity", :http.request.configuration/output-deser-fn response-list-provisioned-capacity-output, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-provisioned-capacity :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-provisioned-capacity-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-provisioned-capacity-output))

(clojure.core/defn get-vault-lock ([get-vault-lock-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-vault-lock-input get-vault-lock-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/get-vault-lock-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/lock-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/get-vault-lock-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetVaultLock", :http.request.configuration/output-deser-fn response-get-vault-lock-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-vault-lock-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-vault-lock-output))

(clojure.core/defn list-vaults ([list-vaults-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-vaults-input list-vaults-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/list-vaults-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-vaults-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVaults", :http.request.configuration/output-deser-fn response-list-vaults-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-vaults :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-vaults-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-vaults-output))

(clojure.core/defn set-data-retrieval-policy ([set-data-retrieval-policy-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-set-data-retrieval-policy-input set-data-retrieval-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/policies/data-retrieval", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/set-data-retrieval-policy-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetDataRetrievalPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-data-retrieval-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/set-data-retrieval-policy-input) :ret clojure.core/true?)

(clojure.core/defn get-job-output ([get-job-output-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-job-output-input get-job-output-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/get-job-output-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/jobs/{jobId}/output", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/get-job-output-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetJobOutput", :http.request.configuration/output-deser-fn response-get-job-output-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-job-output :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-job-output-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-job-output-output))

(clojure.core/defn remove-tags-from-vault ([remove-tags-from-vault-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-remove-tags-from-vault-input remove-tags-from-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/tags?operation=remove", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/remove-tags-from-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTagsFromVault", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/remove-tags-from-vault-input) :ret clojure.core/true?)

(clojure.core/defn abort-vault-lock ([abort-vault-lock-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-abort-vault-lock-input abort-vault-lock-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/lock-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/abort-vault-lock-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AbortVaultLock", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef abort-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/abort-vault-lock-input) :ret clojure.core/true?)

(clojure.core/defn list-parts ([list-parts-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-parts-input list-parts-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/list-parts-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-parts-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListParts", :http.request.configuration/output-deser-fn response-list-parts-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-parts :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-parts-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-parts-output))

(clojure.core/defn set-vault-access-policy ([set-vault-access-policy-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-set-vault-access-policy-input set-vault-access-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/access-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/set-vault-access-policy-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetVaultAccessPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/set-vault-access-policy-input) :ret clojure.core/true?)

(clojure.core/defn create-vault ([create-vault-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-vault-input create-vault-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/create-vault-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/create-vault-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateVault", :http.request.configuration/output-deser-fn response-create-vault-output, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception, "LimitExceededException" :portkey.aws.glacier/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/create-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/create-vault-output))

(clojure.core/defn complete-vault-lock ([complete-vault-lock-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-complete-vault-lock-input complete-vault-lock-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/lock-policy/{lockId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/complete-vault-lock-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CompleteVaultLock", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef complete-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/complete-vault-lock-input) :ret clojure.core/true?)

(clojure.core/defn upload-multipart-part ([upload-multipart-part-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-upload-multipart-part-input upload-multipart-part-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/upload-multipart-part-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/upload-multipart-part-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UploadMultipartPart", :http.request.configuration/output-deser-fn response-upload-multipart-part-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "RequestTimeoutException" :portkey.aws.glacier/request-timeout-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef upload-multipart-part :args (clojure.spec.alpha/tuple :portkey.aws.glacier/upload-multipart-part-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/upload-multipart-part-output))

(clojure.core/defn upload-archive ([upload-archive-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-upload-archive-input upload-archive-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/archive-creation-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/archives", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/upload-archive-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UploadArchive", :http.request.configuration/output-deser-fn response-archive-creation-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "RequestTimeoutException" :portkey.aws.glacier/request-timeout-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef upload-archive :args (clojure.spec.alpha/tuple :portkey.aws.glacier/upload-archive-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/archive-creation-output))

(clojure.core/defn get-vault-access-policy ([get-vault-access-policy-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-vault-access-policy-input get-vault-access-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/get-vault-access-policy-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/access-policy", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/get-vault-access-policy-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetVaultAccessPolicy", :http.request.configuration/output-deser-fn response-get-vault-access-policy-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-vault-access-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-vault-access-policy-output))

(clojure.core/defn list-jobs ([list-jobs-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-jobs-input list-jobs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.glacier/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.glacier/list-jobs-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/{accountId}/vaults/{vaultName}/jobs", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Glacier", :http.request.spec/input-spec :portkey.aws.glacier/list-jobs-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn response-list-jobs-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-jobs-output))
