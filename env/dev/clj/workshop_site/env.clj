(ns workshop-site.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [workshop-site.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[workshop-site started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[workshop-site has shut down successfully]=-"))
   :middleware wrap-dev})
