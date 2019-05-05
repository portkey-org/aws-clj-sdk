(ns portkey.aws.signer.-2017-08-25 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-signing-material)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-platform-id)

(clojure.core/declare ser-signing-status)

(clojure.core/declare ser-prefix)

(clojure.core/declare ser-source)

(clojure.core/declare ser-s-3-source)

(clojure.core/declare ser-destination)

(clojure.core/declare ser-signing-platform-overrides)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-key)

(clojure.core/declare serbool)

(clojure.core/declare ser-signing-parameter-key)

(clojure.core/declare ser-string)

(clojure.core/declare ser-signing-parameter-value)

(clojure.core/declare ser-certificate-arn)

(clojure.core/declare ser-hash-algorithm)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-s-3-destination)

(clojure.core/declare ser-version)

(clojure.core/declare ser-encryption-algorithm)

(clojure.core/declare ser-bucket-name)

(clojure.core/declare ser-profile-name)

(clojure.core/declare ser-requested-by)

(clojure.core/declare ser-signing-parameters)

(clojure.core/declare ser-signing-configuration-overrides)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-signing-material [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-certificate-arn (:certificate-arn input)) #:http.request.field{:name "certificateArn", :shape "CertificateArn"})], :shape "SigningMaterial", :type "structure"}))

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-platform-id [input] #:http.request.field{:value input, :shape "PlatformId"})

(clojure.core/defn- ser-signing-status [input] #:http.request.field{:value (clojure.core/get {"InProgress" "InProgress", :in-progress "InProgress", "Failed" "Failed", :failed "Failed", "Succeeded" "Succeeded", :succeeded "Succeeded"} input), :shape "SigningStatus"})

(clojure.core/defn- ser-prefix [input] #:http.request.field{:value input, :shape "Prefix"})

(clojure.core/defn- ser-source [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Source", :type "structure"} (clojure.core/contains? input :s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-source (input :s-3)) #:http.request.field{:name "s3", :shape "S3Source"}))))

(clojure.core/defn- ser-s-3-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-name (:bucket-name input)) #:http.request.field{:name "bucketName", :shape "BucketName"}) (clojure.core/into (ser-key (:key input)) #:http.request.field{:name "key", :shape "Key"}) (clojure.core/into (ser-version (:version input)) #:http.request.field{:name "version", :shape "Version"})], :shape "S3Source", :type "structure"}))

(clojure.core/defn- ser-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Destination", :type "structure"} (clojure.core/contains? input :s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination (input :s-3)) #:http.request.field{:name "s3", :shape "S3Destination"}))))

(clojure.core/defn- ser-signing-platform-overrides [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SigningPlatformOverrides", :type "structure"} (clojure.core/contains? input :signing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-configuration-overrides (input :signing-configuration)) #:http.request.field{:name "signingConfiguration", :shape "SigningConfigurationOverrides"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-key [input] #:http.request.field{:value input, :shape "Key"})

(clojure.core/defn- serbool [input] #:http.request.field{:value input, :shape "bool"})

(clojure.core/defn- ser-signing-parameter-key [input] #:http.request.field{:value input, :shape "SigningParameterKey"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-signing-parameter-value [input] #:http.request.field{:value input, :shape "SigningParameterValue"})

(clojure.core/defn- ser-certificate-arn [input] #:http.request.field{:value input, :shape "CertificateArn"})

(clojure.core/defn- ser-hash-algorithm [input] #:http.request.field{:value (clojure.core/get {"SHA1" "SHA1", :sha-1 "SHA1", "SHA256" "SHA256", :sha-256 "SHA256"} input), :shape "HashAlgorithm"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-s-3-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Destination", :type "structure"} (clojure.core/contains? input :bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-name (input :bucket-name)) #:http.request.field{:name "bucketName", :shape "BucketName"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "prefix", :shape "Prefix"}))))

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-encryption-algorithm [input] #:http.request.field{:value (clojure.core/get {"RSA" "RSA", :rsa "RSA", "ECDSA" "ECDSA", :ecdsa "ECDSA"} input), :shape "EncryptionAlgorithm"})

(clojure.core/defn- ser-bucket-name [input] #:http.request.field{:value input, :shape "BucketName"})

(clojure.core/defn- ser-profile-name [input] #:http.request.field{:value input, :shape "ProfileName"})

(clojure.core/defn- ser-requested-by [input] #:http.request.field{:value input, :shape "RequestedBy"})

(clojure.core/defn- ser-signing-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-signing-parameter-key k) #:http.request.field{:map-info "key", :shape "SigningParameterKey"}) (clojure.core/into (ser-signing-parameter-value v) #:http.request.field{:map-info "value", :shape "SigningParameterValue"})])) input), :shape "SigningParameters", :type "map"})

(clojure.core/defn- ser-signing-configuration-overrides [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SigningConfigurationOverrides", :type "structure"} (clojure.core/contains? input :encryption-algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-algorithm (input :encryption-algorithm)) #:http.request.field{:name "encryptionAlgorithm", :shape "EncryptionAlgorithm"})) (clojure.core/contains? input :hash-algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hash-algorithm (input :hash-algorithm)) #:http.request.field{:name "hashAlgorithm", :shape "HashAlgorithm"}))))

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-list-signing-platforms-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :category) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :category)) #:http.request.field{:name "category", :shape "String", :location "querystring", :location-name "category"})) (clojure.core/contains? input :partner) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :partner)) #:http.request.field{:name "partner", :shape "String", :location "querystring", :location-name "partner"})) (clojure.core/contains? input :target) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :target)) #:http.request.field{:name "target", :shape "String", :location "querystring", :location-name "target"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-put-signing-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "profileName", :shape "ProfileName", :location "uri", :location-name "profileName"})], :body [(clojure.core/into (ser-signing-material (input :signing-material)) #:http.request.field{:name "signingMaterial", :shape "SigningMaterial"}) (clojure.core/into (ser-platform-id (input :platform-id)) #:http.request.field{:name "platformId", :shape "PlatformId"})]} (clojure.core/contains? input :overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-platform-overrides (input :overrides)) #:http.request.field{:name "overrides", :shape "SigningPlatformOverrides"})) (clojure.core/contains? input :signing-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-parameters (input :signing-parameters)) #:http.request.field{:name "signingParameters", :shape "SigningParameters"}))))

(clojure.core/defn- req-start-signing-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-source (input :source)) #:http.request.field{:name "source", :shape "Source"}) (clojure.core/into (ser-destination (input :destination)) #:http.request.field{:name "destination", :shape "Destination"}) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true})]} (clojure.core/contains? input :profile-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "profileName", :shape "ProfileName"}))))

(clojure.core/defn- req-get-signing-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "profileName", :shape "ProfileName", :location "uri", :location-name "profileName"})]}))

(clojure.core/defn- req-list-signing-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :include-canceled) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serbool (input :include-canceled)) #:http.request.field{:name "includeCanceled", :shape "bool", :location "querystring", :location-name "includeCanceled"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-list-signing-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-status (input :status)) #:http.request.field{:name "status", :shape "SigningStatus", :location "querystring", :location-name "status"})) (clojure.core/contains? input :platform-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-id (input :platform-id)) #:http.request.field{:name "platformId", :shape "PlatformId", :location "querystring", :location-name "platformId"})) (clojure.core/contains? input :requested-by) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-requested-by (input :requested-by)) #:http.request.field{:name "requestedBy", :shape "RequestedBy", :location "querystring", :location-name "requestedBy"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-cancel-signing-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "profileName", :shape "ProfileName", :location "uri", :location-name "profileName"})]}))

(clojure.core/defn- req-describe-signing-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]}))

(clojure.core/defn- req-get-signing-platform-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-platform-id (input :platform-id)) #:http.request.field{:name "platformId", :shape "PlatformId", :location "uri", :location-name "platformId"})]}))

(clojure.core/declare deser-encryption-algorithms)

(clojure.core/declare deser-signing-material)

(clojure.core/declare deser-signing-jobs)

(clojure.core/declare deserstring)

(clojure.core/declare deser-platform-id)

(clojure.core/declare deser-completed-at)

(clojure.core/declare deser-signing-status)

(clojure.core/declare deser-category)

(clojure.core/declare deser-source)

(clojure.core/declare deser-s-3-signed-object)

(clojure.core/declare deser-hash-algorithms)

(clojure.core/declare deserkey)

(clojure.core/declare deser-s-3-source)

(clojure.core/declare deser-signing-platform-overrides)

(clojure.core/declare deser-signing-configuration)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-image-format)

(clojure.core/declare deser-key)

(clojure.core/declare deser-display-name)

(clojure.core/declare deser-status-reason)

(clojure.core/declare deser-signing-platform)

(clojure.core/declare deser-signing-parameter-key)

(clojure.core/declare deser-string)

(clojure.core/declare deser-signing-profiles)

(clojure.core/declare deser-encryption-algorithm-options)

(clojure.core/declare deser-signing-parameter-value)

(clojure.core/declare deser-signing-platforms)

(clojure.core/declare deser-certificate-arn)

(clojure.core/declare deser-created-at)

(clojure.core/declare deser-signed-object)

(clojure.core/declare deser-signing-image-format)

(clojure.core/declare deser-signing-profile-status)

(clojure.core/declare deser-max-size-in-mb)

(clojure.core/declare deser-hash-algorithm)

(clojure.core/declare deser-version)

(clojure.core/declare deser-signing-profile)

(clojure.core/declare deser-image-formats)

(clojure.core/declare deser-encryption-algorithm)

(clojure.core/declare deser-signing-job)

(clojure.core/declare deser-hash-algorithm-options)

(clojure.core/declare deser-bucket-name)

(clojure.core/declare deser-profile-name)

(clojure.core/declare deser-requested-by)

(clojure.core/declare deser-signing-parameters)

(clojure.core/declare deser-signing-configuration-overrides)

(clojure.core/declare deser-job-id)

(clojure.core/defn- deser-encryption-algorithms [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-encryption-algorithm coll))) input))

(clojure.core/defn- deser-signing-material [input] (clojure.core/cond-> {:certificate-arn (deser-certificate-arn (input "certificateArn"))}))

(clojure.core/defn- deser-signing-jobs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signing-job coll))) input))

(clojure.core/defn- deserstring [input] input)

(clojure.core/defn- deser-platform-id [input] input)

(clojure.core/defn- deser-completed-at [input] input)

(clojure.core/defn- deser-signing-status [input] (clojure.core/get {"InProgress" :in-progress, "Failed" :failed, "Succeeded" :succeeded} input))

(clojure.core/defn- deser-category [input] (clojure.core/get {"AWSIoT" :aws-io-t} input))

(clojure.core/defn- deser-source [input] (clojure.core/cond-> {} (clojure.core/contains? input "s3") (clojure.core/assoc :s-3 (deser-s-3-source (input "s3")))))

(clojure.core/defn- deser-s-3-signed-object [input] (clojure.core/cond-> {} (clojure.core/contains? input "bucketName") (clojure.core/assoc :bucket-name (deser-bucket-name (input "bucketName"))) (clojure.core/contains? input "key") (clojure.core/assoc :key (deserkey (input "key")))))

(clojure.core/defn- deser-hash-algorithms [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hash-algorithm coll))) input))

(clojure.core/defn- deserkey [input] input)

(clojure.core/defn- deser-s-3-source [input] (clojure.core/cond-> {:bucket-name (deser-bucket-name (input "bucketName")), :key (deser-key (input "key")), :version (deser-version (input "version"))}))

(clojure.core/defn- deser-signing-platform-overrides [input] (clojure.core/cond-> {} (clojure.core/contains? input "signingConfiguration") (clojure.core/assoc :signing-configuration (deser-signing-configuration-overrides (input "signingConfiguration")))))

(clojure.core/defn- deser-signing-configuration [input] (clojure.core/cond-> {:encryption-algorithm-options (deser-encryption-algorithm-options (input "encryptionAlgorithmOptions")), :hash-algorithm-options (deser-hash-algorithm-options (input "hashAlgorithmOptions"))}))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-image-format [input] (clojure.core/get {"JSON" :json} input))

(clojure.core/defn- deser-key [input] input)

(clojure.core/defn- deser-display-name [input] input)

(clojure.core/defn- deser-status-reason [input] input)

(clojure.core/defn- deser-signing-platform [input] (clojure.core/cond-> {} (clojure.core/contains? input "platformId") (clojure.core/assoc :platform-id (deser-string (input "platformId"))) (clojure.core/contains? input "displayName") (clojure.core/assoc :display-name (deser-string (input "displayName"))) (clojure.core/contains? input "partner") (clojure.core/assoc :partner (deser-string (input "partner"))) (clojure.core/contains? input "target") (clojure.core/assoc :target (deser-string (input "target"))) (clojure.core/contains? input "category") (clojure.core/assoc :category (deser-category (input "category"))) (clojure.core/contains? input "signingConfiguration") (clojure.core/assoc :signing-configuration (deser-signing-configuration (input "signingConfiguration"))) (clojure.core/contains? input "signingImageFormat") (clojure.core/assoc :signing-image-format (deser-signing-image-format (input "signingImageFormat"))) (clojure.core/contains? input "maxSizeInMB") (clojure.core/assoc :max-size-in-mb (deser-max-size-in-mb (input "maxSizeInMB")))))

(clojure.core/defn- deser-signing-parameter-key [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-signing-profiles [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signing-profile coll))) input))

(clojure.core/defn- deser-encryption-algorithm-options [input] (clojure.core/cond-> {:allowed-values (deser-encryption-algorithms (input "allowedValues")), :default-value (deser-encryption-algorithm (input "defaultValue"))}))

(clojure.core/defn- deser-signing-parameter-value [input] input)

(clojure.core/defn- deser-signing-platforms [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signing-platform coll))) input))

(clojure.core/defn- deser-certificate-arn [input] input)

(clojure.core/defn- deser-created-at [input] input)

(clojure.core/defn- deser-signed-object [input] (clojure.core/cond-> {} (clojure.core/contains? input "s3") (clojure.core/assoc :s-3 (deser-s-3-signed-object (input "s3")))))

(clojure.core/defn- deser-signing-image-format [input] (clojure.core/cond-> {:supported-formats (deser-image-formats (input "supportedFormats")), :default-format (deser-image-format (input "defaultFormat"))}))

(clojure.core/defn- deser-signing-profile-status [input] (clojure.core/get {"Active" :active, "Canceled" :canceled} input))

(clojure.core/defn- deser-max-size-in-mb [input] input)

(clojure.core/defn- deser-hash-algorithm [input] (clojure.core/get {"SHA1" :sha-1, "SHA256" :sha-256} input))

(clojure.core/defn- deser-version [input] input)

(clojure.core/defn- deser-signing-profile [input] (clojure.core/cond-> {} (clojure.core/contains? input "profileName") (clojure.core/assoc :profile-name (deser-profile-name (input "profileName"))) (clojure.core/contains? input "signingMaterial") (clojure.core/assoc :signing-material (deser-signing-material (input "signingMaterial"))) (clojure.core/contains? input "platformId") (clojure.core/assoc :platform-id (deser-platform-id (input "platformId"))) (clojure.core/contains? input "signingParameters") (clojure.core/assoc :signing-parameters (deser-signing-parameters (input "signingParameters"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-signing-profile-status (input "status")))))

(clojure.core/defn- deser-image-formats [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image-format coll))) input))

(clojure.core/defn- deser-encryption-algorithm [input] (clojure.core/get {"RSA" :rsa, "ECDSA" :ecdsa} input))

(clojure.core/defn- deser-signing-job [input] (clojure.core/cond-> {} (clojure.core/contains? input "jobId") (clojure.core/assoc :job-id (deser-job-id (input "jobId"))) (clojure.core/contains? input "source") (clojure.core/assoc :source (deser-source (input "source"))) (clojure.core/contains? input "signedObject") (clojure.core/assoc :signed-object (deser-signed-object (input "signedObject"))) (clojure.core/contains? input "signingMaterial") (clojure.core/assoc :signing-material (deser-signing-material (input "signingMaterial"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-created-at (input "createdAt"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-signing-status (input "status")))))

(clojure.core/defn- deser-hash-algorithm-options [input] (clojure.core/cond-> {:allowed-values (deser-hash-algorithms (input "allowedValues")), :default-value (deser-hash-algorithm (input "defaultValue"))}))

(clojure.core/defn- deser-bucket-name [input] input)

(clojure.core/defn- deser-profile-name [input] input)

(clojure.core/defn- deser-requested-by [input] input)

(clojure.core/defn- deser-signing-parameters [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-signing-parameter-key k) (deser-signing-parameter-value v)])) input))

(clojure.core/defn- deser-signing-configuration-overrides [input] (clojure.core/cond-> {} (clojure.core/contains? input "encryptionAlgorithm") (clojure.core/assoc :encryption-algorithm (deser-encryption-algorithm (input "encryptionAlgorithm"))) (clojure.core/contains? input "hashAlgorithm") (clojure.core/assoc :hash-algorithm (deser-hash-algorithm (input "hashAlgorithm")))))

(clojure.core/defn- deser-job-id [input] input)

(clojure.core/defn- response-list-signing-platforms-response ([input] (response-list-signing-platforms-response nil input)) ([resultWrapper1466234 input] (clojure.core/let [rawinput1466233 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466235 {"platforms" (rawinput1466233 "platforms"), "nextToken" (rawinput1466233 "nextToken")}] (clojure.core/cond-> {} (letvar1466235 "platforms") (clojure.core/assoc :platforms (deser-signing-platforms (clojure.core/get-in letvar1466235 ["platforms"]))) (letvar1466235 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1466235 ["nextToken"])))))))

(clojure.core/defn- response-put-signing-profile-response ([input] (response-put-signing-profile-response nil input)) ([resultWrapper1466237 input] (clojure.core/let [rawinput1466236 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466238 {"arn" (rawinput1466236 "arn")}] (clojure.core/cond-> {} (letvar1466238 "arn") (clojure.core/assoc :arn (deserstring (clojure.core/get-in letvar1466238 ["arn"])))))))

(clojure.core/defn- response-validation-exception ([input] (response-validation-exception nil input)) ([resultWrapper1466240 input] (clojure.core/let [rawinput1466239 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466241 {"message" (rawinput1466239 "message")}] (clojure.core/cond-> {} (letvar1466241 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1466241 ["message"])))))))

(clojure.core/defn- response-internal-service-error-exception ([input] (response-internal-service-error-exception nil input)) ([resultWrapper1466243 input] (clojure.core/let [rawinput1466242 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466244 {"message" (rawinput1466242 "message")}] (clojure.core/cond-> {} (letvar1466244 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1466244 ["message"])))))))

(clojure.core/defn- response-start-signing-job-response ([input] (response-start-signing-job-response nil input)) ([resultWrapper1466246 input] (clojure.core/let [rawinput1466245 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466247 {"jobId" (rawinput1466245 "jobId")}] (clojure.core/cond-> {} (letvar1466247 "jobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1466247 ["jobId"])))))))

(clojure.core/defn- response-get-signing-profile-response ([input] (response-get-signing-profile-response nil input)) ([resultWrapper1466249 input] (clojure.core/let [rawinput1466248 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466250 {"profileName" (rawinput1466248 "profileName"), "signingMaterial" (rawinput1466248 "signingMaterial"), "platformId" (rawinput1466248 "platformId"), "overrides" (rawinput1466248 "overrides"), "signingParameters" (rawinput1466248 "signingParameters"), "status" (rawinput1466248 "status")}] (clojure.core/cond-> {} (letvar1466250 "profileName") (clojure.core/assoc :profile-name (deser-profile-name (clojure.core/get-in letvar1466250 ["profileName"]))) (letvar1466250 "signingMaterial") (clojure.core/assoc :signing-material (deser-signing-material (clojure.core/get-in letvar1466250 ["signingMaterial"]))) (letvar1466250 "platformId") (clojure.core/assoc :platform-id (deser-platform-id (clojure.core/get-in letvar1466250 ["platformId"]))) (letvar1466250 "overrides") (clojure.core/assoc :overrides (deser-signing-platform-overrides (clojure.core/get-in letvar1466250 ["overrides"]))) (letvar1466250 "signingParameters") (clojure.core/assoc :signing-parameters (deser-signing-parameters (clojure.core/get-in letvar1466250 ["signingParameters"]))) (letvar1466250 "status") (clojure.core/assoc :status (deser-signing-profile-status (clojure.core/get-in letvar1466250 ["status"])))))))

(clojure.core/defn- response-list-signing-profiles-response ([input] (response-list-signing-profiles-response nil input)) ([resultWrapper1466252 input] (clojure.core/let [rawinput1466251 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466253 {"profiles" (rawinput1466251 "profiles"), "nextToken" (rawinput1466251 "nextToken")}] (clojure.core/cond-> {} (letvar1466253 "profiles") (clojure.core/assoc :profiles (deser-signing-profiles (clojure.core/get-in letvar1466253 ["profiles"]))) (letvar1466253 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1466253 ["nextToken"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1466255 input] (clojure.core/let [rawinput1466254 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466256 {"message" (rawinput1466254 "message")}] (clojure.core/cond-> {} (letvar1466256 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1466256 ["message"])))))))

(clojure.core/defn- response-get-signing-platform-response ([input] (response-get-signing-platform-response nil input)) ([resultWrapper1466258 input] (clojure.core/let [rawinput1466257 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466259 {"platformId" (rawinput1466257 "platformId"), "displayName" (rawinput1466257 "displayName"), "partner" (rawinput1466257 "partner"), "target" (rawinput1466257 "target"), "category" (rawinput1466257 "category"), "signingConfiguration" (rawinput1466257 "signingConfiguration"), "signingImageFormat" (rawinput1466257 "signingImageFormat"), "maxSizeInMB" (rawinput1466257 "maxSizeInMB")}] (clojure.core/cond-> {} (letvar1466259 "platformId") (clojure.core/assoc :platform-id (deser-platform-id (clojure.core/get-in letvar1466259 ["platformId"]))) (letvar1466259 "displayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1466259 ["displayName"]))) (letvar1466259 "partner") (clojure.core/assoc :partner (deser-string (clojure.core/get-in letvar1466259 ["partner"]))) (letvar1466259 "target") (clojure.core/assoc :target (deser-string (clojure.core/get-in letvar1466259 ["target"]))) (letvar1466259 "category") (clojure.core/assoc :category (deser-category (clojure.core/get-in letvar1466259 ["category"]))) (letvar1466259 "signingConfiguration") (clojure.core/assoc :signing-configuration (deser-signing-configuration (clojure.core/get-in letvar1466259 ["signingConfiguration"]))) (letvar1466259 "signingImageFormat") (clojure.core/assoc :signing-image-format (deser-signing-image-format (clojure.core/get-in letvar1466259 ["signingImageFormat"]))) (letvar1466259 "maxSizeInMB") (clojure.core/assoc :max-size-in-mb (deser-max-size-in-mb (clojure.core/get-in letvar1466259 ["maxSizeInMB"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1466261 input] (clojure.core/let [rawinput1466260 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466262 {"message" (rawinput1466260 "message")}] (clojure.core/cond-> {} (letvar1466262 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1466262 ["message"])))))))

(clojure.core/defn- response-describe-signing-job-response ([input] (response-describe-signing-job-response nil input)) ([resultWrapper1466264 input] (clojure.core/let [rawinput1466263 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466265 {"overrides" (rawinput1466263 "overrides"), "signingParameters" (rawinput1466263 "signingParameters"), "createdAt" (rawinput1466263 "createdAt"), "completedAt" (rawinput1466263 "completedAt"), "signingMaterial" (rawinput1466263 "signingMaterial"), "status" (rawinput1466263 "status"), "requestedBy" (rawinput1466263 "requestedBy"), "source" (rawinput1466263 "source"), "signedObject" (rawinput1466263 "signedObject"), "profileName" (rawinput1466263 "profileName"), "statusReason" (rawinput1466263 "statusReason"), "platformId" (rawinput1466263 "platformId"), "jobId" (rawinput1466263 "jobId")}] (clojure.core/cond-> {} (letvar1466265 "overrides") (clojure.core/assoc :overrides (deser-signing-platform-overrides (clojure.core/get-in letvar1466265 ["overrides"]))) (letvar1466265 "signingParameters") (clojure.core/assoc :signing-parameters (deser-signing-parameters (clojure.core/get-in letvar1466265 ["signingParameters"]))) (letvar1466265 "createdAt") (clojure.core/assoc :created-at (deser-created-at (clojure.core/get-in letvar1466265 ["createdAt"]))) (letvar1466265 "completedAt") (clojure.core/assoc :completed-at (deser-completed-at (clojure.core/get-in letvar1466265 ["completedAt"]))) (letvar1466265 "signingMaterial") (clojure.core/assoc :signing-material (deser-signing-material (clojure.core/get-in letvar1466265 ["signingMaterial"]))) (letvar1466265 "status") (clojure.core/assoc :status (deser-signing-status (clojure.core/get-in letvar1466265 ["status"]))) (letvar1466265 "requestedBy") (clojure.core/assoc :requested-by (deser-requested-by (clojure.core/get-in letvar1466265 ["requestedBy"]))) (letvar1466265 "source") (clojure.core/assoc :source (deser-source (clojure.core/get-in letvar1466265 ["source"]))) (letvar1466265 "signedObject") (clojure.core/assoc :signed-object (deser-signed-object (clojure.core/get-in letvar1466265 ["signedObject"]))) (letvar1466265 "profileName") (clojure.core/assoc :profile-name (deser-profile-name (clojure.core/get-in letvar1466265 ["profileName"]))) (letvar1466265 "statusReason") (clojure.core/assoc :status-reason (deser-status-reason (clojure.core/get-in letvar1466265 ["statusReason"]))) (letvar1466265 "platformId") (clojure.core/assoc :platform-id (deser-platform-id (clojure.core/get-in letvar1466265 ["platformId"]))) (letvar1466265 "jobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1466265 ["jobId"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper1466267 input] (clojure.core/let [rawinput1466266 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466268 {"message" (rawinput1466266 "message")}] (clojure.core/cond-> {} (letvar1466268 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1466268 ["message"])))))))

(clojure.core/defn- response-list-signing-jobs-response ([input] (response-list-signing-jobs-response nil input)) ([resultWrapper1466270 input] (clojure.core/let [rawinput1466269 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1466271 {"jobs" (rawinput1466269 "jobs"), "nextToken" (rawinput1466269 "nextToken")}] (clojure.core/cond-> {} (letvar1466271 "jobs") (clojure.core/assoc :jobs (deser-signing-jobs (clojure.core/get-in letvar1466271 ["jobs"]))) (letvar1466271 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1466271 ["nextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/encryption-algorithms (clojure.spec.alpha/coll-of :portkey.aws.signer.-2017-08-25/encryption-algorithm))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-platforms-response/platforms (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-platforms))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-platforms-response/next-token (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/list-signing-platforms-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.list-signing-platforms-response/platforms :portkey.aws.signer.-2017-08-25.list-signing-platforms-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.put-signing-profile-response/arn (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/put-signing-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.put-signing-profile-response/arn]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-material/certificate-arn (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-material (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.signing-material/certificate-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/client-request-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-jobs (clojure.spec.alpha/coll-of :portkey.aws.signer.-2017-08-25/signing-job))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.validation-exception/message (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/error-message))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/platform-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/completed-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-status #{"Failed" :in-progress "Succeeded" "InProgress" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/category #{:aws-io-t "AWSIoT"})

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.source/s-3 (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/s-3-source))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.source/s-3]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.s-3-signed-object/bucket-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/s-3-signed-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.s-3-signed-object/bucket-name :portkey.aws.signer.-2017-08-25/key]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/hash-algorithms (clojure.spec.alpha/coll-of :portkey.aws.signer.-2017-08-25/hash-algorithm))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/error-message))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.start-signing-job-response/job-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/job-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/start-signing-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.start-signing-job-response/job-id]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.s-3-source/bucket-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.s-3-source/key (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/key))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.s-3-source/version (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/version))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/s-3-source (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.s-3-source/bucket-name :portkey.aws.signer.-2017-08-25.s-3-source/key :portkey.aws.signer.-2017-08-25.s-3-source/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-platforms-request/category (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-platforms-request/partner (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-platforms-request/target (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-platforms-request/max-results (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/max-results))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-platforms-request/next-token (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/list-signing-platforms-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.list-signing-platforms-request/category :portkey.aws.signer.-2017-08-25.list-signing-platforms-request/partner :portkey.aws.signer.-2017-08-25.list-signing-platforms-request/target :portkey.aws.signer.-2017-08-25.list-signing-platforms-request/max-results :portkey.aws.signer.-2017-08-25.list-signing-platforms-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.destination/s-3 (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/s-3-destination))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.destination/s-3]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-profile-response/profile-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-profile-response/signing-material (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-material))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-profile-response/platform-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-profile-response/overrides (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-platform-overrides))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-profile-response/signing-parameters (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-parameters))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-profile-response/status (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-profile-status))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/get-signing-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.get-signing-profile-response/profile-name :portkey.aws.signer.-2017-08-25.get-signing-profile-response/signing-material :portkey.aws.signer.-2017-08-25.get-signing-profile-response/platform-id :portkey.aws.signer.-2017-08-25.get-signing-profile-response/overrides :portkey.aws.signer.-2017-08-25.get-signing-profile-response/signing-parameters :portkey.aws.signer.-2017-08-25.get-signing-profile-response/status]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-platform-overrides/signing-configuration (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-configuration-overrides))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-platform-overrides (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.signing-platform-overrides/signing-configuration]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-configuration/encryption-algorithm-options (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/encryption-algorithm-options))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-configuration/hash-algorithm-options (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/hash-algorithm-options))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.signing-configuration/encryption-algorithm-options :portkey.aws.signer.-2017-08-25.signing-configuration/hash-algorithm-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.put-signing-profile-request/profile-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.put-signing-profile-request/signing-material (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-material))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.put-signing-profile-request/platform-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.put-signing-profile-request/overrides (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-platform-overrides))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.put-signing-profile-request/signing-parameters (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-parameters))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/put-signing-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.put-signing-profile-request/profile-name :portkey.aws.signer.-2017-08-25.put-signing-profile-request/signing-material :portkey.aws.signer.-2017-08-25.put-signing-profile-request/platform-id] :opt-un [:portkey.aws.signer.-2017-08-25.put-signing-profile-request/overrides :portkey.aws.signer.-2017-08-25.put-signing-profile-request/signing-parameters]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.start-signing-job-request/source (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/source))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.start-signing-job-request/destination (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/destination))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.start-signing-job-request/profile-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.start-signing-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/client-request-token))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/start-signing-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.start-signing-job-request/source :portkey.aws.signer.-2017-08-25.start-signing-job-request/destination :portkey.aws.signer.-2017-08-25.start-signing-job-request/client-request-token] :opt-un [:portkey.aws.signer.-2017-08-25.start-signing-job-request/profile-name]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/image-format #{"JSON" :json})

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-profiles-response/profiles (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-profiles))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-profiles-response/next-token (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/next-token))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/list-signing-profiles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.list-signing-profiles-response/profiles :portkey.aws.signer.-2017-08-25.list-signing-profiles-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/display-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-profile-request/profile-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/get-signing-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.get-signing-profile-request/profile-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/bool clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-platform/platform-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-platform/display-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-platform/partner (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-platform/target (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-platform/category (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/category))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-platform/signing-configuration (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-configuration))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-platform/signing-image-format (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-image-format))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-platform/max-size-in-mb (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/max-size-in-mb))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-platform (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.signing-platform/platform-id :portkey.aws.signer.-2017-08-25.signing-platform/display-name :portkey.aws.signer.-2017-08-25.signing-platform/partner :portkey.aws.signer.-2017-08-25.signing-platform/target :portkey.aws.signer.-2017-08-25.signing-platform/category :portkey.aws.signer.-2017-08-25.signing-platform/signing-configuration :portkey.aws.signer.-2017-08-25.signing-platform/signing-image-format :portkey.aws.signer.-2017-08-25.signing-platform/max-size-in-mb]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/error-message))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-profiles-request/include-canceled (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/bool))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/max-results))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-profiles-request/next-token (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/next-token))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/list-signing-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.list-signing-profiles-request/include-canceled :portkey.aws.signer.-2017-08-25.list-signing-profiles-request/max-results :portkey.aws.signer.-2017-08-25.list-signing-profiles-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-platform-response/platform-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-platform-response/display-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/display-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-platform-response/partner (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-platform-response/target (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/string))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-platform-response/category (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/category))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-platform-response/signing-configuration (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-configuration))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-platform-response/signing-image-format (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-image-format))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-platform-response/max-size-in-mb (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/max-size-in-mb))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/get-signing-platform-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.get-signing-platform-response/platform-id :portkey.aws.signer.-2017-08-25.get-signing-platform-response/display-name :portkey.aws.signer.-2017-08-25.get-signing-platform-response/partner :portkey.aws.signer.-2017-08-25.get-signing-platform-response/target :portkey.aws.signer.-2017-08-25.get-signing-platform-response/category :portkey.aws.signer.-2017-08-25.get-signing-platform-response/signing-configuration :portkey.aws.signer.-2017-08-25.get-signing-platform-response/signing-image-format :portkey.aws.signer.-2017-08-25.get-signing-platform-response/max-size-in-mb]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-parameter-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/error-message))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-jobs-request/status (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-status))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-jobs-request/platform-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-jobs-request/requested-by (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/requested-by))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/max-results))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/next-token))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/list-signing-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.list-signing-jobs-request/status :portkey.aws.signer.-2017-08-25.list-signing-jobs-request/platform-id :portkey.aws.signer.-2017-08-25.list-signing-jobs-request/requested-by :portkey.aws.signer.-2017-08-25.list-signing-jobs-request/max-results :portkey.aws.signer.-2017-08-25.list-signing-jobs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.cancel-signing-profile-request/profile-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/cancel-signing-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.cancel-signing-profile-request/profile-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-profiles (clojure.spec.alpha/coll-of :portkey.aws.signer.-2017-08-25/signing-profile))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.encryption-algorithm-options/allowed-values (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/encryption-algorithms))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.encryption-algorithm-options/default-value (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/encryption-algorithm))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/encryption-algorithm-options (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.encryption-algorithm-options/allowed-values :portkey.aws.signer.-2017-08-25.encryption-algorithm-options/default-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-parameter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-request/job-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/job-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/describe-signing-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.describe-signing-job-request/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-platforms (clojure.spec.alpha/coll-of :portkey.aws.signer.-2017-08-25/signing-platform))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/certificate-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/created-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signed-object/s-3 (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/s-3-signed-object))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signed-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.signed-object/s-3]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/overrides (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-platform-overrides))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/signing-parameters (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-parameters))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/created-at (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/created-at))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/completed-at (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/completed-at))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/signing-material (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-material))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/status (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-status))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/requested-by (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/requested-by))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/source (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/source))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/signed-object (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signed-object))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/profile-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/status-reason (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/status-reason))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/platform-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.describe-signing-job-response/job-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/job-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/describe-signing-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.describe-signing-job-response/overrides :portkey.aws.signer.-2017-08-25.describe-signing-job-response/signing-parameters :portkey.aws.signer.-2017-08-25.describe-signing-job-response/created-at :portkey.aws.signer.-2017-08-25.describe-signing-job-response/completed-at :portkey.aws.signer.-2017-08-25.describe-signing-job-response/signing-material :portkey.aws.signer.-2017-08-25.describe-signing-job-response/status :portkey.aws.signer.-2017-08-25.describe-signing-job-response/requested-by :portkey.aws.signer.-2017-08-25.describe-signing-job-response/source :portkey.aws.signer.-2017-08-25.describe-signing-job-response/signed-object :portkey.aws.signer.-2017-08-25.describe-signing-job-response/profile-name :portkey.aws.signer.-2017-08-25.describe-signing-job-response/status-reason :portkey.aws.signer.-2017-08-25.describe-signing-job-response/platform-id :portkey.aws.signer.-2017-08-25.describe-signing-job-response/job-id]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.get-signing-platform-request/platform-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/get-signing-platform-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.get-signing-platform-request/platform-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-image-format/supported-formats (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/image-formats))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-image-format/default-format (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/image-format))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-image-format (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.signing-image-format/supported-formats :portkey.aws.signer.-2017-08-25.signing-image-format/default-format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-profile-status #{"Active" :canceled "Canceled" :active})

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/max-size-in-mb clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/hash-algorithm #{:sha-1 "SHA1" "SHA256" :sha-256})

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/max-results (clojure.spec.alpha/int-in 1 25))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.s-3-destination/bucket-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/bucket-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.s-3-destination/prefix (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/prefix))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/s-3-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.s-3-destination/bucket-name :portkey.aws.signer.-2017-08-25.s-3-destination/prefix]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-profile/profile-name (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-profile/signing-material (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-material))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-profile/platform-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-profile/signing-parameters (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-parameters))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-profile/status (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-profile-status))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.signing-profile/profile-name :portkey.aws.signer.-2017-08-25.signing-profile/signing-material :portkey.aws.signer.-2017-08-25.signing-profile/platform-id :portkey.aws.signer.-2017-08-25.signing-profile/signing-parameters :portkey.aws.signer.-2017-08-25.signing-profile/status]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/error-message))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/image-formats (clojure.spec.alpha/coll-of :portkey.aws.signer.-2017-08-25/image-format))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/encryption-algorithm #{:ecdsa "RSA" :rsa "ECDSA"})

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-job/job-id (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/job-id))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-job/source (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/source))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-job/signed-object (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signed-object))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-job/signing-material (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-material))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-job/created-at (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/created-at))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-job/status (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-status))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.signing-job/job-id :portkey.aws.signer.-2017-08-25.signing-job/source :portkey.aws.signer.-2017-08-25.signing-job/signed-object :portkey.aws.signer.-2017-08-25.signing-job/signing-material :portkey.aws.signer.-2017-08-25.signing-job/created-at :portkey.aws.signer.-2017-08-25.signing-job/status]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.hash-algorithm-options/allowed-values (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/hash-algorithms))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.hash-algorithm-options/default-value (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/hash-algorithm))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/hash-algorithm-options (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.-2017-08-25.hash-algorithm-options/allowed-values :portkey.aws.signer.-2017-08-25.hash-algorithm-options/default-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/profile-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 2 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 20)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]{2,}" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/requested-by (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-parameters (clojure.spec.alpha/map-of :portkey.aws.signer.-2017-08-25/signing-parameter-key :portkey.aws.signer.-2017-08-25/signing-parameter-value))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-configuration-overrides/encryption-algorithm (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/encryption-algorithm))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.signing-configuration-overrides/hash-algorithm (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/hash-algorithm))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/signing-configuration-overrides (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.signing-configuration-overrides/encryption-algorithm :portkey.aws.signer.-2017-08-25.signing-configuration-overrides/hash-algorithm]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/signing-jobs))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25.list-signing-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/next-token))
(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/list-signing-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.-2017-08-25.list-signing-jobs-response/jobs :portkey.aws.signer.-2017-08-25.list-signing-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer.-2017-08-25/job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn get-signing-profile ([get-signing-profile-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-signing-profile-request get-signing-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.signer.-2017-08-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.signer.-2017-08-25/get-signing-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-profiles/{profileName}", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer.-2017-08-25/get-signing-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSigningProfile", :http.request.configuration/output-deser-fn response-get-signing-profile-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.signer.-2017-08-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer.-2017-08-25/access-denied-exception, "ThrottlingException" :portkey.aws.signer.-2017-08-25/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer.-2017-08-25/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef get-signing-profile :args (clojure.spec.alpha/tuple :portkey.aws.signer.-2017-08-25/get-signing-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/get-signing-profile-response))

(clojure.core/defn get-signing-platform ([get-signing-platform-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-signing-platform-request get-signing-platform-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.signer.-2017-08-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.signer.-2017-08-25/get-signing-platform-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-platforms/{platformId}", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer.-2017-08-25/get-signing-platform-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSigningPlatform", :http.request.configuration/output-deser-fn response-get-signing-platform-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.signer.-2017-08-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer.-2017-08-25/access-denied-exception, "InternalServiceErrorException" :portkey.aws.signer.-2017-08-25/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef get-signing-platform :args (clojure.spec.alpha/tuple :portkey.aws.signer.-2017-08-25/get-signing-platform-request) :ret (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/get-signing-platform-response))

(clojure.core/defn list-signing-profiles ([] (list-signing-profiles {})) ([list-signing-profiles-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-signing-profiles-request list-signing-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.signer.-2017-08-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.signer.-2017-08-25/list-signing-profiles-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-profiles", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer.-2017-08-25/list-signing-profiles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSigningProfiles", :http.request.configuration/output-deser-fn response-list-signing-profiles-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.signer.-2017-08-25/access-denied-exception, "ThrottlingException" :portkey.aws.signer.-2017-08-25/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer.-2017-08-25/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef list-signing-profiles :args (clojure.spec.alpha/? :portkey.aws.signer.-2017-08-25/list-signing-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/list-signing-profiles-response))

(clojure.core/defn list-signing-platforms ([] (list-signing-platforms {})) ([list-signing-platforms-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-signing-platforms-request list-signing-platforms-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.signer.-2017-08-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.signer.-2017-08-25/list-signing-platforms-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-platforms", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer.-2017-08-25/list-signing-platforms-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSigningPlatforms", :http.request.configuration/output-deser-fn response-list-signing-platforms-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.signer.-2017-08-25/validation-exception, "AccessDeniedException" :portkey.aws.signer.-2017-08-25/access-denied-exception, "ThrottlingException" :portkey.aws.signer.-2017-08-25/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer.-2017-08-25/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef list-signing-platforms :args (clojure.spec.alpha/? :portkey.aws.signer.-2017-08-25/list-signing-platforms-request) :ret (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/list-signing-platforms-response))

(clojure.core/defn start-signing-job ([start-signing-job-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-start-signing-job-request start-signing-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.signer.-2017-08-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.signer.-2017-08-25/start-signing-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-jobs", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer.-2017-08-25/start-signing-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartSigningJob", :http.request.configuration/output-deser-fn response-start-signing-job-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.signer.-2017-08-25/validation-exception, "ResourceNotFoundException" :portkey.aws.signer.-2017-08-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer.-2017-08-25/access-denied-exception, "ThrottlingException" :portkey.aws.signer.-2017-08-25/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer.-2017-08-25/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef start-signing-job :args (clojure.spec.alpha/tuple :portkey.aws.signer.-2017-08-25/start-signing-job-request) :ret (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/start-signing-job-response))

(clojure.core/defn list-signing-jobs ([] (list-signing-jobs {})) ([list-signing-jobs-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-signing-jobs-request list-signing-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.signer.-2017-08-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.signer.-2017-08-25/list-signing-jobs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-jobs", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer.-2017-08-25/list-signing-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSigningJobs", :http.request.configuration/output-deser-fn response-list-signing-jobs-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.signer.-2017-08-25/validation-exception, "AccessDeniedException" :portkey.aws.signer.-2017-08-25/access-denied-exception, "ThrottlingException" :portkey.aws.signer.-2017-08-25/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer.-2017-08-25/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef list-signing-jobs :args (clojure.spec.alpha/? :portkey.aws.signer.-2017-08-25/list-signing-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/list-signing-jobs-response))

(clojure.core/defn cancel-signing-profile ([cancel-signing-profile-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-cancel-signing-profile-request cancel-signing-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.signer.-2017-08-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-profiles/{profileName}", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer.-2017-08-25/cancel-signing-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelSigningProfile", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.signer.-2017-08-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer.-2017-08-25/access-denied-exception, "ThrottlingException" :portkey.aws.signer.-2017-08-25/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer.-2017-08-25/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef cancel-signing-profile :args (clojure.spec.alpha/tuple :portkey.aws.signer.-2017-08-25/cancel-signing-profile-request) :ret clojure.core/true?)

(clojure.core/defn describe-signing-job ([describe-signing-job-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-signing-job-request describe-signing-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.signer.-2017-08-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.signer.-2017-08-25/describe-signing-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-jobs/{jobId}", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer.-2017-08-25/describe-signing-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSigningJob", :http.request.configuration/output-deser-fn response-describe-signing-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.signer.-2017-08-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer.-2017-08-25/access-denied-exception, "InternalServiceErrorException" :portkey.aws.signer.-2017-08-25/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef describe-signing-job :args (clojure.spec.alpha/tuple :portkey.aws.signer.-2017-08-25/describe-signing-job-request) :ret (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/describe-signing-job-response))

(clojure.core/defn put-signing-profile ([put-signing-profile-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-signing-profile-request put-signing-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.signer.-2017-08-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.signer.-2017-08-25/put-signing-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-profiles/{profileName}", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer.-2017-08-25/put-signing-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutSigningProfile", :http.request.configuration/output-deser-fn response-put-signing-profile-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.signer.-2017-08-25/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer.-2017-08-25/access-denied-exception, "ValidationException" :portkey.aws.signer.-2017-08-25/validation-exception, "ThrottlingException" :portkey.aws.signer.-2017-08-25/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer.-2017-08-25/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef put-signing-profile :args (clojure.spec.alpha/tuple :portkey.aws.signer.-2017-08-25/put-signing-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.signer.-2017-08-25/put-signing-profile-response))
