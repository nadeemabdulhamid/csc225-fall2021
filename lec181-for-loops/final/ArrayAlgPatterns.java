import static org.junit.Assert.*;
import org.junit.*;

public class ArrayAlgPatterns {

    // Determining the minimum or maximum value in an array, or the sum
    // --> define an accumulator variable to keep track of result as you loop through the array
    @Test
    public void findMin() {
        int[ ] values = {6, 2, -1, 7, -12, 5};
        int min = values[0];   // initialize `min` to the first element
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            if (val < min) {  // found a new `min`!
                min = val;
            }
        }

        assertEquals(-12, min);
    }

    // Shifting or rotating elements left or right, or moving them around (e.g. reversing)
    @Test
    public void rotateLeft() {
        int[ ] values = {6, 2, -1, 7, -12, 5};

        int first = values[0];  // save the first because it's spot is going to be overwritten
        for (int i = 0; i < values.length - 1; i++) { // note: stopping one before the last (... - 1)
            values[i] = values[i+1];                  // otherwise [i+1] will be out of bounds of the array
        }
        values[values.length - 1] = first;  // put the original `first` in the last position

        assertArrayEquals( new int[] {2, -1, 7, -12, 5, 6},  values );
    }

    // Determine if at least one element has a particular property
    // or Search for a particular element in the array (that has a particular property)
    // or Determine the number of elements meeting specific criteria
    @Test
    public void isDivisibleBy4() {
        int[ ] values = {6, 2, -1, 7, -12, 5};

        boolean found = false;  // if just need to determine, you can use a boolean "accumulator"
        int pos = -1;        // if you need a position or a count, prepare an `int` variable to save result(s)

        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            if (val % 4 == 0) {
                found = true;   // update this fact
                pos = i;        // or store the position
                break;       // stops the loop immediately and jumps to the code right after it
            }
        }
        // code continues running from here if the `break` statement is executed ...

        assertTrue(found);
        assertEquals(4, pos);
        assertEquals(-12, values[pos]); // the position can be used to extract the actual element of the array
    }

}