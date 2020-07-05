import org.junit.*;
import static org.junit.Assert.*;

public class DilloTest
{
    Dillo babyDillo = new Dillo(8, false);
    Dillo adultDillo = new Dillo(24, false);
    Dillo hugeDeadDillo = new Dillo(65, true);
    
	// check that small live dillos can't shelter no matter what size
	@Test
	public void testBabyShelter() {
		assertFalse(babyDillo.canShelter(5));
		assertFalse(babyDillo.canShelter(60));
	}

	// check that large dead dillos can shelter
	@Test
	public void testHugeDeadShelter() {
		assertTrue(hugeDeadDillo.canShelter(60));
		assertFalse(babyDillo.canShelter(100));
	}

    @Test
    public void testMealSize() {
        assertEquals(500, babyDillo.mealSize());
        assertEquals(800, adultDillo.mealSize());
        assertEquals(0, hugeDeadDillo.mealSize());
    }
}
