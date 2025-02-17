package $1_Basics;

import java.util.Scanner;

/* Key Takeaways
// The == operator checks reference equality for objects and value equality for primitives.
// therefore, to check equality of content of objects (strings, objects) --> use `.equals()`
// User input --> using class Scanner
// String Pool: When two strings have the same content and are created without the new keyword [new String(“HELLO”)], they point to the same memory location in the pool.
*/
public class _5_IfElse {
    public static void main(String[] args) {
        // user input class
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the current Hour of the day in 24hr format: ");
        int time = scan.nextInt();

        // if-else -------------------
        if(time < 10) {
            System.out.println("Good morning.");
        } else if(time < 18) {
            System.out.println("Good afternoon.");
        } else{
            System.out.println("Good evening.");
        }


        //Switch-case
        System.out.print("\nEnter your dick size (in inches): ");
        int sizeNumber = scan.nextInt();

        switch (sizeNumber) {
            case 1:
                System.out.println("You Chinese motherfucker");
                break;
            case 2:
                System.out.println("Extra Small");
                break;
            case 3:
                System.out.println("Small");
                break;
            case 4:
                System.out.println("Medium");
                break;
            case 5:
                System.out.println("Large");
                break;
            case 6:
                System.out.println("Extra Large");
                break;
            default:
                System.out.println("Yo, Nigga!");
        }
    }
}

/* QnA

 */
