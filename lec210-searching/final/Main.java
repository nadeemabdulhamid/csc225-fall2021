import java.util.*;

// Credits: 
// https://csawesome.runestone.academy/runestone/books/published/csawesome/Unit7-ArrayList/topic-7-5-searching.html

class Main {
  public static void main(String[] args) {
    SpellChecker checker = new SpellChecker();

    System.out.print("Enter a word to spell check or q to quit: ");
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    while (!word.equals("q")) {
      if (checker.linearSpellCheck(word))
        System.out.println(word + " is spelled correctly!");
      else
        System.out.println(word + " is misspelled!");

      System.out.print("Enter a word to spell check or q to quit: ");
      word = scan.nextLine();
      }    
      scan.close();
  }
}