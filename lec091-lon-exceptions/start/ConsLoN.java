public class ConsLoN implements ILoN {
    int first;
    ILoN rest;

    public ConsLoN(int first, ILoN rest) {
        this.first = first;
        this.rest = rest;
    }

    // produce the number of numbers in this list
    public int length() {
        return 1 + this.rest.length();

    }

    // produce the sum of the numbers in this list
    public int total() {
        return this.first + this.rest.total();
    }

    public int largest() {
        int r = this.rest.largest();
        if (this.first > r) { return this.first; }
        else { return r; }
    }

}