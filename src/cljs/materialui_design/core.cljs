(ns materialui-design.core
  (:require
   [day8.re-frame.http-fx]
   [reagent.dom :as rdom]
   [reagent.core :as r]
   [re-frame.core :as rf]
   [goog.events :as events]
   [goog.history.EventType :as HistoryEventType]
   [markdown.core :refer [md->html]]
   [materialui-design.ajax :as ajax]
   [materialui-design.events]
   [reitit.core :as reitit]
   [reitit.frontend.easy :as rfe]
   [clojure.string :as string]

   [reagent-material-ui.core.container :refer [container]]
   [reagent-material-ui.styles :as styles]

   [materialui-design.customized :refer [with-custom-styles with-custom-theme]] 
   [materialui-design.appbar :refer [nav]]
   [materialui-design.mainsection :refer [main-section]])
  (:import goog.History))


(defn home-page []
  [styles/theme-provider with-custom-theme
   [(with-custom-styles nav)]
   [:div {:style {:background-color "#223144" :color "white"}}
    [container
     [(with-custom-styles main-section)]]]])

(defn page []
  (if-let [page @(rf/subscribe [:common/page])]
    [:div
     [page]]))


(defn navigate! [match _]
  (rf/dispatch [:common/navigate match]))

(def router
  (reitit/router
    [["/" {:name        :home
           :view        #'home-page
           :controllers [{:start (fn [_] (rf/dispatch [:page/init-home]))}]}]]))

(defn start-router! []
  (rfe/start!
    router
    navigate!
    {}))

;; -------------------------
;; Initialize app
(defn ^:dev/after-load mount-components []
  (rf/clear-subscription-cache!)
  (rdom/render [#'page] (.getElementById js/document "app")))

(defn init! []
  (start-router!)
  (ajax/load-interceptors!)
  (mount-components))
