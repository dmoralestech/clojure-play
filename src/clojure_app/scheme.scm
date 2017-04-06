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
