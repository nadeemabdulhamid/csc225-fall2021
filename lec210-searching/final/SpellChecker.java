
import java.io.*;
import java.util.*;

/**
 Loads a dictionary of words and provides
 spell-checking facilities.
 */
public class SpellChecker
{
    private ArrayList<String> words;
    
    // given the file name of the dictionary
    public SpellChecker(String fileName) throws FileNotFoundException {
        words = new ArrayList<String>();
        
        Scanner sc = new Scanner(new File(fileName));
        
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            words.add( s );
        }
        sc.close();
        
        // profiling
        System.out.println( "Words loaded: " + words.size() );
        
    }
    
    
    // check if the given word is a valid word in
    // the dictionary
    public boolean checkSpelling(String word) {
       boolean result = false;
       int cost = 0;
       
       for (int i = 0; i < words.size(); i++) {
           cost++; // charge for the upcoming .equals()
           if ( words.get(i).equals( word ) ) {
               result = true;
               break;
           }
       }
       
       System.out.println("Total cost: " + cost);
       return result;
    }
    
    
    
    
    public boolean checkSpellingOpt(String word) {
        int N = words.size();
        
        // TODO 
        
        return 0 == words.get(N/2).compareTo(word);
        
    }
    
    
    
}












