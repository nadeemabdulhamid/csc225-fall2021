package lon;

public class MTLoN implements ILoN {
    
    public MTLoN() { }     // default constructor
    
    // produce the number of numbers in this list
    public int length() {
        return 0;
    }
    
    // produce the sum of the numbers in this list
    public int total() {
        return 0;
    }
    
    
    // produce the largest number in this list
    public int largest() {
        throw new EmptyListException("cannot get largest() of empty list");
    }
    
    public int largest(int largestSoFar) {
        return largestSoFar;
    }
    
}