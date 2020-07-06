/**
 * Represents a cage that contains an animal.
 */
class Cage {
    int size;
    IAnimal resident;

    Cage(int size, IAnimal resident) {
        this.size = size;
        this.resident = resident;
    }

}
