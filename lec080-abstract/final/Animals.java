
interface IAnimal {
	// determine whether this animal is within an expected size range
	boolean isNormalSize();	
}


abstract class AbsAnimal implements IAnimal {
	int length;
	
	AbsAnimal(int length) {
		this.length = length;
	}
	
	//  determine whether this animal's length is between
	//  low and high
	public boolean isLenWithin(int low, int high) {
		return low <= this.length  &&  this.length <= high;
	}

	
}


class Dillo extends AbsAnimal {
	boolean isDead;

	Dillo(int length, boolean isDead) {
		super(length);
		this.isDead = isDead;
	}

	//  determine whether this dillo's length is between 2 and 3
	public boolean isNormalSize() {
		return isLenWithin(2, 3);
	}
}


class Boa extends AbsAnimal {
	String name;
	String eats;

	Boa (String name, int length, String eats) {
		super(length);
		this.name = name;
		this.eats = eats;
	}
	
	//  determine whether this boa's length is between 5 and 10
	public boolean isNormalSize() {
		return isLenWithin(5, 10);
	}
	
}
