;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-lambda-reader.ss" "lang")((modname famtree) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))

;; -----------------------------------------------------
;; (Family Trees)

; A FamTree is
; (make-unknown)
; (make-person string FamTree FamTree)
(define-struct unknown ())
(define-struct person (name mother father))

(define ft1
  (make-person "Bart"
               (make-person "Marge" (make-unknown) (make-unknown))
               (make-person "Homer" (make-unknown)
                            (make-person
                             "Abe"
                             (make-unknown)
                             (make-unknown)))))


;; count-name : FamTree -> Number
;; produce number of people in family tree with given name

