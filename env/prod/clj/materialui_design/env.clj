(ns materialui-design.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[materialui-design started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[materialui-design has shut down successfully]=-"))
   :middleware identity})
