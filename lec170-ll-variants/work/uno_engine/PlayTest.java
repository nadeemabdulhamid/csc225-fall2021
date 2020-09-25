import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;

public class PlayTest
{
    @Test
    public void testPlay() {
        Player first = new Player("Davis");
        Player p =
          new Player("Olivia",
              new Player("Nathan",
                  new Player("Ivy",
                      new Player("Pierce",
                          new Player("Sam", 
                              new Player("Rebecca", first))))));
          
        // order of players:
        // Davis - Rebecca - Sam - Pierce - Ivy - Nathan - Olivia
        assertEquals("Davis,Rebecca,Sam,Pierce,Ivy,Nathan,Olivia",
                     first.allNames());
        
        // p will represent the current player...
        p = first.playCard(new ColorCard());
        assertEquals("Rebecca", p.getName());
        
        p = p.playCard(new WildCard());
        assertEquals("Sam", p.getName());
        
        p = p.playCard(new SkipCard());
        assertEquals("Ivy", p.getName());
        
        p = p.playCard(new ReverseCard());
        assertEquals("Pierce", p.getName());
        
        p = p.playCard(new SkipCard());
        assertEquals("Rebecca", p.getName());

        p = p.playCard(new ColorCard())
             .playCard(new ColorCard())
             .playCard(new ColorCard())
             .playCard(new SkipCard());
        assertEquals("Pierce", p.getName());
        
        p = p.playCard(new SkipCard());
        p = p.leaveGame();  // Rebecca out
        assertEquals("Davis", p.getName());
        
    }
}
