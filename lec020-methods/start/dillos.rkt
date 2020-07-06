;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname dillos) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #t)))
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







;; -----------------------------------------------------
;; (Conditionals)

;; meal-size : dillo -> number
;; produce number of calories needed per meal for given dillo
(check-expect (meal-size dead-dillo) 0)
(check-expect (meal-size big-dillo) 800)
(check-expect (meal-size (make-dillo 3 false)) 500)

(define (meal-size adillo)
  (cond [(dillo-dead? adillo) 0]
        [(< (dillo-length adillo) 12) 500]
        [else 800]))

