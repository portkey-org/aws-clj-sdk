(ns portkey.aws.sns (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "sns", :region "us-gov-east-1"},
    :ssl-common-name "sns.us-gov-east-1.amazonaws.com",
    :endpoint "https://sns.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "sns", :region "ap-northeast-1"},
    :ssl-common-name "sns.ap-northeast-1.amazonaws.com",
    :endpoint "https://sns.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "sns", :region "eu-west-1"},
    :ssl-common-name "sns.eu-west-1.amazonaws.com",
    :endpoint "https://sns.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "sns", :region "us-east-2"},
    :ssl-common-name "sns.us-east-2.amazonaws.com",
    :endpoint "https://sns.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "sns", :region "ap-southeast-2"},
    :ssl-common-name "sns.ap-southeast-2.amazonaws.com",
    :endpoint "https://sns.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "sns", :region "cn-north-1"},
    :ssl-common-name "sns.cn-north-1.amazonaws.com.cn",
    :endpoint "https://sns.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "sns", :region "sa-east-1"},
    :ssl-common-name "sns.sa-east-1.amazonaws.com",
    :endpoint "https://sns.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "sns", :region "ap-southeast-1"},
    :ssl-common-name "sns.ap-southeast-1.amazonaws.com",
    :endpoint "https://sns.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "sns", :region "cn-northwest-1"},
    :ssl-common-name "sns.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://sns.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "sns", :region "ap-northeast-2"},
    :ssl-common-name "sns.ap-northeast-2.amazonaws.com",
    :endpoint "https://sns.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "sns", :region "eu-west-3"},
    :ssl-common-name "sns.eu-west-3.amazonaws.com",
    :endpoint "https://sns.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "sns", :region "ca-central-1"},
    :ssl-common-name "sns.ca-central-1.amazonaws.com",
    :endpoint "https://sns.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "sns", :region "eu-central-1"},
    :ssl-common-name "sns.eu-central-1.amazonaws.com",
    :endpoint "https://sns.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "sns", :region "eu-west-2"},
    :ssl-common-name "sns.eu-west-2.amazonaws.com",
    :endpoint "https://sns.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "sns", :region "us-gov-west-1"},
    :ssl-common-name "sns.us-gov-west-1.amazonaws.com",
    :endpoint "https://sns.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "sns", :region "us-west-2"},
    :ssl-common-name "sns.us-west-2.amazonaws.com",
    :endpoint "https://sns.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "sns", :region "us-east-1"},
    :ssl-common-name "sns.us-east-1.amazonaws.com",
    :endpoint "https://sns.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "sns", :region "us-west-1"},
    :ssl-common-name "sns.us-west-1.amazonaws.com",
    :endpoint "https://sns.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "sns", :region "ap-south-1"},
    :ssl-common-name "sns.ap-south-1.amazonaws.com",
    :endpoint "https://sns.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "sns", :region "eu-north-1"},
    :ssl-common-name "sns.eu-north-1.amazonaws.com",
    :endpoint "https://sns.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-topic-attributes-map)

(clojure.core/declare serboolean)

(clojure.core/declare sermessage)

(clojure.core/declare serprotocol)

(clojure.core/declare sersubscription-arn)

(clojure.core/declare serattribute-name)

(clojure.core/declare sertoken)

(clojure.core/declare serstring)

(clojure.core/declare ser-list-string)

(clojure.core/declare serlabel)

(clojure.core/declare ser-subscription-attributes-map)

(clojure.core/declare ser-delegates-list)

(clojure.core/declare sernext-token)

(clojure.core/declare sermessage-structure)

(clojure.core/declare ser-message-attribute-value)

(clojure.core/declare seraction)

(clojure.core/declare sersubject)

(clojure.core/declare ser-string)

(clojure.core/declare serdelegate)

(clojure.core/declare ser-actions-list)

(clojure.core/declare ser-binary)

(clojure.core/declare ser-map-string-to-string)

(clojure.core/declare serendpoint)

(clojure.core/declare sertopic-arn)

(clojure.core/declare ser-message-attribute-map)

(clojure.core/declare serattribute-value)

(clojure.core/declare sertopic-name)

(clojure.core/declare serauthenticate-on-unsubscribe)

(clojure.core/declare ser-phone-number)

(clojure.core/defn- ser-topic-attributes-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (serattribute-name k) #:http.request.field{:map-info "key", :shape "attributeName"}) (clojure.core/into (serattribute-value v) #:http.request.field{:map-info "value", :shape "attributeValue"})])) input), :shape "TopicAttributesMap", :type "map"})

(clojure.core/defn- serboolean [input] #:http.request.field{:value input, :shape "boolean"})

(clojure.core/defn- sermessage [input] #:http.request.field{:value input, :shape "message"})

(clojure.core/defn- serprotocol [input] #:http.request.field{:value input, :shape "protocol"})

(clojure.core/defn- sersubscription-arn [input] #:http.request.field{:value input, :shape "subscriptionARN"})

(clojure.core/defn- serattribute-name [input] #:http.request.field{:value input, :shape "attributeName"})

(clojure.core/defn- sertoken [input] #:http.request.field{:value input, :shape "token"})

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-list-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "ListString", :type "list"})

(clojure.core/defn- serlabel [input] #:http.request.field{:value input, :shape "label"})

(clojure.core/defn- ser-subscription-attributes-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (serattribute-name k) #:http.request.field{:map-info "key", :shape "attributeName"}) (clojure.core/into (serattribute-value v) #:http.request.field{:map-info "value", :shape "attributeValue"})])) input), :shape "SubscriptionAttributesMap", :type "map"})

(clojure.core/defn- ser-delegates-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serdelegate coll) #:http.request.field{:shape "delegate"}))) input), :shape "DelegatesList", :type "list"})

(clojure.core/defn- sernext-token [input] #:http.request.field{:value input, :shape "nextToken"})

(clojure.core/defn- sermessage-structure [input] #:http.request.field{:value input, :shape "messageStructure"})

(clojure.core/defn- ser-message-attribute-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:data-type input)) #:http.request.field{:name "DataType", :shape "String"})], :shape "MessageAttributeValue", :type "structure"} (clojure.core/contains? input :string-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :string-value)) #:http.request.field{:name "StringValue", :shape "String"})) (clojure.core/contains? input :binary-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-binary (input :binary-value)) #:http.request.field{:name "BinaryValue", :shape "Binary"}))))

(clojure.core/defn- seraction [input] #:http.request.field{:value input, :shape "action"})

(clojure.core/defn- sersubject [input] #:http.request.field{:value input, :shape "subject"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- serdelegate [input] #:http.request.field{:value input, :shape "delegate"})

(clojure.core/defn- ser-actions-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (seraction coll) #:http.request.field{:shape "action"}))) input), :shape "ActionsList", :type "list"})

(clojure.core/defn- ser-binary [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Binary"})

(clojure.core/defn- ser-map-string-to-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "MapStringToString", :type "map"})

(clojure.core/defn- serendpoint [input] #:http.request.field{:value input, :shape "endpoint"})

(clojure.core/defn- sertopic-arn [input] #:http.request.field{:value input, :shape "topicARN"})

(clojure.core/defn- ser-message-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String", :location-name "Name"}) (clojure.core/into (ser-message-attribute-value v) #:http.request.field{:map-info "value", :shape "MessageAttributeValue", :location-name "Value"})])) input), :shape "MessageAttributeMap", :type "map"})

(clojure.core/defn- serattribute-value [input] #:http.request.field{:value input, :shape "attributeValue"})

(clojure.core/defn- sertopic-name [input] #:http.request.field{:value input, :shape "topicName"})

(clojure.core/defn- serauthenticate-on-unsubscribe [input] #:http.request.field{:value input, :shape "authenticateOnUnsubscribe"})

(clojure.core/defn- ser-phone-number [input] #:http.request.field{:value input, :shape "PhoneNumber"})

(clojure.core/defn- req-delete-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"})]}))

(clojure.core/defn- req-get-subscription-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sersubscription-arn (input :subscription-arn)) #:http.request.field{:name "SubscriptionArn", :shape "subscriptionARN"})]}))

(clojure.core/defn- req-list-phone-numbers-opted-out-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :next-token)) #:http.request.field{:name "nextToken", :shape "string"}))))

(clojure.core/defn- req-set-platform-application-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :platform-application-arn)) #:http.request.field{:name "PlatformApplicationArn", :shape "String"}) (clojure.core/into (ser-map-string-to-string (input :attributes)) #:http.request.field{:name "Attributes", :shape "MapStringToString"})]}))

(clojure.core/defn- req-subscribe-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"}) (clojure.core/into (serprotocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "protocol"})]} (clojure.core/contains? input :endpoint) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serendpoint (input :endpoint)) #:http.request.field{:name "Endpoint", :shape "endpoint"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subscription-attributes-map (input :attributes)) #:http.request.field{:name "Attributes", :shape "SubscriptionAttributesMap"})) (clojure.core/contains? input :return-subscription-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :return-subscription-arn)) #:http.request.field{:name "ReturnSubscriptionArn", :shape "boolean"}))))

(clojure.core/defn- req-get-sms-attributes-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-string (input :attributes)) #:http.request.field{:name "attributes", :shape "ListString"}))))

(clojure.core/defn- req-publish-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sermessage (input :message)) #:http.request.field{:name "Message", :shape "message"})]} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"})) (clojure.core/contains? input :target-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :target-arn)) #:http.request.field{:name "TargetArn", :shape "String"})) (clojure.core/contains? input :phone-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :phone-number)) #:http.request.field{:name "PhoneNumber", :shape "String"})) (clojure.core/contains? input :subject) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sersubject (input :subject)) #:http.request.field{:name "Subject", :shape "subject"})) (clojure.core/contains? input :message-structure) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermessage-structure (input :message-structure)) #:http.request.field{:name "MessageStructure", :shape "messageStructure"})) (clojure.core/contains? input :message-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-attribute-map (input :message-attributes)) #:http.request.field{:name "MessageAttributes", :shape "MessageAttributeMap"}))))

(clojure.core/defn- req-list-topics-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sernext-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "nextToken"}))))

(clojure.core/defn- req-get-platform-application-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :platform-application-arn)) #:http.request.field{:name "PlatformApplicationArn", :shape "String"})]}))

(clojure.core/defn- req-list-platform-applications-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-list-subscriptions-by-topic-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sernext-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "nextToken"}))))

(clojure.core/defn- req-get-topic-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"})]}))

(clojure.core/defn- req-create-platform-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :platform-application-arn)) #:http.request.field{:name "PlatformApplicationArn", :shape "String"}) (clojure.core/into (ser-string (input :token)) #:http.request.field{:name "Token", :shape "String"})]} (clojure.core/contains? input :custom-user-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :custom-user-data)) #:http.request.field{:name "CustomUserData", :shape "String"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-string-to-string (input :attributes)) #:http.request.field{:name "Attributes", :shape "MapStringToString"}))))

(clojure.core/defn- req-create-topic-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-name (input :name)) #:http.request.field{:name "Name", :shape "topicName"})]} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topic-attributes-map (input :attributes)) #:http.request.field{:name "Attributes", :shape "TopicAttributesMap"}))))

(clojure.core/defn- req-create-platform-application-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (input :platform)) #:http.request.field{:name "Platform", :shape "String"}) (clojure.core/into (ser-map-string-to-string (input :attributes)) #:http.request.field{:name "Attributes", :shape "MapStringToString"})]}))

(clojure.core/defn- req-remove-permission-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"}) (clojure.core/into (serlabel (input :label)) #:http.request.field{:name "Label", :shape "label"})]}))

(clojure.core/defn- req-set-endpoint-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"}) (clojure.core/into (ser-map-string-to-string (input :attributes)) #:http.request.field{:name "Attributes", :shape "MapStringToString"})]}))

(clojure.core/defn- req-delete-platform-application-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :platform-application-arn)) #:http.request.field{:name "PlatformApplicationArn", :shape "String"})]}))

(clojure.core/defn- req-delete-topic-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"})]}))

(clojure.core/defn- req-get-endpoint-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :endpoint-arn)) #:http.request.field{:name "EndpointArn", :shape "String"})]}))

(clojure.core/defn- req-opt-in-phone-number-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-phone-number (input :phone-number)) #:http.request.field{:name "phoneNumber", :shape "PhoneNumber"})]}))

(clojure.core/defn- req-unsubscribe-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sersubscription-arn (input :subscription-arn)) #:http.request.field{:name "SubscriptionArn", :shape "subscriptionARN"})]}))

(clojure.core/defn- req-set-subscription-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sersubscription-arn (input :subscription-arn)) #:http.request.field{:name "SubscriptionArn", :shape "subscriptionARN"}) (clojure.core/into (serattribute-name (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "attributeName"})]} (clojure.core/contains? input :attribute-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serattribute-value (input :attribute-value)) #:http.request.field{:name "AttributeValue", :shape "attributeValue"}))))

(clojure.core/defn- req-add-permission-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"}) (clojure.core/into (serlabel (input :label)) #:http.request.field{:name "Label", :shape "label"}) (clojure.core/into (ser-delegates-list (input :aws-account-id)) #:http.request.field{:name "AWSAccountId", :shape "DelegatesList"}) (clojure.core/into (ser-actions-list (input :action-name)) #:http.request.field{:name "ActionName", :shape "ActionsList"})]}))

(clojure.core/defn- req-check-if-phone-number-is-opted-out-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-phone-number (input :phone-number)) #:http.request.field{:name "phoneNumber", :shape "PhoneNumber"})]}))

(clojure.core/defn- req-list-endpoints-by-platform-application-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :platform-application-arn)) #:http.request.field{:name "PlatformApplicationArn", :shape "String"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-list-subscriptions-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sernext-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "nextToken"}))))

(clojure.core/defn- req-set-sms-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-map-string-to-string (input :attributes)) #:http.request.field{:name "attributes", :shape "MapStringToString"})]}))

(clojure.core/defn- req-set-topic-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"}) (clojure.core/into (serattribute-name (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "attributeName"})]} (clojure.core/contains? input :attribute-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serattribute-value (input :attribute-value)) #:http.request.field{:name "AttributeValue", :shape "attributeValue"}))))

(clojure.core/defn- req-confirm-subscription-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertopic-arn (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "topicARN"}) (clojure.core/into (sertoken (input :token)) #:http.request.field{:name "Token", :shape "token"})]} (clojure.core/contains? input :authenticate-on-unsubscribe) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serauthenticate-on-unsubscribe (input :authenticate-on-unsubscribe)) #:http.request.field{:name "AuthenticateOnUnsubscribe", :shape "authenticateOnUnsubscribe"}))))

(clojure.core/declare deser-topic-attributes-map)

(clojure.core/declare deserboolean)

(clojure.core/declare deserprotocol)

(clojure.core/declare desersubscription-arn)

(clojure.core/declare deserattribute-name)

(clojure.core/declare deserstring)

(clojure.core/declare deser-subscriptions-list)

(clojure.core/declare deser-subscription-attributes-map)

(clojure.core/declare deser-topic)

(clojure.core/declare desernext-token)

(clojure.core/declare deser-list-of-platform-applications)

(clojure.core/declare deser-phone-number-list)

(clojure.core/declare deser-topics-list)

(clojure.core/declare deseraccount)

(clojure.core/declare deser-string)

(clojure.core/declare deser-platform-application)

(clojure.core/declare desermessage-id)

(clojure.core/declare deser-endpoint)

(clojure.core/declare deser-subscription)

(clojure.core/declare deser-map-string-to-string)

(clojure.core/declare deserendpoint)

(clojure.core/declare desertopic-arn)

(clojure.core/declare deserattribute-value)

(clojure.core/declare deser-phone-number)

(clojure.core/declare deser-list-of-endpoints)

(clojure.core/defn- deser-topic-attributes-map [input] (clojure.core/let [x-flattened__283694__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__283694__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deserattribute-name k) (deserattribute-value v)]))) input)))

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deserprotocol [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desersubscription-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserattribute-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserstring [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-subscriptions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subscription coll))) input))

(clojure.core/defn- deser-subscription-attributes-map [input] (clojure.core/let [x-flattened__283694__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__283694__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deserattribute-name k) (deserattribute-value v)]))) input)))

(clojure.core/defn- deser-topic [input] (clojure.core/let [letvar525483 {"TopicArn" (portkey.aws/search-for-tag input "TopicArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar525483 "TopicArn") (clojure.core/assoc :topic-arn (desertopic-arn (clojure.core/get-in letvar525483 ["TopicArn" :content]))))))

(clojure.core/defn- desernext-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-list-of-platform-applications [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-platform-application coll))) input))

(clojure.core/defn- deser-phone-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-phone-number coll))) input))

(clojure.core/defn- deser-topics-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-topic coll))) input))

(clojure.core/defn- deseraccount [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-platform-application [input] (clojure.core/let [letvar525657 {"PlatformApplicationArn" (portkey.aws/search-for-tag input "PlatformApplicationArn" :flattened? nil :xmlAttribute? nil), "Attributes" (portkey.aws/search-for-tag input "Attributes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar525657 "PlatformApplicationArn") (clojure.core/assoc :platform-application-arn (deser-string (clojure.core/get-in letvar525657 ["PlatformApplicationArn" :content]))) (letvar525657 "Attributes") (clojure.core/assoc :attributes (deser-map-string-to-string (clojure.core/get-in letvar525657 ["Attributes" :content]))))))

(clojure.core/defn- desermessage-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-endpoint [input] (clojure.core/let [letvar525770 {"EndpointArn" (portkey.aws/search-for-tag input "EndpointArn" :flattened? nil :xmlAttribute? nil), "Attributes" (portkey.aws/search-for-tag input "Attributes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar525770 "EndpointArn") (clojure.core/assoc :endpoint-arn (deser-string (clojure.core/get-in letvar525770 ["EndpointArn" :content]))) (letvar525770 "Attributes") (clojure.core/assoc :attributes (deser-map-string-to-string (clojure.core/get-in letvar525770 ["Attributes" :content]))))))

(clojure.core/defn- deser-subscription [input] (clojure.core/let [letvar525878 {"SubscriptionArn" (portkey.aws/search-for-tag input "SubscriptionArn" :flattened? nil :xmlAttribute? nil), "Owner" (portkey.aws/search-for-tag input "Owner" :flattened? nil :xmlAttribute? nil), "Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil), "Endpoint" (portkey.aws/search-for-tag input "Endpoint" :flattened? nil :xmlAttribute? nil), "TopicArn" (portkey.aws/search-for-tag input "TopicArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar525878 "SubscriptionArn") (clojure.core/assoc :subscription-arn (desersubscription-arn (clojure.core/get-in letvar525878 ["SubscriptionArn" :content]))) (letvar525878 "Owner") (clojure.core/assoc :owner (deseraccount (clojure.core/get-in letvar525878 ["Owner" :content]))) (letvar525878 "Protocol") (clojure.core/assoc :protocol (deserprotocol (clojure.core/get-in letvar525878 ["Protocol" :content]))) (letvar525878 "Endpoint") (clojure.core/assoc :endpoint (deserendpoint (clojure.core/get-in letvar525878 ["Endpoint" :content]))) (letvar525878 "TopicArn") (clojure.core/assoc :topic-arn (desertopic-arn (clojure.core/get-in letvar525878 ["TopicArn" :content]))))))

(clojure.core/defn- deser-map-string-to-string [input] (clojure.core/let [x-flattened__283694__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__283694__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)]))) input)))

(clojure.core/defn- deserendpoint [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desertopic-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserattribute-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-phone-number [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-list-of-endpoints [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-endpoint coll))) input))

(clojure.core/defn- response-list-platform-applications-response ([input] (response-list-platform-applications-response nil input)) ([resultWrapper525940 input] (clojure.core/let [rawinput525939 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525941 {"PlatformApplications" (portkey.aws/search-for-tag rawinput525939 "PlatformApplications" :flattened? nil :result-wrapper resultWrapper525940), "NextToken" (portkey.aws/search-for-tag rawinput525939 "NextToken" :flattened? nil :result-wrapper resultWrapper525940)}] (clojure.core/cond-> {} (letvar525941 "PlatformApplications") (clojure.core/assoc :platform-applications (deser-list-of-platform-applications (clojure.core/get-in letvar525941 ["PlatformApplications" :content]))) (letvar525941 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar525941 ["NextToken" :content])))))))

(clojure.core/defn- response-get-sms-attributes-response ([input] (response-get-sms-attributes-response nil input)) ([resultWrapper525943 input] (clojure.core/let [rawinput525942 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525944 {"attributes" (portkey.aws/search-for-tag rawinput525942 "attributes" :flattened? nil :result-wrapper resultWrapper525943)}] (clojure.core/cond-> {} (letvar525944 "attributes") (clojure.core/assoc :attributes (deser-map-string-to-string (clojure.core/get-in letvar525944 ["attributes" :content])))))))

(clojure.core/defn- response-list-topics-response ([input] (response-list-topics-response nil input)) ([resultWrapper525946 input] (clojure.core/let [rawinput525945 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525947 {"Topics" (portkey.aws/search-for-tag rawinput525945 "Topics" :flattened? nil :result-wrapper resultWrapper525946), "NextToken" (portkey.aws/search-for-tag rawinput525945 "NextToken" :flattened? nil :result-wrapper resultWrapper525946)}] (clojure.core/cond-> {} (letvar525947 "Topics") (clojure.core/assoc :topics (deser-topics-list (clojure.core/get-in letvar525947 ["Topics" :content]))) (letvar525947 "NextToken") (clojure.core/assoc :next-token (desernext-token (clojure.core/get-in letvar525947 ["NextToken" :content])))))))

(clojure.core/defn- response-check-if-phone-number-is-opted-out-response ([input] (response-check-if-phone-number-is-opted-out-response nil input)) ([resultWrapper525949 input] (clojure.core/let [rawinput525948 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525950 {"isOptedOut" (portkey.aws/search-for-tag rawinput525948 "isOptedOut" :flattened? nil :result-wrapper resultWrapper525949)}] (clojure.core/cond-> {} (letvar525950 "isOptedOut") (clojure.core/assoc :is-opted-out (deserboolean (clojure.core/get-in letvar525950 ["isOptedOut" :content])))))))

(clojure.core/defn- response-set-sms-attributes-response ([input] (response-set-sms-attributes-response nil input)) ([resultWrapper525952 input] (clojure.core/let [rawinput525951 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525953 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-platform-application-disabled-exception ([input] (response-platform-application-disabled-exception nil input)) ([resultWrapper525955 input] (clojure.core/let [rawinput525954 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525956 {"message" (portkey.aws/search-for-tag rawinput525954 "message" :flattened? nil :result-wrapper resultWrapper525955)}] (clojure.core/cond-> {} (letvar525956 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar525956 ["message" :content])))))))

(clojure.core/defn- response-kms-not-found-exception ([input] (response-kms-not-found-exception nil input)) ([resultWrapper525958 input] (clojure.core/let [rawinput525957 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525959 {"message" (portkey.aws/search-for-tag rawinput525957 "message" :flattened? nil :result-wrapper resultWrapper525958)}] (clojure.core/cond-> {} (letvar525959 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar525959 ["message" :content])))))))

(clojure.core/defn- response-kms-invalid-state-exception ([input] (response-kms-invalid-state-exception nil input)) ([resultWrapper525961 input] (clojure.core/let [rawinput525960 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525962 {"message" (portkey.aws/search-for-tag rawinput525960 "message" :flattened? nil :result-wrapper resultWrapper525961)}] (clojure.core/cond-> {} (letvar525962 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar525962 ["message" :content])))))))

(clojure.core/defn- response-create-endpoint-response ([input] (response-create-endpoint-response nil input)) ([resultWrapper525964 input] (clojure.core/let [rawinput525963 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525965 {"EndpointArn" (portkey.aws/search-for-tag rawinput525963 "EndpointArn" :flattened? nil :result-wrapper resultWrapper525964)}] (clojure.core/cond-> {} (letvar525965 "EndpointArn") (clojure.core/assoc :endpoint-arn (deser-string (clojure.core/get-in letvar525965 ["EndpointArn" :content])))))))

(clojure.core/defn- response-kms-disabled-exception ([input] (response-kms-disabled-exception nil input)) ([resultWrapper525967 input] (clojure.core/let [rawinput525966 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525968 {"message" (portkey.aws/search-for-tag rawinput525966 "message" :flattened? nil :result-wrapper resultWrapper525967)}] (clojure.core/cond-> {} (letvar525968 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar525968 ["message" :content])))))))

(clojure.core/defn- response-create-topic-response ([input] (response-create-topic-response nil input)) ([resultWrapper525970 input] (clojure.core/let [rawinput525969 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525971 {"TopicArn" (portkey.aws/search-for-tag rawinput525969 "TopicArn" :flattened? nil :result-wrapper resultWrapper525970)}] (clojure.core/cond-> {} (letvar525971 "TopicArn") (clojure.core/assoc :topic-arn (desertopic-arn (clojure.core/get-in letvar525971 ["TopicArn" :content])))))))

(clojure.core/defn- response-get-endpoint-attributes-response ([input] (response-get-endpoint-attributes-response nil input)) ([resultWrapper525973 input] (clojure.core/let [rawinput525972 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525974 {"Attributes" (portkey.aws/search-for-tag rawinput525972 "Attributes" :flattened? nil :result-wrapper resultWrapper525973)}] (clojure.core/cond-> {} (letvar525974 "Attributes") (clojure.core/assoc :attributes (deser-map-string-to-string (clojure.core/get-in letvar525974 ["Attributes" :content])))))))

(clojure.core/defn- response-publish-response ([input] (response-publish-response nil input)) ([resultWrapper525976 input] (clojure.core/let [rawinput525975 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525977 {"MessageId" (portkey.aws/search-for-tag rawinput525975 "MessageId" :flattened? nil :result-wrapper resultWrapper525976)}] (clojure.core/cond-> {} (letvar525977 "MessageId") (clojure.core/assoc :message-id (desermessage-id (clojure.core/get-in letvar525977 ["MessageId" :content])))))))

(clojure.core/defn- response-list-phone-numbers-opted-out-response ([input] (response-list-phone-numbers-opted-out-response nil input)) ([resultWrapper525979 input] (clojure.core/let [rawinput525978 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525980 {"phoneNumbers" (portkey.aws/search-for-tag rawinput525978 "phoneNumbers" :flattened? nil :result-wrapper resultWrapper525979), "nextToken" (portkey.aws/search-for-tag rawinput525978 "nextToken" :flattened? nil :result-wrapper resultWrapper525979)}] (clojure.core/cond-> {} (letvar525980 "phoneNumbers") (clojure.core/assoc :phone-numbers (deser-phone-number-list (clojure.core/get-in letvar525980 ["phoneNumbers" :content]))) (letvar525980 "nextToken") (clojure.core/assoc :next-token (deserstring (clojure.core/get-in letvar525980 ["nextToken" :content])))))))

(clojure.core/defn- response-filter-policy-limit-exceeded-exception ([input] (response-filter-policy-limit-exceeded-exception nil input)) ([resultWrapper525982 input] (clojure.core/let [rawinput525981 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525983 {"message" (portkey.aws/search-for-tag rawinput525981 "message" :flattened? nil :result-wrapper resultWrapper525982)}] (clojure.core/cond-> {} (letvar525983 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar525983 ["message" :content])))))))

(clojure.core/defn- response-internal-error-exception ([input] (response-internal-error-exception nil input)) ([resultWrapper525985 input] (clojure.core/let [rawinput525984 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525986 {"message" (portkey.aws/search-for-tag rawinput525984 "message" :flattened? nil :result-wrapper resultWrapper525985)}] (clojure.core/cond-> {} (letvar525986 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar525986 ["message" :content])))))))

(clojure.core/defn- response-kms-access-denied-exception ([input] (response-kms-access-denied-exception nil input)) ([resultWrapper525988 input] (clojure.core/let [rawinput525987 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525989 {"message" (portkey.aws/search-for-tag rawinput525987 "message" :flattened? nil :result-wrapper resultWrapper525988)}] (clojure.core/cond-> {} (letvar525989 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar525989 ["message" :content])))))))

(clojure.core/defn- response-list-subscriptions-by-topic-response ([input] (response-list-subscriptions-by-topic-response nil input)) ([resultWrapper525991 input] (clojure.core/let [rawinput525990 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525992 {"Subscriptions" (portkey.aws/search-for-tag rawinput525990 "Subscriptions" :flattened? nil :result-wrapper resultWrapper525991), "NextToken" (portkey.aws/search-for-tag rawinput525990 "NextToken" :flattened? nil :result-wrapper resultWrapper525991)}] (clojure.core/cond-> {} (letvar525992 "Subscriptions") (clojure.core/assoc :subscriptions (deser-subscriptions-list (clojure.core/get-in letvar525992 ["Subscriptions" :content]))) (letvar525992 "NextToken") (clojure.core/assoc :next-token (desernext-token (clojure.core/get-in letvar525992 ["NextToken" :content])))))))

(clojure.core/defn- response-subscribe-response ([input] (response-subscribe-response nil input)) ([resultWrapper525994 input] (clojure.core/let [rawinput525993 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525995 {"SubscriptionArn" (portkey.aws/search-for-tag rawinput525993 "SubscriptionArn" :flattened? nil :result-wrapper resultWrapper525994)}] (clojure.core/cond-> {} (letvar525995 "SubscriptionArn") (clojure.core/assoc :subscription-arn (desersubscription-arn (clojure.core/get-in letvar525995 ["SubscriptionArn" :content])))))))

(clojure.core/defn- response-list-subscriptions-response ([input] (response-list-subscriptions-response nil input)) ([resultWrapper525997 input] (clojure.core/let [rawinput525996 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar525998 {"Subscriptions" (portkey.aws/search-for-tag rawinput525996 "Subscriptions" :flattened? nil :result-wrapper resultWrapper525997), "NextToken" (portkey.aws/search-for-tag rawinput525996 "NextToken" :flattened? nil :result-wrapper resultWrapper525997)}] (clojure.core/cond-> {} (letvar525998 "Subscriptions") (clojure.core/assoc :subscriptions (deser-subscriptions-list (clojure.core/get-in letvar525998 ["Subscriptions" :content]))) (letvar525998 "NextToken") (clojure.core/assoc :next-token (desernext-token (clojure.core/get-in letvar525998 ["NextToken" :content])))))))

(clojure.core/defn- response-confirm-subscription-response ([input] (response-confirm-subscription-response nil input)) ([resultWrapper526000 input] (clojure.core/let [rawinput525999 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526001 {"SubscriptionArn" (portkey.aws/search-for-tag rawinput525999 "SubscriptionArn" :flattened? nil :result-wrapper resultWrapper526000)}] (clojure.core/cond-> {} (letvar526001 "SubscriptionArn") (clojure.core/assoc :subscription-arn (desersubscription-arn (clojure.core/get-in letvar526001 ["SubscriptionArn" :content])))))))

(clojure.core/defn- response-invalid-security-exception ([input] (response-invalid-security-exception nil input)) ([resultWrapper526003 input] (clojure.core/let [rawinput526002 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526004 {"message" (portkey.aws/search-for-tag rawinput526002 "message" :flattened? nil :result-wrapper resultWrapper526003)}] (clojure.core/cond-> {} (letvar526004 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526004 ["message" :content])))))))

(clojure.core/defn- response-authorization-error-exception ([input] (response-authorization-error-exception nil input)) ([resultWrapper526006 input] (clojure.core/let [rawinput526005 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526007 {"message" (portkey.aws/search-for-tag rawinput526005 "message" :flattened? nil :result-wrapper resultWrapper526006)}] (clojure.core/cond-> {} (letvar526007 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526007 ["message" :content])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper526009 input] (clojure.core/let [rawinput526008 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526010 {"message" (portkey.aws/search-for-tag rawinput526008 "message" :flattened? nil :result-wrapper resultWrapper526009)}] (clojure.core/cond-> {} (letvar526010 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526010 ["message" :content])))))))

(clojure.core/defn- response-get-subscription-attributes-response ([input] (response-get-subscription-attributes-response nil input)) ([resultWrapper526012 input] (clojure.core/let [rawinput526011 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526013 {"Attributes" (portkey.aws/search-for-tag rawinput526011 "Attributes" :flattened? nil :result-wrapper resultWrapper526012)}] (clojure.core/cond-> {} (letvar526013 "Attributes") (clojure.core/assoc :attributes (deser-subscription-attributes-map (clojure.core/get-in letvar526013 ["Attributes" :content])))))))

(clojure.core/defn- response-list-endpoints-by-platform-application-response ([input] (response-list-endpoints-by-platform-application-response nil input)) ([resultWrapper526015 input] (clojure.core/let [rawinput526014 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526016 {"Endpoints" (portkey.aws/search-for-tag rawinput526014 "Endpoints" :flattened? nil :result-wrapper resultWrapper526015), "NextToken" (portkey.aws/search-for-tag rawinput526014 "NextToken" :flattened? nil :result-wrapper resultWrapper526015)}] (clojure.core/cond-> {} (letvar526016 "Endpoints") (clojure.core/assoc :endpoints (deser-list-of-endpoints (clojure.core/get-in letvar526016 ["Endpoints" :content]))) (letvar526016 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar526016 ["NextToken" :content])))))))

(clojure.core/defn- response-topic-limit-exceeded-exception ([input] (response-topic-limit-exceeded-exception nil input)) ([resultWrapper526018 input] (clojure.core/let [rawinput526017 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526019 {"message" (portkey.aws/search-for-tag rawinput526017 "message" :flattened? nil :result-wrapper resultWrapper526018)}] (clojure.core/cond-> {} (letvar526019 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526019 ["message" :content])))))))

(clojure.core/defn- response-subscription-limit-exceeded-exception ([input] (response-subscription-limit-exceeded-exception nil input)) ([resultWrapper526021 input] (clojure.core/let [rawinput526020 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526022 {"message" (portkey.aws/search-for-tag rawinput526020 "message" :flattened? nil :result-wrapper resultWrapper526021)}] (clojure.core/cond-> {} (letvar526022 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526022 ["message" :content])))))))

(clojure.core/defn- response-kms-throttling-exception ([input] (response-kms-throttling-exception nil input)) ([resultWrapper526024 input] (clojure.core/let [rawinput526023 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526025 {"message" (portkey.aws/search-for-tag rawinput526023 "message" :flattened? nil :result-wrapper resultWrapper526024)}] (clojure.core/cond-> {} (letvar526025 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526025 ["message" :content])))))))

(clojure.core/defn- response-kms-opt-in-required ([input] (response-kms-opt-in-required nil input)) ([resultWrapper526027 input] (clojure.core/let [rawinput526026 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526028 {"message" (portkey.aws/search-for-tag rawinput526026 "message" :flattened? nil :result-wrapper resultWrapper526027)}] (clojure.core/cond-> {} (letvar526028 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526028 ["message" :content])))))))

(clojure.core/defn- response-create-platform-application-response ([input] (response-create-platform-application-response nil input)) ([resultWrapper526030 input] (clojure.core/let [rawinput526029 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526031 {"PlatformApplicationArn" (portkey.aws/search-for-tag rawinput526029 "PlatformApplicationArn" :flattened? nil :result-wrapper resultWrapper526030)}] (clojure.core/cond-> {} (letvar526031 "PlatformApplicationArn") (clojure.core/assoc :platform-application-arn (deser-string (clojure.core/get-in letvar526031 ["PlatformApplicationArn" :content])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper526033 input] (clojure.core/let [rawinput526032 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526034 {"message" (portkey.aws/search-for-tag rawinput526032 "message" :flattened? nil :result-wrapper resultWrapper526033)}] (clojure.core/cond-> {} (letvar526034 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526034 ["message" :content])))))))

(clojure.core/defn- response-opt-in-phone-number-response ([input] (response-opt-in-phone-number-response nil input)) ([resultWrapper526036 input] (clojure.core/let [rawinput526035 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526037 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-topic-attributes-response ([input] (response-get-topic-attributes-response nil input)) ([resultWrapper526039 input] (clojure.core/let [rawinput526038 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526040 {"Attributes" (portkey.aws/search-for-tag rawinput526038 "Attributes" :flattened? nil :result-wrapper resultWrapper526039)}] (clojure.core/cond-> {} (letvar526040 "Attributes") (clojure.core/assoc :attributes (deser-topic-attributes-map (clojure.core/get-in letvar526040 ["Attributes" :content])))))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper526042 input] (clojure.core/let [rawinput526041 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526043 {"message" (portkey.aws/search-for-tag rawinput526041 "message" :flattened? nil :result-wrapper resultWrapper526042)}] (clojure.core/cond-> {} (letvar526043 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526043 ["message" :content])))))))

(clojure.core/defn- response-get-platform-application-attributes-response ([input] (response-get-platform-application-attributes-response nil input)) ([resultWrapper526045 input] (clojure.core/let [rawinput526044 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526046 {"Attributes" (portkey.aws/search-for-tag rawinput526044 "Attributes" :flattened? nil :result-wrapper resultWrapper526045)}] (clojure.core/cond-> {} (letvar526046 "Attributes") (clojure.core/assoc :attributes (deser-map-string-to-string (clojure.core/get-in letvar526046 ["Attributes" :content])))))))

(clojure.core/defn- response-throttled-exception ([input] (response-throttled-exception nil input)) ([resultWrapper526048 input] (clojure.core/let [rawinput526047 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526049 {"message" (portkey.aws/search-for-tag rawinput526047 "message" :flattened? nil :result-wrapper resultWrapper526048)}] (clojure.core/cond-> {} (letvar526049 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526049 ["message" :content])))))))

(clojure.core/defn- response-endpoint-disabled-exception ([input] (response-endpoint-disabled-exception nil input)) ([resultWrapper526051 input] (clojure.core/let [rawinput526050 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar526052 {"message" (portkey.aws/search-for-tag rawinput526050 "message" :flattened? nil :result-wrapper resultWrapper526051)}] (clojure.core/cond-> {} (letvar526052 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar526052 ["message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.sns.list-platform-applications-response/platform-applications (clojure.spec.alpha/and :portkey.aws.sns/list-of-platform-applications))
(clojure.spec.alpha/def :portkey.aws.sns.list-platform-applications-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-platform-applications-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-platform-applications-response/platform-applications :portkey.aws.sns.list-platform-applications-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns/topic-attributes-map (clojure.spec.alpha/map-of :portkey.aws.sns/attribute-name :portkey.aws.sns/attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sns/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.delete-endpoint-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/delete-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.delete-endpoint-input/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.get-sms-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/get-sms-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-sms-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.list-topics-response/topics (clojure.spec.alpha/and :portkey.aws.sns/topics-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-topics-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-topics-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-topics-response/topics :portkey.aws.sns.list-topics-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.check-if-phone-number-is-opted-out-response/is-opted-out (clojure.spec.alpha/and :portkey.aws.sns/boolean))
(clojure.spec.alpha/def :portkey.aws.sns/check-if-phone-number-is-opted-out-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.check-if-phone-number-is-opted-out-response/is-opted-out]))

(clojure.spec.alpha/def :portkey.aws.sns/set-sms-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns/protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/subscription-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.get-subscription-attributes-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns/get-subscription-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.get-subscription-attributes-input/subscription-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.list-phone-numbers-opted-out-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-phone-numbers-opted-out-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-phone-numbers-opted-out-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.set-platform-application-attributes-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.set-platform-application-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/set-platform-application-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.set-platform-application-attributes-input/platform-application-arn :portkey.aws.sns.set-platform-application-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.platform-application-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/platform-application-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.platform-application-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns/list-string (clojure.spec.alpha/coll-of :portkey.aws.sns/string))

(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/protocol (clojure.spec.alpha/and :portkey.aws.sns/protocol))
(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/endpoint (clojure.spec.alpha/and :portkey.aws.sns/endpoint))
(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/subscription-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns.subscribe-input/return-subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/boolean))
(clojure.spec.alpha/def :portkey.aws.sns/subscribe-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.subscribe-input/topic-arn :portkey.aws.sns.subscribe-input/protocol] :opt-un [:portkey.aws.sns.subscribe-input/endpoint :portkey.aws.sns.subscribe-input/attributes :portkey.aws.sns.subscribe-input/return-subscription-arn]))

(clojure.spec.alpha/def :portkey.aws.sns/subscriptions-list (clojure.spec.alpha/coll-of :portkey.aws.sns/subscription))

(clojure.spec.alpha/def :portkey.aws.sns.get-sms-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/list-string))
(clojure.spec.alpha/def :portkey.aws.sns/get-sms-attributes-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-sms-attributes-input/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns/label (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.kms-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/kms-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.kms-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.kms-invalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/kms-invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.kms-invalid-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.publish-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/target-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/message (clojure.spec.alpha/and :portkey.aws.sns/message))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/subject (clojure.spec.alpha/and :portkey.aws.sns/subject))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/message-structure (clojure.spec.alpha/and :portkey.aws.sns/message-structure))
(clojure.spec.alpha/def :portkey.aws.sns.publish-input/message-attributes (clojure.spec.alpha/and :portkey.aws.sns/message-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sns/publish-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.publish-input/message] :opt-un [:portkey.aws.sns.publish-input/topic-arn :portkey.aws.sns.publish-input/target-arn :portkey.aws.sns.publish-input/phone-number :portkey.aws.sns.publish-input/subject :portkey.aws.sns.publish-input/message-structure :portkey.aws.sns.publish-input/message-attributes]))

(clojure.spec.alpha/def :portkey.aws.sns/subscription-attributes-map (clojure.spec.alpha/map-of :portkey.aws.sns/attribute-name :portkey.aws.sns/attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns.create-endpoint-response/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/create-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.create-endpoint-response/endpoint-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.list-topics-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-topics-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-topics-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.kms-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/kms-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.kms-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns/delegates-list (clojure.spec.alpha/coll-of :portkey.aws.sns/delegate))

(clojure.spec.alpha/def :portkey.aws.sns.create-topic-response/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns/create-topic-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.create-topic-response/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.get-endpoint-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/get-endpoint-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-endpoint-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.publish-response/message-id (clojure.spec.alpha/and :portkey.aws.sns/message-id))
(clojure.spec.alpha/def :portkey.aws.sns/publish-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.publish-response/message-id]))

(clojure.spec.alpha/def :portkey.aws.sns.topic/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns/topic (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.topic/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.list-phone-numbers-opted-out-response/phone-numbers (clojure.spec.alpha/and :portkey.aws.sns/phone-number-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-phone-numbers-opted-out-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-phone-numbers-opted-out-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-phone-numbers-opted-out-response/phone-numbers :portkey.aws.sns.list-phone-numbers-opted-out-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.filter-policy-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/filter-policy-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.filter-policy-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.get-platform-application-attributes-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/get-platform-application-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.get-platform-application-attributes-input/platform-application-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.kms-access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/kms-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.kms-access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-response/subscriptions (clojure.spec.alpha/and :portkey.aws.sns/subscriptions-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-by-topic-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-subscriptions-by-topic-response/subscriptions :portkey.aws.sns.list-subscriptions-by-topic-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.list-platform-applications-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-platform-applications-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-platform-applications-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-by-topic-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-by-topic-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.list-subscriptions-by-topic-input/topic-arn] :opt-un [:portkey.aws.sns.list-subscriptions-by-topic-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.subscribe-response/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns/subscribe-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.subscribe-response/subscription-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-response/subscriptions (clojure.spec.alpha/and :portkey.aws.sns/subscriptions-list))
(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-subscriptions-response/subscriptions :portkey.aws.sns.list-subscriptions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-response/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns/confirm-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.confirm-subscription-response/subscription-arn]))

(clojure.spec.alpha/def :portkey.aws.sns/list-of-platform-applications (clojure.spec.alpha/coll-of :portkey.aws.sns/platform-application))

(clojure.spec.alpha/def :portkey.aws.sns/phone-number-list (clojure.spec.alpha/coll-of :portkey.aws.sns/phone-number))

(clojure.spec.alpha/def :portkey.aws.sns/message-structure (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.message-attribute-value/data-type (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.message-attribute-value/string-value (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.message-attribute-value/binary-value (clojure.spec.alpha/and :portkey.aws.sns/binary))
(clojure.spec.alpha/def :portkey.aws.sns/message-attribute-value (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.message-attribute-value/data-type] :opt-un [:portkey.aws.sns.message-attribute-value/string-value :portkey.aws.sns.message-attribute-value/binary-value]))

(clojure.spec.alpha/def :portkey.aws.sns.get-topic-attributes-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns/get-topic-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.get-topic-attributes-input/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/custom-user-data (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-endpoint-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/create-platform-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.create-platform-endpoint-input/platform-application-arn :portkey.aws.sns.create-platform-endpoint-input/token] :opt-un [:portkey.aws.sns.create-platform-endpoint-input/custom-user-data :portkey.aws.sns.create-platform-endpoint-input/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.invalid-security-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/invalid-security-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.invalid-security-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns/action (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.authorization-error-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/authorization-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.authorization-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.get-subscription-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/subscription-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns/get-subscription-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-subscription-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-response/endpoints (clojure.spec.alpha/and :portkey.aws.sns/list-of-endpoints))
(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-response/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-endpoints-by-platform-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-endpoints-by-platform-application-response/endpoints :portkey.aws.sns.list-endpoints-by-platform-application-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns/topics-list (clojure.spec.alpha/coll-of :portkey.aws.sns/topic))

(clojure.spec.alpha/def :portkey.aws.sns.create-topic-input/name (clojure.spec.alpha/and :portkey.aws.sns/topic-name))
(clojure.spec.alpha/def :portkey.aws.sns.create-topic-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/topic-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns/create-topic-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.create-topic-input/name] :opt-un [:portkey.aws.sns.create-topic-input/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-input/name (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-input/platform (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/create-platform-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.create-platform-application-input/name :portkey.aws.sns.create-platform-application-input/platform :portkey.aws.sns.create-platform-application-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns/account (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.remove-permission-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.remove-permission-input/label (clojure.spec.alpha/and :portkey.aws.sns/label))
(clojure.spec.alpha/def :portkey.aws.sns/remove-permission-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.remove-permission-input/topic-arn :portkey.aws.sns.remove-permission-input/label] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.set-endpoint-attributes-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.set-endpoint-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/set-endpoint-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.set-endpoint-attributes-input/endpoint-arn :portkey.aws.sns.set-endpoint-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.topic-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/topic-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.topic-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.delete-platform-application-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/delete-platform-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.delete-platform-application-input/platform-application-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.subscription-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/subscription-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.subscription-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.platform-application/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.platform-application/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/platform-application (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.platform-application/platform-application-arn :portkey.aws.sns.platform-application/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns/message-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.delete-topic-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns/delete-topic-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.delete-topic-input/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.get-endpoint-attributes-input/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/get-endpoint-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.get-endpoint-attributes-input/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.kms-throttling-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/kms-throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.kms-throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns/delegate (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/actions-list (clojure.spec.alpha/coll-of :portkey.aws.sns/action))

(clojure.spec.alpha/def :portkey.aws.sns.opt-in-phone-number-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns/phone-number))
(clojure.spec.alpha/def :portkey.aws.sns/opt-in-phone-number-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.opt-in-phone-number-input/phone-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.endpoint/endpoint-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.endpoint/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.endpoint/endpoint-arn :portkey.aws.sns.endpoint/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.unsubscribe-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns/unsubscribe-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.unsubscribe-input/subscription-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.set-subscription-attributes-input/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns.set-subscription-attributes-input/attribute-name (clojure.spec.alpha/and :portkey.aws.sns/attribute-name))
(clojure.spec.alpha/def :portkey.aws.sns.set-subscription-attributes-input/attribute-value (clojure.spec.alpha/and :portkey.aws.sns/attribute-value))
(clojure.spec.alpha/def :portkey.aws.sns/set-subscription-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.set-subscription-attributes-input/subscription-arn :portkey.aws.sns.set-subscription-attributes-input/attribute-name] :opt-un [:portkey.aws.sns.set-subscription-attributes-input/attribute-value]))

(clojure.spec.alpha/def :portkey.aws.sns/binary clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.sns.kms-opt-in-required/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/kms-opt-in-required (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.kms-opt-in-required/message]))

(clojure.spec.alpha/def :portkey.aws.sns.subscription/subscription-arn (clojure.spec.alpha/and :portkey.aws.sns/subscription-arn))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/owner (clojure.spec.alpha/and :portkey.aws.sns/account))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/protocol (clojure.spec.alpha/and :portkey.aws.sns/protocol))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/endpoint (clojure.spec.alpha/and :portkey.aws.sns/endpoint))
(clojure.spec.alpha/def :portkey.aws.sns.subscription/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns/subscription (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.subscription/subscription-arn :portkey.aws.sns.subscription/owner :portkey.aws.sns.subscription/protocol :portkey.aws.sns.subscription/endpoint :portkey.aws.sns.subscription/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.sns.create-platform-application-response/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/create-platform-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.create-platform-application-response/platform-application-arn]))

(clojure.spec.alpha/def :portkey.aws.sns/map-string-to-string (clojure.spec.alpha/map-of :portkey.aws.sns/string :portkey.aws.sns/string))

(clojure.spec.alpha/def :portkey.aws.sns/endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/topic-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns/message-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sns/string :portkey.aws.sns/message-attribute-value))

(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/label (clojure.spec.alpha/and :portkey.aws.sns/label))
(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/aws-account-id (clojure.spec.alpha/and :portkey.aws.sns/delegates-list))
(clojure.spec.alpha/def :portkey.aws.sns.add-permission-input/action-name (clojure.spec.alpha/and :portkey.aws.sns/actions-list))
(clojure.spec.alpha/def :portkey.aws.sns/add-permission-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.add-permission-input/topic-arn :portkey.aws.sns.add-permission-input/label :portkey.aws.sns.add-permission-input/aws-account-id :portkey.aws.sns.add-permission-input/action-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.check-if-phone-number-is-opted-out-input/phone-number (clojure.spec.alpha/and :portkey.aws.sns/phone-number))
(clojure.spec.alpha/def :portkey.aws.sns/check-if-phone-number-is-opted-out-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.check-if-phone-number-is-opted-out-input/phone-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-input/platform-application-arn (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns.list-endpoints-by-platform-application-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/list-endpoints-by-platform-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.list-endpoints-by-platform-application-input/platform-application-arn] :opt-un [:portkey.aws.sns.list-endpoints-by-platform-application-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns/opt-in-phone-number-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.get-topic-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/topic-attributes-map))
(clojure.spec.alpha/def :portkey.aws.sns/get-topic-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-topic-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.list-subscriptions-input/next-token (clojure.spec.alpha/and :portkey.aws.sns/next-token))
(clojure.spec.alpha/def :portkey.aws.sns/list-subscriptions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.list-subscriptions-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.sns.get-platform-application-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/get-platform-application-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.get-platform-application-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.sns.throttled-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/throttled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.throttled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns/topic-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.endpoint-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.sns/string))
(clojure.spec.alpha/def :portkey.aws.sns/endpoint-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sns.endpoint-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sns.set-sms-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.sns/map-string-to-string))
(clojure.spec.alpha/def :portkey.aws.sns/set-sms-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.set-sms-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sns/authenticate-on-unsubscribe (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.set-topic-attributes-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.set-topic-attributes-input/attribute-name (clojure.spec.alpha/and :portkey.aws.sns/attribute-name))
(clojure.spec.alpha/def :portkey.aws.sns.set-topic-attributes-input/attribute-value (clojure.spec.alpha/and :portkey.aws.sns/attribute-value))
(clojure.spec.alpha/def :portkey.aws.sns/set-topic-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.set-topic-attributes-input/topic-arn :portkey.aws.sns.set-topic-attributes-input/attribute-name] :opt-un [:portkey.aws.sns.set-topic-attributes-input/attribute-value]))

(clojure.spec.alpha/def :portkey.aws.sns/phone-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-input/topic-arn (clojure.spec.alpha/and :portkey.aws.sns/topic-arn))
(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-input/token (clojure.spec.alpha/and :portkey.aws.sns/token))
(clojure.spec.alpha/def :portkey.aws.sns.confirm-subscription-input/authenticate-on-unsubscribe (clojure.spec.alpha/and :portkey.aws.sns/authenticate-on-unsubscribe))
(clojure.spec.alpha/def :portkey.aws.sns/confirm-subscription-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sns.confirm-subscription-input/topic-arn :portkey.aws.sns.confirm-subscription-input/token] :opt-un [:portkey.aws.sns.confirm-subscription-input/authenticate-on-unsubscribe]))

(clojure.spec.alpha/def :portkey.aws.sns/list-of-endpoints (clojure.spec.alpha/coll-of :portkey.aws.sns/endpoint))

(clojure.core/defn get-endpoint-attributes ([get-endpoint-attributes-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-endpoint-attributes-input get-endpoint-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/get-endpoint-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/get-endpoint-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetEndpointAttributesResult", :http.request.configuration/action "GetEndpointAttributes", :http.request.configuration/output-deser-fn response-get-endpoint-attributes-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef get-endpoint-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-endpoint-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-endpoint-attributes-response))

(clojure.core/defn delete-topic ([delete-topic-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-topic-input delete-topic-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/delete-topic-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTopic", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef delete-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns/delete-topic-input) :ret clojure.core/true?)

(clojure.core/defn unsubscribe ([unsubscribe-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-unsubscribe-input unsubscribe-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/unsubscribe-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Unsubscribe", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "InvalidSecurityException" :portkey.aws.sns/invalid-security-exception}})))))
(clojure.spec.alpha/fdef unsubscribe :args (clojure.spec.alpha/tuple :portkey.aws.sns/unsubscribe-input) :ret clojure.core/true?)

(clojure.core/defn list-subscriptions ([] (list-subscriptions {})) ([list-subscriptions-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-subscriptions-input list-subscriptions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/list-subscriptions-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-subscriptions-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListSubscriptionsResult", :http.request.configuration/action "ListSubscriptions", :http.request.configuration/output-deser-fn response-list-subscriptions-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-subscriptions :args (clojure.spec.alpha/? :portkey.aws.sns/list-subscriptions-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-subscriptions-response))

(clojure.core/defn set-sms-attributes ([set-sms-attributes-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-sms-attributes-input set-sms-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/set-sms-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/set-sms-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetSMSAttributesResult", :http.request.configuration/action "SetSMSAttributes", :http.request.configuration/output-deser-fn response-set-sms-attributes-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef set-sms-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-sms-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/set-sms-attributes-response))

(clojure.core/defn list-endpoints-by-platform-application ([list-endpoints-by-platform-application-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-endpoints-by-platform-application-input list-endpoints-by-platform-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/list-endpoints-by-platform-application-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-endpoints-by-platform-application-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListEndpointsByPlatformApplicationResult", :http.request.configuration/action "ListEndpointsByPlatformApplication", :http.request.configuration/output-deser-fn response-list-endpoints-by-platform-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef list-endpoints-by-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns/list-endpoints-by-platform-application-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-endpoints-by-platform-application-response))

(clojure.core/defn opt-in-phone-number ([opt-in-phone-number-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-opt-in-phone-number-input opt-in-phone-number-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/opt-in-phone-number-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/opt-in-phone-number-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "OptInPhoneNumberResult", :http.request.configuration/action "OptInPhoneNumber", :http.request.configuration/output-deser-fn response-opt-in-phone-number-response, :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef opt-in-phone-number :args (clojure.spec.alpha/tuple :portkey.aws.sns/opt-in-phone-number-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/opt-in-phone-number-response))

(clojure.core/defn create-topic ([create-topic-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-topic-input create-topic-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/create-topic-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/create-topic-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateTopicResult", :http.request.configuration/action "CreateTopic", :http.request.configuration/output-deser-fn response-create-topic-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "TopicLimitExceededException" :portkey.aws.sns/topic-limit-exceeded-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidSecurityException" :portkey.aws.sns/invalid-security-exception}})))))
(clojure.spec.alpha/fdef create-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns/create-topic-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/create-topic-response))

(clojure.core/defn get-sms-attributes ([] (get-sms-attributes {})) ([get-sms-attributes-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-sms-attributes-input get-sms-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/get-sms-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/get-sms-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSMSAttributesResult", :http.request.configuration/action "GetSMSAttributes", :http.request.configuration/output-deser-fn response-get-sms-attributes-response, :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-sms-attributes :args (clojure.spec.alpha/? :portkey.aws.sns/get-sms-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-sms-attributes-response))

(clojure.core/defn set-subscription-attributes ([set-subscription-attributes-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-subscription-attributes-input set-subscription-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/set-subscription-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetSubscriptionAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "FilterPolicyLimitExceededException" :portkey.aws.sns/filter-policy-limit-exceeded-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef set-subscription-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-subscription-attributes-input) :ret clojure.core/true?)

(clojure.core/defn list-platform-applications ([] (list-platform-applications {})) ([list-platform-applications-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-platform-applications-input list-platform-applications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/list-platform-applications-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-platform-applications-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListPlatformApplicationsResult", :http.request.configuration/action "ListPlatformApplications", :http.request.configuration/output-deser-fn response-list-platform-applications-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-platform-applications :args (clojure.spec.alpha/? :portkey.aws.sns/list-platform-applications-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-platform-applications-response))

(clojure.core/defn check-if-phone-number-is-opted-out ([check-if-phone-number-is-opted-out-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-check-if-phone-number-is-opted-out-input check-if-phone-number-is-opted-out-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/check-if-phone-number-is-opted-out-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/check-if-phone-number-is-opted-out-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CheckIfPhoneNumberIsOptedOutResult", :http.request.configuration/action "CheckIfPhoneNumberIsOptedOut", :http.request.configuration/output-deser-fn response-check-if-phone-number-is-opted-out-response, :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef check-if-phone-number-is-opted-out :args (clojure.spec.alpha/tuple :portkey.aws.sns/check-if-phone-number-is-opted-out-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/check-if-phone-number-is-opted-out-response))

(clojure.core/defn list-topics ([] (list-topics {})) ([list-topics-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-topics-input list-topics-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/list-topics-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-topics-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListTopicsResult", :http.request.configuration/action "ListTopics", :http.request.configuration/output-deser-fn response-list-topics-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-topics :args (clojure.spec.alpha/? :portkey.aws.sns/list-topics-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-topics-response))

(clojure.core/defn get-platform-application-attributes ([get-platform-application-attributes-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-platform-application-attributes-input get-platform-application-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/get-platform-application-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/get-platform-application-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetPlatformApplicationAttributesResult", :http.request.configuration/action "GetPlatformApplicationAttributes", :http.request.configuration/output-deser-fn response-get-platform-application-attributes-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef get-platform-application-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-platform-application-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-platform-application-attributes-response))

(clojure.core/defn list-phone-numbers-opted-out ([] (list-phone-numbers-opted-out {})) ([list-phone-numbers-opted-out-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-phone-numbers-opted-out-input list-phone-numbers-opted-out-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/list-phone-numbers-opted-out-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-phone-numbers-opted-out-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListPhoneNumbersOptedOutResult", :http.request.configuration/action "ListPhoneNumbersOptedOut", :http.request.configuration/output-deser-fn response-list-phone-numbers-opted-out-response, :http.request.spec/error-spec {"ThrottledException" :portkey.aws.sns/throttled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-phone-numbers-opted-out :args (clojure.spec.alpha/? :portkey.aws.sns/list-phone-numbers-opted-out-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-phone-numbers-opted-out-response))

(clojure.core/defn delete-platform-application ([delete-platform-application-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-platform-application-input delete-platform-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/delete-platform-application-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePlatformApplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef delete-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns/delete-platform-application-input) :ret clojure.core/true?)

(clojure.core/defn add-permission ([add-permission-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-add-permission-input add-permission-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/add-permission-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddPermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.sns/add-permission-input) :ret clojure.core/true?)

(clojure.core/defn create-platform-endpoint ([create-platform-endpoint-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-platform-endpoint-input create-platform-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/create-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/create-platform-endpoint-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreatePlatformEndpointResult", :http.request.configuration/action "CreatePlatformEndpoint", :http.request.configuration/output-deser-fn response-create-endpoint-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef create-platform-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sns/create-platform-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/create-endpoint-response))

(clojure.core/defn create-platform-application ([create-platform-application-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-platform-application-input create-platform-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/create-platform-application-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/create-platform-application-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreatePlatformApplicationResult", :http.request.configuration/action "CreatePlatformApplication", :http.request.configuration/output-deser-fn response-create-platform-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef create-platform-application :args (clojure.spec.alpha/tuple :portkey.aws.sns/create-platform-application-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/create-platform-application-response))

(clojure.core/defn subscribe ([subscribe-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-subscribe-input subscribe-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/subscribe-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/subscribe-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SubscribeResult", :http.request.configuration/action "Subscribe", :http.request.configuration/output-deser-fn response-subscribe-response, :http.request.spec/error-spec {"SubscriptionLimitExceededException" :portkey.aws.sns/subscription-limit-exceeded-exception, "FilterPolicyLimitExceededException" :portkey.aws.sns/filter-policy-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidSecurityException" :portkey.aws.sns/invalid-security-exception}})))))
(clojure.spec.alpha/fdef subscribe :args (clojure.spec.alpha/tuple :portkey.aws.sns/subscribe-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/subscribe-response))

(clojure.core/defn list-subscriptions-by-topic ([list-subscriptions-by-topic-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-subscriptions-by-topic-input list-subscriptions-by-topic-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/list-subscriptions-by-topic-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/list-subscriptions-by-topic-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListSubscriptionsByTopicResult", :http.request.configuration/action "ListSubscriptionsByTopic", :http.request.configuration/output-deser-fn response-list-subscriptions-by-topic-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef list-subscriptions-by-topic :args (clojure.spec.alpha/tuple :portkey.aws.sns/list-subscriptions-by-topic-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/list-subscriptions-by-topic-response))

(clojure.core/defn get-subscription-attributes ([get-subscription-attributes-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-subscription-attributes-input get-subscription-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/get-subscription-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/get-subscription-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSubscriptionAttributesResult", :http.request.configuration/action "GetSubscriptionAttributes", :http.request.configuration/output-deser-fn response-get-subscription-attributes-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef get-subscription-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-subscription-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-subscription-attributes-response))

(clojure.core/defn remove-permission ([remove-permission-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-remove-permission-input remove-permission-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/remove-permission-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemovePermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.sns/remove-permission-input) :ret clojure.core/true?)

(clojure.core/defn set-endpoint-attributes ([set-endpoint-attributes-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-endpoint-attributes-input set-endpoint-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/set-endpoint-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetEndpointAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef set-endpoint-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-endpoint-attributes-input) :ret clojure.core/true?)

(clojure.core/defn publish ([publish-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-publish-input publish-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/publish-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/publish-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "PublishResult", :http.request.configuration/action "Publish", :http.request.configuration/output-deser-fn response-publish-response, :http.request.spec/error-spec {"PlatformApplicationDisabledException" :portkey.aws.sns/platform-application-disabled-exception, "KMSNotFoundException" :portkey.aws.sns/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.sns/kms-invalid-state-exception, "KMSDisabledException" :portkey.aws.sns/kms-disabled-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "KMSAccessDeniedException" :portkey.aws.sns/kms-access-denied-exception, "InvalidSecurityException" :portkey.aws.sns/invalid-security-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "KMSThrottlingException" :portkey.aws.sns/kms-throttling-exception, "KMSOptInRequired" :portkey.aws.sns/kms-opt-in-required, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.sns/invalid-parameter-value-exception, "EndpointDisabledException" :portkey.aws.sns/endpoint-disabled-exception}})))))
(clojure.spec.alpha/fdef publish :args (clojure.spec.alpha/tuple :portkey.aws.sns/publish-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/publish-response))

(clojure.core/defn get-topic-attributes ([get-topic-attributes-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-topic-attributes-input get-topic-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/get-topic-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/get-topic-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetTopicAttributesResult", :http.request.configuration/action "GetTopicAttributes", :http.request.configuration/output-deser-fn response-get-topic-attributes-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidSecurityException" :portkey.aws.sns/invalid-security-exception}})))))
(clojure.spec.alpha/fdef get-topic-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/get-topic-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/get-topic-attributes-response))

(clojure.core/defn confirm-subscription ([confirm-subscription-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-confirm-subscription-input confirm-subscription-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sns/confirm-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/confirm-subscription-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ConfirmSubscriptionResult", :http.request.configuration/action "ConfirmSubscription", :http.request.configuration/output-deser-fn response-confirm-subscription-response, :http.request.spec/error-spec {"SubscriptionLimitExceededException" :portkey.aws.sns/subscription-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef confirm-subscription :args (clojure.spec.alpha/tuple :portkey.aws.sns/confirm-subscription-input) :ret (clojure.spec.alpha/and :portkey.aws.sns/confirm-subscription-response))

(clojure.core/defn delete-endpoint ([delete-endpoint-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-endpoint-input delete-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/delete-endpoint-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEndpoint", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception}})))))
(clojure.spec.alpha/fdef delete-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sns/delete-endpoint-input) :ret clojure.core/true?)

(clojure.core/defn set-topic-attributes ([set-topic-attributes-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-topic-attributes-input set-topic-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/set-topic-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetTopicAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "InvalidSecurityException" :portkey.aws.sns/invalid-security-exception}})))))
(clojure.spec.alpha/fdef set-topic-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-topic-attributes-input) :ret clojure.core/true?)

(clojure.core/defn set-platform-application-attributes ([set-platform-application-attributes-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-platform-application-attributes-input set-platform-application-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sns/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-03-31", :http.request.configuration/service-id "SNS", :http.request.spec/input-spec :portkey.aws.sns/set-platform-application-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetPlatformApplicationAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sns/invalid-parameter-exception, "InternalErrorException" :portkey.aws.sns/internal-error-exception, "AuthorizationErrorException" :portkey.aws.sns/authorization-error-exception, "NotFoundException" :portkey.aws.sns/not-found-exception}})))))
(clojure.spec.alpha/fdef set-platform-application-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sns/set-platform-application-attributes-input) :ret clojure.core/true?)
