
/**
 * Represents an ancestral family tree
 */
public interface IFamTree {
    // ... mmm();

    /** Produce the number of people in this family tree with the given name. */
    public int countName(String checkname);

    /** Produce the number of ancestors of this individual in a family tree */
    public int countAncestors();

    /** Produce the total number of known people in this tree */
    public int countKnown();

    // ==== ADDED THIS LECTURE ====

    /**
     * Determine if this ancestry tree is well-formed: all children must be younger
     * than their parents
     */
    boolean wellFormed();

    boolean wellFormedHelp(int childYob);

    // ==== ADDED THIS LECTURE ====

    /** Produce the younger of this person and that given person, if known */
    IFamTree youngerOf(IFamTree that);

    // helper method: return the younger person of `this` and the other
    // known person. The result has to be a known person
    Person youngerOfPerson(Person other);

    /** Produce the youngest parent (possibly unknown) of this person */
    IFamTree youngestParent();

    /**
     * Produce the youngest ancestor at the given generation up this family tree
     */
    IFamTree youngestInGen(int n);
}

// Credits:
//   https://course.ccs.neu.edu/cs2510/lecture6.html
//   https://course.ccs.neu.edu/cs2510/lecture7.html
