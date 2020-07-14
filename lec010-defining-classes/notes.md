
# **Lecture 1: Defining Simple Classes**

# Objectives

## KNOW:
- That a struct in Racket is represented as a class in Java
- In Java, everything (data definitions, function definitions, unit tests) is part of a class
- Examples of data and test methods go in their own class

## BE ABLE TO:
- Define a Java class to represent data such as that captured by structure definitions in the student languages of CSC120 (Racket)

---

# Credits

A large amount of material introduced in the first half of this course has been adopted and derived from materials prepared and developed by:

- **Kathi Fisler, et al. CS 2102: Object-Oriented Design Concepts @ Worcester Polytechnic Institute**
https://web.cs.wpi.edu/~cs2102/d17/Lectures/migrate.html

- **Leena Razzaq, Viera Proulx, et al. CS 2510: Fundamentals of Computer Science 2 @ Northeastern University**
https://course.ccs.neu.edu/cs2510/index.html


---
# Watch (before class)

- [Migrating to Java: Introduction to CSC225 & Review from CSC120](https://mediaspace.berry.edu/media/lecture1a-racket-review/1_c04s24lh) [3 mins]
- [Defining Simple Classes](https://mediaspace.berry.edu/media/lecture1b-simple-classes/1_8sc7yi5x) [14 mins]


---
# Practice (for class)
<sub><sup>(https://web.cs.wpi.edu/~cs2102/d17/PracticeProblems/simple-classes.html)</sup></sub>

Try these problems, don’t just look at the answers. If you do look at the answers and find you made mistakes, write the answers out again by hand, even if you are mostly copying the answers. People learn differently from writing versus reading details: you are much more likely to absorb the pattern of defining classes if you actually write it down yourself. If you type instead of write by hand, don’t use cut and paste. You actually have to write out the characters yourself to help you absorb the patterns.

## Tasks

- Create a class that captures **students**. Each student has a first name, last name, class year, and major. Create two examples of students.

- Create a class that captures **planets**. Each planet has a name, a distance from the sun, and its gravity relative to Earth’s gravity. For distance and gravity, use the type double which captures real numbers. Make objects for Earth and your favorite non-earth planet.

- Create classes that capture **bank customers** and **bank accounts**. A customer has a first and last name. An account has a customer and a balance. Make objects for two accounts held by the same customer.

- Create a class that captures **airline tickets**. Each ticket lists the departure and arrival cities, a flight number, and a seat assignment. A **seat assignment** has both a row and a letter for the seat within the row (such as 12F). Make two examples of tickets.

## Sample Solution

The `practice/PracticeTests.java` file in the code repository has classes defined for these exercises. You might have used different names for the fields, but your answers should have been close to this. The PracticeTests class is not complete, but just shows you one example of creating data in which one object contains another. Your Tests class should be much more extensive.

### Things to think about

- For seat assignments, you could use a string or you could make a seat-assignment class. What are the advantages and disadvantages of each approach?

- Is there any difference between two customers with the same data and two customers with different data?



---
# Assignment (for homework)





---
# Video Notes

- From `dillos.rkt` we'll convert the data definition into Java syntax.
- Create a new class either by the "New Class..." button or right-clicking in the project area.
- Class name corresponds to structure definition.
  - Java convention is to name classes starting with uppercase letter.
  - Class name should match the file name *exactly*.
- For now, delete the class definition stub that BlueJ initially provides. Let's write things from scratch.
- In Java, the types of each field must be provided in the code along with the name. Java checks for consistency of types to identify code errors before you run your program.
- Single-line comments with double-slash: `//` - good to provide an interpretation for individual fields.
- An overall data interpretation for the class as a whole should be provided as a comment above the `class` header. 
  - Use `/** .... */`  (special JavaDoc comment notation) or at least `/* ... */` for Java block comments.
- Java has more restrictions on identifiers than Racket:
  - Letters, numbers, underscore (no question mark `?`)
  - Use `camelCase` names, use `isBlahBlah` as a convention for Boolean fields
- In Java (unlike Racket), constructor & selector functions *do not* come "for free" -- you must write them yourself.
  - At first, this seems really tedious & redundant, but later we'll see how this gives you a lot of power & flexibility in your ability to define constructors
  - "Boilerplate pattern":  
    - name of constructor comes first in the declaration, must match the class -- literally copy/paste the name of the class
    - then, in parentheses, list **parameters** with same types and names as the fields
    - write **assignment statements** following the pattern
        ````this.varName = varName;````

- "Compile" the code - this checks for errors (typos) and then translates the code to binary for the computer to be able to run

- Creating example data in BlueJ
  - Interactively: right-click on the class block and select the constructor, `new Dillo(...)`. Fill in values for the constructor parameters. Provide a defined name for the object that appears in BlueJ's object bench. Double click on it to inspect field values. A little more GUI than DrRacket's Interactions window
  - The "Code Pad": is just like the Interactions in DrRacket. Type `new Dillo(...)` to create a new (unnamed) object. Use the arrow icon to define a name and have it appear in the Object Bench.

- A more persistent method of defining examples (that can be saved and used later for test cases, etc.)
  - Just defining examples of data, no tests yet
  - Right-click on the class block and choose "Create Test Class"
  - Leave `import` (like `require` statements in Racket) alone - the only type of statements not in the **scope** of the class. (Notice the shading BlueJ does to match curly brackets.)
  - Delete initial comment of the `DilloTest` class and everything *inside* the class.
  - Define example data with names for each.
    - Again, `camelCaseConvention`
  - Throw in a `fail` test stub (needs `public` annotation)

- Compile & Run tests



