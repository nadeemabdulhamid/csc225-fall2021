
public class LList<T>
{
   private ListNode<T> head;
   
   public LList() {    // constructs a new empty list
       head = null;
   }
    
   public void addToFront(T obj) {
       head = new ListNode<T>(obj, head);
   }
   
   public void addToEnd(T obj) {
       ListNode<T> newNode = new ListNode<T>(obj, null);
       
       if (head == null) {
           head = newNode;
       } else {
           ListNode<T> cur = head;
           while (cur.next != null) {
               cur = cur.next;
           }
           cur.next = newNode;
       }
       
   }
   
   public int length() {
       int total = 0;
       ListNode<T> cur = head;
       while (cur != null) {
           total++;
           cur = cur.next;
       }
       return total;
   }
   
   public String toString() {
       String inside = "";
       ListNode<T> cur = head;
       while (cur != null) {
           inside = inside + " " + cur.data.toString();
           cur = cur.next;
       }
       return "[" + inside.trim() + "]";
   }
   
   
}
