(ns chrome-json-doc-explorer.core-test
  (:require [clojure.test :refer :all]
            [chrome-json-doc-explorer.fixtures :refer [tabs-getCurrent-fixture]]
            [chrome-json-doc-explorer.core :refer :all]
            [chrome-json-doc-explorer.coerce-json :refer [coerce-type]]
            [api-gen.generator :refer [build-api-table-function]]
            ))

#_(let [data (coerce-type tabs-getCurrent-fixture)]
  (:callback data)

  )

#_(let [data (build-api-table-function {:subns "ext" :ns-name ""} (coerce-type tabs-getCurrent-fixture))]
  data
  )

#_(-> (->> (-> chrome-types
             (get "tabs")
             (get "_type")
             (get "properties"))
         (filter #(= "Function" (get % "kindString"))))
    (nth 9) ;; up to 9
    )

(deftest coerce-functions
  (testing "tabs-getCurrent-fixture"
    (testing "coerce-type"
      (let [new-json (coerce-type tabs-getCurrent-fixture)
            callback (:callback new-json)]
        (is (= "getCurrent" (:name new-json)))
        (is (= [{:name "callback", :is-callback true}] (:parameters new-json)))
        (testing "callback-item"
          (is (= "callback" (:name callback)))
          (is (= "method-getCurrent-callback" (:id callback)))
          (is (= "property-getCurrent-tab" (:id (first (:parameters callback)))))
          (is (= "tab" (:name (first (:parameters callback)))))
          (is (= "tabs.Tab" (:simple-type (first (:parameters callback)))))
          )))
    (testing "build-api-table-funcion"
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
      )))
