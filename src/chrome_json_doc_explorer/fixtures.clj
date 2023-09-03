(ns chrome-json-doc-explorer.fixtures)

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
