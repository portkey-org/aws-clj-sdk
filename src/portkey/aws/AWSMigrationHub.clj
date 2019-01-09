(ns portkey.aws.AWSMigrationHub (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-created-artifact-name)

(clojure.core/declare ser-migration-task-name)

(clojure.core/declare ser-dry-run)

(clojure.core/declare ser-discovered-resource-description)

(clojure.core/declare ser-resource-attribute-list)

(clojure.core/declare ser-resource-attribute-type)

(clojure.core/declare ser-next-update-seconds)

(clojure.core/declare ser-created-artifact)

(clojure.core/declare ser-created-artifact-description)

(clojure.core/declare ser-discovered-resource)

(clojure.core/declare ser-configuration-id)

(clojure.core/declare ser-update-date-time)

(clojure.core/declare ser-status)

(clojure.core/declare ser-status-detail)

(clojure.core/declare ser-max-results-resources)

(clojure.core/declare ser-application-id)

(clojure.core/declare ser-application-status)

(clojure.core/declare ser-resource-attribute)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-progress-percent)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-resource-attribute-value)

(clojure.core/declare ser-token)

(clojure.core/declare ser-task)

(clojure.core/declare ser-max-results-created-artifacts)

(clojure.core/declare ser-progress-update-stream)

(clojure.core/defn- ser-created-artifact-name [input] #:http.request.field{:value input, :shape "CreatedArtifactName"})

(clojure.core/defn- ser-migration-task-name [input] #:http.request.field{:value input, :shape "MigrationTaskName"})

(clojure.core/defn- ser-dry-run [input] #:http.request.field{:value input, :shape "DryRun"})

(clojure.core/defn- ser-discovered-resource-description [input] #:http.request.field{:value input, :shape "DiscoveredResourceDescription"})

(clojure.core/defn- ser-resource-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-attribute coll) #:http.request.field{:shape "ResourceAttribute"}))) input), :shape "ResourceAttributeList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-resource-attribute-type [input] #:http.request.field{:value (clojure.core/get {"MAC_ADDRESS" "MAC_ADDRESS", :ipv-4-address "IPV4_ADDRESS", "IPV6_ADDRESS" "IPV6_ADDRESS", :bios-id "BIOS_ID", "BIOS_ID" "BIOS_ID", "VM_PATH" "VM_PATH", :vm-path "VM_PATH", "IPV4_ADDRESS" "IPV4_ADDRESS", "VM_MANAGED_OBJECT_REFERENCE" "VM_MANAGED_OBJECT_REFERENCE", :vm-managed-object-reference "VM_MANAGED_OBJECT_REFERENCE", :vm-manager-id "VM_MANAGER_ID", :fqdn "FQDN", :vm-name "VM_NAME", :mac-address "MAC_ADDRESS", "FQDN" "FQDN", "MOTHERBOARD_SERIAL_NUMBER" "MOTHERBOARD_SERIAL_NUMBER", "VM_NAME" "VM_NAME", "VM_MANAGER_ID" "VM_MANAGER_ID", :ipv-6-address "IPV6_ADDRESS", :motherboard-serial-number "MOTHERBOARD_SERIAL_NUMBER"} input), :shape "ResourceAttributeType"})

(clojure.core/defn- ser-next-update-seconds [input] #:http.request.field{:value input, :shape "NextUpdateSeconds"})

(clojure.core/defn- ser-created-artifact [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-created-artifact-name (:name input)) #:http.request.field{:name "Name", :shape "CreatedArtifactName"})], :shape "CreatedArtifact", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-created-artifact-description (input :description)) #:http.request.field{:name "Description", :shape "CreatedArtifactDescription"}))))

(clojure.core/defn- ser-created-artifact-description [input] #:http.request.field{:value input, :shape "CreatedArtifactDescription"})

(clojure.core/defn- ser-discovered-resource [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-configuration-id (:configuration-id input)) #:http.request.field{:name "ConfigurationId", :shape "ConfigurationId"})], :shape "DiscoveredResource", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-discovered-resource-description (input :description)) #:http.request.field{:name "Description", :shape "DiscoveredResourceDescription"}))))

(clojure.core/defn- ser-configuration-id [input] #:http.request.field{:value input, :shape "ConfigurationId"})

(clojure.core/defn- ser-update-date-time [input] #:http.request.field{:value input, :shape "UpdateDateTime"})

(clojure.core/defn- ser-status [input] #:http.request.field{:value (clojure.core/get {"NOT_STARTED" "NOT_STARTED", :not-started "NOT_STARTED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "FAILED" "FAILED", :failed "FAILED", "COMPLETED" "COMPLETED", :completed "COMPLETED"} input), :shape "Status"})

(clojure.core/defn- ser-status-detail [input] #:http.request.field{:value input, :shape "StatusDetail"})

(clojure.core/defn- ser-max-results-resources [input] #:http.request.field{:value input, :shape "MaxResultsResources"})

(clojure.core/defn- ser-application-id [input] #:http.request.field{:value input, :shape "ApplicationId"})

(clojure.core/defn- ser-application-status [input] #:http.request.field{:value (clojure.core/get {"NOT_STARTED" "NOT_STARTED", :not-started "NOT_STARTED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "COMPLETED" "COMPLETED", :completed "COMPLETED"} input), :shape "ApplicationStatus"})

(clojure.core/defn- ser-resource-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-attribute-type (:type input)) #:http.request.field{:name "Type", :shape "ResourceAttributeType"}) (clojure.core/into (ser-resource-attribute-value (:value input)) #:http.request.field{:name "Value", :shape "ResourceAttributeValue"})], :shape "ResourceAttribute", :type "structure"}))

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-progress-percent [input] #:http.request.field{:value input, :shape "ProgressPercent"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-resource-attribute-value [input] #:http.request.field{:value input, :shape "ResourceAttributeValue"})

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-task [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-status (:status input)) #:http.request.field{:name "Status", :shape "Status"})], :shape "Task", :type "structure"} (clojure.core/contains? input :status-detail) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-status-detail (input :status-detail)) #:http.request.field{:name "StatusDetail", :shape "StatusDetail"})) (clojure.core/contains? input :progress-percent) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-progress-percent (input :progress-percent)) #:http.request.field{:name "ProgressPercent", :shape "ProgressPercent"}))))

(clojure.core/defn- ser-max-results-created-artifacts [input] #:http.request.field{:value input, :shape "MaxResultsCreatedArtifacts"})

(clojure.core/defn- ser-progress-update-stream [input] #:http.request.field{:value input, :shape "ProgressUpdateStream"})

(clojure.core/defn- req-associate-discovered-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-discovered-resource (input :discovered-resource)) #:http.request.field{:name "DiscoveredResource", :shape "DiscoveredResource"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-describe-migration-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]}))

(clojure.core/defn- req-list-created-artifacts-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-created-artifacts (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsCreatedArtifacts"}))))

(clojure.core/defn- req-import-migration-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-list-discovered-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-resources (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsResources"}))))

(clojure.core/defn- req-disassociate-discovered-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-configuration-id (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "ConfigurationId"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-list-migration-tasks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :resource-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :resource-name)) #:http.request.field{:name "ResourceName", :shape "ResourceName"}))))

(clojure.core/defn- req-create-progress-update-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream-name)) #:http.request.field{:name "ProgressUpdateStreamName", :shape "ProgressUpdateStream"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-list-progress-update-streams-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-disassociate-created-artifact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-created-artifact-name (input :created-artifact-name)) #:http.request.field{:name "CreatedArtifactName", :shape "CreatedArtifactName"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-delete-progress-update-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream-name)) #:http.request.field{:name "ProgressUpdateStreamName", :shape "ProgressUpdateStream"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-describe-application-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "ApplicationId"})]}))

(clojure.core/defn- req-put-resource-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-resource-attribute-list (input :resource-attribute-list)) #:http.request.field{:name "ResourceAttributeList", :shape "ResourceAttributeList"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-notify-migration-task-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-task (input :task)) #:http.request.field{:name "Task", :shape "Task"}) (clojure.core/into (ser-update-date-time (input :update-date-time)) #:http.request.field{:name "UpdateDateTime", :shape "UpdateDateTime"}) (clojure.core/into (ser-next-update-seconds (input :next-update-seconds)) #:http.request.field{:name "NextUpdateSeconds", :shape "NextUpdateSeconds"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-associate-created-artifact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-created-artifact (input :created-artifact)) #:http.request.field{:name "CreatedArtifact", :shape "CreatedArtifact"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-notify-application-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "ApplicationId"}) (clojure.core/into (ser-application-status (input :status)) #:http.request.field{:name "Status", :shape "ApplicationStatus"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/associate-discovered-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name :portkey.aws.AWSMigrationHub/discovered-resource] :opt-un [:portkey.aws.AWSMigrationHub/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/created-artifact-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1600)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:[a-z-]+:[a-z0-9-]+:(?:[a-z0-9-]+|):(?:[0-9]{12}|):.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/migration-task-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[^:|]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/dry-run clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/discovered-resource-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.dry-run-operation/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/dry-run-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.dry-run-operation/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/resource-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub/resource-attribute :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/describe-migration-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/resource-attribute-type #{"MAC_ADDRESS" :ipv-4-address "IPV6_ADDRESS" :bios-id "BIOS_ID" "VM_PATH" :vm-path "IPV4_ADDRESS" "VM_MANAGED_OBJECT_REFERENCE" :vm-managed-object-reference :vm-manager-id :fqdn :vm-name :mac-address "FQDN" "MOTHERBOARD_SERIAL_NUMBER" "VM_NAME" "VM_MANAGER_ID" :ipv-6-address :motherboard-serial-number})

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/describe-migration-task-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub/migration-task]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/latest-resource-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub/resource-attribute :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/next-update-seconds (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.list-migration-tasks-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/list-migration-tasks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.list-migration-tasks-result/next-token :portkey.aws.AWSMigrationHub/migration-task-summary-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.progress-update-stream-summary/progress-update-stream-name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/progress-update-stream))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/progress-update-stream-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.progress-update-stream-summary/progress-update-stream-name]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.migration-task/resource-attribute-list (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/latest-resource-attribute-list))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/migration-task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name :portkey.aws.AWSMigrationHub/task :portkey.aws.AWSMigrationHub/update-date-time :portkey.aws.AWSMigrationHub.migration-task/resource-attribute-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.list-discovered-resources-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/list-discovered-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.list-discovered-resources-result/next-token :portkey.aws.AWSMigrationHub/discovered-resource-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.list-created-artifacts-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.list-created-artifacts-request/max-results (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/max-results-created-artifacts))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/list-created-artifacts-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name] :opt-un [:portkey.aws.AWSMigrationHub.list-created-artifacts-request/next-token :portkey.aws.AWSMigrationHub.list-created-artifacts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/migration-task-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name :portkey.aws.AWSMigrationHub/status :portkey.aws.AWSMigrationHub/progress-percent :portkey.aws.AWSMigrationHub/status-detail :portkey.aws.AWSMigrationHub/update-date-time]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/import-migration-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name] :opt-un [:portkey.aws.AWSMigrationHub/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.created-artifact/name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/created-artifact-name))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.created-artifact/description (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/created-artifact-description))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/created-artifact (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.created-artifact/name] :opt-un [:portkey.aws.AWSMigrationHub.created-artifact/description]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/created-artifact-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/notify-migration-task-state-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.discovered-resource/description (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/discovered-resource-description))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/discovered-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/configuration-id] :opt-un [:portkey.aws.AWSMigrationHub.discovered-resource/description]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/configuration-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.list-discovered-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.list-discovered-resources-request/max-results (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/max-results-resources))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/list-discovered-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name] :opt-un [:portkey.aws.AWSMigrationHub.list-discovered-resources-request/next-token :portkey.aws.AWSMigrationHub.list-discovered-resources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/update-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/discovered-resource-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub/discovered-resource))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.unauthorized-operation/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/unauthorized-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.unauthorized-operation/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/put-resource-attributes-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/status #{"COMPLETED" "IN_PROGRESS" :in-progress :completed "NOT_STARTED" "FAILED" :not-started :failed})

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/disassociate-created-artifact-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/migration-task-summary-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub/migration-task-summary))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/disassociate-discovered-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name :portkey.aws.AWSMigrationHub/configuration-id] :opt-un [:portkey.aws.AWSMigrationHub/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.list-migration-tasks-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/list-migration-tasks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.list-migration-tasks-request/next-token :portkey.aws.AWSMigrationHub/max-results :portkey.aws.AWSMigrationHub/resource-name]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/status-detail (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/max-results-resources (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.create-progress-update-stream-request/progress-update-stream-name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/progress-update-stream))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/create-progress-update-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.create-progress-update-stream-request/progress-update-stream-name] :opt-un [:portkey.aws.AWSMigrationHub/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/delete-progress-update-stream-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.policy-error-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/policy-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.policy-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/application-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/application-status #{"COMPLETED" "IN_PROGRESS" :in-progress :completed "NOT_STARTED" :not-started})

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.list-progress-update-streams-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/list-progress-update-streams-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.list-progress-update-streams-request/next-token :portkey.aws.AWSMigrationHub/max-results]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.resource-attribute/type (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/resource-attribute-type))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.resource-attribute/value (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/resource-attribute-value))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/resource-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.resource-attribute/type :portkey.aws.AWSMigrationHub.resource-attribute/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/created-artifact-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub/created-artifact))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.invalid-input-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/disassociate-created-artifact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name :portkey.aws.AWSMigrationHub/created-artifact-name] :opt-un [:portkey.aws.AWSMigrationHub/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/progress-update-stream-summary-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub/progress-update-stream-summary))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/notify-application-state-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.delete-progress-update-stream-request/progress-update-stream-name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/progress-update-stream))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/delete-progress-update-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.delete-progress-update-stream-request/progress-update-stream-name] :opt-un [:portkey.aws.AWSMigrationHub/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/describe-application-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/application-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/progress-percent (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/associate-created-artifact-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/put-resource-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name :portkey.aws.AWSMigrationHub/resource-attribute-list] :opt-un [:portkey.aws.AWSMigrationHub/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/disassociate-discovered-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.list-progress-update-streams-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/list-progress-update-streams-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub/progress-update-stream-summary-list :portkey.aws.AWSMigrationHub.list-progress-update-streams-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/notify-migration-task-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name :portkey.aws.AWSMigrationHub/task :portkey.aws.AWSMigrationHub/update-date-time :portkey.aws.AWSMigrationHub/next-update-seconds] :opt-un [:portkey.aws.AWSMigrationHub/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/resource-attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.describe-application-state-result/last-updated-time (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/update-date-time))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/describe-application-state-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub/application-status :portkey.aws.AWSMigrationHub.describe-application-state-result/last-updated-time]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/import-migration-task-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/associate-discovered-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/task (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/status] :opt-un [:portkey.aws.AWSMigrationHub/status-detail :portkey.aws.AWSMigrationHub/progress-percent]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/associate-created-artifact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/progress-update-stream :portkey.aws.AWSMigrationHub/migration-task-name :portkey.aws.AWSMigrationHub/created-artifact] :opt-un [:portkey.aws.AWSMigrationHub/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/max-results-created-artifacts (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.list-created-artifacts-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/list-created-artifacts-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.list-created-artifacts-result/next-token :portkey.aws.AWSMigrationHub/created-artifact-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/progress-update-stream (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 50)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[^/:|\000-\037]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.notify-application-state-request/status (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/application-status))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/notify-application-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub/application-id :portkey.aws.AWSMigrationHub.notify-application-state-request/status] :opt-un [:portkey.aws.AWSMigrationHub/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub/create-progress-update-stream-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.core/defn associate-created-artifact ([associate-created-artifact-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-created-artifact-request associate-created-artifact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/associate-created-artifact-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/associate-created-artifact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateCreatedArtifact", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-created-artifact :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/associate-created-artifact-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/associate-created-artifact-result))

(clojure.core/defn import-migration-task ([import-migration-task-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-import-migration-task-request import-migration-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/import-migration-task-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/import-migration-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ImportMigrationTask", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef import-migration-task :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/import-migration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/import-migration-task-result))

(clojure.core/defn disassociate-discovered-resource ([disassociate-discovered-resource-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-discovered-resource-request disassociate-discovered-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/disassociate-discovered-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/disassociate-discovered-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateDiscoveredResource", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-discovered-resource :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/disassociate-discovered-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/disassociate-discovered-resource-result))

(clojure.core/defn disassociate-created-artifact ([disassociate-created-artifact-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-created-artifact-request disassociate-created-artifact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/disassociate-created-artifact-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/disassociate-created-artifact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateCreatedArtifact", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-created-artifact :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/disassociate-created-artifact-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/disassociate-created-artifact-result))

(clojure.core/defn list-created-artifacts ([list-created-artifacts-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-created-artifacts-request list-created-artifacts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/list-created-artifacts-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/list-created-artifacts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCreatedArtifacts", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-created-artifacts :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/list-created-artifacts-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/list-created-artifacts-result))

(clojure.core/defn describe-migration-task ([describe-migration-task-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-migration-task-request describe-migration-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/describe-migration-task-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/describe-migration-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMigrationTask", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-migration-task :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/describe-migration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/describe-migration-task-result))

(clojure.core/defn delete-progress-update-stream ([delete-progress-update-stream-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-progress-update-stream-request delete-progress-update-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/delete-progress-update-stream-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/delete-progress-update-stream-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProgressUpdateStream", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-progress-update-stream :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/delete-progress-update-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/delete-progress-update-stream-result))

(clojure.core/defn list-progress-update-streams ([] (list-progress-update-streams {})) ([list-progress-update-streams-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-progress-update-streams-request list-progress-update-streams-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/list-progress-update-streams-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/list-progress-update-streams-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProgressUpdateStreams", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-progress-update-streams :args (clojure.spec.alpha/? :portkey.aws.AWSMigrationHub/list-progress-update-streams-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/list-progress-update-streams-result))

(clojure.core/defn put-resource-attributes ([put-resource-attributes-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-resource-attributes-request put-resource-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/put-resource-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/put-resource-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutResourceAttributes", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef put-resource-attributes :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/put-resource-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/put-resource-attributes-result))

(clojure.core/defn notify-migration-task-state ([notify-migration-task-state-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-notify-migration-task-state-request notify-migration-task-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/notify-migration-task-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/notify-migration-task-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "NotifyMigrationTaskState", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef notify-migration-task-state :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/notify-migration-task-state-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/notify-migration-task-state-result))

(clojure.core/defn list-migration-tasks ([] (list-migration-tasks {})) ([list-migration-tasks-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-migration-tasks-request list-migration-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/list-migration-tasks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/list-migration-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListMigrationTasks", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-migration-tasks :args (clojure.spec.alpha/? :portkey.aws.AWSMigrationHub/list-migration-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/list-migration-tasks-result))

(clojure.core/defn list-discovered-resources ([list-discovered-resources-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-discovered-resources-request list-discovered-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/list-discovered-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/list-discovered-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDiscoveredResources", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-discovered-resources :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/list-discovered-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/list-discovered-resources-result))

(clojure.core/defn notify-application-state ([notify-application-state-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-notify-application-state-request notify-application-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/notify-application-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/notify-application-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "NotifyApplicationState", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef notify-application-state :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/notify-application-state-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/notify-application-state-result))

(clojure.core/defn create-progress-update-stream ([create-progress-update-stream-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-progress-update-stream-request create-progress-update-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/create-progress-update-stream-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/create-progress-update-stream-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProgressUpdateStream", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception}})))))
(clojure.spec.alpha/fdef create-progress-update-stream :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/create-progress-update-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/create-progress-update-stream-result))

(clojure.core/defn associate-discovered-resource ([associate-discovered-resource-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-discovered-resource-request associate-discovered-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/associate-discovered-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/associate-discovered-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateDiscoveredResource", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-discovered-resource :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/associate-discovered-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/associate-discovered-resource-result))

(clojure.core/defn describe-application-state ([describe-application-state-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-application-state-request describe-application-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub/endpoints, :http.request.spec/output-spec :portkey.aws.AWSMigrationHub/describe-application-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub/describe-application-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeApplicationState", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-application-state :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub/describe-application-state-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub/describe-application-state-result))
