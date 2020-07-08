
// Demonstrates the use of arrays

public class Presidents {
    public static void main(String[] args) {

        // ================================================= //
        // DECLARING, CONSTRUCTING, INITIALIZING ...

        String[] names; // declaration of a variable that will refer to an array
        names = new String[5]; // actually construct the array
        // String[] names = new String[5]; // can combine declaration and construction

        int num = 5;
        names = new String[num]; // can construct using variable value as size
        // but once constructed, the size cannot be changed!

        // TO DO: draw an object diagram (memory map)

        // fill in values in the array
        names[0] = "George Washington"; // index starts at 0
        names[1] = "John Adams";
        names[2] = "Thomas Jefferson";
        names[3] = "James Madison";
        names[4] = "James Monroe";

        // another way to initialize an array of fixed size
        // if the initial values are all known
        String[] firstFive = { "George Washington", "John Adams", "Thomas Jefferson", "James Madison", "James Monroe" };


        // ================================================= //
        // ACCESSING ELEMENTS

        // use the [...] operator to access existing values...
        String firstPres = names[0];

        // or to update (*mutate*) values

        // assertEquals( "Thomas Jefferson", names[2] ); <--- before
        names[2] = "TJ";
        // assertEquals( "TJ", names[2] ); <--- after

        
        // ================================================= //
        // ARRAY TRAVERSAL

        // the benefit of arrays is ability to LOOP through
        // all the elements, usually accessing them by index:

        int index = 0; // loop initialization
        while (index < names.length) { // loop condition
            System.out.println(names[index]); // body of the loop (what you actually want to do with each element)

            index = index + 1;         // loop update
        }

        //  note use of  `____.length` to access the number of elements

        // next lecture, we'll see an more common, alternate loop form to the `while` above


        // ================================================= //
        // ANOTHER EXAMPLE

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
