
/**
 * A doubly-linked circular list with a sentinel head node
 */
public class DLList {
    Node head;
    int size;

    /* List node */
    class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    /** Construct an empty list. */
    public DLList() {
        this.size = 0;
        this.head = new Node(0, null, null);
        this.head.prev = this.head;
        this.head.next = this.head;
    }

    /** Add newValue to the beginning of this list. */
    public void addFirst(int newValue) {
        Node newNode = new Node(newValue, this.head, this.head.next);
        this.head.next.prev = newNode;
        this.head.next = newNode;
        size++;
    }

    /** Add newValue to the end of this list. */
    public void addLast(int newValue) {
        Node newNode = new Node(newValue, this.head.prev, this.head);
        this.head.prev.next = newNode;
        this.head.prev = newNode;
        size++;
    }

    /**
     * Add newValue right after the targetValue in the list, if it is present. If
     * targetValue is not in the list, has no effect.
     */
    public void addAfter(int targetValue, int newValue) {
        Node cur = this.head.next;
        while (cur != this.head) {
            if (cur.value == targetValue) {
                Node newNode = new Node(newValue, cur, cur.next);
                cur.next.prev = newNode;
                cur.next = newNode;
                size++;
                return; // early return
            }
            cur = cur.next;
        }
    }

    /**
     * Removes targetValue from this list, if it is present.
     */
    public void remove(int targetValue) {
        Node cur = this.head.next;
        while (cur != this.head) {
            if (cur.value == targetValue) {
                cur.next.prev = cur.prev;
                cur.prev.next = cur.next;
                size--;
                return; // early return
            }
            cur = cur.next;
        }
    }

    /**
     * Produces true if targetValue is in the list.
     */
    public boolean contains(int targetValue) {
        Node cur = this.head.next;
        while (cur != this.head) {
            if (cur.value == targetValue) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * Produces a text rendering of the contents of this list, separated by commas.
     */
    public String toString() {
        String text = "";
        Node cur = this.head.next;
        while (cur != this.head) {
            if (!text.equals("")) {
                text = text + ",";
            }
            text = text + cur.value;
            cur = cur.next;
        }
        return text;
    }

    /**
     * @return the number of values in the list.
     */
    public int size() {
        return this.size;
    }

}