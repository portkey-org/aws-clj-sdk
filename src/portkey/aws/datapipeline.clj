(ns portkey.aws.datapipeline (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "datapipeline", :region "ap-northeast-1"},
    :ssl-common-name "datapipeline.ap-northeast-1.amazonaws.com",
    :endpoint "https://datapipeline.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "datapipeline", :region "eu-west-1"},
    :ssl-common-name "datapipeline.eu-west-1.amazonaws.com",
    :endpoint "https://datapipeline.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "datapipeline", :region "ap-southeast-2"},
    :ssl-common-name "datapipeline.ap-southeast-2.amazonaws.com",
    :endpoint "https://datapipeline.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "datapipeline", :region "us-west-2"},
    :ssl-common-name "datapipeline.us-west-2.amazonaws.com",
    :endpoint "https://datapipeline.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "datapipeline", :region "us-east-1"},
    :ssl-common-name "datapipeline.us-east-1.amazonaws.com",
    :endpoint "https://datapipeline.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json")
