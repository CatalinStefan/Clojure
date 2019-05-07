(ns s04.CarDealership)


(defn isCodeValid
  [code]
  (defstruct coupon :Name :Discount)
  (def validCoupon (struct coupon "20percent" 0.8))
  (if (= (:Name validCoupon) code)
    true
    false
    )
  )

(defn getCarPrices
  [budget code]
  (def cars {"bmw" 60000, "ferrari" 100000, "fiat" 20000})
  (if (isCodeValid code)
    (do
      (println "The code is valid")
      (def discount (:Discount validCoupon))
      (doseq [car cars]
        (def carType (first car))
        (def price (last car))
        (def priceDiscount (* price discount))
        (if (<= priceDiscount budget)
          (println "The" carType "costs" priceDiscount)
          )
        )
      )
    (do
      (println "The code is invalid")
      (doseq [car cars]
        (def carType (first car))
        (def price (last car))
        (if (<= price budget)
          (println "The" carType "costs" price)
          )
        )
      )
    )
  )
(getCarPrices 50000 "20percent")