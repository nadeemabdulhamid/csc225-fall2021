
public class ListOfNumbers {
	public static void main(String[] args) {
	    System.out.println("This doesn't do anything on its own. Run your tests.");
	}
}

interface ILoN {
	int length();
	int total();
	int largest();
}

class MTLoN implements ILoN {

	public int length() {
		return 0;
	}	
	
	public int total() {
		return 0;
	}
	
	public int largest() {
		return 0;
	}
}

class ConsLoN implements ILoN {
	int first; 
	ILoN rest;   // rest
	
	public ConsLoN(int value, ILoN next) {
		super();
		this.first = value;
		this.rest = next;
	}
	
	public int length() {
		return 1 + this.rest.length();
	}	
	
	public int total() {
		return this.first + this.rest.total();
	}

	public int largest() {
		int r = this.rest.largest();
		if (this.first > r) { return this.first; }
		else { return r; }
	}
}
