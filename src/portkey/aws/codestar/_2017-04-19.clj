(ns portkey.aws.codestar.-2017-04-19 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "codestar", :region "ap-northeast-1"},
    :ssl-common-name "codestar.ap-northeast-1.amazonaws.com",
    :endpoint "https://codestar.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codestar", :region "eu-west-1"},
    :ssl-common-name "codestar.eu-west-1.amazonaws.com",
    :endpoint "https://codestar.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codestar", :region "us-east-2"},
    :ssl-common-name "codestar.us-east-2.amazonaws.com",
    :endpoint "https://codestar.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "codestar", :region "ap-southeast-2"},
    :ssl-common-name "codestar.ap-southeast-2.amazonaws.com",
    :endpoint "https://codestar.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "codestar", :region "ap-southeast-1"},
    :ssl-common-name "codestar.ap-southeast-1.amazonaws.com",
    :endpoint "https://codestar.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "codestar", :region "ap-northeast-2"},
    :ssl-common-name "codestar.ap-northeast-2.amazonaws.com",
    :endpoint "https://codestar.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "codestar", :region "ca-central-1"},
    :ssl-common-name "codestar.ca-central-1.amazonaws.com",
    :endpoint "https://codestar.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "codestar", :region "eu-central-1"},
    :ssl-common-name "codestar.eu-central-1.amazonaws.com",
    :endpoint "https://codestar.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codestar", :region "eu-west-2"},
    :ssl-common-name "codestar.eu-west-2.amazonaws.com",
    :endpoint "https://codestar.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codestar", :region "us-west-2"},
    :ssl-common-name "codestar.us-west-2.amazonaws.com",
    :endpoint "https://codestar.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codestar", :region "us-east-1"},
    :ssl-common-name "codestar.us-east-1.amazonaws.com",
    :endpoint "https://codestar.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codestar", :region "us-west-1"},
    :ssl-common-name "codestar.us-west-1.amazonaws.com",
    :endpoint "https://codestar.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-remote-access-allowed)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-delete-stack)

(clojure.core/declare ser-email)

(clojure.core/declare ser-ssh-public-key)

(clojure.core/declare ser-user-profile-display-name)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-role)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-project-description)

(clojure.core/declare ser-project-id)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-project-name)

(clojure.core/declare ser-user-arn)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-remote-access-allowed [input] #:http.request.field{:value input, :shape "RemoteAccessAllowed"})

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-delete-stack [input] #:http.request.field{:value input, :shape "DeleteStack"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-ssh-public-key [input] #:http.request.field{:value input, :shape "SshPublicKey"})

(clojure.core/defn- ser-user-profile-display-name [input] #:http.request.field{:value input, :shape "UserProfileDisplayName"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-role [input] #:http.request.field{:value input, :shape "Role"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-project-description [input] #:http.request.field{:value input, :shape "ProjectDescription"})

(clojure.core/defn- ser-project-id [input] #:http.request.field{:value input, :shape "ProjectId"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-project-name [input] #:http.request.field{:value input, :shape "ProjectName"})

(clojure.core/defn- ser-user-arn [input] #:http.request.field{:value input, :shape "UserArn"})

(clojure.core/defn- req-list-projects-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-user-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-tags-for-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-team-members-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-describe-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]}))

(clojure.core/defn- req-update-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"}))))

(clojure.core/defn- req-create-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName"}) (clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"}))))

(clojure.core/defn- req-describe-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]}))

(clojure.core/defn- req-untag-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"}) (clojure.core/into (ser-tag-keys (input :tags)) #:http.request.field{:name "tags", :shape "TagKeys"})]}))

(clojure.core/defn- req-delete-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]}))

(clojure.core/defn- req-update-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]} (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-profile-display-name (input :display-name)) #:http.request.field{:name "displayName", :shape "UserProfileDisplayName"})) (clojure.core/contains? input :email-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email-address)) #:http.request.field{:name "emailAddress", :shape "Email"})) (clojure.core/contains? input :ssh-public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssh-public-key (input :ssh-public-key)) #:http.request.field{:name "sshPublicKey", :shape "SshPublicKey"}))))

(clojure.core/defn- req-associate-team-member-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"}) (clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"}) (clojure.core/into (ser-role (input :project-role)) #:http.request.field{:name "projectRole", :shape "Role"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :remote-access-allowed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remote-access-allowed (input :remote-access-allowed)) #:http.request.field{:name "remoteAccessAllowed", :shape "RemoteAccessAllowed", :box true}))))

(clojure.core/defn- req-create-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"}) (clojure.core/into (ser-user-profile-display-name (input :display-name)) #:http.request.field{:name "displayName", :shape "UserProfileDisplayName"}) (clojure.core/into (ser-email (input :email-address)) #:http.request.field{:name "emailAddress", :shape "Email"})]} (clojure.core/contains? input :ssh-public-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssh-public-key (input :ssh-public-key)) #:http.request.field{:name "sshPublicKey", :shape "SshPublicKey"}))))

(clojure.core/defn- req-disassociate-team-member-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"}) (clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]}))

(clojure.core/defn- req-delete-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :delete-stack) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-stack (input :delete-stack)) #:http.request.field{:name "deleteStack", :shape "DeleteStack"}))))

(clojure.core/defn- req-tag-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})]}))

(clojure.core/defn- req-update-team-member-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"}) (clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]} (clojure.core/contains? input :project-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role (input :project-role)) #:http.request.field{:name "projectRole", :shape "Role"})) (clojure.core/contains? input :remote-access-allowed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remote-access-allowed (input :remote-access-allowed)) #:http.request.field{:name "remoteAccessAllowed", :shape "RemoteAccessAllowed", :box true}))))

(clojure.core/declare deser-user-profile-summary)

(clojure.core/declare deser-remote-access-allowed)

(clojure.core/declare deser-created-timestamp)

(clojure.core/declare deser-client-request-token)

(clojure.core/declare deser-project-template-id)

(clojure.core/declare deser-email)

(clojure.core/declare deser-ssh-public-key)

(clojure.core/declare deser-user-profile-display-name)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-user-profiles-list)

(clojure.core/declare deser-project-arn)

(clojure.core/declare deser-resource-id)

(clojure.core/declare deser-role)

(clojure.core/declare deser-project-status)

(clojure.core/declare deser-last-modified-timestamp)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-stack-id)

(clojure.core/declare deser-project-description)

(clojure.core/declare deser-project-id)

(clojure.core/declare deser-team-member-result)

(clojure.core/declare deser-project-summary)

(clojure.core/declare deser-state)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-reason)

(clojure.core/declare deser-project-name)

(clojure.core/declare deser-projects-list)

(clojure.core/declare deser-resources-result)

(clojure.core/declare deser-user-arn)

(clojure.core/declare deser-team-member)

(clojure.core/defn- deser-user-profile-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "userArn") (clojure.core/assoc :user-arn (deser-user-arn (input "userArn"))) (clojure.core/contains? input "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (input "displayName"))) (clojure.core/contains? input "emailAddress") (clojure.core/assoc :email-address (deser-email (input "emailAddress"))) (clojure.core/contains? input "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (input "sshPublicKey")))))

(clojure.core/defn- deser-remote-access-allowed [input] input)

(clojure.core/defn- deser-created-timestamp [input] input)

(clojure.core/defn- deser-client-request-token [input] input)

(clojure.core/defn- deser-project-template-id [input] input)

(clojure.core/defn- deser-email [input] input)

(clojure.core/defn- deser-ssh-public-key [input] input)

(clojure.core/defn- deser-user-profile-display-name [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-user-profiles-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-profile-summary coll))) input))

(clojure.core/defn- deser-project-arn [input] input)

(clojure.core/defn- deser-resource-id [input] input)

(clojure.core/defn- deser-role [input] input)

(clojure.core/defn- deser-project-status [input] (clojure.core/cond-> {:state (deser-state (input "state"))} (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-reason (input "reason")))))

(clojure.core/defn- deser-last-modified-timestamp [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-stack-id [input] input)

(clojure.core/defn- deser-project-description [input] input)

(clojure.core/defn- deser-project-id [input] input)

(clojure.core/defn- deser-team-member-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-team-member coll))) input))

(clojure.core/defn- deser-project-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "projectId") (clojure.core/assoc :project-id (deser-project-id (input "projectId"))) (clojure.core/contains? input "projectArn") (clojure.core/assoc :project-arn (deser-project-arn (input "projectArn")))))

(clojure.core/defn- deser-state [input] input)

(clojure.core/defn- deser-resource [input] (clojure.core/cond-> {:id (deser-resource-id (input "id"))}))

(clojure.core/defn- deser-reason [input] input)

(clojure.core/defn- deser-project-name [input] input)

(clojure.core/defn- deser-projects-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project-summary coll))) input))

(clojure.core/defn- deser-resources-result [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource coll))) input))

(clojure.core/defn- deser-user-arn [input] input)

(clojure.core/defn- deser-team-member [input] (clojure.core/cond-> {:user-arn (deser-user-arn (input "userArn")), :project-role (deser-role (input "projectRole"))} (clojure.core/contains? input "remoteAccessAllowed") (clojure.core/assoc :remote-access-allowed (deser-remote-access-allowed (input "remoteAccessAllowed")))))

(clojure.core/defn- deser-describe-project-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "stackId") (clojure.core/assoc :stack-id (deser-stack-id (input "stackId"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-project-arn (input "arn"))) (clojure.core/contains? input "projectTemplateId") (clojure.core/assoc :project-template-id (deser-project-template-id (input "projectTemplateId"))) (clojure.core/contains? input "createdTimeStamp") (clojure.core/assoc :created-time-stamp (deser-created-timestamp (input "createdTimeStamp"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-project-id (input "id"))) (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (input "clientRequestToken"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-project-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-project-status (input "status"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-project-description (input "description")))))

(clojure.core/defn- deser-list-projects-result [input] (clojure.core/cond-> {:projects (deser-projects-list (input "projects"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-update-project-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-validation-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-project-creation-failed-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-team-member-already-associated-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-user-profiles-result [input] (clojure.core/cond-> {:user-profiles (deser-user-profiles-list (input "userProfiles"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-user-profile-not-found-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-service-role-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-disassociate-team-member-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-next-token-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-tag-project-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags")))))

(clojure.core/defn- deser-untag-project-result [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-project-result [input] (clojure.core/cond-> {:id (deser-project-id (input "id")), :arn (deser-project-arn (input "arn"))} (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (input "clientRequestToken"))) (clojure.core/contains? input "projectTemplateId") (clojure.core/assoc :project-template-id (deser-project-template-id (input "projectTemplateId")))))

(clojure.core/defn- deser-user-profile-already-exists-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-resources-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "resources") (clojure.core/assoc :resources (deser-resources-result (input "resources"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-project-already-exists-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-team-member-not-found-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-user-profile-result [input] (clojure.core/cond-> {:user-arn (deser-user-arn (input "userArn")), :created-timestamp (deser-created-timestamp (input "createdTimestamp")), :last-modified-timestamp (deser-last-modified-timestamp (input "lastModifiedTimestamp"))} (clojure.core/contains? input "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (input "displayName"))) (clojure.core/contains? input "emailAddress") (clojure.core/assoc :email-address (deser-email (input "emailAddress"))) (clojure.core/contains? input "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (input "sshPublicKey")))))

(clojure.core/defn- deser-delete-project-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "stackId") (clojure.core/assoc :stack-id (deser-stack-id (input "stackId"))) (clojure.core/contains? input "projectArn") (clojure.core/assoc :project-arn (deser-project-arn (input "projectArn")))))

(clojure.core/defn- deser-associate-team-member-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (input "clientRequestToken")))))

(clojure.core/defn- deser-update-team-member-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "userArn") (clojure.core/assoc :user-arn (deser-user-arn (input "userArn"))) (clojure.core/contains? input "projectRole") (clojure.core/assoc :project-role (deser-role (input "projectRole"))) (clojure.core/contains? input "remoteAccessAllowed") (clojure.core/assoc :remote-access-allowed (deser-remote-access-allowed (input "remoteAccessAllowed")))))

(clojure.core/defn- deser-create-user-profile-result [input] (clojure.core/cond-> {:user-arn (deser-user-arn (input "userArn"))} (clojure.core/contains? input "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (input "displayName"))) (clojure.core/contains? input "emailAddress") (clojure.core/assoc :email-address (deser-email (input "emailAddress"))) (clojure.core/contains? input "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (input "sshPublicKey"))) (clojure.core/contains? input "createdTimestamp") (clojure.core/assoc :created-timestamp (deser-created-timestamp (input "createdTimestamp"))) (clojure.core/contains? input "lastModifiedTimestamp") (clojure.core/assoc :last-modified-timestamp (deser-last-modified-timestamp (input "lastModifiedTimestamp")))))

(clojure.core/defn- deser-list-tags-for-project-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-list-team-members-result [input] (clojure.core/cond-> {:team-members (deser-team-member-result (input "teamMembers"))} (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "nextToken")))))

(clojure.core/defn- deser-project-not-found-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-concurrent-modification-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-project-configuration-exception [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-user-profile-result [input] (clojure.core/cond-> {:user-arn (deser-user-arn (input "userArn"))}))

(clojure.core/defn- deser-update-user-profile-result [input] (clojure.core/cond-> {:user-arn (deser-user-arn (input "userArn"))} (clojure.core/contains? input "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (input "displayName"))) (clojure.core/contains? input "emailAddress") (clojure.core/assoc :email-address (deser-email (input "emailAddress"))) (clojure.core/contains? input "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (input "sshPublicKey"))) (clojure.core/contains? input "createdTimestamp") (clojure.core/assoc :created-timestamp (deser-created-timestamp (input "createdTimestamp"))) (clojure.core/contains? input "lastModifiedTimestamp") (clojure.core/assoc :last-modified-timestamp (deser-last-modified-timestamp (input "lastModifiedTimestamp")))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/tag-key))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.user-profile-summary/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.user-profile-summary/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.user-profile-summary/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.user-profile-summary/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-profile-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.user-profile-summary/user-arn :portkey.aws.codestar.-2017-04-19.user-profile-summary/display-name :portkey.aws.codestar.-2017-04-19.user-profile-summary/email-address :portkey.aws.codestar.-2017-04-19.user-profile-summary/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/stack-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/stack-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/project-template-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-template-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/created-time-stamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/status (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-status))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/description (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/describe-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.describe-project-result/stack-id :portkey.aws.codestar.-2017-04-19.describe-project-result/arn :portkey.aws.codestar.-2017-04-19.describe-project-result/project-template-id :portkey.aws.codestar.-2017-04-19.describe-project-result/created-time-stamp :portkey.aws.codestar.-2017-04-19.describe-project-result/id :portkey.aws.codestar.-2017-04-19.describe-project-result/client-request-token :portkey.aws.codestar.-2017-04-19.describe-project-result/name :portkey.aws.codestar.-2017-04-19.describe-project-result/status :portkey.aws.codestar.-2017-04-19.describe-project-result/description]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-projects-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-projects-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-projects-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.list-projects-request/next-token :portkey.aws.codestar.-2017-04-19.list-projects-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-projects-result/projects (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/projects-list))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-projects-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-projects-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-projects-result/projects] :opt-un [:portkey.aws.codestar.-2017-04-19.list-projects-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-project-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-user-profiles-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-user-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-user-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.list-user-profiles-request/next-token :portkey.aws.codestar.-2017-04-19.list-user-profiles-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-tags-for-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/id] :opt-un [:portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/next-token :portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/remote-access-allowed clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/created-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[\w:/-]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-resources-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-resources-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-resources-request/project-id] :opt-un [:portkey.aws.codestar.-2017-04-19.list-resources-request/next-token :portkey.aws.codestar.-2017-04-19.list-resources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/delete-stack clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-template-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]{0,5}:codestar:[^:\s]+::project-template(\/(github|codecommit))?\/[a-z0-9-]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 3 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[\w-.+]+@[\w-.+]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-team-members-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-team-members-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-team-members-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-team-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-team-members-request/project-id] :opt-un [:portkey.aws.codestar.-2017-04-19.list-team-members-request/next-token :portkey.aws.codestar.-2017-04-19.list-team-members-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-creation-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/team-member-already-associated-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/ssh-public-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 16384)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[\t\r\n\u0020-\u00FF]*$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-user-profiles-result/user-profiles (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profiles-list))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-user-profiles-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-user-profiles-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-user-profiles-result/user-profiles] :opt-un [:portkey.aws.codestar.-2017-04-19.list-user-profiles-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-profile-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-profile-display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 64)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/describe-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.describe-user-profile-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 128)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 512)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[\w/+=]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tags (clojure.spec.alpha/map-of :portkey.aws.codestar.-2017-04-19/tag-key :portkey.aws.codestar.-2017-04-19/tag-value))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/disassociate-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-project-request/name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-project-request/description (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.update-project-request/id] :opt-un [:portkey.aws.codestar.-2017-04-19.update-project-request/name :portkey.aws.codestar.-2017-04-19.update-project-request/description]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-profiles-list (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/user-profile-summary))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/description (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tags))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/create-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.create-project-request/name :portkey.aws.codestar.-2017-04-19.create-project-request/id] :opt-un [:portkey.aws.codestar.-2017-04-19.create-project-request/description :portkey.aws.codestar.-2017-04-19.create-project-request/client-request-token :portkey.aws.codestar.-2017-04-19.create-project-request/tags]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]*:codestar:[^:\s]+:[0-9]{12}:project\/[a-z]([a-z0-9|-])+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.tag-project-result/tags (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tags))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tag-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.tag-project-result/tags]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 11 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^arn\:aws\:\S.*\:.*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/untag-project-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^(Owner|Viewer|Contributor)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/describe-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.describe-project-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-result/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-result/arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-result/project-template-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-template-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/create-project-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.create-project-result/id :portkey.aws.codestar.-2017-04-19.create-project-result/arn] :opt-un [:portkey.aws.codestar.-2017-04-19.create-project-result/client-request-token :portkey.aws.codestar.-2017-04-19.create-project-result/project-template-id]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-profile-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-resources-result/resources (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/resources-result))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-resources-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.list-resources-result/resources :portkey.aws.codestar.-2017-04-19.list-resources-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.untag-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.untag-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tag-keys))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/untag-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.untag-project-request/id :portkey.aws.codestar.-2017-04-19.untag-project-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/delete-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.delete-user-profile-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-request/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-request/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-request/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.update-user-profile-request/user-arn] :opt-un [:portkey.aws.codestar.-2017-04-19.update-user-profile-request/display-name :portkey.aws.codestar.-2017-04-19.update-user-profile-request/email-address :portkey.aws.codestar.-2017-04-19.update-user-profile-request/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.project-status/state (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/state))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.project-status/reason (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/reason))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-status (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.project-status/state] :opt-un [:portkey.aws.codestar.-2017-04-19.project-status/reason]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/last-modified-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/team-member-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/created-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/last-modified-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/describe-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.describe-user-profile-result/user-arn :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/created-timestamp :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/last-modified-timestamp] :opt-un [:portkey.aws.codestar.-2017-04-19.describe-user-profile-result/display-name :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/email-address :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/stack-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]*:cloudformation:[^:\s]+:[0-9]{12}:stack\/[^:\s]+\/[^:\s]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^$|^\S(.*\S)?$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-project-result/stack-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/stack-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-project-result/project-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/delete-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.delete-project-result/stack-id :portkey.aws.codestar.-2017-04-19.delete-project-result/project-arn]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/associate-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.associate-team-member-result/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 2 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 15)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[a-z][a-z0-9-]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/team-member-result (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/team-member))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-result/project-role (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/role))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-result/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.update-team-member-result/user-arn :portkey.aws.codestar.-2017-04-19.update-team-member-result/project-role :portkey.aws.codestar.-2017-04-19.update-team-member-result/remote-access-allowed]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/created-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/last-modified-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/create-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.create-user-profile-result/user-arn] :opt-un [:portkey.aws.codestar.-2017-04-19.create-user-profile-result/display-name :portkey.aws.codestar.-2017-04-19.create-user-profile-result/email-address :portkey.aws.codestar.-2017-04-19.create-user-profile-result/ssh-public-key :portkey.aws.codestar.-2017-04-19.create-user-profile-result/created-timestamp :portkey.aws.codestar.-2017-04-19.create-user-profile-result/last-modified-timestamp]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.project-summary/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.project-summary/project-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.project-summary/project-id :portkey.aws.codestar.-2017-04-19.project-summary/project-arn]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-tags-for-project-result/tags (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tags))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-tags-for-project-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-tags-for-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.list-tags-for-project-result/tags :portkey.aws.codestar.-2017-04-19.list-tags-for-project-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-request/project-role (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/role))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-request/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/associate-team-member-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.associate-team-member-request/project-id :portkey.aws.codestar.-2017-04-19.associate-team-member-request/user-arn :portkey.aws.codestar.-2017-04-19.associate-team-member-request/project-role] :opt-un [:portkey.aws.codestar.-2017-04-19.associate-team-member-request/client-request-token :portkey.aws.codestar.-2017-04-19.associate-team-member-request/remote-access-allowed]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-team-members-result/team-members (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/team-member-result))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-team-members-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-team-members-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-team-members-result/team-members] :opt-un [:portkey.aws.codestar.-2017-04-19.list-team-members-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/state (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^(CreateInProgress|CreateComplete|CreateFailed|DeleteComplete|DeleteFailed|DeleteInProgress|UpdateComplete|UpdateInProgress|UpdateFailed|Unknown)$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.resource/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/resource-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/resource (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.resource/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^$|^\S(.*\S)?$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 100)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/projects-list (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/project-summary))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/resources-result (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/resource))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-request/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-request/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-request/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/create-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.create-user-profile-request/user-arn :portkey.aws.codestar.-2017-04-19.create-user-profile-request/display-name :portkey.aws.codestar.-2017-04-19.create-user-profile-request/email-address] :opt-un [:portkey.aws.codestar.-2017-04-19.create-user-profile-request/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.disassociate-team-member-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.disassociate-team-member-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/disassociate-team-member-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.disassociate-team-member-request/project-id :portkey.aws.codestar.-2017-04-19.disassociate-team-member-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/delete-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.delete-user-profile-result/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-project-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-project-request/delete-stack (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/delete-stack))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/delete-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.delete-project-request/id] :opt-un [:portkey.aws.codestar.-2017-04-19.delete-project-request/client-request-token :portkey.aws.codestar.-2017-04-19.delete-project-request/delete-stack]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/created-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/last-modified-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.update-user-profile-result/user-arn] :opt-un [:portkey.aws.codestar.-2017-04-19.update-user-profile-result/display-name :portkey.aws.codestar.-2017-04-19.update-user-profile-result/email-address :portkey.aws.codestar.-2017-04-19.update-user-profile-result/ssh-public-key :portkey.aws.codestar.-2017-04-19.update-user-profile-result/created-timestamp :portkey.aws.codestar.-2017-04-19.update-user-profile-result/last-modified-timestamp]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 32 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 95)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^arn:aws:iam::\d{12}:user(?:(\u002F)|(\u002F[\u0021-\u007E]+\u002F))[\w+=,.@-]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.team-member/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.team-member/project-role (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/role))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.team-member/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/team-member (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.team-member/user-arn :portkey.aws.codestar.-2017-04-19.team-member/project-role] :opt-un [:portkey.aws.codestar.-2017-04-19.team-member/remote-access-allowed]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.tag-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.tag-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tags))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tag-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.tag-project-request/id :portkey.aws.codestar.-2017-04-19.tag-project-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-request/project-role (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/role))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-request/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-team-member-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.update-team-member-request/project-id :portkey.aws.codestar.-2017-04-19.update-team-member-request/user-arn] :opt-un [:portkey.aws.codestar.-2017-04-19.update-team-member-request/project-role :portkey.aws.codestar.-2017-04-19.update-team-member-request/remote-access-allowed]))

(clojure.core/defn associate-team-member ([associate-team-member-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-associate-team-member-request associate-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/associate-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/associate-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateTeamMember", :http.request.configuration/output-deser-fn deser-associate-team-member-result, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception, "ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "TeamMemberAlreadyAssociatedException" :portkey.aws.codestar.-2017-04-19/team-member-already-associated-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar.-2017-04-19/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef associate-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/associate-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/associate-team-member-result))

(clojure.core/defn tag-project ([tag-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-tag-project-request tag-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/tag-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/tag-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagProject", :http.request.configuration/output-deser-fn deser-tag-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "LimitExceededException" :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef tag-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/tag-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tag-project-result))

(clojure.core/defn update-user-profile ([update-user-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-user-profile-request update-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/update-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/update-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUserProfile", :http.request.configuration/output-deser-fn deser-update-user-profile-result, :http.request.spec/error-spec {"UserProfileNotFoundException" :portkey.aws.codestar.-2017-04-19/user-profile-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef update-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/update-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/update-user-profile-result))

(clojure.core/defn describe-project ([describe-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-project-request describe-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/describe-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/describe-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProject", :http.request.configuration/output-deser-fn deser-describe-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar.-2017-04-19/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef describe-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/describe-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/describe-project-result))

(clojure.core/defn list-projects ([] (list-projects {})) ([list-projects-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-projects-request list-projects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/list-projects-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/list-projects-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProjects", :http.request.configuration/output-deser-fn deser-list-projects-result, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.codestar.-2017-04-19/list-projects-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/list-projects-result))

(clojure.core/defn update-project ([update-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-project-request update-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/update-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/update-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProject", :http.request.configuration/output-deser-fn deser-update-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/update-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/update-project-result))

(clojure.core/defn describe-user-profile ([describe-user-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-user-profile-request describe-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/describe-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/describe-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeUserProfile", :http.request.configuration/output-deser-fn deser-describe-user-profile-result, :http.request.spec/error-spec {"UserProfileNotFoundException" :portkey.aws.codestar.-2017-04-19/user-profile-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef describe-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/describe-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/describe-user-profile-result))

(clojure.core/defn list-tags-for-project ([list-tags-for-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-tags-for-project-request list-tags-for-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/list-tags-for-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/list-tags-for-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForProject", :http.request.configuration/output-deser-fn deser-list-tags-for-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidNextTokenException" :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/list-tags-for-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/list-tags-for-project-result))

(clojure.core/defn create-user-profile ([create-user-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-user-profile-request create-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/create-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/create-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateUserProfile", :http.request.configuration/output-deser-fn deser-create-user-profile-result, :http.request.spec/error-spec {"UserProfileAlreadyExistsException" :portkey.aws.codestar.-2017-04-19/user-profile-already-exists-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef create-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/create-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/create-user-profile-result))

(clojure.core/defn list-user-profiles ([] (list-user-profiles {})) ([list-user-profiles-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-user-profiles-request list-user-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/list-user-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/list-user-profiles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListUserProfiles", :http.request.configuration/output-deser-fn deser-list-user-profiles-result, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef list-user-profiles :args (clojure.spec.alpha/? :portkey.aws.codestar.-2017-04-19/list-user-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/list-user-profiles-result))

(clojure.core/defn untag-project ([untag-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-untag-project-request untag-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/untag-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/untag-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagProject", :http.request.configuration/output-deser-fn deser-untag-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "LimitExceededException" :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef untag-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/untag-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/untag-project-result))

(clojure.core/defn delete-user-profile ([delete-user-profile-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-user-profile-request delete-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/delete-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/delete-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUserProfile", :http.request.configuration/output-deser-fn deser-delete-user-profile-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef delete-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/delete-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/delete-user-profile-result))

(clojure.core/defn list-resources ([list-resources-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-resources-request list-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/list-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/list-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResources", :http.request.configuration/output-deser-fn deser-list-resources-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "InvalidNextTokenException" :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef list-resources :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/list-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/list-resources-result))

(clojure.core/defn delete-project ([delete-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-project-request delete-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/delete-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/delete-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProject", :http.request.configuration/output-deser-fn deser-delete-project-result, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/delete-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/delete-project-result))

(clojure.core/defn list-team-members ([list-team-members-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-team-members-request list-team-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/list-team-members-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/list-team-members-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTeamMembers", :http.request.configuration/output-deser-fn deser-list-team-members-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "InvalidNextTokenException" :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef list-team-members :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/list-team-members-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/list-team-members-result))

(clojure.core/defn disassociate-team-member ([disassociate-team-member-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disassociate-team-member-request disassociate-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/disassociate-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/disassociate-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateTeamMember", :http.request.configuration/output-deser-fn deser-disassociate-team-member-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef disassociate-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/disassociate-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/disassociate-team-member-result))

(clojure.core/defn update-team-member ([update-team-member-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-team-member-request update-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/update-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/update-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTeamMember", :http.request.configuration/output-deser-fn deser-update-team-member-result, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception, "ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar.-2017-04-19/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception, "TeamMemberNotFoundException" :portkey.aws.codestar.-2017-04-19/team-member-not-found-exception}})))))
(clojure.spec.alpha/fdef update-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/update-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/update-team-member-result))

(clojure.core/defn create-project ([create-project-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-project-request create-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/create-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/create-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProject", :http.request.configuration/output-deser-fn deser-create-project-result, :http.request.spec/error-spec {"ProjectAlreadyExistsException" :portkey.aws.codestar.-2017-04-19/project-already-exists-exception, "LimitExceededException" :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "ProjectCreationFailedException" :portkey.aws.codestar.-2017-04-19/project-creation-failed-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar.-2017-04-19/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/create-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/create-project-result))