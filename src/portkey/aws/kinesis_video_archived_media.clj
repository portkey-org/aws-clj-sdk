(ns portkey.aws.kinesis-video-archived-media (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "kinesisvideo", :region "ap-northeast-1"},
    :ssl-common-name "kinesisvideo.ap-northeast-1.amazonaws.com",
    :endpoint "https://kinesisvideo.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "kinesisvideo", :region "eu-west-1"},
    :ssl-common-name "kinesisvideo.eu-west-1.amazonaws.com",
    :endpoint "https://kinesisvideo.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "kinesisvideo", :region "eu-central-1"},
    :ssl-common-name "kinesisvideo.eu-central-1.amazonaws.com",
    :endpoint "https://kinesisvideo.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "kinesisvideo", :region "us-west-2"},
    :ssl-common-name "kinesisvideo.us-west-2.amazonaws.com",
    :endpoint "https://kinesisvideo.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "kinesisvideo", :region "us-east-1"},
    :ssl-common-name "kinesisvideo.us-east-1.amazonaws.com",
    :endpoint "https://kinesisvideo.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-fragment-number-string)

(clojure.core/declare ser-stream-name)

(clojure.core/declare ser-hls-timestamp-range)

(clojure.core/declare ser-hls-fragment-selector)

(clojure.core/declare ser-display-fragment-timestamp)

(clojure.core/declare ser-fragment-number-list)

(clojure.core/declare ser-timestamp-range)

(clojure.core/declare ser-hls-fragment-selector-type)

(clojure.core/declare ser-string)

(clojure.core/declare ser-discontinuity-mode)

(clojure.core/declare ser-fragment-selector-type)

(clojure.core/declare ser-fragment-selector)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-playback-mode)

(clojure.core/declare ser-container-format)

(clojure.core/declare ser-page-limit)

(clojure.core/declare ser-expires)

(clojure.core/declare ser-resource-arn)

(clojure.core/defn- ser-fragment-number-string [input] #:http.request.field{:value input, :shape "FragmentNumberString"})

(clojure.core/defn- ser-stream-name [input] #:http.request.field{:value input, :shape "StreamName"})

(clojure.core/defn- ser-hls-timestamp-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HLSTimestampRange", :type "structure"} (clojure.core/contains? input :start-timestamp) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :start-timestamp)) #:http.request.field{:name "StartTimestamp", :shape "Timestamp"})) (clojure.core/contains? input :end-timestamp) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :end-timestamp)) #:http.request.field{:name "EndTimestamp", :shape "Timestamp"}))))

(clojure.core/defn- ser-hls-fragment-selector [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HLSFragmentSelector", :type "structure"} (clojure.core/contains? input :fragment-selector-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-fragment-selector-type (input :fragment-selector-type)) #:http.request.field{:name "FragmentSelectorType", :shape "HLSFragmentSelectorType"})) (clojure.core/contains? input :timestamp-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-timestamp-range (input :timestamp-range)) #:http.request.field{:name "TimestampRange", :shape "HLSTimestampRange"}))))

(clojure.core/defn- ser-display-fragment-timestamp [input] #:http.request.field{:value (clojure.core/get {"ALWAYS" "ALWAYS", :always "ALWAYS", "NEVER" "NEVER", :never "NEVER"} input), :shape "DisplayFragmentTimestamp"})

(clojure.core/defn- ser-fragment-number-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-fragment-number-string coll) #:http.request.field{:shape "FragmentNumberString"}))) input), :shape "FragmentNumberList", :type "list", :max 1000, :min 1})

(clojure.core/defn- ser-timestamp-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timestamp (:start-timestamp input)) #:http.request.field{:name "StartTimestamp", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (:end-timestamp input)) #:http.request.field{:name "EndTimestamp", :shape "Timestamp"})], :shape "TimestampRange", :type "structure"}))

(clojure.core/defn- ser-hls-fragment-selector-type [input] #:http.request.field{:value (clojure.core/get {"PRODUCER_TIMESTAMP" "PRODUCER_TIMESTAMP", :producer-timestamp "PRODUCER_TIMESTAMP", "SERVER_TIMESTAMP" "SERVER_TIMESTAMP", :server-timestamp "SERVER_TIMESTAMP"} input), :shape "HLSFragmentSelectorType"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-discontinuity-mode [input] #:http.request.field{:value (clojure.core/get {"ALWAYS" "ALWAYS", :always "ALWAYS", "NEVER" "NEVER", :never "NEVER"} input), :shape "DiscontinuityMode"})

(clojure.core/defn- ser-fragment-selector-type [input] #:http.request.field{:value (clojure.core/get {"PRODUCER_TIMESTAMP" "PRODUCER_TIMESTAMP", :producer-timestamp "PRODUCER_TIMESTAMP", "SERVER_TIMESTAMP" "SERVER_TIMESTAMP", :server-timestamp "SERVER_TIMESTAMP"} input), :shape "FragmentSelectorType"})

(clojure.core/defn- ser-fragment-selector [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-fragment-selector-type (:fragment-selector-type input)) #:http.request.field{:name "FragmentSelectorType", :shape "FragmentSelectorType"}) (clojure.core/into (ser-timestamp-range (:timestamp-range input)) #:http.request.field{:name "TimestampRange", :shape "TimestampRange"})], :shape "FragmentSelector", :type "structure"}))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-playback-mode [input] #:http.request.field{:value (clojure.core/get {"LIVE" "LIVE", :live "LIVE", "ON_DEMAND" "ON_DEMAND", :on-demand "ON_DEMAND"} input), :shape "PlaybackMode"})

(clojure.core/defn- ser-container-format [input] #:http.request.field{:value (clojure.core/get {"FRAGMENTED_MP4" "FRAGMENTED_MP4", :fragmented-mp-4 "FRAGMENTED_MP4", "MPEG_TS" "MPEG_TS", :mpeg-ts "MPEG_TS"} input), :shape "ContainerFormat"})

(clojure.core/defn- ser-page-limit [input] #:http.request.field{:value input, :shape "PageLimit"})

(clojure.core/defn- ser-expires [input] #:http.request.field{:value input, :shape "Expires"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- req-get-hls-streaming-session-url-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :stream-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})) (clojure.core/contains? input :hls-fragment-selector) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hls-fragment-selector (input :hls-fragment-selector)) #:http.request.field{:name "HLSFragmentSelector", :shape "HLSFragmentSelector"})) (clojure.core/contains? input :display-fragment-timestamp) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-fragment-timestamp (input :display-fragment-timestamp)) #:http.request.field{:name "DisplayFragmentTimestamp", :shape "DisplayFragmentTimestamp"})) (clojure.core/contains? input :max-media-playlist-fragment-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-limit (input :max-media-playlist-fragment-results)) #:http.request.field{:name "MaxMediaPlaylistFragmentResults", :shape "PageLimit"})) (clojure.core/contains? input :discontinuity-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-discontinuity-mode (input :discontinuity-mode)) #:http.request.field{:name "DiscontinuityMode", :shape "DiscontinuityMode"})) (clojure.core/contains? input :stream-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :stream-arn)) #:http.request.field{:name "StreamARN", :shape "ResourceARN"})) (clojure.core/contains? input :playback-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-playback-mode (input :playback-mode)) #:http.request.field{:name "PlaybackMode", :shape "PlaybackMode"})) (clojure.core/contains? input :container-format) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-format (input :container-format)) #:http.request.field{:name "ContainerFormat", :shape "ContainerFormat"})) (clojure.core/contains? input :expires) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expires (input :expires)) #:http.request.field{:name "Expires", :shape "Expires"}))))

(clojure.core/defn- req-get-media-for-fragment-list-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"}) (clojure.core/into (ser-fragment-number-list (input :fragments)) #:http.request.field{:name "Fragments", :shape "FragmentNumberList"})]}))

(clojure.core/defn- req-list-fragments-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-name (input :stream-name)) #:http.request.field{:name "StreamName", :shape "StreamName"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :fragment-selector) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fragment-selector (input :fragment-selector)) #:http.request.field{:name "FragmentSelector", :shape "FragmentSelector"}))))

(clojure.core/declare deser-fragment)

(clojure.core/declare deser-payload)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-content-type)

(clojure.core/declare deser-fragment-list)

(clojure.core/declare deser-string)

(clojure.core/declare deser-long)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-hls-streaming-session-url)

(clojure.core/defn- deser-fragment [input] (clojure.core/cond-> {} (clojure.core/contains? input "FragmentNumber") (clojure.core/assoc :fragment-number (deser-string (input "FragmentNumber"))) (clojure.core/contains? input "FragmentSizeInBytes") (clojure.core/assoc :fragment-size-in-bytes (deser-long (input "FragmentSizeInBytes"))) (clojure.core/contains? input "ProducerTimestamp") (clojure.core/assoc :producer-timestamp (deser-timestamp (input "ProducerTimestamp"))) (clojure.core/contains? input "ServerTimestamp") (clojure.core/assoc :server-timestamp (deser-timestamp (input "ServerTimestamp"))) (clojure.core/contains? input "FragmentLengthInMilliseconds") (clojure.core/assoc :fragment-length-in-milliseconds (deser-long (input "FragmentLengthInMilliseconds")))))

(clojure.core/defn- deser-payload [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-content-type [input] input)

(clojure.core/defn- deser-fragment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fragment coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-hls-streaming-session-url [input] input)

(clojure.core/defn- response-missing-codec-private-data-exception ([input] (response-missing-codec-private-data-exception nil input)) ([resultWrapper1256534 input] (clojure.core/let [rawinput1256533 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256535 {"Message" (rawinput1256533 "Message")}] (clojure.core/cond-> {} (letvar1256535 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1256535 ["Message"])))))))

(clojure.core/defn- response-unsupported-stream-media-type-exception ([input] (response-unsupported-stream-media-type-exception nil input)) ([resultWrapper1256537 input] (clojure.core/let [rawinput1256536 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256538 {"Message" (rawinput1256536 "Message")}] (clojure.core/cond-> {} (letvar1256538 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1256538 ["Message"])))))))

(clojure.core/defn- response-not-authorized-exception ([input] (response-not-authorized-exception nil input)) ([resultWrapper1256540 input] (clojure.core/let [rawinput1256539 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256541 {"Message" (rawinput1256539 "Message")}] (clojure.core/cond-> {} (letvar1256541 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1256541 ["Message"])))))))

(clojure.core/defn- response-no-data-retention-exception ([input] (response-no-data-retention-exception nil input)) ([resultWrapper1256543 input] (clojure.core/let [rawinput1256542 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256544 {"Message" (rawinput1256542 "Message")}] (clojure.core/cond-> {} (letvar1256544 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1256544 ["Message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1256546 input] (clojure.core/let [rawinput1256545 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256547 {"Message" (rawinput1256545 "Message")}] (clojure.core/cond-> {} (letvar1256547 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1256547 ["Message"])))))))

(clojure.core/defn- response-client-limit-exceeded-exception ([input] (response-client-limit-exceeded-exception nil input)) ([resultWrapper1256549 input] (clojure.core/let [rawinput1256548 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256550 {"Message" (rawinput1256548 "Message")}] (clojure.core/cond-> {} (letvar1256550 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1256550 ["Message"])))))))

(clojure.core/defn- response-invalid-codec-private-data-exception ([input] (response-invalid-codec-private-data-exception nil input)) ([resultWrapper1256552 input] (clojure.core/let [rawinput1256551 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256553 {"Message" (rawinput1256551 "Message")}] (clojure.core/cond-> {} (letvar1256553 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1256553 ["Message"])))))))

(clojure.core/defn- response-invalid-argument-exception ([input] (response-invalid-argument-exception nil input)) ([resultWrapper1256555 input] (clojure.core/let [rawinput1256554 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256556 {"Message" (rawinput1256554 "Message")}] (clojure.core/cond-> {} (letvar1256556 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1256556 ["Message"])))))))

(clojure.core/defn- response-list-fragments-output ([input] (response-list-fragments-output nil input)) ([resultWrapper1256558 input] (clojure.core/let [rawinput1256557 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256559 {"Fragments" (rawinput1256557 "Fragments"), "NextToken" (rawinput1256557 "NextToken")}] (clojure.core/cond-> {} (letvar1256559 "Fragments") (clojure.core/assoc :fragments (deser-fragment-list (clojure.core/get-in letvar1256559 ["Fragments"]))) (letvar1256559 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1256559 ["NextToken"])))))))

(clojure.core/defn- response-get-media-for-fragment-list-output ([input] (response-get-media-for-fragment-list-output nil input)) ([resultWrapper1256561 input] (clojure.core/let [rawinput1256560 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256562 {"Content-Type" (clojure.core/get-in input [:headers "Content-Type"]), "Payload" (rawinput1256560 "Payload")}] (clojure.core/cond-> {} (letvar1256562 "Content-Type") (clojure.core/assoc :content-type (deser-content-type (clojure.core/get-in letvar1256562 ["Content-Type"]))) (letvar1256562 "Payload") (clojure.core/assoc :payload (deser-payload (clojure.core/get-in letvar1256562 ["Payload"])))))))

(clojure.core/defn- response-get-hls-streaming-session-url-output ([input] (response-get-hls-streaming-session-url-output nil input)) ([resultWrapper1256564 input] (clojure.core/let [rawinput1256563 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1256565 {"HLSStreamingSessionURL" (rawinput1256563 "HLSStreamingSessionURL")}] (clojure.core/cond-> {} (letvar1256565 "HLSStreamingSessionURL") (clojure.core/assoc :hls-streaming-session-url (deser-hls-streaming-session-url (clojure.core/get-in letvar1256565 ["HLSStreamingSessionURL"])))))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.get-hls-streaming-session-url-input/max-media-playlist-fragment-results (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/page-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.get-hls-streaming-session-url-input/stream-arn (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/resource-arn))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media/stream-name :portkey.aws.kinesis-video-archived-media/hls-fragment-selector :portkey.aws.kinesis-video-archived-media/display-fragment-timestamp :portkey.aws.kinesis-video-archived-media.get-hls-streaming-session-url-input/max-media-playlist-fragment-results :portkey.aws.kinesis-video-archived-media/discontinuity-mode :portkey.aws.kinesis-video-archived-media.get-hls-streaming-session-url-input/stream-arn :portkey.aws.kinesis-video-archived-media/playback-mode :portkey.aws.kinesis-video-archived-media/container-format :portkey.aws.kinesis-video-archived-media/expires]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-number-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[0-9]+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.missing-codec-private-data-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/missing-codec-private-data-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.missing-codec-private-data-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.unsupported-stream-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/unsupported-stream-media-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.unsupported-stream-media-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.get-media-for-fragment-list-input/fragments (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/fragment-number-list))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-archived-media/stream-name :portkey.aws.kinesis-video-archived-media.get-media-for-fragment-list-input/fragments] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/fragment-number (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/fragment-size-in-bytes (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/long))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/producer-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/server-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.fragment/fragment-length-in-milliseconds (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/long))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.fragment/fragment-number :portkey.aws.kinesis-video-archived-media.fragment/fragment-size-in-bytes :portkey.aws.kinesis-video-archived-media.fragment/producer-timestamp :portkey.aws.kinesis-video-archived-media.fragment/server-timestamp :portkey.aws.kinesis-video-archived-media.fragment/fragment-length-in-milliseconds]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.hls-timestamp-range/start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.hls-timestamp-range/end-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/hls-timestamp-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.hls-timestamp-range/start-timestamp :portkey.aws.kinesis-video-archived-media.hls-timestamp-range/end-timestamp]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.hls-fragment-selector/fragment-selector-type (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/hls-fragment-selector-type))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.hls-fragment-selector/timestamp-range (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/hls-timestamp-range))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/hls-fragment-selector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.hls-fragment-selector/fragment-selector-type :portkey.aws.kinesis-video-archived-media.hls-fragment-selector/timestamp-range]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/payload clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/display-fragment-timestamp #{"ALWAYS" :never "NEVER" :always})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\.\-]+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-number-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis-video-archived-media/fragment-number-string :min-count 1 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.no-data-retention-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/no-data-retention-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.no-data-retention-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-list (clojure.spec.alpha/coll-of :portkey.aws.kinesis-video-archived-media/fragment))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.timestamp-range/start-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.timestamp-range/end-timestamp (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/timestamp))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/timestamp-range (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-archived-media.timestamp-range/start-timestamp :portkey.aws.kinesis-video-archived-media.timestamp-range/end-timestamp] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/hls-fragment-selector-type #{"PRODUCER_TIMESTAMP" :producer-timestamp "SERVER_TIMESTAMP" :server-timestamp})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__)))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/discontinuity-mode #{"ALWAYS" :never "NEVER" :always})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.client-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.client-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.invalid-codec-private-data-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/invalid-codec-private-data-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.invalid-codec-private-data-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/error-message))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-selector-type #{"PRODUCER_TIMESTAMP" :producer-timestamp "SERVER_TIMESTAMP" :server-timestamp})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/fragment-selector (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-archived-media/fragment-selector-type :portkey.aws.kinesis-video-archived-media/timestamp-range] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-input/max-results (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/page-limit))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-input/next-token (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/list-fragments-input (clojure.spec.alpha/keys :req-un [:portkey.aws.kinesis-video-archived-media/stream-name] :opt-un [:portkey.aws.kinesis-video-archived-media.list-fragments-input/max-results :portkey.aws.kinesis-video-archived-media.list-fragments-input/next-token :portkey.aws.kinesis-video-archived-media/fragment-selector]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/playback-mode #{"ON_DEMAND" "LIVE" :live :on-demand})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/container-format #{"FRAGMENTED_MP4" :fragmented-mp-4 :mpeg-ts "MPEG_TS"})

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-output/fragments (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/fragment-list))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media.list-fragments-output/next-token (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/string))
(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/list-fragments-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media.list-fragments-output/fragments :portkey.aws.kinesis-video-archived-media.list-fragments-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/page-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media/content-type :portkey.aws.kinesis-video-archived-media/payload]))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/hls-streaming-session-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/expires (clojure.spec.alpha/int-in 300 43200))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1024)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.kinesis-video-archived-media/hls-streaming-session-url]))

(clojure.core/defn get-hls-streaming-session-url ([] (get-hls-streaming-session-url {})) ([get-hls-streaming-session-url-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-hls-streaming-session-url-input get-hls-streaming-session-url-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis-video-archived-media/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getHLSStreamingSessionURL", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video Archived Media", :http.request.spec/input-spec :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetHLSStreamingSessionURL", :http.request.configuration/output-deser-fn response-get-hls-streaming-session-url-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis-video-archived-media/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-archived-media/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-archived-media/not-authorized-exception, "UnsupportedStreamMediaTypeException" :portkey.aws.kinesis-video-archived-media/unsupported-stream-media-type-exception, "NoDataRetentionException" :portkey.aws.kinesis-video-archived-media/no-data-retention-exception, "MissingCodecPrivateDataException" :portkey.aws.kinesis-video-archived-media/missing-codec-private-data-exception, "InvalidCodecPrivateDataException" :portkey.aws.kinesis-video-archived-media/invalid-codec-private-data-exception}})))))
(clojure.spec.alpha/fdef get-hls-streaming-session-url :args (clojure.spec.alpha/? :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/get-hls-streaming-session-url-output))

(clojure.core/defn get-media-for-fragment-list ([get-media-for-fragment-list-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-media-for-fragment-list-input get-media-for-fragment-list-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis-video-archived-media/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getMediaForFragmentList", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video Archived Media", :http.request.spec/input-spec :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMediaForFragmentList", :http.request.configuration/output-deser-fn response-get-media-for-fragment-list-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis-video-archived-media/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-archived-media/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-archived-media/not-authorized-exception}})))))
(clojure.spec.alpha/fdef get-media-for-fragment-list :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/get-media-for-fragment-list-output))

(clojure.core/defn list-fragments ([list-fragments-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-fragments-input list-fragments-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.kinesis-video-archived-media/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.kinesis-video-archived-media/list-fragments-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listFragments", :http.request.configuration/version "2017-09-30", :http.request.configuration/service-id "Kinesis Video Archived Media", :http.request.spec/input-spec :portkey.aws.kinesis-video-archived-media/list-fragments-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFragments", :http.request.configuration/output-deser-fn response-list-fragments-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.kinesis-video-archived-media/resource-not-found-exception, "InvalidArgumentException" :portkey.aws.kinesis-video-archived-media/invalid-argument-exception, "ClientLimitExceededException" :portkey.aws.kinesis-video-archived-media/client-limit-exceeded-exception, "NotAuthorizedException" :portkey.aws.kinesis-video-archived-media/not-authorized-exception}})))))
(clojure.spec.alpha/fdef list-fragments :args (clojure.spec.alpha/tuple :portkey.aws.kinesis-video-archived-media/list-fragments-input) :ret (clojure.spec.alpha/and :portkey.aws.kinesis-video-archived-media/list-fragments-output))
