(ns materialui-design.conditions
  (:require 
    [reagent-material-ui.core.grid :refer [grid]]
    [reagent-material-ui.core.typography :refer [typography]]))


(defn conditions [treat-display]
  [grid {:container true
          :style 
          {:display @treat-display
           :background "white"
           :color "#151F2B"}}
   [grid {:item true       
          :lg 2
          :md false
          :sm false}]
   [grid {:item true
          :container true
          :lg 6
          :md 12
          :sm 12}
    [grid {:item true
           :md 3
           :xs 12}
     [:ul "Sexual health"
      [:li "Erectile dysfunction"]
      [:li "Premature ejaculation"]
      [:li "Genital herpes"]
      [:li "Cold sores"]]]
    [grid {:item true
           :md 3
           :xs 12}
     [:ul "Sexual health"
      [:li "Erectile dysfunction"]
      [:li "Premature ejaculation"]
      [:li "Genital herpes"]
      [:li "Cold sores"]]]
    [grid {:item true
           :md 3
           :xs 12}
     [:ul "Sexual health"
      [:li "Erectile dysfunction"]
      [:li "Premature ejaculation"]
      [:li "Genital herpes"]
      [:li "Cold sores"]
      [:li "Erectile dysfunction"]
      [:li "Premature ejaculation"]
      [:li "Genital herpes"]
      [:li "Cold sores"]]]
    [grid {:item true
           :md 3
           :xs 12}
     [:ul "Sexual health"
      [:li "Erectile dysfunction"]
      [:li "Premature ejaculation"]
      [:li "Genital herpes"]
      [:li "Cold sores"]]]]

   [grid {:item true       
          :lg 4
          :md 12
          :xs false
          :container true
          :style {:background "#f8fcfd"}}
    [grid {:item true
           :lg 6
           :md 6
           :xs 12}
     [typography "ready to start?"]]

    [grid {:item true
            :lg 6
            :md 6
            :xs 12}
     [:button "getting started"]]
    [grid {:item true
           :lg 9
           :md 6}
     [typography "contact"]]
    [grid {:item true
           :lg 3
           :md 6
           :xs 12}
     [typography "number"]]]])
