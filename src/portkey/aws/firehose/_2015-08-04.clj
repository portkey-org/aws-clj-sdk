(ns portkey.aws.firehose.-2015-08-04 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "firehose", :region "ap-northeast-1"},
    :ssl-common-name "firehose.ap-northeast-1.amazonaws.com",
    :endpoint "https://firehose.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "firehose", :region "eu-west-1"},
    :ssl-common-name "firehose.eu-west-1.amazonaws.com",
    :endpoint "https://firehose.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "firehose", :region "us-east-2"},
    :ssl-common-name "firehose.us-east-2.amazonaws.com",
    :endpoint "https://firehose.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "firehose", :region "ap-southeast-2"},
    :ssl-common-name "firehose.ap-southeast-2.amazonaws.com",
    :endpoint "https://firehose.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "firehose", :region "sa-east-1"},
    :ssl-common-name "firehose.sa-east-1.amazonaws.com",
    :endpoint "https://firehose.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "firehose", :region "ap-southeast-1"},
    :ssl-common-name "firehose.ap-southeast-1.amazonaws.com",
    :endpoint "https://firehose.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "firehose", :region "ap-northeast-2"},
    :ssl-common-name "firehose.ap-northeast-2.amazonaws.com",
    :endpoint "https://firehose.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "firehose", :region "eu-west-3"},
    :ssl-common-name "firehose.eu-west-3.amazonaws.com",
    :endpoint "https://firehose.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "firehose", :region "ca-central-1"},
    :ssl-common-name "firehose.ca-central-1.amazonaws.com",
    :endpoint "https://firehose.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "firehose", :region "eu-central-1"},
    :ssl-common-name "firehose.eu-central-1.amazonaws.com",
    :endpoint "https://firehose.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "firehose", :region "eu-west-2"},
    :ssl-common-name "firehose.eu-west-2.amazonaws.com",
    :endpoint "https://firehose.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "firehose", :region "us-west-2"},
    :ssl-common-name "firehose.us-west-2.amazonaws.com",
    :endpoint "https://firehose.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "firehose", :region "us-east-1"},
    :ssl-common-name "firehose.us-east-1.amazonaws.com",
    :endpoint "https://firehose.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "firehose", :region "us-west-1"},
    :ssl-common-name "firehose.us-west-1.amazonaws.com",
    :endpoint "https://firehose.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "firehose", :region "ap-south-1"},
    :ssl-common-name "firehose.ap-south-1.amazonaws.com",
    :endpoint "https://firehose.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-processor-list)

(clojure.core/declare ser-username)

(clojure.core/declare ser-deserializer)

(clojure.core/declare ser-non-negative-integer-object)

(clojure.core/declare ser-splunk-retry-options)

(clojure.core/declare ser-copy-options)

(clojure.core/declare ser-hec-endpoint)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-describe-delivery-stream-input-limit)

(clojure.core/declare ser-tag-delivery-stream-input-tag-list)

(clojure.core/declare ser-serializer)

(clojure.core/declare ser-non-empty-string-without-whitespace)

(clojure.core/declare ser-redshift-destination-configuration)

(clojure.core/declare ser-prefix)

(clojure.core/declare ser-extended-s-3-destination-configuration)

(clojure.core/declare ser-s-3-destination-configuration)

(clojure.core/declare ser-kinesis-stream-arn)

(clojure.core/declare ser-password)

(clojure.core/declare ser-encryption-configuration)

(clojure.core/declare ser-redshift-retry-options)

(clojure.core/declare ser-elasticsearch-index-name)

(clojure.core/declare ser-data-table-name)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-delivery-stream-type)

(clojure.core/declare ser-block-size-bytes)

(clojure.core/declare ser-elasticsearch-retry-duration-in-seconds)

(clojure.core/declare ser-list-tags-for-delivery-stream-input-limit)

(clojure.core/declare ser-kinesis-stream-source-configuration)

(clojure.core/declare ser-elasticsearch-destination-configuration)

(clojure.core/declare ser-data-format-conversion-configuration)

(clojure.core/declare ser-delivery-stream-version-id)

(clojure.core/declare ser-output-format-configuration)

(clojure.core/declare ser-list-of-non-empty-strings)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-buffering-hints)

(clojure.core/declare ser-elasticsearch-s-3-backup-mode)

(clojure.core/declare ser-redshift-s-3-backup-mode)

(clojure.core/declare ser-splunk-destination-configuration)

(clojure.core/declare ser-compression-format)

(clojure.core/declare ser-splunk-destination-update)

(clojure.core/declare ser-elasticsearch-retry-options)

(clojure.core/declare ser-list-delivery-streams-input-limit)

(clojure.core/declare ser-input-format-configuration)

(clojure.core/declare ser-list-of-non-empty-strings-without-whitespace)

(clojure.core/declare ser-parquet-compression)

(clojure.core/declare ser-processor-parameter-list)

(clojure.core/declare ser-processor-parameter)

(clojure.core/declare ser-destination-id)

(clojure.core/declare ser-size-in-m-bs)

(clojure.core/declare ser-parquet-ser-de)

(clojure.core/declare ser-cloud-watch-logging-options)

(clojure.core/declare ser-elasticsearch-index-rotation-period)

(clojure.core/declare ser-interval-in-seconds)

(clojure.core/declare ser-hec-endpoint-type)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-redshift-retry-duration-in-seconds)

(clojure.core/declare ser-cluster-jdbcurl)

(clojure.core/declare ser-kms-encryption-config)

(clojure.core/declare ser-extended-s-3-destination-update)

(clojure.core/declare ser-elasticsearch-domain-arn)

(clojure.core/declare ser-log-stream-name)

(clojure.core/declare ser-orc-compression)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-s-3-destination-update)

(clojure.core/declare ser-elasticsearch-buffering-interval-in-seconds)

(clojure.core/declare ser-delivery-stream-name)

(clojure.core/declare ser-parquet-page-size-bytes)

(clojure.core/declare ser-record)

(clojure.core/declare ser-processor)

(clojure.core/declare ser-data)

(clojure.core/declare ser-log-group-name)

(clojure.core/declare ser-proportion)

(clojure.core/declare ser-hive-json-ser-de)

(clojure.core/declare ser-orc-row-index-stride)

(clojure.core/declare ser-copy-command)

(clojure.core/declare ser-parquet-writer-version)

(clojure.core/declare ser-awskms-key-arn)

(clojure.core/declare ser-no-encryption-config)

(clojure.core/declare ser-s-3-backup-mode)

(clojure.core/declare ser-hec-acknowledgment-timeout-in-seconds)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-orc-format-version)

(clojure.core/declare ser-processor-parameter-value)

(clojure.core/declare ser-orc-ser-de)

(clojure.core/declare ser-orc-stripe-size-bytes)

(clojure.core/declare ser-processing-configuration)

(clojure.core/declare ser-data-table-columns)

(clojure.core/declare ser-processor-type)

(clojure.core/declare ser-column-to-json-key-mappings)

(clojure.core/declare ser-put-record-batch-request-entry-list)

(clojure.core/declare ser-redshift-destination-update)

(clojure.core/declare ser-boolean-object)

(clojure.core/declare ser-schema-configuration)

(clojure.core/declare ser-elasticsearch-type-name)

(clojure.core/declare ser-elasticsearch-destination-update)

(clojure.core/declare ser-processor-parameter-name)

(clojure.core/declare ser-splunk-retry-duration-in-seconds)

(clojure.core/declare ser-elasticsearch-buffering-hints)

(clojure.core/declare ser-hec-token)

(clojure.core/declare ser-open-x-json-ser-de)

(clojure.core/declare ser-elasticsearch-buffering-size-in-m-bs)

(clojure.core/declare ser-splunk-s-3-backup-mode)

(clojure.core/declare ser-bucket-arn)

(clojure.core/defn- ser-processor-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-processor coll) #:http.request.field{:shape "Processor"}))) input), :shape "ProcessorList", :type "list"})

(clojure.core/defn- ser-username [input] #:http.request.field{:value input, :shape "Username"})

(clojure.core/defn- ser-deserializer [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Deserializer", :type "structure"} (clojure.core/contains? input :open-x-json-ser-de) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-open-x-json-ser-de (input :open-x-json-ser-de)) #:http.request.field{:name "OpenXJsonSerDe", :shape "OpenXJsonSerDe"})) (clojure.core/contains? input :hive-json-ser-de) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hive-json-ser-de (input :hive-json-ser-de)) #:http.request.field{:name "HiveJsonSerDe", :shape "HiveJsonSerDe"}))))

(clojure.core/defn- ser-non-negative-integer-object [input] #:http.request.field{:value input, :shape "NonNegativeIntegerObject"})

(clojure.core/defn- ser-splunk-retry-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SplunkRetryOptions", :type "structure"} (clojure.core/contains? input :duration-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-splunk-retry-duration-in-seconds (input :duration-in-seconds)) #:http.request.field{:name "DurationInSeconds", :shape "SplunkRetryDurationInSeconds"}))))

(clojure.core/defn- ser-copy-options [input] #:http.request.field{:value input, :shape "CopyOptions"})

(clojure.core/defn- ser-hec-endpoint [input] #:http.request.field{:value input, :shape "HECEndpoint"})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-describe-delivery-stream-input-limit [input] #:http.request.field{:value input, :shape "DescribeDeliveryStreamInputLimit"})

(clojure.core/defn- ser-tag-delivery-stream-input-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagDeliveryStreamInputTagList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-serializer [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Serializer", :type "structure"} (clojure.core/contains? input :parquet-ser-de) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parquet-ser-de (input :parquet-ser-de)) #:http.request.field{:name "ParquetSerDe", :shape "ParquetSerDe"})) (clojure.core/contains? input :orc-ser-de) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-orc-ser-de (input :orc-ser-de)) #:http.request.field{:name "OrcSerDe", :shape "OrcSerDe"}))))

(clojure.core/defn- ser-non-empty-string-without-whitespace [input] #:http.request.field{:value input, :shape "NonEmptyStringWithoutWhitespace"})

(clojure.core/defn- ser-redshift-destination-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"}) (clojure.core/into (ser-cluster-jdbcurl (:cluster-jdbcurl input)) #:http.request.field{:name "ClusterJDBCURL", :shape "ClusterJDBCURL"}) (clojure.core/into (ser-copy-command (:copy-command input)) #:http.request.field{:name "CopyCommand", :shape "CopyCommand"}) (clojure.core/into (ser-username (:username input)) #:http.request.field{:name "Username", :shape "Username"}) (clojure.core/into (ser-password (:password input)) #:http.request.field{:name "Password", :shape "Password"}) (clojure.core/into (ser-s-3-destination-configuration (:s-3-configuration input)) #:http.request.field{:name "S3Configuration", :shape "S3DestinationConfiguration"})], :shape "RedshiftDestinationConfiguration", :type "structure"} (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"})) (clojure.core/contains? input :retry-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redshift-retry-options (input :retry-options)) #:http.request.field{:name "RetryOptions", :shape "RedshiftRetryOptions"})) (clojure.core/contains? input :s-3-backup-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redshift-s-3-backup-mode (input :s-3-backup-mode)) #:http.request.field{:name "S3BackupMode", :shape "RedshiftS3BackupMode"})) (clojure.core/contains? input :processing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-processing-configuration (input :processing-configuration)) #:http.request.field{:name "ProcessingConfiguration", :shape "ProcessingConfiguration"})) (clojure.core/contains? input :s-3-backup-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination-configuration (input :s-3-backup-configuration)) #:http.request.field{:name "S3BackupConfiguration", :shape "S3DestinationConfiguration"}))))

(clojure.core/defn- ser-prefix [input] #:http.request.field{:value input, :shape "Prefix"})

(clojure.core/defn- ser-extended-s-3-destination-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"}) (clojure.core/into (ser-bucket-arn (:bucket-arn input)) #:http.request.field{:name "BucketARN", :shape "BucketARN"})], :shape "ExtendedS3DestinationConfiguration", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"})) (clojure.core/contains? input :data-format-conversion-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-format-conversion-configuration (input :data-format-conversion-configuration)) #:http.request.field{:name "DataFormatConversionConfiguration", :shape "DataFormatConversionConfiguration"})) (clojure.core/contains? input :buffering-hints) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-buffering-hints (input :buffering-hints)) #:http.request.field{:name "BufferingHints", :shape "BufferingHints"})) (clojure.core/contains? input :compression-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-format (input :compression-format)) #:http.request.field{:name "CompressionFormat", :shape "CompressionFormat"})) (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"})) (clojure.core/contains? input :s-3-backup-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-backup-mode (input :s-3-backup-mode)) #:http.request.field{:name "S3BackupMode", :shape "S3BackupMode"})) (clojure.core/contains? input :processing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-processing-configuration (input :processing-configuration)) #:http.request.field{:name "ProcessingConfiguration", :shape "ProcessingConfiguration"})) (clojure.core/contains? input :s-3-backup-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination-configuration (input :s-3-backup-configuration)) #:http.request.field{:name "S3BackupConfiguration", :shape "S3DestinationConfiguration"}))))

(clojure.core/defn- ser-s-3-destination-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"}) (clojure.core/into (ser-bucket-arn (:bucket-arn input)) #:http.request.field{:name "BucketARN", :shape "BucketARN"})], :shape "S3DestinationConfiguration", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :buffering-hints) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-buffering-hints (input :buffering-hints)) #:http.request.field{:name "BufferingHints", :shape "BufferingHints"})) (clojure.core/contains? input :compression-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-format (input :compression-format)) #:http.request.field{:name "CompressionFormat", :shape "CompressionFormat"})) (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"})) (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"}))))

(clojure.core/defn- ser-kinesis-stream-arn [input] #:http.request.field{:value input, :shape "KinesisStreamARN"})

(clojure.core/defn- ser-password [input] #:http.request.field{:value input, :shape "Password"})

(clojure.core/defn- ser-encryption-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EncryptionConfiguration", :type "structure"} (clojure.core/contains? input :no-encryption-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-no-encryption-config (input :no-encryption-config)) #:http.request.field{:name "NoEncryptionConfig", :shape "NoEncryptionConfig"})) (clojure.core/contains? input :kms-encryption-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-encryption-config (input :kms-encryption-config)) #:http.request.field{:name "KMSEncryptionConfig", :shape "KMSEncryptionConfig"}))))

(clojure.core/defn- ser-redshift-retry-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RedshiftRetryOptions", :type "structure"} (clojure.core/contains? input :duration-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redshift-retry-duration-in-seconds (input :duration-in-seconds)) #:http.request.field{:name "DurationInSeconds", :shape "RedshiftRetryDurationInSeconds"}))))

(clojure.core/defn- ser-elasticsearch-index-name [input] #:http.request.field{:value input, :shape "ElasticsearchIndexName"})

(clojure.core/defn- ser-data-table-name [input] #:http.request.field{:value input, :shape "DataTableName"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleARN"})

(clojure.core/defn- ser-delivery-stream-type [input] #:http.request.field{:value (clojure.core/get {"DirectPut" "DirectPut", :direct-put "DirectPut", "KinesisStreamAsSource" "KinesisStreamAsSource", :kinesis-stream-as-source "KinesisStreamAsSource"} input), :shape "DeliveryStreamType"})

(clojure.core/defn- ser-block-size-bytes [input] #:http.request.field{:value input, :shape "BlockSizeBytes"})

(clojure.core/defn- ser-elasticsearch-retry-duration-in-seconds [input] #:http.request.field{:value input, :shape "ElasticsearchRetryDurationInSeconds"})

(clojure.core/defn- ser-list-tags-for-delivery-stream-input-limit [input] #:http.request.field{:value input, :shape "ListTagsForDeliveryStreamInputLimit"})

(clojure.core/defn- ser-kinesis-stream-source-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-kinesis-stream-arn (:kinesis-stream-arn input)) #:http.request.field{:name "KinesisStreamARN", :shape "KinesisStreamARN"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})], :shape "KinesisStreamSourceConfiguration", :type "structure"}))

(clojure.core/defn- ser-elasticsearch-destination-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "RoleARN"}) (clojure.core/into (ser-elasticsearch-domain-arn (:domain-arn input)) #:http.request.field{:name "DomainARN", :shape "ElasticsearchDomainARN"}) (clojure.core/into (ser-elasticsearch-index-name (:index-name input)) #:http.request.field{:name "IndexName", :shape "ElasticsearchIndexName"}) (clojure.core/into (ser-elasticsearch-type-name (:type-name input)) #:http.request.field{:name "TypeName", :shape "ElasticsearchTypeName"}) (clojure.core/into (ser-s-3-destination-configuration (:s-3-configuration input)) #:http.request.field{:name "S3Configuration", :shape "S3DestinationConfiguration"})], :shape "ElasticsearchDestinationConfiguration", :type "structure"} (clojure.core/contains? input :buffering-hints) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-buffering-hints (input :buffering-hints)) #:http.request.field{:name "BufferingHints", :shape "ElasticsearchBufferingHints"})) (clojure.core/contains? input :index-rotation-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-index-rotation-period (input :index-rotation-period)) #:http.request.field{:name "IndexRotationPeriod", :shape "ElasticsearchIndexRotationPeriod"})) (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"})) (clojure.core/contains? input :retry-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-retry-options (input :retry-options)) #:http.request.field{:name "RetryOptions", :shape "ElasticsearchRetryOptions"})) (clojure.core/contains? input :s-3-backup-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-s-3-backup-mode (input :s-3-backup-mode)) #:http.request.field{:name "S3BackupMode", :shape "ElasticsearchS3BackupMode"})) (clojure.core/contains? input :processing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-processing-configuration (input :processing-configuration)) #:http.request.field{:name "ProcessingConfiguration", :shape "ProcessingConfiguration"}))))

(clojure.core/defn- ser-data-format-conversion-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DataFormatConversionConfiguration", :type "structure"} (clojure.core/contains? input :schema-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schema-configuration (input :schema-configuration)) #:http.request.field{:name "SchemaConfiguration", :shape "SchemaConfiguration"})) (clojure.core/contains? input :input-format-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-format-configuration (input :input-format-configuration)) #:http.request.field{:name "InputFormatConfiguration", :shape "InputFormatConfiguration"})) (clojure.core/contains? input :output-format-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-format-configuration (input :output-format-configuration)) #:http.request.field{:name "OutputFormatConfiguration", :shape "OutputFormatConfiguration"})) (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enabled)) #:http.request.field{:name "Enabled", :shape "BooleanObject"}))))

(clojure.core/defn- ser-delivery-stream-version-id [input] #:http.request.field{:value input, :shape "DeliveryStreamVersionId"})

(clojure.core/defn- ser-output-format-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputFormatConfiguration", :type "structure"} (clojure.core/contains? input :serializer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-serializer (input :serializer)) #:http.request.field{:name "Serializer", :shape "Serializer"}))))

(clojure.core/defn- ser-list-of-non-empty-strings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "ListOfNonEmptyStrings", :type "list"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-buffering-hints [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BufferingHints", :type "structure"} (clojure.core/contains? input :size-in-m-bs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-size-in-m-bs (input :size-in-m-bs)) #:http.request.field{:name "SizeInMBs", :shape "SizeInMBs"})) (clojure.core/contains? input :interval-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-interval-in-seconds (input :interval-in-seconds)) #:http.request.field{:name "IntervalInSeconds", :shape "IntervalInSeconds"}))))

(clojure.core/defn- ser-elasticsearch-s-3-backup-mode [input] #:http.request.field{:value (clojure.core/get {"FailedDocumentsOnly" "FailedDocumentsOnly", :failed-documents-only "FailedDocumentsOnly", "AllDocuments" "AllDocuments", :all-documents "AllDocuments"} input), :shape "ElasticsearchS3BackupMode"})

(clojure.core/defn- ser-redshift-s-3-backup-mode [input] #:http.request.field{:value (clojure.core/get {"Disabled" "Disabled", :disabled "Disabled", "Enabled" "Enabled", :enabled "Enabled"} input), :shape "RedshiftS3BackupMode"})

(clojure.core/defn- ser-splunk-destination-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hec-endpoint (:hec-endpoint input)) #:http.request.field{:name "HECEndpoint", :shape "HECEndpoint"}) (clojure.core/into (ser-hec-endpoint-type (:hec-endpoint-type input)) #:http.request.field{:name "HECEndpointType", :shape "HECEndpointType"}) (clojure.core/into (ser-hec-token (:hec-token input)) #:http.request.field{:name "HECToken", :shape "HECToken"}) (clojure.core/into (ser-s-3-destination-configuration (:s-3-configuration input)) #:http.request.field{:name "S3Configuration", :shape "S3DestinationConfiguration"})], :shape "SplunkDestinationConfiguration", :type "structure"} (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"})) (clojure.core/contains? input :retry-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-splunk-retry-options (input :retry-options)) #:http.request.field{:name "RetryOptions", :shape "SplunkRetryOptions"})) (clojure.core/contains? input :s-3-backup-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-splunk-s-3-backup-mode (input :s-3-backup-mode)) #:http.request.field{:name "S3BackupMode", :shape "SplunkS3BackupMode"})) (clojure.core/contains? input :hec-acknowledgment-timeout-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hec-acknowledgment-timeout-in-seconds (input :hec-acknowledgment-timeout-in-seconds)) #:http.request.field{:name "HECAcknowledgmentTimeoutInSeconds", :shape "HECAcknowledgmentTimeoutInSeconds"})) (clojure.core/contains? input :processing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-processing-configuration (input :processing-configuration)) #:http.request.field{:name "ProcessingConfiguration", :shape "ProcessingConfiguration"}))))

(clojure.core/defn- ser-compression-format [input] #:http.request.field{:value (clojure.core/get {"UNCOMPRESSED" "UNCOMPRESSED", :uncompressed "UNCOMPRESSED", "GZIP" "GZIP", :gzip "GZIP", "ZIP" "ZIP", :zip "ZIP", "Snappy" "Snappy", :snappy "Snappy"} input), :shape "CompressionFormat"})

(clojure.core/defn- ser-splunk-destination-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SplunkDestinationUpdate", :type "structure"} (clojure.core/contains? input :hec-endpoint) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hec-endpoint (input :hec-endpoint)) #:http.request.field{:name "HECEndpoint", :shape "HECEndpoint"})) (clojure.core/contains? input :s-3-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination-update (input :s-3-update)) #:http.request.field{:name "S3Update", :shape "S3DestinationUpdate"})) (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"})) (clojure.core/contains? input :hec-endpoint-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hec-endpoint-type (input :hec-endpoint-type)) #:http.request.field{:name "HECEndpointType", :shape "HECEndpointType"})) (clojure.core/contains? input :retry-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-splunk-retry-options (input :retry-options)) #:http.request.field{:name "RetryOptions", :shape "SplunkRetryOptions"})) (clojure.core/contains? input :s-3-backup-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-splunk-s-3-backup-mode (input :s-3-backup-mode)) #:http.request.field{:name "S3BackupMode", :shape "SplunkS3BackupMode"})) (clojure.core/contains? input :hec-acknowledgment-timeout-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hec-acknowledgment-timeout-in-seconds (input :hec-acknowledgment-timeout-in-seconds)) #:http.request.field{:name "HECAcknowledgmentTimeoutInSeconds", :shape "HECAcknowledgmentTimeoutInSeconds"})) (clojure.core/contains? input :processing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-processing-configuration (input :processing-configuration)) #:http.request.field{:name "ProcessingConfiguration", :shape "ProcessingConfiguration"})) (clojure.core/contains? input :hec-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hec-token (input :hec-token)) #:http.request.field{:name "HECToken", :shape "HECToken"}))))

(clojure.core/defn- ser-elasticsearch-retry-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ElasticsearchRetryOptions", :type "structure"} (clojure.core/contains? input :duration-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-retry-duration-in-seconds (input :duration-in-seconds)) #:http.request.field{:name "DurationInSeconds", :shape "ElasticsearchRetryDurationInSeconds"}))))

(clojure.core/defn- ser-list-delivery-streams-input-limit [input] #:http.request.field{:value input, :shape "ListDeliveryStreamsInputLimit"})

(clojure.core/defn- ser-input-format-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InputFormatConfiguration", :type "structure"} (clojure.core/contains? input :deserializer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deserializer (input :deserializer)) #:http.request.field{:name "Deserializer", :shape "Deserializer"}))))

(clojure.core/defn- ser-list-of-non-empty-strings-without-whitespace [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string-without-whitespace coll) #:http.request.field{:shape "NonEmptyStringWithoutWhitespace"}))) input), :shape "ListOfNonEmptyStringsWithoutWhitespace", :type "list"})

(clojure.core/defn- ser-parquet-compression [input] #:http.request.field{:value (clojure.core/get {"UNCOMPRESSED" "UNCOMPRESSED", :uncompressed "UNCOMPRESSED", "GZIP" "GZIP", :gzip "GZIP", "SNAPPY" "SNAPPY", :snappy "SNAPPY"} input), :shape "ParquetCompression"})

(clojure.core/defn- ser-processor-parameter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-processor-parameter coll) #:http.request.field{:shape "ProcessorParameter"}))) input), :shape "ProcessorParameterList", :type "list"})

(clojure.core/defn- ser-processor-parameter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-processor-parameter-name (:parameter-name input)) #:http.request.field{:name "ParameterName", :shape "ProcessorParameterName"}) (clojure.core/into (ser-processor-parameter-value (:parameter-value input)) #:http.request.field{:name "ParameterValue", :shape "ProcessorParameterValue"})], :shape "ProcessorParameter", :type "structure"}))

(clojure.core/defn- ser-destination-id [input] #:http.request.field{:value input, :shape "DestinationId"})

(clojure.core/defn- ser-size-in-m-bs [input] #:http.request.field{:value input, :shape "SizeInMBs"})

(clojure.core/defn- ser-parquet-ser-de [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ParquetSerDe", :type "structure"} (clojure.core/contains? input :block-size-bytes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-size-bytes (input :block-size-bytes)) #:http.request.field{:name "BlockSizeBytes", :shape "BlockSizeBytes"})) (clojure.core/contains? input :page-size-bytes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parquet-page-size-bytes (input :page-size-bytes)) #:http.request.field{:name "PageSizeBytes", :shape "ParquetPageSizeBytes"})) (clojure.core/contains? input :compression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parquet-compression (input :compression)) #:http.request.field{:name "Compression", :shape "ParquetCompression"})) (clojure.core/contains? input :enable-dictionary-compression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enable-dictionary-compression)) #:http.request.field{:name "EnableDictionaryCompression", :shape "BooleanObject"})) (clojure.core/contains? input :max-padding-bytes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-negative-integer-object (input :max-padding-bytes)) #:http.request.field{:name "MaxPaddingBytes", :shape "NonNegativeIntegerObject"})) (clojure.core/contains? input :writer-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parquet-writer-version (input :writer-version)) #:http.request.field{:name "WriterVersion", :shape "ParquetWriterVersion"}))))

(clojure.core/defn- ser-cloud-watch-logging-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CloudWatchLoggingOptions", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enabled)) #:http.request.field{:name "Enabled", :shape "BooleanObject"})) (clojure.core/contains? input :log-group-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "LogGroupName", :shape "LogGroupName"})) (clojure.core/contains? input :log-stream-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-stream-name (input :log-stream-name)) #:http.request.field{:name "LogStreamName", :shape "LogStreamName"}))))

(clojure.core/defn- ser-elasticsearch-index-rotation-period [input] #:http.request.field{:value (clojure.core/get {"OneWeek" "OneWeek", :one-month "OneMonth", "NoRotation" "NoRotation", :no-rotation "NoRotation", "OneDay" "OneDay", "OneMonth" "OneMonth", "OneHour" "OneHour", :one-day "OneDay", :one-hour "OneHour", :one-week "OneWeek"} input), :shape "ElasticsearchIndexRotationPeriod"})

(clojure.core/defn- ser-interval-in-seconds [input] #:http.request.field{:value input, :shape "IntervalInSeconds"})

(clojure.core/defn- ser-hec-endpoint-type [input] #:http.request.field{:value (clojure.core/get {"Raw" "Raw", :raw "Raw", "Event" "Event", :event "Event"} input), :shape "HECEndpointType"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-redshift-retry-duration-in-seconds [input] #:http.request.field{:value input, :shape "RedshiftRetryDurationInSeconds"})

(clojure.core/defn- ser-cluster-jdbcurl [input] #:http.request.field{:value input, :shape "ClusterJDBCURL"})

(clojure.core/defn- ser-kms-encryption-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-awskms-key-arn (:awskms-key-arn input)) #:http.request.field{:name "AWSKMSKeyARN", :shape "AWSKMSKeyARN"})], :shape "KMSEncryptionConfig", :type "structure"}))

(clojure.core/defn- ser-extended-s-3-destination-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ExtendedS3DestinationUpdate", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :s-3-backup-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination-update (input :s-3-backup-update)) #:http.request.field{:name "S3BackupUpdate", :shape "S3DestinationUpdate"})) (clojure.core/contains? input :data-format-conversion-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-format-conversion-configuration (input :data-format-conversion-configuration)) #:http.request.field{:name "DataFormatConversionConfiguration", :shape "DataFormatConversionConfiguration"})) (clojure.core/contains? input :buffering-hints) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-buffering-hints (input :buffering-hints)) #:http.request.field{:name "BufferingHints", :shape "BufferingHints"})) (clojure.core/contains? input :compression-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-format (input :compression-format)) #:http.request.field{:name "CompressionFormat", :shape "CompressionFormat"})) (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"})) (clojure.core/contains? input :s-3-backup-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-backup-mode (input :s-3-backup-mode)) #:http.request.field{:name "S3BackupMode", :shape "S3BackupMode"})) (clojure.core/contains? input :processing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-processing-configuration (input :processing-configuration)) #:http.request.field{:name "ProcessingConfiguration", :shape "ProcessingConfiguration"})) (clojure.core/contains? input :bucket-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-arn (input :bucket-arn)) #:http.request.field{:name "BucketARN", :shape "BucketARN"}))))

(clojure.core/defn- ser-elasticsearch-domain-arn [input] #:http.request.field{:value input, :shape "ElasticsearchDomainARN"})

(clojure.core/defn- ser-log-stream-name [input] #:http.request.field{:value input, :shape "LogStreamName"})

(clojure.core/defn- ser-orc-compression [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "ZLIB" "ZLIB", :zlib "ZLIB", "SNAPPY" "SNAPPY", :snappy "SNAPPY"} input), :shape "OrcCompression"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-s-3-destination-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3DestinationUpdate", :type "structure"} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :bucket-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-arn (input :bucket-arn)) #:http.request.field{:name "BucketARN", :shape "BucketARN"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "Prefix"})) (clojure.core/contains? input :buffering-hints) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-buffering-hints (input :buffering-hints)) #:http.request.field{:name "BufferingHints", :shape "BufferingHints"})) (clojure.core/contains? input :compression-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-format (input :compression-format)) #:http.request.field{:name "CompressionFormat", :shape "CompressionFormat"})) (clojure.core/contains? input :encryption-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-configuration (input :encryption-configuration)) #:http.request.field{:name "EncryptionConfiguration", :shape "EncryptionConfiguration"})) (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"}))))

(clojure.core/defn- ser-elasticsearch-buffering-interval-in-seconds [input] #:http.request.field{:value input, :shape "ElasticsearchBufferingIntervalInSeconds"})

(clojure.core/defn- ser-delivery-stream-name [input] #:http.request.field{:value input, :shape "DeliveryStreamName"})

(clojure.core/defn- ser-parquet-page-size-bytes [input] #:http.request.field{:value input, :shape "ParquetPageSizeBytes"})

(clojure.core/defn- ser-record [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-data (:data input)) #:http.request.field{:name "Data", :shape "Data"})], :shape "Record", :type "structure"}))

(clojure.core/defn- ser-processor [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-processor-type (:type input)) #:http.request.field{:name "Type", :shape "ProcessorType"})], :shape "Processor", :type "structure"} (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-processor-parameter-list (input :parameters)) #:http.request.field{:name "Parameters", :shape "ProcessorParameterList"}))))

(clojure.core/defn- ser-data [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Data"})

(clojure.core/defn- ser-log-group-name [input] #:http.request.field{:value input, :shape "LogGroupName"})

(clojure.core/defn- ser-proportion [input] #:http.request.field{:value input, :shape "Proportion"})

(clojure.core/defn- ser-hive-json-ser-de [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HiveJsonSerDe", :type "structure"} (clojure.core/contains? input :timestamp-formats) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-non-empty-strings (input :timestamp-formats)) #:http.request.field{:name "TimestampFormats", :shape "ListOfNonEmptyStrings"}))))

(clojure.core/defn- ser-orc-row-index-stride [input] #:http.request.field{:value input, :shape "OrcRowIndexStride"})

(clojure.core/defn- ser-copy-command [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-data-table-name (:data-table-name input)) #:http.request.field{:name "DataTableName", :shape "DataTableName"})], :shape "CopyCommand", :type "structure"} (clojure.core/contains? input :data-table-columns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-table-columns (input :data-table-columns)) #:http.request.field{:name "DataTableColumns", :shape "DataTableColumns"})) (clojure.core/contains? input :copy-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-options (input :copy-options)) #:http.request.field{:name "CopyOptions", :shape "CopyOptions"}))))

(clojure.core/defn- ser-parquet-writer-version [input] #:http.request.field{:value (clojure.core/get {"V1" "V1", :v-1 "V1", "V2" "V2", :v-2 "V2"} input), :shape "ParquetWriterVersion"})

(clojure.core/defn- ser-awskms-key-arn [input] #:http.request.field{:value input, :shape "AWSKMSKeyARN"})

(clojure.core/defn- ser-no-encryption-config [input] #:http.request.field{:value (clojure.core/get {"NoEncryption" "NoEncryption", :no-encryption "NoEncryption"} input), :shape "NoEncryptionConfig"})

(clojure.core/defn- ser-s-3-backup-mode [input] #:http.request.field{:value (clojure.core/get {"Disabled" "Disabled", :disabled "Disabled", "Enabled" "Enabled", :enabled "Enabled"} input), :shape "S3BackupMode"})

(clojure.core/defn- ser-hec-acknowledgment-timeout-in-seconds [input] #:http.request.field{:value input, :shape "HECAcknowledgmentTimeoutInSeconds"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-orc-format-version [input] #:http.request.field{:value (clojure.core/get {"V0_11" "V0_11", :v-0-11 "V0_11", "V0_12" "V0_12", :v-0-12 "V0_12"} input), :shape "OrcFormatVersion"})

(clojure.core/defn- ser-processor-parameter-value [input] #:http.request.field{:value input, :shape "ProcessorParameterValue"})

(clojure.core/defn- ser-orc-ser-de [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OrcSerDe", :type "structure"} (clojure.core/contains? input :block-size-bytes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-size-bytes (input :block-size-bytes)) #:http.request.field{:name "BlockSizeBytes", :shape "BlockSizeBytes"})) (clojure.core/contains? input :row-index-stride) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-orc-row-index-stride (input :row-index-stride)) #:http.request.field{:name "RowIndexStride", :shape "OrcRowIndexStride"})) (clojure.core/contains? input :format-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-orc-format-version (input :format-version)) #:http.request.field{:name "FormatVersion", :shape "OrcFormatVersion"})) (clojure.core/contains? input :stripe-size-bytes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-orc-stripe-size-bytes (input :stripe-size-bytes)) #:http.request.field{:name "StripeSizeBytes", :shape "OrcStripeSizeBytes"})) (clojure.core/contains? input :dictionary-key-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-proportion (input :dictionary-key-threshold)) #:http.request.field{:name "DictionaryKeyThreshold", :shape "Proportion"})) (clojure.core/contains? input :bloom-filter-columns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-non-empty-strings-without-whitespace (input :bloom-filter-columns)) #:http.request.field{:name "BloomFilterColumns", :shape "ListOfNonEmptyStringsWithoutWhitespace"})) (clojure.core/contains? input :compression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-orc-compression (input :compression)) #:http.request.field{:name "Compression", :shape "OrcCompression"})) (clojure.core/contains? input :padding-tolerance) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-proportion (input :padding-tolerance)) #:http.request.field{:name "PaddingTolerance", :shape "Proportion"})) (clojure.core/contains? input :bloom-filter-false-positive-probability) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-proportion (input :bloom-filter-false-positive-probability)) #:http.request.field{:name "BloomFilterFalsePositiveProbability", :shape "Proportion"})) (clojure.core/contains? input :enable-padding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enable-padding)) #:http.request.field{:name "EnablePadding", :shape "BooleanObject"}))))

(clojure.core/defn- ser-orc-stripe-size-bytes [input] #:http.request.field{:value input, :shape "OrcStripeSizeBytes"})

(clojure.core/defn- ser-processing-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ProcessingConfiguration", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :enabled)) #:http.request.field{:name "Enabled", :shape "BooleanObject"})) (clojure.core/contains? input :processors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-processor-list (input :processors)) #:http.request.field{:name "Processors", :shape "ProcessorList"}))))

(clojure.core/defn- ser-data-table-columns [input] #:http.request.field{:value input, :shape "DataTableColumns"})

(clojure.core/defn- ser-processor-type [input] #:http.request.field{:value (clojure.core/get {"Lambda" "Lambda", :lambda "Lambda"} input), :shape "ProcessorType"})

(clojure.core/defn- ser-column-to-json-key-mappings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-non-empty-string-without-whitespace k) #:http.request.field{:map-info "key", :shape "NonEmptyStringWithoutWhitespace"}) (clojure.core/into (ser-non-empty-string v) #:http.request.field{:map-info "value", :shape "NonEmptyString"})])) input), :shape "ColumnToJsonKeyMappings", :type "map"})

(clojure.core/defn- ser-put-record-batch-request-entry-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-record coll) #:http.request.field{:shape "Record"}))) input), :shape "PutRecordBatchRequestEntryList", :type "list", :max 500, :min 1})

(clojure.core/defn- ser-redshift-destination-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RedshiftDestinationUpdate", :type "structure"} (clojure.core/contains? input :username) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-username (input :username)) #:http.request.field{:name "Username", :shape "Username"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-password (input :password)) #:http.request.field{:name "Password", :shape "Password"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :s-3-backup-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination-update (input :s-3-backup-update)) #:http.request.field{:name "S3BackupUpdate", :shape "S3DestinationUpdate"})) (clojure.core/contains? input :s-3-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination-update (input :s-3-update)) #:http.request.field{:name "S3Update", :shape "S3DestinationUpdate"})) (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"})) (clojure.core/contains? input :cluster-jdbcurl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cluster-jdbcurl (input :cluster-jdbcurl)) #:http.request.field{:name "ClusterJDBCURL", :shape "ClusterJDBCURL"})) (clojure.core/contains? input :retry-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redshift-retry-options (input :retry-options)) #:http.request.field{:name "RetryOptions", :shape "RedshiftRetryOptions"})) (clojure.core/contains? input :copy-command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-command (input :copy-command)) #:http.request.field{:name "CopyCommand", :shape "CopyCommand"})) (clojure.core/contains? input :s-3-backup-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redshift-s-3-backup-mode (input :s-3-backup-mode)) #:http.request.field{:name "S3BackupMode", :shape "RedshiftS3BackupMode"})) (clojure.core/contains? input :processing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-processing-configuration (input :processing-configuration)) #:http.request.field{:name "ProcessingConfiguration", :shape "ProcessingConfiguration"}))))

(clojure.core/defn- ser-boolean-object [input] #:http.request.field{:value input, :shape "BooleanObject"})

(clojure.core/defn- ser-schema-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SchemaConfiguration", :type "structure"} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string-without-whitespace (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "NonEmptyStringWithoutWhitespace"})) (clojure.core/contains? input :catalog-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string-without-whitespace (input :catalog-id)) #:http.request.field{:name "CatalogId", :shape "NonEmptyStringWithoutWhitespace"})) (clojure.core/contains? input :database-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string-without-whitespace (input :database-name)) #:http.request.field{:name "DatabaseName", :shape "NonEmptyStringWithoutWhitespace"})) (clojure.core/contains? input :table-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string-without-whitespace (input :table-name)) #:http.request.field{:name "TableName", :shape "NonEmptyStringWithoutWhitespace"})) (clojure.core/contains? input :region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string-without-whitespace (input :region)) #:http.request.field{:name "Region", :shape "NonEmptyStringWithoutWhitespace"})) (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string-without-whitespace (input :version-id)) #:http.request.field{:name "VersionId", :shape "NonEmptyStringWithoutWhitespace"}))))

(clojure.core/defn- ser-elasticsearch-type-name [input] #:http.request.field{:value input, :shape "ElasticsearchTypeName"})

(clojure.core/defn- ser-elasticsearch-destination-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ElasticsearchDestinationUpdate", :type "structure"} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "RoleARN"})) (clojure.core/contains? input :index-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-index-name (input :index-name)) #:http.request.field{:name "IndexName", :shape "ElasticsearchIndexName"})) (clojure.core/contains? input :buffering-hints) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-buffering-hints (input :buffering-hints)) #:http.request.field{:name "BufferingHints", :shape "ElasticsearchBufferingHints"})) (clojure.core/contains? input :s-3-update) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination-update (input :s-3-update)) #:http.request.field{:name "S3Update", :shape "S3DestinationUpdate"})) (clojure.core/contains? input :type-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-type-name (input :type-name)) #:http.request.field{:name "TypeName", :shape "ElasticsearchTypeName"})) (clojure.core/contains? input :index-rotation-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-index-rotation-period (input :index-rotation-period)) #:http.request.field{:name "IndexRotationPeriod", :shape "ElasticsearchIndexRotationPeriod"})) (clojure.core/contains? input :cloud-watch-logging-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logging-options (input :cloud-watch-logging-options)) #:http.request.field{:name "CloudWatchLoggingOptions", :shape "CloudWatchLoggingOptions"})) (clojure.core/contains? input :retry-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-retry-options (input :retry-options)) #:http.request.field{:name "RetryOptions", :shape "ElasticsearchRetryOptions"})) (clojure.core/contains? input :processing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-processing-configuration (input :processing-configuration)) #:http.request.field{:name "ProcessingConfiguration", :shape "ProcessingConfiguration"})) (clojure.core/contains? input :domain-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-domain-arn (input :domain-arn)) #:http.request.field{:name "DomainARN", :shape "ElasticsearchDomainARN"}))))

(clojure.core/defn- ser-processor-parameter-name [input] #:http.request.field{:value (clojure.core/get {"RoleArn" "RoleArn", :lambda-arn "LambdaArn", :number-of-retries "NumberOfRetries", :role-arn "RoleArn", "BufferSizeInMBs" "BufferSizeInMBs", :buffer-size-in-m-bs "BufferSizeInMBs", "LambdaArn" "LambdaArn", "BufferIntervalInSeconds" "BufferIntervalInSeconds", "NumberOfRetries" "NumberOfRetries", :buffer-interval-in-seconds "BufferIntervalInSeconds"} input), :shape "ProcessorParameterName"})

(clojure.core/defn- ser-splunk-retry-duration-in-seconds [input] #:http.request.field{:value input, :shape "SplunkRetryDurationInSeconds"})

(clojure.core/defn- ser-elasticsearch-buffering-hints [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ElasticsearchBufferingHints", :type "structure"} (clojure.core/contains? input :interval-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-buffering-interval-in-seconds (input :interval-in-seconds)) #:http.request.field{:name "IntervalInSeconds", :shape "ElasticsearchBufferingIntervalInSeconds"})) (clojure.core/contains? input :size-in-m-bs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-buffering-size-in-m-bs (input :size-in-m-bs)) #:http.request.field{:name "SizeInMBs", :shape "ElasticsearchBufferingSizeInMBs"}))))

(clojure.core/defn- ser-hec-token [input] #:http.request.field{:value input, :shape "HECToken"})

(clojure.core/defn- ser-open-x-json-ser-de [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OpenXJsonSerDe", :type "structure"} (clojure.core/contains? input :convert-dots-in-json-keys-to-underscores) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :convert-dots-in-json-keys-to-underscores)) #:http.request.field{:name "ConvertDotsInJsonKeysToUnderscores", :shape "BooleanObject"})) (clojure.core/contains? input :case-insensitive) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :case-insensitive)) #:http.request.field{:name "CaseInsensitive", :shape "BooleanObject"})) (clojure.core/contains? input :column-to-json-key-mappings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-column-to-json-key-mappings (input :column-to-json-key-mappings)) #:http.request.field{:name "ColumnToJsonKeyMappings", :shape "ColumnToJsonKeyMappings"}))))

(clojure.core/defn- ser-elasticsearch-buffering-size-in-m-bs [input] #:http.request.field{:value input, :shape "ElasticsearchBufferingSizeInMBs"})

(clojure.core/defn- ser-splunk-s-3-backup-mode [input] #:http.request.field{:value (clojure.core/get {"FailedEventsOnly" "FailedEventsOnly", :failed-events-only "FailedEventsOnly", "AllEvents" "AllEvents", :all-events "AllEvents"} input), :shape "SplunkS3BackupMode"})

(clojure.core/defn- ser-bucket-arn [input] #:http.request.field{:value input, :shape "BucketARN"})

(clojure.core/defn- req-delete-delivery-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delivery-stream-name (input :delivery-stream-name)) #:http.request.field{:name "DeliveryStreamName", :shape "DeliveryStreamName"})]}))

(clojure.core/defn- req-list-tags-for-delivery-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delivery-stream-name (input :delivery-stream-name)) #:http.request.field{:name "DeliveryStreamName", :shape "DeliveryStreamName"})]} (clojure.core/contains? input :exclusive-start-tag-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :exclusive-start-tag-key)) #:http.request.field{:name "ExclusiveStartTagKey", :shape "TagKey"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-tags-for-delivery-stream-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "ListTagsForDeliveryStreamInputLimit"}))))

(clojure.core/defn- req-list-delivery-streams-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-delivery-streams-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "ListDeliveryStreamsInputLimit"})) (clojure.core/contains? input :delivery-stream-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delivery-stream-type (input :delivery-stream-type)) #:http.request.field{:name "DeliveryStreamType", :shape "DeliveryStreamType"})) (clojure.core/contains? input :exclusive-start-delivery-stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delivery-stream-name (input :exclusive-start-delivery-stream-name)) #:http.request.field{:name "ExclusiveStartDeliveryStreamName", :shape "DeliveryStreamName"}))))

(clojure.core/defn- req-tag-delivery-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delivery-stream-name (input :delivery-stream-name)) #:http.request.field{:name "DeliveryStreamName", :shape "DeliveryStreamName"}) (clojure.core/into (ser-tag-delivery-stream-input-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagDeliveryStreamInputTagList"})]}))

(clojure.core/defn- req-untag-delivery-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delivery-stream-name (input :delivery-stream-name)) #:http.request.field{:name "DeliveryStreamName", :shape "DeliveryStreamName"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-create-delivery-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delivery-stream-name (input :delivery-stream-name)) #:http.request.field{:name "DeliveryStreamName", :shape "DeliveryStreamName"})]} (clojure.core/contains? input :delivery-stream-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delivery-stream-type (input :delivery-stream-type)) #:http.request.field{:name "DeliveryStreamType", :shape "DeliveryStreamType"})) (clojure.core/contains? input :kinesis-stream-source-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-stream-source-configuration (input :kinesis-stream-source-configuration)) #:http.request.field{:name "KinesisStreamSourceConfiguration", :shape "KinesisStreamSourceConfiguration"})) (clojure.core/contains? input :s-3-destination-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination-configuration (input :s-3-destination-configuration)) #:http.request.field{:name "S3DestinationConfiguration", :shape "S3DestinationConfiguration", :deprecated true})) (clojure.core/contains? input :extended-s-3-destination-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extended-s-3-destination-configuration (input :extended-s-3-destination-configuration)) #:http.request.field{:name "ExtendedS3DestinationConfiguration", :shape "ExtendedS3DestinationConfiguration"})) (clojure.core/contains? input :redshift-destination-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redshift-destination-configuration (input :redshift-destination-configuration)) #:http.request.field{:name "RedshiftDestinationConfiguration", :shape "RedshiftDestinationConfiguration"})) (clojure.core/contains? input :elasticsearch-destination-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-destination-configuration (input :elasticsearch-destination-configuration)) #:http.request.field{:name "ElasticsearchDestinationConfiguration", :shape "ElasticsearchDestinationConfiguration"})) (clojure.core/contains? input :splunk-destination-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-splunk-destination-configuration (input :splunk-destination-configuration)) #:http.request.field{:name "SplunkDestinationConfiguration", :shape "SplunkDestinationConfiguration"}))))

(clojure.core/defn- req-update-destination-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delivery-stream-name (input :delivery-stream-name)) #:http.request.field{:name "DeliveryStreamName", :shape "DeliveryStreamName"}) (clojure.core/into (ser-delivery-stream-version-id (input :current-delivery-stream-version-id)) #:http.request.field{:name "CurrentDeliveryStreamVersionId", :shape "DeliveryStreamVersionId"}) (clojure.core/into (ser-destination-id (input :destination-id)) #:http.request.field{:name "DestinationId", :shape "DestinationId"})]} (clojure.core/contains? input :s-3-destination-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination-update (input :s-3-destination-update)) #:http.request.field{:name "S3DestinationUpdate", :shape "S3DestinationUpdate", :deprecated true})) (clojure.core/contains? input :extended-s-3-destination-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extended-s-3-destination-update (input :extended-s-3-destination-update)) #:http.request.field{:name "ExtendedS3DestinationUpdate", :shape "ExtendedS3DestinationUpdate"})) (clojure.core/contains? input :redshift-destination-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redshift-destination-update (input :redshift-destination-update)) #:http.request.field{:name "RedshiftDestinationUpdate", :shape "RedshiftDestinationUpdate"})) (clojure.core/contains? input :elasticsearch-destination-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-destination-update (input :elasticsearch-destination-update)) #:http.request.field{:name "ElasticsearchDestinationUpdate", :shape "ElasticsearchDestinationUpdate"})) (clojure.core/contains? input :splunk-destination-update) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-splunk-destination-update (input :splunk-destination-update)) #:http.request.field{:name "SplunkDestinationUpdate", :shape "SplunkDestinationUpdate"}))))

(clojure.core/defn- req-describe-delivery-stream-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delivery-stream-name (input :delivery-stream-name)) #:http.request.field{:name "DeliveryStreamName", :shape "DeliveryStreamName"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-delivery-stream-input-limit (input :limit)) #:http.request.field{:name "Limit", :shape "DescribeDeliveryStreamInputLimit"})) (clojure.core/contains? input :exclusive-start-destination-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-destination-id (input :exclusive-start-destination-id)) #:http.request.field{:name "ExclusiveStartDestinationId", :shape "DestinationId"}))))

(clojure.core/defn- req-put-record-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delivery-stream-name (input :delivery-stream-name)) #:http.request.field{:name "DeliveryStreamName", :shape "DeliveryStreamName"}) (clojure.core/into (ser-record (input :record)) #:http.request.field{:name "Record", :shape "Record"})]}))

(clojure.core/defn- req-put-record-batch-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-delivery-stream-name (input :delivery-stream-name)) #:http.request.field{:name "DeliveryStreamName", :shape "DeliveryStreamName"}) (clojure.core/into (ser-put-record-batch-request-entry-list (input :records)) #:http.request.field{:name "Records", :shape "PutRecordBatchRequestEntryList"})]}))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/processor-list (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/processor))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/username (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/delete-delivery-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/deserializer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/open-x-json-ser-de :portkey.aws.firehose.-2015-08-04/hive-json-ser-de]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/non-negative-integer-object (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.splunk-retry-options/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/splunk-retry-duration-in-seconds))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/splunk-retry-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.splunk-retry-options/duration-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/copy-options (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/delete-delivery-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.list-tags-for-delivery-stream-input/exclusive-start-tag-key (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/tag-key))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.list-tags-for-delivery-stream-input/limit (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/list-tags-for-delivery-stream-input-limit))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/list-tags-for-delivery-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-name] :opt-un [:portkey.aws.firehose.-2015-08-04.list-tags-for-delivery-stream-input/exclusive-start-tag-key :portkey.aws.firehose.-2015-08-04.list-tags-for-delivery-stream-input/limit]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/hec-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.list-delivery-streams-input/limit (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/list-delivery-streams-input-limit))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.list-delivery-streams-input/exclusive-start-delivery-stream-name (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/delivery-stream-name))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/list-delivery-streams-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.list-delivery-streams-input/limit :portkey.aws.firehose.-2015-08-04/delivery-stream-type :portkey.aws.firehose.-2015-08-04.list-delivery-streams-input/exclusive-start-delivery-stream-name]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/update-destination-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(?!\s*$).+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/describe-delivery-stream-input-limit (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/tag-delivery-stream-input-tag-list (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/tag :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/serializer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/parquet-ser-de :portkey.aws.firehose.-2015-08-04/orc-ser-de]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/non-empty-string-without-whitespace (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^\S+$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-configuration/s-3-configuration (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-configuration))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-configuration/retry-options (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/redshift-retry-options))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-configuration/s-3-backup-mode (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/redshift-s-3-backup-mode))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-configuration/s-3-backup-configuration (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-configuration))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/redshift-destination-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04/cluster-jdbcurl :portkey.aws.firehose.-2015-08-04/copy-command :portkey.aws.firehose.-2015-08-04/username :portkey.aws.firehose.-2015-08-04/password :portkey.aws.firehose.-2015-08-04.redshift-destination-configuration/s-3-configuration] :opt-un [:portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04.redshift-destination-configuration/retry-options :portkey.aws.firehose.-2015-08-04.redshift-destination-configuration/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/processing-configuration :portkey.aws.firehose.-2015-08-04.redshift-destination-configuration/s-3-backup-configuration]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.extended-s-3-destination-configuration/s-3-backup-configuration (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-configuration))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/extended-s-3-destination-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04/bucket-arn] :opt-un [:portkey.aws.firehose.-2015-08-04/prefix :portkey.aws.firehose.-2015-08-04/encryption-configuration :portkey.aws.firehose.-2015-08-04/data-format-conversion-configuration :portkey.aws.firehose.-2015-08-04/buffering-hints :portkey.aws.firehose.-2015-08-04/compression-format :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/processing-configuration :portkey.aws.firehose.-2015-08-04.extended-s-3-destination-configuration/s-3-backup-configuration]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/s-3-destination-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04/bucket-arn] :opt-un [:portkey.aws.firehose.-2015-08-04/prefix :portkey.aws.firehose.-2015-08-04/buffering-hints :portkey.aws.firehose.-2015-08-04/compression-format :portkey.aws.firehose.-2015-08-04/encryption-configuration :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/create-delivery-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/kinesis-stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 6 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/encryption-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/no-encryption-config :portkey.aws.firehose.-2015-08-04/kms-encryption-config]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-retry-options/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/redshift-retry-duration-in-seconds))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/redshift-retry-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.redshift-retry-options/duration-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/source-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/kinesis-stream-source-description]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-index-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/data-table-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/untag-delivery-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/delivery-stream-type #{:direct-put "KinesisStreamAsSource" :kinesis-stream-as-source "DirectPut"})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/block-size-bytes (clojure.spec.alpha/int-in 67108864 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/delivery-stream-name-list (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/delivery-stream-name))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-retry-duration-in-seconds (clojure.spec.alpha/int-in 0 7200))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/list-tags-for-delivery-stream-input-limit (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/tag-delivery-stream-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/kinesis-stream-source-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/kinesis-stream-arn :portkey.aws.firehose.-2015-08-04/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/index-name (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-index-name))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/buffering-hints (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-buffering-hints))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/s-3-configuration (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-configuration))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/type-name (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-type-name))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/index-rotation-period (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-index-rotation-period))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/retry-options (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-retry-options))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/s-3-backup-mode (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-s-3-backup-mode))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/domain-arn (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-domain-arn))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-destination-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/domain-arn :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/index-name :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/type-name :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/s-3-configuration] :opt-un [:portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/buffering-hints :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/index-rotation-period :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/retry-options :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-configuration/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/processing-configuration]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.data-format-conversion-configuration/enabled (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/boolean-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/data-format-conversion-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/schema-configuration :portkey.aws.firehose.-2015-08-04/input-format-configuration :portkey.aws.firehose.-2015-08-04/output-format-configuration :portkey.aws.firehose.-2015-08-04.data-format-conversion-configuration/enabled]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/delivery-stream-version-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 50)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/output-format-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/serializer]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/list-of-non-empty-strings (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/buffering-hints (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/size-in-m-bs :portkey.aws.firehose.-2015-08-04/interval-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/error-message))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-s-3-backup-mode #{"AllDocuments" "FailedDocumentsOnly" :all-documents :failed-documents-only})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/redshift-s-3-backup-mode #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/error-message))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.splunk-destination-configuration/s-3-configuration (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-configuration))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.splunk-destination-configuration/retry-options (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/splunk-retry-options))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.splunk-destination-configuration/s-3-backup-mode (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/splunk-s-3-backup-mode))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/splunk-destination-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/hec-endpoint :portkey.aws.firehose.-2015-08-04/hec-endpoint-type :portkey.aws.firehose.-2015-08-04/hec-token :portkey.aws.firehose.-2015-08-04.splunk-destination-configuration/s-3-configuration] :opt-un [:portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04.splunk-destination-configuration/retry-options :portkey.aws.firehose.-2015-08-04.splunk-destination-configuration/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/hec-acknowledgment-timeout-in-seconds :portkey.aws.firehose.-2015-08-04/processing-configuration]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/compression-format #{:uncompressed "GZIP" "UNCOMPRESSED" :snappy "ZIP" :gzip :zip "Snappy"})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.splunk-destination-update/s-3-update (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-update))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.splunk-destination-update/retry-options (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/splunk-retry-options))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.splunk-destination-update/s-3-backup-mode (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/splunk-s-3-backup-mode))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/splunk-destination-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/hec-endpoint :portkey.aws.firehose.-2015-08-04.splunk-destination-update/s-3-update :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04/hec-endpoint-type :portkey.aws.firehose.-2015-08-04.splunk-destination-update/retry-options :portkey.aws.firehose.-2015-08-04.splunk-destination-update/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/hec-acknowledgment-timeout-in-seconds :portkey.aws.firehose.-2015-08-04/processing-configuration :portkey.aws.firehose.-2015-08-04/hec-token]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-retry-options/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-retry-duration-in-seconds))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-retry-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.elasticsearch-retry-options/duration-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/list-delivery-streams-input-limit (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/input-format-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/deserializer]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/list-of-non-empty-strings-without-whitespace (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/non-empty-string-without-whitespace))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/parquet-compression #{:uncompressed "GZIP" "UNCOMPRESSED" :snappy :gzip "SNAPPY"})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/error-message))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/processor-parameter-list (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/processor-parameter))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.put-record-batch-response-entry/record-id (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/put-response-record-id))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/put-record-batch-response-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.put-record-batch-response-entry/record-id :portkey.aws.firehose.-2015-08-04/error-code :portkey.aws.firehose.-2015-08-04/error-message]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.processor-parameter/parameter-name (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/processor-parameter-name))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.processor-parameter/parameter-value (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/processor-parameter-value))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/processor-parameter (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04.processor-parameter/parameter-name :portkey.aws.firehose.-2015-08-04.processor-parameter/parameter-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.put-record-batch-output/failed-put-count (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/non-negative-integer-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.put-record-batch-output/request-responses (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/put-record-batch-response-entry-list))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/put-record-batch-output (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04.put-record-batch-output/failed-put-count :portkey.aws.firehose.-2015-08-04.put-record-batch-output/request-responses] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/destination-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/size-in-m-bs (clojure.spec.alpha/int-in 1 128))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.parquet-ser-de/page-size-bytes (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/parquet-page-size-bytes))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.parquet-ser-de/compression (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/parquet-compression))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.parquet-ser-de/enable-dictionary-compression (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/boolean-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.parquet-ser-de/max-padding-bytes (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/non-negative-integer-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.parquet-ser-de/writer-version (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/parquet-writer-version))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/parquet-ser-de (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/block-size-bytes :portkey.aws.firehose.-2015-08-04.parquet-ser-de/page-size-bytes :portkey.aws.firehose.-2015-08-04.parquet-ser-de/compression :portkey.aws.firehose.-2015-08-04.parquet-ser-de/enable-dictionary-compression :portkey.aws.firehose.-2015-08-04.parquet-ser-de/max-padding-bytes :portkey.aws.firehose.-2015-08-04.parquet-ser-de/writer-version]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.cloud-watch-logging-options/enabled (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/boolean-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.cloud-watch-logging-options/enabled :portkey.aws.firehose.-2015-08-04/log-group-name :portkey.aws.firehose.-2015-08-04/log-stream-name]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-index-rotation-period #{"OneWeek" :one-month "NoRotation" :no-rotation "OneDay" "OneMonth" "OneHour" :one-day :one-hour :one-week})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/index-name (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-index-name))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/buffering-hints (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-buffering-hints))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/type-name (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-type-name))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/index-rotation-period (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-index-rotation-period))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/retry-options (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-retry-options))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/s-3-backup-mode (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-s-3-backup-mode))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/domain-arn (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-domain-arn))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-destination-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/index-name :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/buffering-hints :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/type-name :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/index-rotation-period :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/retry-options :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/s-3-destination-description :portkey.aws.firehose.-2015-08-04/processing-configuration :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-description/domain-arn]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-description/retry-options (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/redshift-retry-options))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-description/s-3-backup-description (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-description))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-description/s-3-backup-mode (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/redshift-s-3-backup-mode))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/redshift-destination-description (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04/cluster-jdbcurl :portkey.aws.firehose.-2015-08-04/copy-command :portkey.aws.firehose.-2015-08-04/username :portkey.aws.firehose.-2015-08-04/s-3-destination-description] :opt-un [:portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04.redshift-destination-description/retry-options :portkey.aws.firehose.-2015-08-04.redshift-destination-description/s-3-backup-description :portkey.aws.firehose.-2015-08-04.redshift-destination-description/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/processing-configuration]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/interval-in-seconds (clojure.spec.alpha/int-in 60 900))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/hec-endpoint-type #{:raw "Event" "Raw" :event})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/redshift-retry-duration-in-seconds (clojure.spec.alpha/int-in 0 7200))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/cluster-jdbcurl (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"jdbc:(redshift|postgresql)://((?!-)[A-Za-z0-9-]{1,63}(?<!-)\.)+redshift\.amazonaws\.com:\d{1,5}/[a-zA-Z0-9_$]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/describe-delivery-stream-output (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/kms-encryption-config (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/awskms-key-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/error-message))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.extended-s-3-destination-update/s-3-backup-update (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-update))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/extended-s-3-destination-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/prefix :portkey.aws.firehose.-2015-08-04/encryption-configuration :portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04.extended-s-3-destination-update/s-3-backup-update :portkey.aws.firehose.-2015-08-04/data-format-conversion-configuration :portkey.aws.firehose.-2015-08-04/buffering-hints :portkey.aws.firehose.-2015-08-04/compression-format :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/processing-configuration :portkey.aws.firehose.-2015-08-04/bucket-arn]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-domain-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.tag-delivery-stream-input/tags (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/tag-delivery-stream-input-tag-list))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/tag-delivery-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-name :portkey.aws.firehose.-2015-08-04.tag-delivery-stream-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.list-delivery-streams-output/delivery-stream-names (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/delivery-stream-name-list))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.list-delivery-streams-output/has-more-delivery-streams (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/boolean-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/list-delivery-streams-output (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04.list-delivery-streams-output/delivery-stream-names :portkey.aws.firehose.-2015-08-04.list-delivery-streams-output/has-more-delivery-streams] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/log-stream-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/orc-compression #{:zlib :snappy "NONE" "ZLIB" "SNAPPY" :none})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.extended-s-3-destination-description/s-3-backup-description (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-description))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/extended-s-3-destination-description (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04/bucket-arn :portkey.aws.firehose.-2015-08-04/buffering-hints :portkey.aws.firehose.-2015-08-04/compression-format :portkey.aws.firehose.-2015-08-04/encryption-configuration] :opt-un [:portkey.aws.firehose.-2015-08-04/prefix :portkey.aws.firehose.-2015-08-04/data-format-conversion-configuration :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04.extended-s-3-destination-description/s-3-backup-description :portkey.aws.firehose.-2015-08-04/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/processing-configuration]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/s-3-destination-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04/bucket-arn :portkey.aws.firehose.-2015-08-04/prefix :portkey.aws.firehose.-2015-08-04/buffering-hints :portkey.aws.firehose.-2015-08-04/compression-format :portkey.aws.firehose.-2015-08-04/encryption-configuration :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-buffering-interval-in-seconds (clojure.spec.alpha/int-in 60 900))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.untag-delivery-stream-input/tag-keys (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/untag-delivery-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-name :portkey.aws.firehose.-2015-08-04.untag-delivery-stream-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/delivery-start-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/destination-description-list (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/destination-description))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/delivery-stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/parquet-page-size-bytes (clojure.spec.alpha/int-in 65536 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/destination-description (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/destination-id] :opt-un [:portkey.aws.firehose.-2015-08-04/s-3-destination-description :portkey.aws.firehose.-2015-08-04/extended-s-3-destination-description :portkey.aws.firehose.-2015-08-04/redshift-destination-description :portkey.aws.firehose.-2015-08-04/elasticsearch-destination-description :portkey.aws.firehose.-2015-08-04/splunk-destination-description]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/delivery-stream-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/list-tags-for-delivery-stream-output-tag-list (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/tag :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/create-delivery-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-name] :opt-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-type :portkey.aws.firehose.-2015-08-04/kinesis-stream-source-configuration :portkey.aws.firehose.-2015-08-04/s-3-destination-configuration :portkey.aws.firehose.-2015-08-04/extended-s-3-destination-configuration :portkey.aws.firehose.-2015-08-04/redshift-destination-configuration :portkey.aws.firehose.-2015-08-04/elasticsearch-destination-configuration :portkey.aws.firehose.-2015-08-04/splunk-destination-configuration]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/record (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/data] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/error-message))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.processor/type (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/processor-type))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.processor/parameters (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/processor-parameter-list))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/processor (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04.processor/type] :opt-un [:portkey.aws.firehose.-2015-08-04.processor/parameters]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/data clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/log-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.update-destination-input/current-delivery-stream-version-id (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/delivery-stream-version-id))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/update-destination-input (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-name :portkey.aws.firehose.-2015-08-04.update-destination-input/current-delivery-stream-version-id :portkey.aws.firehose.-2015-08-04/destination-id] :opt-un [:portkey.aws.firehose.-2015-08-04/s-3-destination-update :portkey.aws.firehose.-2015-08-04/extended-s-3-destination-update :portkey.aws.firehose.-2015-08-04/redshift-destination-update :portkey.aws.firehose.-2015-08-04/elasticsearch-destination-update :portkey.aws.firehose.-2015-08-04/splunk-destination-update]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/proportion clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.hive-json-ser-de/timestamp-formats (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/list-of-non-empty-strings))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/hive-json-ser-de (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.hive-json-ser-de/timestamp-formats]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/orc-row-index-stride (clojure.spec.alpha/int-in 1000 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/copy-command (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/data-table-name] :opt-un [:portkey.aws.firehose.-2015-08-04/data-table-columns :portkey.aws.firehose.-2015-08-04/copy-options]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/parquet-writer-version #{"V2" "V1" :v-1 :v-2})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/awskms-key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/no-encryption-config #{"NoEncryption" :no-encryption})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.put-record-output/record-id (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/put-response-record-id))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/put-record-output (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04.put-record-output/record-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/s-3-backup-mode #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/hec-acknowledgment-timeout-in-seconds (clojure.spec.alpha/int-in 180 600))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.tag/key (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/tag-key))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.tag/value (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/tag-value))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04.tag/key] :opt-un [:portkey.aws.firehose.-2015-08-04.tag/value]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/kinesis-stream-source-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/kinesis-stream-arn :portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04/delivery-start-timestamp]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/orc-format-version #{:v-0-12 :v-0-11 "V0_12" "V0_11"})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/delivery-stream-status #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/put-record-batch-response-entry-list (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/put-record-batch-response-entry :min-count 1 :max-count 500))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/processor-parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/error-message))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.orc-ser-de/row-index-stride (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/orc-row-index-stride))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.orc-ser-de/format-version (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/orc-format-version))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.orc-ser-de/stripe-size-bytes (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/orc-stripe-size-bytes))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.orc-ser-de/dictionary-key-threshold (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/proportion))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.orc-ser-de/bloom-filter-columns (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/list-of-non-empty-strings-without-whitespace))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.orc-ser-de/compression (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/orc-compression))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.orc-ser-de/padding-tolerance (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/proportion))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.orc-ser-de/bloom-filter-false-positive-probability (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/proportion))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.orc-ser-de/enable-padding (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/boolean-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/orc-ser-de (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/block-size-bytes :portkey.aws.firehose.-2015-08-04.orc-ser-de/row-index-stride :portkey.aws.firehose.-2015-08-04.orc-ser-de/format-version :portkey.aws.firehose.-2015-08-04.orc-ser-de/stripe-size-bytes :portkey.aws.firehose.-2015-08-04.orc-ser-de/dictionary-key-threshold :portkey.aws.firehose.-2015-08-04.orc-ser-de/bloom-filter-columns :portkey.aws.firehose.-2015-08-04.orc-ser-de/compression :portkey.aws.firehose.-2015-08-04.orc-ser-de/padding-tolerance :portkey.aws.firehose.-2015-08-04.orc-ser-de/bloom-filter-false-positive-probability :portkey.aws.firehose.-2015-08-04.orc-ser-de/enable-padding]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/s-3-destination-description (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04/bucket-arn :portkey.aws.firehose.-2015-08-04/buffering-hints :portkey.aws.firehose.-2015-08-04/compression-format :portkey.aws.firehose.-2015-08-04/encryption-configuration] :opt-un [:portkey.aws.firehose.-2015-08-04/prefix :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/orc-stripe-size-bytes (clojure.spec.alpha/int-in 8388608 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.processing-configuration/enabled (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/boolean-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.processing-configuration/processors (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/processor-list))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/processing-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.processing-configuration/enabled :portkey.aws.firehose.-2015-08-04.processing-configuration/processors]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/data-table-columns (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/processor-type #{:lambda "Lambda"})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/put-response-record-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/column-to-json-key-mappings (clojure.spec.alpha/map-of :portkey.aws.firehose.-2015-08-04/non-empty-string-without-whitespace :portkey.aws.firehose.-2015-08-04/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.list-tags-for-delivery-stream-output/tags (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/list-tags-for-delivery-stream-output-tag-list))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.list-tags-for-delivery-stream-output/has-more-tags (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/boolean-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/list-tags-for-delivery-stream-output (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04.list-tags-for-delivery-stream-output/tags :portkey.aws.firehose.-2015-08-04.list-tags-for-delivery-stream-output/has-more-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/put-record-batch-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.firehose.-2015-08-04/record :min-count 1 :max-count 500))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-update/s-3-backup-update (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-update))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-update/s-3-update (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-update))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-update/retry-options (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/redshift-retry-options))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.redshift-destination-update/s-3-backup-mode (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/redshift-s-3-backup-mode))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/redshift-destination-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/username :portkey.aws.firehose.-2015-08-04/password :portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04.redshift-destination-update/s-3-backup-update :portkey.aws.firehose.-2015-08-04.redshift-destination-update/s-3-update :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04/cluster-jdbcurl :portkey.aws.firehose.-2015-08-04.redshift-destination-update/retry-options :portkey.aws.firehose.-2015-08-04/copy-command :portkey.aws.firehose.-2015-08-04.redshift-destination-update/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/processing-configuration]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.schema-configuration/role-arn (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/non-empty-string-without-whitespace))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.schema-configuration/catalog-id (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/non-empty-string-without-whitespace))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.schema-configuration/database-name (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/non-empty-string-without-whitespace))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.schema-configuration/table-name (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/non-empty-string-without-whitespace))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.schema-configuration/region (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/non-empty-string-without-whitespace))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.schema-configuration/version-id (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/non-empty-string-without-whitespace))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/schema-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.schema-configuration/role-arn :portkey.aws.firehose.-2015-08-04.schema-configuration/catalog-id :portkey.aws.firehose.-2015-08-04.schema-configuration/database-name :portkey.aws.firehose.-2015-08-04.schema-configuration/table-name :portkey.aws.firehose.-2015-08-04.schema-configuration/region :portkey.aws.firehose.-2015-08-04.schema-configuration/version-id]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/index-name (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-index-name))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/buffering-hints (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-buffering-hints))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/s-3-update (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/s-3-destination-update))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/type-name (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-type-name))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/index-rotation-period (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-index-rotation-period))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/retry-options (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-retry-options))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/domain-arn (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-domain-arn))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-destination-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/role-arn :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/index-name :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/buffering-hints :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/s-3-update :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/type-name :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/index-rotation-period :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/retry-options :portkey.aws.firehose.-2015-08-04/processing-configuration :portkey.aws.firehose.-2015-08-04.elasticsearch-destination-update/domain-arn]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.describe-delivery-stream-input/limit (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/describe-delivery-stream-input-limit))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.describe-delivery-stream-input/exclusive-start-destination-id (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/destination-id))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/describe-delivery-stream-input (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-name] :opt-un [:portkey.aws.firehose.-2015-08-04.describe-delivery-stream-input/limit :portkey.aws.firehose.-2015-08-04.describe-delivery-stream-input/exclusive-start-destination-id]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/processor-parameter-name #{"RoleArn" :lambda-arn :number-of-retries :role-arn "BufferSizeInMBs" :buffer-size-in-m-bs "LambdaArn" "BufferIntervalInSeconds" "NumberOfRetries" :buffer-interval-in-seconds})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/splunk-retry-duration-in-seconds (clojure.spec.alpha/int-in 0 7200))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/put-record-input (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-name :portkey.aws.firehose.-2015-08-04/record] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-buffering-hints/interval-in-seconds (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-buffering-interval-in-seconds))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.elasticsearch-buffering-hints/size-in-m-bs (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/elasticsearch-buffering-size-in-m-bs))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-buffering-hints (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.elasticsearch-buffering-hints/interval-in-seconds :portkey.aws.firehose.-2015-08-04.elasticsearch-buffering-hints/size-in-m-bs]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.splunk-destination-description/retry-options (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/splunk-retry-options))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.splunk-destination-description/s-3-backup-mode (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/splunk-s-3-backup-mode))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/splunk-destination-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04/hec-endpoint :portkey.aws.firehose.-2015-08-04/cloud-watch-logging-options :portkey.aws.firehose.-2015-08-04/hec-endpoint-type :portkey.aws.firehose.-2015-08-04.splunk-destination-description/retry-options :portkey.aws.firehose.-2015-08-04.splunk-destination-description/s-3-backup-mode :portkey.aws.firehose.-2015-08-04/hec-acknowledgment-timeout-in-seconds :portkey.aws.firehose.-2015-08-04/s-3-destination-description :portkey.aws.firehose.-2015-08-04/processing-configuration :portkey.aws.firehose.-2015-08-04/hec-token]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/hec-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.open-x-json-ser-de/convert-dots-in-json-keys-to-underscores (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/boolean-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.open-x-json-ser-de/case-insensitive (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/boolean-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/open-x-json-ser-de (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.firehose.-2015-08-04.open-x-json-ser-de/convert-dots-in-json-keys-to-underscores :portkey.aws.firehose.-2015-08-04.open-x-json-ser-de/case-insensitive :portkey.aws.firehose.-2015-08-04/column-to-json-key-mappings]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/elasticsearch-buffering-size-in-m-bs (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.delivery-stream-description/create-timestamp (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/timestamp))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.delivery-stream-description/last-update-timestamp (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/timestamp))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.delivery-stream-description/source (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/source-description))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.delivery-stream-description/version-id (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/delivery-stream-version-id))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.delivery-stream-description/has-more-destinations (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/boolean-object))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.delivery-stream-description/destinations (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/destination-description-list))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/delivery-stream-description (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-name :portkey.aws.firehose.-2015-08-04/delivery-stream-arn :portkey.aws.firehose.-2015-08-04/delivery-stream-status :portkey.aws.firehose.-2015-08-04/delivery-stream-type :portkey.aws.firehose.-2015-08-04.delivery-stream-description/version-id :portkey.aws.firehose.-2015-08-04.delivery-stream-description/destinations :portkey.aws.firehose.-2015-08-04.delivery-stream-description/has-more-destinations] :opt-un [:portkey.aws.firehose.-2015-08-04.delivery-stream-description/create-timestamp :portkey.aws.firehose.-2015-08-04.delivery-stream-description/last-update-timestamp :portkey.aws.firehose.-2015-08-04.delivery-stream-description/source]))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/splunk-s-3-backup-mode #{"FailedEventsOnly" :all-events :failed-events-only "AllEvents"})

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04.put-record-batch-input/records (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/put-record-batch-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/put-record-batch-input (clojure.spec.alpha/keys :req-un [:portkey.aws.firehose.-2015-08-04/delivery-stream-name :portkey.aws.firehose.-2015-08-04.put-record-batch-input/records] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.firehose.-2015-08-04/bucket-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:.*" s__27967__auto__))))

(clojure.core/defn delete-delivery-stream ([delete-delivery-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-delivery-stream-input delete-delivery-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.firehose.-2015-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.firehose.-2015-08-04/delete-delivery-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-04", :http.request.configuration/service-id "Firehose", :http.request.spec/input-spec :portkey.aws.firehose.-2015-08-04/delete-delivery-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDeliveryStream", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.firehose.-2015-08-04/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.firehose.-2015-08-04/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-delivery-stream :args (clojure.spec.alpha/tuple :portkey.aws.firehose.-2015-08-04/delete-delivery-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/delete-delivery-stream-output))

(clojure.core/defn untag-delivery-stream ([untag-delivery-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-untag-delivery-stream-input untag-delivery-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.firehose.-2015-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.firehose.-2015-08-04/untag-delivery-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-04", :http.request.configuration/service-id "Firehose", :http.request.spec/input-spec :portkey.aws.firehose.-2015-08-04/untag-delivery-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagDeliveryStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.firehose.-2015-08-04/resource-not-found-exception, "ResourceInUseException" :portkey.aws.firehose.-2015-08-04/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.firehose.-2015-08-04/invalid-argument-exception, "LimitExceededException" :portkey.aws.firehose.-2015-08-04/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef untag-delivery-stream :args (clojure.spec.alpha/tuple :portkey.aws.firehose.-2015-08-04/untag-delivery-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/untag-delivery-stream-output))

(clojure.core/defn list-tags-for-delivery-stream ([list-tags-for-delivery-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-tags-for-delivery-stream-input list-tags-for-delivery-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.firehose.-2015-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.firehose.-2015-08-04/list-tags-for-delivery-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-04", :http.request.configuration/service-id "Firehose", :http.request.spec/input-spec :portkey.aws.firehose.-2015-08-04/list-tags-for-delivery-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForDeliveryStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.firehose.-2015-08-04/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.firehose.-2015-08-04/invalid-argument-exception, "LimitExceededException" :portkey.aws.firehose.-2015-08-04/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-delivery-stream :args (clojure.spec.alpha/tuple :portkey.aws.firehose.-2015-08-04/list-tags-for-delivery-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/list-tags-for-delivery-stream-output))

(clojure.core/defn tag-delivery-stream ([tag-delivery-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-tag-delivery-stream-input tag-delivery-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.firehose.-2015-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.firehose.-2015-08-04/tag-delivery-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-04", :http.request.configuration/service-id "Firehose", :http.request.spec/input-spec :portkey.aws.firehose.-2015-08-04/tag-delivery-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagDeliveryStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.firehose.-2015-08-04/resource-not-found-exception, "ResourceInUseException" :portkey.aws.firehose.-2015-08-04/resource-in-use-exception, "InvalidArgumentException" :portkey.aws.firehose.-2015-08-04/invalid-argument-exception, "LimitExceededException" :portkey.aws.firehose.-2015-08-04/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef tag-delivery-stream :args (clojure.spec.alpha/tuple :portkey.aws.firehose.-2015-08-04/tag-delivery-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/tag-delivery-stream-output))

(clojure.core/defn list-delivery-streams ([] (list-delivery-streams {})) ([list-delivery-streams-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-delivery-streams-input list-delivery-streams-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.firehose.-2015-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.firehose.-2015-08-04/list-delivery-streams-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-04", :http.request.configuration/service-id "Firehose", :http.request.spec/input-spec :portkey.aws.firehose.-2015-08-04/list-delivery-streams-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDeliveryStreams", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-delivery-streams :args (clojure.spec.alpha/? :portkey.aws.firehose.-2015-08-04/list-delivery-streams-input) :ret (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/list-delivery-streams-output))

(clojure.core/defn put-record-batch ([put-record-batch-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-record-batch-input put-record-batch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.firehose.-2015-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.firehose.-2015-08-04/put-record-batch-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-04", :http.request.configuration/service-id "Firehose", :http.request.spec/input-spec :portkey.aws.firehose.-2015-08-04/put-record-batch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutRecordBatch", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.firehose.-2015-08-04/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.firehose.-2015-08-04/invalid-argument-exception, "ServiceUnavailableException" :portkey.aws.firehose.-2015-08-04/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef put-record-batch :args (clojure.spec.alpha/tuple :portkey.aws.firehose.-2015-08-04/put-record-batch-input) :ret (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/put-record-batch-output))

(clojure.core/defn put-record ([put-record-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-record-input put-record-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.firehose.-2015-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.firehose.-2015-08-04/put-record-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-04", :http.request.configuration/service-id "Firehose", :http.request.spec/input-spec :portkey.aws.firehose.-2015-08-04/put-record-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutRecord", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.firehose.-2015-08-04/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.firehose.-2015-08-04/invalid-argument-exception, "ServiceUnavailableException" :portkey.aws.firehose.-2015-08-04/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef put-record :args (clojure.spec.alpha/tuple :portkey.aws.firehose.-2015-08-04/put-record-input) :ret (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/put-record-output))

(clojure.core/defn create-delivery-stream ([create-delivery-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-delivery-stream-input create-delivery-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.firehose.-2015-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.firehose.-2015-08-04/create-delivery-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-04", :http.request.configuration/service-id "Firehose", :http.request.spec/input-spec :portkey.aws.firehose.-2015-08-04/create-delivery-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDeliveryStream", :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.firehose.-2015-08-04/invalid-argument-exception, "LimitExceededException" :portkey.aws.firehose.-2015-08-04/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.firehose.-2015-08-04/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef create-delivery-stream :args (clojure.spec.alpha/tuple :portkey.aws.firehose.-2015-08-04/create-delivery-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/create-delivery-stream-output))

(clojure.core/defn describe-delivery-stream ([describe-delivery-stream-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-delivery-stream-input describe-delivery-stream-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.firehose.-2015-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.firehose.-2015-08-04/describe-delivery-stream-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-04", :http.request.configuration/service-id "Firehose", :http.request.spec/input-spec :portkey.aws.firehose.-2015-08-04/describe-delivery-stream-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDeliveryStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.firehose.-2015-08-04/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-delivery-stream :args (clojure.spec.alpha/tuple :portkey.aws.firehose.-2015-08-04/describe-delivery-stream-input) :ret (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/describe-delivery-stream-output))

(clojure.core/defn update-destination ([update-destination-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-destination-input update-destination-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.firehose.-2015-08-04/endpoints, :http.request.spec/output-spec :portkey.aws.firehose.-2015-08-04/update-destination-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-08-04", :http.request.configuration/service-id "Firehose", :http.request.spec/input-spec :portkey.aws.firehose.-2015-08-04/update-destination-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDestination", :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.firehose.-2015-08-04/invalid-argument-exception, "ResourceInUseException" :portkey.aws.firehose.-2015-08-04/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.firehose.-2015-08-04/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.firehose.-2015-08-04/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-destination :args (clojure.spec.alpha/tuple :portkey.aws.firehose.-2015-08-04/update-destination-input) :ret (clojure.spec.alpha/and :portkey.aws.firehose.-2015-08-04/update-destination-output))
