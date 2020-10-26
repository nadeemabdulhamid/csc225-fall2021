
import java.util.*;

public class Range implements Iterable<Integer> {
  
    private int start, stop, skip;
    
    //private int start;
    //private int stop;
    //private int skip;
    
    public Range(int start, int stop, int skip) {
        this.start = start;
        this.stop = stop;
        this.skip = skip;
    }
    
    public Range(int start, int stop) {
        this(start, stop, 1);
    }
    
    public Range(int stop) {
        this(0, stop);
    }
    
    public Iterator<Integer> iterator() {
        return new RI();
    }
    
    // range iterator
    private class RI implements Iterator<Integer> {
        
        int current;  // this is the next number in the range
                        // that should be produced
                        
        public RI() {
            current = start;
        }
        
        public boolean hasNext() {            
            return current < stop;
        }
        
        public Integer next() {
            if (!hasNext()) { throw new NoSuchElementException(); }
            int value = current;
            current = current + skip;
            return value;
        }
    }
    
    
}
