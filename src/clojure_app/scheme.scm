(define op-maker
    (lambda (op)
      (lambda (x y)
        (op x y))))
      
      
(define (add x y) (+ x y) )

((op-maker add) 2 3)
