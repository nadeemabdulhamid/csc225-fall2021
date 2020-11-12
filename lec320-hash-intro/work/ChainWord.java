import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ChainWord {

	public static final int PREFIX_SIZE = 2;            // CONSTANT
	public static final int WORDS_TO_GENERATE = 500;
	public static final String FILE_NAME = "src/holmes.txt";
	
	
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(FILE_NAME));
		} catch (FileNotFoundException e) {
			System.out.println("The file " + FILE_NAME + " was not found.");
			e.printStackTrace();
			//return;
			System.exit(-1);
		}
		
		Map<Prefix, ArrayList<String>> table
			= new HashMap<Prefix, ArrayList<String>>();
		
		// read the initial prefix
		Prefix prf = new Prefix(PREFIX_SIZE);
		for (int i = 0; i < PREFIX_SIZE; i++) {
			prf = prf.addWord( sc.next() );
		}
		
		Prefix start = prf;  // save the very first prefix for later use
		
		while (sc.hasNext()) {
			String nextWord = sc.next();
			
			ArrayList<String> sufs; // suffixes for the current `prf`
			if (table.containsKey(prf)) {
				sufs = table.get(prf);
			} else {
				sufs = new ArrayList<String>();
				table.put(prf, sufs);
			}
			sufs.add(nextWord);  // add nextWord to the current suffixes
			
			prf = prf.addWord(nextWord);
		}
		
		System.out.println(table.size());
		
		// HW 340 here --------------
		
		
		
		
		
		// GENERATE NEW TEXT
		
		prf = start;   // start with the original first prefix
		Random rgen = new Random(); // random number generator object
		
		System.out.print(prf);
		int k = PREFIX_SIZE;  // number of words generated so far
		while (k < WORDS_TO_GENERATE) {
			ArrayList<String> sufs = table.get(prf);
			if (sufs == null) break; // never saw this prefix before
			String nextWord = sufs.get( rgen.nextInt(sufs.size()) );
			System.out.print(" " + nextWord);
			prf = prf.addWord(nextWord);
			k++;
		}
		
		sc.close();
	}

}
