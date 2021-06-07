(ns materialui-design.stickers
  (:require 
   [reagent-material-ui.core.grid-list :refer [grid-list]]
   [reagent-material-ui.core.grid-list-tile :refer [grid-list-tile]]
   [reagent-material-ui.core.typography :refer [typography]]
   [reagent-material-ui.icons.add-box :refer [add-box]]
   [reagent-material-ui.icons.clear :refer [clear]]
   [reagent-material-ui.icons.face :refer [face]]

   ))

(defn stickers [classes]
  [grid-list {:cols 3}
       [grid-list-tile {:class (:sticker classes)}
        [add-box]
        [typography "US-licensed"]
        [typography "healthcare"]
        [typography "professionals"]]
       [grid-list-tile {:class (:sticker classes)}
        [clear]
        [typography "Personalized"]
        [typography "treatment"]]
       [grid-list-tile {:class (:sticker classes)}
        [face]
        [typography "licensed"]
        [typography "pharmacy"]]])
