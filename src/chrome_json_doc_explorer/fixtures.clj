(ns chrome-json-doc-explorer.fixtures)

(def tabs-executeScript
  {"sources" [{"fileName" "", "line" 31034, "character" 20}],
   "_name" "chrome.tabs.executeScript",
   "signatures" [],
   "_feature"
   {"channel" "stable",
    "deprecated"
    {"value"
     "Replaced by [`scripting.executeScript`](../scripting/#method-executeScript) in Manifest V3.",
     "since" "Chrome 91"},
    "maxManifest" "MV2"},
   "id" 9182,
   "flags" {"isExternal" true},
   "kindString" "Function",
   "name" "executeScript",
   "_pageId" "method-executeScript",
   "_method"
   {"parameters"
    [{"_name" "chrome.tabs.executeScript.tabId",
      "_feature" {"channel" "stable"},
      "id" 9184,
      "flags" {"isExternal" true, "isOptional" true},
      "kindString" "Parameter",
      "name" "tabId",
      "_pageId" "type-executeScript-tabId",
      "kind" 32768,
      "type" {"type" "intrinsic", "name" "number"},
      "_comment"
      "The ID of the tab in which to run the script; defaults to the active tab of the current window.",
      "comment"
      {"shortText"
       "The ID of the tab in which to run the script; defaults to the active tab of the current window."},
      "_pageHref" "tabs"}
     {"_name" "chrome.tabs.executeScript.details",
      "_feature" {"channel" "stable"},
      "id" 9185,
      "flags" {"isExternal" true},
      "kindString" "Parameter",
      "name" "details",
      "_pageId" "type-executeScript-details",
      "kind" 32768,
      "type"
      {"type" "reference",
       "id" 4028,
       "qualifiedName" "chrome.extensionTypes.InjectDetails",
       "package" "chrome-types",
       "name" "InjectDetails",
       "_href" "../extensionTypes/#type-InjectDetails"},
      "_comment"
      "Details of the script to run. Either the code or the file property must be set, but both may not be set at the same time.",
      "comment"
      {"shortText"
       "Details of the script to run. Either the code or the file property must be set, but both may not be set at the same time."},
      "_pageHref" "tabs"}
     {"_name" "chrome.tabs.executeScript.callback",
      "_feature" {"channel" "stable"},
      "id" 9197,
      "flags" {"isExternal" true, "isOptional" true},
      "kindString" "Parameter",
      "name" "callback",
      "_pageId" "method-executeScript-callback",
      "_method"
      {"parameters"
       [{"_name" "chrome.tabs.executeScript.callback.result",
         "_feature" {"channel" "stable"},
         "id" 9200,
         "flags" {"isExternal" true, "isOptional" true},
         "kindString" "Parameter",
         "name" "result",
         "_pageId" "type-executeScript-callback-result",
         "kind" 32768,
         "type"
         {"type" "array", "elementType" {"type" "intrinsic", "name" "any"}},
         "_comment" "The result of the script in every injected frame.",
         "comment"
         {"shortText" "The result of the script in every injected frame.\n"},
         "_pageHref" "tabs"}]},
      "kind" 32768,
      "type"
      {"type" "reflection",
       "declaration"
       {"id" 9198,
        "name" "__type",
        "kind" 65536,
        "kindString" "Type literal",
        "flags" {"isExternal" true},
        "signatures" []}},
      "comment" {},
      "_pageHref" "tabs"}],
    "return"
    {"_name" "chrome.tabs.executeScript.return",
     "_feature" {"channel" "stable", "since" "Chrome 88"},
     "id" -1,
     "flags" {},
     "name" "return",
     "_pageId" "type-executeScript-return",
     "kind" 32768,
     "type"
     {"type" "reference",
      "typeArguments"
      [{"type" "union",
        "types"
        [{"type" "array", "elementType" {"type" "intrinsic", "name" "any"}}
         {"type" "intrinsic", "name" "undefined"}]}],
      "qualifiedName" "Promise",
      "package" "typescript",
      "name" "Promise"},
     "comment" {"tags" [{"tag" "since", "text" "Chrome 88"}]},
     "_pageHref" "tabs"},
    "isReturnsAsync" true},
   "kind" 64,
   "_comment"
   "Injects JavaScript code into a page. For details, see the [programmatic injection](https://developer.chrome.com/docs/extensions/content_scripts#pi) section of the content scripts doc.",
   "comment"
   {"shortText"
    "Injects JavaScript code into a page. For details, see the [programmatic injection](https://developer.chrome.com/docs/extensions/content_scripts#pi) section of the content scripts doc.",
    "tags"
    [{"tag" "chrome-returns-extra", "text" "since Chrome 88"}
     {"tag" "deprecated",
      "text" "Replaced by {@link scripting.executeScript} in Manifest V3."}
     {"tag" "chrome-max-manifest", "text" "MV2"}
     {"tag" "chrome-deprecated-since", "text" "Chrome 91\n"}]},
   "_pageHref" "tabs"})

(def tabs-get-fixture
  {"sources" [{"fileName" "", "line" 29908, "character" 20}],
   "_name" "chrome.tabs.get",
   "signatures" [],
   "_feature" {"channel" "stable"},
   "id" 8875,
   "flags" {"isExternal" true},
   "kindString" "Function",
   "name" "get",
   "_pageId" "method-get",
   "_method"
   {"parameters"
    [{"_name" "chrome.tabs.get.tabId",
      "_feature" {"channel" "stable"},
      "id" 8877,
      "flags" {"isExternal" true},
      "kindString" "Parameter",
      "name" "tabId",
      "_pageId" "type-get-tabId",
      "kind" 32768,
      "type" {"type" "intrinsic", "name" "number"},
      "_pageHref" "tabs"}
     {"_name" "chrome.tabs.get.callback",
      "_feature" {"channel" "stable"},
      "id" 8880,
      "flags" {"isExternal" true, "isOptional" true},
      "kindString" "Parameter",
      "name" "callback",
      "_pageId" "method-get-callback",
      "_method"
      {"parameters"
       [{"_name" "chrome.tabs.get.callback.tab",
         "_feature" {"channel" "stable"},
         "id" 8883,
         "flags" {"isExternal" true},
         "kindString" "Parameter",
         "name" "tab",
         "_pageId" "type-get-callback-tab",
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
       {"id" 8881,
        "name" "__type",
        "kind" 65536,
        "kindString" "Type literal",
        "flags" {"isExternal" true},
        "signatures" []}},
      "_pageHref" "tabs"}],
    "return"
    {"_name" "chrome.tabs.get.return",
     "_feature" {"channel" "stable", "since" "Chrome 88"},
     "id" -1,
     "flags" {},
     "name" "return",
     "_pageId" "type-get-return",
     "kind" 32768,
     "type"
     {"type" "reference",
      "typeArguments"
      [{"type" "reference",
        "id" 9318,
        "qualifiedName" "chrome.tabs.Tab",
        "package" "chrome-types",
        "name" "Tab",
        "_href" "#type-Tab"}],
      "qualifiedName" "Promise",
      "package" "typescript",
      "name" "Promise"},
     "comment" {"tags" [{"tag" "since", "text" "Chrome 88"}]},
     "_pageHref" "tabs"},
    "isReturnsAsync" true},
   "kind" 64,
   "_comment" "Retrieves details about the specified tab.",
   "comment"
   {"shortText" "Retrieves details about the specified tab.",
    "tags" [{"tag" "chrome-returns-extra", "text" "since Chrome 88\n"}]},
   "_pageHref" "tabs"}
  )

(def tabs-getAllInWindow-fixture
  {"sources" [{"fileName" "", "line" 30107, "character" 20}],
   "_name" "chrome.tabs.getAllInWindow",
   "signatures" [],
   "_feature"
   {"channel" "stable",
    "deprecated"
    {"value" "Please use [`tabs.query`](#method-query) `{windowId: windowId}`."},
    "maxManifest" "MV2"},
   "id" 8938,
   "flags" {"isExternal" true},
   "kindString" "Function",
   "name" "getAllInWindow",
   "_pageId" "method-getAllInWindow",
   "_method"
   {"parameters"
    [{"_name" "chrome.tabs.getAllInWindow.windowId",
      "_feature" {"channel" "stable"},
      "id" 8942,
      "flags" {"isExternal" true, "isOptional" true},
      "kindString" "Parameter",
      "name" "windowId",
      "_pageId" "type-getAllInWindow-windowId",
      "kind" 32768,
      "type" {"type" "intrinsic", "name" "number"},
      "_comment"
      "Defaults to the [current window](https://developer.chrome.com/docs/extensions/reference/windows/#current-window).",
      "comment"
      {"shortText"
       "Defaults to the [current window](https://developer.chrome.com/docs/extensions/reference/windows/#current-window)."},
      "_pageHref" "tabs"}
     {"_name" "chrome.tabs.getAllInWindow.callback",
      "_feature" {"channel" "stable"},
      "id" 8943,
      "flags" {"isExternal" true, "isOptional" true},
      "kindString" "Parameter",
      "name" "callback",
      "_pageId" "method-getAllInWindow-callback",
      "_method"
      {"parameters"
       [{"_name" "chrome.tabs.getAllInWindow.callback.tabs",
         "_feature" {"channel" "stable"},
         "id" 8946,
         "flags" {"isExternal" true},
         "kindString" "Parameter",
         "name" "tabs",
         "_pageId" "type-getAllInWindow-callback-tabs",
         "kind" 32768,
         "type"
         {"type" "array",
          "elementType"
          {"type" "reference",
           "id" 9318,
           "qualifiedName" "chrome.tabs.Tab",
           "package" "chrome-types",
           "name" "Tab",
           "_href" "#type-Tab"}},
         "_pageHref" "tabs"}]},
      "kind" 32768,
      "type"
      {"type" "reflection",
       "declaration"
       {"id" 8944,
        "name" "__type",
        "kind" 65536,
        "kindString" "Type literal",
        "flags" {"isExternal" true},
        "signatures" []}},
      "_pageHref" "tabs"}],
    "return"
    {"_name" "chrome.tabs.getAllInWindow.return",
     "_feature" {"channel" "stable", "since" "Chrome 88"},
     "id" -1,
     "flags" {},
     "name" "return",
     "_pageId" "type-getAllInWindow-return",
     "kind" 32768,
     "type"
     {"type" "reference",
      "typeArguments"
      [{"type" "array",
        "elementType"
        {"type" "reference",
         "id" 9318,
         "qualifiedName" "chrome.tabs.Tab",
         "package" "chrome-types",
         "name" "Tab",
         "_href" "#type-Tab"}}],
      "qualifiedName" "Promise",
      "package" "typescript",
      "name" "Promise"},
     "comment" {"tags" [{"tag" "since", "text" "Chrome 88"}]},
     "_pageHref" "tabs"},
    "isReturnsAsync" true},
   "kind" 64,
   "_comment" "Gets details about all tabs in the specified window.",
   "comment"
   {"shortText" "Gets details about all tabs in the specified window.",
    "tags"
    [{"tag" "chrome-returns-extra", "text" "since Chrome 88"}
     {"tag" "deprecated",
      "text" "Please use {@link tabs.query} `{windowId: windowId}`."}
     {"tag" "chrome-max-manifest", "text" "MV2\n"}]},
   "_pageHref" "tabs"})

(def tabs-getCurrent-fixture
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
   "_pageHref" "tabs"})
