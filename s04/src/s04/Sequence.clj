(ns s04.Sequence)

; In Clojure, a sequence is a logical list of elements
; Most data structures provide access to their
; data as a sequence
; And many of the core library functions work on
; sequential data
; This means that we can chain elements together
; with the help of sequences

(defn Seq
  []
  (def colors (seq ["red" "green" "blue"]))
  (println colors)

  (println (cons "yellow" colors) )
  (println (cons colors "yellow"))

  (println (conj colors "yellow"))
  (println (conj ["red" "green" "blue"] "yellow"))

  (println (concat colors (seq ["black", "white"])))

  (println (distinct (seq [1 2 3 5 3 5 2 4])))

  (println (reverse colors))

  (println (first colors))
  (println (rest colors))
  (println (last colors))

  (println (sort (seq [1 2 3 5 3 5 2 4])))
  )
(Seq)