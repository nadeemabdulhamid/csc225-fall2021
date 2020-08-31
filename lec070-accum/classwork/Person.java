/**
 * Represents a known person in an ancestral family tree
 */
public class Person implements IFamTree {
    String name;
    int yob;
    IFamTree mother;
    IFamTree father;

    /*
     * Note two constructors
     *
     * This class illustrates a nice feature of Java when you would like to have
     * default values for some variables in some cases: you can actually define
     * multiple constructors, some of which omit arguments. Constructors that are
     * missing arguments can set default values. More description is on the second
     * constructor below.
     */

    Person(String name, int yob, IFamTree mother, IFamTree father) {
        this.name = name;
        this.yob = yob;
        this.mother = mother;
        this.father = father;
    }

    // another version of the constructor for people with no known parents.
    // Java allows multiple constructors, as long as they have different
    // arguments or types (so Java can tell which version to use). Here, we
    // supply only the name, and automatically set the parents to Unknown.
    Person(String name, int yob) {
        this.name = name;
        this.yob = yob;
        this.mother = new Unknown();
        this.father = new Unknown();
    }

    /*
     * TEMPLATE: public ... mmm() { ... this.name ... this.mother ... this.father
     * ... this.mother.mmm() ... this.father.mmm() ... }
     */

    /** Produce the number of people in this family tree with the given name. */
    public int countName(String checkname) {
        if (this.name.equals(checkname)) {
            return 1 + this.mother.countName(checkname) + this.father.countName(checkname);
        } else {
            return this.mother.countName(checkname) + this.father.countName(checkname);
        }
    }

    /** Produce the number of ancestors of this unknown */
    public int countAncestors() {
        // FAILS: return this.mother.countAncestors() + this.father.countAncestors();
        // FAILS: return 1 + this.mother.countAncestors() +
        // this.father.countAncestors();
        return this.mother.countKnown() + this.father.countKnown();
    }

    /** Produce the total number of known people in this tree */
    public int countKnown() {
        return 1 + this.mother.countKnown() + this.father.countKnown();
    }

    /** Unknown generations are well-formed */
    public boolean wellFormed() {
        return this.mother.wellFormedHelp(this.yob) && this.father.wellFormedHelp(this.yob);
    }

    public boolean wellFormedHelp(int childYob) {
        return this.yob < childYob && this.wellFormed();
    }

    /** Produce the younger of this person and that given person, if known */
    public IFamTree youngerOf(IFamTree that) {
        // we know `this` is a Person, has a `yob`: this.yob
        // we don't know if `that` is even a Person or an Unknown

        return that.youngerOfPerson(this);
    }

    public Person youngerOfPerson(Person other) {
        if (this.yob > other.yob) {
            return this;
        } else {
            return other;
        }
    }

    /** Produce the youngest parent (possibly unknown) of this person */
    public IFamTree youngestParent() {
        // FIX THIS
        return this;
    }

    /**
     * Produce the youngest ancestor at the given generation up this family tree
     */
    public IFamTree youngestInGen(int n) {
        // FIX THIS
        return this;
    }

    public String toString() {
        return "[Person: " + this.name + "/" + this.yob + "]";
    }
}
