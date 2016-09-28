(ns workshop-site.app
  (:require [workshop-site.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
