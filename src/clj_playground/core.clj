(ns clj-playground.core
  (:require [re-frame.core :as rf]))

(rf/reg-event-fx
 :test
 (fn [{:keys [db]} [_ i]]
   {:db (assoc db :test (conj (:test db)
                              i))}))

(defn -main [& args]
  (println "Starting to bombard re-frame")
  (doseq [i (range 1 10000)]
    (rf/dispatch [:test i])))
