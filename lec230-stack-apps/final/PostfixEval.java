
import java.util.*;

public class PostfixEval
{
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String token;
        
        IStack<Integer> valStack = new ArrayStack<Integer>();
        
        while ( ! (token = sc.next()).equals(".") ) {
            //System.out.println(token);
            if (token.equals("+")) { 
                int b = valStack.pop(); 
                int a = valStack.pop();
                valStack.push( a + b );
            }
            else if (token.equals("*")) { 
                int b = valStack.pop(); 
                int a = valStack.pop();
                valStack.push( a * b );
            }
            else if (token.equals("-")) { 
                int b = valStack.pop(); 
                int a = valStack.pop();
                valStack.push( a - b);
            }
            else {  // it's a number
                int v = Integer.parseInt( token );
                valStack.push(v);
            }
        }
        
        System.out.println( valStack.pop() );
    }
}
