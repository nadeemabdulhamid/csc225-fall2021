
public class Dillo
{
    int length;
    boolean isDead;

    Dillo(int length, boolean isDead) {
        this.length = length;
        this.isDead = isDead;
    }

    // determines whether Dillo is dead and longer than given person length (inches)
    boolean canShelter(int personLength) {
        return this.isDead && this.length > personLength;
    }

}
