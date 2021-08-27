# **Lecture 2: Defining Simple Methods • Using Conditionals**

# Objectives

## KNOW:
- Methods in Java correspond to functions in Racket
- Methods have an implicit `this` parameter in Java 
- *JUnit* is a common testing framework used in Java
- How to write comments in Java

## BE ABLE TO:
- Define methods in a Java class
- Write tests cases using JUnit

---
# Watch (before class)

- [Defining Methods](https://mediaspace.berry.edu/media/lecture2a-defining-methods/0_z52p0tey) [22 mins]
- [Conditionals in Java](https://mediaspace.berry.edu/media/lecture2b-conditionals/0_2g6x51dz) [8 mins]

--- 
# Practice (in class)

1. Consider the following problem:

    *. . . Develop a program that keeps track of coffee sales at a specialty coffee seller. The sales receipt must include the kind of coffee, its price (per pound), and its weight (in pounds). . .*

    The program may have to deal with hundreds and thousands of sales. Unless a programmer keeps all the information about a coffee sale together in one place, it is easy to lose track of the various pieces. More generally, there are many occasions when a programmer must represent several pieces of information that always go together.

    The class definition below collects the information about a coffee sale:

        // represents a line item in a coffee sale
        public class Coffee {
            String kind;
            int price; // cents per pound
            int weight; // pounds
            
            Coffee(String kind, int price, int weight){
                this.kind = kind;
                this.price = price;
                this.weight = weight;
            }
        }

    Here are some examples:

        Coffee kona = new Coffee("Kona",2095,100);
        Coffee ethi = new Coffee("Ethiopian", 800, 1000);
        Coffee colo = new Coffee("Colombian", 950, 20);

    - Add a method named **`cost`** to the class that returns the total cost of this coffee purchase. Here’s a stub:    

          /** computes the total cost of this coffee purchase [in cents] */
          int cost() { ... this ... } 

      The cost computation should take into account bulk discounts as described below. (Use an if/else if construct for this.)

        *. . . Develop a program that computes the cost of selling bulk coffee at a specialty coffee seller from a receipt that includes the kind of coffee, the unit price, and the total amount (weight) sold. If the sale is for less than 5,000 pounds, there is no discount. For sales of 5,000 pounds to 20,000 pounds, the seller grants a discount of 10%. For sales of 20,000 pounds or more, the discount is 25%. . .*

    - Now consider this:

      *. . . The coffee shop owner may also wish to find out whether some coffee sale involved more weight than some given coffee sale. . . .*

        Here is a stub/template and some examples. Look carefully at what is going on. Note how the highlighted words in the purpose comment refer to the implicit and explicit parameters.

            /** to determine whether _this_ coffee sale is lighter than _that_ coffee sale */
            boolean lighterThan(Coffee that) {
                ... this.kind ... that.kind ... // String 
                ... this.price ... that.price ... // int
                ... this.weight ... that.weight ... // int
            }

          // examples/tests
          new Coffee("Kona", 2095, 100).lighterThan(new Coffee("Columbian", 950, 200) ) ==> true 

          new Coffee("Ethiopian", 800, 1000).lighterThan(new Coffee("Columbian", 950, 200) ==> false




1. Start with the following class definition:

    class Planet {
        String name;
        double distToSun;
        double relGravity;
        
        Planet (String name, double distToSun, double relGravity) {
            this.name = name;
            this.distToSun = distToSun;
            this.relGravity = relGravity;
        }  
    }

- Add a method `convertWeight` that takes the weight of an object on earth (as a number of type `double`) and produces the corresponding weight on the planet. Since the class has the planet’s gravity relative to earth’s, you just need to multiply the given weight by the relative gravity to get the answer for this method.

- Add a method `fartherFromSun` that takes a planet and produces a `boolean` indicating whether *this* planet is farther from the sun than the planet given as input.




---
# Assignment

- [Here](work/hw020.md)


---
# Video Notes

- Continuing to develop the 'dillo' class from lecture 1...
   - Java methods are analogues to functions in Racket and need to be defined within the scope of a class definition
   - When defining a method
      - The type of the result of a method comes first
      - The name of the method is second
      - Parentheses `( ... )` come next containing the methods parameters
         - Before the name of the parameter, declare the type
         - Multiple parameters are separated by commas
      - Curly brackets `{ ... }` encapsulate the body of the method
         - Java requires an explicit `return` statement followed by a `;`
   - Purpose comments come before a method, commented out using either double slashes `//` to comment out one line or a pair of slash stars `/* ... */` to create a block comment
   - In BlueJ, using double stars `/** ... */` creates a doc comment that can be used to create html documentation for your code
- Opening the `DilloTest` class...
   - Class methods can be tested using a counterpart method in a Test class
   - When using `assertEquals( ... )`
      - `assertEquals` tests to see if two given parameters are equal to one another
      - The expected result is supposed to come first followed by a comma
      - The expression we want to evaluate comes next
   - Everything in Java is based on objects
      - First write the object you want to apply the method on
      - Then a `.`
      - Then the name of the method and its accompanying parameter(s)
- Coming back to the `dillo` class..
   - selector expressions are articulated by `this` `.` and then a field such as `length`
   - `this` is a parameter name of every method in Java as there is always an implicit `this` object parameter that is the same type of the class you are coding in
- Back to the test class...
   - In BlueJ, if we have defined examples in our Test class, right-clicking on the test class in the GUI and selecting the option `Object Bench to Test Fixture` puts those defined objects in the object bench
   - Objects in the object bench have their own values for fields and can be interacted with
- The implicit this in a Java method refers to the object a method is being used on
- In Java, computation is written so that the operand is between the objects so `1 + 2` instead of the Racket style `(+ 1 2)`
- A `return` expression is needed prior to returning the desired result in a method

--- 
## Java Naming Conventions (for this class)

- **Class** names are in camel case (the first letter of each multi-word name is capitalized, as in `CamelCaseText`)

- **Field** and **identifier** names are in mixed case (the first letter of each word after the first is capitalized, as in `usesMixedCase`)
  
- **Method** names start with verbs and are in mixed case
  
- **Predicate** names are prefixed with `is` or `has` and are in mixed case
  
- **Interface** (next lecture) names are in camel case preceded by a capital letter `I`
  
- **Constants** are in `ALL_CAPS` with underscores to separate words


---
## Conditionals Syntax

### Simple two-way decision

     if ( <condition> ) {
         <statements>
     } else {
         <statements>
     }

### Multi-way decisions

    if ( <condition> ) {
        <statements>
    } else if ( <condition> ) {
       <statements>
    } else if ( <condition> ) {
       <statements>
    ...
    } else {
        <statements>
    }



---
# Credits

A large amount of material introduced in the first half of this course has been adopted and derived from materials prepared and developed by:

- **Kathi Fisler, et al. CS 2102: Object-Oriented Design Concepts @ Worcester Polytechnic Institute**
https://web.cs.wpi.edu/~cs2102/d17/Lectures/migrate.html

- **Leena Razzaq, Viera Proulx, et al. CS 2510: Fundamentals of Computer Science 2 @ Northeastern University**
https://course.ccs.neu.edu/cs2510/index.html

---
# Misc
