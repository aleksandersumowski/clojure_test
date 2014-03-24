(ns te.t-core
    (:use midje.sweet)
    (:require  [te.core :as core]))

(fact "Sample test"
        (str/split "a/b/c" #"/") =>  ["a" "b" "c"]
       )


