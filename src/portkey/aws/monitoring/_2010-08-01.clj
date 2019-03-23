(ns portkey.aws.monitoring.-2010-08-01 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "monitoring", :region "us-gov-east-1"},
    :ssl-common-name "monitoring.us-gov-east-1.amazonaws.com",
    :endpoint "https://monitoring.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "monitoring", :region "ap-northeast-1"},
    :ssl-common-name "monitoring.ap-northeast-1.amazonaws.com",
    :endpoint "https://monitoring.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "monitoring", :region "eu-west-1"},
    :ssl-common-name "monitoring.eu-west-1.amazonaws.com",
    :endpoint "https://monitoring.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "monitoring", :region "us-east-2"},
    :ssl-common-name "monitoring.us-east-2.amazonaws.com",
    :endpoint "https://monitoring.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "monitoring", :region "ap-southeast-2"},
    :ssl-common-name "monitoring.ap-southeast-2.amazonaws.com",
    :endpoint "https://monitoring.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "monitoring", :region "cn-north-1"},
    :ssl-common-name "monitoring.cn-north-1.amazonaws.com.cn",
    :endpoint "https://monitoring.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "monitoring", :region "sa-east-1"},
    :ssl-common-name "monitoring.sa-east-1.amazonaws.com",
    :endpoint "https://monitoring.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "monitoring", :region "ap-southeast-1"},
    :ssl-common-name "monitoring.ap-southeast-1.amazonaws.com",
    :endpoint "https://monitoring.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "monitoring", :region "cn-northwest-1"},
    :ssl-common-name "monitoring.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://monitoring.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "monitoring", :region "ap-northeast-2"},
    :ssl-common-name "monitoring.ap-northeast-2.amazonaws.com",
    :endpoint "https://monitoring.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "monitoring", :region "eu-west-3"},
    :ssl-common-name "monitoring.eu-west-3.amazonaws.com",
    :endpoint "https://monitoring.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "monitoring", :region "ca-central-1"},
    :ssl-common-name "monitoring.ca-central-1.amazonaws.com",
    :endpoint "https://monitoring.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "monitoring", :region "eu-central-1"},
    :ssl-common-name "monitoring.eu-central-1.amazonaws.com",
    :endpoint "https://monitoring.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "monitoring", :region "eu-west-2"},
    :ssl-common-name "monitoring.eu-west-2.amazonaws.com",
    :endpoint "https://monitoring.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "monitoring", :region "us-gov-west-1"},
    :ssl-common-name "monitoring.us-gov-west-1.amazonaws.com",
    :endpoint "https://monitoring.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "monitoring", :region "us-west-2"},
    :ssl-common-name "monitoring.us-west-2.amazonaws.com",
    :endpoint "https://monitoring.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "monitoring", :region "us-east-1"},
    :ssl-common-name "monitoring.us-east-1.amazonaws.com",
    :endpoint "https://monitoring.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "monitoring", :region "us-west-1"},
    :ssl-common-name "monitoring.us-west-1.amazonaws.com",
    :endpoint "https://monitoring.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "monitoring", :region "ap-south-1"},
    :ssl-common-name "monitoring.ap-south-1.amazonaws.com",
    :endpoint "https://monitoring.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "monitoring", :region "eu-north-1"},
    :ssl-common-name "monitoring.eu-north-1.amazonaws.com",
    :endpoint "https://monitoring.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-standard-unit)

(clojure.core/declare ser-storage-resolution)

(clojure.core/declare ser-dimension-name)

(clojure.core/declare ser-treat-missing-data)

(clojure.core/declare ser-history-item-type)

(clojure.core/declare ser-period)

(clojure.core/declare ser-threshold)

(clojure.core/declare ser-counts)

(clojure.core/declare ser-dimension-value)

(clojure.core/declare ser-dimension-filters)

(clojure.core/declare ser-metric-stat)

(clojure.core/declare ser-state-value)

(clojure.core/declare ser-max-records)

(clojure.core/declare ser-dimension)

(clojure.core/declare ser-comparison-operator)

(clojure.core/declare ser-metric-widget)

(clojure.core/declare ser-alarm-name-prefix)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-dashboard-name)

(clojure.core/declare ser-get-metric-data-max-datapoints)

(clojure.core/declare ser-state-reason-data)

(clojure.core/declare ser-extended-statistics)

(clojure.core/declare ser-dimensions)

(clojure.core/declare ser-output-format)

(clojure.core/declare ser-datapoints-to-alarm)

(clojure.core/declare ser-metric-label)

(clojure.core/declare ser-namespace)

(clojure.core/declare ser-values)

(clojure.core/declare ser-statistic-set)

(clojure.core/declare ser-action-prefix)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-dashboard-name-prefix)

(clojure.core/declare ser-evaluate-low-sample-count-percentile)

(clojure.core/declare ser-return-data)

(clojure.core/declare ser-alarm-description)

(clojure.core/declare ser-metric-id)

(clojure.core/declare ser-alarm-name)

(clojure.core/declare ser-metric)

(clojure.core/declare ser-dimension-filter)

(clojure.core/declare ser-resource-list)

(clojure.core/declare ser-stat)

(clojure.core/declare ser-extended-statistic)

(clojure.core/declare ser-dashboard-body)

(clojure.core/declare ser-metric-datum)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-metric-data-query)

(clojure.core/declare ser-statistics)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-metric-data)

(clojure.core/declare ser-dashboard-names)

(clojure.core/declare ser-metric-data-queries)

(clojure.core/declare ser-evaluation-periods)

(clojure.core/declare ser-metric-expression)

(clojure.core/declare ser-datapoint-value)

(clojure.core/declare ser-state-reason)

(clojure.core/declare ser-scan-by)

(clojure.core/declare ser-statistic)

(clojure.core/declare ser-alarm-names)

(clojure.core/declare ser-actions-enabled)

(clojure.core/defn- ser-standard-unit [input] #:http.request.field{:value (clojure.core/get {:kilobytes-second "Kilobytes/Second", :megabits "Megabits", "Terabytes" "Terabytes", :bits-second "Bits/Second", :count-second "Count/Second", :kilobits "Kilobits", "Kilobits/Second" "Kilobits/Second", "Count" "Count", :megabytes-second "Megabytes/Second", "Bits" "Bits", "Percent" "Percent", "Gigabits/Second" "Gigabits/Second", :terabytes "Terabytes", :terabits-second "Terabits/Second", "None" "None", :seconds "Seconds", :bits "Bits", :terabits "Terabits", :bytes-second "Bytes/Second", :kilobytes "Kilobytes", :microseconds "Microseconds", "Count/Second" "Count/Second", "Bytes" "Bytes", "Gigabytes/Second" "Gigabytes/Second", :megabits-second "Megabits/Second", "Megabits/Second" "Megabits/Second", :gigabits "Gigabits", "Kilobytes/Second" "Kilobytes/Second", :gigabits-second "Gigabits/Second", :kilobits-second "Kilobits/Second", :megabytes "Megabytes", "Terabytes/Second" "Terabytes/Second", "Bits/Second" "Bits/Second", "Bytes/Second" "Bytes/Second", "Milliseconds" "Milliseconds", :count "Count", :gigabytes-second "Gigabytes/Second", "Kilobytes" "Kilobytes", :bytes "Bytes", :milliseconds "Milliseconds", "Microseconds" "Microseconds", :percent "Percent", "Terabits" "Terabits", :gigabytes "Gigabytes", "Megabytes/Second" "Megabytes/Second", :terabytes-second "Terabytes/Second", "Gigabytes" "Gigabytes", "Gigabits" "Gigabits", "Megabits" "Megabits", :none "None", "Kilobits" "Kilobits", "Terabits/Second" "Terabits/Second", "Megabytes" "Megabytes", "Seconds" "Seconds"} input), :shape "StandardUnit"})

(clojure.core/defn- ser-storage-resolution [input] #:http.request.field{:value input, :shape "StorageResolution"})

(clojure.core/defn- ser-dimension-name [input] #:http.request.field{:value input, :shape "DimensionName"})

(clojure.core/defn- ser-treat-missing-data [input] #:http.request.field{:value input, :shape "TreatMissingData"})

(clojure.core/defn- ser-history-item-type [input] #:http.request.field{:value (clojure.core/get {"ConfigurationUpdate" "ConfigurationUpdate", :configuration-update "ConfigurationUpdate", "StateUpdate" "StateUpdate", :state-update "StateUpdate", "Action" "Action", :action "Action"} input), :shape "HistoryItemType"})

(clojure.core/defn- ser-period [input] #:http.request.field{:value input, :shape "Period"})

(clojure.core/defn- ser-threshold [input] #:http.request.field{:value input, :shape "Threshold"})

(clojure.core/defn- ser-counts [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-datapoint-value coll) #:http.request.field{:shape "DatapointValue"}))) input), :shape "Counts", :type "list"})

(clojure.core/defn- ser-dimension-value [input] #:http.request.field{:value input, :shape "DimensionValue"})

(clojure.core/defn- ser-dimension-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-dimension-filter coll) #:http.request.field{:shape "DimensionFilter"}))) input), :shape "DimensionFilters", :type "list", :max 10})

(clojure.core/defn- ser-metric-stat [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric (:metric input)) #:http.request.field{:name "Metric", :shape "Metric"}) (clojure.core/into (ser-period (:period input)) #:http.request.field{:name "Period", :shape "Period"}) (clojure.core/into (ser-stat (:stat input)) #:http.request.field{:name "Stat", :shape "Stat"})], :shape "MetricStat", :type "structure"} (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-unit (input :unit)) #:http.request.field{:name "Unit", :shape "StandardUnit"}))))

(clojure.core/defn- ser-state-value [input] #:http.request.field{:value (clojure.core/get {"OK" "OK", :ok "OK", "ALARM" "ALARM", :alarm "ALARM", "INSUFFICIENT_DATA" "INSUFFICIENT_DATA", :insufficient-data "INSUFFICIENT_DATA"} input), :shape "StateValue"})

(clojure.core/defn- ser-max-records [input] #:http.request.field{:value input, :shape "MaxRecords"})

(clojure.core/defn- ser-dimension [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dimension-name (:name input)) #:http.request.field{:name "Name", :shape "DimensionName"}) (clojure.core/into (ser-dimension-value (:value input)) #:http.request.field{:name "Value", :shape "DimensionValue"})], :shape "Dimension", :type "structure", :xml-order ["Name" "Value"]}))

(clojure.core/defn- ser-comparison-operator [input] #:http.request.field{:value (clojure.core/get {"GreaterThanOrEqualToThreshold" "GreaterThanOrEqualToThreshold", :greater-than-or-equal-to-threshold "GreaterThanOrEqualToThreshold", "GreaterThanThreshold" "GreaterThanThreshold", :greater-than-threshold "GreaterThanThreshold", "LessThanThreshold" "LessThanThreshold", :less-than-threshold "LessThanThreshold", "LessThanOrEqualToThreshold" "LessThanOrEqualToThreshold", :less-than-or-equal-to-threshold "LessThanOrEqualToThreshold"} input), :shape "ComparisonOperator"})

(clojure.core/defn- ser-metric-widget [input] #:http.request.field{:value input, :shape "MetricWidget"})

(clojure.core/defn- ser-alarm-name-prefix [input] #:http.request.field{:value input, :shape "AlarmNamePrefix"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-dashboard-name [input] #:http.request.field{:value input, :shape "DashboardName"})

(clojure.core/defn- ser-get-metric-data-max-datapoints [input] #:http.request.field{:value input, :shape "GetMetricDataMaxDatapoints"})

(clojure.core/defn- ser-state-reason-data [input] #:http.request.field{:value input, :shape "StateReasonData"})

(clojure.core/defn- ser-extended-statistics [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-extended-statistic coll) #:http.request.field{:shape "ExtendedStatistic"}))) input), :shape "ExtendedStatistics", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-dimensions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-dimension coll) #:http.request.field{:shape "Dimension"}))) input), :shape "Dimensions", :type "list", :max 10})

(clojure.core/defn- ser-output-format [input] #:http.request.field{:value input, :shape "OutputFormat"})

(clojure.core/defn- ser-datapoints-to-alarm [input] #:http.request.field{:value input, :shape "DatapointsToAlarm"})

(clojure.core/defn- ser-metric-label [input] #:http.request.field{:value input, :shape "MetricLabel"})

(clojure.core/defn- ser-namespace [input] #:http.request.field{:value input, :shape "Namespace"})

(clojure.core/defn- ser-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-datapoint-value coll) #:http.request.field{:shape "DatapointValue"}))) input), :shape "Values", :type "list"})

(clojure.core/defn- ser-statistic-set [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-datapoint-value (:sample-count input)) #:http.request.field{:name "SampleCount", :shape "DatapointValue"}) (clojure.core/into (ser-datapoint-value (:sum input)) #:http.request.field{:name "Sum", :shape "DatapointValue"}) (clojure.core/into (ser-datapoint-value (:minimum input)) #:http.request.field{:name "Minimum", :shape "DatapointValue"}) (clojure.core/into (ser-datapoint-value (:maximum input)) #:http.request.field{:name "Maximum", :shape "DatapointValue"})], :shape "StatisticSet", :type "structure"}))

(clojure.core/defn- ser-action-prefix [input] #:http.request.field{:value input, :shape "ActionPrefix"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-dashboard-name-prefix [input] #:http.request.field{:value input, :shape "DashboardNamePrefix"})

(clojure.core/defn- ser-evaluate-low-sample-count-percentile [input] #:http.request.field{:value input, :shape "EvaluateLowSampleCountPercentile"})

(clojure.core/defn- ser-return-data [input] #:http.request.field{:value input, :shape "ReturnData"})

(clojure.core/defn- ser-alarm-description [input] #:http.request.field{:value input, :shape "AlarmDescription"})

(clojure.core/defn- ser-metric-id [input] #:http.request.field{:value input, :shape "MetricId"})

(clojure.core/defn- ser-alarm-name [input] #:http.request.field{:value input, :shape "AlarmName"})

(clojure.core/defn- ser-metric [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Metric", :type "structure", :xml-order ["Namespace" "MetricName" "Dimensions"]} (clojure.core/contains? input :namespace) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-namespace (input :namespace)) #:http.request.field{:name "Namespace", :shape "Namespace"})) (clojure.core/contains? input :metric-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"})) (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimensions (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "Dimensions"}))))

(clojure.core/defn- ser-dimension-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dimension-name (:name input)) #:http.request.field{:name "Name", :shape "DimensionName"})], :shape "DimensionFilter", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimension-value (input :value)) #:http.request.field{:name "Value", :shape "DimensionValue"}))))

(clojure.core/defn- ser-resource-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "ResourceList", :type "list", :max 5})

(clojure.core/defn- ser-stat [input] #:http.request.field{:value input, :shape "Stat"})

(clojure.core/defn- ser-extended-statistic [input] #:http.request.field{:value input, :shape "ExtendedStatistic"})

(clojure.core/defn- ser-dashboard-body [input] #:http.request.field{:value input, :shape "DashboardBody"})

(clojure.core/defn- ser-metric-datum [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-name (:metric-name input)) #:http.request.field{:name "MetricName", :shape "MetricName"})], :shape "MetricDatum", :type "structure"} (clojure.core/contains? input :storage-resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-resolution (input :storage-resolution)) #:http.request.field{:name "StorageResolution", :shape "StorageResolution"})) (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-unit (input :unit)) #:http.request.field{:name "Unit", :shape "StandardUnit"})) (clojure.core/contains? input :counts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-counts (input :counts)) #:http.request.field{:name "Counts", :shape "Counts"})) (clojure.core/contains? input :statistic-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statistic-set (input :statistic-values)) #:http.request.field{:name "StatisticValues", :shape "StatisticSet"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-datapoint-value (input :value)) #:http.request.field{:name "Value", :shape "DatapointValue"})) (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimensions (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "Dimensions"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-values (input :values)) #:http.request.field{:name "Values", :shape "Values"})) (clojure.core/contains? input :timestamp) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :timestamp)) #:http.request.field{:name "Timestamp", :shape "Timestamp"}))))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-metric-data-query [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-id (:id input)) #:http.request.field{:name "Id", :shape "MetricId"})], :shape "MetricDataQuery", :type "structure"} (clojure.core/contains? input :metric-stat) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-stat (input :metric-stat)) #:http.request.field{:name "MetricStat", :shape "MetricStat"})) (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-expression (input :expression)) #:http.request.field{:name "Expression", :shape "MetricExpression"})) (clojure.core/contains? input :label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-label (input :label)) #:http.request.field{:name "Label", :shape "MetricLabel"})) (clojure.core/contains? input :return-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return-data (input :return-data)) #:http.request.field{:name "ReturnData", :shape "ReturnData"}))))

(clojure.core/defn- ser-statistics [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-statistic coll) #:http.request.field{:shape "Statistic"}))) input), :shape "Statistics", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-metric-data [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-datum coll) #:http.request.field{:shape "MetricDatum"}))) input), :shape "MetricData", :type "list"})

(clojure.core/defn- ser-dashboard-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-dashboard-name coll) #:http.request.field{:shape "DashboardName"}))) input), :shape "DashboardNames", :type "list"})

(clojure.core/defn- ser-metric-data-queries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-data-query coll) #:http.request.field{:shape "MetricDataQuery"}))) input), :shape "MetricDataQueries", :type "list"})

(clojure.core/defn- ser-evaluation-periods [input] #:http.request.field{:value input, :shape "EvaluationPeriods"})

(clojure.core/defn- ser-metric-expression [input] #:http.request.field{:value input, :shape "MetricExpression"})

(clojure.core/defn- ser-datapoint-value [input] #:http.request.field{:value input, :shape "DatapointValue"})

(clojure.core/defn- ser-state-reason [input] #:http.request.field{:value input, :shape "StateReason"})

(clojure.core/defn- ser-scan-by [input] #:http.request.field{:value (clojure.core/get {"TimestampDescending" "TimestampDescending", :timestamp-descending "TimestampDescending", "TimestampAscending" "TimestampAscending", :timestamp-ascending "TimestampAscending"} input), :shape "ScanBy"})

(clojure.core/defn- ser-statistic [input] #:http.request.field{:value (clojure.core/get {"Sum" "Sum", "Average" "Average", :maximum "Maximum", "SampleCount" "SampleCount", "Minimum" "Minimum", :sample-count "SampleCount", :minimum "Minimum", :average "Average", :sum "Sum", "Maximum" "Maximum"} input), :shape "Statistic"})

(clojure.core/defn- ser-alarm-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-alarm-name coll) #:http.request.field{:shape "AlarmName"}))) input), :shape "AlarmNames", :type "list", :max 100})

(clojure.core/defn- ser-actions-enabled [input] #:http.request.field{:value input, :shape "ActionsEnabled"})

(clojure.core/defn- req-get-metric-data-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-metric-data-queries (input :metric-data-queries)) #:http.request.field{:name "MetricDataQueries", :shape "MetricDataQueries"}) (clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "Timestamp"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :scan-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scan-by (input :scan-by)) #:http.request.field{:name "ScanBy", :shape "ScanBy"})) (clojure.core/contains? input :max-datapoints) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-metric-data-max-datapoints (input :max-datapoints)) #:http.request.field{:name "MaxDatapoints", :shape "GetMetricDataMaxDatapoints"}))))

(clojure.core/defn- req-set-alarm-state-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alarm-name (input :alarm-name)) #:http.request.field{:name "AlarmName", :shape "AlarmName"}) (clojure.core/into (ser-state-value (input :state-value)) #:http.request.field{:name "StateValue", :shape "StateValue"}) (clojure.core/into (ser-state-reason (input :state-reason)) #:http.request.field{:name "StateReason", :shape "StateReason"})]} (clojure.core/contains? input :state-reason-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-state-reason-data (input :state-reason-data)) #:http.request.field{:name "StateReasonData", :shape "StateReasonData"}))))

(clojure.core/defn- req-put-metric-data-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-namespace (input :namespace)) #:http.request.field{:name "Namespace", :shape "Namespace"}) (clojure.core/into (ser-metric-data (input :metric-data)) #:http.request.field{:name "MetricData", :shape "MetricData"})]}))

(clojure.core/defn- req-disable-alarm-actions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alarm-names (input :alarm-names)) #:http.request.field{:name "AlarmNames", :shape "AlarmNames"})]}))

(clojure.core/defn- req-describe-alarms-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :alarm-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-names (input :alarm-names)) #:http.request.field{:name "AlarmNames", :shape "AlarmNames"})) (clojure.core/contains? input :alarm-name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-name-prefix (input :alarm-name-prefix)) #:http.request.field{:name "AlarmNamePrefix", :shape "AlarmNamePrefix"})) (clojure.core/contains? input :state-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-state-value (input :state-value)) #:http.request.field{:name "StateValue", :shape "StateValue"})) (clojure.core/contains? input :action-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-prefix (input :action-prefix)) #:http.request.field{:name "ActionPrefix", :shape "ActionPrefix"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-metrics-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :namespace) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-namespace (input :namespace)) #:http.request.field{:name "Namespace", :shape "Namespace"})) (clojure.core/contains? input :metric-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"})) (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimension-filters (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "DimensionFilters"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-metric-statistics-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-namespace (input :namespace)) #:http.request.field{:name "Namespace", :shape "Namespace"}) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "StartTime", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "EndTime", :shape "Timestamp"}) (clojure.core/into (ser-period (input :period)) #:http.request.field{:name "Period", :shape "Period"})]} (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-unit (input :unit)) #:http.request.field{:name "Unit", :shape "StandardUnit"})) (clojure.core/contains? input :extended-statistics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extended-statistics (input :extended-statistics)) #:http.request.field{:name "ExtendedStatistics", :shape "ExtendedStatistics"})) (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimensions (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "Dimensions"})) (clojure.core/contains? input :statistics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statistics (input :statistics)) #:http.request.field{:name "Statistics", :shape "Statistics"}))))

(clojure.core/defn- req-delete-dashboards-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-dashboard-names (input :dashboard-names)) #:http.request.field{:name "DashboardNames", :shape "DashboardNames"})]}))

(clojure.core/defn- req-get-dashboard-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-dashboard-name (input :dashboard-name)) #:http.request.field{:name "DashboardName", :shape "DashboardName"})]}))

(clojure.core/defn- req-put-dashboard-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-dashboard-name (input :dashboard-name)) #:http.request.field{:name "DashboardName", :shape "DashboardName"}) (clojure.core/into (ser-dashboard-body (input :dashboard-body)) #:http.request.field{:name "DashboardBody", :shape "DashboardBody"})]}))

(clojure.core/defn- req-put-metric-alarm-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alarm-name (input :alarm-name)) #:http.request.field{:name "AlarmName", :shape "AlarmName"}) (clojure.core/into (ser-evaluation-periods (input :evaluation-periods)) #:http.request.field{:name "EvaluationPeriods", :shape "EvaluationPeriods"}) (clojure.core/into (ser-threshold (input :threshold)) #:http.request.field{:name "Threshold", :shape "Threshold"}) (clojure.core/into (ser-comparison-operator (input :comparison-operator)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperator"})]} (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-unit (input :unit)) #:http.request.field{:name "Unit", :shape "StandardUnit"})) (clojure.core/contains? input :treat-missing-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-treat-missing-data (input :treat-missing-data)) #:http.request.field{:name "TreatMissingData", :shape "TreatMissingData"})) (clojure.core/contains? input :period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-period (input :period)) #:http.request.field{:name "Period", :shape "Period"})) (clojure.core/contains? input :ok-actions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-list (input :ok-actions)) #:http.request.field{:name "OKActions", :shape "ResourceList"})) (clojure.core/contains? input :insufficient-data-actions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-list (input :insufficient-data-actions)) #:http.request.field{:name "InsufficientDataActions", :shape "ResourceList"})) (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimensions (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "Dimensions"})) (clojure.core/contains? input :datapoints-to-alarm) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-datapoints-to-alarm (input :datapoints-to-alarm)) #:http.request.field{:name "DatapointsToAlarm", :shape "DatapointsToAlarm"})) (clojure.core/contains? input :namespace) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-namespace (input :namespace)) #:http.request.field{:name "Namespace", :shape "Namespace"})) (clojure.core/contains? input :alarm-actions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-list (input :alarm-actions)) #:http.request.field{:name "AlarmActions", :shape "ResourceList"})) (clojure.core/contains? input :evaluate-low-sample-count-percentile) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-evaluate-low-sample-count-percentile (input :evaluate-low-sample-count-percentile)) #:http.request.field{:name "EvaluateLowSampleCountPercentile", :shape "EvaluateLowSampleCountPercentile"})) (clojure.core/contains? input :alarm-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-description (input :alarm-description)) #:http.request.field{:name "AlarmDescription", :shape "AlarmDescription"})) (clojure.core/contains? input :extended-statistic) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extended-statistic (input :extended-statistic)) #:http.request.field{:name "ExtendedStatistic", :shape "ExtendedStatistic"})) (clojure.core/contains? input :metric-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"})) (clojure.core/contains? input :statistic) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statistic (input :statistic)) #:http.request.field{:name "Statistic", :shape "Statistic"})) (clojure.core/contains? input :actions-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-actions-enabled (input :actions-enabled)) #:http.request.field{:name "ActionsEnabled", :shape "ActionsEnabled"})) (clojure.core/contains? input :metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-data-queries (input :metrics)) #:http.request.field{:name "Metrics", :shape "MetricDataQueries"}))))

(clojure.core/defn- req-get-metric-widget-image-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-metric-widget (input :metric-widget)) #:http.request.field{:name "MetricWidget", :shape "MetricWidget"})]} (clojure.core/contains? input :output-format) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-format (input :output-format)) #:http.request.field{:name "OutputFormat", :shape "OutputFormat"}))))

(clojure.core/defn- req-enable-alarm-actions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alarm-names (input :alarm-names)) #:http.request.field{:name "AlarmNames", :shape "AlarmNames"})]}))

(clojure.core/defn- req-describe-alarms-for-metric-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-namespace (input :namespace)) #:http.request.field{:name "Namespace", :shape "Namespace"})]} (clojure.core/contains? input :statistic) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statistic (input :statistic)) #:http.request.field{:name "Statistic", :shape "Statistic"})) (clojure.core/contains? input :extended-statistic) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-extended-statistic (input :extended-statistic)) #:http.request.field{:name "ExtendedStatistic", :shape "ExtendedStatistic"})) (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dimensions (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "Dimensions"})) (clojure.core/contains? input :period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-period (input :period)) #:http.request.field{:name "Period", :shape "Period"})) (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-unit (input :unit)) #:http.request.field{:name "Unit", :shape "StandardUnit"}))))

(clojure.core/defn- req-list-dashboards-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :dashboard-name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dashboard-name-prefix (input :dashboard-name-prefix)) #:http.request.field{:name "DashboardNamePrefix", :shape "DashboardNamePrefix"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-alarms-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-alarm-names (input :alarm-names)) #:http.request.field{:name "AlarmNames", :shape "AlarmNames"})]}))

(clojure.core/defn- req-describe-alarm-history-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :alarm-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-name (input :alarm-name)) #:http.request.field{:name "AlarmName", :shape "AlarmName"})) (clojure.core/contains? input :history-item-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-history-item-type (input :history-item-type)) #:http.request.field{:name "HistoryItemType", :shape "HistoryItemType"})) (clojure.core/contains? input :start-date) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :start-date)) #:http.request.field{:name "StartDate", :shape "Timestamp"})) (clojure.core/contains? input :end-date) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :end-date)) #:http.request.field{:name "EndDate", :shape "Timestamp"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/declare deser-standard-unit)

(clojure.core/declare deser-dimension-name)

(clojure.core/declare deser-metric-widget-image)

(clojure.core/declare deser-treat-missing-data)

(clojure.core/declare deser-history-item-type)

(clojure.core/declare deser-dashboard-error-message)

(clojure.core/declare deser-period)

(clojure.core/declare deser-message-data)

(clojure.core/declare deser-threshold)

(clojure.core/declare deser-data-path)

(clojure.core/declare deser-status-code)

(clojure.core/declare deser-metric-data-result-messages)

(clojure.core/declare deser-dimension-value)

(clojure.core/declare deser-metric-stat)

(clojure.core/declare deser-state-value)

(clojure.core/declare deser-dimension)

(clojure.core/declare deser-comparison-operator)

(clojure.core/declare deser-dashboard-arn)

(clojure.core/declare deser-history-data)

(clojure.core/declare deser-datapoint)

(clojure.core/declare deser-metric-data-result)

(clojure.core/declare deser-dashboard-entries)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-dashboard-name)

(clojure.core/declare deser-dashboard-validation-message)

(clojure.core/declare deser-dashboard-entry)

(clojure.core/declare deser-history-summary)

(clojure.core/declare deser-state-reason-data)

(clojure.core/declare deser-dashboard-validation-messages)

(clojure.core/declare deser-metric-alarm)

(clojure.core/declare deser-alarm-history-items)

(clojure.core/declare deser-alarm-history-item)

(clojure.core/declare deser-dimensions)

(clojure.core/declare deser-datapoints-to-alarm)

(clojure.core/declare deser-metric-label)

(clojure.core/declare deser-namespace)

(clojure.core/declare deser-message)

(clojure.core/declare deser-message-data-value)

(clojure.core/declare deser-timestamps)

(clojure.core/declare deser-last-modified)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-size)

(clojure.core/declare deser-evaluate-low-sample-count-percentile)

(clojure.core/declare deser-return-data)

(clojure.core/declare deser-alarm-description)

(clojure.core/declare deser-metric-id)

(clojure.core/declare deser-alarm-name)

(clojure.core/declare deser-metric)

(clojure.core/declare deser-resource-list)

(clojure.core/declare deser-stat)

(clojure.core/declare deser-extended-statistic)

(clojure.core/declare deser-datapoint-value-map)

(clojure.core/declare deser-dashboard-body)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-metric-alarms)

(clojure.core/declare deser-metric-data-query)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-datapoints)

(clojure.core/declare deser-metric-data-queries)

(clojure.core/declare deser-alarm-arn)

(clojure.core/declare deser-evaluation-periods)

(clojure.core/declare deser-metric-expression)

(clojure.core/declare deser-aws-query-error-message)

(clojure.core/declare deser-message-data-code)

(clojure.core/declare deser-datapoint-value)

(clojure.core/declare deser-state-reason)

(clojure.core/declare deser-statistic)

(clojure.core/declare deser-actions-enabled)

(clojure.core/declare deser-fault-description)

(clojure.core/declare deser-metric-data-results)

(clojure.core/declare deser-datapoint-values)

(clojure.core/declare deser-metrics)

(clojure.core/defn- deser-standard-unit [input] (clojure.core/get {"Terabytes" :terabytes, "Kilobits/Second" :kilobits-second, "Count" :count, "Bits" :bits, "Percent" :percent, "Gigabits/Second" :gigabits-second, "None" :none, "Count/Second" :count-second, "Bytes" :bytes, "Gigabytes/Second" :gigabytes-second, "Megabits/Second" :megabits-second, "Kilobytes/Second" :kilobytes-second, "Terabytes/Second" :terabytes-second, "Bits/Second" :bits-second, "Bytes/Second" :bytes-second, "Milliseconds" :milliseconds, "Kilobytes" :kilobytes, "Microseconds" :microseconds, "Terabits" :terabits, "Megabytes/Second" :megabytes-second, "Gigabytes" :gigabytes, "Gigabits" :gigabits, "Megabits" :megabits, "Kilobits" :kilobits, "Terabits/Second" :terabits-second, "Megabytes" :megabytes, "Seconds" :seconds} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-dimension-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metric-widget-image [input] input)

(clojure.core/defn- deser-treat-missing-data [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-history-item-type [input] (clojure.core/get {"ConfigurationUpdate" :configuration-update, "StateUpdate" :state-update, "Action" :action} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-dashboard-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-period [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-message-data [input] (clojure.core/let [letvar434490 {"Code" (portkey.aws/search-for-tag input "Code" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar434490 "Code") (clojure.core/assoc :code (deser-message-data-code (clojure.core/get-in letvar434490 ["Code" :content]))) (letvar434490 "Value") (clojure.core/assoc :value (deser-message-data-value (clojure.core/get-in letvar434490 ["Value" :content]))))))

(clojure.core/defn- deser-threshold [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-data-path [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-status-code [input] (clojure.core/get {"Complete" :complete, "InternalError" :internal-error, "PartialData" :partial-data} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-metric-data-result-messages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-message-data coll))) input))

(clojure.core/defn- deser-dimension-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metric-stat [input] (clojure.core/let [letvar434632 {"Metric" (portkey.aws/search-for-tag input "Metric" :flattened? nil :xmlAttribute? nil), "Period" (portkey.aws/search-for-tag input "Period" :flattened? nil :xmlAttribute? nil), "Stat" (portkey.aws/search-for-tag input "Stat" :flattened? nil :xmlAttribute? nil), "Unit" (portkey.aws/search-for-tag input "Unit" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:metric (deser-metric (clojure.core/get-in letvar434632 ["Metric" :content])), :period (deser-period (clojure.core/get-in letvar434632 ["Period" :content])), :stat (deser-stat (clojure.core/get-in letvar434632 ["Stat" :content]))} (letvar434632 "Unit") (clojure.core/assoc :unit (deser-standard-unit (clojure.core/get-in letvar434632 ["Unit" :content]))))))

(clojure.core/defn- deser-state-value [input] (clojure.core/get {"OK" :ok, "ALARM" :alarm, "INSUFFICIENT_DATA" :insufficient-data} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-dimension [input] (clojure.core/let [letvar434745 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dimension-name (clojure.core/get-in letvar434745 ["Name" :content])), :value (deser-dimension-value (clojure.core/get-in letvar434745 ["Value" :content]))})))

(clojure.core/defn- deser-comparison-operator [input] (clojure.core/get {"GreaterThanOrEqualToThreshold" :greater-than-or-equal-to-threshold, "GreaterThanThreshold" :greater-than-threshold, "LessThanThreshold" :less-than-threshold, "LessThanOrEqualToThreshold" :less-than-or-equal-to-threshold} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-dashboard-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-history-data [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-datapoint [input] (clojure.core/let [letvar434868 {"Timestamp" (portkey.aws/search-for-tag input "Timestamp" :flattened? nil :xmlAttribute? nil), "SampleCount" (portkey.aws/search-for-tag input "SampleCount" :flattened? nil :xmlAttribute? nil), "Average" (portkey.aws/search-for-tag input "Average" :flattened? nil :xmlAttribute? nil), "Sum" (portkey.aws/search-for-tag input "Sum" :flattened? nil :xmlAttribute? nil), "Minimum" (portkey.aws/search-for-tag input "Minimum" :flattened? nil :xmlAttribute? nil), "Maximum" (portkey.aws/search-for-tag input "Maximum" :flattened? nil :xmlAttribute? nil), "Unit" (portkey.aws/search-for-tag input "Unit" :flattened? nil :xmlAttribute? nil), "ExtendedStatistics" (portkey.aws/search-for-tag input "ExtendedStatistics" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar434868 "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (clojure.core/get-in letvar434868 ["Timestamp" :content]))) (letvar434868 "SampleCount") (clojure.core/assoc :sample-count (deser-datapoint-value (clojure.core/get-in letvar434868 ["SampleCount" :content]))) (letvar434868 "Average") (clojure.core/assoc :average (deser-datapoint-value (clojure.core/get-in letvar434868 ["Average" :content]))) (letvar434868 "Sum") (clojure.core/assoc :sum (deser-datapoint-value (clojure.core/get-in letvar434868 ["Sum" :content]))) (letvar434868 "Minimum") (clojure.core/assoc :minimum (deser-datapoint-value (clojure.core/get-in letvar434868 ["Minimum" :content]))) (letvar434868 "Maximum") (clojure.core/assoc :maximum (deser-datapoint-value (clojure.core/get-in letvar434868 ["Maximum" :content]))) (letvar434868 "Unit") (clojure.core/assoc :unit (deser-standard-unit (clojure.core/get-in letvar434868 ["Unit" :content]))) (letvar434868 "ExtendedStatistics") (clojure.core/assoc :extended-statistics (deser-datapoint-value-map (clojure.core/get-in letvar434868 ["ExtendedStatistics" :content]))))))

(clojure.core/defn- deser-metric-data-result [input] (clojure.core/let [letvar434976 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Label" (portkey.aws/search-for-tag input "Label" :flattened? nil :xmlAttribute? nil), "Timestamps" (portkey.aws/search-for-tag input "Timestamps" :flattened? nil :xmlAttribute? nil), "Values" (portkey.aws/search-for-tag input "Values" :flattened? nil :xmlAttribute? nil), "StatusCode" (portkey.aws/search-for-tag input "StatusCode" :flattened? nil :xmlAttribute? nil), "Messages" (portkey.aws/search-for-tag input "Messages" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar434976 "Id") (clojure.core/assoc :id (deser-metric-id (clojure.core/get-in letvar434976 ["Id" :content]))) (letvar434976 "Label") (clojure.core/assoc :label (deser-metric-label (clojure.core/get-in letvar434976 ["Label" :content]))) (letvar434976 "Timestamps") (clojure.core/assoc :timestamps (deser-timestamps (clojure.core/get-in letvar434976 ["Timestamps" :content]))) (letvar434976 "Values") (clojure.core/assoc :values (deser-datapoint-values (clojure.core/get-in letvar434976 ["Values" :content]))) (letvar434976 "StatusCode") (clojure.core/assoc :status-code (deser-status-code (clojure.core/get-in letvar434976 ["StatusCode" :content]))) (letvar434976 "Messages") (clojure.core/assoc :messages (deser-metric-data-result-messages (clojure.core/get-in letvar434976 ["Messages" :content]))))))

(clojure.core/defn- deser-dashboard-entries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dashboard-entry coll))) input))

(clojure.core/defn- deser-next-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-dashboard-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-dashboard-validation-message [input] (clojure.core/let [letvar435116 {"DataPath" (portkey.aws/search-for-tag input "DataPath" :flattened? nil :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar435116 "DataPath") (clojure.core/assoc :data-path (deser-data-path (clojure.core/get-in letvar435116 ["DataPath" :content]))) (letvar435116 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar435116 ["Message" :content]))))))

(clojure.core/defn- deser-dashboard-entry [input] (clojure.core/let [letvar435224 {"DashboardName" (portkey.aws/search-for-tag input "DashboardName" :flattened? nil :xmlAttribute? nil), "DashboardArn" (portkey.aws/search-for-tag input "DashboardArn" :flattened? nil :xmlAttribute? nil), "LastModified" (portkey.aws/search-for-tag input "LastModified" :flattened? nil :xmlAttribute? nil), "Size" (portkey.aws/search-for-tag input "Size" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar435224 "DashboardName") (clojure.core/assoc :dashboard-name (deser-dashboard-name (clojure.core/get-in letvar435224 ["DashboardName" :content]))) (letvar435224 "DashboardArn") (clojure.core/assoc :dashboard-arn (deser-dashboard-arn (clojure.core/get-in letvar435224 ["DashboardArn" :content]))) (letvar435224 "LastModified") (clojure.core/assoc :last-modified (deser-last-modified (clojure.core/get-in letvar435224 ["LastModified" :content]))) (letvar435224 "Size") (clojure.core/assoc :size (deser-size (clojure.core/get-in letvar435224 ["Size" :content]))))))

(clojure.core/defn- deser-history-summary [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-state-reason-data [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-dashboard-validation-messages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dashboard-validation-message coll))) input))

(clojure.core/defn- deser-metric-alarm [input] (clojure.core/let [letvar435359 {"Unit" (portkey.aws/search-for-tag input "Unit" :flattened? nil :xmlAttribute? nil), "TreatMissingData" (portkey.aws/search-for-tag input "TreatMissingData" :flattened? nil :xmlAttribute? nil), "Period" (portkey.aws/search-for-tag input "Period" :flattened? nil :xmlAttribute? nil), "Threshold" (portkey.aws/search-for-tag input "Threshold" :flattened? nil :xmlAttribute? nil), "OKActions" (portkey.aws/search-for-tag input "OKActions" :flattened? nil :xmlAttribute? nil), "StateValue" (portkey.aws/search-for-tag input "StateValue" :flattened? nil :xmlAttribute? nil), "StateUpdatedTimestamp" (portkey.aws/search-for-tag input "StateUpdatedTimestamp" :flattened? nil :xmlAttribute? nil), "InsufficientDataActions" (portkey.aws/search-for-tag input "InsufficientDataActions" :flattened? nil :xmlAttribute? nil), "ComparisonOperator" (portkey.aws/search-for-tag input "ComparisonOperator" :flattened? nil :xmlAttribute? nil), "StateReasonData" (portkey.aws/search-for-tag input "StateReasonData" :flattened? nil :xmlAttribute? nil), "Dimensions" (portkey.aws/search-for-tag input "Dimensions" :flattened? nil :xmlAttribute? nil), "DatapointsToAlarm" (portkey.aws/search-for-tag input "DatapointsToAlarm" :flattened? nil :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "AlarmActions" (portkey.aws/search-for-tag input "AlarmActions" :flattened? nil :xmlAttribute? nil), "EvaluateLowSampleCountPercentile" (portkey.aws/search-for-tag input "EvaluateLowSampleCountPercentile" :flattened? nil :xmlAttribute? nil), "AlarmDescription" (portkey.aws/search-for-tag input "AlarmDescription" :flattened? nil :xmlAttribute? nil), "AlarmName" (portkey.aws/search-for-tag input "AlarmName" :flattened? nil :xmlAttribute? nil), "ExtendedStatistic" (portkey.aws/search-for-tag input "ExtendedStatistic" :flattened? nil :xmlAttribute? nil), "MetricName" (portkey.aws/search-for-tag input "MetricName" :flattened? nil :xmlAttribute? nil), "AlarmArn" (portkey.aws/search-for-tag input "AlarmArn" :flattened? nil :xmlAttribute? nil), "AlarmConfigurationUpdatedTimestamp" (portkey.aws/search-for-tag input "AlarmConfigurationUpdatedTimestamp" :flattened? nil :xmlAttribute? nil), "EvaluationPeriods" (portkey.aws/search-for-tag input "EvaluationPeriods" :flattened? nil :xmlAttribute? nil), "StateReason" (portkey.aws/search-for-tag input "StateReason" :flattened? nil :xmlAttribute? nil), "Statistic" (portkey.aws/search-for-tag input "Statistic" :flattened? nil :xmlAttribute? nil), "ActionsEnabled" (portkey.aws/search-for-tag input "ActionsEnabled" :flattened? nil :xmlAttribute? nil), "Metrics" (portkey.aws/search-for-tag input "Metrics" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar435359 "Unit") (clojure.core/assoc :unit (deser-standard-unit (clojure.core/get-in letvar435359 ["Unit" :content]))) (letvar435359 "TreatMissingData") (clojure.core/assoc :treat-missing-data (deser-treat-missing-data (clojure.core/get-in letvar435359 ["TreatMissingData" :content]))) (letvar435359 "Period") (clojure.core/assoc :period (deser-period (clojure.core/get-in letvar435359 ["Period" :content]))) (letvar435359 "Threshold") (clojure.core/assoc :threshold (deser-threshold (clojure.core/get-in letvar435359 ["Threshold" :content]))) (letvar435359 "OKActions") (clojure.core/assoc :ok-actions (deser-resource-list (clojure.core/get-in letvar435359 ["OKActions" :content]))) (letvar435359 "StateValue") (clojure.core/assoc :state-value (deser-state-value (clojure.core/get-in letvar435359 ["StateValue" :content]))) (letvar435359 "StateUpdatedTimestamp") (clojure.core/assoc :state-updated-timestamp (deser-timestamp (clojure.core/get-in letvar435359 ["StateUpdatedTimestamp" :content]))) (letvar435359 "InsufficientDataActions") (clojure.core/assoc :insufficient-data-actions (deser-resource-list (clojure.core/get-in letvar435359 ["InsufficientDataActions" :content]))) (letvar435359 "ComparisonOperator") (clojure.core/assoc :comparison-operator (deser-comparison-operator (clojure.core/get-in letvar435359 ["ComparisonOperator" :content]))) (letvar435359 "StateReasonData") (clojure.core/assoc :state-reason-data (deser-state-reason-data (clojure.core/get-in letvar435359 ["StateReasonData" :content]))) (letvar435359 "Dimensions") (clojure.core/assoc :dimensions (deser-dimensions (clojure.core/get-in letvar435359 ["Dimensions" :content]))) (letvar435359 "DatapointsToAlarm") (clojure.core/assoc :datapoints-to-alarm (deser-datapoints-to-alarm (clojure.core/get-in letvar435359 ["DatapointsToAlarm" :content]))) (letvar435359 "Namespace") (clojure.core/assoc :namespace (deser-namespace (clojure.core/get-in letvar435359 ["Namespace" :content]))) (letvar435359 "AlarmActions") (clojure.core/assoc :alarm-actions (deser-resource-list (clojure.core/get-in letvar435359 ["AlarmActions" :content]))) (letvar435359 "EvaluateLowSampleCountPercentile") (clojure.core/assoc :evaluate-low-sample-count-percentile (deser-evaluate-low-sample-count-percentile (clojure.core/get-in letvar435359 ["EvaluateLowSampleCountPercentile" :content]))) (letvar435359 "AlarmDescription") (clojure.core/assoc :alarm-description (deser-alarm-description (clojure.core/get-in letvar435359 ["AlarmDescription" :content]))) (letvar435359 "AlarmName") (clojure.core/assoc :alarm-name (deser-alarm-name (clojure.core/get-in letvar435359 ["AlarmName" :content]))) (letvar435359 "ExtendedStatistic") (clojure.core/assoc :extended-statistic (deser-extended-statistic (clojure.core/get-in letvar435359 ["ExtendedStatistic" :content]))) (letvar435359 "MetricName") (clojure.core/assoc :metric-name (deser-metric-name (clojure.core/get-in letvar435359 ["MetricName" :content]))) (letvar435359 "AlarmArn") (clojure.core/assoc :alarm-arn (deser-alarm-arn (clojure.core/get-in letvar435359 ["AlarmArn" :content]))) (letvar435359 "AlarmConfigurationUpdatedTimestamp") (clojure.core/assoc :alarm-configuration-updated-timestamp (deser-timestamp (clojure.core/get-in letvar435359 ["AlarmConfigurationUpdatedTimestamp" :content]))) (letvar435359 "EvaluationPeriods") (clojure.core/assoc :evaluation-periods (deser-evaluation-periods (clojure.core/get-in letvar435359 ["EvaluationPeriods" :content]))) (letvar435359 "StateReason") (clojure.core/assoc :state-reason (deser-state-reason (clojure.core/get-in letvar435359 ["StateReason" :content]))) (letvar435359 "Statistic") (clojure.core/assoc :statistic (deser-statistic (clojure.core/get-in letvar435359 ["Statistic" :content]))) (letvar435359 "ActionsEnabled") (clojure.core/assoc :actions-enabled (deser-actions-enabled (clojure.core/get-in letvar435359 ["ActionsEnabled" :content]))) (letvar435359 "Metrics") (clojure.core/assoc :metrics (deser-metric-data-queries (clojure.core/get-in letvar435359 ["Metrics" :content]))))))

(clojure.core/defn- deser-alarm-history-items [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-alarm-history-item coll))) input))

(clojure.core/defn- deser-alarm-history-item [input] (clojure.core/let [letvar435484 {"AlarmName" (portkey.aws/search-for-tag input "AlarmName" :flattened? nil :xmlAttribute? nil), "Timestamp" (portkey.aws/search-for-tag input "Timestamp" :flattened? nil :xmlAttribute? nil), "HistoryItemType" (portkey.aws/search-for-tag input "HistoryItemType" :flattened? nil :xmlAttribute? nil), "HistorySummary" (portkey.aws/search-for-tag input "HistorySummary" :flattened? nil :xmlAttribute? nil), "HistoryData" (portkey.aws/search-for-tag input "HistoryData" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar435484 "AlarmName") (clojure.core/assoc :alarm-name (deser-alarm-name (clojure.core/get-in letvar435484 ["AlarmName" :content]))) (letvar435484 "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (clojure.core/get-in letvar435484 ["Timestamp" :content]))) (letvar435484 "HistoryItemType") (clojure.core/assoc :history-item-type (deser-history-item-type (clojure.core/get-in letvar435484 ["HistoryItemType" :content]))) (letvar435484 "HistorySummary") (clojure.core/assoc :history-summary (deser-history-summary (clojure.core/get-in letvar435484 ["HistorySummary" :content]))) (letvar435484 "HistoryData") (clojure.core/assoc :history-data (deser-history-data (clojure.core/get-in letvar435484 ["HistoryData" :content]))))))

(clojure.core/defn- deser-dimensions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dimension coll))) input))

(clojure.core/defn- deser-datapoints-to-alarm [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-metric-label [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-namespace [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-message-data-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-timestamps [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-timestamp coll))) input))

(clojure.core/defn- deser-last-modified [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-size [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-evaluate-low-sample-count-percentile [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-return-data [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-alarm-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metric-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-alarm-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metric [input] (clojure.core/let [letvar435679 {"Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "MetricName" (portkey.aws/search-for-tag input "MetricName" :flattened? nil :xmlAttribute? nil), "Dimensions" (portkey.aws/search-for-tag input "Dimensions" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar435679 "Namespace") (clojure.core/assoc :namespace (deser-namespace (clojure.core/get-in letvar435679 ["Namespace" :content]))) (letvar435679 "MetricName") (clojure.core/assoc :metric-name (deser-metric-name (clojure.core/get-in letvar435679 ["MetricName" :content]))) (letvar435679 "Dimensions") (clojure.core/assoc :dimensions (deser-dimensions (clojure.core/get-in letvar435679 ["Dimensions" :content]))))))

(clojure.core/defn- deser-resource-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-name coll))) input))

(clojure.core/defn- deser-stat [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-extended-statistic [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-datapoint-value-map [input] (clojure.core/let [x-flattened__283694__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__283694__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-extended-statistic k) (deser-datapoint-value v)]))) input)))

(clojure.core/defn- deser-dashboard-body [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metric-alarms [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-alarm coll))) input))

(clojure.core/defn- deser-metric-data-query [input] (clojure.core/let [letvar435861 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "MetricStat" (portkey.aws/search-for-tag input "MetricStat" :flattened? nil :xmlAttribute? nil), "Expression" (portkey.aws/search-for-tag input "Expression" :flattened? nil :xmlAttribute? nil), "Label" (portkey.aws/search-for-tag input "Label" :flattened? nil :xmlAttribute? nil), "ReturnData" (portkey.aws/search-for-tag input "ReturnData" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-metric-id (clojure.core/get-in letvar435861 ["Id" :content]))} (letvar435861 "MetricStat") (clojure.core/assoc :metric-stat (deser-metric-stat (clojure.core/get-in letvar435861 ["MetricStat" :content]))) (letvar435861 "Expression") (clojure.core/assoc :expression (deser-metric-expression (clojure.core/get-in letvar435861 ["Expression" :content]))) (letvar435861 "Label") (clojure.core/assoc :label (deser-metric-label (clojure.core/get-in letvar435861 ["Label" :content]))) (letvar435861 "ReturnData") (clojure.core/assoc :return-data (deser-return-data (clojure.core/get-in letvar435861 ["ReturnData" :content]))))))

(clojure.core/defn- deser-metric-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-datapoints [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-datapoint coll))) input))

(clojure.core/defn- deser-metric-data-queries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-data-query coll))) input))

(clojure.core/defn- deser-alarm-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-evaluation-periods [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-metric-expression [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-aws-query-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-message-data-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-datapoint-value [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-state-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-statistic [input] (clojure.core/get {"SampleCount" :sample-count, "Average" :average, "Sum" :sum, "Minimum" :minimum, "Maximum" :maximum} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-actions-enabled [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-fault-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metric-data-results [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-data-result coll))) input))

(clojure.core/defn- deser-datapoint-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-datapoint-value coll))) input))

(clojure.core/defn- deser-metrics [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric coll))) input))

(clojure.core/defn- response-missing-required-parameter-exception ([input] (response-missing-required-parameter-exception nil input)) ([resultWrapper435994 input] (clojure.core/let [rawinput435993 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar435995 {"message" (portkey.aws/search-for-tag rawinput435993 "message" :flattened? nil :result-wrapper resultWrapper435994)}] (clojure.core/cond-> {} (letvar435995 "message") (clojure.core/assoc :message (deser-aws-query-error-message (clojure.core/get-in letvar435995 ["message" :content])))))))

(clojure.core/defn- response-describe-alarms-output ([input] (response-describe-alarms-output nil input)) ([resultWrapper435997 input] (clojure.core/let [rawinput435996 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar435998 {"MetricAlarms" (portkey.aws/search-for-tag rawinput435996 "MetricAlarms" :flattened? nil :result-wrapper resultWrapper435997), "NextToken" (portkey.aws/search-for-tag rawinput435996 "NextToken" :flattened? nil :result-wrapper resultWrapper435997)}] (clojure.core/cond-> {} (letvar435998 "MetricAlarms") (clojure.core/assoc :metric-alarms (deser-metric-alarms (clojure.core/get-in letvar435998 ["MetricAlarms" :content]))) (letvar435998 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar435998 ["NextToken" :content])))))))

(clojure.core/defn- response-get-metric-data-output ([input] (response-get-metric-data-output nil input)) ([resultWrapper436000 input] (clojure.core/let [rawinput435999 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436001 {"MetricDataResults" (portkey.aws/search-for-tag rawinput435999 "MetricDataResults" :flattened? nil :result-wrapper resultWrapper436000), "NextToken" (portkey.aws/search-for-tag rawinput435999 "NextToken" :flattened? nil :result-wrapper resultWrapper436000)}] (clojure.core/cond-> {} (letvar436001 "MetricDataResults") (clojure.core/assoc :metric-data-results (deser-metric-data-results (clojure.core/get-in letvar436001 ["MetricDataResults" :content]))) (letvar436001 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar436001 ["NextToken" :content])))))))

(clojure.core/defn- response-put-dashboard-output ([input] (response-put-dashboard-output nil input)) ([resultWrapper436003 input] (clojure.core/let [rawinput436002 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436004 {"DashboardValidationMessages" (portkey.aws/search-for-tag rawinput436002 "DashboardValidationMessages" :flattened? nil :result-wrapper resultWrapper436003)}] (clojure.core/cond-> {} (letvar436004 "DashboardValidationMessages") (clojure.core/assoc :dashboard-validation-messages (deser-dashboard-validation-messages (clojure.core/get-in letvar436004 ["DashboardValidationMessages" :content])))))))

(clojure.core/defn- response-get-metric-statistics-output ([input] (response-get-metric-statistics-output nil input)) ([resultWrapper436006 input] (clojure.core/let [rawinput436005 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436007 {"Label" (portkey.aws/search-for-tag rawinput436005 "Label" :flattened? nil :result-wrapper resultWrapper436006), "Datapoints" (portkey.aws/search-for-tag rawinput436005 "Datapoints" :flattened? nil :result-wrapper resultWrapper436006)}] (clojure.core/cond-> {} (letvar436007 "Label") (clojure.core/assoc :label (deser-metric-label (clojure.core/get-in letvar436007 ["Label" :content]))) (letvar436007 "Datapoints") (clojure.core/assoc :datapoints (deser-datapoints (clojure.core/get-in letvar436007 ["Datapoints" :content])))))))

(clojure.core/defn- response-delete-dashboards-output ([input] (response-delete-dashboards-output nil input)) ([resultWrapper436009 input] (clojure.core/let [rawinput436008 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436010 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-service-fault ([input] (response-internal-service-fault nil input)) ([resultWrapper436012 input] (clojure.core/let [rawinput436011 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436013 {"Message" (portkey.aws/search-for-tag rawinput436011 "Message" :flattened? nil :result-wrapper resultWrapper436012)}] (clojure.core/cond-> {} (letvar436013 "Message") (clojure.core/assoc :message (deser-fault-description (clojure.core/get-in letvar436013 ["Message" :content])))))))

(clojure.core/defn- response-dashboard-not-found-error ([input] (response-dashboard-not-found-error nil input)) ([resultWrapper436015 input] (clojure.core/let [rawinput436014 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436016 {"message" (portkey.aws/search-for-tag rawinput436014 "message" :flattened? nil :result-wrapper resultWrapper436015)}] (clojure.core/cond-> {} (letvar436016 "message") (clojure.core/assoc :message (deser-dashboard-error-message (clojure.core/get-in letvar436016 ["message" :content])))))))

(clojure.core/defn- response-describe-alarms-for-metric-output ([input] (response-describe-alarms-for-metric-output nil input)) ([resultWrapper436018 input] (clojure.core/let [rawinput436017 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436019 {"MetricAlarms" (portkey.aws/search-for-tag rawinput436017 "MetricAlarms" :flattened? nil :result-wrapper resultWrapper436018)}] (clojure.core/cond-> {} (letvar436019 "MetricAlarms") (clojure.core/assoc :metric-alarms (deser-metric-alarms (clojure.core/get-in letvar436019 ["MetricAlarms" :content])))))))

(clojure.core/defn- response-limit-exceeded-fault ([input] (response-limit-exceeded-fault nil input)) ([resultWrapper436021 input] (clojure.core/let [rawinput436020 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436022 {"message" (portkey.aws/search-for-tag rawinput436020 "message" :flattened? nil :result-wrapper resultWrapper436021)}] (clojure.core/cond-> {} (letvar436022 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar436022 ["message" :content])))))))

(clojure.core/defn- response-dashboard-invalid-input-error ([input] (response-dashboard-invalid-input-error nil input)) ([resultWrapper436024 input] (clojure.core/let [rawinput436023 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436025 {"message" (portkey.aws/search-for-tag rawinput436023 "message" :flattened? nil :result-wrapper resultWrapper436024), "dashboardValidationMessages" (portkey.aws/search-for-tag rawinput436023 "dashboardValidationMessages" :flattened? nil :result-wrapper resultWrapper436024)}] (clojure.core/cond-> {} (letvar436025 "message") (clojure.core/assoc :message (deser-dashboard-error-message (clojure.core/get-in letvar436025 ["message" :content]))) (letvar436025 "dashboardValidationMessages") (clojure.core/assoc :dashboard-validation-messages (deser-dashboard-validation-messages (clojure.core/get-in letvar436025 ["dashboardValidationMessages" :content])))))))

(clojure.core/defn- response-get-dashboard-output ([input] (response-get-dashboard-output nil input)) ([resultWrapper436027 input] (clojure.core/let [rawinput436026 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436028 {"DashboardArn" (portkey.aws/search-for-tag rawinput436026 "DashboardArn" :flattened? nil :result-wrapper resultWrapper436027), "DashboardBody" (portkey.aws/search-for-tag rawinput436026 "DashboardBody" :flattened? nil :result-wrapper resultWrapper436027), "DashboardName" (portkey.aws/search-for-tag rawinput436026 "DashboardName" :flattened? nil :result-wrapper resultWrapper436027)}] (clojure.core/cond-> {} (letvar436028 "DashboardArn") (clojure.core/assoc :dashboard-arn (deser-dashboard-arn (clojure.core/get-in letvar436028 ["DashboardArn" :content]))) (letvar436028 "DashboardBody") (clojure.core/assoc :dashboard-body (deser-dashboard-body (clojure.core/get-in letvar436028 ["DashboardBody" :content]))) (letvar436028 "DashboardName") (clojure.core/assoc :dashboard-name (deser-dashboard-name (clojure.core/get-in letvar436028 ["DashboardName" :content])))))))

(clojure.core/defn- response-describe-alarm-history-output ([input] (response-describe-alarm-history-output nil input)) ([resultWrapper436030 input] (clojure.core/let [rawinput436029 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436031 {"AlarmHistoryItems" (portkey.aws/search-for-tag rawinput436029 "AlarmHistoryItems" :flattened? nil :result-wrapper resultWrapper436030), "NextToken" (portkey.aws/search-for-tag rawinput436029 "NextToken" :flattened? nil :result-wrapper resultWrapper436030)}] (clojure.core/cond-> {} (letvar436031 "AlarmHistoryItems") (clojure.core/assoc :alarm-history-items (deser-alarm-history-items (clojure.core/get-in letvar436031 ["AlarmHistoryItems" :content]))) (letvar436031 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar436031 ["NextToken" :content])))))))

(clojure.core/defn- response-invalid-parameter-combination-exception ([input] (response-invalid-parameter-combination-exception nil input)) ([resultWrapper436033 input] (clojure.core/let [rawinput436032 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436034 {"message" (portkey.aws/search-for-tag rawinput436032 "message" :flattened? nil :result-wrapper resultWrapper436033)}] (clojure.core/cond-> {} (letvar436034 "message") (clojure.core/assoc :message (deser-aws-query-error-message (clojure.core/get-in letvar436034 ["message" :content])))))))

(clojure.core/defn- response-list-dashboards-output ([input] (response-list-dashboards-output nil input)) ([resultWrapper436036 input] (clojure.core/let [rawinput436035 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436037 {"DashboardEntries" (portkey.aws/search-for-tag rawinput436035 "DashboardEntries" :flattened? nil :result-wrapper resultWrapper436036), "NextToken" (portkey.aws/search-for-tag rawinput436035 "NextToken" :flattened? nil :result-wrapper resultWrapper436036)}] (clojure.core/cond-> {} (letvar436037 "DashboardEntries") (clojure.core/assoc :dashboard-entries (deser-dashboard-entries (clojure.core/get-in letvar436037 ["DashboardEntries" :content]))) (letvar436037 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar436037 ["NextToken" :content])))))))

(clojure.core/defn- response-invalid-format-fault ([input] (response-invalid-format-fault nil input)) ([resultWrapper436039 input] (clojure.core/let [rawinput436038 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436040 {"message" (portkey.aws/search-for-tag rawinput436038 "message" :flattened? nil :result-wrapper resultWrapper436039)}] (clojure.core/cond-> {} (letvar436040 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar436040 ["message" :content])))))))

(clojure.core/defn- response-resource-not-found ([input] (response-resource-not-found nil input)) ([resultWrapper436042 input] (clojure.core/let [rawinput436041 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436043 {"message" (portkey.aws/search-for-tag rawinput436041 "message" :flattened? nil :result-wrapper resultWrapper436042)}] (clojure.core/cond-> {} (letvar436043 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar436043 ["message" :content])))))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper436045 input] (clojure.core/let [rawinput436044 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436046 {"message" (portkey.aws/search-for-tag rawinput436044 "message" :flattened? nil :result-wrapper resultWrapper436045)}] (clojure.core/cond-> {} (letvar436046 "message") (clojure.core/assoc :message (deser-aws-query-error-message (clojure.core/get-in letvar436046 ["message" :content])))))))

(clojure.core/defn- response-get-metric-widget-image-output ([input] (response-get-metric-widget-image-output nil input)) ([resultWrapper436048 input] (clojure.core/let [rawinput436047 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436049 {"MetricWidgetImage" (portkey.aws/search-for-tag rawinput436047 "MetricWidgetImage" :flattened? nil :result-wrapper resultWrapper436048)}] (clojure.core/cond-> {} (letvar436049 "MetricWidgetImage") (clojure.core/assoc :metric-widget-image (deser-metric-widget-image (clojure.core/get-in letvar436049 ["MetricWidgetImage" :content])))))))

(clojure.core/defn- response-list-metrics-output ([input] (response-list-metrics-output nil input)) ([resultWrapper436051 input] (clojure.core/let [rawinput436050 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436052 {"Metrics" (portkey.aws/search-for-tag rawinput436050 "Metrics" :flattened? nil :result-wrapper resultWrapper436051), "NextToken" (portkey.aws/search-for-tag rawinput436050 "NextToken" :flattened? nil :result-wrapper resultWrapper436051)}] (clojure.core/cond-> {} (letvar436052 "Metrics") (clojure.core/assoc :metrics (deser-metrics (clojure.core/get-in letvar436052 ["Metrics" :content]))) (letvar436052 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar436052 ["NextToken" :content])))))))

(clojure.core/defn- response-invalid-next-token ([input] (response-invalid-next-token nil input)) ([resultWrapper436054 input] (clojure.core/let [rawinput436053 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar436055 {"message" (portkey.aws/search-for-tag rawinput436053 "message" :flattened? nil :result-wrapper resultWrapper436054)}] (clojure.core/cond-> {} (letvar436055 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar436055 ["message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/standard-unit #{:kilobytes-second :megabits "Terabytes" :bits-second :count-second :kilobits "Kilobits/Second" "Count" :megabytes-second "Bits" "Percent" "Gigabits/Second" :terabytes :terabits-second "None" :seconds :bits :terabits :bytes-second :kilobytes :microseconds "Count/Second" "Bytes" "Gigabytes/Second" :megabits-second "Megabits/Second" :gigabits "Kilobytes/Second" :gigabits-second :kilobits-second :megabytes "Terabytes/Second" "Bits/Second" "Bytes/Second" "Milliseconds" :count :gigabytes-second "Kilobytes" :bytes :milliseconds "Microseconds" :percent "Terabits" :gigabytes "Megabytes/Second" :terabytes-second "Gigabytes" "Gigabits" "Megabits" :none "Kilobits" "Terabits/Second" "Megabytes" "Seconds"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/storage-resolution (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimension-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-widget-image clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/start-time (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/end-time (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/max-datapoints (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/get-metric-data-max-datapoints))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-data-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/metric-data-queries :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/start-time :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/end-time] :opt-un [:portkey.aws.monitoring.-2010-08-01/next-token :portkey.aws.monitoring.-2010-08-01/scan-by :portkey.aws.monitoring.-2010-08-01.get-metric-data-input/max-datapoints]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/treat-missing-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/history-item-type #{:configuration-update :state-update "ConfigurationUpdate" "StateUpdate" :action "Action"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/period (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.message-data/code (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/message-data-code))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.message-data/value (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/message-data-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/message-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.message-data/code :portkey.aws.monitoring.-2010-08-01.message-data/value]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.missing-required-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/aws-query-error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/missing-required-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.missing-required-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/threshold clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/data-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/set-alarm-state-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/alarm-name :portkey.aws.monitoring.-2010-08-01/state-value :portkey.aws.monitoring.-2010-08-01/state-reason] :opt-un [:portkey.aws.monitoring.-2010-08-01/state-reason-data]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/status-code #{"InternalError" :partial-data :internal-error "PartialData" "Complete" :complete})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data-result-messages (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/message-data))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/counts (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/datapoint-value))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimension-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimension-filters (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/dimension-filter :max-count 10))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarms-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/metric-alarms :portkey.aws.monitoring.-2010-08-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/put-metric-data-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/namespace :portkey.aws.monitoring.-2010-08-01/metric-data] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/disable-alarm-actions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/alarm-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-stat/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-stat (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/metric :portkey.aws.monitoring.-2010-08-01/period :portkey.aws.monitoring.-2010-08-01/stat] :opt-un [:portkey.aws.monitoring.-2010-08-01.metric-stat/unit]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarms-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/alarm-names :portkey.aws.monitoring.-2010-08-01/alarm-name-prefix :portkey.aws.monitoring.-2010-08-01/state-value :portkey.aws.monitoring.-2010-08-01/action-prefix :portkey.aws.monitoring.-2010-08-01/max-records :portkey.aws.monitoring.-2010-08-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/state-value #{:alarm :insufficient-data "ALARM" "OK" :ok "INSUFFICIENT_DATA"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-data-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/metric-data-results :portkey.aws.monitoring.-2010-08-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.list-metrics-input/dimensions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dimension-filters))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/list-metrics-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/namespace :portkey.aws.monitoring.-2010-08-01/metric-name :portkey.aws.monitoring.-2010-08-01.list-metrics-input/dimensions :portkey.aws.monitoring.-2010-08-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/put-dashboard-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/dashboard-validation-messages]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/max-records (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dimension/name (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dimension-name))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dimension/value (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dimension-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimension (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01.dimension/name :portkey.aws.monitoring.-2010-08-01.dimension/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/comparison-operator #{"LessThanThreshold" :greater-than-threshold :less-than-threshold "GreaterThanThreshold" "LessThanOrEqualToThreshold" :greater-than-or-equal-to-threshold :less-than-or-equal-to-threshold "GreaterThanOrEqualToThreshold"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/history-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 4095))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-output/label (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-label))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.get-metric-statistics-output/label :portkey.aws.monitoring.-2010-08-01/datapoints]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/end-time (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/start-time (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/namespace :portkey.aws.monitoring.-2010-08-01/metric-name :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/start-time :portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/end-time :portkey.aws.monitoring.-2010-08-01/period] :opt-un [:portkey.aws.monitoring.-2010-08-01.get-metric-statistics-input/unit :portkey.aws.monitoring.-2010-08-01/extended-statistics :portkey.aws.monitoring.-2010-08-01/dimensions :portkey.aws.monitoring.-2010-08-01/statistics]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/sample-count (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/average (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/sum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/minimum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/maximum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.datapoint/extended-statistics (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value-map))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/timestamp :portkey.aws.monitoring.-2010-08-01.datapoint/sample-count :portkey.aws.monitoring.-2010-08-01.datapoint/average :portkey.aws.monitoring.-2010-08-01.datapoint/sum :portkey.aws.monitoring.-2010-08-01.datapoint/minimum :portkey.aws.monitoring.-2010-08-01.datapoint/maximum :portkey.aws.monitoring.-2010-08-01.datapoint/unit :portkey.aws.monitoring.-2010-08-01.datapoint/extended-statistics]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-result/id (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-id))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-result/label (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-label))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-result/values (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-values))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-result/messages (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-data-result-messages))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.metric-data-result/id :portkey.aws.monitoring.-2010-08-01.metric-data-result/label :portkey.aws.monitoring.-2010-08-01/timestamps :portkey.aws.monitoring.-2010-08-01.metric-data-result/values :portkey.aws.monitoring.-2010-08-01/status-code :portkey.aws.monitoring.-2010-08-01.metric-data-result/messages]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-entries (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/dashboard-entry))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-widget (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-name-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 0 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-data-max-datapoints clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/delete-dashboards-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.internal-service-fault/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/fault-description))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/internal-service-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.internal-service-fault/message]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-validation-message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/data-path :portkey.aws.monitoring.-2010-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/dashboard-name :portkey.aws.monitoring.-2010-08-01/dashboard-arn :portkey.aws.monitoring.-2010-08-01/last-modified :portkey.aws.monitoring.-2010-08-01/size]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dashboard-not-found-error/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dashboard-error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-not-found-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.dashboard-not-found-error/message]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/metric-alarms]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/history-summary (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/state-reason-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 0 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 4000))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-validation-messages (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/dashboard-validation-message))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/ok-actions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/state-updated-timestamp (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/insufficient-data-actions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/alarm-actions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/alarm-configuration-updated-timestamp (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-alarm/metrics (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-data-queries))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-alarm (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.metric-alarm/unit :portkey.aws.monitoring.-2010-08-01/treat-missing-data :portkey.aws.monitoring.-2010-08-01/period :portkey.aws.monitoring.-2010-08-01/threshold :portkey.aws.monitoring.-2010-08-01.metric-alarm/ok-actions :portkey.aws.monitoring.-2010-08-01/state-value :portkey.aws.monitoring.-2010-08-01.metric-alarm/state-updated-timestamp :portkey.aws.monitoring.-2010-08-01.metric-alarm/insufficient-data-actions :portkey.aws.monitoring.-2010-08-01/comparison-operator :portkey.aws.monitoring.-2010-08-01/state-reason-data :portkey.aws.monitoring.-2010-08-01/dimensions :portkey.aws.monitoring.-2010-08-01/datapoints-to-alarm :portkey.aws.monitoring.-2010-08-01/namespace :portkey.aws.monitoring.-2010-08-01.metric-alarm/alarm-actions :portkey.aws.monitoring.-2010-08-01/evaluate-low-sample-count-percentile :portkey.aws.monitoring.-2010-08-01/alarm-description :portkey.aws.monitoring.-2010-08-01/alarm-name :portkey.aws.monitoring.-2010-08-01/extended-statistic :portkey.aws.monitoring.-2010-08-01/metric-name :portkey.aws.monitoring.-2010-08-01/alarm-arn :portkey.aws.monitoring.-2010-08-01.metric-alarm/alarm-configuration-updated-timestamp :portkey.aws.monitoring.-2010-08-01/evaluation-periods :portkey.aws.monitoring.-2010-08-01/state-reason :portkey.aws.monitoring.-2010-08-01/statistic :portkey.aws.monitoring.-2010-08-01/actions-enabled :portkey.aws.monitoring.-2010-08-01.metric-alarm/metrics]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/delete-dashboards-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/dashboard-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-history-items (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/alarm-history-item))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/extended-statistics (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/extended-statistic :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.limit-exceeded-fault/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/limit-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.limit-exceeded-fault/message]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-history-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/alarm-name :portkey.aws.monitoring.-2010-08-01/timestamp :portkey.aws.monitoring.-2010-08-01/history-item-type :portkey.aws.monitoring.-2010-08-01/history-summary :portkey.aws.monitoring.-2010-08-01/history-data]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-dashboard-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/dashboard-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimensions (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/dimension :max-count 10))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/output-format (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoints-to-alarm (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-label (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dashboard-invalid-input-error/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dashboard-error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dashboard-invalid-input-error/dashboard-validation-messages (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dashboard-validation-messages))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-invalid-input-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.dashboard-invalid-input-error/message :portkey.aws.monitoring.-2010-08-01.dashboard-invalid-input-error/dashboard-validation-messages]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/namespace (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[^:].*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/put-dashboard-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/dashboard-name :portkey.aws.monitoring.-2010-08-01/dashboard-body] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/message-data-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/timestamps (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/timestamp))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/last-modified clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/values (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/datapoint-value))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.statistic-set/sample-count (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.statistic-set/sum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.statistic-set/minimum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.statistic-set/maximum (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/statistic-set (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01.statistic-set/sample-count :portkey.aws.monitoring.-2010-08-01.statistic-set/sum :portkey.aws.monitoring.-2010-08-01.statistic-set/minimum :portkey.aws.monitoring.-2010-08-01.statistic-set/maximum] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/action-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-dashboard-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/dashboard-arn :portkey.aws.monitoring.-2010-08-01/dashboard-body :portkey.aws.monitoring.-2010-08-01/dashboard-name]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-name-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/ok-actions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/insufficient-data-actions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/alarm-actions (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/resource-list))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/metrics (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-data-queries))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/put-metric-alarm-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/alarm-name :portkey.aws.monitoring.-2010-08-01/evaluation-periods :portkey.aws.monitoring.-2010-08-01/threshold :portkey.aws.monitoring.-2010-08-01/comparison-operator] :opt-un [:portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/unit :portkey.aws.monitoring.-2010-08-01/treat-missing-data :portkey.aws.monitoring.-2010-08-01/period :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/ok-actions :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/insufficient-data-actions :portkey.aws.monitoring.-2010-08-01/dimensions :portkey.aws.monitoring.-2010-08-01/datapoints-to-alarm :portkey.aws.monitoring.-2010-08-01/namespace :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/alarm-actions :portkey.aws.monitoring.-2010-08-01/evaluate-low-sample-count-percentile :portkey.aws.monitoring.-2010-08-01/alarm-description :portkey.aws.monitoring.-2010-08-01/extended-statistic :portkey.aws.monitoring.-2010-08-01/metric-name :portkey.aws.monitoring.-2010-08-01/statistic :portkey.aws.monitoring.-2010-08-01/actions-enabled :portkey.aws.monitoring.-2010-08-01.put-metric-alarm-input/metrics]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/alarm-history-items :portkey.aws.monitoring.-2010-08-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-widget-image-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/metric-widget] :opt-un [:portkey.aws.monitoring.-2010-08-01/output-format]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/evaluate-low-sample-count-percentile (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/return-data clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/enable-alarm-actions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/alarm-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 0 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/namespace :portkey.aws.monitoring.-2010-08-01/metric-name :portkey.aws.monitoring.-2010-08-01/dimensions]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dimension-filter/name (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dimension-name))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.dimension-filter/value (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/dimension-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dimension-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01.dimension-filter/name] :opt-un [:portkey.aws.monitoring.-2010-08-01.dimension-filter/value]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/resource-list (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/resource-name :max-count 5))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/stat (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.invalid-parameter-combination-exception/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/aws-query-error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/invalid-parameter-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.invalid-parameter-combination-exception/message]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/extended-statistic (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"p(\d{1,2}(\.\d{0,2})?|100)" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoint-value-map (clojure.spec.alpha/map-of :portkey.aws.monitoring.-2010-08-01/extended-statistic :portkey.aws.monitoring.-2010-08-01/datapoint-value))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-body (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-datum/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-datum/statistic-values (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/statistic-set))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-datum/value (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/datapoint-value))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-datum (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/metric-name] :opt-un [:portkey.aws.monitoring.-2010-08-01/storage-resolution :portkey.aws.monitoring.-2010-08-01.metric-datum/unit :portkey.aws.monitoring.-2010-08-01/counts :portkey.aws.monitoring.-2010-08-01.metric-datum/statistic-values :portkey.aws.monitoring.-2010-08-01.metric-datum/value :portkey.aws.monitoring.-2010-08-01/dimensions :portkey.aws.monitoring.-2010-08-01/values :portkey.aws.monitoring.-2010-08-01/timestamp]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-alarms (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/metric-alarm))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-query/id (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-id))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-query/expression (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-expression))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.metric-data-query/label (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/metric-label))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data-query (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01.metric-data-query/id] :opt-un [:portkey.aws.monitoring.-2010-08-01/metric-stat :portkey.aws.monitoring.-2010-08-01.metric-data-query/expression :portkey.aws.monitoring.-2010-08-01.metric-data-query/label :portkey.aws.monitoring.-2010-08-01/return-data]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/statistics (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/statistic :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.describe-alarms-for-metric-input/unit (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/standard-unit))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/metric-name :portkey.aws.monitoring.-2010-08-01/namespace] :opt-un [:portkey.aws.monitoring.-2010-08-01/statistic :portkey.aws.monitoring.-2010-08-01/extended-statistic :portkey.aws.monitoring.-2010-08-01/dimensions :portkey.aws.monitoring.-2010-08-01/period :portkey.aws.monitoring.-2010-08-01.describe-alarms-for-metric-input/unit]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/list-dashboards-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/dashboard-name-prefix :portkey.aws.monitoring.-2010-08-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/list-dashboards-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/dashboard-entries :portkey.aws.monitoring.-2010-08-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.invalid-format-fault/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/invalid-format-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.invalid-format-fault/message]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/metric-datum))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/dashboard-names (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/dashboard-name))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoints (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/datapoint))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data-queries (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/metric-data-query))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/delete-alarms-input (clojure.spec.alpha/keys :req-un [:portkey.aws.monitoring.-2010-08-01/alarm-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/evaluation-periods (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.resource-not-found/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/resource-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.resource-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/aws-query-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/aws-query-error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/message-data-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/get-metric-widget-image-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/metric-widget-image]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoint-value clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/state-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 0 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1023))))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/scan-by #{:timestamp-ascending "TimestampDescending" :timestamp-descending "TimestampAscending"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/statistic #{"Sum" "Average" :maximum "SampleCount" "Minimum" :sample-count :minimum :average :sum "Maximum"})

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/list-metrics-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/metrics :portkey.aws.monitoring.-2010-08-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.invalid-next-token/message (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/error-message))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/invalid-next-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01.invalid-next-token/message]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.describe-alarm-history-input/start-date (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01.describe-alarm-history-input/end-date (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.monitoring.-2010-08-01/alarm-name :portkey.aws.monitoring.-2010-08-01/history-item-type :portkey.aws.monitoring.-2010-08-01.describe-alarm-history-input/start-date :portkey.aws.monitoring.-2010-08-01.describe-alarm-history-input/end-date :portkey.aws.monitoring.-2010-08-01/max-records :portkey.aws.monitoring.-2010-08-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/alarm-names (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/alarm-name :max-count 100))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/actions-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/fault-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metric-data-results (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/metric-data-result))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/datapoint-values (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/datapoint-value))

(clojure.spec.alpha/def :portkey.aws.monitoring.-2010-08-01/metrics (clojure.spec.alpha/coll-of :portkey.aws.monitoring.-2010-08-01/metric))

(clojure.core/defn delete-dashboards ([delete-dashboards-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-dashboards-input delete-dashboards-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/delete-dashboards-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/delete-dashboards-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteDashboardsResult", :http.request.configuration/action "DeleteDashboards", :http.request.configuration/output-deser-fn response-delete-dashboards-output, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception, "DashboardNotFoundError" :portkey.aws.monitoring.-2010-08-01/dashboard-not-found-error, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}})))))
(clojure.spec.alpha/fdef delete-dashboards :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/delete-dashboards-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/delete-dashboards-output))

(clojure.core/defn delete-alarms ([delete-alarms-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-alarms-input delete-alarms-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/delete-alarms-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAlarms", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.monitoring.-2010-08-01/resource-not-found}})))))
(clojure.spec.alpha/fdef delete-alarms :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/delete-alarms-input) :ret clojure.core/true?)

(clojure.core/defn describe-alarms ([] (describe-alarms {})) ([describe-alarms-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-alarms-input describe-alarms-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/describe-alarms-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/describe-alarms-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAlarmsResult", :http.request.configuration/action "DescribeAlarms", :http.request.configuration/output-deser-fn response-describe-alarms-output, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.monitoring.-2010-08-01/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-alarms :args (clojure.spec.alpha/? :portkey.aws.monitoring.-2010-08-01/describe-alarms-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/describe-alarms-output))

(clojure.core/defn get-metric-statistics ([get-metric-statistics-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-metric-statistics-input get-metric-statistics-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetMetricStatisticsResult", :http.request.configuration/action "GetMetricStatistics", :http.request.configuration/output-deser-fn response-get-metric-statistics-output, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception, "MissingRequiredParameterException" :portkey.aws.monitoring.-2010-08-01/missing-required-parameter-exception, "InvalidParameterCombinationException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-combination-exception, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}})))))
(clojure.spec.alpha/fdef get-metric-statistics :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/get-metric-statistics-output))

(clojure.core/defn list-dashboards ([] (list-dashboards {})) ([list-dashboards-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-dashboards-input list-dashboards-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/list-dashboards-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/list-dashboards-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListDashboardsResult", :http.request.configuration/action "ListDashboards", :http.request.configuration/output-deser-fn response-list-dashboards-output, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}})))))
(clojure.spec.alpha/fdef list-dashboards :args (clojure.spec.alpha/? :portkey.aws.monitoring.-2010-08-01/list-dashboards-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/list-dashboards-output))

(clojure.core/defn put-dashboard ([put-dashboard-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-dashboard-input put-dashboard-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/put-dashboard-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/put-dashboard-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "PutDashboardResult", :http.request.configuration/action "PutDashboard", :http.request.configuration/output-deser-fn response-put-dashboard-output, :http.request.spec/error-spec {"DashboardInvalidInputError" :portkey.aws.monitoring.-2010-08-01/dashboard-invalid-input-error, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}})))))
(clojure.spec.alpha/fdef put-dashboard :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/put-dashboard-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/put-dashboard-output))

(clojure.core/defn enable-alarm-actions ([enable-alarm-actions-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-enable-alarm-actions-input enable-alarm-actions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/enable-alarm-actions-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableAlarmActions", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef enable-alarm-actions :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/enable-alarm-actions-input) :ret clojure.core/true?)

(clojure.core/defn list-metrics ([] (list-metrics {})) ([list-metrics-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-metrics-input list-metrics-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/list-metrics-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/list-metrics-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListMetricsResult", :http.request.configuration/action "ListMetrics", :http.request.configuration/output-deser-fn response-list-metrics-output, :http.request.spec/error-spec {"InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault, "InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef list-metrics :args (clojure.spec.alpha/? :portkey.aws.monitoring.-2010-08-01/list-metrics-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/list-metrics-output))

(clojure.core/defn put-metric-data ([put-metric-data-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-metric-data-input put-metric-data-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/put-metric-data-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutMetricData", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception, "MissingRequiredParameterException" :portkey.aws.monitoring.-2010-08-01/missing-required-parameter-exception, "InvalidParameterCombinationException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-combination-exception, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}})))))
(clojure.spec.alpha/fdef put-metric-data :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/put-metric-data-input) :ret clojure.core/true?)

(clojure.core/defn describe-alarms-for-metric ([describe-alarms-for-metric-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-alarms-for-metric-input describe-alarms-for-metric-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAlarmsForMetricResult", :http.request.configuration/action "DescribeAlarmsForMetric", :http.request.configuration/output-deser-fn response-describe-alarms-for-metric-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-alarms-for-metric :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/describe-alarms-for-metric-output))

(clojure.core/defn set-alarm-state ([set-alarm-state-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-alarm-state-input set-alarm-state-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/set-alarm-state-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetAlarmState", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.monitoring.-2010-08-01/resource-not-found, "InvalidFormatFault" :portkey.aws.monitoring.-2010-08-01/invalid-format-fault}})))))
(clojure.spec.alpha/fdef set-alarm-state :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/set-alarm-state-input) :ret clojure.core/true?)

(clojure.core/defn get-metric-widget-image ([get-metric-widget-image-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-metric-widget-image-input get-metric-widget-image-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/get-metric-widget-image-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/get-metric-widget-image-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetMetricWidgetImageResult", :http.request.configuration/action "GetMetricWidgetImage", :http.request.configuration/output-deser-fn response-get-metric-widget-image-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-metric-widget-image :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/get-metric-widget-image-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/get-metric-widget-image-output))

(clojure.core/defn put-metric-alarm ([put-metric-alarm-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-metric-alarm-input put-metric-alarm-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/put-metric-alarm-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutMetricAlarm", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.monitoring.-2010-08-01/limit-exceeded-fault}})))))
(clojure.spec.alpha/fdef put-metric-alarm :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/put-metric-alarm-input) :ret clojure.core/true?)

(clojure.core/defn get-dashboard ([get-dashboard-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-dashboard-input get-dashboard-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/get-dashboard-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/get-dashboard-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetDashboardResult", :http.request.configuration/action "GetDashboard", :http.request.configuration/output-deser-fn response-get-dashboard-output, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.monitoring.-2010-08-01/invalid-parameter-value-exception, "DashboardNotFoundError" :portkey.aws.monitoring.-2010-08-01/dashboard-not-found-error, "InternalServiceFault" :portkey.aws.monitoring.-2010-08-01/internal-service-fault}})))))
(clojure.spec.alpha/fdef get-dashboard :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/get-dashboard-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/get-dashboard-output))

(clojure.core/defn get-metric-data ([get-metric-data-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-metric-data-input get-metric-data-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/get-metric-data-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/get-metric-data-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetMetricDataResult", :http.request.configuration/action "GetMetricData", :http.request.configuration/output-deser-fn response-get-metric-data-output, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.monitoring.-2010-08-01/invalid-next-token}})))))
(clojure.spec.alpha/fdef get-metric-data :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/get-metric-data-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/get-metric-data-output))

(clojure.core/defn disable-alarm-actions ([disable-alarm-actions-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-disable-alarm-actions-input disable-alarm-actions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/disable-alarm-actions-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableAlarmActions", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef disable-alarm-actions :args (clojure.spec.alpha/tuple :portkey.aws.monitoring.-2010-08-01/disable-alarm-actions-input) :ret clojure.core/true?)

(clojure.core/defn describe-alarm-history ([] (describe-alarm-history {})) ([describe-alarm-history-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-alarm-history-input describe-alarm-history-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.monitoring.-2010-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-08-01", :http.request.configuration/service-id "CloudWatch", :http.request.spec/input-spec :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAlarmHistoryResult", :http.request.configuration/action "DescribeAlarmHistory", :http.request.configuration/output-deser-fn response-describe-alarm-history-output, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.monitoring.-2010-08-01/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-alarm-history :args (clojure.spec.alpha/? :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-input) :ret (clojure.spec.alpha/and :portkey.aws.monitoring.-2010-08-01/describe-alarm-history-output))
