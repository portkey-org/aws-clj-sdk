(ns portkey.aws.worklink (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-username)

(clojure.core/declare ser-subnet-ids)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-display-name)

(clojure.core/declare ser-fleet-name)

(clojure.core/declare ser-certificate-chain)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-vpc-id)

(clojure.core/declare ser-identity-provider-type)

(clojure.core/declare ser-saml-metadata)

(clojure.core/declare ser-audit-stream-arn)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-certificate)

(clojure.core/declare ser-fleet-arn)

(clojure.core/declare ser-id)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-username [input] #:http.request.field{:value input, :shape "Username"})

(clojure.core/defn- ser-subnet-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "SubnetIds", :type "list"})

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroupIds", :type "list"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-display-name [input] #:http.request.field{:value input, :shape "DisplayName"})

(clojure.core/defn- ser-fleet-name [input] #:http.request.field{:value input, :shape "FleetName"})

(clojure.core/defn- ser-certificate-chain [input] #:http.request.field{:value input, :shape "CertificateChain"})

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-vpc-id [input] #:http.request.field{:value input, :shape "VpcId"})

(clojure.core/defn- ser-identity-provider-type [input] #:http.request.field{:value (clojure.core/get {"SAML" "SAML", :saml "SAML"} input), :shape "IdentityProviderType"})

(clojure.core/defn- ser-saml-metadata [input] #:http.request.field{:value input, :shape "SamlMetadata"})

(clojure.core/defn- ser-audit-stream-arn [input] #:http.request.field{:value input, :shape "AuditStreamArn"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-certificate [input] #:http.request.field{:value input, :shape "Certificate"})

(clojure.core/defn- ser-fleet-arn [input] #:http.request.field{:value input, :shape "FleetArn"})

(clojure.core/defn- ser-id [input] #:http.request.field{:value input, :shape "Id"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-describe-identity-provider-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-describe-device-policy-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-delete-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-sign-out-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-username (input :username)) #:http.request.field{:name "Username", :shape "Username"})]}))

(clojure.core/defn- req-list-website-certificate-authorities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-id (input :device-id)) #:http.request.field{:name "DeviceId", :shape "Id"})]}))

(clojure.core/defn- req-describe-company-network-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-disassociate-website-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-id (input :website-ca-id)) #:http.request.field{:name "WebsiteCaId", :shape "Id"})]}))

(clojure.core/defn- req-describe-website-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-id (input :website-ca-id)) #:http.request.field{:name "WebsiteCaId", :shape "Id"})]}))

(clojure.core/defn- req-update-device-policy-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]} (clojure.core/contains? input :device-ca-certificate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-chain (input :device-ca-certificate)) #:http.request.field{:name "DeviceCaCertificate", :shape "CertificateChain"}))))

(clojure.core/defn- req-update-audit-stream-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]} (clojure.core/contains? input :audit-stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audit-stream-arn (input :audit-stream-arn)) #:http.request.field{:name "AuditStreamArn", :shape "AuditStreamArn"}))))

(clojure.core/defn- req-update-company-network-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-vpc-id (input :vpc-id)) #:http.request.field{:name "VpcId", :shape "VpcId"}) (clojure.core/into (ser-subnet-ids (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"}) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIds"})]}))

(clojure.core/defn- req-describe-fleet-metadata-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-update-identity-provider-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-identity-provider-type (input :identity-provider-type)) #:http.request.field{:name "IdentityProviderType", :shape "IdentityProviderType"})]} (clojure.core/contains? input :identity-provider-saml-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-saml-metadata (input :identity-provider-saml-metadata)) #:http.request.field{:name "IdentityProviderSamlMetadata", :shape "SamlMetadata"}))))

(clojure.core/defn- req-update-fleet-metadata-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :optimize-for-end-user-location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :optimize-for-end-user-location)) #:http.request.field{:name "OptimizeForEndUserLocation", :shape "Boolean"}))))

(clojure.core/defn- req-describe-audit-stream-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]}))

(clojure.core/defn- req-list-fleets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-list-devices-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-name (input :fleet-name)) #:http.request.field{:name "FleetName", :shape "FleetName"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"})) (clojure.core/contains? input :optimize-for-end-user-location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :optimize-for-end-user-location)) #:http.request.field{:name "OptimizeForEndUserLocation", :shape "Boolean"}))))

(clojure.core/defn- req-associate-website-certificate-authority-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-fleet-arn (input :fleet-arn)) #:http.request.field{:name "FleetArn", :shape "FleetArn"}) (clojure.core/into (ser-certificate (input :certificate)) #:http.request.field{:name "Certificate", :shape "Certificate"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "DisplayName"}))))

(clojure.core/declare deser-username)

(clojure.core/declare deser-device-operating-system-name)

(clojure.core/declare deser-device-model)

(clojure.core/declare deser-subnet-ids)

(clojure.core/declare deser-website-ca-summary-list)

(clojure.core/declare deser-security-group-ids)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-fleet-summary)

(clojure.core/declare deser-fleet-summary-list)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-website-ca-summary)

(clojure.core/declare deser-display-name)

(clojure.core/declare deser-fleet-name)

(clojure.core/declare deser-security-group-id)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-device-status)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-device-patch-level)

(clojure.core/declare deser-device-summary)

(clojure.core/declare deser-identity-provider-type)

(clojure.core/declare deser-device-summary-list)

(clojure.core/declare deser-saml-metadata)

(clojure.core/declare deser-audit-stream-arn)

(clojure.core/declare deser-fleet-status)

(clojure.core/declare deser-device-operating-system-version)

(clojure.core/declare deser-certificate)

(clojure.core/declare deser-fleet-arn)

(clojure.core/declare deser-company-code)

(clojure.core/declare deser-id)

(clojure.core/declare deser-device-manufacturer)

(clojure.core/declare deser-date-time)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-username [input] input)

(clojure.core/defn- deser-device-operating-system-name [input] input)

(clojure.core/defn- deser-device-model [input] input)

(clojure.core/defn- deser-subnet-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet-id coll))) input))

(clojure.core/defn- deser-website-ca-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-website-ca-summary coll))) input))

(clojure.core/defn- deser-security-group-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group-id coll))) input))

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-fleet-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "FleetArn") (clojure.core/assoc :fleet-arn (deser-fleet-arn (input "FleetArn"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-date-time (input "CreatedTime"))) (clojure.core/contains? input "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-date-time (input "LastUpdatedTime"))) (clojure.core/contains? input "FleetName") (clojure.core/assoc :fleet-name (deser-fleet-name (input "FleetName"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-display-name (input "DisplayName"))) (clojure.core/contains? input "CompanyCode") (clojure.core/assoc :company-code (deser-company-code (input "CompanyCode"))) (clojure.core/contains? input "FleetStatus") (clojure.core/assoc :fleet-status (deser-fleet-status (input "FleetStatus")))))

(clojure.core/defn- deser-fleet-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fleet-summary coll))) input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-website-ca-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "WebsiteCaId") (clojure.core/assoc :website-ca-id (deser-id (input "WebsiteCaId"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-date-time (input "CreatedTime"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-display-name (input "DisplayName")))))

(clojure.core/defn- deser-display-name [input] input)

(clojure.core/defn- deser-fleet-name [input] input)

(clojure.core/defn- deser-security-group-id [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-device-status [input] (clojure.core/get {"ACTIVE" :active, "SIGNED_OUT" :signed-out} input))

(clojure.core/defn- deser-vpc-id [input] input)

(clojure.core/defn- deser-device-patch-level [input] input)

(clojure.core/defn- deser-device-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeviceId") (clojure.core/assoc :device-id (deser-id (input "DeviceId"))) (clojure.core/contains? input "DeviceStatus") (clojure.core/assoc :device-status (deser-device-status (input "DeviceStatus")))))

(clojure.core/defn- deser-identity-provider-type [input] (clojure.core/get {"SAML" :saml} input))

(clojure.core/defn- deser-device-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-summary coll))) input))

(clojure.core/defn- deser-saml-metadata [input] input)

(clojure.core/defn- deser-audit-stream-arn [input] input)

(clojure.core/defn- deser-fleet-status [input] (clojure.core/get {"CREATING" :creating, "ACTIVE" :active, "DELETING" :deleting, "DELETED" :deleted, "FAILED_TO_CREATE" :failed-to-create, "FAILED_TO_DELETE" :failed-to-delete} input))

(clojure.core/defn- deser-device-operating-system-version [input] input)

(clojure.core/defn- deser-certificate [input] input)

(clojure.core/defn- deser-fleet-arn [input] input)

(clojure.core/defn- deser-company-code [input] input)

(clojure.core/defn- deser-id [input] input)

(clojure.core/defn- deser-device-manufacturer [input] input)

(clojure.core/defn- deser-date-time [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-update-audit-stream-configuration-response ([input] (response-update-audit-stream-configuration-response nil input)) ([resultWrapper1477310 input] (clojure.core/let [rawinput1477309 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477311 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper1477313 input] (clojure.core/let [rawinput1477312 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477314 {"Message" (rawinput1477312 "Message")}] (clojure.core/cond-> {} (letvar1477314 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1477314 ["Message"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper1477316 input] (clojure.core/let [rawinput1477315 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477317 {"Message" (rawinput1477315 "Message")}] (clojure.core/cond-> {} (letvar1477317 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1477317 ["Message"])))))))

(clojure.core/defn- response-describe-fleet-metadata-response ([input] (response-describe-fleet-metadata-response nil input)) ([resultWrapper1477319 input] (clojure.core/let [rawinput1477318 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477320 {"CreatedTime" (rawinput1477318 "CreatedTime"), "LastUpdatedTime" (rawinput1477318 "LastUpdatedTime"), "FleetName" (rawinput1477318 "FleetName"), "DisplayName" (rawinput1477318 "DisplayName"), "OptimizeForEndUserLocation" (rawinput1477318 "OptimizeForEndUserLocation"), "CompanyCode" (rawinput1477318 "CompanyCode"), "FleetStatus" (rawinput1477318 "FleetStatus")}] (clojure.core/cond-> {} (letvar1477320 "CreatedTime") (clojure.core/assoc :created-time (deser-date-time (clojure.core/get-in letvar1477320 ["CreatedTime"]))) (letvar1477320 "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-date-time (clojure.core/get-in letvar1477320 ["LastUpdatedTime"]))) (letvar1477320 "FleetName") (clojure.core/assoc :fleet-name (deser-fleet-name (clojure.core/get-in letvar1477320 ["FleetName"]))) (letvar1477320 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1477320 ["DisplayName"]))) (letvar1477320 "OptimizeForEndUserLocation") (clojure.core/assoc :optimize-for-end-user-location (deser-boolean (clojure.core/get-in letvar1477320 ["OptimizeForEndUserLocation"]))) (letvar1477320 "CompanyCode") (clojure.core/assoc :company-code (deser-company-code (clojure.core/get-in letvar1477320 ["CompanyCode"]))) (letvar1477320 "FleetStatus") (clojure.core/assoc :fleet-status (deser-fleet-status (clojure.core/get-in letvar1477320 ["FleetStatus"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1477322 input] (clojure.core/let [rawinput1477321 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477323 {"Message" (rawinput1477321 "Message")}] (clojure.core/cond-> {} (letvar1477323 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1477323 ["Message"])))))))

(clojure.core/defn- response-list-fleets-response ([input] (response-list-fleets-response nil input)) ([resultWrapper1477325 input] (clojure.core/let [rawinput1477324 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477326 {"FleetSummaryList" (rawinput1477324 "FleetSummaryList"), "NextToken" (rawinput1477324 "NextToken")}] (clojure.core/cond-> {} (letvar1477326 "FleetSummaryList") (clojure.core/assoc :fleet-summary-list (deser-fleet-summary-list (clojure.core/get-in letvar1477326 ["FleetSummaryList"]))) (letvar1477326 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1477326 ["NextToken"])))))))

(clojure.core/defn- response-describe-company-network-configuration-response ([input] (response-describe-company-network-configuration-response nil input)) ([resultWrapper1477328 input] (clojure.core/let [rawinput1477327 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477329 {"VpcId" (rawinput1477327 "VpcId"), "SubnetIds" (rawinput1477327 "SubnetIds"), "SecurityGroupIds" (rawinput1477327 "SecurityGroupIds")}] (clojure.core/cond-> {} (letvar1477329 "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (clojure.core/get-in letvar1477329 ["VpcId"]))) (letvar1477329 "SubnetIds") (clojure.core/assoc :subnet-ids (deser-subnet-ids (clojure.core/get-in letvar1477329 ["SubnetIds"]))) (letvar1477329 "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-security-group-ids (clojure.core/get-in letvar1477329 ["SecurityGroupIds"])))))))

(clojure.core/defn- response-list-website-certificate-authorities-response ([input] (response-list-website-certificate-authorities-response nil input)) ([resultWrapper1477331 input] (clojure.core/let [rawinput1477330 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477332 {"WebsiteCertificateAuthorities" (rawinput1477330 "WebsiteCertificateAuthorities"), "NextToken" (rawinput1477330 "NextToken")}] (clojure.core/cond-> {} (letvar1477332 "WebsiteCertificateAuthorities") (clojure.core/assoc :website-certificate-authorities (deser-website-ca-summary-list (clojure.core/get-in letvar1477332 ["WebsiteCertificateAuthorities"]))) (letvar1477332 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1477332 ["NextToken"])))))))

(clojure.core/defn- response-sign-out-user-response ([input] (response-sign-out-user-response nil input)) ([resultWrapper1477334 input] (clojure.core/let [rawinput1477333 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477335 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-website-certificate-authority-response ([input] (response-describe-website-certificate-authority-response nil input)) ([resultWrapper1477337 input] (clojure.core/let [rawinput1477336 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477338 {"Certificate" (rawinput1477336 "Certificate"), "CreatedTime" (rawinput1477336 "CreatedTime"), "DisplayName" (rawinput1477336 "DisplayName")}] (clojure.core/cond-> {} (letvar1477338 "Certificate") (clojure.core/assoc :certificate (deser-certificate (clojure.core/get-in letvar1477338 ["Certificate"]))) (letvar1477338 "CreatedTime") (clojure.core/assoc :created-time (deser-date-time (clojure.core/get-in letvar1477338 ["CreatedTime"]))) (letvar1477338 "DisplayName") (clojure.core/assoc :display-name (deser-display-name (clojure.core/get-in letvar1477338 ["DisplayName"])))))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper1477340 input] (clojure.core/let [rawinput1477339 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477341 {"Message" (rawinput1477339 "Message")}] (clojure.core/cond-> {} (letvar1477341 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1477341 ["Message"])))))))

(clojure.core/defn- response-update-identity-provider-configuration-response ([input] (response-update-identity-provider-configuration-response nil input)) ([resultWrapper1477343 input] (clojure.core/let [rawinput1477342 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477344 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-company-network-configuration-response ([input] (response-update-company-network-configuration-response nil input)) ([resultWrapper1477346 input] (clojure.core/let [rawinput1477345 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477347 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-website-certificate-authority-response ([input] (response-associate-website-certificate-authority-response nil input)) ([resultWrapper1477349 input] (clojure.core/let [rawinput1477348 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477350 {"WebsiteCaId" (rawinput1477348 "WebsiteCaId")}] (clojure.core/cond-> {} (letvar1477350 "WebsiteCaId") (clojure.core/assoc :website-ca-id (deser-id (clojure.core/get-in letvar1477350 ["WebsiteCaId"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1477352 input] (clojure.core/let [rawinput1477351 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477353 {"Message" (rawinput1477351 "Message")}] (clojure.core/cond-> {} (letvar1477353 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1477353 ["Message"])))))))

(clojure.core/defn- response-describe-device-response ([input] (response-describe-device-response nil input)) ([resultWrapper1477355 input] (clojure.core/let [rawinput1477354 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477356 {"Username" (rawinput1477354 "Username"), "LastAccessedTime" (rawinput1477354 "LastAccessedTime"), "Manufacturer" (rawinput1477354 "Manufacturer"), "Status" (rawinput1477354 "Status"), "FirstAccessedTime" (rawinput1477354 "FirstAccessedTime"), "Model" (rawinput1477354 "Model"), "OperatingSystemVersion" (rawinput1477354 "OperatingSystemVersion"), "PatchLevel" (rawinput1477354 "PatchLevel"), "OperatingSystem" (rawinput1477354 "OperatingSystem")}] (clojure.core/cond-> {} (letvar1477356 "Username") (clojure.core/assoc :username (deser-username (clojure.core/get-in letvar1477356 ["Username"]))) (letvar1477356 "LastAccessedTime") (clojure.core/assoc :last-accessed-time (deser-date-time (clojure.core/get-in letvar1477356 ["LastAccessedTime"]))) (letvar1477356 "Manufacturer") (clojure.core/assoc :manufacturer (deser-device-manufacturer (clojure.core/get-in letvar1477356 ["Manufacturer"]))) (letvar1477356 "Status") (clojure.core/assoc :status (deser-device-status (clojure.core/get-in letvar1477356 ["Status"]))) (letvar1477356 "FirstAccessedTime") (clojure.core/assoc :first-accessed-time (deser-date-time (clojure.core/get-in letvar1477356 ["FirstAccessedTime"]))) (letvar1477356 "Model") (clojure.core/assoc :model (deser-device-model (clojure.core/get-in letvar1477356 ["Model"]))) (letvar1477356 "OperatingSystemVersion") (clojure.core/assoc :operating-system-version (deser-device-operating-system-version (clojure.core/get-in letvar1477356 ["OperatingSystemVersion"]))) (letvar1477356 "PatchLevel") (clojure.core/assoc :patch-level (deser-device-patch-level (clojure.core/get-in letvar1477356 ["PatchLevel"]))) (letvar1477356 "OperatingSystem") (clojure.core/assoc :operating-system (deser-device-operating-system-name (clojure.core/get-in letvar1477356 ["OperatingSystem"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1477358 input] (clojure.core/let [rawinput1477357 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477359 {"Message" (rawinput1477357 "Message")}] (clojure.core/cond-> {} (letvar1477359 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1477359 ["Message"])))))))

(clojure.core/defn- response-update-device-policy-configuration-response ([input] (response-update-device-policy-configuration-response nil input)) ([resultWrapper1477361 input] (clojure.core/let [rawinput1477360 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477362 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-fleet-response ([input] (response-create-fleet-response nil input)) ([resultWrapper1477364 input] (clojure.core/let [rawinput1477363 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477365 {"FleetArn" (rawinput1477363 "FleetArn")}] (clojure.core/cond-> {} (letvar1477365 "FleetArn") (clojure.core/assoc :fleet-arn (deser-fleet-arn (clojure.core/get-in letvar1477365 ["FleetArn"])))))))

(clojure.core/defn- response-describe-device-policy-configuration-response ([input] (response-describe-device-policy-configuration-response nil input)) ([resultWrapper1477367 input] (clojure.core/let [rawinput1477366 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477368 {"DeviceCaCertificate" (rawinput1477366 "DeviceCaCertificate")}] (clojure.core/cond-> {} (letvar1477368 "DeviceCaCertificate") (clojure.core/assoc :device-ca-certificate (deser-certificate (clojure.core/get-in letvar1477368 ["DeviceCaCertificate"])))))))

(clojure.core/defn- response-update-fleet-metadata-response ([input] (response-update-fleet-metadata-response nil input)) ([resultWrapper1477370 input] (clojure.core/let [rawinput1477369 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477371 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-website-certificate-authority-response ([input] (response-disassociate-website-certificate-authority-response nil input)) ([resultWrapper1477373 input] (clojure.core/let [rawinput1477372 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477374 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-audit-stream-configuration-response ([input] (response-describe-audit-stream-configuration-response nil input)) ([resultWrapper1477376 input] (clojure.core/let [rawinput1477375 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477377 {"AuditStreamArn" (rawinput1477375 "AuditStreamArn")}] (clojure.core/cond-> {} (letvar1477377 "AuditStreamArn") (clojure.core/assoc :audit-stream-arn (deser-audit-stream-arn (clojure.core/get-in letvar1477377 ["AuditStreamArn"])))))))

(clojure.core/defn- response-delete-fleet-response ([input] (response-delete-fleet-response nil input)) ([resultWrapper1477379 input] (clojure.core/let [rawinput1477378 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477380 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-devices-response ([input] (response-list-devices-response nil input)) ([resultWrapper1477382 input] (clojure.core/let [rawinput1477381 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477383 {"Devices" (rawinput1477381 "Devices"), "NextToken" (rawinput1477381 "NextToken")}] (clojure.core/cond-> {} (letvar1477383 "Devices") (clojure.core/assoc :devices (deser-device-summary-list (clojure.core/get-in letvar1477383 ["Devices"]))) (letvar1477383 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1477383 ["NextToken"])))))))

(clojure.core/defn- response-describe-identity-provider-configuration-response ([input] (response-describe-identity-provider-configuration-response nil input)) ([resultWrapper1477385 input] (clojure.core/let [rawinput1477384 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477386 {"IdentityProviderType" (rawinput1477384 "IdentityProviderType"), "ServiceProviderSamlMetadata" (rawinput1477384 "ServiceProviderSamlMetadata"), "IdentityProviderSamlMetadata" (rawinput1477384 "IdentityProviderSamlMetadata")}] (clojure.core/cond-> {} (letvar1477386 "IdentityProviderType") (clojure.core/assoc :identity-provider-type (deser-identity-provider-type (clojure.core/get-in letvar1477386 ["IdentityProviderType"]))) (letvar1477386 "ServiceProviderSamlMetadata") (clojure.core/assoc :service-provider-saml-metadata (deser-saml-metadata (clojure.core/get-in letvar1477386 ["ServiceProviderSamlMetadata"]))) (letvar1477386 "IdentityProviderSamlMetadata") (clojure.core/assoc :identity-provider-saml-metadata (deser-saml-metadata (clojure.core/get-in letvar1477386 ["IdentityProviderSamlMetadata"])))))))

(clojure.spec.alpha/def :portkey.aws.worklink/describe-identity-provider-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/username (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink/update-audit-stream-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.worklink/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.worklink/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink/device-operating-system-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.describe-fleet-metadata-response/created-time (clojure.spec.alpha/and :portkey.aws.worklink/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.describe-fleet-metadata-response/last-updated-time (clojure.spec.alpha/and :portkey.aws.worklink/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.describe-fleet-metadata-response/optimize-for-end-user-location (clojure.spec.alpha/and :portkey.aws.worklink/boolean))
(clojure.spec.alpha/def :portkey.aws.worklink/describe-fleet-metadata-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.describe-fleet-metadata-response/created-time :portkey.aws.worklink.describe-fleet-metadata-response/last-updated-time :portkey.aws.worklink/fleet-name :portkey.aws.worklink/display-name :portkey.aws.worklink.describe-fleet-metadata-response/optimize-for-end-user-location :portkey.aws.worklink/company-code :portkey.aws.worklink/fleet-status]))

(clojure.spec.alpha/def :portkey.aws.worklink/device-model (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink/describe-device-policy-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.worklink/subnet-id))

(clojure.spec.alpha/def :portkey.aws.worklink/website-ca-summary-list (clojure.spec.alpha/coll-of :portkey.aws.worklink/website-ca-summary))

(clojure.spec.alpha/def :portkey.aws.worklink.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.worklink/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.worklink/security-group-id))

(clojure.spec.alpha/def :portkey.aws.worklink/list-fleets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink/fleet-summary-list :portkey.aws.worklink/next-token]))

(clojure.spec.alpha/def :portkey.aws.worklink/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^subnet-([0-9a-f]{8}|[0-9a-f]{17})$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink/delete-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/sign-out-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn :portkey.aws.worklink/username] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/list-website-certificate-authorities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un [:portkey.aws.worklink/max-results :portkey.aws.worklink/next-token]))

(clojure.spec.alpha/def :portkey.aws.worklink.describe-device-request/device-id (clojure.spec.alpha/and :portkey.aws.worklink/id))
(clojure.spec.alpha/def :portkey.aws.worklink/describe-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn :portkey.aws.worklink.describe-device-request/device-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/describe-company-network-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink/vpc-id :portkey.aws.worklink/subnet-ids :portkey.aws.worklink/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.worklink.list-website-certificate-authorities-response/website-certificate-authorities (clojure.spec.alpha/and :portkey.aws.worklink/website-ca-summary-list))
(clojure.spec.alpha/def :portkey.aws.worklink/list-website-certificate-authorities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.list-website-certificate-authorities-response/website-certificate-authorities :portkey.aws.worklink/next-token]))

(clojure.spec.alpha/def :portkey.aws.worklink/sign-out-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/describe-company-network-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.disassociate-website-certificate-authority-request/website-ca-id (clojure.spec.alpha/and :portkey.aws.worklink/id))
(clojure.spec.alpha/def :portkey.aws.worklink/disassociate-website-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn :portkey.aws.worklink.disassociate-website-certificate-authority-request/website-ca-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.fleet-summary/created-time (clojure.spec.alpha/and :portkey.aws.worklink/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.fleet-summary/last-updated-time (clojure.spec.alpha/and :portkey.aws.worklink/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink/fleet-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink/fleet-arn :portkey.aws.worklink.fleet-summary/created-time :portkey.aws.worklink.fleet-summary/last-updated-time :portkey.aws.worklink/fleet-name :portkey.aws.worklink/display-name :portkey.aws.worklink/company-code :portkey.aws.worklink/fleet-status]))

(clojure.spec.alpha/def :portkey.aws.worklink.describe-website-certificate-authority-response/created-time (clojure.spec.alpha/and :portkey.aws.worklink/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink/describe-website-certificate-authority-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink/certificate :portkey.aws.worklink.describe-website-certificate-authority-response/created-time :portkey.aws.worklink/display-name]))

(clojure.spec.alpha/def :portkey.aws.worklink.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.worklink/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink/fleet-summary-list (clojure.spec.alpha/coll-of :portkey.aws.worklink/fleet-summary))

(clojure.spec.alpha/def :portkey.aws.worklink.describe-website-certificate-authority-request/website-ca-id (clojure.spec.alpha/and :portkey.aws.worklink/id))
(clojure.spec.alpha/def :portkey.aws.worklink/describe-website-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn :portkey.aws.worklink.describe-website-certificate-authority-request/website-ca-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/update-identity-provider-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/update-company-network-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink.update-device-policy-configuration-request/device-ca-certificate (clojure.spec.alpha/and :portkey.aws.worklink/certificate-chain))
(clojure.spec.alpha/def :portkey.aws.worklink/update-device-policy-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un [:portkey.aws.worklink.update-device-policy-configuration-request/device-ca-certificate]))

(clojure.spec.alpha/def :portkey.aws.worklink/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 4096)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[\w\-]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink.associate-website-certificate-authority-response/website-ca-id (clojure.spec.alpha/and :portkey.aws.worklink/id))
(clojure.spec.alpha/def :portkey.aws.worklink/associate-website-certificate-authority-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.associate-website-certificate-authority-response/website-ca-id]))

(clojure.spec.alpha/def :portkey.aws.worklink.website-ca-summary/website-ca-id (clojure.spec.alpha/and :portkey.aws.worklink/id))
(clojure.spec.alpha/def :portkey.aws.worklink.website-ca-summary/created-time (clojure.spec.alpha/and :portkey.aws.worklink/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink/website-ca-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.website-ca-summary/website-ca-id :portkey.aws.worklink.website-ca-summary/created-time :portkey.aws.worklink/display-name]))

(clojure.spec.alpha/def :portkey.aws.worklink.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.worklink/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink/update-audit-stream-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un [:portkey.aws.worklink/audit-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.worklink/update-company-network-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn :portkey.aws.worklink/vpc-id :portkey.aws.worklink/subnet-ids :portkey.aws.worklink/security-group-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.worklink/fleet-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 48)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[a-z0-9](?:[a-z0-9\-]{0,46}[a-z0-9])?$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink.describe-device-response/last-accessed-time (clojure.spec.alpha/and :portkey.aws.worklink/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.describe-device-response/manufacturer (clojure.spec.alpha/and :portkey.aws.worklink/device-manufacturer))
(clojure.spec.alpha/def :portkey.aws.worklink.describe-device-response/status (clojure.spec.alpha/and :portkey.aws.worklink/device-status))
(clojure.spec.alpha/def :portkey.aws.worklink.describe-device-response/first-accessed-time (clojure.spec.alpha/and :portkey.aws.worklink/date-time))
(clojure.spec.alpha/def :portkey.aws.worklink.describe-device-response/model (clojure.spec.alpha/and :portkey.aws.worklink/device-model))
(clojure.spec.alpha/def :portkey.aws.worklink.describe-device-response/operating-system-version (clojure.spec.alpha/and :portkey.aws.worklink/device-operating-system-version))
(clojure.spec.alpha/def :portkey.aws.worklink.describe-device-response/patch-level (clojure.spec.alpha/and :portkey.aws.worklink/device-patch-level))
(clojure.spec.alpha/def :portkey.aws.worklink.describe-device-response/operating-system (clojure.spec.alpha/and :portkey.aws.worklink/device-operating-system-name))
(clojure.spec.alpha/def :portkey.aws.worklink/describe-device-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink/username :portkey.aws.worklink.describe-device-response/last-accessed-time :portkey.aws.worklink.describe-device-response/manufacturer :portkey.aws.worklink.describe-device-response/status :portkey.aws.worklink.describe-device-response/first-accessed-time :portkey.aws.worklink.describe-device-response/model :portkey.aws.worklink.describe-device-response/operating-system-version :portkey.aws.worklink.describe-device-response/patch-level :portkey.aws.worklink.describe-device-response/operating-system]))

(clojure.spec.alpha/def :portkey.aws.worklink.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.worklink/exception-message))
(clojure.spec.alpha/def :portkey.aws.worklink/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.worklink/describe-fleet-metadata-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/update-device-policy-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/create-fleet-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink/fleet-arn]))

(clojure.spec.alpha/def :portkey.aws.worklink/certificate-chain (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 32768)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"(-{5}BEGIN CERTIFICATE-{5}\u000D?\u000A([A-Za-z0-9/+]{64}\u000D?\u000A)*[A-Za-z0-9/+]{1,64}={0,2}\u000D?\u000A-{5}END CERTIFICATE-{5}\u000D?\u000A)*-{5}BEGIN CERTIFICATE-{5}\u000D?\u000A([A-Za-z0-9/+]{64}\u000D?\u000A)*[A-Za-z0-9/+]{1,64}={0,2}\u000D?\u000A-{5}END CERTIFICATE-{5}(\u000D?\u000A)?" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink/security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^sg-([0-9a-f]{8}|[0-9a-f]{17})$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.worklink/device-status #{:active "ACTIVE" :signed-out "SIGNED_OUT"})

(clojure.spec.alpha/def :portkey.aws.worklink/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^vpc-([0-9a-f]{8}|[0-9a-f]{17})$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink.update-identity-provider-configuration-request/identity-provider-saml-metadata (clojure.spec.alpha/and :portkey.aws.worklink/saml-metadata))
(clojure.spec.alpha/def :portkey.aws.worklink/update-identity-provider-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn :portkey.aws.worklink/identity-provider-type] :opt-un [:portkey.aws.worklink.update-identity-provider-configuration-request/identity-provider-saml-metadata]))

(clojure.spec.alpha/def :portkey.aws.worklink/device-patch-level (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.device-summary/device-id (clojure.spec.alpha/and :portkey.aws.worklink/id))
(clojure.spec.alpha/def :portkey.aws.worklink/device-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.device-summary/device-id :portkey.aws.worklink/device-status]))

(clojure.spec.alpha/def :portkey.aws.worklink.update-fleet-metadata-request/optimize-for-end-user-location (clojure.spec.alpha/and :portkey.aws.worklink/boolean))
(clojure.spec.alpha/def :portkey.aws.worklink/update-fleet-metadata-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un [:portkey.aws.worklink/display-name :portkey.aws.worklink.update-fleet-metadata-request/optimize-for-end-user-location]))

(clojure.spec.alpha/def :portkey.aws.worklink/identity-provider-type #{"SAML" :saml})

(clojure.spec.alpha/def :portkey.aws.worklink/device-summary-list (clojure.spec.alpha/coll-of :portkey.aws.worklink/device-summary))

(clojure.spec.alpha/def :portkey.aws.worklink/describe-audit-stream-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/saml-metadata (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 204800))))

(clojure.spec.alpha/def :portkey.aws.worklink/audit-stream-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.worklink.describe-device-policy-configuration-response/device-ca-certificate (clojure.spec.alpha/and :portkey.aws.worklink/certificate))
(clojure.spec.alpha/def :portkey.aws.worklink/describe-device-policy-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.describe-device-policy-configuration-response/device-ca-certificate]))

(clojure.spec.alpha/def :portkey.aws.worklink/list-fleets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink/next-token :portkey.aws.worklink/max-results]))

(clojure.spec.alpha/def :portkey.aws.worklink/update-fleet-metadata-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.worklink/disassociate-website-certificate-authority-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/list-devices-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn] :opt-un [:portkey.aws.worklink/next-token :portkey.aws.worklink/max-results]))

(clojure.spec.alpha/def :portkey.aws.worklink/fleet-status #{:deleted :creating :deleting "FAILED_TO_DELETE" "FAILED_TO_CREATE" :active "DELETING" "CREATING" "ACTIVE" "DELETED" :failed-to-create :failed-to-delete})

(clojure.spec.alpha/def :portkey.aws.worklink.create-fleet-request/optimize-for-end-user-location (clojure.spec.alpha/and :portkey.aws.worklink/boolean))
(clojure.spec.alpha/def :portkey.aws.worklink/create-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-name] :opt-un [:portkey.aws.worklink/display-name :portkey.aws.worklink.create-fleet-request/optimize-for-end-user-location]))

(clojure.spec.alpha/def :portkey.aws.worklink/associate-website-certificate-authority-request (clojure.spec.alpha/keys :req-un [:portkey.aws.worklink/fleet-arn :portkey.aws.worklink/certificate] :opt-un [:portkey.aws.worklink/display-name]))

(clojure.spec.alpha/def :portkey.aws.worklink/device-operating-system-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink/certificate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 8192)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"-{5}BEGIN CERTIFICATE-{5}\u000D?\u000A([A-Za-z0-9/+]{64}\u000D?\u000A)*[A-Za-z0-9/+]{1,64}={0,2}\u000D?\u000A-{5}END CERTIFICATE-{5}(\u000D?\u000A)?" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.worklink/fleet-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 20 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.worklink/describe-audit-stream-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink/audit-stream-arn]))

(clojure.spec.alpha/def :portkey.aws.worklink/company-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.worklink/delete-fleet-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.worklink/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.list-devices-response/devices (clojure.spec.alpha/and :portkey.aws.worklink/device-summary-list))
(clojure.spec.alpha/def :portkey.aws.worklink/list-devices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink.list-devices-response/devices :portkey.aws.worklink/next-token]))

(clojure.spec.alpha/def :portkey.aws.worklink/device-manufacturer (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.worklink.describe-identity-provider-configuration-response/service-provider-saml-metadata (clojure.spec.alpha/and :portkey.aws.worklink/saml-metadata))
(clojure.spec.alpha/def :portkey.aws.worklink.describe-identity-provider-configuration-response/identity-provider-saml-metadata (clojure.spec.alpha/and :portkey.aws.worklink/saml-metadata))
(clojure.spec.alpha/def :portkey.aws.worklink/describe-identity-provider-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.worklink/identity-provider-type :portkey.aws.worklink.describe-identity-provider-configuration-response/service-provider-saml-metadata :portkey.aws.worklink.describe-identity-provider-configuration-response/identity-provider-saml-metadata]))

(clojure.spec.alpha/def :portkey.aws.worklink/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.worklink/boolean clojure.core/boolean?)

(clojure.core/defn list-website-certificate-authorities ([list-website-certificate-authorities-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-website-certificate-authorities-request list-website-certificate-authorities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/list-website-certificate-authorities-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listWebsiteCertificateAuthorities", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/list-website-certificate-authorities-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListWebsiteCertificateAuthorities", :http.request.configuration/output-deser-fn response-list-website-certificate-authorities-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-website-certificate-authorities :args (clojure.spec.alpha/tuple :portkey.aws.worklink/list-website-certificate-authorities-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/list-website-certificate-authorities-response))

(clojure.core/defn list-fleets ([] (list-fleets {})) ([list-fleets-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-fleets-request list-fleets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/list-fleets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listFleets", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/list-fleets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFleets", :http.request.configuration/output-deser-fn response-list-fleets-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-fleets :args (clojure.spec.alpha/? :portkey.aws.worklink/list-fleets-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/list-fleets-response))

(clojure.core/defn associate-website-certificate-authority ([associate-website-certificate-authority-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-associate-website-certificate-authority-request associate-website-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/associate-website-certificate-authority-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/associateWebsiteCertificateAuthority", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/associate-website-certificate-authority-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateWebsiteCertificateAuthority", :http.request.configuration/output-deser-fn response-associate-website-certificate-authority-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.worklink/resource-already-exists-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef associate-website-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.worklink/associate-website-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/associate-website-certificate-authority-response))

(clojure.core/defn create-fleet ([create-fleet-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-fleet-request create-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/create-fleet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createFleet", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/create-fleet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFleet", :http.request.configuration/output-deser-fn response-create-fleet-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.worklink/resource-already-exists-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-fleet :args (clojure.spec.alpha/tuple :portkey.aws.worklink/create-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/create-fleet-response))

(clojure.core/defn describe-website-certificate-authority ([describe-website-certificate-authority-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-website-certificate-authority-request describe-website-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/describe-website-certificate-authority-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeWebsiteCertificateAuthority", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/describe-website-certificate-authority-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWebsiteCertificateAuthority", :http.request.configuration/output-deser-fn response-describe-website-certificate-authority-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-website-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.worklink/describe-website-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/describe-website-certificate-authority-response))

(clojure.core/defn disassociate-website-certificate-authority ([disassociate-website-certificate-authority-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-disassociate-website-certificate-authority-request disassociate-website-certificate-authority-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/disassociate-website-certificate-authority-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/disassociateWebsiteCertificateAuthority", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/disassociate-website-certificate-authority-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateWebsiteCertificateAuthority", :http.request.configuration/output-deser-fn response-disassociate-website-certificate-authority-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef disassociate-website-certificate-authority :args (clojure.spec.alpha/tuple :portkey.aws.worklink/disassociate-website-certificate-authority-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/disassociate-website-certificate-authority-response))

(clojure.core/defn update-company-network-configuration ([update-company-network-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-company-network-configuration-request update-company-network-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/update-company-network-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateCompanyNetworkConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/update-company-network-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCompanyNetworkConfiguration", :http.request.configuration/output-deser-fn response-update-company-network-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-company-network-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink/update-company-network-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/update-company-network-configuration-response))

(clojure.core/defn update-identity-provider-configuration ([update-identity-provider-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-identity-provider-configuration-request update-identity-provider-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/update-identity-provider-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateIdentityProviderConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/update-identity-provider-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateIdentityProviderConfiguration", :http.request.configuration/output-deser-fn response-update-identity-provider-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-identity-provider-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink/update-identity-provider-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/update-identity-provider-configuration-response))

(clojure.core/defn update-fleet-metadata ([update-fleet-metadata-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-fleet-metadata-request update-fleet-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/update-fleet-metadata-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/UpdateFleetMetadata", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/update-fleet-metadata-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFleetMetadata", :http.request.configuration/output-deser-fn response-update-fleet-metadata-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-fleet-metadata :args (clojure.spec.alpha/tuple :portkey.aws.worklink/update-fleet-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/update-fleet-metadata-response))

(clojure.core/defn describe-fleet-metadata ([describe-fleet-metadata-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-fleet-metadata-request describe-fleet-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/describe-fleet-metadata-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeFleetMetadata", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/describe-fleet-metadata-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeFleetMetadata", :http.request.configuration/output-deser-fn response-describe-fleet-metadata-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-fleet-metadata :args (clojure.spec.alpha/tuple :portkey.aws.worklink/describe-fleet-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/describe-fleet-metadata-response))

(clojure.core/defn describe-company-network-configuration ([describe-company-network-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-company-network-configuration-request describe-company-network-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/describe-company-network-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeCompanyNetworkConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/describe-company-network-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCompanyNetworkConfiguration", :http.request.configuration/output-deser-fn response-describe-company-network-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-company-network-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink/describe-company-network-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/describe-company-network-configuration-response))

(clojure.core/defn sign-out-user ([sign-out-user-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-sign-out-user-request sign-out-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/sign-out-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signOutUser", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/sign-out-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SignOutUser", :http.request.configuration/output-deser-fn response-sign-out-user-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef sign-out-user :args (clojure.spec.alpha/tuple :portkey.aws.worklink/sign-out-user-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/sign-out-user-response))

(clojure.core/defn update-device-policy-configuration ([update-device-policy-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-device-policy-configuration-request update-device-policy-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/update-device-policy-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateDevicePolicyConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/update-device-policy-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDevicePolicyConfiguration", :http.request.configuration/output-deser-fn response-update-device-policy-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-device-policy-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink/update-device-policy-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/update-device-policy-configuration-response))

(clojure.core/defn update-audit-stream-configuration ([update-audit-stream-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-audit-stream-configuration-request update-audit-stream-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/update-audit-stream-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateAuditStreamConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/update-audit-stream-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAuditStreamConfiguration", :http.request.configuration/output-deser-fn response-update-audit-stream-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-audit-stream-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink/update-audit-stream-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/update-audit-stream-configuration-response))

(clojure.core/defn delete-fleet ([delete-fleet-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-fleet-request delete-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/delete-fleet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/deleteFleet", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/delete-fleet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFleet", :http.request.configuration/output-deser-fn response-delete-fleet-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-fleet :args (clojure.spec.alpha/tuple :portkey.aws.worklink/delete-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/delete-fleet-response))

(clojure.core/defn list-devices ([list-devices-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-devices-request list-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/list-devices-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listDevices", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/list-devices-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDevices", :http.request.configuration/output-deser-fn response-list-devices-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-devices :args (clojure.spec.alpha/tuple :portkey.aws.worklink/list-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/list-devices-response))

(clojure.core/defn describe-identity-provider-configuration ([describe-identity-provider-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-identity-provider-configuration-request describe-identity-provider-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/describe-identity-provider-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeIdentityProviderConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/describe-identity-provider-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeIdentityProviderConfiguration", :http.request.configuration/output-deser-fn response-describe-identity-provider-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-identity-provider-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink/describe-identity-provider-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/describe-identity-provider-configuration-response))

(clojure.core/defn describe-audit-stream-configuration ([describe-audit-stream-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-audit-stream-configuration-request describe-audit-stream-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/describe-audit-stream-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeAuditStreamConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/describe-audit-stream-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAuditStreamConfiguration", :http.request.configuration/output-deser-fn response-describe-audit-stream-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-audit-stream-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink/describe-audit-stream-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/describe-audit-stream-configuration-response))

(clojure.core/defn describe-device-policy-configuration ([describe-device-policy-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-device-policy-configuration-request describe-device-policy-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/describe-device-policy-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeDevicePolicyConfiguration", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/describe-device-policy-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDevicePolicyConfiguration", :http.request.configuration/output-deser-fn response-describe-device-policy-configuration-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-device-policy-configuration :args (clojure.spec.alpha/tuple :portkey.aws.worklink/describe-device-policy-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/describe-device-policy-configuration-response))

(clojure.core/defn describe-device ([describe-device-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-device-request describe-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.worklink/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.worklink/describe-device-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeDevice", :http.request.configuration/version "2018-09-25", :http.request.configuration/service-id "WorkLink", :http.request.spec/input-spec :portkey.aws.worklink/describe-device-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDevice", :http.request.configuration/output-deser-fn response-describe-device-response, :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.worklink/unauthorized-exception, "InternalServerErrorException" :portkey.aws.worklink/internal-server-error-exception, "InvalidRequestException" :portkey.aws.worklink/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.worklink/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.worklink/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-device :args (clojure.spec.alpha/tuple :portkey.aws.worklink/describe-device-request) :ret (clojure.spec.alpha/and :portkey.aws.worklink/describe-device-response))
