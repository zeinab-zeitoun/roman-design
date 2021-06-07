(ns materialui-design.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [materialui-design.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[materialui-design started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[materialui-design has shut down successfully]=-"))
   :middleware wrap-dev})
