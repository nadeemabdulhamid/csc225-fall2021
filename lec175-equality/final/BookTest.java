import static org.junit.Assert.*;
import org.junit.*;

import java.util.LinkedList;

public class BookTest {

	@Test
	public void testEqEqTrue() {
		Book hamletBook = new Book("Hamlet", "PR2807.A2");
		// fails: 
		// assertTrue( hamletBook.checkOut() == new Book ("Hamlet", "PR2807.A2", 1, false) );
	}

	@Test
	public void testEqualsTrue() {
		Book hamletBook = new Book("Hamlet", "PR2807.A2");
		assertTrue( hamletBook.checkOut().equals(new Book ("Hamlet", "PR2807.A2", 1, false)) );
	}

	@Test
	public void testEqEqFalse() {
		Book hamletBook = new Book("Hamlet", "PR2807.A2");
		assertFalse( hamletBook.checkOut() == new Book ("Hamlet", "PR2807.A2", 1, false) );
	}

	@Test
	public void testEqualsFalse() {
		Book hamletBook = new Book("Hamlet", "PR2807.A2");
		LinkedList<Book> list1 = new LinkedList<Book>();
		
		assertEquals( hamletBook, hamletBook.checkOut() );
		assertNotEquals( hamletBook, list1 );
	}
	
	@Test
	public void testListEquality() {
		  LinkedList<Book> list1 = new LinkedList<Book>();
		  LinkedList<Book> list2 = new LinkedList<Book>();
		  LinkedList<Book> list3 = new LinkedList<Book>();
		  LinkedList<Book> list4 = new LinkedList<Book>();
		  
		  Book javaBook = new Book("Effective Java", "QA76.73 J38 B57");
		  Book hamletBook = new Book("Hamlet", "PR2807.A2");
		  
		  list1.add(hamletBook);
		  list1.add(javaBook);
		  
		  list2.add(javaBook);
		  list2.add(hamletBook);
		  
		  list3.add(hamletBook);
		  list3.add(javaBook);
		  
		  list4.add(new Book("Hamlet", "PR2807.A2"));
		  list4.add(javaBook);
		  
		  assertTrue(list1.equals(list3));
		  assertTrue(list1.equals(list4));

		  assertEquals(list1, list3);		// uses  .equals
		  assertNotSame(list1, list3);      // uses     == 
	}
}
