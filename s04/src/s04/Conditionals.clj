(ns s04.Conditionals)

(defn CondIf
  []
  (println "\nCondIf:")
  (if (= 5 5) (println "Equal")
              (println "Not equal"))
  )
(CondIf)

(defn CondIfDo
  []
  (println "\nCondIfDo:")
  (if (= 5 5)
    (do (println "Equal first statement")
        (println "Second statement"))
    (do (println "Not equal first statement")
        (println "Second statement"))
    ))
(CondIfDo)

(defn CondNestedIf
  []
  (println "\nCondNestedIf:")
  (if (and (= 5 5) (or (= 2 2) (not true)))
    (println true)
    (println false)
    ))
(CondNestedIf)

(defn CondCase
  []
  (println "\nCondCase:")
  (def pet "dog")
  (case pet
    "cat" (println "I have a cat")
    "dog" (println "I have a dog")
    "fish" (println "I have a fish")
    ))
(CondCase)

(defn CondCond
  []
  (println "\nCondCond:")
  (def amount 5)
  (cond
    (<= amount 2) (println "Few")
    (<= amount 10) (println "Several")
    (<= amount 100) (println "Many")
    :else (println "Loads")
    ))
(CondCond)