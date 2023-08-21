(ns chrome-json-doc-explorer.coerce-json
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

;; ------------------- function with a callback in the old json ----------------------------------------
(comment {
  "availability": {
                   "partial": null,
                   "scheduled": null,
                   "version": 38
                   },
  "callback": {
               "name": "callback",
               "optional": false,
               "parameters": [
                              {
                               "availability": null,
                               "description": "The tab's current zoom factor.",
                               "functions": [],
                               "id": "property-callback-zoomFactor",
                               "is_object": false,
                               "last": true,
                               "name": "zoomFactor",
                               "optional": null,
                               "parameters": [],
                               "parentName": "callback",
                               "properties": [],
                               "returns": null,
                               "simple_type": "double"
                               }
                              ],
               "simple_type": {
                               "simple_type": "function"
                               }
               },
  "description": "Gets the current zoom factor of a specified tab.",
  "id": "method-getZoom",
  "name": "getZoom",
  "parameters": [
                 {
                  "availability": null,
                  "description": "The ID of the tab to get the current zoom factor from; defaults to the active tab of the current window.",
                  "functions": [],
                  "id": "property-getZoom-tabId",
                  "is_object": false,
                  "name": "tabId",
                  "optional": true,
                  "parameters": [],
                  "parentName": "getZoom",
                  "properties": [],
                  "returns": null,
                  "simple_type": "integer"
                  },
                 {
                  "asFunction": {
                                 "name": "callback",
                                 "optional": false,
                                 "parameters": [
                                                {
                                                 "availability": null,
                                                 "description": "The tab's current zoom factor.",
                                                 "functions": [],
                                                 "id": "property-callback-zoomFactor",
                                                 "is_object": false,
                                                 "last": true,
                                                 "name": "zoomFactor",
                                                 "optional": null,
                                                 "parameters": [],
                                                 "parentName": "callback",
                                                 "properties": [],
                                                 "returns": null,
                                                 "simple_type": "double"
                                                 }
                                                ],
                                 "simple_type": {
                                                 "simple_type": "function"
                                                 }
                                 },
                  "description": "Called with the tab's current zoom factor after it has been fetched.",
                  "id": "property-getZoom-callback",
                  "isCallback": true,
                  "last": true,
                  "name": "callback",
                  "optional": false,
                  "parentName": "getZoom",
                  "simple_type": "function"
                  }
                 ],
  "returns": null
  })


; ---- new event ---
(comment
  (def new-tab-on-activated-event
    {"sources" [{"fileName" "", "line" 29780, "character" 17}],
     "_name" "chrome.tabs.onActivated",
     "_feature" {"channel" "stable"},
     "id" 9394,
     "flags" {"isExternal" true, "isConst" true},
     "kindString" "Variable",
     "_event" {},
     "name" "onActivated",
     "_pageId" "event-onActivated",
     "_method"
     {"parameters"
      [{"_name" "chrome.tabs.onActivated.callback",
        "_feature" {"channel" "stable"},
        "id" -1,
        "flags" {},
        "name" "callback",
        "_pageId" "method-onActivated-callback",
        "_method"
        {"parameters"
         [{"_type"
           {"properties"
            [{"sources" [{"fileName" "", "line" 29786, "character" 8}],
              "_name" "chrome.tabs.onActivated.callback.activeInfo.tabId",
              "_feature" {"channel" "stable"},
              "id" 9399,
              "flags" {"isExternal" true},
              "kindString" "Property",
              "name" "tabId",
              "_pageId" "property-onActivated-callback-activeInfo-tabId",
              "kind" 1024,
              "type" {"type" "intrinsic", "name" "number"},
              "_comment" "The ID of the tab that has become active.",
              "comment" {"shortText" "The ID of the tab that has become active."},
              "_pageHref" "tabs"}
             {"sources" [{"fileName" "", "line" 29791, "character" 8}],
              "_name" "chrome.tabs.onActivated.callback.activeInfo.windowId",
              "_feature" {"channel" "stable"},
              "id" 9400,
              "flags" {"isExternal" true},
              "kindString" "Property",
              "name" "windowId",
              "_pageId" "property-onActivated-callback-activeInfo-windowId",
              "kind" 1024,
              "type" {"type" "intrinsic", "name" "number"},
              "_comment" "The ID of the window the active tab changed inside of.",
              "comment"
              {"shortText"
               "The ID of the window the active tab changed inside of."},
              "_pageHref" "tabs"}]},
           "_name" "chrome.tabs.onActivated.callback.activeInfo",
           "_feature" {"channel" "stable"},
           "id" 9397,
           "flags" {"isExternal" true},
           "kindString" "Parameter",
           "name" "activeInfo",
           "_pageId" "type-onActivated-callback-activeInfo",
           "kind" 32768,
           "type"
           {"type" "reflection",
            "declaration"
            {"id" 9398,
             "name" "__type",
             "kind" 65536,
             "kindString" "Type literal",
             "flags" {"isExternal" true},
             "children" [],
             "groups"
             [{"title" "Properties", "kind" 1024, "children" [9399 9400]}],
             "sources" [{"fileName" "", "line" 29781, "character" 18}]}},
           "_pageHref" "tabs"}]},
        "kind" 32768,
        "type"
        {"type" "reflection",
         "declaration"
         {"id" 9395,
          "name" "__type",
          "kind" 65536,
          "kindString" "Type literal",
          "flags" {"isExternal" true},
          "sources" [{"fileName" "", "line" 29780, "character" 43}],
          "signatures" []}},
        "_pageHref" "tabs"}]},
     "kind" 32,
     "type"
     {"type" "reference",
      "id" 3837,
      "typeArguments"
      [{"type" "reflection",
        "declaration"
        {"id" 9395,
         "name" "__type",
         "kind" 65536,
         "kindString" "Type literal",
         "flags" {"isExternal" true},
         "sources" [{"fileName" "", "line" 29780, "character" 43}],
         "signatures" []}}],
      "qualifiedName" "chrome.events.Event",
      "package" "chrome-types",
      "name" "events.Event"},
     "_comment"
     "Fires when the active tab in a window changes. Note that the tab's URL may not be set at the time this event fired, but you can listen to onUpdated events so as to be notified when a URL is set.",
     "comment"
     {"shortText"
      "Fires when the active tab in a window changes. Note that the tab's URL may not be set at the time this event fired, but you can listen to onUpdated events so as to be notified when a URL is set."},
     "_pageHref" "tabs"}
    ))

(let [callback (first (get-in new-tab-on-activated-event ["_method" "parameters"]))
      parameter (first (get-in callback ["_method" "parameters"]))
      ]
  (get parameter "kindString")
  )

; ---- old event
(comment
 {
  "actions": [],
  "availability": null,
  "byName": {
             "addListener": {
                             "callback": {
                                          "availability": null,
                                          "callback": null,
                                          "description": null,
                                          "id": "method-onActivated-callback",
                                          "name": "callback",
                                          "parameters": [
                                                         {
                                                          "availability": null,
                                                          "description": null,
                                                          "functions": [],
                                                          "id": "property-onActivated-activeInfo",
                                                          "is_object": true,
                                                          "last": true,
                                                          "name": "activeInfo",
                                                          "optional": null,
                                                          "parameters": [],
                                                          "parentName": "onActivated",
                                                          "properties": [
                                                                         {
                                                                          "availability": null,
                                                                          "description": "The ID of the tab that has become active.",
                                                                          "functions": [],
                                                                          "id": "property-activeInfo-tabId",
                                                                          "is_object": false,
                                                                          "name": "tabId",
                                                                          "optional": null,
                                                                          "parameters": [],
                                                                          "parentName": "activeInfo",
                                                                          "properties": [],
                                                                          "returns": null,
                                                                          "simple_type": "integer"
                                                                          },
                                                                         {
                                                                          "availability": null,
                                                                          "description": "The ID of the window the active tab changed inside of.",
                                                                          "functions": [],
                                                                          "id": "property-activeInfo-windowId",
                                                                          "is_object": false,
                                                                          "name": "windowId",
                                                                          "optional": null,
                                                                          "parameters": [],
                                                                          "parentName": "activeInfo",
                                                                          "properties": [],
                                                                          "returns": null,
                                                                          "simple_type": "integer"
                                                                          }
                                                                         ],
                                                          "returns": null,
                                                          "simple_type": "object"
                                                          }
                                                         ],
                                          "parentName": "onActivated",
                                          "returns": null
                                          },
                             "name": "addListener",
                             "parameters": [
                                            {
                                             "asFunction": {
                                                            "availability": null,
                                                            "callback": null,
                                                            "description": null,
                                                            "id": "method-onActivated-callback",
                                                            "name": "callback",
                                                            "parameters": [
                                                                           {
                                                                            "availability": null,
                                                                            "description": null,
                                                                            "functions": [],
                                                                            "id": "property-onActivated-activeInfo",
                                                                            "is_object": true,
                                                                            "last": true,
                                                                            "name": "activeInfo",
                                                                            "optional": null,
                                                                            "parameters": [],
                                                                            "parentName": "onActivated",
                                                                            "properties": [
                                                                                           {
                                                                                            "availability": null,
                                                                                            "description": "The ID of the tab that has become active.",
                                                                                            "functions": [],
                                                                                            "id": "property-activeInfo-tabId",
                                                                                            "is_object": false,
                                                                                            "name": "tabId",
                                                                                            "optional": null,
                                                                                            "parameters": [],
                                                                                            "parentName": "activeInfo",
                                                                                            "properties": [],
                                                                                            "returns": null,
                                                                                            "simple_type": "integer"
                                                                                            },
                                                                                           {
                                                                                            "availability": null,
                                                                                            "description": "The ID of the window the active tab changed inside of.",
                                                                                            "functions": [],
                                                                                            "id": "property-activeInfo-windowId",
                                                                                            "is_object": false,
                                                                                            "name": "windowId",
                                                                                            "optional": null,
                                                                                            "parameters": [],
                                                                                            "parentName": "activeInfo",
                                                                                            "properties": [],
                                                                                            "returns": null,
                                                                                            "simple_type": "integer"
                                                                                            }
                                                                                           ],
                                                                            "returns": null,
                                                                            "simple_type": "object"
                                                                            }
                                                                           ],
                                                            "parentName": "onActivated",
                                                            "returns": null
                                                            },
                                             "description": null,
                                             "id": "property-onActivated-callback",
                                             "isCallback": true,
                                             "last": true,
                                             "name": "callback",
                                             "optional": false,
                                             "parentName": "onActivated",
                                             "simple_type": "function"
                                             }
                                            ]
                             },
             "addRules": {
                          "availability": null,
                          "callback": {
                                       "name": "callback",
                                       "optional": true,
                                       "parameters": [
                                                      {
                                                       "array": {
                                                                 "availability": null,
                                                                 "description": null,
                                                                 "events": [],
                                                                 "functions": [],
                                                                 "id": "type-rules-rulesType",
                                                                 "is_object": false,
                                                                 "link": {
                                                                          "name": "Rule",
                                                                          "ref": "events.Rule",
                                                                          "text": "Rule"
                                                                          },
                                                                 "name": "rulesType",
                                                                 "properties": []
                                                                 },
                                                       "availability": null,
                                                       "description": "Rules that were registered, the optional parameters are filled with values.",
                                                       "functions": [],
                                                       "id": "property-callback-rules",
                                                       "is_object": false,
                                                       "last": true,
                                                       "name": "rules",
                                                       "optional": null,
                                                       "parameters": [],
                                                       "parentName": "callback",
                                                       "properties": [],
                                                       "returns": null
                                                       }
                                                      ],
                                       "simple_type": {
                                                       "simple_type": "function"
                                                       }
                                       },
                          "description": "Registers rules to handle events.",
                          "id": "method-Event-addRules",
                          "name": "addRules",
                          "parameters": [
                                         {
                                          "array": {
                                                    "availability": null,
                                                    "description": null,
                                                    "events": [],
                                                    "functions": [],
                                                    "id": "type-rules-rulesType",
                                                    "is_object": false,
                                                    "link": {
                                                             "name": "Rule",
                                                             "ref": "events.Rule",
                                                             "text": "Rule"
                                                             },
                                                    "name": "rulesType",
                                                    "properties": []
                                                    },
                                          "availability": null,
                                          "description": "Rules to be registered. These do not replace previously registered rules.",
                                          "functions": [],
                                          "id": "property-addRules-rules",
                                          "is_object": false,
                                          "name": "rules",
                                          "optional": null,
                                          "parameters": [],
                                          "parentName": "addRules",
                                          "properties": [],
                                          "returns": null
                                          },
                                         {
                                          "asFunction": {
                                                         "name": "callback",
                                                         "optional": true,
                                                         "parameters": [
                                                                        {
                                                                         "array": {
                                                                                   "availability": null,
                                                                                   "description": null,
                                                                                   "events": [],
                                                                                   "functions": [],
                                                                                   "id": "type-rules-rulesType",
                                                                                   "is_object": false,
                                                                                   "link": {
                                                                                            "name": "Rule",
                                                                                            "ref": "events.Rule",
                                                                                            "text": "Rule"
                                                                                            },
                                                                                   "name": "rulesType",
                                                                                   "properties": []
                                                                                   },
                                                                         "availability": null,
                                                                         "description": "Rules that were registered, the optional parameters are filled with values.",
                                                                         "functions": [],
                                                                         "id": "property-callback-rules",
                                                                         "is_object": false,
                                                                         "last": true,
                                                                         "name": "rules",
                                                                         "optional": null,
                                                                         "parameters": [],
                                                                         "parentName": "callback",
                                                                         "properties": [],
                                                                         "returns": null
                                                                         }
                                                                        ],
                                                         "simple_type": {
                                                                         "simple_type": "function"
                                                                         }
                                                         },
                                          "description": "Called with registered rules.",
                                          "id": "property-addRules-callback",
                                          "isCallback": true,
                                          "last": true,
                                          "name": "callback",
                                          "optional": true,
                                          "parentName": "addRules",
                                          "simple_type": "function"
                                          }
                                         ],
                          "parentName": "Event",
                          "returns": null
                          },
             "getRules": {
                          "availability": null,
                          "callback": {
                                       "name": "callback",
                                       "optional": false,
                                       "parameters": [
                                                      {
                                                       "array": {
                                                                 "availability": null,
                                                                 "description": null,
                                                                 "events": [],
                                                                 "functions": [],
                                                                 "id": "type-rules-rulesType",
                                                                 "is_object": false,
                                                                 "link": {
                                                                          "name": "Rule",
                                                                          "ref": "events.Rule",
                                                                          "text": "Rule"
                                                                          },
                                                                 "name": "rulesType",
                                                                 "properties": []
                                                                 },
                                                       "availability": null,
                                                       "description": "Rules that were registered, the optional parameters are filled with values.",
                                                       "functions": [],
                                                       "id": "property-callback-rules",
                                                       "is_object": false,
                                                       "last": true,
                                                       "name": "rules",
                                                       "optional": null,
                                                       "parameters": [],
                                                       "parentName": "callback",
                                                       "properties": [],
                                                       "returns": null
                                                       }
                                                      ],
                                       "simple_type": {
                                                       "simple_type": "function"
                                                       }
                                       },
                          "description": "Returns currently registered rules.",
                          "id": "method-Event-getRules",
                          "name": "getRules",
                          "parameters": [
                                         {
                                          "array": {
                                                    "availability": null,
                                                    "description": null,
                                                    "events": [],
                                                    "functions": [],
                                                    "id": "type-ruleIdentifiers-ruleIdentifiersType",
                                                    "is_object": false,
                                                    "name": "ruleIdentifiersType",
                                                    "properties": [],
                                                    "simple_type": "string"
                                                    },
                                          "availability": null,
                                          "description": "If an array is passed, only rules with identifiers contained in this array are returned.",
                                          "functions": [],
                                          "id": "property-getRules-ruleIdentifiers",
                                          "is_object": false,
                                          "name": "ruleIdentifiers",
                                          "optional": true,
                                          "parameters": [],
                                          "parentName": "getRules",
                                          "properties": [],
                                          "returns": null
                                          },
                                         {
                                          "asFunction": {
                                                         "name": "callback",
                                                         "optional": false,
                                                         "parameters": [
                                                                        {
                                                                         "array": {
                                                                                   "availability": null,
                                                                                   "description": null,
                                                                                   "events": [],
                                                                                   "functions": [],
                                                                                   "id": "type-rules-rulesType",
                                                                                   "is_object": false,
                                                                                   "link": {
                                                                                            "name": "Rule",
                                                                                            "ref": "events.Rule",
                                                                                            "text": "Rule"
                                                                                            },
                                                                                   "name": "rulesType",
                                                                                   "properties": []
                                                                                   },
                                                                         "availability": null,
                                                                         "description": "Rules that were registered, the optional parameters are filled with values.",
                                                                         "functions": [],
                                                                         "id": "property-callback-rules",
                                                                         "is_object": false,
                                                                         "last": true,
                                                                         "name": "rules",
                                                                         "optional": null,
                                                                         "parameters": [],
                                                                         "parentName": "callback",
                                                                         "properties": [],
                                                                         "returns": null
                                                                         }
                                                                        ],
                                                         "simple_type": {
                                                                         "simple_type": "function"
                                                                         }
                                                         },
                                          "description": "Called with registered rules.",
                                          "id": "property-getRules-callback",
                                          "isCallback": true,
                                          "last": true,
                                          "name": "callback",
                                          "optional": false,
                                          "parentName": "getRules",
                                          "simple_type": "function"
                                          }
                                         ],
                          "parentName": "Event",
                          "returns": null
                          },
             "hasListener": {
                             "availability": null,
                             "callback": {
                                          "name": "callback",
                                          "optional": false,
                                          "parameters": [],
                                          "simple_type": {
                                                          "simple_type": "function"
                                                          }
                                          },
                             "description": null,
                             "id": "method-Event-hasListener",
                             "name": "hasListener",
                             "parameters": [
                                            {
                                             "asFunction": {
                                                            "name": "callback",
                                                            "optional": false,
                                                            "parameters": [],
                                                            "simple_type": {
                                                                            "simple_type": "function"
                                                                            }
                                                            },
                                             "description": "Listener whose registration status shall be tested.",
                                             "id": "property-hasListener-callback",
                                             "isCallback": true,
                                             "last": true,
                                             "name": "callback",
                                             "optional": false,
                                             "parentName": "hasListener",
                                             "simple_type": "function"
                                             }
                                            ],
                             "parentName": "Event",
                             "returns": {
                                         "availability": null,
                                         "description": "True if <em>callback</em> is registered to the event.",
                                         "events": [],
                                         "functions": [],
                                         "id": "type-hasListener-hasListenerReturnType",
                                         "is_object": false,
                                         "name": "hasListenerReturnType",
                                         "properties": [],
                                         "simple_type": "boolean"
                                         }
                             },
             "hasListeners": {
                              "availability": null,
                              "callback": null,
                              "description": null,
                              "id": "method-Event-hasListeners",
                              "name": "hasListeners",
                              "parameters": [],
                              "parentName": "Event",
                              "returns": {
                                          "availability": null,
                                          "description": "True if any event listeners are registered to the event.",
                                          "events": [],
                                          "functions": [],
                                          "id": "type-hasListeners-hasListenersReturnType",
                                          "is_object": false,
                                          "name": "hasListenersReturnType",
                                          "properties": [],
                                          "simple_type": "boolean"
                                          }
                              },
             "removeListener": {
                                "availability": null,
                                "callback": {
                                             "name": "callback",
                                             "optional": false,
                                             "parameters": [],
                                             "simple_type": {
                                                             "simple_type": "function"
                                                             }
                                             },
                                "description": "Deregisters an event listener <em>callback</em> from an event.",
                                "id": "method-Event-removeListener",
                                "name": "removeListener",
                                "parameters": [
                                               {
                                                "asFunction": {
                                                               "name": "callback",
                                                               "optional": false,
                                                               "parameters": [],
                                                               "simple_type": {
                                                                               "simple_type": "function"
                                                                               }
                                                               },
                                                "description": "Listener that shall be unregistered.",
                                                "id": "property-removeListener-callback",
                                                "isCallback": true,
                                                "last": true,
                                                "name": "callback",
                                                "optional": false,
                                                "parentName": "removeListener",
                                                "simple_type": "function"
                                                }
                                               ],
                                "parentName": "Event",
                                "returns": null
                                },
             "removeRules": {
                             "availability": null,
                             "callback": {
                                          "name": "callback",
                                          "optional": true,
                                          "parameters": [],
                                          "simple_type": {
                                                          "simple_type": "function"
                                                          }
                                          },
                             "description": "Unregisters currently registered rules.",
                             "id": "method-Event-removeRules",
                             "name": "removeRules",
                             "parameters": [
                                            {
                                             "array": {
                                                       "availability": null,
                                                       "description": null,
                                                       "events": [],
                                                       "functions": [],
                                                       "id": "type-ruleIdentifiers-ruleIdentifiersType",
                                                       "is_object": false,
                                                       "name": "ruleIdentifiersType",
                                                       "properties": [],
                                                       "simple_type": "string"
                                                       },
                                             "availability": null,
                                             "description": "If an array is passed, only rules with identifiers contained in this array are unregistered.",
                                             "functions": [],
                                             "id": "property-removeRules-ruleIdentifiers",
                                             "is_object": false,
                                             "name": "ruleIdentifiers",
                                             "optional": true,
                                             "parameters": [],
                                             "parentName": "removeRules",
                                             "properties": [],
                                             "returns": null
                                             },
                                            {
                                             "asFunction": {
                                                            "name": "callback",
                                                            "optional": true,
                                                            "parameters": [],
                                                            "simple_type": {
                                                                            "simple_type": "function"
                                                                            }
                                                            },
                                             "description": "Called when rules were unregistered.",
                                             "id": "property-removeRules-callback",
                                             "isCallback": true,
                                             "last": true,
                                             "name": "callback",
                                             "optional": true,
                                             "parentName": "removeRules",
                                             "simple_type": "function"
                                             }
                                            ],
                             "parentName": "Event",
                             "returns": null
                             }
             },
  "conditions": [],
  "description": "Fires when the active tab in a window changes. Note that the tab's URL may not be set at the time this event fired, but you can listen to onUpdated events so as to be notified when a URL is set.",
  "filters": [],
  "id": "event-onActivated",
  "name": "onActivated",
  "properties": [],
  "supportsListeners": true,
  "supportsRules": false
  })


;; test example
(comment
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
    ))

;; test example
(let [callback-data (first (get-in new-tab-on-activated-event ["_method" "parameters"]))
      {kind-string "kindString"
       {type "type"} "type"
       name "name"} callback-data
      ]
  (coerce-type callback-data)
  ;; callback-data
  ;; (get-in callback-data ["_method" "parameters"])
  ;; (my-fn callback-data)
  )

(defn get-version [{{version-str "since"} "_feature"}]
  (Integer/parseInt (last (clojure.string/split version-str #" "))))

(defn get-id [{id "_pageId"}] id)

(defn get-name [{name "_name"}] (last (clojure.string/split name #"\.")))

(defn get-value [{{v"value"} "type"}] v)

(defn get-description [{description "_comment"}] description)

(defn get-event-callback [item]
  (let [params (get-in item ["_method" "parameters"])
        callback (->> params
                      (filter (fn [x] (= "callback" (get x "name"))))
                      first)]
    callback))

(defn type->simple_type [type]
  (let [t (get type "type")
        name (get type "name")
        declaration-name (get-in type ["declaration" "name"])]
    (cond (= "__type" declaration-name) "object"
          (= name "number") "integer"
          (= name "string") "string"
          (= name "any") "any"
          (= name "boolean" "boolean") "boolean"
          :else
          (str "UNKNOWN type: " type)
          )
    ))

(defn extract-parent-from-property-name
  "_name: example - chrome.tabs.onActivated.callback.activeInfo.tabId
  name: example - tabId
  returns: example - activeInfo"
  [_name name]
  (last (clojure.string/split (first (clojure.string/split _name (re-pattern name))) #"\."))
  )

(defn _name-in-property->id
  "convert property's _name in the new json to the old json's property's id
  example: _name - chrome.tabs.onActivated.callback.activeInfo.tabId, name - tabId
  returns: example - property-activeInfo-tabId"
  [_name name]
  (let [parent (extract-parent-from-property-name _name name)]
    (clojure.string/join #"-" ["property" parent name])
    ))

(defmulti coerce-type
  "Takes in a new json type item and convert it back into the old format"
  (fn [{kind-string "kindString"
        {type "type"} "type"
        name "name"}]
    (cond (= kind-string "Function") :function
          (and (= kind-string "Variable") (= type "literal")) :property-with-value
          (= kind-string "Property") :property
          (and (= kind-string "Variable") (= type "reference")) :event
          (= name "callback") :callback
          (= kind-string "Parameter") :parameter
          )
    ))

(defmethod coerce-type :property [item]
  (let [name (get item "name")
        simple-type (type->simple_type (get item "type"))
        description (get item "_comment")
        parent-name (extract-parent-from-property-name (get item "_name") name)
        id (_name-in-property->id (get item "_name") name)]
    {:description description
     :id id
     :name name
     :parent-name parent-name
     :simple-type simple-type
     }))

(defmethod coerce-type :property-with-value [item]
  (let [version (get-version item)
        id (get-id item)
        name (get-name item)
        v (get-value item)
        description (get-description item)]
    {:availability {:version version}
     :id id
     :name name
     :value v
     :description description
     }))

(defn _name-in-callback->id [_name]
  (let [[prefix suffix] (clojure.string/split _name #"callback")
        parent [(last (clojure.string/split prefix #"\."))]
        suffix (clojure.string/split suffix #"\.")
        ]
    (->> (concat ["property"] parent suffix)
         (remove #(empty? %))
         (clojure.string/join #"-")
         )
    ))

;; test example
(extract-parent-from-property-name  "chrome.tabs.onActivated.callback.activeInfo.tabId" "tabId")
;; test example
(_name-in-property->id "chrome.tabs.onActivated.callback.activeInfo.tabId" "tabId")


;; test example
(comment
  (type->simple_type {"type" "reflection",
                      "declaration"
                      {"id" 9398,
                       "name" "__type",
                       "kind" 65536,
                       "kindString" "Type literal",
                       "flags" {"isExternal" true},
                       "children" [],
                       "groups" [{"title" "Properties", "kind" 1024, "children" [9399 9400]}],
                       "sources" [{"fileName" "", "line" 29781, "character" 18}]}}
                     ))

(let [param {"_type"
             {"properties"
              [{"sources" [{"fileName" "", "line" 29786, "character" 8}],
                "_name" "chrome.tabs.onActivated.callback.activeInfo.tabId",
                "_feature" {"channel" "stable"},
                "id" 9399,
                "flags" {"isExternal" true},
                "kindString" "Property",
                "name" "tabId",
                "_pageId" "property-onActivated-callback-activeInfo-tabId",
                "kind" 1024,
                "type" {"type" "intrinsic", "name" "number"},
                "_comment" "The ID of the tab that has become active.",
                "comment" {"shortText" "The ID of the tab that has become active."},
                "_pageHref" "tabs"}
               {"sources" [{"fileName" "", "line" 29791, "character" 8}],
                "_name" "chrome.tabs.onActivated.callback.activeInfo.windowId",
                "_feature" {"channel" "stable"},
                "id" 9400,
                "flags" {"isExternal" true},
                "kindString" "Property",
                "name" "windowId",
                "_pageId" "property-onActivated-callback-activeInfo-windowId",
                "kind" 1024,
                "type" {"type" "intrinsic", "name" "number"},
                "_comment" "The ID of the window the active tab changed inside of.",
                "comment"
                {"shortText" "The ID of the window the active tab changed inside of."},
                "_pageHref" "tabs"}]},
             "_name" "chrome.tabs.onActivated.callback.activeInfo",
             "_feature" {"channel" "stable"},
             "id" 9397,
             "flags" {"isExternal" true},
             "kindString" "Parameter",
             "name" "activeInfo",
             "_pageId" "type-onActivated-callback-activeInfo",
             "kind" 32768,
             "type"
             {"type" "reflection",
              "declaration"
              {"id" 9398,
               "name" "__type",
               "kind" 65536,
               "kindString" "Type literal",
               "flags" {"isExternal" true},
               "children" [],
               "groups" [{"title" "Properties", "kind" 1024, "children" [9399 9400]}],
               "sources" [{"fileName" "", "line" 29781, "character" 18}]}},
             "_pageHref" "tabs"}]
  (first (get-in param ["_type" "properties"]))
  )

(defmethod coerce-type :parameter [item]
  (let [name (get item "name")
        id (_name-in-callback->id (get item "_name"))
        simple-type (type->simple_type (get item "type"))
        properties (get-in item ["_type" "properties"])

        ;; id (->> (clojure.string/split (get item "_pageId") #"-")
        ;;         ((juxt second last))
        ;;         (concat ["property"])
        ;;         (clojure.string/join #"-"))

        ;; parent-name ;; do we need this?
        ;; is_object ;; do we need this?
        ;; last ;; do we need this?
        ]
    {:id id
     :name name
     :simple-type simple-type
     :parameters (->> properties
                      (mapv coerce-type))
     }
    ))

;; TODO: to implement
(defmethod coerce-type :callback [item]
  (let [name (get item "name")
        id (get item "_pageId")
        ;; description
        ;; callback
        ;; availability
        parent-name  (-> id
                         (clojure.string/split #"-")
                         drop-last
                         last)
        parameters (get-in item ["_method" "parameters"])]
    {:name name
     :id id
     :parent-name parent-name
     :parameters (->> parameters
                      (mapv coerce-type))
     }
    ))

(defmethod coerce-type :event [item]
  (let [name (get-name item)
        version (get-version item)
        description (get-description item)
        id (get-id item)
        callback (coerce-type (get-event-callback item))]
    {:by-name
     {
      :availability {:version version}
      :id id
      :name name
      :add-listener {:callback callback}
      }
     }
    ))


(defmethod coerce-type :function [item]
  :function
  )
