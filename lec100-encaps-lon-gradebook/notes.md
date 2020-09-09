# Lecture 10: Encapsulation/Information hiding • Mutation

# Objectives

## KNOW:
- how to design interfaces and classes to encapsulate data representations
  
## BE ABLE TO:
- define a simple encapsulated data type that updates its fields

---
# Watch (before class)

- [Gradebook: Using Lists](https://mediaspace.berry.edu/media/unit0-lecture07-gradebook/1_h4pqj3ki/97446781) [17 mins]


---
# In Class

- Today is a "catch-up" day. Use class to fix up and resubmit any outstanding work. If you are all caught up, you may work on the optional exercise below.

- There is no new homework for next class.

---
# Optional Exercises

- Take your `ArithmeticSeq` sequence class from `hw030` and have it implement the collection interface that you defined for `Set`s and `Bag`s from last class's homework. A class can implement multiple interfaces like this:

    ```
    class ArithmeticSeq implements ISequence, INumberCollection { ...
    ```

    For the `add` method, just `return this;` for now. Focus on getting the `in` method working. Here are some examples:

    ```
    ArithmeticSeq a1 = new ArithmeticSeq(10, 3);

    assertEquals(true, a1.in(10));
    assertEquals(true, a1.in(40));
    assertEquals(true, a1.in(16));

    assertEquals(false, a1.in(11));
    assertEquals(false, a1.in(7));
    assertEquals(false, a1.in(101));
    ```

    The [answer to this question](https://math.stackexchange.com/questions/3316647/arithmetic-sequence-find-if-a-number-is-in-a-sequence/3316653) may be helpful -- see the formula given at the very end of the top-most response.

    ---

- [Challenging] Now, can you get the `add` method implemented? This might require defining a new `class` which embeds a base sequence that has been extended with one or more additional arbitrary numbers. The new class will need to implement the `in` and `add` methods itself. 
