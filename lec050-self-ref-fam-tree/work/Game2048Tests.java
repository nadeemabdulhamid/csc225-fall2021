import org.junit.*;
import static org.junit.Assert.*;

public class Game2048Tests {
    
    GamePiece b2 = new BaseTile();
    GamePiece b4 = new BaseTile(4);
    GamePiece b8 = new BaseTile(8);
    GamePiece b16 = new BaseTile(16);
    GamePiece m4 = new MergeTile(b2, b2);
    GamePiece m12 = new MergeTile(b4, b8);
    GamePiece m16 = new MergeTile(b8, new MergeTile(b4, b4));

    GamePiece m64 = new MergeTile(new MergeTile(m16, b16),
                                  new MergeTile(m16, m16));

    @Test
    public void testGetValue() {
        assertEquals(2, b2.getValue());
        assertEquals(4, m4.getValue());
        assertEquals(12, m12.getValue());
        assertEquals(16, m16.getValue());
    }

    @Test
    public void testBiggestBase() {
        assertEquals( b4, b4.biggestBase() );
        assertEquals( b2, m4.biggestBase() );
        assertEquals( b8, m12.biggestBase() );
        assertEquals( b8, m16.biggestBase() );
        assertEquals( b16, m64.biggestBase() );
    }

    @Test
    public void testMerge() {
        assertTrue( b4.canMerge(b4) );
        assertTrue( b4.canMerge(m4) );
        assertFalse( b4.canMerge(b8) );
    }

    @Test
    public void testValid() {
        assertTrue( b2.isValid() );
        assertTrue( m4.isValid() );
        assertTrue( m64.isValid() );
        assertFalse( m12.isValid() );
    }

    @Test
    public void testToString() {
        assertEquals("(2)", b2.toString());
        assertEquals("(16)", b16.toString());
        assertEquals("[(8)|[(4)|(4)]]", m16.toString());
    }
}

