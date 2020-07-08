import static org.junit.Assert.*;
import org.junit.*;

public class BookTest {

	@Test
	public void testEqEqTrue() {
		Book hamletBook = new Book("Hamlet", "PR2807.A2");
		// fails: !
		assertTrue( hamletBook.checkOut() == new Book ("Hamlet", "PR2807.A2", 1, false) );
	}

}
