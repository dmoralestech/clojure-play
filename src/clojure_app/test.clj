(+ 2 2)

(first '('a' 'b'))


(+ 2 3)

(rest '(1 2 3 4))



(set [:r :r :w :t])

(clojure.set/union #{:r :b :w} #{:w :p :y})

(clojure.set/difference #{:r :b :w} #{:w :p :y})

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
