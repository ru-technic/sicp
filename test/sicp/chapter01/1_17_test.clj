(ns sicp.chapter01.1-17-test
  (:require [clojure.test :refer :all]
            [sicp.test-helper :refer :all]
            [sicp.chapter01.1-17 :refer :all]))

(deftest test-fast-mult
  (assert-equal 0 (fast-mult 10 0))
  (assert-equal 10 (fast-mult 10 1))
  (assert-equal 100 (fast-mult 10 10))
  (assert-equal -100 (fast-mult -10 10))
  (assert-equal -100 (fast-mult 10 -10)))
