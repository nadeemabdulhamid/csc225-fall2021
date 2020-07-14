import org.junit.*;
import static org.junit.Assert.*;

public class SequenceTest {
    
    @Test
    public void testArith() {
        ArithmeticSeq a1 = new ArithmeticSeq(10, 3);
        ArithmeticSeq a2 = new ArithmeticSeq(1, 0);
        ArithmeticSeq a3 = new ArithmeticSeq(0, -5);

        ArithmeticSeq a1next = a1.advanceNext();
        ArithmeticSeq a2next = a2.advanceNext();
        ArithmeticSeq a3next = a3.advanceNext();

        assertEquals("increasing", a1.behavior());
        assertEquals("constant",   a2.behavior());
        assertEquals("decreasing", a3.behavior());

        assertEquals(10, a1.getCurrentValue());
        assertEquals(13, a1next.getCurrentValue());
        assertEquals(1,  a2next.getCurrentValue());
        assertEquals(-5, a3next.getCurrentValue());
    }

    @Test
    public void testGeo() {
        GeometricSeq s1 = new GeometricSeq(10, 3);
        GeometricSeq s2 = new GeometricSeq(4, 1);
        GeometricSeq s3 = new GeometricSeq(0, -5);
        GeometricSeq s4 = new GeometricSeq(2, -5);
        GeometricSeq s5 = new GeometricSeq(-10, 3);

        GeometricSeq s1next = s1.advanceNext();
        GeometricSeq s2next = s2.advanceNext();
        GeometricSeq s3next = s3.advanceNext();
        GeometricSeq s4next = s4.advanceNext();
        GeometricSeq s5next = s5.advanceNext();

        assertEquals("increasing", s1.behavior());
        assertEquals("constant",   s2.behavior());
        assertEquals("constant",   s3.behavior());
        assertEquals("alternating", s4.behavior());
        assertEquals("decreasing", s5.behavior());

        assertEquals(10, s1.getCurrentValue());
        assertEquals(30, s1next.getCurrentValue());
        assertEquals(90, s1next.advanceNext().getCurrentValue());
        assertEquals(4,  s2next.getCurrentValue());
        assertEquals(0, s3next.getCurrentValue());
        assertEquals(-10, s4next.getCurrentValue());
        assertEquals(-30, s5next.getCurrentValue());
    }

    
    // @Test
    public void testFib() {
        FibonacciSeq f1 = new FibonacciSeq();

        assertEquals(1, f1.getCurrentValue());
        assertEquals("increasing", f1.behavior());
        assertEquals(1, f1.advanceNext().getCurrentValue());
        assertEquals(2, f1.advanceNext().advanceNext().getCurrentValue());
        assertEquals(3, f1.advanceNext().advanceNext().advanceNext().getCurrentValue());
        assertEquals(5, f1.advanceNext().advanceNext().advanceNext().advanceNext().getCurrentValue());
        assertEquals(8, f1.advanceNext().advanceNext().advanceNext().advanceNext().advanceNext().getCurrentValue());
    }

}