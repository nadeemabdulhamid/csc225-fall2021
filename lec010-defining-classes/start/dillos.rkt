;;; Data Definition
; A dillo is (make-dillo number boolean)
(define-struct dillo (length dead?))


;;; Examples of Data
(define baby-dillo (make-dillo 8 false))
(define adult-dillo (make-dillo 24 false))
(define huge-dead-dillo (make-dillo 65 true))

;;; A Function

; template
#;
(define (can-shelter a-dillo)
  (... (dillo-length a-dillo)
       (dillo-dead? a-dillo) ...))

; can-shelter : dillo number -> boolean
; determine whether dillo is dead and larger than given person length (inches)
(define (can-shelter a-dillo person-length)
  (and (dillo-dead? a-dillo)
       (> (dillo-length a-dillo) person-length)))


  
;;; Test cases
(check-expect (can-shelter baby-dillo 60) false)
(check-expect (can-shelter huge-dead-dillo 60) true)