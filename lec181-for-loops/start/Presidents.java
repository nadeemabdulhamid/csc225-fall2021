
// Demonstrates the use of arrays

public class Presidents {
    public static void main(String[] args) {
        // another way to initialize an array of fixed size
        // if the initial values are all known
        String[] names = { "George Washington", "John Adams", "Thomas Jefferson", "James Madison", "James Monroe" };

        int index = 0; // loop initialization
        while (index < names.length) { // loop condition
            System.out.println(names[index]); // body of the loop (what you actually want to do with each element)

            index = index + 1;         // loop update
        }

        System.out.println("\n ======= \n");

        int countNamesStartWithJ = 0;   // accumulator 
        int i = 0;    // index variable
        while (i < names.length) {
            /* loop body ... */
            if (names[i].startsWith("J")) {
                countNamesStartWithJ++;
                // ___++; is shorthand for  __ = __ + 1;
                // countNamesStartWithJ = countNamesStartWithJ + 1;
            }
            /* ... to here */

            i++;  // don't forget to update the index variable!   
        }

        System.out.println( countNamesStartWithJ + " names start with J.");
    }
}
