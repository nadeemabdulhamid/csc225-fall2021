/*
 * ElectronicButler.java
 * Nadeem Abdul Hamid - Spring 2006 - CSC121 - Berry College
 * Updated: Fall 2019 - CSC225
 *
 * This is the main program that provides an interface to the manor
 * database. 
 *
 * Based on a program developed in "Great Ideas in Computer Science 
 * with Java" by Biermann and Ramm.
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ElectronicButler {

    /* possible commands to issue to the butler */
    private static final int INVALIDCOMMAND = -1;
    private static final int LOADCOMMAND = 1;
    private static final int ADDCOMMAND = 2;
    private static final int QUERYCOMMAND = 3;
    private static final int SAVECOMMAND = 4;
    private static final int PRINTCOMMAND = 5;
    private static final int QUITCOMMAND = 9;

    /* the butler's electronic database of knowledge about the
     * going on's of the manor */
    private FactList db;

    // default database file name
    private String filename;

   
    /* Constructor:
     * Prepare the electronic butler
     */
    public ElectronicButler() {
        printStars(75);
        System.out.println("\n\nWelcome to the Electronic Butler program.");
        db = new FactList();
        filename = "butler.db";
    }

    /*
     * Put the electronic butler into action, ready to answer queries
     * or add new facts to his database
     */
    public void engage() {
        Scanner in = new Scanner( System.in );
        int cmd = INVALIDCOMMAND;

        do {
            printMenu();
            try { cmd = in.nextInt(); }
            catch (Exception e) { cmd = INVALIDCOMMAND; } 

            printStars(75);
            System.out.println("\n");

            switch (cmd) {
                case LOADCOMMAND:  loadFile(); break;
                case ADDCOMMAND:   db.inputFact(); break;
                case QUERYCOMMAND: queryFacts(); break;
                case SAVECOMMAND:  saveFile(); break;
                case PRINTCOMMAND: db.printFacts(); break;
                case QUITCOMMAND:  break;
                default:
                System.out.println("\nKindly select a valid operation from the list of available choices.\n");
            }
        } while (cmd != QUITCOMMAND);

    }

    /*
     * Print menu of choices for commands to the butler
     */
    public void printMenu() {
       printStars(75);
       String[] commands = { "\t(" + LOADCOMMAND  + ") Load database",
                "\t(" + ADDCOMMAND   + ") Add fact",
                "\t(" + QUERYCOMMAND + ") Query fact",
                "\t(" + SAVECOMMAND  + ") Save database",
                "\t(" + PRINTCOMMAND + ") Print all facts",
                "\t(" + QUITCOMMAND  + ") Exit the premises" };
        System.out.println();
        for (int i=0; i<commands.length; i++)
            System.out.println(commands[i]);
        System.out.print("\nYour desired operation? ");
    }

    /*
     * Load in a database file
     */
    public void loadFile() {
        Scanner in = new Scanner( System.in );
        System.out.print( "Name of database file [" + this.filename + "]: " );
        String filename = in.nextLine();
        if (filename.equals("")) filename = this.filename;
        try {
            Scanner inFile =new Scanner( new File(filename) );
            FactList newdb = new FactList(); // reading in new data
            newdb.readFacts(inFile);
            inFile.close();
            this.filename = filename;
            db = newdb;
            System.out.println("File loaded. " + db.numOfFacts() 
                + " fact(s) currently in database.");
        } catch (FileNotFoundException e) {
            System.out.println("The file \"" + filename + "\" was not found. No facts were loaded.");
            // e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Some strange error occurred: " + e);
        }
    }

    /*
     * Save facts database to file
     */
    public void saveFile() {
        Scanner in = new Scanner( System.in );
        System.out.print( "Name of database file [" + this.filename + "]: " );
        String filename = in.nextLine();
        if (filename.equals("")) filename = this.filename;
        try {
            PrintWriter outFile = new PrintWriter(new File(filename));
            db.saveFacts(outFile);
            outFile.close();
            System.out.println(db.numOfFacts() + " fact(s) stored.");
            this.filename = filename;         // update for next
        } catch (Exception e) {
            System.out.println("The file \"" + filename + "\" could not be written to. No data was saved.");
            // e.printStackTrace();
        }
    }

    /*
     * Query facts from the database
     */
    public void queryFacts() {
        System.out.println("Entering query mode:");
        System.out.println("Enter a fact(s) to query (nounA/relation/nounB - one per line) using a");
        System.out.println("question mark (?) as necessary. Leave first line blank to abort.\n");
        try {
            Scanner kybd = new Scanner( System.in ); 
            while (true) {
                Fact query = new Fact(kybd);
                System.out.println();
                FactList result = db.selectFacts(query);
                result.printFacts();
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Query mode aborted.");
        }
    }

    /*
     *
     */
    public void retire() {
        System.out.println("\nThank you for your gracious visit.\n");
    }

    /* print the given number of asterisks out on a single line */
    public static void printStars(int number) {
       //// System.out.println("FIX ME!!!  (ElectronicButler.printStars)");
       
       //  for ( INITIALIZATION  ; CONDITION  ; UPDATE ) { ... }
       for ( int count = 0 ; count < number ; count++ ) {
           System.out.print("*");
       }
       
       /****
       int count = 0;    ///     INITIALIZATION
       while ( count < number ) {    /// CONDITION
           System.out.print("*");
           count++;                   /// UPDATE
        }
        System.out.println();
        */
        
    }
   
    public static void main(String[] args) {
        ElectronicButler parsons = new ElectronicButler();
        parsons.engage();
        parsons.retire();
    }

}
