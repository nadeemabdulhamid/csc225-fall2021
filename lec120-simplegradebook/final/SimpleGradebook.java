
public class SimpleGradebook implements IGradebook {
	// doesn't actually keep the list
	int sum;
	int count;
	int max;
	
	SimpleGradebook() {
		this.sum = 0;
		this.count = 0;
		this.max = 0;
	}
	
	public void addGrade(int g) {
		sum = sum + g;
		count = count + 1;
		
		if (g > this.max) {   // one-arm if
			this.max = g;
		}
	}

	public int count() {
		return count;
	}

	public double average() {
		return sum / (double) count;
	}

	public int bestGrade() {
		return max;
	}

}
