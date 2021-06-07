(ns materialui-design.customized
  (:require [reagent-material-ui.styles :as styles]))

(defn custom-styles [theme]
  {
   :button {:margin ((get-in theme [:spacing]) 1) 
            :background "#30D5C8"
            :width "90%"
            :padding "1em"}
   :paper {:textAlign "center" :padding "1rem"}
   :pricing {:flex "1"}
   :roman {:margin-right "2rem"}
   :sticker {:text-align "center"}
   })

(def with-custom-styles (styles/with-styles custom-styles))

(def custom-theme
  {:palette 
   {:primary 
    {:light "#3b5678"
     :main "#223144"
     :dark "#151F2B"}}})

(def with-custom-theme (styles/create-mui-theme custom-theme))
