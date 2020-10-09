# Lecture 23: Stack Applications

# Objectives

## KNOW:
- some common applications of stacks
  
## BE ABLE TO:
- parse and evaluate arithmetic expressions using stacks

---
# Watch (before class)

- [Evaluating Postfix Expressions](https://mediaspace.berry.edu/media/lecture18-postfix-eval/1_w3x58xc9) [11 mins]

- [Converting (Fully Parenthesized) Infix Expressions to Postfix](https://mediaspace.berry.edu/media/lecture18-infix-to-postfix/1_l3ysgcgm) [~8 mins]
  
- Watch the following demo of a classic two-stack algorithm: [https://algs4.cs.princeton.edu/lectures/demo/13DemoDijkstraTwoStack.mov](https://algs4.cs.princeton.edu/lectures/demo/13DemoDijkstraTwoStack.mov)
    - Here is the code for it: https://algs4.cs.princeton.edu/13stacks/Evaluate.java.html
    - And here is some code for a fancier implementation that incorporates precedence rules (so the expressions don't have to be fully parenthesized):
        https://algs4.cs.princeton.edu/13stacks/EvaluateDeluxe.java.html 
        
        This just shows one approach to handling precedence. Instead of using a Map (which we haven't talked about yet) you could just use a helper function that produces the precedence value of an operator as a number (using if/else if statements).


---
# Assignment

- [Here](work/hw230.md)


---
# Notes/Links


