
interface IAnimal {
	// determine whether this animal is within an expected size range
	boolean isNormalSize();	
}


class Dillo implements IAnimal {
	int length;
	boolean isDead;
	
	Dillo(int length, boolean isDead) {
		this.length = length;
		this.isDead = isDead;
	}

	//  determine whether this dillo's length is between 2 and 3
	public boolean isNormalSize() {
		return 2 <= this.length  &&  this.length <= 3;
	}
}


class Boa implements IAnimal {
	String name;
	int length;
	String eats;

	Boa (String name, int length, String eats) {
		this.name = name;
		this.length = length;
		this.eats = eats;
	}
	
	//  determine whether this boa's length is between 5 and 10
	public boolean isNormalSize() {
		return 5 <= this.length  &&  this.length <= 10;
	}
}

