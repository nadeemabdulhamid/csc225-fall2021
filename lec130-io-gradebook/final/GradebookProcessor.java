import java.util.Scanner;
import java.io.*;

public class GradebookProcessor {

    public static void main(String[] args)
        throws FileNotFoundException {

        // read input and output file names from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data file path:");
        String inFileName = sc.nextLine();
        
        System.out.println("Output file path:");
        String outFileName = sc.nextLine();
        
        // open the input file and construct a gradebook directly from the input data
        Scanner inFile = new Scanner(new File(inFileName));
        IGradebook gb = new SimpleGradebook(inFile); 
    
        // print the results to an output file
        PrintWriter outFile = new PrintWriter(new File(outFileName));
        
        outFile.println("Results:");
        outFile.println("Number of grades: " + gb.count());
        outFile.println("   Average grade: " + gb.average());
        outFile.println("   Highest grade: " + gb.bestGrade());
        
        // and save it...
        outFile.close();
        sc.close();
    }

}
