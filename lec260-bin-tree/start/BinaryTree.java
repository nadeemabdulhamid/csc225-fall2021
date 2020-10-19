
import java.util.*;
public class BinaryTree<T> {
    // an internal class for binary tree nodes
    private class Node { 
        T data;
        Node left, right;

        public Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }  

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T data) {
        root = new Node(data, null, null);
    }

    public BinaryTree(T data, BinaryTree<T> left, BinaryTree<T> right) {
        root = new Node(data, left.root, right.root);
    }

    public String inOrderString() {
        return inOrderString(root);
    }

    public String preOrderString() {
        return preOrderString(root);
    }

    public String postOrderString() {
        return postOrderString(root);
    }

    public String depthFirstStackString() {
        Stack<Node> st = new Stack<Node>();
        String result = "";

        // FILL IN
        throw new RuntimeException("Incomplete code here");
        // FILL IN

        //return result;
    }

    public String breadthFirstStackString() {
        Queue<Node> qu = new ArrayDeque<Node>();
        String result = "";

        // FILL IN
        throw new RuntimeException("Incomplete code here");
        // FILL IN

        //return result;
    }

    // helper methods
    
    
    // is the given node a leaf? (i.e. no children) 
    private boolean isLeaf(Node cur) {
        return cur.left == null && cur.right == null;
    }
    
    private String inOrderString(Node cur) {
        String result = "";
        if (cur == null) { return result; }

        if (!isLeaf(cur)) { result += "("; }
        result += inOrderString(cur.left).trim();
        result += " " + cur.data.toString() + " ";
        result += inOrderString(cur.right).trim();
        if (!isLeaf(cur)) {  result += ")"; }
        return result;
    }

    private String preOrderString(Node cur) {
        String result = "";
        
        // FILL IN
        throw new RuntimeException("Incomplete code here");
        // FILL IN

        //return result;
    }

    private String postOrderString(Node cur) {
        String result = "";
        
        // FILL IN
        throw new RuntimeException("Incomplete code here");
        // FILL IN

        //return result;
    }

}