(ns materialui-design.app
  (:require [materialui-design.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
