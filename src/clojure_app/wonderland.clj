(ns wonderland
  (:require [clojure.set :as s])) ;; 1

(defn common-fav-foods [foods1 foods2]
  (let [food-set1 (set foods1) ;; 2
        food-set2 (set foods2) ;; 3
        common-foods (s/intersection food-set1 food-set2)] ;; 4
    (str "Common Foods: " common-foods)))

(common-fav-foods [:jam :brownies :toast]
                  [:lettuce :carrots :jam])
