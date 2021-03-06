(ns sicp.chapter02.2-71-test
  (:require [clojure.string :as st]
            [clojure.test :refer [deftest]]
            [sicp.chapter02.2-68 :as sicp-2-68]
            [sicp.chapter02.2-71 :as sicp-2-71]
            [sicp.test-helper :refer :all]))

(deftest test-exp-frequency-tree
  (let [n05-tree (sicp-2-71/exp-frequency-huffman-tree 05)
        n10-tree (sicp-2-71/exp-frequency-huffman-tree 10)]
    (assert-equal "1" (st/join (sicp-2-68/encode n05-tree '(E))))
    (assert-equal "1" (st/join (sicp-2-68/encode n10-tree '(J))))
    (assert-equal "0000" (st/join (sicp-2-68/encode n05-tree '(A))))
    (assert-equal "000000000" (st/join (sicp-2-68/encode n10-tree '(A))))))
