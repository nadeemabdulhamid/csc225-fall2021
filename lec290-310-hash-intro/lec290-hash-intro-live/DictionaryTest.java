import static org.junit.Assert.*;

import org.junit.Test;

public class DictionaryTest {

	@Test
	public void test() {
		
		Dictionary d = new Dictionary();
		                         //         length
		d.insert("computer");   //          --->  8
		d.insert("phone");      //          -->   5
		d.insert("mask");       //          ---> 4
		d.insert("window");
		d.insert("apple");      //          --> 5  * collision
		d.insert("skam");
				
		assertEquals(true, d.contains("apple"));
		assertEquals(false, d.contains("ipad"));
		assertEquals(true, d.contains("mask"));
	}

}
