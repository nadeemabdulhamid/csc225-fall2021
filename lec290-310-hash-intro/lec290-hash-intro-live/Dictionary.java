

public class Dictionary {

	String[] array;            // HASH TABLE
	
	public Dictionary() {
		this.array = new String[1000];
	}
	
	
	// HASH FUNCTION
	public int hash(String word) {
		//return word.length();
		
		int f = 37;
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			sum = (sum * f) + c;
		}
		
		return Math.abs(sum);
	}
	
	public void insert(String word) {
		int index = hash(word) % array.length;       // hash key
		array[index] = word;
	}
	
	public boolean contains(String word) {
		int index = hash(word) % array.length;
		return array[index] != null  
				&&  array[index].equals(word);
	}
}
