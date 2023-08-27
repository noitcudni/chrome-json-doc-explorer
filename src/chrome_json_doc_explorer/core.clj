(ns chrome-json-doc-explorer.core
  (:require [clojure.data.json :as json]
            [clojure.core.async :refer [go chan <! >! put!]]
            )
  (:gen-class))

;;;;;;;;;;;;;;;;;;;;; exploring chrome-types.json, ie. the new api ;;;;;;;;;;;;;;;;;;;;;
(def chrome-types (json/read-str (slurp "/Users/lih/Documents/workspace/chrome-json-doc-explorer/resources/chrome-types.json")))
(keys chrome-types)

(keys (get chrome-types "runtime"))
(keys (get chrome-types "tabs"))

;; NOTES:
;; _type : has lots of stuff
;; recursive
;;   _type: has a list of properties
;;   kindString tells you what it is. Interface, namespace, Property
;; _feature : seems to have just meta data about stable api , since , and permission
;; groups: a general shape of the data

[{"title" "Interfaces", "kind" 256, "children" [9314 9318 9343]}
 {"title" "Type Aliases",
  "kind" 4194304,
  "children" [9313 9312 9347 9341 9342]}
 {"title" "Variables",
  "kind" 32,
  "children"
  [9348 9349 9394 9387 9423 9350 9415 9401 9408 9371 9431 9439 9380 9354 9444]}
 {"title" "Functions",
  "kind" 64,
  "children"
  [9171
   8891
   8947
   9162
   9287
   8972
   9182
   8875
   8938
   8884
   8929
   9252
   9278
   9304
   9296
   9133
   9024
   9201
   9094
   8981
   9111
   9125
   9218
   8910
   8899
   9235
   9261
   9154
   9039]}]

(-> chrome-types
    (get "tabs")
    (get "_type")
    (get "properties")
    (nth 0)

    ;; keys
    ;; (get "_feature")
    ;; (get "groups")
    ;; (get "_pageHref")

     )

(->> (-> chrome-types
         (get "tabs")
         (get "_type")
         (get "properties")
         )
     (filter #(= "Function" (get % "kindString")))
     ;; (map #(get % "name"))
     (filter #(= "getCurrent" (get % "name")))

     )

;; Variable is basically events in the old apis
;; Also includes properties
(-> (->> (-> chrome-types
             (get "tabs")
             (get "_type")
             (get "properties")
             )
         ;; (map #(get % "kindString"))
         (filter #(= "Variable" (get % "kindString")))
         (map #(get % "name"))
         ;; (filter #(= "getCurrent" (get % "name")))
         ))

(-> (->> (-> chrome-types
             (get "tabs")
             (get "_type")
             (get "properties")
             )
         ;; (map #(get % "kindString"))
         (filter #(= "Variable" (get % "kindString")))
         (filter #(= "MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND" (get % "name")))
         ;; first
         )
    ;; (get "type")
    )

(->> (-> chrome-types
         (get "tabs")
         (get "_type")
         (get "properties"))
     (filter #(= "Variable" (get % "kindString")))
     (filter #(= "onActivated" (get % "name")))
     )

(->> (-> chrome-types
         (get "tabs")
         (get "_type")
         (get "properties"))
     (filter #(= "Function" (get % "kindString")))
     first

     ;; (filter #(= "Variable" (get % "kindString")))
     ;; (filter #(= "onActivated" (get % "name")))
     )

;; extensionTypes/references
(->> (-> chrome-types
     (get "extensionTypes")
     (get-in ["_type" "properties"])
     )
     (filter (fn [x]
               (= "ImageDetails" (get x "name"))
               )))


(comment
  returns
  (["MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND" "literal"]
   ["TAB_ID_NONE" "literal"]
   ["onActivated" "reference"]
   ["onActiveChanged" "reference"]
   ["onAttached" "reference"]
   ["onCreated" "reference"]
   ["onDetached" "reference"]
   ["onHighlightChanged" "reference"]
   ["onHighlighted" "reference"]
   ["onMoved" "reference"]
   ["onRemoved" "reference"]
   ["onReplaced" "reference"]
   ["onSelectionChanged" "reference"]
   ["onUpdated" "reference"]
   ["onZoomChange" "reference"]))
(->> (-> chrome-types
         (get "tabs")
         (get "_type")
         (get "properties")
         )
     ;; (map #(get % "kindString"))
     (filter #(= "Variable" (get % "kindString")))
     (map (fn [x]
            [(get x "name") (get (get x "type") "type")]
            ))
     )

;; All fucntions
(->> (-> chrome-types
         (get "tabs")
         (get "_type")
         (get "properties")
         )
     ;; (map #(get % "kindString"))
     (filter #(= "Function" (get % "kindString")))
     (map (fn [x]
            [(get x "name") (get (get x "type") "type")]
            )
          ))


(->> chrome-types
     (map (fn [[k v]]
            (-> v
                (get "_feature")
                )
            ))
    )

;;;;;;;;;;;;;;;;;;;;; exploring apis.json, ie. old api ;;;;;;;;;;;;;;;;;;;;;
(def old-apis (json/read-str (slurp "/Users/lih/Documents/workspace/chrome-json-doc-explorer/resources/apis.json")))

(keys old-apis)
;; NOTES: all the objects are repeatedly stored in byName and its corresponding type attribute:

(-> old-apis
    (get "extensions/tabs")
    keys
    )

;; GLOBAL variables
(-> old-apis
    (get "extensions/tabs")
    (get "properties")
    )

(-> (->> (-> old-apis
             (get "extensions/tabs")
             (get "functions")
             ;; keys
             ;; second
             ;; keys
             ;; keys
             ;; (get "getCurrent")
             ;; second
             ;; (get "byName")
             ;; (get "getCurrent")
             ;; (get "get")
             ;; (get "types")
             )
         (filter (fn [x]
                   (= "connect" (get x "name"))
                   ))
         first
         )
    (get "returns")
    )

;; grab all the returns from all the ns/functions
(->> old-apis
     (map (fn [[ns x]]
            (let [funcs (get x "functions")]
              [ns (->> funcs
                       (map (fn [f]
                              [(get f "name") (get f "returns")]
                              ))
                       (remove (fn [[_ f]]
                                 (nil? f)
                                 ))
                       )]
              )))
     (remove #(not (seq %)))
     )


(-> old-apis
    (get "extensions/tabs")
    (get "byName")
    (get "onCreated")
    )

(-> old-apis
    (get "extensions/tabs")
    (get "byName")
    (get "getCurrent")
    ;; (get "TAB_ID_NONE")

    ;; keys
    ;; (get "getCurrent")
    ;; second
    ;; (get "getCurrent")
    ;; (get "get")
    ;; (get "types")
    )

(-> old-apis
    (get "extensions/tabs")
    (get "events")
    first
    )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


;; (defn my-func []
;;   (let [ch (chan)]
;;     (put! ch 1)
;;     ch)
;;   )

;; (go
;;   (let [ch (async/chan)]
;;     (>! chan 1)
;;     )
;;   )

;; (go (<! (my-func)))
