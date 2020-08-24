
/** Types of housing that players can live in in our game */
interface IHousing {
}

/** A Hut has a capacity and the current count of its population. 
 * The population must be less than the capacity. */
class Hut implements IHousing {
    int capacity;
    int population;

    public Hut(int capacity, int population) {
        this.capacity = capacity;
        this.population = population;
    }
}

/** An Inn has a name, capacity and the current count of its population 
 * as well as the number of stalls in its stable. 
 * The population must be less than the capacity. */
class Inn implements IHousing {
    String name;
    int capacity;
    int population;
    int stalls;  // stalls available

    public Inn(String name, int capacity, int population, int stalls) {
        this.name = name;
        this.capacity = capacity;
        this.population = population;
        this.stalls = stalls;
    }
}

/** A Castle has a name, the family-name of the owners, the current count 
 * of its population as well as the number of carriages it can hold in its 
 * carriage-house. */
class Castle implements IHousing {
    String name;
    String familyName;
    int population;
    int carriageCapacity; 

    public Castle(String name, String familyName, int population, int carriageCapacity) {
        this.name = name;
        this.familyName = familyName;
        this.population = population;
        this.carriageCapacity = carriageCapacity;
    }
}


/** Types of transportation in our game */
interface ITransport {

}

