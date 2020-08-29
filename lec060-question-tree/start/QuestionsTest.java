
import static org.junit.Assert.*;
import org.junit.*;

public class QuestionsTest {
  Question top = new Question("Does it have a horn?",
      new Question("Is it magical?",
                    new Thing("a unicorn"), new Thing("a car")),
      new Question("Is it frozen?", 
                   new Thing("ice cream"), new Thing("a computer")));

  @Test
  public void testNothing() {
    fail("nothing to test yet");
  }
}
