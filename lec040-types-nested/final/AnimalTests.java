
import static org.junit.Assert.*;
import org.junit.*;

public class AnimalTests {

    Dillo babyDillo = new Dillo(8, false);
    Dillo adultDillo = new Dillo(30, true);
    Boa adultBoa = new Boa("Sammy", 12, "Cheetos");
    Boa meanBoa = new Boa("Slinky", 36, "pets");
    Boa thinBoa = new Boa("Slim", 24, "lettuce");

    Cage cage30 = new Cage(30, adultBoa);
    Cage cage18 = new Cage(18, new Dillo(15, true));

    @Test
    public void testIsSpecialCageSize() {
        assertTrue(cage30.isSpecialCageSize());
        assertFalse(cage18.isSpecialCageSize());
    }

    @Test
    public void testLikesSameFood() {
        Boa sameFoodBoa = new Boa("Fred", 20, "Cheetos");
        assertTrue(adultBoa.likesSameFood(sameFoodBoa));

        Boa diffFoodBoa = new Boa("Fred", 20, "Cheerios");
        assertFalse(adultBoa.likesSameFood(diffFoodBoa));
    }

    @Test
    public void testIsNormalSize() {
        assertEquals(false, babyDillo.isNormalSize());
        assertEquals(true, new Dillo(20, true).isNormalSize());
        assertEquals(false, adultBoa.isNormalSize());
        assertEquals(true, meanBoa.isNormalSize());
    }

    @Test
    public void testCanShelterFalse() {
        assertFalse(adultDillo.canShelter(80));
        assertFalse(babyDillo.canShelter(5));
        assertFalse(babyDillo.canShelter(60));
    }

    @Test
    public void testCanShelterTrue() {
        assertTrue(adultDillo.canShelter(10));
    }

    @Test
    public void testCanShelterEdge() {
        assertFalse(adultDillo.canShelter(30));
    }

}
