;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname htdp-review) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))


;; -----------------------------------------------------
;;       A CSC120/How-to-Design-Programs Review


;; -----------------------------------------------------
;;  - Data and Computation
;;  - Design Recipe
;;    * Data analysis and definition
;;    * Signature, purpose, stub
;;    * Functional examples
;;    * Template
;;    * Body
;;    * Test



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




;; -----------------------------------------------------
;; (Self-referential and mutually-referential data: Lists and Trees)



;; A List-of-horses is either:
;;   - empty, or
;;   - (cons Horse List-of-horses)

#; ; template
(define (loh-func a-loh)
  (cond [(empty? a-loh) ...]
        [(cons? a-loh) (... (horse-func (first a-loh))
                            (loh-func (rest a-loh)) ...)]))



;; A Horse is (make-horse String Number Boolean [Listof Horse])
(define-struct horse (name foaled male? offspring))

(define B (make-horse "Black Maria" 1923 false empty))
(define S (make-horse "Sardanapale" 1911 true (list B)))
(define Q (make-horse "Quenouille" 1916 false empty))
(define P (make-horse "Prestige" 1903 true (list S Q)))


;; latest-year-of-birth : Horse -> Number
;; produce the latest year that any horse in
;; the given pedigree was foaled

(check-expect (latest-year-of-birth Q) 1916)
(check-expect (latest-year-of-birth P) 1923)

#|
(define (horse-func a-horse)
  (local [
          (define (loh-func a-loh)
            (cond [(empty? a-loh) ...]
                  [(cons? a-loh) (... (horse-func (first a-loh))
                                      (loh-func (rest a-loh)) ...)]))
          ]
    (... (horse-name a-horse)    -- String
         (horse-foaled a-horse)  -- Number
         (horse-male? a-horse)   -- Boolean
         (loh-func (horse-offspring a-horse)) ...)))
|#

(define (latest-year-of-birth a-horse)
  (local [
          (define (lyob/any a-loh)
            (cond [(empty? a-loh) (horse-foaled a-horse)]
                  [(cons? a-loh) (max (latest-year-of-birth (first a-loh))
                                      (lyob/any (rest a-loh)))]))
          ]
    (lyob/any (horse-offspring a-horse))))




;; -----------------------------------------------------
;;   - parametric data definitions [Listof X]
;;   - abstracting computation - higher-order functions
;;   - lambda expressions - computation as data


;; filly-names : Horse -> [Listof String]
;; produce a list of the female offspring of the given horse

(check-expect (filly-names P) (list "Quenouille"))

(define (filly-names a-horse)
  (map horse-name
       (filter (lambda (f) (not (horse-male? f)))
               (horse-offspring a-horse))))




;; -----------------------------------------------------
;; (Accumulator-style functions)

;; all-names : Horse -> [Listof String]
;; produce a list of names of all horses in the given pedigree

(check-expect (all-names P)
              (list "Prestige" "Sardanapale" "Black Maria" "Quenouille"))

(define (all-names a-horse)
  (local [
     (define (all-names/acc a-loh collected)
       (cond [(empty? a-loh) collected]
             [(cons? a-loh)
              (all-names/acc (rest a-loh)
                             (append collected
                                     (all-names (first a-loh))))]))]
    (all-names/acc (horse-offspring a-horse)
                   (list (horse-name a-horse)))))




;; -----------------------------------------------------
;; (Mutation and loops)

;; all-names$ : Horse -> [Listof String]
;; produce a list of names of all horses in the given pedigree

(check-expect (all-names$ P)
              (list "Prestige" "Sardanapale" "Black Maria" "Quenouille"))

(define (all-names$ a-horse)
  (local [
          (define collected (list (horse-name a-horse)))
          ]
    (begin
      (for-each (lambda (h)
                  (set! collected
                        (append collected (all-names$ h))))
                (horse-offspring a-horse))
      collected)))






