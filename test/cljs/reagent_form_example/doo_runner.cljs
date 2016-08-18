(ns reagent-form-example.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [reagent-form-example.core-test]))

(doo-tests 'reagent-form-example.core-test)
