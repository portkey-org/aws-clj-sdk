(ns portkey.aws.codebuild.-2016-10-06 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "codebuild", :region "us-west-1"},
    :ssl-common-name "codebuild-fips.us-west-1.amazonaws.com",
    :endpoint "https://codebuild-fips.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "codebuild", :region "ap-northeast-1"},
    :ssl-common-name "codebuild.ap-northeast-1.amazonaws.com",
    :endpoint "https://codebuild.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codebuild", :region "eu-west-1"},
    :ssl-common-name "codebuild.eu-west-1.amazonaws.com",
    :endpoint "https://codebuild.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codebuild", :region "us-east-2"},
    :ssl-common-name "codebuild.us-east-2.amazonaws.com",
    :endpoint "https://codebuild.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "codebuild", :region "ap-southeast-2"},
    :ssl-common-name "codebuild.ap-southeast-2.amazonaws.com",
    :endpoint "https://codebuild.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "codebuild", :region "cn-north-1"},
    :ssl-common-name "codebuild.cn-north-1.amazonaws.com.cn",
    :endpoint "https://codebuild.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "codebuild", :region "sa-east-1"},
    :ssl-common-name "codebuild.sa-east-1.amazonaws.com",
    :endpoint "https://codebuild.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "codebuild", :region "ap-southeast-1"},
    :ssl-common-name "codebuild.ap-southeast-1.amazonaws.com",
    :endpoint "https://codebuild.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "codebuild", :region "cn-northwest-1"},
    :ssl-common-name "codebuild.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://codebuild.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "codebuild", :region "ap-northeast-2"},
    :ssl-common-name "codebuild.ap-northeast-2.amazonaws.com",
    :endpoint "https://codebuild.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "codebuild", :region "eu-west-3"},
    :ssl-common-name "codebuild.eu-west-3.amazonaws.com",
    :endpoint "https://codebuild.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "codebuild", :region "us-east-2"},
    :ssl-common-name "codebuild-fips.us-east-2.amazonaws.com",
    :endpoint "https://codebuild-fips.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "codebuild", :region "ca-central-1"},
    :ssl-common-name "codebuild.ca-central-1.amazonaws.com",
    :endpoint "https://codebuild.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "codebuild", :region "eu-central-1"},
    :ssl-common-name "codebuild.eu-central-1.amazonaws.com",
    :endpoint "https://codebuild.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codebuild", :region "eu-west-2"},
    :ssl-common-name "codebuild.eu-west-2.amazonaws.com",
    :endpoint "https://codebuild.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1-fips"
   {:credential-scope {:service "codebuild", :region "us-east-1"},
    :ssl-common-name "codebuild-fips.us-east-1.amazonaws.com",
    :endpoint "https://codebuild-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codebuild", :region "us-west-2"},
    :ssl-common-name "codebuild.us-west-2.amazonaws.com",
    :endpoint "https://codebuild.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "codebuild", :region "us-west-2"},
    :ssl-common-name "codebuild-fips.us-west-2.amazonaws.com",
    :endpoint "https://codebuild-fips.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codebuild", :region "us-east-1"},
    :ssl-common-name "codebuild.us-east-1.amazonaws.com",
    :endpoint "https://codebuild.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codebuild", :region "us-west-1"},
    :ssl-common-name "codebuild.us-west-1.amazonaws.com",
    :endpoint "https://codebuild.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "codebuild", :region "ap-south-1"},
    :ssl-common-name "codebuild.ap-south-1.amazonaws.com",
    :endpoint "https://codebuild.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-artifact-namespace)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-environment-type)

(clojure.core/declare ser-value-input)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-artifact-packaging)

(clojure.core/declare ser-subnets)

(clojure.core/declare ser-environment-variables)

(clojure.core/declare ser-cloud-watch-logs-config)

(clojure.core/declare ser-project-source)

(clojure.core/declare ser-source-type)

(clojure.core/declare ser-time-out)

(clojure.core/declare ser-sort-order-type)

(clojure.core/declare ser-project-environment)

(clojure.core/declare ser-project-sources)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-s-3-logs-config)

(clojure.core/declare ser-logs-config-status-type)

(clojure.core/declare ser-project-names)

(clojure.core/declare ser-environment-variable)

(clojure.core/declare ser-key-input)

(clojure.core/declare ser-string)

(clojure.core/declare ser-source-auth)

(clojure.core/declare ser-project-description)

(clojure.core/declare ser-project-cache)

(clojure.core/declare ser-project-sort-by-type)

(clojure.core/declare ser-cache-type)

(clojure.core/declare ser-environment-variable-type)

(clojure.core/declare ser-vpc-config)

(clojure.core/declare ser-project-source-version)

(clojure.core/declare ser-source-auth-type)

(clojure.core/declare ser-wrapper-boolean)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-compute-type)

(clojure.core/declare ser-project-name)

(clojure.core/declare ser-git-clone-depth)

(clojure.core/declare ser-build-ids)

(clojure.core/declare ser-project-artifacts-list)

(clojure.core/declare ser-project-secondary-source-versions)

(clojure.core/declare ser-logs-config)

(clojure.core/declare ser-artifacts-type)

(clojure.core/declare ser-project-artifacts)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-artifact-namespace [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "BUILD_ID" "BUILD_ID", :build-id "BUILD_ID"} input), :shape "ArtifactNamespace"})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-environment-type [input] #:http.request.field{:value (clojure.core/get {"WINDOWS_CONTAINER" "WINDOWS_CONTAINER", :windows-container "WINDOWS_CONTAINER", "LINUX_CONTAINER" "LINUX_CONTAINER", :linux-container "LINUX_CONTAINER"} input), :shape "EnvironmentType"})

(clojure.core/defn- ser-value-input [input] #:http.request.field{:value input, :shape "ValueInput"})

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "SecurityGroupIds", :type "list", :max 5})

(clojure.core/defn- ser-artifact-packaging [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "ZIP" "ZIP", :zip "ZIP"} input), :shape "ArtifactPackaging"})

(clojure.core/defn- ser-subnets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "Subnets", :type "list", :max 16})

(clojure.core/defn- ser-environment-variables [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-environment-variable coll) #:http.request.field{:shape "EnvironmentVariable"}))) input), :shape "EnvironmentVariables", :type "list"})

(clojure.core/defn- ser-cloud-watch-logs-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-logs-config-status-type (:status input)) #:http.request.field{:name "status", :shape "LogsConfigStatusType"})], :shape "CloudWatchLogsConfig", :type "structure"} (clojure.core/contains? input :group-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :group-name)) #:http.request.field{:name "groupName", :shape "String"})) (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stream-name)) #:http.request.field{:name "streamName", :shape "String"}))))

(clojure.core/defn- ser-project-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-source-type (:type input)) #:http.request.field{:name "type", :shape "SourceType"})], :shape "ProjectSource", :type "structure"} (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :location)) #:http.request.field{:name "location", :shape "String"})) (clojure.core/contains? input :git-clone-depth) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-git-clone-depth (input :git-clone-depth)) #:http.request.field{:name "gitCloneDepth", :shape "GitCloneDepth"})) (clojure.core/contains? input :buildspec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :buildspec)) #:http.request.field{:name "buildspec", :shape "String"})) (clojure.core/contains? input :auth) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-auth (input :auth)) #:http.request.field{:name "auth", :shape "SourceAuth"})) (clojure.core/contains? input :report-build-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :report-build-status)) #:http.request.field{:name "reportBuildStatus", :shape "WrapperBoolean"})) (clojure.core/contains? input :insecure-ssl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :insecure-ssl)) #:http.request.field{:name "insecureSsl", :shape "WrapperBoolean"})) (clojure.core/contains? input :source-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-identifier)) #:http.request.field{:name "sourceIdentifier", :shape "String"}))))

(clojure.core/defn- ser-source-type [input] #:http.request.field{:value (clojure.core/get {:s-3 "S3", "CODEPIPELINE" "CODEPIPELINE", :github "GITHUB", :codepipeline "CODEPIPELINE", :bitbucket "BITBUCKET", :codecommit "CODECOMMIT", :no-source "NO_SOURCE", "GITHUB_ENTERPRISE" "GITHUB_ENTERPRISE", "BITBUCKET" "BITBUCKET", "CODECOMMIT" "CODECOMMIT", "GITHUB" "GITHUB", "S3" "S3", "NO_SOURCE" "NO_SOURCE", :github-enterprise "GITHUB_ENTERPRISE"} input), :shape "SourceType"})

(clojure.core/defn- ser-time-out [input] #:http.request.field{:value input, :shape "TimeOut"})

(clojure.core/defn- ser-sort-order-type [input] #:http.request.field{:value (clojure.core/get {"ASCENDING" "ASCENDING", :ascending "ASCENDING", "DESCENDING" "DESCENDING", :descending "DESCENDING"} input), :shape "SortOrderType"})

(clojure.core/defn- ser-project-environment [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-environment-type (:type input)) #:http.request.field{:name "type", :shape "EnvironmentType"}) (clojure.core/into (ser-non-empty-string (:image input)) #:http.request.field{:name "image", :shape "NonEmptyString"}) (clojure.core/into (ser-compute-type (:compute-type input)) #:http.request.field{:name "computeType", :shape "ComputeType"})], :shape "ProjectEnvironment", :type "structure"} (clojure.core/contains? input :environment-variables) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment-variables)) #:http.request.field{:name "environmentVariables", :shape "EnvironmentVariables"})) (clojure.core/contains? input :privileged-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :privileged-mode)) #:http.request.field{:name "privilegedMode", :shape "WrapperBoolean"})) (clojure.core/contains? input :certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :certificate)) #:http.request.field{:name "certificate", :shape "String"}))))

(clojure.core/defn- ser-project-sources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-project-source coll) #:http.request.field{:shape "ProjectSource"}))) input), :shape "ProjectSources", :type "list", :max 12, :min 0})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-s-3-logs-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-logs-config-status-type (:status input)) #:http.request.field{:name "status", :shape "LogsConfigStatusType"})], :shape "S3LogsConfig", :type "structure"} (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :location)) #:http.request.field{:name "location", :shape "String"}))))

(clojure.core/defn- ser-logs-config-status-type [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "LogsConfigStatusType"})

(clojure.core/defn- ser-project-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "ProjectNames", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-environment-variable [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:name input)) #:http.request.field{:name "name", :shape "NonEmptyString"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "value", :shape "String"})], :shape "EnvironmentVariable", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variable-type (input :type)) #:http.request.field{:name "type", :shape "EnvironmentVariableType"}))))

(clojure.core/defn- ser-key-input [input] #:http.request.field{:value input, :shape "KeyInput"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-source-auth [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-source-auth-type (:type input)) #:http.request.field{:name "type", :shape "SourceAuthType"})], :shape "SourceAuth", :type "structure"} (clojure.core/contains? input :resource) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resource)) #:http.request.field{:name "resource", :shape "String"}))))

(clojure.core/defn- ser-project-description [input] #:http.request.field{:value input, :shape "ProjectDescription"})

(clojure.core/defn- ser-project-cache [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cache-type (:type input)) #:http.request.field{:name "type", :shape "CacheType"})], :shape "ProjectCache", :type "structure"} (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :location)) #:http.request.field{:name "location", :shape "String"}))))

(clojure.core/defn- ser-project-sort-by-type [input] #:http.request.field{:value (clojure.core/get {"NAME" "NAME", :name "NAME", "CREATED_TIME" "CREATED_TIME", :created-time "CREATED_TIME", "LAST_MODIFIED_TIME" "LAST_MODIFIED_TIME", :last-modified-time "LAST_MODIFIED_TIME"} input), :shape "ProjectSortByType"})

(clojure.core/defn- ser-cache-type [input] #:http.request.field{:value (clojure.core/get {"NO_CACHE" "NO_CACHE", :no-cache "NO_CACHE", "S3" "S3", :s-3 "S3"} input), :shape "CacheType"})

(clojure.core/defn- ser-environment-variable-type [input] #:http.request.field{:value (clojure.core/get {"PLAINTEXT" "PLAINTEXT", :plaintext "PLAINTEXT", "PARAMETER_STORE" "PARAMETER_STORE", :parameter-store "PARAMETER_STORE"} input), :shape "EnvironmentVariableType"})

(clojure.core/defn- ser-vpc-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VpcConfig", :type "structure"} (clojure.core/contains? input :vpc-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :vpc-id)) #:http.request.field{:name "vpcId", :shape "NonEmptyString"})) (clojure.core/contains? input :subnets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnets (input :subnets)) #:http.request.field{:name "subnets", :shape "Subnets"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "securityGroupIds", :shape "SecurityGroupIds"}))))

(clojure.core/defn- ser-project-source-version [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:source-identifier input)) #:http.request.field{:name "sourceIdentifier", :shape "String"}) (clojure.core/into (ser-string (:source-version input)) #:http.request.field{:name "sourceVersion", :shape "String"})], :shape "ProjectSourceVersion", :type "structure"}))

(clojure.core/defn- ser-source-auth-type [input] #:http.request.field{:value (clojure.core/get {"OAUTH" "OAUTH", :oauth "OAUTH"} input), :shape "SourceAuthType"})

(clojure.core/defn- ser-wrapper-boolean [input] #:http.request.field{:value input, :shape "WrapperBoolean"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-input (input :key)) #:http.request.field{:name "key", :shape "KeyInput"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-value-input (input :value)) #:http.request.field{:name "value", :shape "ValueInput"}))))

(clojure.core/defn- ser-compute-type [input] #:http.request.field{:value (clojure.core/get {"BUILD_GENERAL1_SMALL" "BUILD_GENERAL1_SMALL", :build-general-1-small "BUILD_GENERAL1_SMALL", "BUILD_GENERAL1_MEDIUM" "BUILD_GENERAL1_MEDIUM", :build-general-1-medium "BUILD_GENERAL1_MEDIUM", "BUILD_GENERAL1_LARGE" "BUILD_GENERAL1_LARGE", :build-general-1-large "BUILD_GENERAL1_LARGE"} input), :shape "ComputeType"})

(clojure.core/defn- ser-project-name [input] #:http.request.field{:value input, :shape "ProjectName"})

(clojure.core/defn- ser-git-clone-depth [input] #:http.request.field{:value input, :shape "GitCloneDepth"})

(clojure.core/defn- ser-build-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "BuildIds", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-project-artifacts-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-project-artifacts coll) #:http.request.field{:shape "ProjectArtifacts"}))) input), :shape "ProjectArtifactsList", :type "list", :max 12, :min 0})

(clojure.core/defn- ser-project-secondary-source-versions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-project-source-version coll) #:http.request.field{:shape "ProjectSourceVersion"}))) input), :shape "ProjectSecondarySourceVersions", :type "list", :max 12, :min 0})

(clojure.core/defn- ser-logs-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LogsConfig", :type "structure"} (clojure.core/contains? input :cloud-watch-logs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logs-config (input :cloud-watch-logs)) #:http.request.field{:name "cloudWatchLogs", :shape "CloudWatchLogsConfig"})) (clojure.core/contains? input :s-3-logs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-logs-config (input :s-3-logs)) #:http.request.field{:name "s3Logs", :shape "S3LogsConfig"}))))

(clojure.core/defn- ser-artifacts-type [input] #:http.request.field{:value (clojure.core/get {"CODEPIPELINE" "CODEPIPELINE", :codepipeline "CODEPIPELINE", "S3" "S3", :s-3 "S3", "NO_ARTIFACTS" "NO_ARTIFACTS", :no-artifacts "NO_ARTIFACTS"} input), :shape "ArtifactsType"})

(clojure.core/defn- ser-project-artifacts [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-artifacts-type (:type input)) #:http.request.field{:name "type", :shape "ArtifactsType"})], :shape "ProjectArtifacts", :type "structure"} (clojure.core/contains? input :override-artifact-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :override-artifact-name)) #:http.request.field{:name "overrideArtifactName", :shape "WrapperBoolean"})) (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :path)) #:http.request.field{:name "path", :shape "String"})) (clojure.core/contains? input :encryption-disabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :encryption-disabled)) #:http.request.field{:name "encryptionDisabled", :shape "WrapperBoolean"})) (clojure.core/contains? input :packaging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-artifact-packaging (input :packaging)) #:http.request.field{:name "packaging", :shape "ArtifactPackaging"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :location)) #:http.request.field{:name "location", :shape "String"})) (clojure.core/contains? input :namespace-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-artifact-namespace (input :namespace-type)) #:http.request.field{:name "namespaceType", :shape "ArtifactNamespace"})) (clojure.core/contains? input :artifact-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :artifact-identifier)) #:http.request.field{:name "artifactIdentifier", :shape "String"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-batch-get-projects-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-names (input :names)) #:http.request.field{:name "names", :shape "ProjectNames"})]}))

(clojure.core/defn- req-create-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName"})]} (clojure.core/contains? input :branch-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :branch-filter)) #:http.request.field{:name "branchFilter", :shape "String"}))))

(clojure.core/defn- req-delete-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "name", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-invalidate-project-cache-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :project-name)) #:http.request.field{:name "projectName", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-list-projects-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sort-by-type (input :sort-by)) #:http.request.field{:name "sortBy", :shape "ProjectSortByType"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order-type (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrderType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "NonEmptyString"}))))

(clojure.core/defn- req-list-curated-environment-images-input [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "name", :shape "NonEmptyString"})]} (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "vpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :service-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :service-role)) #:http.request.field{:name "serviceRole", :shape "NonEmptyString"})) (clojure.core/contains? input :badge-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :badge-enabled)) #:http.request.field{:name "badgeEnabled", :shape "WrapperBoolean"})) (clojure.core/contains? input :artifacts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts (input :artifacts)) #:http.request.field{:name "artifacts", :shape "ProjectArtifacts"})) (clojure.core/contains? input :secondary-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sources (input :secondary-sources)) #:http.request.field{:name "secondarySources", :shape "ProjectSources"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})) (clojure.core/contains? input :cache) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-cache (input :cache)) #:http.request.field{:name "cache", :shape "ProjectCache"})) (clojure.core/contains? input :encryption-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :encryption-key)) #:http.request.field{:name "encryptionKey", :shape "NonEmptyString"})) (clojure.core/contains? input :source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-source (input :source)) #:http.request.field{:name "source", :shape "ProjectSource"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-environment (input :environment)) #:http.request.field{:name "environment", :shape "ProjectEnvironment"})) (clojure.core/contains? input :secondary-artifacts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts-list (input :secondary-artifacts)) #:http.request.field{:name "secondaryArtifacts", :shape "ProjectArtifactsList"})) (clojure.core/contains? input :timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :timeout-in-minutes)) #:http.request.field{:name "timeoutInMinutes", :shape "TimeOut"})) (clojure.core/contains? input :logs-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs-config (input :logs-config)) #:http.request.field{:name "logsConfig", :shape "LogsConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"}))))

(clojure.core/defn- req-batch-delete-builds-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-build-ids (input :ids)) #:http.request.field{:name "ids", :shape "BuildIds"})]}))

(clojure.core/defn- req-start-build-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :project-name)) #:http.request.field{:name "projectName", :shape "NonEmptyString"})]} (clojure.core/contains? input :report-build-status-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :report-build-status-override)) #:http.request.field{:name "reportBuildStatusOverride", :shape "WrapperBoolean"})) (clojure.core/contains? input :source-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-version)) #:http.request.field{:name "sourceVersion", :shape "String"})) (clojure.core/contains? input :timeout-in-minutes-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :timeout-in-minutes-override)) #:http.request.field{:name "timeoutInMinutesOverride", :shape "TimeOut"})) (clojure.core/contains? input :secondary-sources-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sources (input :secondary-sources-override)) #:http.request.field{:name "secondarySourcesOverride", :shape "ProjectSources"})) (clojure.core/contains? input :artifacts-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts (input :artifacts-override)) #:http.request.field{:name "artifactsOverride", :shape "ProjectArtifacts"})) (clojure.core/contains? input :logs-config-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs-config (input :logs-config-override)) #:http.request.field{:name "logsConfigOverride", :shape "LogsConfig"})) (clojure.core/contains? input :secondary-artifacts-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts-list (input :secondary-artifacts-override)) #:http.request.field{:name "secondaryArtifactsOverride", :shape "ProjectArtifactsList"})) (clojure.core/contains? input :source-auth-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-auth (input :source-auth-override)) #:http.request.field{:name "sourceAuthOverride", :shape "SourceAuth"})) (clojure.core/contains? input :certificate-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :certificate-override)) #:http.request.field{:name "certificateOverride", :shape "String"})) (clojure.core/contains? input :git-clone-depth-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-git-clone-depth (input :git-clone-depth-override)) #:http.request.field{:name "gitCloneDepthOverride", :shape "GitCloneDepth"})) (clojure.core/contains? input :compute-type-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-type (input :compute-type-override)) #:http.request.field{:name "computeTypeOverride", :shape "ComputeType"})) (clojure.core/contains? input :buildspec-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :buildspec-override)) #:http.request.field{:name "buildspecOverride", :shape "String"})) (clojure.core/contains? input :idempotency-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :idempotency-token)) #:http.request.field{:name "idempotencyToken", :shape "String"})) (clojure.core/contains? input :privileged-mode-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :privileged-mode-override)) #:http.request.field{:name "privilegedModeOverride", :shape "WrapperBoolean"})) (clojure.core/contains? input :environment-variables-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment-variables-override)) #:http.request.field{:name "environmentVariablesOverride", :shape "EnvironmentVariables"})) (clojure.core/contains? input :cache-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-cache (input :cache-override)) #:http.request.field{:name "cacheOverride", :shape "ProjectCache"})) (clojure.core/contains? input :image-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :image-override)) #:http.request.field{:name "imageOverride", :shape "NonEmptyString"})) (clojure.core/contains? input :environment-type-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-type (input :environment-type-override)) #:http.request.field{:name "environmentTypeOverride", :shape "EnvironmentType"})) (clojure.core/contains? input :service-role-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :service-role-override)) #:http.request.field{:name "serviceRoleOverride", :shape "NonEmptyString"})) (clojure.core/contains? input :source-location-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-location-override)) #:http.request.field{:name "sourceLocationOverride", :shape "String"})) (clojure.core/contains? input :source-type-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-type (input :source-type-override)) #:http.request.field{:name "sourceTypeOverride", :shape "SourceType"})) (clojure.core/contains? input :insecure-ssl-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :insecure-ssl-override)) #:http.request.field{:name "insecureSslOverride", :shape "WrapperBoolean"})) (clojure.core/contains? input :secondary-sources-version-override) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-secondary-source-versions (input :secondary-sources-version-override)) #:http.request.field{:name "secondarySourcesVersionOverride", :shape "ProjectSecondarySourceVersions"}))))

(clojure.core/defn- req-stop-build-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :id)) #:http.request.field{:name "id", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-delete-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName"})]}))

(clojure.core/defn- req-create-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName"}) (clojure.core/into (ser-project-source (input :source)) #:http.request.field{:name "source", :shape "ProjectSource"}) (clojure.core/into (ser-project-artifacts (input :artifacts)) #:http.request.field{:name "artifacts", :shape "ProjectArtifacts"}) (clojure.core/into (ser-project-environment (input :environment)) #:http.request.field{:name "environment", :shape "ProjectEnvironment"}) (clojure.core/into (ser-non-empty-string (input :service-role)) #:http.request.field{:name "serviceRole", :shape "NonEmptyString"})]} (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "vpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :badge-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wrapper-boolean (input :badge-enabled)) #:http.request.field{:name "badgeEnabled", :shape "WrapperBoolean"})) (clojure.core/contains? input :secondary-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-sources (input :secondary-sources)) #:http.request.field{:name "secondarySources", :shape "ProjectSources"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})) (clojure.core/contains? input :cache) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-cache (input :cache)) #:http.request.field{:name "cache", :shape "ProjectCache"})) (clojure.core/contains? input :encryption-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :encryption-key)) #:http.request.field{:name "encryptionKey", :shape "NonEmptyString"})) (clojure.core/contains? input :secondary-artifacts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-artifacts-list (input :secondary-artifacts)) #:http.request.field{:name "secondaryArtifacts", :shape "ProjectArtifactsList"})) (clojure.core/contains? input :timeout-in-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-out (input :timeout-in-minutes)) #:http.request.field{:name "timeoutInMinutes", :shape "TimeOut"})) (clojure.core/contains? input :logs-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs-config (input :logs-config)) #:http.request.field{:name "logsConfig", :shape "LogsConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"}))))

(clojure.core/defn- req-update-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName"})]} (clojure.core/contains? input :branch-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :branch-filter)) #:http.request.field{:name "branchFilter", :shape "String"})) (clojure.core/contains? input :rotate-secret) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :rotate-secret)) #:http.request.field{:name "rotateSecret", :shape "Boolean"}))))

(clojure.core/defn- req-list-builds-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order-type (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrderType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-batch-get-builds-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-build-ids (input :ids)) #:http.request.field{:name "ids", :shape "BuildIds"})]}))

(clojure.core/defn- req-list-builds-for-project-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :project-name)) #:http.request.field{:name "projectName", :shape "NonEmptyString"})]} (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order-type (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrderType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/declare deser-environment-language)

(clojure.core/declare deser-build-not-deleted)

(clojure.core/declare deser-environment-image)

(clojure.core/declare deser-project-badge)

(clojure.core/declare deser-build-artifacts-list)

(clojure.core/declare deser-artifact-namespace)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-environment-type)

(clojure.core/declare deser-value-input)

(clojure.core/declare deser-security-group-ids)

(clojure.core/declare deser-artifact-packaging)

(clojure.core/declare deser-subnets)

(clojure.core/declare deser-build-phases)

(clojure.core/declare deser-wrapper-long)

(clojure.core/declare deser-environment-variables)

(clojure.core/declare deser-logs-location)

(clojure.core/declare deser-cloud-watch-logs-config)

(clojure.core/declare deser-project-source)

(clojure.core/declare deser-environment-languages)

(clojure.core/declare deser-platform-type)

(clojure.core/declare deser-environment-images)

(clojure.core/declare deser-source-type)

(clojure.core/declare deser-time-out)

(clojure.core/declare deser-status-type)

(clojure.core/declare deser-image-versions)

(clojure.core/declare deser-project-environment)

(clojure.core/declare deser-project-sources)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-s-3-logs-config)

(clojure.core/declare deser-logs-config-status-type)

(clojure.core/declare deser-language-type)

(clojure.core/declare deser-project-names)

(clojure.core/declare deser-environment-variable)

(clojure.core/declare deser-key-input)

(clojure.core/declare deser-build)

(clojure.core/declare deser-string)

(clojure.core/declare deser-source-auth)

(clojure.core/declare deser-project-description)

(clojure.core/declare deser-project)

(clojure.core/declare deser-network-interface)

(clojure.core/declare deser-project-cache)

(clojure.core/declare deser-cache-type)

(clojure.core/declare deser-wrapper-int)

(clojure.core/declare deser-environment-variable-type)

(clojure.core/declare deser-phase-context)

(clojure.core/declare deser-vpc-config)

(clojure.core/declare deser-project-source-version)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-source-auth-type)

(clojure.core/declare deser-wrapper-boolean)

(clojure.core/declare deser-build-phase-type)

(clojure.core/declare deser-build-artifacts)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-builds)

(clojure.core/declare deser-compute-type)

(clojure.core/declare deser-projects)

(clojure.core/declare deser-project-name)

(clojure.core/declare deser-git-clone-depth)

(clojure.core/declare deser-build-ids)

(clojure.core/declare deser-build-phase)

(clojure.core/declare deser-project-artifacts-list)

(clojure.core/declare deser-builds-not-deleted)

(clojure.core/declare deser-project-secondary-source-versions)

(clojure.core/declare deser-phase-contexts)

(clojure.core/declare deser-logs-config)

(clojure.core/declare deser-environment-platform)

(clojure.core/declare deser-artifacts-type)

(clojure.core/declare deser-environment-platforms)

(clojure.core/declare deser-project-artifacts)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-webhook)

(clojure.core/defn- deser-environment-language [input] (clojure.core/cond-> {} (clojure.core/contains? input "language") (clojure.core/assoc :language (deser-language-type (input "language"))) (clojure.core/contains? input "images") (clojure.core/assoc :images (deser-environment-images (input "images")))))

(clojure.core/defn- deser-build-not-deleted [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-non-empty-string (input "id"))) (clojure.core/contains? input "statusCode") (clojure.core/assoc :status-code (deser-string (input "statusCode")))))

(clojure.core/defn- deser-environment-image [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "versions") (clojure.core/assoc :versions (deser-image-versions (input "versions")))))

(clojure.core/defn- deser-project-badge [input] (clojure.core/cond-> {} (clojure.core/contains? input "badgeEnabled") (clojure.core/assoc :badge-enabled (deser-boolean (input "badgeEnabled"))) (clojure.core/contains? input "badgeRequestUrl") (clojure.core/assoc :badge-request-url (deser-string (input "badgeRequestUrl")))))

(clojure.core/defn- deser-build-artifacts-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-build-artifacts coll))) input))

(clojure.core/defn- deser-artifact-namespace [input] (clojure.core/get {"NONE" :none, "BUILD_ID" :build-id} input))

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-environment-type [input] (clojure.core/get {"WINDOWS_CONTAINER" :windows-container, "LINUX_CONTAINER" :linux-container} input))

(clojure.core/defn- deser-value-input [input] input)

(clojure.core/defn- deser-security-group-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-artifact-packaging [input] (clojure.core/get {"NONE" :none, "ZIP" :zip} input))

(clojure.core/defn- deser-subnets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-build-phases [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-build-phase coll))) input))

(clojure.core/defn- deser-wrapper-long [input] input)

(clojure.core/defn- deser-environment-variables [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-variable coll))) input))

(clojure.core/defn- deser-logs-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "groupName") (clojure.core/assoc :group-name (deser-string (input "groupName"))) (clojure.core/contains? input "streamName") (clojure.core/assoc :stream-name (deser-string (input "streamName"))) (clojure.core/contains? input "deepLink") (clojure.core/assoc :deep-link (deser-string (input "deepLink"))) (clojure.core/contains? input "s3DeepLink") (clojure.core/assoc :s-3-deep-link (deser-string (input "s3DeepLink"))) (clojure.core/contains? input "cloudWatchLogs") (clojure.core/assoc :cloud-watch-logs (deser-cloud-watch-logs-config (input "cloudWatchLogs"))) (clojure.core/contains? input "s3Logs") (clojure.core/assoc :s-3-logs (deser-s-3-logs-config (input "s3Logs")))))

(clojure.core/defn- deser-cloud-watch-logs-config [input] (clojure.core/cond-> {:status (deser-logs-config-status-type (input "status"))} (clojure.core/contains? input "groupName") (clojure.core/assoc :group-name (deser-string (input "groupName"))) (clojure.core/contains? input "streamName") (clojure.core/assoc :stream-name (deser-string (input "streamName")))))

(clojure.core/defn- deser-project-source [input] (clojure.core/cond-> {:type (deser-source-type (input "type"))} (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-string (input "location"))) (clojure.core/contains? input "gitCloneDepth") (clojure.core/assoc :git-clone-depth (deser-git-clone-depth (input "gitCloneDepth"))) (clojure.core/contains? input "buildspec") (clojure.core/assoc :buildspec (deser-string (input "buildspec"))) (clojure.core/contains? input "auth") (clojure.core/assoc :auth (deser-source-auth (input "auth"))) (clojure.core/contains? input "reportBuildStatus") (clojure.core/assoc :report-build-status (deser-wrapper-boolean (input "reportBuildStatus"))) (clojure.core/contains? input "insecureSsl") (clojure.core/assoc :insecure-ssl (deser-wrapper-boolean (input "insecureSsl"))) (clojure.core/contains? input "sourceIdentifier") (clojure.core/assoc :source-identifier (deser-string (input "sourceIdentifier")))))

(clojure.core/defn- deser-environment-languages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-language coll))) input))

(clojure.core/defn- deser-platform-type [input] (clojure.core/get {"DEBIAN" :debian, "AMAZON_LINUX" :amazon-linux, "UBUNTU" :ubuntu, "WINDOWS_SERVER" :windows-server} input))

(clojure.core/defn- deser-environment-images [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-image coll))) input))

(clojure.core/defn- deser-source-type [input] (clojure.core/get {"CODECOMMIT" :codecommit, "CODEPIPELINE" :codepipeline, "GITHUB" :github, "S3" :s-3, "BITBUCKET" :bitbucket, "GITHUB_ENTERPRISE" :github-enterprise, "NO_SOURCE" :no-source} input))

(clojure.core/defn- deser-time-out [input] input)

(clojure.core/defn- deser-status-type [input] (clojure.core/get {"SUCCEEDED" :succeeded, "FAILED" :failed, "FAULT" :fault, "TIMED_OUT" :timed-out, "IN_PROGRESS" :in-progress, "STOPPED" :stopped} input))

(clojure.core/defn- deser-image-versions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-project-environment [input] (clojure.core/cond-> {:type (deser-environment-type (input "type")), :image (deser-non-empty-string (input "image")), :compute-type (deser-compute-type (input "computeType"))} (clojure.core/contains? input "environmentVariables") (clojure.core/assoc :environment-variables (deser-environment-variables (input "environmentVariables"))) (clojure.core/contains? input "privilegedMode") (clojure.core/assoc :privileged-mode (deser-wrapper-boolean (input "privilegedMode"))) (clojure.core/contains? input "certificate") (clojure.core/assoc :certificate (deser-string (input "certificate")))))

(clojure.core/defn- deser-project-sources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project-source coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-s-3-logs-config [input] (clojure.core/cond-> {:status (deser-logs-config-status-type (input "status"))} (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-string (input "location")))))

(clojure.core/defn- deser-logs-config-status-type [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-language-type [input] (clojure.core/get {"BASE" :base, "DOTNET" :dotnet, "GOLANG" :golang, "JAVA" :java, "DOCKER" :docker, "PYTHON" :python, "NODE_JS" :node-js, "RUBY" :ruby, "ANDROID" :android} input))

(clojure.core/defn- deser-project-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-environment-variable [input] (clojure.core/cond-> {:name (deser-non-empty-string (input "name")), :value (deser-string (input "value"))} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-environment-variable-type (input "type")))))

(clojure.core/defn- deser-key-input [input] input)

(clojure.core/defn- deser-build [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "vpcConfig"))) (clojure.core/contains? input "serviceRole") (clojure.core/assoc :service-role (deser-non-empty-string (input "serviceRole"))) (clojure.core/contains? input "sourceVersion") (clojure.core/assoc :source-version (deser-non-empty-string (input "sourceVersion"))) (clojure.core/contains? input "buildComplete") (clojure.core/assoc :build-complete (deser-boolean (input "buildComplete"))) (clojure.core/contains? input "secondarySourceVersions") (clojure.core/assoc :secondary-source-versions (deser-project-secondary-source-versions (input "secondarySourceVersions"))) (clojure.core/contains? input "artifacts") (clojure.core/assoc :artifacts (deser-build-artifacts (input "artifacts"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "networkInterface") (clojure.core/assoc :network-interface (deser-network-interface (input "networkInterface"))) (clojure.core/contains? input "secondarySources") (clojure.core/assoc :secondary-sources (deser-project-sources (input "secondarySources"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-non-empty-string (input "id"))) (clojure.core/contains? input "resolvedSourceVersion") (clojure.core/assoc :resolved-source-version (deser-non-empty-string (input "resolvedSourceVersion"))) (clojure.core/contains? input "cache") (clojure.core/assoc :cache (deser-project-cache (input "cache"))) (clojure.core/contains? input "startTime") (clojure.core/assoc :start-time (deser-timestamp (input "startTime"))) (clojure.core/contains? input "logs") (clojure.core/assoc :logs (deser-logs-location (input "logs"))) (clojure.core/contains? input "initiator") (clojure.core/assoc :initiator (deser-string (input "initiator"))) (clojure.core/contains? input "encryptionKey") (clojure.core/assoc :encryption-key (deser-non-empty-string (input "encryptionKey"))) (clojure.core/contains? input "source") (clojure.core/assoc :source (deser-project-source (input "source"))) (clojure.core/contains? input "environment") (clojure.core/assoc :environment (deser-project-environment (input "environment"))) (clojure.core/contains? input "secondaryArtifacts") (clojure.core/assoc :secondary-artifacts (deser-build-artifacts-list (input "secondaryArtifacts"))) (clojure.core/contains? input "currentPhase") (clojure.core/assoc :current-phase (deser-string (input "currentPhase"))) (clojure.core/contains? input "timeoutInMinutes") (clojure.core/assoc :timeout-in-minutes (deser-wrapper-int (input "timeoutInMinutes"))) (clojure.core/contains? input "endTime") (clojure.core/assoc :end-time (deser-timestamp (input "endTime"))) (clojure.core/contains? input "projectName") (clojure.core/assoc :project-name (deser-non-empty-string (input "projectName"))) (clojure.core/contains? input "buildStatus") (clojure.core/assoc :build-status (deser-status-type (input "buildStatus"))) (clojure.core/contains? input "phases") (clojure.core/assoc :phases (deser-build-phases (input "phases")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-source-auth [input] (clojure.core/cond-> {:type (deser-source-auth-type (input "type"))} (clojure.core/contains? input "resource") (clojure.core/assoc :resource (deser-string (input "resource")))))

(clojure.core/defn- deser-project-description [input] input)

(clojure.core/defn- deser-project [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "vpcConfig"))) (clojure.core/contains? input "serviceRole") (clojure.core/assoc :service-role (deser-non-empty-string (input "serviceRole"))) (clojure.core/contains? input "lastModified") (clojure.core/assoc :last-modified (deser-timestamp (input "lastModified"))) (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-timestamp (input "created"))) (clojure.core/contains? input "artifacts") (clojure.core/assoc :artifacts (deser-project-artifacts (input "artifacts"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "secondarySources") (clojure.core/assoc :secondary-sources (deser-project-sources (input "secondarySources"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tag-list (input "tags"))) (clojure.core/contains? input "cache") (clojure.core/assoc :cache (deser-project-cache (input "cache"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-project-name (input "name"))) (clojure.core/contains? input "encryptionKey") (clojure.core/assoc :encryption-key (deser-non-empty-string (input "encryptionKey"))) (clojure.core/contains? input "source") (clojure.core/assoc :source (deser-project-source (input "source"))) (clojure.core/contains? input "environment") (clojure.core/assoc :environment (deser-project-environment (input "environment"))) (clojure.core/contains? input "secondaryArtifacts") (clojure.core/assoc :secondary-artifacts (deser-project-artifacts-list (input "secondaryArtifacts"))) (clojure.core/contains? input "timeoutInMinutes") (clojure.core/assoc :timeout-in-minutes (deser-time-out (input "timeoutInMinutes"))) (clojure.core/contains? input "webhook") (clojure.core/assoc :webhook (deser-webhook (input "webhook"))) (clojure.core/contains? input "logsConfig") (clojure.core/assoc :logs-config (deser-logs-config (input "logsConfig"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-project-description (input "description"))) (clojure.core/contains? input "badge") (clojure.core/assoc :badge (deser-project-badge (input "badge")))))

(clojure.core/defn- deser-network-interface [input] (clojure.core/cond-> {} (clojure.core/contains? input "subnetId") (clojure.core/assoc :subnet-id (deser-non-empty-string (input "subnetId"))) (clojure.core/contains? input "networkInterfaceId") (clojure.core/assoc :network-interface-id (deser-non-empty-string (input "networkInterfaceId")))))

(clojure.core/defn- deser-project-cache [input] (clojure.core/cond-> {:type (deser-cache-type (input "type"))} (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-string (input "location")))))

(clojure.core/defn- deser-cache-type [input] (clojure.core/get {"NO_CACHE" :no-cache, "S3" :s-3} input))

(clojure.core/defn- deser-wrapper-int [input] input)

(clojure.core/defn- deser-environment-variable-type [input] (clojure.core/get {"PLAINTEXT" :plaintext, "PARAMETER_STORE" :parameter-store} input))

(clojure.core/defn- deser-phase-context [input] (clojure.core/cond-> {} (clojure.core/contains? input "statusCode") (clojure.core/assoc :status-code (deser-string (input "statusCode"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-vpc-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpcId") (clojure.core/assoc :vpc-id (deser-non-empty-string (input "vpcId"))) (clojure.core/contains? input "subnets") (clojure.core/assoc :subnets (deser-subnets (input "subnets"))) (clojure.core/contains? input "securityGroupIds") (clojure.core/assoc :security-group-ids (deser-security-group-ids (input "securityGroupIds")))))

(clojure.core/defn- deser-project-source-version [input] (clojure.core/cond-> {:source-identifier (deser-string (input "sourceIdentifier")), :source-version (deser-string (input "sourceVersion"))}))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-source-auth-type [input] (clojure.core/get {"OAUTH" :oauth} input))

(clojure.core/defn- deser-wrapper-boolean [input] input)

(clojure.core/defn- deser-build-phase-type [input] (clojure.core/get {"COMPLETED" :completed, "POST_BUILD" :post-build, "PROVISIONING" :provisioning, "SUBMITTED" :submitted, "UPLOAD_ARTIFACTS" :upload-artifacts, "BUILD" :build, "DOWNLOAD_SOURCE" :download-source, "INSTALL" :install, "FINALIZING" :finalizing, "PRE_BUILD" :pre-build} input))

(clojure.core/defn- deser-build-artifacts [input] (clojure.core/cond-> {} (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-string (input "location"))) (clojure.core/contains? input "sha256sum") (clojure.core/assoc :sha-256sum (deser-string (input "sha256sum"))) (clojure.core/contains? input "md5sum") (clojure.core/assoc :md-5sum (deser-string (input "md5sum"))) (clojure.core/contains? input "overrideArtifactName") (clojure.core/assoc :override-artifact-name (deser-wrapper-boolean (input "overrideArtifactName"))) (clojure.core/contains? input "encryptionDisabled") (clojure.core/assoc :encryption-disabled (deser-wrapper-boolean (input "encryptionDisabled"))) (clojure.core/contains? input "artifactIdentifier") (clojure.core/assoc :artifact-identifier (deser-string (input "artifactIdentifier")))))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-key-input (input "key"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-value-input (input "value")))))

(clojure.core/defn- deser-builds [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-build coll))) input))

(clojure.core/defn- deser-compute-type [input] (clojure.core/get {"BUILD_GENERAL1_SMALL" :build-general-1-small, "BUILD_GENERAL1_MEDIUM" :build-general-1-medium, "BUILD_GENERAL1_LARGE" :build-general-1-large} input))

(clojure.core/defn- deser-projects [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project coll))) input))

(clojure.core/defn- deser-project-name [input] input)

(clojure.core/defn- deser-git-clone-depth [input] input)

(clojure.core/defn- deser-build-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-build-phase [input] (clojure.core/cond-> {} (clojure.core/contains? input "phaseType") (clojure.core/assoc :phase-type (deser-build-phase-type (input "phaseType"))) (clojure.core/contains? input "phaseStatus") (clojure.core/assoc :phase-status (deser-status-type (input "phaseStatus"))) (clojure.core/contains? input "startTime") (clojure.core/assoc :start-time (deser-timestamp (input "startTime"))) (clojure.core/contains? input "endTime") (clojure.core/assoc :end-time (deser-timestamp (input "endTime"))) (clojure.core/contains? input "durationInSeconds") (clojure.core/assoc :duration-in-seconds (deser-wrapper-long (input "durationInSeconds"))) (clojure.core/contains? input "contexts") (clojure.core/assoc :contexts (deser-phase-contexts (input "contexts")))))

(clojure.core/defn- deser-project-artifacts-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project-artifacts coll))) input))

(clojure.core/defn- deser-builds-not-deleted [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-build-not-deleted coll))) input))

(clojure.core/defn- deser-project-secondary-source-versions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project-source-version coll))) input))

(clojure.core/defn- deser-phase-contexts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-phase-context coll))) input))

(clojure.core/defn- deser-logs-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "cloudWatchLogs") (clojure.core/assoc :cloud-watch-logs (deser-cloud-watch-logs-config (input "cloudWatchLogs"))) (clojure.core/contains? input "s3Logs") (clojure.core/assoc :s-3-logs (deser-s-3-logs-config (input "s3Logs")))))

(clojure.core/defn- deser-environment-platform [input] (clojure.core/cond-> {} (clojure.core/contains? input "platform") (clojure.core/assoc :platform (deser-platform-type (input "platform"))) (clojure.core/contains? input "languages") (clojure.core/assoc :languages (deser-environment-languages (input "languages")))))

(clojure.core/defn- deser-artifacts-type [input] (clojure.core/get {"CODEPIPELINE" :codepipeline, "S3" :s-3, "NO_ARTIFACTS" :no-artifacts} input))

(clojure.core/defn- deser-environment-platforms [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-platform coll))) input))

(clojure.core/defn- deser-project-artifacts [input] (clojure.core/cond-> {:type (deser-artifacts-type (input "type"))} (clojure.core/contains? input "overrideArtifactName") (clojure.core/assoc :override-artifact-name (deser-wrapper-boolean (input "overrideArtifactName"))) (clojure.core/contains? input "path") (clojure.core/assoc :path (deser-string (input "path"))) (clojure.core/contains? input "encryptionDisabled") (clojure.core/assoc :encryption-disabled (deser-wrapper-boolean (input "encryptionDisabled"))) (clojure.core/contains? input "packaging") (clojure.core/assoc :packaging (deser-artifact-packaging (input "packaging"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-string (input "location"))) (clojure.core/contains? input "namespaceType") (clojure.core/assoc :namespace-type (deser-artifact-namespace (input "namespaceType"))) (clojure.core/contains? input "artifactIdentifier") (clojure.core/assoc :artifact-identifier (deser-string (input "artifactIdentifier")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-webhook [input] (clojure.core/cond-> {} (clojure.core/contains? input "url") (clojure.core/assoc :url (deser-non-empty-string (input "url"))) (clojure.core/contains? input "payloadUrl") (clojure.core/assoc :payload-url (deser-non-empty-string (input "payloadUrl"))) (clojure.core/contains? input "secret") (clojure.core/assoc :secret (deser-non-empty-string (input "secret"))) (clojure.core/contains? input "branchFilter") (clojure.core/assoc :branch-filter (deser-string (input "branchFilter"))) (clojure.core/contains? input "lastModifiedSecret") (clojure.core/assoc :last-modified-secret (deser-timestamp (input "lastModifiedSecret")))))

(clojure.core/defn- deser-update-webhook-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "webhook") (clojure.core/assoc :webhook (deser-webhook (input "webhook")))))

(clojure.core/defn- deser-start-build-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "build") (clojure.core/assoc :build (deser-build (input "build")))))

(clojure.core/defn- deser-create-project-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "project") (clojure.core/assoc :project (deser-project (input "project")))))

(clojure.core/defn- deser-list-curated-environment-images-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "platforms") (clojure.core/assoc :platforms (deser-environment-platforms (input "platforms")))))

(clojure.core/defn- deser-invalidate-project-cache-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-batch-delete-builds-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "buildsDeleted") (clojure.core/assoc :builds-deleted (deser-build-ids (input "buildsDeleted"))) (clojure.core/contains? input "buildsNotDeleted") (clojure.core/assoc :builds-not-deleted (deser-builds-not-deleted (input "buildsNotDeleted")))))

(clojure.core/defn- deser-account-limit-exceeded-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-batch-get-projects-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "projects") (clojure.core/assoc :projects (deser-projects (input "projects"))) (clojure.core/contains? input "projectsNotFound") (clojure.core/assoc :projects-not-found (deser-project-names (input "projectsNotFound")))))

(clojure.core/defn- deser-resource-already-exists-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-batch-get-builds-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "builds") (clojure.core/assoc :builds (deser-builds (input "builds"))) (clojure.core/contains? input "buildsNotFound") (clojure.core/assoc :builds-not-found (deser-build-ids (input "buildsNotFound")))))

(clojure.core/defn- deser-list-builds-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "ids") (clojure.core/assoc :ids (deser-build-ids (input "ids"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-string (input "nextToken")))))

(clojure.core/defn- deser-list-projects-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-string (input "nextToken"))) (clojure.core/contains? input "projects") (clojure.core/assoc :projects (deser-project-names (input "projects")))))

(clojure.core/defn- deser-o-auth-provider-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-resource-not-found-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-webhook-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-input-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-project-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-webhook-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "webhook") (clojure.core/assoc :webhook (deser-webhook (input "webhook")))))

(clojure.core/defn- deser-list-builds-for-project-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "ids") (clojure.core/assoc :ids (deser-build-ids (input "ids"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-string (input "nextToken")))))

(clojure.core/defn- deser-update-project-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "project") (clojure.core/assoc :project (deser-project (input "project")))))

(clojure.core/defn- deser-stop-build-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "build") (clojure.core/assoc :build (deser-build (input "build")))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-language/language (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/language-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-language/images (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-images))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-language (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.environment-language/language :portkey.aws.codebuild.-2016-10-06.environment-language/images]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-webhook-output/webhook (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/webhook))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/update-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.update-webhook-output/webhook]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-not-deleted/id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-not-deleted/status-code (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-not-deleted (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.build-not-deleted/id :portkey.aws.codebuild.-2016-10-06.build-not-deleted/status-code]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-projects-input/names (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-names))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-get-projects-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.batch-get-projects-input/names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-image/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-image/description (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-image/versions (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/image-versions))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.environment-image/name :portkey.aws.codebuild.-2016-10-06.environment-image/description :portkey.aws.codebuild.-2016-10-06.environment-image/versions]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-badge/badge-enabled (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-badge/badge-request-url (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-badge (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.project-badge/badge-enabled :portkey.aws.codebuild.-2016-10-06.project-badge/badge-request-url]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-output/build (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/start-build-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.start-build-output/build]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-artifacts-list (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/build-artifacts :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/artifact-namespace #{"BUILD_ID" "NONE" :build-id :none})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__)))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-output/project (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/create-project-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.create-project-output/project]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-type #{:linux-container "WINDOWS_CONTAINER" "LINUX_CONTAINER" :windows-container})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/value-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^([\\p{L}\\p{Z}\\p{N}_.:/=@+\\-]*)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-webhook-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-webhook-input/branch-filter (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/create-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.create-webhook-input/project-name] :opt-un [:portkey.aws.codebuild.-2016-10-06.create-webhook-input/branch-filter]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/non-empty-string :max-count 5))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-curated-environment-images-output/platforms (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-platforms))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-curated-environment-images-output/platforms]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/artifact-packaging #{"ZIP" "NONE" :zip :none})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/subnets (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/non-empty-string :max-count 16))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-phases (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/build-phase))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-delete-builds-output/builds-deleted (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-delete-builds-output/builds-not-deleted (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/builds-not-deleted))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.batch-delete-builds-output/builds-deleted :portkey.aws.codebuild.-2016-10-06.batch-delete-builds-output/builds-not-deleted]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/wrapper-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-variables (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/environment-variable))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/account-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/group-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/stream-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/deep-link (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/s-3-deep-link (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/cloud-watch-logs (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/cloud-watch-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-location/s-3-logs (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/s-3-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/logs-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.logs-location/group-name :portkey.aws.codebuild.-2016-10-06.logs-location/stream-name :portkey.aws.codebuild.-2016-10-06.logs-location/deep-link :portkey.aws.codebuild.-2016-10-06.logs-location/s-3-deep-link :portkey.aws.codebuild.-2016-10-06.logs-location/cloud-watch-logs :portkey.aws.codebuild.-2016-10-06.logs-location/s-3-logs]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.delete-project-input/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/delete-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.delete-project-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/status (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config-status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/group-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/stream-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/cloud-watch-logs-config (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/status] :opt-un [:portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/group-name :portkey.aws.codebuild.-2016-10-06.cloud-watch-logs-config/stream-name]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/location (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/git-clone-depth (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/git-clone-depth))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/buildspec (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/auth (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-auth))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/report-build-status (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/insecure-ssl (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source/source-identifier (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-source (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.project-source/type] :opt-un [:portkey.aws.codebuild.-2016-10-06.project-source/location :portkey.aws.codebuild.-2016-10-06.project-source/git-clone-depth :portkey.aws.codebuild.-2016-10-06.project-source/buildspec :portkey.aws.codebuild.-2016-10-06.project-source/auth :portkey.aws.codebuild.-2016-10-06.project-source/report-build-status :portkey.aws.codebuild.-2016-10-06.project-source/insecure-ssl :portkey.aws.codebuild.-2016-10-06.project-source/source-identifier]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.invalidate-project-cache-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.invalidate-project-cache-input/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-projects-input/sort-by (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sort-by-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-projects-input/sort-order (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/sort-order-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-projects-input/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-projects-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-projects-input/sort-by :portkey.aws.codebuild.-2016-10-06.list-projects-input/sort-order :portkey.aws.codebuild.-2016-10-06.list-projects-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-languages (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/environment-language))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/platform-type #{"WINDOWS_SERVER" :windows-server "AMAZON_LINUX" "UBUNTU" :debian "DEBIAN" :amazon-linux :ubuntu})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-projects-output/projects (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/projects))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-projects-output/projects-not-found (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-names))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-get-projects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.batch-get-projects-output/projects :portkey.aws.codebuild.-2016-10-06.batch-get-projects-output/projects-not-found]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-images (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/environment-image))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/source-type #{:s-3 "CODEPIPELINE" :github :codepipeline :bitbucket :codecommit :no-source "GITHUB_ENTERPRISE" "BITBUCKET" "CODECOMMIT" "GITHUB" "S3" "NO_SOURCE" :github-enterprise})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/time-out (clojure.spec.alpha/int-in 5 480))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-builds-output/builds (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/builds))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-builds-output/builds-not-found (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-get-builds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.batch-get-builds-output/builds :portkey.aws.codebuild.-2016-10-06.batch-get-builds-output/builds-not-found]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/sort-order-type #{:descending :ascending "ASCENDING" "DESCENDING"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-output/ids (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-output/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-builds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-builds-output/ids :portkey.aws.codebuild.-2016-10-06.list-builds-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/status-type #{:timed-out "IN_PROGRESS" "TIMED_OUT" :in-progress "FAULT" :fault :stopped "SUCCEEDED" "STOPPED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-projects-output/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-projects-output/projects (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-names))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-projects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-projects-output/next-token :portkey.aws.codebuild.-2016-10-06.list-projects-output/projects]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/image-versions (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/string))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/image (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/compute-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/compute-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/environment-variables (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-variables))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/privileged-mode (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-environment/certificate (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-environment (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.project-environment/type :portkey.aws.codebuild.-2016-10-06.project-environment/image :portkey.aws.codebuild.-2016-10-06.project-environment/compute-type] :opt-un [:portkey.aws.codebuild.-2016-10-06.project-environment/environment-variables :portkey.aws.codebuild.-2016-10-06.project-environment/privileged-mode :portkey.aws.codebuild.-2016-10-06.project-environment/certificate]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-sources (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/project-source :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/tag-list (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/tag :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/service-role (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/badge-enabled (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/tags (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/tag-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/cache (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/source (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/environment (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/logs-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-input/description (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-description))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/update-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.update-project-input/name] :opt-un [:portkey.aws.codebuild.-2016-10-06.update-project-input/vpc-config :portkey.aws.codebuild.-2016-10-06.update-project-input/service-role :portkey.aws.codebuild.-2016-10-06.update-project-input/badge-enabled :portkey.aws.codebuild.-2016-10-06.update-project-input/artifacts :portkey.aws.codebuild.-2016-10-06.update-project-input/secondary-sources :portkey.aws.codebuild.-2016-10-06.update-project-input/tags :portkey.aws.codebuild.-2016-10-06.update-project-input/cache :portkey.aws.codebuild.-2016-10-06.update-project-input/encryption-key :portkey.aws.codebuild.-2016-10-06.update-project-input/source :portkey.aws.codebuild.-2016-10-06.update-project-input/environment :portkey.aws.codebuild.-2016-10-06.update-project-input/secondary-artifacts :portkey.aws.codebuild.-2016-10-06.update-project-input/timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.update-project-input/logs-config :portkey.aws.codebuild.-2016-10-06.update-project-input/description]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/o-auth-provider-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.s-3-logs-config/status (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config-status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.s-3-logs-config/location (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/s-3-logs-config (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.s-3-logs-config/status] :opt-un [:portkey.aws.codebuild.-2016-10-06.s-3-logs-config/location]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/delete-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/logs-config-status-type #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/language-type #{"BASE" :dotnet :golang :node-js "DOTNET" "GOLANG" "JAVA" "DOCKER" :docker :java "PYTHON" :android "NODE_JS" "RUBY" :python :base "ANDROID" :ruby})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-names (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/non-empty-string :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-variable/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-variable/value (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-variable/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-variable-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-variable (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.environment-variable/name :portkey.aws.codebuild.-2016-10-06.environment-variable/value] :opt-un [:portkey.aws.codebuild.-2016-10-06.environment-variable/type]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/key-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 127)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^([\\p{L}\\p{Z}\\p{N}_.:/=@+\\-]*)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-delete-builds-input/ids (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.batch-delete-builds-input/ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/report-build-status-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/source-version (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/timeout-in-minutes-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-sources-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/artifacts-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/logs-config-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-artifacts-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/source-auth-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-auth))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/certificate-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/git-clone-depth-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/git-clone-depth))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/compute-type-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/compute-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/buildspec-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/idempotency-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/privileged-mode-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/environment-variables-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-variables))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/cache-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/image-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/environment-type-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/service-role-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/source-location-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/source-type-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/insecure-ssl-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-sources-version-override (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-secondary-source-versions))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/start-build-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.start-build-input/project-name] :opt-un [:portkey.aws.codebuild.-2016-10-06.start-build-input/report-build-status-override :portkey.aws.codebuild.-2016-10-06.start-build-input/source-version :portkey.aws.codebuild.-2016-10-06.start-build-input/timeout-in-minutes-override :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-sources-override :portkey.aws.codebuild.-2016-10-06.start-build-input/artifacts-override :portkey.aws.codebuild.-2016-10-06.start-build-input/logs-config-override :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-artifacts-override :portkey.aws.codebuild.-2016-10-06.start-build-input/source-auth-override :portkey.aws.codebuild.-2016-10-06.start-build-input/certificate-override :portkey.aws.codebuild.-2016-10-06.start-build-input/git-clone-depth-override :portkey.aws.codebuild.-2016-10-06.start-build-input/compute-type-override :portkey.aws.codebuild.-2016-10-06.start-build-input/buildspec-override :portkey.aws.codebuild.-2016-10-06.start-build-input/idempotency-token :portkey.aws.codebuild.-2016-10-06.start-build-input/privileged-mode-override :portkey.aws.codebuild.-2016-10-06.start-build-input/environment-variables-override :portkey.aws.codebuild.-2016-10-06.start-build-input/cache-override :portkey.aws.codebuild.-2016-10-06.start-build-input/image-override :portkey.aws.codebuild.-2016-10-06.start-build-input/environment-type-override :portkey.aws.codebuild.-2016-10-06.start-build-input/service-role-override :portkey.aws.codebuild.-2016-10-06.start-build-input/source-location-override :portkey.aws.codebuild.-2016-10-06.start-build-input/source-type-override :portkey.aws.codebuild.-2016-10-06.start-build-input/insecure-ssl-override :portkey.aws.codebuild.-2016-10-06.start-build-input/secondary-sources-version-override]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/service-role (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/source-version (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/build-complete (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/secondary-source-versions (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-secondary-source-versions))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/arn (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/network-interface (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/network-interface))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/resolved-source-version (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/cache (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/start-time (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/logs (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-location))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/initiator (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/source (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/environment (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/current-phase (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-int))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/end-time (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/build-status (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build/phases (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-phases))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.build/vpc-config :portkey.aws.codebuild.-2016-10-06.build/service-role :portkey.aws.codebuild.-2016-10-06.build/source-version :portkey.aws.codebuild.-2016-10-06.build/build-complete :portkey.aws.codebuild.-2016-10-06.build/secondary-source-versions :portkey.aws.codebuild.-2016-10-06.build/artifacts :portkey.aws.codebuild.-2016-10-06.build/arn :portkey.aws.codebuild.-2016-10-06.build/network-interface :portkey.aws.codebuild.-2016-10-06.build/secondary-sources :portkey.aws.codebuild.-2016-10-06.build/id :portkey.aws.codebuild.-2016-10-06.build/resolved-source-version :portkey.aws.codebuild.-2016-10-06.build/cache :portkey.aws.codebuild.-2016-10-06.build/start-time :portkey.aws.codebuild.-2016-10-06.build/logs :portkey.aws.codebuild.-2016-10-06.build/initiator :portkey.aws.codebuild.-2016-10-06.build/encryption-key :portkey.aws.codebuild.-2016-10-06.build/source :portkey.aws.codebuild.-2016-10-06.build/environment :portkey.aws.codebuild.-2016-10-06.build/secondary-artifacts :portkey.aws.codebuild.-2016-10-06.build/current-phase :portkey.aws.codebuild.-2016-10-06.build/timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.build/end-time :portkey.aws.codebuild.-2016-10-06.build/project-name :portkey.aws.codebuild.-2016-10-06.build/build-status :portkey.aws.codebuild.-2016-10-06.build/phases]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.source-auth/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/source-auth-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.source-auth/resource (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/source-auth (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.source-auth/type] :opt-un [:portkey.aws.codebuild.-2016-10-06.source-auth/resource]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/service-role (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/last-modified (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/created (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/arn (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/tags (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/tag-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/cache (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/source (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/environment (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/webhook (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/webhook))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/logs-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/description (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-description))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project/badge (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-badge))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.project/vpc-config :portkey.aws.codebuild.-2016-10-06.project/service-role :portkey.aws.codebuild.-2016-10-06.project/last-modified :portkey.aws.codebuild.-2016-10-06.project/created :portkey.aws.codebuild.-2016-10-06.project/artifacts :portkey.aws.codebuild.-2016-10-06.project/arn :portkey.aws.codebuild.-2016-10-06.project/secondary-sources :portkey.aws.codebuild.-2016-10-06.project/tags :portkey.aws.codebuild.-2016-10-06.project/cache :portkey.aws.codebuild.-2016-10-06.project/name :portkey.aws.codebuild.-2016-10-06.project/encryption-key :portkey.aws.codebuild.-2016-10-06.project/source :portkey.aws.codebuild.-2016-10-06.project/environment :portkey.aws.codebuild.-2016-10-06.project/secondary-artifacts :portkey.aws.codebuild.-2016-10-06.project/timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.project/webhook :portkey.aws.codebuild.-2016-10-06.project/logs-config :portkey.aws.codebuild.-2016-10-06.project/description :portkey.aws.codebuild.-2016-10-06.project/badge]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/delete-project-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.network-interface/subnet-id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.network-interface/network-interface-id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/network-interface (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.network-interface/subnet-id :portkey.aws.codebuild.-2016-10-06.network-interface/network-interface-id]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-cache/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/cache-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-cache/location (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-cache (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.project-cache/type] :opt-un [:portkey.aws.codebuild.-2016-10-06.project-cache/location]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.stop-build-input/id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/stop-build-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.stop-build-input/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-sort-by-type #{"CREATED_TIME" "NAME" :name :created-time :last-modified-time "LAST_MODIFIED_TIME"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.delete-webhook-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/delete-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.delete-webhook-input/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/cache-type #{:s-3 "NO_CACHE" :no-cache "S3"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/wrapper-int clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-variable-type #{:parameter-store :plaintext "PARAMETER_STORE" "PLAINTEXT"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.phase-context/status-code (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.phase-context/message (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/phase-context (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.phase-context/status-code :portkey.aws.codebuild.-2016-10-06.phase-context/message]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-webhook-output/webhook (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/webhook))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/create-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.create-webhook-output/webhook]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.vpc-config/vpc-id (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.vpc-config/subnets (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/subnets))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.vpc-config/security-group-ids (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/security-group-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/vpc-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.vpc-config/vpc-id :portkey.aws.codebuild.-2016-10-06.vpc-config/subnets :portkey.aws.codebuild.-2016-10-06.vpc-config/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-output/ids (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-output/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-builds-for-project-output/ids :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/vpc-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/vpc-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/service-role (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/badge-enabled (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/secondary-sources (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-sources))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/tags (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/tag-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/cache (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-cache))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/encryption-key (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/source (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-source))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/environment (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-environment))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/secondary-artifacts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-artifacts-list))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/time-out))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/logs-config (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.create-project-input/description (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-description))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/create-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.create-project-input/name :portkey.aws.codebuild.-2016-10-06.create-project-input/source :portkey.aws.codebuild.-2016-10-06.create-project-input/artifacts :portkey.aws.codebuild.-2016-10-06.create-project-input/environment :portkey.aws.codebuild.-2016-10-06.create-project-input/service-role] :opt-un [:portkey.aws.codebuild.-2016-10-06.create-project-input/vpc-config :portkey.aws.codebuild.-2016-10-06.create-project-input/badge-enabled :portkey.aws.codebuild.-2016-10-06.create-project-input/secondary-sources :portkey.aws.codebuild.-2016-10-06.create-project-input/tags :portkey.aws.codebuild.-2016-10-06.create-project-input/cache :portkey.aws.codebuild.-2016-10-06.create-project-input/encryption-key :portkey.aws.codebuild.-2016-10-06.create-project-input/secondary-artifacts :portkey.aws.codebuild.-2016-10-06.create-project-input/timeout-in-minutes :portkey.aws.codebuild.-2016-10-06.create-project-input/logs-config :portkey.aws.codebuild.-2016-10-06.create-project-input/description]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source-version/source-identifier (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-source-version/source-version (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-source-version (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.project-source-version/source-identifier :portkey.aws.codebuild.-2016-10-06.project-source-version/source-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-webhook-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project-name))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-webhook-input/branch-filter (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-webhook-input/rotate-secret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/update-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.update-webhook-input/project-name] :opt-un [:portkey.aws.codebuild.-2016-10-06.update-webhook-input/branch-filter :portkey.aws.codebuild.-2016-10-06.update-webhook-input/rotate-secret]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/source-auth-type #{"OAUTH" :oauth})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/wrapper-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-phase-type #{:finalizing "COMPLETED" :install "POST_BUILD" :post-build :pre-build :upload-artifacts :completed "PROVISIONING" :download-source :submitted "SUBMITTED" "UPLOAD_ARTIFACTS" :build "BUILD" :provisioning "DOWNLOAD_SOURCE" "INSTALL" "FINALIZING" "PRE_BUILD"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/location (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/sha-256sum (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/md-5sum (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/override-artifact-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/encryption-disabled (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-artifacts/artifact-identifier (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-artifacts (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.build-artifacts/location :portkey.aws.codebuild.-2016-10-06.build-artifacts/sha-256sum :portkey.aws.codebuild.-2016-10-06.build-artifacts/md-5sum :portkey.aws.codebuild.-2016-10-06.build-artifacts/override-artifact-name :portkey.aws.codebuild.-2016-10-06.build-artifacts/encryption-disabled :portkey.aws.codebuild.-2016-10-06.build-artifacts/artifact-identifier]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.tag/key (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/key-input))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.tag/value (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/value-input))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.tag/key :portkey.aws.codebuild.-2016-10-06.tag/value]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/builds (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/build))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/compute-type #{"BUILD_GENERAL1_LARGE" "BUILD_GENERAL1_SMALL" :build-general-1-small "BUILD_GENERAL1_MEDIUM" :build-general-1-medium :build-general-1-large})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/projects (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/project))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.update-project-output/project (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/project))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/update-project-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.update-project-output/project]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-input/sort-order (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/sort-order-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-input/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-builds-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-builds-input/sort-order :portkey.aws.codebuild.-2016-10-06.list-builds-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 2 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[A-Za-z0-9][A-Za-z0-9\-_]{1,254}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/git-clone-depth (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-ids (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/non-empty-string :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/phase-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-phase-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/phase-status (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/status-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/start-time (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/end-time (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/duration-in-seconds (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-long))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.build-phase/contexts (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/phase-contexts))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/build-phase (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.build-phase/phase-type :portkey.aws.codebuild.-2016-10-06.build-phase/phase-status :portkey.aws.codebuild.-2016-10-06.build-phase/start-time :portkey.aws.codebuild.-2016-10-06.build-phase/end-time :portkey.aws.codebuild.-2016-10-06.build-phase/duration-in-seconds :portkey.aws.codebuild.-2016-10-06.build-phase/contexts]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.batch-get-builds-input/ids (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build-ids))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/batch-get-builds-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.batch-get-builds-input/ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/project-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/sort-order (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/sort-order-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/next-token (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/project-name] :opt-un [:portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/sort-order :portkey.aws.codebuild.-2016-10-06.list-builds-for-project-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-artifacts-list (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/project-artifacts :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/builds-not-deleted (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/build-not-deleted))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-secondary-source-versions (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/project-source-version :min-count 0 :max-count 12))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/phase-contexts (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/phase-context))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-config/cloud-watch-logs (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/cloud-watch-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.logs-config/s-3-logs (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/s-3-logs-config))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/logs-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.logs-config/cloud-watch-logs :portkey.aws.codebuild.-2016-10-06.logs-config/s-3-logs]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-platform/platform (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/platform-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.environment-platform/languages (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/environment-languages))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-platform (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.environment-platform/platform :portkey.aws.codebuild.-2016-10-06.environment-platform/languages]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/artifacts-type #{:s-3 "CODEPIPELINE" :codepipeline :no-artifacts "NO_ARTIFACTS" "S3"})

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.stop-build-output/build (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/build))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/stop-build-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.stop-build-output/build]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/environment-platforms (clojure.spec.alpha/coll-of :portkey.aws.codebuild.-2016-10-06/environment-platform))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/override-artifact-name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/path (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/encryption-disabled (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/wrapper-boolean))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/packaging (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/artifact-packaging))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/name (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/location (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/namespace-type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/artifact-namespace))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/artifact-identifier (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.project-artifacts/type (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/artifacts-type))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/project-artifacts (clojure.spec.alpha/keys :req-un [:portkey.aws.codebuild.-2016-10-06.project-artifacts/type] :opt-un [:portkey.aws.codebuild.-2016-10-06.project-artifacts/override-artifact-name :portkey.aws.codebuild.-2016-10-06.project-artifacts/path :portkey.aws.codebuild.-2016-10-06.project-artifacts/encryption-disabled :portkey.aws.codebuild.-2016-10-06.project-artifacts/packaging :portkey.aws.codebuild.-2016-10-06.project-artifacts/name :portkey.aws.codebuild.-2016-10-06.project-artifacts/location :portkey.aws.codebuild.-2016-10-06.project-artifacts/namespace-type :portkey.aws.codebuild.-2016-10-06.project-artifacts/artifact-identifier]))

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/url (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/payload-url (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/secret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/branch-filter (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/string))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06.webhook/last-modified-secret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/timestamp))
(clojure.spec.alpha/def :portkey.aws.codebuild.-2016-10-06/webhook (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codebuild.-2016-10-06.webhook/url :portkey.aws.codebuild.-2016-10-06.webhook/payload-url :portkey.aws.codebuild.-2016-10-06.webhook/secret :portkey.aws.codebuild.-2016-10-06.webhook/branch-filter :portkey.aws.codebuild.-2016-10-06.webhook/last-modified-secret]))

(clojure.core/defn start-build ([start-build-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-build-input start-build-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/start-build-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/start-build-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartBuild", :http.request.configuration/output-deser-fn deser-start-build-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception, "AccountLimitExceededException" :portkey.aws.codebuild.-2016-10-06/account-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-build :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/start-build-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/start-build-output))

(clojure.core/defn list-curated-environment-images ([] (list-curated-environment-images {})) ([list-curated-environment-images-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-curated-environment-images-input list-curated-environment-images-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCuratedEnvironmentImages", :http.request.configuration/output-deser-fn deser-list-curated-environment-images-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-curated-environment-images :args (clojure.spec.alpha/? :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/list-curated-environment-images-output))

(clojure.core/defn invalidate-project-cache ([invalidate-project-cache-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-invalidate-project-cache-input invalidate-project-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "InvalidateProjectCache", :http.request.configuration/output-deser-fn deser-invalidate-project-cache-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef invalidate-project-cache :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/invalidate-project-cache-output))

(clojure.core/defn list-builds ([] (list-builds {})) ([list-builds-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-builds-input list-builds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/list-builds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/list-builds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBuilds", :http.request.configuration/output-deser-fn deser-list-builds-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-builds :args (clojure.spec.alpha/? :portkey.aws.codebuild.-2016-10-06/list-builds-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/list-builds-output))

(clojure.core/defn batch-delete-builds ([batch-delete-builds-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-delete-builds-input batch-delete-builds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDeleteBuilds", :http.request.configuration/output-deser-fn deser-batch-delete-builds-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-delete-builds :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/batch-delete-builds-output))

(clojure.core/defn create-webhook ([create-webhook-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-webhook-input create-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/create-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/create-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateWebhook", :http.request.configuration/output-deser-fn deser-create-webhook-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "OAuthProviderException" :portkey.aws.codebuild.-2016-10-06/o-auth-provider-exception, "ResourceAlreadyExistsException" :portkey.aws.codebuild.-2016-10-06/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/create-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/create-webhook-output))

(clojure.core/defn list-projects ([] (list-projects {})) ([list-projects-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-projects-input list-projects-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/list-projects-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/list-projects-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProjects", :http.request.configuration/output-deser-fn deser-list-projects-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.codebuild.-2016-10-06/list-projects-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/list-projects-output))

(clojure.core/defn delete-webhook ([delete-webhook-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-webhook-input delete-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/delete-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/delete-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteWebhook", :http.request.configuration/output-deser-fn deser-delete-webhook-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception, "OAuthProviderException" :portkey.aws.codebuild.-2016-10-06/o-auth-provider-exception}})))))
(clojure.spec.alpha/fdef delete-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/delete-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/delete-webhook-output))

(clojure.core/defn batch-get-projects ([batch-get-projects-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-get-projects-input batch-get-projects-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/batch-get-projects-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/batch-get-projects-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetProjects", :http.request.configuration/output-deser-fn deser-batch-get-projects-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-get-projects :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/batch-get-projects-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/batch-get-projects-output))

(clojure.core/defn update-project ([update-project-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-project-input update-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/update-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/update-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProject", :http.request.configuration/output-deser-fn deser-update-project-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/update-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/update-project-output))

(clojure.core/defn batch-get-builds ([batch-get-builds-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-batch-get-builds-input batch-get-builds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/batch-get-builds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/batch-get-builds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetBuilds", :http.request.configuration/output-deser-fn deser-batch-get-builds-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef batch-get-builds :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/batch-get-builds-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/batch-get-builds-output))

(clojure.core/defn update-webhook ([update-webhook-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-webhook-input update-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/update-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/update-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateWebhook", :http.request.configuration/output-deser-fn deser-update-webhook-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception, "OAuthProviderException" :portkey.aws.codebuild.-2016-10-06/o-auth-provider-exception}})))))
(clojure.spec.alpha/fdef update-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/update-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/update-webhook-output))

(clojure.core/defn stop-build ([stop-build-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-build-input stop-build-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/stop-build-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/stop-build-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopBuild", :http.request.configuration/output-deser-fn deser-stop-build-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-build :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/stop-build-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/stop-build-output))

(clojure.core/defn delete-project ([delete-project-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-project-input delete-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/delete-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/delete-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProject", :http.request.configuration/output-deser-fn deser-delete-project-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/delete-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/delete-project-output))

(clojure.core/defn list-builds-for-project ([list-builds-for-project-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-builds-for-project-input list-builds-for-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBuildsForProject", :http.request.configuration/output-deser-fn deser-list-builds-for-project-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.codebuild.-2016-10-06/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-builds-for-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/list-builds-for-project-output))

(clojure.core/defn create-project ([create-project-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-project-input create-project-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codebuild.-2016-10-06/endpoints, :http.request.configuration/target-prefix "CodeBuild_20161006", :http.request.spec/output-spec :portkey.aws.codebuild.-2016-10-06/create-project-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-06", :http.request.configuration/service-id "CodeBuild", :http.request.spec/input-spec :portkey.aws.codebuild.-2016-10-06/create-project-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProject", :http.request.configuration/output-deser-fn deser-create-project-output, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.codebuild.-2016-10-06/invalid-input-exception, "ResourceAlreadyExistsException" :portkey.aws.codebuild.-2016-10-06/resource-already-exists-exception, "AccountLimitExceededException" :portkey.aws.codebuild.-2016-10-06/account-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/tuple :portkey.aws.codebuild.-2016-10-06/create-project-input) :ret (clojure.spec.alpha/and :portkey.aws.codebuild.-2016-10-06/create-project-output))