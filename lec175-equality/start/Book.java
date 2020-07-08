// based on: https://web.cs.wpi.edu/~cs2102/d17/Lectures/object-equality.html

// A class for books in a library
class Book {
	String title;
	String callNum;
	int timesOut = 0;
	boolean isAvailable = true;

	// constructor with just variable fields
	Book(String title, String callNum) {
		this.title = title;
		this.callNum = callNum;
	}

	// full constructor
	Book(String title, String callNum,
			int timesOut, boolean isAvailable) {
		this.title = title;
		this.callNum = callNum;
		this.timesOut = timesOut;
		this.isAvailable = isAvailable;
	}

	// mark a book as checked out of the library
	Book checkOut() {
		this.isAvailable = false;
		this.timesOut = this.timesOut + 1;
		return this;
	}

}
