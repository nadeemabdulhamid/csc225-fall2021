;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname animals) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #t)))

;; -----------------------------------------------------
;; (Compound Data)

; A Dillo is (make-dillo number boolean)
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

; can-shelter : dillo -> boolean
; determine whether dillo is dead and larger than given person length (inches)
(define (can-shelter a-dillo person-length)
  (and (dillo-dead? a-dillo)
       (> (dillo-length a-dillo) person-length)))

;;; Test cases
(check-expect (can-shelter baby-dillo 60) false)
(check-expect (can-shelter huge-dead-dillo 60) true)




;; meal-size : dillo -> number
;; produce number of calories needed per meal for given dillo
(define (meal-size adillo)
  (cond [(dillo-dead? adillo) 0]
        [(< (dillo-length adillo) 12) 500]
        [else 800]))



;; -----------------------------------------------------
;; (Another Structure)

; A Boa is (make-boa String Number String)
(define-struct boa (name length eats))

(define nice-boa (make-boa "Slim" 20 "lettuce"))
(define mean-boa (make-boa "Slinky" 36 "pets"))


;; likes-same-food? : Boa Boa -> boolean
;; determine if both boa's like the same food

(check-expect (likes-same-food? nice-boa mean-boa) false)
(check-expect (likes-same-food? nice-boa (make-boa "Sammie" 12 "lettuce")) true)

(define (likes-same-food? a-boa other-boa)
  (string=? (boa-eats a-boa) (boa-eats other-boa)))



;; -----------------------------------------------------
;; (Mixed Data)

;; An Animal is either:
;;  - a Boa, or
;;  - a Dillo



;; -----------------------------------------------------
;; (Function over Mixed Data)

;; normal-size? : animal -> boolean
;; determine whether animal is within an expected size range
(check-expect (normal-size? baby-dillo) false)
(check-expect (normal-size? mean-boa) true)

(define (normal-size? an-ani)
  (cond [(boa? an-ani) (and (<= 30 (boa-length an-ani))
                            (<= (boa-length an-ani) 60))]
        [(dillo? an-ani) (and (<= 12 (dillo-length an-ani))
                              (<= (dillo-length an-ani) 24))]))
  


;; -----------------------------------------------------
;; (Nested Structures)

;; A Cage is (make-cage Number Animal)
(define-struct cage (size resident))

(make-cage 10 baby-dillo)
(make-cage 50 mean-boa)




