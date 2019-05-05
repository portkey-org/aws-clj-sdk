(ns portkey.aws.elasticloadbalancingv2 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-gov-east-1"},
    :ssl-common-name
    "elasticloadbalancing.us-gov-east-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-northeast-1"},
    :ssl-common-name
    "elasticloadbalancing.ap-northeast-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-1"},
    :ssl-common-name "elasticloadbalancing.eu-west-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-east-2"},
    :ssl-common-name "elasticloadbalancing.us-east-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-southeast-2"},
    :ssl-common-name
    "elasticloadbalancing.ap-southeast-2.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "cn-north-1"},
    :ssl-common-name
    "elasticloadbalancing.cn-north-1.amazonaws.com.cn",
    :endpoint
    "https://elasticloadbalancing.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "sa-east-1"},
    :ssl-common-name "elasticloadbalancing.sa-east-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-southeast-1"},
    :ssl-common-name
    "elasticloadbalancing.ap-southeast-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "cn-northwest-1"},
    :ssl-common-name
    "elasticloadbalancing.cn-northwest-1.amazonaws.com.cn",
    :endpoint
    "https://elasticloadbalancing.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-northeast-2"},
    :ssl-common-name
    "elasticloadbalancing.ap-northeast-2.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-3"},
    :ssl-common-name "elasticloadbalancing.eu-west-3.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ca-central-1"},
    :ssl-common-name "elasticloadbalancing.ca-central-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-central-1"},
    :ssl-common-name "elasticloadbalancing.eu-central-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-2"},
    :ssl-common-name "elasticloadbalancing.eu-west-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-gov-west-1"},
    :ssl-common-name
    "elasticloadbalancing.us-gov-west-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-west-2"},
    :ssl-common-name "elasticloadbalancing.us-west-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-east-1"},
    :ssl-common-name "elasticloadbalancing.us-east-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-west-1"},
    :ssl-common-name "elasticloadbalancing.us-west-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-south-1"},
    :ssl-common-name "elasticloadbalancing.ap-south-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-north-1"},
    :ssl-common-name "elasticloadbalancing.eu-north-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-certificate-list)

(clojure.core/declare ser-authenticate-cognito-action-authentication-request-extra-params)

(clojure.core/declare ser-load-balancer-attributes)

(clojure.core/declare ser-load-balancer-scheme-enum)

(clojure.core/declare ser-load-balancer-names)

(clojure.core/declare ser-default)

(clojure.core/declare ser-target-group-attribute-value)

(clojure.core/declare ser-rule-priority)

(clojure.core/declare ser-authenticate-oidc-action-conditional-behavior-enum)

(clojure.core/declare ser-authenticate-oidc-action-authentication-request-param-value)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-authenticate-cognito-action-config)

(clojure.core/declare ser-redirect-action-protocol)

(clojure.core/declare ser-ssl-policy-names)

(clojure.core/declare ser-authenticate-cognito-action-authentication-request-param-value)

(clojure.core/declare ser-subnets)

(clojure.core/declare ser-authenticate-oidc-action-authorization-endpoint)

(clojure.core/declare ser-load-balancer-arns)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-authenticate-oidc-action-authentication-request-param-name)

(clojure.core/declare ser-security-groups)

(clojure.core/declare ser-subnet-mappings)

(clojure.core/declare ser-path)

(clojure.core/declare ser-health-check-timeout-seconds)

(clojure.core/declare ser-authenticate-cognito-action-user-pool-client-id)

(clojure.core/declare ser-rule-condition-list)

(clojure.core/declare ser-authenticate-oidc-action-user-info-endpoint)

(clojure.core/declare ser-actions)

(clojure.core/declare ser-authenticate-cognito-action-user-pool-domain)

(clojure.core/declare ser-list-of-string)

(clojure.core/declare ser-load-balancer-attribute-value)

(clojure.core/declare ser-load-balancer-arn)

(clojure.core/declare ser-load-balancer-name)

(clojure.core/declare ser-allocation-id)

(clojure.core/declare ser-marker)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-authenticate-cognito-action-session-timeout)

(clojure.core/declare ser-rule-arn)

(clojure.core/declare ser-protocol-enum)

(clojure.core/declare ser-authenticate-oidc-action-client-id)

(clojure.core/declare ser-resource-arns)

(clojure.core/declare ser-target-group-arn)

(clojure.core/declare ser-redirect-action-status-code-enum)

(clojure.core/declare ser-listener-arns)

(clojure.core/declare ser-target-group-attribute-key)

(clojure.core/declare ser-subnet-mapping)

(clojure.core/declare ser-fixed-response-action-config)

(clojure.core/declare ser-target-type-enum)

(clojure.core/declare ser-ip-address-type)

(clojure.core/declare ser-ssl-policy-name)

(clojure.core/declare ser-action-type-enum)

(clojure.core/declare ser-fixed-response-action-content-type)

(clojure.core/declare ser-authenticate-oidc-action-config)

(clojure.core/declare ser-health-check-threshold-count)

(clojure.core/declare ser-authenticate-oidc-action-scope)

(clojure.core/declare ser-target-group-name)

(clojure.core/declare ser-target-description)

(clojure.core/declare ser-load-balancer-type-enum)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-rule-priority-pair)

(clojure.core/declare ser-http-code)

(clojure.core/declare ser-target-id)

(clojure.core/declare ser-authenticate-oidc-action-token-endpoint)

(clojure.core/declare ser-redirect-action-path)

(clojure.core/declare ser-redirect-action-config)

(clojure.core/declare ser-listener-arn)

(clojure.core/declare ser-redirect-action-query)

(clojure.core/declare ser-target-group-attribute)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-port)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-target-group-arns)

(clojure.core/declare ser-authenticate-oidc-action-issuer)

(clojure.core/declare ser-authenticate-cognito-action-scope)

(clojure.core/declare ser-vpc-id)

(clojure.core/declare ser-health-check-interval-seconds)

(clojure.core/declare ser-authenticate-oidc-action-use-existing-client-secret)

(clojure.core/declare ser-health-check-port)

(clojure.core/declare ser-target-descriptions)

(clojure.core/declare ser-redirect-action-host)

(clojure.core/declare ser-load-balancer-attribute-key)

(clojure.core/declare ser-authenticate-cognito-action-user-pool-arn)

(clojure.core/declare ser-certificate-arn)

(clojure.core/declare ser-fixed-response-action-message)

(clojure.core/declare ser-condition-field-name)

(clojure.core/declare ser-rule-condition)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-authenticate-oidc-action-session-cookie-name)

(clojure.core/declare ser-fixed-response-action-status-code)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-action-order)

(clojure.core/declare ser-authenticate-oidc-action-authentication-request-extra-params)

(clojure.core/declare ser-target-group-names)

(clojure.core/declare ser-health-check-enabled)

(clojure.core/declare ser-rule-arns)

(clojure.core/declare ser-authenticate-cognito-action-session-cookie-name)

(clojure.core/declare ser-authenticate-cognito-action-authentication-request-param-name)

(clojure.core/declare ser-authenticate-oidc-action-session-timeout)

(clojure.core/declare ser-matcher)

(clojure.core/declare ser-target-group-attributes)

(clojure.core/declare ser-redirect-action-port)

(clojure.core/declare ser-authenticate-oidc-action-client-secret)

(clojure.core/declare ser-action)

(clojure.core/declare ser-authenticate-cognito-action-conditional-behavior-enum)

(clojure.core/declare ser-certificate)

(clojure.core/declare ser-load-balancer-attribute)

(clojure.core/declare ser-string-value)

(clojure.core/declare ser-rule-priority-list)

(clojure.core/declare ser-zone-name)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-certificate-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-certificate coll) #:http.request.field{:shape "Certificate"}))) input), :shape "CertificateList", :type "list"})

(clojure.core/defn- ser-authenticate-cognito-action-authentication-request-extra-params [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-authenticate-cognito-action-authentication-request-param-name k) #:http.request.field{:map-info "key", :shape "AuthenticateCognitoActionAuthenticationRequestParamName"}) (clojure.core/into (ser-authenticate-cognito-action-authentication-request-param-value v) #:http.request.field{:map-info "value", :shape "AuthenticateCognitoActionAuthenticationRequestParamValue"})])) input), :shape "AuthenticateCognitoActionAuthenticationRequestExtraParams", :type "map"})

(clojure.core/defn- ser-load-balancer-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-load-balancer-attribute coll) #:http.request.field{:shape "LoadBalancerAttribute"}))) input), :shape "LoadBalancerAttributes", :type "list", :max 20})

(clojure.core/defn- ser-load-balancer-scheme-enum [input] #:http.request.field{:value (clojure.core/get {"internet-facing" "internet-facing", :internetfacing "internet-facing", "internal" "internal", :internal "internal"} input), :shape "LoadBalancerSchemeEnum"})

(clojure.core/defn- ser-load-balancer-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-load-balancer-name coll) #:http.request.field{:shape "LoadBalancerName"}))) input), :shape "LoadBalancerNames", :type "list"})

(clojure.core/defn- ser-default [input] #:http.request.field{:value input, :shape "Default"})

(clojure.core/defn- ser-target-group-attribute-value [input] #:http.request.field{:value input, :shape "TargetGroupAttributeValue"})

(clojure.core/defn- ser-rule-priority [input] #:http.request.field{:value input, :shape "RulePriority"})

(clojure.core/defn- ser-authenticate-oidc-action-conditional-behavior-enum [input] #:http.request.field{:value (clojure.core/get {"deny" "deny", :deny "deny", "allow" "allow", :allow "allow", "authenticate" "authenticate", :authenticate "authenticate"} input), :shape "AuthenticateOidcActionConditionalBehaviorEnum"})

(clojure.core/defn- ser-authenticate-oidc-action-authentication-request-param-value [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionAuthenticationRequestParamValue"})

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-authenticate-cognito-action-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-authenticate-cognito-action-user-pool-arn (:user-pool-arn input)) #:http.request.field{:name "UserPoolArn", :shape "AuthenticateCognitoActionUserPoolArn"}) (clojure.core/into (ser-authenticate-cognito-action-user-pool-client-id (:user-pool-client-id input)) #:http.request.field{:name "UserPoolClientId", :shape "AuthenticateCognitoActionUserPoolClientId"}) (clojure.core/into (ser-authenticate-cognito-action-user-pool-domain (:user-pool-domain input)) #:http.request.field{:name "UserPoolDomain", :shape "AuthenticateCognitoActionUserPoolDomain"})], :shape "AuthenticateCognitoActionConfig", :type "structure"} (clojure.core/contains? input :session-cookie-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-session-cookie-name (input :session-cookie-name)) #:http.request.field{:name "SessionCookieName", :shape "AuthenticateCognitoActionSessionCookieName"})) (clojure.core/contains? input :scope) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-scope (input :scope)) #:http.request.field{:name "Scope", :shape "AuthenticateCognitoActionScope"})) (clojure.core/contains? input :session-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-session-timeout (input :session-timeout)) #:http.request.field{:name "SessionTimeout", :shape "AuthenticateCognitoActionSessionTimeout"})) (clojure.core/contains? input :authentication-request-extra-params) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-authentication-request-extra-params (input :authentication-request-extra-params)) #:http.request.field{:name "AuthenticationRequestExtraParams", :shape "AuthenticateCognitoActionAuthenticationRequestExtraParams"})) (clojure.core/contains? input :on-unauthenticated-request) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-conditional-behavior-enum (input :on-unauthenticated-request)) #:http.request.field{:name "OnUnauthenticatedRequest", :shape "AuthenticateCognitoActionConditionalBehaviorEnum"}))))

(clojure.core/defn- ser-redirect-action-protocol [input] #:http.request.field{:value input, :shape "RedirectActionProtocol"})

(clojure.core/defn- ser-ssl-policy-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ssl-policy-name coll) #:http.request.field{:shape "SslPolicyName"}))) input), :shape "SslPolicyNames", :type "list"})

(clojure.core/defn- ser-authenticate-cognito-action-authentication-request-param-value [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionAuthenticationRequestParamValue"})

(clojure.core/defn- ser-subnets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "Subnets", :type "list"})

(clojure.core/defn- ser-authenticate-oidc-action-authorization-endpoint [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionAuthorizationEndpoint"})

(clojure.core/defn- ser-load-balancer-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-load-balancer-arn coll) #:http.request.field{:shape "LoadBalancerArn"}))) input), :shape "LoadBalancerArns", :type "list"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-authenticate-oidc-action-authentication-request-param-name [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionAuthenticationRequestParamName"})

(clojure.core/defn- ser-security-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroups", :type "list"})

(clojure.core/defn- ser-subnet-mappings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-mapping coll) #:http.request.field{:shape "SubnetMapping"}))) input), :shape "SubnetMappings", :type "list"})

(clojure.core/defn- ser-path [input] #:http.request.field{:value input, :shape "Path"})

(clojure.core/defn- ser-health-check-timeout-seconds [input] #:http.request.field{:value input, :shape "HealthCheckTimeoutSeconds"})

(clojure.core/defn- ser-authenticate-cognito-action-user-pool-client-id [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionUserPoolClientId"})

(clojure.core/defn- ser-rule-condition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-condition coll) #:http.request.field{:shape "RuleCondition"}))) input), :shape "RuleConditionList", :type "list"})

(clojure.core/defn- ser-authenticate-oidc-action-user-info-endpoint [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionUserInfoEndpoint"})

(clojure.core/defn- ser-actions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-action coll) #:http.request.field{:shape "Action"}))) input), :shape "Actions", :type "list"})

(clojure.core/defn- ser-authenticate-cognito-action-user-pool-domain [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionUserPoolDomain"})

(clojure.core/defn- ser-list-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-value coll) #:http.request.field{:shape "StringValue"}))) input), :shape "ListOfString", :type "list"})

(clojure.core/defn- ser-load-balancer-attribute-value [input] #:http.request.field{:value input, :shape "LoadBalancerAttributeValue"})

(clojure.core/defn- ser-load-balancer-arn [input] #:http.request.field{:value input, :shape "LoadBalancerArn"})

(clojure.core/defn- ser-load-balancer-name [input] #:http.request.field{:value input, :shape "LoadBalancerName"})

(clojure.core/defn- ser-allocation-id [input] #:http.request.field{:value input, :shape "AllocationId"})

(clojure.core/defn- ser-marker [input] #:http.request.field{:value input, :shape "Marker"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-authenticate-cognito-action-session-timeout [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionSessionTimeout"})

(clojure.core/defn- ser-rule-arn [input] #:http.request.field{:value input, :shape "RuleArn"})

(clojure.core/defn- ser-protocol-enum [input] #:http.request.field{:value (clojure.core/get {"HTTP" "HTTP", :http "HTTP", "HTTPS" "HTTPS", :https "HTTPS", "TCP" "TCP", :tcp "TCP", "TLS" "TLS", :tls "TLS"} input), :shape "ProtocolEnum"})

(clojure.core/defn- ser-authenticate-oidc-action-client-id [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionClientId"})

(clojure.core/defn- ser-resource-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-arn coll) #:http.request.field{:shape "ResourceArn"}))) input), :shape "ResourceArns", :type "list"})

(clojure.core/defn- ser-target-group-arn [input] #:http.request.field{:value input, :shape "TargetGroupArn"})

(clojure.core/defn- ser-redirect-action-status-code-enum [input] #:http.request.field{:value (clojure.core/get {"HTTP_301" "HTTP_301", :http-301 "HTTP_301", "HTTP_302" "HTTP_302", :http-302 "HTTP_302"} input), :shape "RedirectActionStatusCodeEnum"})

(clojure.core/defn- ser-listener-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-listener-arn coll) #:http.request.field{:shape "ListenerArn"}))) input), :shape "ListenerArns", :type "list"})

(clojure.core/defn- ser-target-group-attribute-key [input] #:http.request.field{:value input, :shape "TargetGroupAttributeKey"})

(clojure.core/defn- ser-subnet-mapping [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SubnetMapping", :type "structure"} (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "SubnetId"})) (clojure.core/contains? input :allocation-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allocation-id (input :allocation-id)) #:http.request.field{:name "AllocationId", :shape "AllocationId"}))))

(clojure.core/defn- ser-fixed-response-action-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-fixed-response-action-status-code (:status-code input)) #:http.request.field{:name "StatusCode", :shape "FixedResponseActionStatusCode"})], :shape "FixedResponseActionConfig", :type "structure"} (clojure.core/contains? input :message-body) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fixed-response-action-message (input :message-body)) #:http.request.field{:name "MessageBody", :shape "FixedResponseActionMessage"})) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fixed-response-action-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "FixedResponseActionContentType"}))))

(clojure.core/defn- ser-target-type-enum [input] #:http.request.field{:value (clojure.core/get {"instance" "instance", :instance "instance", "ip" "ip", :ip "ip", "lambda" "lambda", :lambda "lambda"} input), :shape "TargetTypeEnum"})

(clojure.core/defn- ser-ip-address-type [input] #:http.request.field{:value (clojure.core/get {"ipv4" "ipv4", :ipv-4 "ipv4", "dualstack" "dualstack", :dualstack "dualstack"} input), :shape "IpAddressType"})

(clojure.core/defn- ser-ssl-policy-name [input] #:http.request.field{:value input, :shape "SslPolicyName"})

(clojure.core/defn- ser-action-type-enum [input] #:http.request.field{:value (clojure.core/get {"authenticate-oidc" "authenticate-oidc", "redirect" "redirect", :forward "forward", :authenticateoidc "authenticate-oidc", "fixed-response" "fixed-response", :fixedresponse "fixed-response", :authenticatecognito "authenticate-cognito", "forward" "forward", "authenticate-cognito" "authenticate-cognito", :redirect "redirect"} input), :shape "ActionTypeEnum"})

(clojure.core/defn- ser-fixed-response-action-content-type [input] #:http.request.field{:value input, :shape "FixedResponseActionContentType"})

(clojure.core/defn- ser-authenticate-oidc-action-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-authenticate-oidc-action-issuer (:issuer input)) #:http.request.field{:name "Issuer", :shape "AuthenticateOidcActionIssuer"}) (clojure.core/into (ser-authenticate-oidc-action-authorization-endpoint (:authorization-endpoint input)) #:http.request.field{:name "AuthorizationEndpoint", :shape "AuthenticateOidcActionAuthorizationEndpoint"}) (clojure.core/into (ser-authenticate-oidc-action-token-endpoint (:token-endpoint input)) #:http.request.field{:name "TokenEndpoint", :shape "AuthenticateOidcActionTokenEndpoint"}) (clojure.core/into (ser-authenticate-oidc-action-user-info-endpoint (:user-info-endpoint input)) #:http.request.field{:name "UserInfoEndpoint", :shape "AuthenticateOidcActionUserInfoEndpoint"}) (clojure.core/into (ser-authenticate-oidc-action-client-id (:client-id input)) #:http.request.field{:name "ClientId", :shape "AuthenticateOidcActionClientId"})], :shape "AuthenticateOidcActionConfig", :type "structure"} (clojure.core/contains? input :use-existing-client-secret) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-use-existing-client-secret (input :use-existing-client-secret)) #:http.request.field{:name "UseExistingClientSecret", :shape "AuthenticateOidcActionUseExistingClientSecret"})) (clojure.core/contains? input :on-unauthenticated-request) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-conditional-behavior-enum (input :on-unauthenticated-request)) #:http.request.field{:name "OnUnauthenticatedRequest", :shape "AuthenticateOidcActionConditionalBehaviorEnum"})) (clojure.core/contains? input :session-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-session-timeout (input :session-timeout)) #:http.request.field{:name "SessionTimeout", :shape "AuthenticateOidcActionSessionTimeout"})) (clojure.core/contains? input :authentication-request-extra-params) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-authentication-request-extra-params (input :authentication-request-extra-params)) #:http.request.field{:name "AuthenticationRequestExtraParams", :shape "AuthenticateOidcActionAuthenticationRequestExtraParams"})) (clojure.core/contains? input :client-secret) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-client-secret (input :client-secret)) #:http.request.field{:name "ClientSecret", :shape "AuthenticateOidcActionClientSecret"})) (clojure.core/contains? input :session-cookie-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-session-cookie-name (input :session-cookie-name)) #:http.request.field{:name "SessionCookieName", :shape "AuthenticateOidcActionSessionCookieName"})) (clojure.core/contains? input :scope) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-scope (input :scope)) #:http.request.field{:name "Scope", :shape "AuthenticateOidcActionScope"}))))

(clojure.core/defn- ser-health-check-threshold-count [input] #:http.request.field{:value input, :shape "HealthCheckThresholdCount"})

(clojure.core/defn- ser-authenticate-oidc-action-scope [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionScope"})

(clojure.core/defn- ser-target-group-name [input] #:http.request.field{:value input, :shape "TargetGroupName"})

(clojure.core/defn- ser-target-description [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-target-id (:id input)) #:http.request.field{:name "Id", :shape "TargetId"})], :shape "TargetDescription", :type "structure"} (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :availability-zone) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-zone-name (input :availability-zone)) #:http.request.field{:name "AvailabilityZone", :shape "ZoneName"}))))

(clojure.core/defn- ser-load-balancer-type-enum [input] #:http.request.field{:value (clojure.core/get {"application" "application", :application "application", "network" "network", :network "network"} input), :shape "LoadBalancerTypeEnum"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :min 1})

(clojure.core/defn- ser-rule-priority-pair [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RulePriorityPair", :type "structure"} (clojure.core/contains? input :rule-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-arn (input :rule-arn)) #:http.request.field{:name "RuleArn", :shape "RuleArn"})) (clojure.core/contains? input :priority) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-priority (input :priority)) #:http.request.field{:name "Priority", :shape "RulePriority"}))))

(clojure.core/defn- ser-http-code [input] #:http.request.field{:value input, :shape "HttpCode"})

(clojure.core/defn- ser-target-id [input] #:http.request.field{:value input, :shape "TargetId"})

(clojure.core/defn- ser-authenticate-oidc-action-token-endpoint [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionTokenEndpoint"})

(clojure.core/defn- ser-redirect-action-path [input] #:http.request.field{:value input, :shape "RedirectActionPath"})

(clojure.core/defn- ser-redirect-action-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-redirect-action-status-code-enum (:status-code input)) #:http.request.field{:name "StatusCode", :shape "RedirectActionStatusCodeEnum"})], :shape "RedirectActionConfig", :type "structure"} (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-protocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "RedirectActionProtocol"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-port (input :port)) #:http.request.field{:name "Port", :shape "RedirectActionPort"})) (clojure.core/contains? input :host) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-host (input :host)) #:http.request.field{:name "Host", :shape "RedirectActionHost"})) (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-path (input :path)) #:http.request.field{:name "Path", :shape "RedirectActionPath"})) (clojure.core/contains? input :query) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-query (input :query)) #:http.request.field{:name "Query", :shape "RedirectActionQuery"}))))

(clojure.core/defn- ser-listener-arn [input] #:http.request.field{:value input, :shape "ListenerArn"})

(clojure.core/defn- ser-redirect-action-query [input] #:http.request.field{:value input, :shape "RedirectActionQuery"})

(clojure.core/defn- ser-target-group-attribute [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TargetGroupAttribute", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-attribute-key (input :key)) #:http.request.field{:name "Key", :shape "TargetGroupAttributeKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "TargetGroupAttributeValue"}))))

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-port [input] #:http.request.field{:value input, :shape "Port"})

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-target-group-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-group-arn coll) #:http.request.field{:shape "TargetGroupArn"}))) input), :shape "TargetGroupArns", :type "list"})

(clojure.core/defn- ser-authenticate-oidc-action-issuer [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionIssuer"})

(clojure.core/defn- ser-authenticate-cognito-action-scope [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionScope"})

(clojure.core/defn- ser-vpc-id [input] #:http.request.field{:value input, :shape "VpcId"})

(clojure.core/defn- ser-health-check-interval-seconds [input] #:http.request.field{:value input, :shape "HealthCheckIntervalSeconds"})

(clojure.core/defn- ser-authenticate-oidc-action-use-existing-client-secret [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionUseExistingClientSecret"})

(clojure.core/defn- ser-health-check-port [input] #:http.request.field{:value input, :shape "HealthCheckPort"})

(clojure.core/defn- ser-target-descriptions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-description coll) #:http.request.field{:shape "TargetDescription"}))) input), :shape "TargetDescriptions", :type "list"})

(clojure.core/defn- ser-redirect-action-host [input] #:http.request.field{:value input, :shape "RedirectActionHost"})

(clojure.core/defn- ser-load-balancer-attribute-key [input] #:http.request.field{:value input, :shape "LoadBalancerAttributeKey"})

(clojure.core/defn- ser-authenticate-cognito-action-user-pool-arn [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionUserPoolArn"})

(clojure.core/defn- ser-certificate-arn [input] #:http.request.field{:value input, :shape "CertificateArn"})

(clojure.core/defn- ser-fixed-response-action-message [input] #:http.request.field{:value input, :shape "FixedResponseActionMessage"})

(clojure.core/defn- ser-condition-field-name [input] #:http.request.field{:value input, :shape "ConditionFieldName"})

(clojure.core/defn- ser-rule-condition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RuleCondition", :type "structure"} (clojure.core/contains? input :field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition-field-name (input :field)) #:http.request.field{:name "Field", :shape "ConditionFieldName"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :values)) #:http.request.field{:name "Values", :shape "ListOfString"}))))

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-authenticate-oidc-action-session-cookie-name [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionSessionCookieName"})

(clojure.core/defn- ser-fixed-response-action-status-code [input] #:http.request.field{:value input, :shape "FixedResponseActionStatusCode"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-action-order [input] #:http.request.field{:value input, :shape "ActionOrder"})

(clojure.core/defn- ser-authenticate-oidc-action-authentication-request-extra-params [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-authenticate-oidc-action-authentication-request-param-name k) #:http.request.field{:map-info "key", :shape "AuthenticateOidcActionAuthenticationRequestParamName"}) (clojure.core/into (ser-authenticate-oidc-action-authentication-request-param-value v) #:http.request.field{:map-info "value", :shape "AuthenticateOidcActionAuthenticationRequestParamValue"})])) input), :shape "AuthenticateOidcActionAuthenticationRequestExtraParams", :type "map"})

(clojure.core/defn- ser-target-group-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-group-name coll) #:http.request.field{:shape "TargetGroupName"}))) input), :shape "TargetGroupNames", :type "list"})

(clojure.core/defn- ser-health-check-enabled [input] #:http.request.field{:value input, :shape "HealthCheckEnabled"})

(clojure.core/defn- ser-rule-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-arn coll) #:http.request.field{:shape "RuleArn"}))) input), :shape "RuleArns", :type "list"})

(clojure.core/defn- ser-authenticate-cognito-action-session-cookie-name [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionSessionCookieName"})

(clojure.core/defn- ser-authenticate-cognito-action-authentication-request-param-name [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionAuthenticationRequestParamName"})

(clojure.core/defn- ser-authenticate-oidc-action-session-timeout [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionSessionTimeout"})

(clojure.core/defn- ser-matcher [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-http-code (:http-code input)) #:http.request.field{:name "HttpCode", :shape "HttpCode"})], :shape "Matcher", :type "structure"}))

(clojure.core/defn- ser-target-group-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-group-attribute coll) #:http.request.field{:shape "TargetGroupAttribute"}))) input), :shape "TargetGroupAttributes", :type "list"})

(clojure.core/defn- ser-redirect-action-port [input] #:http.request.field{:value input, :shape "RedirectActionPort"})

(clojure.core/defn- ser-authenticate-oidc-action-client-secret [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionClientSecret"})

(clojure.core/defn- ser-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-action-type-enum (:type input)) #:http.request.field{:name "Type", :shape "ActionTypeEnum"})], :shape "Action", :type "structure"} (clojure.core/contains? input :target-group-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"})) (clojure.core/contains? input :authenticate-oidc-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-config (input :authenticate-oidc-config)) #:http.request.field{:name "AuthenticateOidcConfig", :shape "AuthenticateOidcActionConfig"})) (clojure.core/contains? input :authenticate-cognito-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-config (input :authenticate-cognito-config)) #:http.request.field{:name "AuthenticateCognitoConfig", :shape "AuthenticateCognitoActionConfig"})) (clojure.core/contains? input :order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-order (input :order)) #:http.request.field{:name "Order", :shape "ActionOrder"})) (clojure.core/contains? input :redirect-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-config (input :redirect-config)) #:http.request.field{:name "RedirectConfig", :shape "RedirectActionConfig"})) (clojure.core/contains? input :fixed-response-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fixed-response-action-config (input :fixed-response-config)) #:http.request.field{:name "FixedResponseConfig", :shape "FixedResponseActionConfig"}))))

(clojure.core/defn- ser-authenticate-cognito-action-conditional-behavior-enum [input] #:http.request.field{:value (clojure.core/get {"deny" "deny", :deny "deny", "allow" "allow", :allow "allow", "authenticate" "authenticate", :authenticate "authenticate"} input), :shape "AuthenticateCognitoActionConditionalBehaviorEnum"})

(clojure.core/defn- ser-certificate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Certificate", :type "structure"} (clojure.core/contains? input :certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "CertificateArn"})) (clojure.core/contains? input :is-default) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-default (input :is-default)) #:http.request.field{:name "IsDefault", :shape "Default"}))))

(clojure.core/defn- ser-load-balancer-attribute [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LoadBalancerAttribute", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-attribute-key (input :key)) #:http.request.field{:name "Key", :shape "LoadBalancerAttributeKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "LoadBalancerAttributeValue"}))))

(clojure.core/defn- ser-string-value [input] #:http.request.field{:value input, :shape "StringValue"})

(clojure.core/defn- ser-rule-priority-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-priority-pair coll) #:http.request.field{:shape "RulePriorityPair"}))) input), :shape "RulePriorityList", :type "list"})

(clojure.core/defn- ser-zone-name [input] #:http.request.field{:value input, :shape "ZoneName"})

(clojure.core/defn- req-add-listener-certificates-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"}) (clojure.core/into (ser-certificate-list (input :certificates)) #:http.request.field{:name "Certificates", :shape "CertificateList"})]}))

(clojure.core/defn- req-describe-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arns (input :resource-arns)) #:http.request.field{:name "ResourceArns", :shape "ResourceArns"})]}))

(clojure.core/defn- req-create-listener-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"}) (clojure.core/into (ser-protocol-enum (input :protocol)) #:http.request.field{:name "Protocol", :shape "ProtocolEnum"}) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"}) (clojure.core/into (ser-actions (input :default-actions)) #:http.request.field{:name "DefaultActions", :shape "Actions"})]} (clojure.core/contains? input :ssl-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-policy-name (input :ssl-policy)) #:http.request.field{:name "SslPolicy", :shape "SslPolicyName"})) (clojure.core/contains? input :certificates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-list (input :certificates)) #:http.request.field{:name "Certificates", :shape "CertificateList"}))))

(clojure.core/defn- req-modify-target-group-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"}) (clojure.core/into (ser-target-group-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "TargetGroupAttributes"})]}))

(clojure.core/defn- req-set-security-groups-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"}) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"})]}))

(clojure.core/defn- req-set-ip-address-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"}) (clojure.core/into (ser-ip-address-type (input :ip-address-type)) #:http.request.field{:name "IpAddressType", :shape "IpAddressType"})]}))

(clojure.core/defn- req-describe-load-balancer-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"})]}))

(clojure.core/defn- req-remove-listener-certificates-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"}) (clojure.core/into (ser-certificate-list (input :certificates)) #:http.request.field{:name "Certificates", :shape "CertificateList"})]}))

(clojure.core/defn- req-remove-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arns (input :resource-arns)) #:http.request.field{:name "ResourceArns", :shape "ResourceArns"}) (clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys"})]}))

(clojure.core/defn- req-register-targets-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"}) (clojure.core/into (ser-target-descriptions (input :targets)) #:http.request.field{:name "Targets", :shape "TargetDescriptions"})]}))

(clojure.core/defn- req-describe-listeners-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :load-balancer-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"})) (clojure.core/contains? input :listener-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-listener-arns (input :listener-arns)) #:http.request.field{:name "ListenerArns", :shape "ListenerArns"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-describe-account-limits-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-describe-target-groups-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :load-balancer-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"})) (clojure.core/contains? input :target-group-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-arns (input :target-group-arns)) #:http.request.field{:name "TargetGroupArns", :shape "TargetGroupArns"})) (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-names (input :names)) #:http.request.field{:name "Names", :shape "TargetGroupNames"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-modify-target-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"})]} (clojure.core/contains? input :healthy-threshold-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-threshold-count (input :healthy-threshold-count)) #:http.request.field{:name "HealthyThresholdCount", :shape "HealthCheckThresholdCount"})) (clojure.core/contains? input :health-check-timeout-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-timeout-seconds (input :health-check-timeout-seconds)) #:http.request.field{:name "HealthCheckTimeoutSeconds", :shape "HealthCheckTimeoutSeconds"})) (clojure.core/contains? input :unhealthy-threshold-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-threshold-count (input :unhealthy-threshold-count)) #:http.request.field{:name "UnhealthyThresholdCount", :shape "HealthCheckThresholdCount"})) (clojure.core/contains? input :health-check-interval-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-interval-seconds (input :health-check-interval-seconds)) #:http.request.field{:name "HealthCheckIntervalSeconds", :shape "HealthCheckIntervalSeconds"})) (clojure.core/contains? input :health-check-port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-port (input :health-check-port)) #:http.request.field{:name "HealthCheckPort", :shape "HealthCheckPort"})) (clojure.core/contains? input :health-check-protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol-enum (input :health-check-protocol)) #:http.request.field{:name "HealthCheckProtocol", :shape "ProtocolEnum"})) (clojure.core/contains? input :health-check-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-enabled (input :health-check-enabled)) #:http.request.field{:name "HealthCheckEnabled", :shape "HealthCheckEnabled"})) (clojure.core/contains? input :matcher) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matcher (input :matcher)) #:http.request.field{:name "Matcher", :shape "Matcher"})) (clojure.core/contains? input :health-check-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :health-check-path)) #:http.request.field{:name "HealthCheckPath", :shape "Path"}))))

(clojure.core/defn- req-modify-rule-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-arn (input :rule-arn)) #:http.request.field{:name "RuleArn", :shape "RuleArn"})]} (clojure.core/contains? input :conditions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-condition-list (input :conditions)) #:http.request.field{:name "Conditions", :shape "RuleConditionList"})) (clojure.core/contains? input :actions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-actions (input :actions)) #:http.request.field{:name "Actions", :shape "Actions"}))))

(clojure.core/defn- req-create-rule-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"}) (clojure.core/into (ser-rule-condition-list (input :conditions)) #:http.request.field{:name "Conditions", :shape "RuleConditionList"}) (clojure.core/into (ser-rule-priority (input :priority)) #:http.request.field{:name "Priority", :shape "RulePriority"}) (clojure.core/into (ser-actions (input :actions)) #:http.request.field{:name "Actions", :shape "Actions"})]}))

(clojure.core/defn- req-describe-load-balancers-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :load-balancer-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-arns (input :load-balancer-arns)) #:http.request.field{:name "LoadBalancerArns", :shape "LoadBalancerArns"})) (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-names (input :names)) #:http.request.field{:name "Names", :shape "LoadBalancerNames"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-describe-target-health-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"})]} (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-descriptions (input :targets)) #:http.request.field{:name "Targets", :shape "TargetDescriptions"}))))

(clojure.core/defn- req-deregister-targets-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"}) (clojure.core/into (ser-target-descriptions (input :targets)) #:http.request.field{:name "Targets", :shape "TargetDescriptions"})]}))

(clojure.core/defn- req-add-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arns (input :resource-arns)) #:http.request.field{:name "ResourceArns", :shape "ResourceArns"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-describe-rules-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :listener-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"})) (clojure.core/contains? input :rule-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-arns (input :rule-arns)) #:http.request.field{:name "RuleArns", :shape "RuleArns"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-modify-listener-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"})]} (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol-enum (input :protocol)) #:http.request.field{:name "Protocol", :shape "ProtocolEnum"})) (clojure.core/contains? input :ssl-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-policy-name (input :ssl-policy)) #:http.request.field{:name "SslPolicy", :shape "SslPolicyName"})) (clojure.core/contains? input :certificates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-list (input :certificates)) #:http.request.field{:name "Certificates", :shape "CertificateList"})) (clojure.core/contains? input :default-actions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-actions (input :default-actions)) #:http.request.field{:name "DefaultActions", :shape "Actions"}))))

(clojure.core/defn- req-delete-target-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"})]}))

(clojure.core/defn- req-set-subnets-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"})]} (clojure.core/contains? input :subnets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnets (input :subnets)) #:http.request.field{:name "Subnets", :shape "Subnets"})) (clojure.core/contains? input :subnet-mappings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-mappings (input :subnet-mappings)) #:http.request.field{:name "SubnetMappings", :shape "SubnetMappings"}))))

(clojure.core/defn- req-modify-load-balancer-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"}) (clojure.core/into (ser-load-balancer-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "LoadBalancerAttributes"})]}))

(clojure.core/defn- req-create-load-balancer-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-name (input :name)) #:http.request.field{:name "Name", :shape "LoadBalancerName"})]} (clojure.core/contains? input :subnets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnets (input :subnets)) #:http.request.field{:name "Subnets", :shape "Subnets"})) (clojure.core/contains? input :subnet-mappings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-mappings (input :subnet-mappings)) #:http.request.field{:name "SubnetMappings", :shape "SubnetMappings"})) (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"})) (clojure.core/contains? input :scheme) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-scheme-enum (input :scheme)) #:http.request.field{:name "Scheme", :shape "LoadBalancerSchemeEnum"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-type-enum (input :type)) #:http.request.field{:name "Type", :shape "LoadBalancerTypeEnum"})) (clojure.core/contains? input :ip-address-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address-type (input :ip-address-type)) #:http.request.field{:name "IpAddressType", :shape "IpAddressType"}))))

(clojure.core/defn- req-delete-load-balancer-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"})]}))

(clojure.core/defn- req-describe-listener-certificates-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-set-rule-priorities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-priority-list (input :rule-priorities)) #:http.request.field{:name "RulePriorities", :shape "RulePriorityList"})]}))

(clojure.core/defn- req-describe-ssl-policies-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-policy-names (input :names)) #:http.request.field{:name "Names", :shape "SslPolicyNames"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-delete-listener-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"})]}))

(clojure.core/defn- req-create-target-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-name (input :name)) #:http.request.field{:name "Name", :shape "TargetGroupName"})]} (clojure.core/contains? input :healthy-threshold-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-threshold-count (input :healthy-threshold-count)) #:http.request.field{:name "HealthyThresholdCount", :shape "HealthCheckThresholdCount"})) (clojure.core/contains? input :health-check-timeout-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-timeout-seconds (input :health-check-timeout-seconds)) #:http.request.field{:name "HealthCheckTimeoutSeconds", :shape "HealthCheckTimeoutSeconds"})) (clojure.core/contains? input :target-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-type-enum (input :target-type)) #:http.request.field{:name "TargetType", :shape "TargetTypeEnum"})) (clojure.core/contains? input :unhealthy-threshold-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-threshold-count (input :unhealthy-threshold-count)) #:http.request.field{:name "UnhealthyThresholdCount", :shape "HealthCheckThresholdCount"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol-enum (input :protocol)) #:http.request.field{:name "Protocol", :shape "ProtocolEnum"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :vpc-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-id (input :vpc-id)) #:http.request.field{:name "VpcId", :shape "VpcId"})) (clojure.core/contains? input :health-check-interval-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-interval-seconds (input :health-check-interval-seconds)) #:http.request.field{:name "HealthCheckIntervalSeconds", :shape "HealthCheckIntervalSeconds"})) (clojure.core/contains? input :health-check-port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-port (input :health-check-port)) #:http.request.field{:name "HealthCheckPort", :shape "HealthCheckPort"})) (clojure.core/contains? input :health-check-protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol-enum (input :health-check-protocol)) #:http.request.field{:name "HealthCheckProtocol", :shape "ProtocolEnum"})) (clojure.core/contains? input :health-check-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-enabled (input :health-check-enabled)) #:http.request.field{:name "HealthCheckEnabled", :shape "HealthCheckEnabled"})) (clojure.core/contains? input :matcher) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matcher (input :matcher)) #:http.request.field{:name "Matcher", :shape "Matcher"})) (clojure.core/contains? input :health-check-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :health-check-path)) #:http.request.field{:name "HealthCheckPath", :shape "Path"}))))

(clojure.core/defn- req-describe-target-group-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"})]}))

(clojure.core/defn- req-delete-rule-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-arn (input :rule-arn)) #:http.request.field{:name "RuleArn", :shape "RuleArn"})]}))

(clojure.core/declare deser-target-health-state-enum)

(clojure.core/declare deser-certificate-list)

(clojure.core/declare deser-authenticate-cognito-action-authentication-request-extra-params)

(clojure.core/declare deser-cipher-priority)

(clojure.core/declare deser-load-balancer-attributes)

(clojure.core/declare deser-load-balancer-scheme-enum)

(clojure.core/declare deser-target-groups)

(clojure.core/declare deser-load-balancer-addresses)

(clojure.core/declare deser-default)

(clojure.core/declare deser-target-group-attribute-value)

(clojure.core/declare deser-max)

(clojure.core/declare deser-authenticate-oidc-action-conditional-behavior-enum)

(clojure.core/declare deser-authenticate-oidc-action-authentication-request-param-value)

(clojure.core/declare deser-authenticate-cognito-action-config)

(clojure.core/declare deser-cipher)

(clojure.core/declare deser-redirect-action-protocol)

(clojure.core/declare deser-authenticate-cognito-action-authentication-request-param-value)

(clojure.core/declare deser-authenticate-oidc-action-authorization-endpoint)

(clojure.core/declare deser-load-balancer-arns)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-authenticate-oidc-action-authentication-request-param-name)

(clojure.core/declare deser-security-groups)

(clojure.core/declare deser-path)

(clojure.core/declare deser-cipher-name)

(clojure.core/declare deser-health-check-timeout-seconds)

(clojure.core/declare deser-authenticate-cognito-action-user-pool-client-id)

(clojure.core/declare deser-rule-condition-list)

(clojure.core/declare deser-authenticate-oidc-action-user-info-endpoint)

(clojure.core/declare deser-actions)

(clojure.core/declare deser-authenticate-cognito-action-user-pool-domain)

(clojure.core/declare deser-list-of-string)

(clojure.core/declare deser-load-balancer-attribute-value)

(clojure.core/declare deser-load-balancer-arn)

(clojure.core/declare deser-load-balancer-name)

(clojure.core/declare deser-allocation-id)

(clojure.core/declare deser-marker)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-authenticate-cognito-action-session-timeout)

(clojure.core/declare deser-rule-arn)

(clojure.core/declare deser-protocol-enum)

(clojure.core/declare deser-authenticate-oidc-action-client-id)

(clojure.core/declare deser-load-balancer-state-enum)

(clojure.core/declare deser-target-group-arn)

(clojure.core/declare deser-ssl-policies)

(clojure.core/declare deser-limit)

(clojure.core/declare deser-redirect-action-status-code-enum)

(clojure.core/declare deser-target-group-attribute-key)

(clojure.core/declare deser-fixed-response-action-config)

(clojure.core/declare deser-availability-zone)

(clojure.core/declare deser-target-type-enum)

(clojure.core/declare deser-ciphers)

(clojure.core/declare deser-ip-address-type)

(clojure.core/declare deser-ssl-policy-name)

(clojure.core/declare deser-action-type-enum)

(clojure.core/declare deser-canonical-hosted-zone-id)

(clojure.core/declare deser-fixed-response-action-content-type)

(clojure.core/declare deser-authenticate-oidc-action-config)

(clojure.core/declare deser-health-check-threshold-count)

(clojure.core/declare deser-authenticate-oidc-action-scope)

(clojure.core/declare deser-target-group-name)

(clojure.core/declare deser-tag-description)

(clojure.core/declare deser-created-time)

(clojure.core/declare deser-ssl-policy)

(clojure.core/declare deser-target-description)

(clojure.core/declare deser-limits)

(clojure.core/declare deser-load-balancer-type-enum)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-load-balancers)

(clojure.core/declare deser-http-code)

(clojure.core/declare deser-target-id)

(clojure.core/declare deser-load-balancer-state)

(clojure.core/declare deser-authenticate-oidc-action-token-endpoint)

(clojure.core/declare deser-redirect-action-path)

(clojure.core/declare deser-redirect-action-config)

(clojure.core/declare deser-target-health)

(clojure.core/declare deser-dns-name)

(clojure.core/declare deser-listener-arn)

(clojure.core/declare deser-redirect-action-query)

(clojure.core/declare deser-target-group-attribute)

(clojure.core/declare deser-tag-descriptions)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-port)

(clojure.core/declare deser-security-group-id)

(clojure.core/declare deser-authenticate-oidc-action-issuer)

(clojure.core/declare deser-authenticate-cognito-action-scope)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-string)

(clojure.core/declare deser-health-check-interval-seconds)

(clojure.core/declare deser-authenticate-oidc-action-use-existing-client-secret)

(clojure.core/declare deser-health-check-port)

(clojure.core/declare deser-rule)

(clojure.core/declare deser-listener)

(clojure.core/declare deser-redirect-action-host)

(clojure.core/declare deser-target-health-reason-enum)

(clojure.core/declare deser-load-balancer-attribute-key)

(clojure.core/declare deser-authenticate-cognito-action-user-pool-arn)

(clojure.core/declare deser-certificate-arn)

(clojure.core/declare deser-fixed-response-action-message)

(clojure.core/declare deser-condition-field-name)

(clojure.core/declare deser-listeners)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-rule-condition)

(clojure.core/declare deser-load-balancer)

(clojure.core/declare deser-target-health-descriptions)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-ssl-protocols)

(clojure.core/declare deser-authenticate-oidc-action-session-cookie-name)

(clojure.core/declare deser-fixed-response-action-status-code)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-action-order)

(clojure.core/declare deser-ssl-protocol)

(clojure.core/declare deser-authenticate-oidc-action-authentication-request-extra-params)

(clojure.core/declare deser-health-check-enabled)

(clojure.core/declare deser-name)

(clojure.core/declare deser-authenticate-cognito-action-session-cookie-name)

(clojure.core/declare deser-authenticate-cognito-action-authentication-request-param-name)

(clojure.core/declare deser-rules)

(clojure.core/declare deser-authenticate-oidc-action-session-timeout)

(clojure.core/declare deser-is-default)

(clojure.core/declare deser-target-group)

(clojure.core/declare deser-matcher)

(clojure.core/declare deser-availability-zones)

(clojure.core/declare deser-target-group-attributes)

(clojure.core/declare deser-redirect-action-port)

(clojure.core/declare deser-authenticate-oidc-action-client-secret)

(clojure.core/declare deser-action)

(clojure.core/declare deser-authenticate-cognito-action-conditional-behavior-enum)

(clojure.core/declare deser-certificate)

(clojure.core/declare deser-load-balancer-address)

(clojure.core/declare deser-state-reason)

(clojure.core/declare deser-load-balancer-attribute)

(clojure.core/declare deser-target-health-description)

(clojure.core/declare deser-string-value)

(clojure.core/declare deser-zone-name)

(clojure.core/defn- deser-target-health-state-enum [input] (clojure.core/get {"initial" :initial, "healthy" :healthy, "unhealthy" :unhealthy, "unused" :unused, "draining" :draining, "unavailable" :unavailable} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-certificate-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-certificate coll))) input))

(clojure.core/defn- deser-authenticate-cognito-action-authentication-request-extra-params [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-authenticate-cognito-action-authentication-request-param-name k) (deser-authenticate-cognito-action-authentication-request-param-value v)]))) input)))

(clojure.core/defn- deser-cipher-priority [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-load-balancer-attributes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-attribute coll))) input))

(clojure.core/defn- deser-load-balancer-scheme-enum [input] (clojure.core/get {"internet-facing" :internetfacing, "internal" :internal} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-target-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-group coll))) input))

(clojure.core/defn- deser-load-balancer-addresses [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-address coll))) input))

(clojure.core/defn- deser-default [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-target-group-attribute-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-max [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-oidc-action-conditional-behavior-enum [input] (clojure.core/get {"deny" :deny, "allow" :allow, "authenticate" :authenticate} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-authenticate-oidc-action-authentication-request-param-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-cognito-action-config [input] (clojure.core/let [letvar878393 {"UserPoolArn" (portkey.aws/search-for-tag input "UserPoolArn" :flattened? nil :xmlAttribute? nil), "UserPoolClientId" (portkey.aws/search-for-tag input "UserPoolClientId" :flattened? nil :xmlAttribute? nil), "UserPoolDomain" (portkey.aws/search-for-tag input "UserPoolDomain" :flattened? nil :xmlAttribute? nil), "SessionCookieName" (portkey.aws/search-for-tag input "SessionCookieName" :flattened? nil :xmlAttribute? nil), "Scope" (portkey.aws/search-for-tag input "Scope" :flattened? nil :xmlAttribute? nil), "SessionTimeout" (portkey.aws/search-for-tag input "SessionTimeout" :flattened? nil :xmlAttribute? nil), "AuthenticationRequestExtraParams" (portkey.aws/search-for-tag input "AuthenticationRequestExtraParams" :flattened? nil :xmlAttribute? nil), "OnUnauthenticatedRequest" (portkey.aws/search-for-tag input "OnUnauthenticatedRequest" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:user-pool-arn (deser-authenticate-cognito-action-user-pool-arn (clojure.core/get-in letvar878393 ["UserPoolArn" :content])), :user-pool-client-id (deser-authenticate-cognito-action-user-pool-client-id (clojure.core/get-in letvar878393 ["UserPoolClientId" :content])), :user-pool-domain (deser-authenticate-cognito-action-user-pool-domain (clojure.core/get-in letvar878393 ["UserPoolDomain" :content]))} (letvar878393 "SessionCookieName") (clojure.core/assoc :session-cookie-name (deser-authenticate-cognito-action-session-cookie-name (clojure.core/get-in letvar878393 ["SessionCookieName" :content]))) (letvar878393 "Scope") (clojure.core/assoc :scope (deser-authenticate-cognito-action-scope (clojure.core/get-in letvar878393 ["Scope" :content]))) (letvar878393 "SessionTimeout") (clojure.core/assoc :session-timeout (deser-authenticate-cognito-action-session-timeout (clojure.core/get-in letvar878393 ["SessionTimeout" :content]))) (letvar878393 "AuthenticationRequestExtraParams") (clojure.core/assoc :authentication-request-extra-params (deser-authenticate-cognito-action-authentication-request-extra-params (clojure.core/get-in letvar878393 ["AuthenticationRequestExtraParams" :content]))) (letvar878393 "OnUnauthenticatedRequest") (clojure.core/assoc :on-unauthenticated-request (deser-authenticate-cognito-action-conditional-behavior-enum (clojure.core/get-in letvar878393 ["OnUnauthenticatedRequest" :content]))))))

(clojure.core/defn- deser-cipher [input] (clojure.core/let [letvar878501 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Priority" (portkey.aws/search-for-tag input "Priority" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar878501 "Name") (clojure.core/assoc :name (deser-cipher-name (clojure.core/get-in letvar878501 ["Name" :content]))) (letvar878501 "Priority") (clojure.core/assoc :priority (deser-cipher-priority (clojure.core/get-in letvar878501 ["Priority" :content]))))))

(clojure.core/defn- deser-redirect-action-protocol [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-cognito-action-authentication-request-param-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-oidc-action-authorization-endpoint [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-arns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-arn coll))) input))

(clojure.core/defn- deser-subnet-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-oidc-action-authentication-request-param-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-security-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group-id coll))) input))

(clojure.core/defn- deser-path [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cipher-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-health-check-timeout-seconds [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-authenticate-cognito-action-user-pool-client-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-rule-condition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rule-condition coll))) input))

(clojure.core/defn- deser-authenticate-oidc-action-user-info-endpoint [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-actions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-action coll))) input))

(clojure.core/defn- deser-authenticate-cognito-action-user-pool-domain [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-list-of-string [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-value coll))) input))

(clojure.core/defn- deser-load-balancer-attribute-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allocation-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-cognito-action-session-timeout [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-rule-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-protocol-enum [input] (clojure.core/get {"HTTP" :http, "HTTPS" :https, "TCP" :tcp, "TLS" :tls} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-authenticate-oidc-action-client-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-state-enum [input] (clojure.core/get {"active" :active, "provisioning" :provisioning, "active_impaired" :active-impaired, "failed" :failed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-target-group-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ssl-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-policy coll))) input))

(clojure.core/defn- deser-limit [input] (clojure.core/let [letvar878820 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Max" (portkey.aws/search-for-tag input "Max" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar878820 "Name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar878820 ["Name" :content]))) (letvar878820 "Max") (clojure.core/assoc :max (deser-max (clojure.core/get-in letvar878820 ["Max" :content]))))))

(clojure.core/defn- deser-redirect-action-status-code-enum [input] (clojure.core/get {"HTTP_301" :http-301, "HTTP_302" :http-302} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-target-group-attribute-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-fixed-response-action-config [input] (clojure.core/let [letvar878938 {"MessageBody" (portkey.aws/search-for-tag input "MessageBody" :flattened? nil :xmlAttribute? nil), "StatusCode" (portkey.aws/search-for-tag input "StatusCode" :flattened? nil :xmlAttribute? nil), "ContentType" (portkey.aws/search-for-tag input "ContentType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:status-code (deser-fixed-response-action-status-code (clojure.core/get-in letvar878938 ["StatusCode" :content]))} (letvar878938 "MessageBody") (clojure.core/assoc :message-body (deser-fixed-response-action-message (clojure.core/get-in letvar878938 ["MessageBody" :content]))) (letvar878938 "ContentType") (clojure.core/assoc :content-type (deser-fixed-response-action-content-type (clojure.core/get-in letvar878938 ["ContentType" :content]))))))

(clojure.core/defn- deser-availability-zone [input] (clojure.core/let [letvar879046 {"ZoneName" (portkey.aws/search-for-tag input "ZoneName" :flattened? nil :xmlAttribute? nil), "SubnetId" (portkey.aws/search-for-tag input "SubnetId" :flattened? nil :xmlAttribute? nil), "LoadBalancerAddresses" (portkey.aws/search-for-tag input "LoadBalancerAddresses" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar879046 "ZoneName") (clojure.core/assoc :zone-name (deser-zone-name (clojure.core/get-in letvar879046 ["ZoneName" :content]))) (letvar879046 "SubnetId") (clojure.core/assoc :subnet-id (deser-subnet-id (clojure.core/get-in letvar879046 ["SubnetId" :content]))) (letvar879046 "LoadBalancerAddresses") (clojure.core/assoc :load-balancer-addresses (deser-load-balancer-addresses (clojure.core/get-in letvar879046 ["LoadBalancerAddresses" :content]))))))

(clojure.core/defn- deser-target-type-enum [input] (clojure.core/get {"instance" :instance, "ip" :ip, "lambda" :lambda} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-ciphers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cipher coll))) input))

(clojure.core/defn- deser-ip-address-type [input] (clojure.core/get {"ipv4" :ipv-4, "dualstack" :dualstack} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-ssl-policy-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-action-type-enum [input] (clojure.core/get {"forward" :forward, "authenticate-oidc" :authenticateoidc, "authenticate-cognito" :authenticatecognito, "redirect" :redirect, "fixed-response" :fixedresponse} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-canonical-hosted-zone-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-fixed-response-action-content-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-oidc-action-config [input] (clojure.core/let [letvar879201 {"UserInfoEndpoint" (portkey.aws/search-for-tag input "UserInfoEndpoint" :flattened? nil :xmlAttribute? nil), "UseExistingClientSecret" (portkey.aws/search-for-tag input "UseExistingClientSecret" :flattened? nil :xmlAttribute? nil), "OnUnauthenticatedRequest" (portkey.aws/search-for-tag input "OnUnauthenticatedRequest" :flattened? nil :xmlAttribute? nil), "SessionTimeout" (portkey.aws/search-for-tag input "SessionTimeout" :flattened? nil :xmlAttribute? nil), "TokenEndpoint" (portkey.aws/search-for-tag input "TokenEndpoint" :flattened? nil :xmlAttribute? nil), "Issuer" (portkey.aws/search-for-tag input "Issuer" :flattened? nil :xmlAttribute? nil), "ClientId" (portkey.aws/search-for-tag input "ClientId" :flattened? nil :xmlAttribute? nil), "AuthenticationRequestExtraParams" (portkey.aws/search-for-tag input "AuthenticationRequestExtraParams" :flattened? nil :xmlAttribute? nil), "ClientSecret" (portkey.aws/search-for-tag input "ClientSecret" :flattened? nil :xmlAttribute? nil), "SessionCookieName" (portkey.aws/search-for-tag input "SessionCookieName" :flattened? nil :xmlAttribute? nil), "AuthorizationEndpoint" (portkey.aws/search-for-tag input "AuthorizationEndpoint" :flattened? nil :xmlAttribute? nil), "Scope" (portkey.aws/search-for-tag input "Scope" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:issuer (deser-authenticate-oidc-action-issuer (clojure.core/get-in letvar879201 ["Issuer" :content])), :authorization-endpoint (deser-authenticate-oidc-action-authorization-endpoint (clojure.core/get-in letvar879201 ["AuthorizationEndpoint" :content])), :token-endpoint (deser-authenticate-oidc-action-token-endpoint (clojure.core/get-in letvar879201 ["TokenEndpoint" :content])), :user-info-endpoint (deser-authenticate-oidc-action-user-info-endpoint (clojure.core/get-in letvar879201 ["UserInfoEndpoint" :content])), :client-id (deser-authenticate-oidc-action-client-id (clojure.core/get-in letvar879201 ["ClientId" :content]))} (letvar879201 "UseExistingClientSecret") (clojure.core/assoc :use-existing-client-secret (deser-authenticate-oidc-action-use-existing-client-secret (clojure.core/get-in letvar879201 ["UseExistingClientSecret" :content]))) (letvar879201 "OnUnauthenticatedRequest") (clojure.core/assoc :on-unauthenticated-request (deser-authenticate-oidc-action-conditional-behavior-enum (clojure.core/get-in letvar879201 ["OnUnauthenticatedRequest" :content]))) (letvar879201 "SessionTimeout") (clojure.core/assoc :session-timeout (deser-authenticate-oidc-action-session-timeout (clojure.core/get-in letvar879201 ["SessionTimeout" :content]))) (letvar879201 "AuthenticationRequestExtraParams") (clojure.core/assoc :authentication-request-extra-params (deser-authenticate-oidc-action-authentication-request-extra-params (clojure.core/get-in letvar879201 ["AuthenticationRequestExtraParams" :content]))) (letvar879201 "ClientSecret") (clojure.core/assoc :client-secret (deser-authenticate-oidc-action-client-secret (clojure.core/get-in letvar879201 ["ClientSecret" :content]))) (letvar879201 "SessionCookieName") (clojure.core/assoc :session-cookie-name (deser-authenticate-oidc-action-session-cookie-name (clojure.core/get-in letvar879201 ["SessionCookieName" :content]))) (letvar879201 "Scope") (clojure.core/assoc :scope (deser-authenticate-oidc-action-scope (clojure.core/get-in letvar879201 ["Scope" :content]))))))

(clojure.core/defn- deser-health-check-threshold-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-authenticate-oidc-action-scope [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-target-group-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-description [input] (clojure.core/let [letvar879321 {"ResourceArn" (portkey.aws/search-for-tag input "ResourceArn" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar879321 "ResourceArn") (clojure.core/assoc :resource-arn (deser-resource-arn (clojure.core/get-in letvar879321 ["ResourceArn" :content]))) (letvar879321 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar879321 ["Tags" :content]))))))

(clojure.core/defn- deser-created-time [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ssl-policy [input] (clojure.core/let [letvar879431 {"SslProtocols" (portkey.aws/search-for-tag input "SslProtocols" :flattened? nil :xmlAttribute? nil), "Ciphers" (portkey.aws/search-for-tag input "Ciphers" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar879431 "SslProtocols") (clojure.core/assoc :ssl-protocols (deser-ssl-protocols (clojure.core/get-in letvar879431 ["SslProtocols" :content]))) (letvar879431 "Ciphers") (clojure.core/assoc :ciphers (deser-ciphers (clojure.core/get-in letvar879431 ["Ciphers" :content]))) (letvar879431 "Name") (clojure.core/assoc :name (deser-ssl-policy-name (clojure.core/get-in letvar879431 ["Name" :content]))))))

(clojure.core/defn- deser-target-description [input] (clojure.core/let [letvar879539 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Port" (portkey.aws/search-for-tag input "Port" :flattened? nil :xmlAttribute? nil), "AvailabilityZone" (portkey.aws/search-for-tag input "AvailabilityZone" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-target-id (clojure.core/get-in letvar879539 ["Id" :content]))} (letvar879539 "Port") (clojure.core/assoc :port (deser-port (clojure.core/get-in letvar879539 ["Port" :content]))) (letvar879539 "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-zone-name (clojure.core/get-in letvar879539 ["AvailabilityZone" :content]))))))

(clojure.core/defn- deser-limits [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-limit coll))) input))

(clojure.core/defn- deser-load-balancer-type-enum [input] (clojure.core/get {"application" :application, "network" :network} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-load-balancers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer coll))) input))

(clojure.core/defn- deser-http-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-target-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-state [input] (clojure.core/let [letvar879713 {"Code" (portkey.aws/search-for-tag input "Code" :flattened? nil :xmlAttribute? nil), "Reason" (portkey.aws/search-for-tag input "Reason" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar879713 "Code") (clojure.core/assoc :code (deser-load-balancer-state-enum (clojure.core/get-in letvar879713 ["Code" :content]))) (letvar879713 "Reason") (clojure.core/assoc :reason (deser-state-reason (clojure.core/get-in letvar879713 ["Reason" :content]))))))

(clojure.core/defn- deser-authenticate-oidc-action-token-endpoint [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-redirect-action-path [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-redirect-action-config [input] (clojure.core/let [letvar879831 {"Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil), "Port" (portkey.aws/search-for-tag input "Port" :flattened? nil :xmlAttribute? nil), "Host" (portkey.aws/search-for-tag input "Host" :flattened? nil :xmlAttribute? nil), "Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "Query" (portkey.aws/search-for-tag input "Query" :flattened? nil :xmlAttribute? nil), "StatusCode" (portkey.aws/search-for-tag input "StatusCode" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:status-code (deser-redirect-action-status-code-enum (clojure.core/get-in letvar879831 ["StatusCode" :content]))} (letvar879831 "Protocol") (clojure.core/assoc :protocol (deser-redirect-action-protocol (clojure.core/get-in letvar879831 ["Protocol" :content]))) (letvar879831 "Port") (clojure.core/assoc :port (deser-redirect-action-port (clojure.core/get-in letvar879831 ["Port" :content]))) (letvar879831 "Host") (clojure.core/assoc :host (deser-redirect-action-host (clojure.core/get-in letvar879831 ["Host" :content]))) (letvar879831 "Path") (clojure.core/assoc :path (deser-redirect-action-path (clojure.core/get-in letvar879831 ["Path" :content]))) (letvar879831 "Query") (clojure.core/assoc :query (deser-redirect-action-query (clojure.core/get-in letvar879831 ["Query" :content]))))))

(clojure.core/defn- deser-target-health [input] (clojure.core/let [letvar879939 {"State" (portkey.aws/search-for-tag input "State" :flattened? nil :xmlAttribute? nil), "Reason" (portkey.aws/search-for-tag input "Reason" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar879939 "State") (clojure.core/assoc :state (deser-target-health-state-enum (clojure.core/get-in letvar879939 ["State" :content]))) (letvar879939 "Reason") (clojure.core/assoc :reason (deser-target-health-reason-enum (clojure.core/get-in letvar879939 ["Reason" :content]))) (letvar879939 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar879939 ["Description" :content]))))))

(clojure.core/defn- deser-dns-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-listener-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-redirect-action-query [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-target-group-attribute [input] (clojure.core/let [letvar880062 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar880062 "Key") (clojure.core/assoc :key (deser-target-group-attribute-key (clojure.core/get-in letvar880062 ["Key" :content]))) (letvar880062 "Value") (clojure.core/assoc :value (deser-target-group-attribute-value (clojure.core/get-in letvar880062 ["Value" :content]))))))

(clojure.core/defn- deser-tag-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-description coll))) input))

(clojure.core/defn- deser-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-port [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-security-group-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-oidc-action-issuer [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-cognito-action-scope [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-vpc-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-health-check-interval-seconds [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-authenticate-oidc-action-use-existing-client-secret [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-health-check-port [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-rule [input] (clojure.core/let [letvar880233 {"RuleArn" (portkey.aws/search-for-tag input "RuleArn" :flattened? nil :xmlAttribute? nil), "Priority" (portkey.aws/search-for-tag input "Priority" :flattened? nil :xmlAttribute? nil), "Conditions" (portkey.aws/search-for-tag input "Conditions" :flattened? nil :xmlAttribute? nil), "Actions" (portkey.aws/search-for-tag input "Actions" :flattened? nil :xmlAttribute? nil), "IsDefault" (portkey.aws/search-for-tag input "IsDefault" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar880233 "RuleArn") (clojure.core/assoc :rule-arn (deser-rule-arn (clojure.core/get-in letvar880233 ["RuleArn" :content]))) (letvar880233 "Priority") (clojure.core/assoc :priority (deser-string (clojure.core/get-in letvar880233 ["Priority" :content]))) (letvar880233 "Conditions") (clojure.core/assoc :conditions (deser-rule-condition-list (clojure.core/get-in letvar880233 ["Conditions" :content]))) (letvar880233 "Actions") (clojure.core/assoc :actions (deser-actions (clojure.core/get-in letvar880233 ["Actions" :content]))) (letvar880233 "IsDefault") (clojure.core/assoc :is-default (deser-is-default (clojure.core/get-in letvar880233 ["IsDefault" :content]))))))

(clojure.core/defn- deser-listener [input] (clojure.core/let [letvar880341 {"ListenerArn" (portkey.aws/search-for-tag input "ListenerArn" :flattened? nil :xmlAttribute? nil), "LoadBalancerArn" (portkey.aws/search-for-tag input "LoadBalancerArn" :flattened? nil :xmlAttribute? nil), "Port" (portkey.aws/search-for-tag input "Port" :flattened? nil :xmlAttribute? nil), "Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil), "Certificates" (portkey.aws/search-for-tag input "Certificates" :flattened? nil :xmlAttribute? nil), "SslPolicy" (portkey.aws/search-for-tag input "SslPolicy" :flattened? nil :xmlAttribute? nil), "DefaultActions" (portkey.aws/search-for-tag input "DefaultActions" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar880341 "ListenerArn") (clojure.core/assoc :listener-arn (deser-listener-arn (clojure.core/get-in letvar880341 ["ListenerArn" :content]))) (letvar880341 "LoadBalancerArn") (clojure.core/assoc :load-balancer-arn (deser-load-balancer-arn (clojure.core/get-in letvar880341 ["LoadBalancerArn" :content]))) (letvar880341 "Port") (clojure.core/assoc :port (deser-port (clojure.core/get-in letvar880341 ["Port" :content]))) (letvar880341 "Protocol") (clojure.core/assoc :protocol (deser-protocol-enum (clojure.core/get-in letvar880341 ["Protocol" :content]))) (letvar880341 "Certificates") (clojure.core/assoc :certificates (deser-certificate-list (clojure.core/get-in letvar880341 ["Certificates" :content]))) (letvar880341 "SslPolicy") (clojure.core/assoc :ssl-policy (deser-ssl-policy-name (clojure.core/get-in letvar880341 ["SslPolicy" :content]))) (letvar880341 "DefaultActions") (clojure.core/assoc :default-actions (deser-actions (clojure.core/get-in letvar880341 ["DefaultActions" :content]))))))

(clojure.core/defn- deser-redirect-action-host [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-target-health-reason-enum [input] (clojure.core/get {"Elb.InitialHealthChecking" :elb-initial-health-checking, "Target.NotInUse" :target-not-in-use, "Elb.RegistrationInProgress" :elb-registration-in-progress, "Target.InvalidState" :target-invalid-state, "Target.ResponseCodeMismatch" :target-response-code-mismatch, "Target.DeregistrationInProgress" :target-deregistration-in-progress, "Target.Timeout" :target-timeout, "Target.IpUnusable" :target-ip-unusable, "Elb.InternalError" :elb-internal-error, "Target.NotRegistered" :target-not-registered, "Target.HealthCheckDisabled" :target-health-check-disabled, "Target.FailedHealthChecks" :target-failed-health-checks} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-load-balancer-attribute-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-cognito-action-user-pool-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-certificate-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-fixed-response-action-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-condition-field-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-listeners [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listener coll))) input))

(clojure.core/defn- deser-ip-address [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-rule-condition [input] (clojure.core/let [letvar880506 {"Field" (portkey.aws/search-for-tag input "Field" :flattened? nil :xmlAttribute? nil), "Values" (portkey.aws/search-for-tag input "Values" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar880506 "Field") (clojure.core/assoc :field (deser-condition-field-name (clojure.core/get-in letvar880506 ["Field" :content]))) (letvar880506 "Values") (clojure.core/assoc :values (deser-list-of-string (clojure.core/get-in letvar880506 ["Values" :content]))))))

(clojure.core/defn- deser-load-balancer [input] (clojure.core/let [letvar880614 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "SecurityGroups" (portkey.aws/search-for-tag input "SecurityGroups" :flattened? nil :xmlAttribute? nil), "LoadBalancerArn" (portkey.aws/search-for-tag input "LoadBalancerArn" :flattened? nil :xmlAttribute? nil), "LoadBalancerName" (portkey.aws/search-for-tag input "LoadBalancerName" :flattened? nil :xmlAttribute? nil), "IpAddressType" (portkey.aws/search-for-tag input "IpAddressType" :flattened? nil :xmlAttribute? nil), "CanonicalHostedZoneId" (portkey.aws/search-for-tag input "CanonicalHostedZoneId" :flattened? nil :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? nil :xmlAttribute? nil), "Scheme" (portkey.aws/search-for-tag input "Scheme" :flattened? nil :xmlAttribute? nil), "DNSName" (portkey.aws/search-for-tag input "DNSName" :flattened? nil :xmlAttribute? nil), "VpcId" (portkey.aws/search-for-tag input "VpcId" :flattened? nil :xmlAttribute? nil), "State" (portkey.aws/search-for-tag input "State" :flattened? nil :xmlAttribute? nil), "AvailabilityZones" (portkey.aws/search-for-tag input "AvailabilityZones" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar880614 "Type") (clojure.core/assoc :type (deser-load-balancer-type-enum (clojure.core/get-in letvar880614 ["Type" :content]))) (letvar880614 "SecurityGroups") (clojure.core/assoc :security-groups (deser-security-groups (clojure.core/get-in letvar880614 ["SecurityGroups" :content]))) (letvar880614 "LoadBalancerArn") (clojure.core/assoc :load-balancer-arn (deser-load-balancer-arn (clojure.core/get-in letvar880614 ["LoadBalancerArn" :content]))) (letvar880614 "LoadBalancerName") (clojure.core/assoc :load-balancer-name (deser-load-balancer-name (clojure.core/get-in letvar880614 ["LoadBalancerName" :content]))) (letvar880614 "IpAddressType") (clojure.core/assoc :ip-address-type (deser-ip-address-type (clojure.core/get-in letvar880614 ["IpAddressType" :content]))) (letvar880614 "CanonicalHostedZoneId") (clojure.core/assoc :canonical-hosted-zone-id (deser-canonical-hosted-zone-id (clojure.core/get-in letvar880614 ["CanonicalHostedZoneId" :content]))) (letvar880614 "CreatedTime") (clojure.core/assoc :created-time (deser-created-time (clojure.core/get-in letvar880614 ["CreatedTime" :content]))) (letvar880614 "Scheme") (clojure.core/assoc :scheme (deser-load-balancer-scheme-enum (clojure.core/get-in letvar880614 ["Scheme" :content]))) (letvar880614 "DNSName") (clojure.core/assoc :dns-name (deser-dns-name (clojure.core/get-in letvar880614 ["DNSName" :content]))) (letvar880614 "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (clojure.core/get-in letvar880614 ["VpcId" :content]))) (letvar880614 "State") (clojure.core/assoc :state (deser-load-balancer-state (clojure.core/get-in letvar880614 ["State" :content]))) (letvar880614 "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-availability-zones (clojure.core/get-in letvar880614 ["AvailabilityZones" :content]))))))

(clojure.core/defn- deser-target-health-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-health-description coll))) input))

(clojure.core/defn- deser-resource-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ssl-protocols [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-authenticate-oidc-action-session-cookie-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-fixed-response-action-status-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar880771 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar880771 ["Key" :content]))} (letvar880771 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar880771 ["Value" :content]))))))

(clojure.core/defn- deser-action-order [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-ssl-protocol [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-oidc-action-authentication-request-extra-params [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-authenticate-oidc-action-authentication-request-param-name k) (deser-authenticate-oidc-action-authentication-request-param-value v)]))) input)))

(clojure.core/defn- deser-health-check-enabled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-cognito-action-session-cookie-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-cognito-action-authentication-request-param-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rule coll))) input))

(clojure.core/defn- deser-authenticate-oidc-action-session-timeout [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-is-default [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-target-group [input] (clojure.core/let [letvar880947 {"HealthyThresholdCount" (portkey.aws/search-for-tag input "HealthyThresholdCount" :flattened? nil :xmlAttribute? nil), "LoadBalancerArns" (portkey.aws/search-for-tag input "LoadBalancerArns" :flattened? nil :xmlAttribute? nil), "HealthCheckTimeoutSeconds" (portkey.aws/search-for-tag input "HealthCheckTimeoutSeconds" :flattened? nil :xmlAttribute? nil), "TargetType" (portkey.aws/search-for-tag input "TargetType" :flattened? nil :xmlAttribute? nil), "UnhealthyThresholdCount" (portkey.aws/search-for-tag input "UnhealthyThresholdCount" :flattened? nil :xmlAttribute? nil), "TargetGroupArn" (portkey.aws/search-for-tag input "TargetGroupArn" :flattened? nil :xmlAttribute? nil), "TargetGroupName" (portkey.aws/search-for-tag input "TargetGroupName" :flattened? nil :xmlAttribute? nil), "Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil), "Port" (portkey.aws/search-for-tag input "Port" :flattened? nil :xmlAttribute? nil), "VpcId" (portkey.aws/search-for-tag input "VpcId" :flattened? nil :xmlAttribute? nil), "HealthCheckIntervalSeconds" (portkey.aws/search-for-tag input "HealthCheckIntervalSeconds" :flattened? nil :xmlAttribute? nil), "HealthCheckPort" (portkey.aws/search-for-tag input "HealthCheckPort" :flattened? nil :xmlAttribute? nil), "HealthCheckProtocol" (portkey.aws/search-for-tag input "HealthCheckProtocol" :flattened? nil :xmlAttribute? nil), "HealthCheckEnabled" (portkey.aws/search-for-tag input "HealthCheckEnabled" :flattened? nil :xmlAttribute? nil), "Matcher" (portkey.aws/search-for-tag input "Matcher" :flattened? nil :xmlAttribute? nil), "HealthCheckPath" (portkey.aws/search-for-tag input "HealthCheckPath" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar880947 "HealthyThresholdCount") (clojure.core/assoc :healthy-threshold-count (deser-health-check-threshold-count (clojure.core/get-in letvar880947 ["HealthyThresholdCount" :content]))) (letvar880947 "LoadBalancerArns") (clojure.core/assoc :load-balancer-arns (deser-load-balancer-arns (clojure.core/get-in letvar880947 ["LoadBalancerArns" :content]))) (letvar880947 "HealthCheckTimeoutSeconds") (clojure.core/assoc :health-check-timeout-seconds (deser-health-check-timeout-seconds (clojure.core/get-in letvar880947 ["HealthCheckTimeoutSeconds" :content]))) (letvar880947 "TargetType") (clojure.core/assoc :target-type (deser-target-type-enum (clojure.core/get-in letvar880947 ["TargetType" :content]))) (letvar880947 "UnhealthyThresholdCount") (clojure.core/assoc :unhealthy-threshold-count (deser-health-check-threshold-count (clojure.core/get-in letvar880947 ["UnhealthyThresholdCount" :content]))) (letvar880947 "TargetGroupArn") (clojure.core/assoc :target-group-arn (deser-target-group-arn (clojure.core/get-in letvar880947 ["TargetGroupArn" :content]))) (letvar880947 "TargetGroupName") (clojure.core/assoc :target-group-name (deser-target-group-name (clojure.core/get-in letvar880947 ["TargetGroupName" :content]))) (letvar880947 "Protocol") (clojure.core/assoc :protocol (deser-protocol-enum (clojure.core/get-in letvar880947 ["Protocol" :content]))) (letvar880947 "Port") (clojure.core/assoc :port (deser-port (clojure.core/get-in letvar880947 ["Port" :content]))) (letvar880947 "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (clojure.core/get-in letvar880947 ["VpcId" :content]))) (letvar880947 "HealthCheckIntervalSeconds") (clojure.core/assoc :health-check-interval-seconds (deser-health-check-interval-seconds (clojure.core/get-in letvar880947 ["HealthCheckIntervalSeconds" :content]))) (letvar880947 "HealthCheckPort") (clojure.core/assoc :health-check-port (deser-health-check-port (clojure.core/get-in letvar880947 ["HealthCheckPort" :content]))) (letvar880947 "HealthCheckProtocol") (clojure.core/assoc :health-check-protocol (deser-protocol-enum (clojure.core/get-in letvar880947 ["HealthCheckProtocol" :content]))) (letvar880947 "HealthCheckEnabled") (clojure.core/assoc :health-check-enabled (deser-health-check-enabled (clojure.core/get-in letvar880947 ["HealthCheckEnabled" :content]))) (letvar880947 "Matcher") (clojure.core/assoc :matcher (deser-matcher (clojure.core/get-in letvar880947 ["Matcher" :content]))) (letvar880947 "HealthCheckPath") (clojure.core/assoc :health-check-path (deser-path (clojure.core/get-in letvar880947 ["HealthCheckPath" :content]))))))

(clojure.core/defn- deser-matcher [input] (clojure.core/let [letvar881055 {"HttpCode" (portkey.aws/search-for-tag input "HttpCode" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:http-code (deser-http-code (clojure.core/get-in letvar881055 ["HttpCode" :content]))})))

(clojure.core/defn- deser-availability-zones [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-availability-zone coll))) input))

(clojure.core/defn- deser-target-group-attributes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-group-attribute coll))) input))

(clojure.core/defn- deser-redirect-action-port [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-authenticate-oidc-action-client-secret [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-action [input] (clojure.core/let [letvar881207 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "TargetGroupArn" (portkey.aws/search-for-tag input "TargetGroupArn" :flattened? nil :xmlAttribute? nil), "AuthenticateOidcConfig" (portkey.aws/search-for-tag input "AuthenticateOidcConfig" :flattened? nil :xmlAttribute? nil), "AuthenticateCognitoConfig" (portkey.aws/search-for-tag input "AuthenticateCognitoConfig" :flattened? nil :xmlAttribute? nil), "Order" (portkey.aws/search-for-tag input "Order" :flattened? nil :xmlAttribute? nil), "RedirectConfig" (portkey.aws/search-for-tag input "RedirectConfig" :flattened? nil :xmlAttribute? nil), "FixedResponseConfig" (portkey.aws/search-for-tag input "FixedResponseConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-action-type-enum (clojure.core/get-in letvar881207 ["Type" :content]))} (letvar881207 "TargetGroupArn") (clojure.core/assoc :target-group-arn (deser-target-group-arn (clojure.core/get-in letvar881207 ["TargetGroupArn" :content]))) (letvar881207 "AuthenticateOidcConfig") (clojure.core/assoc :authenticate-oidc-config (deser-authenticate-oidc-action-config (clojure.core/get-in letvar881207 ["AuthenticateOidcConfig" :content]))) (letvar881207 "AuthenticateCognitoConfig") (clojure.core/assoc :authenticate-cognito-config (deser-authenticate-cognito-action-config (clojure.core/get-in letvar881207 ["AuthenticateCognitoConfig" :content]))) (letvar881207 "Order") (clojure.core/assoc :order (deser-action-order (clojure.core/get-in letvar881207 ["Order" :content]))) (letvar881207 "RedirectConfig") (clojure.core/assoc :redirect-config (deser-redirect-action-config (clojure.core/get-in letvar881207 ["RedirectConfig" :content]))) (letvar881207 "FixedResponseConfig") (clojure.core/assoc :fixed-response-config (deser-fixed-response-action-config (clojure.core/get-in letvar881207 ["FixedResponseConfig" :content]))))))

(clojure.core/defn- deser-authenticate-cognito-action-conditional-behavior-enum [input] (clojure.core/get {"deny" :deny, "allow" :allow, "authenticate" :authenticate} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-certificate [input] (clojure.core/let [letvar881320 {"CertificateArn" (portkey.aws/search-for-tag input "CertificateArn" :flattened? nil :xmlAttribute? nil), "IsDefault" (portkey.aws/search-for-tag input "IsDefault" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar881320 "CertificateArn") (clojure.core/assoc :certificate-arn (deser-certificate-arn (clojure.core/get-in letvar881320 ["CertificateArn" :content]))) (letvar881320 "IsDefault") (clojure.core/assoc :is-default (deser-default (clojure.core/get-in letvar881320 ["IsDefault" :content]))))))

(clojure.core/defn- deser-load-balancer-address [input] (clojure.core/let [letvar881428 {"IpAddress" (portkey.aws/search-for-tag input "IpAddress" :flattened? nil :xmlAttribute? nil), "AllocationId" (portkey.aws/search-for-tag input "AllocationId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar881428 "IpAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar881428 ["IpAddress" :content]))) (letvar881428 "AllocationId") (clojure.core/assoc :allocation-id (deser-allocation-id (clojure.core/get-in letvar881428 ["AllocationId" :content]))))))

(clojure.core/defn- deser-state-reason [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-attribute [input] (clojure.core/let [letvar881541 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar881541 "Key") (clojure.core/assoc :key (deser-load-balancer-attribute-key (clojure.core/get-in letvar881541 ["Key" :content]))) (letvar881541 "Value") (clojure.core/assoc :value (deser-load-balancer-attribute-value (clojure.core/get-in letvar881541 ["Value" :content]))))))

(clojure.core/defn- deser-target-health-description [input] (clojure.core/let [letvar881649 {"Target" (portkey.aws/search-for-tag input "Target" :flattened? nil :xmlAttribute? nil), "HealthCheckPort" (portkey.aws/search-for-tag input "HealthCheckPort" :flattened? nil :xmlAttribute? nil), "TargetHealth" (portkey.aws/search-for-tag input "TargetHealth" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar881649 "Target") (clojure.core/assoc :target (deser-target-description (clojure.core/get-in letvar881649 ["Target" :content]))) (letvar881649 "HealthCheckPort") (clojure.core/assoc :health-check-port (deser-health-check-port (clojure.core/get-in letvar881649 ["HealthCheckPort" :content]))) (letvar881649 "TargetHealth") (clojure.core/assoc :target-health (deser-target-health (clojure.core/get-in letvar881649 ["TargetHealth" :content]))))))

(clojure.core/defn- deser-string-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-zone-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-too-many-rules-exception ([input] (response-too-many-rules-exception nil input)) ([resultWrapper881661 input] (clojure.core/let [rawinput881660 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881662 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-not-permitted-exception ([input] (response-operation-not-permitted-exception nil input)) ([resultWrapper881664 input] (clojure.core/let [rawinput881663 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881665 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-account-limits-output ([input] (response-describe-account-limits-output nil input)) ([resultWrapper881667 input] (clojure.core/let [rawinput881666 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881668 {"Limits" (portkey.aws/search-for-tag rawinput881666 "Limits" :flattened? nil :result-wrapper resultWrapper881667), "NextMarker" (portkey.aws/search-for-tag rawinput881666 "NextMarker" :flattened? nil :result-wrapper resultWrapper881667)}] (clojure.core/cond-> {} (letvar881668 "Limits") (clojure.core/assoc :limits (deser-limits (clojure.core/get-in letvar881668 ["Limits" :content]))) (letvar881668 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar881668 ["NextMarker" :content])))))))

(clojure.core/defn- response-target-group-association-limit-exception ([input] (response-target-group-association-limit-exception nil input)) ([resultWrapper881670 input] (clojure.core/let [rawinput881669 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881671 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unsupported-protocol-exception ([input] (response-unsupported-protocol-exception nil input)) ([resultWrapper881673 input] (clojure.core/let [rawinput881672 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881674 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-register-targets-output ([input] (response-register-targets-output nil input)) ([resultWrapper881676 input] (clojure.core/let [rawinput881675 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881677 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-duplicate-load-balancer-name-exception ([input] (response-duplicate-load-balancer-name-exception nil input)) ([resultWrapper881679 input] (clojure.core/let [rawinput881678 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881680 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-actions-exception ([input] (response-too-many-actions-exception nil input)) ([resultWrapper881682 input] (clojure.core/let [rawinput881681 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881683 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-subnet-exception ([input] (response-invalid-subnet-exception nil input)) ([resultWrapper881685 input] (clojure.core/let [rawinput881684 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881686 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-listener-certificates-output ([input] (response-describe-listener-certificates-output nil input)) ([resultWrapper881688 input] (clojure.core/let [rawinput881687 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881689 {"Certificates" (portkey.aws/search-for-tag rawinput881687 "Certificates" :flattened? nil :result-wrapper resultWrapper881688), "NextMarker" (portkey.aws/search-for-tag rawinput881687 "NextMarker" :flattened? nil :result-wrapper resultWrapper881688)}] (clojure.core/cond-> {} (letvar881689 "Certificates") (clojure.core/assoc :certificates (deser-certificate-list (clojure.core/get-in letvar881689 ["Certificates" :content]))) (letvar881689 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar881689 ["NextMarker" :content])))))))

(clojure.core/defn- response-describe-target-group-attributes-output ([input] (response-describe-target-group-attributes-output nil input)) ([resultWrapper881691 input] (clojure.core/let [rawinput881690 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881692 {"Attributes" (portkey.aws/search-for-tag rawinput881690 "Attributes" :flattened? nil :result-wrapper resultWrapper881691)}] (clojure.core/cond-> {} (letvar881692 "Attributes") (clojure.core/assoc :attributes (deser-target-group-attributes (clojure.core/get-in letvar881692 ["Attributes" :content])))))))

(clojure.core/defn- response-availability-zone-not-supported-exception ([input] (response-availability-zone-not-supported-exception nil input)) ([resultWrapper881694 input] (clojure.core/let [rawinput881693 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881695 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-security-groups-output ([input] (response-set-security-groups-output nil input)) ([resultWrapper881697 input] (clojure.core/let [rawinput881696 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881698 {"SecurityGroupIds" (portkey.aws/search-for-tag rawinput881696 "SecurityGroupIds" :flattened? nil :result-wrapper resultWrapper881697)}] (clojure.core/cond-> {} (letvar881698 "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-security-groups (clojure.core/get-in letvar881698 ["SecurityGroupIds" :content])))))))

(clojure.core/defn- response-delete-rule-output ([input] (response-delete-rule-output nil input)) ([resultWrapper881700 input] (clojure.core/let [rawinput881699 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881701 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-target-exception ([input] (response-invalid-target-exception nil input)) ([resultWrapper881703 input] (clojure.core/let [rawinput881702 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881704 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-add-tags-output ([input] (response-add-tags-output nil input)) ([resultWrapper881706 input] (clojure.core/let [rawinput881705 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881707 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper881709 input] (clojure.core/let [rawinput881708 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881710 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-allocation-id-not-found-exception ([input] (response-allocation-id-not-found-exception nil input)) ([resultWrapper881712 input] (clojure.core/let [rawinput881711 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881713 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-rule-priorities-output ([input] (response-set-rule-priorities-output nil input)) ([resultWrapper881715 input] (clojure.core/let [rawinput881714 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881716 {"Rules" (portkey.aws/search-for-tag rawinput881714 "Rules" :flattened? nil :result-wrapper resultWrapper881715)}] (clojure.core/cond-> {} (letvar881716 "Rules") (clojure.core/assoc :rules (deser-rules (clojure.core/get-in letvar881716 ["Rules" :content])))))))

(clojure.core/defn- response-health-unavailable-exception ([input] (response-health-unavailable-exception nil input)) ([resultWrapper881718 input] (clojure.core/let [rawinput881717 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881719 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-rule-not-found-exception ([input] (response-rule-not-found-exception nil input)) ([resultWrapper881721 input] (clojure.core/let [rawinput881720 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881722 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-ssl-policies-output ([input] (response-describe-ssl-policies-output nil input)) ([resultWrapper881724 input] (clojure.core/let [rawinput881723 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881725 {"SslPolicies" (portkey.aws/search-for-tag rawinput881723 "SslPolicies" :flattened? nil :result-wrapper resultWrapper881724), "NextMarker" (portkey.aws/search-for-tag rawinput881723 "NextMarker" :flattened? nil :result-wrapper resultWrapper881724)}] (clojure.core/cond-> {} (letvar881725 "SslPolicies") (clojure.core/assoc :ssl-policies (deser-ssl-policies (clojure.core/get-in letvar881725 ["SslPolicies" :content]))) (letvar881725 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar881725 ["NextMarker" :content])))))))

(clojure.core/defn- response-duplicate-listener-exception ([input] (response-duplicate-listener-exception nil input)) ([resultWrapper881727 input] (clojure.core/let [rawinput881726 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881728 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-ip-address-type-output ([input] (response-set-ip-address-type-output nil input)) ([resultWrapper881730 input] (clojure.core/let [rawinput881729 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881731 {"IpAddressType" (portkey.aws/search-for-tag rawinput881729 "IpAddressType" :flattened? nil :result-wrapper resultWrapper881730)}] (clojure.core/cond-> {} (letvar881731 "IpAddressType") (clojure.core/assoc :ip-address-type (deser-ip-address-type (clojure.core/get-in letvar881731 ["IpAddressType" :content])))))))

(clojure.core/defn- response-too-many-target-groups-exception ([input] (response-too-many-target-groups-exception nil input)) ([resultWrapper881733 input] (clojure.core/let [rawinput881732 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881734 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-remove-tags-output ([input] (response-remove-tags-output nil input)) ([resultWrapper881736 input] (clojure.core/let [rawinput881735 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881737 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-ssl-policy-not-found-exception ([input] (response-ssl-policy-not-found-exception nil input)) ([resultWrapper881739 input] (clojure.core/let [rawinput881738 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881740 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-target-health-output ([input] (response-describe-target-health-output nil input)) ([resultWrapper881742 input] (clojure.core/let [rawinput881741 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881743 {"TargetHealthDescriptions" (portkey.aws/search-for-tag rawinput881741 "TargetHealthDescriptions" :flattened? nil :result-wrapper resultWrapper881742)}] (clojure.core/cond-> {} (letvar881743 "TargetHealthDescriptions") (clojure.core/assoc :target-health-descriptions (deser-target-health-descriptions (clojure.core/get-in letvar881743 ["TargetHealthDescriptions" :content])))))))

(clojure.core/defn- response-create-load-balancer-output ([input] (response-create-load-balancer-output nil input)) ([resultWrapper881745 input] (clojure.core/let [rawinput881744 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881746 {"LoadBalancers" (portkey.aws/search-for-tag rawinput881744 "LoadBalancers" :flattened? nil :result-wrapper resultWrapper881745)}] (clojure.core/cond-> {} (letvar881746 "LoadBalancers") (clojure.core/assoc :load-balancers (deser-load-balancers (clojure.core/get-in letvar881746 ["LoadBalancers" :content])))))))

(clojure.core/defn- response-too-many-load-balancers-exception ([input] (response-too-many-load-balancers-exception nil input)) ([resultWrapper881748 input] (clojure.core/let [rawinput881747 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881749 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-listener-output ([input] (response-create-listener-output nil input)) ([resultWrapper881751 input] (clojure.core/let [rawinput881750 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881752 {"Listeners" (portkey.aws/search-for-tag rawinput881750 "Listeners" :flattened? nil :result-wrapper resultWrapper881751)}] (clojure.core/cond-> {} (letvar881752 "Listeners") (clojure.core/assoc :listeners (deser-listeners (clojure.core/get-in letvar881752 ["Listeners" :content])))))))

(clojure.core/defn- response-add-listener-certificates-output ([input] (response-add-listener-certificates-output nil input)) ([resultWrapper881754 input] (clojure.core/let [rawinput881753 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881755 {"Certificates" (portkey.aws/search-for-tag rawinput881753 "Certificates" :flattened? nil :result-wrapper resultWrapper881754)}] (clojure.core/cond-> {} (letvar881755 "Certificates") (clojure.core/assoc :certificates (deser-certificate-list (clojure.core/get-in letvar881755 ["Certificates" :content])))))))

(clojure.core/defn- response-duplicate-target-group-name-exception ([input] (response-duplicate-target-group-name-exception nil input)) ([resultWrapper881757 input] (clojure.core/let [rawinput881756 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881758 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deregister-targets-output ([input] (response-deregister-targets-output nil input)) ([resultWrapper881760 input] (clojure.core/let [rawinput881759 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881761 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-remove-listener-certificates-output ([input] (response-remove-listener-certificates-output nil input)) ([resultWrapper881763 input] (clojure.core/let [rawinput881762 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881764 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-duplicate-tag-keys-exception ([input] (response-duplicate-tag-keys-exception nil input)) ([resultWrapper881766 input] (clojure.core/let [rawinput881765 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881767 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-scheme-exception ([input] (response-invalid-scheme-exception nil input)) ([resultWrapper881769 input] (clojure.core/let [rawinput881768 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881770 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-listeners-exception ([input] (response-too-many-listeners-exception nil input)) ([resultWrapper881772 input] (clojure.core/let [rawinput881771 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881773 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-modify-target-group-attributes-output ([input] (response-modify-target-group-attributes-output nil input)) ([resultWrapper881775 input] (clojure.core/let [rawinput881774 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881776 {"Attributes" (portkey.aws/search-for-tag rawinput881774 "Attributes" :flattened? nil :result-wrapper resultWrapper881775)}] (clojure.core/cond-> {} (letvar881776 "Attributes") (clojure.core/assoc :attributes (deser-target-group-attributes (clojure.core/get-in letvar881776 ["Attributes" :content])))))))

(clojure.core/defn- response-too-many-certificates-exception ([input] (response-too-many-certificates-exception nil input)) ([resultWrapper881778 input] (clojure.core/let [rawinput881777 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881779 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-load-balancer-action-exception ([input] (response-invalid-load-balancer-action-exception nil input)) ([resultWrapper881781 input] (clojure.core/let [rawinput881780 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881782 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-load-balancer-output ([input] (response-delete-load-balancer-output nil input)) ([resultWrapper881784 input] (clojure.core/let [rawinput881783 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881785 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-configuration-request-exception ([input] (response-invalid-configuration-request-exception nil input)) ([resultWrapper881787 input] (clojure.core/let [rawinput881786 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881788 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-targets-exception ([input] (response-too-many-targets-exception nil input)) ([resultWrapper881790 input] (clojure.core/let [rawinput881789 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881791 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-tags-exception ([input] (response-too-many-tags-exception nil input)) ([resultWrapper881793 input] (clojure.core/let [rawinput881792 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881794 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-load-balancers-output ([input] (response-describe-load-balancers-output nil input)) ([resultWrapper881796 input] (clojure.core/let [rawinput881795 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881797 {"LoadBalancers" (portkey.aws/search-for-tag rawinput881795 "LoadBalancers" :flattened? nil :result-wrapper resultWrapper881796), "NextMarker" (portkey.aws/search-for-tag rawinput881795 "NextMarker" :flattened? nil :result-wrapper resultWrapper881796)}] (clojure.core/cond-> {} (letvar881797 "LoadBalancers") (clojure.core/assoc :load-balancers (deser-load-balancers (clojure.core/get-in letvar881797 ["LoadBalancers" :content]))) (letvar881797 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar881797 ["NextMarker" :content])))))))

(clojure.core/defn- response-set-subnets-output ([input] (response-set-subnets-output nil input)) ([resultWrapper881799 input] (clojure.core/let [rawinput881798 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881800 {"AvailabilityZones" (portkey.aws/search-for-tag rawinput881798 "AvailabilityZones" :flattened? nil :result-wrapper resultWrapper881799)}] (clojure.core/cond-> {} (letvar881800 "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-availability-zones (clojure.core/get-in letvar881800 ["AvailabilityZones" :content])))))))

(clojure.core/defn- response-load-balancer-not-found-exception ([input] (response-load-balancer-not-found-exception nil input)) ([resultWrapper881802 input] (clojure.core/let [rawinput881801 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881803 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-certificate-not-found-exception ([input] (response-certificate-not-found-exception nil input)) ([resultWrapper881805 input] (clojure.core/let [rawinput881804 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881806 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-incompatible-protocols-exception ([input] (response-incompatible-protocols-exception nil input)) ([resultWrapper881808 input] (clojure.core/let [rawinput881807 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881809 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-tags-output ([input] (response-describe-tags-output nil input)) ([resultWrapper881811 input] (clojure.core/let [rawinput881810 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881812 {"TagDescriptions" (portkey.aws/search-for-tag rawinput881810 "TagDescriptions" :flattened? nil :result-wrapper resultWrapper881811)}] (clojure.core/cond-> {} (letvar881812 "TagDescriptions") (clojure.core/assoc :tag-descriptions (deser-tag-descriptions (clojure.core/get-in letvar881812 ["TagDescriptions" :content])))))))

(clojure.core/defn- response-modify-target-group-output ([input] (response-modify-target-group-output nil input)) ([resultWrapper881814 input] (clojure.core/let [rawinput881813 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881815 {"TargetGroups" (portkey.aws/search-for-tag rawinput881813 "TargetGroups" :flattened? nil :result-wrapper resultWrapper881814)}] (clojure.core/cond-> {} (letvar881815 "TargetGroups") (clojure.core/assoc :target-groups (deser-target-groups (clojure.core/get-in letvar881815 ["TargetGroups" :content])))))))

(clojure.core/defn- response-describe-listeners-output ([input] (response-describe-listeners-output nil input)) ([resultWrapper881817 input] (clojure.core/let [rawinput881816 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881818 {"Listeners" (portkey.aws/search-for-tag rawinput881816 "Listeners" :flattened? nil :result-wrapper resultWrapper881817), "NextMarker" (portkey.aws/search-for-tag rawinput881816 "NextMarker" :flattened? nil :result-wrapper resultWrapper881817)}] (clojure.core/cond-> {} (letvar881818 "Listeners") (clojure.core/assoc :listeners (deser-listeners (clojure.core/get-in letvar881818 ["Listeners" :content]))) (letvar881818 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar881818 ["NextMarker" :content])))))))

(clojure.core/defn- response-modify-rule-output ([input] (response-modify-rule-output nil input)) ([resultWrapper881820 input] (clojure.core/let [rawinput881819 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881821 {"Rules" (portkey.aws/search-for-tag rawinput881819 "Rules" :flattened? nil :result-wrapper resultWrapper881820)}] (clojure.core/cond-> {} (letvar881821 "Rules") (clojure.core/assoc :rules (deser-rules (clojure.core/get-in letvar881821 ["Rules" :content])))))))

(clojure.core/defn- response-subnet-not-found-exception ([input] (response-subnet-not-found-exception nil input)) ([resultWrapper881823 input] (clojure.core/let [rawinput881822 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881824 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-target-group-output ([input] (response-create-target-group-output nil input)) ([resultWrapper881826 input] (clojure.core/let [rawinput881825 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881827 {"TargetGroups" (portkey.aws/search-for-tag rawinput881825 "TargetGroups" :flattened? nil :result-wrapper resultWrapper881826)}] (clojure.core/cond-> {} (letvar881827 "TargetGroups") (clojure.core/assoc :target-groups (deser-target-groups (clojure.core/get-in letvar881827 ["TargetGroups" :content])))))))

(clojure.core/defn- response-create-rule-output ([input] (response-create-rule-output nil input)) ([resultWrapper881829 input] (clojure.core/let [rawinput881828 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881830 {"Rules" (portkey.aws/search-for-tag rawinput881828 "Rules" :flattened? nil :result-wrapper resultWrapper881829)}] (clojure.core/cond-> {} (letvar881830 "Rules") (clojure.core/assoc :rules (deser-rules (clojure.core/get-in letvar881830 ["Rules" :content])))))))

(clojure.core/defn- response-describe-target-groups-output ([input] (response-describe-target-groups-output nil input)) ([resultWrapper881832 input] (clojure.core/let [rawinput881831 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881833 {"TargetGroups" (portkey.aws/search-for-tag rawinput881831 "TargetGroups" :flattened? nil :result-wrapper resultWrapper881832), "NextMarker" (portkey.aws/search-for-tag rawinput881831 "NextMarker" :flattened? nil :result-wrapper resultWrapper881832)}] (clojure.core/cond-> {} (letvar881833 "TargetGroups") (clojure.core/assoc :target-groups (deser-target-groups (clojure.core/get-in letvar881833 ["TargetGroups" :content]))) (letvar881833 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar881833 ["NextMarker" :content])))))))

(clojure.core/defn- response-delete-target-group-output ([input] (response-delete-target-group-output nil input)) ([resultWrapper881835 input] (clojure.core/let [rawinput881834 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881836 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-listener-not-found-exception ([input] (response-listener-not-found-exception nil input)) ([resultWrapper881838 input] (clojure.core/let [rawinput881837 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881839 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-target-group-not-found-exception ([input] (response-target-group-not-found-exception nil input)) ([resultWrapper881841 input] (clojure.core/let [rawinput881840 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881842 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-priority-in-use-exception ([input] (response-priority-in-use-exception nil input)) ([resultWrapper881844 input] (clojure.core/let [rawinput881843 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881845 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-rules-output ([input] (response-describe-rules-output nil input)) ([resultWrapper881847 input] (clojure.core/let [rawinput881846 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881848 {"Rules" (portkey.aws/search-for-tag rawinput881846 "Rules" :flattened? nil :result-wrapper resultWrapper881847), "NextMarker" (portkey.aws/search-for-tag rawinput881846 "NextMarker" :flattened? nil :result-wrapper resultWrapper881847)}] (clojure.core/cond-> {} (letvar881848 "Rules") (clojure.core/assoc :rules (deser-rules (clojure.core/get-in letvar881848 ["Rules" :content]))) (letvar881848 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar881848 ["NextMarker" :content])))))))

(clojure.core/defn- response-modify-load-balancer-attributes-output ([input] (response-modify-load-balancer-attributes-output nil input)) ([resultWrapper881850 input] (clojure.core/let [rawinput881849 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881851 {"Attributes" (portkey.aws/search-for-tag rawinput881849 "Attributes" :flattened? nil :result-wrapper resultWrapper881850)}] (clojure.core/cond-> {} (letvar881851 "Attributes") (clojure.core/assoc :attributes (deser-load-balancer-attributes (clojure.core/get-in letvar881851 ["Attributes" :content])))))))

(clojure.core/defn- response-delete-listener-output ([input] (response-delete-listener-output nil input)) ([resultWrapper881853 input] (clojure.core/let [rawinput881852 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881854 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-load-balancer-attributes-output ([input] (response-describe-load-balancer-attributes-output nil input)) ([resultWrapper881856 input] (clojure.core/let [rawinput881855 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881857 {"Attributes" (portkey.aws/search-for-tag rawinput881855 "Attributes" :flattened? nil :result-wrapper resultWrapper881856)}] (clojure.core/cond-> {} (letvar881857 "Attributes") (clojure.core/assoc :attributes (deser-load-balancer-attributes (clojure.core/get-in letvar881857 ["Attributes" :content])))))))

(clojure.core/defn- response-invalid-security-group-exception ([input] (response-invalid-security-group-exception nil input)) ([resultWrapper881859 input] (clojure.core/let [rawinput881858 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881860 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-modify-listener-output ([input] (response-modify-listener-output nil input)) ([resultWrapper881862 input] (clojure.core/let [rawinput881861 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881863 {"Listeners" (portkey.aws/search-for-tag rawinput881861 "Listeners" :flattened? nil :result-wrapper resultWrapper881862)}] (clojure.core/cond-> {} (letvar881863 "Listeners") (clojure.core/assoc :listeners (deser-listeners (clojure.core/get-in letvar881863 ["Listeners" :content])))))))

(clojure.core/defn- response-too-many-registrations-for-target-id-exception ([input] (response-too-many-registrations-for-target-id-exception nil input)) ([resultWrapper881865 input] (clojure.core/let [rawinput881864 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar881866 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/tag-key))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-state-enum #{"healthy" :draining :unhealthy :unavailable :unused "initial" :healthy "unhealthy" "unused" :initial "draining" "unavailable"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/certificate))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.add-listener-certificates-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-listener-certificates-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn :portkey.aws.elasticloadbalancingv2.add-listener-certificates-input/certificates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-extra-params (clojure.spec.alpha/map-of :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-param-name :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-param-value))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-rules-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/resource-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/cipher-priority clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-attribute :max-count 20))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-scheme-enum #{"internal" "internet-facing" :internal :internetfacing})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-addresses (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-address))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/ssl-policy (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/default-actions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/actions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-listener-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2.create-listener-input/protocol :portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2.create-listener-input/default-actions] :opt-un [:portkey.aws.elasticloadbalancingv2.create-listener-input/ssl-policy :portkey.aws.elasticloadbalancingv2.create-listener-input/certificates]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-priority (clojure.spec.alpha/int-in 1 50000))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/max (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-conditional-behavior-enum #{"authenticate" "allow" :allow "deny" :deny :authenticate})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-param-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-account-limits-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-account-limits-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/limits :portkey.aws.elasticloadbalancingv2.describe-account-limits-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/page-size (clojure.spec.alpha/int-in 1 400))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-arn (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-arn))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-client-id (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-client-id))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-domain (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-domain))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/session-cookie-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-session-cookie-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/scope (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-scope))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/session-timeout (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-session-timeout))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/authentication-request-extra-params (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-extra-params))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/on-unauthenticated-request (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-conditional-behavior-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-arn :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-client-id :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-domain] :opt-un [:portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/session-cookie-name :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/scope :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/session-timeout :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/authentication-request-extra-params :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/on-unauthenticated-request]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.cipher/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/cipher-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.cipher/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/cipher-priority))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/cipher (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.cipher/name :portkey.aws.elasticloadbalancingv2.cipher/priority]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-protocol (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(HTTPS?|#\{protocol\})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/ssl-policy-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-param-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn :portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnets (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/subnet-id))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/register-targets-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authorization-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-load-balancer-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-param-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-actions-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-security-groups-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/security-groups] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/security-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/security-group-id))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-mappings (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/subnet-mapping))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/certificates :portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-ip-address-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/ip-address-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-group-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-target-group-attributes-output/attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/cipher-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/availability-zone-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.set-security-groups-output/security-group-ids (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/security-groups))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-security-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.set-security-groups-output/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-rule-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-timeout-seconds (clojure.spec.alpha/int-in 2 120))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-client-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-target-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-condition-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule-condition))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-user-info-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/actions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/action))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/string-value))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/allocation-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.remove-listener-certificates-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn :portkey.aws.elasticloadbalancingv2.remove-listener-certificates-input/certificates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-session-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/resource-arns :portkey.aws.elasticloadbalancingv2/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.register-targets-input/targets (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/register-targets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn :portkey.aws.elasticloadbalancingv2.register-targets-input/targets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/allocation-id-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-rule-priorities-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rules]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-ssl-policies-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ssl-policies :portkey.aws.elasticloadbalancingv2.describe-ssl-policies-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/protocol-enum #{:tcp "TCP" :tls "TLS" "HTTPS" :http "HTTP" :https})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-client-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/resource-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/resource-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-state-enum #{"active_impaired" :active-impaired "failed" "provisioning" :active :provisioning "active" :failed})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listeners-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/listener-arns :portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-account-limits-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-listener-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-groups-input/names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-groups-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/target-group-arns :portkey.aws.elasticloadbalancingv2.describe-target-groups-input/names :portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policies (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/ssl-policy))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/name :portkey.aws.elasticloadbalancingv2/max]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-status-code-enum #{"HTTP_302" :http-302 "HTTP_301" :http-301})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/listener-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/subnet-id :portkey.aws.elasticloadbalancingv2/allocation-id]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.fixed-response-action-config/message-body (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/fixed-response-action-message))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.fixed-response-action-config/status-code (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/fixed-response-action-status-code))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.fixed-response-action-config/content-type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/fixed-response-action-content-type))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/fixed-response-action-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.fixed-response-action-config/status-code] :opt-un [:portkey.aws.elasticloadbalancingv2.fixed-response-action-config/message-body :portkey.aws.elasticloadbalancingv2.fixed-response-action-config/content-type]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-ip-address-type-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ip-address-type]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-target-groups-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/availability-zone (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/zone-name :portkey.aws.elasticloadbalancingv2/subnet-id :portkey.aws.elasticloadbalancingv2/load-balancer-addresses]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-type-enum #{:ip :instance :lambda "ip" "instance" "lambda"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ciphers (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/cipher))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ip-address-type #{:dualstack "ipv4" "dualstack" :ipv-4})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/action-type-enum #{"authenticate-oidc" "redirect" :forward :authenticateoidc "fixed-response" :fixedresponse :authenticatecognito "forward" "authenticate-cognito" :redirect})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/canonical-hosted-zone-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/fixed-response-action-content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/user-info-endpoint (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-user-info-endpoint))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/use-existing-client-secret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-use-existing-client-secret))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/on-unauthenticated-request (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-conditional-behavior-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/session-timeout (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-session-timeout))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/token-endpoint (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-token-endpoint))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/issuer (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-issuer))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/client-id (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-client-id))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/authentication-request-extra-params (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-extra-params))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/client-secret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-client-secret))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/session-cookie-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-session-cookie-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/authorization-endpoint (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authorization-endpoint))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/scope (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-scope))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/issuer :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/authorization-endpoint :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/token-endpoint :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/user-info-endpoint :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/client-id] :opt-un [:portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/use-existing-client-secret :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/on-unauthenticated-request :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/session-timeout :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/authentication-request-extra-params :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/client-secret :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/session-cookie-name :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/scope]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-health-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/target-health-descriptions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-threshold-count (clojure.spec.alpha/int-in 2 10))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-scope (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/healthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/unhealthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/health-check-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/health-check-path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-target-group-input/healthy-threshold-count :portkey.aws.elasticloadbalancingv2/health-check-timeout-seconds :portkey.aws.elasticloadbalancingv2.modify-target-group-input/unhealthy-threshold-count :portkey.aws.elasticloadbalancingv2/health-check-interval-seconds :portkey.aws.elasticloadbalancingv2/health-check-port :portkey.aws.elasticloadbalancingv2.modify-target-group-input/health-check-protocol :portkey.aws.elasticloadbalancingv2/health-check-enabled :portkey.aws.elasticloadbalancingv2/matcher :portkey.aws.elasticloadbalancingv2.modify-target-group-input/health-check-path]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-rule-input/conditions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-condition-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-rule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/rule-arn] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-rule-input/conditions :portkey.aws.elasticloadbalancingv2/actions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-load-balancer-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/load-balancers]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-load-balancers-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-listener-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/listeners]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.tag-description/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/resource-arn :portkey.aws.elasticloadbalancingv2.tag-description/tags]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.ssl-policy/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ssl-protocols :portkey.aws.elasticloadbalancingv2/ciphers :portkey.aws.elasticloadbalancingv2.ssl-policy/name]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-rule-input/conditions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-condition-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-rule-input/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-priority))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-rule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn :portkey.aws.elasticloadbalancingv2.create-rule-input/conditions :portkey.aws.elasticloadbalancingv2.create-rule-input/priority :portkey.aws.elasticloadbalancingv2/actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-description/id (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-id))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-description/availability-zone (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/zone-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-description (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.target-description/id] :opt-un [:portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2.target-description/availability-zone]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/limits (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/limit))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.add-listener-certificates-output/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-listener-certificates-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.add-listener-certificates-output/certificates]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-type-enum #{:application "network" "application" :network})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/tag :min-count 1))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-target-group-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/deregister-targets-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancers (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule-priority-pair/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-priority))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-priority-pair (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rule-arn :portkey.aws.elasticloadbalancingv2.rule-priority-pair/priority]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/http-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-tag-keys-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-load-balancers-input/names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancers-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arns :portkey.aws.elasticloadbalancingv2.describe-load-balancers-input/names :portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-state/code (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-state-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-state/reason (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/state-reason))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.load-balancer-state/code :portkey.aws.elasticloadbalancingv2.load-balancer-state/reason]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-token-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-protocol))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/port (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-port))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/host (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-host))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/query (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-query))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/status-code (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-status-code-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.redirect-action-config/status-code] :opt-un [:portkey.aws.elasticloadbalancingv2.redirect-action-config/protocol :portkey.aws.elasticloadbalancingv2.redirect-action-config/port :portkey.aws.elasticloadbalancingv2.redirect-action-config/host :portkey.aws.elasticloadbalancingv2.redirect-action-config/path :portkey.aws.elasticloadbalancingv2.redirect-action-config/query]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-health/state (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-health-state-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-health/reason (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-health-reason-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-health/state :portkey.aws.elasticloadbalancingv2.target-health/reason :portkey.aws.elasticloadbalancingv2/description]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/dns-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-scheme-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-listeners-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-output/attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-health-input/targets (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-health-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-target-health-input/targets]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group-attribute/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attribute-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group-attribute/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attribute-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-group-attribute/key :portkey.aws.elasticloadbalancingv2.target-group-attribute/value]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.deregister-targets-input/targets (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/deregister-targets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn :portkey.aws.elasticloadbalancingv2.deregister-targets-input/targets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/tag-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/port (clojure.spec.alpha/int-in 1 65535))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-load-balancer-action-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-issuer (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-scope (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/vpc-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-load-balancer-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/resource-arns :portkey.aws.elasticloadbalancingv2.add-tags-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-rules-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/listener-arn :portkey.aws.elasticloadbalancingv2/rule-arns :portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-targets-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-interval-seconds (clojure.spec.alpha/int-in 5 300))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-tags-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-use-existing-client-secret clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-load-balancers-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/load-balancers :portkey.aws.elasticloadbalancingv2.describe-load-balancers-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-port (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-subnets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/tag-descriptions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/string))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule/conditions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-condition-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rule-arn :portkey.aws.elasticloadbalancingv2.rule/priority :portkey.aws.elasticloadbalancingv2.rule/conditions :portkey.aws.elasticloadbalancingv2/actions :portkey.aws.elasticloadbalancingv2/is-default]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/ssl-policy (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/default-actions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/actions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/listener-arn :portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2.listener/protocol :portkey.aws.elasticloadbalancingv2.listener/certificates :portkey.aws.elasticloadbalancingv2.listener/ssl-policy :portkey.aws.elasticloadbalancingv2.listener/default-actions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/ssl-policy (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/default-actions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/actions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-listener-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn] :opt-un [:portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2.modify-listener-input/protocol :portkey.aws.elasticloadbalancingv2.modify-listener-input/ssl-policy :portkey.aws.elasticloadbalancingv2.modify-listener-input/certificates :portkey.aws.elasticloadbalancingv2.modify-listener-input/default-actions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-host (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/target-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-reason-enum #{:target-ip-unusable :target-timeout "Elb.InitialHealthChecking" :target-deregistration-in-progress "Target.NotInUse" "Elb.RegistrationInProgress" :target-health-check-disabled :target-not-registered "Target.InvalidState" "Target.ResponseCodeMismatch" "Target.DeregistrationInProgress" :target-failed-health-checks "Target.Timeout" :target-not-in-use "Target.IpUnusable" :elb-internal-error "Elb.InternalError" :target-response-code-mismatch :elb-registration-in-progress :elb-initial-health-checking "Target.NotRegistered" "Target.HealthCheckDisabled" :target-invalid-state "Target.FailedHealthChecks"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-listeners-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listeners-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/listeners :portkey.aws.elasticloadbalancingv2.describe-listeners-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/fixed-response-action-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-target-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-subnets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn] :opt-un [:portkey.aws.elasticloadbalancingv2/subnets :portkey.aws.elasticloadbalancingv2/subnet-mappings]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/condition-field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-rule-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rules]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listeners (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/listener))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule-condition/field (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/condition-field-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule-condition/values (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/list-of-string))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.rule-condition/field :portkey.aws.elasticloadbalancingv2.rule-condition/values]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/scheme (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-scheme-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-load-balancer-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.create-load-balancer-input/name] :opt-un [:portkey.aws.elasticloadbalancingv2/subnets :portkey.aws.elasticloadbalancingv2/subnet-mappings :portkey.aws.elasticloadbalancingv2/security-groups :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/scheme :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/tags :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/type :portkey.aws.elasticloadbalancingv2/ip-address-type]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer/type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer/scheme (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-scheme-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer/state (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-state))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.load-balancer/type :portkey.aws.elasticloadbalancingv2/security-groups :portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/load-balancer-name :portkey.aws.elasticloadbalancingv2/ip-address-type :portkey.aws.elasticloadbalancingv2/canonical-hosted-zone-id :portkey.aws.elasticloadbalancingv2/created-time :portkey.aws.elasticloadbalancingv2.load-balancer/scheme :portkey.aws.elasticloadbalancingv2/dns-name :portkey.aws.elasticloadbalancingv2/vpc-id :portkey.aws.elasticloadbalancingv2.load-balancer/state :portkey.aws.elasticloadbalancingv2/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-load-balancer-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-health-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-protocols (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-session-cookie-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn] :opt-un [:portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/fixed-response-action-status-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(2|4|5)\d\d$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.tag/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.tag/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.tag/key] :opt-un [:portkey.aws.elasticloadbalancingv2.tag/value]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/action-order (clojure.spec.alpha/int-in 1 50000))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.set-rule-priorities-input/rule-priorities (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-priority-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-rule-priorities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.set-rule-priorities-input/rule-priorities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-extra-params (clojure.spec.alpha/map-of :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-param-name :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-param-value))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-ssl-policies-input/names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-ssl-policies-input/names :portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-listener-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-session-cookie-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/healthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/target-type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/unhealthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/health-check-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/health-check-path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-target-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.create-target-group-input/name] :opt-un [:portkey.aws.elasticloadbalancingv2.create-target-group-input/healthy-threshold-count :portkey.aws.elasticloadbalancingv2/health-check-timeout-seconds :portkey.aws.elasticloadbalancingv2.create-target-group-input/target-type :portkey.aws.elasticloadbalancingv2.create-target-group-input/unhealthy-threshold-count :portkey.aws.elasticloadbalancingv2.create-target-group-input/protocol :portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2/vpc-id :portkey.aws.elasticloadbalancingv2/health-check-interval-seconds :portkey.aws.elasticloadbalancingv2/health-check-port :portkey.aws.elasticloadbalancingv2.create-target-group-input/health-check-protocol :portkey.aws.elasticloadbalancingv2/health-check-enabled :portkey.aws.elasticloadbalancingv2/matcher :portkey.aws.elasticloadbalancingv2.create-target-group-input/health-check-path]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-param-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rules (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-target-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/target-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-session-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/is-default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-rule-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rules]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-groups-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/target-groups :portkey.aws.elasticloadbalancingv2.describe-target-groups-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/healthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/target-type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/unhealthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/health-check-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/health-check-path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-group/healthy-threshold-count :portkey.aws.elasticloadbalancingv2/load-balancer-arns :portkey.aws.elasticloadbalancingv2/health-check-timeout-seconds :portkey.aws.elasticloadbalancingv2.target-group/target-type :portkey.aws.elasticloadbalancingv2.target-group/unhealthy-threshold-count :portkey.aws.elasticloadbalancingv2/target-group-arn :portkey.aws.elasticloadbalancingv2/target-group-name :portkey.aws.elasticloadbalancingv2.target-group/protocol :portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2/vpc-id :portkey.aws.elasticloadbalancingv2/health-check-interval-seconds :portkey.aws.elasticloadbalancingv2/health-check-port :portkey.aws.elasticloadbalancingv2.target-group/health-check-protocol :portkey.aws.elasticloadbalancingv2/health-check-enabled :portkey.aws.elasticloadbalancingv2/matcher :portkey.aws.elasticloadbalancingv2.target-group/health-check-path]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/matcher (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/http-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/availability-zone))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group-attribute))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-rule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/rule-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-port (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-client-secret (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/action-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/authenticate-oidc-config (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-config))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/authenticate-cognito-config (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-config))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/order (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/action-order))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/redirect-config (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-config))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/fixed-response-config (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/fixed-response-action-config))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/action (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.action/type] :opt-un [:portkey.aws.elasticloadbalancingv2/target-group-arn :portkey.aws.elasticloadbalancingv2.action/authenticate-oidc-config :portkey.aws.elasticloadbalancingv2.action/authenticate-cognito-config :portkey.aws.elasticloadbalancingv2.action/order :portkey.aws.elasticloadbalancingv2.action/redirect-config :portkey.aws.elasticloadbalancingv2.action/fixed-response-config]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-conditional-behavior-enum #{"authenticate" "allow" :allow "deny" :deny :authenticate})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-target-group-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.certificate/is-default (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/default))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/certificate-arn :portkey.aws.elasticloadbalancingv2.certificate/is-default]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-address (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ip-address :portkey.aws.elasticloadbalancingv2/allocation-id]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/priority-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/state-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-rules-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-rules-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rules :portkey.aws.elasticloadbalancingv2.describe-rules-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-output/attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-listener-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-attribute/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-attribute/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.load-balancer-attribute/key :portkey.aws.elasticloadbalancingv2.load-balancer-attribute/value]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-health-description/target (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-description))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-health-description/target :portkey.aws.elasticloadbalancingv2/health-check-port :portkey.aws.elasticloadbalancingv2/target-health]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/string-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-load-balancer-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-load-balancer-attributes-output/attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-priority-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule-priority-pair))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/zone-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-security-group-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-listener-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/listeners]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.core/defn describe-target-health "Describes the health of the specified targets or all of your targets." ([describe-target-health-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-target-health-input describe-target-health-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-target-health-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-target-health-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeTargetHealthResult", :http.request.configuration/action "DescribeTargetHealth", :http.request.configuration/output-deser-fn response-describe-target-health-output, :http.request.spec/error-spec {"InvalidTargetException" :portkey.aws.elasticloadbalancingv2/invalid-target-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "HealthUnavailableException" :portkey.aws.elasticloadbalancingv2/health-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-target-health :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-target-health-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-target-health-output))

(clojure.core/defn remove-tags "Removes the specified tags from the specified Elastic Load Balancing resource.\n To list the current tags for your resources, use DescribeTags." ([remove-tags-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-tags-input remove-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/remove-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/remove-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "RemoveTagsResult", :http.request.configuration/action "RemoveTags", :http.request.configuration/output-deser-fn response-remove-tags-output, :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancingv2/too-many-tags-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/remove-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/remove-tags-output))

(clojure.core/defn delete-rule "Deletes the specified rule." ([delete-rule-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-rule-input delete-rule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/delete-rule-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/delete-rule-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteRuleResult", :http.request.configuration/action "DeleteRule", :http.request.configuration/output-deser-fn response-delete-rule-output, :http.request.spec/error-spec {"RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef delete-rule :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-rule-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-rule-output))

(clojure.core/defn set-rule-priorities "Sets the priorities of the specified rules.\n You can reorder the rules as long as there are no priority conflicts in the new\norder. Any existing rules that you do not specify retain their current priority." ([set-rule-priorities-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-rule-priorities-input set-rule-priorities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/set-rule-priorities-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/set-rule-priorities-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetRulePrioritiesResult", :http.request.configuration/action "SetRulePriorities", :http.request.configuration/output-deser-fn response-set-rule-priorities-output, :http.request.spec/error-spec {"RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "PriorityInUseException" :portkey.aws.elasticloadbalancingv2/priority-in-use-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef set-rule-priorities :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-rule-priorities-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-rule-priorities-output))

(clojure.core/defn describe-account-limits "Describes the current Elastic Load Balancing resource limits for your AWS\naccount.\n For more information, see Limits for Your Application Load Balancers\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html)\nin the Application Load Balancer Guide or Limits for Your Network Load Balancers\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-limits.html)\nin the Network Load Balancers Guide." ([] (describe-account-limits {})) ([describe-account-limits-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-account-limits-input describe-account-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-account-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-account-limits-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAccountLimitsResult", :http.request.configuration/action "DescribeAccountLimits", :http.request.configuration/output-deser-fn response-describe-account-limits-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-account-limits :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-account-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-account-limits-output))

(clojure.core/defn delete-target-group "Deletes the specified target group.\n You can delete a target group if it is not referenced by any actions. Deleting\na target group also deletes any associated health checks." ([delete-target-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-target-group-input delete-target-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/delete-target-group-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/delete-target-group-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteTargetGroupResult", :http.request.configuration/action "DeleteTargetGroup", :http.request.configuration/output-deser-fn response-delete-target-group-output, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.elasticloadbalancingv2/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-target-group :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-target-group-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-target-group-output))

(clojure.core/defn delete-load-balancer "Deletes the specified Application Load Balancer or Network Load Balancer and its\nattached listeners.\n You can't delete a load balancer if deletion protection is enabled. If the load\nbalancer does not exist or has already been deleted, the call succeeds.\n Deleting a load balancer does not affect its registered targets. For example,\nyour EC2 instances continue to run and are still registered to their target\ngroups. If you no longer need these EC2 instances, you can stop or terminate\nthem." ([delete-load-balancer-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-load-balancer-input delete-load-balancer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/delete-load-balancer-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/delete-load-balancer-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteLoadBalancerResult", :http.request.configuration/action "DeleteLoadBalancer", :http.request.configuration/output-deser-fn response-delete-load-balancer-output, :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception, "ResourceInUseException" :portkey.aws.elasticloadbalancingv2/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-load-balancer-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-load-balancer-output))

(clojure.core/defn set-ip-address-type "Sets the type of IP addresses used by the subnets of the specified Application\nLoad Balancer or Network Load Balancer.\n Network Load Balancers must use ipv4." ([set-ip-address-type-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-ip-address-type-input set-ip-address-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/set-ip-address-type-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/set-ip-address-type-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetIpAddressTypeResult", :http.request.configuration/action "SetIpAddressType", :http.request.configuration/output-deser-fn response-set-ip-address-type-output, :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception}})))))
(clojure.spec.alpha/fdef set-ip-address-type :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-ip-address-type-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-ip-address-type-output))

(clojure.core/defn describe-rules "Describes the specified rules or the rules for the specified listener. You must\nspecify either a listener or one or more rules." ([] (describe-rules {})) ([describe-rules-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-rules-input describe-rules-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-rules-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-rules-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeRulesResult", :http.request.configuration/action "DescribeRules", :http.request.configuration/output-deser-fn response-describe-rules-output, :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception}})))))
(clojure.spec.alpha/fdef describe-rules :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-rules-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-rules-output))

(clojure.core/defn create-listener "Creates a listener for the specified Application Load Balancer or Network Load\nBalancer.\n To update a listener, use ModifyListener. When you are finished with a\nlistener, you can delete it using DeleteListener. If you are finished with both\nthe listener and the load balancer, you can delete them both using\nDeleteLoadBalancer.\n This operation is idempotent, which means that it completes at most one time.\nIf you attempt to create multiple listeners with the same settings, each call\nsucceeds.\n For more information, see Listeners for Your Application Load Balancers\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)\nin the Application Load Balancers Guide and Listeners for Your Network Load\nBalancers\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-listeners.html)\nin the Network Load Balancers Guide." ([create-listener-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-listener-input create-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/create-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/create-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateListenerResult", :http.request.configuration/action "CreateListener", :http.request.configuration/output-deser-fn response-create-listener-output, :http.request.spec/error-spec {"TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception, "TooManyActionsException" :portkey.aws.elasticloadbalancingv2/too-many-actions-exception, "DuplicateListenerException" :portkey.aws.elasticloadbalancingv2/duplicate-listener-exception, "SSLPolicyNotFoundException" :portkey.aws.elasticloadbalancingv2/ssl-policy-not-found-exception, "TooManyListenersException" :portkey.aws.elasticloadbalancingv2/too-many-listeners-exception, "TooManyCertificatesException" :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception, "InvalidLoadBalancerActionException" :portkey.aws.elasticloadbalancingv2/invalid-load-balancer-action-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}})))))
(clojure.spec.alpha/fdef create-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-listener-output))

(clojure.core/defn modify-load-balancer-attributes "Modifies the specified attributes of the specified Application Load Balancer or\nNetwork Load Balancer.\n If any of the specified attributes can't be modified as requested, the call\nfails. Any existing attributes that you do not modify retain their current\nvalues." ([modify-load-balancer-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-modify-load-balancer-attributes-input modify-load-balancer-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ModifyLoadBalancerAttributesResult", :http.request.configuration/action "ModifyLoadBalancerAttributes", :http.request.configuration/output-deser-fn response-modify-load-balancer-attributes-output, :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef modify-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-output))

(clojure.core/defn add-listener-certificates "Adds the specified certificate to the specified HTTPS listener.\n If the certificate was already added, the call is successful but the\ncertificate is not added again.\n To list the certificates for your listener, use DescribeListenerCertificates.\nTo remove certificates from your listener, use RemoveListenerCertificates. To\nspecify the default SSL server certificate, use ModifyListener." ([add-listener-certificates-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-listener-certificates-input add-listener-certificates-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/add-listener-certificates-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/add-listener-certificates-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AddListenerCertificatesResult", :http.request.configuration/action "AddListenerCertificates", :http.request.configuration/output-deser-fn response-add-listener-certificates-output, :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "TooManyCertificatesException" :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception}})))))
(clojure.spec.alpha/fdef add-listener-certificates :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/add-listener-certificates-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/add-listener-certificates-output))

(clojure.core/defn create-rule "Creates a rule for the specified listener. The listener must be associated with\nan Application Load Balancer.\n Rules are evaluated in priority order, from the lowest value to the highest\nvalue. When the conditions for a rule are met, its actions are performed. If the\nconditions for no rules are met, the actions for the default rule are performed.\nFor more information, see Listener Rules\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#listener-rules)\nin the Application Load Balancers Guide.\n To view your current rules, use DescribeRules. To update a rule, use\nModifyRule. To set the priorities of your rules, use SetRulePriorities. To\ndelete a rule, use DeleteRule." ([create-rule-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-rule-input create-rule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/create-rule-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/create-rule-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateRuleResult", :http.request.configuration/action "CreateRule", :http.request.configuration/output-deser-fn response-create-rule-output, :http.request.spec/error-spec {"TooManyRulesException" :portkey.aws.elasticloadbalancingv2/too-many-rules-exception, "TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception, "TooManyActionsException" :portkey.aws.elasticloadbalancingv2/too-many-actions-exception, "TooManyTargetGroupsException" :portkey.aws.elasticloadbalancingv2/too-many-target-groups-exception, "InvalidLoadBalancerActionException" :portkey.aws.elasticloadbalancingv2/invalid-load-balancer-action-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "PriorityInUseException" :portkey.aws.elasticloadbalancingv2/priority-in-use-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}})))))
(clojure.spec.alpha/fdef create-rule :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-rule-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-rule-output))

(clojure.core/defn create-load-balancer "Creates an Application Load Balancer or a Network Load Balancer.\n When you create a load balancer, you can specify security groups, public\nsubnets, IP address type, and tags. Otherwise, you could do so later using\nSetSecurityGroups, SetSubnets, SetIpAddressType, and AddTags.\n To create listeners for your load balancer, use CreateListener. To describe\nyour current load balancers, see DescribeLoadBalancers. When you are finished\nwith a load balancer, you can delete it using DeleteLoadBalancer.\n For limit information, see Limits for Your Application Load Balancer\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html)\nin the Application Load Balancers Guide and Limits for Your Network Load\nBalancer\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-limits.html)\nin the Network Load Balancers Guide.\n This operation is idempotent, which means that it completes at most one time.\nIf you attempt to create multiple load balancers with the same settings, each\ncall succeeds.\n For more information, see Application Load Balancers\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html)\nin the Application Load Balancers Guide and Network Load Balancers\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html)\nin the Network Load Balancers Guide." ([create-load-balancer-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-load-balancer-input create-load-balancer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/create-load-balancer-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/create-load-balancer-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateLoadBalancerResult", :http.request.configuration/action "CreateLoadBalancer", :http.request.configuration/output-deser-fn response-create-load-balancer-output, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception, "DuplicateLoadBalancerNameException" :portkey.aws.elasticloadbalancingv2/duplicate-load-balancer-name-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception, "AvailabilityZoneNotSupportedException" :portkey.aws.elasticloadbalancingv2/availability-zone-not-supported-exception, "ResourceInUseException" :portkey.aws.elasticloadbalancingv2/resource-in-use-exception, "AllocationIdNotFoundException" :portkey.aws.elasticloadbalancingv2/allocation-id-not-found-exception, "TooManyLoadBalancersException" :portkey.aws.elasticloadbalancingv2/too-many-load-balancers-exception, "DuplicateTagKeysException" :portkey.aws.elasticloadbalancingv2/duplicate-tag-keys-exception, "InvalidSchemeException" :portkey.aws.elasticloadbalancingv2/invalid-scheme-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancingv2/too-many-tags-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancingv2/subnet-not-found-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancingv2/invalid-security-group-exception}})))))
(clojure.spec.alpha/fdef create-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-load-balancer-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-load-balancer-output))

(clojure.core/defn describe-tags "Describes the tags for the specified resources. You can describe the tags for\none or more Application Load Balancers, Network Load Balancers, and target\ngroups." ([describe-tags-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-tags-input describe-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeTagsResult", :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-describe-tags-output, :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-tags-output))

(clojure.core/defn create-target-group "Creates a target group.\n To register targets with the target group, use RegisterTargets. To update the\nhealth check settings for the target group, use ModifyTargetGroup. To monitor\nthe health of targets in the target group, use DescribeTargetHealth.\n To route traffic to the targets in a target group, specify the target group in\nan action using CreateListener or CreateRule.\n To delete a target group, use DeleteTargetGroup.\n This operation is idempotent, which means that it completes at most one time.\nIf you attempt to create multiple target groups with the same settings, each\ncall succeeds.\n For more information, see Target Groups for Your Application Load Balancers\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html)\nin the Application Load Balancers Guide or Target Groups for Your Network Load\nBalancers\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html)\nin the Network Load Balancers Guide." ([create-target-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-target-group-input create-target-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/create-target-group-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/create-target-group-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateTargetGroupResult", :http.request.configuration/action "CreateTargetGroup", :http.request.configuration/output-deser-fn response-create-target-group-output, :http.request.spec/error-spec {"DuplicateTargetGroupNameException" :portkey.aws.elasticloadbalancingv2/duplicate-target-group-name-exception, "TooManyTargetGroupsException" :portkey.aws.elasticloadbalancingv2/too-many-target-groups-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef create-target-group :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-target-group-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-target-group-output))

(clojure.core/defn modify-rule "Modifies the specified rule.\n Any existing properties that you do not modify retain their current values.\n To modify the actions for the default rule, use ModifyListener." ([modify-rule-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-modify-rule-input modify-rule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/modify-rule-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/modify-rule-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ModifyRuleResult", :http.request.configuration/action "ModifyRule", :http.request.configuration/output-deser-fn response-modify-rule-output, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception, "TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception, "TooManyActionsException" :portkey.aws.elasticloadbalancingv2/too-many-actions-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "InvalidLoadBalancerActionException" :portkey.aws.elasticloadbalancingv2/invalid-load-balancer-action-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}})))))
(clojure.spec.alpha/fdef modify-rule :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-rule-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-rule-output))

(clojure.core/defn modify-target-group-attributes "Modifies the specified attributes of the specified target group." ([modify-target-group-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-modify-target-group-attributes-input modify-target-group-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ModifyTargetGroupAttributesResult", :http.request.configuration/action "ModifyTargetGroupAttributes", :http.request.configuration/output-deser-fn response-modify-target-group-attributes-output, :http.request.spec/error-spec {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef modify-target-group-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-output))

(clojure.core/defn delete-listener "Deletes the specified listener.\n Alternatively, your listener is deleted when you delete the load balancer to\nwhich it is attached, using DeleteLoadBalancer." ([delete-listener-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-listener-input delete-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/delete-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/delete-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteListenerResult", :http.request.configuration/action "DeleteListener", :http.request.configuration/output-deser-fn response-delete-listener-output, :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-listener-output))

(clojure.core/defn deregister-targets "Deregisters the specified targets from the specified target group. After the\ntargets are deregistered, they no longer receive traffic from the load balancer." ([deregister-targets-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-deregister-targets-input deregister-targets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/deregister-targets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/deregister-targets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeregisterTargetsResult", :http.request.configuration/action "DeregisterTargets", :http.request.configuration/output-deser-fn response-deregister-targets-output, :http.request.spec/error-spec {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "InvalidTargetException" :portkey.aws.elasticloadbalancingv2/invalid-target-exception}})))))
(clojure.spec.alpha/fdef deregister-targets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/deregister-targets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/deregister-targets-output))

(clojure.core/defn describe-ssl-policies "Describes the specified policies or all policies used for SSL negotiation.\n For more information, see Security Policies\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies)\nin the Application Load Balancers Guide." ([] (describe-ssl-policies {})) ([describe-ssl-policies-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-ssl-policies-input describe-ssl-policies-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeSSLPoliciesResult", :http.request.configuration/action "DescribeSSLPolicies", :http.request.configuration/output-deser-fn response-describe-ssl-policies-output, :http.request.spec/error-spec {"SSLPolicyNotFoundException" :portkey.aws.elasticloadbalancingv2/ssl-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-ssl-policies :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-output))

(clojure.core/defn modify-target-group "Modifies the health checks used when evaluating the health state of the targets\nin the specified target group.\n To monitor the health of the targets, use DescribeTargetHealth." ([modify-target-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-modify-target-group-input modify-target-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/modify-target-group-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/modify-target-group-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ModifyTargetGroupResult", :http.request.configuration/action "ModifyTargetGroup", :http.request.configuration/output-deser-fn response-modify-target-group-output, :http.request.spec/error-spec {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef modify-target-group :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-target-group-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-target-group-output))

(clojure.core/defn describe-target-group-attributes "Describes the attributes for the specified target group.\n For more information, see Target Group Attributes\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html#target-group-attributes)\nin the Application Load Balancers Guide or Target Group Attributes\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#target-group-attributes)\nin the Network Load Balancers Guide." ([describe-target-group-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-target-group-attributes-input describe-target-group-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeTargetGroupAttributesResult", :http.request.configuration/action "DescribeTargetGroupAttributes", :http.request.configuration/output-deser-fn response-describe-target-group-attributes-output, :http.request.spec/error-spec {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-target-group-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-output))

(clojure.core/defn register-targets "Registers the specified targets with the specified target group.\n If the target is an EC2 instance, it must be in the running state when you\nregister it.\n By default, the load balancer routes requests to registered targets using the\nprotocol and port for the target group. Alternatively, you can override the port\nfor a target when you register it. You can register each EC2 instance or IP\naddress with the same target group multiple times using different ports.\n With a Network Load Balancer, you cannot register instances by instance ID if\nthey have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1,\nG2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by\nIP address.\n To remove a target from a target group, use DeregisterTargets." ([register-targets-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-register-targets-input register-targets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/register-targets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/register-targets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "RegisterTargetsResult", :http.request.configuration/action "RegisterTargets", :http.request.configuration/output-deser-fn response-register-targets-output, :http.request.spec/error-spec {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "InvalidTargetException" :portkey.aws.elasticloadbalancingv2/invalid-target-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}})))))
(clojure.spec.alpha/fdef register-targets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/register-targets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/register-targets-output))

(clojure.core/defn describe-target-groups "Describes the specified target groups or all of your target groups. By default,\nall target groups are described. Alternatively, you can specify one of the\nfollowing to filter the results: the ARN of the load balancer, the names of one\nor more target groups, or the ARNs of one or more target groups.\n To describe the targets for a target group, use DescribeTargetHealth. To\ndescribe the attributes of a target group, use DescribeTargetGroupAttributes." ([] (describe-target-groups {})) ([describe-target-groups-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-target-groups-input describe-target-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-target-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-target-groups-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeTargetGroupsResult", :http.request.configuration/action "DescribeTargetGroups", :http.request.configuration/output-deser-fn response-describe-target-groups-output, :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-target-groups :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-target-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-target-groups-output))

(clojure.core/defn add-tags "Adds the specified tags to the specified Elastic Load Balancing resource. You\ncan tag your Application Load Balancers, Network Load Balancers, and your target\ngroups.\n Each tag consists of a key and an optional value. If a resource already has a\ntag with the same key, AddTags updates its value.\n To list the current tags for your resources, use DescribeTags. To remove tags\nfrom your resources, use RemoveTags." ([add-tags-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/add-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AddTagsResult", :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn response-add-tags-output, :http.request.spec/error-spec {"DuplicateTagKeysException" :portkey.aws.elasticloadbalancingv2/duplicate-tag-keys-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancingv2/too-many-tags-exception, "LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/add-tags-output))

(clojure.core/defn set-security-groups "Associates the specified security groups with the specified Application Load\nBalancer. The specified security groups override the previously associated\nsecurity groups.\n You can't specify a security group for a Network Load Balancer." ([set-security-groups-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-security-groups-input set-security-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/set-security-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/set-security-groups-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetSecurityGroupsResult", :http.request.configuration/action "SetSecurityGroups", :http.request.configuration/output-deser-fn response-set-security-groups-output, :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancingv2/invalid-security-group-exception}})))))
(clojure.spec.alpha/fdef set-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-security-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-security-groups-output))

(clojure.core/defn remove-listener-certificates "Removes the specified certificate from the specified HTTPS listener.\n You can't remove the default certificate for a listener. To replace the default\ncertificate, call ModifyListener.\n To list the certificates for your listener, use DescribeListenerCertificates." ([remove-listener-certificates-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-listener-certificates-input remove-listener-certificates-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "RemoveListenerCertificatesResult", :http.request.configuration/action "RemoveListenerCertificates", :http.request.configuration/output-deser-fn response-remove-listener-certificates-output, :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef remove-listener-certificates :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-output))

(clojure.core/defn set-subnets "Enables the Availability Zone for the specified public subnets for the specified\nApplication Load Balancer. The specified subnets replace the previously enabled\nsubnets.\n You can't change the subnets for a Network Load Balancer." ([set-subnets-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-subnets-input set-subnets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/set-subnets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/set-subnets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetSubnetsResult", :http.request.configuration/action "SetSubnets", :http.request.configuration/output-deser-fn response-set-subnets-output, :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancingv2/subnet-not-found-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception, "AllocationIdNotFoundException" :portkey.aws.elasticloadbalancingv2/allocation-id-not-found-exception, "AvailabilityZoneNotSupportedException" :portkey.aws.elasticloadbalancingv2/availability-zone-not-supported-exception}})))))
(clojure.spec.alpha/fdef set-subnets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-subnets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-subnets-output))

(clojure.core/defn modify-listener "Modifies the specified properties of the specified listener.\n Any properties that you do not specify retain their current values. However,\nchanging the protocol from HTTPS to HTTP, or from TLS to TCP, removes the\nsecurity policy and server certificate properties. If you change the protocol\nfrom HTTP to HTTPS, or from TCP to TLS, you must add the security policy and\nserver certificate properties." ([modify-listener-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-modify-listener-input modify-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/modify-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/modify-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ModifyListenerResult", :http.request.configuration/action "ModifyListener", :http.request.configuration/output-deser-fn response-modify-listener-output, :http.request.spec/error-spec {"TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception, "TooManyActionsException" :portkey.aws.elasticloadbalancingv2/too-many-actions-exception, "DuplicateListenerException" :portkey.aws.elasticloadbalancingv2/duplicate-listener-exception, "SSLPolicyNotFoundException" :portkey.aws.elasticloadbalancingv2/ssl-policy-not-found-exception, "TooManyListenersException" :portkey.aws.elasticloadbalancingv2/too-many-listeners-exception, "TooManyCertificatesException" :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception, "InvalidLoadBalancerActionException" :portkey.aws.elasticloadbalancingv2/invalid-load-balancer-action-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}})))))
(clojure.spec.alpha/fdef modify-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-listener-output))

(clojure.core/defn describe-load-balancers "Describes the specified load balancers or all of your load balancers.\n To describe the listeners for a load balancer, use DescribeListeners. To\ndescribe the attributes for a load balancer, use DescribeLoadBalancerAttributes." ([] (describe-load-balancers {})) ([describe-load-balancers-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-load-balancers-input describe-load-balancers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-load-balancers-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-load-balancers-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLoadBalancersResult", :http.request.configuration/action "DescribeLoadBalancers", :http.request.configuration/output-deser-fn response-describe-load-balancers-output, :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancers :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-load-balancers-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-load-balancers-output))

(clojure.core/defn describe-listeners "Describes the specified listeners or the listeners for the specified Application\nLoad Balancer or Network Load Balancer. You must specify either a load balancer\nor one or more listeners." ([] (describe-listeners {})) ([describe-listeners-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-listeners-input describe-listeners-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-listeners-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-listeners-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeListenersResult", :http.request.configuration/action "DescribeListeners", :http.request.configuration/output-deser-fn response-describe-listeners-output, :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception}})))))
(clojure.spec.alpha/fdef describe-listeners :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-listeners-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-listeners-output))

(clojure.core/defn describe-load-balancer-attributes "Describes the attributes for the specified Application Load Balancer or Network\nLoad Balancer.\n For more information, see Load Balancer Attributes\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html#load-balancer-attributes)\nin the Application Load Balancers Guide or Load Balancer Attributes\n(https://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html#load-balancer-attributes)\nin the Network Load Balancers Guide." ([describe-load-balancer-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-load-balancer-attributes-input describe-load-balancer-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLoadBalancerAttributesResult", :http.request.configuration/action "DescribeLoadBalancerAttributes", :http.request.configuration/output-deser-fn response-describe-load-balancer-attributes-output, :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-output))

(clojure.core/defn describe-listener-certificates "Describes the certificates for the specified HTTPS listener." ([describe-listener-certificates-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-listener-certificates-input describe-listener-certificates-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeListenerCertificatesResult", :http.request.configuration/action "DescribeListenerCertificates", :http.request.configuration/output-deser-fn response-describe-listener-certificates-output, :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-listener-certificates :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-output))
