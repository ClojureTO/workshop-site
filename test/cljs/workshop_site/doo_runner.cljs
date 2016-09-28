(ns workshop-site.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [workshop-site.core-test]))

(doo-tests 'workshop-site.core-test)

