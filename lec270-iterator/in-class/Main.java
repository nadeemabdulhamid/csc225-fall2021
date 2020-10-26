import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        
        for (int i : new Range(10)) { // 0 ... 9
            System.out.println(i);
        }
        
        for (int i : new Range(1, 10)) { // 1 ... 9
            System.out.println(i);
        }
        
        for (int i : new Range(5, 100, 5)) { // 5, 10, 15, ... 95
            System.out.println(i);
        }
        
        
        
        ArrayStack<String> st = new ArrayStack<String>();
        st.push("apple");
        st.push("banana");
        st.push("carrot");
        st.push("elephant");
        
        for (String thing : st) {
            System.out.println(thing);
        }
        
        /*
        ======>
        
        Iterator it = st.iterator();
        while ( it.hasNext() ) {
            String thing = st.next();
            ....
        }
        */
        
        
        
        
        
        
        
    }
}
