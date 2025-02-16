package $1_Basics;
/* Key Takeaways
// If there is any input method called/used before scan.nextLine() --> a blank `nextLine()` has to be called to avoid input errors.
*/
import java.util.Scanner;

public class _7_Scanner {
    public static void main(String[] args) {
        // Scanner Class provides user input functionality.
        Scanner scan = new Scanner(System.in);

        String singleWord = scan.next();        // takes single word string (ends at white space)
        scan.nextLine();    // If there is any input method called/used before it --> a blank `nextLine()` has to be called to avoid input errors.
        String fullString = scan.nextLine();    // takes full string input (ends at Enter/Return)
        int num = scan.nextInt();               // takes int
        double pi = scan.nextDouble();          // takes double
        float numf = scan.nextFloat();          // takes float

        System.out.println("\n"+singleWord);
        System.out.println(fullString);
        System.out.println(num);
        System.out.println(pi);
        System.out.println(numf);
    }
}

/* QnA
1. "If there is any input method called/used before it --> a blank `nextLine()` has to be called to avoid input errors." Why?
2. What is System.in???
    Ans: System --> A class in Java API
         in     --> represents the standard input, static member of System, part of API
3.
 */
