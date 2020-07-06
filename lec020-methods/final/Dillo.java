/**
* Represents an armadillo in our zoo
*/ 
class Dillo {
    int length;     // in inches
    boolean isDead;
    
    Dillo (int length, boolean isDead) {  // boilerplate constructor
        this.length = length;
        this.isDead = isDead;
    }
    
    /** 
     * Determine whether this dillo is dead and larger 
     * than the given person length (inches).
     */
    boolean canShelter(/* Dillo this , */ int personLength) {
        if (this.isDead && this.length > personLength) {
            return true;
        } else {
            return false;
        }
        
        // NOTE: can be defined with or without conditional...
        //return this.isDead &&  
        //       this.length > personLength;
    }
    
    /**
     * Produces the calories of food consumed by this dillo
     * in one meal.
     */
    int mealSize() {
        if (this.isDead) {
            return 0;
        } else if (this.length < 12) {
            return 500;
        } else {
            return 800;
        }
    }
}
