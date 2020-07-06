
/**
 * Represents an ancestral family tree
 */
public interface IFamTree {
    // ... mmm();

    /** Produce the number of people in this family tree with the given name. */
    public int countName(String checkname);

// ==== ADDED THIS LECTURE ====

    /** Produce the number of ancestors of this individual in a family tree */
    public int countAncestors();

    /** Produce the total number of known people in this tree */
	public int countKnown();
}
