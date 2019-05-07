(ns s04.Exceptions)

(defn ExHandling
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println "Caught exception:" (.getMessage e)))
    (catch Exception e (println "Caught generic exception"))
    (finally (println "cleanup and move on"))
    )
  )
(ExHandling "hello")