package $1_Basics;

import java.util.Scanner;

/* Key Takeaways
// User input --> using class Scanner
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
