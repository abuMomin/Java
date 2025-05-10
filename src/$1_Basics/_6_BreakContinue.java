package $1_Basics;
/* Key Takeaways
// break --> breaks the loop
// continue --> skips that particular loop iteration
// `break`, `continue` can be used as JUMP statements.
*/
import java.util.Scanner;

public class _6_BreakContinue {
    public static void main(String[] args) {

        //---- break statement
        System.out.println("Break........");
        for ( int row = 0; row < 5; row++ ) {
            System.out.println("Outer loop: " + row);
            for ( int column = 0; column < 4; column++ ) {
                System.out.print(column + "\t");
                if ( ((row + column) % 2 ) == 0 ) {
                    System.out.println("Break." );
                    break;
                }
            }
        }

        //---- break Jump statement
        System.out.println("\nBreak JUMP.......");
        Outer:
        for ( int row = 0; row < 5; row++ ) {
            System.out.println("Outer loop: " + row);
            for ( int column = 0; column < 4; column++ ) {
                System.out.print(column + "\t");
                if ( ((row + column) % 2 ) == 0 ) {
                    System.out.println("Break." );
                    break Outer;
                }
            }
        }

        //---- continue statement
        System.out.print("\ncontinue ........");
        for ( int row = 0; row < 5; row++ ) {
            System.out.println("\nOuter loop: " + row);
            for ( int column = 0; column < 4; column++ ) {
                System.out.print(column + "\t");
                if ( ((row + column) % 2 ) == 0 ) {
                    System.out.print("Continue."+"\t");
                    continue;
                }
            }
        }


        //---- continue JUMP statement
        System.out.println("\n\ncontinue JUMP........");
        Outer:
        for ( int row = 0; row < 5; row++ ) {
            System.out.println("Outer loop: " + row);
            for ( int column = 0; column < 4; column++ ) {
                System.out.print(column + "\t");
                if ( ((row + column) % 2 ) == 0 ) {
                    System.out.println("Continue." );
                    continue Outer;
                }
            }
        }

    }
}

/* QnA

 */