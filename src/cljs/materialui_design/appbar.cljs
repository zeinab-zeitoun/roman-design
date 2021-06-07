(ns materialui-design.appbar
  (:require 
   [reagent.core :as r]
   [reagent-material-ui.core.toolbar :refer [toolbar]]
   [reagent-material-ui.core.app-bar :refer [app-bar]]
   [reagent-material-ui.core.typography :refer [typography]]
   [reagent-material-ui.core.hidden :refer [hidden]]
   [reagent-material-ui.core.button :refer [button]]
   [reagent-material-ui.core.icon-button :refer [icon-button]]
   [reagent-material-ui.icons.face :refer [face]]
   [materialui-design.conditions :refer [conditions]]
   [materialui-design.profilesettings :refer [profile-settings]]))

(defn nav [{:keys [classes] :as props}]
  (let [anchorEl (r/atom nil)
        treat-display (r/atom "none")]
    (fn []
      [app-bar
       [toolbar
        [typography {:class (:roman classes)} "roman"]
        [hidden {:sm-down true}
         [button {:color "inherit"}
          [typography "how it works"]]
         [button {:color "inherit"}
          [typography "FAQ"]]
         [button {:color "inherit"}
          [typography "Pricing"]]]
        [typography {:class (:pricing classes)}]
        [button 
         {:color "inherit"
          :on-click #(if (= @treat-display "none")
                       (reset! treat-display "flex")
                       (reset! treat-display "none"))}
         [typography "what we treat"]]
        [icon-button {:aria-controls "simple-menu" 
                      :aria-haspopup true
                      :on-click #(reset! anchorEl (.-currentTarget %))}
         [face {:style {:color "white"}}]]]
       [profile-settings anchorEl]
       [conditions treat-display]])))
