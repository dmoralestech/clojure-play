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

