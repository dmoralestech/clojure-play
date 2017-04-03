*ns*

(+ 2 2)

(first '('a' 'b'))


(+ 2 3)

(rest '(1 2 3 4))



(set [:r :r :w :t])

(clojure.set/union #{:r :b :w} #{:w :p :y})

(clojure.set/difference #{:r :b :w} #{:w :p :y})

(clojure.set/intersection #{:r :b :w} #{:w :p :y})

(def developer "Darwin")

developer

;; list
(first (rest (rest (rest '(:a :b :c :d :e :f)))))

(cons 4 (cons 5 nil))

(list 4 5)



;;vector
(first [:a :b :c])

(def v [:1 :2 :3 :4])

(rest v)

(nth v 0)

(last v)

(count v)

(conj v :5)

(conj v :5 :6 :7)

;;map
(def h {:name "Darwin", :surname "Morales"})

(get h :surname)

(get h :address) ;;nil

(:name h) ;;"Darwin"

(:surname h)

(keys h);;(:name :surname)

(vals h)

(assoc h :name "Joseph");;{:name "Joseph", :surname "Morales"}

(dissoc h :name)

(def h2 {:name "Nova", :surname "Castillo" :address "Cavite"})

(merge h2 h);;{:name "Darwin", :surname "Morales", :address "Cav …


;; sets from vectors
(set [:a :b :c :a :b]) ;;#{:c :b :a}

(set {:a 1, :b 2, :c 3}) ;;#{[:c 3] [:b 2] [:a 1]}

(get #{:a :b :1} :a)

(:a #{:a :b :1})

(def setTemp #{:a :b :c})

(setTemp :a) ;; :a

(contains? setTemp :x) ;; false

(conj setTemp :d :e :q);;#{:q :e :c :b :d :a}

(disj setTemp :a)

;; List are collections that you want to access from top of list

;; vectors you can access it anywhere by position

;; maps are key values

;; sets are uniques elements

(first '(+ 1 1))

(def myName "Darwin")

(let [myName "Joseph"] myName) ;; "Joseph"

myName ;; "Darwin"

(let [myName "Darwin", language "Lisp"] [myName language])

;; [myName language] ;; language is not found

(defn add[x y] (+ x y))

(add 2 3)

(defn sayHi [] "Hi")

(sayHi)

(defn sayHello [name] (str "Hello " name))

(sayHello "Darwin")

(def sayHello2 (fn [name] (str "Hello")))

(sayHello2 "Nova")

(def sayHello3 #(str "Hello" " " %1 " " %2))

*ns*

(sayHello3 "Darwin" "Morales")

(ns darwin.foods)

*ns*

;;(sayHello2 "Test")

(ns darwin.snacks)


*ns*

;; (sayHello2 "Test")


;; (require 'clojure.set)
;; can call difference, intersect, union now

;; (requeire 'clojure.net :as set) ;; set is now the alias

(true? true)

(true? false)

(not true)

(false? false)
(nil? nil)

(empty? [])

(seq [1 2 3 4]) ;; turns a collectino to a sequence

(every? odd? '(1 3 5))

(defn drinkable? [x]
  (= x :drinkable))

(every? drinkable? '(:drinkable :poison))

(every? #(= % :drinkable) '(:drinkable :drinkable))

(not-any? #(= % :drinkable) '(:drinkable :drinkable))

(#{:a :b :c} :c)

(some #{4 5} [1 2 3 4 5 6])

(some #{6} '(1 2 3 4 5 6))

(if nil "Hello" "Goodbye") ;; Goodbye

(if (not nil) "Hello" "Goodbye") ;; Hello

(if-let [x (> 5 2)] "bigger" "smaller")

(defn runMe[x]
    (cond
      (> x 3) (str "bigger than 3")
      (> x 5) (str "bigger than 5")))

(runMe 4)

(defn caseSample[x]
    (case ;; use case when there's only 1 test value
      3 (str "equals 3")
      5 (str "equals 5")))

(caseSample 5)

(defn toggle-grow [direction]
    (if (= direction :small) :big :small))

(defn oh-my [direction]
  (str "Oh! You are growing " direction))

(oh-my (toggle-grow :small))

;; compose
(defn surprise [direction]
  ((comp oh-my toggle-grow) direction))

(surprise :big)

;; Destructuring allows you to assign named bindings  for the elements in vectors and maps

(let [[color size] ["blue" "medium" "blah"]]
  (str "The " color " door is " size))

(let [[color [size]] ["blue" ["medium"]]]
  (str "The " color " door is " size))

(let [[color [size] :as original] ["blue" ["medium"]]]
  (first original))


;;normally you'd do this
(let [x ["blue" "medium"]]
  (str "The " (first x) " door is " (last x)))

(let [x ["blue" "medium"]
      color (first x)
      size (last x)]
  (str "The " color " door is " size))



(let [{f1 :f1 f2 :f2} {:f1 "1", :f2 "2"}]
      (str f1 " " f2))

(defn consDm[x y]
  (fn [pick]
    (cond
      ((= 1 pick) x)
      ((= 2 pick) y))))

(defn carDm[x] (x 1))

(defn cdrDm[x] (x 2))

(carDm (consDm 1 2))

