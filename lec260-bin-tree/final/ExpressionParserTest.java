
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExpressionParserTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExpressionParserTest
{
    @Test
    public void testTraversals() {
        String[] tokens = "2 + 5 * 4 - 7".split(" +");
        BinaryTree<String> result = ExpressionParser.buildExpTree(tokens);

        assertEquals("---fill in---", result.inOrderString());
        assertEquals("---fill in---", result.preOrderString());
        assertEquals("---fill in---", result.postOrderString());
        assertEquals("---fill in---", result.depthFirstStackString());
        assertEquals("---fill in---", result.breadthFirstStackString());
    }
}
