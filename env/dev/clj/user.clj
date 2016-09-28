(ns user
  (:require [mount.core :as mount]
            [workshop-site.figwheel :refer [start-fw stop-fw cljs]]
            workshop-site.core))

(defn start []
  (mount/start-without #'workshop-site.core/repl-server))

(defn stop []
  (mount/stop-except #'workshop-site.core/repl-server))

(defn restart []
  (stop)
  (start))


