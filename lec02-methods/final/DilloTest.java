import org.junit.*;
import static org.junit.Assert.*;

public class DilloTest
{
    Dillo babyDillo = new Dillo(8, false);
    Dillo adultDillo = new Dillo(24, false);
    Dillo hugeDeadDillo = new Dillo(65, true);
    
    @Test
    public void testCanShelter() {
       assertEquals(false, babyDillo.canShelter(60));
       assertEquals(true, hugeDeadDillo.canShelter(60));
    }

    @Test
    public void testMealSize() {
        assertEquals(500, babyDillo.mealSize());
        assertEquals(800, adultDillo.mealSize());
        assertEquals(0, hugeDeadDillo.mealSize());
    }
}
