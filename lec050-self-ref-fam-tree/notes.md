# Lecture 5: Self-Referential Data • Overloading Constructors

# Objectives

## KNOW:
- That Java classes can be self-referential to capture data that contains references to itself.
- That Java programs should not have conditionals that check the type of an object.
- The “template” for Java methods contains **recursive** method calls on the self-referential fields of the `this` object.
- That you can **overload** constructor definitions in Java
  
## BE ABLE TO:
- Define classes to represent self-referential data


---
# Watch (before class)

- [Self-referential data; Overloading constructors](https://mediaspace.berry.edu/media/lecture4-self-ref/1_s8hxs38k) [18 mins]
- [Delegating to helper methods](https://mediaspace.berry.edu/media/self-ref-delegate/1_azkq8gpi) [7 mins]
- [Accumulators with helper methods]() [tbp]



--- 
# Practice (in class)



---
# Assignment (for homework)

- [Here](work)



---
# Video Notes

- So far in class, have covered:
  - How to define classes in Java to model data
  - Write methods
  - Make decisions
  - Represent unions of classes (using interfaces)
  - Nested data
  - Concept of types in Java

- In this screencast: Self-referential data (something we've done a lot from CSC120 - 
            so we'll pick up an example from there and carry it over to Java)
- "Overloading" constructor definitions: defining multiple versions of a constructor, for convenience and flexibility

- Family tree example from CSC 120 (hopefully familiar...); remember the arrows in the data definition!
- Interface for family tree type; two classes: Unknown and Person

- In BlueJ, can create a test class that is not bound to a particular other class or interface for testing - use the "New class" button

- Constructors (and methods) can be *overloaded* as long as the parameters are different

---
# Credits

A large amount of material introduced in the first half of this course has been adopted and derived from materials prepared and developed by:

- **Kathi Fisler, et al. CS 2102: Object-Oriented Design Concepts @ Worcester Polytechnic Institute**
https://web.cs.wpi.edu/~cs2102/d17/Lectures/migrate.html

- **Leena Razzaq, Viera Proulx, et al. CS 2510: Fundamentals of Computer Science 2 @ Northeastern University**
https://course.ccs.neu.edu/cs2510/index.html
    - https://course.ccs.neu.edu/cs2510/lecture6.html
