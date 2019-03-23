(ns portkey.aws.gamelift (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "gamelift", :region "ap-northeast-1"},
    :ssl-common-name "gamelift.ap-northeast-1.amazonaws.com",
    :endpoint "https://gamelift.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "gamelift", :region "eu-west-1"},
    :ssl-common-name "gamelift.eu-west-1.amazonaws.com",
    :endpoint "https://gamelift.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "gamelift", :region "us-east-2"},
    :ssl-common-name "gamelift.us-east-2.amazonaws.com",
    :endpoint "https://gamelift.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "gamelift", :region "ap-southeast-2"},
    :ssl-common-name "gamelift.ap-southeast-2.amazonaws.com",
    :endpoint "https://gamelift.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "gamelift", :region "sa-east-1"},
    :ssl-common-name "gamelift.sa-east-1.amazonaws.com",
    :endpoint "https://gamelift.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "gamelift", :region "ap-southeast-1"},
    :ssl-common-name "gamelift.ap-southeast-1.amazonaws.com",
    :endpoint "https://gamelift.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "gamelift", :region "ap-northeast-2"},
    :ssl-common-name "gamelift.ap-northeast-2.amazonaws.com",
    :endpoint "https://gamelift.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "gamelift", :region "ca-central-1"},
    :ssl-common-name "gamelift.ca-central-1.amazonaws.com",
    :endpoint "https://gamelift.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "gamelift", :region "eu-central-1"},
    :ssl-common-name "gamelift.eu-central-1.amazonaws.com",
    :endpoint "https://gamelift.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "gamelift", :region "eu-west-2"},
    :ssl-common-name "gamelift.eu-west-2.amazonaws.com",
    :endpoint "https://gamelift.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "gamelift", :region "us-west-2"},
    :ssl-common-name "gamelift.us-west-2.amazonaws.com",
    :endpoint "https://gamelift.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "gamelift", :region "us-east-1"},
    :ssl-common-name "gamelift.us-east-1.amazonaws.com",
    :endpoint "https://gamelift.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "gamelift", :region "us-west-1"},
    :ssl-common-name "gamelift.us-west-1.amazonaws.com",
    :endpoint "https://gamelift.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "gamelift", :region "ap-south-1"},
    :ssl-common-name "gamelift.ap-south-1.amazonaws.com",
    :endpoint "https://gamelift.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-metric-group)

(clojure.core/declare ser-non-blank-and-length-constraint-string)

(clojure.core/declare ser-non-zero-and-max-string)

(clojure.core/declare ser-queue-arns-list)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-rule-set-body)

(clojure.core/declare ser-double)

(clojure.core/declare ser-game-property-key)

(clojure.core/declare ser-ec-2-instance-type)

(clojure.core/declare ser-instance-id)

(clojure.core/declare ser-game-property)

(clojure.core/declare ser-game-property-value)

(clojure.core/declare ser-double-object)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-player-attribute-map)

(clojure.core/declare ser-sns-arn-string-model)

(clojure.core/declare ser-ip-protocol)

(clojure.core/declare ser-custom-event-data)

(clojure.core/declare ser-id-string-model)

(clojure.core/declare ser-game-session-queue-destination-list)

(clojure.core/declare ser-matchmaking-request-timeout-integer)

(clojure.core/declare ser-game-session-queue-destination)

(clojure.core/declare ser-matchmaking-acceptance-timeout-integer)

(clojure.core/declare ser-runtime-configuration)

(clojure.core/declare ser-player-data)

(clojure.core/declare ser-fleet-id)

(clojure.core/declare ser-player-latency-policy-list)

(clojure.core/declare ser-boolean-model)

(clojure.core/declare ser-ip-permissions-list)

(clojure.core/declare ser-fleet-action-list)

(clojure.core/declare ser-whole-number)

(clojure.core/declare ser-routing-strategy)

(clojure.core/declare ser-player-data-map)

(clojure.core/declare ser-desired-player-session)

(clojure.core/declare ser-fleet-type)

(clojure.core/declare ser-player)

(clojure.core/declare ser-player-latency)

(clojure.core/declare ser-player-session-creation-policy)

(clojure.core/declare ser-alias-id)

(clojure.core/declare ser-game-session-queue-name-list)

(clojure.core/declare ser-string-double-map)

(clojure.core/declare ser-protection-policy)

(clojure.core/declare ser-player-latency-policy)

(clojure.core/declare ser-fleet-id-list)

(clojure.core/declare ser-build-status)

(clojure.core/declare ser-game-session-data)

(clojure.core/declare ser-target-configuration)

(clojure.core/declare ser-player-latency-list)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-player-id-list)

(clojure.core/declare ser-matchmaking-id-list)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-ip-permission)

(clojure.core/declare ser-rule-set-limit)

(clojure.core/declare ser-positive-integer)

(clojure.core/declare ser-s-3-location)

(clojure.core/declare ser-comparison-operator-type)

(clojure.core/declare ser-game-property-list)

(clojure.core/declare ser-matchmaking-id-string-model)

(clojure.core/declare ser-routing-strategy-type)

(clojure.core/declare ser-metric-group-list)

(clojure.core/declare ser-player-list)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-player-session-id)

(clojure.core/declare ser-latency-map)

(clojure.core/declare ser-matchmaking-rule-set-name-list)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-max-concurrent-game-session-activations)

(clojure.core/declare ser-free-text)

(clojure.core/declare ser-arn-string-model)

(clojure.core/declare ser-fleet-action)

(clojure.core/declare ser-game-session-activation-timeout-seconds)

(clojure.core/declare ser-scaling-adjustment-type)

(clojure.core/declare ser-non-blank-string)

(clojure.core/declare ser-port-number)

(clojure.core/declare ser-policy-type)

(clojure.core/declare ser-game-session-queue-name)

(clojure.core/declare ser-float)

(clojure.core/declare ser-server-process-list)

(clojure.core/declare ser-server-process)

(clojure.core/declare ser-resource-creation-limit-policy)

(clojure.core/declare ser-desired-player-session-list)

(clojure.core/declare ser-build-id)

(clojure.core/declare ser-operating-system)

(clojure.core/declare ser-scaling-status-type)

(clojure.core/declare ser-acceptance-type)

(clojure.core/defn- ser-metric-group [input] #:http.request.field{:value input, :shape "MetricGroup"})

(clojure.core/defn- ser-non-blank-and-length-constraint-string [input] #:http.request.field{:value input, :shape "NonBlankAndLengthConstraintString"})

(clojure.core/defn- ser-non-zero-and-max-string [input] #:http.request.field{:value input, :shape "NonZeroAndMaxString"})

(clojure.core/defn- ser-queue-arns-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn-string-model coll) #:http.request.field{:shape "ArnStringModel"}))) input), :shape "QueueArnsList", :type "list"})

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-zero-and-max-string coll) #:http.request.field{:shape "NonZeroAndMaxString"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-rule-set-body [input] #:http.request.field{:value input, :shape "RuleSetBody"})

(clojure.core/defn- ser-double [input] #:http.request.field{:value input, :shape "Double"})

(clojure.core/defn- ser-game-property-key [input] #:http.request.field{:value input, :shape "GamePropertyKey"})

(clojure.core/defn- ser-ec-2-instance-type [input] #:http.request.field{:value (clojure.core/get {:r-3large "r3.large", :c-4xlarge "c4.xlarge", :c-3xlarge "c3.xlarge", :r-48xlarge "r4.8xlarge", :t-2small "t2.small", "r4.2xlarge" "r4.2xlarge", :c-48xlarge "c4.8xlarge", "r3.8xlarge" "r3.8xlarge", "m3.2xlarge" "m3.2xlarge", "c3.8xlarge" "c3.8xlarge", "t2.large" "t2.large", :m-42xlarge "m4.2xlarge", "m4.4xlarge" "m4.4xlarge", "r4.16xlarge" "r4.16xlarge", :t-2large "t2.large", :c-34xlarge "c3.4xlarge", :r-34xlarge "r3.4xlarge", :m-32xlarge "m3.2xlarge", "c3.2xlarge" "c3.2xlarge", "c4.8xlarge" "c4.8xlarge", :r-4large "r4.large", :c-3large "c3.large", "c3.4xlarge" "c3.4xlarge", :t-2micro "t2.micro", :c-38xlarge "c3.8xlarge", "t2.micro" "t2.micro", :r-416xlarge "r4.16xlarge", :r-38xlarge "r3.8xlarge", "m4.2xlarge" "m4.2xlarge", :r-32xlarge "r3.2xlarge", "m4.10xlarge" "m4.10xlarge", "c4.4xlarge" "c4.4xlarge", "r3.xlarge" "r3.xlarge", :c-44xlarge "c4.4xlarge", :t-2medium "t2.medium", :r-3xlarge "r3.xlarge", "c4.2xlarge" "c4.2xlarge", :r-42xlarge "r4.2xlarge", "t2.small" "t2.small", "r4.xlarge" "r4.xlarge", :m-3large "m3.large", "m3.xlarge" "m3.xlarge", "r3.2xlarge" "r3.2xlarge", :c-32xlarge "c3.2xlarge", :c-42xlarge "c4.2xlarge", "r3.4xlarge" "r3.4xlarge", :r-44xlarge "r4.4xlarge", :m-44xlarge "m4.4xlarge", "c4.xlarge" "c4.xlarge", "m4.large" "m4.large", :m-410xlarge "m4.10xlarge", "r3.large" "r3.large", "c4.large" "c4.large", :m-3medium "m3.medium", "m4.xlarge" "m4.xlarge", :c-4large "c4.large", :r-4xlarge "r4.xlarge", :m-4xlarge "m4.xlarge", :m-3xlarge "m3.xlarge", "r4.large" "r4.large", "c3.xlarge" "c3.xlarge", :m-4large "m4.large", "r4.8xlarge" "r4.8xlarge", "t2.medium" "t2.medium", "c3.large" "c3.large", "m3.medium" "m3.medium", "m3.large" "m3.large", "r4.4xlarge" "r4.4xlarge"} input), :shape "EC2InstanceType"})

(clojure.core/defn- ser-instance-id [input] #:http.request.field{:value input, :shape "InstanceId"})

(clojure.core/defn- ser-game-property [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-game-property-key (:key input)) #:http.request.field{:name "Key", :shape "GamePropertyKey"}) (clojure.core/into (ser-game-property-value (:value input)) #:http.request.field{:name "Value", :shape "GamePropertyValue"})], :shape "GameProperty", :type "structure"}))

(clojure.core/defn- ser-game-property-value [input] #:http.request.field{:value input, :shape "GamePropertyValue"})

(clojure.core/defn- ser-double-object [input] #:http.request.field{:value input, :shape "DoubleObject"})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-player-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-non-zero-and-max-string k) #:http.request.field{:map-info "key", :shape "NonZeroAndMaxString"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "PlayerAttributeMap", :type "map"})

(clojure.core/defn- ser-sns-arn-string-model [input] #:http.request.field{:value input, :shape "SnsArnStringModel"})

(clojure.core/defn- ser-ip-protocol [input] #:http.request.field{:value (clojure.core/get {"TCP" "TCP", :tcp "TCP", "UDP" "UDP", :udp "UDP"} input), :shape "IpProtocol"})

(clojure.core/defn- ser-custom-event-data [input] #:http.request.field{:value input, :shape "CustomEventData"})

(clojure.core/defn- ser-id-string-model [input] #:http.request.field{:value input, :shape "IdStringModel"})

(clojure.core/defn- ser-game-session-queue-destination-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-game-session-queue-destination coll) #:http.request.field{:shape "GameSessionQueueDestination"}))) input), :shape "GameSessionQueueDestinationList", :type "list"})

(clojure.core/defn- ser-matchmaking-request-timeout-integer [input] #:http.request.field{:value input, :shape "MatchmakingRequestTimeoutInteger"})

(clojure.core/defn- ser-game-session-queue-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GameSessionQueueDestination", :type "structure"} (clojure.core/contains? input :destination-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-string-model (input :destination-arn)) #:http.request.field{:name "DestinationArn", :shape "ArnStringModel"}))))

(clojure.core/defn- ser-matchmaking-acceptance-timeout-integer [input] #:http.request.field{:value input, :shape "MatchmakingAcceptanceTimeoutInteger"})

(clojure.core/defn- ser-runtime-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RuntimeConfiguration", :type "structure"} (clojure.core/contains? input :server-processes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-process-list (input :server-processes)) #:http.request.field{:name "ServerProcesses", :shape "ServerProcessList"})) (clojure.core/contains? input :max-concurrent-game-session-activations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrent-game-session-activations (input :max-concurrent-game-session-activations)) #:http.request.field{:name "MaxConcurrentGameSessionActivations", :shape "MaxConcurrentGameSessionActivations"})) (clojure.core/contains? input :game-session-activation-timeout-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-session-activation-timeout-seconds (input :game-session-activation-timeout-seconds)) #:http.request.field{:name "GameSessionActivationTimeoutSeconds", :shape "GameSessionActivationTimeoutSeconds"}))))

(clojure.core/defn- ser-player-data [input] #:http.request.field{:value input, :shape "PlayerData"})

(clojure.core/defn- ser-fleet-id [input] #:http.request.field{:value input, :shape "FleetId"})

(clojure.core/defn- ser-player-latency-policy-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-player-latency-policy coll) #:http.request.field{:shape "PlayerLatencyPolicy"}))) input), :shape "PlayerLatencyPolicyList", :type "list"})

(clojure.core/defn- ser-boolean-model [input] #:http.request.field{:value input, :shape "BooleanModel"})

(clojure.core/defn- ser-ip-permissions-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-permission coll) #:http.request.field{:shape "IpPermission"}))) input), :shape "IpPermissionsList", :type "list", :max 50})

(clojure.core/defn- ser-fleet-action-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-fleet-action coll) #:http.request.field{:shape "FleetAction"}))) input), :shape "FleetActionList", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-whole-number [input] #:http.request.field{:value input, :shape "WholeNumber"})

(clojure.core/defn- ser-routing-strategy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RoutingStrategy", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-routing-strategy-type (input :type)) #:http.request.field{:name "Type", :shape "RoutingStrategyType"})) (clojure.core/contains? input :fleet-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})) (clojure.core/contains? input :message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-free-text (input :message)) #:http.request.field{:name "Message", :shape "FreeText"}))))

(clojure.core/defn- ser-player-data-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-non-zero-and-max-string k) #:http.request.field{:map-info "key", :shape "NonZeroAndMaxString"}) (clojure.core/into (ser-player-data v) #:http.request.field{:map-info "value", :shape "PlayerData"})])) input), :shape "PlayerDataMap", :type "map"})

(clojure.core/defn- ser-desired-player-session [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DesiredPlayerSession", :type "structure"} (clojure.core/contains? input :player-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :player-id)) #:http.request.field{:name "PlayerId", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :player-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-player-data (input :player-data)) #:http.request.field{:name "PlayerData", :shape "PlayerData"}))))

(clojure.core/defn- ser-fleet-type [input] #:http.request.field{:value (clojure.core/get {"ON_DEMAND" "ON_DEMAND", :on-demand "ON_DEMAND", "SPOT" "SPOT", :spot "SPOT"} input), :shape "FleetType"})

(clojure.core/defn- ser-player [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Player", :type "structure"} (clojure.core/contains? input :player-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :player-id)) #:http.request.field{:name "PlayerId", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :player-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-player-attribute-map (input :player-attributes)) #:http.request.field{:name "PlayerAttributes", :shape "PlayerAttributeMap"})) (clojure.core/contains? input :team) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :team)) #:http.request.field{:name "Team", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :latency-in-ms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-latency-map (input :latency-in-ms)) #:http.request.field{:name "LatencyInMs", :shape "LatencyMap"}))))

(clojure.core/defn- ser-player-latency [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PlayerLatency", :type "structure"} (clojure.core/contains? input :player-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :player-id)) #:http.request.field{:name "PlayerId", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :region-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :region-identifier)) #:http.request.field{:name "RegionIdentifier", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :latency-in-milliseconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-float (input :latency-in-milliseconds)) #:http.request.field{:name "LatencyInMilliseconds", :shape "Float"}))))

(clojure.core/defn- ser-player-session-creation-policy [input] #:http.request.field{:value (clojure.core/get {"ACCEPT_ALL" "ACCEPT_ALL", :accept-all "ACCEPT_ALL", "DENY_ALL" "DENY_ALL", :deny-all "DENY_ALL"} input), :shape "PlayerSessionCreationPolicy"})

(clojure.core/defn- ser-alias-id [input] #:http.request.field{:value input, :shape "AliasId"})

(clojure.core/defn- ser-game-session-queue-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-game-session-queue-name coll) #:http.request.field{:shape "GameSessionQueueName"}))) input), :shape "GameSessionQueueNameList", :type "list"})

(clojure.core/defn- ser-string-double-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-non-zero-and-max-string k) #:http.request.field{:map-info "key", :shape "NonZeroAndMaxString"}) (clojure.core/into (ser-double-object v) #:http.request.field{:map-info "value", :shape "DoubleObject"})])) input), :shape "StringDoubleMap", :type "map"})

(clojure.core/defn- ser-protection-policy [input] #:http.request.field{:value (clojure.core/get {"NoProtection" "NoProtection", :no-protection "NoProtection", "FullProtection" "FullProtection", :full-protection "FullProtection"} input), :shape "ProtectionPolicy"})

(clojure.core/defn- ser-player-latency-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PlayerLatencyPolicy", :type "structure"} (clojure.core/contains? input :maximum-individual-player-latency-milliseconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :maximum-individual-player-latency-milliseconds)) #:http.request.field{:name "MaximumIndividualPlayerLatencyMilliseconds", :shape "WholeNumber"})) (clojure.core/contains? input :policy-duration-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :policy-duration-seconds)) #:http.request.field{:name "PolicyDurationSeconds", :shape "WholeNumber"}))))

(clojure.core/defn- ser-fleet-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-fleet-id coll) #:http.request.field{:shape "FleetId"}))) input), :shape "FleetIdList", :type "list", :min 1})

(clojure.core/defn- ser-build-status [input] #:http.request.field{:value (clojure.core/get {"INITIALIZED" "INITIALIZED", :initialized "INITIALIZED", "READY" "READY", :ready "READY", "FAILED" "FAILED", :failed "FAILED"} input), :shape "BuildStatus"})

(clojure.core/defn- ser-game-session-data [input] #:http.request.field{:value input, :shape "GameSessionData"})

(clojure.core/defn- ser-target-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-double (:target-value input)) #:http.request.field{:name "TargetValue", :shape "Double"})], :shape "TargetConfiguration", :type "structure"}))

(clojure.core/defn- ser-player-latency-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-player-latency coll) #:http.request.field{:shape "PlayerLatency"}))) input), :shape "PlayerLatencyList", :type "list"})

(clojure.core/defn- ser-attribute-value [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AttributeValue", :type "structure"} (clojure.core/contains? input :s) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :s)) #:http.request.field{:name "S", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :n) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-object (input :n)) #:http.request.field{:name "N", :shape "DoubleObject"})) (clojure.core/contains? input :sl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :sl)) #:http.request.field{:name "SL", :shape "StringList"})) (clojure.core/contains? input :sdm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-double-map (input :sdm)) #:http.request.field{:name "SDM", :shape "StringDoubleMap"}))))

(clojure.core/defn- ser-player-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-zero-and-max-string coll) #:http.request.field{:shape "NonZeroAndMaxString"}))) input), :shape "PlayerIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-matchmaking-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-matchmaking-id-string-model coll) #:http.request.field{:shape "MatchmakingIdStringModel"}))) input), :shape "MatchmakingIdList", :type "list"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-ip-permission [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-port-number (:from-port input)) #:http.request.field{:name "FromPort", :shape "PortNumber"}) (clojure.core/into (ser-port-number (:to-port input)) #:http.request.field{:name "ToPort", :shape "PortNumber"}) (clojure.core/into (ser-non-blank-string (:ip-range input)) #:http.request.field{:name "IpRange", :shape "NonBlankString"}) (clojure.core/into (ser-ip-protocol (:protocol input)) #:http.request.field{:name "Protocol", :shape "IpProtocol"})], :shape "IpPermission", :type "structure"}))

(clojure.core/defn- ser-rule-set-limit [input] #:http.request.field{:value input, :shape "RuleSetLimit"})

(clojure.core/defn- ser-positive-integer [input] #:http.request.field{:value input, :shape "PositiveInteger"})

(clojure.core/defn- ser-s-3-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Location", :type "structure"} (clojure.core/contains? input :bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :bucket)) #:http.request.field{:name "Bucket", :shape "NonEmptyString"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :key)) #:http.request.field{:name "Key", :shape "NonEmptyString"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-comparison-operator-type [input] #:http.request.field{:value (clojure.core/get {"GreaterThanOrEqualToThreshold" "GreaterThanOrEqualToThreshold", :greater-than-or-equal-to-threshold "GreaterThanOrEqualToThreshold", "GreaterThanThreshold" "GreaterThanThreshold", :greater-than-threshold "GreaterThanThreshold", "LessThanThreshold" "LessThanThreshold", :less-than-threshold "LessThanThreshold", "LessThanOrEqualToThreshold" "LessThanOrEqualToThreshold", :less-than-or-equal-to-threshold "LessThanOrEqualToThreshold"} input), :shape "ComparisonOperatorType"})

(clojure.core/defn- ser-game-property-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-game-property coll) #:http.request.field{:shape "GameProperty"}))) input), :shape "GamePropertyList", :type "list", :max 16})

(clojure.core/defn- ser-matchmaking-id-string-model [input] #:http.request.field{:value input, :shape "MatchmakingIdStringModel"})

(clojure.core/defn- ser-routing-strategy-type [input] #:http.request.field{:value (clojure.core/get {"SIMPLE" "SIMPLE", :simple "SIMPLE", "TERMINAL" "TERMINAL", :terminal "TERMINAL"} input), :shape "RoutingStrategyType"})

(clojure.core/defn- ser-metric-group-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-group coll) #:http.request.field{:shape "MetricGroup"}))) input), :shape "MetricGroupList", :type "list", :max 1})

(clojure.core/defn- ser-player-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-player coll) #:http.request.field{:shape "Player"}))) input), :shape "PlayerList", :type "list"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-player-session-id [input] #:http.request.field{:value input, :shape "PlayerSessionId"})

(clojure.core/defn- ser-latency-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-non-empty-string k) #:http.request.field{:map-info "key", :shape "NonEmptyString"}) (clojure.core/into (ser-positive-integer v) #:http.request.field{:map-info "value", :shape "PositiveInteger"})])) input), :shape "LatencyMap", :type "map"})

(clojure.core/defn- ser-matchmaking-rule-set-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-matchmaking-id-string-model coll) #:http.request.field{:shape "MatchmakingIdStringModel"}))) input), :shape "MatchmakingRuleSetNameList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value (clojure.core/get {:available-game-sessions "AvailableGameSessions", :active-instances "ActiveInstances", :activating-game-sessions "ActivatingGameSessions", "PercentIdleInstances" "PercentIdleInstances", :wait-time "WaitTime", "WaitTime" "WaitTime", "QueueDepth" "QueueDepth", :idle-instances "IdleInstances", "AvailablePlayerSessions" "AvailablePlayerSessions", "AvailableGameSessions" "AvailableGameSessions", :current-player-sessions "CurrentPlayerSessions", :available-player-sessions "AvailablePlayerSessions", :percent-idle-instances "PercentIdleInstances", "ActiveInstances" "ActiveInstances", :active-game-sessions "ActiveGameSessions", "ActivatingGameSessions" "ActivatingGameSessions", "IdleInstances" "IdleInstances", "CurrentPlayerSessions" "CurrentPlayerSessions", :percent-available-game-sessions "PercentAvailableGameSessions", :queue-depth "QueueDepth", "ActiveGameSessions" "ActiveGameSessions", "PercentAvailableGameSessions" "PercentAvailableGameSessions"} input), :shape "MetricName"})

(clojure.core/defn- ser-max-concurrent-game-session-activations [input] #:http.request.field{:value input, :shape "MaxConcurrentGameSessionActivations"})

(clojure.core/defn- ser-free-text [input] #:http.request.field{:value input, :shape "FreeText"})

(clojure.core/defn- ser-arn-string-model [input] #:http.request.field{:value input, :shape "ArnStringModel"})

(clojure.core/defn- ser-fleet-action [input] #:http.request.field{:value (clojure.core/get {"AUTO_SCALING" "AUTO_SCALING", :auto-scaling "AUTO_SCALING"} input), :shape "FleetAction"})

(clojure.core/defn- ser-game-session-activation-timeout-seconds [input] #:http.request.field{:value input, :shape "GameSessionActivationTimeoutSeconds"})

(clojure.core/defn- ser-scaling-adjustment-type [input] #:http.request.field{:value (clojure.core/get {"ChangeInCapacity" "ChangeInCapacity", :change-in-capacity "ChangeInCapacity", "ExactCapacity" "ExactCapacity", :exact-capacity "ExactCapacity", "PercentChangeInCapacity" "PercentChangeInCapacity", :percent-change-in-capacity "PercentChangeInCapacity"} input), :shape "ScalingAdjustmentType"})

(clojure.core/defn- ser-non-blank-string [input] #:http.request.field{:value input, :shape "NonBlankString"})

(clojure.core/defn- ser-port-number [input] #:http.request.field{:value input, :shape "PortNumber"})

(clojure.core/defn- ser-policy-type [input] #:http.request.field{:value (clojure.core/get {"RuleBased" "RuleBased", :rule-based "RuleBased", "TargetBased" "TargetBased", :target-based "TargetBased"} input), :shape "PolicyType"})

(clojure.core/defn- ser-game-session-queue-name [input] #:http.request.field{:value input, :shape "GameSessionQueueName"})

(clojure.core/defn- ser-float [input] #:http.request.field{:value input, :shape "Float"})

(clojure.core/defn- ser-server-process-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-server-process coll) #:http.request.field{:shape "ServerProcess"}))) input), :shape "ServerProcessList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-server-process [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-zero-and-max-string (:launch-path input)) #:http.request.field{:name "LaunchPath", :shape "NonZeroAndMaxString"}) (clojure.core/into (ser-positive-integer (:concurrent-executions input)) #:http.request.field{:name "ConcurrentExecutions", :shape "PositiveInteger"})], :shape "ServerProcess", :type "structure"} (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :parameters)) #:http.request.field{:name "Parameters", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- ser-resource-creation-limit-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResourceCreationLimitPolicy", :type "structure"} (clojure.core/contains? input :new-game-sessions-per-creator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :new-game-sessions-per-creator)) #:http.request.field{:name "NewGameSessionsPerCreator", :shape "WholeNumber"})) (clojure.core/contains? input :policy-period-in-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :policy-period-in-minutes)) #:http.request.field{:name "PolicyPeriodInMinutes", :shape "WholeNumber"}))))

(clojure.core/defn- ser-desired-player-session-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-desired-player-session coll) #:http.request.field{:shape "DesiredPlayerSession"}))) input), :shape "DesiredPlayerSessionList", :type "list"})

(clojure.core/defn- ser-build-id [input] #:http.request.field{:value input, :shape "BuildId"})

(clojure.core/defn- ser-operating-system [input] #:http.request.field{:value (clojure.core/get {"WINDOWS_2012" "WINDOWS_2012", :windows-2012 "WINDOWS_2012", "AMAZON_LINUX" "AMAZON_LINUX", :amazon-linux "AMAZON_LINUX"} input), :shape "OperatingSystem"})

(clojure.core/defn- ser-scaling-status-type [input] #:http.request.field{:value (clojure.core/get {:deleted "DELETED", "UPDATE_REQUESTED" "UPDATE_REQUESTED", "UPDATING" "UPDATING", :deleting "DELETING", "ERROR" "ERROR", :update-requested "UPDATE_REQUESTED", :active "ACTIVE", "DELETING" "DELETING", "DELETE_REQUESTED" "DELETE_REQUESTED", "ACTIVE" "ACTIVE", :updating "UPDATING", :error "ERROR", "DELETED" "DELETED", :delete-requested "DELETE_REQUESTED"} input), :shape "ScalingStatusType"})

(clojure.core/defn- ser-acceptance-type [input] #:http.request.field{:value (clojure.core/get {"ACCEPT" "ACCEPT", :accept "ACCEPT", "REJECT" "REJECT", :reject "REJECT"} input), :shape "AcceptanceType"})

(clojure.core/defn- req-create-vpc-peering-authorization-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-zero-and-max-string (input :game-lift-aws-account-id)) #:http.request.field{:name "GameLiftAwsAccountId", :shape "NonZeroAndMaxString"}) (clojure.core/into (ser-non-zero-and-max-string (input :peer-vpc-id)) #:http.request.field{:name "PeerVpcId", :shape "NonZeroAndMaxString"})]}))

(clojure.core/defn- req-stop-fleet-actions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"}) (clojure.core/into (ser-fleet-action-list (input :actions)) #:http.request.field{:name "Actions", :shape "FleetActionList"})]}))

(clojure.core/defn- req-describe-matchmaking-rule-sets-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matchmaking-rule-set-name-list (input :names)) #:http.request.field{:name "Names", :shape "MatchmakingRuleSetNameList"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-set-limit (input :limit)) #:http.request.field{:name "Limit", :shape "RuleSetLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-update-fleet-capacity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})]} (clojure.core/contains? input :desired-instances) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :desired-instances)) #:http.request.field{:name "DesiredInstances", :shape "WholeNumber"})) (clojure.core/contains? input :min-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :min-size)) #:http.request.field{:name "MinSize", :shape "WholeNumber"})) (clojure.core/contains? input :max-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :max-size)) #:http.request.field{:name "MaxSize", :shape "WholeNumber"}))))

(clojure.core/defn- req-describe-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})]} (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-list-fleets-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :build-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-build-id (input :build-id)) #:http.request.field{:name "BuildId", :shape "BuildId"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-update-build-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-build-id (input :build-id)) #:http.request.field{:name "BuildId", :shape "BuildId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :name)) #:http.request.field{:name "Name", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :version)) #:http.request.field{:name "Version", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-request-upload-credentials-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-build-id (input :build-id)) #:http.request.field{:name "BuildId", :shape "BuildId"})]}))

(clojure.core/defn- req-describe-game-session-queues-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-session-queue-name-list (input :names)) #:http.request.field{:name "Names", :shape "GameSessionQueueNameList"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-create-player-session-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn-string-model (input :game-session-id)) #:http.request.field{:name "GameSessionId", :shape "ArnStringModel"}) (clojure.core/into (ser-non-zero-and-max-string (input :player-id)) #:http.request.field{:name "PlayerId", :shape "NonZeroAndMaxString"})]} (clojure.core/contains? input :player-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-player-data (input :player-data)) #:http.request.field{:name "PlayerData", :shape "PlayerData"}))))

(clojure.core/defn- req-describe-fleet-events-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})]} (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "Timestamp"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "Timestamp"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-describe-alias-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alias-id (input :alias-id)) #:http.request.field{:name "AliasId", :shape "AliasId"})]}))

(clojure.core/defn- req-create-vpc-peering-connection-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"}) (clojure.core/into (ser-non-zero-and-max-string (input :peer-vpc-aws-account-id)) #:http.request.field{:name "PeerVpcAwsAccountId", :shape "NonZeroAndMaxString"}) (clojure.core/into (ser-non-zero-and-max-string (input :peer-vpc-id)) #:http.request.field{:name "PeerVpcId", :shape "NonZeroAndMaxString"})]}))

(clojure.core/defn- req-create-alias-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-blank-and-length-constraint-string (input :name)) #:http.request.field{:name "Name", :shape "NonBlankAndLengthConstraintString"}) (clojure.core/into (ser-routing-strategy (input :routing-strategy)) #:http.request.field{:name "RoutingStrategy", :shape "RoutingStrategy"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :description)) #:http.request.field{:name "Description", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-update-alias-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alias-id (input :alias-id)) #:http.request.field{:name "AliasId", :shape "AliasId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-blank-and-length-constraint-string (input :name)) #:http.request.field{:name "Name", :shape "NonBlankAndLengthConstraintString"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :description)) #:http.request.field{:name "Description", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :routing-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-routing-strategy (input :routing-strategy)) #:http.request.field{:name "RoutingStrategy", :shape "RoutingStrategy"}))))

(clojure.core/defn- req-update-fleet-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :name)) #:http.request.field{:name "Name", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :description)) #:http.request.field{:name "Description", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :new-game-session-protection-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protection-policy (input :new-game-session-protection-policy)) #:http.request.field{:name "NewGameSessionProtectionPolicy", :shape "ProtectionPolicy"})) (clojure.core/contains? input :resource-creation-limit-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-creation-limit-policy (input :resource-creation-limit-policy)) #:http.request.field{:name "ResourceCreationLimitPolicy", :shape "ResourceCreationLimitPolicy"})) (clojure.core/contains? input :metric-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-group-list (input :metric-groups)) #:http.request.field{:name "MetricGroups", :shape "MetricGroupList"}))))

(clojure.core/defn- req-start-match-backfill-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-matchmaking-id-string-model (input :configuration-name)) #:http.request.field{:name "ConfigurationName", :shape "MatchmakingIdStringModel"}) (clojure.core/into (ser-arn-string-model (input :game-session-arn)) #:http.request.field{:name "GameSessionArn", :shape "ArnStringModel"}) (clojure.core/into (ser-player-list (input :players)) #:http.request.field{:name "Players", :shape "PlayerList"})]} (clojure.core/contains? input :ticket-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matchmaking-id-string-model (input :ticket-id)) #:http.request.field{:name "TicketId", :shape "MatchmakingIdStringModel"}))))

(clojure.core/defn- req-create-game-session-queue-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-game-session-queue-name (input :name)) #:http.request.field{:name "Name", :shape "GameSessionQueueName"})]} (clojure.core/contains? input :timeout-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :timeout-in-seconds)) #:http.request.field{:name "TimeoutInSeconds", :shape "WholeNumber"})) (clojure.core/contains? input :player-latency-policies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-player-latency-policy-list (input :player-latency-policies)) #:http.request.field{:name "PlayerLatencyPolicies", :shape "PlayerLatencyPolicyList"})) (clojure.core/contains? input :destinations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-session-queue-destination-list (input :destinations)) #:http.request.field{:name "Destinations", :shape "GameSessionQueueDestinationList"}))))

(clojure.core/defn- req-update-runtime-configuration-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"}) (clojure.core/into (ser-runtime-configuration (input :runtime-configuration)) #:http.request.field{:name "RuntimeConfiguration", :shape "RuntimeConfiguration"})]}))

(clojure.core/defn- req-update-game-session-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn-string-model (input :game-session-id)) #:http.request.field{:name "GameSessionId", :shape "ArnStringModel"})]} (clojure.core/contains? input :maximum-player-session-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :maximum-player-session-count)) #:http.request.field{:name "MaximumPlayerSessionCount", :shape "WholeNumber"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :name)) #:http.request.field{:name "Name", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :player-session-creation-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-player-session-creation-policy (input :player-session-creation-policy)) #:http.request.field{:name "PlayerSessionCreationPolicy", :shape "PlayerSessionCreationPolicy"})) (clojure.core/contains? input :protection-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protection-policy (input :protection-policy)) #:http.request.field{:name "ProtectionPolicy", :shape "ProtectionPolicy"}))))

(clojure.core/defn- req-describe-game-session-details-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :fleet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})) (clojure.core/contains? input :game-session-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-string-model (input :game-session-id)) #:http.request.field{:name "GameSessionId", :shape "ArnStringModel"})) (clojure.core/contains? input :alias-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-id (input :alias-id)) #:http.request.field{:name "AliasId", :shape "AliasId"})) (clojure.core/contains? input :status-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :status-filter)) #:http.request.field{:name "StatusFilter", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-create-fleet-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-zero-and-max-string (input :name)) #:http.request.field{:name "Name", :shape "NonZeroAndMaxString"}) (clojure.core/into (ser-build-id (input :build-id)) #:http.request.field{:name "BuildId", :shape "BuildId"}) (clojure.core/into (ser-ec-2-instance-type (input :ec-2-instance-type)) #:http.request.field{:name "EC2InstanceType", :shape "EC2InstanceType"})]} (clojure.core/contains? input :new-game-session-protection-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protection-policy (input :new-game-session-protection-policy)) #:http.request.field{:name "NewGameSessionProtectionPolicy", :shape "ProtectionPolicy"})) (clojure.core/contains? input :runtime-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-runtime-configuration (input :runtime-configuration)) #:http.request.field{:name "RuntimeConfiguration", :shape "RuntimeConfiguration"})) (clojure.core/contains? input :ec-2-inbound-permissions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-permissions-list (input :ec-2-inbound-permissions)) #:http.request.field{:name "EC2InboundPermissions", :shape "IpPermissionsList"})) (clojure.core/contains? input :fleet-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-type (input :fleet-type)) #:http.request.field{:name "FleetType", :shape "FleetType"})) (clojure.core/contains? input :peer-vpc-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :peer-vpc-id)) #:http.request.field{:name "PeerVpcId", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :server-launch-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :server-launch-path)) #:http.request.field{:name "ServerLaunchPath", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :description)) #:http.request.field{:name "Description", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :server-launch-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :server-launch-parameters)) #:http.request.field{:name "ServerLaunchParameters", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :metric-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-group-list (input :metric-groups)) #:http.request.field{:name "MetricGroups", :shape "MetricGroupList"})) (clojure.core/contains? input :peer-vpc-aws-account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :peer-vpc-aws-account-id)) #:http.request.field{:name "PeerVpcAwsAccountId", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :resource-creation-limit-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-creation-limit-policy (input :resource-creation-limit-policy)) #:http.request.field{:name "ResourceCreationLimitPolicy", :shape "ResourceCreationLimitPolicy"})) (clojure.core/contains? input :log-paths) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :log-paths)) #:http.request.field{:name "LogPaths", :shape "StringList"}))))

(clojure.core/defn- req-delete-vpc-peering-connection-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"}) (clojure.core/into (ser-non-zero-and-max-string (input :vpc-peering-connection-id)) #:http.request.field{:name "VpcPeeringConnectionId", :shape "NonZeroAndMaxString"})]}))

(clojure.core/defn- req-describe-fleet-attributes-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :fleet-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-id-list (input :fleet-ids)) #:http.request.field{:name "FleetIds", :shape "FleetIdList"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-describe-runtime-configuration-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})]}))

(clojure.core/defn- req-stop-matchmaking-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-matchmaking-id-string-model (input :ticket-id)) #:http.request.field{:name "TicketId", :shape "MatchmakingIdStringModel"})]}))

(clojure.core/defn- req-describe-game-session-placement-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id-string-model (input :placement-id)) #:http.request.field{:name "PlacementId", :shape "IdStringModel"})]}))

(clojure.core/defn- req-delete-vpc-peering-authorization-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-zero-and-max-string (input :game-lift-aws-account-id)) #:http.request.field{:name "GameLiftAwsAccountId", :shape "NonZeroAndMaxString"}) (clojure.core/into (ser-non-zero-and-max-string (input :peer-vpc-id)) #:http.request.field{:name "PeerVpcId", :shape "NonZeroAndMaxString"})]}))

(clojure.core/defn- req-describe-player-sessions-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :game-session-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-string-model (input :game-session-id)) #:http.request.field{:name "GameSessionId", :shape "ArnStringModel"})) (clojure.core/contains? input :player-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :player-id)) #:http.request.field{:name "PlayerId", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :player-session-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-player-session-id (input :player-session-id)) #:http.request.field{:name "PlayerSessionId", :shape "PlayerSessionId"})) (clojure.core/contains? input :player-session-status-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :player-session-status-filter)) #:http.request.field{:name "PlayerSessionStatusFilter", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-resolve-alias-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alias-id (input :alias-id)) #:http.request.field{:name "AliasId", :shape "AliasId"})]}))

(clojure.core/defn- req-search-game-sessions-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :fleet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})) (clojure.core/contains? input :alias-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-id (input :alias-id)) #:http.request.field{:name "AliasId", :shape "AliasId"})) (clojure.core/contains? input :filter-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :filter-expression)) #:http.request.field{:name "FilterExpression", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :sort-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :sort-expression)) #:http.request.field{:name "SortExpression", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-stop-game-session-placement-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id-string-model (input :placement-id)) #:http.request.field{:name "PlacementId", :shape "IdStringModel"})]}))

(clojure.core/defn- req-describe-fleet-port-settings-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})]}))

(clojure.core/defn- req-put-scaling-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-zero-and-max-string (input :name)) #:http.request.field{:name "Name", :shape "NonZeroAndMaxString"}) (clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"}) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"})]} (clojure.core/contains? input :threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :threshold)) #:http.request.field{:name "Threshold", :shape "Double"})) (clojure.core/contains? input :scaling-adjustment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :scaling-adjustment)) #:http.request.field{:name "ScalingAdjustment", :shape "Integer"})) (clojure.core/contains? input :comparison-operator) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparison-operator-type (input :comparison-operator)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperatorType"})) (clojure.core/contains? input :target-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-configuration (input :target-configuration)) #:http.request.field{:name "TargetConfiguration", :shape "TargetConfiguration"})) (clojure.core/contains? input :evaluation-periods) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :evaluation-periods)) #:http.request.field{:name "EvaluationPeriods", :shape "PositiveInteger"})) (clojure.core/contains? input :scaling-adjustment-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scaling-adjustment-type (input :scaling-adjustment-type)) #:http.request.field{:name "ScalingAdjustmentType", :shape "ScalingAdjustmentType"})) (clojure.core/contains? input :policy-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-type (input :policy-type)) #:http.request.field{:name "PolicyType", :shape "PolicyType"}))))

(clojure.core/defn- req-delete-build-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-build-id (input :build-id)) #:http.request.field{:name "BuildId", :shape "BuildId"})]}))

(clojure.core/defn- req-update-game-session-queue-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-game-session-queue-name (input :name)) #:http.request.field{:name "Name", :shape "GameSessionQueueName"})]} (clojure.core/contains? input :timeout-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :timeout-in-seconds)) #:http.request.field{:name "TimeoutInSeconds", :shape "WholeNumber"})) (clojure.core/contains? input :player-latency-policies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-player-latency-policy-list (input :player-latency-policies)) #:http.request.field{:name "PlayerLatencyPolicies", :shape "PlayerLatencyPolicyList"})) (clojure.core/contains? input :destinations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-session-queue-destination-list (input :destinations)) #:http.request.field{:name "Destinations", :shape "GameSessionQueueDestinationList"}))))

(clojure.core/defn- req-describe-matchmaking-configurations-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matchmaking-id-list (input :names)) #:http.request.field{:name "Names", :shape "MatchmakingIdList"})) (clojure.core/contains? input :rule-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matchmaking-id-string-model (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "MatchmakingIdStringModel"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-delete-matchmaking-configuration-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-matchmaking-id-string-model (input :name)) #:http.request.field{:name "Name", :shape "MatchmakingIdStringModel"})]}))

(clojure.core/defn- req-start-matchmaking-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-matchmaking-id-string-model (input :configuration-name)) #:http.request.field{:name "ConfigurationName", :shape "MatchmakingIdStringModel"}) (clojure.core/into (ser-player-list (input :players)) #:http.request.field{:name "Players", :shape "PlayerList"})]} (clojure.core/contains? input :ticket-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matchmaking-id-string-model (input :ticket-id)) #:http.request.field{:name "TicketId", :shape "MatchmakingIdStringModel"}))))

(clojure.core/defn- req-accept-match-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-matchmaking-id-string-model (input :ticket-id)) #:http.request.field{:name "TicketId", :shape "MatchmakingIdStringModel"}) (clojure.core/into (ser-string-list (input :player-ids)) #:http.request.field{:name "PlayerIds", :shape "StringList"}) (clojure.core/into (ser-acceptance-type (input :acceptance-type)) #:http.request.field{:name "AcceptanceType", :shape "AcceptanceType"})]}))

(clojure.core/defn- req-describe-matchmaking-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-matchmaking-id-list (input :ticket-ids)) #:http.request.field{:name "TicketIds", :shape "MatchmakingIdList"})]}))

(clojure.core/defn- req-delete-game-session-queue-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-game-session-queue-name (input :name)) #:http.request.field{:name "Name", :shape "GameSessionQueueName"})]}))

(clojure.core/defn- req-create-matchmaking-rule-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-matchmaking-id-string-model (input :name)) #:http.request.field{:name "Name", :shape "MatchmakingIdStringModel"}) (clojure.core/into (ser-rule-set-body (input :rule-set-body)) #:http.request.field{:name "RuleSetBody", :shape "RuleSetBody"})]}))

(clojure.core/defn- req-start-fleet-actions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"}) (clojure.core/into (ser-fleet-action-list (input :actions)) #:http.request.field{:name "Actions", :shape "FleetActionList"})]}))

(clojure.core/defn- req-list-aliases-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :routing-strategy-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-routing-strategy-type (input :routing-strategy-type)) #:http.request.field{:name "RoutingStrategyType", :shape "RoutingStrategyType"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "Name", :shape "NonEmptyString"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonEmptyString"}))))

(clojure.core/defn- req-describe-fleet-capacity-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :fleet-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-id-list (input :fleet-ids)) #:http.request.field{:name "FleetIds", :shape "FleetIdList"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-update-fleet-port-settings-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})]} (clojure.core/contains? input :inbound-permission-authorizations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-permissions-list (input :inbound-permission-authorizations)) #:http.request.field{:name "InboundPermissionAuthorizations", :shape "IpPermissionsList"})) (clojure.core/contains? input :inbound-permission-revocations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-permissions-list (input :inbound-permission-revocations)) #:http.request.field{:name "InboundPermissionRevocations", :shape "IpPermissionsList"}))))

(clojure.core/defn- req-describe-vpc-peering-authorizations-input [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-build-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-build-id (input :build-id)) #:http.request.field{:name "BuildId", :shape "BuildId"})]}))

(clojure.core/defn- req-create-build-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :name)) #:http.request.field{:name "Name", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :version)) #:http.request.field{:name "Version", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :storage-location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-location (input :storage-location)) #:http.request.field{:name "StorageLocation", :shape "S3Location"})) (clojure.core/contains? input :operating-system) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-operating-system (input :operating-system)) #:http.request.field{:name "OperatingSystem", :shape "OperatingSystem"}))))

(clojure.core/defn- req-get-instance-access-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})]}))

(clojure.core/defn- req-create-matchmaking-configuration-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-matchmaking-id-string-model (input :name)) #:http.request.field{:name "Name", :shape "MatchmakingIdStringModel"}) (clojure.core/into (ser-queue-arns-list (input :game-session-queue-arns)) #:http.request.field{:name "GameSessionQueueArns", :shape "QueueArnsList"}) (clojure.core/into (ser-matchmaking-request-timeout-integer (input :request-timeout-seconds)) #:http.request.field{:name "RequestTimeoutSeconds", :shape "MatchmakingRequestTimeoutInteger"}) (clojure.core/into (ser-boolean-model (input :acceptance-required)) #:http.request.field{:name "AcceptanceRequired", :shape "BooleanModel"}) (clojure.core/into (ser-matchmaking-id-string-model (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "MatchmakingIdStringModel"})]} (clojure.core/contains? input :custom-event-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-event-data (input :custom-event-data)) #:http.request.field{:name "CustomEventData", :shape "CustomEventData"})) (clojure.core/contains? input :game-session-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-session-data (input :game-session-data)) #:http.request.field{:name "GameSessionData", :shape "GameSessionData"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :description)) #:http.request.field{:name "Description", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :acceptance-timeout-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matchmaking-acceptance-timeout-integer (input :acceptance-timeout-seconds)) #:http.request.field{:name "AcceptanceTimeoutSeconds", :shape "MatchmakingAcceptanceTimeoutInteger"})) (clojure.core/contains? input :additional-player-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :additional-player-count)) #:http.request.field{:name "AdditionalPlayerCount", :shape "WholeNumber"})) (clojure.core/contains? input :game-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-property-list (input :game-properties)) #:http.request.field{:name "GameProperties", :shape "GamePropertyList"})) (clojure.core/contains? input :notification-target) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-arn-string-model (input :notification-target)) #:http.request.field{:name "NotificationTarget", :shape "SnsArnStringModel"}))))

(clojure.core/defn- req-describe-vpc-peering-connections-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :fleet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"}))))

(clojure.core/defn- req-create-game-session-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-whole-number (input :maximum-player-session-count)) #:http.request.field{:name "MaximumPlayerSessionCount", :shape "WholeNumber"})]} (clojure.core/contains? input :fleet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})) (clojure.core/contains? input :alias-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-id (input :alias-id)) #:http.request.field{:name "AliasId", :shape "AliasId"})) (clojure.core/contains? input :game-session-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-session-data (input :game-session-data)) #:http.request.field{:name "GameSessionData", :shape "GameSessionData"})) (clojure.core/contains? input :idempotency-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-string-model (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdStringModel"})) (clojure.core/contains? input :game-session-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id-string-model (input :game-session-id)) #:http.request.field{:name "GameSessionId", :shape "IdStringModel"})) (clojure.core/contains? input :creator-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :creator-id)) #:http.request.field{:name "CreatorId", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :game-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-property-list (input :game-properties)) #:http.request.field{:name "GameProperties", :shape "GamePropertyList"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :name)) #:http.request.field{:name "Name", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-delete-fleet-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})]}))

(clojure.core/defn- req-update-matchmaking-configuration-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-matchmaking-id-string-model (input :name)) #:http.request.field{:name "Name", :shape "MatchmakingIdStringModel"})]} (clojure.core/contains? input :acceptance-required) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-model (input :acceptance-required)) #:http.request.field{:name "AcceptanceRequired", :shape "BooleanModel"})) (clojure.core/contains? input :custom-event-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-event-data (input :custom-event-data)) #:http.request.field{:name "CustomEventData", :shape "CustomEventData"})) (clojure.core/contains? input :game-session-queue-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-queue-arns-list (input :game-session-queue-arns)) #:http.request.field{:name "GameSessionQueueArns", :shape "QueueArnsList"})) (clojure.core/contains? input :rule-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matchmaking-id-string-model (input :rule-set-name)) #:http.request.field{:name "RuleSetName", :shape "MatchmakingIdStringModel"})) (clojure.core/contains? input :game-session-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-session-data (input :game-session-data)) #:http.request.field{:name "GameSessionData", :shape "GameSessionData"})) (clojure.core/contains? input :request-timeout-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matchmaking-request-timeout-integer (input :request-timeout-seconds)) #:http.request.field{:name "RequestTimeoutSeconds", :shape "MatchmakingRequestTimeoutInteger"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :description)) #:http.request.field{:name "Description", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :acceptance-timeout-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matchmaking-acceptance-timeout-integer (input :acceptance-timeout-seconds)) #:http.request.field{:name "AcceptanceTimeoutSeconds", :shape "MatchmakingAcceptanceTimeoutInteger"})) (clojure.core/contains? input :additional-player-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :additional-player-count)) #:http.request.field{:name "AdditionalPlayerCount", :shape "WholeNumber"})) (clojure.core/contains? input :game-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-property-list (input :game-properties)) #:http.request.field{:name "GameProperties", :shape "GamePropertyList"})) (clojure.core/contains? input :notification-target) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-arn-string-model (input :notification-target)) #:http.request.field{:name "NotificationTarget", :shape "SnsArnStringModel"}))))

(clojure.core/defn- req-describe-scaling-policies-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})]} (clojure.core/contains? input :status-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scaling-status-type (input :status-filter)) #:http.request.field{:name "StatusFilter", :shape "ScalingStatusType"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-describe-ec-2-instance-limits-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :ec-2-instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-instance-type (input :ec-2-instance-type)) #:http.request.field{:name "EC2InstanceType", :shape "EC2InstanceType"}))))

(clojure.core/defn- req-describe-game-sessions-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :fleet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})) (clojure.core/contains? input :game-session-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-string-model (input :game-session-id)) #:http.request.field{:name "GameSessionId", :shape "ArnStringModel"})) (clojure.core/contains? input :alias-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-id (input :alias-id)) #:http.request.field{:name "AliasId", :shape "AliasId"})) (clojure.core/contains? input :status-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :status-filter)) #:http.request.field{:name "StatusFilter", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-list-builds-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-build-status (input :status)) #:http.request.field{:name "Status", :shape "BuildStatus"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonEmptyString"}))))

(clojure.core/defn- req-get-game-session-log-url-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn-string-model (input :game-session-id)) #:http.request.field{:name "GameSessionId", :shape "ArnStringModel"})]}))

(clojure.core/defn- req-delete-scaling-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-zero-and-max-string (input :name)) #:http.request.field{:name "Name", :shape "NonZeroAndMaxString"}) (clojure.core/into (ser-fleet-id (input :fleet-id)) #:http.request.field{:name "FleetId", :shape "FleetId"})]}))

(clojure.core/defn- req-delete-alias-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alias-id (input :alias-id)) #:http.request.field{:name "AliasId", :shape "AliasId"})]}))

(clojure.core/defn- req-validate-matchmaking-rule-set-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-set-body (input :rule-set-body)) #:http.request.field{:name "RuleSetBody", :shape "RuleSetBody"})]}))

(clojure.core/defn- req-describe-fleet-utilization-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :fleet-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fleet-id-list (input :fleet-ids)) #:http.request.field{:name "FleetIds", :shape "FleetIdList"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-integer (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "NonZeroAndMaxString"}))))

(clojure.core/defn- req-start-game-session-placement-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id-string-model (input :placement-id)) #:http.request.field{:name "PlacementId", :shape "IdStringModel"}) (clojure.core/into (ser-game-session-queue-name (input :game-session-queue-name)) #:http.request.field{:name "GameSessionQueueName", :shape "GameSessionQueueName"}) (clojure.core/into (ser-whole-number (input :maximum-player-session-count)) #:http.request.field{:name "MaximumPlayerSessionCount", :shape "WholeNumber"})]} (clojure.core/contains? input :game-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-property-list (input :game-properties)) #:http.request.field{:name "GameProperties", :shape "GamePropertyList"})) (clojure.core/contains? input :game-session-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-zero-and-max-string (input :game-session-name)) #:http.request.field{:name "GameSessionName", :shape "NonZeroAndMaxString"})) (clojure.core/contains? input :player-latencies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-player-latency-list (input :player-latencies)) #:http.request.field{:name "PlayerLatencies", :shape "PlayerLatencyList"})) (clojure.core/contains? input :desired-player-sessions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-desired-player-session-list (input :desired-player-sessions)) #:http.request.field{:name "DesiredPlayerSessions", :shape "DesiredPlayerSessionList"})) (clojure.core/contains? input :game-session-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-game-session-data (input :game-session-data)) #:http.request.field{:name "GameSessionData", :shape "GameSessionData"}))))

(clojure.core/defn- req-create-player-sessions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn-string-model (input :game-session-id)) #:http.request.field{:name "GameSessionId", :shape "ArnStringModel"}) (clojure.core/into (ser-player-id-list (input :player-ids)) #:http.request.field{:name "PlayerIds", :shape "PlayerIdList"})]} (clojure.core/contains? input :player-data-map) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-player-data-map (input :player-data-map)) #:http.request.field{:name "PlayerDataMap", :shape "PlayerDataMap"}))))

(clojure.core/declare deser-metric-group)

(clojure.core/declare deser-event-code)

(clojure.core/declare deser-non-blank-and-length-constraint-string)

(clojure.core/declare deser-player-session-list)

(clojure.core/declare deser-vpc-peering-connection-status)

(clojure.core/declare deser-non-zero-and-max-string)

(clojure.core/declare deser-queue-arns-list)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-rule-set-body)

(clojure.core/declare deser-double)

(clojure.core/declare deser-game-property-key)

(clojure.core/declare deser-game-session-status-reason)

(clojure.core/declare deser-ec-2-instance-type)

(clojure.core/declare deser-instance-id)

(clojure.core/declare deser-game-property)

(clojure.core/declare deser-game-session-queue)

(clojure.core/declare deser-vpc-peering-connection)

(clojure.core/declare deser-matchmaking-ticket-list)

(clojure.core/declare deser-game-property-value)

(clojure.core/declare deser-double-object)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-matchmaking-rule-set-list)

(clojure.core/declare deser-player-attribute-map)

(clojure.core/declare deser-ec-2-instance-limit-list)

(clojure.core/declare deser-sns-arn-string-model)

(clojure.core/declare deser-ip-protocol)

(clojure.core/declare deser-custom-event-data)

(clojure.core/declare deser-build-list)

(clojure.core/declare deser-id-string-model)

(clojure.core/declare deser-matchmaking-configuration-status)

(clojure.core/declare deser-game-session-queue-destination-list)

(clojure.core/declare deser-matchmaking-request-timeout-integer)

(clojure.core/declare deser-game-session-queue-destination)

(clojure.core/declare deser-matchmaking-acceptance-timeout-integer)

(clojure.core/declare deser-runtime-configuration)

(clojure.core/declare deser-player-data)

(clojure.core/declare deser-aws-credentials)

(clojure.core/declare deser-game-session-status)

(clojure.core/declare deser-fleet-id)

(clojure.core/declare deser-placed-player-session)

(clojure.core/declare deser-game-session-placement-state)

(clojure.core/declare deser-player-latency-policy-list)

(clojure.core/declare deser-boolean-model)

(clojure.core/declare deser-ip-permissions-list)

(clojure.core/declare deser-fleet-action-list)

(clojure.core/declare deser-fleet-attributes-list)

(clojure.core/declare deser-matched-player-session)

(clojure.core/declare deser-fleet-utilization-list)

(clojure.core/declare deser-whole-number)

(clojure.core/declare deser-alias)

(clojure.core/declare deser-routing-strategy)

(clojure.core/declare deser-matchmaker-data)

(clojure.core/declare deser-vpc-peering-authorization)

(clojure.core/declare deser-event-list)

(clojure.core/declare deser-fleet-type)

(clojure.core/declare deser-fleet-capacity)

(clojure.core/declare deser-vpc-peering-connection-list)

(clojure.core/declare deser-player)

(clojure.core/declare deser-event)

(clojure.core/declare deser-player-latency)

(clojure.core/declare deser-player-session-creation-policy)

(clojure.core/declare deser-game-session-connection-info)

(clojure.core/declare deser-alias-id)

(clojure.core/declare deser-matched-player-session-list)

(clojure.core/declare deser-string-double-map)

(clojure.core/declare deser-protection-policy)

(clojure.core/declare deser-fleet-attributes)

(clojure.core/declare deser-player-latency-policy)

(clojure.core/declare deser-ec-2-instance-limit)

(clojure.core/declare deser-fleet-id-list)

(clojure.core/declare deser-string-model)

(clojure.core/declare deser-build-status)

(clojure.core/declare deser-game-session-data)

(clojure.core/declare deser-target-configuration)

(clojure.core/declare deser-player-latency-list)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-player-session)

(clojure.core/declare deser-alias-list)

(clojure.core/declare deser-build)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-placed-player-session-list)

(clojure.core/declare deser-ip-permission)

(clojure.core/declare deser-game-session)

(clojure.core/declare deser-instance-credentials)

(clojure.core/declare deser-game-session-detail)

(clojure.core/declare deser-vpc-peering-authorization-list)

(clojure.core/declare deser-positive-integer)

(clojure.core/declare deser-s-3-location)

(clojure.core/declare deser-comparison-operator-type)

(clojure.core/declare deser-game-property-list)

(clojure.core/declare deser-instance-list)

(clojure.core/declare deser-matchmaking-ticket)

(clojure.core/declare deser-matchmaking-rule-set)

(clojure.core/declare deser-matchmaking-id-string-model)

(clojure.core/declare deser-routing-strategy-type)

(clojure.core/declare deser-game-session-detail-list)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-metric-group-list)

(clojure.core/declare deser-scaling-policy-list)

(clojure.core/declare deser-player-list)

(clojure.core/declare deser-scaling-policy)

(clojure.core/declare deser-ec-2-instance-counts)

(clojure.core/declare deser-instance-access)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-player-session-id)

(clojure.core/declare deser-latency-map)

(clojure.core/declare deser-fleet-utilization)

(clojure.core/declare deser-player-session-status)

(clojure.core/declare deser-game-session-queue-list)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-instance-status)

(clojure.core/declare deser-instance)

(clojure.core/declare deser-max-concurrent-game-session-activations)

(clojure.core/declare deser-fleet-status)

(clojure.core/declare deser-free-text)

(clojure.core/declare deser-arn-string-model)

(clojure.core/declare deser-fleet-action)

(clojure.core/declare deser-game-session-activation-timeout-seconds)

(clojure.core/declare deser-scaling-adjustment-type)

(clojure.core/declare deser-matchmaking-configuration-list)

(clojure.core/declare deser-matchmaking-configuration)

(clojure.core/declare deser-non-blank-string)

(clojure.core/declare deser-port-number)

(clojure.core/declare deser-policy-type)

(clojure.core/declare deser-game-session-queue-name)

(clojure.core/declare deser-positive-long)

(clojure.core/declare deser-float)

(clojure.core/declare deser-server-process-list)

(clojure.core/declare deser-server-process)

(clojure.core/declare deser-game-session-list)

(clojure.core/declare deser-resource-creation-limit-policy)

(clojure.core/declare deser-fleet-capacity-list)

(clojure.core/declare deser-build-id)

(clojure.core/declare deser-operating-system)

(clojure.core/declare deser-scaling-status-type)

(clojure.core/declare deser-game-session-placement)

(clojure.core/defn- deser-metric-group [input] input)

(clojure.core/defn- deser-event-code [input] (clojure.core/get {"SERVER_PROCESS_PROCESS_EXIT_TIMEOUT" :server-process-process-exit-timeout, "SERVER_PROCESS_INVALID_PATH" :server-process-invalid-path, "FLEET_INITIALIZATION_FAILED" :fleet-initialization-failed, "FLEET_STATE_VALIDATING" :fleet-state-validating, "FLEET_VPC_PEERING_SUCCEEDED" :fleet-vpc-peering-succeeded, "FLEET_VPC_PEERING_DELETED" :fleet-vpc-peering-deleted, "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT" :server-process-sdk-initialization-timeout, "SERVER_PROCESS_PROCESS_READY_TIMEOUT" :server-process-process-ready-timeout, "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED" :fleet-new-game-session-protection-policy-updated, "FLEET_STATE_ACTIVE" :fleet-state-active, "FLEET_BINARY_DOWNLOAD_FAILED" :fleet-binary-download-failed, "INSTANCE_INTERRUPTED" :instance-interrupted, "FLEET_STATE_ACTIVATING" :fleet-state-activating, "GENERIC_EVENT" :generic-event, "FLEET_STATE_ERROR" :fleet-state-error, "FLEET_VPC_PEERING_FAILED" :fleet-vpc-peering-failed, "FLEET_CREATED" :fleet-created, "FLEET_CREATION_RUNNING_INSTALLER" :fleet-creation-running-installer, "FLEET_STATE_BUILDING" :fleet-state-building, "FLEET_DELETED" :fleet-deleted, "GAME_SESSION_ACTIVATION_TIMEOUT" :game-session-activation-timeout, "FLEET_VALIDATION_TIMED_OUT" :fleet-validation-timed-out, "FLEET_ACTIVATION_FAILED" :fleet-activation-failed, "FLEET_STATE_DOWNLOADING" :fleet-state-downloading, "SERVER_PROCESS_CRASHED" :server-process-crashed, "FLEET_ACTIVATION_FAILED_NO_INSTANCES" :fleet-activation-failed-no-instances, "FLEET_CREATION_EXTRACTING_BUILD" :fleet-creation-extracting-build, "SERVER_PROCESS_FORCE_TERMINATED" :server-process-force-terminated, "FLEET_SCALING_EVENT" :fleet-scaling-event, "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE" :fleet-validation-executable-runtime-failure, "SERVER_PROCESS_TERMINATED_UNHEALTHY" :server-process-terminated-unhealthy, "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND" :fleet-validation-launch-path-not-found, "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG" :fleet-creation-validating-runtime-config} input))

(clojure.core/defn- deser-non-blank-and-length-constraint-string [input] input)

(clojure.core/defn- deser-player-session-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-player-session coll))) input))

(clojure.core/defn- deser-vpc-peering-connection-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-non-zero-and-max-string (input "Code"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-zero-and-max-string (input "Message")))))

(clojure.core/defn- deser-non-zero-and-max-string [input] input)

(clojure.core/defn- deser-queue-arns-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-arn-string-model coll))) input))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-zero-and-max-string coll))) input))

(clojure.core/defn- deser-rule-set-body [input] input)

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-game-property-key [input] input)

(clojure.core/defn- deser-game-session-status-reason [input] (clojure.core/get {"INTERRUPTED" :interrupted} input))

(clojure.core/defn- deser-ec-2-instance-type [input] (clojure.core/get {"r4.2xlarge" :r-42xlarge, "r3.8xlarge" :r-38xlarge, "m3.2xlarge" :m-32xlarge, "c3.8xlarge" :c-38xlarge, "t2.large" :t-2large, "m4.4xlarge" :m-44xlarge, "r4.16xlarge" :r-416xlarge, "c3.2xlarge" :c-32xlarge, "c4.8xlarge" :c-48xlarge, "c3.4xlarge" :c-34xlarge, "t2.micro" :t-2micro, "m4.2xlarge" :m-42xlarge, "m4.10xlarge" :m-410xlarge, "c4.4xlarge" :c-44xlarge, "r3.xlarge" :r-3xlarge, "c4.2xlarge" :c-42xlarge, "t2.small" :t-2small, "r4.xlarge" :r-4xlarge, "m3.xlarge" :m-3xlarge, "r3.2xlarge" :r-32xlarge, "r3.4xlarge" :r-34xlarge, "c4.xlarge" :c-4xlarge, "m4.large" :m-4large, "r3.large" :r-3large, "c4.large" :c-4large, "m4.xlarge" :m-4xlarge, "r4.large" :r-4large, "c3.xlarge" :c-3xlarge, "r4.8xlarge" :r-48xlarge, "t2.medium" :t-2medium, "c3.large" :c-3large, "m3.medium" :m-3medium, "m3.large" :m-3large, "r4.4xlarge" :r-44xlarge} input))

(clojure.core/defn- deser-instance-id [input] input)

(clojure.core/defn- deser-game-property [input] (clojure.core/cond-> {:key (deser-game-property-key (input "Key")), :value (deser-game-property-value (input "Value"))}))

(clojure.core/defn- deser-game-session-queue [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-game-session-queue-name (input "Name"))) (clojure.core/contains? input "GameSessionQueueArn") (clojure.core/assoc :game-session-queue-arn (deser-arn-string-model (input "GameSessionQueueArn"))) (clojure.core/contains? input "TimeoutInSeconds") (clojure.core/assoc :timeout-in-seconds (deser-whole-number (input "TimeoutInSeconds"))) (clojure.core/contains? input "PlayerLatencyPolicies") (clojure.core/assoc :player-latency-policies (deser-player-latency-policy-list (input "PlayerLatencyPolicies"))) (clojure.core/contains? input "Destinations") (clojure.core/assoc :destinations (deser-game-session-queue-destination-list (input "Destinations")))))

(clojure.core/defn- deser-vpc-peering-connection [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId"))) (clojure.core/contains? input "IpV4CidrBlock") (clojure.core/assoc :ip-v-4-cidr-block (deser-non-zero-and-max-string (input "IpV4CidrBlock"))) (clojure.core/contains? input "VpcPeeringConnectionId") (clojure.core/assoc :vpc-peering-connection-id (deser-non-zero-and-max-string (input "VpcPeeringConnectionId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-vpc-peering-connection-status (input "Status"))) (clojure.core/contains? input "PeerVpcId") (clojure.core/assoc :peer-vpc-id (deser-non-zero-and-max-string (input "PeerVpcId"))) (clojure.core/contains? input "GameLiftVpcId") (clojure.core/assoc :game-lift-vpc-id (deser-non-zero-and-max-string (input "GameLiftVpcId")))))

(clojure.core/defn- deser-matchmaking-ticket-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-matchmaking-ticket coll))) input))

(clojure.core/defn- deser-game-property-value [input] input)

(clojure.core/defn- deser-double-object [input] input)

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-matchmaking-rule-set-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-matchmaking-rule-set coll))) input))

(clojure.core/defn- deser-player-attribute-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-non-zero-and-max-string k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-ec-2-instance-limit-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ec-2-instance-limit coll))) input))

(clojure.core/defn- deser-sns-arn-string-model [input] input)

(clojure.core/defn- deser-ip-protocol [input] (clojure.core/get {"TCP" :tcp, "UDP" :udp} input))

(clojure.core/defn- deser-custom-event-data [input] input)

(clojure.core/defn- deser-build-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-build coll))) input))

(clojure.core/defn- deser-id-string-model [input] input)

(clojure.core/defn- deser-matchmaking-configuration-status [input] (clojure.core/get {"CANCELLED" :cancelled, "COMPLETED" :completed, "FAILED" :failed, "PLACING" :placing, "QUEUED" :queued, "REQUIRES_ACCEPTANCE" :requires-acceptance, "SEARCHING" :searching, "TIMED_OUT" :timed-out} input))

(clojure.core/defn- deser-game-session-queue-destination-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-game-session-queue-destination coll))) input))

(clojure.core/defn- deser-matchmaking-request-timeout-integer [input] input)

(clojure.core/defn- deser-game-session-queue-destination [input] (clojure.core/cond-> {} (clojure.core/contains? input "DestinationArn") (clojure.core/assoc :destination-arn (deser-arn-string-model (input "DestinationArn")))))

(clojure.core/defn- deser-matchmaking-acceptance-timeout-integer [input] input)

(clojure.core/defn- deser-runtime-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServerProcesses") (clojure.core/assoc :server-processes (deser-server-process-list (input "ServerProcesses"))) (clojure.core/contains? input "MaxConcurrentGameSessionActivations") (clojure.core/assoc :max-concurrent-game-session-activations (deser-max-concurrent-game-session-activations (input "MaxConcurrentGameSessionActivations"))) (clojure.core/contains? input "GameSessionActivationTimeoutSeconds") (clojure.core/assoc :game-session-activation-timeout-seconds (deser-game-session-activation-timeout-seconds (input "GameSessionActivationTimeoutSeconds")))))

(clojure.core/defn- deser-player-data [input] input)

(clojure.core/defn- deser-aws-credentials [input] (clojure.core/cond-> {} (clojure.core/contains? input "AccessKeyId") (clojure.core/assoc :access-key-id (deser-non-empty-string (input "AccessKeyId"))) (clojure.core/contains? input "SecretAccessKey") (clojure.core/assoc :secret-access-key (deser-non-empty-string (input "SecretAccessKey"))) (clojure.core/contains? input "SessionToken") (clojure.core/assoc :session-token (deser-non-empty-string (input "SessionToken")))))

(clojure.core/defn- deser-game-session-status [input] (clojure.core/get {"ACTIVE" :active, "ACTIVATING" :activating, "TERMINATED" :terminated, "TERMINATING" :terminating, "ERROR" :error} input))

(clojure.core/defn- deser-fleet-id [input] input)

(clojure.core/defn- deser-placed-player-session [input] (clojure.core/cond-> {} (clojure.core/contains? input "PlayerId") (clojure.core/assoc :player-id (deser-non-zero-and-max-string (input "PlayerId"))) (clojure.core/contains? input "PlayerSessionId") (clojure.core/assoc :player-session-id (deser-player-session-id (input "PlayerSessionId")))))

(clojure.core/defn- deser-game-session-placement-state [input] (clojure.core/get {"PENDING" :pending, "FULFILLED" :fulfilled, "CANCELLED" :cancelled, "TIMED_OUT" :timed-out} input))

(clojure.core/defn- deser-player-latency-policy-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-player-latency-policy coll))) input))

(clojure.core/defn- deser-boolean-model [input] input)

(clojure.core/defn- deser-ip-permissions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-permission coll))) input))

(clojure.core/defn- deser-fleet-action-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fleet-action coll))) input))

(clojure.core/defn- deser-fleet-attributes-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fleet-attributes coll))) input))

(clojure.core/defn- deser-matched-player-session [input] (clojure.core/cond-> {} (clojure.core/contains? input "PlayerId") (clojure.core/assoc :player-id (deser-non-zero-and-max-string (input "PlayerId"))) (clojure.core/contains? input "PlayerSessionId") (clojure.core/assoc :player-session-id (deser-player-session-id (input "PlayerSessionId")))))

(clojure.core/defn- deser-fleet-utilization-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fleet-utilization coll))) input))

(clojure.core/defn- deser-whole-number [input] input)

(clojure.core/defn- deser-alias [input] (clojure.core/cond-> {} (clojure.core/contains? input "AliasId") (clojure.core/assoc :alias-id (deser-alias-id (input "AliasId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-non-blank-and-length-constraint-string (input "Name"))) (clojure.core/contains? input "AliasArn") (clojure.core/assoc :alias-arn (deser-arn-string-model (input "AliasArn"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-free-text (input "Description"))) (clojure.core/contains? input "RoutingStrategy") (clojure.core/assoc :routing-strategy (deser-routing-strategy (input "RoutingStrategy"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-timestamp (input "LastUpdatedTime")))))

(clojure.core/defn- deser-routing-strategy [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-routing-strategy-type (input "Type"))) (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-free-text (input "Message")))))

(clojure.core/defn- deser-matchmaker-data [input] input)

(clojure.core/defn- deser-vpc-peering-authorization [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameLiftAwsAccountId") (clojure.core/assoc :game-lift-aws-account-id (deser-non-zero-and-max-string (input "GameLiftAwsAccountId"))) (clojure.core/contains? input "PeerVpcAwsAccountId") (clojure.core/assoc :peer-vpc-aws-account-id (deser-non-zero-and-max-string (input "PeerVpcAwsAccountId"))) (clojure.core/contains? input "PeerVpcId") (clojure.core/assoc :peer-vpc-id (deser-non-zero-and-max-string (input "PeerVpcId"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "ExpirationTime") (clojure.core/assoc :expiration-time (deser-timestamp (input "ExpirationTime")))))

(clojure.core/defn- deser-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event coll))) input))

(clojure.core/defn- deser-fleet-type [input] (clojure.core/get {"ON_DEMAND" :on-demand, "SPOT" :spot} input))

(clojure.core/defn- deser-fleet-capacity [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-ec-2-instance-type (input "InstanceType"))) (clojure.core/contains? input "InstanceCounts") (clojure.core/assoc :instance-counts (deser-ec-2-instance-counts (input "InstanceCounts")))))

(clojure.core/defn- deser-vpc-peering-connection-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-vpc-peering-connection coll))) input))

(clojure.core/defn- deser-player [input] (clojure.core/cond-> {} (clojure.core/contains? input "PlayerId") (clojure.core/assoc :player-id (deser-non-zero-and-max-string (input "PlayerId"))) (clojure.core/contains? input "PlayerAttributes") (clojure.core/assoc :player-attributes (deser-player-attribute-map (input "PlayerAttributes"))) (clojure.core/contains? input "Team") (clojure.core/assoc :team (deser-non-zero-and-max-string (input "Team"))) (clojure.core/contains? input "LatencyInMs") (clojure.core/assoc :latency-in-ms (deser-latency-map (input "LatencyInMs")))))

(clojure.core/defn- deser-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "EventId") (clojure.core/assoc :event-id (deser-non-zero-and-max-string (input "EventId"))) (clojure.core/contains? input "ResourceId") (clojure.core/assoc :resource-id (deser-non-zero-and-max-string (input "ResourceId"))) (clojure.core/contains? input "EventCode") (clojure.core/assoc :event-code (deser-event-code (input "EventCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message"))) (clojure.core/contains? input "EventTime") (clojure.core/assoc :event-time (deser-timestamp (input "EventTime"))) (clojure.core/contains? input "PreSignedLogUrl") (clojure.core/assoc :pre-signed-log-url (deser-non-zero-and-max-string (input "PreSignedLogUrl")))))

(clojure.core/defn- deser-player-latency [input] (clojure.core/cond-> {} (clojure.core/contains? input "PlayerId") (clojure.core/assoc :player-id (deser-non-zero-and-max-string (input "PlayerId"))) (clojure.core/contains? input "RegionIdentifier") (clojure.core/assoc :region-identifier (deser-non-zero-and-max-string (input "RegionIdentifier"))) (clojure.core/contains? input "LatencyInMilliseconds") (clojure.core/assoc :latency-in-milliseconds (deser-float (input "LatencyInMilliseconds")))))

(clojure.core/defn- deser-player-session-creation-policy [input] (clojure.core/get {"ACCEPT_ALL" :accept-all, "DENY_ALL" :deny-all} input))

(clojure.core/defn- deser-game-session-connection-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSessionArn") (clojure.core/assoc :game-session-arn (deser-arn-string-model (input "GameSessionArn"))) (clojure.core/contains? input "IpAddress") (clojure.core/assoc :ip-address (deser-string-model (input "IpAddress"))) (clojure.core/contains? input "Port") (clojure.core/assoc :port (deser-positive-integer (input "Port"))) (clojure.core/contains? input "MatchedPlayerSessions") (clojure.core/assoc :matched-player-sessions (deser-matched-player-session-list (input "MatchedPlayerSessions")))))

(clojure.core/defn- deser-alias-id [input] input)

(clojure.core/defn- deser-matched-player-session-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-matched-player-session coll))) input))

(clojure.core/defn- deser-string-double-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-non-zero-and-max-string k) (deser-double-object v)])) input))

(clojure.core/defn- deser-protection-policy [input] (clojure.core/get {"NoProtection" :no-protection, "FullProtection" :full-protection} input))

(clojure.core/defn- deser-fleet-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "NewGameSessionProtectionPolicy") (clojure.core/assoc :new-game-session-protection-policy (deser-protection-policy (input "NewGameSessionProtectionPolicy"))) (clojure.core/contains? input "TerminationTime") (clojure.core/assoc :termination-time (deser-timestamp (input "TerminationTime"))) (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-ec-2-instance-type (input "InstanceType"))) (clojure.core/contains? input "FleetType") (clojure.core/assoc :fleet-type (deser-fleet-type (input "FleetType"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-fleet-status (input "Status"))) (clojure.core/contains? input "ServerLaunchPath") (clojure.core/assoc :server-launch-path (deser-non-zero-and-max-string (input "ServerLaunchPath"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-non-zero-and-max-string (input "Description"))) (clojure.core/contains? input "ServerLaunchParameters") (clojure.core/assoc :server-launch-parameters (deser-non-zero-and-max-string (input "ServerLaunchParameters"))) (clojure.core/contains? input "MetricGroups") (clojure.core/assoc :metric-groups (deser-metric-group-list (input "MetricGroups"))) (clojure.core/contains? input "StoppedActions") (clojure.core/assoc :stopped-actions (deser-fleet-action-list (input "StoppedActions"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-non-zero-and-max-string (input "Name"))) (clojure.core/contains? input "FleetArn") (clojure.core/assoc :fleet-arn (deser-arn-string-model (input "FleetArn"))) (clojure.core/contains? input "ResourceCreationLimitPolicy") (clojure.core/assoc :resource-creation-limit-policy (deser-resource-creation-limit-policy (input "ResourceCreationLimitPolicy"))) (clojure.core/contains? input "LogPaths") (clojure.core/assoc :log-paths (deser-string-list (input "LogPaths"))) (clojure.core/contains? input "BuildId") (clojure.core/assoc :build-id (deser-build-id (input "BuildId"))) (clojure.core/contains? input "OperatingSystem") (clojure.core/assoc :operating-system (deser-operating-system (input "OperatingSystem")))))

(clojure.core/defn- deser-player-latency-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "MaximumIndividualPlayerLatencyMilliseconds") (clojure.core/assoc :maximum-individual-player-latency-milliseconds (deser-whole-number (input "MaximumIndividualPlayerLatencyMilliseconds"))) (clojure.core/contains? input "PolicyDurationSeconds") (clojure.core/assoc :policy-duration-seconds (deser-whole-number (input "PolicyDurationSeconds")))))

(clojure.core/defn- deser-ec-2-instance-limit [input] (clojure.core/cond-> {} (clojure.core/contains? input "EC2InstanceType") (clojure.core/assoc :ec-2-instance-type (deser-ec-2-instance-type (input "EC2InstanceType"))) (clojure.core/contains? input "CurrentInstances") (clojure.core/assoc :current-instances (deser-whole-number (input "CurrentInstances"))) (clojure.core/contains? input "InstanceLimit") (clojure.core/assoc :instance-limit (deser-whole-number (input "InstanceLimit")))))

(clojure.core/defn- deser-fleet-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fleet-id coll))) input))

(clojure.core/defn- deser-string-model [input] input)

(clojure.core/defn- deser-build-status [input] (clojure.core/get {"INITIALIZED" :initialized, "READY" :ready, "FAILED" :failed} input))

(clojure.core/defn- deser-game-session-data [input] input)

(clojure.core/defn- deser-target-configuration [input] (clojure.core/cond-> {:target-value (deser-double (input "TargetValue"))}))

(clojure.core/defn- deser-player-latency-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-player-latency coll))) input))

(clojure.core/defn- deser-attribute-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "S") (clojure.core/assoc :s (deser-non-zero-and-max-string (input "S"))) (clojure.core/contains? input "N") (clojure.core/assoc :n (deser-double-object (input "N"))) (clojure.core/contains? input "SL") (clojure.core/assoc :sl (deser-string-list (input "SL"))) (clojure.core/contains? input "SDM") (clojure.core/assoc :sdm (deser-string-double-map (input "SDM")))))

(clojure.core/defn- deser-player-session [input] (clojure.core/cond-> {} (clojure.core/contains? input "TerminationTime") (clojure.core/assoc :termination-time (deser-timestamp (input "TerminationTime"))) (clojure.core/contains? input "PlayerData") (clojure.core/assoc :player-data (deser-player-data (input "PlayerData"))) (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-player-session-status (input "Status"))) (clojure.core/contains? input "Port") (clojure.core/assoc :port (deser-port-number (input "Port"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "PlayerId") (clojure.core/assoc :player-id (deser-non-zero-and-max-string (input "PlayerId"))) (clojure.core/contains? input "GameSessionId") (clojure.core/assoc :game-session-id (deser-non-zero-and-max-string (input "GameSessionId"))) (clojure.core/contains? input "IpAddress") (clojure.core/assoc :ip-address (deser-ip-address (input "IpAddress"))) (clojure.core/contains? input "PlayerSessionId") (clojure.core/assoc :player-session-id (deser-player-session-id (input "PlayerSessionId")))))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-alias coll))) input))

(clojure.core/defn- deser-build [input] (clojure.core/cond-> {} (clojure.core/contains? input "BuildId") (clojure.core/assoc :build-id (deser-build-id (input "BuildId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-free-text (input "Name"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-free-text (input "Version"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-build-status (input "Status"))) (clojure.core/contains? input "SizeOnDisk") (clojure.core/assoc :size-on-disk (deser-positive-long (input "SizeOnDisk"))) (clojure.core/contains? input "OperatingSystem") (clojure.core/assoc :operating-system (deser-operating-system (input "OperatingSystem"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-placed-player-session-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-placed-player-session coll))) input))

(clojure.core/defn- deser-ip-permission [input] (clojure.core/cond-> {:from-port (deser-port-number (input "FromPort")), :to-port (deser-port-number (input "ToPort")), :ip-range (deser-non-blank-string (input "IpRange")), :protocol (deser-ip-protocol (input "Protocol"))}))

(clojure.core/defn- deser-game-session [input] (clojure.core/cond-> {} (clojure.core/contains? input "TerminationTime") (clojure.core/assoc :termination-time (deser-timestamp (input "TerminationTime"))) (clojure.core/contains? input "MaximumPlayerSessionCount") (clojure.core/assoc :maximum-player-session-count (deser-whole-number (input "MaximumPlayerSessionCount"))) (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId"))) (clojure.core/contains? input "MatchmakerData") (clojure.core/assoc :matchmaker-data (deser-matchmaker-data (input "MatchmakerData"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-game-session-status (input "Status"))) (clojure.core/contains? input "PlayerSessionCreationPolicy") (clojure.core/assoc :player-session-creation-policy (deser-player-session-creation-policy (input "PlayerSessionCreationPolicy"))) (clojure.core/contains? input "GameSessionData") (clojure.core/assoc :game-session-data (deser-game-session-data (input "GameSessionData"))) (clojure.core/contains? input "StatusReason") (clojure.core/assoc :status-reason (deser-game-session-status-reason (input "StatusReason"))) (clojure.core/contains? input "Port") (clojure.core/assoc :port (deser-port-number (input "Port"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "GameSessionId") (clojure.core/assoc :game-session-id (deser-non-zero-and-max-string (input "GameSessionId"))) (clojure.core/contains? input "IpAddress") (clojure.core/assoc :ip-address (deser-ip-address (input "IpAddress"))) (clojure.core/contains? input "CreatorId") (clojure.core/assoc :creator-id (deser-non-zero-and-max-string (input "CreatorId"))) (clojure.core/contains? input "CurrentPlayerSessionCount") (clojure.core/assoc :current-player-session-count (deser-whole-number (input "CurrentPlayerSessionCount"))) (clojure.core/contains? input "GameProperties") (clojure.core/assoc :game-properties (deser-game-property-list (input "GameProperties"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-non-zero-and-max-string (input "Name")))))

(clojure.core/defn- deser-instance-credentials [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserName") (clojure.core/assoc :user-name (deser-non-empty-string (input "UserName"))) (clojure.core/contains? input "Secret") (clojure.core/assoc :secret (deser-non-empty-string (input "Secret")))))

(clojure.core/defn- deser-game-session-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSession") (clojure.core/assoc :game-session (deser-game-session (input "GameSession"))) (clojure.core/contains? input "ProtectionPolicy") (clojure.core/assoc :protection-policy (deser-protection-policy (input "ProtectionPolicy")))))

(clojure.core/defn- deser-vpc-peering-authorization-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-vpc-peering-authorization coll))) input))

(clojure.core/defn- deser-positive-integer [input] input)

(clojure.core/defn- deser-s-3-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "Bucket") (clojure.core/assoc :bucket (deser-non-empty-string (input "Bucket"))) (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-non-empty-string (input "Key"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-non-empty-string (input "RoleArn")))))

(clojure.core/defn- deser-comparison-operator-type [input] (clojure.core/get {"GreaterThanOrEqualToThreshold" :greater-than-or-equal-to-threshold, "GreaterThanThreshold" :greater-than-threshold, "LessThanThreshold" :less-than-threshold, "LessThanOrEqualToThreshold" :less-than-or-equal-to-threshold} input))

(clojure.core/defn- deser-game-property-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-game-property coll))) input))

(clojure.core/defn- deser-instance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance coll))) input))

(clojure.core/defn- deser-matchmaking-ticket [input] (clojure.core/cond-> {} (clojure.core/contains? input "TicketId") (clojure.core/assoc :ticket-id (deser-matchmaking-id-string-model (input "TicketId"))) (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "EstimatedWaitTime") (clojure.core/assoc :estimated-wait-time (deser-whole-number (input "EstimatedWaitTime"))) (clojure.core/contains? input "Players") (clojure.core/assoc :players (deser-player-list (input "Players"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-timestamp (input "StartTime"))) (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-string-model (input "StatusMessage"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-matchmaking-configuration-status (input "Status"))) (clojure.core/contains? input "GameSessionConnectionInfo") (clojure.core/assoc :game-session-connection-info (deser-game-session-connection-info (input "GameSessionConnectionInfo"))) (clojure.core/contains? input "StatusReason") (clojure.core/assoc :status-reason (deser-string-model (input "StatusReason"))) (clojure.core/contains? input "ConfigurationName") (clojure.core/assoc :configuration-name (deser-matchmaking-id-string-model (input "ConfigurationName")))))

(clojure.core/defn- deser-matchmaking-rule-set [input] (clojure.core/cond-> {:rule-set-body (deser-rule-set-body (input "RuleSetBody"))} (clojure.core/contains? input "RuleSetName") (clojure.core/assoc :rule-set-name (deser-matchmaking-id-string-model (input "RuleSetName"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime")))))

(clojure.core/defn- deser-matchmaking-id-string-model [input] input)

(clojure.core/defn- deser-routing-strategy-type [input] (clojure.core/get {"SIMPLE" :simple, "TERMINAL" :terminal} input))

(clojure.core/defn- deser-game-session-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-game-session-detail coll))) input))

(clojure.core/defn- deser-ip-address [input] input)

(clojure.core/defn- deser-metric-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-group coll))) input))

(clojure.core/defn- deser-scaling-policy-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scaling-policy coll))) input))

(clojure.core/defn- deser-player-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-player coll))) input))

(clojure.core/defn- deser-scaling-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "Threshold") (clojure.core/assoc :threshold (deser-double (input "Threshold"))) (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId"))) (clojure.core/contains? input "ScalingAdjustment") (clojure.core/assoc :scaling-adjustment (deser-integer (input "ScalingAdjustment"))) (clojure.core/contains? input "ComparisonOperator") (clojure.core/assoc :comparison-operator (deser-comparison-operator-type (input "ComparisonOperator"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-scaling-status-type (input "Status"))) (clojure.core/contains? input "TargetConfiguration") (clojure.core/assoc :target-configuration (deser-target-configuration (input "TargetConfiguration"))) (clojure.core/contains? input "MetricName") (clojure.core/assoc :metric-name (deser-metric-name (input "MetricName"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-non-zero-and-max-string (input "Name"))) (clojure.core/contains? input "EvaluationPeriods") (clojure.core/assoc :evaluation-periods (deser-positive-integer (input "EvaluationPeriods"))) (clojure.core/contains? input "ScalingAdjustmentType") (clojure.core/assoc :scaling-adjustment-type (deser-scaling-adjustment-type (input "ScalingAdjustmentType"))) (clojure.core/contains? input "PolicyType") (clojure.core/assoc :policy-type (deser-policy-type (input "PolicyType")))))

(clojure.core/defn- deser-ec-2-instance-counts [input] (clojure.core/cond-> {} (clojure.core/contains? input "DESIRED") (clojure.core/assoc :desired (deser-whole-number (input "DESIRED"))) (clojure.core/contains? input "MINIMUM") (clojure.core/assoc :minimum (deser-whole-number (input "MINIMUM"))) (clojure.core/contains? input "MAXIMUM") (clojure.core/assoc :maximum (deser-whole-number (input "MAXIMUM"))) (clojure.core/contains? input "PENDING") (clojure.core/assoc :pending (deser-whole-number (input "PENDING"))) (clojure.core/contains? input "ACTIVE") (clojure.core/assoc :active (deser-whole-number (input "ACTIVE"))) (clojure.core/contains? input "IDLE") (clojure.core/assoc :idle (deser-whole-number (input "IDLE"))) (clojure.core/contains? input "TERMINATING") (clojure.core/assoc :terminating (deser-whole-number (input "TERMINATING")))))

(clojure.core/defn- deser-instance-access [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId"))) (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-instance-id (input "InstanceId"))) (clojure.core/contains? input "IpAddress") (clojure.core/assoc :ip-address (deser-ip-address (input "IpAddress"))) (clojure.core/contains? input "OperatingSystem") (clojure.core/assoc :operating-system (deser-operating-system (input "OperatingSystem"))) (clojure.core/contains? input "Credentials") (clojure.core/assoc :credentials (deser-instance-credentials (input "Credentials")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-player-session-id [input] input)

(clojure.core/defn- deser-latency-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-non-empty-string k) (deser-positive-integer v)])) input))

(clojure.core/defn- deser-fleet-utilization [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId"))) (clojure.core/contains? input "ActiveServerProcessCount") (clojure.core/assoc :active-server-process-count (deser-whole-number (input "ActiveServerProcessCount"))) (clojure.core/contains? input "ActiveGameSessionCount") (clojure.core/assoc :active-game-session-count (deser-whole-number (input "ActiveGameSessionCount"))) (clojure.core/contains? input "CurrentPlayerSessionCount") (clojure.core/assoc :current-player-session-count (deser-whole-number (input "CurrentPlayerSessionCount"))) (clojure.core/contains? input "MaximumPlayerSessionCount") (clojure.core/assoc :maximum-player-session-count (deser-whole-number (input "MaximumPlayerSessionCount")))))

(clojure.core/defn- deser-player-session-status [input] (clojure.core/get {"RESERVED" :reserved, "ACTIVE" :active, "COMPLETED" :completed, "TIMEDOUT" :timedout} input))

(clojure.core/defn- deser-game-session-queue-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-game-session-queue coll))) input))

(clojure.core/defn- deser-metric-name [input] (clojure.core/get {"PercentIdleInstances" :percent-idle-instances, "WaitTime" :wait-time, "QueueDepth" :queue-depth, "AvailablePlayerSessions" :available-player-sessions, "AvailableGameSessions" :available-game-sessions, "ActiveInstances" :active-instances, "ActivatingGameSessions" :activating-game-sessions, "IdleInstances" :idle-instances, "CurrentPlayerSessions" :current-player-sessions, "ActiveGameSessions" :active-game-sessions, "PercentAvailableGameSessions" :percent-available-game-sessions} input))

(clojure.core/defn- deser-instance-status [input] (clojure.core/get {"PENDING" :pending, "ACTIVE" :active, "TERMINATING" :terminating} input))

(clojure.core/defn- deser-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId"))) (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-instance-id (input "InstanceId"))) (clojure.core/contains? input "IpAddress") (clojure.core/assoc :ip-address (deser-ip-address (input "IpAddress"))) (clojure.core/contains? input "OperatingSystem") (clojure.core/assoc :operating-system (deser-operating-system (input "OperatingSystem"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-ec-2-instance-type (input "Type"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-instance-status (input "Status"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime")))))

(clojure.core/defn- deser-max-concurrent-game-session-activations [input] input)

(clojure.core/defn- deser-fleet-status [input] (clojure.core/get {"NEW" :new, "ACTIVATING" :activating, "TERMINATED" :terminated, "ERROR" :error, "BUILDING" :building, "DOWNLOADING" :downloading, "DELETING" :deleting, "ACTIVE" :active, "VALIDATING" :validating} input))

(clojure.core/defn- deser-free-text [input] input)

(clojure.core/defn- deser-arn-string-model [input] input)

(clojure.core/defn- deser-fleet-action [input] (clojure.core/get {"AUTO_SCALING" :auto-scaling} input))

(clojure.core/defn- deser-game-session-activation-timeout-seconds [input] input)

(clojure.core/defn- deser-scaling-adjustment-type [input] (clojure.core/get {"ChangeInCapacity" :change-in-capacity, "ExactCapacity" :exact-capacity, "PercentChangeInCapacity" :percent-change-in-capacity} input))

(clojure.core/defn- deser-matchmaking-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-matchmaking-configuration coll))) input))

(clojure.core/defn- deser-matchmaking-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "AcceptanceRequired") (clojure.core/assoc :acceptance-required (deser-boolean-model (input "AcceptanceRequired"))) (clojure.core/contains? input "CustomEventData") (clojure.core/assoc :custom-event-data (deser-custom-event-data (input "CustomEventData"))) (clojure.core/contains? input "GameSessionQueueArns") (clojure.core/assoc :game-session-queue-arns (deser-queue-arns-list (input "GameSessionQueueArns"))) (clojure.core/contains? input "RuleSetName") (clojure.core/assoc :rule-set-name (deser-matchmaking-id-string-model (input "RuleSetName"))) (clojure.core/contains? input "GameSessionData") (clojure.core/assoc :game-session-data (deser-game-session-data (input "GameSessionData"))) (clojure.core/contains? input "RequestTimeoutSeconds") (clojure.core/assoc :request-timeout-seconds (deser-matchmaking-request-timeout-integer (input "RequestTimeoutSeconds"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-non-zero-and-max-string (input "Description"))) (clojure.core/contains? input "AcceptanceTimeoutSeconds") (clojure.core/assoc :acceptance-timeout-seconds (deser-matchmaking-acceptance-timeout-integer (input "AcceptanceTimeoutSeconds"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "AdditionalPlayerCount") (clojure.core/assoc :additional-player-count (deser-whole-number (input "AdditionalPlayerCount"))) (clojure.core/contains? input "GameProperties") (clojure.core/assoc :game-properties (deser-game-property-list (input "GameProperties"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-matchmaking-id-string-model (input "Name"))) (clojure.core/contains? input "NotificationTarget") (clojure.core/assoc :notification-target (deser-sns-arn-string-model (input "NotificationTarget")))))

(clojure.core/defn- deser-non-blank-string [input] input)

(clojure.core/defn- deser-port-number [input] input)

(clojure.core/defn- deser-policy-type [input] (clojure.core/get {"RuleBased" :rule-based, "TargetBased" :target-based} input))

(clojure.core/defn- deser-game-session-queue-name [input] input)

(clojure.core/defn- deser-positive-long [input] input)

(clojure.core/defn- deser-float [input] input)

(clojure.core/defn- deser-server-process-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-process coll))) input))

(clojure.core/defn- deser-server-process [input] (clojure.core/cond-> {:launch-path (deser-non-zero-and-max-string (input "LaunchPath")), :concurrent-executions (deser-positive-integer (input "ConcurrentExecutions"))} (clojure.core/contains? input "Parameters") (clojure.core/assoc :parameters (deser-non-zero-and-max-string (input "Parameters")))))

(clojure.core/defn- deser-game-session-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-game-session coll))) input))

(clojure.core/defn- deser-resource-creation-limit-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "NewGameSessionsPerCreator") (clojure.core/assoc :new-game-sessions-per-creator (deser-whole-number (input "NewGameSessionsPerCreator"))) (clojure.core/contains? input "PolicyPeriodInMinutes") (clojure.core/assoc :policy-period-in-minutes (deser-whole-number (input "PolicyPeriodInMinutes")))))

(clojure.core/defn- deser-fleet-capacity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fleet-capacity coll))) input))

(clojure.core/defn- deser-build-id [input] input)

(clojure.core/defn- deser-operating-system [input] (clojure.core/get {"WINDOWS_2012" :windows-2012, "AMAZON_LINUX" :amazon-linux} input))

(clojure.core/defn- deser-scaling-status-type [input] (clojure.core/get {"ACTIVE" :active, "UPDATE_REQUESTED" :update-requested, "UPDATING" :updating, "DELETE_REQUESTED" :delete-requested, "DELETING" :deleting, "DELETED" :deleted, "ERROR" :error} input))

(clojure.core/defn- deser-game-session-placement [input] (clojure.core/cond-> {} (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "StartTime") (clojure.core/assoc :start-time (deser-timestamp (input "StartTime"))) (clojure.core/contains? input "MaximumPlayerSessionCount") (clojure.core/assoc :maximum-player-session-count (deser-whole-number (input "MaximumPlayerSessionCount"))) (clojure.core/contains? input "PlacementId") (clojure.core/assoc :placement-id (deser-id-string-model (input "PlacementId"))) (clojure.core/contains? input "MatchmakerData") (clojure.core/assoc :matchmaker-data (deser-matchmaker-data (input "MatchmakerData"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-game-session-placement-state (input "Status"))) (clojure.core/contains? input "GameSessionData") (clojure.core/assoc :game-session-data (deser-game-session-data (input "GameSessionData"))) (clojure.core/contains? input "Port") (clojure.core/assoc :port (deser-port-number (input "Port"))) (clojure.core/contains? input "PlayerLatencies") (clojure.core/assoc :player-latencies (deser-player-latency-list (input "PlayerLatencies"))) (clojure.core/contains? input "GameSessionArn") (clojure.core/assoc :game-session-arn (deser-non-zero-and-max-string (input "GameSessionArn"))) (clojure.core/contains? input "PlacedPlayerSessions") (clojure.core/assoc :placed-player-sessions (deser-placed-player-session-list (input "PlacedPlayerSessions"))) (clojure.core/contains? input "GameSessionName") (clojure.core/assoc :game-session-name (deser-non-zero-and-max-string (input "GameSessionName"))) (clojure.core/contains? input "GameSessionId") (clojure.core/assoc :game-session-id (deser-non-zero-and-max-string (input "GameSessionId"))) (clojure.core/contains? input "GameSessionRegion") (clojure.core/assoc :game-session-region (deser-non-zero-and-max-string (input "GameSessionRegion"))) (clojure.core/contains? input "IpAddress") (clojure.core/assoc :ip-address (deser-ip-address (input "IpAddress"))) (clojure.core/contains? input "GameProperties") (clojure.core/assoc :game-properties (deser-game-property-list (input "GameProperties"))) (clojure.core/contains? input "GameSessionQueueName") (clojure.core/assoc :game-session-queue-name (deser-game-session-queue-name (input "GameSessionQueueName")))))

(clojure.core/defn- deser-unauthorized-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-describe-game-session-details-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSessionDetails") (clojure.core/assoc :game-session-details (deser-game-session-detail-list (input "GameSessionDetails"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-describe-matchmaking-rule-sets-output [input] (clojure.core/cond-> {:rule-sets (deser-matchmaking-rule-set-list (input "RuleSets"))} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-describe-fleet-utilization-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetUtilization") (clojure.core/assoc :fleet-utilization (deser-fleet-utilization-list (input "FleetUtilization"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-game-session-full-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-create-player-session-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "PlayerSession") (clojure.core/assoc :player-session (deser-player-session (input "PlayerSession")))))

(clojure.core/defn- deser-update-fleet-attributes-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId")))))

(clojure.core/defn- deser-invalid-request-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-update-matchmaking-configuration-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Configuration") (clojure.core/assoc :configuration (deser-matchmaking-configuration (input "Configuration")))))

(clojure.core/defn- deser-describe-game-session-placement-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSessionPlacement") (clojure.core/assoc :game-session-placement (deser-game-session-placement (input "GameSessionPlacement")))))

(clojure.core/defn- deser-get-game-session-log-url-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "PreSignedUrl") (clojure.core/assoc :pre-signed-url (deser-non-zero-and-max-string (input "PreSignedUrl")))))

(clojure.core/defn- deser-create-game-session-queue-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSessionQueue") (clojure.core/assoc :game-session-queue (deser-game-session-queue (input "GameSessionQueue")))))

(clojure.core/defn- deser-terminal-routing-strategy-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-update-game-session-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSession") (clojure.core/assoc :game-session (deser-game-session (input "GameSession")))))

(clojure.core/defn- deser-create-vpc-peering-connection-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-fleet-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetAttributes") (clojure.core/assoc :fleet-attributes (deser-fleet-attributes (input "FleetAttributes")))))

(clojure.core/defn- deser-describe-game-session-queues-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSessionQueues") (clojure.core/assoc :game-session-queues (deser-game-session-queue-list (input "GameSessionQueues"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-start-matchmaking-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "MatchmakingTicket") (clojure.core/assoc :matchmaking-ticket (deser-matchmaking-ticket (input "MatchmakingTicket")))))

(clojure.core/defn- deser-create-player-sessions-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "PlayerSessions") (clojure.core/assoc :player-sessions (deser-player-session-list (input "PlayerSessions")))))

(clojure.core/defn- deser-delete-game-session-queue-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-invalid-game-session-status-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-start-match-backfill-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "MatchmakingTicket") (clojure.core/assoc :matchmaking-ticket (deser-matchmaking-ticket (input "MatchmakingTicket")))))

(clojure.core/defn- deser-describe-alias-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Alias") (clojure.core/assoc :alias (deser-alias (input "Alias")))))

(clojure.core/defn- deser-update-runtime-configuration-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "RuntimeConfiguration") (clojure.core/assoc :runtime-configuration (deser-runtime-configuration (input "RuntimeConfiguration")))))

(clojure.core/defn- deser-fleet-capacity-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-create-matchmaking-configuration-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Configuration") (clojure.core/assoc :configuration (deser-matchmaking-configuration (input "Configuration")))))

(clojure.core/defn- deser-request-upload-credentials-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "UploadCredentials") (clojure.core/assoc :upload-credentials (deser-aws-credentials (input "UploadCredentials"))) (clojure.core/contains? input "StorageLocation") (clojure.core/assoc :storage-location (deser-s-3-location (input "StorageLocation")))))

(clojure.core/defn- deser-update-alias-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Alias") (clojure.core/assoc :alias (deser-alias (input "Alias")))))

(clojure.core/defn- deser-list-builds-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Builds") (clojure.core/assoc :builds (deser-build-list (input "Builds"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-empty-string (input "NextToken")))))

(clojure.core/defn- deser-stop-fleet-actions-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-game-session-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSession") (clojure.core/assoc :game-session (deser-game-session (input "GameSession")))))

(clojure.core/defn- deser-create-alias-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Alias") (clojure.core/assoc :alias (deser-alias (input "Alias")))))

(clojure.core/defn- deser-describe-game-sessions-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSessions") (clojure.core/assoc :game-sessions (deser-game-session-list (input "GameSessions"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-update-game-session-queue-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSessionQueue") (clojure.core/assoc :game-session-queue (deser-game-session-queue (input "GameSessionQueue")))))

(clojure.core/defn- deser-describe-fleet-attributes-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetAttributes") (clojure.core/assoc :fleet-attributes (deser-fleet-attributes-list (input "FleetAttributes"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-create-vpc-peering-authorization-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "VpcPeeringAuthorization") (clojure.core/assoc :vpc-peering-authorization (deser-vpc-peering-authorization (input "VpcPeeringAuthorization")))))

(clojure.core/defn- deser-unsupported-region-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-describe-vpc-peering-authorizations-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "VpcPeeringAuthorizations") (clojure.core/assoc :vpc-peering-authorizations (deser-vpc-peering-authorization-list (input "VpcPeeringAuthorizations")))))

(clojure.core/defn- deser-stop-matchmaking-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-conflict-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-idempotent-parameter-mismatch-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-create-matchmaking-rule-set-output [input] (clojure.core/cond-> {:rule-set (deser-matchmaking-rule-set (input "RuleSet"))}))

(clojure.core/defn- deser-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-describe-fleet-events-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Events") (clojure.core/assoc :events (deser-event-list (input "Events"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-list-aliases-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Aliases") (clojure.core/assoc :aliases (deser-alias-list (input "Aliases"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-empty-string (input "NextToken")))))

(clojure.core/defn- deser-stop-game-session-placement-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSessionPlacement") (clojure.core/assoc :game-session-placement (deser-game-session-placement (input "GameSessionPlacement")))))

(clojure.core/defn- deser-update-build-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Build") (clojure.core/assoc :build (deser-build (input "Build")))))

(clojure.core/defn- deser-delete-matchmaking-configuration-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-search-game-sessions-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSessions") (clojure.core/assoc :game-sessions (deser-game-session-list (input "GameSessions"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-list-fleets-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetIds") (clojure.core/assoc :fleet-ids (deser-fleet-id-list (input "FleetIds"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-start-fleet-actions-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-build-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Build") (clojure.core/assoc :build (deser-build (input "Build")))))

(clojure.core/defn- deser-invalid-fleet-status-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-describe-matchmaking-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "TicketList") (clojure.core/assoc :ticket-list (deser-matchmaking-ticket-list (input "TicketList")))))

(clojure.core/defn- deser-delete-vpc-peering-connection-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-put-scaling-policy-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-non-zero-and-max-string (input "Name")))))

(clojure.core/defn- deser-start-game-session-placement-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "GameSessionPlacement") (clojure.core/assoc :game-session-placement (deser-game-session-placement (input "GameSessionPlacement")))))

(clojure.core/defn- deser-delete-vpc-peering-authorization-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-fleet-port-settings-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "InboundPermissions") (clojure.core/assoc :inbound-permissions (deser-ip-permissions-list (input "InboundPermissions")))))

(clojure.core/defn- deser-update-fleet-port-settings-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId")))))

(clojure.core/defn- deser-describe-vpc-peering-connections-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "VpcPeeringConnections") (clojure.core/assoc :vpc-peering-connections (deser-vpc-peering-connection-list (input "VpcPeeringConnections")))))

(clojure.core/defn- deser-describe-instances-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Instances") (clojure.core/assoc :instances (deser-instance-list (input "Instances"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-describe-scaling-policies-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "ScalingPolicies") (clojure.core/assoc :scaling-policies (deser-scaling-policy-list (input "ScalingPolicies"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-describe-player-sessions-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "PlayerSessions") (clojure.core/assoc :player-sessions (deser-player-session-list (input "PlayerSessions"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-get-instance-access-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceAccess") (clojure.core/assoc :instance-access (deser-instance-access (input "InstanceAccess")))))

(clojure.core/defn- deser-resolve-alias-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId")))))

(clojure.core/defn- deser-describe-runtime-configuration-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "RuntimeConfiguration") (clojure.core/assoc :runtime-configuration (deser-runtime-configuration (input "RuntimeConfiguration")))))

(clojure.core/defn- deser-describe-fleet-capacity-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetCapacity") (clojure.core/assoc :fleet-capacity (deser-fleet-capacity-list (input "FleetCapacity"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-create-build-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Build") (clojure.core/assoc :build (deser-build (input "Build"))) (clojure.core/contains? input "UploadCredentials") (clojure.core/assoc :upload-credentials (deser-aws-credentials (input "UploadCredentials"))) (clojure.core/contains? input "StorageLocation") (clojure.core/assoc :storage-location (deser-s-3-location (input "StorageLocation")))))

(clojure.core/defn- deser-internal-service-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-non-empty-string (input "Message")))))

(clojure.core/defn- deser-describe-matchmaking-configurations-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Configurations") (clojure.core/assoc :configurations (deser-matchmaking-configuration-list (input "Configurations"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-non-zero-and-max-string (input "NextToken")))))

(clojure.core/defn- deser-validate-matchmaking-rule-set-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Valid") (clojure.core/assoc :valid (deser-boolean-model (input "Valid")))))

(clojure.core/defn- deser-update-fleet-capacity-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetId") (clojure.core/assoc :fleet-id (deser-fleet-id (input "FleetId")))))

(clojure.core/defn- deser-describe-ec-2-instance-limits-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "EC2InstanceLimits") (clojure.core/assoc :ec-2-instance-limits (deser-ec-2-instance-limit-list (input "EC2InstanceLimits")))))

(clojure.core/defn- deser-accept-match-output [input] (clojure.core/cond-> {}))

(clojure.spec.alpha/def :portkey.aws.gamelift/metric-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.gamelift/event-code #{:server-process-invalid-path "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT" :fleet-scaling-event "SERVER_PROCESS_INVALID_PATH" :fleet-vpc-peering-deleted "FLEET_INITIALIZATION_FAILED" "FLEET_STATE_VALIDATING" "FLEET_VPC_PEERING_SUCCEEDED" :server-process-crashed :server-process-force-terminated "FLEET_VPC_PEERING_DELETED" "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT" "SERVER_PROCESS_PROCESS_READY_TIMEOUT" "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED" "FLEET_STATE_ACTIVE" :instance-interrupted :fleet-initialization-failed "FLEET_BINARY_DOWNLOAD_FAILED" :game-session-activation-timeout :fleet-activation-failed "INSTANCE_INTERRUPTED" "FLEET_STATE_ACTIVATING" :fleet-state-building :fleet-state-downloading "GENERIC_EVENT" :fleet-state-validating :fleet-validation-timed-out :fleet-state-error "FLEET_STATE_ERROR" :fleet-vpc-peering-succeeded "FLEET_VPC_PEERING_FAILED" :fleet-creation-validating-runtime-config :server-process-process-exit-timeout :fleet-creation-running-installer "FLEET_CREATED" :fleet-validation-launch-path-not-found "FLEET_CREATION_RUNNING_INSTALLER" :fleet-binary-download-failed "FLEET_STATE_BUILDING" :fleet-validation-executable-runtime-failure "FLEET_DELETED" "GAME_SESSION_ACTIVATION_TIMEOUT" "FLEET_VALIDATION_TIMED_OUT" :fleet-activation-failed-no-instances :server-process-process-ready-timeout :fleet-state-activating "FLEET_ACTIVATION_FAILED" :fleet-deleted "FLEET_STATE_DOWNLOADING" "SERVER_PROCESS_CRASHED" "FLEET_ACTIVATION_FAILED_NO_INSTANCES" :server-process-sdk-initialization-timeout :fleet-state-active "FLEET_CREATION_EXTRACTING_BUILD" :generic-event "SERVER_PROCESS_FORCE_TERMINATED" "FLEET_SCALING_EVENT" :fleet-creation-extracting-build "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE" "SERVER_PROCESS_TERMINATED_UNHEALTHY" "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND" :fleet-created "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG" :fleet-new-game-session-protection-policy-updated :server-process-terminated-unhealthy :fleet-vpc-peering-failed})

(clojure.spec.alpha/def :portkey.aws.gamelift.create-vpc-peering-authorization-input/game-lift-aws-account-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-vpc-peering-authorization-input/peer-vpc-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-vpc-peering-authorization-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.create-vpc-peering-authorization-input/game-lift-aws-account-id :portkey.aws.gamelift.create-vpc-peering-authorization-input/peer-vpc-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/non-blank-and-length-constraint-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #".*\S.*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift/player-session-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/player-session))

(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-connection-status/code (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-connection-status/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/vpc-peering-connection-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.vpc-peering-connection-status/code :portkey.aws.gamelift.vpc-peering-connection-status/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift.stop-fleet-actions-input/actions (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-action-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/stop-fleet-actions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.stop-fleet-actions-input/actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/non-zero-and-max-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.gamelift/queue-arns-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/arn-string-model))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-rule-sets-input/names (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-rule-set-name-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-rule-sets-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/rule-set-limit))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-rule-sets-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-matchmaking-rule-sets-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-matchmaking-rule-sets-input/names :portkey.aws.gamelift.describe-matchmaking-rule-sets-input/limit :portkey.aws.gamelift.describe-matchmaking-rule-sets-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/string-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/non-zero-and-max-string))

(clojure.spec.alpha/def :portkey.aws.gamelift.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift/rule-set-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.gamelift/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.gamelift.update-fleet-capacity-input/desired-instances (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-fleet-capacity-input/min-size (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-fleet-capacity-input/max-size (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift/update-fleet-capacity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id] :opt-un [:portkey.aws.gamelift.update-fleet-capacity-input/desired-instances :portkey.aws.gamelift.update-fleet-capacity-input/min-size :portkey.aws.gamelift.update-fleet-capacity-input/max-size]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-details-output/game-session-details (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-detail-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-details-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-game-session-details-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-game-session-details-output/game-session-details :portkey.aws.gamelift.describe-game-session-details-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-rule-sets-output/rule-sets (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-rule-set-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-rule-sets-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-matchmaking-rule-sets-output (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.describe-matchmaking-rule-sets-output/rule-sets] :opt-un [:portkey.aws.gamelift.describe-matchmaking-rule-sets-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-property-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-instances-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-instances-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id] :opt-un [:portkey.aws.gamelift/instance-id :portkey.aws.gamelift.describe-instances-input/limit :portkey.aws.gamelift.describe-instances-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-status-reason #{"INTERRUPTED" :interrupted})

(clojure.spec.alpha/def :portkey.aws.gamelift.list-fleets-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.list-fleets-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/list-fleets-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/build-id :portkey.aws.gamelift.list-fleets-input/limit :portkey.aws.gamelift.list-fleets-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.update-build-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-build-input/version (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/update-build-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/build-id] :opt-un [:portkey.aws.gamelift.update-build-input/name :portkey.aws.gamelift.update-build-input/version]))

(clojure.spec.alpha/def :portkey.aws.gamelift/request-upload-credentials-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/build-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-utilization-output/fleet-utilization (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-utilization-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-utilization-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-fleet-utilization-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-fleet-utilization-output/fleet-utilization :portkey.aws.gamelift.describe-fleet-utilization-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-queues-input/names (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-queue-name-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-queues-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-queues-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-game-session-queues-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-game-session-queues-input/names :portkey.aws.gamelift.describe-game-session-queues-input/limit :portkey.aws.gamelift.describe-game-session-queues-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/ec-2-instance-type #{:r-3large :c-4xlarge :c-3xlarge :r-48xlarge :t-2small "r4.2xlarge" :c-48xlarge "r3.8xlarge" "m3.2xlarge" "c3.8xlarge" "t2.large" :m-42xlarge "m4.4xlarge" "r4.16xlarge" :t-2large :c-34xlarge :r-34xlarge :m-32xlarge "c3.2xlarge" "c4.8xlarge" :r-4large :c-3large "c3.4xlarge" :t-2micro :c-38xlarge "t2.micro" :r-416xlarge :r-38xlarge "m4.2xlarge" :r-32xlarge "m4.10xlarge" "c4.4xlarge" "r3.xlarge" :c-44xlarge :t-2medium :r-3xlarge "c4.2xlarge" :r-42xlarge "t2.small" "r4.xlarge" :m-3large "m3.xlarge" "r3.2xlarge" :c-32xlarge :c-42xlarge "r3.4xlarge" :r-44xlarge :m-44xlarge "c4.xlarge" "m4.large" :m-410xlarge "r3.large" "c4.large" :m-3medium "m4.xlarge" :c-4large :r-4xlarge :m-4xlarge :m-3xlarge "r4.large" "c3.xlarge" :m-4large "r4.8xlarge" "t2.medium" "c3.large" "m3.medium" "m3.large" "r4.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.gamelift/instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\.-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift.game-property/key (clojure.spec.alpha/and :portkey.aws.gamelift/game-property-key))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-property/value (clojure.spec.alpha/and :portkey.aws.gamelift/game-property-value))
(clojure.spec.alpha/def :portkey.aws.gamelift/game-property (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.game-property/key :portkey.aws.gamelift.game-property/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-player-session-input/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-player-session-input/player-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-player-session-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.create-player-session-input/game-session-id :portkey.aws.gamelift.create-player-session-input/player-id] :opt-un [:portkey.aws.gamelift/player-data]))

(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-queue/name (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-queue-name))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-queue/game-session-queue-arn (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-queue/timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-queue/player-latency-policies (clojure.spec.alpha/and :portkey.aws.gamelift/player-latency-policy-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-queue/destinations (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-queue-destination-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-queue (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.game-session-queue/name :portkey.aws.gamelift.game-session-queue/game-session-queue-arn :portkey.aws.gamelift.game-session-queue/timeout-in-seconds :portkey.aws.gamelift.game-session-queue/player-latency-policies :portkey.aws.gamelift.game-session-queue/destinations]))

(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-connection/ip-v-4-cidr-block (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-connection/vpc-peering-connection-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-connection/status (clojure.spec.alpha/and :portkey.aws.gamelift/vpc-peering-connection-status))
(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-connection/peer-vpc-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-connection/game-lift-vpc-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/vpc-peering-connection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.vpc-peering-connection/ip-v-4-cidr-block :portkey.aws.gamelift.vpc-peering-connection/vpc-peering-connection-id :portkey.aws.gamelift.vpc-peering-connection/status :portkey.aws.gamelift.vpc-peering-connection/peer-vpc-id :portkey.aws.gamelift.vpc-peering-connection/game-lift-vpc-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-full-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-full-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.game-session-full-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-ticket-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/matchmaking-ticket))

(clojure.spec.alpha/def :portkey.aws.gamelift/create-player-session-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/player-session]))

(clojure.spec.alpha/def :portkey.aws.gamelift/update-fleet-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-events-input/start-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-events-input/end-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-events-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-events-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-fleet-events-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id] :opt-un [:portkey.aws.gamelift.describe-fleet-events-input/start-time :portkey.aws.gamelift.describe-fleet-events-input/end-time :portkey.aws.gamelift.describe-fleet-events-input/limit :portkey.aws.gamelift.describe-fleet-events-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-alias-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/alias-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-property-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 96))))

(clojure.spec.alpha/def :portkey.aws.gamelift/double-object clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.gamelift/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__)))))

(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-rule-set-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/matchmaking-rule-set))

(clojure.spec.alpha/def :portkey.aws.gamelift/player-attribute-map (clojure.spec.alpha/map-of :portkey.aws.gamelift/non-zero-and-max-string :portkey.aws.gamelift/attribute-value))

(clojure.spec.alpha/def :portkey.aws.gamelift/ec-2-instance-limit-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/ec-2-instance-limit))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-vpc-peering-connection-input/peer-vpc-aws-account-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-vpc-peering-connection-input/peer-vpc-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-vpc-peering-connection-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.create-vpc-peering-connection-input/peer-vpc-aws-account-id :portkey.aws.gamelift.create-vpc-peering-connection-input/peer-vpc-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-alias-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-blank-and-length-constraint-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-alias-input/description (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-alias-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.create-alias-input/name :portkey.aws.gamelift/routing-strategy] :opt-un [:portkey.aws.gamelift.create-alias-input/description]))

(clojure.spec.alpha/def :portkey.aws.gamelift/sns-arn-string-model (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 300)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_/-]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift.update-alias-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-blank-and-length-constraint-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-alias-input/description (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/update-alias-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/alias-id] :opt-un [:portkey.aws.gamelift.update-alias-input/name :portkey.aws.gamelift.update-alias-input/description :portkey.aws.gamelift/routing-strategy]))

(clojure.spec.alpha/def :portkey.aws.gamelift.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift.update-fleet-attributes-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-fleet-attributes-input/description (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-fleet-attributes-input/new-game-session-protection-policy (clojure.spec.alpha/and :portkey.aws.gamelift/protection-policy))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-fleet-attributes-input/metric-groups (clojure.spec.alpha/and :portkey.aws.gamelift/metric-group-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/update-fleet-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id] :opt-un [:portkey.aws.gamelift.update-fleet-attributes-input/name :portkey.aws.gamelift.update-fleet-attributes-input/description :portkey.aws.gamelift.update-fleet-attributes-input/new-game-session-protection-policy :portkey.aws.gamelift/resource-creation-limit-policy :portkey.aws.gamelift.update-fleet-attributes-input/metric-groups]))

(clojure.spec.alpha/def :portkey.aws.gamelift/ip-protocol #{:tcp "TCP" :udp "UDP"})

(clojure.spec.alpha/def :portkey.aws.gamelift/custom-event-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.gamelift/build-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/build))

(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-output/configuration (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-configuration))
(clojure.spec.alpha/def :portkey.aws.gamelift/update-matchmaking-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.update-matchmaking-configuration-output/configuration]))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-game-session-placement-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/game-session-placement]))

(clojure.spec.alpha/def :portkey.aws.gamelift.start-match-backfill-input/ticket-id (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.start-match-backfill-input/configuration-name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.start-match-backfill-input/game-session-arn (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.start-match-backfill-input/players (clojure.spec.alpha/and :portkey.aws.gamelift/player-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/start-match-backfill-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.start-match-backfill-input/configuration-name :portkey.aws.gamelift.start-match-backfill-input/game-session-arn :portkey.aws.gamelift.start-match-backfill-input/players] :opt-un [:portkey.aws.gamelift.start-match-backfill-input/ticket-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift/id-string-model (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 48)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-game-session-queue-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-queue-name))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-game-session-queue-input/timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-game-session-queue-input/player-latency-policies (clojure.spec.alpha/and :portkey.aws.gamelift/player-latency-policy-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-game-session-queue-input/destinations (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-queue-destination-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-game-session-queue-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.create-game-session-queue-input/name] :opt-un [:portkey.aws.gamelift.create-game-session-queue-input/timeout-in-seconds :portkey.aws.gamelift.create-game-session-queue-input/player-latency-policies :portkey.aws.gamelift.create-game-session-queue-input/destinations]))

(clojure.spec.alpha/def :portkey.aws.gamelift.get-game-session-log-url-output/pre-signed-url (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/get-game-session-log-url-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.get-game-session-log-url-output/pre-signed-url]))

(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-configuration-status #{"COMPLETED" :timed-out "TIMED_OUT" :requires-acceptance :completed "REQUIRES_ACCEPTANCE" :queued :cancelled "QUEUED" "FAILED" :placing "PLACING" "CANCELLED" "SEARCHING" :searching :failed})

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-queue-destination-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/game-session-queue-destination))

(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-request-timeout-integer (clojure.spec.alpha/int-in 1 43200))

(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-queue-destination/destination-arn (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-queue-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.game-session-queue-destination/destination-arn]))

(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-acceptance-timeout-integer (clojure.spec.alpha/int-in 1 600))

(clojure.spec.alpha/def :portkey.aws.gamelift.runtime-configuration/server-processes (clojure.spec.alpha/and :portkey.aws.gamelift/server-process-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/runtime-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.runtime-configuration/server-processes :portkey.aws.gamelift/max-concurrent-game-session-activations :portkey.aws.gamelift/game-session-activation-timeout-seconds]))

(clojure.spec.alpha/def :portkey.aws.gamelift/player-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.gamelift.aws-credentials/access-key-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.aws-credentials/secret-access-key (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.aws-credentials/session-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/aws-credentials (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.aws-credentials/access-key-id :portkey.aws.gamelift.aws-credentials/secret-access-key :portkey.aws.gamelift.aws-credentials/session-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/create-game-session-queue-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/game-session-queue]))

(clojure.spec.alpha/def :portkey.aws.gamelift.terminal-routing-strategy-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/terminal-routing-strategy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.terminal-routing-strategy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-status #{"ACTIVATING" "TERMINATED" "ERROR" :terminating :active :terminated "ACTIVE" :error "TERMINATING" :activating})

(clojure.spec.alpha/def :portkey.aws.gamelift/update-game-session-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/game-session]))

(clojure.spec.alpha/def :portkey.aws.gamelift/update-runtime-configuration-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift/runtime-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^fleet-\S+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift.placed-player-session/player-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/placed-player-session (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.placed-player-session/player-id :portkey.aws.gamelift/player-session-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-placement-state #{:timed-out "TIMED_OUT" :pending "PENDING" :cancelled :fulfilled "FULFILLED" "CANCELLED"})

(clojure.spec.alpha/def :portkey.aws.gamelift.update-game-session-input/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-game-session-input/maximum-player-session-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-game-session-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/update-game-session-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.update-game-session-input/game-session-id] :opt-un [:portkey.aws.gamelift.update-game-session-input/maximum-player-session-count :portkey.aws.gamelift.update-game-session-input/name :portkey.aws.gamelift/player-session-creation-policy :portkey.aws.gamelift/protection-policy]))

(clojure.spec.alpha/def :portkey.aws.gamelift/create-vpc-peering-connection-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-details-input/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-details-input/status-filter (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-details-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-details-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-game-session-details-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.describe-game-session-details-input/game-session-id :portkey.aws.gamelift/alias-id :portkey.aws.gamelift.describe-game-session-details-input/status-filter :portkey.aws.gamelift.describe-game-session-details-input/limit :portkey.aws.gamelift.describe-game-session-details-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/create-fleet-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-attributes]))

(clojure.spec.alpha/def :portkey.aws.gamelift/player-latency-policy-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/player-latency-policy))

(clojure.spec.alpha/def :portkey.aws.gamelift/boolean-model clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-queues-output/game-session-queues (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-queue-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-queues-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-game-session-queues-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-game-session-queues-output/game-session-queues :portkey.aws.gamelift.describe-game-session-queues-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/ip-permissions-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/ip-permission :max-count 50))

(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-action-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/fleet-action :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.gamelift/start-matchmaking-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/matchmaking-ticket]))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-player-sessions-output/player-sessions (clojure.spec.alpha/and :portkey.aws.gamelift/player-session-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-player-sessions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.create-player-sessions-output/player-sessions]))

(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-attributes-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/fleet-attributes))

(clojure.spec.alpha/def :portkey.aws.gamelift.matched-player-session/player-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/matched-player-session (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.matched-player-session/player-id :portkey.aws.gamelift/player-session-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-fleet-input/new-game-session-protection-policy (clojure.spec.alpha/and :portkey.aws.gamelift/protection-policy))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-fleet-input/ec-2-inbound-permissions (clojure.spec.alpha/and :portkey.aws.gamelift/ip-permissions-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-fleet-input/peer-vpc-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-fleet-input/server-launch-path (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-fleet-input/description (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-fleet-input/server-launch-parameters (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-fleet-input/metric-groups (clojure.spec.alpha/and :portkey.aws.gamelift/metric-group-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-fleet-input/peer-vpc-aws-account-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-fleet-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-fleet-input/log-paths (clojure.spec.alpha/and :portkey.aws.gamelift/string-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-fleet-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.create-fleet-input/name :portkey.aws.gamelift/build-id :portkey.aws.gamelift/ec-2-instance-type] :opt-un [:portkey.aws.gamelift.create-fleet-input/new-game-session-protection-policy :portkey.aws.gamelift/runtime-configuration :portkey.aws.gamelift.create-fleet-input/ec-2-inbound-permissions :portkey.aws.gamelift/fleet-type :portkey.aws.gamelift.create-fleet-input/peer-vpc-id :portkey.aws.gamelift.create-fleet-input/server-launch-path :portkey.aws.gamelift.create-fleet-input/description :portkey.aws.gamelift.create-fleet-input/server-launch-parameters :portkey.aws.gamelift.create-fleet-input/metric-groups :portkey.aws.gamelift.create-fleet-input/peer-vpc-aws-account-id :portkey.aws.gamelift/resource-creation-limit-policy :portkey.aws.gamelift.create-fleet-input/log-paths]))

(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-utilization-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/fleet-utilization))

(clojure.spec.alpha/def :portkey.aws.gamelift/whole-number (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.gamelift.alias/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-blank-and-length-constraint-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.alias/alias-arn (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.alias/description (clojure.spec.alpha/and :portkey.aws.gamelift/free-text))
(clojure.spec.alpha/def :portkey.aws.gamelift.alias/creation-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.alias/last-updated-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift/alias (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/alias-id :portkey.aws.gamelift.alias/name :portkey.aws.gamelift.alias/alias-arn :portkey.aws.gamelift.alias/description :portkey.aws.gamelift/routing-strategy :portkey.aws.gamelift.alias/creation-time :portkey.aws.gamelift.alias/last-updated-time]))

(clojure.spec.alpha/def :portkey.aws.gamelift.routing-strategy/type (clojure.spec.alpha/and :portkey.aws.gamelift/routing-strategy-type))
(clojure.spec.alpha/def :portkey.aws.gamelift.routing-strategy/message (clojure.spec.alpha/and :portkey.aws.gamelift/free-text))
(clojure.spec.alpha/def :portkey.aws.gamelift/routing-strategy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.routing-strategy/type :portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.routing-strategy/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift/delete-game-session-queue-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.delete-vpc-peering-connection-input/vpc-peering-connection-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/delete-vpc-peering-connection-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.delete-vpc-peering-connection-input/vpc-peering-connection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaker-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 390000))))

(clojure.spec.alpha/def :portkey.aws.gamelift.invalid-game-session-status-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/invalid-game-session-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.invalid-game-session-status-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-attributes-input/fleet-ids (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-id-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-attributes-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-attributes-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-fleet-attributes-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-fleet-attributes-input/fleet-ids :portkey.aws.gamelift.describe-fleet-attributes-input/limit :portkey.aws.gamelift.describe-fleet-attributes-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/start-match-backfill-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/matchmaking-ticket]))

(clojure.spec.alpha/def :portkey.aws.gamelift/player-data-map (clojure.spec.alpha/map-of :portkey.aws.gamelift/non-zero-and-max-string :portkey.aws.gamelift/player-data))

(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-authorization/game-lift-aws-account-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-authorization/peer-vpc-aws-account-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-authorization/peer-vpc-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-authorization/creation-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.vpc-peering-authorization/expiration-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift/vpc-peering-authorization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.vpc-peering-authorization/game-lift-aws-account-id :portkey.aws.gamelift.vpc-peering-authorization/peer-vpc-aws-account-id :portkey.aws.gamelift.vpc-peering-authorization/peer-vpc-id :portkey.aws.gamelift.vpc-peering-authorization/creation-time :portkey.aws.gamelift.vpc-peering-authorization/expiration-time]))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-alias-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/alias]))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-runtime-configuration-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.desired-player-session/player-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/desired-player-session (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.desired-player-session/player-id :portkey.aws.gamelift/player-data]))

(clojure.spec.alpha/def :portkey.aws.gamelift/event-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/event))

(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-type #{"ON_DEMAND" "SPOT" :on-demand :spot})

(clojure.spec.alpha/def :portkey.aws.gamelift/update-runtime-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/runtime-configuration]))

(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-capacity/instance-type (clojure.spec.alpha/and :portkey.aws.gamelift/ec-2-instance-type))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-capacity/instance-counts (clojure.spec.alpha/and :portkey.aws.gamelift/ec-2-instance-counts))
(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-capacity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.fleet-capacity/instance-type :portkey.aws.gamelift.fleet-capacity/instance-counts]))

(clojure.spec.alpha/def :portkey.aws.gamelift.stop-matchmaking-input/ticket-id (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/stop-matchmaking-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.stop-matchmaking-input/ticket-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/vpc-peering-connection-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/vpc-peering-connection))

(clojure.spec.alpha/def :portkey.aws.gamelift.player/player-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.player/player-attributes (clojure.spec.alpha/and :portkey.aws.gamelift/player-attribute-map))
(clojure.spec.alpha/def :portkey.aws.gamelift.player/team (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.player/latency-in-ms (clojure.spec.alpha/and :portkey.aws.gamelift/latency-map))
(clojure.spec.alpha/def :portkey.aws.gamelift/player (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.player/player-id :portkey.aws.gamelift.player/player-attributes :portkey.aws.gamelift.player/team :portkey.aws.gamelift.player/latency-in-ms]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-session-placement-input/placement-id (clojure.spec.alpha/and :portkey.aws.gamelift/id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-game-session-placement-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.describe-game-session-placement-input/placement-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.event/event-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.event/resource-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.event/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.event/event-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.event/pre-signed-log-url (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.event/event-id :portkey.aws.gamelift.event/resource-id :portkey.aws.gamelift/event-code :portkey.aws.gamelift.event/message :portkey.aws.gamelift.event/event-time :portkey.aws.gamelift.event/pre-signed-log-url]))

(clojure.spec.alpha/def :portkey.aws.gamelift.delete-vpc-peering-authorization-input/game-lift-aws-account-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.delete-vpc-peering-authorization-input/peer-vpc-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/delete-vpc-peering-authorization-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.delete-vpc-peering-authorization-input/game-lift-aws-account-id :portkey.aws.gamelift.delete-vpc-peering-authorization-input/peer-vpc-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-player-sessions-input/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-player-sessions-input/player-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-player-sessions-input/player-session-status-filter (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-player-sessions-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-player-sessions-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-player-sessions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-player-sessions-input/game-session-id :portkey.aws.gamelift.describe-player-sessions-input/player-id :portkey.aws.gamelift/player-session-id :portkey.aws.gamelift.describe-player-sessions-input/player-session-status-filter :portkey.aws.gamelift.describe-player-sessions-input/limit :portkey.aws.gamelift.describe-player-sessions-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-capacity-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-capacity-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.fleet-capacity-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-output/configuration (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-configuration))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-matchmaking-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.create-matchmaking-configuration-output/configuration]))

(clojure.spec.alpha/def :portkey.aws.gamelift.player-latency/player-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.player-latency/region-identifier (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.player-latency/latency-in-milliseconds (clojure.spec.alpha/and :portkey.aws.gamelift/float))
(clojure.spec.alpha/def :portkey.aws.gamelift/player-latency (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.player-latency/player-id :portkey.aws.gamelift.player-latency/region-identifier :portkey.aws.gamelift.player-latency/latency-in-milliseconds]))

(clojure.spec.alpha/def :portkey.aws.gamelift.request-upload-credentials-output/upload-credentials (clojure.spec.alpha/and :portkey.aws.gamelift/aws-credentials))
(clojure.spec.alpha/def :portkey.aws.gamelift.request-upload-credentials-output/storage-location (clojure.spec.alpha/and :portkey.aws.gamelift/s-3-location))
(clojure.spec.alpha/def :portkey.aws.gamelift/request-upload-credentials-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.request-upload-credentials-output/upload-credentials :portkey.aws.gamelift.request-upload-credentials-output/storage-location]))

(clojure.spec.alpha/def :portkey.aws.gamelift/player-session-creation-policy #{:accept-all :deny-all "DENY_ALL" "ACCEPT_ALL"})

(clojure.spec.alpha/def :portkey.aws.gamelift/update-alias-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/alias]))

(clojure.spec.alpha/def :portkey.aws.gamelift/resolve-alias-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/alias-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-connection-info/game-session-arn (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-connection-info/ip-address (clojure.spec.alpha/and :portkey.aws.gamelift/string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-connection-info/port (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-connection-info/matched-player-sessions (clojure.spec.alpha/and :portkey.aws.gamelift/matched-player-session-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-connection-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.game-session-connection-info/game-session-arn :portkey.aws.gamelift.game-session-connection-info/ip-address :portkey.aws.gamelift.game-session-connection-info/port :portkey.aws.gamelift.game-session-connection-info/matched-player-sessions]))

(clojure.spec.alpha/def :portkey.aws.gamelift.list-builds-output/builds (clojure.spec.alpha/and :portkey.aws.gamelift/build-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.list-builds-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/list-builds-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.list-builds-output/builds :portkey.aws.gamelift.list-builds-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.search-game-sessions-input/filter-expression (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.search-game-sessions-input/sort-expression (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.search-game-sessions-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.search-game-sessions-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/search-game-sessions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift/alias-id :portkey.aws.gamelift.search-game-sessions-input/filter-expression :portkey.aws.gamelift.search-game-sessions-input/sort-expression :portkey.aws.gamelift.search-game-sessions-input/limit :portkey.aws.gamelift.search-game-sessions-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.stop-game-session-placement-input/placement-id (clojure.spec.alpha/and :portkey.aws.gamelift/id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/stop-game-session-placement-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.stop-game-session-placement-input/placement-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-fleet-port-settings-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/alias-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^alias-\S+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-queue-name-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/game-session-queue-name))

(clojure.spec.alpha/def :portkey.aws.gamelift/matched-player-session-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/matched-player-session))

(clojure.spec.alpha/def :portkey.aws.gamelift.put-scaling-policy-input/threshold (clojure.spec.alpha/and :portkey.aws.gamelift/double))
(clojure.spec.alpha/def :portkey.aws.gamelift.put-scaling-policy-input/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.gamelift/integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.put-scaling-policy-input/comparison-operator (clojure.spec.alpha/and :portkey.aws.gamelift/comparison-operator-type))
(clojure.spec.alpha/def :portkey.aws.gamelift.put-scaling-policy-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.put-scaling-policy-input/evaluation-periods (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift/put-scaling-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.put-scaling-policy-input/name :portkey.aws.gamelift/fleet-id :portkey.aws.gamelift/metric-name] :opt-un [:portkey.aws.gamelift.put-scaling-policy-input/threshold :portkey.aws.gamelift.put-scaling-policy-input/scaling-adjustment :portkey.aws.gamelift.put-scaling-policy-input/comparison-operator :portkey.aws.gamelift/target-configuration :portkey.aws.gamelift.put-scaling-policy-input/evaluation-periods :portkey.aws.gamelift/scaling-adjustment-type :portkey.aws.gamelift/policy-type]))

(clojure.spec.alpha/def :portkey.aws.gamelift/delete-build-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/build-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.update-game-session-queue-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-queue-name))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-game-session-queue-input/timeout-in-seconds (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-game-session-queue-input/player-latency-policies (clojure.spec.alpha/and :portkey.aws.gamelift/player-latency-policy-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-game-session-queue-input/destinations (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-queue-destination-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/update-game-session-queue-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.update-game-session-queue-input/name] :opt-un [:portkey.aws.gamelift.update-game-session-queue-input/timeout-in-seconds :portkey.aws.gamelift.update-game-session-queue-input/player-latency-policies :portkey.aws.gamelift.update-game-session-queue-input/destinations]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-configurations-input/names (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-configurations-input/rule-set-name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-configurations-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-configurations-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-matchmaking-configurations-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-matchmaking-configurations-input/names :portkey.aws.gamelift.describe-matchmaking-configurations-input/rule-set-name :portkey.aws.gamelift.describe-matchmaking-configurations-input/limit :portkey.aws.gamelift.describe-matchmaking-configurations-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/string-double-map (clojure.spec.alpha/map-of :portkey.aws.gamelift/non-zero-and-max-string :portkey.aws.gamelift/double-object))

(clojure.spec.alpha/def :portkey.aws.gamelift/protection-policy #{"FullProtection" "NoProtection" :full-protection :no-protection})

(clojure.spec.alpha/def :portkey.aws.gamelift/stop-fleet-actions-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/new-game-session-protection-policy (clojure.spec.alpha/and :portkey.aws.gamelift/protection-policy))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/termination-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/instance-type (clojure.spec.alpha/and :portkey.aws.gamelift/ec-2-instance-type))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/status (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-status))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/server-launch-path (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/description (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/server-launch-parameters (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/metric-groups (clojure.spec.alpha/and :portkey.aws.gamelift/metric-group-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/stopped-actions (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-action-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/creation-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/fleet-arn (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-attributes/log-paths (clojure.spec.alpha/and :portkey.aws.gamelift/string-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.fleet-attributes/new-game-session-protection-policy :portkey.aws.gamelift.fleet-attributes/termination-time :portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.fleet-attributes/instance-type :portkey.aws.gamelift/fleet-type :portkey.aws.gamelift.fleet-attributes/status :portkey.aws.gamelift.fleet-attributes/server-launch-path :portkey.aws.gamelift.fleet-attributes/description :portkey.aws.gamelift.fleet-attributes/server-launch-parameters :portkey.aws.gamelift.fleet-attributes/metric-groups :portkey.aws.gamelift.fleet-attributes/stopped-actions :portkey.aws.gamelift.fleet-attributes/creation-time :portkey.aws.gamelift.fleet-attributes/name :portkey.aws.gamelift.fleet-attributes/fleet-arn :portkey.aws.gamelift/resource-creation-limit-policy :portkey.aws.gamelift.fleet-attributes/log-paths :portkey.aws.gamelift/build-id :portkey.aws.gamelift/operating-system]))

(clojure.spec.alpha/def :portkey.aws.gamelift.player-latency-policy/maximum-individual-player-latency-milliseconds (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.player-latency-policy/policy-duration-seconds (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift/player-latency-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.player-latency-policy/maximum-individual-player-latency-milliseconds :portkey.aws.gamelift.player-latency-policy/policy-duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.gamelift/create-game-session-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/game-session]))

(clojure.spec.alpha/def :portkey.aws.gamelift/create-alias-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/alias]))

(clojure.spec.alpha/def :portkey.aws.gamelift.ec-2-instance-limit/current-instances (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.ec-2-instance-limit/instance-limit (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift/ec-2-instance-limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/ec-2-instance-type :portkey.aws.gamelift.ec-2-instance-limit/current-instances :portkey.aws.gamelift.ec-2-instance-limit/instance-limit]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-sessions-output/game-sessions (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-sessions-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-game-sessions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-game-sessions-output/game-sessions :portkey.aws.gamelift.describe-game-sessions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/update-game-session-queue-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/game-session-queue]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-attributes-output/fleet-attributes (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-attributes-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-attributes-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-fleet-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-fleet-attributes-output/fleet-attributes :portkey.aws.gamelift.describe-fleet-attributes-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-id-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/fleet-id :min-count 1))

(clojure.spec.alpha/def :portkey.aws.gamelift/string-model (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.gamelift/build-status #{:ready :initialized "READY" "INITIALIZED" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.gamelift.delete-matchmaking-configuration-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/delete-matchmaking-configuration-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.delete-matchmaking-configuration-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/create-vpc-peering-authorization-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/vpc-peering-authorization]))

(clojure.spec.alpha/def :portkey.aws.gamelift.unsupported-region-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/unsupported-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.unsupported-region-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift.start-matchmaking-input/ticket-id (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.start-matchmaking-input/configuration-name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.start-matchmaking-input/players (clojure.spec.alpha/and :portkey.aws.gamelift/player-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/start-matchmaking-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.start-matchmaking-input/configuration-name :portkey.aws.gamelift.start-matchmaking-input/players] :opt-un [:portkey.aws.gamelift.start-matchmaking-input/ticket-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift.target-configuration/target-value (clojure.spec.alpha/and :portkey.aws.gamelift/double))
(clojure.spec.alpha/def :portkey.aws.gamelift/target-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.target-configuration/target-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/player-latency-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/player-latency))

(clojure.spec.alpha/def :portkey.aws.gamelift.attribute-value/s (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.attribute-value/n (clojure.spec.alpha/and :portkey.aws.gamelift/double-object))
(clojure.spec.alpha/def :portkey.aws.gamelift.attribute-value/sl (clojure.spec.alpha/and :portkey.aws.gamelift/string-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.attribute-value/sdm (clojure.spec.alpha/and :portkey.aws.gamelift/string-double-map))
(clojure.spec.alpha/def :portkey.aws.gamelift/attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.attribute-value/s :portkey.aws.gamelift.attribute-value/n :portkey.aws.gamelift.attribute-value/sl :portkey.aws.gamelift.attribute-value/sdm]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-vpc-peering-authorizations-output/vpc-peering-authorizations (clojure.spec.alpha/and :portkey.aws.gamelift/vpc-peering-authorization-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-vpc-peering-authorizations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-vpc-peering-authorizations-output/vpc-peering-authorizations]))

(clojure.spec.alpha/def :portkey.aws.gamelift/stop-matchmaking-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift.accept-match-input/ticket-id (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.accept-match-input/player-ids (clojure.spec.alpha/and :portkey.aws.gamelift/string-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/accept-match-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.accept-match-input/ticket-id :portkey.aws.gamelift.accept-match-input/player-ids :portkey.aws.gamelift/acceptance-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-input/ticket-ids (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-matchmaking-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.describe-matchmaking-input/ticket-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/player-id-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/non-zero-and-max-string :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.gamelift.idempotent-parameter-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.idempotent-parameter-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift.player-session/termination-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.player-session/status (clojure.spec.alpha/and :portkey.aws.gamelift/player-session-status))
(clojure.spec.alpha/def :portkey.aws.gamelift.player-session/port (clojure.spec.alpha/and :portkey.aws.gamelift/port-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.player-session/creation-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.player-session/player-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.player-session/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/player-session (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.player-session/termination-time :portkey.aws.gamelift/player-data :portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.player-session/status :portkey.aws.gamelift.player-session/port :portkey.aws.gamelift.player-session/creation-time :portkey.aws.gamelift.player-session/player-id :portkey.aws.gamelift.player-session/game-session-id :portkey.aws.gamelift/ip-address :portkey.aws.gamelift/player-session-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift.delete-game-session-queue-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-queue-name))
(clojure.spec.alpha/def :portkey.aws.gamelift/delete-game-session-queue-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.delete-game-session-queue-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-rule-set-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-matchmaking-rule-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.create-matchmaking-rule-set-input/name :portkey.aws.gamelift/rule-set-body] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/alias-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/alias))

(clojure.spec.alpha/def :portkey.aws.gamelift.start-fleet-actions-input/actions (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-action-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/start-fleet-actions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.start-fleet-actions-input/actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-rule-set-output/rule-set (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-rule-set))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-matchmaking-rule-set-output (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.create-matchmaking-rule-set-output/rule-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift.list-aliases-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.list-aliases-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.list-aliases-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/list-aliases-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/routing-strategy-type :portkey.aws.gamelift.list-aliases-input/name :portkey.aws.gamelift.list-aliases-input/limit :portkey.aws.gamelift.list-aliases-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-events-output/events (clojure.spec.alpha/and :portkey.aws.gamelift/event-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-events-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-fleet-events-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-fleet-events-output/events :portkey.aws.gamelift.describe-fleet-events-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-capacity-input/fleet-ids (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-id-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-capacity-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-capacity-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-fleet-capacity-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-fleet-capacity-input/fleet-ids :portkey.aws.gamelift.describe-fleet-capacity-input/limit :portkey.aws.gamelift.describe-fleet-capacity-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-id-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/matchmaking-id-string-model))

(clojure.spec.alpha/def :portkey.aws.gamelift.update-fleet-port-settings-input/inbound-permission-authorizations (clojure.spec.alpha/and :portkey.aws.gamelift/ip-permissions-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-fleet-port-settings-input/inbound-permission-revocations (clojure.spec.alpha/and :portkey.aws.gamelift/ip-permissions-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/update-fleet-port-settings-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id] :opt-un [:portkey.aws.gamelift.update-fleet-port-settings-input/inbound-permission-authorizations :portkey.aws.gamelift.update-fleet-port-settings-input/inbound-permission-revocations]))

(clojure.spec.alpha/def :portkey.aws.gamelift.build/name (clojure.spec.alpha/and :portkey.aws.gamelift/free-text))
(clojure.spec.alpha/def :portkey.aws.gamelift.build/version (clojure.spec.alpha/and :portkey.aws.gamelift/free-text))
(clojure.spec.alpha/def :portkey.aws.gamelift.build/status (clojure.spec.alpha/and :portkey.aws.gamelift/build-status))
(clojure.spec.alpha/def :portkey.aws.gamelift.build/size-on-disk (clojure.spec.alpha/and :portkey.aws.gamelift/positive-long))
(clojure.spec.alpha/def :portkey.aws.gamelift.build/creation-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift/build (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/build-id :portkey.aws.gamelift.build/name :portkey.aws.gamelift.build/version :portkey.aws.gamelift.build/status :portkey.aws.gamelift.build/size-on-disk :portkey.aws.gamelift/operating-system :portkey.aws.gamelift.build/creation-time]))

(clojure.spec.alpha/def :portkey.aws.gamelift/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.gamelift/placed-player-session-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/placed-player-session))

(clojure.spec.alpha/def :portkey.aws.gamelift.list-aliases-output/aliases (clojure.spec.alpha/and :portkey.aws.gamelift/alias-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.list-aliases-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/list-aliases-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.list-aliases-output/aliases :portkey.aws.gamelift.list-aliases-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.ip-permission/from-port (clojure.spec.alpha/and :portkey.aws.gamelift/port-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.ip-permission/to-port (clojure.spec.alpha/and :portkey.aws.gamelift/port-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.ip-permission/ip-range (clojure.spec.alpha/and :portkey.aws.gamelift/non-blank-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.ip-permission/protocol (clojure.spec.alpha/and :portkey.aws.gamelift/ip-protocol))
(clojure.spec.alpha/def :portkey.aws.gamelift/ip-permission (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.ip-permission/from-port :portkey.aws.gamelift.ip-permission/to-port :portkey.aws.gamelift.ip-permission/ip-range :portkey.aws.gamelift.ip-permission/protocol] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/termination-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/maximum-player-session-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/status (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-status))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/status-reason (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-status-reason))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/port (clojure.spec.alpha/and :portkey.aws.gamelift/port-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/creation-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/creator-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/current-player-session-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/game-properties (clojure.spec.alpha/and :portkey.aws.gamelift/game-property-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/game-session (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.game-session/termination-time :portkey.aws.gamelift.game-session/maximum-player-session-count :portkey.aws.gamelift/fleet-id :portkey.aws.gamelift/matchmaker-data :portkey.aws.gamelift.game-session/status :portkey.aws.gamelift/player-session-creation-policy :portkey.aws.gamelift/game-session-data :portkey.aws.gamelift.game-session/status-reason :portkey.aws.gamelift.game-session/port :portkey.aws.gamelift.game-session/creation-time :portkey.aws.gamelift.game-session/game-session-id :portkey.aws.gamelift/ip-address :portkey.aws.gamelift.game-session/creator-id :portkey.aws.gamelift.game-session/current-player-session-count :portkey.aws.gamelift.game-session/game-properties :portkey.aws.gamelift.game-session/name]))

(clojure.spec.alpha/def :portkey.aws.gamelift/rule-set-limit (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.gamelift/stop-game-session-placement-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/game-session-placement]))

(clojure.spec.alpha/def :portkey.aws.gamelift/update-build-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/build]))

(clojure.spec.alpha/def :portkey.aws.gamelift.instance-credentials/user-name (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.instance-credentials/secret (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/instance-credentials (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.instance-credentials/user-name :portkey.aws.gamelift.instance-credentials/secret]))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-vpc-peering-authorizations-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/game-session :portkey.aws.gamelift/protection-policy]))

(clojure.spec.alpha/def :portkey.aws.gamelift/delete-matchmaking-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/vpc-peering-authorization-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/vpc-peering-authorization))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-build-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/build-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.search-game-sessions-output/game-sessions (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.search-game-sessions-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/search-game-sessions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.search-game-sessions-output/game-sessions :portkey.aws.gamelift.search-game-sessions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.list-fleets-output/fleet-ids (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-id-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.list-fleets-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/list-fleets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.list-fleets-output/fleet-ids :portkey.aws.gamelift.list-fleets-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/positive-integer (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.gamelift.s-3-location/bucket (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.s-3-location/key (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.s-3-location/role-arn (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/s-3-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.s-3-location/bucket :portkey.aws.gamelift.s-3-location/key :portkey.aws.gamelift.s-3-location/role-arn]))

(clojure.spec.alpha/def :portkey.aws.gamelift/comparison-operator-type #{"LessThanThreshold" :greater-than-threshold :less-than-threshold "GreaterThanThreshold" "LessThanOrEqualToThreshold" :greater-than-or-equal-to-threshold :less-than-or-equal-to-threshold "GreaterThanOrEqualToThreshold"})

(clojure.spec.alpha/def :portkey.aws.gamelift/game-property-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/game-property :max-count 16))

(clojure.spec.alpha/def :portkey.aws.gamelift/instance-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/instance))

(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-ticket/ticket-id (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-ticket/end-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-ticket/estimated-wait-time (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-ticket/players (clojure.spec.alpha/and :portkey.aws.gamelift/player-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-ticket/start-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-ticket/status-message (clojure.spec.alpha/and :portkey.aws.gamelift/string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-ticket/status (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-configuration-status))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-ticket/status-reason (clojure.spec.alpha/and :portkey.aws.gamelift/string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-ticket/configuration-name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-ticket (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.matchmaking-ticket/ticket-id :portkey.aws.gamelift.matchmaking-ticket/end-time :portkey.aws.gamelift.matchmaking-ticket/estimated-wait-time :portkey.aws.gamelift.matchmaking-ticket/players :portkey.aws.gamelift.matchmaking-ticket/start-time :portkey.aws.gamelift.matchmaking-ticket/status-message :portkey.aws.gamelift.matchmaking-ticket/status :portkey.aws.gamelift/game-session-connection-info :portkey.aws.gamelift.matchmaking-ticket/status-reason :portkey.aws.gamelift.matchmaking-ticket/configuration-name]))

(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-rule-set/rule-set-name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-rule-set/creation-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-rule-set (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/rule-set-body] :opt-un [:portkey.aws.gamelift.matchmaking-rule-set/rule-set-name :portkey.aws.gamelift.matchmaking-rule-set/creation-time]))

(clojure.spec.alpha/def :portkey.aws.gamelift/start-fleet-actions-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-build-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-build-input/version (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-build-input/storage-location (clojure.spec.alpha/and :portkey.aws.gamelift/s-3-location))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-build-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.create-build-input/name :portkey.aws.gamelift.create-build-input/version :portkey.aws.gamelift.create-build-input/storage-location :portkey.aws.gamelift/operating-system]))

(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-id-string-model (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-\.]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-build-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/build]))

(clojure.spec.alpha/def :portkey.aws.gamelift/get-instance-access-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/routing-strategy-type #{:terminal "TERMINAL" :simple "SIMPLE"})

(clojure.spec.alpha/def :portkey.aws.gamelift.invalid-fleet-status-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/invalid-fleet-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.invalid-fleet-status-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-detail-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/game-session-detail))

(clojure.spec.alpha/def :portkey.aws.gamelift/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.gamelift/metric-group-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/metric-group :max-count 1))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-output/ticket-list (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-ticket-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-matchmaking-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-matchmaking-output/ticket-list]))

(clojure.spec.alpha/def :portkey.aws.gamelift/scaling-policy-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/scaling-policy))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-input/acceptance-required (clojure.spec.alpha/and :portkey.aws.gamelift/boolean-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-input/game-session-queue-arns (clojure.spec.alpha/and :portkey.aws.gamelift/queue-arns-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-input/rule-set-name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-input/request-timeout-seconds (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-request-timeout-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-input/description (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-input/acceptance-timeout-seconds (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-acceptance-timeout-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-input/additional-player-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-input/game-properties (clojure.spec.alpha/and :portkey.aws.gamelift/game-property-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-matchmaking-configuration-input/notification-target (clojure.spec.alpha/and :portkey.aws.gamelift/sns-arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-matchmaking-configuration-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.create-matchmaking-configuration-input/name :portkey.aws.gamelift.create-matchmaking-configuration-input/game-session-queue-arns :portkey.aws.gamelift.create-matchmaking-configuration-input/request-timeout-seconds :portkey.aws.gamelift.create-matchmaking-configuration-input/acceptance-required :portkey.aws.gamelift.create-matchmaking-configuration-input/rule-set-name] :opt-un [:portkey.aws.gamelift/custom-event-data :portkey.aws.gamelift/game-session-data :portkey.aws.gamelift.create-matchmaking-configuration-input/description :portkey.aws.gamelift.create-matchmaking-configuration-input/acceptance-timeout-seconds :portkey.aws.gamelift.create-matchmaking-configuration-input/additional-player-count :portkey.aws.gamelift.create-matchmaking-configuration-input/game-properties :portkey.aws.gamelift.create-matchmaking-configuration-input/notification-target]))

(clojure.spec.alpha/def :portkey.aws.gamelift/player-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/player))

(clojure.spec.alpha/def :portkey.aws.gamelift.scaling-policy/threshold (clojure.spec.alpha/and :portkey.aws.gamelift/double))
(clojure.spec.alpha/def :portkey.aws.gamelift.scaling-policy/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.gamelift/integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.scaling-policy/comparison-operator (clojure.spec.alpha/and :portkey.aws.gamelift/comparison-operator-type))
(clojure.spec.alpha/def :portkey.aws.gamelift.scaling-policy/status (clojure.spec.alpha/and :portkey.aws.gamelift/scaling-status-type))
(clojure.spec.alpha/def :portkey.aws.gamelift.scaling-policy/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.scaling-policy/evaluation-periods (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift/scaling-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.scaling-policy/threshold :portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.scaling-policy/scaling-adjustment :portkey.aws.gamelift.scaling-policy/comparison-operator :portkey.aws.gamelift.scaling-policy/status :portkey.aws.gamelift/target-configuration :portkey.aws.gamelift/metric-name :portkey.aws.gamelift.scaling-policy/name :portkey.aws.gamelift.scaling-policy/evaluation-periods :portkey.aws.gamelift/scaling-adjustment-type :portkey.aws.gamelift/policy-type]))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-vpc-peering-connections-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift.ec-2-instance-counts/desired (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.ec-2-instance-counts/minimum (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.ec-2-instance-counts/maximum (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.ec-2-instance-counts/pending (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.ec-2-instance-counts/active (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.ec-2-instance-counts/idle (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.ec-2-instance-counts/terminating (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift/ec-2-instance-counts (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.ec-2-instance-counts/desired :portkey.aws.gamelift.ec-2-instance-counts/minimum :portkey.aws.gamelift.ec-2-instance-counts/maximum :portkey.aws.gamelift.ec-2-instance-counts/pending :portkey.aws.gamelift.ec-2-instance-counts/active :portkey.aws.gamelift.ec-2-instance-counts/idle :portkey.aws.gamelift.ec-2-instance-counts/terminating]))

(clojure.spec.alpha/def :portkey.aws.gamelift/delete-vpc-peering-connection-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.instance-access/credentials (clojure.spec.alpha/and :portkey.aws.gamelift/instance-credentials))
(clojure.spec.alpha/def :portkey.aws.gamelift/instance-access (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift/instance-id :portkey.aws.gamelift/ip-address :portkey.aws.gamelift/operating-system :portkey.aws.gamelift.instance-access/credentials]))

(clojure.spec.alpha/def :portkey.aws.gamelift/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.gamelift/player-session-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^psess-\S+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift/latency-map (clojure.spec.alpha/map-of :portkey.aws.gamelift/non-empty-string :portkey.aws.gamelift/positive-integer))

(clojure.spec.alpha/def :portkey.aws.gamelift.put-scaling-policy-output/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/put-scaling-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.put-scaling-policy-output/name]))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-game-session-input/maximum-player-session-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-game-session-input/idempotency-token (clojure.spec.alpha/and :portkey.aws.gamelift/id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-game-session-input/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-game-session-input/creator-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-game-session-input/game-properties (clojure.spec.alpha/and :portkey.aws.gamelift/game-property-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-game-session-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-game-session-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.create-game-session-input/maximum-player-session-count] :opt-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift/alias-id :portkey.aws.gamelift/game-session-data :portkey.aws.gamelift.create-game-session-input/idempotency-token :portkey.aws.gamelift.create-game-session-input/game-session-id :portkey.aws.gamelift.create-game-session-input/creator-id :portkey.aws.gamelift.create-game-session-input/game-properties :portkey.aws.gamelift.create-game-session-input/name]))

(clojure.spec.alpha/def :portkey.aws.gamelift/start-game-session-placement-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/game-session-placement]))

(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-utilization/active-server-process-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-utilization/active-game-session-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-utilization/current-player-session-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.fleet-utilization/maximum-player-session-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-utilization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.fleet-utilization/active-server-process-count :portkey.aws.gamelift.fleet-utilization/active-game-session-count :portkey.aws.gamelift.fleet-utilization/current-player-session-count :portkey.aws.gamelift.fleet-utilization/maximum-player-session-count]))

(clojure.spec.alpha/def :portkey.aws.gamelift/player-session-status #{"COMPLETED" :completed :timedout "TIMEDOUT" :active "ACTIVE" :reserved "RESERVED"})

(clojure.spec.alpha/def :portkey.aws.gamelift/delete-vpc-peering-authorization-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-port-settings-output/inbound-permissions (clojure.spec.alpha/and :portkey.aws.gamelift/ip-permissions-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-fleet-port-settings-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-fleet-port-settings-output/inbound-permissions]))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-queue-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/game-session-queue))

(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-rule-set-name-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/matchmaking-id-string-model :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.gamelift/metric-name #{:available-game-sessions :active-instances :activating-game-sessions "PercentIdleInstances" :wait-time "WaitTime" "QueueDepth" :idle-instances "AvailablePlayerSessions" "AvailableGameSessions" :current-player-sessions :available-player-sessions :percent-idle-instances "ActiveInstances" :active-game-sessions "ActivatingGameSessions" "IdleInstances" "CurrentPlayerSessions" :percent-available-game-sessions :queue-depth "ActiveGameSessions" "PercentAvailableGameSessions"})

(clojure.spec.alpha/def :portkey.aws.gamelift/instance-status #{:pending "PENDING" :terminating :active "ACTIVE" "TERMINATING"})

(clojure.spec.alpha/def :portkey.aws.gamelift/delete-fleet-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-input/acceptance-required (clojure.spec.alpha/and :portkey.aws.gamelift/boolean-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-input/game-session-queue-arns (clojure.spec.alpha/and :portkey.aws.gamelift/queue-arns-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-input/rule-set-name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-input/request-timeout-seconds (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-request-timeout-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-input/description (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-input/acceptance-timeout-seconds (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-acceptance-timeout-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-input/additional-player-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-input/game-properties (clojure.spec.alpha/and :portkey.aws.gamelift/game-property-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.update-matchmaking-configuration-input/notification-target (clojure.spec.alpha/and :portkey.aws.gamelift/sns-arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/update-matchmaking-configuration-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.update-matchmaking-configuration-input/name] :opt-un [:portkey.aws.gamelift.update-matchmaking-configuration-input/acceptance-required :portkey.aws.gamelift/custom-event-data :portkey.aws.gamelift.update-matchmaking-configuration-input/game-session-queue-arns :portkey.aws.gamelift.update-matchmaking-configuration-input/rule-set-name :portkey.aws.gamelift/game-session-data :portkey.aws.gamelift.update-matchmaking-configuration-input/request-timeout-seconds :portkey.aws.gamelift.update-matchmaking-configuration-input/description :portkey.aws.gamelift.update-matchmaking-configuration-input/acceptance-timeout-seconds :portkey.aws.gamelift.update-matchmaking-configuration-input/additional-player-count :portkey.aws.gamelift.update-matchmaking-configuration-input/game-properties :portkey.aws.gamelift.update-matchmaking-configuration-input/notification-target]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-scaling-policies-input/status-filter (clojure.spec.alpha/and :portkey.aws.gamelift/scaling-status-type))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-scaling-policies-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-scaling-policies-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-scaling-policies-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/fleet-id] :opt-un [:portkey.aws.gamelift.describe-scaling-policies-input/status-filter :portkey.aws.gamelift.describe-scaling-policies-input/limit :portkey.aws.gamelift.describe-scaling-policies-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.instance/type (clojure.spec.alpha/and :portkey.aws.gamelift/ec-2-instance-type))
(clojure.spec.alpha/def :portkey.aws.gamelift.instance/status (clojure.spec.alpha/and :portkey.aws.gamelift/instance-status))
(clojure.spec.alpha/def :portkey.aws.gamelift.instance/creation-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift/instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift/instance-id :portkey.aws.gamelift/ip-address :portkey.aws.gamelift/operating-system :portkey.aws.gamelift.instance/type :portkey.aws.gamelift.instance/status :portkey.aws.gamelift.instance/creation-time]))

(clojure.spec.alpha/def :portkey.aws.gamelift/max-concurrent-game-session-activations (clojure.spec.alpha/int-in 1 2147483647))

(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-status #{:building "NEW" :new "ACTIVATING" "TERMINATED" :deleting "ERROR" :validating :downloading :active "BUILDING" :terminated "DOWNLOADING" "DELETING" "ACTIVE" :error "VALIDATING" :activating})

(clojure.spec.alpha/def :portkey.aws.gamelift/free-text (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.gamelift/update-fleet-port-settings-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-ec-2-instance-limits-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/ec-2-instance-type]))

(clojure.spec.alpha/def :portkey.aws.gamelift/arn-string-model (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:/-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-sessions-input/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-sessions-input/status-filter (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-sessions-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-game-sessions-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-game-sessions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id :portkey.aws.gamelift.describe-game-sessions-input/game-session-id :portkey.aws.gamelift/alias-id :portkey.aws.gamelift.describe-game-sessions-input/status-filter :portkey.aws.gamelift.describe-game-sessions-input/limit :portkey.aws.gamelift.describe-game-sessions-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.list-builds-input/status (clojure.spec.alpha/and :portkey.aws.gamelift/build-status))
(clojure.spec.alpha/def :portkey.aws.gamelift.list-builds-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.list-builds-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/list-builds-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.list-builds-input/status :portkey.aws.gamelift.list-builds-input/limit :portkey.aws.gamelift.list-builds-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.get-game-session-log-url-input/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/get-game-session-log-url-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.get-game-session-log-url-input/game-session-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-vpc-peering-connections-output/vpc-peering-connections (clojure.spec.alpha/and :portkey.aws.gamelift/vpc-peering-connection-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-vpc-peering-connections-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-vpc-peering-connections-output/vpc-peering-connections]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-instances-output/instances (clojure.spec.alpha/and :portkey.aws.gamelift/instance-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-instances-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-instances-output/instances :portkey.aws.gamelift.describe-instances-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-scaling-policies-output/scaling-policies (clojure.spec.alpha/and :portkey.aws.gamelift/scaling-policy-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-scaling-policies-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-scaling-policies-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-scaling-policies-output/scaling-policies :portkey.aws.gamelift.describe-scaling-policies-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift.delete-scaling-policy-input/name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/delete-scaling-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.delete-scaling-policy-input/name :portkey.aws.gamelift/fleet-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-player-sessions-output/player-sessions (clojure.spec.alpha/and :portkey.aws.gamelift/player-session-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-player-sessions-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-player-sessions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-player-sessions-output/player-sessions :portkey.aws.gamelift.describe-player-sessions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-action #{:auto-scaling "AUTO_SCALING"})

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-activation-timeout-seconds (clojure.spec.alpha/int-in 1 600))

(clojure.spec.alpha/def :portkey.aws.gamelift/get-instance-access-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/instance-access]))

(clojure.spec.alpha/def :portkey.aws.gamelift/scaling-adjustment-type #{:exact-capacity "PercentChangeInCapacity" "ExactCapacity" :change-in-capacity "ChangeInCapacity" :percent-change-in-capacity})

(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/matchmaking-configuration))

(clojure.spec.alpha/def :portkey.aws.gamelift/delete-alias-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/alias-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/acceptance-required (clojure.spec.alpha/and :portkey.aws.gamelift/boolean-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/game-session-queue-arns (clojure.spec.alpha/and :portkey.aws.gamelift/queue-arns-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/rule-set-name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/request-timeout-seconds (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-request-timeout-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/description (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/acceptance-timeout-seconds (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-acceptance-timeout-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/creation-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/additional-player-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/game-properties (clojure.spec.alpha/and :portkey.aws.gamelift/game-property-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/name (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.matchmaking-configuration/notification-target (clojure.spec.alpha/and :portkey.aws.gamelift/sns-arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/matchmaking-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.matchmaking-configuration/acceptance-required :portkey.aws.gamelift/custom-event-data :portkey.aws.gamelift.matchmaking-configuration/game-session-queue-arns :portkey.aws.gamelift.matchmaking-configuration/rule-set-name :portkey.aws.gamelift/game-session-data :portkey.aws.gamelift.matchmaking-configuration/request-timeout-seconds :portkey.aws.gamelift.matchmaking-configuration/description :portkey.aws.gamelift.matchmaking-configuration/acceptance-timeout-seconds :portkey.aws.gamelift.matchmaking-configuration/creation-time :portkey.aws.gamelift.matchmaking-configuration/additional-player-count :portkey.aws.gamelift.matchmaking-configuration/game-properties :portkey.aws.gamelift.matchmaking-configuration/name :portkey.aws.gamelift.matchmaking-configuration/notification-target]))

(clojure.spec.alpha/def :portkey.aws.gamelift/resolve-alias-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift/describe-runtime-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/runtime-configuration]))

(clojure.spec.alpha/def :portkey.aws.gamelift/non-blank-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[^\s]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift/port-number (clojure.spec.alpha/int-in 1 60000))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-capacity-output/fleet-capacity (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-capacity-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-capacity-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-fleet-capacity-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-fleet-capacity-output/fleet-capacity :portkey.aws.gamelift.describe-fleet-capacity-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/policy-type #{"RuleBased" :rule-based :target-based "TargetBased"})

(clojure.spec.alpha/def :portkey.aws.gamelift/validate-matchmaking-rule-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift/rule-set-body] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-queue-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-build-output/upload-credentials (clojure.spec.alpha/and :portkey.aws.gamelift/aws-credentials))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-build-output/storage-location (clojure.spec.alpha/and :portkey.aws.gamelift/s-3-location))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-build-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/build :portkey.aws.gamelift.create-build-output/upload-credentials :portkey.aws.gamelift.create-build-output/storage-location]))

(clojure.spec.alpha/def :portkey.aws.gamelift/positive-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.gamelift.internal-service-exception/message (clojure.spec.alpha/and :portkey.aws.gamelift/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.internal-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-configurations-output/configurations (clojure.spec.alpha/and :portkey.aws.gamelift/matchmaking-configuration-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-matchmaking-configurations-output/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-matchmaking-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-matchmaking-configurations-output/configurations :portkey.aws.gamelift.describe-matchmaking-configurations-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.gamelift/server-process-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/server-process :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.gamelift.validate-matchmaking-rule-set-output/valid (clojure.spec.alpha/and :portkey.aws.gamelift/boolean-model))
(clojure.spec.alpha/def :portkey.aws.gamelift/validate-matchmaking-rule-set-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.validate-matchmaking-rule-set-output/valid]))

(clojure.spec.alpha/def :portkey.aws.gamelift.server-process/launch-path (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.server-process/parameters (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.server-process/concurrent-executions (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift/server-process (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.server-process/launch-path :portkey.aws.gamelift.server-process/concurrent-executions] :opt-un [:portkey.aws.gamelift.server-process/parameters]))

(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/game-session))

(clojure.spec.alpha/def :portkey.aws.gamelift.resource-creation-limit-policy/new-game-sessions-per-creator (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.resource-creation-limit-policy/policy-period-in-minutes (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift/resource-creation-limit-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.resource-creation-limit-policy/new-game-sessions-per-creator :portkey.aws.gamelift.resource-creation-limit-policy/policy-period-in-minutes]))

(clojure.spec.alpha/def :portkey.aws.gamelift/update-fleet-capacity-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift/fleet-id]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-utilization-input/fleet-ids (clojure.spec.alpha/and :portkey.aws.gamelift/fleet-id-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-utilization-input/limit (clojure.spec.alpha/and :portkey.aws.gamelift/positive-integer))
(clojure.spec.alpha/def :portkey.aws.gamelift.describe-fleet-utilization-input/next-token (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-fleet-utilization-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-fleet-utilization-input/fleet-ids :portkey.aws.gamelift.describe-fleet-utilization-input/limit :portkey.aws.gamelift.describe-fleet-utilization-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.gamelift/fleet-capacity-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/fleet-capacity))

(clojure.spec.alpha/def :portkey.aws.gamelift.start-game-session-placement-input/placement-id (clojure.spec.alpha/and :portkey.aws.gamelift/id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.start-game-session-placement-input/game-properties (clojure.spec.alpha/and :portkey.aws.gamelift/game-property-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.start-game-session-placement-input/maximum-player-session-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.start-game-session-placement-input/game-session-name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.start-game-session-placement-input/player-latencies (clojure.spec.alpha/and :portkey.aws.gamelift/player-latency-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.start-game-session-placement-input/desired-player-sessions (clojure.spec.alpha/and :portkey.aws.gamelift/desired-player-session-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/start-game-session-placement-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.start-game-session-placement-input/placement-id :portkey.aws.gamelift/game-session-queue-name :portkey.aws.gamelift.start-game-session-placement-input/maximum-player-session-count] :opt-un [:portkey.aws.gamelift.start-game-session-placement-input/game-properties :portkey.aws.gamelift.start-game-session-placement-input/game-session-name :portkey.aws.gamelift.start-game-session-placement-input/player-latencies :portkey.aws.gamelift.start-game-session-placement-input/desired-player-sessions :portkey.aws.gamelift/game-session-data]))

(clojure.spec.alpha/def :portkey.aws.gamelift.describe-ec-2-instance-limits-output/ec-2-instance-limits (clojure.spec.alpha/and :portkey.aws.gamelift/ec-2-instance-limit-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/describe-ec-2-instance-limits-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.describe-ec-2-instance-limits-output/ec-2-instance-limits]))

(clojure.spec.alpha/def :portkey.aws.gamelift.create-player-sessions-input/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/arn-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.create-player-sessions-input/player-ids (clojure.spec.alpha/and :portkey.aws.gamelift/player-id-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/create-player-sessions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.gamelift.create-player-sessions-input/game-session-id :portkey.aws.gamelift.create-player-sessions-input/player-ids] :opt-un [:portkey.aws.gamelift/player-data-map]))

(clojure.spec.alpha/def :portkey.aws.gamelift/desired-player-session-list (clojure.spec.alpha/coll-of :portkey.aws.gamelift/desired-player-session))

(clojure.spec.alpha/def :portkey.aws.gamelift/build-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^build-\S+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.gamelift/operating-system #{"WINDOWS_2012" :windows-2012 "AMAZON_LINUX" :amazon-linux})

(clojure.spec.alpha/def :portkey.aws.gamelift/accept-match-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.gamelift/scaling-status-type #{:deleted "UPDATE_REQUESTED" "UPDATING" :deleting "ERROR" :update-requested :active "DELETING" "DELETE_REQUESTED" "ACTIVE" :updating :error "DELETED" :delete-requested})

(clojure.spec.alpha/def :portkey.aws.gamelift/acceptance-type #{"REJECT" :reject "ACCEPT" :accept})

(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/end-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/start-time (clojure.spec.alpha/and :portkey.aws.gamelift/timestamp))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/maximum-player-session-count (clojure.spec.alpha/and :portkey.aws.gamelift/whole-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/placement-id (clojure.spec.alpha/and :portkey.aws.gamelift/id-string-model))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/status (clojure.spec.alpha/and :portkey.aws.gamelift/game-session-placement-state))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/port (clojure.spec.alpha/and :portkey.aws.gamelift/port-number))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/player-latencies (clojure.spec.alpha/and :portkey.aws.gamelift/player-latency-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/game-session-arn (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/placed-player-sessions (clojure.spec.alpha/and :portkey.aws.gamelift/placed-player-session-list))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/game-session-name (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/game-session-id (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/game-session-region (clojure.spec.alpha/and :portkey.aws.gamelift/non-zero-and-max-string))
(clojure.spec.alpha/def :portkey.aws.gamelift.game-session-placement/game-properties (clojure.spec.alpha/and :portkey.aws.gamelift/game-property-list))
(clojure.spec.alpha/def :portkey.aws.gamelift/game-session-placement (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.gamelift.game-session-placement/end-time :portkey.aws.gamelift.game-session-placement/start-time :portkey.aws.gamelift.game-session-placement/maximum-player-session-count :portkey.aws.gamelift.game-session-placement/placement-id :portkey.aws.gamelift/matchmaker-data :portkey.aws.gamelift.game-session-placement/status :portkey.aws.gamelift/game-session-data :portkey.aws.gamelift.game-session-placement/port :portkey.aws.gamelift.game-session-placement/player-latencies :portkey.aws.gamelift.game-session-placement/game-session-arn :portkey.aws.gamelift.game-session-placement/placed-player-sessions :portkey.aws.gamelift.game-session-placement/game-session-name :portkey.aws.gamelift.game-session-placement/game-session-id :portkey.aws.gamelift.game-session-placement/game-session-region :portkey.aws.gamelift/ip-address :portkey.aws.gamelift.game-session-placement/game-properties :portkey.aws.gamelift/game-session-queue-name]))

(clojure.core/defn update-runtime-configuration ([update-runtime-configuration-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-runtime-configuration-input update-runtime-configuration-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/update-runtime-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/update-runtime-configuration-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRuntimeConfiguration", :http.request.configuration/output-deser-fn deser-update-runtime-configuration-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "InvalidFleetStatusException" :portkey.aws.gamelift/invalid-fleet-status-exception}})))))
(clojure.spec.alpha/fdef update-runtime-configuration :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/update-runtime-configuration-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/update-runtime-configuration-output))

(clojure.core/defn list-fleets ([] (list-fleets {})) ([list-fleets-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-fleets-input list-fleets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/list-fleets-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/list-fleets-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListFleets", :http.request.configuration/output-deser-fn deser-list-fleets-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef list-fleets :args (clojure.spec.alpha/? :portkey.aws.gamelift/list-fleets-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/list-fleets-output))

(clojure.core/defn create-alias ([create-alias-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-alias-input create-alias-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-alias-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-alias-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAlias", :http.request.configuration/output-deser-fn deser-create-alias-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "ConflictException" :portkey.aws.gamelift/conflict-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "LimitExceededException" :portkey.aws.gamelift/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/create-alias-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-alias-output))

(clojure.core/defn start-match-backfill ([start-match-backfill-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-match-backfill-input start-match-backfill-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/start-match-backfill-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/start-match-backfill-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartMatchBackfill", :http.request.configuration/output-deser-fn deser-start-match-backfill-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef start-match-backfill :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/start-match-backfill-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/start-match-backfill-output))

(clojure.core/defn stop-game-session-placement ([stop-game-session-placement-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-game-session-placement-input stop-game-session-placement-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/stop-game-session-placement-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/stop-game-session-placement-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopGameSessionPlacement", :http.request.configuration/output-deser-fn deser-stop-game-session-placement-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef stop-game-session-placement :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/stop-game-session-placement-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/stop-game-session-placement-output))

(clojure.core/defn create-fleet ([create-fleet-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-fleet-input create-fleet-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-fleet-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-fleet-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateFleet", :http.request.configuration/output-deser-fn deser-create-fleet-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "ConflictException" :portkey.aws.gamelift/conflict-exception, "LimitExceededException" :portkey.aws.gamelift/limit-exceeded-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef create-fleet :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/create-fleet-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-fleet-output))

(clojure.core/defn list-builds ([] (list-builds {})) ([list-builds-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-builds-input list-builds-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/list-builds-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/list-builds-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBuilds", :http.request.configuration/output-deser-fn deser-list-builds-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-builds :args (clojure.spec.alpha/? :portkey.aws.gamelift/list-builds-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/list-builds-output))

(clojure.core/defn resolve-alias ([resolve-alias-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-resolve-alias-input resolve-alias-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/resolve-alias-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/resolve-alias-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResolveAlias", :http.request.configuration/output-deser-fn deser-resolve-alias-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "TerminalRoutingStrategyException" :portkey.aws.gamelift/terminal-routing-strategy-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef resolve-alias :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/resolve-alias-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/resolve-alias-output))

(clojure.core/defn delete-matchmaking-configuration ([delete-matchmaking-configuration-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-matchmaking-configuration-input delete-matchmaking-configuration-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/delete-matchmaking-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/delete-matchmaking-configuration-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteMatchmakingConfiguration", :http.request.configuration/output-deser-fn deser-delete-matchmaking-configuration-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef delete-matchmaking-configuration :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/delete-matchmaking-configuration-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/delete-matchmaking-configuration-output))

(clojure.core/defn update-build ([update-build-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-build-input update-build-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/update-build-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/update-build-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateBuild", :http.request.configuration/output-deser-fn deser-update-build-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-build :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/update-build-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/update-build-output))

(clojure.core/defn update-fleet-attributes ([update-fleet-attributes-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-fleet-attributes-input update-fleet-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/update-fleet-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/update-fleet-attributes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateFleetAttributes", :http.request.configuration/output-deser-fn deser-update-fleet-attributes-output, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.gamelift/not-found-exception, "ConflictException" :portkey.aws.gamelift/conflict-exception, "InvalidFleetStatusException" :portkey.aws.gamelift/invalid-fleet-status-exception, "LimitExceededException" :portkey.aws.gamelift/limit-exceeded-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef update-fleet-attributes :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/update-fleet-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/update-fleet-attributes-output))

(clojure.core/defn describe-game-session-queues ([] (describe-game-session-queues {})) ([describe-game-session-queues-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-game-session-queues-input describe-game-session-queues-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-game-session-queues-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-game-session-queues-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeGameSessionQueues", :http.request.configuration/output-deser-fn deser-describe-game-session-queues-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef describe-game-session-queues :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-game-session-queues-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-game-session-queues-output))

(clojure.core/defn get-game-session-log-url ([get-game-session-log-url-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-game-session-log-url-input get-game-session-log-url-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/get-game-session-log-url-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/get-game-session-log-url-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetGameSessionLogUrl", :http.request.configuration/output-deser-fn deser-get-game-session-log-url-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-game-session-log-url :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/get-game-session-log-url-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/get-game-session-log-url-output))

(clojure.core/defn update-fleet-port-settings ([update-fleet-port-settings-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-fleet-port-settings-input update-fleet-port-settings-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/update-fleet-port-settings-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/update-fleet-port-settings-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateFleetPortSettings", :http.request.configuration/output-deser-fn deser-update-fleet-port-settings-output, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.gamelift/not-found-exception, "ConflictException" :portkey.aws.gamelift/conflict-exception, "InvalidFleetStatusException" :portkey.aws.gamelift/invalid-fleet-status-exception, "LimitExceededException" :portkey.aws.gamelift/limit-exceeded-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef update-fleet-port-settings :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/update-fleet-port-settings-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/update-fleet-port-settings-output))

(clojure.core/defn describe-scaling-policies ([describe-scaling-policies-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-scaling-policies-input describe-scaling-policies-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-scaling-policies-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-scaling-policies-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeScalingPolicies", :http.request.configuration/output-deser-fn deser-describe-scaling-policies-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception}})))))
(clojure.spec.alpha/fdef describe-scaling-policies :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/describe-scaling-policies-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-scaling-policies-output))

(clojure.core/defn stop-fleet-actions ([stop-fleet-actions-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-fleet-actions-input stop-fleet-actions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/stop-fleet-actions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/stop-fleet-actions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopFleetActions", :http.request.configuration/output-deser-fn deser-stop-fleet-actions-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception}})))))
(clojure.spec.alpha/fdef stop-fleet-actions :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/stop-fleet-actions-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/stop-fleet-actions-output))

(clojure.core/defn search-game-sessions ([] (search-game-sessions {})) ([search-game-sessions-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-search-game-sessions-input search-game-sessions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/search-game-sessions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/search-game-sessions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchGameSessions", :http.request.configuration/output-deser-fn deser-search-game-sessions-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "TerminalRoutingStrategyException" :portkey.aws.gamelift/terminal-routing-strategy-exception}})))))
(clojure.spec.alpha/fdef search-game-sessions :args (clojure.spec.alpha/? :portkey.aws.gamelift/search-game-sessions-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/search-game-sessions-output))

(clojure.core/defn describe-ec-2-instance-limits ([] (describe-ec-2-instance-limits {})) ([describe-ec-2-instance-limits-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-ec-2-instance-limits-input describe-ec-2-instance-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-ec-2-instance-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-ec-2-instance-limits-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEC2InstanceLimits", :http.request.configuration/output-deser-fn deser-describe-ec-2-instance-limits-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef describe-ec-2-instance-limits :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-ec-2-instance-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-ec-2-instance-limits-output))

(clojure.core/defn describe-game-session-details ([] (describe-game-session-details {})) ([describe-game-session-details-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-game-session-details-input describe-game-session-details-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-game-session-details-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-game-session-details-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeGameSessionDetails", :http.request.configuration/output-deser-fn deser-describe-game-session-details-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "TerminalRoutingStrategyException" :portkey.aws.gamelift/terminal-routing-strategy-exception}})))))
(clojure.spec.alpha/fdef describe-game-session-details :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-game-session-details-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-game-session-details-output))

(clojure.core/defn create-game-session-queue ([create-game-session-queue-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-game-session-queue-input create-game-session-queue-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-game-session-queue-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-game-session-queue-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateGameSessionQueue", :http.request.configuration/output-deser-fn deser-create-game-session-queue-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "LimitExceededException" :portkey.aws.gamelift/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-game-session-queue :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/create-game-session-queue-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-game-session-queue-output))

(clojure.core/defn update-alias ([update-alias-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-alias-input update-alias-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/update-alias-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/update-alias-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAlias", :http.request.configuration/output-deser-fn deser-update-alias-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-alias :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/update-alias-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/update-alias-output))

(clojure.core/defn accept-match ([accept-match-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-accept-match-input accept-match-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/accept-match-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/accept-match-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AcceptMatch", :http.request.configuration/output-deser-fn deser-accept-match-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef accept-match :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/accept-match-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/accept-match-output))

(clojure.core/defn create-vpc-peering-authorization ([create-vpc-peering-authorization-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-vpc-peering-authorization-input create-vpc-peering-authorization-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-vpc-peering-authorization-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-vpc-peering-authorization-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateVpcPeeringAuthorization", :http.request.configuration/output-deser-fn deser-create-vpc-peering-authorization-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-vpc-peering-authorization :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/create-vpc-peering-authorization-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-vpc-peering-authorization-output))

(clojure.core/defn delete-scaling-policy ([delete-scaling-policy-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-scaling-policy-input delete-scaling-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/delete-scaling-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteScalingPolicy", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-scaling-policy :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/delete-scaling-policy-input) :ret clojure.core/true?)

(clojure.core/defn create-build ([] (create-build {})) ([create-build-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-build-input create-build-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-build-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-build-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateBuild", :http.request.configuration/output-deser-fn deser-create-build-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "ConflictException" :portkey.aws.gamelift/conflict-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-build :args (clojure.spec.alpha/? :portkey.aws.gamelift/create-build-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-build-output))

(clojure.core/defn describe-game-session-placement ([describe-game-session-placement-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-game-session-placement-input describe-game-session-placement-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-game-session-placement-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-game-session-placement-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeGameSessionPlacement", :http.request.configuration/output-deser-fn deser-describe-game-session-placement-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef describe-game-session-placement :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/describe-game-session-placement-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-game-session-placement-output))

(clojure.core/defn describe-game-sessions ([] (describe-game-sessions {})) ([describe-game-sessions-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-game-sessions-input describe-game-sessions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-game-sessions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-game-sessions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeGameSessions", :http.request.configuration/output-deser-fn deser-describe-game-sessions-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "TerminalRoutingStrategyException" :portkey.aws.gamelift/terminal-routing-strategy-exception}})))))
(clojure.spec.alpha/fdef describe-game-sessions :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-game-sessions-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-game-sessions-output))

(clojure.core/defn request-upload-credentials ([request-upload-credentials-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-request-upload-credentials-input request-upload-credentials-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/request-upload-credentials-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/request-upload-credentials-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RequestUploadCredentials", :http.request.configuration/output-deser-fn deser-request-upload-credentials-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef request-upload-credentials :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/request-upload-credentials-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/request-upload-credentials-output))

(clojure.core/defn describe-fleet-port-settings ([describe-fleet-port-settings-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-fleet-port-settings-input describe-fleet-port-settings-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-fleet-port-settings-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-fleet-port-settings-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeFleetPortSettings", :http.request.configuration/output-deser-fn deser-describe-fleet-port-settings-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef describe-fleet-port-settings :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/describe-fleet-port-settings-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-fleet-port-settings-output))

(clojure.core/defn delete-fleet ([delete-fleet-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-fleet-input delete-fleet-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/delete-fleet-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteFleet", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidFleetStatusException" :portkey.aws.gamelift/invalid-fleet-status-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-fleet :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/delete-fleet-input) :ret clojure.core/true?)

(clojure.core/defn describe-matchmaking-configurations ([] (describe-matchmaking-configurations {})) ([describe-matchmaking-configurations-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-matchmaking-configurations-input describe-matchmaking-configurations-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-matchmaking-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-matchmaking-configurations-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMatchmakingConfigurations", :http.request.configuration/output-deser-fn deser-describe-matchmaking-configurations-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef describe-matchmaking-configurations :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-matchmaking-configurations-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-matchmaking-configurations-output))

(clojure.core/defn stop-matchmaking ([stop-matchmaking-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-matchmaking-input stop-matchmaking-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/stop-matchmaking-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/stop-matchmaking-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopMatchmaking", :http.request.configuration/output-deser-fn deser-stop-matchmaking-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef stop-matchmaking :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/stop-matchmaking-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/stop-matchmaking-output))

(clojure.core/defn describe-fleet-utilization ([] (describe-fleet-utilization {})) ([describe-fleet-utilization-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-fleet-utilization-input describe-fleet-utilization-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-fleet-utilization-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-fleet-utilization-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeFleetUtilization", :http.request.configuration/output-deser-fn deser-describe-fleet-utilization-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef describe-fleet-utilization :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-fleet-utilization-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-fleet-utilization-output))

(clojure.core/defn describe-alias ([describe-alias-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-alias-input describe-alias-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-alias-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-alias-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAlias", :http.request.configuration/output-deser-fn deser-describe-alias-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-alias :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/describe-alias-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-alias-output))

(clojure.core/defn describe-runtime-configuration ([describe-runtime-configuration-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-runtime-configuration-input describe-runtime-configuration-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-runtime-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-runtime-configuration-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRuntimeConfiguration", :http.request.configuration/output-deser-fn deser-describe-runtime-configuration-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-runtime-configuration :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/describe-runtime-configuration-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-runtime-configuration-output))

(clojure.core/defn create-matchmaking-rule-set ([create-matchmaking-rule-set-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-matchmaking-rule-set-input create-matchmaking-rule-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-matchmaking-rule-set-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-matchmaking-rule-set-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateMatchmakingRuleSet", :http.request.configuration/output-deser-fn deser-create-matchmaking-rule-set-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef create-matchmaking-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/create-matchmaking-rule-set-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-matchmaking-rule-set-output))

(clojure.core/defn list-aliases ([] (list-aliases {})) ([list-aliases-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-aliases-input list-aliases-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/list-aliases-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/list-aliases-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAliases", :http.request.configuration/output-deser-fn deser-list-aliases-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-aliases :args (clojure.spec.alpha/? :portkey.aws.gamelift/list-aliases-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/list-aliases-output))

(clojure.core/defn describe-instances ([describe-instances-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-instances-input describe-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeInstances", :http.request.configuration/output-deser-fn deser-describe-instances-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-instances :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/describe-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-instances-output))

(clojure.core/defn delete-game-session-queue ([delete-game-session-queue-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-game-session-queue-input delete-game-session-queue-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/delete-game-session-queue-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/delete-game-session-queue-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteGameSessionQueue", :http.request.configuration/output-deser-fn deser-delete-game-session-queue-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef delete-game-session-queue :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/delete-game-session-queue-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/delete-game-session-queue-output))

(clojure.core/defn create-player-sessions ([create-player-sessions-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-player-sessions-input create-player-sessions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-player-sessions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-player-sessions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePlayerSessions", :http.request.configuration/output-deser-fn deser-create-player-sessions-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidGameSessionStatusException" :portkey.aws.gamelift/invalid-game-session-status-exception, "GameSessionFullException" :portkey.aws.gamelift/game-session-full-exception, "TerminalRoutingStrategyException" :portkey.aws.gamelift/terminal-routing-strategy-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception}})))))
(clojure.spec.alpha/fdef create-player-sessions :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/create-player-sessions-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-player-sessions-output))

(clojure.core/defn create-player-session ([create-player-session-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-player-session-input create-player-session-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-player-session-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-player-session-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePlayerSession", :http.request.configuration/output-deser-fn deser-create-player-session-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidGameSessionStatusException" :portkey.aws.gamelift/invalid-game-session-status-exception, "GameSessionFullException" :portkey.aws.gamelift/game-session-full-exception, "TerminalRoutingStrategyException" :portkey.aws.gamelift/terminal-routing-strategy-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception}})))))
(clojure.spec.alpha/fdef create-player-session :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/create-player-session-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-player-session-output))

(clojure.core/defn delete-alias ([delete-alias-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-alias-input delete-alias-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/delete-alias-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAlias", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-alias :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/delete-alias-input) :ret clojure.core/true?)

(clojure.core/defn create-matchmaking-configuration ([create-matchmaking-configuration-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-matchmaking-configuration-input create-matchmaking-configuration-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-matchmaking-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-matchmaking-configuration-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateMatchmakingConfiguration", :http.request.configuration/output-deser-fn deser-create-matchmaking-configuration-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "LimitExceededException" :portkey.aws.gamelift/limit-exceeded-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef create-matchmaking-configuration :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/create-matchmaking-configuration-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-matchmaking-configuration-output))

(clojure.core/defn start-matchmaking ([start-matchmaking-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-matchmaking-input start-matchmaking-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/start-matchmaking-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/start-matchmaking-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartMatchmaking", :http.request.configuration/output-deser-fn deser-start-matchmaking-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef start-matchmaking :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/start-matchmaking-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/start-matchmaking-output))

(clojure.core/defn delete-build ([delete-build-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-build-input delete-build-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/delete-build-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBuild", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-build :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/delete-build-input) :ret clojure.core/true?)

(clojure.core/defn update-game-session-queue ([update-game-session-queue-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-game-session-queue-input update-game-session-queue-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/update-game-session-queue-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/update-game-session-queue-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateGameSessionQueue", :http.request.configuration/output-deser-fn deser-update-game-session-queue-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef update-game-session-queue :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/update-game-session-queue-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/update-game-session-queue-output))

(clojure.core/defn update-fleet-capacity ([update-fleet-capacity-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-fleet-capacity-input update-fleet-capacity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/update-fleet-capacity-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/update-fleet-capacity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateFleetCapacity", :http.request.configuration/output-deser-fn deser-update-fleet-capacity-output, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.gamelift/not-found-exception, "ConflictException" :portkey.aws.gamelift/conflict-exception, "LimitExceededException" :portkey.aws.gamelift/limit-exceeded-exception, "InvalidFleetStatusException" :portkey.aws.gamelift/invalid-fleet-status-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef update-fleet-capacity :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/update-fleet-capacity-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/update-fleet-capacity-output))

(clojure.core/defn start-game-session-placement ([start-game-session-placement-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-game-session-placement-input start-game-session-placement-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/start-game-session-placement-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/start-game-session-placement-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartGameSessionPlacement", :http.request.configuration/output-deser-fn deser-start-game-session-placement-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef start-game-session-placement :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/start-game-session-placement-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/start-game-session-placement-output))

(clojure.core/defn describe-vpc-peering-authorizations ([] (describe-vpc-peering-authorizations {})) ([describe-vpc-peering-authorizations-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-vpc-peering-authorizations-input describe-vpc-peering-authorizations-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-vpc-peering-authorizations-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-vpc-peering-authorizations-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeVpcPeeringAuthorizations", :http.request.configuration/output-deser-fn deser-describe-vpc-peering-authorizations-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-vpc-peering-authorizations :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-vpc-peering-authorizations-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-vpc-peering-authorizations-output))

(clojure.core/defn describe-player-sessions ([] (describe-player-sessions {})) ([describe-player-sessions-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-player-sessions-input describe-player-sessions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-player-sessions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-player-sessions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePlayerSessions", :http.request.configuration/output-deser-fn deser-describe-player-sessions-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef describe-player-sessions :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-player-sessions-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-player-sessions-output))

(clojure.core/defn get-instance-access ([get-instance-access-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-instance-access-input get-instance-access-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/get-instance-access-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/get-instance-access-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstanceAccess", :http.request.configuration/output-deser-fn deser-get-instance-access-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef get-instance-access :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/get-instance-access-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/get-instance-access-output))

(clojure.core/defn update-matchmaking-configuration ([update-matchmaking-configuration-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-matchmaking-configuration-input update-matchmaking-configuration-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/update-matchmaking-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/update-matchmaking-configuration-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateMatchmakingConfiguration", :http.request.configuration/output-deser-fn deser-update-matchmaking-configuration-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef update-matchmaking-configuration :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/update-matchmaking-configuration-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/update-matchmaking-configuration-output))

(clojure.core/defn describe-fleet-capacity ([] (describe-fleet-capacity {})) ([describe-fleet-capacity-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-fleet-capacity-input describe-fleet-capacity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-fleet-capacity-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-fleet-capacity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeFleetCapacity", :http.request.configuration/output-deser-fn deser-describe-fleet-capacity-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef describe-fleet-capacity :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-fleet-capacity-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-fleet-capacity-output))

(clojure.core/defn describe-vpc-peering-connections ([] (describe-vpc-peering-connections {})) ([describe-vpc-peering-connections-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-vpc-peering-connections-input describe-vpc-peering-connections-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-vpc-peering-connections-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-vpc-peering-connections-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeVpcPeeringConnections", :http.request.configuration/output-deser-fn deser-describe-vpc-peering-connections-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-vpc-peering-connections :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-vpc-peering-connections-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-vpc-peering-connections-output))

(clojure.core/defn describe-fleet-attributes ([] (describe-fleet-attributes {})) ([describe-fleet-attributes-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-fleet-attributes-input describe-fleet-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-fleet-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-fleet-attributes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeFleetAttributes", :http.request.configuration/output-deser-fn deser-describe-fleet-attributes-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception}})))))
(clojure.spec.alpha/fdef describe-fleet-attributes :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-fleet-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-fleet-attributes-output))

(clojure.core/defn describe-matchmaking ([describe-matchmaking-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-matchmaking-input describe-matchmaking-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-matchmaking-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-matchmaking-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMatchmaking", :http.request.configuration/output-deser-fn deser-describe-matchmaking-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef describe-matchmaking :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/describe-matchmaking-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-matchmaking-output))

(clojure.core/defn describe-fleet-events ([describe-fleet-events-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-fleet-events-input describe-fleet-events-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-fleet-events-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-fleet-events-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeFleetEvents", :http.request.configuration/output-deser-fn deser-describe-fleet-events-output, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-fleet-events :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/describe-fleet-events-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-fleet-events-output))

(clojure.core/defn describe-matchmaking-rule-sets ([] (describe-matchmaking-rule-sets {})) ([describe-matchmaking-rule-sets-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-matchmaking-rule-sets-input describe-matchmaking-rule-sets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-matchmaking-rule-sets-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-matchmaking-rule-sets-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMatchmakingRuleSets", :http.request.configuration/output-deser-fn deser-describe-matchmaking-rule-sets-output, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception}})))))
(clojure.spec.alpha/fdef describe-matchmaking-rule-sets :args (clojure.spec.alpha/? :portkey.aws.gamelift/describe-matchmaking-rule-sets-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-matchmaking-rule-sets-output))

(clojure.core/defn create-vpc-peering-connection ([create-vpc-peering-connection-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-vpc-peering-connection-input create-vpc-peering-connection-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-vpc-peering-connection-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-vpc-peering-connection-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateVpcPeeringConnection", :http.request.configuration/output-deser-fn deser-create-vpc-peering-connection-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-vpc-peering-connection :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/create-vpc-peering-connection-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-vpc-peering-connection-output))

(clojure.core/defn start-fleet-actions ([start-fleet-actions-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-fleet-actions-input start-fleet-actions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/start-fleet-actions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/start-fleet-actions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartFleetActions", :http.request.configuration/output-deser-fn deser-start-fleet-actions-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception}})))))
(clojure.spec.alpha/fdef start-fleet-actions :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/start-fleet-actions-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/start-fleet-actions-output))

(clojure.core/defn update-game-session ([update-game-session-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-game-session-input update-game-session-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/update-game-session-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/update-game-session-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateGameSession", :http.request.configuration/output-deser-fn deser-update-game-session-output, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.gamelift/not-found-exception, "ConflictException" :portkey.aws.gamelift/conflict-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidGameSessionStatusException" :portkey.aws.gamelift/invalid-game-session-status-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception}})))))
(clojure.spec.alpha/fdef update-game-session :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/update-game-session-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/update-game-session-output))

(clojure.core/defn delete-vpc-peering-authorization ([delete-vpc-peering-authorization-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-vpc-peering-authorization-input delete-vpc-peering-authorization-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/delete-vpc-peering-authorization-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/delete-vpc-peering-authorization-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteVpcPeeringAuthorization", :http.request.configuration/output-deser-fn deser-delete-vpc-peering-authorization-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-vpc-peering-authorization :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/delete-vpc-peering-authorization-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/delete-vpc-peering-authorization-output))

(clojure.core/defn put-scaling-policy ([put-scaling-policy-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-scaling-policy-input put-scaling-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/put-scaling-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/put-scaling-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutScalingPolicy", :http.request.configuration/output-deser-fn deser-put-scaling-policy-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception}})))))
(clojure.spec.alpha/fdef put-scaling-policy :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/put-scaling-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/put-scaling-policy-output))

(clojure.core/defn validate-matchmaking-rule-set ([validate-matchmaking-rule-set-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-validate-matchmaking-rule-set-input validate-matchmaking-rule-set-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/validate-matchmaking-rule-set-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/validate-matchmaking-rule-set-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ValidateMatchmakingRuleSet", :http.request.configuration/output-deser-fn deser-validate-matchmaking-rule-set-output, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.gamelift/internal-service-exception, "UnsupportedRegionException" :portkey.aws.gamelift/unsupported-region-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception}})))))
(clojure.spec.alpha/fdef validate-matchmaking-rule-set :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/validate-matchmaking-rule-set-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/validate-matchmaking-rule-set-output))

(clojure.core/defn create-game-session ([create-game-session-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-game-session-input create-game-session-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/create-game-session-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/create-game-session-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateGameSession", :http.request.configuration/output-deser-fn deser-create-game-session-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "TerminalRoutingStrategyException" :portkey.aws.gamelift/terminal-routing-strategy-exception, "LimitExceededException" :portkey.aws.gamelift/limit-exceeded-exception, "FleetCapacityExceededException" :portkey.aws.gamelift/fleet-capacity-exceeded-exception, "ConflictException" :portkey.aws.gamelift/conflict-exception, "IdempotentParameterMismatchException" :portkey.aws.gamelift/idempotent-parameter-mismatch-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InvalidFleetStatusException" :portkey.aws.gamelift/invalid-fleet-status-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-game-session :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/create-game-session-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/create-game-session-output))

(clojure.core/defn describe-build ([describe-build-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-build-input describe-build-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/describe-build-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/describe-build-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeBuild", :http.request.configuration/output-deser-fn deser-describe-build-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-build :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/describe-build-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/describe-build-output))

(clojure.core/defn delete-vpc-peering-connection ([delete-vpc-peering-connection-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-vpc-peering-connection-input delete-vpc-peering-connection-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.gamelift/endpoints, :http.request.configuration/target-prefix "GameLift", :http.request.spec/output-spec :portkey.aws.gamelift/delete-vpc-peering-connection-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.gamelift/delete-vpc-peering-connection-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteVpcPeeringConnection", :http.request.configuration/output-deser-fn deser-delete-vpc-peering-connection-output, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.gamelift/unauthorized-exception, "InvalidRequestException" :portkey.aws.gamelift/invalid-request-exception, "NotFoundException" :portkey.aws.gamelift/not-found-exception, "InternalServiceException" :portkey.aws.gamelift/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-vpc-peering-connection :args (clojure.spec.alpha/tuple :portkey.aws.gamelift/delete-vpc-peering-connection-input) :ret (clojure.spec.alpha/and :portkey.aws.gamelift/delete-vpc-peering-connection-output))