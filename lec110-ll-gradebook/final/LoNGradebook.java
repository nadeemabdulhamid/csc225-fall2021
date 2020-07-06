import lon.*;

/**
 * An implementation of IGradebook using a 
 * functional-style list-of-grades 
 */
public class LoNGradebook implements IGradebook {
	ILoN grades;

	public LoNGradebook() {
		this.grades = new MTLoN();
	}
	
	public int count() {
		return this.grades.length();
	}

	// EFFECT: updates the list of grades of this grade book
	public void addGrade(int g) {
		this.grades = new ConsLoN(g, this.grades);   
	}

	public double average() {
		return this.grades.total() / (double) this.grades.length();   // leave the cast out at first
	}

	public int bestGrade() {
		return this.grades.largest();
	}

}
