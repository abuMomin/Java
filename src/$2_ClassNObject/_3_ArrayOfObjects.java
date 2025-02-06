package $2_ClassNObject;
/* Key Takeaways

*/
class BankAccount {
    String accName;
    double balance;
    int accNumber;
    public double getBalance() {
        return balance;
    }
}
public class _3_ArrayOfObjects {
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
            System.out.println(bankAccounts[i].accName);
        }
    }
}

/* QnA

 */

