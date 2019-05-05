(ns portkey.aws.chime.-2018-05-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4}})

(clojure.core/declare ser-profile-service-max-results)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-user-id-list)

(clojure.core/declare ser-account-settings)

(clojure.core/declare ser-update-user-request-item-list)

(clojure.core/declare ser-update-user-request-item)

(clojure.core/declare ser-string)

(clojure.core/declare ser-user-email-list)

(clojure.core/declare ser-account-name)

(clojure.core/declare ser-license)

(clojure.core/declare ser-email-address)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-profile-service-max-results [input] #:http.request.field{:value input, :shape "ProfileServiceMaxResults"})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-user-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "UserIdList", :type "list", :max 50})

(clojure.core/defn- ser-account-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AccountSettings", :type "structure"} (clojure.core/contains? input :disable-remote-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :disable-remote-control)) #:http.request.field{:name "DisableRemoteControl", :shape "Boolean"})) (clojure.core/contains? input :enable-dial-out) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-dial-out)) #:http.request.field{:name "EnableDialOut", :shape "Boolean"}))))

(clojure.core/defn- ser-update-user-request-item-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-update-user-request-item coll) #:http.request.field{:shape "UpdateUserRequestItem"}))) input), :shape "UpdateUserRequestItemList", :type "list", :max 20})

(clojure.core/defn- ser-update-user-request-item [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:user-id input)) #:http.request.field{:name "UserId", :shape "NonEmptyString"})], :shape "UpdateUserRequestItem", :type "structure"} (clojure.core/contains? input :license-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license (input :license-type)) #:http.request.field{:name "LicenseType", :shape "License"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-user-email-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-email-address coll) #:http.request.field{:shape "EmailAddress"}))) input), :shape "UserEmailList", :type "list", :max 50})

(clojure.core/defn- ser-account-name [input] #:http.request.field{:value input, :shape "AccountName"})

(clojure.core/defn- ser-license [input] #:http.request.field{:value (clojure.core/get {"Basic" "Basic", :basic "Basic", "Plus" "Plus", :plus "Plus", "Pro" "Pro", :pro "Pro", "ProTrial" "ProTrial", :pro-trial "ProTrial"} input), :shape "License"})

(clojure.core/defn- ser-email-address [input] #:http.request.field{:value input, :shape "EmailAddress"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-update-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"}) (clojure.core/into (ser-non-empty-string (input :user-id)) #:http.request.field{:name "UserId", :shape "NonEmptyString", :location "uri", :location-name "userId"})]} (clojure.core/contains? input :license-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license (input :license-type)) #:http.request.field{:name "LicenseType", :shape "License"}))))

(clojure.core/defn- req-get-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"}) (clojure.core/into (ser-non-empty-string (input :user-id)) #:http.request.field{:name "UserId", :shape "NonEmptyString", :location "uri", :location-name "userId"})]}))

(clojure.core/defn- req-list-users-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})]} (clojure.core/contains? input :user-email) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address (input :user-email)) #:http.request.field{:name "UserEmail", :shape "EmailAddress", :location "querystring", :location-name "user-email"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-profile-service-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ProfileServiceMaxResults", :location "querystring", :location-name "max-results"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String", :location "querystring", :location-name "next-token"}))))

(clojure.core/defn- req-list-accounts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-name (input :name)) #:http.request.field{:name "Name", :shape "AccountName", :location "querystring", :location-name "name"})) (clojure.core/contains? input :user-email) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address (input :user-email)) #:http.request.field{:name "UserEmail", :shape "EmailAddress", :location "querystring", :location-name "user-email"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String", :location "querystring", :location-name "next-token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-profile-service-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ProfileServiceMaxResults", :location "querystring", :location-name "max-results"}))))

(clojure.core/defn- req-update-account-settings-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})], :body [(clojure.core/into (ser-account-settings (input :account-settings)) #:http.request.field{:name "AccountSettings", :shape "AccountSettings"})]}))

(clojure.core/defn- req-logout-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"}) (clojure.core/into (ser-non-empty-string (input :user-id)) #:http.request.field{:name "UserId", :shape "NonEmptyString", :location "uri", :location-name "userId"})]}))

(clojure.core/defn- req-update-account-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-name (input :name)) #:http.request.field{:name "Name", :shape "AccountName"}))))

(clojure.core/defn- req-batch-unsuspend-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})], :body [(clojure.core/into (ser-user-id-list (input :user-id-list)) #:http.request.field{:name "UserIdList", :shape "UserIdList"})]}))

(clojure.core/defn- req-delete-account-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})]}))

(clojure.core/defn- req-batch-suspend-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})], :body [(clojure.core/into (ser-user-id-list (input :user-id-list)) #:http.request.field{:name "UserIdList", :shape "UserIdList"})]}))

(clojure.core/defn- req-get-account-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})]}))

(clojure.core/defn- req-reset-personal-pin-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"}) (clojure.core/into (ser-non-empty-string (input :user-id)) #:http.request.field{:name "UserId", :shape "NonEmptyString", :location "uri", :location-name "userId"})]}))

(clojure.core/defn- req-invite-users-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})], :body [(clojure.core/into (ser-user-email-list (input :user-email-list)) #:http.request.field{:name "UserEmailList", :shape "UserEmailList"})]}))

(clojure.core/defn- req-get-account-settings-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})]}))

(clojure.core/defn- req-create-account-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-name (input :name)) #:http.request.field{:name "Name", :shape "AccountName"})]}))

(clojure.core/defn- req-batch-update-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})], :body [(clojure.core/into (ser-update-user-request-item-list (input :update-user-request-items)) #:http.request.field{:name "UpdateUserRequestItems", :shape "UpdateUserRequestItemList"})]}))

(clojure.core/declare deser-user-error-list)

(clojure.core/declare deser-license-list)

(clojure.core/declare deser-user-list)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-registration-status)

(clojure.core/declare deser-account-settings)

(clojure.core/declare deser-user-error)

(clojure.core/declare deser-user)

(clojure.core/declare deser-account-type)

(clojure.core/declare deser-sensitive-string)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-email-status)

(clojure.core/declare deser-account)

(clojure.core/declare deser-string)

(clojure.core/declare deser-invite-status)

(clojure.core/declare deser-iso-8601-timestamp)

(clojure.core/declare deser-account-list)

(clojure.core/declare deser-license)

(clojure.core/declare deser-invite)

(clojure.core/declare deser-invite-list)

(clojure.core/declare deser-email-address)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-user-error-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-error coll))) input))

(clojure.core/defn- deser-license-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-license coll))) input))

(clojure.core/defn- deser-user-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user coll))) input))

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-registration-status [input] (clojure.core/get {"Unregistered" :unregistered, "Registered" :registered, "Suspended" :suspended} input))

(clojure.core/defn- deser-account-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "DisableRemoteControl") (clojure.core/assoc :disable-remote-control (deser-boolean (input "DisableRemoteControl"))) (clojure.core/contains? input "EnableDialOut") (clojure.core/assoc :enable-dial-out (deser-boolean (input "EnableDialOut")))))

(clojure.core/defn- deser-user-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserId") (clojure.core/assoc :user-id (deser-non-empty-string (input "UserId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-string (input "ErrorMessage")))))

(clojure.core/defn- deser-user [input] (clojure.core/cond-> {:user-id (deser-string (input "UserId"))} (clojure.core/contains? input "RegisteredOn") (clojure.core/assoc :registered-on (deser-iso-8601-timestamp (input "RegisteredOn"))) (clojure.core/contains? input "InvitedOn") (clojure.core/assoc :invited-on (deser-iso-8601-timestamp (input "InvitedOn"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-sensitive-string (input "DisplayName"))) (clojure.core/contains? input "UserInvitationStatus") (clojure.core/assoc :user-invitation-status (deser-invite-status (input "UserInvitationStatus"))) (clojure.core/contains? input "PrimaryEmail") (clojure.core/assoc :primary-email (deser-email-address (input "PrimaryEmail"))) (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-string (input "AccountId"))) (clojure.core/contains? input "PersonalPIN") (clojure.core/assoc :personal-pin (deser-string (input "PersonalPIN"))) (clojure.core/contains? input "LicenseType") (clojure.core/assoc :license-type (deser-license (input "LicenseType"))) (clojure.core/contains? input "UserRegistrationStatus") (clojure.core/assoc :user-registration-status (deser-registration-status (input "UserRegistrationStatus")))))

(clojure.core/defn- deser-account-type [input] (clojure.core/get {"Team" :team, "EnterpriseDirectory" :enterprise-directory, "EnterpriseLWA" :enterprise-lwa, "EnterpriseOIDC" :enterprise-oidc} input))

(clojure.core/defn- deser-sensitive-string [input] input)

(clojure.core/defn- deser-error-code [input] (clojure.core/get {"Unprocessable" :unprocessable, "NotFound" :not-found, "BadRequest" :bad-request, "Throttled" :throttled, "Conflict" :conflict, "ServiceUnavailable" :service-unavailable, "ServiceFailure" :service-failure, "Unauthorized" :unauthorized, "PreconditionFailed" :precondition-failed, "Forbidden" :forbidden} input))

(clojure.core/defn- deser-email-status [input] (clojure.core/get {"NotSent" :not-sent, "Sent" :sent, "Failed" :failed} input))

(clojure.core/defn- deser-account [input] (clojure.core/cond-> {:aws-account-id (deser-string (input "AwsAccountId")), :account-id (deser-string (input "AccountId")), :name (deser-string (input "Name"))} (clojure.core/contains? input "AccountType") (clojure.core/assoc :account-type (deser-account-type (input "AccountType"))) (clojure.core/contains? input "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-iso-8601-timestamp (input "CreatedTimestamp"))) (clojure.core/contains? input "DefaultLicense") (clojure.core/assoc :default-license (deser-license (input "DefaultLicense"))) (clojure.core/contains? input "SupportedLicenses") (clojure.core/assoc :supported-licenses (deser-license-list (input "SupportedLicenses")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-invite-status [input] (clojure.core/get {"Pending" :pending, "Accepted" :accepted, "Failed" :failed} input))

(clojure.core/defn- deser-iso-8601-timestamp [input] input)

(clojure.core/defn- deser-account-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account coll))) input))

(clojure.core/defn- deser-license [input] (clojure.core/get {"Basic" :basic, "Plus" :plus, "Pro" :pro, "ProTrial" :pro-trial} input))

(clojure.core/defn- deser-invite [input] (clojure.core/cond-> {} (clojure.core/contains? input "InviteId") (clojure.core/assoc :invite-id (deser-string (input "InviteId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-invite-status (input "Status"))) (clojure.core/contains? input "EmailAddress") (clojure.core/assoc :email-address (deser-email-address (input "EmailAddress"))) (clojure.core/contains? input "EmailStatus") (clojure.core/assoc :email-status (deser-email-status (input "EmailStatus")))))

(clojure.core/defn- deser-invite-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invite coll))) input))

(clojure.core/defn- deser-email-address [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-logout-user-response ([input] (response-logout-user-response nil input)) ([resultWrapper165691 input] (clojure.core/let [rawinput165690 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165692 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper165694 input] (clojure.core/let [rawinput165693 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165695 {"Code" (rawinput165693 "Code"), "Message" (rawinput165693 "Message")}] (clojure.core/cond-> {} (letvar165695 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar165695 ["Code"]))) (letvar165695 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar165695 ["Message"])))))))

(clojure.core/defn- response-delete-account-response ([input] (response-delete-account-response nil input)) ([resultWrapper165697 input] (clojure.core/let [rawinput165696 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165698 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-account-settings-response ([input] (response-update-account-settings-response nil input)) ([resultWrapper165700 input] (clojure.core/let [rawinput165699 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165701 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper165703 input] (clojure.core/let [rawinput165702 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165704 {"Code" (rawinput165702 "Code"), "Message" (rawinput165702 "Message")}] (clojure.core/cond-> {} (letvar165704 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar165704 ["Code"]))) (letvar165704 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar165704 ["Message"])))))))

(clojure.core/defn- response-update-account-response ([input] (response-update-account-response nil input)) ([resultWrapper165706 input] (clojure.core/let [rawinput165705 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165707 {"Account" (rawinput165705 "Account")}] (clojure.core/cond-> {} (letvar165707 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar165707 ["Account"])))))))

(clojure.core/defn- response-unprocessable-entity-exception ([input] (response-unprocessable-entity-exception nil input)) ([resultWrapper165709 input] (clojure.core/let [rawinput165708 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165710 {"Code" (rawinput165708 "Code"), "Message" (rawinput165708 "Message")}] (clojure.core/cond-> {} (letvar165710 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar165710 ["Code"]))) (letvar165710 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar165710 ["Message"])))))))

(clojure.core/defn- response-get-account-response ([input] (response-get-account-response nil input)) ([resultWrapper165712 input] (clojure.core/let [rawinput165711 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165713 {"Account" (rawinput165711 "Account")}] (clojure.core/cond-> {} (letvar165713 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar165713 ["Account"])))))))

(clojure.core/defn- response-service-failure-exception ([input] (response-service-failure-exception nil input)) ([resultWrapper165715 input] (clojure.core/let [rawinput165714 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165716 {"Code" (rawinput165714 "Code"), "Message" (rawinput165714 "Message")}] (clojure.core/cond-> {} (letvar165716 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar165716 ["Code"]))) (letvar165716 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar165716 ["Message"])))))))

(clojure.core/defn- response-list-accounts-response ([input] (response-list-accounts-response nil input)) ([resultWrapper165718 input] (clojure.core/let [rawinput165717 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165719 {"Accounts" (rawinput165717 "Accounts"), "NextToken" (rawinput165717 "NextToken")}] (clojure.core/cond-> {} (letvar165719 "Accounts") (clojure.core/assoc :accounts (deser-account-list (clojure.core/get-in letvar165719 ["Accounts"]))) (letvar165719 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar165719 ["NextToken"])))))))

(clojure.core/defn- response-batch-unsuspend-user-response ([input] (response-batch-unsuspend-user-response nil input)) ([resultWrapper165721 input] (clojure.core/let [rawinput165720 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165722 {"UserErrors" (rawinput165720 "UserErrors")}] (clojure.core/cond-> {} (letvar165722 "UserErrors") (clojure.core/assoc :user-errors (deser-user-error-list (clojure.core/get-in letvar165722 ["UserErrors"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper165724 input] (clojure.core/let [rawinput165723 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165725 {"Code" (rawinput165723 "Code"), "Message" (rawinput165723 "Message")}] (clojure.core/cond-> {} (letvar165725 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar165725 ["Code"]))) (letvar165725 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar165725 ["Message"])))))))

(clojure.core/defn- response-update-user-response ([input] (response-update-user-response nil input)) ([resultWrapper165727 input] (clojure.core/let [rawinput165726 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165728 {"User" (rawinput165726 "User")}] (clojure.core/cond-> {} (letvar165728 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar165728 ["User"])))))))

(clojure.core/defn- response-get-account-settings-response ([input] (response-get-account-settings-response nil input)) ([resultWrapper165730 input] (clojure.core/let [rawinput165729 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165731 {"AccountSettings" (rawinput165729 "AccountSettings")}] (clojure.core/cond-> {} (letvar165731 "AccountSettings") (clojure.core/assoc :account-settings (deser-account-settings (clojure.core/get-in letvar165731 ["AccountSettings"])))))))

(clojure.core/defn- response-create-account-response ([input] (response-create-account-response nil input)) ([resultWrapper165733 input] (clojure.core/let [rawinput165732 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165734 {"Account" (rawinput165732 "Account")}] (clojure.core/cond-> {} (letvar165734 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar165734 ["Account"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper165736 input] (clojure.core/let [rawinput165735 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165737 {"Code" (rawinput165735 "Code"), "Message" (rawinput165735 "Message")}] (clojure.core/cond-> {} (letvar165737 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar165737 ["Code"]))) (letvar165737 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar165737 ["Message"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper165739 input] (clojure.core/let [rawinput165738 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165740 {"Code" (rawinput165738 "Code"), "Message" (rawinput165738 "Message")}] (clojure.core/cond-> {} (letvar165740 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar165740 ["Code"]))) (letvar165740 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar165740 ["Message"])))))))

(clojure.core/defn- response-unauthorized-client-exception ([input] (response-unauthorized-client-exception nil input)) ([resultWrapper165742 input] (clojure.core/let [rawinput165741 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165743 {"Code" (rawinput165741 "Code"), "Message" (rawinput165741 "Message")}] (clojure.core/cond-> {} (letvar165743 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar165743 ["Code"]))) (letvar165743 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar165743 ["Message"])))))))

(clojure.core/defn- response-batch-suspend-user-response ([input] (response-batch-suspend-user-response nil input)) ([resultWrapper165745 input] (clojure.core/let [rawinput165744 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165746 {"UserErrors" (rawinput165744 "UserErrors")}] (clojure.core/cond-> {} (letvar165746 "UserErrors") (clojure.core/assoc :user-errors (deser-user-error-list (clojure.core/get-in letvar165746 ["UserErrors"])))))))

(clojure.core/defn- response-invite-users-response ([input] (response-invite-users-response nil input)) ([resultWrapper165748 input] (clojure.core/let [rawinput165747 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165749 {"Invites" (rawinput165747 "Invites")}] (clojure.core/cond-> {} (letvar165749 "Invites") (clojure.core/assoc :invites (deser-invite-list (clojure.core/get-in letvar165749 ["Invites"])))))))

(clojure.core/defn- response-reset-personal-pin-response ([input] (response-reset-personal-pin-response nil input)) ([resultWrapper165751 input] (clojure.core/let [rawinput165750 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165752 {"User" (rawinput165750 "User")}] (clojure.core/cond-> {} (letvar165752 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar165752 ["User"])))))))

(clojure.core/defn- response-throttled-client-exception ([input] (response-throttled-client-exception nil input)) ([resultWrapper165754 input] (clojure.core/let [rawinput165753 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165755 {"Code" (rawinput165753 "Code"), "Message" (rawinput165753 "Message")}] (clojure.core/cond-> {} (letvar165755 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar165755 ["Code"]))) (letvar165755 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar165755 ["Message"])))))))

(clojure.core/defn- response-list-users-response ([input] (response-list-users-response nil input)) ([resultWrapper165757 input] (clojure.core/let [rawinput165756 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165758 {"Users" (rawinput165756 "Users"), "NextToken" (rawinput165756 "NextToken")}] (clojure.core/cond-> {} (letvar165758 "Users") (clojure.core/assoc :users (deser-user-list (clojure.core/get-in letvar165758 ["Users"]))) (letvar165758 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar165758 ["NextToken"])))))))

(clojure.core/defn- response-batch-update-user-response ([input] (response-batch-update-user-response nil input)) ([resultWrapper165760 input] (clojure.core/let [rawinput165759 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165761 {"UserErrors" (rawinput165759 "UserErrors")}] (clojure.core/cond-> {} (letvar165761 "UserErrors") (clojure.core/assoc :user-errors (deser-user-error-list (clojure.core/get-in letvar165761 ["UserErrors"])))))))

(clojure.core/defn- response-get-user-response ([input] (response-get-user-response nil input)) ([resultWrapper165763 input] (clojure.core/let [rawinput165762 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar165764 {"User" (rawinput165762 "User")}] (clojure.core/cond-> {} (letvar165764 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar165764 ["User"])))))))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/user-error-list (clojure.spec.alpha/coll-of :portkey.aws.chime.-2018-05-01/user-error))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/license-list (clojure.spec.alpha/coll-of :portkey.aws.chime.-2018-05-01/license))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/logout-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.update-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.update-user-request/user-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.update-user-request/license-type (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/license))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/update-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.update-user-request/account-id :portkey.aws.chime.-2018-05-01.update-user-request/user-id] :opt-un [:portkey.aws.chime.-2018-05-01.update-user-request/license-type]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.get-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.get-user-request/user-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/get-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.get-user-request/account-id :portkey.aws.chime.-2018-05-01.get-user-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/user-list (clojure.spec.alpha/coll-of :portkey.aws.chime.-2018-05-01/user))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/profile-service-max-results (clojure.spec.alpha/int-in 1 200))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".*\S.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-users-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-users-request/user-email (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/email-address))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-users-request/max-results (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/profile-service-max-results))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-users-request/next-token (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/list-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.list-users-request/account-id] :opt-un [:portkey.aws.chime.-2018-05-01.list-users-request/user-email :portkey.aws.chime.-2018-05-01.list-users-request/max-results :portkey.aws.chime.-2018-05-01.list-users-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.bad-request-exception/code (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.bad-request-exception/code :portkey.aws.chime.-2018-05-01.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/delete-account-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/update-account-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/user-id-list (clojure.spec.alpha/coll-of :portkey.aws.chime.-2018-05-01/non-empty-string :max-count 50))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/registration-status #{"Unregistered" "Suspended" :unregistered "Registered" :suspended :registered})

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.forbidden-exception/code (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.forbidden-exception/code :portkey.aws.chime.-2018-05-01.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.account-settings/disable-remote-control (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/boolean))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.account-settings/enable-dial-out (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/boolean))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/account-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.account-settings/disable-remote-control :portkey.aws.chime.-2018-05-01.account-settings/enable-dial-out]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/update-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01/account]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.unprocessable-entity-exception/code (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.unprocessable-entity-exception/message (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/unprocessable-entity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.unprocessable-entity-exception/code :portkey.aws.chime.-2018-05-01.unprocessable-entity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/get-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01/account]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.service-failure-exception/code (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.service-failure-exception/message (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/service-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.service-failure-exception/code :portkey.aws.chime.-2018-05-01.service-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-accounts-request/name (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/account-name))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-accounts-request/user-email (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/email-address))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-accounts-request/next-token (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-accounts-request/max-results (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/profile-service-max-results))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/list-accounts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.list-accounts-request/name :portkey.aws.chime.-2018-05-01.list-accounts-request/user-email :portkey.aws.chime.-2018-05-01.list-accounts-request/next-token :portkey.aws.chime.-2018-05-01.list-accounts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user-error/user-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user-error/error-message (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/user-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.user-error/user-id :portkey.aws.chime.-2018-05-01/error-code :portkey.aws.chime.-2018-05-01.user-error/error-message]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user/registered-on (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/iso-8601-timestamp))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user/invited-on (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/iso-8601-timestamp))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user/user-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user/display-name (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/sensitive-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user/user-invitation-status (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/invite-status))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user/primary-email (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/email-address))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user/personal-pin (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user/license-type (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/license))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.user/user-registration-status (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/registration-status))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/user (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.user/user-id] :opt-un [:portkey.aws.chime.-2018-05-01.user/registered-on :portkey.aws.chime.-2018-05-01.user/invited-on :portkey.aws.chime.-2018-05-01.user/display-name :portkey.aws.chime.-2018-05-01.user/user-invitation-status :portkey.aws.chime.-2018-05-01.user/primary-email :portkey.aws.chime.-2018-05-01.user/account-id :portkey.aws.chime.-2018-05-01.user/personal-pin :portkey.aws.chime.-2018-05-01.user/license-type :portkey.aws.chime.-2018-05-01.user/user-registration-status]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-accounts-response/accounts (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/account-list))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-accounts-response/next-token (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/list-accounts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.list-accounts-response/accounts :portkey.aws.chime.-2018-05-01.list-accounts-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.batch-unsuspend-user-response/user-errors (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/user-error-list))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/batch-unsuspend-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.batch-unsuspend-user-response/user-errors]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.service-unavailable-exception/code (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.service-unavailable-exception/code :portkey.aws.chime.-2018-05-01.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/account-type #{"EnterpriseLWA" "EnterpriseDirectory" "EnterpriseOIDC" :team "Team" :enterprise-oidc :enterprise-directory :enterprise-lwa})

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.update-account-settings-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/update-account-settings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.update-account-settings-request/account-id :portkey.aws.chime.-2018-05-01/account-settings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.logout-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.logout-user-request/user-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/logout-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.logout-user-request/account-id :portkey.aws.chime.-2018-05-01.logout-user-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/update-user-request-item-list (clojure.spec.alpha/coll-of :portkey.aws.chime.-2018-05-01/update-user-request-item :max-count 20))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/update-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01/user]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/sensitive-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.update-account-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.update-account-request/name (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/account-name))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/update-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.update-account-request/account-id] :opt-un [:portkey.aws.chime.-2018-05-01.update-account-request/name]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/get-account-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01/account-settings]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/create-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01/account]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.update-user-request-item/user-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.update-user-request-item/license-type (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/license))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/update-user-request-item (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.update-user-request-item/user-id] :opt-un [:portkey.aws.chime.-2018-05-01.update-user-request-item/license-type]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/error-code #{"Unprocessable" "NotFound" :unauthorized "BadRequest" :precondition-failed "Throttled" "Conflict" "ServiceUnavailable" :forbidden "ServiceFailure" :service-unavailable :not-found :unprocessable "Unauthorized" "PreconditionFailed" :bad-request :throttled "Forbidden" :conflict :service-failure})

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/email-status #{:not-sent "Failed" "Sent" :sent "NotSent" :failed})

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.conflict-exception/code (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.conflict-exception/code :portkey.aws.chime.-2018-05-01.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.account/aws-account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.account/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.account/name (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.account/created-timestamp (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/iso-8601-timestamp))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.account/default-license (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/license))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.account/supported-licenses (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/license-list))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/account (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.account/aws-account-id :portkey.aws.chime.-2018-05-01.account/account-id :portkey.aws.chime.-2018-05-01.account/name] :opt-un [:portkey.aws.chime.-2018-05-01/account-type :portkey.aws.chime.-2018-05-01.account/created-timestamp :portkey.aws.chime.-2018-05-01.account/default-license :portkey.aws.chime.-2018-05-01.account/supported-licenses]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.batch-unsuspend-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/batch-unsuspend-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.batch-unsuspend-user-request/account-id :portkey.aws.chime.-2018-05-01/user-id-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.not-found-exception/code (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.not-found-exception/code :portkey.aws.chime.-2018-05-01.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.delete-account-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/delete-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.delete-account-request/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/invite-status #{"Failed" :pending :accepted "Pending" "Accepted" :failed})

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.unauthorized-client-exception/code (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.unauthorized-client-exception/message (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/unauthorized-client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.unauthorized-client-exception/code :portkey.aws.chime.-2018-05-01.unauthorized-client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.batch-suspend-user-response/user-errors (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/user-error-list))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/batch-suspend-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.batch-suspend-user-response/user-errors]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.invite-users-response/invites (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/invite-list))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/invite-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.invite-users-response/invites]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/iso-8601-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/user-email-list (clojure.spec.alpha/coll-of :portkey.aws.chime.-2018-05-01/email-address :max-count 50))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/account-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".*\S.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/reset-personal-pin-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01/user]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.batch-suspend-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/batch-suspend-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.batch-suspend-user-request/account-id :portkey.aws.chime.-2018-05-01/user-id-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.get-account-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/get-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.get-account-request/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.reset-personal-pin-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.reset-personal-pin-request/user-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/reset-personal-pin-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.reset-personal-pin-request/account-id :portkey.aws.chime.-2018-05-01.reset-personal-pin-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/account-list (clojure.spec.alpha/coll-of :portkey.aws.chime.-2018-05-01/account))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.invite-users-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/invite-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.invite-users-request/account-id :portkey.aws.chime.-2018-05-01/user-email-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/license #{:pro-trial "ProTrial" :pro "Plus" :plus "Basic" :basic "Pro"})

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.invite/invite-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.invite/status (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/invite-status))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/invite (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.invite/invite-id :portkey.aws.chime.-2018-05-01.invite/status :portkey.aws.chime.-2018-05-01/email-address :portkey.aws.chime.-2018-05-01/email-status]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/invite-list (clojure.spec.alpha/coll-of :portkey.aws.chime.-2018-05-01/invite))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.throttled-client-exception/code (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.throttled-client-exception/message (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/throttled-client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.throttled-client-exception/code :portkey.aws.chime.-2018-05-01.throttled-client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/email-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".+@.+\..+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-users-response/users (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/user-list))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.list-users-response/next-token (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/list-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.list-users-response/users :portkey.aws.chime.-2018-05-01.list-users-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.get-account-settings-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/get-account-settings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.get-account-settings-request/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.batch-update-user-response/user-errors (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/user-error-list))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/batch-update-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01.batch-update-user-response/user-errors]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.create-account-request/name (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/account-name))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/create-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.create-account-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.batch-update-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01.batch-update-user-request/update-user-request-items (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/update-user-request-item-list))
(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/batch-update-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.-2018-05-01.batch-update-user-request/account-id :portkey.aws.chime.-2018-05-01.batch-update-user-request/update-user-request-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/get-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.-2018-05-01/user]))

(clojure.spec.alpha/def :portkey.aws.chime.-2018-05-01/boolean clojure.core/boolean?)

(clojure.core/defn update-account "Updates account details for the specified Amazon Chime account. Currently, only\naccount name updates are supported for this action." ([update-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-account-request update-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/update-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/update-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAccount", :http.request.configuration/output-deser-fn response-update-account-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-account :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/update-account-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/update-account-response))

(clojure.core/defn update-account-settings "Updates the settings for the specified Amazon Chime account. You can update\nsettings for remote control of shared screens, or for the dial-out option. For\nmore information about these settings, see Use the Policies Page\n(https://docs.aws.amazon.com/chime/latest/ag/policies.html) in the Amazon Chime\nAdministration Guide." ([update-account-settings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-account-settings-request update-account-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/update-account-settings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/settings", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/update-account-settings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAccountSettings", :http.request.configuration/output-deser-fn response-update-account-settings-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "ConflictException" :portkey.aws.chime.-2018-05-01/conflict-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-account-settings :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/update-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/update-account-settings-response))

(clojure.core/defn invite-users "Sends email invites to as many as 50 users, inviting them to the specified\nAmazon Chime Team account. Only Team account types are currently supported for\nthis action." ([invite-users-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-invite-users-request invite-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/invite-users-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users?operation=add", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/invite-users-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InviteUsers", :http.request.configuration/output-deser-fn response-invite-users-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef invite-users :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/invite-users-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/invite-users-response))

(clojure.core/defn get-account-settings "Retrieves account settings for the specified Amazon Chime account ID, such as\nremote control and dial out settings. For more information about these settings,\nsee Use the Policies Page\n(https://docs.aws.amazon.com/chime/latest/ag/policies.html) in the Amazon Chime\nAdministration Guide." ([get-account-settings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-account-settings-request get-account-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/get-account-settings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/settings", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/get-account-settings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAccountSettings", :http.request.configuration/output-deser-fn response-get-account-settings-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-account-settings :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/get-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/get-account-settings-response))

(clojure.core/defn create-account "Creates an Amazon Chime account under the administrator's AWS account. Only Team\naccount types are currently supported for this action. For more information\nabout different account types, see Managing Your Amazon Chime Accounts\n(https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html) in the\nAmazon Chime Administration Guide." ([create-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-account-request create-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/create-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/create-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAccount", :http.request.configuration/output-deser-fn response-create-account-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-account :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/create-account-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/create-account-response))

(clojure.core/defn delete-account "Deletes the specified Amazon Chime account. You must suspend all users before\ndeleting a Team account. You can use the BatchSuspendUser action to do so.\n For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed\ndomains for your Amazon Chime account before deletion. As soon as you release\nthe domain, all users under that account are suspended.\n Deleted accounts appear in your Disabled accounts list for 90 days. To restore\na deleted account from your Disabled accounts list, you must contact AWS\nSupport.\n After 90 days, deleted accounts are permanently removed from your Disabled\naccounts list." ([delete-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-account-request delete-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/delete-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/delete-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAccount", :http.request.configuration/output-deser-fn response-delete-account-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "UnprocessableEntityException" :portkey.aws.chime.-2018-05-01/unprocessable-entity-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-account :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/delete-account-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/delete-account-response))

(clojure.core/defn list-accounts "Lists the Amazon Chime accounts under the administrator's AWS account. You can\nfilter accounts by account name prefix. To find out which Amazon Chime account a\nuser belongs to, you can filter by the user's email address, which returns one\naccount result." ([] (list-accounts {})) ([list-accounts-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-accounts-request list-accounts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/list-accounts-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/list-accounts-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAccounts", :http.request.configuration/output-deser-fn response-list-accounts-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-accounts :args (clojure.spec.alpha/? :portkey.aws.chime.-2018-05-01/list-accounts-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/list-accounts-response))

(clojure.core/defn logout-user "Logs out the specified user from all of the devices they are currently logged\ninto." ([logout-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-logout-user-request logout-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/logout-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users/{userId}?operation=logout", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/logout-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "LogoutUser", :http.request.configuration/output-deser-fn response-logout-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef logout-user :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/logout-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/logout-user-response))

(clojure.core/defn reset-personal-pin "Resets the personal meeting PIN for the specified user on an Amazon Chime\naccount. Returns the User object with the updated personal meeting PIN." ([reset-personal-pin-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-reset-personal-pin-request reset-personal-pin-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/reset-personal-pin-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users/{userId}?operation=reset-personal-pin", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/reset-personal-pin-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResetPersonalPIN", :http.request.configuration/output-deser-fn response-reset-personal-pin-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef reset-personal-pin :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/reset-personal-pin-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/reset-personal-pin-response))

(clojure.core/defn get-account "Retrieves details for the specified Amazon Chime account, such as account type\nand supported licenses." ([get-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-account-request get-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/get-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/get-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAccount", :http.request.configuration/output-deser-fn response-get-account-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-account :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/get-account-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/get-account-response))

(clojure.core/defn list-users "Lists the users that belong to the specified Amazon Chime account. You can\nspecify an email address to list only the user that the email address belongs\nto." ([list-users-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/list-users-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/list-users-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUsers", :http.request.configuration/output-deser-fn response-list-users-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/list-users-response))

(clojure.core/defn batch-update-user "Updates user details within the UpdateUserRequestItem object for up to 20 users\nfor the specified Amazon Chime account. Currently, only LicenseType updates are\nsupported for this action." ([batch-update-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-update-user-request batch-update-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/batch-update-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/batch-update-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchUpdateUser", :http.request.configuration/output-deser-fn response-batch-update-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef batch-update-user :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/batch-update-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/batch-update-user-response))

(clojure.core/defn batch-unsuspend-user "Removes the suspension from up to 50 previously suspended users for the\nspecified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA\naccounts can be unsuspended using this action. For more information about\ndifferent account types, see Managing Your Amazon Chime Accounts\n(https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html) in the\nAmazon Chime Administration Guide.\n Previously suspended users who are unsuspended using this action are returned\nto Registered status. Users who are not previously suspended are ignored." ([batch-unsuspend-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-unsuspend-user-request batch-unsuspend-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/batch-unsuspend-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users?operation=unsuspend", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/batch-unsuspend-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchUnsuspendUser", :http.request.configuration/output-deser-fn response-batch-unsuspend-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef batch-unsuspend-user :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/batch-unsuspend-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/batch-unsuspend-user-response))

(clojure.core/defn batch-suspend-user "Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For\nmore information about different account types, see Managing Your Amazon Chime\nAccounts (https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html)\nin the Amazon Chime Administration Guide.\n Users suspended from a Team account are dissociated from the account, but they\ncan continue to use Amazon Chime as free users. To remove the suspension from\nsuspended Team account users, invite them to the Team account again. You can use\nthe InviteUsers action to do so.\n Users suspended from an EnterpriseLWA account are immediately signed out of\nAmazon Chime and are no longer able to sign in. To remove the suspension from\nsuspended EnterpriseLWA account users, use the BatchUnsuspendUser action.\n To sign out users without suspending them, use the LogoutUser action." ([batch-suspend-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-suspend-user-request batch-suspend-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/batch-suspend-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users?operation=suspend", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/batch-suspend-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchSuspendUser", :http.request.configuration/output-deser-fn response-batch-suspend-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef batch-suspend-user :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/batch-suspend-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/batch-suspend-user-response))

(clojure.core/defn update-user "Updates user details for a specified user ID. Currently, only LicenseType\nupdates are supported for this action." ([update-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-request update-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/update-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users/{userId}", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/update-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUser", :http.request.configuration/output-deser-fn response-update-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-user :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/update-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/update-user-response))

(clojure.core/defn get-user "Retrieves details for the specified user ID, such as primary email address,\nlicense type, and personal meeting PIN.\n To retrieve user details with an email address instead of a user ID, use the\nListUsers action, and then filter by email address." ([get-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-user-request get-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.chime.-2018-05-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime.-2018-05-01/get-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users/{userId}", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime.-2018-05-01/get-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUser", :http.request.configuration/output-deser-fn response-get-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime.-2018-05-01/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime.-2018-05-01/not-found-exception, "ForbiddenException" :portkey.aws.chime.-2018-05-01/forbidden-exception, "BadRequestException" :portkey.aws.chime.-2018-05-01/bad-request-exception, "ThrottledClientException" :portkey.aws.chime.-2018-05-01/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime.-2018-05-01/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime.-2018-05-01/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-user :args (clojure.spec.alpha/tuple :portkey.aws.chime.-2018-05-01/get-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime.-2018-05-01/get-user-response))
