

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

/**
 * The test class PrefixTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PrefixTest
{
    @Test
    public void testPrefix() {
        Prefix p = new Prefix(3);
	p = p.addWord("aa");
	p = p.addWord("bb");
	p = p.addWord("cc");
	assertThat(p.toString(), is("aa bb cc"));
	assertThat(p.addWord("dd").toString(), is("bb cc dd"));
	assertThat(p.toString(), is("aa bb cc"));
    }
}
