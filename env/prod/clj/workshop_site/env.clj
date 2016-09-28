(ns workshop-site.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[workshop-site started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[workshop-site has shut down successfully]=-"))
   :middleware identity})
