;Average of numbers
(defn average
  [numbers]
  (/ (apply numbers) (count numbers) ))

;Print Name given name
(defn print_name
  [name]
  println name)

;Counter example
(defn counter []
  (def x 1)
  (inc x))

;System Environment 
(System/get("ENV"))

;Regular Expressions 
 (re-seq #"." "foo bar")

 ;symbol
 (symbol? (quote x))

 ;symbol , Differences for the symbol and integer 
 (var? (def x 10))
 ;= true 
 (integer? x)
 ;= true 
 (list? '(+ 1 3 4))
 ;=true

 ;let bindings 
 (defn hypot
  [x y]
  (let ([x2 (* x x)
     y2 (* y y)]
     (Math/sqrt (+ x2 y2)))))

 ;Destructuring let. 
 (def v [42 "foo" 99.2 [5 12]])
 (first v)
 (second v)
 (nth v 2)
 (.get v 2)

 ;Adding the values 
 (+ (.get v2) (v2))

 ;Destructuring feature 
 (def v [42 "foo" 99.2 [5 12]])
;= #'user/v
(let [[x y z] v]
(+ x z))
;Above code can be written as 
(let [x (nth v 0)
y (nth v 1)
z (nth v 2)]
(+ x z))