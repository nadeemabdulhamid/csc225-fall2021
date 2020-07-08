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


	// PART 2:
	// an equals method that compares all four fields
	public boolean equals(Book other) {
		return this.title.equals(other.title) &&
				this.callNum.equals(other.callNum) &&
				this.timesOut == other.timesOut &&
				this.isAvailable == other.isAvailable ;
	}

	// PART 3:
	public boolean equals(Object other) {
		if (!(other instanceof Book)) {
			return false;
		} else {
			// need to tell Java that the other really is a book --
			//   next line is the notation that does it: it tells
			//   Java to trust us that the type of other is Book
			Book otherBook = (Book)other;
			return this.title.equals(otherBook.title) &&
					this.callNum.equals(otherBook.callNum) &&
					this.timesOut == otherBook.timesOut &&
					this.isAvailable == otherBook.isAvailable;
		}
	}

}
