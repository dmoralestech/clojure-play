(define op-maker
    (lambda (op)
      (lambda (x y)
        (op x y))))
      
      
(define (add x y) (+ x y) )

((op-maker add) 2 3)


;; Accumulates the result of the first and the already-accumulated rest. 
(define (accumulate op initial sequence) 
(if (null? sequence) 
   initial 
   (op (car sequence) 
       (accumulate op initial (cdr sequence))))) 


(define (pascal row col)
   (cond ((< row col) #f)
         ((or (= 0 col) (= row col)) 1)
         (else (+ (pascal (- row 1) col)
                  (pascal (- row 1) (- col 1))))))
