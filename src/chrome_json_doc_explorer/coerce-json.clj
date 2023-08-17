(ns chrome-json-doc-explorer.core
  (:require [clojure.data.json :as json])
  )


(comment
  ;; ----------------- a variable in the old json ----------------- ;;
  {"properties" [],
   "returns" nil,
   "optional" nil,
   "availability" {"partial" nil, "scheduled" nil, "version" 46},
   "id" "property-TAB_ID_NONE",
   "name" "TAB_ID_NONE",
   "value" "-1",
   "functions" [],
   "parameters" [],
   "description" "An ID that represents the absence of a browser tab."}

  ;; ----------------- a variable in the new json ----------------- ;;
  {"sources" [{"fileName" "", "line" 29647, "character" 17}],
   "_name" "chrome.tabs.TAB_ID_NONE",
   "_feature" {"channel" "stable", "since" "Chrome 46"},
   "id" 9349,
   "flags" {"isExternal" true, "isConst" true},
   "kindString" "Variable",
   "name" "TAB_ID_NONE",
   "_pageId" "property-TAB_ID_NONE",
   "kind" 32,
   "type" {"type" "literal", "value" -1},
   "_comment" "An ID that represents the absence of a browser tab.",
   "comment"
   {"shortText" "An ID that represents the absence of a browser tab.",
    "tags" [{"tag" "since", "text" "Chrome 46\n"}]},
   "_pageHref" "tabs"}

  {"sources" [{"fileName" "", "line" 29640, "character" 17}],
   "_name" "chrome.tabs.MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND",
   "_feature" {"channel" "stable", "since" "Chrome 92"},
   "id" 9348,
   "flags" {"isExternal" true, "isConst" true},
   "kindString" "Variable",
   "name" "MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND",
   "_pageId" "property-MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND",
   "kind" 32,
   "type" {"type" "literal", "value" 2},
   "_comment"
   "The maximum number of times that [`captureVisibleTab`](#method-captureVisibleTab) can be called per second. [`captureVisibleTab`](#method-captureVisibleTab) is expensive and should not be called too often.",
   "comment"
   {"shortText"
    "The maximum number of times that {@link captureVisibleTab} can be called per second. {@link captureVisibleTab} is expensive and should not be called too often.",
    "tags" [{"tag" "since", "text" "Chrome 92\n"}]},
   "_pageHref" "tabs"}
  )

(comment
  ;; ----------------- a function in the old json ----------------- ;;
  {"availability" nil,
   "callback"
   {"name" "callback",
    "optional" false,
    "parameters"
    [{"properties" [],
      "returns" nil,
      "parentName" "callback",
      "optional" true,
      "availability" nil,
      "id" "property-callback-tab",
      "name" "tab",
      "functions" [],
      "last" true,
      "link" {"name" "Tab", "ref" "tabs.Tab", "text" "Tab"},
      "is_object" false,
      "parameters" [],
      "description" nil}],
    "simple_type" {"simple_type" "function"}},
   "description"
   "Gets the tab that this script call is being made from. May be undefined if called from a non-tab context (for example, a background page or popup view).",
   "id" "method-getCurrent",
   "name" "getCurrent",
   "parameters"
   [{"parentName" "getCurrent",
     "optional" false,
     "simple_type" "function",
     "id" "property-getCurrent-callback",
     "name" "callback",
     "asFunction"
     {"name" "callback",
      "optional" false,
      "parameters"
      [{"properties" [],
        "returns" nil,
        "parentName" "callback",
        "optional" true,
        "availability" nil,
        "id" "property-callback-tab",
        "name" "tab",
        "functions" [],
        "last" true,
        "link" {"name" "Tab", "ref" "tabs.Tab", "text" "Tab"},
        "is_object" false,
        "parameters" [],
        "description" nil}],
      "simple_type" {"simple_type" "function"}},
     "isCallback" true,
     "last" true,
     "description" nil}],
   "returns" nil}

  ;; ----------------- a function in the new json ----------------- ;;
  {"sources" [{"fileName" "", "line" 29930, "character" 20}],
   "_name" "chrome.tabs.getCurrent",
   "signatures" [],
   "_feature" {"channel" "stable"},
   "id" 8884,
   "flags" {"isExternal" true},
   "kindString" "Function",
   "name" "getCurrent",
   "_pageId" "method-getCurrent",
   "_method"
   {"parameters"
    [{"_name" "chrome.tabs.getCurrent.callback",
      "_feature" {"channel" "stable"},
      "id" 8887,
      "flags" {"isExternal" true, "isOptional" true},
      "kindString" "Parameter",
      "name" "callback",
      "_pageId" "method-getCurrent-callback",
      "_method"
      {"parameters"
       [{"_name" "chrome.tabs.getCurrent.callback.tab",
         "_feature" {"channel" "stable"},
         "id" 8890,
         "flags" {"isExternal" true, "isOptional" true},
         "kindString" "Parameter",
         "name" "tab",
         "_pageId" "type-getCurrent-callback-tab",
         "kind" 32768,
         "type"
         {"type" "reference",
          "id" 9318,
          "qualifiedName" "chrome.tabs.Tab",
          "package" "chrome-types",
          "name" "Tab",
          "_href" "#type-Tab"},
         "_pageHref" "tabs"}]},
      "kind" 32768,
      "type"
      {"type" "reflection",
       "declaration"
       {"id" 8888,
        "name" "__type",
        "kind" 65536,
        "kindString" "Type literal",
        "flags" {"isExternal" true},
        "signatures" []}},
      "_pageHref" "tabs"}],
    "return"
    {"_name" "chrome.tabs.getCurrent.return",
     "_feature" {"channel" "stable", "since" "Chrome 88"},
     "id" -1,
     "flags" {},
     "name" "return",
     "_pageId" "type-getCurrent-return",
     "kind" 32768,
     "type"
     {"type" "reference",
      "typeArguments"
      [{"type" "union",
        "types"
        [{"type" "reference",
          "id" 9318,
          "qualifiedName" "chrome.tabs.Tab",
          "package" "chrome-types",
          "name" "Tab",
          "_href" "#type-Tab"}
         {"type" "intrinsic", "name" "undefined"}]}],
      "qualifiedName" "Promise",
      "package" "typescript",
      "name" "Promise"},
     "comment" {"tags" [{"tag" "since", "text" "Chrome 88"}]},
     "_pageHref" "tabs"},
    "isReturnsAsync" true},
   "kind" 64,
   "_comment"
   "Gets the tab that this script call is being made from. May be undefined if called from a non-tab context (for example, a background page or popup view).",
   "comment"
   {"shortText"
    "Gets the tab that this script call is being made from. May be undefined if called from a non-tab context (for example, a background page or popup view).",
    "tags" [{"tag" "chrome-returns-extra", "text" "since Chrome 88\n"}]},
   "_pageHref" "tabs"}
  )

(let  [data {"sources" [{"fileName" "", "line" 29640, "character" 17}],
             "_name" "chrome.tabs.MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND",
             "_feature" {"channel" "stable", "since" "Chrome 92"},
             "id" 9348,
             "flags" {"isExternal" true, "isConst" true},
             "kindString" "Variable",
             "name" "MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND",
             "_pageId" "property-MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND",
             "kind" 32,
             "type" {"type" "literal", "value" 2},
             "_comment"
             "The maximum number of times that [`captureVisibleTab`](#method-captureVisibleTab) can be called per second. [`captureVisibleTab`](#method-captureVisibleTab) is expensive and should not be called too often.",
             "comment"
             {"shortText"
              "The maximum number of times that {@link captureVisibleTab} can be called per second. {@link captureVisibleTab} is expensive and should not be called too often.",
              "tags" [{"tag" "since", "text" "Chrome 92\n"}]},
             "_pageHref" "tabs"}]
  ;; (get-description data)
  (coerce-type data)
  )

(defn get-version [{{version-str "since"} "_feature"}]
  (Integer/parseInt (last (clojure.string/split version-str #" "))))

(defn get-id [{id "_pageId"}] id)

(defn get-name [{name "_name"}] (last (clojure.string/split name #"\.")))

(defn get-value [{{v"value"} "type"}] v)

(defn get-description [{description "_comment"}] description)


(defmulti coerce-type
  "Takes in a new json type item and convert it back into the old format"
  (fn [{kind-string "kindString"
        {type "type"} "type"}]
    (cond (= kind-string "Function") :function
          (and (= kind-string "Variable") (= type "literal")) :property
          (and (= kind-string "Variable") (= type "reference")) :callback)
    ))

(defmethod coerce-type :property [item]
  (let [version (get-version item)
        id (get-id item)
        name (get-name item)
        v (get-value item)
        description (get-description item)]
    {"availability" {"version" version}
     "id" id
     "name" name
     "value" v
     "description" description
     }))

(defmethod coerce-type :function [item]
  :function
  )

(defmethod coerce-type :callback [item]
  :callback
  )
