import static org.junit.Assert.*;
import org.junit.*;

public class FamTreeTests {

    IFamTree bart = new Person("Bart", 
            new Person("Marge", new Unknown(), new Unknown()),
            new Person("Homer", 
                new Unknown(), 
                new Person("Abe", new Unknown(), new Unknown())));

    IFamTree bart2 = new Person("Bart", 
            new Person("Marge"), new Person("Homer", 
                                        new Unknown(), 
                                        new Person("Abe")));
    
    @Test
    public void testCountName() {
        assertEquals(1 , new Person("Bart").countName("Bart"));
        assertEquals(0 , new Person("Abe").countName("Bart"));
        assertEquals(0 , new Unknown().countName("Bart"));
        assertEquals(1, bart.countName("Abe"));
        assertEquals(0, bart.countName("Lucy"));
        assertEquals(2, new Person("Homer", new Unknown(), bart2).countName("Homer"));
    }
}
