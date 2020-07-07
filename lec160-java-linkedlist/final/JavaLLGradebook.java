
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class JavaLLGradebook implements IGradebook {

	LinkedList<Integer> grades;			// wrapper class
	
	public JavaLLGradebook() {
		grades = new LinkedList<Integer>();
	}
	
	public void addGrade(int g) {
		grades.addFirst(g);
	}

	public int count() {
		return grades.size();
	}

	public double average() {
		int sum = 0;
		for ( Integer n : grades ) {
			sum = sum + n;
		}
		return sum / (double) this.count();
	}

	public int bestGrade() {
		if (grades.size() == 0) {
			throw new NoSuchElementException("the gradebook is empty");
		} else {
			int best = grades.getFirst();
			for ( int n : grades ) {	 // auto-unboxing (unwrapping)
				if (n > best) {
					best = n;
				}
			}
			return best;
		}
	}

}
