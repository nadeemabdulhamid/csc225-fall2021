
import java.util.*;

public class InfixToPostfix
{
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String token;
        
        IStack<String> opStack = new ArrayStack<String>();
        
        while ( ! (token = sc.next()).equals(".") ) {
            //System.out.println(token);
            if (isOpenParen(token)) { /* do nothing */ }
            else if (isCloseParen(token)) { System.out.print(opStack.pop() + " "); }
            else if (isOperator(token)) { opStack.push(token); }
            else {  // is a literal
                System.out.print(token + " ");
            }
        }
        
    }
    
    public static boolean isOperator(String s) {
        return (s.equals("+") || s.equals("*"));
    }
    
    public static boolean isOpenParen(String s) {
        return s.equals("(");
    }
    
    public static boolean isCloseParen(String s) {
        return s.equals(")");
    }
}
