import static org.junit.Assert.*;
import org.junit.*;

public class LoNTest
{
    ILoN mt = new MTLoN();
    ILoN somePrimes = new ConsLoN( 2,
                       new ConsLoN( 5,
                        new ConsLoN( 7, 
                         new ConsLoN( 17, mt ))));
    ILoN somePrimesNeg = new ConsLoN( -2,
                       new ConsLoN( -5,
                        new ConsLoN( -7, 
                         new ConsLoN( -17, mt ))));                     
    
    @Test
    public void test() {
        assertEquals( 0 , mt.length() );
        assertEquals( 4 , somePrimes.length() );
        assertEquals( 5 , new ConsLoN(19, somePrimes).length() );

        assertEquals( 0 , mt.total() );
        assertEquals( 31 , somePrimes.total() );
        
        //assertEquals( 0 , mt.largest() );
        assertThrows(EmptyListException.class, () -> mt.largest());
        
        assertEquals( 17 , somePrimes.largest() );
        assertEquals( -2 , somePrimesNeg.largest() );
        assertEquals( 0, new ConsLoN(0, somePrimesNeg).largest() );
    }
}
