import static org.junit.Assert.*;
import org.junit.*;

public class FamTreeTests {

    IFamTree bart = new Person("Bart", 1985,
            new Person("Marge", 1956, new Unknown(), new Unknown()),
            new Person("Homer", 1956,
                new Unknown(), 
                new Person("Abe", 1903, new Unknown(), new Unknown())));

    IFamTree bart2 = new Person("Bart", 1958,
            new Person("Marge", 1965), new Person("Homer", 1956,
                                        new Unknown(), 
                                        new Person("Abe", 1903)));
    
    @Test
    public void testCountAncestor() {
        assertEquals(0, new Unknown().countAncestors());
        assertEquals(3, bart.countAncestors());
    }

    @Test
    public void testCountName() {
        assertEquals(1 , new Person("Bart", 1985).countName("Bart"));
        assertEquals(0 , new Person("Abe", 1903).countName("Bart"));
        assertEquals(0 , new Unknown().countName("Bart"));
        assertEquals(1, bart.countName("Abe"));
        assertEquals(0, bart.countName("Lucy"));
        assertEquals(2, new Person("Homer", 1956, new Unknown(), bart2).countName("Homer"));
    }
}
