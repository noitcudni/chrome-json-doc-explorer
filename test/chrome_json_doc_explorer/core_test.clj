(ns chrome-json-doc-explorer.core-test
  (:require [clojure.test :refer :all]
            [chrome-json-doc-explorer.fixtures :refer [tabs-getCurrent-fixture
                                                       tabs-getAllInWindow-fixture
                                                       tabs-get-fixture
                                                       tabs-executeScript
                                                       ]]
            [chrome-json-doc-explorer.core :refer :all]
            [chrome-json-doc-explorer.coerce-json :refer [coerce-type]]
            [api-gen.generator :refer [build-api-table-function]]
            [clojure.java.io :as io]
            [clojure.data.json :as json]
            ))

(def chromes-types (json/read-str (slurp (io/resource "chrome-types.json"))))

(defn get-chrome-types-data [pos]
  (-> (->> (-> chrome-types
               (get "tabs")
               (get "_type")
               (get "properties"))
           (filter #(= "Function" (get % "kindString"))))
      (nth pos)))

(coerce-type (get-chrome-types-data 4))
(build-api-table-function {:subns "ext" :ns-name ""} (coerce-type (get-chrome-types-data 4)))

(deftest test-tabs-discard
  (testing "tabs-discard"
    (let [new-tabs-discard (get-chrome-types-data 4)]
      (testing "coerce-type"
        (let [new-json (coerce-type new-tabs-discard)]
          (is (= new-json {:id "method-discard",
                           :name "discard",
                           :description
                           "Discards a tab from memory. Discarded tabs are still visible on the tab strip and are reloaded when activated.",
                           :deprecated nil,
                           :parameters
                           [{:id "property-discard-tabId",
                             :name "tabId",
                             :simple-type "integer",
                             :optional true,
                             :properties []}
                            {:name "callback", :is-callback true, :optional true}],
                           :returns nil,
                           :callback
                           {:name "callback",
                            :id "method-discard-callback",
                            :parent-name "discard",
                            :parameters
                            [{:id "property-discard-tab",
                              :name "tab",
                              :simple-type "tabs.Tab",
                              :optional true,
                              :properties []}],
                            :optional true,
                            :description nil}}))))
      (testing "build-api-table-function"
        (is (= (build-api-table-function {:subns "ext" :ns-name ""} (coerce-type new-tabs-discard))
               {:id :discard,
                :name "discard",
                :since nil,
                :until nil,
                :deprecated nil,
                :callback? true,
                :return-type nil,
                :params
                [{:name "tab-id", :optional? true, :since nil, :type "integer"}
                 {:name "callback",
                  :optional? true,
                  :since nil,
                  :type :callback,
                  :callback
                  {:params [{:name "tab", :optional? true, :since nil, :type "tabs.Tab"}]}}]}))
        ))))


;;;;;; coerce-functions
(deftest test-tabs-duplicate
  (testing "tabs-duplicate"
    (let [new-tabs-duplicate (get-chrome-types-data 5)]
      (testing "coerce-type"
        (let [new-json (coerce-type new-tabs-duplicate)]
          (is (= new-json {:id "method-duplicate",
                        :name "duplicate",
                        :description "Duplicates a tab.",
                        :deprecated nil,
                        :parameters
                        [{:id "property-duplicate-tabId",
                          :name "tabId",
                          :simple-type "integer",
                          :optional nil,
                          :properties []}
                         {:name "callback", :is-callback true :optional true}],
                        :returns nil,
                        :callback
                        {:name "callback",
                         :id "method-duplicate-callback",
                         :parent-name "duplicate",
                         :parameters
                         [{:id "property-duplicate-tab",
                           :name "tab",
                           :simple-type "tabs.Tab",
                           :optional true,
                           :properties []}],
                         :optional true
                         :description nil}}
              ))))
      (testing "build-api-table-function"
        (let [chrome-api (build-api-table-function {:subns "ext" :ns-name ""} (coerce-type new-tabs-duplicate))]
          (is (= chrome-api {:id :duplicate,
                             :name "duplicate",
                             :since nil,
                             :until nil,
                             :deprecated nil,
                             :callback? true,
                             :return-type nil,
                             :params
                             [{:name "tab-id", :optional? nil, :since nil, :type "integer"}
                              {:name "callback",
                               :optional? true,
                               :since nil,
                               :type :callback,
                               :callback
                               {:params [{:name "tab", :optional? true, :since nil, :type "tabs.Tab"}]}}]}))
          ))
      )))

(deftest test-tabs-executeScript
  (testing "tabs-executeScript"
    (testing "coerce-type"
      (let [new-json (coerce-type tabs-executeScript)]
        (is (= new-json {:id "method-executeScript",
                         :name "executeScript",
                         :description
                         "Injects JavaScript code into a page. For details, see the [programmatic injection](https://developer.chrome.com/docs/extensions/content_scripts#pi) section of the content scripts doc.",
                         :deprecated "Replaced by {@link scripting.executeScript} in Manifest V3.",
                         :parameters
                         [{:id "property-executeScript-tabId",
                           :name "tabId",
                           :simple-type "integer",
                           :optional true,
                           :properties []}
                          {:id "property-executeScript-details",
                           :name "details",
                           :simple-type "extensionTypes.InjectDetails",
                           :optional nil,
                           :properties []}
                          {:name "callback", :is-callback true, :optional true}],
                         :returns nil,
                         :callback
                         {:name "callback",
                          :id "method-executeScript-callback",
                          :parent-name "executeScript",
                          :parameters
                          [{:id "property-executeScript-result",
                            :name "result",
                            :simple-type "[array-of-anys]",
                            :optional true,
                            :properties []}],
                          :optional true,
                          :description nil}}
               ))))
    (testing "build-api-table-function"
      (let [chrome-api (build-api-table-function {:subns "ext" :ns-name ""} (coerce-type tabs-executeScript))]
        (is (= chrome-api {:id :execute-script,
                           :name "executeScript",
                           :since nil,
                           :until nil,
                           :deprecated "Replaced by {@link scripting.executeScript} in Manifest V3.",
                           :callback? true,
                           :return-type nil,
                           :params
                           [{:name "tab-id", :optional? true, :since nil, :type "integer"}
                            {:name "details",
                             :optional? nil,
                             :since nil,
                             :type "extensionTypes.InjectDetails"}
                            {:name "callback",
                             :optional? true,
                             :since nil,
                             :type :callback,
                             :callback
                             {:params
                              [{:name "result", :optional? true, :since nil, :type "[array-of-anys]"}]}}]}
               )))
      )))

(deftest test-tabs-get
  (testing "tabs-get"
    (testing "coerce-type"
      (let [new-json (coerce-type tabs-get-fixture)]
        (is (= new-json {:id "method-get",
                         :name "get",
                         :description "Retrieves details about the specified tab.",
                         :deprecated nil,
                         :parameters
                         [{:id "property-get-tabId",
                           :name "tabId",
                           :simple-type "integer",
                           :optional nil,
                           :properties []}
                          {:name "callback", :is-callback true, :optional true}],
                         :returns nil,
                         :callback
                         {:name "callback",
                          :id "method-get-callback",
                          :parent-name "get",
                          :parameters
                          [{:id "property-get-tab",
                            :name "tab",
                            :simple-type "tabs.Tab",
                            :optional nil,
                            :properties []}],
                          :optional true,
                          :description nil}}))))
    (testing "build-api-table-function"
      (let [chromex-api (build-api-table-function {:subns "ext" :ns-name ""} (coerce-type tabs-get-fixture))]
        (is (= chromex-api {:id :get,
                            :name "get",
                            :since nil,
                            :until nil,
                            :deprecated nil,
                            :callback? true,
                            :return-type nil,
                            :params
                            [{:name "tab-id", :optional? nil, :since nil, :type "integer"}
                             {:name "callback",
                              :optional? true,
                              :since nil,
                              :type :callback,
                              :callback
                              {:params [{:name "tab", :optional? nil, :since nil, :type "tabs.Tab"}]}}]}))
        ))))


(deftest tabs-getAllInWindow-test
 (testing "tabs-getAllInWindow"
   (testing "coerce-type"
     (let [new-json (coerce-type tabs-getAllInWindow-fixture)]
       (is (= new-json {:id "method-getAllInWindow",
                        :name "getAllInWindow",
                        :description "Gets details about all tabs in the specified window.",
                        :deprecated "Please use {@link tabs.query} `{windowId: windowId}`.",
                        :parameters
                        [{:id "property-getAllInWindow-windowId",
                          :name "windowId",
                          :simple-type "integer",
                          :optional true,
                          :properties []}
                         {:name "callback", :is-callback true, :optional true}],
                        :returns nil,
                        :callback
                        {:name "callback",
                         :id "method-getAllInWindow-callback",
                         :parent-name "getAllInWindow",
                         :parameters
                         [{:id "property-getAllInWindow-tabs",
                           :name "tabs",
                           :simple-type "[array-of-tabs.Tabs]",
                           :optional nil,
                           :properties []}],
                         :optional true,
                         :description nil}}))
       ))
   (testing "build-api-table-function"
     (let [chromex-api (build-api-table-function {:subns "ext" :ns-name ""} (coerce-type tabs-getAllInWindow-fixture))
           ;; NOTE: missing :since
           ;; {:id ::get-all-in-window,
           ;;  :name "getAllInWindow",
           ;;  :since "36",
           ;;  :deprecated "Please use 'tabs.query' {windowId: windowId}.",
           ;;  :callback? true,
           ;;  :params
           ;;  [{:name "window-id", :optional? true, :type "integer"}
           ;;   {:name "callback", :type :callback, :callback {:params [{:name "tabs", :type "[array-of-tabs.Tabs]"}]}}]}
           ]
       (is (= chromex-api {:id :get-all-in-window,
                           :name "getAllInWindow",
                           :since nil,
                           :until nil,
                           :deprecated "Please use {@link tabs.query} `{windowId: windowId}`.",
                           :callback? true,
                           :return-type nil,
                           :params
                           [{:name "window-id", :optional? true, :since nil, :type "integer"}
                            {:name "callback",
                             :optional? true,
                             :since nil,
                             :type :callback,
                             :callback
                             {:params
                              [{:name "tabs",
                                :optional? nil,
                                :since nil,
                                :type "[array-of-tabs.Tabs]"}]}}]}))
       ))))

(coerce-type tabs-getCurrent-fixture)

(deftest coerce-functions
  (testing "tabs-getCurrent"
    (testing "coerce-type"
      (let [new-json (coerce-type tabs-getCurrent-fixture)
            callback (:callback new-json)]
        (is (= "getCurrent" (:name new-json)))
        (is (= [{:name "callback", :is-callback true :optional true}] (:parameters new-json)))
        (testing "callback-item"
          (is (= "callback" (:name callback)))
          (is (= "method-getCurrent-callback" (:id callback)))
          (is (= "property-getCurrent-tab" (:id (first (:parameters callback)))))
          (is (= "tab" (:name (first (:parameters callback)))))
          (is (= "tabs.Tab" (:simple-type (first (:parameters callback)))))
          )))
    (testing "build-api-table-function"
      (let [{id :id
             name :name
             callback? :callback?
             params :params
             }
            (build-api-table-function {:subns "ext" :ns-name ""} (coerce-type tabs-getCurrent-fixture))
            ]
        (is (= :get-current id))
        (is (= "getCurrent" name))
        (is (= true callback?))
        (is (= "callback" (:name (first params))))
        (is (= :callback (:type (first params))))
        (is (= "tab" (:name (first (:params (:callback (first params)))))))
        (is (= "tabs.Tab" (:type (first (:params (:callback (first params)))))))
        )
      ))
  )

;; (build-api-table-function {:subns "ext" :ns-name ""}
;;                           (coerce-type (-> (->> (-> chrome-types
;;                                                     (get "tabs")
;;                                                     (get "_type")
;;                                                     (get "properties"))
;;                                                 (filter #(= "Function" (get % "kindString"))))
;;                                            (nth 5) ;; up to 9
;;                                            )))
;; (coerce-type (-> (->> (-> chrome-types
;;                           (get "tabs")
;;                           (get "_type")
;;                           (get "properties"))
;;                       (filter #(= "Function" (get % "kindString"))))
;;                  (nth 5) ;; up to 9
;;                  ))

;; (coerce-type (get-chrome-types-data 4)) ;;discard
;; (build-api-table-function {:subns "ext" :ns-name ""} (coerce-type (get-chrome-types-data 4)))

;; (get-chrome-types-data 3) ;;detectLanguage
;; (get-chrome-types-data 2) ;; create
;; (get-chrome-types-data 1) ;; connect
;; (get-chrome-types-data 0) ;; captureVisibleTab
