import static org.junit.Assert.*;
import org.junit.*;

public class DLLTests {

    DLList lst;

    @Before
    public void setupLst() {
        lst = new DLList();
        assertEquals("", lst.toString());
        assertEquals(0, lst.size());
        lst.addFirst(45);
        lst.addFirst(78);
        lst.addLast(31);
        lst.addFirst(59);
        lst.addLast(26);
    }
    
    @Test
    public void testAdd() {
        assertEquals(5, lst.size());
        assertEquals(true, lst.contains(31));
        assertEquals(false, lst.contains(61));
        assertEquals("59,78,45,31,26", lst.toString());
    }

    @Test
    public void testAddAfter() {
        lst.addAfter(78, 61);
        lst.addAfter(99, 11);
        assertEquals(6, lst.size());
        assertEquals(true, lst.contains(31));
        assertEquals(true, lst.contains(61));
        assertEquals(false, lst.contains(11));
        assertEquals("59,78,61,45,31,26", lst.toString());
    }

    @Test
    public void testRemove() {
        assertEquals(true, lst.contains(31));
        assertEquals(false, lst.contains(65));
        assertEquals(5, lst.size());
        lst.remove(31);
        lst.remove(65);
        assertEquals(4, lst.size());
        assertEquals(false, lst.contains(31));
        assertEquals(false, lst.contains(65));
        assertEquals("59,78,45,26", lst.toString());
    }

}