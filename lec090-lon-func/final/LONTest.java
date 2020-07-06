import static org.junit.Assert.*;
import org.junit.*;

public class LONTest {
	ILoN mt = new MTLoN();
	ILoN one = new ConsLoN(78, mt);
	ILoN two = new ConsLoN(90, one);
	ILoN four = new ConsLoN(65, new ConsLoN(100, two));

	ILoN gradebook = four;
	ILoN gradebook2 = new ConsLoN(87, gradebook); // TO DO: draw a memory map at this point

	@Test
	public void testLength() {
		assertEquals(0, mt.length());
		assertEquals(4, four.length());
	}

	@Test
	public void testTotal() {
		assertEquals(78, one.total());
		assertEquals(333, four.total());
	}

	@Test
	public void testLargest() {
		assertEquals(0, mt.largest());
		assertEquals(78, one.largest());
		assertEquals(100, four.largest());
	}
}