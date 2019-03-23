(ns portkey.aws.kms (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "kms", :region "ap-northeast-1"},
    :ssl-common-name "kms.ap-northeast-1.amazonaws.com",
    :endpoint "https://kms.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "kms", :region "eu-west-1"},
    :ssl-common-name "kms.eu-west-1.amazonaws.com",
    :endpoint "https://kms.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "kms", :region "us-east-2"},
    :ssl-common-name "kms.us-east-2.amazonaws.com",
    :endpoint "https://kms.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "kms", :region "ap-southeast-2"},
    :ssl-common-name "kms.ap-southeast-2.amazonaws.com",
    :endpoint "https://kms.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "kms", :region "sa-east-1"},
    :ssl-common-name "kms.sa-east-1.amazonaws.com",
    :endpoint "https://kms.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "kms", :region "ap-southeast-1"},
    :ssl-common-name "kms.ap-southeast-1.amazonaws.com",
    :endpoint "https://kms.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "kms", :region "ap-northeast-2"},
    :ssl-common-name "kms.ap-northeast-2.amazonaws.com",
    :endpoint "https://kms.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "kms", :region "eu-west-3"},
    :ssl-common-name "kms.eu-west-3.amazonaws.com",
    :endpoint "https://kms.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "kms", :region "ca-central-1"},
    :ssl-common-name "kms.ca-central-1.amazonaws.com",
    :endpoint "https://kms.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "kms", :region "eu-central-1"},
    :ssl-common-name "kms.eu-central-1.amazonaws.com",
    :endpoint "https://kms.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "kms", :region "eu-west-2"},
    :ssl-common-name "kms.eu-west-2.amazonaws.com",
    :endpoint "https://kms.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "kms", :region "us-gov-west-1"},
    :ssl-common-name "kms.us-gov-west-1.amazonaws.com",
    :endpoint "https://kms.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "kms", :region "us-west-2"},
    :ssl-common-name "kms.us-west-2.amazonaws.com",
    :endpoint "https://kms.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "kms", :region "us-east-1"},
    :ssl-common-name "kms.us-east-1.amazonaws.com",
    :endpoint "https://kms.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "kms", :region "us-west-1"},
    :ssl-common-name "kms.us-west-1.amazonaws.com",
    :endpoint "https://kms.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "kms", :region "ap-south-1"},
    :ssl-common-name "kms.ap-south-1.amazonaws.com",
    :endpoint "https://kms.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-principal-id-type)

(clojure.core/declare ser-data-key-spec)

(clojure.core/declare ser-number-of-bytes-type)

(clojure.core/declare ser-tag-key-type)

(clojure.core/declare ser-wrapping-key-spec)

(clojure.core/declare ser-marker-type)

(clojure.core/declare ser-encryption-context-value)

(clojure.core/declare ser-grant-constraints)

(clojure.core/declare ser-grant-token-list)

(clojure.core/declare ser-grant-operation-list)

(clojure.core/declare ser-expiration-model-type)

(clojure.core/declare ser-plaintext-type)

(clojure.core/declare ser-grant-token-type)

(clojure.core/declare ser-grant-id-type)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-policy-name-type)

(clojure.core/declare ser-date-type)

(clojure.core/declare ser-encryption-context-type)

(clojure.core/declare ser-tag-value-type)

(clojure.core/declare ser-key-id-type)

(clojure.core/declare ser-alias-name-type)

(clojure.core/declare ser-encryption-context-key)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-ciphertext-type)

(clojure.core/declare ser-limit-type)

(clojure.core/declare ser-description-type)

(clojure.core/declare ser-grant-name-type)

(clojure.core/declare ser-origin-type)

(clojure.core/declare ser-key-usage-type)

(clojure.core/declare ser-pending-window-in-days-type)

(clojure.core/declare ser-policy-type)

(clojure.core/declare ser-algorithm-spec)

(clojure.core/declare ser-grant-operation)

(clojure.core/declare ser-boolean-type)

(clojure.core/defn- ser-principal-id-type [input] #:http.request.field{:value input, :shape "PrincipalIdType"})

(clojure.core/defn- ser-data-key-spec [input] #:http.request.field{:value (clojure.core/get {"AES_256" "AES_256", :aes-256 "AES_256", "AES_128" "AES_128", :aes-128 "AES_128"} input), :shape "DataKeySpec"})

(clojure.core/defn- ser-number-of-bytes-type [input] #:http.request.field{:value input, :shape "NumberOfBytesType"})

(clojure.core/defn- ser-tag-key-type [input] #:http.request.field{:value input, :shape "TagKeyType"})

(clojure.core/defn- ser-wrapping-key-spec [input] #:http.request.field{:value (clojure.core/get {"RSA_2048" "RSA_2048", :rsa-2048 "RSA_2048"} input), :shape "WrappingKeySpec"})

(clojure.core/defn- ser-marker-type [input] #:http.request.field{:value input, :shape "MarkerType"})

(clojure.core/defn- ser-encryption-context-value [input] #:http.request.field{:value input, :shape "EncryptionContextValue"})

(clojure.core/defn- ser-grant-constraints [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GrantConstraints", :type "structure"} (clojure.core/contains? input :encryption-context-subset) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-context-type (input :encryption-context-subset)) #:http.request.field{:name "EncryptionContextSubset", :shape "EncryptionContextType"})) (clojure.core/contains? input :encryption-context-equals) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-context-type (input :encryption-context-equals)) #:http.request.field{:name "EncryptionContextEquals", :shape "EncryptionContextType"}))))

(clojure.core/defn- ser-grant-token-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-grant-token-type coll) #:http.request.field{:shape "GrantTokenType"}))) input), :shape "GrantTokenList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-grant-operation-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-grant-operation coll) #:http.request.field{:shape "GrantOperation"}))) input), :shape "GrantOperationList", :type "list"})

(clojure.core/defn- ser-expiration-model-type [input] #:http.request.field{:value (clojure.core/get {"KEY_MATERIAL_EXPIRES" "KEY_MATERIAL_EXPIRES", :key-material-expires "KEY_MATERIAL_EXPIRES", "KEY_MATERIAL_DOES_NOT_EXPIRE" "KEY_MATERIAL_DOES_NOT_EXPIRE", :key-material-does-not-expire "KEY_MATERIAL_DOES_NOT_EXPIRE"} input), :shape "ExpirationModelType"})

(clojure.core/defn- ser-plaintext-type [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "PlaintextType"})

(clojure.core/defn- ser-grant-token-type [input] #:http.request.field{:value input, :shape "GrantTokenType"})

(clojure.core/defn- ser-grant-id-type [input] #:http.request.field{:value input, :shape "GrantIdType"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key-type coll) #:http.request.field{:shape "TagKeyType"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-policy-name-type [input] #:http.request.field{:value input, :shape "PolicyNameType"})

(clojure.core/defn- ser-date-type [input] #:http.request.field{:value input, :shape "DateType"})

(clojure.core/defn- ser-encryption-context-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-encryption-context-key k) #:http.request.field{:map-info "key", :shape "EncryptionContextKey"}) (clojure.core/into (ser-encryption-context-value v) #:http.request.field{:map-info "value", :shape "EncryptionContextValue"})])) input), :shape "EncryptionContextType", :type "map"})

(clojure.core/defn- ser-tag-value-type [input] #:http.request.field{:value input, :shape "TagValueType"})

(clojure.core/defn- ser-key-id-type [input] #:http.request.field{:value input, :shape "KeyIdType"})

(clojure.core/defn- ser-alias-name-type [input] #:http.request.field{:value input, :shape "AliasNameType"})

(clojure.core/defn- ser-encryption-context-key [input] #:http.request.field{:value input, :shape "EncryptionContextKey"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key-type (:tag-key input)) #:http.request.field{:name "TagKey", :shape "TagKeyType"}) (clojure.core/into (ser-tag-value-type (:tag-value input)) #:http.request.field{:name "TagValue", :shape "TagValueType"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-ciphertext-type [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "CiphertextType"})

(clojure.core/defn- ser-limit-type [input] #:http.request.field{:value input, :shape "LimitType"})

(clojure.core/defn- ser-description-type [input] #:http.request.field{:value input, :shape "DescriptionType"})

(clojure.core/defn- ser-grant-name-type [input] #:http.request.field{:value input, :shape "GrantNameType"})

(clojure.core/defn- ser-origin-type [input] #:http.request.field{:value (clojure.core/get {"AWS_KMS" "AWS_KMS", :aws-kms "AWS_KMS", "EXTERNAL" "EXTERNAL", :external "EXTERNAL"} input), :shape "OriginType"})

(clojure.core/defn- ser-key-usage-type [input] #:http.request.field{:value (clojure.core/get {"ENCRYPT_DECRYPT" "ENCRYPT_DECRYPT", :encrypt-decrypt "ENCRYPT_DECRYPT"} input), :shape "KeyUsageType"})

(clojure.core/defn- ser-pending-window-in-days-type [input] #:http.request.field{:value input, :shape "PendingWindowInDaysType"})

(clojure.core/defn- ser-policy-type [input] #:http.request.field{:value input, :shape "PolicyType"})

(clojure.core/defn- ser-algorithm-spec [input] #:http.request.field{:value (clojure.core/get {"RSAES_PKCS1_V1_5" "RSAES_PKCS1_V1_5", :rsaes-pkcs-1-v-1-5 "RSAES_PKCS1_V1_5", "RSAES_OAEP_SHA_1" "RSAES_OAEP_SHA_1", :rsaes-oaep-sha-1 "RSAES_OAEP_SHA_1", "RSAES_OAEP_SHA_256" "RSAES_OAEP_SHA_256", :rsaes-oaep-sha-256 "RSAES_OAEP_SHA_256"} input), :shape "AlgorithmSpec"})

(clojure.core/defn- ser-grant-operation [input] #:http.request.field{:value (clojure.core/get {"GenerateDataKeyWithoutPlaintext" "GenerateDataKeyWithoutPlaintext", :generate-data-key-without-plaintext "GenerateDataKeyWithoutPlaintext", "ReEncryptTo" "ReEncryptTo", "Decrypt" "Decrypt", "RetireGrant" "RetireGrant", "GenerateDataKey" "GenerateDataKey", :retire-grant "RetireGrant", :re-encrypt-to "ReEncryptTo", :re-encrypt-from "ReEncryptFrom", :encrypt "Encrypt", :generate-data-key "GenerateDataKey", :decrypt "Decrypt", "Encrypt" "Encrypt", :create-grant "CreateGrant", "ReEncryptFrom" "ReEncryptFrom", "CreateGrant" "CreateGrant", :describe-key "DescribeKey", "DescribeKey" "DescribeKey"} input), :shape "GrantOperation"})

(clojure.core/defn- ser-boolean-type [input] #:http.request.field{:value input, :shape "BooleanType"})

(clojure.core/defn- req-update-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alias-name-type (input :alias-name)) #:http.request.field{:name "AliasName", :shape "AliasNameType"}) (clojure.core/into (ser-key-id-type (input :target-key-id)) #:http.request.field{:name "TargetKeyId", :shape "KeyIdType"})]}))

(clojure.core/defn- req-generate-random-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :number-of-bytes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-of-bytes-type (input :number-of-bytes)) #:http.request.field{:name "NumberOfBytes", :shape "NumberOfBytesType"}))))

(clojure.core/defn- req-get-key-rotation-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]}))

(clojure.core/defn- req-decrypt-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ciphertext-type (input :ciphertext-blob)) #:http.request.field{:name "CiphertextBlob", :shape "CiphertextType"})]} (clojure.core/contains? input :encryption-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-context-type (input :encryption-context)) #:http.request.field{:name "EncryptionContext", :shape "EncryptionContextType"})) (clojure.core/contains? input :grant-tokens) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-token-list (input :grant-tokens)) #:http.request.field{:name "GrantTokens", :shape "GrantTokenList"}))))

(clojure.core/defn- req-delete-imported-key-material-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]}))

(clojure.core/defn- req-describe-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]} (clojure.core/contains? input :grant-tokens) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-token-list (input :grant-tokens)) #:http.request.field{:name "GrantTokens", :shape "GrantTokenList"}))))

(clojure.core/defn- req-revoke-grant-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"}) (clojure.core/into (ser-grant-id-type (input :grant-id)) #:http.request.field{:name "GrantId", :shape "GrantIdType"})]}))

(clojure.core/defn- req-get-key-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"}) (clojure.core/into (ser-policy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyNameType"})]}))

(clojure.core/defn- req-retire-grant-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :grant-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-token-type (input :grant-token)) #:http.request.field{:name "GrantToken", :shape "GrantTokenType"})) (clojure.core/contains? input :key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})) (clojure.core/contains? input :grant-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-id-type (input :grant-id)) #:http.request.field{:name "GrantId", :shape "GrantIdType"}))))

(clojure.core/defn- req-create-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alias-name-type (input :alias-name)) #:http.request.field{:name "AliasName", :shape "AliasNameType"}) (clojure.core/into (ser-key-id-type (input :target-key-id)) #:http.request.field{:name "TargetKeyId", :shape "KeyIdType"})]}))

(clojure.core/defn- req-enable-key-rotation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]}))

(clojure.core/defn- req-import-key-material-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"}) (clojure.core/into (ser-ciphertext-type (input :import-token)) #:http.request.field{:name "ImportToken", :shape "CiphertextType"}) (clojure.core/into (ser-ciphertext-type (input :encrypted-key-material)) #:http.request.field{:name "EncryptedKeyMaterial", :shape "CiphertextType"})]} (clojure.core/contains? input :valid-to) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-type (input :valid-to)) #:http.request.field{:name "ValidTo", :shape "DateType"})) (clojure.core/contains? input :expiration-model) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expiration-model-type (input :expiration-model)) #:http.request.field{:name "ExpirationModel", :shape "ExpirationModelType"}))))

(clojure.core/defn- req-re-encrypt-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ciphertext-type (input :ciphertext-blob)) #:http.request.field{:name "CiphertextBlob", :shape "CiphertextType"}) (clojure.core/into (ser-key-id-type (input :destination-key-id)) #:http.request.field{:name "DestinationKeyId", :shape "KeyIdType"})]} (clojure.core/contains? input :source-encryption-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-context-type (input :source-encryption-context)) #:http.request.field{:name "SourceEncryptionContext", :shape "EncryptionContextType"})) (clojure.core/contains? input :destination-encryption-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-context-type (input :destination-encryption-context)) #:http.request.field{:name "DestinationEncryptionContext", :shape "EncryptionContextType"})) (clojure.core/contains? input :grant-tokens) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-token-list (input :grant-tokens)) #:http.request.field{:name "GrantTokens", :shape "GrantTokenList"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-list-grants-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "MarkerType"}))))

(clojure.core/defn- req-update-key-description-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"}) (clojure.core/into (ser-description-type (input :description)) #:http.request.field{:name "Description", :shape "DescriptionType"})]}))

(clojure.core/defn- req-generate-data-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]} (clojure.core/contains? input :encryption-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-context-type (input :encryption-context)) #:http.request.field{:name "EncryptionContext", :shape "EncryptionContextType"})) (clojure.core/contains? input :number-of-bytes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-of-bytes-type (input :number-of-bytes)) #:http.request.field{:name "NumberOfBytes", :shape "NumberOfBytesType"})) (clojure.core/contains? input :key-spec) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-key-spec (input :key-spec)) #:http.request.field{:name "KeySpec", :shape "DataKeySpec"})) (clojure.core/contains? input :grant-tokens) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-token-list (input :grant-tokens)) #:http.request.field{:name "GrantTokens", :shape "GrantTokenList"}))))

(clojure.core/defn- req-get-parameters-for-import-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"}) (clojure.core/into (ser-algorithm-spec (input :wrapping-algorithm)) #:http.request.field{:name "WrappingAlgorithm", :shape "AlgorithmSpec"}) (clojure.core/into (ser-wrapping-key-spec (input :wrapping-key-spec)) #:http.request.field{:name "WrappingKeySpec", :shape "WrappingKeySpec"})]}))

(clojure.core/defn- req-encrypt-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"}) (clojure.core/into (ser-plaintext-type (input :plaintext)) #:http.request.field{:name "Plaintext", :shape "PlaintextType"})]} (clojure.core/contains? input :encryption-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-context-type (input :encryption-context)) #:http.request.field{:name "EncryptionContext", :shape "EncryptionContextType"})) (clojure.core/contains? input :grant-tokens) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-token-list (input :grant-tokens)) #:http.request.field{:name "GrantTokens", :shape "GrantTokenList"}))))

(clojure.core/defn- req-generate-data-key-without-plaintext-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]} (clojure.core/contains? input :encryption-context) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-context-type (input :encryption-context)) #:http.request.field{:name "EncryptionContext", :shape "EncryptionContextType"})) (clojure.core/contains? input :key-spec) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data-key-spec (input :key-spec)) #:http.request.field{:name "KeySpec", :shape "DataKeySpec"})) (clojure.core/contains? input :number-of-bytes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-of-bytes-type (input :number-of-bytes)) #:http.request.field{:name "NumberOfBytes", :shape "NumberOfBytesType"})) (clojure.core/contains? input :grant-tokens) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-token-list (input :grant-tokens)) #:http.request.field{:name "GrantTokens", :shape "GrantTokenList"}))))

(clojure.core/defn- req-list-resource-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "MarkerType"}))))

(clojure.core/defn- req-delete-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alias-name-type (input :alias-name)) #:http.request.field{:name "AliasName", :shape "AliasNameType"})]}))

(clojure.core/defn- req-cancel-key-deletion-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]}))

(clojure.core/defn- req-enable-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]}))

(clojure.core/defn- req-create-key-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-type (input :policy)) #:http.request.field{:name "Policy", :shape "PolicyType"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-type (input :description)) #:http.request.field{:name "Description", :shape "DescriptionType"})) (clojure.core/contains? input :key-usage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-usage-type (input :key-usage)) #:http.request.field{:name "KeyUsage", :shape "KeyUsageType"})) (clojure.core/contains? input :origin) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-type (input :origin)) #:http.request.field{:name "Origin", :shape "OriginType"})) (clojure.core/contains? input :bypass-policy-lockout-safety-check) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :bypass-policy-lockout-safety-check)) #:http.request.field{:name "BypassPolicyLockoutSafetyCheck", :shape "BooleanType"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-put-key-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"}) (clojure.core/into (ser-policy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyNameType"}) (clojure.core/into (ser-policy-type (input :policy)) #:http.request.field{:name "Policy", :shape "PolicyType"})]} (clojure.core/contains? input :bypass-policy-lockout-safety-check) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :bypass-policy-lockout-safety-check)) #:http.request.field{:name "BypassPolicyLockoutSafetyCheck", :shape "BooleanType"}))))

(clojure.core/defn- req-create-grant-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"}) (clojure.core/into (ser-principal-id-type (input :grantee-principal)) #:http.request.field{:name "GranteePrincipal", :shape "PrincipalIdType"}) (clojure.core/into (ser-grant-operation-list (input :operations)) #:http.request.field{:name "Operations", :shape "GrantOperationList"})]} (clojure.core/contains? input :retiring-principal) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-principal-id-type (input :retiring-principal)) #:http.request.field{:name "RetiringPrincipal", :shape "PrincipalIdType"})) (clojure.core/contains? input :constraints) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-constraints (input :constraints)) #:http.request.field{:name "Constraints", :shape "GrantConstraints"})) (clojure.core/contains? input :grant-tokens) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-token-list (input :grant-tokens)) #:http.request.field{:name "GrantTokens", :shape "GrantTokenList"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-grant-name-type (input :name)) #:http.request.field{:name "Name", :shape "GrantNameType"}))))

(clojure.core/defn- req-list-retirable-grants-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-principal-id-type (input :retiring-principal)) #:http.request.field{:name "RetiringPrincipal", :shape "PrincipalIdType"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "MarkerType"}))))

(clojure.core/defn- req-list-key-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "MarkerType"}))))

(clojure.core/defn- req-disable-key-rotation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]}))

(clojure.core/defn- req-schedule-key-deletion-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]} (clojure.core/contains? input :pending-window-in-days) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pending-window-in-days-type (input :pending-window-in-days)) #:http.request.field{:name "PendingWindowInDays", :shape "PendingWindowInDaysType"}))))

(clojure.core/defn- req-list-aliases-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "MarkerType"}))))

(clojure.core/defn- req-list-keys-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-type (input :limit)) #:http.request.field{:name "Limit", :shape "LimitType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker-type (input :marker)) #:http.request.field{:name "Marker", :shape "MarkerType"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-disable-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-key-id-type (input :key-id)) #:http.request.field{:name "KeyId", :shape "KeyIdType"})]}))

(clojure.core/declare deser-principal-id-type)

(clojure.core/declare deser-arn-type)

(clojure.core/declare deser-tag-key-type)

(clojure.core/declare deser-key-metadata)

(clojure.core/declare deser-marker-type)

(clojure.core/declare deser-key-list-entry)

(clojure.core/declare deser-encryption-context-value)

(clojure.core/declare deser-grant-constraints)

(clojure.core/declare deser-grant-operation-list)

(clojure.core/declare deser-alias-list-entry)

(clojure.core/declare deser-key-list)

(clojure.core/declare deser-expiration-model-type)

(clojure.core/declare deser-plaintext-type)

(clojure.core/declare deser-grant-list)

(clojure.core/declare deser-error-message-type)

(clojure.core/declare deser-grant-token-type)

(clojure.core/declare deser-grant-id-type)

(clojure.core/declare deser-key-manager-type)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-policy-name-type)

(clojure.core/declare deser-date-type)

(clojure.core/declare deser-encryption-context-type)

(clojure.core/declare deser-alias-list)

(clojure.core/declare deser-tag-value-type)

(clojure.core/declare deser-key-id-type)

(clojure.core/declare deser-alias-name-type)

(clojure.core/declare deser-encryption-context-key)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-ciphertext-type)

(clojure.core/declare deser-aws-account-id-type)

(clojure.core/declare deser-grant-list-entry)

(clojure.core/declare deser-description-type)

(clojure.core/declare deser-grant-name-type)

(clojure.core/declare deser-origin-type)

(clojure.core/declare deser-key-usage-type)

(clojure.core/declare deser-policy-type)

(clojure.core/declare deser-policy-name-list)

(clojure.core/declare deser-key-state)

(clojure.core/declare deser-grant-operation)

(clojure.core/declare deser-boolean-type)

(clojure.core/defn- deser-principal-id-type [input] input)

(clojure.core/defn- deser-arn-type [input] input)

(clojure.core/defn- deser-tag-key-type [input] input)

(clojure.core/defn- deser-key-metadata [input] (clojure.core/cond-> {:key-id (deser-key-id-type (input "KeyId"))} (clojure.core/contains? input "KeyUsage") (clojure.core/assoc :key-usage (deser-key-usage-type (input "KeyUsage"))) (clojure.core/contains? input "DeletionDate") (clojure.core/assoc :deletion-date (deser-date-type (input "DeletionDate"))) (clojure.core/contains? input "Origin") (clojure.core/assoc :origin (deser-origin-type (input "Origin"))) (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean-type (input "Enabled"))) (clojure.core/contains? input "AWSAccountId") (clojure.core/assoc :aws-account-id (deser-aws-account-id-type (input "AWSAccountId"))) (clojure.core/contains? input "ExpirationModel") (clojure.core/assoc :expiration-model (deser-expiration-model-type (input "ExpirationModel"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-type (input "Description"))) (clojure.core/contains? input "KeyManager") (clojure.core/assoc :key-manager (deser-key-manager-type (input "KeyManager"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn-type (input "Arn"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate"))) (clojure.core/contains? input "ValidTo") (clojure.core/assoc :valid-to (deser-date-type (input "ValidTo"))) (clojure.core/contains? input "KeyState") (clojure.core/assoc :key-state (deser-key-state (input "KeyState")))))

(clojure.core/defn- deser-marker-type [input] input)

(clojure.core/defn- deser-key-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id-type (input "KeyId"))) (clojure.core/contains? input "KeyArn") (clojure.core/assoc :key-arn (deser-arn-type (input "KeyArn")))))

(clojure.core/defn- deser-encryption-context-value [input] input)

(clojure.core/defn- deser-grant-constraints [input] (clojure.core/cond-> {} (clojure.core/contains? input "EncryptionContextSubset") (clojure.core/assoc :encryption-context-subset (deser-encryption-context-type (input "EncryptionContextSubset"))) (clojure.core/contains? input "EncryptionContextEquals") (clojure.core/assoc :encryption-context-equals (deser-encryption-context-type (input "EncryptionContextEquals")))))

(clojure.core/defn- deser-grant-operation-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-grant-operation coll))) input))

(clojure.core/defn- deser-alias-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "AliasName") (clojure.core/assoc :alias-name (deser-alias-name-type (input "AliasName"))) (clojure.core/contains? input "AliasArn") (clojure.core/assoc :alias-arn (deser-arn-type (input "AliasArn"))) (clojure.core/contains? input "TargetKeyId") (clojure.core/assoc :target-key-id (deser-key-id-type (input "TargetKeyId")))))

(clojure.core/defn- deser-key-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-list-entry coll))) input))

(clojure.core/defn- deser-expiration-model-type [input] (clojure.core/get {"KEY_MATERIAL_EXPIRES" :key-material-expires, "KEY_MATERIAL_DOES_NOT_EXPIRE" :key-material-does-not-expire} input))

(clojure.core/defn- deser-plaintext-type [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-grant-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-grant-list-entry coll))) input))

(clojure.core/defn- deser-error-message-type [input] input)

(clojure.core/defn- deser-grant-token-type [input] input)

(clojure.core/defn- deser-grant-id-type [input] input)

(clojure.core/defn- deser-key-manager-type [input] (clojure.core/get {"AWS" :aws, "CUSTOMER" :customer} input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-policy-name-type [input] input)

(clojure.core/defn- deser-date-type [input] input)

(clojure.core/defn- deser-encryption-context-type [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-encryption-context-key k) (deser-encryption-context-value v)])) input))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-alias-list-entry coll))) input))

(clojure.core/defn- deser-tag-value-type [input] input)

(clojure.core/defn- deser-key-id-type [input] input)

(clojure.core/defn- deser-alias-name-type [input] input)

(clojure.core/defn- deser-encryption-context-key [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:tag-key (deser-tag-key-type (input "TagKey")), :tag-value (deser-tag-value-type (input "TagValue"))}))

(clojure.core/defn- deser-ciphertext-type [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-aws-account-id-type [input] input)

(clojure.core/defn- deser-grant-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "RetiringPrincipal") (clojure.core/assoc :retiring-principal (deser-principal-id-type (input "RetiringPrincipal"))) (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id-type (input "KeyId"))) (clojure.core/contains? input "GranteePrincipal") (clojure.core/assoc :grantee-principal (deser-principal-id-type (input "GranteePrincipal"))) (clojure.core/contains? input "IssuingAccount") (clojure.core/assoc :issuing-account (deser-principal-id-type (input "IssuingAccount"))) (clojure.core/contains? input "Operations") (clojure.core/assoc :operations (deser-grant-operation-list (input "Operations"))) (clojure.core/contains? input "CreationDate") (clojure.core/assoc :creation-date (deser-date-type (input "CreationDate"))) (clojure.core/contains? input "GrantId") (clojure.core/assoc :grant-id (deser-grant-id-type (input "GrantId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-grant-name-type (input "Name"))) (clojure.core/contains? input "Constraints") (clojure.core/assoc :constraints (deser-grant-constraints (input "Constraints")))))

(clojure.core/defn- deser-description-type [input] input)

(clojure.core/defn- deser-grant-name-type [input] input)

(clojure.core/defn- deser-origin-type [input] (clojure.core/get {"AWS_KMS" :aws-kms, "EXTERNAL" :external} input))

(clojure.core/defn- deser-key-usage-type [input] (clojure.core/get {"ENCRYPT_DECRYPT" :encrypt-decrypt} input))

(clojure.core/defn- deser-policy-type [input] input)

(clojure.core/defn- deser-policy-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-name-type coll))) input))

(clojure.core/defn- deser-key-state [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled, "PendingDeletion" :pending-deletion, "PendingImport" :pending-import} input))

(clojure.core/defn- deser-grant-operation [input] (clojure.core/get {"GenerateDataKeyWithoutPlaintext" :generate-data-key-without-plaintext, "ReEncryptTo" :re-encrypt-to, "Decrypt" :decrypt, "RetireGrant" :retire-grant, "GenerateDataKey" :generate-data-key, "Encrypt" :encrypt, "ReEncryptFrom" :re-encrypt-from, "CreateGrant" :create-grant, "DescribeKey" :describe-key} input))

(clojure.core/defn- deser-boolean-type [input] input)

(clojure.core/defn- deser-get-key-rotation-status-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyRotationEnabled") (clojure.core/assoc :key-rotation-enabled (deser-boolean-type (input "KeyRotationEnabled")))))

(clojure.core/defn- deser-encrypt-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "CiphertextBlob") (clojure.core/assoc :ciphertext-blob (deser-ciphertext-type (input "CiphertextBlob"))) (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id-type (input "KeyId")))))

(clojure.core/defn- deser-list-resource-tags-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list (input "Tags"))) (clojure.core/contains? input "NextMarker") (clojure.core/assoc :next-marker (deser-marker-type (input "NextMarker"))) (clojure.core/contains? input "Truncated") (clojure.core/assoc :truncated (deser-boolean-type (input "Truncated")))))

(clojure.core/defn- deser-tag-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-disabled-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-already-exists-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-invalid-grant-id-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-invalid-import-token-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-invalid-key-usage-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-decrypt-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id-type (input "KeyId"))) (clojure.core/contains? input "Plaintext") (clojure.core/assoc :plaintext (deser-plaintext-type (input "Plaintext")))))

(clojure.core/defn- deser-invalid-ciphertext-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-key-unavailable-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-list-grants-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Grants") (clojure.core/assoc :grants (deser-grant-list (input "Grants"))) (clojure.core/contains? input "NextMarker") (clojure.core/assoc :next-marker (deser-marker-type (input "NextMarker"))) (clojure.core/contains? input "Truncated") (clojure.core/assoc :truncated (deser-boolean-type (input "Truncated")))))

(clojure.core/defn- deser-get-parameters-for-import-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id-type (input "KeyId"))) (clojure.core/contains? input "ImportToken") (clojure.core/assoc :import-token (deser-ciphertext-type (input "ImportToken"))) (clojure.core/contains? input "PublicKey") (clojure.core/assoc :public-key (deser-plaintext-type (input "PublicKey"))) (clojure.core/contains? input "ParametersValidTo") (clojure.core/assoc :parameters-valid-to (deser-date-type (input "ParametersValidTo")))))

(clojure.core/defn- deser-list-key-policies-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "PolicyNames") (clojure.core/assoc :policy-names (deser-policy-name-list (input "PolicyNames"))) (clojure.core/contains? input "NextMarker") (clojure.core/assoc :next-marker (deser-marker-type (input "NextMarker"))) (clojure.core/contains? input "Truncated") (clojure.core/assoc :truncated (deser-boolean-type (input "Truncated")))))

(clojure.core/defn- deser-dependency-timeout-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-kms-invalid-state-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-schedule-key-deletion-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id-type (input "KeyId"))) (clojure.core/contains? input "DeletionDate") (clojure.core/assoc :deletion-date (deser-date-type (input "DeletionDate")))))

(clojure.core/defn- deser-generate-data-key-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "CiphertextBlob") (clojure.core/assoc :ciphertext-blob (deser-ciphertext-type (input "CiphertextBlob"))) (clojure.core/contains? input "Plaintext") (clojure.core/assoc :plaintext (deser-plaintext-type (input "Plaintext"))) (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id-type (input "KeyId")))))

(clojure.core/defn- deser-invalid-arn-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-get-key-policy-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Policy") (clojure.core/assoc :policy (deser-policy-type (input "Policy")))))

(clojure.core/defn- deser-unsupported-operation-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-malformed-policy-document-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-import-key-material-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-marker-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-describe-key-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyMetadata") (clojure.core/assoc :key-metadata (deser-key-metadata (input "KeyMetadata")))))

(clojure.core/defn- deser-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-generate-random-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Plaintext") (clojure.core/assoc :plaintext (deser-plaintext-type (input "Plaintext")))))

(clojure.core/defn- deser-kms-internal-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-invalid-alias-name-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-invalid-grant-token-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-list-aliases-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Aliases") (clojure.core/assoc :aliases (deser-alias-list (input "Aliases"))) (clojure.core/contains? input "NextMarker") (clojure.core/assoc :next-marker (deser-marker-type (input "NextMarker"))) (clojure.core/contains? input "Truncated") (clojure.core/assoc :truncated (deser-boolean-type (input "Truncated")))))

(clojure.core/defn- deser-expired-import-token-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.core/defn- deser-cancel-key-deletion-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id-type (input "KeyId")))))

(clojure.core/defn- deser-re-encrypt-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "CiphertextBlob") (clojure.core/assoc :ciphertext-blob (deser-ciphertext-type (input "CiphertextBlob"))) (clojure.core/contains? input "SourceKeyId") (clojure.core/assoc :source-key-id (deser-key-id-type (input "SourceKeyId"))) (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id-type (input "KeyId")))))

(clojure.core/defn- deser-create-grant-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "GrantToken") (clojure.core/assoc :grant-token (deser-grant-token-type (input "GrantToken"))) (clojure.core/contains? input "GrantId") (clojure.core/assoc :grant-id (deser-grant-id-type (input "GrantId")))))

(clojure.core/defn- deser-generate-data-key-without-plaintext-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "CiphertextBlob") (clojure.core/assoc :ciphertext-blob (deser-ciphertext-type (input "CiphertextBlob"))) (clojure.core/contains? input "KeyId") (clojure.core/assoc :key-id (deser-key-id-type (input "KeyId")))))

(clojure.core/defn- deser-create-key-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "KeyMetadata") (clojure.core/assoc :key-metadata (deser-key-metadata (input "KeyMetadata")))))

(clojure.core/defn- deser-list-keys-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Keys") (clojure.core/assoc :keys (deser-key-list (input "Keys"))) (clojure.core/contains? input "NextMarker") (clojure.core/assoc :next-marker (deser-marker-type (input "NextMarker"))) (clojure.core/contains? input "Truncated") (clojure.core/assoc :truncated (deser-boolean-type (input "Truncated")))))

(clojure.core/defn- deser-incorrect-key-material-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message-type (input "message")))))

(clojure.spec.alpha/def :portkey.aws.kms.get-key-rotation-status-response/key-rotation-enabled (clojure.spec.alpha/and :portkey.aws.kms/boolean-type))
(clojure.spec.alpha/def :portkey.aws.kms/get-key-rotation-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.get-key-rotation-status-response/key-rotation-enabled]))

(clojure.spec.alpha/def :portkey.aws.kms/principal-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.kms.encrypt-response/ciphertext-blob (clojure.spec.alpha/and :portkey.aws.kms/ciphertext-type))
(clojure.spec.alpha/def :portkey.aws.kms.encrypt-response/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/encrypt-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.encrypt-response/ciphertext-blob :portkey.aws.kms.encrypt-response/key-id]))

(clojure.spec.alpha/def :portkey.aws.kms.list-resource-tags-response/tags (clojure.spec.alpha/and :portkey.aws.kms/tag-list))
(clojure.spec.alpha/def :portkey.aws.kms.list-resource-tags-response/next-marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-resource-tags-response/truncated (clojure.spec.alpha/and :portkey.aws.kms/boolean-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-resource-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.list-resource-tags-response/tags :portkey.aws.kms.list-resource-tags-response/next-marker :portkey.aws.kms.list-resource-tags-response/truncated]))

(clojure.spec.alpha/def :portkey.aws.kms.tag-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.tag-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.disabled-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.update-alias-request/alias-name (clojure.spec.alpha/and :portkey.aws.kms/alias-name-type))
(clojure.spec.alpha/def :portkey.aws.kms.update-alias-request/target-key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/update-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.update-alias-request/alias-name :portkey.aws.kms.update-alias-request/target-key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.generate-random-request/number-of-bytes (clojure.spec.alpha/and :portkey.aws.kms/number-of-bytes-type))
(clojure.spec.alpha/def :portkey.aws.kms/generate-random-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.generate-random-request/number-of-bytes]))

(clojure.spec.alpha/def :portkey.aws.kms.get-key-rotation-status-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/get-key-rotation-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.get-key-rotation-status-request/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms/data-key-spec #{:aes-128 :aes-256 "AES_128" "AES_256"})

(clojure.spec.alpha/def :portkey.aws.kms.invalid-grant-id-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/invalid-grant-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.invalid-grant-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms/arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 20 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.kms/number-of-bytes-type (clojure.spec.alpha/int-in 1 1024))

(clojure.spec.alpha/def :portkey.aws.kms.invalid-import-token-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/invalid-import-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.invalid-import-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms/tag-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.kms/wrapping-key-spec #{"RSA_2048" :rsa-2048})

(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/key-usage (clojure.spec.alpha/and :portkey.aws.kms/key-usage-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/deletion-date (clojure.spec.alpha/and :portkey.aws.kms/date-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/origin (clojure.spec.alpha/and :portkey.aws.kms/origin-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/enabled (clojure.spec.alpha/and :portkey.aws.kms/boolean-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/aws-account-id (clojure.spec.alpha/and :portkey.aws.kms/aws-account-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/expiration-model (clojure.spec.alpha/and :portkey.aws.kms/expiration-model-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/description (clojure.spec.alpha/and :portkey.aws.kms/description-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/key-manager (clojure.spec.alpha/and :portkey.aws.kms/key-manager-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/arn (clojure.spec.alpha/and :portkey.aws.kms/arn-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.kms/date-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-metadata/valid-to (clojure.spec.alpha/and :portkey.aws.kms/date-type))
(clojure.spec.alpha/def :portkey.aws.kms/key-metadata (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.key-metadata/key-id] :opt-un [:portkey.aws.kms.key-metadata/key-usage :portkey.aws.kms.key-metadata/deletion-date :portkey.aws.kms.key-metadata/origin :portkey.aws.kms.key-metadata/enabled :portkey.aws.kms.key-metadata/aws-account-id :portkey.aws.kms.key-metadata/expiration-model :portkey.aws.kms.key-metadata/description :portkey.aws.kms.key-metadata/key-manager :portkey.aws.kms.key-metadata/arn :portkey.aws.kms.key-metadata/creation-date :portkey.aws.kms.key-metadata/valid-to :portkey.aws.kms/key-state]))

(clojure.spec.alpha/def :portkey.aws.kms.invalid-key-usage-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/invalid-key-usage-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.invalid-key-usage-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms/marker-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.kms.decrypt-response/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.decrypt-response/plaintext (clojure.spec.alpha/and :portkey.aws.kms/plaintext-type))
(clojure.spec.alpha/def :portkey.aws.kms/decrypt-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.decrypt-response/key-id :portkey.aws.kms.decrypt-response/plaintext]))

(clojure.spec.alpha/def :portkey.aws.kms.decrypt-request/ciphertext-blob (clojure.spec.alpha/and :portkey.aws.kms/ciphertext-type))
(clojure.spec.alpha/def :portkey.aws.kms.decrypt-request/encryption-context (clojure.spec.alpha/and :portkey.aws.kms/encryption-context-type))
(clojure.spec.alpha/def :portkey.aws.kms.decrypt-request/grant-tokens (clojure.spec.alpha/and :portkey.aws.kms/grant-token-list))
(clojure.spec.alpha/def :portkey.aws.kms/decrypt-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.decrypt-request/ciphertext-blob] :opt-un [:portkey.aws.kms.decrypt-request/encryption-context :portkey.aws.kms.decrypt-request/grant-tokens]))

(clojure.spec.alpha/def :portkey.aws.kms.key-list-entry/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.key-list-entry/key-arn (clojure.spec.alpha/and :portkey.aws.kms/arn-type))
(clojure.spec.alpha/def :portkey.aws.kms/key-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.key-list-entry/key-id :portkey.aws.kms.key-list-entry/key-arn]))

(clojure.spec.alpha/def :portkey.aws.kms/encryption-context-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kms.grant-constraints/encryption-context-subset (clojure.spec.alpha/and :portkey.aws.kms/encryption-context-type))
(clojure.spec.alpha/def :portkey.aws.kms.grant-constraints/encryption-context-equals (clojure.spec.alpha/and :portkey.aws.kms/encryption-context-type))
(clojure.spec.alpha/def :portkey.aws.kms/grant-constraints (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.grant-constraints/encryption-context-subset :portkey.aws.kms.grant-constraints/encryption-context-equals]))

(clojure.spec.alpha/def :portkey.aws.kms/grant-token-list (clojure.spec.alpha/coll-of :portkey.aws.kms/grant-token-type :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.kms/grant-operation-list (clojure.spec.alpha/coll-of :portkey.aws.kms/grant-operation))

(clojure.spec.alpha/def :portkey.aws.kms.delete-imported-key-material-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/delete-imported-key-material-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.delete-imported-key-material-request/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.invalid-ciphertext-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/invalid-ciphertext-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.invalid-ciphertext-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.alias-list-entry/alias-name (clojure.spec.alpha/and :portkey.aws.kms/alias-name-type))
(clojure.spec.alpha/def :portkey.aws.kms.alias-list-entry/alias-arn (clojure.spec.alpha/and :portkey.aws.kms/arn-type))
(clojure.spec.alpha/def :portkey.aws.kms.alias-list-entry/target-key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/alias-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.alias-list-entry/alias-name :portkey.aws.kms.alias-list-entry/alias-arn :portkey.aws.kms.alias-list-entry/target-key-id]))

(clojure.spec.alpha/def :portkey.aws.kms/key-list (clojure.spec.alpha/coll-of :portkey.aws.kms/key-list-entry))

(clojure.spec.alpha/def :portkey.aws.kms.describe-key-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.describe-key-request/grant-tokens (clojure.spec.alpha/and :portkey.aws.kms/grant-token-list))
(clojure.spec.alpha/def :portkey.aws.kms/describe-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.describe-key-request/key-id] :opt-un [:portkey.aws.kms.describe-key-request/grant-tokens]))

(clojure.spec.alpha/def :portkey.aws.kms.key-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/key-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.key-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.list-grants-response/grants (clojure.spec.alpha/and :portkey.aws.kms/grant-list))
(clojure.spec.alpha/def :portkey.aws.kms.list-grants-response/next-marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-grants-response/truncated (clojure.spec.alpha/and :portkey.aws.kms/boolean-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-grants-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.list-grants-response/grants :portkey.aws.kms.list-grants-response/next-marker :portkey.aws.kms.list-grants-response/truncated]))

(clojure.spec.alpha/def :portkey.aws.kms.revoke-grant-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.revoke-grant-request/grant-id (clojure.spec.alpha/and :portkey.aws.kms/grant-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/revoke-grant-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.revoke-grant-request/key-id :portkey.aws.kms.revoke-grant-request/grant-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.get-parameters-for-import-response/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.get-parameters-for-import-response/import-token (clojure.spec.alpha/and :portkey.aws.kms/ciphertext-type))
(clojure.spec.alpha/def :portkey.aws.kms.get-parameters-for-import-response/public-key (clojure.spec.alpha/and :portkey.aws.kms/plaintext-type))
(clojure.spec.alpha/def :portkey.aws.kms.get-parameters-for-import-response/parameters-valid-to (clojure.spec.alpha/and :portkey.aws.kms/date-type))
(clojure.spec.alpha/def :portkey.aws.kms/get-parameters-for-import-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.get-parameters-for-import-response/key-id :portkey.aws.kms.get-parameters-for-import-response/import-token :portkey.aws.kms.get-parameters-for-import-response/public-key :portkey.aws.kms.get-parameters-for-import-response/parameters-valid-to]))

(clojure.spec.alpha/def :portkey.aws.kms.list-key-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.kms/policy-name-list))
(clojure.spec.alpha/def :portkey.aws.kms.list-key-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-key-policies-response/truncated (clojure.spec.alpha/and :portkey.aws.kms/boolean-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-key-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.list-key-policies-response/policy-names :portkey.aws.kms.list-key-policies-response/next-marker :portkey.aws.kms.list-key-policies-response/truncated]))

(clojure.spec.alpha/def :portkey.aws.kms.dependency-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/dependency-timeout-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.dependency-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.kms-invalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/kms-invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.kms-invalid-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.schedule-key-deletion-response/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.schedule-key-deletion-response/deletion-date (clojure.spec.alpha/and :portkey.aws.kms/date-type))
(clojure.spec.alpha/def :portkey.aws.kms/schedule-key-deletion-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.schedule-key-deletion-response/key-id :portkey.aws.kms.schedule-key-deletion-response/deletion-date]))

(clojure.spec.alpha/def :portkey.aws.kms.get-key-policy-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.get-key-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.kms/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.kms/get-key-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.get-key-policy-request/key-id :portkey.aws.kms.get-key-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms/expiration-model-type #{"KEY_MATERIAL_DOES_NOT_EXPIRE" :key-material-expires "KEY_MATERIAL_EXPIRES" :key-material-does-not-expire})

(clojure.spec.alpha/def :portkey.aws.kms/plaintext-type clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.kms/grant-list (clojure.spec.alpha/coll-of :portkey.aws.kms/grant-list-entry))

(clojure.spec.alpha/def :portkey.aws.kms.retire-grant-request/grant-token (clojure.spec.alpha/and :portkey.aws.kms/grant-token-type))
(clojure.spec.alpha/def :portkey.aws.kms.retire-grant-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.retire-grant-request/grant-id (clojure.spec.alpha/and :portkey.aws.kms/grant-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/retire-grant-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.retire-grant-request/grant-token :portkey.aws.kms.retire-grant-request/key-id :portkey.aws.kms.retire-grant-request/grant-id]))

(clojure.spec.alpha/def :portkey.aws.kms/error-message-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kms.create-alias-request/alias-name (clojure.spec.alpha/and :portkey.aws.kms/alias-name-type))
(clojure.spec.alpha/def :portkey.aws.kms.create-alias-request/target-key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/create-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.create-alias-request/alias-name :portkey.aws.kms.create-alias-request/target-key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms/grant-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.kms/grant-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.kms/key-manager-type #{:aws "AWS" :customer "CUSTOMER"})

(clojure.spec.alpha/def :portkey.aws.kms.enable-key-rotation-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/enable-key-rotation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.enable-key-rotation-request/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.import-key-material-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.import-key-material-request/import-token (clojure.spec.alpha/and :portkey.aws.kms/ciphertext-type))
(clojure.spec.alpha/def :portkey.aws.kms.import-key-material-request/encrypted-key-material (clojure.spec.alpha/and :portkey.aws.kms/ciphertext-type))
(clojure.spec.alpha/def :portkey.aws.kms.import-key-material-request/valid-to (clojure.spec.alpha/and :portkey.aws.kms/date-type))
(clojure.spec.alpha/def :portkey.aws.kms.import-key-material-request/expiration-model (clojure.spec.alpha/and :portkey.aws.kms/expiration-model-type))
(clojure.spec.alpha/def :portkey.aws.kms/import-key-material-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.import-key-material-request/key-id :portkey.aws.kms.import-key-material-request/import-token :portkey.aws.kms.import-key-material-request/encrypted-key-material] :opt-un [:portkey.aws.kms.import-key-material-request/valid-to :portkey.aws.kms.import-key-material-request/expiration-model]))

(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-response/ciphertext-blob (clojure.spec.alpha/and :portkey.aws.kms/ciphertext-type))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-response/plaintext (clojure.spec.alpha/and :portkey.aws.kms/plaintext-type))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-response/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/generate-data-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.generate-data-key-response/ciphertext-blob :portkey.aws.kms.generate-data-key-response/plaintext :portkey.aws.kms.generate-data-key-response/key-id]))

(clojure.spec.alpha/def :portkey.aws.kms.invalid-arn-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/invalid-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.invalid-arn-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.re-encrypt-request/ciphertext-blob (clojure.spec.alpha/and :portkey.aws.kms/ciphertext-type))
(clojure.spec.alpha/def :portkey.aws.kms.re-encrypt-request/source-encryption-context (clojure.spec.alpha/and :portkey.aws.kms/encryption-context-type))
(clojure.spec.alpha/def :portkey.aws.kms.re-encrypt-request/destination-key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.re-encrypt-request/destination-encryption-context (clojure.spec.alpha/and :portkey.aws.kms/encryption-context-type))
(clojure.spec.alpha/def :portkey.aws.kms.re-encrypt-request/grant-tokens (clojure.spec.alpha/and :portkey.aws.kms/grant-token-list))
(clojure.spec.alpha/def :portkey.aws.kms/re-encrypt-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.re-encrypt-request/ciphertext-blob :portkey.aws.kms.re-encrypt-request/destination-key-id] :opt-un [:portkey.aws.kms.re-encrypt-request/source-encryption-context :portkey.aws.kms.re-encrypt-request/destination-encryption-context :portkey.aws.kms.re-encrypt-request/grant-tokens]))

(clojure.spec.alpha/def :portkey.aws.kms.tag-resource-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.kms/tag-list))
(clojure.spec.alpha/def :portkey.aws.kms/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.tag-resource-request/key-id :portkey.aws.kms.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms/tag-list (clojure.spec.alpha/coll-of :portkey.aws.kms/tag))

(clojure.spec.alpha/def :portkey.aws.kms.list-grants-request/limit (clojure.spec.alpha/and :portkey.aws.kms/limit-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-grants-request/marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-grants-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-grants-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.list-grants-request/key-id] :opt-un [:portkey.aws.kms.list-grants-request/limit :portkey.aws.kms.list-grants-request/marker]))

(clojure.spec.alpha/def :portkey.aws.kms/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.kms/tag-key-type))

(clojure.spec.alpha/def :portkey.aws.kms/policy-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\w]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.kms/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kms.update-key-description-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.update-key-description-request/description (clojure.spec.alpha/and :portkey.aws.kms/description-type))
(clojure.spec.alpha/def :portkey.aws.kms/update-key-description-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.update-key-description-request/key-id :portkey.aws.kms.update-key-description-request/description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.get-key-policy-response/policy (clojure.spec.alpha/and :portkey.aws.kms/policy-type))
(clojure.spec.alpha/def :portkey.aws.kms/get-key-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.get-key-policy-response/policy]))

(clojure.spec.alpha/def :portkey.aws.kms/encryption-context-type (clojure.spec.alpha/map-of :portkey.aws.kms/encryption-context-key :portkey.aws.kms/encryption-context-value))

(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-request/encryption-context (clojure.spec.alpha/and :portkey.aws.kms/encryption-context-type))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-request/number-of-bytes (clojure.spec.alpha/and :portkey.aws.kms/number-of-bytes-type))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-request/key-spec (clojure.spec.alpha/and :portkey.aws.kms/data-key-spec))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-request/grant-tokens (clojure.spec.alpha/and :portkey.aws.kms/grant-token-list))
(clojure.spec.alpha/def :portkey.aws.kms/generate-data-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.generate-data-key-request/key-id] :opt-un [:portkey.aws.kms.generate-data-key-request/encryption-context :portkey.aws.kms.generate-data-key-request/number-of-bytes :portkey.aws.kms.generate-data-key-request/key-spec :portkey.aws.kms.generate-data-key-request/grant-tokens]))

(clojure.spec.alpha/def :portkey.aws.kms.get-parameters-for-import-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.get-parameters-for-import-request/wrapping-algorithm (clojure.spec.alpha/and :portkey.aws.kms/algorithm-spec))
(clojure.spec.alpha/def :portkey.aws.kms/get-parameters-for-import-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.get-parameters-for-import-request/key-id :portkey.aws.kms.get-parameters-for-import-request/wrapping-algorithm :portkey.aws.kms/wrapping-key-spec] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.encrypt-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.encrypt-request/plaintext (clojure.spec.alpha/and :portkey.aws.kms/plaintext-type))
(clojure.spec.alpha/def :portkey.aws.kms.encrypt-request/encryption-context (clojure.spec.alpha/and :portkey.aws.kms/encryption-context-type))
(clojure.spec.alpha/def :portkey.aws.kms.encrypt-request/grant-tokens (clojure.spec.alpha/and :portkey.aws.kms/grant-token-list))
(clojure.spec.alpha/def :portkey.aws.kms/encrypt-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.encrypt-request/key-id :portkey.aws.kms.encrypt-request/plaintext] :opt-un [:portkey.aws.kms.encrypt-request/encryption-context :portkey.aws.kms.encrypt-request/grant-tokens]))

(clojure.spec.alpha/def :portkey.aws.kms.unsupported-operation-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/unsupported-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.unsupported-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/malformed-policy-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.malformed-policy-document-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms/import-key-material-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.invalid-marker-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/invalid-marker-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.invalid-marker-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms/alias-list (clojure.spec.alpha/coll-of :portkey.aws.kms/alias-list-entry))

(clojure.spec.alpha/def :portkey.aws.kms/describe-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms/key-metadata]))

(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-without-plaintext-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-without-plaintext-request/encryption-context (clojure.spec.alpha/and :portkey.aws.kms/encryption-context-type))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-without-plaintext-request/key-spec (clojure.spec.alpha/and :portkey.aws.kms/data-key-spec))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-without-plaintext-request/number-of-bytes (clojure.spec.alpha/and :portkey.aws.kms/number-of-bytes-type))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-without-plaintext-request/grant-tokens (clojure.spec.alpha/and :portkey.aws.kms/grant-token-list))
(clojure.spec.alpha/def :portkey.aws.kms/generate-data-key-without-plaintext-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.generate-data-key-without-plaintext-request/key-id] :opt-un [:portkey.aws.kms.generate-data-key-without-plaintext-request/encryption-context :portkey.aws.kms.generate-data-key-without-plaintext-request/key-spec :portkey.aws.kms.generate-data-key-without-plaintext-request/number-of-bytes :portkey.aws.kms.generate-data-key-without-plaintext-request/grant-tokens]))

(clojure.spec.alpha/def :portkey.aws.kms.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.list-resource-tags-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-resource-tags-request/limit (clojure.spec.alpha/and :portkey.aws.kms/limit-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-resource-tags-request/marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-resource-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.list-resource-tags-request/key-id] :opt-un [:portkey.aws.kms.list-resource-tags-request/limit :portkey.aws.kms.list-resource-tags-request/marker]))

(clojure.spec.alpha/def :portkey.aws.kms.generate-random-response/plaintext (clojure.spec.alpha/and :portkey.aws.kms/plaintext-type))
(clojure.spec.alpha/def :portkey.aws.kms/generate-random-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.generate-random-response/plaintext]))

(clojure.spec.alpha/def :portkey.aws.kms.delete-alias-request/alias-name (clojure.spec.alpha/and :portkey.aws.kms/alias-name-type))
(clojure.spec.alpha/def :portkey.aws.kms/delete-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.delete-alias-request/alias-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.kms-internal-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/kms-internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.kms-internal-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms/tag-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.kms.cancel-key-deletion-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/cancel-key-deletion-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.cancel-key-deletion-request/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms/key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.kms.enable-key-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/enable-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.enable-key-request/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.invalid-alias-name-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/invalid-alias-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.invalid-alias-name-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.invalid-grant-token-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/invalid-grant-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.invalid-grant-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.list-aliases-response/aliases (clojure.spec.alpha/and :portkey.aws.kms/alias-list))
(clojure.spec.alpha/def :portkey.aws.kms.list-aliases-response/next-marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-aliases-response/truncated (clojure.spec.alpha/and :portkey.aws.kms/boolean-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-aliases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.list-aliases-response/aliases :portkey.aws.kms.list-aliases-response/next-marker :portkey.aws.kms.list-aliases-response/truncated]))

(clojure.spec.alpha/def :portkey.aws.kms.create-key-request/policy (clojure.spec.alpha/and :portkey.aws.kms/policy-type))
(clojure.spec.alpha/def :portkey.aws.kms.create-key-request/description (clojure.spec.alpha/and :portkey.aws.kms/description-type))
(clojure.spec.alpha/def :portkey.aws.kms.create-key-request/key-usage (clojure.spec.alpha/and :portkey.aws.kms/key-usage-type))
(clojure.spec.alpha/def :portkey.aws.kms.create-key-request/origin (clojure.spec.alpha/and :portkey.aws.kms/origin-type))
(clojure.spec.alpha/def :portkey.aws.kms.create-key-request/bypass-policy-lockout-safety-check (clojure.spec.alpha/and :portkey.aws.kms/boolean-type))
(clojure.spec.alpha/def :portkey.aws.kms.create-key-request/tags (clojure.spec.alpha/and :portkey.aws.kms/tag-list))
(clojure.spec.alpha/def :portkey.aws.kms/create-key-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.create-key-request/policy :portkey.aws.kms.create-key-request/description :portkey.aws.kms.create-key-request/key-usage :portkey.aws.kms.create-key-request/origin :portkey.aws.kms.create-key-request/bypass-policy-lockout-safety-check :portkey.aws.kms.create-key-request/tags]))

(clojure.spec.alpha/def :portkey.aws.kms/alias-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9:/_-]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.kms.put-key-policy-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.put-key-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.kms/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.kms.put-key-policy-request/policy (clojure.spec.alpha/and :portkey.aws.kms/policy-type))
(clojure.spec.alpha/def :portkey.aws.kms.put-key-policy-request/bypass-policy-lockout-safety-check (clojure.spec.alpha/and :portkey.aws.kms/boolean-type))
(clojure.spec.alpha/def :portkey.aws.kms/put-key-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.put-key-policy-request/key-id :portkey.aws.kms.put-key-policy-request/policy-name :portkey.aws.kms.put-key-policy-request/policy] :opt-un [:portkey.aws.kms.put-key-policy-request/bypass-policy-lockout-safety-check]))

(clojure.spec.alpha/def :portkey.aws.kms.create-grant-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.create-grant-request/grantee-principal (clojure.spec.alpha/and :portkey.aws.kms/principal-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.create-grant-request/retiring-principal (clojure.spec.alpha/and :portkey.aws.kms/principal-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.create-grant-request/operations (clojure.spec.alpha/and :portkey.aws.kms/grant-operation-list))
(clojure.spec.alpha/def :portkey.aws.kms.create-grant-request/constraints (clojure.spec.alpha/and :portkey.aws.kms/grant-constraints))
(clojure.spec.alpha/def :portkey.aws.kms.create-grant-request/grant-tokens (clojure.spec.alpha/and :portkey.aws.kms/grant-token-list))
(clojure.spec.alpha/def :portkey.aws.kms.create-grant-request/name (clojure.spec.alpha/and :portkey.aws.kms/grant-name-type))
(clojure.spec.alpha/def :portkey.aws.kms/create-grant-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.create-grant-request/key-id :portkey.aws.kms.create-grant-request/grantee-principal :portkey.aws.kms.create-grant-request/operations] :opt-un [:portkey.aws.kms.create-grant-request/retiring-principal :portkey.aws.kms.create-grant-request/constraints :portkey.aws.kms.create-grant-request/grant-tokens :portkey.aws.kms.create-grant-request/name]))

(clojure.spec.alpha/def :portkey.aws.kms/encryption-context-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kms.list-retirable-grants-request/limit (clojure.spec.alpha/and :portkey.aws.kms/limit-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-retirable-grants-request/marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-retirable-grants-request/retiring-principal (clojure.spec.alpha/and :portkey.aws.kms/principal-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-retirable-grants-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.list-retirable-grants-request/retiring-principal] :opt-un [:portkey.aws.kms.list-retirable-grants-request/limit :portkey.aws.kms.list-retirable-grants-request/marker]))

(clojure.spec.alpha/def :portkey.aws.kms.expired-import-token-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/expired-import-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.expired-import-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms.tag/tag-key (clojure.spec.alpha/and :portkey.aws.kms/tag-key-type))
(clojure.spec.alpha/def :portkey.aws.kms.tag/tag-value (clojure.spec.alpha/and :portkey.aws.kms/tag-value-type))
(clojure.spec.alpha/def :portkey.aws.kms/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.tag/tag-key :portkey.aws.kms.tag/tag-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms/ciphertext-type clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.kms/aws-account-id-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kms/limit-type (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.kms.list-key-policies-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-key-policies-request/limit (clojure.spec.alpha/and :portkey.aws.kms/limit-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-key-policies-request/marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-key-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.list-key-policies-request/key-id] :opt-un [:portkey.aws.kms.list-key-policies-request/limit :portkey.aws.kms.list-key-policies-request/marker]))

(clojure.spec.alpha/def :portkey.aws.kms.disable-key-rotation-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/disable-key-rotation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.disable-key-rotation-request/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.grant-list-entry/retiring-principal (clojure.spec.alpha/and :portkey.aws.kms/principal-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.grant-list-entry/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.grant-list-entry/grantee-principal (clojure.spec.alpha/and :portkey.aws.kms/principal-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.grant-list-entry/issuing-account (clojure.spec.alpha/and :portkey.aws.kms/principal-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.grant-list-entry/operations (clojure.spec.alpha/and :portkey.aws.kms/grant-operation-list))
(clojure.spec.alpha/def :portkey.aws.kms.grant-list-entry/creation-date (clojure.spec.alpha/and :portkey.aws.kms/date-type))
(clojure.spec.alpha/def :portkey.aws.kms.grant-list-entry/grant-id (clojure.spec.alpha/and :portkey.aws.kms/grant-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.grant-list-entry/name (clojure.spec.alpha/and :portkey.aws.kms/grant-name-type))
(clojure.spec.alpha/def :portkey.aws.kms.grant-list-entry/constraints (clojure.spec.alpha/and :portkey.aws.kms/grant-constraints))
(clojure.spec.alpha/def :portkey.aws.kms/grant-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.grant-list-entry/retiring-principal :portkey.aws.kms.grant-list-entry/key-id :portkey.aws.kms.grant-list-entry/grantee-principal :portkey.aws.kms.grant-list-entry/issuing-account :portkey.aws.kms.grant-list-entry/operations :portkey.aws.kms.grant-list-entry/creation-date :portkey.aws.kms.grant-list-entry/grant-id :portkey.aws.kms.grant-list-entry/name :portkey.aws.kms.grant-list-entry/constraints]))

(clojure.spec.alpha/def :portkey.aws.kms/description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.kms/grant-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9:/_-]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.kms.cancel-key-deletion-response/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/cancel-key-deletion-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.cancel-key-deletion-response/key-id]))

(clojure.spec.alpha/def :portkey.aws.kms.re-encrypt-response/ciphertext-blob (clojure.spec.alpha/and :portkey.aws.kms/ciphertext-type))
(clojure.spec.alpha/def :portkey.aws.kms.re-encrypt-response/source-key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.re-encrypt-response/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/re-encrypt-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.re-encrypt-response/ciphertext-blob :portkey.aws.kms.re-encrypt-response/source-key-id :portkey.aws.kms.re-encrypt-response/key-id]))

(clojure.spec.alpha/def :portkey.aws.kms.create-grant-response/grant-token (clojure.spec.alpha/and :portkey.aws.kms/grant-token-type))
(clojure.spec.alpha/def :portkey.aws.kms.create-grant-response/grant-id (clojure.spec.alpha/and :portkey.aws.kms/grant-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/create-grant-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.create-grant-response/grant-token :portkey.aws.kms.create-grant-response/grant-id]))

(clojure.spec.alpha/def :portkey.aws.kms/origin-type #{:aws-kms "AWS_KMS" :external "EXTERNAL"})

(clojure.spec.alpha/def :portkey.aws.kms/key-usage-type #{:encrypt-decrypt "ENCRYPT_DECRYPT"})

(clojure.spec.alpha/def :portkey.aws.kms/pending-window-in-days-type (clojure.spec.alpha/int-in 1 365))

(clojure.spec.alpha/def :portkey.aws.kms/policy-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 131072)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-without-plaintext-response/ciphertext-blob (clojure.spec.alpha/and :portkey.aws.kms/ciphertext-type))
(clojure.spec.alpha/def :portkey.aws.kms.generate-data-key-without-plaintext-response/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/generate-data-key-without-plaintext-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.generate-data-key-without-plaintext-response/ciphertext-blob :portkey.aws.kms.generate-data-key-without-plaintext-response/key-id]))

(clojure.spec.alpha/def :portkey.aws.kms.schedule-key-deletion-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.schedule-key-deletion-request/pending-window-in-days (clojure.spec.alpha/and :portkey.aws.kms/pending-window-in-days-type))
(clojure.spec.alpha/def :portkey.aws.kms/schedule-key-deletion-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.schedule-key-deletion-request/key-id] :opt-un [:portkey.aws.kms.schedule-key-deletion-request/pending-window-in-days]))

(clojure.spec.alpha/def :portkey.aws.kms.list-aliases-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-aliases-request/limit (clojure.spec.alpha/and :portkey.aws.kms/limit-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-aliases-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.list-aliases-request/key-id :portkey.aws.kms.list-aliases-request/limit :portkey.aws.kms.list-aliases-request/marker]))

(clojure.spec.alpha/def :portkey.aws.kms/create-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms/key-metadata]))

(clojure.spec.alpha/def :portkey.aws.kms.list-keys-response/keys (clojure.spec.alpha/and :portkey.aws.kms/key-list))
(clojure.spec.alpha/def :portkey.aws.kms.list-keys-response/next-marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-keys-response/truncated (clojure.spec.alpha/and :portkey.aws.kms/boolean-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.list-keys-response/keys :portkey.aws.kms.list-keys-response/next-marker :portkey.aws.kms.list-keys-response/truncated]))

(clojure.spec.alpha/def :portkey.aws.kms.list-keys-request/limit (clojure.spec.alpha/and :portkey.aws.kms/limit-type))
(clojure.spec.alpha/def :portkey.aws.kms.list-keys-request/marker (clojure.spec.alpha/and :portkey.aws.kms/marker-type))
(clojure.spec.alpha/def :portkey.aws.kms/list-keys-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.list-keys-request/limit :portkey.aws.kms.list-keys-request/marker]))

(clojure.spec.alpha/def :portkey.aws.kms.untag-resource-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.kms/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.kms/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.untag-resource-request/key-id :portkey.aws.kms.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms.incorrect-key-material-exception/message (clojure.spec.alpha/and :portkey.aws.kms/error-message-type))
(clojure.spec.alpha/def :portkey.aws.kms/incorrect-key-material-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kms.incorrect-key-material-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kms/policy-name-list (clojure.spec.alpha/coll-of :portkey.aws.kms/policy-name-type))

(clojure.spec.alpha/def :portkey.aws.kms/algorithm-spec #{:rsaes-pkcs-1-v-1-5 "RSAES_PKCS1_V1_5" "RSAES_OAEP_SHA_256" :rsaes-oaep-sha-256 "RSAES_OAEP_SHA_1" :rsaes-oaep-sha-1})

(clojure.spec.alpha/def :portkey.aws.kms/key-state #{"Disabled" :disabled "PendingDeletion" "Enabled" :pending-deletion "PendingImport" :pending-import :enabled})

(clojure.spec.alpha/def :portkey.aws.kms.disable-key-request/key-id (clojure.spec.alpha/and :portkey.aws.kms/key-id-type))
(clojure.spec.alpha/def :portkey.aws.kms/disable-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.kms.disable-key-request/key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kms/grant-operation #{"GenerateDataKeyWithoutPlaintext" :generate-data-key-without-plaintext "ReEncryptTo" "Decrypt" "RetireGrant" "GenerateDataKey" :retire-grant :re-encrypt-to :re-encrypt-from :encrypt :generate-data-key :decrypt "Encrypt" :create-grant "ReEncryptFrom" "CreateGrant" :describe-key "DescribeKey"})

(clojure.spec.alpha/def :portkey.aws.kms/boolean-type clojure.core/boolean?)

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"KMSInternalException" :portkey.aws.kms/kms-internal-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception, "LimitExceededException" :portkey.aws.kms/limit-exceeded-exception, "TagException" :portkey.aws.kms/tag-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.kms/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-key-policy ([get-key-policy-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-key-policy-request get-key-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/get-key-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/get-key-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetKeyPolicy", :http.request.configuration/output-deser-fn deser-get-key-policy-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef get-key-policy :args (clojure.spec.alpha/tuple :portkey.aws.kms/get-key-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/get-key-policy-response))

(clojure.core/defn get-key-rotation-status ([get-key-rotation-status-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-key-rotation-status-request get-key-rotation-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/get-key-rotation-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/get-key-rotation-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetKeyRotationStatus", :http.request.configuration/output-deser-fn deser-get-key-rotation-status-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception, "UnsupportedOperationException" :portkey.aws.kms/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef get-key-rotation-status :args (clojure.spec.alpha/tuple :portkey.aws.kms/get-key-rotation-status-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/get-key-rotation-status-response))

(clojure.core/defn delete-imported-key-material ([delete-imported-key-material-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-imported-key-material-request delete-imported-key-material-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/delete-imported-key-material-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteImportedKeyMaterial", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "UnsupportedOperationException" :portkey.aws.kms/unsupported-operation-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef delete-imported-key-material :args (clojure.spec.alpha/tuple :portkey.aws.kms/delete-imported-key-material-request) :ret clojure.core/true?)

(clojure.core/defn list-grants ([list-grants-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-grants-request list-grants-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/list-grants-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/list-grants-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGrants", :http.request.configuration/output-deser-fn deser-list-grants-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "InvalidMarkerException" :portkey.aws.kms/invalid-marker-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef list-grants :args (clojure.spec.alpha/tuple :portkey.aws.kms/list-grants-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/list-grants-response))

(clojure.core/defn disable-key ([disable-key-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disable-key-request disable-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/disable-key-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableKey", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef disable-key :args (clojure.spec.alpha/tuple :portkey.aws.kms/disable-key-request) :ret clojure.core/true?)

(clojure.core/defn create-alias ([create-alias-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-alias-request create-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/create-alias-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAlias", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "AlreadyExistsException" :portkey.aws.kms/already-exists-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidAliasNameException" :portkey.aws.kms/invalid-alias-name-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "LimitExceededException" :portkey.aws.kms/limit-exceeded-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.kms/create-alias-request) :ret clojure.core/true?)

(clojure.core/defn put-key-policy ([put-key-policy-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-key-policy-request put-key-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/put-key-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutKeyPolicy", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "MalformedPolicyDocumentException" :portkey.aws.kms/malformed-policy-document-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "UnsupportedOperationException" :portkey.aws.kms/unsupported-operation-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "LimitExceededException" :portkey.aws.kms/limit-exceeded-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef put-key-policy :args (clojure.spec.alpha/tuple :portkey.aws.kms/put-key-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-key-description ([update-key-description-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-key-description-request update-key-description-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/update-key-description-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateKeyDescription", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef update-key-description :args (clojure.spec.alpha/tuple :portkey.aws.kms/update-key-description-request) :ret clojure.core/true?)

(clojure.core/defn generate-data-key-without-plaintext ([generate-data-key-without-plaintext-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-generate-data-key-without-plaintext-request generate-data-key-without-plaintext-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/generate-data-key-without-plaintext-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/generate-data-key-without-plaintext-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GenerateDataKeyWithoutPlaintext", :http.request.configuration/output-deser-fn deser-generate-data-key-without-plaintext-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "DisabledException" :portkey.aws.kms/disabled-exception, "KeyUnavailableException" :portkey.aws.kms/key-unavailable-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "InvalidKeyUsageException" :portkey.aws.kms/invalid-key-usage-exception, "InvalidGrantTokenException" :portkey.aws.kms/invalid-grant-token-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef generate-data-key-without-plaintext :args (clojure.spec.alpha/tuple :portkey.aws.kms/generate-data-key-without-plaintext-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/generate-data-key-without-plaintext-response))

(clojure.core/defn get-parameters-for-import ([get-parameters-for-import-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-parameters-for-import-request get-parameters-for-import-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/get-parameters-for-import-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/get-parameters-for-import-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetParametersForImport", :http.request.configuration/output-deser-fn deser-get-parameters-for-import-response, :http.request.spec/error-spec {"InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "UnsupportedOperationException" :portkey.aws.kms/unsupported-operation-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef get-parameters-for-import :args (clojure.spec.alpha/tuple :portkey.aws.kms/get-parameters-for-import-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/get-parameters-for-import-response))

(clojure.core/defn cancel-key-deletion ([cancel-key-deletion-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-cancel-key-deletion-request cancel-key-deletion-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/cancel-key-deletion-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/cancel-key-deletion-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelKeyDeletion", :http.request.configuration/output-deser-fn deser-cancel-key-deletion-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef cancel-key-deletion :args (clojure.spec.alpha/tuple :portkey.aws.kms/cancel-key-deletion-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/cancel-key-deletion-response))

(clojure.core/defn create-key ([] (create-key {})) ([create-key-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-key-request create-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/create-key-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/create-key-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateKey", :http.request.configuration/output-deser-fn deser-create-key-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.kms/malformed-policy-document-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "UnsupportedOperationException" :portkey.aws.kms/unsupported-operation-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "LimitExceededException" :portkey.aws.kms/limit-exceeded-exception, "TagException" :portkey.aws.kms/tag-exception}})))))
(clojure.spec.alpha/fdef create-key :args (clojure.spec.alpha/? :portkey.aws.kms/create-key-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/create-key-response))

(clojure.core/defn decrypt ([decrypt-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-decrypt-request decrypt-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/decrypt-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/decrypt-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "Decrypt", :http.request.configuration/output-deser-fn deser-decrypt-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "DisabledException" :portkey.aws.kms/disabled-exception, "InvalidCiphertextException" :portkey.aws.kms/invalid-ciphertext-exception, "KeyUnavailableException" :portkey.aws.kms/key-unavailable-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "InvalidGrantTokenException" :portkey.aws.kms/invalid-grant-token-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef decrypt :args (clojure.spec.alpha/tuple :portkey.aws.kms/decrypt-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/decrypt-response))

(clojure.core/defn retire-grant ([] (retire-grant {})) ([retire-grant-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-retire-grant-request retire-grant-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/retire-grant-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RetireGrant", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "InvalidGrantTokenException" :portkey.aws.kms/invalid-grant-token-exception, "InvalidGrantIdException" :portkey.aws.kms/invalid-grant-id-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef retire-grant :args (clojure.spec.alpha/? :portkey.aws.kms/retire-grant-request) :ret clojure.core/true?)

(clojure.core/defn generate-data-key ([generate-data-key-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-generate-data-key-request generate-data-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/generate-data-key-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/generate-data-key-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GenerateDataKey", :http.request.configuration/output-deser-fn deser-generate-data-key-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "DisabledException" :portkey.aws.kms/disabled-exception, "KeyUnavailableException" :portkey.aws.kms/key-unavailable-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "InvalidKeyUsageException" :portkey.aws.kms/invalid-key-usage-exception, "InvalidGrantTokenException" :portkey.aws.kms/invalid-grant-token-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef generate-data-key :args (clojure.spec.alpha/tuple :portkey.aws.kms/generate-data-key-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/generate-data-key-response))

(clojure.core/defn update-alias ([update-alias-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-alias-request update-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/update-alias-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAlias", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef update-alias :args (clojure.spec.alpha/tuple :portkey.aws.kms/update-alias-request) :ret clojure.core/true?)

(clojure.core/defn re-encrypt ([re-encrypt-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-re-encrypt-request re-encrypt-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/re-encrypt-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/re-encrypt-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ReEncrypt", :http.request.configuration/output-deser-fn deser-re-encrypt-response, :http.request.spec/error-spec {"DisabledException" :portkey.aws.kms/disabled-exception, "InvalidKeyUsageException" :portkey.aws.kms/invalid-key-usage-exception, "InvalidCiphertextException" :portkey.aws.kms/invalid-ciphertext-exception, "KeyUnavailableException" :portkey.aws.kms/key-unavailable-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "InvalidGrantTokenException" :portkey.aws.kms/invalid-grant-token-exception}})))))
(clojure.spec.alpha/fdef re-encrypt :args (clojure.spec.alpha/tuple :portkey.aws.kms/re-encrypt-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/re-encrypt-response))

(clojure.core/defn list-key-policies ([list-key-policies-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-key-policies-request list-key-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/list-key-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/list-key-policies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListKeyPolicies", :http.request.configuration/output-deser-fn deser-list-key-policies-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef list-key-policies :args (clojure.spec.alpha/tuple :portkey.aws.kms/list-key-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/list-key-policies-response))

(clojure.core/defn list-keys ([] (list-keys {})) ([list-keys-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-keys-request list-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/list-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/list-keys-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListKeys", :http.request.configuration/output-deser-fn deser-list-keys-response, :http.request.spec/error-spec {"DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "InvalidMarkerException" :portkey.aws.kms/invalid-marker-exception}})))))
(clojure.spec.alpha/fdef list-keys :args (clojure.spec.alpha/? :portkey.aws.kms/list-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/list-keys-response))

(clojure.core/defn list-retirable-grants ([list-retirable-grants-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-retirable-grants-request list-retirable-grants-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/list-grants-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/list-retirable-grants-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRetirableGrants", :http.request.configuration/output-deser-fn deser-list-grants-response, :http.request.spec/error-spec {"DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "InvalidMarkerException" :portkey.aws.kms/invalid-marker-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception}})))))
(clojure.spec.alpha/fdef list-retirable-grants :args (clojure.spec.alpha/tuple :portkey.aws.kms/list-retirable-grants-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/list-grants-response))

(clojure.core/defn list-aliases ([] (list-aliases {})) ([list-aliases-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-aliases-request list-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/list-aliases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/list-aliases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAliases", :http.request.configuration/output-deser-fn deser-list-aliases-response, :http.request.spec/error-spec {"DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "InvalidMarkerException" :portkey.aws.kms/invalid-marker-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception}})))))
(clojure.spec.alpha/fdef list-aliases :args (clojure.spec.alpha/? :portkey.aws.kms/list-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/list-aliases-response))

(clojure.core/defn delete-alias ([delete-alias-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-alias-request delete-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/delete-alias-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAlias", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef delete-alias :args (clojure.spec.alpha/tuple :portkey.aws.kms/delete-alias-request) :ret clojure.core/true?)

(clojure.core/defn enable-key-rotation ([enable-key-rotation-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-enable-key-rotation-request enable-key-rotation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/enable-key-rotation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableKeyRotation", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "DisabledException" :portkey.aws.kms/disabled-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception, "UnsupportedOperationException" :portkey.aws.kms/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef enable-key-rotation :args (clojure.spec.alpha/tuple :portkey.aws.kms/enable-key-rotation-request) :ret clojure.core/true?)

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"KMSInternalException" :portkey.aws.kms/kms-internal-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception, "TagException" :portkey.aws.kms/tag-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.kms/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn encrypt ([encrypt-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-encrypt-request encrypt-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/encrypt-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/encrypt-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "Encrypt", :http.request.configuration/output-deser-fn deser-encrypt-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "DisabledException" :portkey.aws.kms/disabled-exception, "KeyUnavailableException" :portkey.aws.kms/key-unavailable-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "InvalidKeyUsageException" :portkey.aws.kms/invalid-key-usage-exception, "InvalidGrantTokenException" :portkey.aws.kms/invalid-grant-token-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef encrypt :args (clojure.spec.alpha/tuple :portkey.aws.kms/encrypt-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/encrypt-response))

(clojure.core/defn list-resource-tags ([list-resource-tags-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-resource-tags-request list-resource-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/list-resource-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/list-resource-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResourceTags", :http.request.configuration/output-deser-fn deser-list-resource-tags-response, :http.request.spec/error-spec {"KMSInternalException" :portkey.aws.kms/kms-internal-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "InvalidMarkerException" :portkey.aws.kms/invalid-marker-exception}})))))
(clojure.spec.alpha/fdef list-resource-tags :args (clojure.spec.alpha/tuple :portkey.aws.kms/list-resource-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/list-resource-tags-response))

(clojure.core/defn generate-random ([] (generate-random {})) ([generate-random-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-generate-random-request generate-random-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/generate-random-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/generate-random-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GenerateRandom", :http.request.configuration/output-deser-fn deser-generate-random-response, :http.request.spec/error-spec {"DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception}})))))
(clojure.spec.alpha/fdef generate-random :args (clojure.spec.alpha/? :portkey.aws.kms/generate-random-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/generate-random-response))

(clojure.core/defn enable-key ([enable-key-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-enable-key-request enable-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/enable-key-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableKey", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "LimitExceededException" :portkey.aws.kms/limit-exceeded-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef enable-key :args (clojure.spec.alpha/tuple :portkey.aws.kms/enable-key-request) :ret clojure.core/true?)

(clojure.core/defn create-grant ([create-grant-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-grant-request create-grant-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/create-grant-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/create-grant-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateGrant", :http.request.configuration/output-deser-fn deser-create-grant-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "DisabledException" :portkey.aws.kms/disabled-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "InvalidGrantTokenException" :portkey.aws.kms/invalid-grant-token-exception, "LimitExceededException" :portkey.aws.kms/limit-exceeded-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef create-grant :args (clojure.spec.alpha/tuple :portkey.aws.kms/create-grant-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/create-grant-response))

(clojure.core/defn disable-key-rotation ([disable-key-rotation-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disable-key-rotation-request disable-key-rotation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/disable-key-rotation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableKeyRotation", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "DisabledException" :portkey.aws.kms/disabled-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception, "UnsupportedOperationException" :portkey.aws.kms/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef disable-key-rotation :args (clojure.spec.alpha/tuple :portkey.aws.kms/disable-key-rotation-request) :ret clojure.core/true?)

(clojure.core/defn describe-key ([describe-key-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-key-request describe-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/describe-key-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/describe-key-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeKey", :http.request.configuration/output-deser-fn deser-describe-key-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception}})))))
(clojure.spec.alpha/fdef describe-key :args (clojure.spec.alpha/tuple :portkey.aws.kms/describe-key-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/describe-key-response))

(clojure.core/defn schedule-key-deletion ([schedule-key-deletion-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-schedule-key-deletion-request schedule-key-deletion-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/schedule-key-deletion-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/schedule-key-deletion-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ScheduleKeyDeletion", :http.request.configuration/output-deser-fn deser-schedule-key-deletion-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef schedule-key-deletion :args (clojure.spec.alpha/tuple :portkey.aws.kms/schedule-key-deletion-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/schedule-key-deletion-response))

(clojure.core/defn revoke-grant ([revoke-grant-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-revoke-grant-request revoke-grant-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/revoke-grant-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RevokeGrant", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.kms/not-found-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "InvalidGrantIdException" :portkey.aws.kms/invalid-grant-id-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception}})))))
(clojure.spec.alpha/fdef revoke-grant :args (clojure.spec.alpha/tuple :portkey.aws.kms/revoke-grant-request) :ret clojure.core/true?)

(clojure.core/defn import-key-material ([import-key-material-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-import-key-material-request import-key-material-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.kms/endpoints, :http.request.configuration/target-prefix "TrentService", :http.request.spec/output-spec :portkey.aws.kms/import-key-material-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-01", :http.request.configuration/service-id "KMS", :http.request.spec/input-spec :portkey.aws.kms/import-key-material-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ImportKeyMaterial", :http.request.configuration/output-deser-fn deser-import-key-material-response, :http.request.spec/error-spec {"InvalidImportTokenException" :portkey.aws.kms/invalid-import-token-exception, "InvalidCiphertextException" :portkey.aws.kms/invalid-ciphertext-exception, "DependencyTimeoutException" :portkey.aws.kms/dependency-timeout-exception, "KMSInvalidStateException" :portkey.aws.kms/kms-invalid-state-exception, "InvalidArnException" :portkey.aws.kms/invalid-arn-exception, "UnsupportedOperationException" :portkey.aws.kms/unsupported-operation-exception, "NotFoundException" :portkey.aws.kms/not-found-exception, "KMSInternalException" :portkey.aws.kms/kms-internal-exception, "ExpiredImportTokenException" :portkey.aws.kms/expired-import-token-exception, "IncorrectKeyMaterialException" :portkey.aws.kms/incorrect-key-material-exception}})))))
(clojure.spec.alpha/fdef import-key-material :args (clojure.spec.alpha/tuple :portkey.aws.kms/import-key-material-request) :ret (clojure.spec.alpha/and :portkey.aws.kms/import-key-material-response))