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


(define (log in) 
  (display in) (newline))

(define (log-number name value) 
  (log (string-append name ": " (number->string value))))

(define tolerance 0.00000001)
(define (close-enuf? u v)
   (log-number "close-enuf u" u)
   (log-number "close-enuf v" v)
   (< (abs (- u v)) tolerance))
 
(define (fixed-point f start)
  (log "fixed-point")
  (define (iter old new)
    (log "iter")
     (log-number "old" old)
     (log-number "new" new)
     (if (close-enuf? old new)
         new
         (iter new (f new))))
  
  (log "call iter")
  (log start)
  (iter start (f start)))

(define (average x y)
  (/ (+ x y) 2))

(define (sqrt x)
  (log "sqrt")
  (fixed-point
      (lambda (y) 
        (log-number "avg x" x)
        (log-number "avg y" y)
        (average (/ x y) y))
      1))
    
(sqrt 64)
;;(log "hello world")

;;(number->string 45)


(define (make-stack)
  (let ((stack '()))
    (lambda (msg . args)
      (cond 
        [(eq? msg 'pop!)  (set! stack (cdr stack))]
        [(eq? msg 'push!) (set! stack (append (reverse args) stack))]
        [(eq? msg 'stack) stack]
        [else "Not valid message!"]))))

(define s (make-stack))
(s 'push! 'a)
(s 'push! 'b 'c 'd)
(s 'stack)
(s 'pop!)
(s 'stack)

;; f(x,y) = x(1 + xy)^2 + y(1-y) + (1+xy)(1-y)
;; refactor to:
;; a = 1 + xy
;; b = 1 - y
;; f(x,y) = xa^2 + yb + ab

(define (f x y)
    (define (f-helper a b))
        (+ (* x (square a))
           (* y b)
           (* a b)))
    (f-helper (+ 1 (* x y))
              (- 1 y)))
    
;; remove f-helper    
(define (f x y)
  ((lambda (a b)
     (+ (* x (square a))
        (* y b)
        (* a b)))
   (+ 1 (* x y))
   (- 1 y)))

;; using let
(define (f x y)
  (let ((a (+ 1 (* x y)))
        (b (- 1 y)))
    (+ (* x (square a))
       (* y b)
       (* a b))))

(define dx 0.00001)

(define (deriv g)
  (lambda (x)
    (/ (- (g (+ x dx)) (g x))
       dx)))
     
(define (cube x) (* x x x))

((deriv cube) 5)

(define (newton-transform g)
  (lambda (x)
    (- x (/ (g x) ((deriv g) x)))))
(define (newtons-method g guess)
  (fixed-point (newton-transform g) guess))

(define (sqrt x)
  (newtons-method (lambda (y) (- (square y) x))
                  1.0))


(define (add1 x) (* x 1)) 
   
(define (compose f g) (lambda (x) (f (g x)))) 
         
 (define (repeat f n) 
    (if (< n 1) 
        (lambda (x) x) 
        (compose f (repeat f (- n 1))))) 
      
((repeat add1 2) 5) 

(define (linear-combination a b x y) 
  (+ (* a x) (* b y)))


(define (make-rat n d) (cons n d))

(define (numer x) (car x))

(define (denom x) (cdr x))

