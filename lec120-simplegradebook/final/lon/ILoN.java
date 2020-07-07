package lon;

public interface ILoN {
    
    // produce the number of numbers in this list
    int length();
    
    // produce the sum of the numbers in this list
    int total();
    
    // produce the largest number in this list
    int largest();
    int largest(int largestSoFar);
    
}