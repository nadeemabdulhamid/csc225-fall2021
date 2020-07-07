import static org.junit.Assert.*;
import org.junit.*;

public class GradebookTests
{

    @Test
	public void testJavaLLGradebook() {
		testIGradebook(new JavaLLGradebook());
	}

    public void testIGradebook(IGradebook g) {
        assertEquals(0, g.count());

        g.addGrade(65);
        g.addGrade(75);

        assertEquals(2, g.count());
        assertEquals(75, g.bestGrade());

        g.addGrade(100);
        g.addGrade(89);

        assertEquals(4, g.count());
        assertEquals(82.25, g.average(), 0.001);
        assertEquals(100, g.bestGrade());
    }

}
