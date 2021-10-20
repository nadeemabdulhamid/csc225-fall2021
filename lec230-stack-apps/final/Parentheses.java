
import java.io.*;
import java.util.*;

public class Parentheses
{
    
    public static boolean closeParens(char c) {
       return (c == ')' || c == ']' || c == '}');
    }
        
    public static boolean openParens(char c) {
       // return (c == '(' || c == '[' || c == '{');
       switch (c) {
           case '(':
           case '[':
           case '{': return true;
           ///case '[': return true;
           default: return false;
       }
    }
    
    public static boolean match(char open, char close) {
       switch (open) {
           case '(': return (close == ')');
           case '[': return (close == ']');
           case '{': return (close == '}');
           default: return false;
       }
    }
   
    public static boolean checkBalanced(BufferedInputStream in) throws IOException {
        Stack<Character> s = new Stack<Character>();
        
        int b;
        while ( (b = in.read()) != -1) {
            char c = (char) b;  
            //System.out.println(c);
            
            if (openParens(c)) {
                s.push(c);
            } else if (closeParens(c)) {
                if (s.isEmpty()) { return false; } // too many close parens
                char d = s.pop();
                if (! match(d, c)) { return false; } // mismatched
            } 
        }
        return (s.isEmpty());   
        // if it's not empty, means too many open parens
    }
    
    
    
    public static void main(String[] args)  {
        
        try {
            BufferedInputStream in 
               = new BufferedInputStream(new FileInputStream("input.txt"));
            
            if (checkBalanced(in)) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
            
            in.close();
        } catch (IOException exc) {
           System.out.println("Something bad happened! " + exc.getMessage());   
        }
    }
}
