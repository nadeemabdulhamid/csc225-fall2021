import java.util.*;

public class BucketSort {

	public static void main(String[] args) {
		String[] stuff; 
		
		stuff = ("ice\n"
				+ "owl\n"
				+ "low\n"
				+ "due\n"
				+ "use\n"
				+ "hen\n"
				+ "hip").split("\n");
		for (String s : stuff) { System.out.print(s + " "); } System.out.println();
		sort(stuff);
		for (String s : stuff) { System.out.print(s + " "); } System.out.println();
		
		stuff = ("concern\n"
				+ "decrease\n"
				+ "resort\n"
				+ "railcar\n"
				+ "ethics\n"
				+ "outline\n"
				+ "gear\n"
				+ "question\n"
				+ "lemon\n"
				+ "thrust\n"
				+ "cooperate\n"
				+ "endorse\n"
				+ "custody\n"
				+ "shot\n"
				+ "traction\n"
				+ "participate\n"
				+ "highway\n"
				+ "enthusiasm\n"
				+ "voucher\n"
				+ "kidney").split("\n");
		
		for (String s : stuff) { System.out.print(s + " "); } System.out.println();
		sort(stuff);
		for (String s : stuff) { System.out.print(s + " "); } System.out.println();
	}
	
	
	// assume strings only contain lowercase alphabetic characters and are all the same length
	public static void sortSameLength(String[] data, int len) {
		ArrayList<String>[] buckets = new ArrayList[26];
		for (char c = 'a'; c <= 'z'; c++) { buckets[c-'a'] = new ArrayList<String>(); }
				
		for (int round = len-1; round >= 0; round--) {
			for (char c = 'a'; c <= 'z'; c++) {
				buckets[c-'a'].clear(); 
			}
			
			for (String s : data) {
				buckets[s.charAt(round) - 'a'].add(s);
			}
			
			int i = 0;
			for (ArrayList<String> b : buckets) {
				if (b != null) {
					while (!b.isEmpty()) {
						data[i] = b.remove(0);
						i++;
					}
				}
			}
		}
		
	}
	
	
	// assume strings only contain lowercase alphabetic characters
	public static void sort(String[] data) {
		ArrayList<String>[] buckets = new ArrayList[256];
		buckets[0] = new ArrayList<String>();
		for (char c = 'a'; c <= 'z'; c++) { buckets[c] = new ArrayList<String>(); }
		
		// figure out max string length
		int maxLen = 0;
		for (String s : data) { if (s.length() > maxLen) maxLen = s.length(); }
		
		for (int round = maxLen-1; round >= 0; round--) {
			buckets[0].clear();
			for (char c = 'a'; c <= 'z'; c++) { buckets[c].clear(); }
			
			for (String s : data) {
				if (round >= s.length()) { 
					buckets[0].add(s);
				} else {
					buckets[s.charAt(round)].add(s);
				}
			}
			
			int i = 0;
			for (ArrayList<String> b : buckets) {
				if (b != null) {
					while (!b.isEmpty()) {
						data[i] = b.remove(0);
						i++;
					}
				}
			}
		}
		
	}
}
