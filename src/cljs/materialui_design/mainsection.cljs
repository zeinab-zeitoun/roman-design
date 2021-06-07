(ns materialui-design.mainsection
  (:require 
    [reagent-material-ui.core.grid :refer [grid]]
    [reagent-material-ui.core.typography :refer [typography]]
    [reagent-material-ui.core.box :refer [box]]
    [reagent-material-ui.core.button :refer [button]]
    [materialui-design.mainconditions :refer [four-conditions]]
     [materialui-design.stickers :refer [stickers]])
  )


(defn main-section [{:keys [classes] :as props}]
  [:div
   [:br][:br][:br][:br]
   [grid {:container true :spacing 3}

    [grid {:item true :xs 12 :sm 12 :md 5}

     [grid {:item true :xs 12 :sm 12}
      [box {:font-weight "fontWeightBold" :font-size "h3.fontSize"} "Men’s healthcare,"]
      [typography {:variant "h4"} "without the waiting rooms."]
      [typography "From the online visit to contact-free delivery with"]
      [typography "ongoing care, expect a seamless experience."]]

     [grid {:item true :xs 12 :sm 7 :md 12}
      [:br]
      [button {:variant "contained" :class (:button classes)} "start free online visit"]]

     [grid {:item true :xs 12 :sm 7 :md 12}
      [:br]
      [stickers classes]]]
    [four-conditions]]])
