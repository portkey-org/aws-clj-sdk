(ns portkey.aws.autoscaling (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope
    {:service "autoscaling", :region "us-gov-east-1"},
    :ssl-common-name "autoscaling.us-gov-east-1.amazonaws.com",
    :endpoint "https://autoscaling.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "autoscaling", :region "ap-northeast-1"},
    :ssl-common-name "autoscaling.ap-northeast-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "autoscaling", :region "eu-west-1"},
    :ssl-common-name "autoscaling.eu-west-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "autoscaling", :region "us-east-2"},
    :ssl-common-name "autoscaling.us-east-2.amazonaws.com",
    :endpoint "https://autoscaling.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "autoscaling", :region "ap-southeast-2"},
    :ssl-common-name "autoscaling.ap-southeast-2.amazonaws.com",
    :endpoint "https://autoscaling.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "autoscaling", :region "cn-north-1"},
    :ssl-common-name "autoscaling.cn-north-1.amazonaws.com.cn",
    :endpoint "https://autoscaling.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "autoscaling", :region "sa-east-1"},
    :ssl-common-name "autoscaling.sa-east-1.amazonaws.com",
    :endpoint "https://autoscaling.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "autoscaling", :region "ap-southeast-1"},
    :ssl-common-name "autoscaling.ap-southeast-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "autoscaling", :region "cn-northwest-1"},
    :ssl-common-name "autoscaling.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://autoscaling.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "autoscaling", :region "ap-northeast-2"},
    :ssl-common-name "autoscaling.ap-northeast-2.amazonaws.com",
    :endpoint "https://autoscaling.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "autoscaling", :region "eu-west-3"},
    :ssl-common-name "autoscaling.eu-west-3.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "autoscaling", :region "ca-central-1"},
    :ssl-common-name "autoscaling.ca-central-1.amazonaws.com",
    :endpoint "https://autoscaling.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "autoscaling", :region "eu-central-1"},
    :ssl-common-name "autoscaling.eu-central-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "autoscaling", :region "eu-west-2"},
    :ssl-common-name "autoscaling.eu-west-2.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "autoscaling", :region "us-gov-west-1"},
    :ssl-common-name "autoscaling.us-gov-west-1.amazonaws.com",
    :endpoint "https://autoscaling.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "autoscaling", :region "us-west-2"},
    :ssl-common-name "autoscaling.us-west-2.amazonaws.com",
    :endpoint "https://autoscaling.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "autoscaling", :region "us-east-1"},
    :ssl-common-name "autoscaling.us-east-1.amazonaws.com",
    :endpoint "https://autoscaling.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "autoscaling", :region "us-west-1"},
    :ssl-common-name "autoscaling.us-west-1.amazonaws.com",
    :endpoint "https://autoscaling.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "autoscaling", :region "ap-south-1"},
    :ssl-common-name "autoscaling.ap-south-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "autoscaling", :region "eu-north-1"},
    :ssl-common-name "autoscaling.eu-north-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-lifecycle-action-result)

(clojure.core/declare ser-ascii-string-max-len-255)

(clojure.core/declare ser-lifecycle-hook-names)

(clojure.core/declare ser-predefined-metric-specification)

(clojure.core/declare ser-should-respect-grace-period)

(clojure.core/declare ser-instances-distribution)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-associate-public-ip-address)

(clojure.core/declare ser-load-balancer-names)

(clojure.core/declare ser-scheduled-update-group-action-request)

(clojure.core/declare ser-instance-ids)

(clojure.core/declare ser-notification-target-resource-name)

(clojure.core/declare ser-instance-monitoring)

(clojure.core/declare ser-launch-template-specification)

(clojure.core/declare ser-min-adjustment-magnitude)

(clojure.core/declare ser-security-groups)

(clojure.core/declare ser-ebs-optimized)

(clojure.core/declare ser-monitoring-enabled)

(clojure.core/declare ser-should-decrement-desired-capacity)

(clojure.core/declare ser-metric-dimension-value)

(clojure.core/declare ser-propagate-at-launch)

(clojure.core/declare ser-max-records)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-launch-template)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-lifecycle-hook-specifications)

(clojure.core/declare ser-no-device)

(clojure.core/declare ser-policy-names)

(clojure.core/declare ser-ebs)

(clojure.core/declare ser-cooldown)

(clojure.core/declare ser-block-device-ebs-iops)

(clojure.core/declare ser-block-device-ebs-encrypted)

(clojure.core/declare ser-auto-scaling-group-max-size)

(clojure.core/declare ser-metric-unit)

(clojure.core/declare ser-policy-types)

(clojure.core/declare ser-estimated-instance-warmup)

(clojure.core/declare ser-block-device-ebs-volume-size)

(clojure.core/declare ser-step-adjustments)

(clojure.core/declare ser-activity-ids)

(clojure.core/declare ser-spot-price)

(clojure.core/declare ser-launch-configuration-names)

(clojure.core/declare ser-instance-protected)

(clojure.core/declare ser-auto-scaling-group-names)

(clojure.core/declare ser-xml-string-max-len-19)

(clojure.core/declare ser-xml-string)

(clojure.core/declare ser-launch-template-overrides)

(clojure.core/declare ser-metric-dimension-name)

(clojure.core/declare ser-timestamp-type)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-xml-string-max-len-255)

(clojure.core/declare ser-spot-instance-pools)

(clojure.core/declare ser-xml-string-max-len-1023)

(clojure.core/declare ser-scheduled-action-names)

(clojure.core/declare ser-values)

(clojure.core/declare ser-mixed-instances-policy)

(clojure.core/declare ser-metric-dimension)

(clojure.core/declare ser-xml-string-user-data)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-xml-string-max-len-1600)

(clojure.core/declare ser-lifecycle-transition)

(clojure.core/declare ser-launch-template-name)

(clojure.core/declare ser-mixed-instance-spot-price)

(clojure.core/declare ser-target-tracking-configuration)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-min-adjustment-step)

(clojure.core/declare ser-heartbeat-timeout)

(clojure.core/declare ser-classic-link-vpc-security-groups)

(clojure.core/declare ser-honor-cooldown)

(clojure.core/declare ser-auto-scaling-notification-types)

(clojure.core/declare ser-target-group-ar-ns)

(clojure.core/declare ser-protected-from-scale-in)

(clojure.core/declare ser-block-device-ebs-delete-on-termination)

(clojure.core/declare ser-step-adjustment)

(clojure.core/declare ser-block-device-mappings)

(clojure.core/declare ser-metric-statistic)

(clojure.core/declare ser-overrides)

(clojure.core/declare ser-xml-string-max-len-2047)

(clojure.core/declare ser-xml-string-max-len-511)

(clojure.core/declare ser-disable-scale-in)

(clojure.core/declare ser-block-device-mapping)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-metric-scale)

(clojure.core/declare ser-block-device-ebs-volume-type)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-on-demand-percentage-above-base-capacity)

(clojure.core/declare ser-metric-dimensions)

(clojure.core/declare ser-scheduled-update-group-action-requests)

(clojure.core/declare ser-metric-namespace)

(clojure.core/declare ser-policy-increment)

(clojure.core/declare ser-xml-string-max-len-64)

(clojure.core/declare ser-lifecycle-hook-specification)

(clojure.core/declare ser-auto-scaling-group-desired-capacity)

(clojure.core/declare ser-availability-zones)

(clojure.core/declare ser-metric-type)

(clojure.core/declare ser-termination-policies)

(clojure.core/declare ser-process-names)

(clojure.core/declare ser-auto-scaling-group-min-size)

(clojure.core/declare ser-force-delete)

(clojure.core/declare ser-lifecycle-action-token)

(clojure.core/declare ser-customized-metric-specification)

(clojure.core/declare ser-health-check-grace-period)

(clojure.core/declare ser-on-demand-base-capacity)

(clojure.core/declare ser-metrics)

(clojure.core/declare ser-xml-string-max-len-32)

(clojure.core/defn- ser-lifecycle-action-result [input] #:http.request.field{:value input, :shape "LifecycleActionResult"})

(clojure.core/defn- ser-ascii-string-max-len-255 [input] #:http.request.field{:value input, :shape "AsciiStringMaxLen255"})

(clojure.core/defn- ser-lifecycle-hook-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ascii-string-max-len-255 coll) #:http.request.field{:shape "AsciiStringMaxLen255"}))) input), :shape "LifecycleHookNames", :type "list", :max 50})

(clojure.core/defn- ser-predefined-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-type (:predefined-metric-type input)) #:http.request.field{:name "PredefinedMetricType", :shape "MetricType"})], :shape "PredefinedMetricSpecification", :type "structure"} (clojure.core/contains? input :resource-label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-1023 (input :resource-label)) #:http.request.field{:name "ResourceLabel", :shape "XmlStringMaxLen1023"}))))

(clojure.core/defn- ser-should-respect-grace-period [input] #:http.request.field{:value input, :shape "ShouldRespectGracePeriod"})

(clojure.core/defn- ser-instances-distribution [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InstancesDistribution", :type "structure"} (clojure.core/contains? input :on-demand-allocation-strategy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :on-demand-allocation-strategy)) #:http.request.field{:name "OnDemandAllocationStrategy", :shape "XmlString"})) (clojure.core/contains? input :on-demand-base-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-demand-base-capacity (input :on-demand-base-capacity)) #:http.request.field{:name "OnDemandBaseCapacity", :shape "OnDemandBaseCapacity"})) (clojure.core/contains? input :on-demand-percentage-above-base-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-demand-percentage-above-base-capacity (input :on-demand-percentage-above-base-capacity)) #:http.request.field{:name "OnDemandPercentageAboveBaseCapacity", :shape "OnDemandPercentageAboveBaseCapacity"})) (clojure.core/contains? input :spot-allocation-strategy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :spot-allocation-strategy)) #:http.request.field{:name "SpotAllocationStrategy", :shape "XmlString"})) (clojure.core/contains? input :spot-instance-pools) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-spot-instance-pools (input :spot-instance-pools)) #:http.request.field{:name "SpotInstancePools", :shape "SpotInstancePools"})) (clojure.core/contains? input :spot-max-price) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mixed-instance-spot-price (input :spot-max-price)) #:http.request.field{:name "SpotMaxPrice", :shape "MixedInstanceSpotPrice"}))))

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Filter", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :name)) #:http.request.field{:name "Name", :shape "XmlString"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-values (input :values)) #:http.request.field{:name "Values", :shape "Values"}))))

(clojure.core/defn- ser-associate-public-ip-address [input] #:http.request.field{:value input, :shape "AssociatePublicIpAddress"})

(clojure.core/defn- ser-load-balancer-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "LoadBalancerNames", :type "list"})

(clojure.core/defn- ser-scheduled-update-group-action-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-xml-string-max-len-255 (:scheduled-action-name input)) #:http.request.field{:name "ScheduledActionName", :shape "XmlStringMaxLen255"})], :shape "ScheduledUpdateGroupActionRequest", :type "structure"} (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimestampType"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimestampType"})) (clojure.core/contains? input :recurrence) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :recurrence)) #:http.request.field{:name "Recurrence", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :min-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-min-size (input :min-size)) #:http.request.field{:name "MinSize", :shape "AutoScalingGroupMinSize"})) (clojure.core/contains? input :max-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-max-size (input :max-size)) #:http.request.field{:name "MaxSize", :shape "AutoScalingGroupMaxSize"})) (clojure.core/contains? input :desired-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-desired-capacity (input :desired-capacity)) #:http.request.field{:name "DesiredCapacity", :shape "AutoScalingGroupDesiredCapacity"}))))

(clojure.core/defn- ser-instance-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-19 coll) #:http.request.field{:shape "XmlStringMaxLen19"}))) input), :shape "InstanceIds", :type "list"})

(clojure.core/defn- ser-notification-target-resource-name [input] #:http.request.field{:value input, :shape "NotificationTargetResourceName"})

(clojure.core/defn- ser-instance-monitoring [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InstanceMonitoring", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-monitoring-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "MonitoringEnabled"}))))

(clojure.core/defn- ser-launch-template-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LaunchTemplateSpecification", :type "structure"} (clojure.core/contains? input :launch-template-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :launch-template-id)) #:http.request.field{:name "LaunchTemplateId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :launch-template-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template-name (input :launch-template-name)) #:http.request.field{:name "LaunchTemplateName", :shape "LaunchTemplateName"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :version)) #:http.request.field{:name "Version", :shape "XmlStringMaxLen255"}))))

(clojure.core/defn- ser-min-adjustment-magnitude [input] #:http.request.field{:value input, :shape "MinAdjustmentMagnitude"})

(clojure.core/defn- ser-security-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string coll) #:http.request.field{:shape "XmlString"}))) input), :shape "SecurityGroups", :type "list"})

(clojure.core/defn- ser-ebs-optimized [input] #:http.request.field{:value input, :shape "EbsOptimized"})

(clojure.core/defn- ser-monitoring-enabled [input] #:http.request.field{:value input, :shape "MonitoringEnabled"})

(clojure.core/defn- ser-should-decrement-desired-capacity [input] #:http.request.field{:value input, :shape "ShouldDecrementDesiredCapacity"})

(clojure.core/defn- ser-metric-dimension-value [input] #:http.request.field{:value input, :shape "MetricDimensionValue"})

(clojure.core/defn- ser-propagate-at-launch [input] #:http.request.field{:value input, :shape "PropagateAtLaunch"})

(clojure.core/defn- ser-max-records [input] #:http.request.field{:value input, :shape "MaxRecords"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-launch-template [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LaunchTemplate", :type "structure"} (clojure.core/contains? input :launch-template-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template-specification (input :launch-template-specification)) #:http.request.field{:name "LaunchTemplateSpecification", :shape "LaunchTemplateSpecification"})) (clojure.core/contains? input :overrides) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-overrides (input :overrides)) #:http.request.field{:name "Overrides", :shape "Overrides"}))))

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list"})

(clojure.core/defn- ser-lifecycle-hook-specifications [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lifecycle-hook-specification coll) #:http.request.field{:shape "LifecycleHookSpecification"}))) input), :shape "LifecycleHookSpecifications", :type "list"})

(clojure.core/defn- ser-no-device [input] #:http.request.field{:value input, :shape "NoDevice"})

(clojure.core/defn- ser-policy-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "PolicyNames", :type "list"})

(clojure.core/defn- ser-ebs [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Ebs", :type "structure"} (clojure.core/contains? input :snapshot-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :snapshot-id)) #:http.request.field{:name "SnapshotId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :volume-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-ebs-volume-size (input :volume-size)) #:http.request.field{:name "VolumeSize", :shape "BlockDeviceEbsVolumeSize"})) (clojure.core/contains? input :volume-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-ebs-volume-type (input :volume-type)) #:http.request.field{:name "VolumeType", :shape "BlockDeviceEbsVolumeType"})) (clojure.core/contains? input :delete-on-termination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-ebs-delete-on-termination (input :delete-on-termination)) #:http.request.field{:name "DeleteOnTermination", :shape "BlockDeviceEbsDeleteOnTermination"})) (clojure.core/contains? input :iops) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-ebs-iops (input :iops)) #:http.request.field{:name "Iops", :shape "BlockDeviceEbsIops"})) (clojure.core/contains? input :encrypted) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-ebs-encrypted (input :encrypted)) #:http.request.field{:name "Encrypted", :shape "BlockDeviceEbsEncrypted"}))))

(clojure.core/defn- ser-cooldown [input] #:http.request.field{:value input, :shape "Cooldown"})

(clojure.core/defn- ser-block-device-ebs-iops [input] #:http.request.field{:value input, :shape "BlockDeviceEbsIops"})

(clojure.core/defn- ser-block-device-ebs-encrypted [input] #:http.request.field{:value input, :shape "BlockDeviceEbsEncrypted"})

(clojure.core/defn- ser-auto-scaling-group-max-size [input] #:http.request.field{:value input, :shape "AutoScalingGroupMaxSize"})

(clojure.core/defn- ser-metric-unit [input] #:http.request.field{:value input, :shape "MetricUnit"})

(clojure.core/defn- ser-policy-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-64 coll) #:http.request.field{:shape "XmlStringMaxLen64"}))) input), :shape "PolicyTypes", :type "list"})

(clojure.core/defn- ser-estimated-instance-warmup [input] #:http.request.field{:value input, :shape "EstimatedInstanceWarmup"})

(clojure.core/defn- ser-block-device-ebs-volume-size [input] #:http.request.field{:value input, :shape "BlockDeviceEbsVolumeSize"})

(clojure.core/defn- ser-step-adjustments [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-step-adjustment coll) #:http.request.field{:shape "StepAdjustment"}))) input), :shape "StepAdjustments", :type "list"})

(clojure.core/defn- ser-activity-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string coll) #:http.request.field{:shape "XmlString"}))) input), :shape "ActivityIds", :type "list"})

(clojure.core/defn- ser-spot-price [input] #:http.request.field{:value input, :shape "SpotPrice"})

(clojure.core/defn- ser-launch-configuration-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "LaunchConfigurationNames", :type "list"})

(clojure.core/defn- ser-instance-protected [input] #:http.request.field{:value input, :shape "InstanceProtected"})

(clojure.core/defn- ser-auto-scaling-group-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "AutoScalingGroupNames", :type "list"})

(clojure.core/defn- ser-xml-string-max-len-19 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen19"})

(clojure.core/defn- ser-xml-string [input] #:http.request.field{:value input, :shape "XmlString"})

(clojure.core/defn- ser-launch-template-overrides [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LaunchTemplateOverrides", :type "structure"} (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "XmlStringMaxLen255"}))))

(clojure.core/defn- ser-metric-dimension-name [input] #:http.request.field{:value input, :shape "MetricDimensionName"})

(clojure.core/defn- ser-timestamp-type [input] #:http.request.field{:value input, :shape "TimestampType"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-xml-string-max-len-255 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen255"})

(clojure.core/defn- ser-spot-instance-pools [input] #:http.request.field{:value input, :shape "SpotInstancePools"})

(clojure.core/defn- ser-xml-string-max-len-1023 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen1023"})

(clojure.core/defn- ser-scheduled-action-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "ScheduledActionNames", :type "list"})

(clojure.core/defn- ser-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string coll) #:http.request.field{:shape "XmlString"}))) input), :shape "Values", :type "list"})

(clojure.core/defn- ser-mixed-instances-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MixedInstancesPolicy", :type "structure"} (clojure.core/contains? input :launch-template) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template (input :launch-template)) #:http.request.field{:name "LaunchTemplate", :shape "LaunchTemplate"})) (clojure.core/contains? input :instances-distribution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instances-distribution (input :instances-distribution)) #:http.request.field{:name "InstancesDistribution", :shape "InstancesDistribution"}))))

(clojure.core/defn- ser-metric-dimension [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-dimension-name (:name input)) #:http.request.field{:name "Name", :shape "MetricDimensionName"}) (clojure.core/into (ser-metric-dimension-value (:value input)) #:http.request.field{:name "Value", :shape "MetricDimensionValue"})], :shape "MetricDimension", :type "structure"}))

(clojure.core/defn- ser-xml-string-user-data [input] #:http.request.field{:value input, :shape "XmlStringUserData"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-xml-string-max-len-1600 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen1600"})

(clojure.core/defn- ser-lifecycle-transition [input] #:http.request.field{:value input, :shape "LifecycleTransition"})

(clojure.core/defn- ser-launch-template-name [input] #:http.request.field{:value input, :shape "LaunchTemplateName"})

(clojure.core/defn- ser-mixed-instance-spot-price [input] #:http.request.field{:value input, :shape "MixedInstanceSpotPrice"})

(clojure.core/defn- ser-target-tracking-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-scale (:target-value input)) #:http.request.field{:name "TargetValue", :shape "MetricScale"})], :shape "TargetTrackingConfiguration", :type "structure"} (clojure.core/contains? input :predefined-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predefined-metric-specification (input :predefined-metric-specification)) #:http.request.field{:name "PredefinedMetricSpecification", :shape "PredefinedMetricSpecification"})) (clojure.core/contains? input :customized-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customized-metric-specification (input :customized-metric-specification)) #:http.request.field{:name "CustomizedMetricSpecification", :shape "CustomizedMetricSpecification"})) (clojure.core/contains? input :disable-scale-in) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disable-scale-in (input :disable-scale-in)) #:http.request.field{:name "DisableScaleIn", :shape "DisableScaleIn"}))))

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "Filters", :type "list"})

(clojure.core/defn- ser-min-adjustment-step [input] #:http.request.field{:value input, :shape "MinAdjustmentStep"})

(clojure.core/defn- ser-heartbeat-timeout [input] #:http.request.field{:value input, :shape "HeartbeatTimeout"})

(clojure.core/defn- ser-classic-link-vpc-security-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "ClassicLinkVPCSecurityGroups", :type "list"})

(clojure.core/defn- ser-honor-cooldown [input] #:http.request.field{:value input, :shape "HonorCooldown"})

(clojure.core/defn- ser-auto-scaling-notification-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "AutoScalingNotificationTypes", :type "list"})

(clojure.core/defn- ser-target-group-ar-ns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-511 coll) #:http.request.field{:shape "XmlStringMaxLen511"}))) input), :shape "TargetGroupARNs", :type "list"})

(clojure.core/defn- ser-protected-from-scale-in [input] #:http.request.field{:value input, :shape "ProtectedFromScaleIn"})

(clojure.core/defn- ser-block-device-ebs-delete-on-termination [input] #:http.request.field{:value input, :shape "BlockDeviceEbsDeleteOnTermination"})

(clojure.core/defn- ser-step-adjustment [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-policy-increment (:scaling-adjustment input)) #:http.request.field{:name "ScalingAdjustment", :shape "PolicyIncrement"})], :shape "StepAdjustment", :type "structure"} (clojure.core/contains? input :metric-interval-lower-bound) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-scale (input :metric-interval-lower-bound)) #:http.request.field{:name "MetricIntervalLowerBound", :shape "MetricScale"})) (clojure.core/contains? input :metric-interval-upper-bound) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-scale (input :metric-interval-upper-bound)) #:http.request.field{:name "MetricIntervalUpperBound", :shape "MetricScale"}))))

(clojure.core/defn- ser-block-device-mappings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-block-device-mapping coll) #:http.request.field{:shape "BlockDeviceMapping"}))) input), :shape "BlockDeviceMappings", :type "list"})

(clojure.core/defn- ser-metric-statistic [input] #:http.request.field{:value (clojure.core/get {"Sum" "Sum", "Average" "Average", :maximum "Maximum", "SampleCount" "SampleCount", "Minimum" "Minimum", :sample-count "SampleCount", :minimum "Minimum", :average "Average", :sum "Sum", "Maximum" "Maximum"} input), :shape "MetricStatistic"})

(clojure.core/defn- ser-overrides [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-launch-template-overrides coll) #:http.request.field{:shape "LaunchTemplateOverrides"}))) input), :shape "Overrides", :type "list"})

(clojure.core/defn- ser-xml-string-max-len-2047 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen2047"})

(clojure.core/defn- ser-xml-string-max-len-511 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen511"})

(clojure.core/defn- ser-disable-scale-in [input] #:http.request.field{:value input, :shape "DisableScaleIn"})

(clojure.core/defn- ser-block-device-mapping [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-xml-string-max-len-255 (:device-name input)) #:http.request.field{:name "DeviceName", :shape "XmlStringMaxLen255"})], :shape "BlockDeviceMapping", :type "structure"} (clojure.core/contains? input :virtual-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :virtual-name)) #:http.request.field{:name "VirtualName", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :ebs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs (input :ebs)) #:http.request.field{:name "Ebs", :shape "Ebs"})) (clojure.core/contains? input :no-device) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-no-device (input :no-device)) #:http.request.field{:name "NoDevice", :shape "NoDevice"}))))

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :resource-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "XmlString"})) (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "XmlString"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"})) (clojure.core/contains? input :propagate-at-launch) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-propagate-at-launch (input :propagate-at-launch)) #:http.request.field{:name "PropagateAtLaunch", :shape "PropagateAtLaunch"}))))

(clojure.core/defn- ser-metric-scale [input] #:http.request.field{:value input, :shape "MetricScale"})

(clojure.core/defn- ser-block-device-ebs-volume-type [input] #:http.request.field{:value input, :shape "BlockDeviceEbsVolumeType"})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-on-demand-percentage-above-base-capacity [input] #:http.request.field{:value input, :shape "OnDemandPercentageAboveBaseCapacity"})

(clojure.core/defn- ser-metric-dimensions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-dimension coll) #:http.request.field{:shape "MetricDimension"}))) input), :shape "MetricDimensions", :type "list"})

(clojure.core/defn- ser-scheduled-update-group-action-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-scheduled-update-group-action-request coll) #:http.request.field{:shape "ScheduledUpdateGroupActionRequest"}))) input), :shape "ScheduledUpdateGroupActionRequests", :type "list"})

(clojure.core/defn- ser-metric-namespace [input] #:http.request.field{:value input, :shape "MetricNamespace"})

(clojure.core/defn- ser-policy-increment [input] #:http.request.field{:value input, :shape "PolicyIncrement"})

(clojure.core/defn- ser-xml-string-max-len-64 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen64"})

(clojure.core/defn- ser-lifecycle-hook-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ascii-string-max-len-255 (:lifecycle-hook-name input)) #:http.request.field{:name "LifecycleHookName", :shape "AsciiStringMaxLen255"}) (clojure.core/into (ser-lifecycle-transition (:lifecycle-transition input)) #:http.request.field{:name "LifecycleTransition", :shape "LifecycleTransition"})], :shape "LifecycleHookSpecification", :type "structure"} (clojure.core/contains? input :notification-metadata) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-1023 (input :notification-metadata)) #:http.request.field{:name "NotificationMetadata", :shape "XmlStringMaxLen1023"})) (clojure.core/contains? input :heartbeat-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-heartbeat-timeout (input :heartbeat-timeout)) #:http.request.field{:name "HeartbeatTimeout", :shape "HeartbeatTimeout"})) (clojure.core/contains? input :default-result) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-action-result (input :default-result)) #:http.request.field{:name "DefaultResult", :shape "LifecycleActionResult"})) (clojure.core/contains? input :notification-target-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-target-resource-name (input :notification-target-arn)) #:http.request.field{:name "NotificationTargetARN", :shape "NotificationTargetResourceName"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "ResourceName"}))))

(clojure.core/defn- ser-auto-scaling-group-desired-capacity [input] #:http.request.field{:value input, :shape "AutoScalingGroupDesiredCapacity"})

(clojure.core/defn- ser-availability-zones [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "AvailabilityZones", :type "list", :min 1})

(clojure.core/defn- ser-metric-type [input] #:http.request.field{:value (clojure.core/get {"ASGAverageCPUUtilization" "ASGAverageCPUUtilization", :asg-average-cpu-utilization "ASGAverageCPUUtilization", "ASGAverageNetworkIn" "ASGAverageNetworkIn", :asg-average-network-in "ASGAverageNetworkIn", "ASGAverageNetworkOut" "ASGAverageNetworkOut", :asg-average-network-out "ASGAverageNetworkOut", "ALBRequestCountPerTarget" "ALBRequestCountPerTarget", :alb-request-count-per-target "ALBRequestCountPerTarget"} input), :shape "MetricType"})

(clojure.core/defn- ser-termination-policies [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-1600 coll) #:http.request.field{:shape "XmlStringMaxLen1600"}))) input), :shape "TerminationPolicies", :type "list"})

(clojure.core/defn- ser-process-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "ProcessNames", :type "list"})

(clojure.core/defn- ser-auto-scaling-group-min-size [input] #:http.request.field{:value input, :shape "AutoScalingGroupMinSize"})

(clojure.core/defn- ser-force-delete [input] #:http.request.field{:value input, :shape "ForceDelete"})

(clojure.core/defn- ser-lifecycle-action-token [input] #:http.request.field{:value input, :shape "LifecycleActionToken"})

(clojure.core/defn- ser-customized-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-name (:metric-name input)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-metric-namespace (:namespace input)) #:http.request.field{:name "Namespace", :shape "MetricNamespace"}) (clojure.core/into (ser-metric-statistic (:statistic input)) #:http.request.field{:name "Statistic", :shape "MetricStatistic"})], :shape "CustomizedMetricSpecification", :type "structure"} (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-dimensions (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "MetricDimensions"})) (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-unit (input :unit)) #:http.request.field{:name "Unit", :shape "MetricUnit"}))))

(clojure.core/defn- ser-health-check-grace-period [input] #:http.request.field{:value input, :shape "HealthCheckGracePeriod"})

(clojure.core/defn- ser-on-demand-base-capacity [input] #:http.request.field{:value input, :shape "OnDemandBaseCapacity"})

(clojure.core/defn- ser-metrics [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "Metrics", :type "list"})

(clojure.core/defn- ser-xml-string-max-len-32 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen32"})

(clojure.core/defn- req-enter-standby-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-should-decrement-desired-capacity (input :should-decrement-desired-capacity)) #:http.request.field{:name "ShouldDecrementDesiredCapacity", :shape "ShouldDecrementDesiredCapacity"})]} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"}))))

(clojure.core/defn- req-describe-load-balancer-target-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-delete-auto-scaling-group-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :force-delete) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-delete (input :force-delete)) #:http.request.field{:name "ForceDelete", :shape "ForceDelete"}))))

(clojure.core/defn- req-create-or-update-tags-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-describe-tags-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-create-auto-scaling-group-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-255 (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "XmlStringMaxLen255"}) (clojure.core/into (ser-auto-scaling-group-min-size (input :min-size)) #:http.request.field{:name "MinSize", :shape "AutoScalingGroupMinSize"}) (clojure.core/into (ser-auto-scaling-group-max-size (input :max-size)) #:http.request.field{:name "MaxSize", :shape "AutoScalingGroupMaxSize"})]} (clojure.core/contains? input :new-instances-protected-from-scale-in) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-protected (input :new-instances-protected-from-scale-in)) #:http.request.field{:name "NewInstancesProtectedFromScaleIn", :shape "InstanceProtected"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"})) (clojure.core/contains? input :load-balancer-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-names (input :load-balancer-names)) #:http.request.field{:name "LoadBalancerNames", :shape "LoadBalancerNames"})) (clojure.core/contains? input :vpc-zone-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-2047 (input :vpc-zone-identifier)) #:http.request.field{:name "VPCZoneIdentifier", :shape "XmlStringMaxLen2047"})) (clojure.core/contains? input :launch-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template-specification (input :launch-template)) #:http.request.field{:name "LaunchTemplate", :shape "LaunchTemplateSpecification"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :lifecycle-hook-specification-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-hook-specifications (input :lifecycle-hook-specification-list)) #:http.request.field{:name "LifecycleHookSpecificationList", :shape "LifecycleHookSpecifications"})) (clojure.core/contains? input :default-cooldown) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :default-cooldown)) #:http.request.field{:name "DefaultCooldown", :shape "Cooldown"})) (clojure.core/contains? input :mixed-instances-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mixed-instances-policy (input :mixed-instances-policy)) #:http.request.field{:name "MixedInstancesPolicy", :shape "MixedInstancesPolicy"})) (clojure.core/contains? input :launch-configuration-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :launch-configuration-name)) #:http.request.field{:name "LaunchConfigurationName", :shape "ResourceName"})) (clojure.core/contains? input :target-group-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-ar-ns (input :target-group-ar-ns)) #:http.request.field{:name "TargetGroupARNs", :shape "TargetGroupARNs"})) (clojure.core/contains? input :health-check-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-32 (input :health-check-type)) #:http.request.field{:name "HealthCheckType", :shape "XmlStringMaxLen32"})) (clojure.core/contains? input :availability-zones) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-availability-zones (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "AvailabilityZones"})) (clojure.core/contains? input :termination-policies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-termination-policies (input :termination-policies)) #:http.request.field{:name "TerminationPolicies", :shape "TerminationPolicies"})) (clojure.core/contains? input :placement-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :placement-group)) #:http.request.field{:name "PlacementGroup", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :desired-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-desired-capacity (input :desired-capacity)) #:http.request.field{:name "DesiredCapacity", :shape "AutoScalingGroupDesiredCapacity"})) (clojure.core/contains? input :health-check-grace-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-grace-period (input :health-check-grace-period)) #:http.request.field{:name "HealthCheckGracePeriod", :shape "HealthCheckGracePeriod"})) (clojure.core/contains? input :service-linked-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :service-linked-role-arn)) #:http.request.field{:name "ServiceLinkedRoleARN", :shape "ResourceName"}))))

(clojure.core/defn- req-delete-notification-configuration-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :topic-arn)) #:http.request.field{:name "TopicARN", :shape "ResourceName"})]}))

(clojure.core/defn- req-describe-lifecycle-hooks-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :lifecycle-hook-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-hook-names (input :lifecycle-hook-names)) #:http.request.field{:name "LifecycleHookNames", :shape "LifecycleHookNames"}))))

(clojure.core/defn- req-record-lifecycle-action-heartbeat-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ascii-string-max-len-255 (input :lifecycle-hook-name)) #:http.request.field{:name "LifecycleHookName", :shape "AsciiStringMaxLen255"}) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :lifecycle-action-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-action-token (input :lifecycle-action-token)) #:http.request.field{:name "LifecycleActionToken", :shape "LifecycleActionToken"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"}))))

(clojure.core/defn- req-batch-put-scheduled-update-group-action-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-scheduled-update-group-action-requests (input :scheduled-update-group-actions)) #:http.request.field{:name "ScheduledUpdateGroupActions", :shape "ScheduledUpdateGroupActionRequests"})]}))

(clojure.core/defn- req-detach-load-balancer-target-groups-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-target-group-ar-ns (input :target-group-ar-ns)) #:http.request.field{:name "TargetGroupARNs", :shape "TargetGroupARNs"})]}))

(clojure.core/defn- req-launch-configuration-names-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :launch-configuration-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-configuration-names (input :launch-configuration-names)) #:http.request.field{:name "LaunchConfigurationNames", :shape "LaunchConfigurationNames"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-set-instance-protection-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"}) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-protected-from-scale-in (input :protected-from-scale-in)) #:http.request.field{:name "ProtectedFromScaleIn", :shape "ProtectedFromScaleIn"})]}))

(clojure.core/defn- req-set-desired-capacity-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-auto-scaling-group-desired-capacity (input :desired-capacity)) #:http.request.field{:name "DesiredCapacity", :shape "AutoScalingGroupDesiredCapacity"})]} (clojure.core/contains? input :honor-cooldown) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-honor-cooldown (input :honor-cooldown)) #:http.request.field{:name "HonorCooldown", :shape "HonorCooldown"}))))

(clojure.core/defn- req-update-auto-scaling-group-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :new-instances-protected-from-scale-in) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-protected (input :new-instances-protected-from-scale-in)) #:http.request.field{:name "NewInstancesProtectedFromScaleIn", :shape "InstanceProtected"})) (clojure.core/contains? input :vpc-zone-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-2047 (input :vpc-zone-identifier)) #:http.request.field{:name "VPCZoneIdentifier", :shape "XmlStringMaxLen2047"})) (clojure.core/contains? input :launch-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template-specification (input :launch-template)) #:http.request.field{:name "LaunchTemplate", :shape "LaunchTemplateSpecification"})) (clojure.core/contains? input :default-cooldown) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :default-cooldown)) #:http.request.field{:name "DefaultCooldown", :shape "Cooldown"})) (clojure.core/contains? input :mixed-instances-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mixed-instances-policy (input :mixed-instances-policy)) #:http.request.field{:name "MixedInstancesPolicy", :shape "MixedInstancesPolicy"})) (clojure.core/contains? input :launch-configuration-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :launch-configuration-name)) #:http.request.field{:name "LaunchConfigurationName", :shape "ResourceName"})) (clojure.core/contains? input :health-check-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-32 (input :health-check-type)) #:http.request.field{:name "HealthCheckType", :shape "XmlStringMaxLen32"})) (clojure.core/contains? input :min-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-min-size (input :min-size)) #:http.request.field{:name "MinSize", :shape "AutoScalingGroupMinSize"})) (clojure.core/contains? input :availability-zones) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-availability-zones (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "AvailabilityZones"})) (clojure.core/contains? input :termination-policies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-termination-policies (input :termination-policies)) #:http.request.field{:name "TerminationPolicies", :shape "TerminationPolicies"})) (clojure.core/contains? input :max-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-max-size (input :max-size)) #:http.request.field{:name "MaxSize", :shape "AutoScalingGroupMaxSize"})) (clojure.core/contains? input :placement-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :placement-group)) #:http.request.field{:name "PlacementGroup", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :desired-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-desired-capacity (input :desired-capacity)) #:http.request.field{:name "DesiredCapacity", :shape "AutoScalingGroupDesiredCapacity"})) (clojure.core/contains? input :health-check-grace-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-grace-period (input :health-check-grace-period)) #:http.request.field{:name "HealthCheckGracePeriod", :shape "HealthCheckGracePeriod"})) (clojure.core/contains? input :service-linked-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :service-linked-role-arn)) #:http.request.field{:name "ServiceLinkedRoleARN", :shape "ResourceName"}))))

(clojure.core/defn- req-enable-metrics-collection-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-xml-string-max-len-255 (input :granularity)) #:http.request.field{:name "Granularity", :shape "XmlStringMaxLen255"})]} (clojure.core/contains? input :metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metrics (input :metrics)) #:http.request.field{:name "Metrics", :shape "Metrics"}))))

(clojure.core/defn- req-delete-tags-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-attach-instances-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"}))))

(clojure.core/defn- req-set-instance-health-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"}) (clojure.core/into (ser-xml-string-max-len-32 (input :health-status)) #:http.request.field{:name "HealthStatus", :shape "XmlStringMaxLen32"})]} (clojure.core/contains? input :should-respect-grace-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-should-respect-grace-period (input :should-respect-grace-period)) #:http.request.field{:name "ShouldRespectGracePeriod", :shape "ShouldRespectGracePeriod"}))))

(clojure.core/defn- req-terminate-instance-in-auto-scaling-group-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"}) (clojure.core/into (ser-should-decrement-desired-capacity (input :should-decrement-desired-capacity)) #:http.request.field{:name "ShouldDecrementDesiredCapacity", :shape "ShouldDecrementDesiredCapacity"})]}))

(clojure.core/defn- req-delete-scheduled-action-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :scheduled-action-name)) #:http.request.field{:name "ScheduledActionName", :shape "ResourceName"})]}))

(clojure.core/defn- req-attach-load-balancers-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-load-balancer-names (input :load-balancer-names)) #:http.request.field{:name "LoadBalancerNames", :shape "LoadBalancerNames"})]}))

(clojure.core/defn- req-delete-policy-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "ResourceName"})]} (clojure.core/contains? input :auto-scaling-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}))))

(clojure.core/defn- req-describe-policies-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-scaling-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})) (clojure.core/contains? input :policy-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-names (input :policy-names)) #:http.request.field{:name "PolicyNames", :shape "PolicyNames"})) (clojure.core/contains? input :policy-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-types (input :policy-types)) #:http.request.field{:name "PolicyTypes", :shape "PolicyTypes"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-exit-standby-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"}))))

(clojure.core/defn- req-auto-scaling-group-names-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-scaling-group-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-names (input :auto-scaling-group-names)) #:http.request.field{:name "AutoScalingGroupNames", :shape "AutoScalingGroupNames"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-launch-configuration-name-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :launch-configuration-name)) #:http.request.field{:name "LaunchConfigurationName", :shape "ResourceName"})]}))

(clojure.core/defn- req-put-scheduled-update-group-action-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-xml-string-max-len-255 (input :scheduled-action-name)) #:http.request.field{:name "ScheduledActionName", :shape "XmlStringMaxLen255"})]} (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimestampType"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimestampType"})) (clojure.core/contains? input :recurrence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :recurrence)) #:http.request.field{:name "Recurrence", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :min-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-min-size (input :min-size)) #:http.request.field{:name "MinSize", :shape "AutoScalingGroupMinSize"})) (clojure.core/contains? input :max-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-max-size (input :max-size)) #:http.request.field{:name "MaxSize", :shape "AutoScalingGroupMaxSize"})) (clojure.core/contains? input :time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :time)) #:http.request.field{:name "Time", :shape "TimestampType"})) (clojure.core/contains? input :desired-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-desired-capacity (input :desired-capacity)) #:http.request.field{:name "DesiredCapacity", :shape "AutoScalingGroupDesiredCapacity"}))))

(clojure.core/defn- req-batch-delete-scheduled-action-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-scheduled-action-names (input :scheduled-action-names)) #:http.request.field{:name "ScheduledActionNames", :shape "ScheduledActionNames"})]}))

(clojure.core/defn- req-disable-metrics-collection-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metrics (input :metrics)) #:http.request.field{:name "Metrics", :shape "Metrics"}))))

(clojure.core/defn- req-put-scaling-policy-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-xml-string-max-len-255 (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "XmlStringMaxLen255"})]} (clojure.core/contains? input :min-adjustment-magnitude) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-min-adjustment-magnitude (input :min-adjustment-magnitude)) #:http.request.field{:name "MinAdjustmentMagnitude", :shape "MinAdjustmentMagnitude"})) (clojure.core/contains? input :scaling-adjustment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-increment (input :scaling-adjustment)) #:http.request.field{:name "ScalingAdjustment", :shape "PolicyIncrement"})) (clojure.core/contains? input :cooldown) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :cooldown)) #:http.request.field{:name "Cooldown", :shape "Cooldown"})) (clojure.core/contains? input :estimated-instance-warmup) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-estimated-instance-warmup (input :estimated-instance-warmup)) #:http.request.field{:name "EstimatedInstanceWarmup", :shape "EstimatedInstanceWarmup"})) (clojure.core/contains? input :step-adjustments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-adjustments (input :step-adjustments)) #:http.request.field{:name "StepAdjustments", :shape "StepAdjustments"})) (clojure.core/contains? input :adjustment-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :adjustment-type)) #:http.request.field{:name "AdjustmentType", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :metric-aggregation-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-32 (input :metric-aggregation-type)) #:http.request.field{:name "MetricAggregationType", :shape "XmlStringMaxLen32"})) (clojure.core/contains? input :target-tracking-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-tracking-configuration (input :target-tracking-configuration)) #:http.request.field{:name "TargetTrackingConfiguration", :shape "TargetTrackingConfiguration"})) (clojure.core/contains? input :min-adjustment-step) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-min-adjustment-step (input :min-adjustment-step)) #:http.request.field{:name "MinAdjustmentStep", :shape "MinAdjustmentStep"})) (clojure.core/contains? input :policy-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-64 (input :policy-type)) #:http.request.field{:name "PolicyType", :shape "XmlStringMaxLen64"}))))

(clojure.core/defn- req-detach-load-balancers-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-load-balancer-names (input :load-balancer-names)) #:http.request.field{:name "LoadBalancerNames", :shape "LoadBalancerNames"})]}))

(clojure.core/defn- req-describe-scheduled-actions-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-scaling-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})) (clojure.core/contains? input :scheduled-action-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scheduled-action-names (input :scheduled-action-names)) #:http.request.field{:name "ScheduledActionNames", :shape "ScheduledActionNames"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimestampType"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimestampType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-scaling-process-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :scaling-processes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-process-names (input :scaling-processes)) #:http.request.field{:name "ScalingProcesses", :shape "ProcessNames"}))))

(clojure.core/defn- req-execute-policy-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "ResourceName"})]} (clojure.core/contains? input :auto-scaling-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})) (clojure.core/contains? input :honor-cooldown) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-honor-cooldown (input :honor-cooldown)) #:http.request.field{:name "HonorCooldown", :shape "HonorCooldown"})) (clojure.core/contains? input :metric-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-scale (input :metric-value)) #:http.request.field{:name "MetricValue", :shape "MetricScale"})) (clojure.core/contains? input :breach-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-scale (input :breach-threshold)) #:http.request.field{:name "BreachThreshold", :shape "MetricScale"}))))

(clojure.core/defn- req-put-lifecycle-hook-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ascii-string-max-len-255 (input :lifecycle-hook-name)) #:http.request.field{:name "LifecycleHookName", :shape "AsciiStringMaxLen255"}) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :lifecycle-transition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-transition (input :lifecycle-transition)) #:http.request.field{:name "LifecycleTransition", :shape "LifecycleTransition"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "ResourceName"})) (clojure.core/contains? input :notification-target-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-target-resource-name (input :notification-target-arn)) #:http.request.field{:name "NotificationTargetARN", :shape "NotificationTargetResourceName"})) (clojure.core/contains? input :notification-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-1023 (input :notification-metadata)) #:http.request.field{:name "NotificationMetadata", :shape "XmlStringMaxLen1023"})) (clojure.core/contains? input :heartbeat-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-heartbeat-timeout (input :heartbeat-timeout)) #:http.request.field{:name "HeartbeatTimeout", :shape "HeartbeatTimeout"})) (clojure.core/contains? input :default-result) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-action-result (input :default-result)) #:http.request.field{:name "DefaultResult", :shape "LifecycleActionResult"}))))

(clojure.core/defn- req-describe-auto-scaling-instances-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"}))))

(clojure.core/defn- req-attach-load-balancer-target-groups-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-target-group-ar-ns (input :target-group-ar-ns)) #:http.request.field{:name "TargetGroupARNs", :shape "TargetGroupARNs"})]}))

(clojure.core/defn- req-describe-load-balancers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-detach-instances-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-should-decrement-desired-capacity (input :should-decrement-desired-capacity)) #:http.request.field{:name "ShouldDecrementDesiredCapacity", :shape "ShouldDecrementDesiredCapacity"})]} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"}))))

(clojure.core/defn- req-create-launch-configuration-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-255 (input :launch-configuration-name)) #:http.request.field{:name "LaunchConfigurationName", :shape "XmlStringMaxLen255"})]} (clojure.core/contains? input :placement-tenancy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-64 (input :placement-tenancy)) #:http.request.field{:name "PlacementTenancy", :shape "XmlStringMaxLen64"})) (clojure.core/contains? input :kernel-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :kernel-id)) #:http.request.field{:name "KernelId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"})) (clojure.core/contains? input :associate-public-ip-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-associate-public-ip-address (input :associate-public-ip-address)) #:http.request.field{:name "AssociatePublicIpAddress", :shape "AssociatePublicIpAddress"})) (clojure.core/contains? input :instance-monitoring) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-monitoring (input :instance-monitoring)) #:http.request.field{:name "InstanceMonitoring", :shape "InstanceMonitoring"})) (clojure.core/contains? input :image-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :image-id)) #:http.request.field{:name "ImageId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"})) (clojure.core/contains? input :ebs-optimized) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs-optimized (input :ebs-optimized)) #:http.request.field{:name "EbsOptimized", :shape "EbsOptimized"})) (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :classic-link-vpc-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :classic-link-vpc-id)) #:http.request.field{:name "ClassicLinkVPCId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :key-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :key-name)) #:http.request.field{:name "KeyName", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :spot-price) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-spot-price (input :spot-price)) #:http.request.field{:name "SpotPrice", :shape "SpotPrice"})) (clojure.core/contains? input :classic-link-vpc-security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-classic-link-vpc-security-groups (input :classic-link-vpc-security-groups)) #:http.request.field{:name "ClassicLinkVPCSecurityGroups", :shape "ClassicLinkVPCSecurityGroups"})) (clojure.core/contains? input :block-device-mappings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-mappings (input :block-device-mappings)) #:http.request.field{:name "BlockDeviceMappings", :shape "BlockDeviceMappings"})) (clojure.core/contains? input :ramdisk-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :ramdisk-id)) #:http.request.field{:name "RamdiskId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :user-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-user-data (input :user-data)) #:http.request.field{:name "UserData", :shape "XmlStringUserData"})) (clojure.core/contains? input :iam-instance-profile) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-1600 (input :iam-instance-profile)) #:http.request.field{:name "IamInstanceProfile", :shape "XmlStringMaxLen1600"}))))

(clojure.core/defn- req-describe-scaling-activities-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :activity-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-ids (input :activity-ids)) #:http.request.field{:name "ActivityIds", :shape "ActivityIds"})) (clojure.core/contains? input :auto-scaling-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"}))))

(clojure.core/defn- req-describe-notification-configurations-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-scaling-group-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-names (input :auto-scaling-group-names)) #:http.request.field{:name "AutoScalingGroupNames", :shape "AutoScalingGroupNames"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-delete-lifecycle-hook-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ascii-string-max-len-255 (input :lifecycle-hook-name)) #:http.request.field{:name "LifecycleHookName", :shape "AsciiStringMaxLen255"}) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]}))

(clojure.core/defn- req-put-notification-configuration-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :topic-arn)) #:http.request.field{:name "TopicARN", :shape "ResourceName"}) (clojure.core/into (ser-auto-scaling-notification-types (input :notification-types)) #:http.request.field{:name "NotificationTypes", :shape "AutoScalingNotificationTypes"})]}))

(clojure.core/defn- req-complete-lifecycle-action-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ascii-string-max-len-255 (input :lifecycle-hook-name)) #:http.request.field{:name "LifecycleHookName", :shape "AsciiStringMaxLen255"}) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-lifecycle-action-result (input :lifecycle-action-result)) #:http.request.field{:name "LifecycleActionResult", :shape "LifecycleActionResult"})]} (clojure.core/contains? input :lifecycle-action-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-action-token (input :lifecycle-action-token)) #:http.request.field{:name "LifecycleActionToken", :shape "LifecycleActionToken"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"}))))

(clojure.core/declare deser-lifecycle-action-result)

(clojure.core/declare deser-ascii-string-max-len-255)

(clojure.core/declare deser-predefined-metric-specification)

(clojure.core/declare deser-instances-distribution)

(clojure.core/declare deser-load-balancer-target-group-state)

(clojure.core/declare deser-activities)

(clojure.core/declare deser-failed-scheduled-update-group-action-requests)

(clojure.core/declare deser-scheduled-update-group-action)

(clojure.core/declare deser-associate-public-ip-address)

(clojure.core/declare deser-load-balancer-names)

(clojure.core/declare deser-global-timeout)

(clojure.core/declare deser-enabled-metrics)

(clojure.core/declare deser-instance-monitoring)

(clojure.core/declare deser-notification-configurations)

(clojure.core/declare deser-lifecycle-state)

(clojure.core/declare deser-launch-template-specification)

(clojure.core/declare deser-min-adjustment-magnitude)

(clojure.core/declare deser-metric-collection-type)

(clojure.core/declare deser-max-number-of-launch-configurations)

(clojure.core/declare deser-security-groups)

(clojure.core/declare deser-ebs-optimized)

(clojure.core/declare deser-monitoring-enabled)

(clojure.core/declare deser-metric-dimension-value)

(clojure.core/declare deser-process-type)

(clojure.core/declare deser-propagate-at-launch)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-launch-template)

(clojure.core/declare deser-enabled-metric)

(clojure.core/declare deser-no-device)

(clojure.core/declare deser-ebs)

(clojure.core/declare deser-suspended-process)

(clojure.core/declare deser-activity)

(clojure.core/declare deser-cooldown)

(clojure.core/declare deser-block-device-ebs-iops)

(clojure.core/declare deser-block-device-ebs-encrypted)

(clojure.core/declare deser-max-number-of-auto-scaling-groups)

(clojure.core/declare deser-auto-scaling-group-max-size)

(clojure.core/declare deser-launch-configurations)

(clojure.core/declare deser-metric-unit)

(clojure.core/declare deser-load-balancer-target-group-states)

(clojure.core/declare deser-progress)

(clojure.core/declare deser-number-of-launch-configurations)

(clojure.core/declare deser-estimated-instance-warmup)

(clojure.core/declare deser-block-device-ebs-volume-size)

(clojure.core/declare deser-step-adjustments)

(clojure.core/declare deser-spot-price)

(clojure.core/declare deser-tag-description)

(clojure.core/declare deser-instance-protected)

(clojure.core/declare deser-xml-string-max-len-19)

(clojure.core/declare deser-xml-string)

(clojure.core/declare deser-launch-template-overrides)

(clojure.core/declare deser-number-of-auto-scaling-groups)

(clojure.core/declare deser-load-balancer-state)

(clojure.core/declare deser-scaling-activity-status-code)

(clojure.core/declare deser-scheduled-update-group-actions)

(clojure.core/declare deser-auto-scaling-instances)

(clojure.core/declare deser-metric-dimension-name)

(clojure.core/declare deser-tag-description-list)

(clojure.core/declare deser-timestamp-type)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-adjustment-type)

(clojure.core/declare deser-xml-string-max-len-255)

(clojure.core/declare deser-spot-instance-pools)

(clojure.core/declare deser-xml-string-max-len-1023)

(clojure.core/declare deser-auto-scaling-group)

(clojure.core/declare deser-mixed-instances-policy)

(clojure.core/declare deser-auto-scaling-instance-details)

(clojure.core/declare deser-metric-dimension)

(clojure.core/declare deser-xml-string-user-data)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-xml-string-max-len-1600)

(clojure.core/declare deser-lifecycle-transition)

(clojure.core/declare deser-auto-scaling-groups)

(clojure.core/declare deser-launch-template-name)

(clojure.core/declare deser-mixed-instance-spot-price)

(clojure.core/declare deser-target-tracking-configuration)

(clojure.core/declare deser-min-adjustment-step)

(clojure.core/declare deser-heartbeat-timeout)

(clojure.core/declare deser-classic-link-vpc-security-groups)

(clojure.core/declare deser-load-balancer-states)

(clojure.core/declare deser-auto-scaling-notification-types)

(clojure.core/declare deser-target-group-ar-ns)

(clojure.core/declare deser-lifecycle-hooks)

(clojure.core/declare deser-block-device-ebs-delete-on-termination)

(clojure.core/declare deser-step-adjustment)

(clojure.core/declare deser-block-device-mappings)

(clojure.core/declare deser-alarms)

(clojure.core/declare deser-metric-statistic)

(clojure.core/declare deser-overrides)

(clojure.core/declare deser-xml-string-max-len-2047)

(clojure.core/declare deser-scaling-policy)

(clojure.core/declare deser-launch-configuration)

(clojure.core/declare deser-lifecycle-hook)

(clojure.core/declare deser-xml-string-max-len-511)

(clojure.core/declare deser-disable-scale-in)

(clojure.core/declare deser-metric-granularity-types)

(clojure.core/declare deser-block-device-mapping)

(clojure.core/declare deser-alarm)

(clojure.core/declare deser-metric-scale)

(clojure.core/declare deser-block-device-ebs-volume-type)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-on-demand-percentage-above-base-capacity)

(clojure.core/declare deser-failed-scheduled-update-group-action-request)

(clojure.core/declare deser-metric-dimensions)

(clojure.core/declare deser-instance)

(clojure.core/declare deser-metric-namespace)

(clojure.core/declare deser-policy-increment)

(clojure.core/declare deser-adjustment-types)

(clojure.core/declare deser-notification-configuration)

(clojure.core/declare deser-xml-string-max-len-64)

(clojure.core/declare deser-suspended-processes)

(clojure.core/declare deser-auto-scaling-group-desired-capacity)

(clojure.core/declare deser-availability-zones)

(clojure.core/declare deser-metric-type)

(clojure.core/declare deser-termination-policies)

(clojure.core/declare deser-processes)

(clojure.core/declare deser-metric-collection-types)

(clojure.core/declare deser-auto-scaling-group-min-size)

(clojure.core/declare deser-instances)

(clojure.core/declare deser-metric-granularity-type)

(clojure.core/declare deser-scaling-policies)

(clojure.core/declare deser-customized-metric-specification)

(clojure.core/declare deser-health-check-grace-period)

(clojure.core/declare deser-on-demand-base-capacity)

(clojure.core/declare deser-xml-string-max-len-32)

(clojure.core/defn- deser-lifecycle-action-result [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ascii-string-max-len-255 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-predefined-metric-specification [input] (clojure.core/let [letvar116509 {"PredefinedMetricType" (portkey.aws/search-for-tag input "PredefinedMetricType" :flattened? nil :xmlAttribute? nil), "ResourceLabel" (portkey.aws/search-for-tag input "ResourceLabel" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:predefined-metric-type (deser-metric-type (clojure.core/get-in letvar116509 ["PredefinedMetricType" :content]))} (letvar116509 "ResourceLabel") (clojure.core/assoc :resource-label (deser-xml-string-max-len-1023 (clojure.core/get-in letvar116509 ["ResourceLabel" :content]))))))

(clojure.core/defn- deser-instances-distribution [input] (clojure.core/let [letvar116617 {"OnDemandAllocationStrategy" (portkey.aws/search-for-tag input "OnDemandAllocationStrategy" :flattened? nil :xmlAttribute? nil), "OnDemandBaseCapacity" (portkey.aws/search-for-tag input "OnDemandBaseCapacity" :flattened? nil :xmlAttribute? nil), "OnDemandPercentageAboveBaseCapacity" (portkey.aws/search-for-tag input "OnDemandPercentageAboveBaseCapacity" :flattened? nil :xmlAttribute? nil), "SpotAllocationStrategy" (portkey.aws/search-for-tag input "SpotAllocationStrategy" :flattened? nil :xmlAttribute? nil), "SpotInstancePools" (portkey.aws/search-for-tag input "SpotInstancePools" :flattened? nil :xmlAttribute? nil), "SpotMaxPrice" (portkey.aws/search-for-tag input "SpotMaxPrice" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar116617 "OnDemandAllocationStrategy") (clojure.core/assoc :on-demand-allocation-strategy (deser-xml-string (clojure.core/get-in letvar116617 ["OnDemandAllocationStrategy" :content]))) (letvar116617 "OnDemandBaseCapacity") (clojure.core/assoc :on-demand-base-capacity (deser-on-demand-base-capacity (clojure.core/get-in letvar116617 ["OnDemandBaseCapacity" :content]))) (letvar116617 "OnDemandPercentageAboveBaseCapacity") (clojure.core/assoc :on-demand-percentage-above-base-capacity (deser-on-demand-percentage-above-base-capacity (clojure.core/get-in letvar116617 ["OnDemandPercentageAboveBaseCapacity" :content]))) (letvar116617 "SpotAllocationStrategy") (clojure.core/assoc :spot-allocation-strategy (deser-xml-string (clojure.core/get-in letvar116617 ["SpotAllocationStrategy" :content]))) (letvar116617 "SpotInstancePools") (clojure.core/assoc :spot-instance-pools (deser-spot-instance-pools (clojure.core/get-in letvar116617 ["SpotInstancePools" :content]))) (letvar116617 "SpotMaxPrice") (clojure.core/assoc :spot-max-price (deser-mixed-instance-spot-price (clojure.core/get-in letvar116617 ["SpotMaxPrice" :content]))))))

(clojure.core/defn- deser-load-balancer-target-group-state [input] (clojure.core/let [letvar116725 {"LoadBalancerTargetGroupARN" (portkey.aws/search-for-tag input "LoadBalancerTargetGroupARN" :flattened? nil :xmlAttribute? nil), "State" (portkey.aws/search-for-tag input "State" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar116725 "LoadBalancerTargetGroupARN") (clojure.core/assoc :load-balancer-target-group-arn (deser-xml-string-max-len-511 (clojure.core/get-in letvar116725 ["LoadBalancerTargetGroupARN" :content]))) (letvar116725 "State") (clojure.core/assoc :state (deser-xml-string-max-len-255 (clojure.core/get-in letvar116725 ["State" :content]))))))

(clojure.core/defn- deser-activities [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-activity coll))) input))

(clojure.core/defn- deser-failed-scheduled-update-group-action-requests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failed-scheduled-update-group-action-request coll))) input))

(clojure.core/defn- deser-scheduled-update-group-action [input] (clojure.core/let [letvar116867 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "EndTime" (portkey.aws/search-for-tag input "EndTime" :flattened? nil :xmlAttribute? nil), "StartTime" (portkey.aws/search-for-tag input "StartTime" :flattened? nil :xmlAttribute? nil), "Recurrence" (portkey.aws/search-for-tag input "Recurrence" :flattened? nil :xmlAttribute? nil), "ScheduledActionName" (portkey.aws/search-for-tag input "ScheduledActionName" :flattened? nil :xmlAttribute? nil), "MinSize" (portkey.aws/search-for-tag input "MinSize" :flattened? nil :xmlAttribute? nil), "MaxSize" (portkey.aws/search-for-tag input "MaxSize" :flattened? nil :xmlAttribute? nil), "Time" (portkey.aws/search-for-tag input "Time" :flattened? nil :xmlAttribute? nil), "DesiredCapacity" (portkey.aws/search-for-tag input "DesiredCapacity" :flattened? nil :xmlAttribute? nil), "ScheduledActionARN" (portkey.aws/search-for-tag input "ScheduledActionARN" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar116867 "AutoScalingGroupName") (clojure.core/assoc :auto-scaling-group-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar116867 ["AutoScalingGroupName" :content]))) (letvar116867 "EndTime") (clojure.core/assoc :end-time (deser-timestamp-type (clojure.core/get-in letvar116867 ["EndTime" :content]))) (letvar116867 "StartTime") (clojure.core/assoc :start-time (deser-timestamp-type (clojure.core/get-in letvar116867 ["StartTime" :content]))) (letvar116867 "Recurrence") (clojure.core/assoc :recurrence (deser-xml-string-max-len-255 (clojure.core/get-in letvar116867 ["Recurrence" :content]))) (letvar116867 "ScheduledActionName") (clojure.core/assoc :scheduled-action-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar116867 ["ScheduledActionName" :content]))) (letvar116867 "MinSize") (clojure.core/assoc :min-size (deser-auto-scaling-group-min-size (clojure.core/get-in letvar116867 ["MinSize" :content]))) (letvar116867 "MaxSize") (clojure.core/assoc :max-size (deser-auto-scaling-group-max-size (clojure.core/get-in letvar116867 ["MaxSize" :content]))) (letvar116867 "Time") (clojure.core/assoc :time (deser-timestamp-type (clojure.core/get-in letvar116867 ["Time" :content]))) (letvar116867 "DesiredCapacity") (clojure.core/assoc :desired-capacity (deser-auto-scaling-group-desired-capacity (clojure.core/get-in letvar116867 ["DesiredCapacity" :content]))) (letvar116867 "ScheduledActionARN") (clojure.core/assoc :scheduled-action-arn (deser-resource-name (clojure.core/get-in letvar116867 ["ScheduledActionARN" :content]))))))

(clojure.core/defn- deser-associate-public-ip-address [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-load-balancer-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-255 coll))) input))

(clojure.core/defn- deser-global-timeout [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-enabled-metrics [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-enabled-metric coll))) input))

(clojure.core/defn- deser-instance-monitoring [input] (clojure.core/let [letvar117013 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar117013 "Enabled") (clojure.core/assoc :enabled (deser-monitoring-enabled (clojure.core/get-in letvar117013 ["Enabled" :content]))))))

(clojure.core/defn- deser-notification-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notification-configuration coll))) input))

(clojure.core/defn- deser-lifecycle-state [input] (clojure.core/get {"Detaching" :detaching, "Terminating:Wait" :terminating-wait, "InService" :in-service, "Quarantined" :quarantined, "Pending:Proceed" :pending-proceed, "Terminating" :terminating, "EnteringStandby" :entering-standby, "Pending:Wait" :pending-wait, "Terminated" :terminated, "Standby" :standby, "Pending" :pending, "Terminating:Proceed" :terminating-proceed, "Detached" :detached} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-launch-template-specification [input] (clojure.core/let [letvar117143 {"LaunchTemplateId" (portkey.aws/search-for-tag input "LaunchTemplateId" :flattened? nil :xmlAttribute? nil), "LaunchTemplateName" (portkey.aws/search-for-tag input "LaunchTemplateName" :flattened? nil :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar117143 "LaunchTemplateId") (clojure.core/assoc :launch-template-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar117143 ["LaunchTemplateId" :content]))) (letvar117143 "LaunchTemplateName") (clojure.core/assoc :launch-template-name (deser-launch-template-name (clojure.core/get-in letvar117143 ["LaunchTemplateName" :content]))) (letvar117143 "Version") (clojure.core/assoc :version (deser-xml-string-max-len-255 (clojure.core/get-in letvar117143 ["Version" :content]))))))

(clojure.core/defn- deser-min-adjustment-magnitude [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-metric-collection-type [input] (clojure.core/let [letvar117253 {"Metric" (portkey.aws/search-for-tag input "Metric" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar117253 "Metric") (clojure.core/assoc :metric (deser-xml-string-max-len-255 (clojure.core/get-in letvar117253 ["Metric" :content]))))))

(clojure.core/defn- deser-max-number-of-launch-configurations [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-security-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string coll))) input))

(clojure.core/defn- deser-ebs-optimized [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-monitoring-enabled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-metric-dimension-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-process-type [input] (clojure.core/let [letvar117389 {"ProcessName" (portkey.aws/search-for-tag input "ProcessName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:process-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar117389 ["ProcessName" :content]))})))

(clojure.core/defn- deser-propagate-at-launch [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-launch-template [input] (clojure.core/let [letvar117504 {"LaunchTemplateSpecification" (portkey.aws/search-for-tag input "LaunchTemplateSpecification" :flattened? nil :xmlAttribute? nil), "Overrides" (portkey.aws/search-for-tag input "Overrides" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar117504 "LaunchTemplateSpecification") (clojure.core/assoc :launch-template-specification (deser-launch-template-specification (clojure.core/get-in letvar117504 ["LaunchTemplateSpecification" :content]))) (letvar117504 "Overrides") (clojure.core/assoc :overrides (deser-overrides (clojure.core/get-in letvar117504 ["Overrides" :content]))))))

(clojure.core/defn- deser-enabled-metric [input] (clojure.core/let [letvar117612 {"Metric" (portkey.aws/search-for-tag input "Metric" :flattened? nil :xmlAttribute? nil), "Granularity" (portkey.aws/search-for-tag input "Granularity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar117612 "Metric") (clojure.core/assoc :metric (deser-xml-string-max-len-255 (clojure.core/get-in letvar117612 ["Metric" :content]))) (letvar117612 "Granularity") (clojure.core/assoc :granularity (deser-xml-string-max-len-255 (clojure.core/get-in letvar117612 ["Granularity" :content]))))))

(clojure.core/defn- deser-no-device [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-ebs [input] (clojure.core/let [letvar117722 {"SnapshotId" (portkey.aws/search-for-tag input "SnapshotId" :flattened? nil :xmlAttribute? nil), "VolumeSize" (portkey.aws/search-for-tag input "VolumeSize" :flattened? nil :xmlAttribute? nil), "VolumeType" (portkey.aws/search-for-tag input "VolumeType" :flattened? nil :xmlAttribute? nil), "DeleteOnTermination" (portkey.aws/search-for-tag input "DeleteOnTermination" :flattened? nil :xmlAttribute? nil), "Iops" (portkey.aws/search-for-tag input "Iops" :flattened? nil :xmlAttribute? nil), "Encrypted" (portkey.aws/search-for-tag input "Encrypted" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar117722 "SnapshotId") (clojure.core/assoc :snapshot-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar117722 ["SnapshotId" :content]))) (letvar117722 "VolumeSize") (clojure.core/assoc :volume-size (deser-block-device-ebs-volume-size (clojure.core/get-in letvar117722 ["VolumeSize" :content]))) (letvar117722 "VolumeType") (clojure.core/assoc :volume-type (deser-block-device-ebs-volume-type (clojure.core/get-in letvar117722 ["VolumeType" :content]))) (letvar117722 "DeleteOnTermination") (clojure.core/assoc :delete-on-termination (deser-block-device-ebs-delete-on-termination (clojure.core/get-in letvar117722 ["DeleteOnTermination" :content]))) (letvar117722 "Iops") (clojure.core/assoc :iops (deser-block-device-ebs-iops (clojure.core/get-in letvar117722 ["Iops" :content]))) (letvar117722 "Encrypted") (clojure.core/assoc :encrypted (deser-block-device-ebs-encrypted (clojure.core/get-in letvar117722 ["Encrypted" :content]))))))

(clojure.core/defn- deser-suspended-process [input] (clojure.core/let [letvar117830 {"ProcessName" (portkey.aws/search-for-tag input "ProcessName" :flattened? nil :xmlAttribute? nil), "SuspensionReason" (portkey.aws/search-for-tag input "SuspensionReason" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar117830 "ProcessName") (clojure.core/assoc :process-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar117830 ["ProcessName" :content]))) (letvar117830 "SuspensionReason") (clojure.core/assoc :suspension-reason (deser-xml-string-max-len-255 (clojure.core/get-in letvar117830 ["SuspensionReason" :content]))))))

(clojure.core/defn- deser-activity [input] (clojure.core/let [letvar117938 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "EndTime" (portkey.aws/search-for-tag input "EndTime" :flattened? nil :xmlAttribute? nil), "Cause" (portkey.aws/search-for-tag input "Cause" :flattened? nil :xmlAttribute? nil), "StatusCode" (portkey.aws/search-for-tag input "StatusCode" :flattened? nil :xmlAttribute? nil), "Details" (portkey.aws/search-for-tag input "Details" :flattened? nil :xmlAttribute? nil), "StartTime" (portkey.aws/search-for-tag input "StartTime" :flattened? nil :xmlAttribute? nil), "StatusMessage" (portkey.aws/search-for-tag input "StatusMessage" :flattened? nil :xmlAttribute? nil), "Progress" (portkey.aws/search-for-tag input "Progress" :flattened? nil :xmlAttribute? nil), "ActivityId" (portkey.aws/search-for-tag input "ActivityId" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:activity-id (deser-xml-string (clojure.core/get-in letvar117938 ["ActivityId" :content])), :auto-scaling-group-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar117938 ["AutoScalingGroupName" :content])), :cause (deser-xml-string-max-len-1023 (clojure.core/get-in letvar117938 ["Cause" :content])), :start-time (deser-timestamp-type (clojure.core/get-in letvar117938 ["StartTime" :content])), :status-code (deser-scaling-activity-status-code (clojure.core/get-in letvar117938 ["StatusCode" :content]))} (letvar117938 "EndTime") (clojure.core/assoc :end-time (deser-timestamp-type (clojure.core/get-in letvar117938 ["EndTime" :content]))) (letvar117938 "Details") (clojure.core/assoc :details (deser-xml-string (clojure.core/get-in letvar117938 ["Details" :content]))) (letvar117938 "StatusMessage") (clojure.core/assoc :status-message (deser-xml-string-max-len-255 (clojure.core/get-in letvar117938 ["StatusMessage" :content]))) (letvar117938 "Progress") (clojure.core/assoc :progress (deser-progress (clojure.core/get-in letvar117938 ["Progress" :content]))) (letvar117938 "Description") (clojure.core/assoc :description (deser-xml-string (clojure.core/get-in letvar117938 ["Description" :content]))))))

(clojure.core/defn- deser-cooldown [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-block-device-ebs-iops [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-block-device-ebs-encrypted [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-max-number-of-auto-scaling-groups [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-auto-scaling-group-max-size [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-launch-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-launch-configuration coll))) input))

(clojure.core/defn- deser-metric-unit [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-target-group-states [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-target-group-state coll))) input))

(clojure.core/defn- deser-progress [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-number-of-launch-configurations [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-estimated-instance-warmup [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-block-device-ebs-volume-size [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-step-adjustments [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-step-adjustment coll))) input))

(clojure.core/defn- deser-spot-price [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-description [input] (clojure.core/let [letvar118125 {"ResourceId" (portkey.aws/search-for-tag input "ResourceId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil), "PropagateAtLaunch" (portkey.aws/search-for-tag input "PropagateAtLaunch" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar118125 "ResourceId") (clojure.core/assoc :resource-id (deser-xml-string (clojure.core/get-in letvar118125 ["ResourceId" :content]))) (letvar118125 "ResourceType") (clojure.core/assoc :resource-type (deser-xml-string (clojure.core/get-in letvar118125 ["ResourceType" :content]))) (letvar118125 "Key") (clojure.core/assoc :key (deser-tag-key (clojure.core/get-in letvar118125 ["Key" :content]))) (letvar118125 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar118125 ["Value" :content]))) (letvar118125 "PropagateAtLaunch") (clojure.core/assoc :propagate-at-launch (deser-propagate-at-launch (clojure.core/get-in letvar118125 ["PropagateAtLaunch" :content]))))))

(clojure.core/defn- deser-instance-protected [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-xml-string-max-len-19 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-xml-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-launch-template-overrides [input] (clojure.core/let [letvar118245 {"InstanceType" (portkey.aws/search-for-tag input "InstanceType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar118245 "InstanceType") (clojure.core/assoc :instance-type (deser-xml-string-max-len-255 (clojure.core/get-in letvar118245 ["InstanceType" :content]))))))

(clojure.core/defn- deser-number-of-auto-scaling-groups [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-load-balancer-state [input] (clojure.core/let [letvar118355 {"LoadBalancerName" (portkey.aws/search-for-tag input "LoadBalancerName" :flattened? nil :xmlAttribute? nil), "State" (portkey.aws/search-for-tag input "State" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar118355 "LoadBalancerName") (clojure.core/assoc :load-balancer-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar118355 ["LoadBalancerName" :content]))) (letvar118355 "State") (clojure.core/assoc :state (deser-xml-string-max-len-255 (clojure.core/get-in letvar118355 ["State" :content]))))))

(clojure.core/defn- deser-scaling-activity-status-code [input] (clojure.core/get {"Failed" :failed, "Cancelled" :cancelled, "PendingSpotBidPlacement" :pending-spot-bid-placement, "WaitingForSpotInstanceRequestId" :waiting-for-spot-instance-request-id, "WaitingForELBConnectionDraining" :waiting-for-elb-connection-draining, "WaitingForInstanceWarmup" :waiting-for-instance-warmup, "PreInService" :pre-in-service, "InProgress" :in-progress, "Successful" :successful, "WaitingForInstanceId" :waiting-for-instance-id, "WaitingForSpotInstanceId" :waiting-for-spot-instance-id, "MidLifecycleAction" :mid-lifecycle-action} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-scheduled-update-group-actions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scheduled-update-group-action coll))) input))

(clojure.core/defn- deser-auto-scaling-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-auto-scaling-instance-details coll))) input))

(clojure.core/defn- deser-metric-dimension-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-description coll))) input))

(clojure.core/defn- deser-timestamp-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-adjustment-type [input] (clojure.core/let [letvar118531 {"AdjustmentType" (portkey.aws/search-for-tag input "AdjustmentType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar118531 "AdjustmentType") (clojure.core/assoc :adjustment-type (deser-xml-string-max-len-255 (clojure.core/get-in letvar118531 ["AdjustmentType" :content]))))))

(clojure.core/defn- deser-xml-string-max-len-255 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-spot-instance-pools [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-xml-string-max-len-1023 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-auto-scaling-group [input] (clojure.core/let [letvar118651 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "NewInstancesProtectedFromScaleIn" (portkey.aws/search-for-tag input "NewInstancesProtectedFromScaleIn" :flattened? nil :xmlAttribute? nil), "LoadBalancerNames" (portkey.aws/search-for-tag input "LoadBalancerNames" :flattened? nil :xmlAttribute? nil), "EnabledMetrics" (portkey.aws/search-for-tag input "EnabledMetrics" :flattened? nil :xmlAttribute? nil), "VPCZoneIdentifier" (portkey.aws/search-for-tag input "VPCZoneIdentifier" :flattened? nil :xmlAttribute? nil), "LaunchTemplate" (portkey.aws/search-for-tag input "LaunchTemplate" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil), "AutoScalingGroupARN" (portkey.aws/search-for-tag input "AutoScalingGroupARN" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? nil :xmlAttribute? nil), "DefaultCooldown" (portkey.aws/search-for-tag input "DefaultCooldown" :flattened? nil :xmlAttribute? nil), "MixedInstancesPolicy" (portkey.aws/search-for-tag input "MixedInstancesPolicy" :flattened? nil :xmlAttribute? nil), "LaunchConfigurationName" (portkey.aws/search-for-tag input "LaunchConfigurationName" :flattened? nil :xmlAttribute? nil), "TargetGroupARNs" (portkey.aws/search-for-tag input "TargetGroupARNs" :flattened? nil :xmlAttribute? nil), "HealthCheckType" (portkey.aws/search-for-tag input "HealthCheckType" :flattened? nil :xmlAttribute? nil), "MinSize" (portkey.aws/search-for-tag input "MinSize" :flattened? nil :xmlAttribute? nil), "SuspendedProcesses" (portkey.aws/search-for-tag input "SuspendedProcesses" :flattened? nil :xmlAttribute? nil), "AvailabilityZones" (portkey.aws/search-for-tag input "AvailabilityZones" :flattened? nil :xmlAttribute? nil), "TerminationPolicies" (portkey.aws/search-for-tag input "TerminationPolicies" :flattened? nil :xmlAttribute? nil), "MaxSize" (portkey.aws/search-for-tag input "MaxSize" :flattened? nil :xmlAttribute? nil), "Instances" (portkey.aws/search-for-tag input "Instances" :flattened? nil :xmlAttribute? nil), "PlacementGroup" (portkey.aws/search-for-tag input "PlacementGroup" :flattened? nil :xmlAttribute? nil), "DesiredCapacity" (portkey.aws/search-for-tag input "DesiredCapacity" :flattened? nil :xmlAttribute? nil), "HealthCheckGracePeriod" (portkey.aws/search-for-tag input "HealthCheckGracePeriod" :flattened? nil :xmlAttribute? nil), "ServiceLinkedRoleARN" (portkey.aws/search-for-tag input "ServiceLinkedRoleARN" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:auto-scaling-group-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar118651 ["AutoScalingGroupName" :content])), :min-size (deser-auto-scaling-group-min-size (clojure.core/get-in letvar118651 ["MinSize" :content])), :max-size (deser-auto-scaling-group-max-size (clojure.core/get-in letvar118651 ["MaxSize" :content])), :desired-capacity (deser-auto-scaling-group-desired-capacity (clojure.core/get-in letvar118651 ["DesiredCapacity" :content])), :default-cooldown (deser-cooldown (clojure.core/get-in letvar118651 ["DefaultCooldown" :content])), :availability-zones (deser-availability-zones (clojure.core/get-in letvar118651 ["AvailabilityZones" :content])), :health-check-type (deser-xml-string-max-len-32 (clojure.core/get-in letvar118651 ["HealthCheckType" :content])), :created-time (deser-timestamp-type (clojure.core/get-in letvar118651 ["CreatedTime" :content]))} (letvar118651 "NewInstancesProtectedFromScaleIn") (clojure.core/assoc :new-instances-protected-from-scale-in (deser-instance-protected (clojure.core/get-in letvar118651 ["NewInstancesProtectedFromScaleIn" :content]))) (letvar118651 "LoadBalancerNames") (clojure.core/assoc :load-balancer-names (deser-load-balancer-names (clojure.core/get-in letvar118651 ["LoadBalancerNames" :content]))) (letvar118651 "EnabledMetrics") (clojure.core/assoc :enabled-metrics (deser-enabled-metrics (clojure.core/get-in letvar118651 ["EnabledMetrics" :content]))) (letvar118651 "VPCZoneIdentifier") (clojure.core/assoc :vpc-zone-identifier (deser-xml-string-max-len-2047 (clojure.core/get-in letvar118651 ["VPCZoneIdentifier" :content]))) (letvar118651 "LaunchTemplate") (clojure.core/assoc :launch-template (deser-launch-template-specification (clojure.core/get-in letvar118651 ["LaunchTemplate" :content]))) (letvar118651 "Tags") (clojure.core/assoc :tags (deser-tag-description-list (clojure.core/get-in letvar118651 ["Tags" :content]))) (letvar118651 "AutoScalingGroupARN") (clojure.core/assoc :auto-scaling-group-arn (deser-resource-name (clojure.core/get-in letvar118651 ["AutoScalingGroupARN" :content]))) (letvar118651 "Status") (clojure.core/assoc :status (deser-xml-string-max-len-255 (clojure.core/get-in letvar118651 ["Status" :content]))) (letvar118651 "MixedInstancesPolicy") (clojure.core/assoc :mixed-instances-policy (deser-mixed-instances-policy (clojure.core/get-in letvar118651 ["MixedInstancesPolicy" :content]))) (letvar118651 "LaunchConfigurationName") (clojure.core/assoc :launch-configuration-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar118651 ["LaunchConfigurationName" :content]))) (letvar118651 "TargetGroupARNs") (clojure.core/assoc :target-group-ar-ns (deser-target-group-ar-ns (clojure.core/get-in letvar118651 ["TargetGroupARNs" :content]))) (letvar118651 "SuspendedProcesses") (clojure.core/assoc :suspended-processes (deser-suspended-processes (clojure.core/get-in letvar118651 ["SuspendedProcesses" :content]))) (letvar118651 "TerminationPolicies") (clojure.core/assoc :termination-policies (deser-termination-policies (clojure.core/get-in letvar118651 ["TerminationPolicies" :content]))) (letvar118651 "Instances") (clojure.core/assoc :instances (deser-instances (clojure.core/get-in letvar118651 ["Instances" :content]))) (letvar118651 "PlacementGroup") (clojure.core/assoc :placement-group (deser-xml-string-max-len-255 (clojure.core/get-in letvar118651 ["PlacementGroup" :content]))) (letvar118651 "HealthCheckGracePeriod") (clojure.core/assoc :health-check-grace-period (deser-health-check-grace-period (clojure.core/get-in letvar118651 ["HealthCheckGracePeriod" :content]))) (letvar118651 "ServiceLinkedRoleARN") (clojure.core/assoc :service-linked-role-arn (deser-resource-name (clojure.core/get-in letvar118651 ["ServiceLinkedRoleARN" :content]))))))

(clojure.core/defn- deser-mixed-instances-policy [input] (clojure.core/let [letvar118759 {"LaunchTemplate" (portkey.aws/search-for-tag input "LaunchTemplate" :flattened? nil :xmlAttribute? nil), "InstancesDistribution" (portkey.aws/search-for-tag input "InstancesDistribution" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar118759 "LaunchTemplate") (clojure.core/assoc :launch-template (deser-launch-template (clojure.core/get-in letvar118759 ["LaunchTemplate" :content]))) (letvar118759 "InstancesDistribution") (clojure.core/assoc :instances-distribution (deser-instances-distribution (clojure.core/get-in letvar118759 ["InstancesDistribution" :content]))))))

(clojure.core/defn- deser-auto-scaling-instance-details [input] (clojure.core/let [letvar118867 {"InstanceId" (portkey.aws/search-for-tag input "InstanceId" :flattened? nil :xmlAttribute? nil), "AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "AvailabilityZone" (portkey.aws/search-for-tag input "AvailabilityZone" :flattened? nil :xmlAttribute? nil), "LifecycleState" (portkey.aws/search-for-tag input "LifecycleState" :flattened? nil :xmlAttribute? nil), "HealthStatus" (portkey.aws/search-for-tag input "HealthStatus" :flattened? nil :xmlAttribute? nil), "LaunchConfigurationName" (portkey.aws/search-for-tag input "LaunchConfigurationName" :flattened? nil :xmlAttribute? nil), "LaunchTemplate" (portkey.aws/search-for-tag input "LaunchTemplate" :flattened? nil :xmlAttribute? nil), "ProtectedFromScaleIn" (portkey.aws/search-for-tag input "ProtectedFromScaleIn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:instance-id (deser-xml-string-max-len-19 (clojure.core/get-in letvar118867 ["InstanceId" :content])), :auto-scaling-group-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar118867 ["AutoScalingGroupName" :content])), :availability-zone (deser-xml-string-max-len-255 (clojure.core/get-in letvar118867 ["AvailabilityZone" :content])), :lifecycle-state (deser-xml-string-max-len-32 (clojure.core/get-in letvar118867 ["LifecycleState" :content])), :health-status (deser-xml-string-max-len-32 (clojure.core/get-in letvar118867 ["HealthStatus" :content])), :protected-from-scale-in (deser-instance-protected (clojure.core/get-in letvar118867 ["ProtectedFromScaleIn" :content]))} (letvar118867 "LaunchConfigurationName") (clojure.core/assoc :launch-configuration-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar118867 ["LaunchConfigurationName" :content]))) (letvar118867 "LaunchTemplate") (clojure.core/assoc :launch-template (deser-launch-template-specification (clojure.core/get-in letvar118867 ["LaunchTemplate" :content]))))))

(clojure.core/defn- deser-metric-dimension [input] (clojure.core/let [letvar118975 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-metric-dimension-name (clojure.core/get-in letvar118975 ["Name" :content])), :value (deser-metric-dimension-value (clojure.core/get-in letvar118975 ["Value" :content]))})))

(clojure.core/defn- deser-xml-string-user-data [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-xml-string-max-len-1600 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-lifecycle-transition [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-auto-scaling-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-auto-scaling-group coll))) input))

(clojure.core/defn- deser-launch-template-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-mixed-instance-spot-price [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-target-tracking-configuration [input] (clojure.core/let [letvar119130 {"PredefinedMetricSpecification" (portkey.aws/search-for-tag input "PredefinedMetricSpecification" :flattened? nil :xmlAttribute? nil), "CustomizedMetricSpecification" (portkey.aws/search-for-tag input "CustomizedMetricSpecification" :flattened? nil :xmlAttribute? nil), "TargetValue" (portkey.aws/search-for-tag input "TargetValue" :flattened? nil :xmlAttribute? nil), "DisableScaleIn" (portkey.aws/search-for-tag input "DisableScaleIn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:target-value (deser-metric-scale (clojure.core/get-in letvar119130 ["TargetValue" :content]))} (letvar119130 "PredefinedMetricSpecification") (clojure.core/assoc :predefined-metric-specification (deser-predefined-metric-specification (clojure.core/get-in letvar119130 ["PredefinedMetricSpecification" :content]))) (letvar119130 "CustomizedMetricSpecification") (clojure.core/assoc :customized-metric-specification (deser-customized-metric-specification (clojure.core/get-in letvar119130 ["CustomizedMetricSpecification" :content]))) (letvar119130 "DisableScaleIn") (clojure.core/assoc :disable-scale-in (deser-disable-scale-in (clojure.core/get-in letvar119130 ["DisableScaleIn" :content]))))))

(clojure.core/defn- deser-min-adjustment-step [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-heartbeat-timeout [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-classic-link-vpc-security-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-255 coll))) input))

(clojure.core/defn- deser-load-balancer-states [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-state coll))) input))

(clojure.core/defn- deser-auto-scaling-notification-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-255 coll))) input))

(clojure.core/defn- deser-target-group-ar-ns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-511 coll))) input))

(clojure.core/defn- deser-lifecycle-hooks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lifecycle-hook coll))) input))

(clojure.core/defn- deser-block-device-ebs-delete-on-termination [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-step-adjustment [input] (clojure.core/let [letvar119329 {"MetricIntervalLowerBound" (portkey.aws/search-for-tag input "MetricIntervalLowerBound" :flattened? nil :xmlAttribute? nil), "MetricIntervalUpperBound" (portkey.aws/search-for-tag input "MetricIntervalUpperBound" :flattened? nil :xmlAttribute? nil), "ScalingAdjustment" (portkey.aws/search-for-tag input "ScalingAdjustment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:scaling-adjustment (deser-policy-increment (clojure.core/get-in letvar119329 ["ScalingAdjustment" :content]))} (letvar119329 "MetricIntervalLowerBound") (clojure.core/assoc :metric-interval-lower-bound (deser-metric-scale (clojure.core/get-in letvar119329 ["MetricIntervalLowerBound" :content]))) (letvar119329 "MetricIntervalUpperBound") (clojure.core/assoc :metric-interval-upper-bound (deser-metric-scale (clojure.core/get-in letvar119329 ["MetricIntervalUpperBound" :content]))))))

(clojure.core/defn- deser-block-device-mappings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-block-device-mapping coll))) input))

(clojure.core/defn- deser-alarms [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-alarm coll))) input))

(clojure.core/defn- deser-metric-statistic [input] (clojure.core/get {"Average" :average, "Minimum" :minimum, "Maximum" :maximum, "SampleCount" :sample-count, "Sum" :sum} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-overrides [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-launch-template-overrides coll))) input))

(clojure.core/defn- deser-xml-string-max-len-2047 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-scaling-policy [input] (clojure.core/let [letvar119498 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "PolicyARN" (portkey.aws/search-for-tag input "PolicyARN" :flattened? nil :xmlAttribute? nil), "MinAdjustmentMagnitude" (portkey.aws/search-for-tag input "MinAdjustmentMagnitude" :flattened? nil :xmlAttribute? nil), "PolicyName" (portkey.aws/search-for-tag input "PolicyName" :flattened? nil :xmlAttribute? nil), "ScalingAdjustment" (portkey.aws/search-for-tag input "ScalingAdjustment" :flattened? nil :xmlAttribute? nil), "Cooldown" (portkey.aws/search-for-tag input "Cooldown" :flattened? nil :xmlAttribute? nil), "EstimatedInstanceWarmup" (portkey.aws/search-for-tag input "EstimatedInstanceWarmup" :flattened? nil :xmlAttribute? nil), "StepAdjustments" (portkey.aws/search-for-tag input "StepAdjustments" :flattened? nil :xmlAttribute? nil), "AdjustmentType" (portkey.aws/search-for-tag input "AdjustmentType" :flattened? nil :xmlAttribute? nil), "MetricAggregationType" (portkey.aws/search-for-tag input "MetricAggregationType" :flattened? nil :xmlAttribute? nil), "TargetTrackingConfiguration" (portkey.aws/search-for-tag input "TargetTrackingConfiguration" :flattened? nil :xmlAttribute? nil), "MinAdjustmentStep" (portkey.aws/search-for-tag input "MinAdjustmentStep" :flattened? nil :xmlAttribute? nil), "Alarms" (portkey.aws/search-for-tag input "Alarms" :flattened? nil :xmlAttribute? nil), "PolicyType" (portkey.aws/search-for-tag input "PolicyType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar119498 "AutoScalingGroupName") (clojure.core/assoc :auto-scaling-group-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar119498 ["AutoScalingGroupName" :content]))) (letvar119498 "PolicyARN") (clojure.core/assoc :policy-arn (deser-resource-name (clojure.core/get-in letvar119498 ["PolicyARN" :content]))) (letvar119498 "MinAdjustmentMagnitude") (clojure.core/assoc :min-adjustment-magnitude (deser-min-adjustment-magnitude (clojure.core/get-in letvar119498 ["MinAdjustmentMagnitude" :content]))) (letvar119498 "PolicyName") (clojure.core/assoc :policy-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar119498 ["PolicyName" :content]))) (letvar119498 "ScalingAdjustment") (clojure.core/assoc :scaling-adjustment (deser-policy-increment (clojure.core/get-in letvar119498 ["ScalingAdjustment" :content]))) (letvar119498 "Cooldown") (clojure.core/assoc :cooldown (deser-cooldown (clojure.core/get-in letvar119498 ["Cooldown" :content]))) (letvar119498 "EstimatedInstanceWarmup") (clojure.core/assoc :estimated-instance-warmup (deser-estimated-instance-warmup (clojure.core/get-in letvar119498 ["EstimatedInstanceWarmup" :content]))) (letvar119498 "StepAdjustments") (clojure.core/assoc :step-adjustments (deser-step-adjustments (clojure.core/get-in letvar119498 ["StepAdjustments" :content]))) (letvar119498 "AdjustmentType") (clojure.core/assoc :adjustment-type (deser-xml-string-max-len-255 (clojure.core/get-in letvar119498 ["AdjustmentType" :content]))) (letvar119498 "MetricAggregationType") (clojure.core/assoc :metric-aggregation-type (deser-xml-string-max-len-32 (clojure.core/get-in letvar119498 ["MetricAggregationType" :content]))) (letvar119498 "TargetTrackingConfiguration") (clojure.core/assoc :target-tracking-configuration (deser-target-tracking-configuration (clojure.core/get-in letvar119498 ["TargetTrackingConfiguration" :content]))) (letvar119498 "MinAdjustmentStep") (clojure.core/assoc :min-adjustment-step (deser-min-adjustment-step (clojure.core/get-in letvar119498 ["MinAdjustmentStep" :content]))) (letvar119498 "Alarms") (clojure.core/assoc :alarms (deser-alarms (clojure.core/get-in letvar119498 ["Alarms" :content]))) (letvar119498 "PolicyType") (clojure.core/assoc :policy-type (deser-xml-string-max-len-64 (clojure.core/get-in letvar119498 ["PolicyType" :content]))))))

(clojure.core/defn- deser-launch-configuration [input] (clojure.core/let [letvar119606 {"LaunchConfigurationARN" (portkey.aws/search-for-tag input "LaunchConfigurationARN" :flattened? nil :xmlAttribute? nil), "PlacementTenancy" (portkey.aws/search-for-tag input "PlacementTenancy" :flattened? nil :xmlAttribute? nil), "KernelId" (portkey.aws/search-for-tag input "KernelId" :flattened? nil :xmlAttribute? nil), "AssociatePublicIpAddress" (portkey.aws/search-for-tag input "AssociatePublicIpAddress" :flattened? nil :xmlAttribute? nil), "InstanceMonitoring" (portkey.aws/search-for-tag input "InstanceMonitoring" :flattened? nil :xmlAttribute? nil), "ImageId" (portkey.aws/search-for-tag input "ImageId" :flattened? nil :xmlAttribute? nil), "SecurityGroups" (portkey.aws/search-for-tag input "SecurityGroups" :flattened? nil :xmlAttribute? nil), "EbsOptimized" (portkey.aws/search-for-tag input "EbsOptimized" :flattened? nil :xmlAttribute? nil), "InstanceType" (portkey.aws/search-for-tag input "InstanceType" :flattened? nil :xmlAttribute? nil), "ClassicLinkVPCId" (portkey.aws/search-for-tag input "ClassicLinkVPCId" :flattened? nil :xmlAttribute? nil), "KeyName" (portkey.aws/search-for-tag input "KeyName" :flattened? nil :xmlAttribute? nil), "SpotPrice" (portkey.aws/search-for-tag input "SpotPrice" :flattened? nil :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? nil :xmlAttribute? nil), "LaunchConfigurationName" (portkey.aws/search-for-tag input "LaunchConfigurationName" :flattened? nil :xmlAttribute? nil), "ClassicLinkVPCSecurityGroups" (portkey.aws/search-for-tag input "ClassicLinkVPCSecurityGroups" :flattened? nil :xmlAttribute? nil), "BlockDeviceMappings" (portkey.aws/search-for-tag input "BlockDeviceMappings" :flattened? nil :xmlAttribute? nil), "RamdiskId" (portkey.aws/search-for-tag input "RamdiskId" :flattened? nil :xmlAttribute? nil), "UserData" (portkey.aws/search-for-tag input "UserData" :flattened? nil :xmlAttribute? nil), "IamInstanceProfile" (portkey.aws/search-for-tag input "IamInstanceProfile" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:launch-configuration-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar119606 ["LaunchConfigurationName" :content])), :image-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar119606 ["ImageId" :content])), :instance-type (deser-xml-string-max-len-255 (clojure.core/get-in letvar119606 ["InstanceType" :content])), :created-time (deser-timestamp-type (clojure.core/get-in letvar119606 ["CreatedTime" :content]))} (letvar119606 "LaunchConfigurationARN") (clojure.core/assoc :launch-configuration-arn (deser-resource-name (clojure.core/get-in letvar119606 ["LaunchConfigurationARN" :content]))) (letvar119606 "PlacementTenancy") (clojure.core/assoc :placement-tenancy (deser-xml-string-max-len-64 (clojure.core/get-in letvar119606 ["PlacementTenancy" :content]))) (letvar119606 "KernelId") (clojure.core/assoc :kernel-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar119606 ["KernelId" :content]))) (letvar119606 "AssociatePublicIpAddress") (clojure.core/assoc :associate-public-ip-address (deser-associate-public-ip-address (clojure.core/get-in letvar119606 ["AssociatePublicIpAddress" :content]))) (letvar119606 "InstanceMonitoring") (clojure.core/assoc :instance-monitoring (deser-instance-monitoring (clojure.core/get-in letvar119606 ["InstanceMonitoring" :content]))) (letvar119606 "SecurityGroups") (clojure.core/assoc :security-groups (deser-security-groups (clojure.core/get-in letvar119606 ["SecurityGroups" :content]))) (letvar119606 "EbsOptimized") (clojure.core/assoc :ebs-optimized (deser-ebs-optimized (clojure.core/get-in letvar119606 ["EbsOptimized" :content]))) (letvar119606 "ClassicLinkVPCId") (clojure.core/assoc :classic-link-vpc-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar119606 ["ClassicLinkVPCId" :content]))) (letvar119606 "KeyName") (clojure.core/assoc :key-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar119606 ["KeyName" :content]))) (letvar119606 "SpotPrice") (clojure.core/assoc :spot-price (deser-spot-price (clojure.core/get-in letvar119606 ["SpotPrice" :content]))) (letvar119606 "ClassicLinkVPCSecurityGroups") (clojure.core/assoc :classic-link-vpc-security-groups (deser-classic-link-vpc-security-groups (clojure.core/get-in letvar119606 ["ClassicLinkVPCSecurityGroups" :content]))) (letvar119606 "BlockDeviceMappings") (clojure.core/assoc :block-device-mappings (deser-block-device-mappings (clojure.core/get-in letvar119606 ["BlockDeviceMappings" :content]))) (letvar119606 "RamdiskId") (clojure.core/assoc :ramdisk-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar119606 ["RamdiskId" :content]))) (letvar119606 "UserData") (clojure.core/assoc :user-data (deser-xml-string-user-data (clojure.core/get-in letvar119606 ["UserData" :content]))) (letvar119606 "IamInstanceProfile") (clojure.core/assoc :iam-instance-profile (deser-xml-string-max-len-1600 (clojure.core/get-in letvar119606 ["IamInstanceProfile" :content]))))))

(clojure.core/defn- deser-lifecycle-hook [input] (clojure.core/let [letvar119714 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "GlobalTimeout" (portkey.aws/search-for-tag input "GlobalTimeout" :flattened? nil :xmlAttribute? nil), "NotificationTargetARN" (portkey.aws/search-for-tag input "NotificationTargetARN" :flattened? nil :xmlAttribute? nil), "NotificationMetadata" (portkey.aws/search-for-tag input "NotificationMetadata" :flattened? nil :xmlAttribute? nil), "RoleARN" (portkey.aws/search-for-tag input "RoleARN" :flattened? nil :xmlAttribute? nil), "LifecycleHookName" (portkey.aws/search-for-tag input "LifecycleHookName" :flattened? nil :xmlAttribute? nil), "DefaultResult" (portkey.aws/search-for-tag input "DefaultResult" :flattened? nil :xmlAttribute? nil), "LifecycleTransition" (portkey.aws/search-for-tag input "LifecycleTransition" :flattened? nil :xmlAttribute? nil), "HeartbeatTimeout" (portkey.aws/search-for-tag input "HeartbeatTimeout" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar119714 "AutoScalingGroupName") (clojure.core/assoc :auto-scaling-group-name (deser-resource-name (clojure.core/get-in letvar119714 ["AutoScalingGroupName" :content]))) (letvar119714 "GlobalTimeout") (clojure.core/assoc :global-timeout (deser-global-timeout (clojure.core/get-in letvar119714 ["GlobalTimeout" :content]))) (letvar119714 "NotificationTargetARN") (clojure.core/assoc :notification-target-arn (deser-resource-name (clojure.core/get-in letvar119714 ["NotificationTargetARN" :content]))) (letvar119714 "NotificationMetadata") (clojure.core/assoc :notification-metadata (deser-xml-string-max-len-1023 (clojure.core/get-in letvar119714 ["NotificationMetadata" :content]))) (letvar119714 "RoleARN") (clojure.core/assoc :role-arn (deser-resource-name (clojure.core/get-in letvar119714 ["RoleARN" :content]))) (letvar119714 "LifecycleHookName") (clojure.core/assoc :lifecycle-hook-name (deser-ascii-string-max-len-255 (clojure.core/get-in letvar119714 ["LifecycleHookName" :content]))) (letvar119714 "DefaultResult") (clojure.core/assoc :default-result (deser-lifecycle-action-result (clojure.core/get-in letvar119714 ["DefaultResult" :content]))) (letvar119714 "LifecycleTransition") (clojure.core/assoc :lifecycle-transition (deser-lifecycle-transition (clojure.core/get-in letvar119714 ["LifecycleTransition" :content]))) (letvar119714 "HeartbeatTimeout") (clojure.core/assoc :heartbeat-timeout (deser-heartbeat-timeout (clojure.core/get-in letvar119714 ["HeartbeatTimeout" :content]))))))

(clojure.core/defn- deser-xml-string-max-len-511 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-disable-scale-in [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-metric-granularity-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-granularity-type coll))) input))

(clojure.core/defn- deser-block-device-mapping [input] (clojure.core/let [letvar119846 {"VirtualName" (portkey.aws/search-for-tag input "VirtualName" :flattened? nil :xmlAttribute? nil), "DeviceName" (portkey.aws/search-for-tag input "DeviceName" :flattened? nil :xmlAttribute? nil), "Ebs" (portkey.aws/search-for-tag input "Ebs" :flattened? nil :xmlAttribute? nil), "NoDevice" (portkey.aws/search-for-tag input "NoDevice" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:device-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar119846 ["DeviceName" :content]))} (letvar119846 "VirtualName") (clojure.core/assoc :virtual-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar119846 ["VirtualName" :content]))) (letvar119846 "Ebs") (clojure.core/assoc :ebs (deser-ebs (clojure.core/get-in letvar119846 ["Ebs" :content]))) (letvar119846 "NoDevice") (clojure.core/assoc :no-device (deser-no-device (clojure.core/get-in letvar119846 ["NoDevice" :content]))))))

(clojure.core/defn- deser-alarm [input] (clojure.core/let [letvar119954 {"AlarmName" (portkey.aws/search-for-tag input "AlarmName" :flattened? nil :xmlAttribute? nil), "AlarmARN" (portkey.aws/search-for-tag input "AlarmARN" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar119954 "AlarmName") (clojure.core/assoc :alarm-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar119954 ["AlarmName" :content]))) (letvar119954 "AlarmARN") (clojure.core/assoc :alarm-arn (deser-resource-name (clojure.core/get-in letvar119954 ["AlarmARN" :content]))))))

(clojure.core/defn- deser-metric-scale [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-block-device-ebs-volume-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metric-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-on-demand-percentage-above-base-capacity [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-failed-scheduled-update-group-action-request [input] (clojure.core/let [letvar120076 {"ScheduledActionName" (portkey.aws/search-for-tag input "ScheduledActionName" :flattened? nil :xmlAttribute? nil), "ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? nil :xmlAttribute? nil), "ErrorMessage" (portkey.aws/search-for-tag input "ErrorMessage" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:scheduled-action-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar120076 ["ScheduledActionName" :content]))} (letvar120076 "ErrorCode") (clojure.core/assoc :error-code (deser-xml-string-max-len-64 (clojure.core/get-in letvar120076 ["ErrorCode" :content]))) (letvar120076 "ErrorMessage") (clojure.core/assoc :error-message (deser-xml-string (clojure.core/get-in letvar120076 ["ErrorMessage" :content]))))))

(clojure.core/defn- deser-metric-dimensions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-dimension coll))) input))

(clojure.core/defn- deser-instance [input] (clojure.core/let [letvar120201 {"InstanceId" (portkey.aws/search-for-tag input "InstanceId" :flattened? nil :xmlAttribute? nil), "AvailabilityZone" (portkey.aws/search-for-tag input "AvailabilityZone" :flattened? nil :xmlAttribute? nil), "LifecycleState" (portkey.aws/search-for-tag input "LifecycleState" :flattened? nil :xmlAttribute? nil), "HealthStatus" (portkey.aws/search-for-tag input "HealthStatus" :flattened? nil :xmlAttribute? nil), "LaunchConfigurationName" (portkey.aws/search-for-tag input "LaunchConfigurationName" :flattened? nil :xmlAttribute? nil), "LaunchTemplate" (portkey.aws/search-for-tag input "LaunchTemplate" :flattened? nil :xmlAttribute? nil), "ProtectedFromScaleIn" (portkey.aws/search-for-tag input "ProtectedFromScaleIn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:instance-id (deser-xml-string-max-len-19 (clojure.core/get-in letvar120201 ["InstanceId" :content])), :availability-zone (deser-xml-string-max-len-255 (clojure.core/get-in letvar120201 ["AvailabilityZone" :content])), :lifecycle-state (deser-lifecycle-state (clojure.core/get-in letvar120201 ["LifecycleState" :content])), :health-status (deser-xml-string-max-len-32 (clojure.core/get-in letvar120201 ["HealthStatus" :content])), :protected-from-scale-in (deser-instance-protected (clojure.core/get-in letvar120201 ["ProtectedFromScaleIn" :content]))} (letvar120201 "LaunchConfigurationName") (clojure.core/assoc :launch-configuration-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar120201 ["LaunchConfigurationName" :content]))) (letvar120201 "LaunchTemplate") (clojure.core/assoc :launch-template (deser-launch-template-specification (clojure.core/get-in letvar120201 ["LaunchTemplate" :content]))))))

(clojure.core/defn- deser-metric-namespace [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-increment [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-adjustment-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-adjustment-type coll))) input))

(clojure.core/defn- deser-notification-configuration [input] (clojure.core/let [letvar120333 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "TopicARN" (portkey.aws/search-for-tag input "TopicARN" :flattened? nil :xmlAttribute? nil), "NotificationType" (portkey.aws/search-for-tag input "NotificationType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar120333 "AutoScalingGroupName") (clojure.core/assoc :auto-scaling-group-name (deser-resource-name (clojure.core/get-in letvar120333 ["AutoScalingGroupName" :content]))) (letvar120333 "TopicARN") (clojure.core/assoc :topic-arn (deser-resource-name (clojure.core/get-in letvar120333 ["TopicARN" :content]))) (letvar120333 "NotificationType") (clojure.core/assoc :notification-type (deser-xml-string-max-len-255 (clojure.core/get-in letvar120333 ["NotificationType" :content]))))))

(clojure.core/defn- deser-xml-string-max-len-64 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-suspended-processes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-suspended-process coll))) input))

(clojure.core/defn- deser-auto-scaling-group-desired-capacity [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-availability-zones [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-255 coll))) input))

(clojure.core/defn- deser-metric-type [input] (clojure.core/get {"ASGAverageCPUUtilization" :asg-average-cpu-utilization, "ASGAverageNetworkIn" :asg-average-network-in, "ASGAverageNetworkOut" :asg-average-network-out, "ALBRequestCountPerTarget" :alb-request-count-per-target} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-termination-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-1600 coll))) input))

(clojure.core/defn- deser-processes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-process-type coll))) input))

(clojure.core/defn- deser-metric-collection-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-collection-type coll))) input))

(clojure.core/defn- deser-auto-scaling-group-min-size [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance coll))) input))

(clojure.core/defn- deser-metric-granularity-type [input] (clojure.core/let [letvar120557 {"Granularity" (portkey.aws/search-for-tag input "Granularity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar120557 "Granularity") (clojure.core/assoc :granularity (deser-xml-string-max-len-255 (clojure.core/get-in letvar120557 ["Granularity" :content]))))))

(clojure.core/defn- deser-scaling-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scaling-policy coll))) input))

(clojure.core/defn- deser-customized-metric-specification [input] (clojure.core/let [letvar120682 {"MetricName" (portkey.aws/search-for-tag input "MetricName" :flattened? nil :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "Dimensions" (portkey.aws/search-for-tag input "Dimensions" :flattened? nil :xmlAttribute? nil), "Statistic" (portkey.aws/search-for-tag input "Statistic" :flattened? nil :xmlAttribute? nil), "Unit" (portkey.aws/search-for-tag input "Unit" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:metric-name (deser-metric-name (clojure.core/get-in letvar120682 ["MetricName" :content])), :namespace (deser-metric-namespace (clojure.core/get-in letvar120682 ["Namespace" :content])), :statistic (deser-metric-statistic (clojure.core/get-in letvar120682 ["Statistic" :content]))} (letvar120682 "Dimensions") (clojure.core/assoc :dimensions (deser-metric-dimensions (clojure.core/get-in letvar120682 ["Dimensions" :content]))) (letvar120682 "Unit") (clojure.core/assoc :unit (deser-metric-unit (clojure.core/get-in letvar120682 ["Unit" :content]))))))

(clojure.core/defn- deser-health-check-grace-period [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-on-demand-base-capacity [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-xml-string-max-len-32 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-describe-adjustment-types-answer ([input] (response-describe-adjustment-types-answer nil input)) ([resultWrapper120693 input] (clojure.core/let [rawinput120692 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120694 {"AdjustmentTypes" (portkey.aws/search-for-tag rawinput120692 "AdjustmentTypes" :flattened? nil :result-wrapper resultWrapper120693)}] (clojure.core/cond-> {} (letvar120694 "AdjustmentTypes") (clojure.core/assoc :adjustment-types (deser-adjustment-types (clojure.core/get-in letvar120694 ["AdjustmentTypes" :content])))))))

(clojure.core/defn- response-resource-contention-fault ([input] (response-resource-contention-fault nil input)) ([resultWrapper120696 input] (clojure.core/let [rawinput120695 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120697 {"message" (portkey.aws/search-for-tag rawinput120695 "message" :flattened? nil :result-wrapper resultWrapper120696)}] (clojure.core/cond-> {} (letvar120697 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar120697 ["message" :content])))))))

(clojure.core/defn- response-complete-lifecycle-action-answer ([input] (response-complete-lifecycle-action-answer nil input)) ([resultWrapper120699 input] (clojure.core/let [rawinput120698 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120700 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detach-load-balancer-target-groups-result-type ([input] (response-detach-load-balancer-target-groups-result-type nil input)) ([resultWrapper120702 input] (clojure.core/let [rawinput120701 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120703 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detach-instances-answer ([input] (response-detach-instances-answer nil input)) ([resultWrapper120705 input] (clojure.core/let [rawinput120704 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120706 {"Activities" (portkey.aws/search-for-tag rawinput120704 "Activities" :flattened? nil :result-wrapper resultWrapper120705)}] (clojure.core/cond-> {} (letvar120706 "Activities") (clojure.core/assoc :activities (deser-activities (clojure.core/get-in letvar120706 ["Activities" :content])))))))

(clojure.core/defn- response-tags-type ([input] (response-tags-type nil input)) ([resultWrapper120708 input] (clojure.core/let [rawinput120707 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120709 {"Tags" (portkey.aws/search-for-tag rawinput120707 "Tags" :flattened? nil :result-wrapper resultWrapper120708), "NextToken" (portkey.aws/search-for-tag rawinput120707 "NextToken" :flattened? nil :result-wrapper resultWrapper120708)}] (clojure.core/cond-> {} (letvar120709 "Tags") (clojure.core/assoc :tags (deser-tag-description-list (clojure.core/get-in letvar120709 ["Tags" :content]))) (letvar120709 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar120709 ["NextToken" :content])))))))

(clojure.core/defn- response-processes-type ([input] (response-processes-type nil input)) ([resultWrapper120711 input] (clojure.core/let [rawinput120710 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120712 {"Processes" (portkey.aws/search-for-tag rawinput120710 "Processes" :flattened? nil :result-wrapper resultWrapper120711)}] (clojure.core/cond-> {} (letvar120712 "Processes") (clojure.core/assoc :processes (deser-processes (clojure.core/get-in letvar120712 ["Processes" :content])))))))

(clojure.core/defn- response-already-exists-fault ([input] (response-already-exists-fault nil input)) ([resultWrapper120714 input] (clojure.core/let [rawinput120713 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120715 {"message" (portkey.aws/search-for-tag rawinput120713 "message" :flattened? nil :result-wrapper resultWrapper120714)}] (clojure.core/cond-> {} (letvar120715 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar120715 ["message" :content])))))))

(clojure.core/defn- response-describe-termination-policy-types-answer ([input] (response-describe-termination-policy-types-answer nil input)) ([resultWrapper120717 input] (clojure.core/let [rawinput120716 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120718 {"TerminationPolicyTypes" (portkey.aws/search-for-tag rawinput120716 "TerminationPolicyTypes" :flattened? nil :result-wrapper resultWrapper120717)}] (clojure.core/cond-> {} (letvar120718 "TerminationPolicyTypes") (clojure.core/assoc :termination-policy-types (deser-termination-policies (clojure.core/get-in letvar120718 ["TerminationPolicyTypes" :content])))))))

(clojure.core/defn- response-describe-lifecycle-hooks-answer ([input] (response-describe-lifecycle-hooks-answer nil input)) ([resultWrapper120720 input] (clojure.core/let [rawinput120719 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120721 {"LifecycleHooks" (portkey.aws/search-for-tag rawinput120719 "LifecycleHooks" :flattened? nil :result-wrapper resultWrapper120720)}] (clojure.core/cond-> {} (letvar120721 "LifecycleHooks") (clojure.core/assoc :lifecycle-hooks (deser-lifecycle-hooks (clojure.core/get-in letvar120721 ["LifecycleHooks" :content])))))))

(clojure.core/defn- response-auto-scaling-groups-type ([input] (response-auto-scaling-groups-type nil input)) ([resultWrapper120723 input] (clojure.core/let [rawinput120722 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120724 {"AutoScalingGroups" (portkey.aws/search-for-tag rawinput120722 "AutoScalingGroups" :flattened? nil :result-wrapper resultWrapper120723), "NextToken" (portkey.aws/search-for-tag rawinput120722 "NextToken" :flattened? nil :result-wrapper resultWrapper120723)}] (clojure.core/cond-> {:auto-scaling-groups (deser-auto-scaling-groups (clojure.core/get-in letvar120724 ["AutoScalingGroups" :content]))} (letvar120724 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar120724 ["NextToken" :content])))))))

(clojure.core/defn- response-policies-type ([input] (response-policies-type nil input)) ([resultWrapper120726 input] (clojure.core/let [rawinput120725 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120727 {"ScalingPolicies" (portkey.aws/search-for-tag rawinput120725 "ScalingPolicies" :flattened? nil :result-wrapper resultWrapper120726), "NextToken" (portkey.aws/search-for-tag rawinput120725 "NextToken" :flattened? nil :result-wrapper resultWrapper120726)}] (clojure.core/cond-> {} (letvar120727 "ScalingPolicies") (clojure.core/assoc :scaling-policies (deser-scaling-policies (clojure.core/get-in letvar120727 ["ScalingPolicies" :content]))) (letvar120727 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar120727 ["NextToken" :content])))))))

(clojure.core/defn- response-exit-standby-answer ([input] (response-exit-standby-answer nil input)) ([resultWrapper120729 input] (clojure.core/let [rawinput120728 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120730 {"Activities" (portkey.aws/search-for-tag rawinput120728 "Activities" :flattened? nil :result-wrapper resultWrapper120729)}] (clojure.core/cond-> {} (letvar120730 "Activities") (clojure.core/assoc :activities (deser-activities (clojure.core/get-in letvar120730 ["Activities" :content])))))))

(clojure.core/defn- response-delete-lifecycle-hook-answer ([input] (response-delete-lifecycle-hook-answer nil input)) ([resultWrapper120732 input] (clojure.core/let [rawinput120731 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120733 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-launch-configurations-type ([input] (response-launch-configurations-type nil input)) ([resultWrapper120735 input] (clojure.core/let [rawinput120734 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120736 {"LaunchConfigurations" (portkey.aws/search-for-tag rawinput120734 "LaunchConfigurations" :flattened? nil :result-wrapper resultWrapper120735), "NextToken" (portkey.aws/search-for-tag rawinput120734 "NextToken" :flattened? nil :result-wrapper resultWrapper120735)}] (clojure.core/cond-> {:launch-configurations (deser-launch-configurations (clojure.core/get-in letvar120736 ["LaunchConfigurations" :content]))} (letvar120736 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar120736 ["NextToken" :content])))))))

(clojure.core/defn- response-describe-load-balancer-target-groups-response ([input] (response-describe-load-balancer-target-groups-response nil input)) ([resultWrapper120738 input] (clojure.core/let [rawinput120737 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120739 {"LoadBalancerTargetGroups" (portkey.aws/search-for-tag rawinput120737 "LoadBalancerTargetGroups" :flattened? nil :result-wrapper resultWrapper120738), "NextToken" (portkey.aws/search-for-tag rawinput120737 "NextToken" :flattened? nil :result-wrapper resultWrapper120738)}] (clojure.core/cond-> {} (letvar120739 "LoadBalancerTargetGroups") (clojure.core/assoc :load-balancer-target-groups (deser-load-balancer-target-group-states (clojure.core/get-in letvar120739 ["LoadBalancerTargetGroups" :content]))) (letvar120739 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar120739 ["NextToken" :content])))))))

(clojure.core/defn- response-enter-standby-answer ([input] (response-enter-standby-answer nil input)) ([resultWrapper120741 input] (clojure.core/let [rawinput120740 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120742 {"Activities" (portkey.aws/search-for-tag rawinput120740 "Activities" :flattened? nil :result-wrapper resultWrapper120741)}] (clojure.core/cond-> {} (letvar120742 "Activities") (clojure.core/assoc :activities (deser-activities (clojure.core/get-in letvar120742 ["Activities" :content])))))))

(clojure.core/defn- response-activities-type ([input] (response-activities-type nil input)) ([resultWrapper120744 input] (clojure.core/let [rawinput120743 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120745 {"Activities" (portkey.aws/search-for-tag rawinput120743 "Activities" :flattened? nil :result-wrapper resultWrapper120744), "NextToken" (portkey.aws/search-for-tag rawinput120743 "NextToken" :flattened? nil :result-wrapper resultWrapper120744)}] (clojure.core/cond-> {:activities (deser-activities (clojure.core/get-in letvar120745 ["Activities" :content]))} (letvar120745 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar120745 ["NextToken" :content])))))))

(clojure.core/defn- response-describe-load-balancers-response ([input] (response-describe-load-balancers-response nil input)) ([resultWrapper120747 input] (clojure.core/let [rawinput120746 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120748 {"LoadBalancers" (portkey.aws/search-for-tag rawinput120746 "LoadBalancers" :flattened? nil :result-wrapper resultWrapper120747), "NextToken" (portkey.aws/search-for-tag rawinput120746 "NextToken" :flattened? nil :result-wrapper resultWrapper120747)}] (clojure.core/cond-> {} (letvar120748 "LoadBalancers") (clojure.core/assoc :load-balancers (deser-load-balancer-states (clojure.core/get-in letvar120748 ["LoadBalancers" :content]))) (letvar120748 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar120748 ["NextToken" :content])))))))

(clojure.core/defn- response-describe-lifecycle-hook-types-answer ([input] (response-describe-lifecycle-hook-types-answer nil input)) ([resultWrapper120750 input] (clojure.core/let [rawinput120749 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120751 {"LifecycleHookTypes" (portkey.aws/search-for-tag rawinput120749 "LifecycleHookTypes" :flattened? nil :result-wrapper resultWrapper120750)}] (clojure.core/cond-> {} (letvar120751 "LifecycleHookTypes") (clojure.core/assoc :lifecycle-hook-types (deser-auto-scaling-notification-types (clojure.core/get-in letvar120751 ["LifecycleHookTypes" :content])))))))

(clojure.core/defn- response-record-lifecycle-action-heartbeat-answer ([input] (response-record-lifecycle-action-heartbeat-answer nil input)) ([resultWrapper120753 input] (clojure.core/let [rawinput120752 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120754 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-in-use-fault ([input] (response-resource-in-use-fault nil input)) ([resultWrapper120756 input] (clojure.core/let [rawinput120755 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120757 {"message" (portkey.aws/search-for-tag rawinput120755 "message" :flattened? nil :result-wrapper resultWrapper120756)}] (clojure.core/cond-> {} (letvar120757 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar120757 ["message" :content])))))))

(clojure.core/defn- response-activity-type ([input] (response-activity-type nil input)) ([resultWrapper120759 input] (clojure.core/let [rawinput120758 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120760 {"Activity" (portkey.aws/search-for-tag rawinput120758 "Activity" :flattened? nil :result-wrapper resultWrapper120759)}] (clojure.core/cond-> {} (letvar120760 "Activity") (clojure.core/assoc :activity (deser-activity (clojure.core/get-in letvar120760 ["Activity" :content])))))))

(clojure.core/defn- response-limit-exceeded-fault ([input] (response-limit-exceeded-fault nil input)) ([resultWrapper120762 input] (clojure.core/let [rawinput120761 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120763 {"message" (portkey.aws/search-for-tag rawinput120761 "message" :flattened? nil :result-wrapper resultWrapper120762)}] (clojure.core/cond-> {} (letvar120763 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar120763 ["message" :content])))))))

(clojure.core/defn- response-describe-account-limits-answer ([input] (response-describe-account-limits-answer nil input)) ([resultWrapper120765 input] (clojure.core/let [rawinput120764 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120766 {"MaxNumberOfAutoScalingGroups" (portkey.aws/search-for-tag rawinput120764 "MaxNumberOfAutoScalingGroups" :flattened? nil :result-wrapper resultWrapper120765), "MaxNumberOfLaunchConfigurations" (portkey.aws/search-for-tag rawinput120764 "MaxNumberOfLaunchConfigurations" :flattened? nil :result-wrapper resultWrapper120765), "NumberOfAutoScalingGroups" (portkey.aws/search-for-tag rawinput120764 "NumberOfAutoScalingGroups" :flattened? nil :result-wrapper resultWrapper120765), "NumberOfLaunchConfigurations" (portkey.aws/search-for-tag rawinput120764 "NumberOfLaunchConfigurations" :flattened? nil :result-wrapper resultWrapper120765)}] (clojure.core/cond-> {} (letvar120766 "MaxNumberOfAutoScalingGroups") (clojure.core/assoc :max-number-of-auto-scaling-groups (deser-max-number-of-auto-scaling-groups (clojure.core/get-in letvar120766 ["MaxNumberOfAutoScalingGroups" :content]))) (letvar120766 "MaxNumberOfLaunchConfigurations") (clojure.core/assoc :max-number-of-launch-configurations (deser-max-number-of-launch-configurations (clojure.core/get-in letvar120766 ["MaxNumberOfLaunchConfigurations" :content]))) (letvar120766 "NumberOfAutoScalingGroups") (clojure.core/assoc :number-of-auto-scaling-groups (deser-number-of-auto-scaling-groups (clojure.core/get-in letvar120766 ["NumberOfAutoScalingGroups" :content]))) (letvar120766 "NumberOfLaunchConfigurations") (clojure.core/assoc :number-of-launch-configurations (deser-number-of-launch-configurations (clojure.core/get-in letvar120766 ["NumberOfLaunchConfigurations" :content])))))))

(clojure.core/defn- response-service-linked-role-failure ([input] (response-service-linked-role-failure nil input)) ([resultWrapper120768 input] (clojure.core/let [rawinput120767 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120769 {"message" (portkey.aws/search-for-tag rawinput120767 "message" :flattened? nil :result-wrapper resultWrapper120768)}] (clojure.core/cond-> {} (letvar120769 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar120769 ["message" :content])))))))

(clojure.core/defn- response-set-instance-protection-answer ([input] (response-set-instance-protection-answer nil input)) ([resultWrapper120771 input] (clojure.core/let [rawinput120770 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120772 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-metric-collection-types-answer ([input] (response-describe-metric-collection-types-answer nil input)) ([resultWrapper120774 input] (clojure.core/let [rawinput120773 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120775 {"Metrics" (portkey.aws/search-for-tag rawinput120773 "Metrics" :flattened? nil :result-wrapper resultWrapper120774), "Granularities" (portkey.aws/search-for-tag rawinput120773 "Granularities" :flattened? nil :result-wrapper resultWrapper120774)}] (clojure.core/cond-> {} (letvar120775 "Metrics") (clojure.core/assoc :metrics (deser-metric-collection-types (clojure.core/get-in letvar120775 ["Metrics" :content]))) (letvar120775 "Granularities") (clojure.core/assoc :granularities (deser-metric-granularity-types (clojure.core/get-in letvar120775 ["Granularities" :content])))))))

(clojure.core/defn- response-describe-notification-configurations-answer ([input] (response-describe-notification-configurations-answer nil input)) ([resultWrapper120777 input] (clojure.core/let [rawinput120776 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120778 {"NotificationConfigurations" (portkey.aws/search-for-tag rawinput120776 "NotificationConfigurations" :flattened? nil :result-wrapper resultWrapper120777), "NextToken" (portkey.aws/search-for-tag rawinput120776 "NextToken" :flattened? nil :result-wrapper resultWrapper120777)}] (clojure.core/cond-> {:notification-configurations (deser-notification-configurations (clojure.core/get-in letvar120778 ["NotificationConfigurations" :content]))} (letvar120778 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar120778 ["NextToken" :content])))))))

(clojure.core/defn- response-scheduled-actions-type ([input] (response-scheduled-actions-type nil input)) ([resultWrapper120780 input] (clojure.core/let [rawinput120779 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120781 {"ScheduledUpdateGroupActions" (portkey.aws/search-for-tag rawinput120779 "ScheduledUpdateGroupActions" :flattened? nil :result-wrapper resultWrapper120780), "NextToken" (portkey.aws/search-for-tag rawinput120779 "NextToken" :flattened? nil :result-wrapper resultWrapper120780)}] (clojure.core/cond-> {} (letvar120781 "ScheduledUpdateGroupActions") (clojure.core/assoc :scheduled-update-group-actions (deser-scheduled-update-group-actions (clojure.core/get-in letvar120781 ["ScheduledUpdateGroupActions" :content]))) (letvar120781 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar120781 ["NextToken" :content])))))))

(clojure.core/defn- response-batch-delete-scheduled-action-answer ([input] (response-batch-delete-scheduled-action-answer nil input)) ([resultWrapper120783 input] (clojure.core/let [rawinput120782 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120784 {"FailedScheduledActions" (portkey.aws/search-for-tag rawinput120782 "FailedScheduledActions" :flattened? nil :result-wrapper resultWrapper120783)}] (clojure.core/cond-> {} (letvar120784 "FailedScheduledActions") (clojure.core/assoc :failed-scheduled-actions (deser-failed-scheduled-update-group-action-requests (clojure.core/get-in letvar120784 ["FailedScheduledActions" :content])))))))

(clojure.core/defn- response-policy-arn-type ([input] (response-policy-arn-type nil input)) ([resultWrapper120786 input] (clojure.core/let [rawinput120785 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120787 {"PolicyARN" (portkey.aws/search-for-tag rawinput120785 "PolicyARN" :flattened? nil :result-wrapper resultWrapper120786), "Alarms" (portkey.aws/search-for-tag rawinput120785 "Alarms" :flattened? nil :result-wrapper resultWrapper120786)}] (clojure.core/cond-> {} (letvar120787 "PolicyARN") (clojure.core/assoc :policy-arn (deser-resource-name (clojure.core/get-in letvar120787 ["PolicyARN" :content]))) (letvar120787 "Alarms") (clojure.core/assoc :alarms (deser-alarms (clojure.core/get-in letvar120787 ["Alarms" :content])))))))

(clojure.core/defn- response-scaling-activity-in-progress-fault ([input] (response-scaling-activity-in-progress-fault nil input)) ([resultWrapper120789 input] (clojure.core/let [rawinput120788 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120790 {"message" (portkey.aws/search-for-tag rawinput120788 "message" :flattened? nil :result-wrapper resultWrapper120789)}] (clojure.core/cond-> {} (letvar120790 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar120790 ["message" :content])))))))

(clojure.core/defn- response-auto-scaling-instances-type ([input] (response-auto-scaling-instances-type nil input)) ([resultWrapper120792 input] (clojure.core/let [rawinput120791 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120793 {"AutoScalingInstances" (portkey.aws/search-for-tag rawinput120791 "AutoScalingInstances" :flattened? nil :result-wrapper resultWrapper120792), "NextToken" (portkey.aws/search-for-tag rawinput120791 "NextToken" :flattened? nil :result-wrapper resultWrapper120792)}] (clojure.core/cond-> {} (letvar120793 "AutoScalingInstances") (clojure.core/assoc :auto-scaling-instances (deser-auto-scaling-instances (clojure.core/get-in letvar120793 ["AutoScalingInstances" :content]))) (letvar120793 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar120793 ["NextToken" :content])))))))

(clojure.core/defn- response-attach-load-balancer-target-groups-result-type ([input] (response-attach-load-balancer-target-groups-result-type nil input)) ([resultWrapper120795 input] (clojure.core/let [rawinput120794 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120796 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-attach-load-balancers-result-type ([input] (response-attach-load-balancers-result-type nil input)) ([resultWrapper120798 input] (clojure.core/let [rawinput120797 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120799 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detach-load-balancers-result-type ([input] (response-detach-load-balancers-result-type nil input)) ([resultWrapper120801 input] (clojure.core/let [rawinput120800 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120802 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-lifecycle-hook-answer ([input] (response-put-lifecycle-hook-answer nil input)) ([resultWrapper120804 input] (clojure.core/let [rawinput120803 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120805 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-put-scheduled-update-group-action-answer ([input] (response-batch-put-scheduled-update-group-action-answer nil input)) ([resultWrapper120807 input] (clojure.core/let [rawinput120806 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120808 {"FailedScheduledUpdateGroupActions" (portkey.aws/search-for-tag rawinput120806 "FailedScheduledUpdateGroupActions" :flattened? nil :result-wrapper resultWrapper120807)}] (clojure.core/cond-> {} (letvar120808 "FailedScheduledUpdateGroupActions") (clojure.core/assoc :failed-scheduled-update-group-actions (deser-failed-scheduled-update-group-action-requests (clojure.core/get-in letvar120808 ["FailedScheduledUpdateGroupActions" :content])))))))

(clojure.core/defn- response-invalid-next-token ([input] (response-invalid-next-token nil input)) ([resultWrapper120810 input] (clojure.core/let [rawinput120809 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120811 {"message" (portkey.aws/search-for-tag rawinput120809 "message" :flattened? nil :result-wrapper resultWrapper120810)}] (clojure.core/cond-> {} (letvar120811 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar120811 ["message" :content])))))))

(clojure.core/defn- response-describe-auto-scaling-notification-types-answer ([input] (response-describe-auto-scaling-notification-types-answer nil input)) ([resultWrapper120813 input] (clojure.core/let [rawinput120812 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar120814 {"AutoScalingNotificationTypes" (portkey.aws/search-for-tag rawinput120812 "AutoScalingNotificationTypes" :flattened? nil :result-wrapper resultWrapper120813)}] (clojure.core/cond-> {} (letvar120814 "AutoScalingNotificationTypes") (clojure.core/assoc :auto-scaling-notification-types (deser-auto-scaling-notification-types (clojure.core/get-in letvar120814 ["AutoScalingNotificationTypes" :content])))))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-action-result (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-adjustment-types-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/adjustment-types]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/ascii-string-max-len-255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[A-Za-z0-9\-_\/]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/ascii-string-max-len-255 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.autoscaling.predefined-metric-specification/predefined-metric-type (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.predefined-metric-specification/resource-label (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling/predefined-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.predefined-metric-specification/predefined-metric-type] :opt-un [:portkey.aws.autoscaling.predefined-metric-specification/resource-label]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/should-respect-grace-period clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.instances-distribution/on-demand-allocation-strategy (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instances-distribution/spot-allocation-strategy (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instances-distribution/spot-max-price (clojure.spec.alpha/and :portkey.aws.autoscaling/mixed-instance-spot-price))
(clojure.spec.alpha/def :portkey.aws.autoscaling/instances-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.instances-distribution/on-demand-allocation-strategy :portkey.aws.autoscaling/on-demand-base-capacity :portkey.aws.autoscaling/on-demand-percentage-above-base-capacity :portkey.aws.autoscaling.instances-distribution/spot-allocation-strategy :portkey.aws.autoscaling/spot-instance-pools :portkey.aws.autoscaling.instances-distribution/spot-max-price]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.resource-contention-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/resource-contention-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.resource-contention-fault/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/complete-lifecycle-action-answer (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.filter/name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.filter/name :portkey.aws.autoscaling/values]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.enter-standby-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/enter-standby-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.enter-standby-query/auto-scaling-group-name :portkey.aws.autoscaling/should-decrement-desired-capacity] :opt-un [:portkey.aws.autoscaling/instance-ids]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-request/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancer-target-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.describe-load-balancer-target-groups-request/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling.describe-load-balancer-target-groups-request/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-target-group-state/load-balancer-target-group-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-511))
(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-target-group-state/state (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-target-group-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.load-balancer-target-group-state/load-balancer-target-group-arn :portkey.aws.autoscaling.load-balancer-target-group-state/state]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancer-target-groups-result-type (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/activities (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/activity))

(clojure.spec.alpha/def :portkey.aws.autoscaling/failed-scheduled-update-group-action-requests (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/failed-scheduled-update-group-action-request))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/recurrence (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/scheduled-action-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-update-group-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.scheduled-update-group-action/auto-scaling-group-name :portkey.aws.autoscaling.scheduled-update-group-action/end-time :portkey.aws.autoscaling.scheduled-update-group-action/start-time :portkey.aws.autoscaling.scheduled-update-group-action/recurrence :portkey.aws.autoscaling.scheduled-update-group-action/scheduled-action-name :portkey.aws.autoscaling.scheduled-update-group-action/min-size :portkey.aws.autoscaling.scheduled-update-group-action/max-size :portkey.aws.autoscaling.scheduled-update-group-action/time :portkey.aws.autoscaling.scheduled-update-group-action/desired-capacity :portkey.aws.autoscaling.scheduled-update-group-action/scheduled-action-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/associate-public-ip-address clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-auto-scaling-group-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-auto-scaling-group-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.delete-auto-scaling-group-type/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/force-delete]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/recurrence (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-update-group-action-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.scheduled-update-group-action-request/scheduled-action-name] :opt-un [:portkey.aws.autoscaling.scheduled-update-group-action-request/start-time :portkey.aws.autoscaling.scheduled-update-group-action-request/end-time :portkey.aws.autoscaling.scheduled-update-group-action-request/recurrence :portkey.aws.autoscaling.scheduled-update-group-action-request/min-size :portkey.aws.autoscaling.scheduled-update-group-action-request/max-size :portkey.aws.autoscaling.scheduled-update-group-action-request/desired-capacity]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/global-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/enabled-metrics (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/enabled-metric))

(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-instances-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/activities]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.tags-type/tags (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-description-list))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tags-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/tags-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.tags-type/tags :portkey.aws.autoscaling.tags-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/instance-ids (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-19))

(clojure.spec.alpha/def :portkey.aws.autoscaling/create-or-update-tags-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/processes-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/processes]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-tags-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-tags-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/filters :portkey.aws.autoscaling.describe-tags-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.already-exists-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.already-exists-fault/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/notification-target-resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1600)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.instance-monitoring/enabled (clojure.spec.alpha/and :portkey.aws.autoscaling/monitoring-enabled))
(clojure.spec.alpha/def :portkey.aws.autoscaling/instance-monitoring (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.instance-monitoring/enabled]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/notification-configurations (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/notification-configuration))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-state #{"Detaching" "Terminating:Wait" :standby :terminating-wait :pending-proceed :pending "InService" "Quarantined" :detached :quarantined :terminating :terminating-proceed "Pending:Proceed" "Terminating" :terminated :in-service "EnteringStandby" "Pending:Wait" "Terminated" "Standby" "Pending" :pending-wait "Terminating:Proceed" :detaching :entering-standby "Detached"})

(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/new-instances-protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/vpc-zone-identifier (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-2047))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/lifecycle-hook-specification-list (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-hook-specifications))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/default-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/health-check-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/placement-group (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/service-linked-role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/create-auto-scaling-group-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.create-auto-scaling-group-type/auto-scaling-group-name :portkey.aws.autoscaling.create-auto-scaling-group-type/min-size :portkey.aws.autoscaling.create-auto-scaling-group-type/max-size] :opt-un [:portkey.aws.autoscaling.create-auto-scaling-group-type/new-instances-protected-from-scale-in :portkey.aws.autoscaling.create-auto-scaling-group-type/instance-id :portkey.aws.autoscaling/load-balancer-names :portkey.aws.autoscaling.create-auto-scaling-group-type/vpc-zone-identifier :portkey.aws.autoscaling.create-auto-scaling-group-type/launch-template :portkey.aws.autoscaling/tags :portkey.aws.autoscaling.create-auto-scaling-group-type/lifecycle-hook-specification-list :portkey.aws.autoscaling.create-auto-scaling-group-type/default-cooldown :portkey.aws.autoscaling/mixed-instances-policy :portkey.aws.autoscaling.create-auto-scaling-group-type/launch-configuration-name :portkey.aws.autoscaling/target-group-ar-ns :portkey.aws.autoscaling.create-auto-scaling-group-type/health-check-type :portkey.aws.autoscaling/availability-zones :portkey.aws.autoscaling/termination-policies :portkey.aws.autoscaling.create-auto-scaling-group-type/placement-group :portkey.aws.autoscaling.create-auto-scaling-group-type/desired-capacity :portkey.aws.autoscaling/health-check-grace-period :portkey.aws.autoscaling.create-auto-scaling-group-type/service-linked-role-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-template-specification/launch-template-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-template-specification/version (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-template-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.launch-template-specification/launch-template-id :portkey.aws.autoscaling/launch-template-name :portkey.aws.autoscaling.launch-template-specification/version]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/min-adjustment-magnitude clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-collection-type/metric (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-collection-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.metric-collection-type/metric]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/max-number-of-launch-configurations clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-notification-configuration-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-notification-configuration-type/topic-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-notification-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.delete-notification-configuration-type/auto-scaling-group-name :portkey.aws.autoscaling.delete-notification-configuration-type/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-lifecycle-hooks-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-lifecycle-hooks-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.describe-lifecycle-hooks-type/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/lifecycle-hook-names]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/security-groups (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string))

(clojure.spec.alpha/def :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/lifecycle-hook-name :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/lifecycle-action-token :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/instance-id]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/ebs-optimized clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.batch-put-scheduled-update-group-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.batch-put-scheduled-update-group-action-type/scheduled-update-group-actions (clojure.spec.alpha/and :portkey.aws.autoscaling/scheduled-update-group-action-requests))
(clojure.spec.alpha/def :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.batch-put-scheduled-update-group-action-type/auto-scaling-group-name :portkey.aws.autoscaling.batch-put-scheduled-update-group-action-type/scheduled-update-group-actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.detach-load-balancer-target-groups-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancer-target-groups-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.detach-load-balancer-target-groups-type/auto-scaling-group-name :portkey.aws.autoscaling/target-group-ar-ns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration-names-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration-names-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/launch-configuration-names :portkey.aws.autoscaling.launch-configuration-names-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/monitoring-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.set-instance-protection-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/set-instance-protection-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/instance-ids :portkey.aws.autoscaling.set-instance-protection-query/auto-scaling-group-name :portkey.aws.autoscaling/protected-from-scale-in] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/should-decrement-desired-capacity clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.set-desired-capacity-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.set-desired-capacity-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling/set-desired-capacity-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.set-desired-capacity-type/auto-scaling-group-name :portkey.aws.autoscaling.set-desired-capacity-type/desired-capacity] :opt-un [:portkey.aws.autoscaling/honor-cooldown]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimension-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling.process-type/process-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/process-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.process-type/process-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/propagate-at-launch clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/new-instances-protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/vpc-zone-identifier (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-2047))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/default-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/health-check-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/placement-group (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/service-linked-role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/update-auto-scaling-group-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.update-auto-scaling-group-type/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling.update-auto-scaling-group-type/new-instances-protected-from-scale-in :portkey.aws.autoscaling.update-auto-scaling-group-type/vpc-zone-identifier :portkey.aws.autoscaling.update-auto-scaling-group-type/launch-template :portkey.aws.autoscaling.update-auto-scaling-group-type/default-cooldown :portkey.aws.autoscaling/mixed-instances-policy :portkey.aws.autoscaling.update-auto-scaling-group-type/launch-configuration-name :portkey.aws.autoscaling.update-auto-scaling-group-type/health-check-type :portkey.aws.autoscaling.update-auto-scaling-group-type/min-size :portkey.aws.autoscaling/availability-zones :portkey.aws.autoscaling/termination-policies :portkey.aws.autoscaling.update-auto-scaling-group-type/max-size :portkey.aws.autoscaling.update-auto-scaling-group-type/placement-group :portkey.aws.autoscaling.update-auto-scaling-group-type/desired-capacity :portkey.aws.autoscaling/health-check-grace-period :portkey.aws.autoscaling.update-auto-scaling-group-type/service-linked-role-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/max-records clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/launch-template-specification :portkey.aws.autoscaling/overrides]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.enable-metrics-collection-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.enable-metrics-collection-query/granularity (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/enable-metrics-collection-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.enable-metrics-collection-query/auto-scaling-group-name :portkey.aws.autoscaling.enable-metrics-collection-query/granularity] :opt-un [:portkey.aws.autoscaling/metrics]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-termination-policy-types-answer/termination-policy-types (clojure.spec.alpha/and :portkey.aws.autoscaling/termination-policies))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-termination-policy-types-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-termination-policy-types-answer/termination-policy-types]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-lifecycle-hooks-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/lifecycle-hooks]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-tags-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/tags (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/tag))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook-specifications (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/lifecycle-hook-specification))

(clojure.spec.alpha/def :portkey.aws.autoscaling.enabled-metric/metric (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.enabled-metric/granularity (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/enabled-metric (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.enabled-metric/metric :portkey.aws.autoscaling.enabled-metric/granularity]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-groups-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-groups-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/auto-scaling-groups] :opt-un [:portkey.aws.autoscaling.auto-scaling-groups-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/no-device clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.attach-instances-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-instances-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.attach-instances-query/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/instance-ids]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/snapshot-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/volume-size (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-volume-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/volume-type (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-volume-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/delete-on-termination (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-delete-on-termination))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/iops (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-iops))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/encrypted (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-encrypted))
(clojure.spec.alpha/def :portkey.aws.autoscaling/ebs (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.ebs/snapshot-id :portkey.aws.autoscaling.ebs/volume-size :portkey.aws.autoscaling.ebs/volume-type :portkey.aws.autoscaling.ebs/delete-on-termination :portkey.aws.autoscaling.ebs/iops :portkey.aws.autoscaling.ebs/encrypted]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.set-instance-health-query/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.set-instance-health-query/health-status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling/set-instance-health-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.set-instance-health-query/instance-id :portkey.aws.autoscaling.set-instance-health-query/health-status] :opt-un [:portkey.aws.autoscaling/should-respect-grace-period]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.policies-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/policies-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/scaling-policies :portkey.aws.autoscaling.policies-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.suspended-process/process-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.suspended-process/suspension-reason (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/suspended-process (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.suspended-process/process-name :portkey.aws.autoscaling.suspended-process/suspension-reason]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/cause (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/status-code (clojure.spec.alpha/and :portkey.aws.autoscaling/scaling-activity-status-code))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/details (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/status-message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/activity-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/description (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/activity (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.activity/activity-id :portkey.aws.autoscaling.activity/auto-scaling-group-name :portkey.aws.autoscaling.activity/cause :portkey.aws.autoscaling.activity/start-time :portkey.aws.autoscaling.activity/status-code] :opt-un [:portkey.aws.autoscaling.activity/end-time :portkey.aws.autoscaling.activity/details :portkey.aws.autoscaling.activity/status-message :portkey.aws.autoscaling/progress :portkey.aws.autoscaling.activity/description]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/cooldown clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/exit-standby-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/activities]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-iops (clojure.spec.alpha/int-in 100 20000))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-encrypted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/max-number-of-auto-scaling-groups clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-lifecycle-hook-answer (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-max-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configurations (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/launch-configuration))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configurations-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configurations-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/launch-configurations] :opt-un [:portkey.aws.autoscaling.launch-configurations-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-target-group-states (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/load-balancer-target-group-state))

(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-64))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-response/load-balancer-target-groups (clojure.spec.alpha/and :portkey.aws.autoscaling/load-balancer-target-group-states))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancer-target-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-load-balancer-target-groups-response/load-balancer-target-groups :portkey.aws.autoscaling.describe-load-balancer-target-groups-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/progress clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/number-of-launch-configurations clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.terminate-instance-in-auto-scaling-group-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling/terminate-instance-in-auto-scaling-group-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.terminate-instance-in-auto-scaling-group-type/instance-id :portkey.aws.autoscaling/should-decrement-desired-capacity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/estimated-instance-warmup clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/enter-standby-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/activities]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.activities-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/activities-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/activities] :opt-un [:portkey.aws.autoscaling.activities-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-volume-size (clojure.spec.alpha/int-in 1 16384))

(clojure.spec.alpha/def :portkey.aws.autoscaling/step-adjustments (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/step-adjustment))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-response/load-balancers (clojure.spec.alpha/and :portkey.aws.autoscaling/load-balancer-states))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-response/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-load-balancers-response/load-balancers :portkey.aws.autoscaling.describe-load-balancers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/activity-ids (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string))

(clojure.spec.alpha/def :portkey.aws.autoscaling/spot-price (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-lifecycle-hook-types-answer/lifecycle-hook-types (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-notification-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-lifecycle-hook-types-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-lifecycle-hook-types-answer/lifecycle-hook-types]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/resource-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/resource-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/key (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-key))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/value (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.tag-description/resource-id :portkey.aws.autoscaling.tag-description/resource-type :portkey.aws.autoscaling.tag-description/key :portkey.aws.autoscaling.tag-description/value :portkey.aws.autoscaling/propagate-at-launch]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-scheduled-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-scheduled-action-type/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-scheduled-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.delete-scheduled-action-type/auto-scaling-group-name :portkey.aws.autoscaling.delete-scheduled-action-type/scheduled-action-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/instance-protected clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-19 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 19)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.attach-load-balancers-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancers-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.attach-load-balancers-type/auto-scaling-group-name :portkey.aws.autoscaling/load-balancer-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-answer (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-template-overrides/instance-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-template-overrides (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.launch-template-overrides/instance-type]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-policy-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-policy-type/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-policy-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.delete-policy-type/policy-name] :opt-un [:portkey.aws.autoscaling.delete-policy-type/auto-scaling-group-name]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/number-of-auto-scaling-groups clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-state/load-balancer-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-state/state (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.load-balancer-state/load-balancer-name :portkey.aws.autoscaling.load-balancer-state/state]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-policies-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-policies-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-policies-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-policies-type/auto-scaling-group-name :portkey.aws.autoscaling/policy-names :portkey.aws.autoscaling/policy-types :portkey.aws.autoscaling.describe-policies-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.resource-in-use-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/resource-in-use-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.resource-in-use-fault/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.exit-standby-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/exit-standby-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.exit-standby-query/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/instance-ids]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-activity-status-code #{:waiting-for-spot-instance-id "Failed" "Cancelled" :in-progress "PendingSpotBidPlacement" "WaitingForSpotInstanceRequestId" "WaitingForELBConnectionDraining" :successful :waiting-for-elb-connection-draining :pre-in-service "WaitingForInstanceWarmup" :cancelled "PreInService" "InProgress" :pending-spot-bid-placement "Successful" "WaitingForInstanceId" :mid-lifecycle-action "WaitingForSpotInstanceId" "MidLifecycleAction" :waiting-for-instance-id :failed :waiting-for-instance-warmup :waiting-for-spot-instance-request-id})

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group-names-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-names-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/auto-scaling-group-names :portkey.aws.autoscaling.auto-scaling-group-names-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-update-group-actions (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/scheduled-update-group-action))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-instances (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/auto-scaling-instance-details))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimension-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/activity-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/activity]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-description-list (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/tag-description))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration-name-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration-name-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.launch-configuration-name-type/launch-configuration-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.limit-exceeded-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/limit-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.limit-exceeded-fault/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/timestamp-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-account-limits-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/max-number-of-auto-scaling-groups :portkey.aws.autoscaling/max-number-of-launch-configurations :portkey.aws.autoscaling/number-of-auto-scaling-groups :portkey.aws.autoscaling/number-of-launch-configurations]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.service-linked-role-failure/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/service-linked-role-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.service-linked-role-failure/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.adjustment-type/adjustment-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/adjustment-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.adjustment-type/adjustment-type]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/recurrence (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-scheduled-update-group-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.put-scheduled-update-group-action-type/auto-scaling-group-name :portkey.aws.autoscaling.put-scheduled-update-group-action-type/scheduled-action-name] :opt-un [:portkey.aws.autoscaling.put-scheduled-update-group-action-type/end-time :portkey.aws.autoscaling.put-scheduled-update-group-action-type/start-time :portkey.aws.autoscaling.put-scheduled-update-group-action-type/recurrence :portkey.aws.autoscaling.put-scheduled-update-group-action-type/min-size :portkey.aws.autoscaling.put-scheduled-update-group-action-type/max-size :portkey.aws.autoscaling.put-scheduled-update-group-action-type/time :portkey.aws.autoscaling.put-scheduled-update-group-action-type/desired-capacity]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.batch-delete-scheduled-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/batch-delete-scheduled-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.batch-delete-scheduled-action-type/auto-scaling-group-name :portkey.aws.autoscaling/scheduled-action-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.disable-metrics-collection-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/disable-metrics-collection-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.disable-metrics-collection-query/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/metrics]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/set-instance-protection-answer (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/spot-instance-pools clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-1023 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1023)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-action-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-increment))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/adjustment-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/metric-aggregation-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/policy-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-64))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-scaling-policy-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.put-scaling-policy-type/auto-scaling-group-name :portkey.aws.autoscaling.put-scaling-policy-type/policy-name] :opt-un [:portkey.aws.autoscaling/min-adjustment-magnitude :portkey.aws.autoscaling.put-scaling-policy-type/scaling-adjustment :portkey.aws.autoscaling/cooldown :portkey.aws.autoscaling/estimated-instance-warmup :portkey.aws.autoscaling/step-adjustments :portkey.aws.autoscaling.put-scaling-policy-type/adjustment-type :portkey.aws.autoscaling.put-scaling-policy-type/metric-aggregation-type :portkey.aws.autoscaling/target-tracking-configuration :portkey.aws.autoscaling/min-adjustment-step :portkey.aws.autoscaling.put-scaling-policy-type/policy-type]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/new-instances-protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/vpc-zone-identifier (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-2047))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/tags (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-description-list))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/auto-scaling-group-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/created-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/default-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/health-check-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/placement-group (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/service-linked-role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.auto-scaling-group/auto-scaling-group-name :portkey.aws.autoscaling.auto-scaling-group/min-size :portkey.aws.autoscaling.auto-scaling-group/max-size :portkey.aws.autoscaling.auto-scaling-group/desired-capacity :portkey.aws.autoscaling.auto-scaling-group/default-cooldown :portkey.aws.autoscaling/availability-zones :portkey.aws.autoscaling.auto-scaling-group/health-check-type :portkey.aws.autoscaling.auto-scaling-group/created-time] :opt-un [:portkey.aws.autoscaling.auto-scaling-group/new-instances-protected-from-scale-in :portkey.aws.autoscaling/load-balancer-names :portkey.aws.autoscaling/enabled-metrics :portkey.aws.autoscaling.auto-scaling-group/vpc-zone-identifier :portkey.aws.autoscaling.auto-scaling-group/launch-template :portkey.aws.autoscaling.auto-scaling-group/tags :portkey.aws.autoscaling.auto-scaling-group/auto-scaling-group-arn :portkey.aws.autoscaling.auto-scaling-group/status :portkey.aws.autoscaling/mixed-instances-policy :portkey.aws.autoscaling.auto-scaling-group/launch-configuration-name :portkey.aws.autoscaling/target-group-ar-ns :portkey.aws.autoscaling/suspended-processes :portkey.aws.autoscaling/termination-policies :portkey.aws.autoscaling/instances :portkey.aws.autoscaling.auto-scaling-group/placement-group :portkey.aws.autoscaling/health-check-grace-period :portkey.aws.autoscaling.auto-scaling-group/service-linked-role-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/values (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string))

(clojure.spec.alpha/def :portkey.aws.autoscaling/mixed-instances-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/launch-template :portkey.aws.autoscaling/instances-distribution]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/availability-zone (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/lifecycle-state (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/health-status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-instance-details (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.auto-scaling-instance-details/instance-id :portkey.aws.autoscaling.auto-scaling-instance-details/auto-scaling-group-name :portkey.aws.autoscaling.auto-scaling-instance-details/availability-zone :portkey.aws.autoscaling.auto-scaling-instance-details/lifecycle-state :portkey.aws.autoscaling.auto-scaling-instance-details/health-status :portkey.aws.autoscaling.auto-scaling-instance-details/protected-from-scale-in] :opt-un [:portkey.aws.autoscaling.auto-scaling-instance-details/launch-configuration-name :portkey.aws.autoscaling.auto-scaling-instance-details/launch-template]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-dimension/name (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-dimension-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-dimension/value (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-dimension-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimension (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.metric-dimension/name :portkey.aws.autoscaling.metric-dimension/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-user-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 21847)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1600)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.detach-load-balancers-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancers-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.detach-load-balancers-type/auto-scaling-group-name :portkey.aws.autoscaling/load-balancer-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-metric-collection-types-answer/metrics (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-collection-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-metric-collection-types-answer/granularities (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-granularity-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-metric-collection-types-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-metric-collection-types-answer/metrics :portkey.aws.autoscaling.describe-metric-collection-types-answer/granularities]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-1600 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1600)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-transition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-groups (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/auto-scaling-group))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-notification-configurations-answer/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-notification-configurations-answer (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/notification-configurations] :opt-un [:portkey.aws.autoscaling.describe-notification-configurations-answer/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-actions-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-actions-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/scheduled-update-group-actions :portkey.aws.autoscaling.scheduled-actions-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\(\)\.-/_]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/mixed-instance-spot-price (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.target-tracking-configuration/target-value (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling/target-tracking-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.target-tracking-configuration/target-value] :opt-un [:portkey.aws.autoscaling/predefined-metric-specification :portkey.aws.autoscaling/customized-metric-specification :portkey.aws.autoscaling/disable-scale-in]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/filters (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/filter))

(clojure.spec.alpha/def :portkey.aws.autoscaling/min-adjustment-step clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-scheduled-actions-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-scheduled-actions-type/auto-scaling-group-name :portkey.aws.autoscaling/scheduled-action-names :portkey.aws.autoscaling.describe-scheduled-actions-type/start-time :portkey.aws.autoscaling.describe-scheduled-actions-type/end-time :portkey.aws.autoscaling.describe-scheduled-actions-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/heartbeat-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/classic-link-vpc-security-groups (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-states (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/load-balancer-state))

(clojure.spec.alpha/def :portkey.aws.autoscaling/honor-cooldown clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-notification-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/target-group-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-511))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hooks (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/lifecycle-hook))

(clojure.spec.alpha/def :portkey.aws.autoscaling/protected-from-scale-in clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-delete-on-termination clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-process-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-process-query/scaling-processes (clojure.spec.alpha/and :portkey.aws.autoscaling/process-names))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-process-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.scaling-process-query/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling.scaling-process-query/scaling-processes]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.step-adjustment/metric-interval-lower-bound (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling.step-adjustment/metric-interval-upper-bound (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling.step-adjustment/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-increment))
(clojure.spec.alpha/def :portkey.aws.autoscaling/step-adjustment (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.step-adjustment/scaling-adjustment] :opt-un [:portkey.aws.autoscaling.step-adjustment/metric-interval-lower-bound :portkey.aws.autoscaling.step-adjustment/metric-interval-upper-bound]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-mappings (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/block-device-mapping))

(clojure.spec.alpha/def :portkey.aws.autoscaling/alarms (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/alarm))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-statistic #{"Sum" "Average" :maximum "SampleCount" "Minimum" :sample-count :minimum :average :sum "Maximum"})

(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/metric-value (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/breach-threshold (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling/execute-policy-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.execute-policy-type/policy-name] :opt-un [:portkey.aws.autoscaling.execute-policy-type/auto-scaling-group-name :portkey.aws.autoscaling/honor-cooldown :portkey.aws.autoscaling.execute-policy-type/metric-value :portkey.aws.autoscaling.execute-policy-type/breach-threshold]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/notification-target-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/notification-target-resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/notification-metadata (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/default-result (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-action-result))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-lifecycle-hook-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.put-lifecycle-hook-type/lifecycle-hook-name :portkey.aws.autoscaling.put-lifecycle-hook-type/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/lifecycle-transition :portkey.aws.autoscaling.put-lifecycle-hook-type/role-arn :portkey.aws.autoscaling.put-lifecycle-hook-type/notification-target-arn :portkey.aws.autoscaling.put-lifecycle-hook-type/notification-metadata :portkey.aws.autoscaling/heartbeat-timeout :portkey.aws.autoscaling.put-lifecycle-hook-type/default-result]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/overrides (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/launch-template-overrides))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-2047 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2047)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/policy-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-increment))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/adjustment-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/metric-aggregation-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/policy-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-64))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.scaling-policy/auto-scaling-group-name :portkey.aws.autoscaling.scaling-policy/policy-arn :portkey.aws.autoscaling/min-adjustment-magnitude :portkey.aws.autoscaling.scaling-policy/policy-name :portkey.aws.autoscaling.scaling-policy/scaling-adjustment :portkey.aws.autoscaling/cooldown :portkey.aws.autoscaling/estimated-instance-warmup :portkey.aws.autoscaling/step-adjustments :portkey.aws.autoscaling.scaling-policy/adjustment-type :portkey.aws.autoscaling.scaling-policy/metric-aggregation-type :portkey.aws.autoscaling/target-tracking-configuration :portkey.aws.autoscaling/min-adjustment-step :portkey.aws.autoscaling/alarms :portkey.aws.autoscaling.scaling-policy/policy-type]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.batch-delete-scheduled-action-answer/failed-scheduled-actions (clojure.spec.alpha/and :portkey.aws.autoscaling/failed-scheduled-update-group-action-requests))
(clojure.spec.alpha/def :portkey.aws.autoscaling/batch-delete-scheduled-action-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.batch-delete-scheduled-action-answer/failed-scheduled-actions]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/launch-configuration-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/placement-tenancy (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-64))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/kernel-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/image-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/instance-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/classic-link-vpc-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/key-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/created-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/ramdisk-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/user-data (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-user-data))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/iam-instance-profile (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.launch-configuration/launch-configuration-name :portkey.aws.autoscaling.launch-configuration/image-id :portkey.aws.autoscaling.launch-configuration/instance-type :portkey.aws.autoscaling.launch-configuration/created-time] :opt-un [:portkey.aws.autoscaling.launch-configuration/launch-configuration-arn :portkey.aws.autoscaling.launch-configuration/placement-tenancy :portkey.aws.autoscaling.launch-configuration/kernel-id :portkey.aws.autoscaling/associate-public-ip-address :portkey.aws.autoscaling/instance-monitoring :portkey.aws.autoscaling/security-groups :portkey.aws.autoscaling/ebs-optimized :portkey.aws.autoscaling.launch-configuration/classic-link-vpc-id :portkey.aws.autoscaling.launch-configuration/key-name :portkey.aws.autoscaling/spot-price :portkey.aws.autoscaling/classic-link-vpc-security-groups :portkey.aws.autoscaling/block-device-mappings :portkey.aws.autoscaling.launch-configuration/ramdisk-id :portkey.aws.autoscaling.launch-configuration/user-data :portkey.aws.autoscaling.launch-configuration/iam-instance-profile]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/notification-target-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/notification-metadata (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/default-result (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-action-result))
(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.lifecycle-hook/auto-scaling-group-name :portkey.aws.autoscaling/global-timeout :portkey.aws.autoscaling.lifecycle-hook/notification-target-arn :portkey.aws.autoscaling.lifecycle-hook/notification-metadata :portkey.aws.autoscaling.lifecycle-hook/role-arn :portkey.aws.autoscaling.lifecycle-hook/lifecycle-hook-name :portkey.aws.autoscaling.lifecycle-hook/default-result :portkey.aws.autoscaling/lifecycle-transition :portkey.aws.autoscaling/heartbeat-timeout]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.policy-arn-type/policy-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-arn-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.policy-arn-type/policy-arn :portkey.aws.autoscaling/alarms]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-511 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 511)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-activity-in-progress-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-activity-in-progress-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.scaling-activity-in-progress-fault/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/disable-scale-in clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-granularity-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/metric-granularity-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling.block-device-mapping/virtual-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.block-device-mapping/device-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-mapping (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.block-device-mapping/device-name] :opt-un [:portkey.aws.autoscaling.block-device-mapping/virtual-name :portkey.aws.autoscaling/ebs :portkey.aws.autoscaling/no-device]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/resource-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/resource-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/key (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-key))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/value (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.tag/key] :opt-un [:portkey.aws.autoscaling.tag/resource-id :portkey.aws.autoscaling.tag/resource-type :portkey.aws.autoscaling.tag/value :portkey.aws.autoscaling/propagate-at-launch]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.alarm/alarm-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.alarm/alarm-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/alarm (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.alarm/alarm-name :portkey.aws.autoscaling.alarm/alarm-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-scale clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-volume-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/on-demand-percentage-above-base-capacity clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.failed-scheduled-update-group-action-request/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.failed-scheduled-update-group-action-request/error-code (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-64))
(clojure.spec.alpha/def :portkey.aws.autoscaling.failed-scheduled-update-group-action-request/error-message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/failed-scheduled-update-group-action-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.failed-scheduled-update-group-action-request/scheduled-action-name] :opt-un [:portkey.aws.autoscaling.failed-scheduled-update-group-action-request/error-code :portkey.aws.autoscaling.failed-scheduled-update-group-action-request/error-message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instances-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-instances-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/auto-scaling-instances :portkey.aws.autoscaling.auto-scaling-instances-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimensions (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/metric-dimension))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-update-group-action-requests (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/scheduled-update-group-action-request))

(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/availability-zone (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/health-status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling/instance (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.instance/instance-id :portkey.aws.autoscaling.instance/availability-zone :portkey.aws.autoscaling/lifecycle-state :portkey.aws.autoscaling.instance/health-status :portkey.aws.autoscaling.instance/protected-from-scale-in] :opt-un [:portkey.aws.autoscaling.instance/launch-configuration-name :portkey.aws.autoscaling.instance/launch-template]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-namespace (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-increment clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/adjustment-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/adjustment-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancer-target-groups-result-type (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-auto-scaling-instances-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-auto-scaling-instances-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/instance-ids :portkey.aws.autoscaling/max-records :portkey.aws.autoscaling.describe-auto-scaling-instances-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.notification-configuration/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.notification-configuration/topic-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.notification-configuration/notification-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/notification-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.notification-configuration/auto-scaling-group-name :portkey.aws.autoscaling.notification-configuration/topic-arn :portkey.aws.autoscaling.notification-configuration/notification-type]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/suspended-processes (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/suspended-process))

(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancers-result-type (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.attach-load-balancer-target-groups-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancer-target-groups-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.attach-load-balancer-target-groups-type/auto-scaling-group-name :portkey.aws.autoscaling/target-group-ar-ns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/notification-metadata (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/default-result (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-action-result))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/notification-target-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/notification-target-resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.lifecycle-hook-specification/lifecycle-hook-name :portkey.aws.autoscaling/lifecycle-transition] :opt-un [:portkey.aws.autoscaling.lifecycle-hook-specification/notification-metadata :portkey.aws.autoscaling/heartbeat-timeout :portkey.aws.autoscaling.lifecycle-hook-specification/default-result :portkey.aws.autoscaling.lifecycle-hook-specification/notification-target-arn :portkey.aws.autoscaling.lifecycle-hook-specification/role-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-request/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-request/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.describe-load-balancers-request/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling.describe-load-balancers-request/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.detach-instances-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-instances-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.detach-instances-query/auto-scaling-group-name :portkey.aws.autoscaling/should-decrement-desired-capacity] :opt-un [:portkey.aws.autoscaling/instance-ids]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/placement-tenancy (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-64))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/kernel-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/image-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/instance-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/classic-link-vpc-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/key-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/ramdisk-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/user-data (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-user-data))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/iam-instance-profile (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.autoscaling/create-launch-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.create-launch-configuration-type/launch-configuration-name] :opt-un [:portkey.aws.autoscaling.create-launch-configuration-type/placement-tenancy :portkey.aws.autoscaling.create-launch-configuration-type/kernel-id :portkey.aws.autoscaling.create-launch-configuration-type/instance-id :portkey.aws.autoscaling/associate-public-ip-address :portkey.aws.autoscaling/instance-monitoring :portkey.aws.autoscaling.create-launch-configuration-type/image-id :portkey.aws.autoscaling/security-groups :portkey.aws.autoscaling/ebs-optimized :portkey.aws.autoscaling.create-launch-configuration-type/instance-type :portkey.aws.autoscaling.create-launch-configuration-type/classic-link-vpc-id :portkey.aws.autoscaling.create-launch-configuration-type/key-name :portkey.aws.autoscaling/spot-price :portkey.aws.autoscaling/classic-link-vpc-security-groups :portkey.aws.autoscaling/block-device-mappings :portkey.aws.autoscaling.create-launch-configuration-type/ramdisk-id :portkey.aws.autoscaling.create-launch-configuration-type/user-data :portkey.aws.autoscaling.create-launch-configuration-type/iam-instance-profile]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-desired-capacity clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255 :min-count 1))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-type #{:asg-average-network-out "ASGAverageCPUUtilization" "ASGAverageNetworkOut" :alb-request-count-per-target "ALBRequestCountPerTarget" "ASGAverageNetworkIn" :asg-average-network-in :asg-average-cpu-utilization})

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scaling-activities-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scaling-activities-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-scaling-activities-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/activity-ids :portkey.aws.autoscaling.describe-scaling-activities-type/auto-scaling-group-name :portkey.aws.autoscaling/max-records :portkey.aws.autoscaling.describe-scaling-activities-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/termination-policies (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-1600))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-notification-configurations-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-notification-configurations-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/auto-scaling-group-names :portkey.aws.autoscaling.describe-notification-configurations-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancers-result-type (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/processes (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/process-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling/process-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/put-lifecycle-hook-answer (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-collection-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/metric-collection-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-min-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/instances (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/instance))

(clojure.spec.alpha/def :portkey.aws.autoscaling/force-delete clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.batch-put-scheduled-update-group-action-answer/failed-scheduled-update-group-actions (clojure.spec.alpha/and :portkey.aws.autoscaling/failed-scheduled-update-group-action-requests))
(clojure.spec.alpha/def :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.batch-put-scheduled-update-group-action-answer/failed-scheduled-update-group-actions]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-granularity-type/granularity (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-granularity-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.metric-granularity-type/granularity]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-action-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 36 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-policies (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/scaling-policy))

(clojure.spec.alpha/def :portkey.aws.autoscaling.invalid-next-token/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/invalid-next-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.invalid-next-token/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-lifecycle-hook-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-lifecycle-hook-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-lifecycle-hook-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.delete-lifecycle-hook-type/lifecycle-hook-name :portkey.aws.autoscaling.delete-lifecycle-hook-type/auto-scaling-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/namespace (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/dimensions (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-dimensions))
(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/statistic (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-statistic))
(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/unit (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-unit))
(clojure.spec.alpha/def :portkey.aws.autoscaling/customized-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/metric-name :portkey.aws.autoscaling.customized-metric-specification/namespace :portkey.aws.autoscaling.customized-metric-specification/statistic] :opt-un [:portkey.aws.autoscaling.customized-metric-specification/dimensions :portkey.aws.autoscaling.customized-metric-specification/unit]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/health-check-grace-period clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-notification-configuration-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-notification-configuration-type/topic-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-notification-configuration-type/notification-types (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-notification-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-notification-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.put-notification-configuration-type/auto-scaling-group-name :portkey.aws.autoscaling.put-notification-configuration-type/topic-arn :portkey.aws.autoscaling.put-notification-configuration-type/notification-types] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.complete-lifecycle-action-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.complete-lifecycle-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.complete-lifecycle-action-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling/complete-lifecycle-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.complete-lifecycle-action-type/lifecycle-hook-name :portkey.aws.autoscaling.complete-lifecycle-action-type/auto-scaling-group-name :portkey.aws.autoscaling/lifecycle-action-result] :opt-un [:portkey.aws.autoscaling/lifecycle-action-token :portkey.aws.autoscaling.complete-lifecycle-action-type/instance-id]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/on-demand-base-capacity clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-auto-scaling-notification-types-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/auto-scaling-notification-types]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metrics (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-32 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.core/defn update-auto-scaling-group "Updates the configuration for the specified Auto Scaling group.\n The new settings take effect on any scaling activities after this call returns.\nScaling activities that are currently in progress aren't affected.\n To update an Auto Scaling group with a launch configuration with\nInstanceMonitoring set to false, you must first disable the collection of group\nmetrics. Otherwise, you get an error. If you have previously enabled the\ncollection of group metrics, you can disable it using DisableMetricsCollection.\n Note the following:\n * If you specify a new value for MinSize without specifying a value for\nDesiredCapacity, and the new MinSize is larger than the current size of the\ngroup, we implicitly call SetDesiredCapacity to set the size of the group to the\nnew value of MinSize.\n * If you specify a new value for MaxSize without specifying a value for\nDesiredCapacity, and the new MaxSize is smaller than the current size of the\ngroup, we implicitly call SetDesiredCapacity to set the size of the group to the\nnew value of MaxSize.\n * All other optional parameters are left unchanged if not specified." ([update-auto-scaling-group-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-auto-scaling-group-type update-auto-scaling-group-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/update-auto-scaling-group-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAutoScalingGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef update-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/update-auto-scaling-group-type) :ret clojure.core/true?)

(clojure.core/defn describe-scaling-activities "Describes one or more scaling activities for the specified Auto Scaling group." ([] (describe-scaling-activities {})) ([describe-scaling-activities-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-scaling-activities-type describe-scaling-activities-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/activities-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-scaling-activities-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeScalingActivitiesResult", :http.request.configuration/action "DescribeScalingActivities", :http.request.configuration/output-deser-fn response-activities-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-scaling-activities :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-scaling-activities-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/activities-type))

(clojure.core/defn describe-lifecycle-hook-types "Describes the available types of lifecycle hooks.\n The following hook types are supported:\n * autoscaling:EC2_INSTANCE_LAUNCHING\n * autoscaling:EC2_INSTANCE_TERMINATING" ([] (describe-lifecycle-hook-types {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-lifecycle-hook-types-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLifecycleHookTypesResult", :http.request.configuration/action "DescribeLifecycleHookTypes", :http.request.configuration/output-deser-fn response-describe-lifecycle-hook-types-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-lifecycle-hook-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-lifecycle-hook-types-answer))

(clojure.core/defn describe-account-limits "Describes the current Auto Scaling resource limits for your AWS account.\n For information about requesting an increase in these limits, see Amazon EC2\nAuto Scaling Limits\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html) in\nthe Amazon EC2 Auto Scaling User Guide." ([] (describe-account-limits {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-account-limits-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAccountLimitsResult", :http.request.configuration/action "DescribeAccountLimits", :http.request.configuration/output-deser-fn response-describe-account-limits-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-account-limits :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-account-limits-answer))

(clojure.core/defn describe-auto-scaling-groups "Describes one or more Auto Scaling groups." ([] (describe-auto-scaling-groups {})) ([auto-scaling-group-names-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-auto-scaling-group-names-type auto-scaling-group-names-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/auto-scaling-groups-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/auto-scaling-group-names-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAutoScalingGroupsResult", :http.request.configuration/action "DescribeAutoScalingGroups", :http.request.configuration/output-deser-fn response-auto-scaling-groups-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-auto-scaling-groups :args (clojure.spec.alpha/? :portkey.aws.autoscaling/auto-scaling-group-names-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-groups-type))

(clojure.core/defn attach-load-balancer-target-groups "Attaches one or more target groups to the specified Auto Scaling group.\n To describe the target groups for an Auto Scaling group, use\nDescribeLoadBalancerTargetGroups. To detach the target group from the Auto\nScaling group, use DetachLoadBalancerTargetGroups.\n With Application Load Balancers and Network Load Balancers, instances are\nregistered as targets with a target group. With Classic Load Balancers,\ninstances are registered with the load balancer. For more information, see\nAttaching a Load Balancer to Your Auto Scaling Group\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-load-balancer-asg.html)\nin the Amazon EC2 Auto Scaling User Guide." ([attach-load-balancer-target-groups-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-attach-load-balancer-target-groups-type attach-load-balancer-target-groups-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/attach-load-balancer-target-groups-result-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/attach-load-balancer-target-groups-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AttachLoadBalancerTargetGroupsResult", :http.request.configuration/action "AttachLoadBalancerTargetGroups", :http.request.configuration/output-deser-fn response-attach-load-balancer-target-groups-result-type, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef attach-load-balancer-target-groups :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/attach-load-balancer-target-groups-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/attach-load-balancer-target-groups-result-type))

(clojure.core/defn describe-launch-configurations "Describes one or more launch configurations." ([] (describe-launch-configurations {})) ([launch-configuration-names-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-launch-configuration-names-type launch-configuration-names-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/launch-configurations-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/launch-configuration-names-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLaunchConfigurationsResult", :http.request.configuration/action "DescribeLaunchConfigurations", :http.request.configuration/output-deser-fn response-launch-configurations-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-launch-configurations :args (clojure.spec.alpha/? :portkey.aws.autoscaling/launch-configuration-names-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-configurations-type))

(clojure.core/defn describe-termination-policy-types "Describes the termination policies supported by Amazon EC2 Auto Scaling.\n For more information, see Controlling Which Auto Scaling Instances Terminate\nDuring Scale In\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html)\nin the Amazon EC2 Auto Scaling User Guide." ([] (describe-termination-policy-types {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-termination-policy-types-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeTerminationPolicyTypesResult", :http.request.configuration/action "DescribeTerminationPolicyTypes", :http.request.configuration/output-deser-fn response-describe-termination-policy-types-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-termination-policy-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-termination-policy-types-answer))

(clojure.core/defn describe-adjustment-types "Describes the policy adjustment types for use with PutScalingPolicy." ([] (describe-adjustment-types {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-adjustment-types-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAdjustmentTypesResult", :http.request.configuration/action "DescribeAdjustmentTypes", :http.request.configuration/output-deser-fn response-describe-adjustment-types-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-adjustment-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-adjustment-types-answer))

(clojure.core/defn describe-policies "Describes the policies for the specified Auto Scaling group." ([] (describe-policies {})) ([describe-policies-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-policies-type describe-policies-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/policies-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-policies-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribePoliciesResult", :http.request.configuration/action "DescribePolicies", :http.request.configuration/output-deser-fn response-policies-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef describe-policies :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-policies-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/policies-type))

(clojure.core/defn set-instance-protection "Updates the instance protection settings of the specified instances.\n For more information about preventing instances that are part of an Auto\nScaling group from terminating on scale in, see Instance Protection\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-termination.html#instance-protection)\nin the Amazon EC2 Auto Scaling User Guide." ([set-instance-protection-queryinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-instance-protection-query set-instance-protection-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/set-instance-protection-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/set-instance-protection-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetInstanceProtectionResult", :http.request.configuration/action "SetInstanceProtection", :http.request.configuration/output-deser-fn response-set-instance-protection-answer, :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef set-instance-protection :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/set-instance-protection-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/set-instance-protection-answer))

(clojure.core/defn resume-processes "Resumes the specified suspended automatic scaling processes, or all suspended\nprocess, for the specified Auto Scaling group.\n For more information, see Suspending and Resuming Scaling Processes\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html)\nin the Amazon EC2 Auto Scaling User Guide." ([scaling-process-queryinput] (clojure.core/let [request-function-result__22119__auto__ (req-scaling-process-query scaling-process-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/scaling-process-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResumeProcesses", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef resume-processes :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/scaling-process-query) :ret clojure.core/true?)

(clojure.core/defn detach-instances "Removes one or more instances from the specified Auto Scaling group.\n After the instances are detached, you can manage them independent of the Auto\nScaling group.\n If you do not specify the option to decrement the desired capacity, Amazon EC2\nAuto Scaling launches instances to replace the ones that are detached.\n If there is a Classic Load Balancer attached to the Auto Scaling group, the\ninstances are deregistered from the load balancer. If there are target groups\nattached to the Auto Scaling group, the instances are deregistered from the\ntarget groups.\n For more information, see Detach EC2 Instances from Your Auto Scaling Group\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/detach-instance-asg.html)\nin the Amazon EC2 Auto Scaling User Guide." ([detach-instances-queryinput] (clojure.core/let [request-function-result__22119__auto__ (req-detach-instances-query detach-instances-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/detach-instances-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/detach-instances-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetachInstancesResult", :http.request.configuration/action "DetachInstances", :http.request.configuration/output-deser-fn response-detach-instances-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef detach-instances :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/detach-instances-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/detach-instances-answer))

(clojure.core/defn attach-instances "Attaches one or more EC2 instances to the specified Auto Scaling group.\n When you attach instances, Amazon EC2 Auto Scaling increases the desired\ncapacity of the group by the number of instances being attached. If the number\nof instances being attached plus the desired capacity of the group exceeds the\nmaximum size of the group, the operation fails.\n If there is a Classic Load Balancer attached to your Auto Scaling group, the\ninstances are also registered with the load balancer. If there are target groups\nattached to your Auto Scaling group, the instances are also registered with the\ntarget groups.\n For more information, see Attach EC2 Instances to Your Auto Scaling Group\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-instance-asg.html)\nin the Amazon EC2 Auto Scaling User Guide." ([attach-instances-queryinput] (clojure.core/let [request-function-result__22119__auto__ (req-attach-instances-query attach-instances-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/attach-instances-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachInstances", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef attach-instances :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/attach-instances-query) :ret clojure.core/true?)

(clojure.core/defn delete-tags "Deletes the specified tags." ([delete-tags-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-tags-type delete-tags-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-tags-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-tags-type) :ret clojure.core/true?)

(clojure.core/defn record-lifecycle-action-heartbeat "Records a heartbeat for the lifecycle action associated with the specified token\nor instance. This extends the timeout by the length of time defined using\nPutLifecycleHook.\n This step is a part of the procedure for adding a lifecycle hook to an Auto\nScaling group:\n * (Optional) Create a Lambda function and a rule that allows CloudWatch Events\nto invoke your Lambda function when Amazon EC2 Auto Scaling launches or\nterminates instances.\n * (Optional) Create a notification target and an IAM role. The target can be\neither an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2\nAuto Scaling to publish lifecycle notifications to the target.\n * Create the lifecycle hook. Specify whether the hook is used when the\ninstances launch or terminate.\n * If you need more time, record the lifecycle action heartbeat to keep the\ninstance in a pending state.\n * If you finish before the timeout period ends, complete the lifecycle action.\n For more information, see Auto Scaling Lifecycle\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html)\nin the Amazon EC2 Auto Scaling User Guide." ([record-lifecycle-action-heartbeat-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-record-lifecycle-action-heartbeat-type record-lifecycle-action-heartbeat-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "RecordLifecycleActionHeartbeatResult", :http.request.configuration/action "RecordLifecycleActionHeartbeat", :http.request.configuration/output-deser-fn response-record-lifecycle-action-heartbeat-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef record-lifecycle-action-heartbeat :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-answer))

(clojure.core/defn batch-put-scheduled-update-group-action "Creates or updates one or more scheduled scaling actions for an Auto Scaling\ngroup. If you leave a parameter unspecified when updating a scheduled scaling\naction, the corresponding value remains unchanged." ([batch-put-scheduled-update-group-action-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-put-scheduled-update-group-action-type batch-put-scheduled-update-group-action-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "BatchPutScheduledUpdateGroupActionResult", :http.request.configuration/action "BatchPutScheduledUpdateGroupAction", :http.request.configuration/output-deser-fn response-batch-put-scheduled-update-group-action-answer, :http.request.spec/error-spec {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef batch-put-scheduled-update-group-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-answer))

(clojure.core/defn create-auto-scaling-group "Creates an Auto Scaling group with the specified name and attributes.\n If you exceed your maximum limit of Auto Scaling groups, the call fails. For\ninformation about viewing this limit, see DescribeAccountLimits. For information\nabout updating this limit, see Amazon EC2 Auto Scaling Limits\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html) in\nthe Amazon EC2 Auto Scaling User Guide.\n For more information, see Auto Scaling Groups\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroup.html) in\nthe Amazon EC2 Auto Scaling User Guide." ([create-auto-scaling-group-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-auto-scaling-group-type create-auto-scaling-group-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/create-auto-scaling-group-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAutoScalingGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef create-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/create-auto-scaling-group-type) :ret clojure.core/true?)

(clojure.core/defn terminate-instance-in-auto-scaling-group "Terminates the specified instance and optionally adjusts the desired group size.\n This call simply makes a termination request. The instance is not terminated\nimmediately." ([terminate-instance-in-auto-scaling-group-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-terminate-instance-in-auto-scaling-group-type terminate-instance-in-auto-scaling-group-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/activity-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/terminate-instance-in-auto-scaling-group-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "TerminateInstanceInAutoScalingGroupResult", :http.request.configuration/action "TerminateInstanceInAutoScalingGroup", :http.request.configuration/output-deser-fn response-activity-type, :http.request.spec/error-spec {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef terminate-instance-in-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/terminate-instance-in-auto-scaling-group-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/activity-type))

(clojure.core/defn describe-notification-configurations "Describes the notification actions associated with the specified Auto Scaling\ngroup." ([] (describe-notification-configurations {})) ([describe-notification-configurations-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-notification-configurations-type describe-notification-configurations-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-notification-configurations-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-notification-configurations-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeNotificationConfigurationsResult", :http.request.configuration/action "DescribeNotificationConfigurations", :http.request.configuration/output-deser-fn response-describe-notification-configurations-answer, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-notification-configurations :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-notification-configurations-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-notification-configurations-answer))

(clojure.core/defn attach-load-balancers "Attaches one or more Classic Load Balancers to the specified Auto Scaling group.\n To attach an Application Load Balancer or a Network Load Balancer instead, see\nAttachLoadBalancerTargetGroups.\n To describe the load balancers for an Auto Scaling group, use\nDescribeLoadBalancers. To detach the load balancer from the Auto Scaling group,\nuse DetachLoadBalancers.\n For more information, see Attaching a Load Balancer to Your Auto Scaling Group\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/attach-load-balancer-asg.html)\nin the Amazon EC2 Auto Scaling User Guide." ([attach-load-balancers-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-attach-load-balancers-type attach-load-balancers-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/attach-load-balancers-result-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/attach-load-balancers-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AttachLoadBalancersResult", :http.request.configuration/action "AttachLoadBalancers", :http.request.configuration/output-deser-fn response-attach-load-balancers-result-type, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef attach-load-balancers :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/attach-load-balancers-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/attach-load-balancers-result-type))

(clojure.core/defn set-instance-health "Sets the health status of the specified instance.\n For more information, see Health Checks\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html) in the\nAmazon EC2 Auto Scaling User Guide." ([set-instance-health-queryinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-instance-health-query set-instance-health-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/set-instance-health-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetInstanceHealth", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef set-instance-health :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/set-instance-health-query) :ret clojure.core/true?)

(clojure.core/defn create-or-update-tags "Creates or updates tags for the specified Auto Scaling group.\n When you specify a tag with a key that already exists, the operation overwrites\nthe previous tag definition, and you do not get an error message.\n For more information, see Tagging Auto Scaling Groups and Instances\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-tagging.html)\nin the Amazon EC2 Auto Scaling User Guide." ([create-or-update-tags-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-or-update-tags-type create-or-update-tags-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/create-or-update-tags-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateOrUpdateTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault}})))))
(clojure.spec.alpha/fdef create-or-update-tags :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/create-or-update-tags-type) :ret clojure.core/true?)

(clojure.core/defn execute-policy "Executes the specified policy." ([execute-policy-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-execute-policy-type execute-policy-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/execute-policy-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ExecutePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef execute-policy :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/execute-policy-type) :ret clojure.core/true?)

(clojure.core/defn disable-metrics-collection "Disables group metrics for the specified Auto Scaling group." ([disable-metrics-collection-queryinput] (clojure.core/let [request-function-result__22119__auto__ (req-disable-metrics-collection-query disable-metrics-collection-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/disable-metrics-collection-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableMetricsCollection", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef disable-metrics-collection :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/disable-metrics-collection-query) :ret clojure.core/true?)

(clojure.core/defn describe-scaling-process-types "Describes the scaling process types for use with ResumeProcesses and\nSuspendProcesses." ([] (describe-scaling-process-types {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/processes-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeScalingProcessTypesResult", :http.request.configuration/action "DescribeScalingProcessTypes", :http.request.configuration/output-deser-fn response-processes-type, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-scaling-process-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/processes-type))

(clojure.core/defn delete-lifecycle-hook "Deletes the specified lifecycle hook.\n If there are any outstanding lifecycle actions, they are completed first\n(ABANDON for launching instances, CONTINUE for terminating instances)." ([delete-lifecycle-hook-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-lifecycle-hook-type delete-lifecycle-hook-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/delete-lifecycle-hook-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-lifecycle-hook-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteLifecycleHookResult", :http.request.configuration/action "DeleteLifecycleHook", :http.request.configuration/output-deser-fn response-delete-lifecycle-hook-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef delete-lifecycle-hook :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-lifecycle-hook-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/delete-lifecycle-hook-answer))

(clojure.core/defn describe-tags "Describes the specified tags.\n You can use filters to limit the results. For example, you can query for the\ntags for a specific Auto Scaling group. You can specify multiple values for a\nfilter. A tag must match at least one of the specified values for it to be\nincluded in the results.\n You can also specify multiple filters. The result includes information for a\nparticular tag only if it matches all the filters. If there's no match, no\nspecial message is returned." ([] (describe-tags {})) ([describe-tags-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-tags-type describe-tags-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/tags-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-tags-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeTagsResult", :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-tags-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-tags-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/tags-type))

(clojure.core/defn describe-scheduled-actions "Describes the actions scheduled for your Auto Scaling group that haven't run. To\ndescribe the actions that have already run, use DescribeScalingActivities." ([] (describe-scheduled-actions {})) ([describe-scheduled-actions-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-scheduled-actions-type describe-scheduled-actions-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/scheduled-actions-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-scheduled-actions-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeScheduledActionsResult", :http.request.configuration/action "DescribeScheduledActions", :http.request.configuration/output-deser-fn response-scheduled-actions-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-scheduled-actions :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-scheduled-actions-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/scheduled-actions-type))

(clojure.core/defn set-desired-capacity "Sets the size of the specified Auto Scaling group.\n For more information about desired capacity, see What Is Amazon EC2 Auto\nScaling?\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/what-is-amazon-ec2-auto-scaling.html)\nin the Amazon EC2 Auto Scaling User Guide." ([set-desired-capacity-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-desired-capacity-type set-desired-capacity-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/set-desired-capacity-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetDesiredCapacity", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef set-desired-capacity :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/set-desired-capacity-type) :ret clojure.core/true?)

(clojure.core/defn enable-metrics-collection "Enables group metrics for the specified Auto Scaling group. For more\ninformation, see Monitoring Your Auto Scaling Groups and Instances\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-instance-monitoring.html)\nin the Amazon EC2 Auto Scaling User Guide." ([enable-metrics-collection-queryinput] (clojure.core/let [request-function-result__22119__auto__ (req-enable-metrics-collection-query enable-metrics-collection-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/enable-metrics-collection-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableMetricsCollection", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef enable-metrics-collection :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/enable-metrics-collection-query) :ret clojure.core/true?)

(clojure.core/defn suspend-processes "Suspends the specified automatic scaling processes, or all processes, for the\nspecified Auto Scaling group.\n If you suspend either the Launch or Terminate process types, it can prevent\nother process types from functioning properly.\n To resume processes that have been suspended, use ResumeProcesses.\n For more information, see Suspending and Resuming Scaling Processes\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-suspend-resume-processes.html)\nin the Amazon EC2 Auto Scaling User Guide." ([scaling-process-queryinput] (clojure.core/let [request-function-result__22119__auto__ (req-scaling-process-query scaling-process-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/scaling-process-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SuspendProcesses", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef suspend-processes :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/scaling-process-query) :ret clojure.core/true?)

(clojure.core/defn detach-load-balancer-target-groups "Detaches one or more target groups from the specified Auto Scaling group." ([detach-load-balancer-target-groups-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-detach-load-balancer-target-groups-type detach-load-balancer-target-groups-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/detach-load-balancer-target-groups-result-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/detach-load-balancer-target-groups-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetachLoadBalancerTargetGroupsResult", :http.request.configuration/action "DetachLoadBalancerTargetGroups", :http.request.configuration/output-deser-fn response-detach-load-balancer-target-groups-result-type, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef detach-load-balancer-target-groups :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/detach-load-balancer-target-groups-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/detach-load-balancer-target-groups-result-type))

(clojure.core/defn detach-load-balancers "Detaches one or more Classic Load Balancers from the specified Auto Scaling\ngroup.\n This operation detaches only Classic Load Balancers. If you have Application\nLoad Balancers or Network Load Balancers, use DetachLoadBalancerTargetGroups\ninstead.\n When you detach a load balancer, it enters the Removing state while\nderegistering the instances in the group. When all instances are deregistered,\nthen you can no longer describe the load balancer using DescribeLoadBalancers.\nThe instances remain running." ([detach-load-balancers-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-detach-load-balancers-type detach-load-balancers-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/detach-load-balancers-result-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/detach-load-balancers-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetachLoadBalancersResult", :http.request.configuration/action "DetachLoadBalancers", :http.request.configuration/output-deser-fn response-detach-load-balancers-result-type, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef detach-load-balancers :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/detach-load-balancers-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/detach-load-balancers-result-type))

(clojure.core/defn describe-lifecycle-hooks "Describes the lifecycle hooks for the specified Auto Scaling group." ([describe-lifecycle-hooks-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-lifecycle-hooks-type describe-lifecycle-hooks-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-lifecycle-hooks-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-lifecycle-hooks-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLifecycleHooksResult", :http.request.configuration/action "DescribeLifecycleHooks", :http.request.configuration/output-deser-fn response-describe-lifecycle-hooks-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-lifecycle-hooks :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/describe-lifecycle-hooks-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-lifecycle-hooks-answer))

(clojure.core/defn enter-standby "Moves the specified instances into the standby state.\n For more information, see Temporarily Removing Instances from Your Auto Scaling\nGroup\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html)\nin the Amazon EC2 Auto Scaling User Guide." ([enter-standby-queryinput] (clojure.core/let [request-function-result__22119__auto__ (req-enter-standby-query enter-standby-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/enter-standby-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/enter-standby-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "EnterStandbyResult", :http.request.configuration/action "EnterStandby", :http.request.configuration/output-deser-fn response-enter-standby-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef enter-standby :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/enter-standby-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/enter-standby-answer))

(clojure.core/defn describe-load-balancer-target-groups "Describes the target groups for the specified Auto Scaling group." ([describe-load-balancer-target-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-load-balancer-target-groups-request describe-load-balancer-target-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-load-balancer-target-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-load-balancer-target-groups-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLoadBalancerTargetGroupsResult", :http.request.configuration/action "DescribeLoadBalancerTargetGroups", :http.request.configuration/output-deser-fn response-describe-load-balancer-target-groups-response, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-load-balancer-target-groups :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/describe-load-balancer-target-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-load-balancer-target-groups-response))

(clojure.core/defn describe-auto-scaling-notification-types "Describes the notification types that are supported by Amazon EC2 Auto Scaling." ([] (describe-auto-scaling-notification-types {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-auto-scaling-notification-types-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAutoScalingNotificationTypesResult", :http.request.configuration/action "DescribeAutoScalingNotificationTypes", :http.request.configuration/output-deser-fn response-describe-auto-scaling-notification-types-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-auto-scaling-notification-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-auto-scaling-notification-types-answer))

(clojure.core/defn batch-delete-scheduled-action "Deletes one or more scheduled actions for the specified Auto Scaling group." ([batch-delete-scheduled-action-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-delete-scheduled-action-type batch-delete-scheduled-action-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/batch-delete-scheduled-action-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/batch-delete-scheduled-action-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "BatchDeleteScheduledActionResult", :http.request.configuration/action "BatchDeleteScheduledAction", :http.request.configuration/output-deser-fn response-batch-delete-scheduled-action-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef batch-delete-scheduled-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/batch-delete-scheduled-action-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/batch-delete-scheduled-action-answer))

(clojure.core/defn delete-notification-configuration "Deletes the specified notification." ([delete-notification-configuration-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-notification-configuration-type delete-notification-configuration-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-notification-configuration-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteNotificationConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef delete-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-notification-configuration-type) :ret clojure.core/true?)

(clojure.core/defn exit-standby "Moves the specified instances out of the standby state.\n For more information, see Temporarily Removing Instances from Your Auto Scaling\nGroup\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enter-exit-standby.html)\nin the Amazon EC2 Auto Scaling User Guide." ([exit-standby-queryinput] (clojure.core/let [request-function-result__22119__auto__ (req-exit-standby-query exit-standby-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/exit-standby-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/exit-standby-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ExitStandbyResult", :http.request.configuration/action "ExitStandby", :http.request.configuration/output-deser-fn response-exit-standby-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef exit-standby :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/exit-standby-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/exit-standby-answer))

(clojure.core/defn delete-launch-configuration "Deletes the specified launch configuration.\n The launch configuration must not be attached to an Auto Scaling group. When\nthis call completes, the launch configuration is no longer available for use." ([launch-configuration-name-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-launch-configuration-name-type launch-configuration-name-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/launch-configuration-name-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLaunchConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef delete-launch-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/launch-configuration-name-type) :ret clojure.core/true?)

(clojure.core/defn create-launch-configuration "Creates a launch configuration.\n If you exceed your maximum limit of launch configurations, the call fails. For\ninformation about viewing this limit, see DescribeAccountLimits. For information\nabout updating this limit, see Amazon EC2 Auto Scaling Limits\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-account-limits.html) in\nthe Amazon EC2 Auto Scaling User Guide.\n For more information, see Launch Configurations\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/LaunchConfiguration.html)\nin the Amazon EC2 Auto Scaling User Guide." ([create-launch-configuration-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-launch-configuration-type create-launch-configuration-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/create-launch-configuration-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLaunchConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef create-launch-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/create-launch-configuration-type) :ret clojure.core/true?)

(clojure.core/defn delete-auto-scaling-group "Deletes the specified Auto Scaling group.\n If the group has instances or scaling activities in progress, you must specify\nthe option to force the deletion in order for it to succeed.\n If the group has policies, deleting the group deletes the policies, the\nunderlying alarm actions, and any alarm that no longer has an associated action.\n To remove instances from the Auto Scaling group before deleting it, call\nDetachInstances with the list of instances and the option to decrement the\ndesired capacity. This ensures that Amazon EC2 Auto Scaling does not launch\nreplacement instances.\n To terminate all instances before deleting the Auto Scaling group, call\nUpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto\nScaling group to zero." ([delete-auto-scaling-group-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-auto-scaling-group-type delete-auto-scaling-group-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-auto-scaling-group-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAutoScalingGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef delete-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-auto-scaling-group-type) :ret clojure.core/true?)

(clojure.core/defn describe-metric-collection-types "Describes the available CloudWatch metrics for Amazon EC2 Auto Scaling.\n The GroupStandbyInstances metric is not returned by default. You must\nexplicitly request this metric when calling EnableMetricsCollection." ([] (describe-metric-collection-types {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-metric-collection-types-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeMetricCollectionTypesResult", :http.request.configuration/action "DescribeMetricCollectionTypes", :http.request.configuration/output-deser-fn response-describe-metric-collection-types-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-metric-collection-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-metric-collection-types-answer))

(clojure.core/defn describe-auto-scaling-instances "Describes one or more Auto Scaling instances." ([] (describe-auto-scaling-instances {})) ([describe-auto-scaling-instances-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-auto-scaling-instances-type describe-auto-scaling-instances-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/auto-scaling-instances-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-auto-scaling-instances-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAutoScalingInstancesResult", :http.request.configuration/action "DescribeAutoScalingInstances", :http.request.configuration/output-deser-fn response-auto-scaling-instances-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-auto-scaling-instances :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-auto-scaling-instances-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-instances-type))

(clojure.core/defn put-notification-configuration "Configures an Auto Scaling group to send notifications when specified events\ntake place. Subscribers to the specified topic can have messages delivered to an\nendpoint such as a web server or an email address.\n This configuration overwrites any existing configuration.\n For more information, see Getting Amazon SNS Notifications When Your Auto\nScaling Group Scales\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/ASGettingNotifications.html)\nin the Amazon EC2 Auto Scaling User Guide." ([put-notification-configuration-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-notification-configuration-type put-notification-configuration-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/put-notification-configuration-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutNotificationConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef put-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-notification-configuration-type) :ret clojure.core/true?)

(clojure.core/defn delete-scheduled-action "Deletes the specified scheduled action." ([delete-scheduled-action-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-scheduled-action-type delete-scheduled-action-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-scheduled-action-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteScheduledAction", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef delete-scheduled-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-scheduled-action-type) :ret clojure.core/true?)

(clojure.core/defn complete-lifecycle-action "Completes the lifecycle action for the specified token or instance with the\nspecified result.\n This step is a part of the procedure for adding a lifecycle hook to an Auto\nScaling group:\n * (Optional) Create a Lambda function and a rule that allows CloudWatch Events\nto invoke your Lambda function when Amazon EC2 Auto Scaling launches or\nterminates instances.\n * (Optional) Create a notification target and an IAM role. The target can be\neither an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2\nAuto Scaling to publish lifecycle notifications to the target.\n * Create the lifecycle hook. Specify whether the hook is used when the\ninstances launch or terminate.\n * If you need more time, record the lifecycle action heartbeat to keep the\ninstance in a pending state.\n * If you finish before the timeout period ends, complete the lifecycle action.\n For more information, see Auto Scaling Lifecycle\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/AutoScalingGroupLifecycle.html)\nin the Amazon EC2 Auto Scaling User Guide." ([complete-lifecycle-action-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-complete-lifecycle-action-type complete-lifecycle-action-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/complete-lifecycle-action-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/complete-lifecycle-action-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CompleteLifecycleActionResult", :http.request.configuration/action "CompleteLifecycleAction", :http.request.configuration/output-deser-fn response-complete-lifecycle-action-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef complete-lifecycle-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/complete-lifecycle-action-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/complete-lifecycle-action-answer))

(clojure.core/defn put-scaling-policy "Creates or updates a policy for an Auto Scaling group. To update an existing\npolicy, use the existing policy name and set the parameters to change. Any\nexisting parameter not changed in an update to an existing policy is not changed\nin this update request." ([put-scaling-policy-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-scaling-policy-type put-scaling-policy-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/policy-arn-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/put-scaling-policy-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "PutScalingPolicyResult", :http.request.configuration/action "PutScalingPolicy", :http.request.configuration/output-deser-fn response-policy-arn-type, :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef put-scaling-policy :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-scaling-policy-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-arn-type))

(clojure.core/defn delete-policy "Deletes the specified Auto Scaling policy.\n Deleting a policy deletes the underlying alarm action, but does not delete the\nalarm, even if it no longer has an associated action." ([delete-policy-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-policy-type delete-policy-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-policy-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-policy-type) :ret clojure.core/true?)

(clojure.core/defn describe-load-balancers "Describes the load balancers for the specified Auto Scaling group.\n This operation describes only Classic Load Balancers. If you have Application\nLoad Balancers or Network Load Balancers, use DescribeLoadBalancerTargetGroups\ninstead." ([describe-load-balancers-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-load-balancers-request describe-load-balancers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-load-balancers-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-load-balancers-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLoadBalancersResult", :http.request.configuration/action "DescribeLoadBalancers", :http.request.configuration/output-deser-fn response-describe-load-balancers-response, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-load-balancers :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/describe-load-balancers-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-load-balancers-response))

(clojure.core/defn put-scheduled-update-group-action "Creates or updates a scheduled scaling action for an Auto Scaling group. If you\nleave a parameter unspecified when updating a scheduled scaling action, the\ncorresponding value remains unchanged.\n For more information, see Scheduled Scaling\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/schedule_time.html) in the\nAmazon EC2 Auto Scaling User Guide." ([put-scheduled-update-group-action-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-scheduled-update-group-action-type put-scheduled-update-group-action-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/put-scheduled-update-group-action-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutScheduledUpdateGroupAction", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef put-scheduled-update-group-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-scheduled-update-group-action-type) :ret clojure.core/true?)

(clojure.core/defn put-lifecycle-hook "Creates or updates a lifecycle hook for the specified Auto Scaling group.\n A lifecycle hook tells Amazon EC2 Auto Scaling to perform an action on an\ninstance that is not actively in service; for example, either when the instance\nlaunches or before the instance terminates.\n This step is a part of the procedure for adding a lifecycle hook to an Auto\nScaling group:\n * (Optional) Create a Lambda function and a rule that allows CloudWatch Events\nto invoke your Lambda function when Amazon EC2 Auto Scaling launches or\nterminates instances.\n * (Optional) Create a notification target and an IAM role. The target can be\neither an Amazon SQS queue or an Amazon SNS topic. The role allows Amazon EC2\nAuto Scaling to publish lifecycle notifications to the target.\n * Create the lifecycle hook. Specify whether the hook is used when the\ninstances launch or terminate.\n * If you need more time, record the lifecycle action heartbeat to keep the\ninstance in a pending state.\n * If you finish before the timeout period ends, complete the lifecycle action.\n For more information, see Amazon EC2 Auto Scaling Lifecycle Hooks\n(http://docs.aws.amazon.com/autoscaling/ec2/userguide/lifecycle-hooks.html) in\nthe Amazon EC2 Auto Scaling User Guide.\n If you exceed your maximum limit of lifecycle hooks, which by default is 50 per\nAuto Scaling group, the call fails." ([put-lifecycle-hook-typeinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-lifecycle-hook-type put-lifecycle-hook-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/put-lifecycle-hook-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/put-lifecycle-hook-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "PutLifecycleHookResult", :http.request.configuration/action "PutLifecycleHook", :http.request.configuration/output-deser-fn response-put-lifecycle-hook-answer, :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef put-lifecycle-hook :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-lifecycle-hook-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/put-lifecycle-hook-answer))
