(ns clojure-newb.core
  (:gen-class))

(defn mapset
  "similar to map, but returns a set"
  [f & colls]
  (into #{} (apply map f colls)))

(defn problem1
  "project euler problem 1"
  []
  (println (reduce + (filter
                      #(or (zero? (mod % 3)) (zero? (mod % 5)))
                      (range 1 1000)))))

(defn problem2
  "project euler problem 2: By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms."
  [])

(defn fib
  "fibonacci helper for problem2."
  ([] (fib 0 1))
  ([a b]
   (lazy-seq
    (cons a (fib b (+ a b))))))

(defn -main
  [& args]
  (println "hello world"))
