import static org.junit.Assert.*;
import org.junit.*;

public class AnimalsTests {
	IAnimal deadDillo = new Dillo(2, true);   
	IAnimal bigDillo = new Dillo(6, false);
	IAnimal boa1 = new Boa("Slinky", 6, "pets");
	IAnimal boa2 = new Boa("Slim", 4, "lettuce");
	
	@Test
	public void testNormalSize() {
		assertFalse( bigDillo.isNormalSize() );
		assertTrue( boa1.isNormalSize() );
	}

}
