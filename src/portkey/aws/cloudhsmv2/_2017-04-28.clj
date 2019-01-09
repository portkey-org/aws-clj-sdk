(ns portkey.aws.cloudhsmv2.-2017-04-28 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "cloudhsm", :region "ap-northeast-1"},
    :ssl-common-name "cloudhsmv2.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudhsm", :region "eu-west-1"},
    :ssl-common-name "cloudhsmv2.eu-west-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudhsm", :region "us-east-2"},
    :ssl-common-name "cloudhsmv2.us-east-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "cloudhsm", :region "ap-southeast-2"},
    :ssl-common-name "cloudhsmv2.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "cloudhsm", :region "ap-southeast-1"},
    :ssl-common-name "cloudhsmv2.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cloudhsm", :region "ca-central-1"},
    :ssl-common-name "cloudhsmv2.ca-central-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudhsm", :region "eu-central-1"},
    :ssl-common-name "cloudhsmv2.eu-central-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cloudhsm", :region "eu-west-2"},
    :ssl-common-name "cloudhsmv2.eu-west-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "cloudhsm", :region "us-gov-west-1"},
    :ssl-common-name "cloudhsmv2.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudhsm", :region "us-west-2"},
    :ssl-common-name "cloudhsmv2.us-west-2.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudhsm", :region "us-east-1"},
    :ssl-common-name "cloudhsmv2.us-east-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudhsm", :region "us-west-1"},
    :ssl-common-name "cloudhsmv2.us-west-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cloudhsm", :region "ap-south-1"},
    :ssl-common-name "cloudhsmv2.ap-south-1.amazonaws.com",
    :endpoint "https://cloudhsmv2.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-subnet-ids)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-backup-id)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-cluster-id)

(clojure.core/declare ser-hsm-id)

(clojure.core/declare ser-strings)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-cert)

(clojure.core/declare ser-external-az)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-string)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-ip-address)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-field)

(clojure.core/declare ser-hsm-type)

(clojure.core/declare ser-eni-id)

(clojure.core/declare ser-max-size)

(clojure.core/declare ser-region)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-subnet-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "SubnetIds", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-backup-id [input] #:http.request.field{:value input, :shape "BackupId"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-cluster-id [input] #:http.request.field{:value input, :shape "ClusterId"})

(clojure.core/defn- ser-hsm-id [input] #:http.request.field{:value input, :shape "HsmId"})

(clojure.core/defn- ser-strings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "Strings", :type "list"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-cert [input] #:http.request.field{:value input, :shape "Cert"})

(clojure.core/defn- ser-external-az [input] #:http.request.field{:value input, :shape "ExternalAz"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-field k) #:http.request.field{:map-info "key", :shape "Field"}) (clojure.core/into (ser-strings v) #:http.request.field{:map-info "value", :shape "Strings"})])) input), :shape "Filters", :type "map"})

(clojure.core/defn- ser-ip-address [input] #:http.request.field{:value input, :shape "IpAddress"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-field [input] #:http.request.field{:value input, :shape "Field"})

(clojure.core/defn- ser-hsm-type [input] #:http.request.field{:value input, :shape "HsmType"})

(clojure.core/defn- ser-eni-id [input] #:http.request.field{:value input, :shape "EniId"})

(clojure.core/defn- ser-max-size [input] #:http.request.field{:value input, :shape "MaxSize"})

(clojure.core/defn- ser-region [input] #:http.request.field{:value input, :shape "Region"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-delete-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]}))

(clojure.core/defn- req-describe-backups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxSize"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"})) (clojure.core/contains? input :sort-ascending) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-ascending)) #:http.request.field{:name "SortAscending", :shape "Boolean"}))))

(clojure.core/defn- req-delete-backup-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"})]}))

(clojure.core/defn- req-describe-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxSize"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ClusterId"}) (clojure.core/into (ser-tag-list (input :tag-list)) #:http.request.field{:name "TagList", :shape "TagList"})]}))

(clojure.core/defn- req-create-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-subnet-ids (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"}) (clojure.core/into (ser-hsm-type (input :hsm-type)) #:http.request.field{:name "HsmType", :shape "HsmType"})]} (clojure.core/contains? input :source-backup-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backup-id (input :source-backup-id)) #:http.request.field{:name "SourceBackupId", :shape "BackupId"}))))

(clojure.core/defn- req-restore-backup-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"})]}))

(clojure.core/defn- req-create-hsm-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"}) (clojure.core/into (ser-external-az (input :availability-zone)) #:http.request.field{:name "AvailabilityZone", :shape "ExternalAz"})]} (clojure.core/contains? input :ip-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :ip-address)) #:http.request.field{:name "IpAddress", :shape "IpAddress"}))))

(clojure.core/defn- req-copy-backup-to-region-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-region (input :destination-region)) #:http.request.field{:name "DestinationRegion", :shape "Region"}) (clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ClusterId"}) (clojure.core/into (ser-tag-key-list (input :tag-key-list)) #:http.request.field{:name "TagKeyList", :shape "TagKeyList"})]}))

(clojure.core/defn- req-delete-hsm-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]} (clojure.core/contains? input :hsm-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hsm-id (input :hsm-id)) #:http.request.field{:name "HsmId", :shape "HsmId"})) (clojure.core/contains? input :eni-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eni-id (input :eni-id)) #:http.request.field{:name "EniId", :shape "EniId"})) (clojure.core/contains? input :eni-ip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :eni-ip)) #:http.request.field{:name "EniIp", :shape "IpAddress"}))))

(clojure.core/defn- req-initialize-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"}) (clojure.core/into (ser-cert (input :signed-cert)) #:http.request.field{:name "SignedCert", :shape "Cert"}) (clojure.core/into (ser-cert (input :trust-anchor)) #:http.request.field{:name "TrustAnchor", :shape "Cert"})]}))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ClusterId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxSize"}))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/backup-policy #{:default "DEFAULT"})

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.hsm/availability-zone (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/external-az))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.hsm/eni-ip (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.hsm/state (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/hsm-state))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.hsm/state-message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/hsm (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28/hsm-id] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.hsm/availability-zone :portkey.aws.cloudhsmv2.-2017-04-28/cluster-id :portkey.aws.cloudhsmv2.-2017-04-28/subnet-id :portkey.aws.cloudhsmv2.-2017-04-28/eni-id :portkey.aws.cloudhsmv2.-2017-04-28.hsm/eni-ip :portkey.aws.cloudhsmv2.-2017-04-28.hsm/state :portkey.aws.cloudhsmv2.-2017-04-28.hsm/state-message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2.-2017-04-28/subnet-id :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.cloud-hsm-internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.cloud-hsm-internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/delete-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28/cluster-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/hsms (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2.-2017-04-28/hsm))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/security-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"sg-[0-9a-fA-F]" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"subnet-[0-9a-fA-F]{8,17}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.certificates/cluster-csr (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.certificates/hsm-certificate (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.certificates/aws-hardware-certificate (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.certificates/manufacturer-hardware-certificate (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.certificates/cluster-certificate (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.certificates/cluster-csr :portkey.aws.cloudhsmv2.-2017-04-28.certificates/hsm-certificate :portkey.aws.cloudhsmv2.-2017-04-28.certificates/aws-hardware-certificate :portkey.aws.cloudhsmv2.-2017-04-28.certificates/manufacturer-hardware-certificate :portkey.aws.cloudhsmv2.-2017-04-28.certificates/cluster-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/state-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 300)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #".*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/backup-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"backup-[2-7a-zA-Z]{11,16}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/list-tags-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28/tag-list] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/pre-co-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 7 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/describe-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/clusters :portkey.aws.cloudhsmv2.-2017-04-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.cloud-hsm-invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.cloud-hsm-invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/cluster-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"cluster-[2-7a-zA-Z]{11,16}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.describe-backups-request/max-results (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/max-size))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.describe-backups-request/sort-ascending (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/describe-backups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/next-token :portkey.aws.cloudhsmv2.-2017-04-28.describe-backups-request/max-results :portkey.aws.cloudhsmv2.-2017-04-28/filters :portkey.aws.cloudhsmv2.-2017-04-28.describe-backups-request/sort-ascending]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/delete-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/cluster]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/hsm-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"hsm-[2-7a-zA-Z]{11,16}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/delete-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/backup]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/backup-state #{:deleted :ready :pending-deletion "READY" "CREATE_IN_PROGRESS" :create-in-progress "PENDING_DELETION" "DELETED"})

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/strings (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2.-2017-04-28/string))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #".*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/delete-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28/backup-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.describe-clusters-request/max-results (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/max-size))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/describe-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/filters :portkey.aws.cloudhsmv2.-2017-04-28/next-token :portkey.aws.cloudhsmv2.-2017-04-28.describe-clusters-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/create-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/cluster]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/external-subnet-mapping (clojure.spec.alpha/map-of :portkey.aws.cloudhsmv2.-2017-04-28/external-az :portkey.aws.cloudhsmv2.-2017-04-28/subnet-id))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.tag-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cluster-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28.tag-resource-request/resource-id :portkey.aws.cloudhsmv2.-2017-04-28/tag-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2.-2017-04-28/tag :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/cluster-state #{:deleted "INITIALIZE_IN_PROGRESS" :initialized "DELETE_IN_PROGRESS" "UPDATE_IN_PROGRESS" "CREATE_IN_PROGRESS" "UNINITIALIZED" :delete-in-progress :initialize-in-progress :create-in-progress "INITIALIZED" :active :degraded "ACTIVE" :update-in-progress "DELETED" "DEGRADED" :uninitialized})

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/restore-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/backup]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.initialize-cluster-response/state (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cluster-state))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/initialize-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.initialize-cluster-response/state :portkey.aws.cloudhsmv2.-2017-04-28/state-message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2.-2017-04-28/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/cert (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 5000)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9+-/=\s]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.cloud-hsm-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.cloud-hsm-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.cluster/create-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.cluster/subnet-mapping (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/external-subnet-mapping))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.cluster/state (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cluster-state))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.cluster/source-backup-id (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/backup-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/cluster (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.cluster/create-timestamp :portkey.aws.cloudhsmv2.-2017-04-28/backup-policy :portkey.aws.cloudhsmv2.-2017-04-28/hsms :portkey.aws.cloudhsmv2.-2017-04-28/security-group :portkey.aws.cloudhsmv2.-2017-04-28/certificates :portkey.aws.cloudhsmv2.-2017-04-28/state-message :portkey.aws.cloudhsmv2.-2017-04-28/pre-co-password :portkey.aws.cloudhsmv2.-2017-04-28/cluster-id :portkey.aws.cloudhsmv2.-2017-04-28.cluster/subnet-mapping :portkey.aws.cloudhsmv2.-2017-04-28/vpc-id :portkey.aws.cloudhsmv2.-2017-04-28.cluster/state :portkey.aws.cloudhsmv2.-2017-04-28/hsm-type :portkey.aws.cloudhsmv2.-2017-04-28.cluster/source-backup-id]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/external-az (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-z]{2}(-(gov))?-(east|west|north|south|central){1,2}-\d[a-z]" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/hsm-state #{:deleted "DELETE_IN_PROGRESS" "CREATE_IN_PROGRESS" :delete-in-progress :create-in-progress :active :degraded "ACTIVE" "DELETED" "DEGRADED"})

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.backup/create-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.backup/copy-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.backup/source-region (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/region))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.backup/delete-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.backup/source-backup (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/backup-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.backup/source-cluster (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cluster-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/backup (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28/backup-id] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.backup/create-timestamp :portkey.aws.cloudhsmv2.-2017-04-28.backup/copy-timestamp :portkey.aws.cloudhsmv2.-2017-04-28.backup/source-region :portkey.aws.cloudhsmv2.-2017-04-28/cluster-id :portkey.aws.cloudhsmv2.-2017-04-28.backup/delete-timestamp :portkey.aws.cloudhsmv2.-2017-04-28/backup-state :portkey.aws.cloudhsmv2.-2017-04-28.backup/source-backup :portkey.aws.cloudhsmv2.-2017-04-28.backup/source-cluster]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"vpc-[0-9a-fA-F]" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.cloud-hsm-resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.cloud-hsm-resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.destination-backup/create-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.destination-backup/source-region (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/region))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.destination-backup/source-backup (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/backup-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.destination-backup/source-cluster (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cluster-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/destination-backup (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.destination-backup/create-timestamp :portkey.aws.cloudhsmv2.-2017-04-28.destination-backup/source-region :portkey.aws.cloudhsmv2.-2017-04-28.destination-backup/source-backup :portkey.aws.cloudhsmv2.-2017-04-28.destination-backup/source-cluster]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/clusters (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2.-2017-04-28/cluster))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.create-cluster-request/source-backup-id (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/backup-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/create-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28/subnet-ids :portkey.aws.cloudhsmv2.-2017-04-28/hsm-type] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.create-cluster-request/source-backup-id]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/filters (clojure.spec.alpha/map-of :portkey.aws.cloudhsmv2.-2017-04-28/field :portkey.aws.cloudhsmv2.-2017-04-28/strings))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/create-hsm-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/hsm]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/backups (clojure.spec.alpha/coll-of :portkey.aws.cloudhsmv2.-2017-04-28/backup))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/restore-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28/backup-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.cloud-hsm-access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28.cloud-hsm-access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.create-hsm-request/availability-zone (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/external-az))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/create-hsm-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28/cluster-id :portkey.aws.cloudhsmv2.-2017-04-28.create-hsm-request/availability-zone] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/ip-address]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/ip-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.tag/key (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.tag/value (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28.tag/key :portkey.aws.cloudhsmv2.-2017-04-28.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.copy-backup-to-region-request/destination-region (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/region))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/copy-backup-to-region-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28.copy-backup-to-region-request/destination-region :portkey.aws.cloudhsmv2.-2017-04-28/backup-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/delete-hsm-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/hsm-id]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/field (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/hsm-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"(hsm1\.medium)" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/eni-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"eni-[0-9a-fA-F]{8,17}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/describe-backups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/backups :portkey.aws.cloudhsmv2.-2017-04-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/max-size (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-z]{2}(-(gov))?-(east|west|north|south|central){1,2}-\d" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.untag-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cluster-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28.untag-resource-request/resource-id :portkey.aws.cloudhsmv2.-2017-04-28/tag-key-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.delete-hsm-request/eni-ip (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/delete-hsm-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28/cluster-id] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/hsm-id :portkey.aws.cloudhsmv2.-2017-04-28/eni-id :portkey.aws.cloudhsmv2.-2017-04-28.delete-hsm-request/eni-ip]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/copy-backup-to-region-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/destination-backup]))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.initialize-cluster-request/signed-cert (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.initialize-cluster-request/trust-anchor (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cert))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/initialize-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28/cluster-id :portkey.aws.cloudhsmv2.-2017-04-28.initialize-cluster-request/signed-cert :portkey.aws.cloudhsmv2.-2017-04-28.initialize-cluster-request/trust-anchor] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.list-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/cluster-id))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28.list-tags-request/max-results (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/max-size))
(clojure.spec.alpha/def :portkey.aws.cloudhsmv2.-2017-04-28/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsmv2.-2017-04-28.list-tags-request/resource-id] :opt-un [:portkey.aws.cloudhsmv2.-2017-04-28/next-token :portkey.aws.cloudhsmv2.-2017-04-28.list-tags-request/max-results]))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagResource", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/tag-resource-response))

(clojure.core/defn restore-backup ([restore-backup-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-restore-backup-request restore-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/restore-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/restore-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RestoreBackup", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef restore-backup :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/restore-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/restore-backup-response))

(clojure.core/defn create-hsm ([create-hsm-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-hsm-request create-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/create-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/create-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateHsm", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef create-hsm :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/create-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/create-hsm-response))

(clojure.core/defn create-cluster ([create-cluster-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/create-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/create-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCluster", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/create-cluster-response))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/list-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTags", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/list-tags-response))

(clojure.core/defn describe-clusters ([] (describe-clusters {})) ([describe-clusters-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-clusters-request describe-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/describe-clusters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/describe-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeClusters", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-clusters :args (clojure.spec.alpha/? :portkey.aws.cloudhsmv2.-2017-04-28/describe-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/describe-clusters-response))

(clojure.core/defn delete-hsm ([delete-hsm-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-hsm-request delete-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/delete-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/delete-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteHsm", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef delete-hsm :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/delete-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/delete-hsm-response))

(clojure.core/defn delete-cluster ([delete-cluster-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-cluster-request delete-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/delete-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/delete-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCluster", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef delete-cluster :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/delete-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/delete-cluster-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagResource", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/untag-resource-response))

(clojure.core/defn initialize-cluster ([initialize-cluster-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-initialize-cluster-request initialize-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/initialize-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/initialize-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "InitializeCluster", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef initialize-cluster :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/initialize-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/initialize-cluster-response))

(clojure.core/defn delete-backup ([delete-backup-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-backup-request delete-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/delete-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/delete-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBackup", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef delete-backup :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/delete-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/delete-backup-response))

(clojure.core/defn describe-backups ([] (describe-backups {})) ([describe-backups-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-backups-request describe-backups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/describe-backups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/describe-backups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeBackups", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-backups :args (clojure.spec.alpha/? :portkey.aws.cloudhsmv2.-2017-04-28/describe-backups-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/describe-backups-response))

(clojure.core/defn copy-backup-to-region ([copy-backup-to-region-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-copy-backup-to-region-request copy-backup-to-region-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsmv2.-2017-04-28/endpoints, :http.request.spec/output-spec :portkey.aws.cloudhsmv2.-2017-04-28/copy-backup-to-region-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-28", :http.request.configuration/service-id "CloudHSM V2", :http.request.spec/input-spec :portkey.aws.cloudhsmv2.-2017-04-28/copy-backup-to-region-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CopyBackupToRegion", :http.request.spec/error-spec {"CloudHsmInternalFailureException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-internal-failure-exception, "CloudHsmServiceException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-service-exception, "CloudHsmResourceNotFoundException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-resource-not-found-exception, "CloudHsmInvalidRequestException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-invalid-request-exception, "CloudHsmAccessDeniedException" :portkey.aws.cloudhsmv2.-2017-04-28/cloud-hsm-access-denied-exception}})))))
(clojure.spec.alpha/fdef copy-backup-to-region :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsmv2.-2017-04-28/copy-backup-to-region-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsmv2.-2017-04-28/copy-backup-to-region-response))
