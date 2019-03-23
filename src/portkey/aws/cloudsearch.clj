(ns portkey.aws.cloudsearch (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cloudsearch", :region "ap-northeast-1"},
    :ssl-common-name "cloudsearch.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudsearch.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudsearch", :region "eu-west-1"},
    :ssl-common-name "cloudsearch.eu-west-1.amazonaws.com",
    :endpoint "https://cloudsearch.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cloudsearch", :region "ap-southeast-2"},
    :ssl-common-name "cloudsearch.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudsearch.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "cloudsearch", :region "sa-east-1"},
    :ssl-common-name "cloudsearch.sa-east-1.amazonaws.com",
    :endpoint "https://cloudsearch.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cloudsearch", :region "ap-southeast-1"},
    :ssl-common-name "cloudsearch.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudsearch.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cloudsearch", :region "ap-northeast-2"},
    :ssl-common-name "cloudsearch.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudsearch.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudsearch", :region "eu-central-1"},
    :ssl-common-name "cloudsearch.eu-central-1.amazonaws.com",
    :endpoint "https://cloudsearch.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudsearch", :region "us-west-2"},
    :ssl-common-name "cloudsearch.us-west-2.amazonaws.com",
    :endpoint "https://cloudsearch.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudsearch", :region "us-east-1"},
    :ssl-common-name "cloudsearch.us-east-1.amazonaws.com",
    :endpoint "https://cloudsearch.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudsearch", :region "us-west-1"},
    :ssl-common-name "cloudsearch.us-west-1.amazonaws.com",
    :endpoint "https://cloudsearch.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-double-array-options)

(clojure.core/declare ser-double)

(clojure.core/declare ser-index-field-type)

(clojure.core/declare ser-field-name-comma-list)

(clojure.core/declare ser-suggester)

(clojure.core/declare ser-lat-lon-options)

(clojure.core/declare ser-text-options)

(clojure.core/declare ser-standard-name)

(clojure.core/declare ser-analysis-scheme)

(clojure.core/declare ser-double-options)

(clojure.core/declare ser-expression)

(clojure.core/declare ser-text-array-options)

(clojure.core/declare ser-int-array-options)

(clojure.core/declare ser-domain-name-list)

(clojure.core/declare ser-dynamic-field-name-list)

(clojure.core/declare ser-analysis-options)

(clojure.core/declare ser-date-array-options)

(clojure.core/declare ser-policy-document)

(clojure.core/declare ser-expression-value)

(clojure.core/declare ser-algorithmic-stemming)

(clojure.core/declare ser-string)

(clojure.core/declare ser-date-options)

(clojure.core/declare ser-field-name)

(clojure.core/declare ser-standard-name-list)

(clojure.core/declare ser-suggester-fuzzy-matching)

(clojure.core/declare ser-dynamic-field-name)

(clojure.core/declare ser-analysis-scheme-language)

(clojure.core/declare ser-long)

(clojure.core/declare ser-literal-array-options)

(clojure.core/declare ser-word)

(clojure.core/declare ser-partition-instance-type)

(clojure.core/declare ser-literal-options)

(clojure.core/declare ser-domain-name)

(clojure.core/declare ser-index-field)

(clojure.core/declare ser-field-value)

(clojure.core/declare ser-u-int-value)

(clojure.core/declare ser-scaling-parameters)

(clojure.core/declare ser-int-options)

(clojure.core/declare ser-document-suggester-options)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-double-array-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DoubleArrayOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "Double"})) (clojure.core/contains? input :source-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name-comma-list (input :source-fields)) #:http.request.field{:name "SourceFields", :shape "FieldNameCommaList"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-double [input] #:http.request.field{:value input, :shape "Double"})

(clojure.core/defn- ser-index-field-type [input] #:http.request.field{:value (clojure.core/get {"int" "int", :date "date", :double "double", :literalarray "literal-array", :int "int", :intarray "int-array", :datearray "date-array", "text-array" "text-array", "latlon" "latlon", "text" "text", "int-array" "int-array", "literal-array" "literal-array", :latlon "latlon", :literal "literal", "double" "double", "date" "date", :doublearray "double-array", "double-array" "double-array", :textarray "text-array", "literal" "literal", :text "text", "date-array" "date-array"} input), :shape "IndexFieldType"})

(clojure.core/defn- ser-field-name-comma-list [input] #:http.request.field{:value input, :shape "FieldNameCommaList"})

(clojure.core/defn- ser-suggester [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-standard-name (:suggester-name input)) #:http.request.field{:name "SuggesterName", :shape "StandardName"}) (clojure.core/into (ser-document-suggester-options (:document-suggester-options input)) #:http.request.field{:name "DocumentSuggesterOptions", :shape "DocumentSuggesterOptions"})], :shape "Suggester", :type "structure"}))

(clojure.core/defn- ser-lat-lon-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LatLonOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-text-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TextOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"})) (clojure.core/contains? input :highlight-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :highlight-enabled)) #:http.request.field{:name "HighlightEnabled", :shape "Boolean"})) (clojure.core/contains? input :analysis-scheme) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-word (input :analysis-scheme)) #:http.request.field{:name "AnalysisScheme", :shape "Word"}))))

(clojure.core/defn- ser-standard-name [input] #:http.request.field{:value input, :shape "StandardName"})

(clojure.core/defn- ser-analysis-scheme [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-standard-name (:analysis-scheme-name input)) #:http.request.field{:name "AnalysisSchemeName", :shape "StandardName"}) (clojure.core/into (ser-analysis-scheme-language (:analysis-scheme-language input)) #:http.request.field{:name "AnalysisSchemeLanguage", :shape "AnalysisSchemeLanguage"})], :shape "AnalysisScheme", :type "structure"} (clojure.core/contains? input :analysis-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-analysis-options (input :analysis-options)) #:http.request.field{:name "AnalysisOptions", :shape "AnalysisOptions"}))))

(clojure.core/defn- ser-double-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DoubleOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "Double"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-expression [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-standard-name (:expression-name input)) #:http.request.field{:name "ExpressionName", :shape "StandardName"}) (clojure.core/into (ser-expression-value (:expression-value input)) #:http.request.field{:name "ExpressionValue", :shape "ExpressionValue"})], :shape "Expression", :type "structure"}))

(clojure.core/defn- ser-text-array-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TextArrayOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name-comma-list (input :source-fields)) #:http.request.field{:name "SourceFields", :shape "FieldNameCommaList"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :highlight-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :highlight-enabled)) #:http.request.field{:name "HighlightEnabled", :shape "Boolean"})) (clojure.core/contains? input :analysis-scheme) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-word (input :analysis-scheme)) #:http.request.field{:name "AnalysisScheme", :shape "Word"}))))

(clojure.core/defn- ser-int-array-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IntArrayOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "Long"})) (clojure.core/contains? input :source-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name-comma-list (input :source-fields)) #:http.request.field{:name "SourceFields", :shape "FieldNameCommaList"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-domain-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-domain-name coll) #:http.request.field{:shape "DomainName"}))) input), :shape "DomainNameList", :type "list"})

(clojure.core/defn- ser-dynamic-field-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-dynamic-field-name coll) #:http.request.field{:shape "DynamicFieldName"}))) input), :shape "DynamicFieldNameList", :type "list"})

(clojure.core/defn- ser-analysis-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AnalysisOptions", :type "structure"} (clojure.core/contains? input :synonyms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :synonyms)) #:http.request.field{:name "Synonyms", :shape "String"})) (clojure.core/contains? input :stopwords) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stopwords)) #:http.request.field{:name "Stopwords", :shape "String"})) (clojure.core/contains? input :stemming-dictionary) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stemming-dictionary)) #:http.request.field{:name "StemmingDictionary", :shape "String"})) (clojure.core/contains? input :japanese-tokenization-dictionary) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :japanese-tokenization-dictionary)) #:http.request.field{:name "JapaneseTokenizationDictionary", :shape "String"})) (clojure.core/contains? input :algorithmic-stemming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-algorithmic-stemming (input :algorithmic-stemming)) #:http.request.field{:name "AlgorithmicStemming", :shape "AlgorithmicStemming"}))))

(clojure.core/defn- ser-date-array-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DateArrayOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name-comma-list (input :source-fields)) #:http.request.field{:name "SourceFields", :shape "FieldNameCommaList"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-policy-document [input] #:http.request.field{:value input, :shape "PolicyDocument"})

(clojure.core/defn- ser-expression-value [input] #:http.request.field{:value input, :shape "ExpressionValue"})

(clojure.core/defn- ser-algorithmic-stemming [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "minimal" "minimal", :minimal "minimal", "light" "light", :light "light", "full" "full", :full "full"} input), :shape "AlgorithmicStemming"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-date-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DateOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-field-name [input] #:http.request.field{:value input, :shape "FieldName"})

(clojure.core/defn- ser-standard-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-standard-name coll) #:http.request.field{:shape "StandardName"}))) input), :shape "StandardNameList", :type "list"})

(clojure.core/defn- ser-suggester-fuzzy-matching [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "low" "low", :low "low", "high" "high", :high "high"} input), :shape "SuggesterFuzzyMatching"})

(clojure.core/defn- ser-dynamic-field-name [input] #:http.request.field{:value input, :shape "DynamicFieldName"})

(clojure.core/defn- ser-analysis-scheme-language [input] #:http.request.field{:value (clojure.core/get {"nl" "nl", :fr "fr", :ja "ja", :el "el", "pt" "pt", "en" "en", :es "es", "lv" "lv", :pt "pt", :fi "fi", :ga "ga", "ro" "ro", "hy" "hy", "tr" "tr", "it" "it", "el" "el", "fa" "fa", :ca "ca", :ro "ro", :th "th", :tr "tr", :cs "cs", :hu "hu", "id" "id", "fi" "fi", :ko "ko", "ca" "ca", "sv" "sv", "fr" "fr", "eu" "eu", :it "it", "da" "da", "hu" "hu", "de" "de", "hi" "hi", :en "en", :nl "nl", "ru" "ru", :mul "mul", "ga" "ga", "es" "es", :de "de", :id "id", :ar "ar", :zh-hant "zh-Hant", "ja" "ja", :hy "hy", "mul" "mul", "gl" "gl", :ru "ru", :gl "gl", "cs" "cs", "no" "no", "zh-Hans" "zh-Hans", :he "he", :sv "sv", :da "da", "ar" "ar", "bg" "bg", "ko" "ko", :zh-hans "zh-Hans", :bg "bg", :lv "lv", "th" "th", :eu "eu", "he" "he", :hi "hi", :no "no", "zh-Hant" "zh-Hant", :fa "fa"} input), :shape "AnalysisSchemeLanguage"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-literal-array-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LiteralArrayOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name-comma-list (input :source-fields)) #:http.request.field{:name "SourceFields", :shape "FieldNameCommaList"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-word [input] #:http.request.field{:value input, :shape "Word"})

(clojure.core/defn- ser-partition-instance-type [input] #:http.request.field{:value (clojure.core/get {:searchm-3medium "search.m3.medium", "search.m3.2xlarge" "search.m3.2xlarge", "search.m3.large" "search.m3.large", "search.m2.xlarge" "search.m2.xlarge", :searchm-1large "search.m1.large", :searchm-2xlarge "search.m2.xlarge", :searchm-3xlarge "search.m3.xlarge", :searchm-1small "search.m1.small", "search.m3.xlarge" "search.m3.xlarge", "search.m1.small" "search.m1.small", "search.m3.medium" "search.m3.medium", "search.m1.large" "search.m1.large", :searchm-22xlarge "search.m2.2xlarge", :searchm-32xlarge "search.m3.2xlarge", :searchm-3large "search.m3.large", "search.m2.2xlarge" "search.m2.2xlarge"} input), :shape "PartitionInstanceType"})

(clojure.core/defn- ser-literal-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LiteralOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "FieldValue"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-domain-name [input] #:http.request.field{:value input, :shape "DomainName"})

(clojure.core/defn- ser-index-field [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dynamic-field-name (:index-field-name input)) #:http.request.field{:name "IndexFieldName", :shape "DynamicFieldName"}) (clojure.core/into (ser-index-field-type (:index-field-type input)) #:http.request.field{:name "IndexFieldType", :shape "IndexFieldType"})], :shape "IndexField", :type "structure"} (clojure.core/contains? input :double-array-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-array-options (input :double-array-options)) #:http.request.field{:name "DoubleArrayOptions", :shape "DoubleArrayOptions"})) (clojure.core/contains? input :lat-lon-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lat-lon-options (input :lat-lon-options)) #:http.request.field{:name "LatLonOptions", :shape "LatLonOptions"})) (clojure.core/contains? input :text-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-text-options (input :text-options)) #:http.request.field{:name "TextOptions", :shape "TextOptions"})) (clojure.core/contains? input :double-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double-options (input :double-options)) #:http.request.field{:name "DoubleOptions", :shape "DoubleOptions"})) (clojure.core/contains? input :text-array-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-text-array-options (input :text-array-options)) #:http.request.field{:name "TextArrayOptions", :shape "TextArrayOptions"})) (clojure.core/contains? input :int-array-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-int-array-options (input :int-array-options)) #:http.request.field{:name "IntArrayOptions", :shape "IntArrayOptions"})) (clojure.core/contains? input :date-array-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-array-options (input :date-array-options)) #:http.request.field{:name "DateArrayOptions", :shape "DateArrayOptions"})) (clojure.core/contains? input :date-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-options (input :date-options)) #:http.request.field{:name "DateOptions", :shape "DateOptions"})) (clojure.core/contains? input :literal-array-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-literal-array-options (input :literal-array-options)) #:http.request.field{:name "LiteralArrayOptions", :shape "LiteralArrayOptions"})) (clojure.core/contains? input :literal-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-literal-options (input :literal-options)) #:http.request.field{:name "LiteralOptions", :shape "LiteralOptions"})) (clojure.core/contains? input :int-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-int-options (input :int-options)) #:http.request.field{:name "IntOptions", :shape "IntOptions"}))))

(clojure.core/defn- ser-field-value [input] #:http.request.field{:value input, :shape "FieldValue"})

(clojure.core/defn- ser-u-int-value [input] #:http.request.field{:value input, :shape "UIntValue"})

(clojure.core/defn- ser-scaling-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ScalingParameters", :type "structure"} (clojure.core/contains? input :desired-instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-partition-instance-type (input :desired-instance-type)) #:http.request.field{:name "DesiredInstanceType", :shape "PartitionInstanceType"})) (clojure.core/contains? input :desired-replication-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-u-int-value (input :desired-replication-count)) #:http.request.field{:name "DesiredReplicationCount", :shape "UIntValue"})) (clojure.core/contains? input :desired-partition-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-u-int-value (input :desired-partition-count)) #:http.request.field{:name "DesiredPartitionCount", :shape "UIntValue"}))))

(clojure.core/defn- ser-int-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IntOptions", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "Long"})) (clojure.core/contains? input :source-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-name (input :source-field)) #:http.request.field{:name "SourceField", :shape "FieldName"})) (clojure.core/contains? input :facet-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :facet-enabled)) #:http.request.field{:name "FacetEnabled", :shape "Boolean"})) (clojure.core/contains? input :search-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :search-enabled)) #:http.request.field{:name "SearchEnabled", :shape "Boolean"})) (clojure.core/contains? input :return-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :return-enabled)) #:http.request.field{:name "ReturnEnabled", :shape "Boolean"})) (clojure.core/contains? input :sort-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :sort-enabled)) #:http.request.field{:name "SortEnabled", :shape "Boolean"}))))

(clojure.core/defn- ser-document-suggester-options [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-field-name (:source-field input)) #:http.request.field{:name "SourceField", :shape "FieldName"})], :shape "DocumentSuggesterOptions", :type "structure"} (clojure.core/contains? input :fuzzy-matching) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-suggester-fuzzy-matching (input :fuzzy-matching)) #:http.request.field{:name "FuzzyMatching", :shape "SuggesterFuzzyMatching"})) (clojure.core/contains? input :sort-expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sort-expression)) #:http.request.field{:name "SortExpression", :shape "String"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-update-availability-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-boolean (input :multi-az)) #:http.request.field{:name "MultiAZ", :shape "Boolean"})]}))

(clojure.core/defn- req-describe-index-fields-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :field-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamic-field-name-list (input :field-names)) #:http.request.field{:name "FieldNames", :shape "DynamicFieldNameList"})) (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-define-analysis-scheme-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-analysis-scheme (input :analysis-scheme)) #:http.request.field{:name "AnalysisScheme", :shape "AnalysisScheme"})]}))

(clojure.core/defn- req-describe-scaling-parameters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-describe-analysis-schemes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :analysis-scheme-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-name-list (input :analysis-scheme-names)) #:http.request.field{:name "AnalysisSchemeNames", :shape "StandardNameList"})) (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-delete-suggester-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-standard-name (input :suggester-name)) #:http.request.field{:name "SuggesterName", :shape "StandardName"})]}))

(clojure.core/defn- req-define-suggester-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-suggester (input :suggester)) #:http.request.field{:name "Suggester", :shape "Suggester"})]}))

(clojure.core/defn- req-delete-expression-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-standard-name (input :expression-name)) #:http.request.field{:name "ExpressionName", :shape "StandardName"})]}))

(clojure.core/defn- req-delete-index-field-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-dynamic-field-name (input :index-field-name)) #:http.request.field{:name "IndexFieldName", :shape "DynamicFieldName"})]}))

(clojure.core/defn- req-describe-availability-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-create-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-define-expression-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-expression (input :expression)) #:http.request.field{:name "Expression", :shape "Expression"})]}))

(clojure.core/defn- req-update-scaling-parameters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-scaling-parameters (input :scaling-parameters)) #:http.request.field{:name "ScalingParameters", :shape "ScalingParameters"})]}))

(clojure.core/defn- req-index-documents-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-delete-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-build-suggesters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]}))

(clojure.core/defn- req-describe-service-access-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-describe-suggesters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :suggester-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-name-list (input :suggester-names)) #:http.request.field{:name "SuggesterNames", :shape "StandardNameList"})) (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-define-index-field-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-index-field (input :index-field)) #:http.request.field{:name "IndexField", :shape "IndexField"})]}))

(clojure.core/defn- req-describe-expressions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :expression-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standard-name-list (input :expression-names)) #:http.request.field{:name "ExpressionNames", :shape "StandardNameList"})) (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :deployed)) #:http.request.field{:name "Deployed", :shape "Boolean"}))))

(clojure.core/defn- req-describe-domains-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :domain-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name-list (input :domain-names)) #:http.request.field{:name "DomainNames", :shape "DomainNameList"}))))

(clojure.core/defn- req-delete-analysis-scheme-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-standard-name (input :analysis-scheme-name)) #:http.request.field{:name "AnalysisSchemeName", :shape "StandardName"})]}))

(clojure.core/defn- req-update-service-access-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-policy-document (input :access-policies)) #:http.request.field{:name "AccessPolicies", :shape "PolicyDocument"})]}))

(clojure.core/declare deser-double-array-options)

(clojure.core/declare deser-double)

(clojure.core/declare deser-index-field-type)

(clojure.core/declare deser-index-field-status-list)

(clojure.core/declare deser-update-timestamp)

(clojure.core/declare deser-domain-status-list)

(clojure.core/declare deser-api-version)

(clojure.core/declare deser-field-name-comma-list)

(clojure.core/declare deser-maximum-replication-count)

(clojure.core/declare deser-suggester)

(clojure.core/declare deser-lat-lon-options)

(clojure.core/declare deser-text-options)

(clojure.core/declare deser-instance-count)

(clojure.core/declare deser-analysis-scheme-status)

(clojure.core/declare deser-standard-name)

(clojure.core/declare deser-analysis-scheme)

(clojure.core/declare deser-index-field-status)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-scaling-parameters-status)

(clojure.core/declare deser-double-options)

(clojure.core/declare deser-expression)

(clojure.core/declare deser-field-name-list)

(clojure.core/declare deser-text-array-options)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-service-url)

(clojure.core/declare deser-int-array-options)

(clojure.core/declare deser-domain-status)

(clojure.core/declare deser-service-endpoint)

(clojure.core/declare deser-suggester-status-list)

(clojure.core/declare deser-limits)

(clojure.core/declare deser-analysis-options)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-partition-count)

(clojure.core/declare deser-option-status)

(clojure.core/declare deser-date-array-options)

(clojure.core/declare deser-policy-document)

(clojure.core/declare deser-expression-value)

(clojure.core/declare deser-algorithmic-stemming)

(clojure.core/declare deser-suggester-status)

(clojure.core/declare deser-string)

(clojure.core/declare deser-date-options)

(clojure.core/declare deser-field-name)

(clojure.core/declare deser-domain-name-map)

(clojure.core/declare deser-suggester-fuzzy-matching)

(clojure.core/declare deser-domain-id)

(clojure.core/declare deser-dynamic-field-name)

(clojure.core/declare deser-expression-status-list)

(clojure.core/declare deser-analysis-scheme-language)

(clojure.core/declare deser-long)

(clojure.core/declare deser-literal-array-options)

(clojure.core/declare deser-word)

(clojure.core/declare deser-partition-instance-type)

(clojure.core/declare deser-expression-status)

(clojure.core/declare deser-literal-options)

(clojure.core/declare deser-access-policies-status)

(clojure.core/declare deser-domain-name)

(clojure.core/declare deser-index-field)

(clojure.core/declare deser-field-value)

(clojure.core/declare deser-maximum-partition-count)

(clojure.core/declare deser-search-instance-type)

(clojure.core/declare deser-option-state)

(clojure.core/declare deser-multi-az)

(clojure.core/declare deser-u-int-value)

(clojure.core/declare deser-scaling-parameters)

(clojure.core/declare deser-int-options)

(clojure.core/declare deser-analysis-scheme-status-list)

(clojure.core/declare deser-document-suggester-options)

(clojure.core/declare deser-availability-options-status)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-double-array-options [input] (clojure.core/let [letvar316602 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceFields" (portkey.aws/search-for-tag input "SourceFields" :flattened? nil :xmlAttribute? nil), "FacetEnabled" (portkey.aws/search-for-tag input "FacetEnabled" :flattened? nil :xmlAttribute? nil), "SearchEnabled" (portkey.aws/search-for-tag input "SearchEnabled" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar316602 "DefaultValue") (clojure.core/assoc :default-value (deser-double (clojure.core/get-in letvar316602 ["DefaultValue" :content]))) (letvar316602 "SourceFields") (clojure.core/assoc :source-fields (deser-field-name-comma-list (clojure.core/get-in letvar316602 ["SourceFields" :content]))) (letvar316602 "FacetEnabled") (clojure.core/assoc :facet-enabled (deser-boolean (clojure.core/get-in letvar316602 ["FacetEnabled" :content]))) (letvar316602 "SearchEnabled") (clojure.core/assoc :search-enabled (deser-boolean (clojure.core/get-in letvar316602 ["SearchEnabled" :content]))) (letvar316602 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar316602 ["ReturnEnabled" :content]))))))

(clojure.core/defn- deser-double [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-index-field-type [input] (clojure.core/get {"int" :int, "text-array" :textarray, "latlon" :latlon, "text" :text, "int-array" :intarray, "literal-array" :literalarray, "double" :double, "date" :date, "double-array" :doublearray, "literal" :literal, "date-array" :datearray} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-index-field-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-index-field-status coll))) input))

(clojure.core/defn- deser-update-timestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-domain-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain-status coll))) input))

(clojure.core/defn- deser-api-version [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-field-name-comma-list [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-maximum-replication-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-suggester [input] (clojure.core/let [letvar316765 {"SuggesterName" (portkey.aws/search-for-tag input "SuggesterName" :flattened? nil :xmlAttribute? nil), "DocumentSuggesterOptions" (portkey.aws/search-for-tag input "DocumentSuggesterOptions" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:suggester-name (deser-standard-name (clojure.core/get-in letvar316765 ["SuggesterName" :content])), :document-suggester-options (deser-document-suggester-options (clojure.core/get-in letvar316765 ["DocumentSuggesterOptions" :content]))})))

(clojure.core/defn- deser-lat-lon-options [input] (clojure.core/let [letvar316873 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceField" (portkey.aws/search-for-tag input "SourceField" :flattened? nil :xmlAttribute? nil), "FacetEnabled" (portkey.aws/search-for-tag input "FacetEnabled" :flattened? nil :xmlAttribute? nil), "SearchEnabled" (portkey.aws/search-for-tag input "SearchEnabled" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil), "SortEnabled" (portkey.aws/search-for-tag input "SortEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar316873 "DefaultValue") (clojure.core/assoc :default-value (deser-field-value (clojure.core/get-in letvar316873 ["DefaultValue" :content]))) (letvar316873 "SourceField") (clojure.core/assoc :source-field (deser-field-name (clojure.core/get-in letvar316873 ["SourceField" :content]))) (letvar316873 "FacetEnabled") (clojure.core/assoc :facet-enabled (deser-boolean (clojure.core/get-in letvar316873 ["FacetEnabled" :content]))) (letvar316873 "SearchEnabled") (clojure.core/assoc :search-enabled (deser-boolean (clojure.core/get-in letvar316873 ["SearchEnabled" :content]))) (letvar316873 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar316873 ["ReturnEnabled" :content]))) (letvar316873 "SortEnabled") (clojure.core/assoc :sort-enabled (deser-boolean (clojure.core/get-in letvar316873 ["SortEnabled" :content]))))))

(clojure.core/defn- deser-text-options [input] (clojure.core/let [letvar316981 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceField" (portkey.aws/search-for-tag input "SourceField" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil), "SortEnabled" (portkey.aws/search-for-tag input "SortEnabled" :flattened? nil :xmlAttribute? nil), "HighlightEnabled" (portkey.aws/search-for-tag input "HighlightEnabled" :flattened? nil :xmlAttribute? nil), "AnalysisScheme" (portkey.aws/search-for-tag input "AnalysisScheme" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar316981 "DefaultValue") (clojure.core/assoc :default-value (deser-field-value (clojure.core/get-in letvar316981 ["DefaultValue" :content]))) (letvar316981 "SourceField") (clojure.core/assoc :source-field (deser-field-name (clojure.core/get-in letvar316981 ["SourceField" :content]))) (letvar316981 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar316981 ["ReturnEnabled" :content]))) (letvar316981 "SortEnabled") (clojure.core/assoc :sort-enabled (deser-boolean (clojure.core/get-in letvar316981 ["SortEnabled" :content]))) (letvar316981 "HighlightEnabled") (clojure.core/assoc :highlight-enabled (deser-boolean (clojure.core/get-in letvar316981 ["HighlightEnabled" :content]))) (letvar316981 "AnalysisScheme") (clojure.core/assoc :analysis-scheme (deser-word (clojure.core/get-in letvar316981 ["AnalysisScheme" :content]))))))

(clojure.core/defn- deser-instance-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-analysis-scheme-status [input] (clojure.core/let [letvar317091 {"Options" (portkey.aws/search-for-tag input "Options" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:options (deser-analysis-scheme (clojure.core/get-in letvar317091 ["Options" :content])), :status (deser-option-status (clojure.core/get-in letvar317091 ["Status" :content]))})))

(clojure.core/defn- deser-standard-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-analysis-scheme [input] (clojure.core/let [letvar317204 {"AnalysisSchemeName" (portkey.aws/search-for-tag input "AnalysisSchemeName" :flattened? nil :xmlAttribute? nil), "AnalysisSchemeLanguage" (portkey.aws/search-for-tag input "AnalysisSchemeLanguage" :flattened? nil :xmlAttribute? nil), "AnalysisOptions" (portkey.aws/search-for-tag input "AnalysisOptions" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:analysis-scheme-name (deser-standard-name (clojure.core/get-in letvar317204 ["AnalysisSchemeName" :content])), :analysis-scheme-language (deser-analysis-scheme-language (clojure.core/get-in letvar317204 ["AnalysisSchemeLanguage" :content]))} (letvar317204 "AnalysisOptions") (clojure.core/assoc :analysis-options (deser-analysis-options (clojure.core/get-in letvar317204 ["AnalysisOptions" :content]))))))

(clojure.core/defn- deser-index-field-status [input] (clojure.core/let [letvar317312 {"Options" (portkey.aws/search-for-tag input "Options" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:options (deser-index-field (clojure.core/get-in letvar317312 ["Options" :content])), :status (deser-option-status (clojure.core/get-in letvar317312 ["Status" :content]))})))

(clojure.core/defn- deser-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-scaling-parameters-status [input] (clojure.core/let [letvar317425 {"Options" (portkey.aws/search-for-tag input "Options" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:options (deser-scaling-parameters (clojure.core/get-in letvar317425 ["Options" :content])), :status (deser-option-status (clojure.core/get-in letvar317425 ["Status" :content]))})))

(clojure.core/defn- deser-double-options [input] (clojure.core/let [letvar317533 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceField" (portkey.aws/search-for-tag input "SourceField" :flattened? nil :xmlAttribute? nil), "FacetEnabled" (portkey.aws/search-for-tag input "FacetEnabled" :flattened? nil :xmlAttribute? nil), "SearchEnabled" (portkey.aws/search-for-tag input "SearchEnabled" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil), "SortEnabled" (portkey.aws/search-for-tag input "SortEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar317533 "DefaultValue") (clojure.core/assoc :default-value (deser-double (clojure.core/get-in letvar317533 ["DefaultValue" :content]))) (letvar317533 "SourceField") (clojure.core/assoc :source-field (deser-field-name (clojure.core/get-in letvar317533 ["SourceField" :content]))) (letvar317533 "FacetEnabled") (clojure.core/assoc :facet-enabled (deser-boolean (clojure.core/get-in letvar317533 ["FacetEnabled" :content]))) (letvar317533 "SearchEnabled") (clojure.core/assoc :search-enabled (deser-boolean (clojure.core/get-in letvar317533 ["SearchEnabled" :content]))) (letvar317533 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar317533 ["ReturnEnabled" :content]))) (letvar317533 "SortEnabled") (clojure.core/assoc :sort-enabled (deser-boolean (clojure.core/get-in letvar317533 ["SortEnabled" :content]))))))

(clojure.core/defn- deser-expression [input] (clojure.core/let [letvar317641 {"ExpressionName" (portkey.aws/search-for-tag input "ExpressionName" :flattened? nil :xmlAttribute? nil), "ExpressionValue" (portkey.aws/search-for-tag input "ExpressionValue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:expression-name (deser-standard-name (clojure.core/get-in letvar317641 ["ExpressionName" :content])), :expression-value (deser-expression-value (clojure.core/get-in letvar317641 ["ExpressionValue" :content]))})))

(clojure.core/defn- deser-field-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-name coll))) input))

(clojure.core/defn- deser-text-array-options [input] (clojure.core/let [letvar317766 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceFields" (portkey.aws/search-for-tag input "SourceFields" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil), "HighlightEnabled" (portkey.aws/search-for-tag input "HighlightEnabled" :flattened? nil :xmlAttribute? nil), "AnalysisScheme" (portkey.aws/search-for-tag input "AnalysisScheme" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar317766 "DefaultValue") (clojure.core/assoc :default-value (deser-field-value (clojure.core/get-in letvar317766 ["DefaultValue" :content]))) (letvar317766 "SourceFields") (clojure.core/assoc :source-fields (deser-field-name-comma-list (clojure.core/get-in letvar317766 ["SourceFields" :content]))) (letvar317766 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar317766 ["ReturnEnabled" :content]))) (letvar317766 "HighlightEnabled") (clojure.core/assoc :highlight-enabled (deser-boolean (clojure.core/get-in letvar317766 ["HighlightEnabled" :content]))) (letvar317766 "AnalysisScheme") (clojure.core/assoc :analysis-scheme (deser-word (clojure.core/get-in letvar317766 ["AnalysisScheme" :content]))))))

(clojure.core/defn- deser-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-service-url [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-int-array-options [input] (clojure.core/let [letvar317884 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceFields" (portkey.aws/search-for-tag input "SourceFields" :flattened? nil :xmlAttribute? nil), "FacetEnabled" (portkey.aws/search-for-tag input "FacetEnabled" :flattened? nil :xmlAttribute? nil), "SearchEnabled" (portkey.aws/search-for-tag input "SearchEnabled" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar317884 "DefaultValue") (clojure.core/assoc :default-value (deser-long (clojure.core/get-in letvar317884 ["DefaultValue" :content]))) (letvar317884 "SourceFields") (clojure.core/assoc :source-fields (deser-field-name-comma-list (clojure.core/get-in letvar317884 ["SourceFields" :content]))) (letvar317884 "FacetEnabled") (clojure.core/assoc :facet-enabled (deser-boolean (clojure.core/get-in letvar317884 ["FacetEnabled" :content]))) (letvar317884 "SearchEnabled") (clojure.core/assoc :search-enabled (deser-boolean (clojure.core/get-in letvar317884 ["SearchEnabled" :content]))) (letvar317884 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar317884 ["ReturnEnabled" :content]))))))

(clojure.core/defn- deser-domain-status [input] (clojure.core/let [letvar317992 {"Created" (portkey.aws/search-for-tag input "Created" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Limits" (portkey.aws/search-for-tag input "Limits" :flattened? nil :xmlAttribute? nil), "RequiresIndexDocuments" (portkey.aws/search-for-tag input "RequiresIndexDocuments" :flattened? nil :xmlAttribute? nil), "DocService" (portkey.aws/search-for-tag input "DocService" :flattened? nil :xmlAttribute? nil), "Deleted" (portkey.aws/search-for-tag input "Deleted" :flattened? nil :xmlAttribute? nil), "SearchInstanceCount" (portkey.aws/search-for-tag input "SearchInstanceCount" :flattened? nil :xmlAttribute? nil), "DomainId" (portkey.aws/search-for-tag input "DomainId" :flattened? nil :xmlAttribute? nil), "Processing" (portkey.aws/search-for-tag input "Processing" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "SearchService" (portkey.aws/search-for-tag input "SearchService" :flattened? nil :xmlAttribute? nil), "SearchInstanceType" (portkey.aws/search-for-tag input "SearchInstanceType" :flattened? nil :xmlAttribute? nil), "SearchPartitionCount" (portkey.aws/search-for-tag input "SearchPartitionCount" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-id (deser-domain-id (clojure.core/get-in letvar317992 ["DomainId" :content])), :domain-name (deser-domain-name (clojure.core/get-in letvar317992 ["DomainName" :content])), :requires-index-documents (deser-boolean (clojure.core/get-in letvar317992 ["RequiresIndexDocuments" :content]))} (letvar317992 "Created") (clojure.core/assoc :created (deser-boolean (clojure.core/get-in letvar317992 ["Created" :content]))) (letvar317992 "ARN") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar317992 ["ARN" :content]))) (letvar317992 "Limits") (clojure.core/assoc :limits (deser-limits (clojure.core/get-in letvar317992 ["Limits" :content]))) (letvar317992 "DocService") (clojure.core/assoc :doc-service (deser-service-endpoint (clojure.core/get-in letvar317992 ["DocService" :content]))) (letvar317992 "Deleted") (clojure.core/assoc :deleted (deser-boolean (clojure.core/get-in letvar317992 ["Deleted" :content]))) (letvar317992 "SearchInstanceCount") (clojure.core/assoc :search-instance-count (deser-instance-count (clojure.core/get-in letvar317992 ["SearchInstanceCount" :content]))) (letvar317992 "Processing") (clojure.core/assoc :processing (deser-boolean (clojure.core/get-in letvar317992 ["Processing" :content]))) (letvar317992 "SearchService") (clojure.core/assoc :search-service (deser-service-endpoint (clojure.core/get-in letvar317992 ["SearchService" :content]))) (letvar317992 "SearchInstanceType") (clojure.core/assoc :search-instance-type (deser-search-instance-type (clojure.core/get-in letvar317992 ["SearchInstanceType" :content]))) (letvar317992 "SearchPartitionCount") (clojure.core/assoc :search-partition-count (deser-partition-count (clojure.core/get-in letvar317992 ["SearchPartitionCount" :content]))))))

(clojure.core/defn- deser-service-endpoint [input] (clojure.core/let [letvar318100 {"Endpoint" (portkey.aws/search-for-tag input "Endpoint" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar318100 "Endpoint") (clojure.core/assoc :endpoint (deser-service-url (clojure.core/get-in letvar318100 ["Endpoint" :content]))))))

(clojure.core/defn- deser-suggester-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-suggester-status coll))) input))

(clojure.core/defn- deser-limits [input] (clojure.core/let [letvar318225 {"MaximumReplicationCount" (portkey.aws/search-for-tag input "MaximumReplicationCount" :flattened? nil :xmlAttribute? nil), "MaximumPartitionCount" (portkey.aws/search-for-tag input "MaximumPartitionCount" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:maximum-replication-count (deser-maximum-replication-count (clojure.core/get-in letvar318225 ["MaximumReplicationCount" :content])), :maximum-partition-count (deser-maximum-partition-count (clojure.core/get-in letvar318225 ["MaximumPartitionCount" :content]))})))

(clojure.core/defn- deser-analysis-options [input] (clojure.core/let [letvar318333 {"Synonyms" (portkey.aws/search-for-tag input "Synonyms" :flattened? nil :xmlAttribute? nil), "Stopwords" (portkey.aws/search-for-tag input "Stopwords" :flattened? nil :xmlAttribute? nil), "StemmingDictionary" (portkey.aws/search-for-tag input "StemmingDictionary" :flattened? nil :xmlAttribute? nil), "JapaneseTokenizationDictionary" (portkey.aws/search-for-tag input "JapaneseTokenizationDictionary" :flattened? nil :xmlAttribute? nil), "AlgorithmicStemming" (portkey.aws/search-for-tag input "AlgorithmicStemming" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar318333 "Synonyms") (clojure.core/assoc :synonyms (deser-string (clojure.core/get-in letvar318333 ["Synonyms" :content]))) (letvar318333 "Stopwords") (clojure.core/assoc :stopwords (deser-string (clojure.core/get-in letvar318333 ["Stopwords" :content]))) (letvar318333 "StemmingDictionary") (clojure.core/assoc :stemming-dictionary (deser-string (clojure.core/get-in letvar318333 ["StemmingDictionary" :content]))) (letvar318333 "JapaneseTokenizationDictionary") (clojure.core/assoc :japanese-tokenization-dictionary (deser-string (clojure.core/get-in letvar318333 ["JapaneseTokenizationDictionary" :content]))) (letvar318333 "AlgorithmicStemming") (clojure.core/assoc :algorithmic-stemming (deser-algorithmic-stemming (clojure.core/get-in letvar318333 ["AlgorithmicStemming" :content]))))))

(clojure.core/defn- deser-error-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-partition-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-option-status [input] (clojure.core/let [letvar318448 {"CreationDate" (portkey.aws/search-for-tag input "CreationDate" :flattened? nil :xmlAttribute? nil), "UpdateDate" (portkey.aws/search-for-tag input "UpdateDate" :flattened? nil :xmlAttribute? nil), "UpdateVersion" (portkey.aws/search-for-tag input "UpdateVersion" :flattened? nil :xmlAttribute? nil), "State" (portkey.aws/search-for-tag input "State" :flattened? nil :xmlAttribute? nil), "PendingDeletion" (portkey.aws/search-for-tag input "PendingDeletion" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:creation-date (deser-update-timestamp (clojure.core/get-in letvar318448 ["CreationDate" :content])), :update-date (deser-update-timestamp (clojure.core/get-in letvar318448 ["UpdateDate" :content])), :state (deser-option-state (clojure.core/get-in letvar318448 ["State" :content]))} (letvar318448 "UpdateVersion") (clojure.core/assoc :update-version (deser-u-int-value (clojure.core/get-in letvar318448 ["UpdateVersion" :content]))) (letvar318448 "PendingDeletion") (clojure.core/assoc :pending-deletion (deser-boolean (clojure.core/get-in letvar318448 ["PendingDeletion" :content]))))))

(clojure.core/defn- deser-date-array-options [input] (clojure.core/let [letvar318556 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceFields" (portkey.aws/search-for-tag input "SourceFields" :flattened? nil :xmlAttribute? nil), "FacetEnabled" (portkey.aws/search-for-tag input "FacetEnabled" :flattened? nil :xmlAttribute? nil), "SearchEnabled" (portkey.aws/search-for-tag input "SearchEnabled" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar318556 "DefaultValue") (clojure.core/assoc :default-value (deser-field-value (clojure.core/get-in letvar318556 ["DefaultValue" :content]))) (letvar318556 "SourceFields") (clojure.core/assoc :source-fields (deser-field-name-comma-list (clojure.core/get-in letvar318556 ["SourceFields" :content]))) (letvar318556 "FacetEnabled") (clojure.core/assoc :facet-enabled (deser-boolean (clojure.core/get-in letvar318556 ["FacetEnabled" :content]))) (letvar318556 "SearchEnabled") (clojure.core/assoc :search-enabled (deser-boolean (clojure.core/get-in letvar318556 ["SearchEnabled" :content]))) (letvar318556 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar318556 ["ReturnEnabled" :content]))))))

(clojure.core/defn- deser-policy-document [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-expression-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-algorithmic-stemming [input] (clojure.core/get {"none" :none, "minimal" :minimal, "light" :light, "full" :full} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-suggester-status [input] (clojure.core/let [letvar318679 {"Options" (portkey.aws/search-for-tag input "Options" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:options (deser-suggester (clojure.core/get-in letvar318679 ["Options" :content])), :status (deser-option-status (clojure.core/get-in letvar318679 ["Status" :content]))})))

(clojure.core/defn- deser-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-date-options [input] (clojure.core/let [letvar318792 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceField" (portkey.aws/search-for-tag input "SourceField" :flattened? nil :xmlAttribute? nil), "FacetEnabled" (portkey.aws/search-for-tag input "FacetEnabled" :flattened? nil :xmlAttribute? nil), "SearchEnabled" (portkey.aws/search-for-tag input "SearchEnabled" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil), "SortEnabled" (portkey.aws/search-for-tag input "SortEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar318792 "DefaultValue") (clojure.core/assoc :default-value (deser-field-value (clojure.core/get-in letvar318792 ["DefaultValue" :content]))) (letvar318792 "SourceField") (clojure.core/assoc :source-field (deser-field-name (clojure.core/get-in letvar318792 ["SourceField" :content]))) (letvar318792 "FacetEnabled") (clojure.core/assoc :facet-enabled (deser-boolean (clojure.core/get-in letvar318792 ["FacetEnabled" :content]))) (letvar318792 "SearchEnabled") (clojure.core/assoc :search-enabled (deser-boolean (clojure.core/get-in letvar318792 ["SearchEnabled" :content]))) (letvar318792 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar318792 ["ReturnEnabled" :content]))) (letvar318792 "SortEnabled") (clojure.core/assoc :sort-enabled (deser-boolean (clojure.core/get-in letvar318792 ["SortEnabled" :content]))))))

(clojure.core/defn- deser-field-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-domain-name-map [input] (clojure.core/let [x-flattened__283694__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__283694__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-domain-name k) (deser-api-version v)]))) input)))

(clojure.core/defn- deser-suggester-fuzzy-matching [input] (clojure.core/get {"none" :none, "low" :low, "high" :high} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-domain-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-dynamic-field-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-expression-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-expression-status coll))) input))

(clojure.core/defn- deser-analysis-scheme-language [input] (clojure.core/get {"nl" :nl, "pt" :pt, "en" :en, "lv" :lv, "ro" :ro, "hy" :hy, "tr" :tr, "it" :it, "el" :el, "fa" :fa, "id" :id, "fi" :fi, "ca" :ca, "sv" :sv, "fr" :fr, "eu" :eu, "da" :da, "hu" :hu, "de" :de, "hi" :hi, "ru" :ru, "ga" :ga, "es" :es, "ja" :ja, "mul" :mul, "gl" :gl, "cs" :cs, "no" :no, "zh-Hans" :zh-hans, "ar" :ar, "bg" :bg, "ko" :ko, "th" :th, "he" :he, "zh-Hant" :zh-hant} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-long [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-literal-array-options [input] (clojure.core/let [letvar318967 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceFields" (portkey.aws/search-for-tag input "SourceFields" :flattened? nil :xmlAttribute? nil), "FacetEnabled" (portkey.aws/search-for-tag input "FacetEnabled" :flattened? nil :xmlAttribute? nil), "SearchEnabled" (portkey.aws/search-for-tag input "SearchEnabled" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar318967 "DefaultValue") (clojure.core/assoc :default-value (deser-field-value (clojure.core/get-in letvar318967 ["DefaultValue" :content]))) (letvar318967 "SourceFields") (clojure.core/assoc :source-fields (deser-field-name-comma-list (clojure.core/get-in letvar318967 ["SourceFields" :content]))) (letvar318967 "FacetEnabled") (clojure.core/assoc :facet-enabled (deser-boolean (clojure.core/get-in letvar318967 ["FacetEnabled" :content]))) (letvar318967 "SearchEnabled") (clojure.core/assoc :search-enabled (deser-boolean (clojure.core/get-in letvar318967 ["SearchEnabled" :content]))) (letvar318967 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar318967 ["ReturnEnabled" :content]))))))

(clojure.core/defn- deser-word [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-partition-instance-type [input] (clojure.core/get {"search.m1.small" :searchm-1small, "search.m1.large" :searchm-1large, "search.m2.xlarge" :searchm-2xlarge, "search.m2.2xlarge" :searchm-22xlarge, "search.m3.medium" :searchm-3medium, "search.m3.large" :searchm-3large, "search.m3.xlarge" :searchm-3xlarge, "search.m3.2xlarge" :searchm-32xlarge} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-expression-status [input] (clojure.core/let [letvar319085 {"Options" (portkey.aws/search-for-tag input "Options" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:options (deser-expression (clojure.core/get-in letvar319085 ["Options" :content])), :status (deser-option-status (clojure.core/get-in letvar319085 ["Status" :content]))})))

(clojure.core/defn- deser-literal-options [input] (clojure.core/let [letvar319193 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceField" (portkey.aws/search-for-tag input "SourceField" :flattened? nil :xmlAttribute? nil), "FacetEnabled" (portkey.aws/search-for-tag input "FacetEnabled" :flattened? nil :xmlAttribute? nil), "SearchEnabled" (portkey.aws/search-for-tag input "SearchEnabled" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil), "SortEnabled" (portkey.aws/search-for-tag input "SortEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar319193 "DefaultValue") (clojure.core/assoc :default-value (deser-field-value (clojure.core/get-in letvar319193 ["DefaultValue" :content]))) (letvar319193 "SourceField") (clojure.core/assoc :source-field (deser-field-name (clojure.core/get-in letvar319193 ["SourceField" :content]))) (letvar319193 "FacetEnabled") (clojure.core/assoc :facet-enabled (deser-boolean (clojure.core/get-in letvar319193 ["FacetEnabled" :content]))) (letvar319193 "SearchEnabled") (clojure.core/assoc :search-enabled (deser-boolean (clojure.core/get-in letvar319193 ["SearchEnabled" :content]))) (letvar319193 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar319193 ["ReturnEnabled" :content]))) (letvar319193 "SortEnabled") (clojure.core/assoc :sort-enabled (deser-boolean (clojure.core/get-in letvar319193 ["SortEnabled" :content]))))))

(clojure.core/defn- deser-access-policies-status [input] (clojure.core/let [letvar319301 {"Options" (portkey.aws/search-for-tag input "Options" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:options (deser-policy-document (clojure.core/get-in letvar319301 ["Options" :content])), :status (deser-option-status (clojure.core/get-in letvar319301 ["Status" :content]))})))

(clojure.core/defn- deser-domain-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-index-field [input] (clojure.core/let [letvar319414 {"DoubleArrayOptions" (portkey.aws/search-for-tag input "DoubleArrayOptions" :flattened? nil :xmlAttribute? nil), "IndexFieldType" (portkey.aws/search-for-tag input "IndexFieldType" :flattened? nil :xmlAttribute? nil), "LatLonOptions" (portkey.aws/search-for-tag input "LatLonOptions" :flattened? nil :xmlAttribute? nil), "TextOptions" (portkey.aws/search-for-tag input "TextOptions" :flattened? nil :xmlAttribute? nil), "DoubleOptions" (portkey.aws/search-for-tag input "DoubleOptions" :flattened? nil :xmlAttribute? nil), "TextArrayOptions" (portkey.aws/search-for-tag input "TextArrayOptions" :flattened? nil :xmlAttribute? nil), "IntArrayOptions" (portkey.aws/search-for-tag input "IntArrayOptions" :flattened? nil :xmlAttribute? nil), "DateArrayOptions" (portkey.aws/search-for-tag input "DateArrayOptions" :flattened? nil :xmlAttribute? nil), "IndexFieldName" (portkey.aws/search-for-tag input "IndexFieldName" :flattened? nil :xmlAttribute? nil), "DateOptions" (portkey.aws/search-for-tag input "DateOptions" :flattened? nil :xmlAttribute? nil), "LiteralArrayOptions" (portkey.aws/search-for-tag input "LiteralArrayOptions" :flattened? nil :xmlAttribute? nil), "LiteralOptions" (portkey.aws/search-for-tag input "LiteralOptions" :flattened? nil :xmlAttribute? nil), "IntOptions" (portkey.aws/search-for-tag input "IntOptions" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:index-field-name (deser-dynamic-field-name (clojure.core/get-in letvar319414 ["IndexFieldName" :content])), :index-field-type (deser-index-field-type (clojure.core/get-in letvar319414 ["IndexFieldType" :content]))} (letvar319414 "DoubleArrayOptions") (clojure.core/assoc :double-array-options (deser-double-array-options (clojure.core/get-in letvar319414 ["DoubleArrayOptions" :content]))) (letvar319414 "LatLonOptions") (clojure.core/assoc :lat-lon-options (deser-lat-lon-options (clojure.core/get-in letvar319414 ["LatLonOptions" :content]))) (letvar319414 "TextOptions") (clojure.core/assoc :text-options (deser-text-options (clojure.core/get-in letvar319414 ["TextOptions" :content]))) (letvar319414 "DoubleOptions") (clojure.core/assoc :double-options (deser-double-options (clojure.core/get-in letvar319414 ["DoubleOptions" :content]))) (letvar319414 "TextArrayOptions") (clojure.core/assoc :text-array-options (deser-text-array-options (clojure.core/get-in letvar319414 ["TextArrayOptions" :content]))) (letvar319414 "IntArrayOptions") (clojure.core/assoc :int-array-options (deser-int-array-options (clojure.core/get-in letvar319414 ["IntArrayOptions" :content]))) (letvar319414 "DateArrayOptions") (clojure.core/assoc :date-array-options (deser-date-array-options (clojure.core/get-in letvar319414 ["DateArrayOptions" :content]))) (letvar319414 "DateOptions") (clojure.core/assoc :date-options (deser-date-options (clojure.core/get-in letvar319414 ["DateOptions" :content]))) (letvar319414 "LiteralArrayOptions") (clojure.core/assoc :literal-array-options (deser-literal-array-options (clojure.core/get-in letvar319414 ["LiteralArrayOptions" :content]))) (letvar319414 "LiteralOptions") (clojure.core/assoc :literal-options (deser-literal-options (clojure.core/get-in letvar319414 ["LiteralOptions" :content]))) (letvar319414 "IntOptions") (clojure.core/assoc :int-options (deser-int-options (clojure.core/get-in letvar319414 ["IntOptions" :content]))))))

(clojure.core/defn- deser-field-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-maximum-partition-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-search-instance-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-option-state [input] (clojure.core/get {"RequiresIndexDocuments" :requires-index-documents, "Processing" :processing, "Active" :active, "FailedToValidate" :failed-to-validate} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-multi-az [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-u-int-value [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-scaling-parameters [input] (clojure.core/let [letvar319543 {"DesiredInstanceType" (portkey.aws/search-for-tag input "DesiredInstanceType" :flattened? nil :xmlAttribute? nil), "DesiredReplicationCount" (portkey.aws/search-for-tag input "DesiredReplicationCount" :flattened? nil :xmlAttribute? nil), "DesiredPartitionCount" (portkey.aws/search-for-tag input "DesiredPartitionCount" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar319543 "DesiredInstanceType") (clojure.core/assoc :desired-instance-type (deser-partition-instance-type (clojure.core/get-in letvar319543 ["DesiredInstanceType" :content]))) (letvar319543 "DesiredReplicationCount") (clojure.core/assoc :desired-replication-count (deser-u-int-value (clojure.core/get-in letvar319543 ["DesiredReplicationCount" :content]))) (letvar319543 "DesiredPartitionCount") (clojure.core/assoc :desired-partition-count (deser-u-int-value (clojure.core/get-in letvar319543 ["DesiredPartitionCount" :content]))))))

(clojure.core/defn- deser-int-options [input] (clojure.core/let [letvar319651 {"DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "SourceField" (portkey.aws/search-for-tag input "SourceField" :flattened? nil :xmlAttribute? nil), "FacetEnabled" (portkey.aws/search-for-tag input "FacetEnabled" :flattened? nil :xmlAttribute? nil), "SearchEnabled" (portkey.aws/search-for-tag input "SearchEnabled" :flattened? nil :xmlAttribute? nil), "ReturnEnabled" (portkey.aws/search-for-tag input "ReturnEnabled" :flattened? nil :xmlAttribute? nil), "SortEnabled" (portkey.aws/search-for-tag input "SortEnabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar319651 "DefaultValue") (clojure.core/assoc :default-value (deser-long (clojure.core/get-in letvar319651 ["DefaultValue" :content]))) (letvar319651 "SourceField") (clojure.core/assoc :source-field (deser-field-name (clojure.core/get-in letvar319651 ["SourceField" :content]))) (letvar319651 "FacetEnabled") (clojure.core/assoc :facet-enabled (deser-boolean (clojure.core/get-in letvar319651 ["FacetEnabled" :content]))) (letvar319651 "SearchEnabled") (clojure.core/assoc :search-enabled (deser-boolean (clojure.core/get-in letvar319651 ["SearchEnabled" :content]))) (letvar319651 "ReturnEnabled") (clojure.core/assoc :return-enabled (deser-boolean (clojure.core/get-in letvar319651 ["ReturnEnabled" :content]))) (letvar319651 "SortEnabled") (clojure.core/assoc :sort-enabled (deser-boolean (clojure.core/get-in letvar319651 ["SortEnabled" :content]))))))

(clojure.core/defn- deser-analysis-scheme-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-analysis-scheme-status coll))) input))

(clojure.core/defn- deser-document-suggester-options [input] (clojure.core/let [letvar319776 {"SourceField" (portkey.aws/search-for-tag input "SourceField" :flattened? nil :xmlAttribute? nil), "FuzzyMatching" (portkey.aws/search-for-tag input "FuzzyMatching" :flattened? nil :xmlAttribute? nil), "SortExpression" (portkey.aws/search-for-tag input "SortExpression" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:source-field (deser-field-name (clojure.core/get-in letvar319776 ["SourceField" :content]))} (letvar319776 "FuzzyMatching") (clojure.core/assoc :fuzzy-matching (deser-suggester-fuzzy-matching (clojure.core/get-in letvar319776 ["FuzzyMatching" :content]))) (letvar319776 "SortExpression") (clojure.core/assoc :sort-expression (deser-string (clojure.core/get-in letvar319776 ["SortExpression" :content]))))))

(clojure.core/defn- deser-availability-options-status [input] (clojure.core/let [letvar319884 {"Options" (portkey.aws/search-for-tag input "Options" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:options (deser-multi-az (clojure.core/get-in letvar319884 ["Options" :content])), :status (deser-option-status (clojure.core/get-in letvar319884 ["Status" :content]))})))

(clojure.core/defn- deser-boolean [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- response-index-documents-response ([input] (response-index-documents-response nil input)) ([resultWrapper319888 input] (clojure.core/let [rawinput319887 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319889 {"FieldNames" (portkey.aws/search-for-tag rawinput319887 "FieldNames" :flattened? nil :result-wrapper resultWrapper319888)}] (clojure.core/cond-> {} (letvar319889 "FieldNames") (clojure.core/assoc :field-names (deser-field-name-list (clojure.core/get-in letvar319889 ["FieldNames" :content])))))))

(clojure.core/defn- response-define-index-field-response ([input] (response-define-index-field-response nil input)) ([resultWrapper319891 input] (clojure.core/let [rawinput319890 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319892 {"IndexField" (portkey.aws/search-for-tag rawinput319890 "IndexField" :flattened? nil :result-wrapper resultWrapper319891)}] (clojure.core/cond-> {:index-field (deser-index-field-status (clojure.core/get-in letvar319892 ["IndexField" :content]))}))))

(clojure.core/defn- response-describe-expressions-response ([input] (response-describe-expressions-response nil input)) ([resultWrapper319894 input] (clojure.core/let [rawinput319893 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319895 {"Expressions" (portkey.aws/search-for-tag rawinput319893 "Expressions" :flattened? nil :result-wrapper resultWrapper319894)}] (clojure.core/cond-> {:expressions (deser-expression-status-list (clojure.core/get-in letvar319895 ["Expressions" :content]))}))))

(clojure.core/defn- response-define-analysis-scheme-response ([input] (response-define-analysis-scheme-response nil input)) ([resultWrapper319897 input] (clojure.core/let [rawinput319896 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319898 {"AnalysisScheme" (portkey.aws/search-for-tag rawinput319896 "AnalysisScheme" :flattened? nil :result-wrapper resultWrapper319897)}] (clojure.core/cond-> {:analysis-scheme (deser-analysis-scheme-status (clojure.core/get-in letvar319898 ["AnalysisScheme" :content]))}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper319900 input] (clojure.core/let [rawinput319899 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319901 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-domains-response ([input] (response-describe-domains-response nil input)) ([resultWrapper319903 input] (clojure.core/let [rawinput319902 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319904 {"DomainStatusList" (portkey.aws/search-for-tag rawinput319902 "DomainStatusList" :flattened? nil :result-wrapper resultWrapper319903)}] (clojure.core/cond-> {:domain-status-list (deser-domain-status-list (clojure.core/get-in letvar319904 ["DomainStatusList" :content]))}))))

(clojure.core/defn- response-update-availability-options-response ([input] (response-update-availability-options-response nil input)) ([resultWrapper319906 input] (clojure.core/let [rawinput319905 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319907 {"AvailabilityOptions" (portkey.aws/search-for-tag rawinput319905 "AvailabilityOptions" :flattened? nil :result-wrapper resultWrapper319906)}] (clojure.core/cond-> {} (letvar319907 "AvailabilityOptions") (clojure.core/assoc :availability-options (deser-availability-options-status (clojure.core/get-in letvar319907 ["AvailabilityOptions" :content])))))))

(clojure.core/defn- response-invalid-type-exception ([input] (response-invalid-type-exception nil input)) ([resultWrapper319909 input] (clojure.core/let [rawinput319908 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319910 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-build-suggesters-response ([input] (response-build-suggesters-response nil input)) ([resultWrapper319912 input] (clojure.core/let [rawinput319911 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319913 {"FieldNames" (portkey.aws/search-for-tag rawinput319911 "FieldNames" :flattened? nil :result-wrapper resultWrapper319912)}] (clojure.core/cond-> {} (letvar319913 "FieldNames") (clojure.core/assoc :field-names (deser-field-name-list (clojure.core/get-in letvar319913 ["FieldNames" :content])))))))

(clojure.core/defn- response-disabled-operation-exception ([input] (response-disabled-operation-exception nil input)) ([resultWrapper319915 input] (clojure.core/let [rawinput319914 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319916 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-domain-names-response ([input] (response-list-domain-names-response nil input)) ([resultWrapper319918 input] (clojure.core/let [rawinput319917 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319919 {"DomainNames" (portkey.aws/search-for-tag rawinput319917 "DomainNames" :flattened? nil :result-wrapper resultWrapper319918)}] (clojure.core/cond-> {} (letvar319919 "DomainNames") (clojure.core/assoc :domain-names (deser-domain-name-map (clojure.core/get-in letvar319919 ["DomainNames" :content])))))))

(clojure.core/defn- response-delete-index-field-response ([input] (response-delete-index-field-response nil input)) ([resultWrapper319921 input] (clojure.core/let [rawinput319920 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319922 {"IndexField" (portkey.aws/search-for-tag rawinput319920 "IndexField" :flattened? nil :result-wrapper resultWrapper319921)}] (clojure.core/cond-> {:index-field (deser-index-field-status (clojure.core/get-in letvar319922 ["IndexField" :content]))}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper319924 input] (clojure.core/let [rawinput319923 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319925 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-availability-options-response ([input] (response-describe-availability-options-response nil input)) ([resultWrapper319927 input] (clojure.core/let [rawinput319926 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319928 {"AvailabilityOptions" (portkey.aws/search-for-tag rawinput319926 "AvailabilityOptions" :flattened? nil :result-wrapper resultWrapper319927)}] (clojure.core/cond-> {} (letvar319928 "AvailabilityOptions") (clojure.core/assoc :availability-options (deser-availability-options-status (clojure.core/get-in letvar319928 ["AvailabilityOptions" :content])))))))

(clojure.core/defn- response-internal-exception ([input] (response-internal-exception nil input)) ([resultWrapper319930 input] (clojure.core/let [rawinput319929 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319931 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-define-suggester-response ([input] (response-define-suggester-response nil input)) ([resultWrapper319933 input] (clojure.core/let [rawinput319932 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319934 {"Suggester" (portkey.aws/search-for-tag rawinput319932 "Suggester" :flattened? nil :result-wrapper resultWrapper319933)}] (clojure.core/cond-> {:suggester (deser-suggester-status (clojure.core/get-in letvar319934 ["Suggester" :content]))}))))

(clojure.core/defn- response-delete-suggester-response ([input] (response-delete-suggester-response nil input)) ([resultWrapper319936 input] (clojure.core/let [rawinput319935 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319937 {"Suggester" (portkey.aws/search-for-tag rawinput319935 "Suggester" :flattened? nil :result-wrapper resultWrapper319936)}] (clojure.core/cond-> {:suggester (deser-suggester-status (clojure.core/get-in letvar319937 ["Suggester" :content]))}))))

(clojure.core/defn- response-describe-service-access-policies-response ([input] (response-describe-service-access-policies-response nil input)) ([resultWrapper319939 input] (clojure.core/let [rawinput319938 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319940 {"AccessPolicies" (portkey.aws/search-for-tag rawinput319938 "AccessPolicies" :flattened? nil :result-wrapper resultWrapper319939)}] (clojure.core/cond-> {:access-policies (deser-access-policies-status (clojure.core/get-in letvar319940 ["AccessPolicies" :content]))}))))

(clojure.core/defn- response-describe-analysis-schemes-response ([input] (response-describe-analysis-schemes-response nil input)) ([resultWrapper319942 input] (clojure.core/let [rawinput319941 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319943 {"AnalysisSchemes" (portkey.aws/search-for-tag rawinput319941 "AnalysisSchemes" :flattened? nil :result-wrapper resultWrapper319942)}] (clojure.core/cond-> {:analysis-schemes (deser-analysis-scheme-status-list (clojure.core/get-in letvar319943 ["AnalysisSchemes" :content]))}))))

(clojure.core/defn- response-base-exception ([input] (response-base-exception nil input)) ([resultWrapper319945 input] (clojure.core/let [rawinput319944 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319946 {"Code" (portkey.aws/search-for-tag rawinput319944 "Code" :flattened? nil :result-wrapper resultWrapper319945), "Message" (portkey.aws/search-for-tag rawinput319944 "Message" :flattened? nil :result-wrapper resultWrapper319945)}] (clojure.core/cond-> {} (letvar319946 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar319946 ["Code" :content]))) (letvar319946 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar319946 ["Message" :content])))))))

(clojure.core/defn- response-delete-domain-response ([input] (response-delete-domain-response nil input)) ([resultWrapper319948 input] (clojure.core/let [rawinput319947 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319949 {"DomainStatus" (portkey.aws/search-for-tag rawinput319947 "DomainStatus" :flattened? nil :result-wrapper resultWrapper319948)}] (clojure.core/cond-> {} (letvar319949 "DomainStatus") (clojure.core/assoc :domain-status (deser-domain-status (clojure.core/get-in letvar319949 ["DomainStatus" :content])))))))

(clojure.core/defn- response-describe-index-fields-response ([input] (response-describe-index-fields-response nil input)) ([resultWrapper319951 input] (clojure.core/let [rawinput319950 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319952 {"IndexFields" (portkey.aws/search-for-tag rawinput319950 "IndexFields" :flattened? nil :result-wrapper resultWrapper319951)}] (clojure.core/cond-> {:index-fields (deser-index-field-status-list (clojure.core/get-in letvar319952 ["IndexFields" :content]))}))))

(clojure.core/defn- response-define-expression-response ([input] (response-define-expression-response nil input)) ([resultWrapper319954 input] (clojure.core/let [rawinput319953 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319955 {"Expression" (portkey.aws/search-for-tag rawinput319953 "Expression" :flattened? nil :result-wrapper resultWrapper319954)}] (clojure.core/cond-> {:expression (deser-expression-status (clojure.core/get-in letvar319955 ["Expression" :content]))}))))

(clojure.core/defn- response-delete-analysis-scheme-response ([input] (response-delete-analysis-scheme-response nil input)) ([resultWrapper319957 input] (clojure.core/let [rawinput319956 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319958 {"AnalysisScheme" (portkey.aws/search-for-tag rawinput319956 "AnalysisScheme" :flattened? nil :result-wrapper resultWrapper319957)}] (clojure.core/cond-> {:analysis-scheme (deser-analysis-scheme-status (clojure.core/get-in letvar319958 ["AnalysisScheme" :content]))}))))

(clojure.core/defn- response-update-scaling-parameters-response ([input] (response-update-scaling-parameters-response nil input)) ([resultWrapper319960 input] (clojure.core/let [rawinput319959 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319961 {"ScalingParameters" (portkey.aws/search-for-tag rawinput319959 "ScalingParameters" :flattened? nil :result-wrapper resultWrapper319960)}] (clojure.core/cond-> {:scaling-parameters (deser-scaling-parameters-status (clojure.core/get-in letvar319961 ["ScalingParameters" :content]))}))))

(clojure.core/defn- response-update-service-access-policies-response ([input] (response-update-service-access-policies-response nil input)) ([resultWrapper319963 input] (clojure.core/let [rawinput319962 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319964 {"AccessPolicies" (portkey.aws/search-for-tag rawinput319962 "AccessPolicies" :flattened? nil :result-wrapper resultWrapper319963)}] (clojure.core/cond-> {:access-policies (deser-access-policies-status (clojure.core/get-in letvar319964 ["AccessPolicies" :content]))}))))

(clojure.core/defn- response-describe-scaling-parameters-response ([input] (response-describe-scaling-parameters-response nil input)) ([resultWrapper319966 input] (clojure.core/let [rawinput319965 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319967 {"ScalingParameters" (portkey.aws/search-for-tag rawinput319965 "ScalingParameters" :flattened? nil :result-wrapper resultWrapper319966)}] (clojure.core/cond-> {:scaling-parameters (deser-scaling-parameters-status (clojure.core/get-in letvar319967 ["ScalingParameters" :content]))}))))

(clojure.core/defn- response-delete-expression-response ([input] (response-delete-expression-response nil input)) ([resultWrapper319969 input] (clojure.core/let [rawinput319968 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319970 {"Expression" (portkey.aws/search-for-tag rawinput319968 "Expression" :flattened? nil :result-wrapper resultWrapper319969)}] (clojure.core/cond-> {:expression (deser-expression-status (clojure.core/get-in letvar319970 ["Expression" :content]))}))))

(clojure.core/defn- response-create-domain-response ([input] (response-create-domain-response nil input)) ([resultWrapper319972 input] (clojure.core/let [rawinput319971 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319973 {"DomainStatus" (portkey.aws/search-for-tag rawinput319971 "DomainStatus" :flattened? nil :result-wrapper resultWrapper319972)}] (clojure.core/cond-> {} (letvar319973 "DomainStatus") (clojure.core/assoc :domain-status (deser-domain-status (clojure.core/get-in letvar319973 ["DomainStatus" :content])))))))

(clojure.core/defn- response-describe-suggesters-response ([input] (response-describe-suggesters-response nil input)) ([resultWrapper319975 input] (clojure.core/let [rawinput319974 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar319976 {"Suggesters" (portkey.aws/search-for-tag rawinput319974 "Suggesters" :flattened? nil :result-wrapper resultWrapper319975)}] (clojure.core/cond-> {:suggesters (deser-suggester-status-list (clojure.core/get-in letvar319976 ["Suggesters" :content]))}))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.index-documents-response/field-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-documents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.index-documents-response/field-names]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/double-array-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.double-array-options/default-value :portkey.aws.cloudsearch.double-array-options/source-fields :portkey.aws.cloudsearch.double-array-options/facet-enabled :portkey.aws.cloudsearch.double-array-options/search-enabled :portkey.aws.cloudsearch.double-array-options/return-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-field-type #{"int" :date :double :literalarray :int :intarray :datearray "text-array" "latlon" "text" "int-array" "literal-array" :latlon :literal "double" "date" :doublearray "double-array" :textarray "literal" :text "date-array"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-field-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/index-field-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/domain-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.update-availability-options-request/multi-az (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-availability-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch.update-availability-options-request/multi-az] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-index-fields-request/field-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/dynamic-field-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-index-fields-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-index-fields-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un [:portkey.aws.cloudsearch.describe-index-fields-request/field-names :portkey.aws.cloudsearch.describe-index-fields-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-analysis-scheme-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch/analysis-scheme] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-scaling-parameters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/api-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.define-index-field-response/index-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/index-field-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-index-field-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.define-index-field-response/index-field] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-analysis-schemes-request/analysis-scheme-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-analysis-schemes-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-analysis-schemes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un [:portkey.aws.cloudsearch.describe-analysis-schemes-request/analysis-scheme-names :portkey.aws.cloudsearch.describe-analysis-schemes-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-expressions-response/expressions (clojure.spec.alpha/and :portkey.aws.cloudsearch/expression-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-expressions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.describe-expressions-response/expressions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/field-name-comma-list (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"\s*[a-z*][a-z0-9_]*\*?\s*(,\s*[a-z*][a-z0-9_]*\*?\s*)*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/maximum-replication-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.suggester/suggester-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/suggester (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.suggester/suggester-name :portkey.aws.cloudsearch/document-suggester-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-suggester-request/suggester-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-suggester-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch.delete-suggester-request/suggester-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/lat-lon-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.lat-lon-options/default-value :portkey.aws.cloudsearch.lat-lon-options/source-field :portkey.aws.cloudsearch.lat-lon-options/facet-enabled :portkey.aws.cloudsearch.lat-lon-options/search-enabled :portkey.aws.cloudsearch.lat-lon-options/return-enabled :portkey.aws.cloudsearch.lat-lon-options/sort-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/highlight-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch/word))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/text-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.text-options/default-value :portkey.aws.cloudsearch.text-options/source-field :portkey.aws.cloudsearch.text-options/return-enabled :portkey.aws.cloudsearch.text-options/sort-enabled :portkey.aws.cloudsearch.text-options/highlight-enabled :portkey.aws.cloudsearch.text-options/analysis-scheme]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/instance-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-scheme-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/analysis-scheme))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-scheme-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/analysis-scheme-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.analysis-scheme-status/options :portkey.aws.cloudsearch.analysis-scheme-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-suggester-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch/suggester] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/standard-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[a-z][a-z0-9_]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-expression-request/expression-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-expression-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch.delete-expression-request/expression-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-index-field-request/index-field-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/dynamic-field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-index-field-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch.delete-index-field-request/index-field-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-scheme/analysis-scheme-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/analysis-scheme (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.analysis-scheme/analysis-scheme-name :portkey.aws.cloudsearch/analysis-scheme-language] :opt-un [:portkey.aws.cloudsearch/analysis-options]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.define-analysis-scheme-response/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch/analysis-scheme-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-analysis-scheme-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.define-analysis-scheme-response/analysis-scheme] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.index-field-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/index-field))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.index-field-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-field-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.index-field-status/options :portkey.aws.cloudsearch.index-field-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-availability-options-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-availability-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un [:portkey.aws.cloudsearch.describe-availability-options-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/create-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-domains-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-status-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.scaling-parameters-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/scaling-parameters))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.scaling-parameters-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/scaling-parameters-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.scaling-parameters-status/options :portkey.aws.cloudsearch.scaling-parameters-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/double-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.double-options/default-value :portkey.aws.cloudsearch.double-options/source-field :portkey.aws.cloudsearch.double-options/facet-enabled :portkey.aws.cloudsearch.double-options/search-enabled :portkey.aws.cloudsearch.double-options/return-enabled :portkey.aws.cloudsearch.double-options/sort-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.expression/expression-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/expression (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.expression/expression-name :portkey.aws.cloudsearch/expression-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/field-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/field-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-array-options/highlight-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-array-options/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch/word))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/text-array-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.text-array-options/default-value :portkey.aws.cloudsearch.text-array-options/source-fields :portkey.aws.cloudsearch.text-array-options/return-enabled :portkey.aws.cloudsearch.text-array-options/highlight-enabled :portkey.aws.cloudsearch.text-array-options/analysis-scheme]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-expression-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch/expression] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.update-availability-options-response/availability-options (clojure.spec.alpha/and :portkey.aws.cloudsearch/availability-options-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-availability-options-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.update-availability-options-response/availability-options]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/invalid-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-scaling-parameters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch/scaling-parameters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.build-suggesters-response/field-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/build-suggesters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.build-suggesters-response/field-names]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/service-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/int-array-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.int-array-options/default-value :portkey.aws.cloudsearch.int-array-options/source-fields :portkey.aws.cloudsearch.int-array-options/facet-enabled :portkey.aws.cloudsearch.int-array-options/search-enabled :portkey.aws.cloudsearch.int-array-options/return-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-documents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/disabled-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.list-domain-names-response/domain-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/domain-name-map))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/list-domain-names-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.list-domain-names-response/domain-names]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/domain-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/created (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/requires-index-documents (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/doc-service (clojure.spec.alpha/and :portkey.aws.cloudsearch/service-endpoint))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/deleted (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/search-instance-count (clojure.spec.alpha/and :portkey.aws.cloudsearch/instance-count))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/processing (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/search-service (clojure.spec.alpha/and :portkey.aws.cloudsearch/service-endpoint))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/search-partition-count (clojure.spec.alpha/and :portkey.aws.cloudsearch/partition-count))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-id :portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch.domain-status/requires-index-documents] :opt-un [:portkey.aws.cloudsearch.domain-status/created :portkey.aws.cloudsearch/arn :portkey.aws.cloudsearch/limits :portkey.aws.cloudsearch.domain-status/doc-service :portkey.aws.cloudsearch.domain-status/deleted :portkey.aws.cloudsearch.domain-status/search-instance-count :portkey.aws.cloudsearch.domain-status/processing :portkey.aws.cloudsearch.domain-status/search-service :portkey.aws.cloudsearch/search-instance-type :portkey.aws.cloudsearch.domain-status/search-partition-count]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.service-endpoint/endpoint (clojure.spec.alpha/and :portkey.aws.cloudsearch/service-url))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/service-endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.service-endpoint/endpoint]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/suggester-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/suggester-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/limits (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/maximum-replication-count :portkey.aws.cloudsearch/maximum-partition-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/build-suggesters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/dynamic-field-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/dynamic-field-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-options/synonyms (clojure.spec.alpha/and :portkey.aws.cloudsearch/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-options/stopwords (clojure.spec.alpha/and :portkey.aws.cloudsearch/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-options/stemming-dictionary (clojure.spec.alpha/and :portkey.aws.cloudsearch/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-options/japanese-tokenization-dictionary (clojure.spec.alpha/and :portkey.aws.cloudsearch/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/analysis-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.analysis-options/synonyms :portkey.aws.cloudsearch.analysis-options/stopwords :portkey.aws.cloudsearch.analysis-options/stemming-dictionary :portkey.aws.cloudsearch.analysis-options/japanese-tokenization-dictionary :portkey.aws.cloudsearch/algorithmic-stemming]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/partition-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-index-field-response/index-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/index-field-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-index-field-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.delete-index-field-response/index-field] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-availability-options-response/availability-options (clojure.spec.alpha/and :portkey.aws.cloudsearch/availability-options-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-availability-options-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.describe-availability-options-response/availability-options]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-service-access-policies-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-service-access-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un [:portkey.aws.cloudsearch.describe-service-access-policies-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.option-status/creation-date (clojure.spec.alpha/and :portkey.aws.cloudsearch/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.option-status/update-date (clojure.spec.alpha/and :portkey.aws.cloudsearch/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.option-status/update-version (clojure.spec.alpha/and :portkey.aws.cloudsearch/u-int-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.option-status/state (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-state))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.option-status/pending-deletion (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/option-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.option-status/creation-date :portkey.aws.cloudsearch.option-status/update-date :portkey.aws.cloudsearch.option-status/state] :opt-un [:portkey.aws.cloudsearch.option-status/update-version :portkey.aws.cloudsearch.option-status/pending-deletion]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/date-array-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.date-array-options/default-value :portkey.aws.cloudsearch.date-array-options/source-fields :portkey.aws.cloudsearch.date-array-options/facet-enabled :portkey.aws.cloudsearch.date-array-options/search-enabled :portkey.aws.cloudsearch.date-array-options/return-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/expression-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/algorithmic-stemming #{"light" "none" :full "minimal" "full" :minimal :light :none})

(clojure.spec.alpha/def :portkey.aws.cloudsearch/internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.suggester-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/suggester))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.suggester-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/suggester-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.suggester-status/options :portkey.aws.cloudsearch.suggester-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.define-suggester-response/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearch/suggester-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-suggester-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.define-suggester-response/suggester] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-suggester-response/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearch/suggester-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-suggester-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.delete-suggester-response/suggester] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-service-access-policies-response/access-policies (clojure.spec.alpha/and :portkey.aws.cloudsearch/access-policies-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-service-access-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.describe-service-access-policies-response/access-policies] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/date-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.date-options/default-value :portkey.aws.cloudsearch.date-options/source-field :portkey.aws.cloudsearch.date-options/facet-enabled :portkey.aws.cloudsearch.date-options/search-enabled :portkey.aws.cloudsearch.date-options/return-enabled :portkey.aws.cloudsearch.date-options/sort-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-analysis-schemes-response/analysis-schemes (clojure.spec.alpha/and :portkey.aws.cloudsearch/analysis-scheme-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-analysis-schemes-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.describe-analysis-schemes-response/analysis-schemes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[a-z][a-z0-9_]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-name-map (clojure.spec.alpha/map-of :portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch/api-version))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.base-exception/code (clojure.spec.alpha/and :portkey.aws.cloudsearch/error-code))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.base-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearch/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/base-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.base-exception/code :portkey.aws.cloudsearch.base-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/standard-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/standard-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/suggester-fuzzy-matching #{"low" "none" "high" :high :low :none})

(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch/domain-status]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-index-fields-response/index-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/index-field-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-index-fields-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.describe-index-fields-response/index-fields] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/dynamic-field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/expression-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/expression-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/analysis-scheme-language #{"nl" :fr :ja :el "pt" "en" :es "lv" :pt :fi :ga "ro" "hy" "tr" "it" "el" "fa" :ca :ro :th :tr :cs :hu "id" "fi" :ko "ca" "sv" "fr" "eu" :it "da" "hu" "de" "hi" :en :nl "ru" :mul "ga" "es" :de :id :ar :zh-hant "ja" :hy "mul" "gl" :ru :gl "cs" "no" "zh-Hans" :he :sv :da "ar" "bg" "ko" :zh-hans :bg :lv "th" :eu "he" :hi :no "zh-Hant" :fa})

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-suggesters-request/suggester-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-suggesters-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-suggesters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un [:portkey.aws.cloudsearch.describe-suggesters-request/suggester-names :portkey.aws.cloudsearch.describe-suggesters-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch.define-expression-response/expression (clojure.spec.alpha/and :portkey.aws.cloudsearch/expression-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-expression-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.define-expression-response/expression] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/literal-array-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.literal-array-options/default-value :portkey.aws.cloudsearch.literal-array-options/source-fields :portkey.aws.cloudsearch.literal-array-options/facet-enabled :portkey.aws.cloudsearch.literal-array-options/search-enabled :portkey.aws.cloudsearch.literal-array-options/return-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-analysis-scheme-response/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch/analysis-scheme-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-analysis-scheme-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.delete-analysis-scheme-response/analysis-scheme] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/word (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\S]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/partition-instance-type #{:searchm-3medium "search.m3.2xlarge" "search.m3.large" "search.m2.xlarge" :searchm-1large :searchm-2xlarge :searchm-3xlarge :searchm-1small "search.m3.xlarge" "search.m1.small" "search.m3.medium" "search.m1.large" :searchm-22xlarge :searchm-32xlarge :searchm-3large "search.m2.2xlarge"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-index-field-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch/index-field] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.expression-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/expression))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.expression-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/expression-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.expression-status/options :portkey.aws.cloudsearch.expression-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/literal-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.literal-options/default-value :portkey.aws.cloudsearch.literal-options/source-field :portkey.aws.cloudsearch.literal-options/facet-enabled :portkey.aws.cloudsearch.literal-options/search-enabled :portkey.aws.cloudsearch.literal-options/return-enabled :portkey.aws.cloudsearch.literal-options/sort-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.update-scaling-parameters-response/scaling-parameters (clojure.spec.alpha/and :portkey.aws.cloudsearch/scaling-parameters-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-scaling-parameters-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.update-scaling-parameters-response/scaling-parameters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.update-service-access-policies-response/access-policies (clojure.spec.alpha/and :portkey.aws.cloudsearch/access-policies-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-service-access-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.update-service-access-policies-response/access-policies] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.access-policies-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/policy-document))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.access-policies-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/access-policies-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.access-policies-status/options :portkey.aws.cloudsearch.access-policies-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-scaling-parameters-response/scaling-parameters (clojure.spec.alpha/and :portkey.aws.cloudsearch/scaling-parameters-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-scaling-parameters-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.describe-scaling-parameters-response/scaling-parameters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 3 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 28)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[a-z][a-z0-9\-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-expressions-request/expression-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-expressions-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-expressions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name] :opt-un [:portkey.aws.cloudsearch.describe-expressions-request/expression-names :portkey.aws.cloudsearch.describe-expressions-request/deployed]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.index-field/index-field-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/dynamic-field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-field (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.index-field/index-field-name :portkey.aws.cloudsearch/index-field-type] :opt-un [:portkey.aws.cloudsearch/double-array-options :portkey.aws.cloudsearch/lat-lon-options :portkey.aws.cloudsearch/text-options :portkey.aws.cloudsearch/double-options :portkey.aws.cloudsearch/text-array-options :portkey.aws.cloudsearch/int-array-options :portkey.aws.cloudsearch/date-array-options :portkey.aws.cloudsearch/date-options :portkey.aws.cloudsearch/literal-array-options :portkey.aws.cloudsearch/literal-options :portkey.aws.cloudsearch/int-options]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-domains-request/domain-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/domain-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-domains-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.describe-domains-request/domain-names]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-expression-response/expression (clojure.spec.alpha/and :portkey.aws.cloudsearch/expression-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-expression-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.delete-expression-response/expression] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/field-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 0 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-analysis-scheme-request/analysis-scheme-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-analysis-scheme-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch.delete-analysis-scheme-request/analysis-scheme-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/maximum-partition-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/search-instance-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.update-service-access-policies-request/access-policies (clojure.spec.alpha/and :portkey.aws.cloudsearch/policy-document))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-service-access-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch.update-service-access-policies-request/access-policies] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/option-state #{"Active" :processing "FailedToValidate" :requires-index-documents "RequiresIndexDocuments" :failed-to-validate :active "Processing"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch/create-domain-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch/domain-status]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/multi-az clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch/u-int-value (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.scaling-parameters/desired-instance-type (clojure.spec.alpha/and :portkey.aws.cloudsearch/partition-instance-type))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.scaling-parameters/desired-replication-count (clojure.spec.alpha/and :portkey.aws.cloudsearch/u-int-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.scaling-parameters/desired-partition-count (clojure.spec.alpha/and :portkey.aws.cloudsearch/u-int-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/scaling-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.scaling-parameters/desired-instance-type :portkey.aws.cloudsearch.scaling-parameters/desired-replication-count :portkey.aws.cloudsearch.scaling-parameters/desired-partition-count]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-suggesters-response/suggesters (clojure.spec.alpha/and :portkey.aws.cloudsearch/suggester-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-suggesters-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.describe-suggesters-response/suggesters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/int-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearch.int-options/default-value :portkey.aws.cloudsearch.int-options/source-field :portkey.aws.cloudsearch.int-options/facet-enabled :portkey.aws.cloudsearch.int-options/search-enabled :portkey.aws.cloudsearch.int-options/return-enabled :portkey.aws.cloudsearch.int-options/sort-enabled]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/analysis-scheme-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/analysis-scheme-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.document-suggester-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.document-suggester-options/fuzzy-matching (clojure.spec.alpha/and :portkey.aws.cloudsearch/suggester-fuzzy-matching))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.document-suggester-options/sort-expression (clojure.spec.alpha/and :portkey.aws.cloudsearch/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/document-suggester-options (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.document-suggester-options/source-field] :opt-un [:portkey.aws.cloudsearch.document-suggester-options/fuzzy-matching :portkey.aws.cloudsearch.document-suggester-options/sort-expression]))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.availability-options-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/multi-az))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.availability-options-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/availability-options-status (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearch.availability-options-status/options :portkey.aws.cloudsearch.availability-options-status/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/boolean clojure.core/boolean?)

(clojure.core/defn delete-index-field ([delete-index-field-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-index-field-request delete-index-field-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/delete-index-field-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/delete-index-field-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteIndexFieldResult", :http.request.configuration/action "DeleteIndexField", :http.request.configuration/output-deser-fn response-delete-index-field-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-index-field :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/delete-index-field-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/delete-index-field-response))

(clojure.core/defn list-domain-names ([] (list-domain-names {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/list-domain-names-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListDomainNamesResult", :http.request.configuration/action "ListDomainNames", :http.request.configuration/output-deser-fn response-list-domain-names-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception}})))))
(clojure.spec.alpha/fdef list-domain-names :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/list-domain-names-response))

(clojure.core/defn update-service-access-policies ([update-service-access-policies-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-service-access-policies-request update-service-access-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/update-service-access-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/update-service-access-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateServiceAccessPoliciesResult", :http.request.configuration/action "UpdateServiceAccessPolicies", :http.request.configuration/output-deser-fn response-update-service-access-policies-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception}})))))
(clojure.spec.alpha/fdef update-service-access-policies :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/update-service-access-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/update-service-access-policies-response))

(clojure.core/defn describe-service-access-policies ([describe-service-access-policies-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-service-access-policies-request describe-service-access-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/describe-service-access-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/describe-service-access-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeServiceAccessPoliciesResult", :http.request.configuration/action "DescribeServiceAccessPolicies", :http.request.configuration/output-deser-fn response-describe-service-access-policies-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-service-access-policies :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-service-access-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-service-access-policies-response))

(clojure.core/defn define-analysis-scheme ([define-analysis-scheme-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-define-analysis-scheme-request define-analysis-scheme-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/define-analysis-scheme-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/define-analysis-scheme-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DefineAnalysisSchemeResult", :http.request.configuration/action "DefineAnalysisScheme", :http.request.configuration/output-deser-fn response-define-analysis-scheme-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef define-analysis-scheme :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/define-analysis-scheme-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/define-analysis-scheme-response))

(clojure.core/defn define-index-field ([define-index-field-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-define-index-field-request define-index-field-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/define-index-field-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/define-index-field-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DefineIndexFieldResult", :http.request.configuration/action "DefineIndexField", :http.request.configuration/output-deser-fn response-define-index-field-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef define-index-field :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/define-index-field-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/define-index-field-response))

(clojure.core/defn define-expression ([define-expression-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-define-expression-request define-expression-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/define-expression-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/define-expression-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DefineExpressionResult", :http.request.configuration/action "DefineExpression", :http.request.configuration/output-deser-fn response-define-expression-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef define-expression :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/define-expression-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/define-expression-response))

(clojure.core/defn build-suggesters ([build-suggesters-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-build-suggesters-request build-suggesters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/build-suggesters-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/build-suggesters-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "BuildSuggestersResult", :http.request.configuration/action "BuildSuggesters", :http.request.configuration/output-deser-fn response-build-suggesters-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef build-suggesters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/build-suggesters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/build-suggesters-response))

(clojure.core/defn describe-index-fields ([describe-index-fields-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-index-fields-request describe-index-fields-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/describe-index-fields-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/describe-index-fields-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeIndexFieldsResult", :http.request.configuration/action "DescribeIndexFields", :http.request.configuration/output-deser-fn response-describe-index-fields-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-index-fields :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-index-fields-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-index-fields-response))

(clojure.core/defn create-domain ([create-domain-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-domain-request create-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/create-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/create-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateDomainResult", :http.request.configuration/action "CreateDomain", :http.request.configuration/output-deser-fn response-create-domain-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-domain :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/create-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/create-domain-response))

(clojure.core/defn define-suggester ([define-suggester-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-define-suggester-request define-suggester-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/define-suggester-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/define-suggester-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DefineSuggesterResult", :http.request.configuration/action "DefineSuggester", :http.request.configuration/output-deser-fn response-define-suggester-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef define-suggester :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/define-suggester-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/define-suggester-response))

(clojure.core/defn delete-expression ([delete-expression-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-expression-request delete-expression-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/delete-expression-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/delete-expression-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteExpressionResult", :http.request.configuration/action "DeleteExpression", :http.request.configuration/output-deser-fn response-delete-expression-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-expression :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/delete-expression-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/delete-expression-response))

(clojure.core/defn delete-analysis-scheme ([delete-analysis-scheme-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-analysis-scheme-request delete-analysis-scheme-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/delete-analysis-scheme-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/delete-analysis-scheme-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteAnalysisSchemeResult", :http.request.configuration/action "DeleteAnalysisScheme", :http.request.configuration/output-deser-fn response-delete-analysis-scheme-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-analysis-scheme :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/delete-analysis-scheme-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/delete-analysis-scheme-response))

(clojure.core/defn describe-analysis-schemes ([describe-analysis-schemes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-analysis-schemes-request describe-analysis-schemes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/describe-analysis-schemes-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/describe-analysis-schemes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAnalysisSchemesResult", :http.request.configuration/action "DescribeAnalysisSchemes", :http.request.configuration/output-deser-fn response-describe-analysis-schemes-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-analysis-schemes :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-analysis-schemes-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-analysis-schemes-response))

(clojure.core/defn describe-domains ([] (describe-domains {})) ([describe-domains-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-domains-request describe-domains-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/describe-domains-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/describe-domains-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeDomainsResult", :http.request.configuration/action "DescribeDomains", :http.request.configuration/output-deser-fn response-describe-domains-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception}})))))
(clojure.spec.alpha/fdef describe-domains :args (clojure.spec.alpha/? :portkey.aws.cloudsearch/describe-domains-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-domains-response))

(clojure.core/defn update-availability-options ([update-availability-options-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-availability-options-request update-availability-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/update-availability-options-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/update-availability-options-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateAvailabilityOptionsResult", :http.request.configuration/action "UpdateAvailabilityOptions", :http.request.configuration/output-deser-fn response-update-availability-options-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception, "DisabledOperationException" :portkey.aws.cloudsearch/disabled-operation-exception}})))))
(clojure.spec.alpha/fdef update-availability-options :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/update-availability-options-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/update-availability-options-response))

(clojure.core/defn update-scaling-parameters ([update-scaling-parameters-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-scaling-parameters-request update-scaling-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/update-scaling-parameters-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/update-scaling-parameters-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateScalingParametersResult", :http.request.configuration/action "UpdateScalingParameters", :http.request.configuration/output-deser-fn response-update-scaling-parameters-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception}})))))
(clojure.spec.alpha/fdef update-scaling-parameters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/update-scaling-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/update-scaling-parameters-response))

(clojure.core/defn describe-scaling-parameters ([describe-scaling-parameters-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-scaling-parameters-request describe-scaling-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/describe-scaling-parameters-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/describe-scaling-parameters-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeScalingParametersResult", :http.request.configuration/action "DescribeScalingParameters", :http.request.configuration/output-deser-fn response-describe-scaling-parameters-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-scaling-parameters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-scaling-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-scaling-parameters-response))

(clojure.core/defn index-documents ([index-documents-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-index-documents-request index-documents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/index-documents-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/index-documents-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "IndexDocumentsResult", :http.request.configuration/action "IndexDocuments", :http.request.configuration/output-deser-fn response-index-documents-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef index-documents :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/index-documents-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/index-documents-response))

(clojure.core/defn delete-domain ([delete-domain-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-domain-request delete-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/delete-domain-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/delete-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteDomainResult", :http.request.configuration/action "DeleteDomain", :http.request.configuration/output-deser-fn response-delete-domain-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception}})))))
(clojure.spec.alpha/fdef delete-domain :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/delete-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/delete-domain-response))

(clojure.core/defn delete-suggester ([delete-suggester-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-suggester-request delete-suggester-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/delete-suggester-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/delete-suggester-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteSuggesterResult", :http.request.configuration/action "DeleteSuggester", :http.request.configuration/output-deser-fn response-delete-suggester-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-suggester :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/delete-suggester-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/delete-suggester-response))

(clojure.core/defn describe-availability-options ([describe-availability-options-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-availability-options-request describe-availability-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/describe-availability-options-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/describe-availability-options-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAvailabilityOptionsResult", :http.request.configuration/action "DescribeAvailabilityOptions", :http.request.configuration/output-deser-fn response-describe-availability-options-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception, "DisabledOperationException" :portkey.aws.cloudsearch/disabled-operation-exception}})))))
(clojure.spec.alpha/fdef describe-availability-options :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-availability-options-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-availability-options-response))

(clojure.core/defn describe-expressions ([describe-expressions-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-expressions-request describe-expressions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/describe-expressions-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/describe-expressions-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeExpressionsResult", :http.request.configuration/action "DescribeExpressions", :http.request.configuration/output-deser-fn response-describe-expressions-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-expressions :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-expressions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-expressions-response))

(clojure.core/defn describe-suggesters ([describe-suggesters-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-suggesters-request describe-suggesters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearch/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearch/describe-suggesters-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearch/describe-suggesters-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeSuggestersResult", :http.request.configuration/action "DescribeSuggesters", :http.request.configuration/output-deser-fn response-describe-suggesters-response, :http.request.spec/error-spec {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-suggesters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-suggesters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-suggesters-response))
