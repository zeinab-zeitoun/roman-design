(ns materialui-design.profilesettings
  (:require    
    [reagent-material-ui.core.menu :refer [menu]]
    [reagent-material-ui.core.menu-item :refer [menu-item]]
    [reagent-material-ui.icons.face :refer [face]]))


(defn profile-settings [anchorEl]
  [:div
    [menu
      {:id "simple-menu"         
       :open (boolean @anchorEl)
       :anchor-el @anchorEl
       :on-close #(reset! anchorEl nil)}
     [menu-item 
      {:on-click #(js/console.log "profile")}
         [:a {:href "/" :style {:color "black"
                                :display "flex"
                                :align-items "center"}}
          [face] 
          "Profile"]]
        [menu-item
         "My account"]
        [menu-item
         "Logout"]]])
