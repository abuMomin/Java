package $2_ClassNObject;

import java.util.Random;

/* Key Takeaways
// Instance Variable Initialization (1) -->  Direct Assignment.
// Each instance initializations in class level affects every objects (regardless whichever approach is used).
// Instance Variable Initialization (2) -->  Instance Initialization Block.
// Instance Initialization Block --> no name, at the end of the class, if simple assignments is not enough and no extra input necessary
// we can write more than one Instance Initialization Block in class.
// used less often than Direct Assignment and Constructor (3).
*/
class BankAccount {
    String accName;
    double balance = 500;       // Instance Variable Initialization (1) -->  Direct Assignment in class
    int accNumber;
    public double getBalance() {
        return balance;
    }

    {
        //  Instance Variable Initialization (2) -->  Instance Initialization Block in class
        Random rand = new Random();
        accNumber = rand.nextInt(100000);      // generates a random number within 100000
    }
    {
        // we can write more than one Instance Initialization Block in class.
        balance = 1000;
    }
}
public class _3_ArrayOfObjects_InstanceVariable {
    public static void main(String[] args) {
        // BankAccount class' references array is initialized. Objects are not initialized/assigned.
        BankAccount[] bankAccounts = new BankAccount[3];

        for(int i = 0; i < bankAccounts.length; i++){
            //Each object needs to be initialized separately using Loop
            bankAccounts[i] = new BankAccount();
        }

        bankAccounts[0].accName = "Win";
        bankAccounts[1].accName = "Enan";
        bankAccounts[2].accName = "Chadni";

        for(int i = 0; i < bankAccounts.length; i++){
            System.out.println(bankAccounts[i].accName + "\t" + bankAccounts[i].accNumber + "\t" + bankAccounts[i].balance);
        }
    }
}

/* QnA

 */

