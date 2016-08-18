(ns reagent-form-example.prod
  (:require [reagent-form-example.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
