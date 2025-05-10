package $1_Basics;
/* Key Takeaways
// If there is any input method called/used before scan.nextLine() --> a blank `nextLine()` has to be called to avoid input errors.
*/
import java.util.Scanner;

public class _7_Scanner {
    public static void main(String[] args) {
        // Scanner Class provides user input functionality.
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();               // takes int
        String singleWord = scan.next();        // takes single word string (ends at white space)
        scan.nextLine();    // If there is any input_method is called/used before nextLine() --> a blank `nextLine()` has to be called to avoid input errors.
        String fullString = scan.nextLine();    // takes full string input (ends at Enter/Return)
        double pi = scan.nextDouble();          // takes double
//        float numf = scan.nextFloat();          // takes float

        System.out.println(num);
        System.out.println("\n"+singleWord);
        System.out.println(fullString);
        System.out.println(pi);
//        System.out.println(numf);
    }
}

/* QnA
1. "If there is any input_method is called/used before nextLine() --> a blank `nextLine()` has to be called to avoid input errors." Why?
    Ans: A nextLine() call after other input methods (like nextInt(), next()) in Java's Scanner class might read an empty string because
    the previous method might leave a newline character in the input buffer. Calling an extra nextLine() to consume that newline character avoids this issue.

    Explanation:
    - Newline Character: When you enter input and press Enter, the input stream includes a newline character (\n) as well as the data you typed.
    - nextInt() and next(): Methods like nextInt() and next() only read the actual data you entered (e.g., an integer, a word), but they don't consume
    the newline character.
    - nextLine() and the Input Buffer: nextLine() reads until it encounters a newline character. If there's a newline already in the input buffer
    (left over from a previous call), nextLine() will read that and return an empty string, skipping the actual input you intended to read.
    - Blank nextLine() to Consume: By calling nextLine() before your actual nextLine() call, you effectively clear the input buffer of that lingering newline,
    ensuring that the subsequent nextLine() reads the input you expect.

2. What is System.in???
    Ans: System --> A class in Java API
         in     --> represents the standard input, static member of System, part of API
3.
 */
