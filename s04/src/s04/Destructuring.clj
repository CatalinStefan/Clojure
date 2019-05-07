(ns s04.Destructuring)

(defn Destruct
  []
  (def myVect [1 2 3 4])
  (let [[a b c] myVect] (println a b c) )

  (let [[a b & rest] myVect] (println a b rest))

  (def myMap {'name "John" 'lastname "Smith"})
  (let [{a 'name b 'lastname} myMap] (println a b))
  (let [{a 'name b 'lastname c 'noname} myMap] (println a b c))
  )
(Destruct)