# Lecture 6: More Recursion • More Methods: `main`, `static`

# Objectives

## KNOW:
- The difference between _instance_ methods and _static_ methods 
- How to invoke `static` methods
  
## BE ABLE TO:
- Write a program with a simple text-based input/output interface for the user
- Define a `main` method for a class


---
# Watch (before class)

[**Starter Code**](https://github.com/nadeemabdulhamid/csc225-fall2020/tree/master/lec060-question-tree/start)

- [Quick intro to textual input/output](https://youtu.be/G6BHnfZmm-4) [4 mins]
- [Question Game](https://youtu.be/ubFXb5WZHcA) [25 mins]
- [Adding a `main` method](https://mediaspace.berry.edu/media/lecture4ext-questiongame-main/1_3z9ds5wr) [10 mins]
- [Explanation of `static` methods](https://mediaspace.berry.edu/media/lecture4ext-static-methods/1_5vj3mz4b) [12 mins]

[**Final Code**](https://github.com/nadeemabdulhamid/csc225-fall2020/tree/master/lec060-question-tree/final)


---
# Assignment

- [Here](work)

---
# Video Notes

Text-based (Console) Input/Output (I/O)
- Output: 

      System.out.println("whatever you want to print here");
      
- Input:
  1. Import the `Scanner` class
  2. Create a `Scanner` object (usually in the `main` method only) that is initialized to `System.in` 
  3. Use `Scanner` methods, like `nextLine`, `nextInt`, etc. to read an input message from the user.
  
         import java.util.Scanner;
         Scanner sc = new Scanner(System.in);
         ...
         String line = sc.nextLine();
        
