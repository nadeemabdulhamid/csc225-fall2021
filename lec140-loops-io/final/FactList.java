/*
 * FactList.java 
 * Nadeem Abdul Hamid - Spring 2006 - CSC121 - Berry College
 * Updated: Fall 2019 - CSC225
 *
 * Representing a list of facts using an imperative linked list
 *
 * Based on a program developed in "Great Ideas in Computer Science 
 * with Java" by Biermann and Ramm.
 *
 */

import java.io.PrintWriter;
import java.util.Scanner;

public class FactList {   

  /* a private inner class to represent FactNodes */
  private class FactNode {
    Fact data;
    FactNode next;

    public FactNode(Fact data, FactNode next) {
      this.data = data;
      this.next = next;
    }
  }

  /* the fields of the list */
  private FactNode facts;
  private int numFacts;   // cache the number of facts


  /** construct a new empty list */
  public FactList() {
    facts = null;
    numFacts = 0;
  }


  /** produce the number of facts in the list */
  public int numOfFacts() { 
    return numFacts; 
  }


  /**
   * Add the given fact to this list of facts
   */
  private void addFact(Fact f) {
    facts = new FactNode(f, facts);
    numFacts++;
    /*
             _________
            / ======= \
           / __________\
          | ___________ |
          | | -       | |
          | |         | |
          | |_________| |________________________
          \=____________/   brian macdonald      )
          / """"""""""" \                       /
         / ::::::::::::: \                  =D-'
        (_________________)    
     */
  }


  /**
   * Reads in facts from a file - each fact is stored on
   * 3 lines following an initial line with only a "*" on it
   */
  public void readFacts(Scanner in) {
    while ( in.hasNextLine() ) {
      String line = in.nextLine();  // this should be the '*'
      if ( !line.trim().equals("*") )
        break;
      addFact( new Fact( in ) );
    } 
  }


  /**
   * Reads in a fact from the keyboard.
   */
  public void inputFact() {
    System.out.println("Enter a new fact (nounA/relation/nounB - one per line): ");
    Scanner kybd = new Scanner( System.in );
    addFact( new Fact( kybd ) );
  }


  /**
   * Displays all the facts of this list to standard output
   */
  public void printFacts() {
    if (numFacts == 0) {
      System.out.println("NO FACTS TO DISPLAY");
    } else {
      System.out.println("RELEVANT FACTS:");
      FactNode cur = facts;
      while (cur != null) {
        System.out.println(cur.data);
        cur = cur.next;
      }
    }
    /*
            _________
           / ======= \
          / __________\
         | ___________ |
         | | -       | |
         | |         | |
         | |_________| |________________________
         \=____________/   brian macdonald      )
         / """"""""""" \                       /
        / ::::::::::::: \                  =D-'
        (_________________)    
    */
    
  }


  /**
   * Writes all the facts of this list to the given output file
   */
  public void saveFacts(PrintWriter outFile) {
    FactNode cur = facts;
    while (cur != null) {
      cur.data.printToFile(outFile);
      cur = cur.next;
    }
    /*
            _________
           / ======= \
          / __________\
         | ___________ |
         | | -       | |
         | |         | |
         | |_________| |________________________
         \=____________/   brian macdonald      )
         / """"""""""" \                       /
        / ::::::::::::: \                  =D-'
        (_________________)    
    */
    
  }


  /**
   * Returns a sublist of facts matching the given query.
   */
  public FactList selectFacts(Fact query) {
    FactList sel = new FactList();
    FactNode cur = facts;
    while (cur != null) {
      if (cur.data.compare(query)) {
        sel.addFact(cur.data);
      }
      cur = cur.next;
    }
    return sel;
    /*
            _________
           / ======= \
          / __________\
         | ___________ |
         | | -       | |
         | |         | |
         | |_________| |________________________
         \=____________/   brian macdonald      )
         / """"""""""" \                       /
        / ::::::::::::: \                  =D-'
        (_________________)    
    */
    
  }
}
