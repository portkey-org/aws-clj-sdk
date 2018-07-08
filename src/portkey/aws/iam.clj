(ns portkey.aws.iam (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "aws-cn-global"
   {:credential-scope {:service "iam", :region "cn-north-1"},
    :ssl-common-name "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "iam", :region "cn-north-1"},
    :ssl-common-name "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "iam", :region "cn-north-1"},
    :ssl-common-name "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "aws-us-gov-global"
   {:credential-scope {:service "iam", :region "us-gov-west-1"},
    :ssl-common-name "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "iam", :region "us-gov-west-1"},
    :ssl-common-name "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-context-entry-list-type ser-public-key-material-type ser-custom-suffix-type ser-path-prefix-type ser-marker-type ser-action-name-type ser-user-name-type ser-group-name-type ser-samlprovider-name-type ser-clientidtype ser-virtualmfadevice-name ser-context-entry ser-thumbprint-type ser-encoding-type ser-role-max-session-duration-type ser-account-alias-type ser-password-reuse-prevention-type ser-resource-handling-option-type ser-policy-version-id-type ser-context-key-value-type ser-instance-profile-name-type ser-simulation-policy-list-type ser-service-specific-credential-id ser-max-password-age-type ser-policy-scope-type ser-policy-document-type ser-action-name-list-type ser-boolean-type ser-resource-name-list-type ser-status-type ser-existing-user-name-type ser-openidconnect-provider-url-type ser-access-key-id-type ser-policy-description-type ser-service-name ser-context-key-value-list-type ser-resource-name-type ser-boolean-object-type ser-deletion-task-id-type ser-samlmetadata-document-type ser-policy-name-type ser-authentication-code-type ser-max-items-type ser-context-key-type-enum ser-assignment-status-type ser-clientidlist-type ser-certificate-body-type ser-certificate-chain-type ser-certificate-id-type ser-thumbprint-list-type ser-arn-type ser-context-key-name-type ser-private-key-type ser-server-certificate-name-type ser-serial-number-type ser-role-description-type ser-password-type ser-minimum-password-length-type ser-policy-path-type ser-entity-list-type ser-public-key-id-type ser-path-type ser-entity-type ser-role-name-type)

(clojure.core/defn- ser-context-entry-list-type [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-public-key-material-type [shape-input] shape-input)
(clojure.core/defn- ser-custom-suffix-type [shape-input] shape-input)
(clojure.core/defn- ser-path-prefix-type [shape-input] shape-input)
(clojure.core/defn- ser-marker-type [shape-input] shape-input)
(clojure.core/defn- ser-action-name-type [shape-input] shape-input)
(clojure.core/defn- ser-user-name-type [shape-input] shape-input)
(clojure.core/defn- ser-group-name-type [shape-input] shape-input)
(clojure.core/defn- ser-samlprovider-name-type [shape-input] shape-input)
(clojure.core/defn- ser-clientidtype [shape-input] shape-input)
(clojure.core/defn- ser-virtualmfadevice-name [shape-input] shape-input)
(clojure.core/defn- ser-context-entry [shape-input] (clojure.core/cond-> {} (:context-key-name shape-input) (clojure.core/assoc "ContextEntry.ContextKeyName" (ser-context-key-name-type (:context-key-name shape-input))) (:context-key-values shape-input) (clojure.core/assoc "ContextEntry.ContextKeyValues" (ser-context-key-value-list-type (:context-key-values shape-input))) (:context-key-type shape-input) (clojure.core/assoc "ContextEntry.ContextKeyType" (ser-context-key-type-enum (:context-key-type shape-input)))))
(clojure.core/defn- ser-thumbprint-type [shape-input] shape-input)
(clojure.core/defn- ser-encoding-type [shape-input] ({"SSH" "SSH", :ssh "SSH", "PEM" "PEM", :pem "PEM"} shape-input))
(clojure.core/defn- ser-role-max-session-duration-type [shape-input] shape-input)
(clojure.core/defn- ser-account-alias-type [shape-input] shape-input)
(clojure.core/defn- ser-password-reuse-prevention-type [shape-input] shape-input)
(clojure.core/defn- ser-resource-handling-option-type [shape-input] shape-input)
(clojure.core/defn- ser-policy-version-id-type [shape-input] shape-input)
(clojure.core/defn- ser-context-key-value-type [shape-input] shape-input)
(clojure.core/defn- ser-instance-profile-name-type [shape-input] shape-input)
(clojure.core/defn- ser-simulation-policy-list-type [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-service-specific-credential-id [shape-input] shape-input)
(clojure.core/defn- ser-max-password-age-type [shape-input] shape-input)
(clojure.core/defn- ser-policy-scope-type [shape-input] ({"All" "All", :all "All", "AWS" "AWS", :aws "AWS", "Local" "Local", :local "Local"} shape-input))
(clojure.core/defn- ser-policy-document-type [shape-input] shape-input)
(clojure.core/defn- ser-action-name-list-type [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-boolean-type [shape-input] shape-input)
(clojure.core/defn- ser-resource-name-list-type [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-status-type [shape-input] ({"Active" "Active", :active "Active", "Inactive" "Inactive", :inactive "Inactive"} shape-input))
(clojure.core/defn- ser-existing-user-name-type [shape-input] shape-input)
(clojure.core/defn- ser-openidconnect-provider-url-type [shape-input] shape-input)
(clojure.core/defn- ser-access-key-id-type [shape-input] shape-input)
(clojure.core/defn- ser-policy-description-type [shape-input] shape-input)
(clojure.core/defn- ser-service-name [shape-input] shape-input)
(clojure.core/defn- ser-context-key-value-list-type [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-resource-name-type [shape-input] shape-input)
(clojure.core/defn- ser-boolean-object-type [shape-input] shape-input)
(clojure.core/defn- ser-deletion-task-id-type [shape-input] shape-input)
(clojure.core/defn- ser-samlmetadata-document-type [shape-input] shape-input)
(clojure.core/defn- ser-policy-name-type [shape-input] shape-input)
(clojure.core/defn- ser-authentication-code-type [shape-input] shape-input)
(clojure.core/defn- ser-max-items-type [shape-input] shape-input)
(clojure.core/defn- ser-context-key-type-enum [shape-input] ({"boolean" "boolean", :binary "binary", :date-list "dateList", :numeric-list "numericList", "numeric" "numeric", :date "date", "booleanList" "booleanList", :boolean-list "booleanList", "string" "string", :ip "ip", "binaryList" "binaryList", :numeric "numeric", "ipList" "ipList", "binary" "binary", :string-list "stringList", :string "string", "numericList" "numericList", "ip" "ip", :ip-list "ipList", "dateList" "dateList", "date" "date", "stringList" "stringList", :binary-list "binaryList", :boolean "boolean"} shape-input))
(clojure.core/defn- ser-assignment-status-type [shape-input] ({"Assigned" "Assigned", :assigned "Assigned", "Unassigned" "Unassigned", :unassigned "Unassigned", "Any" "Any", :any "Any"} shape-input))
(clojure.core/defn- ser-clientidlist-type [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-certificate-body-type [shape-input] shape-input)
(clojure.core/defn- ser-certificate-chain-type [shape-input] shape-input)
(clojure.core/defn- ser-certificate-id-type [shape-input] shape-input)
(clojure.core/defn- ser-thumbprint-list-type [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-arn-type [shape-input] shape-input)
(clojure.core/defn- ser-context-key-name-type [shape-input] shape-input)
(clojure.core/defn- ser-private-key-type [shape-input] shape-input)
(clojure.core/defn- ser-server-certificate-name-type [shape-input] shape-input)
(clojure.core/defn- ser-serial-number-type [shape-input] shape-input)
(clojure.core/defn- ser-role-description-type [shape-input] shape-input)
(clojure.core/defn- ser-password-type [shape-input] shape-input)
(clojure.core/defn- ser-minimum-password-length-type [shape-input] shape-input)
(clojure.core/defn- ser-policy-path-type [shape-input] shape-input)
(clojure.core/defn- ser-entity-list-type [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-public-key-id-type [shape-input] shape-input)
(clojure.core/defn- ser-path-type [shape-input] shape-input)
(clojure.core/defn- ser-entity-type [shape-input] ({:role "Role", :awsmanaged-policy "AWSManagedPolicy", :local-managed-policy "LocalManagedPolicy", :group "Group", "LocalManagedPolicy" "LocalManagedPolicy", "User" "User", "Role" "Role", "AWSManagedPolicy" "AWSManagedPolicy", "Group" "Group", :user "User"} shape-input))
(clojure.core/defn- ser-role-name-type [shape-input] shape-input)

(clojure.core/defn req<-list-attached-user-policies-request [action-name55521 input55520] (clojure.core/let [input55522 {:body {"UserName" (ser-user-name-type (input55520 :user-name)), "Version" "2010-05-08", "Action" action-name55521}}] (clojure.core/cond-> input55522 (clojure.core/contains? input55520 :path-prefix) (clojure.core/assoc-in [:body "PathPrefix"] (ser-policy-path-type (input55520 :path-prefix))) (clojure.core/contains? input55520 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55520 :marker))) (clojure.core/contains? input55520 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55520 :max-items))))))
(clojure.core/defn req<-getsshpublic-key-request [action-name55524 input55523] {:body {"UserName" (ser-user-name-type (input55523 :user-name)), "SSHPublicKeyId" (ser-public-key-id-type (input55523 :sshpublic-key-id)), "Encoding" (ser-encoding-type (input55523 :encoding)), "Version" "2010-05-08", "Action" action-name55524}})
(clojure.core/defn req<-create-service-specific-credential-request [action-name55526 input55525] {:body {"UserName" (ser-user-name-type (input55525 :user-name)), "ServiceName" (ser-service-name (input55525 :service-name)), "Version" "2010-05-08", "Action" action-name55526}})
(clojure.core/defn req<-list-signing-certificates-request [action-name55528 input55527] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55528}} (clojure.core/contains? input55527 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-existing-user-name-type (input55527 :user-name))) (clojure.core/contains? input55527 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55527 :marker))) (clojure.core/contains? input55527 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55527 :max-items)))))
(clojure.core/defn req<-list-attached-group-policies-request [action-name55530 input55529] (clojure.core/let [input55531 {:body {"GroupName" (ser-group-name-type (input55529 :group-name)), "Version" "2010-05-08", "Action" action-name55530}}] (clojure.core/cond-> input55531 (clojure.core/contains? input55529 :path-prefix) (clojure.core/assoc-in [:body "PathPrefix"] (ser-policy-path-type (input55529 :path-prefix))) (clojure.core/contains? input55529 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55529 :marker))) (clojure.core/contains? input55529 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55529 :max-items))))))
(clojure.core/defn req<-detach-group-policy-request [action-name55533 input55532] {:body {"GroupName" (ser-group-name-type (input55532 :group-name)), "PolicyArn" (ser-arn-type (input55532 :policy-arn)), "Version" "2010-05-08", "Action" action-name55533}})
(clojure.core/defn req<-list-policy-versions-request [action-name55535 input55534] (clojure.core/let [input55536 {:body {"PolicyArn" (ser-arn-type (input55534 :policy-arn)), "Version" "2010-05-08", "Action" action-name55535}}] (clojure.core/cond-> input55536 (clojure.core/contains? input55534 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55534 :marker))) (clojure.core/contains? input55534 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55534 :max-items))))))
(clojure.core/defn req<-delete-policy-version-request [action-name55538 input55537] {:body {"PolicyArn" (ser-arn-type (input55537 :policy-arn)), "VersionId" (ser-policy-version-id-type (input55537 :version-id)), "Version" "2010-05-08", "Action" action-name55538}})
(clojure.core/defn req<-delete-account-alias-request [action-name55540 input55539] {:body {"AccountAlias" (ser-account-alias-type (input55539 :account-alias)), "Version" "2010-05-08", "Action" action-name55540}})
(clojure.core/defn req<-attach-role-policy-request [action-name55542 input55541] {:body {"RoleName" (ser-role-name-type (input55541 :role-name)), "PolicyArn" (ser-arn-type (input55541 :policy-arn)), "Version" "2010-05-08", "Action" action-name55542}})
(clojure.core/defn req<-delete-server-certificate-request [action-name55544 input55543] {:body {"ServerCertificateName" (ser-server-certificate-name-type (input55543 :server-certificate-name)), "Version" "2010-05-08", "Action" action-name55544}})
(clojure.core/defn req<-updatesamlprovider-request [action-name55546 input55545] {:body {"SAMLMetadataDocument" (ser-samlmetadata-document-type (input55545 :samlmetadata-document)), "SAMLProviderArn" (ser-arn-type (input55545 :samlprovider-arn)), "Version" "2010-05-08", "Action" action-name55546}})
(clojure.core/defn req<-delete-group-request [action-name55548 input55547] {:body {"GroupName" (ser-group-name-type (input55547 :group-name)), "Version" "2010-05-08", "Action" action-name55548}})
(clojure.core/defn req<-update-login-profile-request [action-name55550 input55549] (clojure.core/let [input55551 {:body {"UserName" (ser-user-name-type (input55549 :user-name)), "Version" "2010-05-08", "Action" action-name55550}}] (clojure.core/cond-> input55551 (clojure.core/contains? input55549 :password) (clojure.core/assoc-in [:body "Password"] (ser-password-type (input55549 :password))) (clojure.core/contains? input55549 :password-reset-required) (clojure.core/assoc-in [:body "PasswordResetRequired"] (ser-boolean-object-type (input55549 :password-reset-required))))))
(clojure.core/defn req<-update-account-password-policy-request [action-name55553 input55552] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55553}} (clojure.core/contains? input55552 :minimum-password-length) (clojure.core/assoc-in [:body "MinimumPasswordLength"] (ser-minimum-password-length-type (input55552 :minimum-password-length))) (clojure.core/contains? input55552 :require-numbers) (clojure.core/assoc-in [:body "RequireNumbers"] (ser-boolean-type (input55552 :require-numbers))) (clojure.core/contains? input55552 :require-uppercase-characters) (clojure.core/assoc-in [:body "RequireUppercaseCharacters"] (ser-boolean-type (input55552 :require-uppercase-characters))) (clojure.core/contains? input55552 :hard-expiry) (clojure.core/assoc-in [:body "HardExpiry"] (ser-boolean-object-type (input55552 :hard-expiry))) (clojure.core/contains? input55552 :require-lowercase-characters) (clojure.core/assoc-in [:body "RequireLowercaseCharacters"] (ser-boolean-type (input55552 :require-lowercase-characters))) (clojure.core/contains? input55552 :require-symbols) (clojure.core/assoc-in [:body "RequireSymbols"] (ser-boolean-type (input55552 :require-symbols))) (clojure.core/contains? input55552 :allow-users-to-change-password) (clojure.core/assoc-in [:body "AllowUsersToChangePassword"] (ser-boolean-type (input55552 :allow-users-to-change-password))) (clojure.core/contains? input55552 :max-password-age) (clojure.core/assoc-in [:body "MaxPasswordAge"] (ser-max-password-age-type (input55552 :max-password-age))) (clojure.core/contains? input55552 :password-reuse-prevention) (clojure.core/assoc-in [:body "PasswordReusePrevention"] (ser-password-reuse-prevention-type (input55552 :password-reuse-prevention)))))
(clojure.core/defn req<-deactivatemfadevice-request [action-name55555 input55554] {:body {"UserName" (ser-existing-user-name-type (input55554 :user-name)), "SerialNumber" (ser-serial-number-type (input55554 :serial-number)), "Version" "2010-05-08", "Action" action-name55555}})
(clojure.core/defn req<-get-policy-version-request [action-name55557 input55556] {:body {"PolicyArn" (ser-arn-type (input55556 :policy-arn)), "VersionId" (ser-policy-version-id-type (input55556 :version-id)), "Version" "2010-05-08", "Action" action-name55557}})
(clojure.core/defn req<-update-access-key-request [action-name55559 input55558] (clojure.core/let [input55560 {:body {"AccessKeyId" (ser-access-key-id-type (input55558 :access-key-id)), "Status" (ser-status-type (input55558 :status)), "Version" "2010-05-08", "Action" action-name55559}}] (clojure.core/cond-> input55560 (clojure.core/contains? input55558 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-existing-user-name-type (input55558 :user-name))))))
(clojure.core/defn req<-delete-login-profile-request [action-name55562 input55561] {:body {"UserName" (ser-user-name-type (input55561 :user-name)), "Version" "2010-05-08", "Action" action-name55562}})
(clojure.core/defn req<-get-login-profile-request [action-name55564 input55563] {:body {"UserName" (ser-user-name-type (input55563 :user-name)), "Version" "2010-05-08", "Action" action-name55564}})
(clojure.core/defn req<-update-openidconnect-provider-thumbprint-request [action-name55566 input55565] {:body {"OpenIDConnectProviderArn" (ser-arn-type (input55565 :openidconnect-provider-arn)), "ThumbprintList" (ser-thumbprint-list-type (input55565 :thumbprint-list)), "Version" "2010-05-08", "Action" action-name55566}})
(clojure.core/defn req<-delete-service-specific-credential-request [action-name55568 input55567] (clojure.core/let [input55569 {:body {"ServiceSpecificCredentialId" (ser-service-specific-credential-id (input55567 :service-specific-credential-id)), "Version" "2010-05-08", "Action" action-name55568}}] (clojure.core/cond-> input55569 (clojure.core/contains? input55567 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-user-name-type (input55567 :user-name))))))
(clojure.core/defn req<-list-groups-for-user-request [action-name55571 input55570] (clojure.core/let [input55572 {:body {"UserName" (ser-existing-user-name-type (input55570 :user-name)), "Version" "2010-05-08", "Action" action-name55571}}] (clojure.core/cond-> input55572 (clojure.core/contains? input55570 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55570 :marker))) (clojure.core/contains? input55570 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55570 :max-items))))))
(clojure.core/defn req<-uploadsshpublic-key-request [action-name55574 input55573] {:body {"UserName" (ser-user-name-type (input55573 :user-name)), "SSHPublicKeyBody" (ser-public-key-material-type (input55573 :sshpublic-key-body)), "Version" "2010-05-08", "Action" action-name55574}})
(clojure.core/defn req<-list-group-policies-request [action-name55576 input55575] (clojure.core/let [input55577 {:body {"GroupName" (ser-group-name-type (input55575 :group-name)), "Version" "2010-05-08", "Action" action-name55576}}] (clojure.core/cond-> input55577 (clojure.core/contains? input55575 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55575 :marker))) (clojure.core/contains? input55575 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55575 :max-items))))))
(clojure.core/defn req<-delete-role-request [action-name55579 input55578] {:body {"RoleName" (ser-role-name-type (input55578 :role-name)), "Version" "2010-05-08", "Action" action-name55579}})
(clojure.core/defn req<-delete-instance-profile-request [action-name55581 input55580] {:body {"InstanceProfileName" (ser-instance-profile-name-type (input55580 :instance-profile-name)), "Version" "2010-05-08", "Action" action-name55581}})
(clojure.core/defn req<-list-groups-request [action-name55583 input55582] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55583}} (clojure.core/contains? input55582 :path-prefix) (clojure.core/assoc-in [:body "PathPrefix"] (ser-path-prefix-type (input55582 :path-prefix))) (clojure.core/contains? input55582 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55582 :marker))) (clojure.core/contains? input55582 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55582 :max-items)))))
(clojure.core/defn req<-listsamlproviders-request [action-name55585 input55584] nil)
(clojure.core/defn req<-deletesamlprovider-request [action-name55587 input55586] {:body {"SAMLProviderArn" (ser-arn-type (input55586 :samlprovider-arn)), "Version" "2010-05-08", "Action" action-name55587}})
(clojure.core/defn req<-getsamlprovider-request [action-name55589 input55588] {:body {"SAMLProviderArn" (ser-arn-type (input55588 :samlprovider-arn)), "Version" "2010-05-08", "Action" action-name55589}})
(clojure.core/defn req<-update-assume-role-policy-request [action-name55591 input55590] {:body {"RoleName" (ser-role-name-type (input55590 :role-name)), "PolicyDocument" (ser-policy-document-type (input55590 :policy-document)), "Version" "2010-05-08", "Action" action-name55591}})
(clojure.core/defn req<-list-roles-request [action-name55593 input55592] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55593}} (clojure.core/contains? input55592 :path-prefix) (clojure.core/assoc-in [:body "PathPrefix"] (ser-path-prefix-type (input55592 :path-prefix))) (clojure.core/contains? input55592 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55592 :marker))) (clojure.core/contains? input55592 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55592 :max-items)))))
(clojure.core/defn req<-list-policies-request [action-name55595 input55594] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55595}} (clojure.core/contains? input55594 :scope) (clojure.core/assoc-in [:body "Scope"] (ser-policy-scope-type (input55594 :scope))) (clojure.core/contains? input55594 :only-attached) (clojure.core/assoc-in [:body "OnlyAttached"] (ser-boolean-type (input55594 :only-attached))) (clojure.core/contains? input55594 :path-prefix) (clojure.core/assoc-in [:body "PathPrefix"] (ser-policy-path-type (input55594 :path-prefix))) (clojure.core/contains? input55594 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55594 :marker))) (clojure.core/contains? input55594 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55594 :max-items)))))
(clojure.core/defn req<-attach-group-policy-request [action-name55597 input55596] {:body {"GroupName" (ser-group-name-type (input55596 :group-name)), "PolicyArn" (ser-arn-type (input55596 :policy-arn)), "Version" "2010-05-08", "Action" action-name55597}})
(clojure.core/defn req<-get-openidconnect-provider-request [action-name55599 input55598] {:body {"OpenIDConnectProviderArn" (ser-arn-type (input55598 :openidconnect-provider-arn)), "Version" "2010-05-08", "Action" action-name55599}})
(clojure.core/defn req<-get-access-key-last-used-request [action-name55601 input55600] {:body {"AccessKeyId" (ser-access-key-id-type (input55600 :access-key-id)), "Version" "2010-05-08", "Action" action-name55601}})
(clojure.core/defn req<-list-service-specific-credentials-request [action-name55603 input55602] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55603}} (clojure.core/contains? input55602 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-user-name-type (input55602 :user-name))) (clojure.core/contains? input55602 :service-name) (clojure.core/assoc-in [:body "ServiceName"] (ser-service-name (input55602 :service-name)))))
(clojure.core/defn req<-get-role-policy-request [action-name55605 input55604] {:body {"RoleName" (ser-role-name-type (input55604 :role-name)), "PolicyName" (ser-policy-name-type (input55604 :policy-name)), "Version" "2010-05-08", "Action" action-name55605}})
(clojure.core/defn req<-remove-clientidfrom-openidconnect-provider-request [action-name55607 input55606] {:body {"OpenIDConnectProviderArn" (ser-arn-type (input55606 :openidconnect-provider-arn)), "ClientID" (ser-clientidtype (input55606 :clientid)), "Version" "2010-05-08", "Action" action-name55607}})
(clojure.core/defn req<-get-context-keys-for-custom-policy-request [action-name55609 input55608] {:body {"PolicyInputList" (ser-simulation-policy-list-type (input55608 :policy-input-list)), "Version" "2010-05-08", "Action" action-name55609}})
(clojure.core/defn req<-list-instance-profiles-request [action-name55611 input55610] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55611}} (clojure.core/contains? input55610 :path-prefix) (clojure.core/assoc-in [:body "PathPrefix"] (ser-path-prefix-type (input55610 :path-prefix))) (clojure.core/contains? input55610 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55610 :marker))) (clojure.core/contains? input55610 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55610 :max-items)))))
(clojure.core/defn req<-upload-server-certificate-request [action-name55613 input55612] (clojure.core/let [input55614 {:body {"ServerCertificateName" (ser-server-certificate-name-type (input55612 :server-certificate-name)), "CertificateBody" (ser-certificate-body-type (input55612 :certificate-body)), "PrivateKey" (ser-private-key-type (input55612 :private-key)), "Version" "2010-05-08", "Action" action-name55613}}] (clojure.core/cond-> input55614 (clojure.core/contains? input55612 :path) (clojure.core/assoc-in [:body "Path"] (ser-path-type (input55612 :path))) (clojure.core/contains? input55612 :certificate-chain) (clojure.core/assoc-in [:body "CertificateChain"] (ser-certificate-chain-type (input55612 :certificate-chain))))))
(clojure.core/defn req<-get-service-linked-role-deletion-status-request [action-name55616 input55615] {:body {"DeletionTaskId" (ser-deletion-task-id-type (input55615 :deletion-task-id)), "Version" "2010-05-08", "Action" action-name55616}})
(clojure.core/defn req<-delete-signing-certificate-request [action-name55618 input55617] (clojure.core/let [input55619 {:body {"CertificateId" (ser-certificate-id-type (input55617 :certificate-id)), "Version" "2010-05-08", "Action" action-name55618}}] (clojure.core/cond-> input55619 (clojure.core/contains? input55617 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-existing-user-name-type (input55617 :user-name))))))
(clojure.core/defn req<-add-role-to-instance-profile-request [action-name55621 input55620] {:body {"InstanceProfileName" (ser-instance-profile-name-type (input55620 :instance-profile-name)), "RoleName" (ser-role-name-type (input55620 :role-name)), "Version" "2010-05-08", "Action" action-name55621}})
(clojure.core/defn req<-create-instance-profile-request [action-name55623 input55622] (clojure.core/let [input55624 {:body {"InstanceProfileName" (ser-instance-profile-name-type (input55622 :instance-profile-name)), "Version" "2010-05-08", "Action" action-name55623}}] (clojure.core/cond-> input55624 (clojure.core/contains? input55622 :path) (clojure.core/assoc-in [:body "Path"] (ser-path-type (input55622 :path))))))
(clojure.core/defn req<-detach-role-policy-request [action-name55626 input55625] {:body {"RoleName" (ser-role-name-type (input55625 :role-name)), "PolicyArn" (ser-arn-type (input55625 :policy-arn)), "Version" "2010-05-08", "Action" action-name55626}})
(clojure.core/defn req<-list-instance-profiles-for-role-request [action-name55628 input55627] (clojure.core/let [input55629 {:body {"RoleName" (ser-role-name-type (input55627 :role-name)), "Version" "2010-05-08", "Action" action-name55628}}] (clojure.core/cond-> input55629 (clojure.core/contains? input55627 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55627 :marker))) (clojure.core/contains? input55627 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55627 :max-items))))))
(clojure.core/defn req<-upload-signing-certificate-request [action-name55631 input55630] (clojure.core/let [input55632 {:body {"CertificateBody" (ser-certificate-body-type (input55630 :certificate-body)), "Version" "2010-05-08", "Action" action-name55631}}] (clojure.core/cond-> input55632 (clojure.core/contains? input55630 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-existing-user-name-type (input55630 :user-name))))))
(clojure.core/defn req<-update-service-specific-credential-request [action-name55634 input55633] (clojure.core/let [input55635 {:body {"ServiceSpecificCredentialId" (ser-service-specific-credential-id (input55633 :service-specific-credential-id)), "Status" (ser-status-type (input55633 :status)), "Version" "2010-05-08", "Action" action-name55634}}] (clojure.core/cond-> input55635 (clojure.core/contains? input55633 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-user-name-type (input55633 :user-name))))))
(clojure.core/defn req<-create-policy-version-request [action-name55637 input55636] (clojure.core/let [input55638 {:body {"PolicyArn" (ser-arn-type (input55636 :policy-arn)), "PolicyDocument" (ser-policy-document-type (input55636 :policy-document)), "Version" "2010-05-08", "Action" action-name55637}}] (clojure.core/cond-> input55638 (clojure.core/contains? input55636 :set-as-default) (clojure.core/assoc-in [:body "SetAsDefault"] (ser-boolean-type (input55636 :set-as-default))))))
(clojure.core/defn req<-get-context-keys-for-principal-policy-request [action-name55640 input55639] (clojure.core/let [input55641 {:body {"PolicySourceArn" (ser-arn-type (input55639 :policy-source-arn)), "Version" "2010-05-08", "Action" action-name55640}}] (clojure.core/cond-> input55641 (clojure.core/contains? input55639 :policy-input-list) (clojure.core/assoc-in [:body "PolicyInputList"] (ser-simulation-policy-list-type (input55639 :policy-input-list))))))
(clojure.core/defn req<-resyncmfadevice-request [action-name55643 input55642] {:body {"UserName" (ser-existing-user-name-type (input55642 :user-name)), "SerialNumber" (ser-serial-number-type (input55642 :serial-number)), "AuthenticationCode1" (ser-authentication-code-type (input55642 :authentication-code1)), "AuthenticationCode2" (ser-authentication-code-type (input55642 :authentication-code2)), "Version" "2010-05-08", "Action" action-name55643}})
(clojure.core/defn req<-get-group-request [action-name55645 input55644] (clojure.core/let [input55646 {:body {"GroupName" (ser-group-name-type (input55644 :group-name)), "Version" "2010-05-08", "Action" action-name55645}}] (clojure.core/cond-> input55646 (clojure.core/contains? input55644 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55644 :marker))) (clojure.core/contains? input55644 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55644 :max-items))))))
(clojure.core/defn req<-update-group-request [action-name55648 input55647] (clojure.core/let [input55649 {:body {"GroupName" (ser-group-name-type (input55647 :group-name)), "Version" "2010-05-08", "Action" action-name55648}}] (clojure.core/cond-> input55649 (clojure.core/contains? input55647 :new-path) (clojure.core/assoc-in [:body "NewPath"] (ser-path-type (input55647 :new-path))) (clojure.core/contains? input55647 :new-group-name) (clojure.core/assoc-in [:body "NewGroupName"] (ser-group-name-type (input55647 :new-group-name))))))
(clojure.core/defn req<-create-role-request [action-name55651 input55650] (clojure.core/let [input55652 {:body {"RoleName" (ser-role-name-type (input55650 :role-name)), "AssumeRolePolicyDocument" (ser-policy-document-type (input55650 :assume-role-policy-document)), "Version" "2010-05-08", "Action" action-name55651}}] (clojure.core/cond-> input55652 (clojure.core/contains? input55650 :path) (clojure.core/assoc-in [:body "Path"] (ser-path-type (input55650 :path))) (clojure.core/contains? input55650 :description) (clojure.core/assoc-in [:body "Description"] (ser-role-description-type (input55650 :description))) (clojure.core/contains? input55650 :max-session-duration) (clojure.core/assoc-in [:body "MaxSessionDuration"] (ser-role-max-session-duration-type (input55650 :max-session-duration))))))
(clojure.core/defn req<-delete-user-request [action-name55654 input55653] {:body {"UserName" (ser-existing-user-name-type (input55653 :user-name)), "Version" "2010-05-08", "Action" action-name55654}})
(clojure.core/defn req<-create-user-request [action-name55656 input55655] (clojure.core/let [input55657 {:body {"UserName" (ser-user-name-type (input55655 :user-name)), "Version" "2010-05-08", "Action" action-name55656}}] (clojure.core/cond-> input55657 (clojure.core/contains? input55655 :path) (clojure.core/assoc-in [:body "Path"] (ser-path-type (input55655 :path))))))
(clojure.core/defn req<-get-policy-request [action-name55659 input55658] {:body {"PolicyArn" (ser-arn-type (input55658 :policy-arn)), "Version" "2010-05-08", "Action" action-name55659}})
(clojure.core/defn req<-enablemfadevice-request [action-name55661 input55660] {:body {"UserName" (ser-existing-user-name-type (input55660 :user-name)), "SerialNumber" (ser-serial-number-type (input55660 :serial-number)), "AuthenticationCode1" (ser-authentication-code-type (input55660 :authentication-code1)), "AuthenticationCode2" (ser-authentication-code-type (input55660 :authentication-code2)), "Version" "2010-05-08", "Action" action-name55661}})
(clojure.core/defn req<-put-role-policy-request [action-name55663 input55662] {:body {"RoleName" (ser-role-name-type (input55662 :role-name)), "PolicyName" (ser-policy-name-type (input55662 :policy-name)), "PolicyDocument" (ser-policy-document-type (input55662 :policy-document)), "Version" "2010-05-08", "Action" action-name55663}})
(clojure.core/defn req<-listmfadevices-request [action-name55665 input55664] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55665}} (clojure.core/contains? input55664 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-existing-user-name-type (input55664 :user-name))) (clojure.core/contains? input55664 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55664 :marker))) (clojure.core/contains? input55664 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55664 :max-items)))))
(clojure.core/defn req<-create-service-linked-role-request [action-name55667 input55666] (clojure.core/let [input55668 {:body {"AWSServiceName" (ser-group-name-type (input55666 :awsservice-name)), "Version" "2010-05-08", "Action" action-name55667}}] (clojure.core/cond-> input55668 (clojure.core/contains? input55666 :description) (clojure.core/assoc-in [:body "Description"] (ser-role-description-type (input55666 :description))) (clojure.core/contains? input55666 :custom-suffix) (clojure.core/assoc-in [:body "CustomSuffix"] (ser-custom-suffix-type (input55666 :custom-suffix))))))
(clojure.core/defn req<-detach-user-policy-request [action-name55670 input55669] {:body {"UserName" (ser-user-name-type (input55669 :user-name)), "PolicyArn" (ser-arn-type (input55669 :policy-arn)), "Version" "2010-05-08", "Action" action-name55670}})
(clojure.core/defn req<-put-user-policy-request [action-name55672 input55671] {:body {"UserName" (ser-existing-user-name-type (input55671 :user-name)), "PolicyName" (ser-policy-name-type (input55671 :policy-name)), "PolicyDocument" (ser-policy-document-type (input55671 :policy-document)), "Version" "2010-05-08", "Action" action-name55672}})
(clojure.core/defn req<-update-signing-certificate-request [action-name55674 input55673] (clojure.core/let [input55675 {:body {"CertificateId" (ser-certificate-id-type (input55673 :certificate-id)), "Status" (ser-status-type (input55673 :status)), "Version" "2010-05-08", "Action" action-name55674}}] (clojure.core/cond-> input55675 (clojure.core/contains? input55673 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-existing-user-name-type (input55673 :user-name))))))
(clojure.core/defn req<-get-user-policy-request [action-name55677 input55676] {:body {"UserName" (ser-existing-user-name-type (input55676 :user-name)), "PolicyName" (ser-policy-name-type (input55676 :policy-name)), "Version" "2010-05-08", "Action" action-name55677}})
(clojure.core/defn req<-create-access-key-request [action-name55679 input55678] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55679}} (clojure.core/contains? input55678 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-existing-user-name-type (input55678 :user-name)))))
(clojure.core/defn req<-add-clientidto-openidconnect-provider-request [action-name55681 input55680] {:body {"OpenIDConnectProviderArn" (ser-arn-type (input55680 :openidconnect-provider-arn)), "ClientID" (ser-clientidtype (input55680 :clientid)), "Version" "2010-05-08", "Action" action-name55681}})
(clojure.core/defn req<-createsamlprovider-request [action-name55683 input55682] {:body {"SAMLMetadataDocument" (ser-samlmetadata-document-type (input55682 :samlmetadata-document)), "Name" (ser-samlprovider-name-type (input55682 :name)), "Version" "2010-05-08", "Action" action-name55683}})
(clojure.core/defn req<-delete-openidconnect-provider-request [action-name55685 input55684] {:body {"OpenIDConnectProviderArn" (ser-arn-type (input55684 :openidconnect-provider-arn)), "Version" "2010-05-08", "Action" action-name55685}})
(clojure.core/defn req<-reset-service-specific-credential-request [action-name55687 input55686] (clojure.core/let [input55688 {:body {"ServiceSpecificCredentialId" (ser-service-specific-credential-id (input55686 :service-specific-credential-id)), "Version" "2010-05-08", "Action" action-name55687}}] (clojure.core/cond-> input55688 (clojure.core/contains? input55686 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-user-name-type (input55686 :user-name))))))
(clojure.core/defn req<-list-entities-for-policy-request [action-name55690 input55689] (clojure.core/let [input55691 {:body {"PolicyArn" (ser-arn-type (input55689 :policy-arn)), "Version" "2010-05-08", "Action" action-name55690}}] (clojure.core/cond-> input55691 (clojure.core/contains? input55689 :entity-filter) (clojure.core/assoc-in [:body "EntityFilter"] (ser-entity-type (input55689 :entity-filter))) (clojure.core/contains? input55689 :path-prefix) (clojure.core/assoc-in [:body "PathPrefix"] (ser-path-type (input55689 :path-prefix))) (clojure.core/contains? input55689 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55689 :marker))) (clojure.core/contains? input55689 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55689 :max-items))))))
(clojure.core/defn req<-deletesshpublic-key-request [action-name55693 input55692] {:body {"UserName" (ser-user-name-type (input55692 :user-name)), "SSHPublicKeyId" (ser-public-key-id-type (input55692 :sshpublic-key-id)), "Version" "2010-05-08", "Action" action-name55693}})
(clojure.core/defn req<-delete-role-policy-request [action-name55695 input55694] {:body {"RoleName" (ser-role-name-type (input55694 :role-name)), "PolicyName" (ser-policy-name-type (input55694 :policy-name)), "Version" "2010-05-08", "Action" action-name55695}})
(clojure.core/defn req<-change-password-request [action-name55697 input55696] {:body {"OldPassword" (ser-password-type (input55696 :old-password)), "NewPassword" (ser-password-type (input55696 :new-password)), "Version" "2010-05-08", "Action" action-name55697}})
(clojure.core/defn req<-updatesshpublic-key-request [action-name55699 input55698] {:body {"UserName" (ser-user-name-type (input55698 :user-name)), "SSHPublicKeyId" (ser-public-key-id-type (input55698 :sshpublic-key-id)), "Status" (ser-status-type (input55698 :status)), "Version" "2010-05-08", "Action" action-name55699}})
(clojure.core/defn req<-remove-role-from-instance-profile-request [action-name55701 input55700] {:body {"InstanceProfileName" (ser-instance-profile-name-type (input55700 :instance-profile-name)), "RoleName" (ser-role-name-type (input55700 :role-name)), "Version" "2010-05-08", "Action" action-name55701}})
(clojure.core/defn req<-get-server-certificate-request [action-name55703 input55702] {:body {"ServerCertificateName" (ser-server-certificate-name-type (input55702 :server-certificate-name)), "Version" "2010-05-08", "Action" action-name55703}})
(clojure.core/defn req<-list-attached-role-policies-request [action-name55705 input55704] (clojure.core/let [input55706 {:body {"RoleName" (ser-role-name-type (input55704 :role-name)), "Version" "2010-05-08", "Action" action-name55705}}] (clojure.core/cond-> input55706 (clojure.core/contains? input55704 :path-prefix) (clojure.core/assoc-in [:body "PathPrefix"] (ser-policy-path-type (input55704 :path-prefix))) (clojure.core/contains? input55704 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55704 :marker))) (clojure.core/contains? input55704 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55704 :max-items))))))
(clojure.core/defn req<-set-default-policy-version-request [action-name55708 input55707] {:body {"PolicyArn" (ser-arn-type (input55707 :policy-arn)), "VersionId" (ser-policy-version-id-type (input55707 :version-id)), "Version" "2010-05-08", "Action" action-name55708}})
(clojure.core/defn req<-list-openidconnect-providers-request [action-name55710 input55709] nil)
(clojure.core/defn req<-list-access-keys-request [action-name55712 input55711] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55712}} (clojure.core/contains? input55711 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-existing-user-name-type (input55711 :user-name))) (clojure.core/contains? input55711 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55711 :marker))) (clojure.core/contains? input55711 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55711 :max-items)))))
(clojure.core/defn req<-delete-virtualmfadevice-request [action-name55714 input55713] {:body {"SerialNumber" (ser-serial-number-type (input55713 :serial-number)), "Version" "2010-05-08", "Action" action-name55714}})
(clojure.core/defn req<-get-group-policy-request [action-name55716 input55715] {:body {"GroupName" (ser-group-name-type (input55715 :group-name)), "PolicyName" (ser-policy-name-type (input55715 :policy-name)), "Version" "2010-05-08", "Action" action-name55716}})
(clojure.core/defn req<-create-policy-request [action-name55718 input55717] (clojure.core/let [input55719 {:body {"PolicyName" (ser-policy-name-type (input55717 :policy-name)), "PolicyDocument" (ser-policy-document-type (input55717 :policy-document)), "Version" "2010-05-08", "Action" action-name55718}}] (clojure.core/cond-> input55719 (clojure.core/contains? input55717 :path) (clojure.core/assoc-in [:body "Path"] (ser-policy-path-type (input55717 :path))) (clojure.core/contains? input55717 :description) (clojure.core/assoc-in [:body "Description"] (ser-policy-description-type (input55717 :description))))))
(clojure.core/defn req<-list-users-request [action-name55721 input55720] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55721}} (clojure.core/contains? input55720 :path-prefix) (clojure.core/assoc-in [:body "PathPrefix"] (ser-path-prefix-type (input55720 :path-prefix))) (clojure.core/contains? input55720 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55720 :marker))) (clojure.core/contains? input55720 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55720 :max-items)))))
(clojure.core/defn req<-list-role-policies-request [action-name55723 input55722] (clojure.core/let [input55724 {:body {"RoleName" (ser-role-name-type (input55722 :role-name)), "Version" "2010-05-08", "Action" action-name55723}}] (clojure.core/cond-> input55724 (clojure.core/contains? input55722 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55722 :marker))) (clojure.core/contains? input55722 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55722 :max-items))))))
(clojure.core/defn req<-delete-user-policy-request [action-name55726 input55725] {:body {"UserName" (ser-existing-user-name-type (input55725 :user-name)), "PolicyName" (ser-policy-name-type (input55725 :policy-name)), "Version" "2010-05-08", "Action" action-name55726}})
(clojure.core/defn req<-create-account-alias-request [action-name55728 input55727] {:body {"AccountAlias" (ser-account-alias-type (input55727 :account-alias)), "Version" "2010-05-08", "Action" action-name55728}})
(clojure.core/defn req<-delete-service-linked-role-request [action-name55730 input55729] {:body {"RoleName" (ser-role-name-type (input55729 :role-name)), "Version" "2010-05-08", "Action" action-name55730}})
(clojure.core/defn req<-update-server-certificate-request [action-name55732 input55731] (clojure.core/let [input55733 {:body {"ServerCertificateName" (ser-server-certificate-name-type (input55731 :server-certificate-name)), "Version" "2010-05-08", "Action" action-name55732}}] (clojure.core/cond-> input55733 (clojure.core/contains? input55731 :new-path) (clojure.core/assoc-in [:body "NewPath"] (ser-path-type (input55731 :new-path))) (clojure.core/contains? input55731 :new-server-certificate-name) (clojure.core/assoc-in [:body "NewServerCertificateName"] (ser-server-certificate-name-type (input55731 :new-server-certificate-name))))))
(clojure.core/defn req<-simulate-principal-policy-request [action-name55735 input55734] (clojure.core/let [input55736 {:body {"PolicySourceArn" (ser-arn-type (input55734 :policy-source-arn)), "ActionNames" (ser-action-name-list-type (input55734 :action-names)), "Version" "2010-05-08", "Action" action-name55735}}] (clojure.core/cond-> input55736 (clojure.core/contains? input55734 :resource-handling-option) (clojure.core/assoc-in [:body "ResourceHandlingOption"] (ser-resource-handling-option-type (input55734 :resource-handling-option))) (clojure.core/contains? input55734 :resource-policy) (clojure.core/assoc-in [:body "ResourcePolicy"] (ser-policy-document-type (input55734 :resource-policy))) (clojure.core/contains? input55734 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55734 :marker))) (clojure.core/contains? input55734 :resource-arns) (clojure.core/assoc-in [:body "ResourceArns"] (ser-resource-name-list-type (input55734 :resource-arns))) (clojure.core/contains? input55734 :context-entries) (clojure.core/assoc-in [:body "ContextEntries"] (ser-context-entry-list-type (input55734 :context-entries))) (clojure.core/contains? input55734 :policy-input-list) (clojure.core/assoc-in [:body "PolicyInputList"] (ser-simulation-policy-list-type (input55734 :policy-input-list))) (clojure.core/contains? input55734 :resource-owner) (clojure.core/assoc-in [:body "ResourceOwner"] (ser-resource-name-type (input55734 :resource-owner))) (clojure.core/contains? input55734 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55734 :max-items))) (clojure.core/contains? input55734 :caller-arn) (clojure.core/assoc-in [:body "CallerArn"] (ser-resource-name-type (input55734 :caller-arn))))))
(clojure.core/defn req<-list-server-certificates-request [action-name55738 input55737] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55738}} (clojure.core/contains? input55737 :path-prefix) (clojure.core/assoc-in [:body "PathPrefix"] (ser-path-prefix-type (input55737 :path-prefix))) (clojure.core/contains? input55737 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55737 :marker))) (clojure.core/contains? input55737 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55737 :max-items)))))
(clojure.core/defn req<-get-role-request [action-name55740 input55739] {:body {"RoleName" (ser-role-name-type (input55739 :role-name)), "Version" "2010-05-08", "Action" action-name55740}})
(clojure.core/defn req<-put-group-policy-request [action-name55742 input55741] {:body {"GroupName" (ser-group-name-type (input55741 :group-name)), "PolicyName" (ser-policy-name-type (input55741 :policy-name)), "PolicyDocument" (ser-policy-document-type (input55741 :policy-document)), "Version" "2010-05-08", "Action" action-name55742}})
(clojure.core/defn req<-list-virtualmfadevices-request [action-name55744 input55743] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55744}} (clojure.core/contains? input55743 :assignment-status) (clojure.core/assoc-in [:body "AssignmentStatus"] (ser-assignment-status-type (input55743 :assignment-status))) (clojure.core/contains? input55743 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55743 :marker))) (clojure.core/contains? input55743 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55743 :max-items)))))
(clojure.core/defn req<-delete-access-key-request [action-name55746 input55745] (clojure.core/let [input55747 {:body {"AccessKeyId" (ser-access-key-id-type (input55745 :access-key-id)), "Version" "2010-05-08", "Action" action-name55746}}] (clojure.core/cond-> input55747 (clojure.core/contains? input55745 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-existing-user-name-type (input55745 :user-name))))))
(clojure.core/defn req<-create-login-profile-request [action-name55749 input55748] (clojure.core/let [input55750 {:body {"UserName" (ser-user-name-type (input55748 :user-name)), "Password" (ser-password-type (input55748 :password)), "Version" "2010-05-08", "Action" action-name55749}}] (clojure.core/cond-> input55750 (clojure.core/contains? input55748 :password-reset-required) (clojure.core/assoc-in [:body "PasswordResetRequired"] (ser-boolean-type (input55748 :password-reset-required))))))
(clojure.core/defn req<-create-group-request [action-name55752 input55751] (clojure.core/let [input55753 {:body {"GroupName" (ser-group-name-type (input55751 :group-name)), "Version" "2010-05-08", "Action" action-name55752}}] (clojure.core/cond-> input55753 (clojure.core/contains? input55751 :path) (clojure.core/assoc-in [:body "Path"] (ser-path-type (input55751 :path))))))
(clojure.core/defn req<-attach-user-policy-request [action-name55755 input55754] {:body {"UserName" (ser-user-name-type (input55754 :user-name)), "PolicyArn" (ser-arn-type (input55754 :policy-arn)), "Version" "2010-05-08", "Action" action-name55755}})
(clojure.core/defn req<-remove-user-from-group-request [action-name55757 input55756] {:body {"GroupName" (ser-group-name-type (input55756 :group-name)), "UserName" (ser-existing-user-name-type (input55756 :user-name)), "Version" "2010-05-08", "Action" action-name55757}})
(clojure.core/defn req<-list-account-aliases-request [action-name55759 input55758] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55759}} (clojure.core/contains? input55758 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55758 :marker))) (clojure.core/contains? input55758 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55758 :max-items)))))
(clojure.core/defn req<-update-role-description-request [action-name55761 input55760] {:body {"RoleName" (ser-role-name-type (input55760 :role-name)), "Description" (ser-role-description-type (input55760 :description)), "Version" "2010-05-08", "Action" action-name55761}})
(clojure.core/defn req<-create-openidconnect-provider-request [action-name55763 input55762] (clojure.core/let [input55764 {:body {"Url" (ser-openidconnect-provider-url-type (input55762 :url)), "ThumbprintList" (ser-thumbprint-list-type (input55762 :thumbprint-list)), "Version" "2010-05-08", "Action" action-name55763}}] (clojure.core/cond-> input55764 (clojure.core/contains? input55762 :clientidlist) (clojure.core/assoc-in [:body "ClientIDList"] (ser-clientidlist-type (input55762 :clientidlist))))))
(clojure.core/defn req<-delete-group-policy-request [action-name55766 input55765] {:body {"GroupName" (ser-group-name-type (input55765 :group-name)), "PolicyName" (ser-policy-name-type (input55765 :policy-name)), "Version" "2010-05-08", "Action" action-name55766}})
(clojure.core/defn req<-get-instance-profile-request [action-name55768 input55767] {:body {"InstanceProfileName" (ser-instance-profile-name-type (input55767 :instance-profile-name)), "Version" "2010-05-08", "Action" action-name55768}})
(clojure.core/defn req<-get-account-authorization-details-request [action-name55770 input55769] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55770}} (clojure.core/contains? input55769 :filter) (clojure.core/assoc-in [:body "Filter"] (ser-entity-list-type (input55769 :filter))) (clojure.core/contains? input55769 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55769 :max-items))) (clojure.core/contains? input55769 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55769 :marker)))))
(clojure.core/defn req<-delete-policy-request [action-name55772 input55771] {:body {"PolicyArn" (ser-arn-type (input55771 :policy-arn)), "Version" "2010-05-08", "Action" action-name55772}})
(clojure.core/defn req<-update-user-request [action-name55774 input55773] (clojure.core/let [input55775 {:body {"UserName" (ser-existing-user-name-type (input55773 :user-name)), "Version" "2010-05-08", "Action" action-name55774}}] (clojure.core/cond-> input55775 (clojure.core/contains? input55773 :new-path) (clojure.core/assoc-in [:body "NewPath"] (ser-path-type (input55773 :new-path))) (clojure.core/contains? input55773 :new-user-name) (clojure.core/assoc-in [:body "NewUserName"] (ser-user-name-type (input55773 :new-user-name))))))
(clojure.core/defn req<-create-virtualmfadevice-request [action-name55777 input55776] (clojure.core/let [input55778 {:body {"VirtualMFADeviceName" (ser-virtualmfadevice-name (input55776 :virtualmfadevice-name)), "Version" "2010-05-08", "Action" action-name55777}}] (clojure.core/cond-> input55778 (clojure.core/contains? input55776 :path) (clojure.core/assoc-in [:body "Path"] (ser-path-type (input55776 :path))))))
(clojure.core/defn req<-add-user-to-group-request [action-name55780 input55779] {:body {"GroupName" (ser-group-name-type (input55779 :group-name)), "UserName" (ser-existing-user-name-type (input55779 :user-name)), "Version" "2010-05-08", "Action" action-name55780}})
(clojure.core/defn req<-update-role-request [action-name55782 input55781] (clojure.core/let [input55783 {:body {"RoleName" (ser-role-name-type (input55781 :role-name)), "Version" "2010-05-08", "Action" action-name55782}}] (clojure.core/cond-> input55783 (clojure.core/contains? input55781 :description) (clojure.core/assoc-in [:body "Description"] (ser-role-description-type (input55781 :description))) (clojure.core/contains? input55781 :max-session-duration) (clojure.core/assoc-in [:body "MaxSessionDuration"] (ser-role-max-session-duration-type (input55781 :max-session-duration))))))
(clojure.core/defn req<-list-user-policies-request [action-name55785 input55784] (clojure.core/let [input55786 {:body {"UserName" (ser-existing-user-name-type (input55784 :user-name)), "Version" "2010-05-08", "Action" action-name55785}}] (clojure.core/cond-> input55786 (clojure.core/contains? input55784 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55784 :marker))) (clojure.core/contains? input55784 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55784 :max-items))))))
(clojure.core/defn req<-simulate-custom-policy-request [action-name55788 input55787] (clojure.core/let [input55789 {:body {"ActionNames" (ser-action-name-list-type (input55787 :action-names)), "PolicyInputList" (ser-simulation-policy-list-type (input55787 :policy-input-list)), "Version" "2010-05-08", "Action" action-name55788}}] (clojure.core/cond-> input55789 (clojure.core/contains? input55787 :resource-handling-option) (clojure.core/assoc-in [:body "ResourceHandlingOption"] (ser-resource-handling-option-type (input55787 :resource-handling-option))) (clojure.core/contains? input55787 :resource-policy) (clojure.core/assoc-in [:body "ResourcePolicy"] (ser-policy-document-type (input55787 :resource-policy))) (clojure.core/contains? input55787 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55787 :marker))) (clojure.core/contains? input55787 :resource-arns) (clojure.core/assoc-in [:body "ResourceArns"] (ser-resource-name-list-type (input55787 :resource-arns))) (clojure.core/contains? input55787 :context-entries) (clojure.core/assoc-in [:body "ContextEntries"] (ser-context-entry-list-type (input55787 :context-entries))) (clojure.core/contains? input55787 :resource-owner) (clojure.core/assoc-in [:body "ResourceOwner"] (ser-resource-name-type (input55787 :resource-owner))) (clojure.core/contains? input55787 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55787 :max-items))) (clojure.core/contains? input55787 :caller-arn) (clojure.core/assoc-in [:body "CallerArn"] (ser-resource-name-type (input55787 :caller-arn))))))
(clojure.core/defn req<-listsshpublic-keys-request [action-name55791 input55790] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55791}} (clojure.core/contains? input55790 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-user-name-type (input55790 :user-name))) (clojure.core/contains? input55790 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker-type (input55790 :marker))) (clojure.core/contains? input55790 :max-items) (clojure.core/assoc-in [:body "MaxItems"] (ser-max-items-type (input55790 :max-items)))))
(clojure.core/defn req<-get-user-request [action-name55793 input55792] (clojure.core/cond-> {:body {"Version" "2010-05-08", "Action" action-name55793}} (clojure.core/contains? input55792 :user-name) (clojure.core/assoc-in [:body "UserName"] (ser-existing-user-name-type (input55792 :user-name)))))

(clojure.spec.alpha/def :portkey.aws.iam/samlprovider-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/samlprovider-list-entry))

(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-response/versions (clojure.spec.alpha/and :portkey.aws.iam/policy-document-version-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policy-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-policy-versions-response/Versions :portkey.aws.iam.list-policy-versions-response/IsTruncated :portkey.aws.iam.list-policy-versions-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-virtualmfadevices-request/assignment-status (clojure.spec.alpha/and :portkey.aws.iam/assignment-status-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-virtualmfadevices-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-virtualmfadevices-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-virtualmfadevices-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-virtualmfadevices-request/AssignmentStatus :portkey.aws.iam.list-virtualmfadevices-request/Marker :portkey.aws.iam.list-virtualmfadevices-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-role-policy-response/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-role-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-role-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-role-policy-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-role-policy-response/RoleName :portkey.aws.iam.get-role-policy-response/PolicyName :portkey.aws.iam.get-role-policy-response/PolicyDocument] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-source-type {"user-managed" "user-managed", :role "role", "role" "role", "resource" "resource", "none" "none", :group "group", "group" "group", "user" "user", :user-managed "user-managed", :aws-managed "aws-managed", :resource "resource", "aws-managed" "aws-managed", :user "user", :none "none"})

(clojure.spec.alpha/def :portkey.aws.iam/create-user-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/User] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.listmfadevices-response/mfadevices (clojure.spec.alpha/and :portkey.aws.iam/mfa-device-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.listmfadevices-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.listmfadevices-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/listmfadevices-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.listmfadevices-response/MFADevices] :opt-un [:portkey.aws.iam.listmfadevices-response/IsTruncated :portkey.aws.iam.listmfadevices-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.resource-specific-result/eval-resource-name (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.resource-specific-result/eval-resource-decision (clojure.spec.alpha/and :portkey.aws.iam/policy-evaluation-decision-type))
(clojure.spec.alpha/def :portkey.aws.iam.resource-specific-result/matched-statements (clojure.spec.alpha/and :portkey.aws.iam/statement-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.resource-specific-result/missing-context-values (clojure.spec.alpha/and :portkey.aws.iam/context-key-names-result-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.resource-specific-result/eval-decision-details (clojure.spec.alpha/and :portkey.aws.iam/eval-decision-details-type))
(clojure.spec.alpha/def :portkey.aws.iam/resource-specific-result (portkey.aws/json-keys :req-un [:portkey.aws.iam.resource-specific-result/EvalResourceName :portkey.aws.iam.resource-specific-result/EvalResourceDecision] :opt-un [:portkey.aws.iam.resource-specific-result/MatchedStatements :portkey.aws.iam.resource-specific-result/MissingContextValues :portkey.aws.iam.resource-specific-result/EvalDecisionDetails] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/minimum-password-length (clojure.spec.alpha/and :portkey.aws.iam/minimum-password-length-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/require-numbers (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/require-uppercase-characters (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/hard-expiry (clojure.spec.alpha/and :portkey.aws.iam/boolean-object-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/require-lowercase-characters (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/require-symbols (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/allow-users-to-change-password (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/max-password-age (clojure.spec.alpha/and :portkey.aws.iam/max-password-age-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/password-reuse-prevention (clojure.spec.alpha/and :portkey.aws.iam/password-reuse-prevention-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-account-password-policy-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.update-account-password-policy-request/MinimumPasswordLength :portkey.aws.iam.update-account-password-policy-request/RequireNumbers :portkey.aws.iam.update-account-password-policy-request/RequireUppercaseCharacters :portkey.aws.iam.update-account-password-policy-request/HardExpiry :portkey.aws.iam.update-account-password-policy-request/RequireLowercaseCharacters :portkey.aws.iam.update-account-password-policy-request/RequireSymbols :portkey.aws.iam.update-account-password-policy-request/AllowUsersToChangePassword :portkey.aws.iam.update-account-password-policy-request/MaxPasswordAge :portkey.aws.iam.update-account-password-policy-request/PasswordReusePrevention] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/unrecognized-public-key-encoding-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.get-access-key-last-used-response/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-access-key-last-used-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.get-access-key-last-used-response/UserName :portkey.aws.iam/AccessKeyLastUsed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-openidconnect-provider-request/openidconnect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-openidconnect-provider-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-openidconnect-provider-request/OpenIDConnectProviderArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/assume-role-policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/max-session-duration (clojure.spec.alpha/and :portkey.aws.iam/role-max-session-duration-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-role-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-role-request/RoleName :portkey.aws.iam.create-role-request/AssumeRolePolicyDocument] :opt-un [:portkey.aws.iam.create-role-request/Path :portkey.aws.iam.create-role-request/Description :portkey.aws.iam.create-role-request/MaxSessionDuration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/context-entry-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/context-entry))

(clojure.spec.alpha/def :portkey.aws.iam/public-key-material-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 16384)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/server-certificate-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/upload-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/expiration (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/server-certificate-metadata (portkey.aws/json-keys :req-un [:portkey.aws.iam.server-certificate-metadata/Path :portkey.aws.iam.server-certificate-metadata/ServerCertificateName :portkey.aws.iam.server-certificate-metadata/ServerCertificateId :portkey.aws.iam.server-certificate-metadata/Arn] :opt-un [:portkey.aws.iam.server-certificate-metadata/UploadDate :portkey.aws.iam.server-certificate-metadata/Expiration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-login-profile-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-login-profile-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-login-profile-request/UserName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.update-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-user-request/new-path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-user-request/new-user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-user-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-user-request/UserName] :opt-un [:portkey.aws.iam.update-user-request/NewPath :portkey.aws.iam.update-user-request/NewUserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/get-login-profile-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/LoginProfile] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-role-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-role-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-role-policy-request/RoleName :portkey.aws.iam.get-role-policy-request/PolicyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-user-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.get-user-request/UserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/key-pair-mismatch-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.get-login-profile-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-login-profile-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-login-profile-request/UserName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/server-certificate-metadata-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/server-certificate-metadata))

(clojure.spec.alpha/def :portkey.aws.iam/custom-suffix-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/path-prefix-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 512)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"\u002F[\u0021-\u007F]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.get-account-summary-response/summary-map (clojure.spec.alpha/and :portkey.aws.iam/summary-map-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-account-summary-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.get-account-summary-response/SummaryMap] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-response/server-certificate-metadata-list (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-metadata-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-server-certificates-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-server-certificates-response/ServerCertificateMetadataList] :opt-un [:portkey.aws.iam.list-server-certificates-response/IsTruncated :portkey.aws.iam.list-server-certificates-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/report-state-type {"STARTED" "STARTED", :started "STARTED", "INPROGRESS" "INPROGRESS", :inprogress "INPROGRESS", "COMPLETE" "COMPLETE", :complete "COMPLETE"})

(clojure.spec.alpha/def :portkey.aws.iam.list-users-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-users-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-users-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-users-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-users-request/PathPrefix :portkey.aws.iam.list-users-request/Marker :portkey.aws.iam.list-users-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.policy-not-attachable-exception/message (clojure.spec.alpha/and :portkey.aws.iam/policy-not-attachable-message))
(clojure.spec.alpha/def :portkey.aws.iam/policy-not-attachable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.policy-not-attachable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/virtualmfadevice-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/virtualmfadevice))

(clojure.spec.alpha/def :portkey.aws.iam/marker-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 320)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/create-instance-profile-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/InstanceProfile] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/deletion-task-status-type {"SUCCEEDED" "SUCCEEDED", :succeeded "SUCCEEDED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "FAILED" "FAILED", :failed "FAILED", "NOT_STARTED" "NOT_STARTED", :not-started "NOT_STARTED"})

(clojure.spec.alpha/def :portkey.aws.iam.login-profile/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.login-profile/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.login-profile/password-reset-required (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam/login-profile (portkey.aws/json-keys :req-un [:portkey.aws.iam.login-profile/UserName :portkey.aws.iam.login-profile/CreateDate] :opt-un [:portkey.aws.iam.login-profile/PasswordResetRequired] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iam.server-certificate/certificate-body (clojure.spec.alpha/and :portkey.aws.iam/certificate-body-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate/certificate-chain (clojure.spec.alpha/and :portkey.aws.iam/certificate-chain-type))
(clojure.spec.alpha/def :portkey.aws.iam/server-certificate (portkey.aws/json-keys :req-un [:portkey.aws.iam/ServerCertificateMetadata :portkey.aws.iam.server-certificate/CertificateBody] :opt-un [:portkey.aws.iam.server-certificate/CertificateChain] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/group-name-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/group-name-type))

(clojure.spec.alpha/def :portkey.aws.iam.samlprovider-list-entry/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.samlprovider-list-entry/valid-until (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.samlprovider-list-entry/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/samlprovider-list-entry (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.samlprovider-list-entry/Arn :portkey.aws.iam.samlprovider-list-entry/ValidUntil :portkey.aws.iam.samlprovider-list-entry/CreateDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/action-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 3 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iam.credential-report-not-ready-exception/message (clojure.spec.alpha/and :portkey.aws.iam/credential-report-not-ready-exception-message))
(clojure.spec.alpha/def :portkey.aws.iam/credential-report-not-ready-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.credential-report-not-ready-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/getsshpublic-key-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/SSHPublicKey] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/update-role-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-user-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-attached-user-policies-request/UserName] :opt-un [:portkey.aws.iam.list-attached-user-policies-request/PathPrefix :portkey.aws.iam.list-attached-user-policies-request/Marker :portkey.aws.iam.list-attached-user-policies-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/create-service-linked-role-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/Role] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/group-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/list-openidconnect-providers-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-document-version-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-version))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-public-key-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-public-key-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-public-key-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.invalid-public-key-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.role-usage-type/region (clojure.spec.alpha/and :portkey.aws.iam/region-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-usage-type/resources (clojure.spec.alpha/and :portkey.aws.iam/arn-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/role-usage-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.role-usage-type/Region :portkey.aws.iam.role-usage-type/Resources] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/credential-report-expired-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/instance-profile-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/roles (clojure.spec.alpha/and :portkey.aws.iam/role-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/instance-profile (portkey.aws/json-keys :req-un [:portkey.aws.iam.instance-profile/Path :portkey.aws.iam.instance-profile/InstanceProfileName :portkey.aws.iam.instance-profile/InstanceProfileId :portkey.aws.iam.instance-profile/Arn :portkey.aws.iam.instance-profile/CreateDate :portkey.aws.iam.instance-profile/Roles] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-roles-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-roles-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-roles-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-roles-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-roles-request/PathPrefix :portkey.aws.iam.list-roles-request/Marker :portkey.aws.iam.list-roles-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/samlprovider-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w._-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.get-server-certificate-request/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-server-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-server-certificate-request/ServerCertificateName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/attached-policies-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/attached-policy))

(clojure.spec.alpha/def :portkey.aws.iam.unrecognized-public-key-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.iam/unrecognized-public-key-encoding-message))
(clojure.spec.alpha/def :portkey.aws.iam/unrecognized-public-key-encoding-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.unrecognized-public-key-encoding-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-identifier-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 16 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.credential-report-expired-exception/message (clojure.spec.alpha/and :portkey.aws.iam/credential-report-expired-exception-message))
(clojure.spec.alpha/def :portkey.aws.iam/credential-report-expired-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.credential-report-expired-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/clientidtype (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.iam.delete-signing-certificate-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-signing-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iam/certificate-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-signing-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-signing-certificate-request/CertificateId] :opt-un [:portkey.aws.iam.delete-signing-certificate-request/UserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/string-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.set-default-policy-version-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.set-default-policy-version-request/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/set-default-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.set-default-policy-version-request/PolicyArn :portkey.aws.iam.set-default-policy-version-request/VersionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.createsamlprovider-request/samlmetadata-document (clojure.spec.alpha/and :portkey.aws.iam/samlmetadata-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.createsamlprovider-request/name (clojure.spec.alpha/and :portkey.aws.iam/samlprovider-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/createsamlprovider-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.createsamlprovider-request/SAMLMetadataDocument :portkey.aws.iam.createsamlprovider-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/eval-decision-source-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 3 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iam.password-policy/minimum-password-length (clojure.spec.alpha/and :portkey.aws.iam/minimum-password-length-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/require-numbers (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/require-uppercase-characters (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/hard-expiry (clojure.spec.alpha/and :portkey.aws.iam/boolean-object-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/expire-passwords (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/require-lowercase-characters (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/require-symbols (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/allow-users-to-change-password (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/max-password-age (clojure.spec.alpha/and :portkey.aws.iam/max-password-age-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/password-reuse-prevention (clojure.spec.alpha/and :portkey.aws.iam/password-reuse-prevention-type))
(clojure.spec.alpha/def :portkey.aws.iam/password-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.password-policy/MinimumPasswordLength :portkey.aws.iam.password-policy/RequireNumbers :portkey.aws.iam.password-policy/RequireUppercaseCharacters :portkey.aws.iam.password-policy/HardExpiry :portkey.aws.iam.password-policy/ExpirePasswords :portkey.aws.iam.password-policy/RequireLowercaseCharacters :portkey.aws.iam.password-policy/RequireSymbols :portkey.aws.iam.password-policy/AllowUsersToChangePassword :portkey.aws.iam.password-policy/MaxPasswordAge :portkey.aws.iam.password-policy/PasswordReusePrevention] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-context-keys-for-principal-policy-request/policy-source-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-context-keys-for-principal-policy-request/policy-input-list (clojure.spec.alpha/and :portkey.aws.iam/simulation-policy-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-context-keys-for-principal-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-context-keys-for-principal-policy-request/PolicySourceArn] :opt-un [:portkey.aws.iam.get-context-keys-for-principal-policy-request/PolicyInputList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/summary-map-type (clojure.spec.alpha/map-of :portkey.aws.iam/summary-key-type :portkey.aws.iam/summary-value-type))

(clojure.spec.alpha/def :portkey.aws.iam.reset-service-specific-credential-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.reset-service-specific-credential-request/service-specific-credential-id (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credential-id))
(clojure.spec.alpha/def :portkey.aws.iam/reset-service-specific-credential-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.reset-service-specific-credential-request/ServiceSpecificCredentialId] :opt-un [:portkey.aws.iam.reset-service-specific-credential-request/UserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-group-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-group-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-group-policy-request/GroupName :portkey.aws.iam.delete-group-policy-request/PolicyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.updatesamlprovider-response/samlprovider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/updatesamlprovider-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.updatesamlprovider-response/SAMLProviderArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/virtualmfadevice-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/no-such-entity-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/create-service-specific-credential-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/ServiceSpecificCredential] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-group-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-attached-group-policies-request/GroupName] :opt-un [:portkey.aws.iam.list-attached-group-policies-request/PathPrefix :portkey.aws.iam.list-attached-group-policies-request/Marker :portkey.aws.iam.list-attached-group-policies-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.no-such-entity-exception/message (clojure.spec.alpha/and :portkey.aws.iam/no-such-entity-message))
(clojure.spec.alpha/def :portkey.aws.iam/no-such-entity-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.no-such-entity-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.context-entry/context-key-name (clojure.spec.alpha/and :portkey.aws.iam/context-key-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.context-entry/context-key-values (clojure.spec.alpha/and :portkey.aws.iam/context-key-value-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.context-entry/context-key-type (clojure.spec.alpha/and :portkey.aws.iam/context-key-type-enum))
(clojure.spec.alpha/def :portkey.aws.iam/context-entry (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.context-entry/ContextKeyName :portkey.aws.iam.context-entry/ContextKeyValues :portkey.aws.iam.context-entry/ContextKeyType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.remove-user-from-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.remove-user-from-group-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/remove-user-from-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.remove-user-from-group-request/GroupName :portkey.aws.iam.remove-user-from-group-request/UserName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/user-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/user))

(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-response/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-group-policy-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-group-policy-response/GroupName :portkey.aws.iam.get-group-policy-response/PolicyName :portkey.aws.iam.get-group-policy-response/PolicyDocument] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.credential-report-not-present-exception/message (clojure.spec.alpha/and :portkey.aws.iam/credential-report-not-present-exception-message))
(clojure.spec.alpha/def :portkey.aws.iam/credential-report-not-present-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.credential-report-not-present-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/thumbprint-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 40 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.iam/summary-key-type {"AccountMFAEnabled" "AccountMFAEnabled", "VersionsPerPolicyQuota" "VersionsPerPolicyQuota", :account-access-keys-present "AccountAccessKeysPresent", :user-policy-size-quota "UserPolicySizeQuota", :mfadevices "MFADevices", :policy-size-quota "PolicySizeQuota", "PolicySizeQuota" "PolicySizeQuota", :attached-policies-per-role-quota "AttachedPoliciesPerRoleQuota", :policies-quota "PoliciesQuota", :policies "Policies", :access-keys-per-user-quota "AccessKeysPerUserQuota", "ServerCertificates" "ServerCertificates", "AccessKeysPerUserQuota" "AccessKeysPerUserQuota", :versions-per-policy-quota "VersionsPerPolicyQuota", "GroupsQuota" "GroupsQuota", :server-certificates "ServerCertificates", :groups-quota "GroupsQuota", "AttachedPoliciesPerRoleQuota" "AttachedPoliciesPerRoleQuota", :group-policy-size-quota "GroupPolicySizeQuota", :mfadevices-in-use "MFADevicesInUse", "SigningCertificatesPerUserQuota" "SigningCertificatesPerUserQuota", "GroupPolicySizeQuota" "GroupPolicySizeQuota", "PolicyVersionsInUse" "PolicyVersionsInUse", "UserPolicySizeQuota" "UserPolicySizeQuota", :signing-certificates-per-user-quota "SigningCertificatesPerUserQuota", "MFADevicesInUse" "MFADevicesInUse", "Users" "Users", "Groups" "Groups", :groups-per-user-quota "GroupsPerUserQuota", "AccountSigningCertificatesPresent" "AccountSigningCertificatesPresent", "Policies" "Policies", "AttachedPoliciesPerGroupQuota" "AttachedPoliciesPerGroupQuota", "UsersQuota" "UsersQuota", "PoliciesQuota" "PoliciesQuota", "ServerCertificatesQuota" "ServerCertificatesQuota", :policy-versions-in-use-quota "PolicyVersionsInUseQuota", "AccountAccessKeysPresent" "AccountAccessKeysPresent", :users-quota "UsersQuota", :groups "Groups", :attached-policies-per-user-quota "AttachedPoliciesPerUserQuota", "GroupsPerUserQuota" "GroupsPerUserQuota", :attached-policies-per-group-quota "AttachedPoliciesPerGroupQuota", :server-certificates-quota "ServerCertificatesQuota", :policy-versions-in-use "PolicyVersionsInUse", "MFADevices" "MFADevices", :account-signing-certificates-present "AccountSigningCertificatesPresent", :accountmfaenabled "AccountMFAEnabled", :users "Users", "AttachedPoliciesPerUserQuota" "AttachedPoliciesPerUserQuota", "PolicyVersionsInUseQuota" "PolicyVersionsInUseQuota"})

(clojure.spec.alpha/def :portkey.aws.iam/instance-profile-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/instance-profile))

(clojure.spec.alpha/def :portkey.aws.iam.remove-role-from-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.remove-role-from-instance-profile-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/remove-role-from-instance-profile-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.remove-role-from-instance-profile-request/InstanceProfileName :portkey.aws.iam.remove-role-from-instance-profile-request/RoleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-context-keys-for-custom-policy-request/policy-input-list (clojure.spec.alpha/and :portkey.aws.iam/simulation-policy-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-context-keys-for-custom-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-context-keys-for-custom-policy-request/PolicyInputList] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-server-certificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-server-certificates-request/PathPrefix :portkey.aws.iam.list-server-certificates-request/Marker :portkey.aws.iam.list-server-certificates-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/password-policy-violation-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.generate-credential-report-response/state (clojure.spec.alpha/and :portkey.aws.iam/report-state-type))
(clojure.spec.alpha/def :portkey.aws.iam.generate-credential-report-response/description (clojure.spec.alpha/and :portkey.aws.iam/report-state-description-type))
(clojure.spec.alpha/def :portkey.aws.iam/generate-credential-report-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.generate-credential-report-response/State :portkey.aws.iam.generate-credential-report-response/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-certificate-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-certificate-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-certificate-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.invalid-certificate-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/malformed-certificate-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/statement-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/statement))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-certificate-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.createsamlprovider-response/samlprovider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/createsamlprovider-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.createsamlprovider-response/SAMLProviderArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-context-keys-for-policy-response/context-key-names (clojure.spec.alpha/and :portkey.aws.iam/context-key-names-result-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-context-keys-for-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.get-context-keys-for-policy-response/ContextKeyNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-response/instance-profiles (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-instance-profiles-for-role-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-instance-profiles-for-role-response/InstanceProfiles] :opt-un [:portkey.aws.iam.list-instance-profiles-for-role-response/IsTruncated :portkey.aws.iam.list-instance-profiles-for-role-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-signing-certificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-signing-certificates-request/UserName :portkey.aws.iam.list-signing-certificates-request/Marker :portkey.aws.iam.list-signing-certificates-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.statement/source-policy-id (clojure.spec.alpha/and :portkey.aws.iam/policy-identifier-type))
(clojure.spec.alpha/def :portkey.aws.iam.statement/source-policy-type (clojure.spec.alpha/and :portkey.aws.iam/policy-source-type))
(clojure.spec.alpha/def :portkey.aws.iam.statement/start-position (clojure.spec.alpha/and :portkey.aws.iam/position))
(clojure.spec.alpha/def :portkey.aws.iam.statement/end-position (clojure.spec.alpha/and :portkey.aws.iam/position))
(clojure.spec.alpha/def :portkey.aws.iam/statement (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.statement/SourcePolicyId :portkey.aws.iam.statement/SourcePolicyType :portkey.aws.iam.statement/StartPosition :portkey.aws.iam.statement/EndPosition] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.malformed-certificate-exception/message (clojure.spec.alpha/and :portkey.aws.iam/malformed-certificate-message))
(clojure.spec.alpha/def :portkey.aws.iam/malformed-certificate-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.malformed-certificate-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-response/attached-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-role-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-attached-role-policies-response/AttachedPolicies :portkey.aws.iam.list-attached-role-policies-response/IsTruncated :portkey.aws.iam.list-attached-role-policies-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/encoding-type {"SSH" "SSH", :ssh "SSH", "PEM" "PEM", :pem "PEM"})

(clojure.spec.alpha/def :portkey.aws.iam/policy-user-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-user))

(clojure.spec.alpha/def :portkey.aws.iam/role-max-session-duration-type (clojure.spec.alpha/int-in 3600 43200))

(clojure.spec.alpha/def :portkey.aws.iam.delete-service-linked-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-service-linked-role-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-service-linked-role-request/RoleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iam/delete-conflict-message))
(clojure.spec.alpha/def :portkey.aws.iam/delete-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.delete-conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.put-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-group-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-group-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/put-group-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.put-group-policy-request/GroupName :portkey.aws.iam.put-group-policy-request/PolicyName :portkey.aws.iam.put-group-policy-request/PolicyDocument] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/account-alias-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 3 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 63)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.service-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iam/service-failure-exception-message))
(clojure.spec.alpha/def :portkey.aws.iam/service-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.service-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/create-role-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/Role] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/account-alias-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/account-alias-type))

(clojure.spec.alpha/def :portkey.aws.iam/access-key-secret-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/policy-evaluation-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/password-reuse-prevention-type (clojure.spec.alpha/int-in 1 24))

(clojure.spec.alpha/def :portkey.aws.iam/line-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam.get-group-response/users (clojure.spec.alpha/and :portkey.aws.iam/user-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-group-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/Group :portkey.aws.iam.get-group-response/Users] :opt-un [:portkey.aws.iam.get-group-response/IsTruncated :portkey.aws.iam.get-group-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-user-type-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-user-type-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-user-type-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.invalid-user-type-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iam/limit-exceeded-message))
(clojure.spec.alpha/def :portkey.aws.iam/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/user-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/user-detail))

(clojure.spec.alpha/def :portkey.aws.iam.list-roles-response/roles (clojure.spec.alpha/and :portkey.aws.iam/role-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-roles-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-roles-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-roles-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-roles-response/Roles] :opt-un [:portkey.aws.iam.list-roles-response/IsTruncated :portkey.aws.iam.list-roles-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/listsamlproviders-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-openidconnect-provider-response/openidconnect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-openidconnect-provider-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.create-openidconnect-provider-response/OpenIDConnectProviderArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-groups-response/groups (clojure.spec.alpha/and :portkey.aws.iam/group-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-groups-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-groups-response/Groups] :opt-un [:portkey.aws.iam.list-groups-response/IsTruncated :portkey.aws.iam.list-groups-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.detach-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.detach-user-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/detach-user-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.detach-user-policy-request/UserName :portkey.aws.iam.detach-user-policy-request/PolicyArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/column-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam.policy-evaluation-exception/message (clojure.spec.alpha/and :portkey.aws.iam/policy-evaluation-error-message))
(clojure.spec.alpha/def :portkey.aws.iam/policy-evaluation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.policy-evaluation-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-service-linked-role-request/awsservice-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-service-linked-role-request/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-service-linked-role-request/custom-suffix (clojure.spec.alpha/and :portkey.aws.iam/custom-suffix-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-service-linked-role-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-service-linked-role-request/AWSServiceName] :opt-un [:portkey.aws.iam.create-service-linked-role-request/Description :portkey.aws.iam.create-service-linked-role-request/CustomSuffix] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.user/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/user-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/password-last-used (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/user (portkey.aws/json-keys :req-un [:portkey.aws.iam.user/Path :portkey.aws.iam.user/UserName :portkey.aws.iam.user/UserId :portkey.aws.iam.user/Arn :portkey.aws.iam.user/CreateDate] :opt-un [:portkey.aws.iam.user/PasswordLastUsed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-access-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-access-key-request/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-access-key-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-access-key-request/AccessKeyId] :opt-un [:portkey.aws.iam.delete-access-key-request/UserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.deletesamlprovider-request/samlprovider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/deletesamlprovider-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.deletesamlprovider-request/SAMLProviderArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.policy-role/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-role/role-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-role (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.policy-role/RoleName :portkey.aws.iam.policy-role/RoleId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/attachment-count-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam/resource-handling-option-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.iam/sshpublic-key-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/sshpublic-key-metadata))

(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/service-user-name (clojure.spec.alpha/and :portkey.aws.iam/service-user-name))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/service-specific-credential-id (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credential-id))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/service-name (clojure.spec.alpha/and :portkey.aws.iam/service-name))
(clojure.spec.alpha/def :portkey.aws.iam/service-specific-credential-metadata (portkey.aws/json-keys :req-un [:portkey.aws.iam.service-specific-credential-metadata/UserName :portkey.aws.iam.service-specific-credential-metadata/Status :portkey.aws.iam.service-specific-credential-metadata/ServiceUserName :portkey.aws.iam.service-specific-credential-metadata/CreateDate :portkey.aws.iam.service-specific-credential-metadata/ServiceSpecificCredentialId :portkey.aws.iam.service-specific-credential-metadata/ServiceName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.detach-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.detach-group-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/detach-group-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.detach-group-policy-request/GroupName :portkey.aws.iam.detach-group-policy-request/PolicyArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.update-role-description-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-role-description-request/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-role-description-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-role-description-request/RoleName :portkey.aws.iam.update-role-description-request/Description] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.duplicate-certificate-exception/message (clojure.spec.alpha/and :portkey.aws.iam/duplicate-certificate-message))
(clojure.spec.alpha/def :portkey.aws.iam/duplicate-certificate-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.duplicate-certificate-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.uploadsshpublic-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.uploadsshpublic-key-request/sshpublic-key-body (clojure.spec.alpha/and :portkey.aws.iam/public-key-material-type))
(clojure.spec.alpha/def :portkey.aws.iam/uploadsshpublic-key-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.uploadsshpublic-key-request/UserName :portkey.aws.iam.uploadsshpublic-key-request/SSHPublicKeyBody] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-access-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-access-key-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.create-access-key-request/UserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-version-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"v[1-9][0-9]*(\.[A-Za-z0-9-]*)?" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-value-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.policy-version/document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-version/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-version/is-default-version (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-version/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.policy-version/Document :portkey.aws.iam.policy-version/VersionId :portkey.aws.iam.policy-version/IsDefaultVersion :portkey.aws.iam.policy-version/CreateDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-role-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-role))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-input-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/public-key-fingerprint-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 48 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 48)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[:\w]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-group-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-group-policies-request/GroupName] :opt-un [:portkey.aws.iam.list-group-policies-request/Marker :portkey.aws.iam.list-group-policies-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.entity-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.iam/entity-already-exists-message))
(clojure.spec.alpha/def :portkey.aws.iam/entity-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.entity-already-exists-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/get-role-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/Role] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/instance-profile-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/simulation-policy-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-document-type))

(clojure.spec.alpha/def :portkey.aws.iam.add-user-to-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.add-user-to-group-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/add-user-to-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.add-user-to-group-request/GroupName :portkey.aws.iam.add-user-to-group-request/UserName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/service-specific-credential-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 20 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.create-login-profile-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-login-profile-request/password (clojure.spec.alpha/and :portkey.aws.iam/password-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-login-profile-request/password-reset-required (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-login-profile-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-login-profile-request/UserName :portkey.aws.iam.create-login-profile-request/Password] :opt-un [:portkey.aws.iam.create-login-profile-request/PasswordResetRequired] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-access-keys-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-access-keys-request/UserName :portkey.aws.iam.list-access-keys-request/Marker :portkey.aws.iam.list-access-keys-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.attach-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.attach-group-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attach-group-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.attach-group-policy-request/GroupName :portkey.aws.iam.attach-group-policy-request/PolicyArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-role-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-role-policies-request/RoleName] :opt-un [:portkey.aws.iam.list-role-policies-request/Marker :portkey.aws.iam.list-role-policies-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-account-alias-request/account-alias (clojure.spec.alpha/and :portkey.aws.iam/account-alias-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-account-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-account-alias-request/AccountAlias] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/eval-action-name (clojure.spec.alpha/and :portkey.aws.iam/action-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/eval-resource-name (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/eval-decision (clojure.spec.alpha/and :portkey.aws.iam/policy-evaluation-decision-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/matched-statements (clojure.spec.alpha/and :portkey.aws.iam/statement-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/missing-context-values (clojure.spec.alpha/and :portkey.aws.iam/context-key-names-result-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/eval-decision-details (clojure.spec.alpha/and :portkey.aws.iam/eval-decision-details-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/resource-specific-results (clojure.spec.alpha/and :portkey.aws.iam/resource-specific-result-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/evaluation-result (portkey.aws/json-keys :req-un [:portkey.aws.iam.evaluation-result/EvalActionName :portkey.aws.iam.evaluation-result/EvalDecision] :opt-un [:portkey.aws.iam.evaluation-result/EvalResourceName :portkey.aws.iam.evaluation-result/MatchedStatements :portkey.aws.iam.evaluation-result/MissingContextValues :portkey.aws.iam/OrganizationsDecisionDetail :portkey.aws.iam.evaluation-result/EvalDecisionDetails :portkey.aws.iam.evaluation-result/ResourceSpecificResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.attached-policy/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.attached-policy/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attached-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.attached-policy/PolicyName :portkey.aws.iam.attached-policy/PolicyArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-policy-request/path (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-policy-request/description (clojure.spec.alpha/and :portkey.aws.iam/policy-description-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-policy-request/PolicyName :portkey.aws.iam.create-policy-request/PolicyDocument] :opt-un [:portkey.aws.iam.create-policy-request/Path :portkey.aws.iam.create-policy-request/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/max-password-age-type (clojure.spec.alpha/int-in 1 1095))

(clojure.spec.alpha/def :portkey.aws.iam/entity-temporarily-unmodifiable-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/policy-scope-type {"All" "All", :all "All", "AWS" "AWS", :aws "AWS", "Local" "Local", :local "Local"})

(clojure.spec.alpha/def :portkey.aws.iam.delete-server-certificate-request/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-server-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-server-certificate-request/ServerCertificateName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/get-instance-profile-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/InstanceProfile] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-credential-report-response/content (clojure.spec.alpha/and :portkey.aws.iam/report-content-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-credential-report-response/report-format (clojure.spec.alpha/and :portkey.aws.iam/report-format-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-credential-report-response/generated-time (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-credential-report-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.get-credential-report-response/Content :portkey.aws.iam.get-credential-report-response/ReportFormat :portkey.aws.iam.get-credential-report-response/GeneratedTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.policy-user/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-user/user-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-user (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.policy-user/UserName :portkey.aws.iam.policy-user/UserId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.put-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-role-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-role-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/put-role-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.put-role-policy-request/RoleName :portkey.aws.iam.put-role-policy-request/PolicyName :portkey.aws.iam.put-role-policy-request/PolicyDocument] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/entity-filter (clojure.spec.alpha/and :portkey.aws.iam/entity-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-entities-for-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-entities-for-policy-request/PolicyArn] :opt-un [:portkey.aws.iam.list-entities-for-policy-request/EntityFilter :portkey.aws.iam.list-entities-for-policy-request/PathPrefix :portkey.aws.iam.list-entities-for-policy-request/Marker :portkey.aws.iam.list-entities-for-policy-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.access-key-last-used/last-used-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key-last-used/service-name (clojure.spec.alpha/and :portkey.aws.iam/string-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key-last-used/region (clojure.spec.alpha/and :portkey.aws.iam/string-type))
(clojure.spec.alpha/def :portkey.aws.iam/access-key-last-used (portkey.aws/json-keys :req-un [:portkey.aws.iam.access-key-last-used/LastUsedDate :portkey.aws.iam.access-key-last-used/ServiceName :portkey.aws.iam.access-key-last-used/Region] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.sshpublic-key/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.sshpublic-key/sshpublic-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.sshpublic-key/fingerprint (clojure.spec.alpha/and :portkey.aws.iam/public-key-fingerprint-type))
(clojure.spec.alpha/def :portkey.aws.iam.sshpublic-key/sshpublic-key-body (clojure.spec.alpha/and :portkey.aws.iam/public-key-material-type))
(clojure.spec.alpha/def :portkey.aws.iam.sshpublic-key/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.sshpublic-key/upload-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/sshpublic-key (portkey.aws/json-keys :req-un [:portkey.aws.iam.sshpublic-key/UserName :portkey.aws.iam.sshpublic-key/SSHPublicKeyId :portkey.aws.iam.sshpublic-key/Fingerprint :portkey.aws.iam.sshpublic-key/SSHPublicKeyBody :portkey.aws.iam.sshpublic-key/Status] :opt-un [:portkey.aws.iam.sshpublic-key/UploadDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/duplicate-certificate-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/policy-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 131072)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.deactivatemfadevice-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.deactivatemfadevice-request/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam/deactivatemfadevice-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.deactivatemfadevice-request/UserName :portkey.aws.iam.deactivatemfadevice-request/SerialNumber] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-service-linked-role-deletion-status-request/deletion-task-id (clojure.spec.alpha/and :portkey.aws.iam/deletion-task-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-service-linked-role-deletion-status-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-service-linked-role-deletion-status-request/DeletionTaskId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.add-role-to-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.add-role-to-instance-profile-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/add-role-to-instance-profile-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.add-role-to-instance-profile-request/InstanceProfileName :portkey.aws.iam.add-role-to-instance-profile-request/RoleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-service-linked-role-deletion-status-response/status (clojure.spec.alpha/and :portkey.aws.iam/deletion-task-status-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-linked-role-deletion-status-response/reason (clojure.spec.alpha/and :portkey.aws.iam/deletion-task-failure-reason-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-service-linked-role-deletion-status-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-service-linked-role-deletion-status-response/Status] :opt-un [:portkey.aws.iam.get-service-linked-role-deletion-status-response/Reason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/role-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/role-detail))

(clojure.spec.alpha/def :portkey.aws.iam.delete-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-user-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-user-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-user-policy-request/UserName :portkey.aws.iam.delete-user-policy-request/PolicyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/bootstrap-datum clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.iam.role/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/role-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/assume-role-policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/max-session-duration (clojure.spec.alpha/and :portkey.aws.iam/role-max-session-duration-type))
(clojure.spec.alpha/def :portkey.aws.iam/role (portkey.aws/json-keys :req-un [:portkey.aws.iam.role/Path :portkey.aws.iam.role/RoleName :portkey.aws.iam.role/RoleId :portkey.aws.iam.role/Arn :portkey.aws.iam.role/CreateDate] :opt-un [:portkey.aws.iam.role/AssumeRolePolicyDocument :portkey.aws.iam.role/Description :portkey.aws.iam.role/MaxSessionDuration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/resource-handling-option (clojure.spec.alpha/and :portkey.aws.iam/resource-handling-option-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/resource-policy (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/action-names (clojure.spec.alpha/and :portkey.aws.iam/action-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/resource-arns (clojure.spec.alpha/and :portkey.aws.iam/resource-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/context-entries (clojure.spec.alpha/and :portkey.aws.iam/context-entry-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/policy-input-list (clojure.spec.alpha/and :portkey.aws.iam/simulation-policy-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/resource-owner (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/caller-arn (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/simulate-custom-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.simulate-custom-policy-request/PolicyInputList :portkey.aws.iam.simulate-custom-policy-request/ActionNames] :opt-un [:portkey.aws.iam.simulate-custom-policy-request/ResourceHandlingOption :portkey.aws.iam.simulate-custom-policy-request/ResourcePolicy :portkey.aws.iam.simulate-custom-policy-request/Marker :portkey.aws.iam.simulate-custom-policy-request/ResourceArns :portkey.aws.iam.simulate-custom-policy-request/ContextEntries :portkey.aws.iam.simulate-custom-policy-request/ResourceOwner :portkey.aws.iam.simulate-custom-policy-request/MaxItems :portkey.aws.iam.simulate-custom-policy-request/CallerArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-response/access-key-metadata (clojure.spec.alpha/and :portkey.aws.iam/access-key-metadata-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-access-keys-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-access-keys-response/AccessKeyMetadata] :opt-un [:portkey.aws.iam.list-access-keys-response/IsTruncated :portkey.aws.iam.list-access-keys-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/get-policy-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/PolicyVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/action-name-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/action-name-type))

(clojure.spec.alpha/def :portkey.aws.iam.delete-account-alias-request/account-alias (clojure.spec.alpha/and :portkey.aws.iam/account-alias-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-account-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-account-alias-request/AccountAlias] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-user-type-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/boolean-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iam.simulate-policy-response/evaluation-results (clojure.spec.alpha/and :portkey.aws.iam/evaluation-results-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-policy-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-policy-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/simulate-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.simulate-policy-response/EvaluationResults :portkey.aws.iam.simulate-policy-response/IsTruncated :portkey.aws.iam.simulate-policy-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-response/groups (clojure.spec.alpha/and :portkey.aws.iam/group-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-groups-for-user-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-groups-for-user-response/Groups] :opt-un [:portkey.aws.iam.list-groups-for-user-response/IsTruncated :portkey.aws.iam.list-groups-for-user-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.virtualmfadevice/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam.virtualmfadevice/base32-string-seed (clojure.spec.alpha/and :portkey.aws.iam/bootstrap-datum))
(clojure.spec.alpha/def :portkey.aws.iam.virtualmfadevice/qrcodepng (clojure.spec.alpha/and :portkey.aws.iam/bootstrap-datum))
(clojure.spec.alpha/def :portkey.aws.iam.virtualmfadevice/enable-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/virtualmfadevice (portkey.aws/json-keys :req-un [:portkey.aws.iam.virtualmfadevice/SerialNumber] :opt-un [:portkey.aws.iam.virtualmfadevice/Base32StringSeed :portkey.aws.iam.virtualmfadevice/QRCodePNG :portkey.aws.iam/User :portkey.aws.iam.virtualmfadevice/EnableDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-response/certificates (clojure.spec.alpha/and :portkey.aws.iam/certificate-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-signing-certificates-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-signing-certificates-response/Certificates] :opt-un [:portkey.aws.iam.list-signing-certificates-response/IsTruncated :portkey.aws.iam.list-signing-certificates-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.update-assume-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-assume-role-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-assume-role-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-assume-role-policy-request/RoleName :portkey.aws.iam.update-assume-role-policy-request/PolicyDocument] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.duplicatesshpublic-key-exception/message (clojure.spec.alpha/and :portkey.aws.iam/duplicatesshpublic-key-message))
(clojure.spec.alpha/def :portkey.aws.iam/duplicatesshpublic-key-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.duplicatesshpublic-key-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.entity-temporarily-unmodifiable-exception/message (clojure.spec.alpha/and :portkey.aws.iam/entity-temporarily-unmodifiable-message))
(clojure.spec.alpha/def :portkey.aws.iam/entity-temporarily-unmodifiable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.entity-temporarily-unmodifiable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.mfadevice/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.mfadevice/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam.mfadevice/enable-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/mfadevice (portkey.aws/json-keys :req-un [:portkey.aws.iam.mfadevice/UserName :portkey.aws.iam.mfadevice/SerialNumber :portkey.aws.iam.mfadevice/EnableDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.unmodifiable-entity-exception/message (clojure.spec.alpha/and :portkey.aws.iam/unmodifiable-entity-message))
(clojure.spec.alpha/def :portkey.aws.iam/unmodifiable-entity-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.unmodifiable-entity-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-policy-request/PolicyArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-virtualmfadevice-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-virtualmfadevice-request/virtualmfadevice-name (clojure.spec.alpha/and :portkey.aws.iam/virtualmfadevice-name))
(clojure.spec.alpha/def :portkey.aws.iam/create-virtualmfadevice-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-virtualmfadevice-request/VirtualMFADeviceName] :opt-un [:portkey.aws.iam.create-virtualmfadevice-request/Path] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/resource-name-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/resource-name-type))

(clojure.spec.alpha/def :portkey.aws.iam/status-type {"Active" "Active", :active "Active", "Inactive" "Inactive", :inactive "Inactive"})

(clojure.spec.alpha/def :portkey.aws.iam/existing-user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/unmodifiable-entity-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/openidconnect-provider-url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.iam.listmfadevices-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.listmfadevices-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.listmfadevices-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/listmfadevices-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.listmfadevices-request/UserName :portkey.aws.iam.listmfadevices-request/Marker :portkey.aws.iam.listmfadevices-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-instance-profiles-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-instance-profiles-request/PathPrefix :portkey.aws.iam.list-instance-profiles-request/Marker :portkey.aws.iam.list-instance-profiles-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.enablemfadevice-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.enablemfadevice-request/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam.enablemfadevice-request/authentication-code1 (clojure.spec.alpha/and :portkey.aws.iam/authentication-code-type))
(clojure.spec.alpha/def :portkey.aws.iam.enablemfadevice-request/authentication-code2 (clojure.spec.alpha/and :portkey.aws.iam/authentication-code-type))
(clojure.spec.alpha/def :portkey.aws.iam/enablemfadevice-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.enablemfadevice-request/UserName :portkey.aws.iam.enablemfadevice-request/SerialNumber :portkey.aws.iam.enablemfadevice-request/AuthenticationCode1 :portkey.aws.iam.enablemfadevice-request/AuthenticationCode2] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.iam/policy-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-user-policies-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-user-policies-response/PolicyNames] :opt-un [:portkey.aws.iam.list-user-policies-response/IsTruncated :portkey.aws.iam.list-user-policies-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/access-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 16 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.update-signing-certificate-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-signing-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iam/certificate-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-signing-certificate-request/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-signing-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-signing-certificate-request/CertificateId :portkey.aws.iam.update-signing-certificate-request/Status] :opt-un [:portkey.aws.iam.update-signing-certificate-request/UserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-openidconnect-provider-response/url (clojure.spec.alpha/and :portkey.aws.iam/openidconnect-provider-url-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-openidconnect-provider-response/clientidlist (clojure.spec.alpha/and :portkey.aws.iam/clientidlist-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-openidconnect-provider-response/thumbprint-list (clojure.spec.alpha/and :portkey.aws.iam/thumbprint-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-openidconnect-provider-response/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-openidconnect-provider-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.get-openidconnect-provider-response/Url :portkey.aws.iam.get-openidconnect-provider-response/ClientIDList :portkey.aws.iam.get-openidconnect-provider-response/ThumbprintList :portkey.aws.iam.get-openidconnect-provider-response/CreateDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/role-usage-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/role-usage-type))

(clojure.spec.alpha/def :portkey.aws.iam.get-access-key-last-used-request/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-access-key-last-used-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-access-key-last-used-request/AccessKeyId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.key-pair-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.iam/key-pair-mismatch-message))
(clojure.spec.alpha/def :portkey.aws.iam/key-pair-mismatch-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.key-pair-mismatch-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.iam/policy-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-group-policies-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-group-policies-response/PolicyNames] :opt-un [:portkey.aws.iam.list-group-policies-response/IsTruncated :portkey.aws.iam.list-group-policies-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/get-server-certificate-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/ServerCertificate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-policy-request/PolicyArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.iam/malformed-policy-document-message))
(clojure.spec.alpha/def :portkey.aws.iam/malformed-policy-document-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.malformed-policy-document-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-service-specific-credential-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-service-specific-credential-request/service-name (clojure.spec.alpha/and :portkey.aws.iam/service-name))
(clojure.spec.alpha/def :portkey.aws.iam/create-service-specific-credential-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-service-specific-credential-request/UserName :portkey.aws.iam.create-service-specific-credential-request/ServiceName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-policy-version-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-policy-version-request/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-policy-version-request/PolicyArn :portkey.aws.iam.delete-policy-version-request/VersionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-input-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-input-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.invalid-input-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-group-request/GroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/credential-report-not-present-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/service-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/get-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/Policy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-value-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/context-key-value-type))

(clojure.spec.alpha/def :portkey.aws.iam/create-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/Policy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-response/attached-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-group-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-attached-group-policies-response/AttachedPolicies :portkey.aws.iam.list-attached-group-policies-response/IsTruncated :portkey.aws.iam.list-attached-group-policies-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/resource-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iam.listsshpublic-keys-response/sshpublic-keys (clojure.spec.alpha/and :portkey.aws.iam/sshpublic-key-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.listsshpublic-keys-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.listsshpublic-keys-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/listsshpublic-keys-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.listsshpublic-keys-response/SSHPublicKeys :portkey.aws.iam.listsshpublic-keys-response/IsTruncated :portkey.aws.iam.listsshpublic-keys-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/boolean-object-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iam/deletion-task-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.iam.user-detail/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/user-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/user-policy-list (clojure.spec.alpha/and :portkey.aws.iam/policy-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/group-list (clojure.spec.alpha/and :portkey.aws.iam/group-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/attached-managed-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/user-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.user-detail/Path :portkey.aws.iam.user-detail/UserName :portkey.aws.iam.user-detail/UserId :portkey.aws.iam.user-detail/Arn :portkey.aws.iam.user-detail/CreateDate :portkey.aws.iam.user-detail/UserPolicyList :portkey.aws.iam.user-detail/GroupList :portkey.aws.iam.user-detail/AttachedManagedPolicies] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/uploadsshpublic-key-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/SSHPublicKey] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-virtualmfadevice-request/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-virtualmfadevice-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-virtualmfadevice-request/SerialNumber] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/managed-policy-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/managed-policy-detail))

(clojure.spec.alpha/def :portkey.aws.iam/samlmetadata-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1000 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 10000000))))

(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policy-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-policy-versions-request/PolicyArn] :opt-un [:portkey.aws.iam.list-policy-versions-request/Marker :portkey.aws.iam.list-policy-versions-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-policy-version-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-policy-version-request/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-policy-version-request/PolicyArn :portkey.aws.iam.get-policy-version-request/VersionId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.detach-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.detach-role-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/detach-role-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.detach-role-policy-request/RoleName :portkey.aws.iam.detach-role-policy-request/PolicyArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/reason-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.iam.position/line (clojure.spec.alpha/and :portkey.aws.iam/line-number))
(clojure.spec.alpha/def :portkey.aws.iam.position/column (clojure.spec.alpha/and :portkey.aws.iam/column-number))
(clojure.spec.alpha/def :portkey.aws.iam/position (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.position/Line :portkey.aws.iam.position/Column] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/delete-conflict-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/authentication-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 6 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 6)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\d]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/max-items-type (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.iam.getsamlprovider-request/samlprovider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/getsamlprovider-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.getsamlprovider-request/SAMLProviderArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-type-enum {"boolean" "boolean", :binary "binary", :date-list "dateList", :numeric-list "numericList", "numeric" "numeric", :date "date", "booleanList" "booleanList", :boolean-list "booleanList", "string" "string", :ip "ip", "binaryList" "binaryList", :numeric "numeric", "ipList" "ipList", "binary" "binary", :string-list "stringList", :string "string", "numericList" "numericList", "ip" "ip", :ip-list "ipList", "dateList" "dateList", "date" "date", "stringList" "stringList", :binary-list "binaryList", :boolean "boolean"})

(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-account-aliases-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-account-aliases-request/Marker :portkey.aws.iam.list-account-aliases-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-name-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-name-type))

(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-request/filter (clojure.spec.alpha/and :portkey.aws.iam/entity-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-account-authorization-details-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.get-account-authorization-details-request/Filter :portkey.aws.iam.get-account-authorization-details-request/MaxItems :portkey.aws.iam.get-account-authorization-details-request/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/evaluation-results-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/evaluation-result))

(clojure.spec.alpha/def :portkey.aws.iam/assignment-status-type {"Assigned" "Assigned", :assigned "Assigned", "Unassigned" "Unassigned", :unassigned "Unassigned", "Any" "Any", :any "Any"})

(clojure.spec.alpha/def :portkey.aws.iam.listsshpublic-keys-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.listsshpublic-keys-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.listsshpublic-keys-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/listsshpublic-keys-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.listsshpublic-keys-request/UserName :portkey.aws.iam.listsshpublic-keys-request/Marker :portkey.aws.iam.listsshpublic-keys-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/certificate-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/signing-certificate))

(clojure.spec.alpha/def :portkey.aws.iam/clientidlist-type (clojure.spec.alpha/coll-of :portkey.aws.iam/clientidtype))

(clojure.spec.alpha/def :portkey.aws.iam.service-not-supported-exception/message (clojure.spec.alpha/and :portkey.aws.iam/service-not-supported-message))
(clojure.spec.alpha/def :portkey.aws.iam/service-not-supported-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.service-not-supported-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/certificate-body-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 16384)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/upload-server-certificate-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/ServerCertificateMetadata] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/credential-report-not-ready-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.update-login-profile-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-login-profile-request/password (clojure.spec.alpha/and :portkey.aws.iam/password-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-login-profile-request/password-reset-required (clojure.spec.alpha/and :portkey.aws.iam/boolean-object-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-login-profile-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-login-profile-request/UserName] :opt-un [:portkey.aws.iam.update-login-profile-request/Password :portkey.aws.iam.update-login-profile-request/PasswordResetRequired] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/path (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/attachment-count (clojure.spec.alpha/and :portkey.aws.iam/attachment-count-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/is-attachable (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/default-version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/policy-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/description (clojure.spec.alpha/and :portkey.aws.iam/policy-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/update-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/policy-version-list (clojure.spec.alpha/and :portkey.aws.iam/policy-document-version-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/managed-policy-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.managed-policy-detail/PolicyName :portkey.aws.iam.managed-policy-detail/Path :portkey.aws.iam.managed-policy-detail/CreateDate :portkey.aws.iam.managed-policy-detail/AttachmentCount :portkey.aws.iam.managed-policy-detail/IsAttachable :portkey.aws.iam.managed-policy-detail/DefaultVersionId :portkey.aws.iam.managed-policy-detail/PolicyId :portkey.aws.iam.managed-policy-detail/Description :portkey.aws.iam.managed-policy-detail/UpdateDate :portkey.aws.iam.managed-policy-detail/Arn :portkey.aws.iam.managed-policy-detail/PolicyVersionList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-openidconnect-providers-response/openidconnect-provider-list (clojure.spec.alpha/and :portkey.aws.iam/openidconnect-provider-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-openidconnect-providers-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-openidconnect-providers-response/OpenIDConnectProviderList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/scope (clojure.spec.alpha/and :portkey.aws.iam/policy-scope-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/only-attached (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policies-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-policies-request/Scope :portkey.aws.iam.list-policies-request/OnlyAttached :portkey.aws.iam.list-policies-request/PathPrefix :portkey.aws.iam.list-policies-request/Marker :portkey.aws.iam.list-policies-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/eval-decision-details-type (clojure.spec.alpha/map-of :portkey.aws.iam/eval-decision-source-type :portkey.aws.iam/policy-evaluation-decision-type))

(clojure.spec.alpha/def :portkey.aws.iam.access-key-metadata/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key-metadata/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key-metadata/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key-metadata/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/access-key-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.access-key-metadata/UserName :portkey.aws.iam.access-key-metadata/AccessKeyId :portkey.aws.iam.access-key-metadata/Status :portkey.aws.iam.access-key-metadata/CreateDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-not-attachable-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/certificate-chain-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 2097152)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/policy-group-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-group))

(clojure.spec.alpha/def :portkey.aws.iam/update-role-description-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/Role] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.change-password-request/old-password (clojure.spec.alpha/and :portkey.aws.iam/password-type))
(clojure.spec.alpha/def :portkey.aws.iam.change-password-request/new-password (clojure.spec.alpha/and :portkey.aws.iam/password-type))
(clojure.spec.alpha/def :portkey.aws.iam/change-password-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.change-password-request/OldPassword :portkey.aws.iam.change-password-request/NewPassword] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-response/account-aliases (clojure.spec.alpha/and :portkey.aws.iam/account-alias-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-account-aliases-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-account-aliases-response/AccountAliases] :opt-un [:portkey.aws.iam.list-account-aliases-response/IsTruncated :portkey.aws.iam.list-account-aliases-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/certificate-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 24 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.create-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-instance-profile-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-instance-profile-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-instance-profile-request/InstanceProfileName] :opt-un [:portkey.aws.iam.create-instance-profile-request/Path] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.listsamlproviders-response/samlprovider-list (clojure.spec.alpha/and :portkey.aws.iam/samlprovider-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/listsamlproviders-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.listsamlproviders-response/SAMLProviderList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-openidconnect-provider-request/url (clojure.spec.alpha/and :portkey.aws.iam/openidconnect-provider-url-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-openidconnect-provider-request/clientidlist (clojure.spec.alpha/and :portkey.aws.iam/clientidlist-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-openidconnect-provider-request/thumbprint-list (clojure.spec.alpha/and :portkey.aws.iam/thumbprint-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-openidconnect-provider-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-openidconnect-provider-request/Url :portkey.aws.iam.create-openidconnect-provider-request/ThumbprintList] :opt-un [:portkey.aws.iam.create-openidconnect-provider-request/ClientIDList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-names-result-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/context-key-name-type))

(clojure.spec.alpha/def :portkey.aws.iam.resyncmfadevice-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.resyncmfadevice-request/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam.resyncmfadevice-request/authentication-code1 (clojure.spec.alpha/and :portkey.aws.iam/authentication-code-type))
(clojure.spec.alpha/def :portkey.aws.iam.resyncmfadevice-request/authentication-code2 (clojure.spec.alpha/and :portkey.aws.iam/authentication-code-type))
(clojure.spec.alpha/def :portkey.aws.iam/resyncmfadevice-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.resyncmfadevice-request/UserName :portkey.aws.iam.resyncmfadevice-request/SerialNumber :portkey.aws.iam.resyncmfadevice-request/AuthenticationCode1 :portkey.aws.iam.resyncmfadevice-request/AuthenticationCode2] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/thumbprint-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/thumbprint-type))

(clojure.spec.alpha/def :portkey.aws.iam.delete-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-instance-profile-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-instance-profile-request/InstanceProfileName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 20 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 5 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iam.list-groups-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-groups-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-groups-request/PathPrefix :portkey.aws.iam.list-groups-request/Marker :portkey.aws.iam.list-groups-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-user-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-user-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-user-request/UserName] :opt-un [:portkey.aws.iam.create-user-request/Path] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/service-not-supported-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.policy-group/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-group/group-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.policy-group/GroupName :portkey.aws.iam.policy-group/GroupId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-groups-for-user-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-groups-for-user-request/UserName] :opt-un [:portkey.aws.iam.list-groups-for-user-request/Marker :portkey.aws.iam.list-groups-for-user-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-public-key-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.remove-clientidfrom-openidconnect-provider-request/openidconnect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.remove-clientidfrom-openidconnect-provider-request/clientid (clojure.spec.alpha/and :portkey.aws.iam/clientidtype))
(clojure.spec.alpha/def :portkey.aws.iam/remove-clientidfrom-openidconnect-provider-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.remove-clientidfrom-openidconnect-provider-request/OpenIDConnectProviderArn :portkey.aws.iam.remove-clientidfrom-openidconnect-provider-request/ClientID] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/region-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.iam/get-account-password-policy-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/PasswordPolicy] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/create-group-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/Group] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-instance-profiles-for-role-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-instance-profiles-for-role-request/RoleName] :opt-un [:portkey.aws.iam.list-instance-profiles-for-role-request/Marker :portkey.aws.iam.list-instance-profiles-for-role-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-user-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-user-policy-request/UserName :portkey.aws.iam.get-user-policy-request/PolicyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/malformed-policy-document-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.signing-certificate/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.signing-certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iam/certificate-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.signing-certificate/certificate-body (clojure.spec.alpha/and :portkey.aws.iam/certificate-body-type))
(clojure.spec.alpha/def :portkey.aws.iam.signing-certificate/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.signing-certificate/upload-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/signing-certificate (portkey.aws/json-keys :req-un [:portkey.aws.iam.signing-certificate/UserName :portkey.aws.iam.signing-certificate/CertificateId :portkey.aws.iam.signing-certificate/CertificateBody :portkey.aws.iam.signing-certificate/Status] :opt-un [:portkey.aws.iam.signing-certificate/UploadDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.put-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-user-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-user-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/put-user-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.put-user-policy-request/UserName :portkey.aws.iam.put-user-policy-request/PolicyName :portkey.aws.iam.put-user-policy-request/PolicyDocument] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/report-state-description-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.upload-signing-certificate-response/certificate (clojure.spec.alpha/and :portkey.aws.iam/signing-certificate))
(clojure.spec.alpha/def :portkey.aws.iam/upload-signing-certificate-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.upload-signing-certificate-response/Certificate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-group-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-group-request/GroupName] :opt-un [:portkey.aws.iam.create-group-request/Path] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/private-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 16384)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/report-format-type {"text/csv" "text/csv", :text/csv "text/csv"})

(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.iam/policy-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-role-policies-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-role-policies-response/PolicyNames] :opt-un [:portkey.aws.iam.list-role-policies-response/IsTruncated :portkey.aws.iam.list-role-policies-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-instance-profile-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-instance-profile-request/InstanceProfileName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.role-detail/role-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/instance-profile-list (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/assume-role-policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/role-policy-list (clojure.spec.alpha/and :portkey.aws.iam/policy-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/attached-managed-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/role-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.role-detail/RoleId :portkey.aws.iam.role-detail/InstanceProfileList :portkey.aws.iam.role-detail/AssumeRolePolicyDocument :portkey.aws.iam.role-detail/Path :portkey.aws.iam.role-detail/RoleName :portkey.aws.iam.role-detail/CreateDate :portkey.aws.iam.role-detail/RolePolicyList :portkey.aws.iam.role-detail/Arn :portkey.aws.iam.role-detail/AttachedManagedPolicies] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/reset-service-specific-credential-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/ServiceSpecificCredential] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/service-specific-credentials-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/service-specific-credential-metadata))

(clojure.spec.alpha/def :portkey.aws.iam/server-certificate-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.attach-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.attach-role-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attach-role-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.attach-role-policy-request/RoleName :portkey.aws.iam.attach-role-policy-request/PolicyArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/serial-number-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 9 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=/:,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/role-description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1000)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/policy-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-detail))

(clojure.spec.alpha/def :portkey.aws.iam.list-service-specific-credentials-response/service-specific-credentials (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credentials-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-service-specific-credentials-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-service-specific-credentials-response/ServiceSpecificCredentials] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-user-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-user-request/UserName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.policy/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/path (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/attachment-count (clojure.spec.alpha/and :portkey.aws.iam/attachment-count-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/is-attachable (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/default-version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/policy-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/description (clojure.spec.alpha/and :portkey.aws.iam/policy-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/update-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.policy/PolicyName :portkey.aws.iam.policy/Path :portkey.aws.iam.policy/CreateDate :portkey.aws.iam.policy/AttachmentCount :portkey.aws.iam.policy/IsAttachable :portkey.aws.iam.policy/DefaultVersionId :portkey.aws.iam.policy/PolicyId :portkey.aws.iam.policy/Description :portkey.aws.iam.policy/UpdateDate :portkey.aws.iam.policy/Arn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-service-specific-credentials-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-service-specific-credentials-request/service-name (clojure.spec.alpha/and :portkey.aws.iam/service-name))
(clojure.spec.alpha/def :portkey.aws.iam/list-service-specific-credentials-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-service-specific-credentials-request/UserName :portkey.aws.iam.list-service-specific-credentials-request/ServiceName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.add-clientidto-openidconnect-provider-request/openidconnect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.add-clientidto-openidconnect-provider-request/clientid (clojure.spec.alpha/and :portkey.aws.iam/clientidtype))
(clojure.spec.alpha/def :portkey.aws.iam/add-clientidto-openidconnect-provider-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.add-clientidto-openidconnect-provider-request/OpenIDConnectProviderArn :portkey.aws.iam.add-clientidto-openidconnect-provider-request/ClientID] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.organizations-decision-detail/allowed-by-organizations (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam/organizations-decision-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.organizations-decision-detail/AllowedByOrganizations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.upload-server-certificate-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-server-certificate-request/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-server-certificate-request/certificate-body (clojure.spec.alpha/and :portkey.aws.iam/certificate-body-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-server-certificate-request/private-key (clojure.spec.alpha/and :portkey.aws.iam/private-key-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-server-certificate-request/certificate-chain (clojure.spec.alpha/and :portkey.aws.iam/certificate-chain-type))
(clojure.spec.alpha/def :portkey.aws.iam/upload-server-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.upload-server-certificate-request/ServerCertificateName :portkey.aws.iam.upload-server-certificate-request/CertificateBody :portkey.aws.iam.upload-server-certificate-request/PrivateKey] :opt-un [:portkey.aws.iam.upload-server-certificate-request/Path :portkey.aws.iam.upload-server-certificate-request/CertificateChain] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/create-access-key-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/AccessKey] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/access-key-metadata-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/access-key-metadata))

(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-group-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-group-policy-request/GroupName :portkey.aws.iam.get-group-policy-request/PolicyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/create-login-profile-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/LoginProfile] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/password-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-role-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-attached-role-policies-request/RoleName] :opt-un [:portkey.aws.iam.list-attached-role-policies-request/PathPrefix :portkey.aws.iam.list-attached-role-policies-request/Marker :portkey.aws.iam.list-attached-role-policies-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/arn-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/arn-type))

(clojure.spec.alpha/def :portkey.aws.iam.get-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-group-request/GroupName] :opt-un [:portkey.aws.iam.get-group-request/Marker :portkey.aws.iam.get-group-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/duplicatesshpublic-key-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-response/instance-profiles (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-instance-profiles-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-instance-profiles-response/InstanceProfiles] :opt-un [:portkey.aws.iam.list-instance-profiles-response/IsTruncated :portkey.aws.iam.list-instance-profiles-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/service-user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 17 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 200)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-response/policy-groups (clojure.spec.alpha/and :portkey.aws.iam/policy-group-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-response/policy-users (clojure.spec.alpha/and :portkey.aws.iam/policy-user-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-response/policy-roles (clojure.spec.alpha/and :portkey.aws.iam/policy-role-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-entities-for-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-entities-for-policy-response/PolicyGroups :portkey.aws.iam.list-entities-for-policy-response/PolicyUsers :portkey.aws.iam.list-entities-for-policy-response/PolicyRoles :portkey.aws.iam.list-entities-for-policy-response/IsTruncated :portkey.aws.iam.list-entities-for-policy-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/mfa-device-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/mfadevice))

(clojure.spec.alpha/def :portkey.aws.iam/minimum-password-length-type (clojure.spec.alpha/int-in 6 128))

(clojure.spec.alpha/def :portkey.aws.iam.update-service-specific-credential-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-service-specific-credential-request/service-specific-credential-id (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credential-id))
(clojure.spec.alpha/def :portkey.aws.iam.update-service-specific-credential-request/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-service-specific-credential-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-service-specific-credential-request/ServiceSpecificCredentialId :portkey.aws.iam.update-service-specific-credential-request/Status] :opt-un [:portkey.aws.iam.update-service-specific-credential-request/UserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-path-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"((/[A-Za-z0-9\.,\+@=_-]+)*)/" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/entity-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/entity-type))

(clojure.spec.alpha/def :portkey.aws.iam.policy-detail/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-detail/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.policy-detail/PolicyName :portkey.aws.iam.policy-detail/PolicyDocument] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.update-openidconnect-provider-thumbprint-request/openidconnect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-openidconnect-provider-thumbprint-request/thumbprint-list (clojure.spec.alpha/and :portkey.aws.iam/thumbprint-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-openidconnect-provider-thumbprint-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-openidconnect-provider-thumbprint-request/OpenIDConnectProviderArn :portkey.aws.iam.update-openidconnect-provider-thumbprint-request/ThumbprintList] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/create-virtualmfadevice-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/VirtualMFADevice] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iam/policy-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-policies-response/Policies :portkey.aws.iam.list-policies-response/IsTruncated :portkey.aws.iam.list-policies-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.password-policy-violation-exception/message (clojure.spec.alpha/and :portkey.aws.iam/password-policy-violation-message))
(clojure.spec.alpha/def :portkey.aws.iam/password-policy-violation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.password-policy-violation-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.openidconnect-provider-list-entry/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/openidconnect-provider-list-entry (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.openidconnect-provider-list-entry/Arn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/summary-value-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam.delete-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-role-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-role-request/RoleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.getsshpublic-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.getsshpublic-key-request/sshpublic-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.getsshpublic-key-request/encoding (clojure.spec.alpha/and :portkey.aws.iam/encoding-type))
(clojure.spec.alpha/def :portkey.aws.iam/getsshpublic-key-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.getsshpublic-key-request/UserName :portkey.aws.iam.getsshpublic-key-request/SSHPublicKeyId :portkey.aws.iam.getsshpublic-key-request/Encoding] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/resource-handling-option (clojure.spec.alpha/and :portkey.aws.iam/resource-handling-option-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/policy-source-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/resource-policy (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/action-names (clojure.spec.alpha/and :portkey.aws.iam/action-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/resource-arns (clojure.spec.alpha/and :portkey.aws.iam/resource-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/context-entries (clojure.spec.alpha/and :portkey.aws.iam/context-entry-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/policy-input-list (clojure.spec.alpha/and :portkey.aws.iam/simulation-policy-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/resource-owner (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/caller-arn (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/simulate-principal-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.simulate-principal-policy-request/PolicySourceArn :portkey.aws.iam.simulate-principal-policy-request/ActionNames] :opt-un [:portkey.aws.iam.simulate-principal-policy-request/ResourceHandlingOption :portkey.aws.iam.simulate-principal-policy-request/ResourcePolicy :portkey.aws.iam.simulate-principal-policy-request/Marker :portkey.aws.iam.simulate-principal-policy-request/ResourceArns :portkey.aws.iam.simulate-principal-policy-request/ContextEntries :portkey.aws.iam.simulate-principal-policy-request/PolicyInputList :portkey.aws.iam.simulate-principal-policy-request/ResourceOwner :portkey.aws.iam.simulate-principal-policy-request/MaxItems :portkey.aws.iam.simulate-principal-policy-request/CallerArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.update-access-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-access-key-request/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-access-key-request/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-access-key-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-access-key-request/AccessKeyId :portkey.aws.iam.update-access-key-request/Status] :opt-un [:portkey.aws.iam.update-access-key-request/UserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-authentication-code-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-authentication-code-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-authentication-code-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.invalid-authentication-code-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/role-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/role))

(clojure.spec.alpha/def :portkey.aws.iam/public-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 20 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.group/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.group/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.group/group-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.group/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.group/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/group (portkey.aws/json-keys :req-un [:portkey.aws.iam.group/Path :portkey.aws.iam.group/GroupName :portkey.aws.iam.group/GroupId :portkey.aws.iam.group/Arn :portkey.aws.iam.group/CreateDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/group-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/group-detail))

(clojure.spec.alpha/def :portkey.aws.iam.getsamlprovider-response/samlmetadata-document (clojure.spec.alpha/and :portkey.aws.iam/samlmetadata-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.getsamlprovider-response/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.getsamlprovider-response/valid-until (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/getsamlprovider-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.getsamlprovider-response/SAMLMetadataDocument :portkey.aws.iam.getsamlprovider-response/CreateDate :portkey.aws.iam.getsamlprovider-response/ValidUntil] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.deletion-task-failure-reason-type/reason (clojure.spec.alpha/and :portkey.aws.iam/reason-type))
(clojure.spec.alpha/def :portkey.aws.iam.deletion-task-failure-reason-type/role-usage-list (clojure.spec.alpha/and :portkey.aws.iam/role-usage-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/deletion-task-failure-reason-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.deletion-task-failure-reason-type/Reason :portkey.aws.iam.deletion-task-failure-reason-type/RoleUsageList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.sshpublic-key-metadata/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.sshpublic-key-metadata/sshpublic-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.sshpublic-key-metadata/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.sshpublic-key-metadata/upload-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/sshpublic-key-metadata (portkey.aws/json-keys :req-un [:portkey.aws.iam.sshpublic-key-metadata/UserName :portkey.aws.iam.sshpublic-key-metadata/SSHPublicKeyId :portkey.aws.iam.sshpublic-key-metadata/Status :portkey.aws.iam.sshpublic-key-metadata/UploadDate] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.deletesshpublic-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.deletesshpublic-key-request/sshpublic-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/deletesshpublic-key-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.deletesshpublic-key-request/UserName :portkey.aws.iam.deletesshpublic-key-request/SSHPublicKeyId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/path-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 512)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"(\u002F)|(\u002F[\u0021-\u007F]+\u002F)" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.updatesshpublic-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.updatesshpublic-key-request/sshpublic-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.updatesshpublic-key-request/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/updatesshpublic-key-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.updatesshpublic-key-request/UserName :portkey.aws.iam.updatesshpublic-key-request/SSHPublicKeyId :portkey.aws.iam.updatesshpublic-key-request/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-openidconnect-provider-request/openidconnect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-openidconnect-provider-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-openidconnect-provider-request/OpenIDConnectProviderArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/group-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/group))

(clojure.spec.alpha/def :portkey.aws.iam.delete-service-specific-credential-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-service-specific-credential-request/service-specific-credential-id (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credential-id))
(clojure.spec.alpha/def :portkey.aws.iam/delete-service-specific-credential-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-service-specific-credential-request/ServiceSpecificCredentialId] :opt-un [:portkey.aws.iam.delete-service-specific-credential-request/UserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-evaluation-decision-type {"allowed" "allowed", :allowed "allowed", "explicitDeny" "explicitDeny", :explicit-deny "explicitDeny", "implicitDeny" "implicitDeny", :implicit-deny "implicitDeny"})

(clojure.spec.alpha/def :portkey.aws.iam/entity-already-exists-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/entity-type {:role "Role", :awsmanaged-policy "AWSManagedPolicy", :local-managed-policy "LocalManagedPolicy", :group "Group", "LocalManagedPolicy" "LocalManagedPolicy", "User" "User", "Role" "Role", "AWSManagedPolicy" "AWSManagedPolicy", "Group" "Group", :user "User"})

(clojure.spec.alpha/def :portkey.aws.iam/openidconnect-provider-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/openidconnect-provider-list-entry))

(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/service-name (clojure.spec.alpha/and :portkey.aws.iam/service-name))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/service-user-name (clojure.spec.alpha/and :portkey.aws.iam/service-user-name))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/service-password (clojure.spec.alpha/and :portkey.aws.iam/service-password))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/service-specific-credential-id (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credential-id))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/service-specific-credential (portkey.aws/json-keys :req-un [:portkey.aws.iam.service-specific-credential/CreateDate :portkey.aws.iam.service-specific-credential/ServiceName :portkey.aws.iam.service-specific-credential/ServiceUserName :portkey.aws.iam.service-specific-credential/ServicePassword :portkey.aws.iam.service-specific-credential/ServiceSpecificCredentialId :portkey.aws.iam.service-specific-credential/UserName :portkey.aws.iam.service-specific-credential/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-response/attached-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-user-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.list-attached-user-policies-response/AttachedPolicies :portkey.aws.iam.list-attached-user-policies-response/IsTruncated :portkey.aws.iam.list-attached-user-policies-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/limit-exceeded-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.update-server-certificate-request/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-server-certificate-request/new-path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-server-certificate-request/new-server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-server-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-server-certificate-request/ServerCertificateName] :opt-un [:portkey.aws.iam.update-server-certificate-request/NewPath :portkey.aws.iam.update-server-certificate-request/NewServerCertificateName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/resource-specific-result-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/resource-specific-result))

(clojure.spec.alpha/def :portkey.aws.iam.delete-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-role-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-role-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-role-policy-request/RoleName :portkey.aws.iam.delete-role-policy-request/PolicyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.upload-signing-certificate-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-signing-certificate-request/certificate-body (clojure.spec.alpha/and :portkey.aws.iam/certificate-body-type))
(clojure.spec.alpha/def :portkey.aws.iam/upload-signing-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.upload-signing-certificate-request/CertificateBody] :opt-un [:portkey.aws.iam.upload-signing-certificate-request/UserName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.access-key/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key/secret-access-key (clojure.spec.alpha/and :portkey.aws.iam/access-key-secret-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/access-key (portkey.aws/json-keys :req-un [:portkey.aws.iam.access-key/UserName :portkey.aws.iam.access-key/AccessKeyId :portkey.aws.iam.access-key/Status :portkey.aws.iam.access-key/SecretAccessKey] :opt-un [:portkey.aws.iam.access-key/CreateDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-users-response/users (clojure.spec.alpha/and :portkey.aws.iam/user-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-users-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-users-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-users-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-users-response/Users] :opt-un [:portkey.aws.iam.list-users-response/IsTruncated :portkey.aws.iam.list-users-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-authentication-code-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/create-policy-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam/PolicyVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/role-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.attach-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.attach-user-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attach-user-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.attach-user-policy-request/UserName :portkey.aws.iam.attach-user-policy-request/PolicyArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-user-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-user-policies-request/UserName] :opt-un [:portkey.aws.iam.list-user-policies-request/Marker :portkey.aws.iam.list-user-policies-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/user-detail-list (clojure.spec.alpha/and :portkey.aws.iam/user-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/group-detail-list (clojure.spec.alpha/and :portkey.aws.iam/group-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/role-detail-list (clojure.spec.alpha/and :portkey.aws.iam/role-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/policies (clojure.spec.alpha/and :portkey.aws.iam/managed-policy-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-account-authorization-details-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.get-account-authorization-details-response/UserDetailList :portkey.aws.iam.get-account-authorization-details-response/GroupDetailList :portkey.aws.iam.get-account-authorization-details-response/RoleDetailList :portkey.aws.iam.get-account-authorization-details-response/Policies :portkey.aws.iam.get-account-authorization-details-response/IsTruncated :portkey.aws.iam.get-account-authorization-details-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.get-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-role-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-role-request/RoleName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.update-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-role-request/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-role-request/max-session-duration (clojure.spec.alpha/and :portkey.aws.iam/role-max-session-duration-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-role-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-role-request/RoleName] :opt-un [:portkey.aws.iam.update-role-request/Description :portkey.aws.iam.update-role-request/MaxSessionDuration] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.delete-service-linked-role-response/deletion-task-id (clojure.spec.alpha/and :portkey.aws.iam/deletion-task-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-service-linked-role-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.delete-service-linked-role-response/DeletionTaskId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.updatesamlprovider-request/samlmetadata-document (clojure.spec.alpha/and :portkey.aws.iam/samlmetadata-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.updatesamlprovider-request/samlprovider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/updatesamlprovider-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.updatesamlprovider-request/SAMLMetadataDocument :portkey.aws.iam.updatesamlprovider-request/SAMLProviderArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/policy-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy))

(clojure.spec.alpha/def :portkey.aws.iam.list-virtualmfadevices-response/virtualmfadevices (clojure.spec.alpha/and :portkey.aws.iam/virtualmfadevice-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-virtualmfadevices-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-virtualmfadevices-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-virtualmfadevices-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.list-virtualmfadevices-response/VirtualMFADevices] :opt-un [:portkey.aws.iam.list-virtualmfadevices-response/IsTruncated :portkey.aws.iam.list-virtualmfadevices-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.update-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-group-request/new-path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-group-request/new-group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-group-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.update-group-request/GroupName] :opt-un [:portkey.aws.iam.update-group-request/NewPath :portkey.aws.iam.update-group-request/NewGroupName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.create-policy-version-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-policy-version-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-policy-version-request/set-as-default (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-policy-version-request (portkey.aws/json-keys :req-un [:portkey.aws.iam.create-policy-version-request/PolicyArn :portkey.aws.iam.create-policy-version-request/PolicyDocument] :opt-un [:portkey.aws.iam.create-policy-version-request/SetAsDefault] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/report-content-type clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.iam/service-password (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-response/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-user-policy-response (portkey.aws/json-keys :req-un [:portkey.aws.iam.get-user-policy-response/UserName :portkey.aws.iam.get-user-policy-response/PolicyName :portkey.aws.iam.get-user-policy-response/PolicyDocument] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/get-user-response (portkey.aws/json-keys :req-un [:portkey.aws.iam/User] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam.group-detail/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/group-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/group-policy-list (clojure.spec.alpha/and :portkey.aws.iam/policy-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/attached-managed-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/group-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.iam.group-detail/Path :portkey.aws.iam.group-detail/GroupName :portkey.aws.iam.group-detail/GroupId :portkey.aws.iam.group-detail/Arn :portkey.aws.iam.group-detail/CreateDate :portkey.aws.iam.group-detail/GroupPolicyList :portkey.aws.iam.group-detail/AttachedManagedPolicies] :locations {}))

(clojure.spec.alpha/def :portkey.aws.iam/service-failure-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn list-attached-user-policies "Lists all managed policies that are attached to the specified IAM user.\n An IAM user can also have inline policies embedded with it. To list the inline\npolicies for a user, use the ListUserPolicies API. For information about\npolicies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n You can paginate the results using the MaxItems and Marker parameters. You can\nuse the PathPrefix parameter to limit the list of policies to only those\nmatching the specified path prefix. If there are no policies attached to the\nspecified group (or none that match the specified path prefix), the operation\nreturns an empty list." ([list-attached-user-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-attached-user-policies-request "ListAttachedUserPolicies" list-attached-user-policies-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-attached-user-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-attached-user-policies-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-attached-user-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-attached-user-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-attached-user-policies-response))

(clojure.core/defn getsshpublic-key "Retrieves the specified SSH public key, including metadata about the key.\n The SSH public key retrieved by this operation is used only for authenticating\nthe associated IAM user to an AWS CodeCommit repository. For more information\nabout using SSH keys to authenticate to an AWS CodeCommit repository, see Set up\nAWS CodeCommit for SSH Connections\n(http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html)\nin the AWS CodeCommit User Guide." ([getsshpublic-key-request] (clojure.core/let [req<-input__36755__auto__ (req<-getsshpublic-key-request "GetSSHPublicKey" getsshpublic-key-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/getsshpublic-key-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/getsshpublic-key-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnrecognizedPublicKeyEncodingException" :portkey.aws.iam/unrecognized-public-key-encoding-exception}))))
(clojure.spec.alpha/fdef getsshpublic-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/getsshpublic-key-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/getsshpublic-key-response))

(clojure.core/defn create-service-specific-credential "Generates a set of credentials consisting of a user name and password that can\nbe used to access the service specified in the request. These credentials are\ngenerated by IAM, and can be used only for the specified service.\n You can have a maximum of two sets of service-specific credentials for each\nsupported service per user.\n The only supported service at this time is AWS CodeCommit.\n You can reset the password to a new service-generated value by calling\nResetServiceSpecificCredential.\n For more information about service-specific credentials, see Using IAM with AWS\nCodeCommit: Git Credentials, SSH Keys, and AWS Access Keys\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_ssh-keys.html)\nin the IAM User Guide." ([create-service-specific-credential-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-service-specific-credential-request "CreateServiceSpecificCredential" create-service-specific-credential-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-service-specific-credential-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-service-specific-credential-response {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceNotSupportedException" :portkey.aws.iam/service-not-supported-exception}))))
(clojure.spec.alpha/fdef create-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-service-specific-credential-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-service-specific-credential-response))

(clojure.core/defn list-signing-certificates "Returns information about the signing certificates associated with the specified\nIAM user. If there are none, the operation returns an empty list.\n Although each user is limited to a small number of signing certificates, you\ncan still paginate the results using the MaxItems and Marker parameters.\n If the UserName field is not specified, the user name is determined implicitly\nbased on the AWS access key ID used to sign the request for this API. Because\nthis operation works for access keys under the AWS account, you can use this\noperation to manage AWS account root user credentials even if the AWS account\nhas no associated users." ([] (list-signing-certificates {})) ([list-signing-certificates-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-signing-certificates-request "ListSigningCertificates" list-signing-certificates-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-signing-certificates-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-signing-certificates-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-signing-certificates :args (clojure.spec.alpha/? :portkey.aws.iam/list-signing-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-signing-certificates-response))

(clojure.core/defn list-attached-group-policies "Lists all managed policies that are attached to the specified IAM group.\n An IAM group can also have inline policies embedded with it. To list the inline\npolicies for a group, use the ListGroupPolicies API. For information about\npolicies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n You can paginate the results using the MaxItems and Marker parameters. You can\nuse the PathPrefix parameter to limit the list of policies to only those\nmatching the specified path prefix. If there are no policies attached to the\nspecified group (or none that match the specified path prefix), the operation\nreturns an empty list." ([list-attached-group-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-attached-group-policies-request "ListAttachedGroupPolicies" list-attached-group-policies-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-attached-group-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-attached-group-policies-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-attached-group-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-attached-group-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-attached-group-policies-response))

(clojure.core/defn detach-group-policy "Removes the specified managed policy from the specified IAM group.\n A group can also have inline policies embedded with it. To delete an inline\npolicy, use the DeleteGroupPolicy API. For information about policies, see\nManaged Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([detach-group-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-detach-group-policy-request "DetachGroupPolicy" detach-group-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/detach-group-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef detach-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/detach-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-policy-versions "Lists information about the versions of the specified managed policy, including\nthe version that is currently set as the policy's default version.\n For more information about managed policies, see Managed Policies and Inline\nPolicies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([list-policy-versions-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-policy-versions-request "ListPolicyVersions" list-policy-versions-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-policy-versions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-policy-versions-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-policy-versions :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-policy-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-policy-versions-response))

(clojure.core/defn delete-policy-version "Deletes the specified version from the specified managed policy.\n You cannot delete the default version from a policy using this API. To delete\nthe default version from a policy, use DeletePolicy. To find out which version\nof a policy is marked as the default version, use ListPolicyVersions.\n For information about versions for managed policies, see Versioning for Managed\nPolicies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html)\nin the IAM User Guide." ([delete-policy-version-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-policy-version-request "DeletePolicyVersion" delete-policy-version-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-policy-version-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn delete-account-alias " Deletes the specified AWS account alias. For information about using an AWS\naccount alias, see Using an Alias for Your AWS Account ID\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html) in the IAM\nUser Guide." ([delete-account-alias-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-account-alias-request "DeleteAccountAlias" delete-account-alias-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-account-alias-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-account-alias :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-account-alias-request) :ret clojure.core/true?)

(clojure.core/defn attach-role-policy "Attaches the specified managed policy to the specified IAM role. When you attach\na managed policy to a role, the managed policy becomes part of the role's\npermission (access) policy.\n You cannot use a managed policy as the role's trust policy. The role's trust\npolicy is created at the same time as the role, using CreateRole. You can update\na role's trust policy using UpdateAssumeRolePolicy.\n Use this API to attach a managed policy to a role. To embed an inline policy in\na role, use PutRolePolicy. For more information about policies, see Managed\nPolicies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([attach-role-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-attach-role-policy-request "AttachRolePolicy" attach-role-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/attach-role-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef attach-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/attach-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn delete-server-certificate "Deletes the specified server certificate.\n For more information about working with server certificates, see Working with\nServer Certificates\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html)\nin the IAM User Guide. This topic also includes a list of AWS services that can\nuse the server certificates that you manage with IAM.\n If you are using a server certificate with Elastic Load Balancing, deleting the\ncertificate could have implications for your application. If Elastic Load\nBalancing doesn't detect the deletion of bound certificates, it may continue to\nuse the certificates. This could cause Elastic Load Balancing to stop accepting\ntraffic. We recommend that you remove the reference to the certificate from\nElastic Load Balancing before using this command to delete the certificate. For\nmore information, go to DeleteLoadBalancerListeners\n(http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html)\nin the Elastic Load Balancing API Reference." ([delete-server-certificate-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-server-certificate-request "DeleteServerCertificate" delete-server-certificate-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-server-certificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-server-certificate-request) :ret clojure.core/true?)

(clojure.core/defn updatesamlprovider "Updates the metadata document for an existing SAML provider resource object.\n This operation requires Signature Version 4\n(http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html)." ([updatesamlprovider-request] (clojure.core/let [req<-input__36755__auto__ (req<-updatesamlprovider-request "UpdateSAMLProvider" updatesamlprovider-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/updatesamlprovider-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/updatesamlprovider-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef updatesamlprovider :args (clojure.spec.alpha/tuple :portkey.aws.iam/updatesamlprovider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/updatesamlprovider-response))

(clojure.core/defn delete-group "Deletes the specified IAM group. The group must not contain any users or have\nany attached policies." ([delete-group-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-group-request "DeleteGroup" delete-group-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-group-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-group-request) :ret clojure.core/true?)

(clojure.core/defn update-login-profile "Changes the password for the specified IAM user.\n IAM users can change their own passwords by calling ChangePassword. For more\ninformation about modifying passwords, see Managing Passwords\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in\nthe IAM User Guide." ([update-login-profile-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-login-profile-request "UpdateLoginProfile" update-login-profile-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-login-profile-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "PasswordPolicyViolationException" :portkey.aws.iam/password-policy-violation-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-login-profile-request) :ret clojure.core/true?)

(clojure.core/defn update-account-password-policy "Updates the password policy settings for the AWS account.\n * This operation does not support partial updates. No parameters are required,\nbut if you do not specify a parameter, that parameter's value reverts to its\ndefault value. See the Request Parameters section for each parameter's default\nvalue. Also note that some parameters do not allow the default parameter to be\nexplicitly set. Instead, to invoke the default value, do not include that\nparameter when you invoke the operation.\n For more information about using a password policy, see Managing an IAM\nPassword Policy\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html)\nin the IAM User Guide." ([] (update-account-password-policy {})) ([update-account-password-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-account-password-policy-request "UpdateAccountPasswordPolicy" update-account-password-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-account-password-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-account-password-policy :args (clojure.spec.alpha/? :portkey.aws.iam/update-account-password-policy-request) :ret clojure.core/true?)

(clojure.core/defn deactivatemfadevice "Deactivates the specified MFA device and removes it from association with the\nuser name for which it was originally enabled.\n For more information about creating and working with virtual MFA devices, go to\nUsing a Virtual MFA Device\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html) in the\nIAM User Guide." ([deactivatemfadevice-request] (clojure.core/let [req<-input__36755__auto__ (req<-deactivatemfadevice-request "DeactivateMFADevice" deactivatemfadevice-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/deactivatemfadevice-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef deactivatemfadevice :args (clojure.spec.alpha/tuple :portkey.aws.iam/deactivatemfadevice-request) :ret clojure.core/true?)

(clojure.core/defn get-policy-version "Retrieves information about the specified version of the specified managed\npolicy, including the policy document.\n Policies returned by this API are URL-encoded compliant with RFC 3986\n(https://tools.ietf.org/html/rfc3986). You can use a URL decoding method to\nconvert the policy back to plain JSON text. For example, if you use Java, you\ncan use the decode method of the java.net.URLDecoder utility class in the Java\nSDK. Other languages and SDKs provide similar functionality.\n To list the available versions for a policy, use ListPolicyVersions.\n This API retrieves information about managed policies. To retrieve information\nabout an inline policy that is embedded in a user, group, or role, use the\nGetUserPolicy, GetGroupPolicy, or GetRolePolicy API.\n For more information about the types of policies, see Managed Policies and\nInline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n For more information about managed policy versions, see Versioning for Managed\nPolicies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html)\nin the IAM User Guide." ([get-policy-version-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-policy-version-request "GetPolicyVersion" get-policy-version-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-policy-version-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-policy-version-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-policy-version-response))

(clojure.core/defn update-access-key "Changes the status of the specified access key from Active to Inactive, or vice\nversa. This operation can be used to disable a user's key as part of a key\nrotation workflow.\n If the UserName field is not specified, the user name is determined implicitly\nbased on the AWS access key ID used to sign the request. Because this operation\nworks for access keys under the AWS account, you can use this operation to\nmanage AWS account root user credentials even if the AWS account has no\nassociated users.\n For information about rotating keys, see Managing Keys and Certificates\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html) in\nthe IAM User Guide." ([update-access-key-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-access-key-request "UpdateAccessKey" update-access-key-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-access-key-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-access-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-access-key-request) :ret clojure.core/true?)

(clojure.core/defn delete-login-profile "Deletes the password for the specified IAM user, which terminates the user's\nability to access AWS services through the AWS Management Console.\n Deleting a user's password does not prevent a user from accessing AWS through\nthe command line interface or the API. To prevent all user access you must also\neither make any access keys inactive or delete them. For more information about\nmaking keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey." ([delete-login-profile-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-login-profile-request "DeleteLoginProfile" delete-login-profile-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-login-profile-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-login-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-login-profile "Retrieves the user name and password-creation date for the specified IAM user.\nIf the user has not been assigned a password, the operation returns a 404\n(NoSuchEntity) error." ([get-login-profile-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-login-profile-request "GetLoginProfile" get-login-profile-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-login-profile-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-login-profile-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-login-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-login-profile-response))

(clojure.core/defn update-openidconnect-provider-thumbprint "Replaces the existing list of server certificate thumbprints associated with an\nOpenID Connect (OIDC) provider resource object with a new list of thumbprints.\n The list that you pass with this operation completely replaces the existing\nlist of thumbprints. (The lists are not merged.)\n Typically, you need to update a thumbprint only when the identity provider's\ncertificate changes, which occurs rarely. However, if the provider's certificate\ndoes change, any attempt to assume an IAM role that specifies the OIDC provider\nas a principal fails until the certificate thumbprint is updated.\n Because trust for the OIDC provider is derived from the provider's certificate\nand is validated by the thumbprint, it is best to limit access to the\nUpdateOpenIDConnectProviderThumbprint operation to highly privileged users." ([update-openidconnect-provider-thumbprint-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-openidconnect-provider-thumbprint-request "UpdateOpenIDConnectProviderThumbprint" update-openidconnect-provider-thumbprint-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-openidconnect-provider-thumbprint-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-openidconnect-provider-thumbprint :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-openidconnect-provider-thumbprint-request) :ret clojure.core/true?)

(clojure.core/defn delete-service-specific-credential "Deletes the specified service-specific credential." ([delete-service-specific-credential-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-service-specific-credential-request "DeleteServiceSpecificCredential" delete-service-specific-credential-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-service-specific-credential-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}))))
(clojure.spec.alpha/fdef delete-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-service-specific-credential-request) :ret clojure.core/true?)

(clojure.core/defn list-groups-for-user "Lists the IAM groups that the specified IAM user belongs to.\n You can paginate the results using the MaxItems and Marker parameters." ([list-groups-for-user-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-groups-for-user-request "ListGroupsForUser" list-groups-for-user-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-groups-for-user-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-groups-for-user-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-groups-for-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-groups-for-user-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-groups-for-user-response))

(clojure.core/defn uploadsshpublic-key "Uploads an SSH public key and associates it with the specified IAM user.\n The SSH public key uploaded by this operation can be used only for\nauthenticating the associated IAM user to an AWS CodeCommit repository. For more\ninformation about using SSH keys to authenticate to an AWS CodeCommit\nrepository, see Set up AWS CodeCommit for SSH Connections\n(http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html)\nin the AWS CodeCommit User Guide." ([uploadsshpublic-key-request] (clojure.core/let [req<-input__36755__auto__ (req<-uploadsshpublic-key-request "UploadSSHPublicKey" uploadsshpublic-key-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/uploadsshpublic-key-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/uploadsshpublic-key-response {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidPublicKeyException" :portkey.aws.iam/invalid-public-key-exception, "DuplicateSSHPublicKeyException" :portkey.aws.iam/duplicatesshpublic-key-exception, "UnrecognizedPublicKeyEncodingException" :portkey.aws.iam/unrecognized-public-key-encoding-exception}))))
(clojure.spec.alpha/fdef uploadsshpublic-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/uploadsshpublic-key-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/uploadsshpublic-key-response))

(clojure.core/defn list-group-policies "Lists the names of the inline policies that are embedded in the specified IAM\ngroup.\n An IAM group can also have managed policies attached to it. To list the managed\npolicies that are attached to a group, use ListAttachedGroupPolicies. For more\ninformation about policies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n You can paginate the results using the MaxItems and Marker parameters. If there\nare no inline policies embedded with the specified group, the operation returns\nan empty list." ([list-group-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-group-policies-request "ListGroupPolicies" list-group-policies-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-group-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-group-policies-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-group-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-group-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-group-policies-response))

(clojure.core/defn delete-role "Deletes the specified role. The role must not have any policies attached. For\nmore information about roles, go to Working with Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html).\n Make sure that you do not have any Amazon EC2 instances running with the role\nyou are about to delete. Deleting a role or instance profile that is associated\nwith a running instance will break any applications running on the instance." ([delete-role-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-role-request "DeleteRole" delete-role-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-role-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-role-request) :ret clojure.core/true?)

(clojure.core/defn delete-instance-profile "Deletes the specified instance profile. The instance profile must not have an\nassociated role.\n Make sure that you do not have any Amazon EC2 instances running with the\ninstance profile you are about to delete. Deleting a role or instance profile\nthat is associated with a running instance will break any applications running\non the instance.\n For more information about instance profiles, go to About Instance Profiles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html)." ([delete-instance-profile-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-instance-profile-request "DeleteInstanceProfile" delete-instance-profile-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-instance-profile-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-instance-profile-request) :ret clojure.core/true?)

(clojure.core/defn list-groups "Lists the IAM groups that have the specified path prefix.\n You can paginate the results using the MaxItems and Marker parameters." ([] (list-groups {})) ([list-groups-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-groups-request "ListGroups" list-groups-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-groups-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-groups-response {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/? :portkey.aws.iam/list-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-groups-response))

nil

(clojure.core/defn listsamlproviders "Lists the SAML provider resource objects defined in IAM in the account.\n This operation requires Signature Version 4\n(http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html)." ([] (listsamlproviders {})) ([listsamlproviders-request] (clojure.core/let [req<-input__36755__auto__ (req<-listsamlproviders-request "ListSAMLProviders" listsamlproviders-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/listsamlproviders-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/listsamlproviders-response {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef listsamlproviders :args (clojure.spec.alpha/? :portkey.aws.iam/listsamlproviders-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/listsamlproviders-response))

(clojure.core/defn deletesamlprovider "Deletes a SAML provider resource in IAM.\n Deleting the provider resource from IAM does not update any roles that\nreference the SAML provider resource's ARN as a principal in their trust\npolicies. Any attempt to assume a role that references a non-existent provider\nresource ARN fails.\n This operation requires Signature Version 4\n(http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html)." ([deletesamlprovider-request] (clojure.core/let [req<-input__36755__auto__ (req<-deletesamlprovider-request "DeleteSAMLProvider" deletesamlprovider-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/deletesamlprovider-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef deletesamlprovider :args (clojure.spec.alpha/tuple :portkey.aws.iam/deletesamlprovider-request) :ret clojure.core/true?)

(clojure.core/defn getsamlprovider "Returns the SAML provider metadocument that was uploaded when the IAM SAML\nprovider resource object was created or updated.\n This operation requires Signature Version 4\n(http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html)." ([getsamlprovider-request] (clojure.core/let [req<-input__36755__auto__ (req<-getsamlprovider-request "GetSAMLProvider" getsamlprovider-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/getsamlprovider-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/getsamlprovider-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef getsamlprovider :args (clojure.spec.alpha/tuple :portkey.aws.iam/getsamlprovider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/getsamlprovider-response))

(clojure.core/defn update-assume-role-policy "Updates the policy that grants an IAM entity permission to assume a role. This\nis typically referred to as the \"role trust policy\". For more information about\nroles, go to Using Roles to Delegate Permissions and Federate Identities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)." ([update-assume-role-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-assume-role-policy-request "UpdateAssumeRolePolicy" update-assume-role-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-assume-role-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-assume-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-assume-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-roles "Lists the IAM roles that have the specified path prefix. If there are none, the\noperation returns an empty list. For more information about roles, go to Working\nwith Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html).\n You can paginate the results using the MaxItems and Marker parameters." ([] (list-roles {})) ([list-roles-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-roles-request "ListRoles" list-roles-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-roles-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-roles-response {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-roles :args (clojure.spec.alpha/? :portkey.aws.iam/list-roles-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-roles-response))

(clojure.core/defn list-policies "Lists all the managed policies that are available in your AWS account, including\nyour own customer-defined managed policies and all AWS managed policies.\n You can filter the list of policies that is returned using the optional\nOnlyAttached, Scope, and PathPrefix parameters. For example, to list only the\ncustomer managed policies in your AWS account, set Scope to Local. To list only\nAWS managed policies, set Scope to AWS.\n You can paginate the results using the MaxItems and Marker parameters.\n For more information about managed policies, see Managed Policies and Inline\nPolicies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([] (list-policies {})) ([list-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-policies-request "ListPolicies" list-policies-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-policies-response {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/? :portkey.aws.iam/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-policies-response))

(clojure.core/defn attach-group-policy "Attaches the specified managed policy to the specified IAM group.\n You use this API to attach a managed policy to a group. To embed an inline\npolicy in a group, use PutGroupPolicy.\n For more information about policies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([attach-group-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-attach-group-policy-request "AttachGroupPolicy" attach-group-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/attach-group-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef attach-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/attach-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn get-openidconnect-provider "Returns information about the specified OpenID Connect (OIDC) provider resource\nobject in IAM." ([get-openidconnect-provider-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-openidconnect-provider-request "GetOpenIDConnectProvider" get-openidconnect-provider-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-openidconnect-provider-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-openidconnect-provider-response {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-openidconnect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-openidconnect-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-openidconnect-provider-response))

(clojure.core/defn get-access-key-last-used "Retrieves information about when the specified access key was last used. The\ninformation includes the date and time of last use, along with the AWS service\nand region that were specified in the last request made with that key." ([get-access-key-last-used-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-access-key-last-used-request "GetAccessKeyLastUsed" get-access-key-last-used-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-access-key-last-used-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-access-key-last-used-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}))))
(clojure.spec.alpha/fdef get-access-key-last-used :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-access-key-last-used-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-access-key-last-used-response))

(clojure.core/defn list-service-specific-credentials "Returns information about the service-specific credentials associated with the\nspecified IAM user. If there are none, the operation returns an empty list. The\nservice-specific credentials returned by this operation are used only for\nauthenticating the IAM user to a specific service. For more information about\nusing service-specific credentials to authenticate to an AWS service, see Set Up\nservice-specific credentials\n(http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-gc.html) in\nthe AWS CodeCommit User Guide." ([] (list-service-specific-credentials {})) ([list-service-specific-credentials-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-service-specific-credentials-request "ListServiceSpecificCredentials" list-service-specific-credentials-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-service-specific-credentials-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-service-specific-credentials-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceNotSupportedException" :portkey.aws.iam/service-not-supported-exception}))))
(clojure.spec.alpha/fdef list-service-specific-credentials :args (clojure.spec.alpha/? :portkey.aws.iam/list-service-specific-credentials-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-service-specific-credentials-response))

(clojure.core/defn get-role-policy "Retrieves the specified inline policy document that is embedded with the\nspecified IAM role.\n Policies returned by this API are URL-encoded compliant with RFC 3986\n(https://tools.ietf.org/html/rfc3986). You can use a URL decoding method to\nconvert the policy back to plain JSON text. For example, if you use Java, you\ncan use the decode method of the java.net.URLDecoder utility class in the Java\nSDK. Other languages and SDKs provide similar functionality.\n An IAM role can also have managed policies attached to it. To retrieve a\nmanaged policy document that is attached to a role, use GetPolicy to determine\nthe policy's default version, then use GetPolicyVersion to retrieve the policy\ndocument.\n For more information about policies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n For more information about roles, see Using Roles to Delegate Permissions and\nFederate Identities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)." ([get-role-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-role-policy-request "GetRolePolicy" get-role-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-role-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-role-policy-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-role-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-role-policy-response))

(clojure.core/defn remove-clientidfrom-openidconnect-provider "Removes the specified client ID (also known as audience) from the list of client\nIDs registered for the specified IAM OpenID Connect (OIDC) provider resource\nobject.\n This operation is idempotent; it does not fail or return an error if you try to\nremove a client ID that does not exist." ([remove-clientidfrom-openidconnect-provider-request] (clojure.core/let [req<-input__36755__auto__ (req<-remove-clientidfrom-openidconnect-provider-request "RemoveClientIDFromOpenIDConnectProvider" remove-clientidfrom-openidconnect-provider-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/remove-clientidfrom-openidconnect-provider-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef remove-clientidfrom-openidconnect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/remove-clientidfrom-openidconnect-provider-request) :ret clojure.core/true?)

(clojure.core/defn get-context-keys-for-custom-policy "Gets a list of all of the context keys referenced in the input policies. The\npolicies are supplied as a list of one or more strings. To get the context keys\nfrom policies associated with an IAM user, group, or role, use\nGetContextKeysForPrincipalPolicy.\n Context keys are variables maintained by AWS and its services that provide\ndetails about the context of an API query request. Context keys can be evaluated\nby testing against a value specified in an IAM policy. Use\nGetContextKeysForCustomPolicy to understand what key names and values you must\nsupply when you call SimulateCustomPolicy. Note that all parameters are shown in\nunencoded form here for clarity but must be URL encoded to be included as a part\nof a real HTML request." ([get-context-keys-for-custom-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-context-keys-for-custom-policy-request "GetContextKeysForCustomPolicy" get-context-keys-for-custom-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-context-keys-for-custom-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-context-keys-for-policy-response {"InvalidInputException" :portkey.aws.iam/invalid-input-exception}))))
(clojure.spec.alpha/fdef get-context-keys-for-custom-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-context-keys-for-custom-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-context-keys-for-policy-response))

(clojure.core/defn list-instance-profiles "Lists the instance profiles that have the specified path prefix. If there are\nnone, the operation returns an empty list. For more information about instance\nprofiles, go to About Instance Profiles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html).\n You can paginate the results using the MaxItems and Marker parameters." ([] (list-instance-profiles {})) ([list-instance-profiles-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-instance-profiles-request "ListInstanceProfiles" list-instance-profiles-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-instance-profiles-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-instance-profiles-response {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-instance-profiles :args (clojure.spec.alpha/? :portkey.aws.iam/list-instance-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-instance-profiles-response))

nil

(clojure.core/defn upload-server-certificate "Uploads a server certificate entity for the AWS account. The server certificate\nentity includes a public key certificate, a private key, and an optional\ncertificate chain, which should all be PEM-encoded.\n We recommend that you use AWS Certificate Manager\n(https://aws.amazon.com/certificate-manager/) to provision, manage, and deploy\nyour server certificates. With ACM you can request a certificate, deploy it to\nAWS resources, and let ACM handle certificate renewals for you. Certificates\nprovided by ACM are free. For more information about using ACM, see the AWS\nCertificate Manager User Guide\n(http://docs.aws.amazon.com/acm/latest/userguide/).\n For more information about working with server certificates, see Working with\nServer Certificates\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html)\nin the IAM User Guide. This topic includes a list of AWS services that can use\nthe server certificates that you manage with IAM.\n For information about the number of server certificates you can upload, see\nLimitations on IAM Entities and Objects\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html) in\nthe IAM User Guide.\n Because the body of the public key certificate, private key, and the\ncertificate chain can be large, you should use POST rather than GET when calling\nUploadServerCertificate. For information about setting up signatures and\nauthorization through the API, go to Signing AWS API Requests\n(http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html) in\nthe AWS General Reference. For general information about using the Query API\nwith IAM, go to Calling the API by Making HTTP Query Requests\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html) in the IAM\nUser Guide." ([upload-server-certificate-request] (clojure.core/let [req<-input__36755__auto__ (req<-upload-server-certificate-request "UploadServerCertificate" upload-server-certificate-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/upload-server-certificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/upload-server-certificate-response {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedCertificateException" :portkey.aws.iam/malformed-certificate-exception, "KeyPairMismatchException" :portkey.aws.iam/key-pair-mismatch-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef upload-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/upload-server-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/upload-server-certificate-response))

(clojure.core/defn get-service-linked-role-deletion-status "Retrieves the status of your service-linked role deletion. After you use the\nDeleteServiceLinkedRole API operation to submit a service-linked role for\ndeletion, you can use the DeletionTaskId parameter in\nGetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the\ndeletion fails, this operation returns the reason that it failed, if that\ninformation is returned by the service." ([get-service-linked-role-deletion-status-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-service-linked-role-deletion-status-request "GetServiceLinkedRoleDeletionStatus" get-service-linked-role-deletion-status-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-service-linked-role-deletion-status-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-service-linked-role-deletion-status-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-service-linked-role-deletion-status :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-service-linked-role-deletion-status-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-service-linked-role-deletion-status-response))

(clojure.core/defn delete-signing-certificate "Deletes a signing certificate associated with the specified IAM user.\n If you do not specify a user name, IAM determines the user name implicitly\nbased on the AWS access key ID signing the request. Because this operation works\nfor access keys under the AWS account, you can use this operation to manage AWS\naccount root user credentials even if the AWS account has no associated IAM\nusers." ([delete-signing-certificate-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-signing-certificate-request "DeleteSigningCertificate" delete-signing-certificate-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-signing-certificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-signing-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-signing-certificate-request) :ret clojure.core/true?)

(clojure.core/defn add-role-to-instance-profile "Adds the specified IAM role to the specified instance profile. An instance\nprofile can contain only one role, and this limit cannot be increased. You can\nremove the existing role and then add a different role to an instance profile.\nYou must then wait for the change to appear across all of AWS because of\neventual consistency (https://en.wikipedia.org/wiki/Eventual_consistency). To\nforce the change, you must disassociate the instance profile\n(https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DisassociateIamInstanceProfile.html)\nand then associate the instance profile\n(https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_AssociateIamInstanceProfile.html),\nor you can stop your instance and then restart it.\n The caller of this API must be granted the PassRole permission on the IAM role\nby a permission policy.\n For more information about roles, go to Working with Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html). For\nmore information about instance profiles, go to About Instance Profiles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html)." ([add-role-to-instance-profile-request] (clojure.core/let [req<-input__36755__auto__ (req<-add-role-to-instance-profile-request "AddRoleToInstanceProfile" add-role-to-instance-profile-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/add-role-to-instance-profile-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef add-role-to-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/add-role-to-instance-profile-request) :ret clojure.core/true?)

(clojure.core/defn create-instance-profile " Creates a new instance profile. For information about instance profiles, go to\nAbout Instance Profiles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html).\n For information about the number of instance profiles you can create, see\nLimitations on IAM Entities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in\nthe IAM User Guide." ([create-instance-profile-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-instance-profile-request "CreateInstanceProfile" create-instance-profile-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-instance-profile-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-instance-profile-response {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-instance-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-instance-profile-response))

(clojure.core/defn detach-role-policy "Removes the specified managed policy from the specified role.\n A role can also have inline policies embedded with it. To delete an inline\npolicy, use the DeleteRolePolicy API. For information about policies, see\nManaged Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([detach-role-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-detach-role-policy-request "DetachRolePolicy" detach-role-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/detach-role-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef detach-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/detach-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-instance-profiles-for-role "Lists the instance profiles that have the specified associated IAM role. If\nthere are none, the operation returns an empty list. For more information about\ninstance profiles, go to About Instance Profiles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html).\n You can paginate the results using the MaxItems and Marker parameters." ([list-instance-profiles-for-role-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-instance-profiles-for-role-request "ListInstanceProfilesForRole" list-instance-profiles-for-role-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-instance-profiles-for-role-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-instance-profiles-for-role-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-instance-profiles-for-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-instance-profiles-for-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-instance-profiles-for-role-response))

(clojure.core/defn upload-signing-certificate "Uploads an X.509 signing certificate and associates it with the specified IAM\nuser. Some AWS services use X.509 signing certificates to validate requests that\nare signed with a corresponding private key. When you upload the certificate,\nits default status is Active.\n If the UserName field is not specified, the IAM user name is determined\nimplicitly based on the AWS access key ID used to sign the request. Because this\noperation works for access keys under the AWS account, you can use this\noperation to manage AWS account root user credentials even if the AWS account\nhas no associated users.\n Because the body of an X.509 certificate can be large, you should use POST\nrather than GET when calling UploadSigningCertificate. For information about\nsetting up signatures and authorization through the API, go to Signing AWS API\nRequests\n(http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html) in\nthe AWS General Reference. For general information about using the Query API\nwith IAM, go to Making Query Requests\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html) in the\nIAM User Guide." ([upload-signing-certificate-request] (clojure.core/let [req<-input__36755__auto__ (req<-upload-signing-certificate-request "UploadSigningCertificate" upload-signing-certificate-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/upload-signing-certificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/upload-signing-certificate-response {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedCertificateException" :portkey.aws.iam/malformed-certificate-exception, "InvalidCertificateException" :portkey.aws.iam/invalid-certificate-exception, "DuplicateCertificateException" :portkey.aws.iam/duplicate-certificate-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef upload-signing-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/upload-signing-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/upload-signing-certificate-response))

(clojure.core/defn update-service-specific-credential "Sets the status of a service-specific credential to Active or Inactive.\nService-specific credentials that are inactive cannot be used for authentication\nto the service. This operation can be used to disable a user’s service-specific\ncredential as part of a credential rotation work flow." ([update-service-specific-credential-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-service-specific-credential-request "UpdateServiceSpecificCredential" update-service-specific-credential-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-service-specific-credential-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}))))
(clojure.spec.alpha/fdef update-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-service-specific-credential-request) :ret clojure.core/true?)

(clojure.core/defn create-policy-version "Creates a new version of the specified managed policy. To update a managed\npolicy, you create a new policy version. A managed policy can have up to five\nversions. If the policy has five versions, you must delete an existing version\nusing DeletePolicyVersion before you create a new version.\n Optionally, you can set the new version as the policy's default version. The\ndefault version is the version that is in effect for the IAM users, groups, and\nroles to which the policy is attached.\n For more information about managed policy versions, see Versioning for Managed\nPolicies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html)\nin the IAM User Guide." ([create-policy-version-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-policy-version-request "CreatePolicyVersion" create-policy-version-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-policy-version-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-policy-version-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-policy-version-response))

(clojure.core/defn get-context-keys-for-principal-policy "Gets a list of all of the context keys referenced in all the IAM policies that\nare attached to the specified IAM entity. The entity can be an IAM user, group,\nor role. If you specify a user, then the request also includes all of the\npolicies attached to groups that the user is a member of.\n You can optionally include a list of one or more additional policies, specified\nas strings. If you want to include only a list of policies by string, use\nGetContextKeysForCustomPolicy instead.\n Note: This API discloses information about the permissions granted to other\nusers. If you do not want users to see other user's permissions, then consider\nallowing them to use GetContextKeysForCustomPolicy instead.\n Context keys are variables maintained by AWS and its services that provide\ndetails about the context of an API query request. Context keys can be evaluated\nby testing against a value in an IAM policy. Use\nGetContextKeysForPrincipalPolicy to understand what key names and values you\nmust supply when you call SimulatePrincipalPolicy." ([get-context-keys-for-principal-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-context-keys-for-principal-policy-request "GetContextKeysForPrincipalPolicy" get-context-keys-for-principal-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-context-keys-for-principal-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-context-keys-for-policy-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception}))))
(clojure.spec.alpha/fdef get-context-keys-for-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-context-keys-for-principal-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-context-keys-for-policy-response))

(clojure.core/defn resyncmfadevice "Synchronizes the specified MFA device with its IAM resource object on the AWS\nservers.\n For more information about creating and working with virtual MFA devices, go to\nUsing a Virtual MFA Device\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html) in the\nIAM User Guide." ([resyncmfadevice-request] (clojure.core/let [req<-input__36755__auto__ (req<-resyncmfadevice-request "ResyncMFADevice" resyncmfadevice-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/resyncmfadevice-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidAuthenticationCodeException" :portkey.aws.iam/invalid-authentication-code-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef resyncmfadevice :args (clojure.spec.alpha/tuple :portkey.aws.iam/resyncmfadevice-request) :ret clojure.core/true?)

(clojure.core/defn get-group " Returns a list of IAM users that are in the specified IAM group. You can\npaginate the results using the MaxItems and Marker parameters." ([get-group-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-group-request "GetGroup" get-group-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-group-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-group-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-group-response))

(clojure.core/defn update-group "Updates the name and/or the path of the specified IAM group.\n You should understand the implications of changing a group's path or name. For\nmore information, see Renaming Users and Groups\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html)\nin the IAM User Guide.\n The person making the request (the principal), must have permission to change\nthe role group with the old name and the new name. For example, to change the\ngroup named Managers to MGRs, the principal must have a policy that allows them\nto update both groups. If the principal has permission to update the Managers\ngroup, but not the MGRs group, then the update fails. For more information about\npermissions, see Access Management\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/access.html)." ([update-group-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-group-request "UpdateGroup" update-group-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-group-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-group-request) :ret clojure.core/true?)

(clojure.core/defn create-role "Creates a new role for your AWS account. For more information about roles, go to\nIAM Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html). For\ninformation about limitations on role names and the number of roles you can\ncreate, go to Limitations on IAM Entities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in\nthe IAM User Guide." ([create-role-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-role-request "CreateRole" create-role-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-role-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-role-response {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-role-response))

(clojure.core/defn delete-user "Deletes the specified IAM user. The user must not belong to any groups or have\nany access keys, signing certificates, or attached policies." ([delete-user-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-user-request "DeleteUser" delete-user-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-user-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-user-request) :ret clojure.core/true?)

(clojure.core/defn create-user "Creates a new IAM user for your AWS account.\n For information about limitations on the number of IAM users you can create,\nsee Limitations on IAM Entities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in\nthe IAM User Guide." ([create-user-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-user-request "CreateUser" create-user-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-user-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-user-response {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-user-response))

(clojure.core/defn get-policy "Retrieves information about the specified managed policy, including the policy's\ndefault version and the total number of IAM users, groups, and roles to which\nthe policy is attached. To retrieve the list of the specific users, groups, and\nroles that the policy is attached to, use the ListEntitiesForPolicy API. This\nAPI returns metadata about the policy. To retrieve the actual policy document\nfor a specific version of the policy, use GetPolicyVersion.\n This API retrieves information about managed policies. To retrieve information\nabout an inline policy that is embedded with an IAM user, group, or role, use\nthe GetUserPolicy, GetGroupPolicy, or GetRolePolicy API.\n For more information about policies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([get-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-policy-request "GetPolicy" get-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-policy-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-policy-response))

(clojure.core/defn enablemfadevice "Enables the specified MFA device and associates it with the specified IAM user.\nWhen enabled, the MFA device is required for every subsequent login by the IAM\nuser associated with the device." ([enablemfadevice-request] (clojure.core/let [req<-input__36755__auto__ (req<-enablemfadevice-request "EnableMFADevice" enablemfadevice-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/enablemfadevice-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "InvalidAuthenticationCodeException" :portkey.aws.iam/invalid-authentication-code-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef enablemfadevice :args (clojure.spec.alpha/tuple :portkey.aws.iam/enablemfadevice-request) :ret clojure.core/true?)

(clojure.core/defn put-role-policy "Adds or updates an inline policy document that is embedded in the specified IAM\nrole.\n When you embed an inline policy in a role, the inline policy is used as part of\nthe role's access (permissions) policy. The role's trust policy is created at\nthe same time as the role, using CreateRole. You can update a role's trust\npolicy using UpdateAssumeRolePolicy. For more information about IAM roles, go to\nUsing Roles to Delegate Permissions and Federate Identities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html).\n A role can also have a managed policy attached to it. To attach a managed\npolicy to a role, use AttachRolePolicy. To create a new managed policy, use\nCreatePolicy. For information about policies, see Managed Policies and Inline\nPolicies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n For information about limits on the number of inline policies that you can\nembed with a role, see Limitations on IAM Entities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in\nthe IAM User Guide.\n Because policy documents can be large, you should use POST rather than GET when\ncalling PutRolePolicy. For general information about using the Query API with\nIAM, go to Making Query Requests\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html) in the\nIAM User Guide." ([put-role-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-put-role-policy-request "PutRolePolicy" put-role-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/put-role-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef put-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn listmfadevices "Lists the MFA devices for an IAM user. If the request includes a IAM user name,\nthen this operation lists all the MFA devices associated with the specified\nuser. If you do not specify a user name, IAM determines the user name implicitly\nbased on the AWS access key ID signing the request for this API.\n You can paginate the results using the MaxItems and Marker parameters." ([] (listmfadevices {})) ([listmfadevices-request] (clojure.core/let [req<-input__36755__auto__ (req<-listmfadevices-request "ListMFADevices" listmfadevices-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/listmfadevices-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/listmfadevices-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef listmfadevices :args (clojure.spec.alpha/? :portkey.aws.iam/listmfadevices-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/listmfadevices-response))

(clojure.core/defn create-service-linked-role "Creates an IAM role that is linked to a specific AWS service. The service\ncontrols the attached policies and when the role can be deleted. This helps\nensure that the service is not broken by an unexpectedly changed or deleted\nrole, which could put your AWS resources into an unknown state. Allowing the\nservice to control the role helps improve service stability and proper cleanup\nwhen a service and its role are no longer needed.\n The name of the role is generated by combining the string that you specify for\nthe AWSServiceName parameter with the string that you specify for the\nCustomSuffix parameter. The resulting name must be unique in your account or the\nrequest fails.\n To attach a policy to this service-linked role, you must make the request using\nthe AWS service that depends on this role." ([create-service-linked-role-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-service-linked-role-request "CreateServiceLinkedRole" create-service-linked-role-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-service-linked-role-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-service-linked-role-response {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-service-linked-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-service-linked-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-service-linked-role-response))

(clojure.core/defn detach-user-policy "Removes the specified managed policy from the specified user.\n A user can also have inline policies embedded with it. To delete an inline\npolicy, use the DeleteUserPolicy API. For information about policies, see\nManaged Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([detach-user-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-detach-user-policy-request "DetachUserPolicy" detach-user-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/detach-user-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef detach-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/detach-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn put-user-policy "Adds or updates an inline policy document that is embedded in the specified IAM\nuser.\n An IAM user can also have a managed policy attached to it. To attach a managed\npolicy to a user, use AttachUserPolicy. To create a new managed policy, use\nCreatePolicy. For information about policies, see Managed Policies and Inline\nPolicies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n For information about limits on the number of inline policies that you can\nembed in a user, see Limitations on IAM Entities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in\nthe IAM User Guide.\n Because policy documents can be large, you should use POST rather than GET when\ncalling PutUserPolicy. For general information about using the Query API with\nIAM, go to Making Query Requests\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html) in the\nIAM User Guide." ([put-user-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-put-user-policy-request "PutUserPolicy" put-user-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/put-user-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef put-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-signing-certificate "Changes the status of the specified user signing certificate from active to\ndisabled, or vice versa. This operation can be used to disable an IAM user's\nsigning certificate as part of a certificate rotation work flow.\n If the UserName field is not specified, the user name is determined implicitly\nbased on the AWS access key ID used to sign the request. Because this operation\nworks for access keys under the AWS account, you can use this operation to\nmanage AWS account root user credentials even if the AWS account has no\nassociated users." ([update-signing-certificate-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-signing-certificate-request "UpdateSigningCertificate" update-signing-certificate-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-signing-certificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-signing-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-signing-certificate-request) :ret clojure.core/true?)

(clojure.core/defn get-user-policy "Retrieves the specified inline policy document that is embedded in the specified\nIAM user.\n Policies returned by this API are URL-encoded compliant with RFC 3986\n(https://tools.ietf.org/html/rfc3986). You can use a URL decoding method to\nconvert the policy back to plain JSON text. For example, if you use Java, you\ncan use the decode method of the java.net.URLDecoder utility class in the Java\nSDK. Other languages and SDKs provide similar functionality.\n An IAM user can also have managed policies attached to it. To retrieve a\nmanaged policy document that is attached to a user, use GetPolicy to determine\nthe policy's default version, then use GetPolicyVersion to retrieve the policy\ndocument.\n For more information about policies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([get-user-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-user-policy-request "GetUserPolicy" get-user-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-user-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-user-policy-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-user-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-user-policy-response))

(clojure.core/defn create-access-key " Creates a new AWS secret access key and corresponding AWS access key ID for the\nspecified user. The default status for new keys is Active.\n If you do not specify a user name, IAM determines the user name implicitly\nbased on the AWS access key ID signing the request. Because this operation works\nfor access keys under the AWS account, you can use this operation to manage AWS\naccount root user credentials. This is true even if the AWS account has no\nassociated users.\n For information about limits on the number of keys you can create, see\nLimitations on IAM Entities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in\nthe IAM User Guide.\n To ensure the security of your AWS account, the secret access key is accessible\nonly during key and user creation. You must save the key (for example, in a text\nfile) if you want to be able to access it again. If a secret key is lost, you\ncan delete the access keys for the associated user and then create new keys." ([] (create-access-key {})) ([create-access-key-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-access-key-request "CreateAccessKey" create-access-key-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-access-key-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-access-key-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-access-key :args (clojure.spec.alpha/? :portkey.aws.iam/create-access-key-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-access-key-response))

nil

(clojure.core/defn add-clientidto-openidconnect-provider "Adds a new client ID (also known as audience) to the list of client IDs already\nregistered for the specified IAM OpenID Connect (OIDC) provider resource.\n This operation is idempotent; it does not fail or return an error if you add an\nexisting client ID to the provider." ([add-clientidto-openidconnect-provider-request] (clojure.core/let [req<-input__36755__auto__ (req<-add-clientidto-openidconnect-provider-request "AddClientIDToOpenIDConnectProvider" add-clientidto-openidconnect-provider-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/add-clientidto-openidconnect-provider-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef add-clientidto-openidconnect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/add-clientidto-openidconnect-provider-request) :ret clojure.core/true?)

(clojure.core/defn createsamlprovider "Creates an IAM resource that describes an identity provider (IdP) that supports\nSAML 2.0.\n The SAML provider resource that you create with this operation can be used as a\nprincipal in an IAM role's trust policy. Such a policy can enable federated\nusers who sign-in using the SAML IdP to assume the role. You can create an IAM\nrole that supports Web-based single sign-on (SSO) to the AWS Management Console\nor one that supports API access to AWS.\n When you create the SAML provider resource, you upload a SAML metadata document\nthat you get from your IdP. That document includes the issuer's name, expiration\ninformation, and keys that can be used to validate the SAML authentication\nresponse (assertions) that the IdP sends. You must generate the metadata\ndocument using the identity management software that is used as your\norganization's IdP.\n This operation requires Signature Version 4\n(http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html).\n For more information, see Enabling SAML 2.0 Federated Users to Access the AWS\nManagement Console\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html)\nand About SAML 2.0-based Federation\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html)\nin the IAM User Guide." ([createsamlprovider-request] (clojure.core/let [req<-input__36755__auto__ (req<-createsamlprovider-request "CreateSAMLProvider" createsamlprovider-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/createsamlprovider-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/createsamlprovider-response {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef createsamlprovider :args (clojure.spec.alpha/tuple :portkey.aws.iam/createsamlprovider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/createsamlprovider-response))

(clojure.core/defn delete-openidconnect-provider "Deletes an OpenID Connect identity provider (IdP) resource object in IAM.\n Deleting an IAM OIDC provider resource does not update any roles that reference\nthe provider as a principal in their trust policies. Any attempt to assume a\nrole that references a deleted provider fails.\n This operation is idempotent; it does not fail or return an error if you call\nthe operation for a provider that does not exist." ([delete-openidconnect-provider-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-openidconnect-provider-request "DeleteOpenIDConnectProvider" delete-openidconnect-provider-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-openidconnect-provider-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-openidconnect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-openidconnect-provider-request) :ret clojure.core/true?)

(clojure.core/defn reset-service-specific-credential "Resets the password for a service-specific credential. The new password is AWS\ngenerated and cryptographically strong. It cannot be configured by the user.\nResetting the password immediately invalidates the previous password associated\nwith this user." ([reset-service-specific-credential-request] (clojure.core/let [req<-input__36755__auto__ (req<-reset-service-specific-credential-request "ResetServiceSpecificCredential" reset-service-specific-credential-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/reset-service-specific-credential-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/reset-service-specific-credential-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}))))
(clojure.spec.alpha/fdef reset-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/reset-service-specific-credential-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/reset-service-specific-credential-response))

(clojure.core/defn list-entities-for-policy "Lists all IAM users, groups, and roles that the specified managed policy is\nattached to.\n You can use the optional EntityFilter parameter to limit the results to a\nparticular type of entity (users, groups, or roles). For example, to list only\nthe roles that are attached to the specified policy, set EntityFilter to Role.\n You can paginate the results using the MaxItems and Marker parameters." ([list-entities-for-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-entities-for-policy-request "ListEntitiesForPolicy" list-entities-for-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-entities-for-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-entities-for-policy-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-entities-for-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-entities-for-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-entities-for-policy-response))

(clojure.core/defn deletesshpublic-key "Deletes the specified SSH public key.\n The SSH public key deleted by this operation is used only for authenticating\nthe associated IAM user to an AWS CodeCommit repository. For more information\nabout using SSH keys to authenticate to an AWS CodeCommit repository, see Set up\nAWS CodeCommit for SSH Connections\n(http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html)\nin the AWS CodeCommit User Guide." ([deletesshpublic-key-request] (clojure.core/let [req<-input__36755__auto__ (req<-deletesshpublic-key-request "DeleteSSHPublicKey" deletesshpublic-key-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/deletesshpublic-key-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}))))
(clojure.spec.alpha/fdef deletesshpublic-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/deletesshpublic-key-request) :ret clojure.core/true?)

(clojure.core/defn delete-role-policy "Deletes the specified inline policy that is embedded in the specified IAM role.\n A role can also have managed policies attached to it. To detach a managed\npolicy from a role, use DetachRolePolicy. For more information about policies,\nrefer to Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([delete-role-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-role-policy-request "DeleteRolePolicy" delete-role-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-role-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn change-password "Changes the password of the IAM user who is calling this operation. The AWS\naccount root user password is not affected by this operation.\n To change the password for a different user, see UpdateLoginProfile. For more\ninformation about modifying passwords, see Managing Passwords\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in\nthe IAM User Guide." ([change-password-request] (clojure.core/let [req<-input__36755__auto__ (req<-change-password-request "ChangePassword" change-password-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/change-password-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidUserTypeException" :portkey.aws.iam/invalid-user-type-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "PasswordPolicyViolationException" :portkey.aws.iam/password-policy-violation-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef change-password :args (clojure.spec.alpha/tuple :portkey.aws.iam/change-password-request) :ret clojure.core/true?)

(clojure.core/defn updatesshpublic-key "Sets the status of an IAM user's SSH public key to active or inactive. SSH\npublic keys that are inactive cannot be used for authentication. This operation\ncan be used to disable a user's SSH public key as part of a key rotation work\nflow.\n The SSH public key affected by this operation is used only for authenticating\nthe associated IAM user to an AWS CodeCommit repository. For more information\nabout using SSH keys to authenticate to an AWS CodeCommit repository, see Set up\nAWS CodeCommit for SSH Connections\n(http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html)\nin the AWS CodeCommit User Guide." ([updatesshpublic-key-request] (clojure.core/let [req<-input__36755__auto__ (req<-updatesshpublic-key-request "UpdateSSHPublicKey" updatesshpublic-key-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/updatesshpublic-key-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}))))
(clojure.spec.alpha/fdef updatesshpublic-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/updatesshpublic-key-request) :ret clojure.core/true?)

(clojure.core/defn remove-role-from-instance-profile "Removes the specified IAM role from the specified EC2 instance profile.\n Make sure that you do not have any Amazon EC2 instances running with the role\nyou are about to remove from the instance profile. Removing a role from an\ninstance profile that is associated with a running instance might break any\napplications running on the instance.\n For more information about IAM roles, go to Working with Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html). For\nmore information about instance profiles, go to About Instance Profiles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html)." ([remove-role-from-instance-profile-request] (clojure.core/let [req<-input__36755__auto__ (req<-remove-role-from-instance-profile-request "RemoveRoleFromInstanceProfile" remove-role-from-instance-profile-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/remove-role-from-instance-profile-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef remove-role-from-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/remove-role-from-instance-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-server-certificate "Retrieves information about the specified server certificate stored in IAM.\n For more information about working with server certificates, see Working with\nServer Certificates\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html)\nin the IAM User Guide. This topic includes a list of AWS services that can use\nthe server certificates that you manage with IAM." ([get-server-certificate-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-server-certificate-request "GetServerCertificate" get-server-certificate-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-server-certificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-server-certificate-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-server-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-server-certificate-response))

nil

(clojure.core/defn list-attached-role-policies "Lists all managed policies that are attached to the specified IAM role.\n An IAM role can also have inline policies embedded with it. To list the inline\npolicies for a role, use the ListRolePolicies API. For information about\npolicies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n You can paginate the results using the MaxItems and Marker parameters. You can\nuse the PathPrefix parameter to limit the list of policies to only those\nmatching the specified path prefix. If there are no policies attached to the\nspecified role (or none that match the specified path prefix), the operation\nreturns an empty list." ([list-attached-role-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-attached-role-policies-request "ListAttachedRolePolicies" list-attached-role-policies-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-attached-role-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-attached-role-policies-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-attached-role-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-attached-role-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-attached-role-policies-response))

(clojure.core/defn set-default-policy-version "Sets the specified version of the specified policy as the policy's default\n(operative) version.\n This operation affects all users, groups, and roles that the policy is attached\nto. To list the users, groups, and roles that the policy is attached to, use the\nListEntitiesForPolicy API.\n For information about managed policies, see Managed Policies and Inline\nPolicies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([set-default-policy-version-request] (clojure.core/let [req<-input__36755__auto__ (req<-set-default-policy-version-request "SetDefaultPolicyVersion" set-default-policy-version-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/set-default-policy-version-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef set-default-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/set-default-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn list-openidconnect-providers "Lists information about the IAM OpenID Connect (OIDC) provider resource objects\ndefined in the AWS account." ([] (list-openidconnect-providers {})) ([list-openidconnect-providers-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-openidconnect-providers-request "ListOpenIDConnectProviders" list-openidconnect-providers-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-openidconnect-providers-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-openidconnect-providers-response {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-openidconnect-providers :args (clojure.spec.alpha/? :portkey.aws.iam/list-openidconnect-providers-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-openidconnect-providers-response))

(clojure.core/defn list-access-keys "Returns information about the access key IDs associated with the specified IAM\nuser. If there are none, the operation returns an empty list.\n Although each user is limited to a small number of keys, you can still paginate\nthe results using the MaxItems and Marker parameters.\n If the UserName field is not specified, the user name is determined implicitly\nbased on the AWS access key ID used to sign the request. Because this operation\nworks for access keys under the AWS account, you can use this operation to\nmanage AWS account root user credentials even if the AWS account has no\nassociated users.\n To ensure the security of your AWS account, the secret access key is accessible\nonly during key and user creation." ([] (list-access-keys {})) ([list-access-keys-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-access-keys-request "ListAccessKeys" list-access-keys-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-access-keys-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-access-keys-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-access-keys :args (clojure.spec.alpha/? :portkey.aws.iam/list-access-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-access-keys-response))

(clojure.core/defn delete-virtualmfadevice "Deletes a virtual MFA device.\n You must deactivate a user's virtual MFA device before you can delete it. For\ninformation about deactivating MFA devices, see DeactivateMFADevice." ([delete-virtualmfadevice-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-virtualmfadevice-request "DeleteVirtualMFADevice" delete-virtualmfadevice-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-virtualmfadevice-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-virtualmfadevice :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-virtualmfadevice-request) :ret clojure.core/true?)

(clojure.core/defn get-group-policy "Retrieves the specified inline policy document that is embedded in the specified\nIAM group.\n Policies returned by this API are URL-encoded compliant with RFC 3986\n(https://tools.ietf.org/html/rfc3986). You can use a URL decoding method to\nconvert the policy back to plain JSON text. For example, if you use Java, you\ncan use the decode method of the java.net.URLDecoder utility class in the Java\nSDK. Other languages and SDKs provide similar functionality.\n An IAM group can also have managed policies attached to it. To retrieve a\nmanaged policy document that is attached to a group, use GetPolicy to determine\nthe policy's default version, then use GetPolicyVersion to retrieve the policy\ndocument.\n For more information about policies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([get-group-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-group-policy-request "GetGroupPolicy" get-group-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-group-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-group-policy-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-group-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-group-policy-response))

(clojure.core/defn create-policy "Creates a new managed policy for your AWS account.\n This operation creates a policy version with a version identifier of v1 and\nsets v1 as the policy's default version. For more information about policy\nversions, see Versioning for Managed Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html)\nin the IAM User Guide.\n For more information about managed policies in general, see Managed Policies\nand Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([create-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-policy-request "CreatePolicy" create-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-policy-response {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-policy-response))

(clojure.core/defn list-users "Lists the IAM users that have the specified path prefix. If no path prefix is\nspecified, the operation returns all users in the AWS account. If there are\nnone, the operation returns an empty list.\n You can paginate the results using the MaxItems and Marker parameters." ([] (list-users {})) ([list-users-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-users-request "ListUsers" list-users-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-users-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-users-response {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/? :portkey.aws.iam/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-users-response))

(clojure.core/defn list-role-policies "Lists the names of the inline policies that are embedded in the specified IAM\nrole.\n An IAM role can also have managed policies attached to it. To list the managed\npolicies that are attached to a role, use ListAttachedRolePolicies. For more\ninformation about policies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n You can paginate the results using the MaxItems and Marker parameters. If there\nare no inline policies embedded with the specified role, the operation returns\nan empty list." ([list-role-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-role-policies-request "ListRolePolicies" list-role-policies-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-role-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-role-policies-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-role-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-role-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-role-policies-response))

(clojure.core/defn delete-user-policy "Deletes the specified inline policy that is embedded in the specified IAM user.\n A user can also have managed policies attached to it. To detach a managed\npolicy from a user, use DetachUserPolicy. For more information about policies,\nrefer to Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([delete-user-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-user-policy-request "DeleteUserPolicy" delete-user-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-user-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn create-account-alias "Creates an alias for your AWS account. For information about using an AWS\naccount alias, see Using an Alias for Your AWS Account ID\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html) in the IAM\nUser Guide." ([create-account-alias-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-account-alias-request "CreateAccountAlias" create-account-alias-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-account-alias-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-account-alias :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-account-alias-request) :ret clojure.core/true?)

(clojure.core/defn delete-service-linked-role "Submits a service-linked role deletion request and returns a DeletionTaskId,\nwhich you can use to check the status of the deletion. Before you call this\noperation, confirm that the role has no active sessions and that any resources\nused by the role in the linked service are deleted. If you call this operation\nmore than once for the same service-linked role and an earlier deletion task is\nnot complete, then the DeletionTaskId of the earlier request is returned.\n If you submit a deletion request for a service-linked role whose linked service\nis still accessing a resource, then the deletion task fails. If it fails, the\nGetServiceLinkedRoleDeletionStatus API operation returns the reason for the\nfailure, usually including the resources that must be deleted. To delete the\nservice-linked role, you must first remove those resources from the linked\nservice and then submit the deletion request again. Resources are specific to\nthe service that is linked to the role. For more information about removing\nresources from a service, see the AWS documentation\n(http://docs.aws.amazon.com/) for your service.\n For more information about service-linked roles, see Roles Terms and Concepts:\nAWS Service-Linked Role\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-service-linked-role)\nin the IAM User Guide." ([delete-service-linked-role-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-service-linked-role-request "DeleteServiceLinkedRole" delete-service-linked-role-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-service-linked-role-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/delete-service-linked-role-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-service-linked-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-service-linked-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/delete-service-linked-role-response))

(clojure.core/defn update-server-certificate "Updates the name and/or the path of the specified server certificate stored in\nIAM.\n For more information about working with server certificates, see Working with\nServer Certificates\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html)\nin the IAM User Guide. This topic also includes a list of AWS services that can\nuse the server certificates that you manage with IAM.\n You should understand the implications of changing a server certificate's path\nor name. For more information, see Renaming a Server Certificate\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts)\nin the IAM User Guide.\n The person making the request (the principal), must have permission to change\nthe server certificate with the old name and the new name. For example, to\nchange the certificate named ProductionCert to ProdCert, the principal must have\na policy that allows them to update both certificates. If the principal has\npermission to update the ProductionCert group, but not the ProdCert certificate,\nthen the update fails. For more information about permissions, see Access\nManagement (http://docs.aws.amazon.com/IAM/latest/UserGuide/access.html) in the\nIAM User Guide." ([update-server-certificate-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-server-certificate-request "UpdateServerCertificate" update-server-certificate-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-server-certificate-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-server-certificate-request) :ret clojure.core/true?)

(clojure.core/defn simulate-principal-policy "Simulate how a set of IAM policies attached to an IAM entity works with a list\nof API operations and AWS resources to determine the policies' effective\npermissions. The entity can be an IAM user, group, or role. If you specify a\nuser, then the simulation also includes all of the policies that are attached to\ngroups that the user belongs to.\n You can optionally include a list of one or more additional policies specified\nas strings to include in the simulation. If you want to simulate only policies\nspecified as strings, use SimulateCustomPolicy instead.\n You can also optionally include one resource-based policy to be evaluated with\neach of the resources included in the simulation.\n The simulation does not perform the API operations, it only checks the\nauthorization to determine if the simulated policies allow or deny the\noperations.\n Note: This API discloses information about the permissions granted to other\nusers. If you do not want users to see other user's permissions, then consider\nallowing them to use SimulateCustomPolicy instead.\n Context keys are variables maintained by AWS and its services that provide\ndetails about the context of an API query request. You can use the Condition\nelement of an IAM policy to evaluate context keys. To get the list of context\nkeys that the policies require for correct simulation, use\nGetContextKeysForPrincipalPolicy.\n If the output is long, you can use the MaxItems and Marker parameters to\npaginate the results." ([simulate-principal-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-simulate-principal-policy-request "SimulatePrincipalPolicy" simulate-principal-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/simulate-principal-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/simulate-policy-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyEvaluationException" :portkey.aws.iam/policy-evaluation-exception}))))
(clojure.spec.alpha/fdef simulate-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/simulate-principal-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/simulate-policy-response))

(clojure.core/defn list-server-certificates "Lists the server certificates stored in IAM that have the specified path prefix.\nIf none exist, the operation returns an empty list.\n You can paginate the results using the MaxItems and Marker parameters.\n For more information about working with server certificates, see Working with\nServer Certificates\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html)\nin the IAM User Guide. This topic also includes a list of AWS services that can\nuse the server certificates that you manage with IAM." ([] (list-server-certificates {})) ([list-server-certificates-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-server-certificates-request "ListServerCertificates" list-server-certificates-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-server-certificates-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-server-certificates-response {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-server-certificates :args (clojure.spec.alpha/? :portkey.aws.iam/list-server-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-server-certificates-response))

(clojure.core/defn get-role "Retrieves information about the specified role, including the role's path, GUID,\nARN, and the role's trust policy that grants permission to assume the role. For\nmore information about roles, see Working with Roles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html).\n Policies returned by this API are URL-encoded compliant with RFC 3986\n(https://tools.ietf.org/html/rfc3986). You can use a URL decoding method to\nconvert the policy back to plain JSON text. For example, if you use Java, you\ncan use the decode method of the java.net.URLDecoder utility class in the Java\nSDK. Other languages and SDKs provide similar functionality." ([get-role-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-role-request "GetRole" get-role-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-role-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-role-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-role-response))

(clojure.core/defn put-group-policy "Adds or updates an inline policy document that is embedded in the specified IAM\ngroup.\n A user can also have managed policies attached to it. To attach a managed\npolicy to a group, use AttachGroupPolicy. To create a new managed policy, use\nCreatePolicy. For information about policies, see Managed Policies and Inline\nPolicies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n For information about limits on the number of inline policies that you can\nembed in a group, see Limitations on IAM Entities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in\nthe IAM User Guide.\n Because policy documents can be large, you should use POST rather than GET when\ncalling PutGroupPolicy. For general information about using the Query API with\nIAM, go to Making Query Requests\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html) in the\nIAM User Guide." ([put-group-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-put-group-policy-request "PutGroupPolicy" put-group-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/put-group-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef put-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-virtualmfadevices "Lists the virtual MFA devices defined in the AWS account by assignment status.\nIf you do not specify an assignment status, the operation returns a list of all\nvirtual MFA devices. Assignment status can be Assigned, Unassigned, or Any.\n You can paginate the results using the MaxItems and Marker parameters." ([] (list-virtualmfadevices {})) ([list-virtualmfadevices-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-virtualmfadevices-request "ListVirtualMFADevices" list-virtualmfadevices-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-virtualmfadevices-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-virtualmfadevices-response {}))))
(clojure.spec.alpha/fdef list-virtualmfadevices :args (clojure.spec.alpha/? :portkey.aws.iam/list-virtualmfadevices-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-virtualmfadevices-response))

nil

(clojure.core/defn delete-access-key "Deletes the access key pair associated with the specified IAM user.\n If you do not specify a user name, IAM determines the user name implicitly\nbased on the AWS access key ID signing the request. Because this operation works\nfor access keys under the AWS account, you can use this operation to manage AWS\naccount root user credentials even if the AWS account has no associated users." ([delete-access-key-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-access-key-request "DeleteAccessKey" delete-access-key-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-access-key-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-access-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-access-key-request) :ret clojure.core/true?)

(clojure.core/defn create-login-profile " Creates a password for the specified user, giving the user the ability to\naccess AWS services through the AWS Management Console. For more information\nabout managing passwords, see Managing Passwords\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in\nthe IAM User Guide." ([create-login-profile-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-login-profile-request "CreateLoginProfile" create-login-profile-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-login-profile-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-login-profile-response {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "PasswordPolicyViolationException" :portkey.aws.iam/password-policy-violation-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-login-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-login-profile-response))

(clojure.core/defn create-group "Creates a new group.\n For information about the number of groups you can create, see Limitations on\nIAM Entities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in\nthe IAM User Guide." ([create-group-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-group-request "CreateGroup" create-group-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-group-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-group-response {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-group-response))

(clojure.core/defn attach-user-policy "Attaches the specified managed policy to the specified user.\n You use this API to attach a managed policy to a user. To embed an inline\npolicy in a user, use PutUserPolicy.\n For more information about policies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([attach-user-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-attach-user-policy-request "AttachUserPolicy" attach-user-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/attach-user-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef attach-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/attach-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn remove-user-from-group "Removes the specified user from the specified group." ([remove-user-from-group-request] (clojure.core/let [req<-input__36755__auto__ (req<-remove-user-from-group-request "RemoveUserFromGroup" remove-user-from-group-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/remove-user-from-group-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef remove-user-from-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/remove-user-from-group-request) :ret clojure.core/true?)

(clojure.core/defn list-account-aliases "Lists the account alias associated with the AWS account (Note: you can have only\none). For information about using an AWS account alias, see Using an Alias for\nYour AWS Account ID\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html) in the IAM\nUser Guide." ([] (list-account-aliases {})) ([list-account-aliases-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-account-aliases-request "ListAccountAliases" list-account-aliases-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-account-aliases-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-account-aliases-response {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-account-aliases :args (clojure.spec.alpha/? :portkey.aws.iam/list-account-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-account-aliases-response))

(clojure.core/defn update-role-description "Use instead.\n Modifies only the description of a role. This operation performs the same\nfunction as the Description parameter in the UpdateRole operation." ([update-role-description-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-role-description-request "UpdateRoleDescription" update-role-description-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-role-description-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/update-role-description-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-role-description :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-role-description-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/update-role-description-response))

(clojure.core/defn create-openidconnect-provider "Creates an IAM entity to describe an identity provider (IdP) that supports\nOpenID Connect (OIDC) (http://openid.net/connect/).\n The OIDC provider that you create with this operation can be used as a\nprincipal in a role's trust policy. Such a policy establishes a trust\nrelationship between AWS and the OIDC provider.\n When you create the IAM OIDC provider, you specify the following:\n * The URL of the OIDC identity provider (IdP) to trust\n * A list of client IDs (also known as audiences) that identify the application\nor applications that are allowed to authenticate using the OIDC provider\n * A list of thumbprints of the server certificate(s) that the IdP uses.\n You get all of this information from the OIDC IdP that you want to use to\naccess AWS.\n Because trust for the OIDC provider is derived from the IAM provider that this\noperation creates, it is best to limit access to the CreateOpenIDConnectProvider\noperation to highly privileged users." ([create-openidconnect-provider-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-openidconnect-provider-request "CreateOpenIDConnectProvider" create-openidconnect-provider-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-openidconnect-provider-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-openidconnect-provider-response {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-openidconnect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-openidconnect-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-openidconnect-provider-response))

(clojure.core/defn delete-group-policy "Deletes the specified inline policy that is embedded in the specified IAM group.\n A group can also have managed policies attached to it. To detach a managed\npolicy from a group, use DetachGroupPolicy. For more information about policies,\nrefer to Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([delete-group-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-group-policy-request "DeleteGroupPolicy" delete-group-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-group-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn get-instance-profile " Retrieves information about the specified instance profile, including the\ninstance profile's path, GUID, ARN, and role. For more information about\ninstance profiles, see About Instance Profiles\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html) in\nthe IAM User Guide." ([get-instance-profile-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-instance-profile-request "GetInstanceProfile" get-instance-profile-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-instance-profile-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-instance-profile-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-instance-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-instance-profile-response))

(clojure.core/defn get-account-authorization-details "Retrieves information about all IAM users, groups, roles, and policies in your\nAWS account, including their relationships to one another. Use this API to\nobtain a snapshot of the configuration of IAM permissions (users, groups, roles,\nand policies) in your account.\n Policies returned by this API are URL-encoded compliant with RFC 3986\n(https://tools.ietf.org/html/rfc3986). You can use a URL decoding method to\nconvert the policy back to plain JSON text. For example, if you use Java, you\ncan use the decode method of the java.net.URLDecoder utility class in the Java\nSDK. Other languages and SDKs provide similar functionality.\n You can optionally filter the results using the Filter parameter. You can\npaginate the results using the MaxItems and Marker parameters." ([] (get-account-authorization-details {})) ([get-account-authorization-details-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-account-authorization-details-request "GetAccountAuthorizationDetails" get-account-authorization-details-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-account-authorization-details-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-account-authorization-details-response {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-account-authorization-details :args (clojure.spec.alpha/? :portkey.aws.iam/get-account-authorization-details-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-account-authorization-details-response))

(clojure.core/defn delete-policy "Deletes the specified managed policy.\n Before you can delete a managed policy, you must first detach the policy from\nall users, groups, and roles that it is attached to. In addition you must delete\nall the policy's versions. The following steps describe the process for deleting\na managed policy:\n * Detach the policy from all users, groups, and roles that the policy is\nattached to, using the DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy\nAPI operations. To list all the users, groups, and roles that a policy is\nattached to, use ListEntitiesForPolicy.\n * Delete all versions of the policy using DeletePolicyVersion. To list the\npolicy's versions, use ListPolicyVersions. You cannot use DeletePolicyVersion to\ndelete the version that is marked as the default version. You delete the\npolicy's default version in the next step of the process.\n * Delete the policy (this automatically deletes the policy's default version)\nusing this API.\n For information about managed policies, see Managed Policies and Inline\nPolicies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide." ([delete-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-policy-request "DeletePolicy" delete-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/delete-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-user "Updates the name and/or the path of the specified IAM user.\n You should understand the implications of changing an IAM user's path or name.\nFor more information, see Renaming an IAM User\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_manage.html#id_users_renaming)\nand Renaming an IAM Group\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups_manage_rename.html)\nin the IAM User Guide.\n To change a user name, the requester must have appropriate permissions on both\nthe source object and the target object. For example, to change Bob to Robert,\nthe entity making the request must have permission on Bob and Robert, or must\nhave permission on all (*). For more information about permissions, see\nPermissions and Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html)." ([update-user-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-user-request "UpdateUser" update-user-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-user-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-user-request) :ret clojure.core/true?)

(clojure.core/defn create-virtualmfadevice "Creates a new virtual MFA device for the AWS account. After creating the virtual\nMFA, use EnableMFADevice to attach the MFA device to an IAM user. For more\ninformation about creating and working with virtual MFA devices, go to Using a\nVirtual MFA Device\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html) in the\nIAM User Guide.\n For information about limits on the number of MFA devices you can create, see\nLimitations on Entities\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in\nthe IAM User Guide.\n The seed information contained in the QR code and the Base32 string should be\ntreated like any other secret access information, such as your AWS access keys\nor your passwords. After you provision your virtual device, you should ensure\nthat the information is destroyed following secure procedures." ([create-virtualmfadevice-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-virtualmfadevice-request "CreateVirtualMFADevice" create-virtualmfadevice-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/create-virtualmfadevice-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/create-virtualmfadevice-response {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef create-virtualmfadevice :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-virtualmfadevice-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-virtualmfadevice-response))

(clojure.core/defn add-user-to-group "Adds the specified user to the specified group." ([add-user-to-group-request] (clojure.core/let [req<-input__36755__auto__ (req<-add-user-to-group-request "AddUserToGroup" add-user-to-group-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/add-user-to-group-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef add-user-to-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/add-user-to-group-request) :ret clojure.core/true?)

(clojure.core/defn update-role "Updates the description or maximum session duration setting of a role." ([update-role-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-role-request "UpdateRole" update-role-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/update-role-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/update-role-response {"UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef update-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/update-role-response))

(clojure.core/defn list-user-policies "Lists the names of the inline policies embedded in the specified IAM user.\n An IAM user can also have managed policies attached to it. To list the managed\npolicies that are attached to a user, use ListAttachedUserPolicies. For more\ninformation about policies, see Managed Policies and Inline Policies\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)\nin the IAM User Guide.\n You can paginate the results using the MaxItems and Marker parameters. If there\nare no inline policies embedded with the specified user, the operation returns\nan empty list." ([list-user-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-user-policies-request "ListUserPolicies" list-user-policies-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/list-user-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/list-user-policies-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef list-user-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-user-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-user-policies-response))

(clojure.core/defn simulate-custom-policy "Simulate how a set of IAM policies and optionally a resource-based policy works\nwith a list of API operations and AWS resources to determine the policies'\neffective permissions. The policies are provided as strings.\n The simulation does not perform the API operations; it only checks the\nauthorization to determine if the simulated policies allow or deny the\noperations.\n If you want to simulate existing policies attached to an IAM user, group, or\nrole, use SimulatePrincipalPolicy instead.\n Context keys are variables maintained by AWS and its services that provide\ndetails about the context of an API query request. You can use the Condition\nelement of an IAM policy to evaluate context keys. To get the list of context\nkeys that the policies require for correct simulation, use\nGetContextKeysForCustomPolicy.\n If the output is long, you can use MaxItems and Marker parameters to paginate\nthe results." ([simulate-custom-policy-request] (clojure.core/let [req<-input__36755__auto__ (req<-simulate-custom-policy-request "SimulateCustomPolicy" simulate-custom-policy-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/simulate-custom-policy-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/simulate-policy-response {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyEvaluationException" :portkey.aws.iam/policy-evaluation-exception}))))
(clojure.spec.alpha/fdef simulate-custom-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/simulate-custom-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/simulate-policy-response))

(clojure.core/defn listsshpublic-keys "Returns information about the SSH public keys associated with the specified IAM\nuser. If there are none, the operation returns an empty list.\n The SSH public keys returned by this operation are used only for authenticating\nthe IAM user to an AWS CodeCommit repository. For more information about using\nSSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS\nCodeCommit for SSH Connections\n(http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html)\nin the AWS CodeCommit User Guide.\n Although each user is limited to a small number of keys, you can still paginate\nthe results using the MaxItems and Marker parameters." ([] (listsshpublic-keys {})) ([listsshpublic-keys-request] (clojure.core/let [req<-input__36755__auto__ (req<-listsshpublic-keys-request "ListSSHPublicKeys" listsshpublic-keys-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/listsshpublic-keys-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/listsshpublic-keys-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}))))
(clojure.spec.alpha/fdef listsshpublic-keys :args (clojure.spec.alpha/? :portkey.aws.iam/listsshpublic-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/listsshpublic-keys-response))

(clojure.core/defn get-user "Retrieves information about the specified IAM user, including the user's\ncreation date, path, unique ID, and ARN.\n If you do not specify a user name, IAM determines the user name implicitly\nbased on the AWS access key ID used to sign the request to this API." ([] (get-user {})) ([get-user-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-user-request "GetUser" get-user-request)] (portkey.aws/-query-call portkey.aws.iam/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.iam/get-user-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.iam/get-user-response {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}))))
(clojure.spec.alpha/fdef get-user :args (clojure.spec.alpha/? :portkey.aws.iam/get-user-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-user-response))
