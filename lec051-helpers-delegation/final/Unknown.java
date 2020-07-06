/**
 * Represents an unknown branch of a family tree
 */
public class Unknown implements IFamTree {

    /*
     * public ... mmm() { ... }
     */

    /** Produce the number of people in this family tree with the given name. */
    public int countName(String checkname) {
        return 0;
    }

    /** Produce the number of ancestors of this unknown */
    public int countAncestors() {
        return 0;
    }

    /** Produce the total number of known people in this tree */
	public int countKnown() {
        return 0;
    }

}
