/*
 * Fact.java 
 * Nadeem Abdul Hamid - Spring 2006 - CSC121 - Berry College
 * Updated: Fall 2019 - CSC225
 *
 * Representation of a fact in the manor database program
 *
 * Based on a program developed in "Great Ideas in Computer Science 
 * with Java" by Biermann and Ramm.
 *
 */

import java.io.PrintWriter;
import java.util.Scanner;

public class Fact {

    private String nounA;
    private String relation;
    private String nounB;

    
    /**
     * Reads in a fact from a Scanner object. Each portion of the
     * fact (nounA, relation, nounB) should be on a separate line
     */
    public Fact( Scanner in ) {
        nounA = in.nextLine();
        if ( nounA.equals("") ) throw new RuntimeException("Empty fact line");
        relation = in.nextLine();
        nounB = in.nextLine();
    }

    
    /**
     * Directly construct a fact from its three portions
     */
    public Fact( String nA, String rel, String nB ) {
       nounA = nA;
       relation = rel;
       nounB = nB;
    }
    
    
    /**
     * Returns a string representation of a fact
     */
    public String toString() {
        return nounA + " " + relation + " " + nounB;
    }


    /**
     * Prints out the fact to an output stream
     */
    public void printToFile( PrintWriter outstream ) {
        outstream.println("*");
        outstream.println(nounA);	
        outstream.println(relation);	
        outstream.println(nounB);	
    }

    
    /**
     * Compare this fact to another, possibly using wild cards (?) 
     */
    public boolean compare(Fact query) {
        if ( (query.nounA.equals("?") ||
              query.nounA.equalsIgnoreCase(nounA))
             && (query.relation.equals("?") ||
                     query.relation.equalsIgnoreCase(relation))
             && (query.nounB.equals("?") ||
             query.nounB.equalsIgnoreCase(nounB)) )
            return true;
        return false;
    }
    
}
