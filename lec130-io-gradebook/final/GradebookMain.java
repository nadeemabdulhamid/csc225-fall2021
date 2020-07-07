import java.util.Scanner;

public class GradebookMain
{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       IGradebook gb = new SimpleGradebook();
       
       System.out.println("Enter grades, -1 to end:");
       int value = sc.nextInt();
       while ( value >= 0 ) {    //  -1 is a "sentinel value"
           gb.addGrade(value);
           value = sc.nextInt();
       }
       System.out.println("Number of grades: " + gb.count());
       System.out.println("   Average grade: " + gb.average());
       System.out.println("   Highest grade: " + gb.bestGrade());    
       
       sc.close();
   }
}
