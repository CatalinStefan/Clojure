(ns s04.StructMaps)

(defn Pets
  []
  (defstruct pets :PetType :PetName)
  (def myPet (struct pets "dog" "Fido"))
  (println myPets)

  (def myOtherPet (struct-map pets :PetName "Fifi" :PetType "cat"))
  (println myOtherPet)
  (println (:PetName myOtherPet))
  (println (:PetType myOtherPet))

  (def myNewPet (assoc myPet :PetName "Max"))
  (println myNewPet)

  (def myNewOtherPet (assoc myOtherPet :PetAge 10))
  (println myNewOtherPet)
  )
(Pets)