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

    /** Unknown generations are well-formed */
    public boolean wellFormed() {
        return true;
    }

    public boolean wellFormedHelp(int childYob) {
        return true;
    }

    /** Produce the other person because `this` one is unknown anyway */
    public IFamTree youngerOf(IFamTree that) {
        return that;
    }

    public Person youngerOfPerson(Person other) {
        return other;
    }

    /** Produce the youngest parent (possibly unknown) of this person */
    public IFamTree youngestParent() {
        return this; // or: return new Unknown()
    }

    /**
     * Produce the youngest ancestor at the given generation up this family tree
     */
    public IFamTree youngestInGen(int n) {
        return this;
    }
}
