    
// represents a prefix of N words
public class Prefix
{    
    private String[] pcs;
    
    public Prefix(int size) {
        pcs = new String[size];
    }
    
    Prefix(String[] t) {
        pcs = new String[t.length];
        for (int i = 0; i < pcs.length; i++) {
            pcs[i] = t[i];
        }
    }
    
    /* produces a new prefix pair where if 
     *  p is Prefix[a, b, c], then
     *  p.addWord(d) produces a Prefix[b, c, d]
     */
    public Prefix addWord(String s) {
        Prefix newP = new Prefix(pcs.length);
        for (int i = 1; i < pcs.length; i++) {
            newP.pcs[i-1] = this.pcs[i];
        }
        newP.pcs[pcs.length - 1] = s;
        return newP;
    }
    
    public String toString() {
        return String.join(" ", pcs);
    }

    public boolean equals(Object that) {
        if (!(that instanceof Prefix))
            return false;
        return this.toString().equals(that.toString());		
    }
    
    public int hashCode() {
        return this.toString().hashCode();
    }
}
