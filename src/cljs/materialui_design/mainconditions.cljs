(ns materialui-design.mainconditions
  (:require 
   [reagent-material-ui.core.grid :refer [grid]]
   [reagent-material-ui.core.grid-list :refer [grid-list]]
   [reagent-material-ui.core.grid-list-tile :refer [grid-list-tile]]
   [reagent-material-ui.core.grid-list-tile-bar :refer [grid-list-tile-bar]]))

(defn four-conditions []
  [grid {:item true :sm 12 :md 7}
     
   [grid-list {:cols 2 :spacing 15}
    [grid-list-tile
     [:img {:src "../img/product.jpg"}]
      [grid-list-tile-bar {:title "erectile dysfunction"
                           :subtitle "learn more"
                           :title-position "top"
                            }]]
    [grid-list-tile
     [:img {:src "../img/product.jpg"}]
      [grid-list-tile-bar {:title "erectile dysfunction" 
                           :subtitle "learn more"
                           :title-position "top"
                            }]]]

   [grid-list {:cols 2 :spacing 15}

    [grid-list-tile
     [:img {:src "../img/product.jpg"}]
      [grid-list-tile-bar {:subtitle "get 15% off"
                           :title-position "bottom"
                           :style {:background "red"
                                    :height "25px"
                                    :text-align "center"
                                    :font-weight "700"}}]
      [grid-list-tile-bar {:title "erectile dysfunction"
                           :subtitle "learn more"
                           :title-position "top"
                            }]]

     [grid-list-tile
      [:img {:src "../img/product.jpg"}]
      [grid-list-tile-bar {:title "erectile dysfunction"
                           :subtitle "learn more"
                           :title-position "top"
                            }]]]])
