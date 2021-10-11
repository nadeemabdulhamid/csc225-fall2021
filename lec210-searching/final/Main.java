
import java.util.*;
import java.io.*;

public class Main
{
   public static void main(String[] args) {
        
       try {
           SpellChecker sp = new SpellChecker("dictionary.txt");
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Type words to spell check");
           while (sc.hasNextLine()) {
               String word = sc.nextLine();
               
               boolean result = sp.checkSpelling(word);
               if (result) {
                   System.out.println("Valid word");
               } else {
                   System.out.println("Not found");
               }
               
           }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Had some trouble loading the dictionary file!");
            System.out.println(fnfe);
        }
       
   }
}
