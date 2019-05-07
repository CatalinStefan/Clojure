(ns s05.Agents)

(defn Agents
  []
  (def amount (agent 100))
  (println @amount)
  (send amount inc)
  (println @amount)
  (println "Some time needs to pass")
  (println @amount)

  (send amount inc)
  (await-for 1000 amount)
  (println @amount)

  (send amount inc)
  (await amount)
  (println @amount)

  (println (agent-error amount))
  )
(Agents)