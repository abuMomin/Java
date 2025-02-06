package $2_ClassNObject;
/* Key Takeaways

 */
class BankAccounts {
    String accName;
    double balance;
    int accNumber;

    BankAccounts(){
                                                    // Null constructor or Default Constructor
    }

    BankAccounts(String accName, double balance, int accNumber){
                                                    // Manual constructor
        this.accName = accName;
        this.balance = balance;
        this.accNumber = accNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }
    }
}
public class _4_constructor {
    public static void main(String[] args) {
        int[] accNumbers = {123541, 5435543, 4732645};
        String[] accNames = {"Win", "Enan", "Chadni"};
        double[] accBalances = {1500.00, 55000.45, 18000.50};

        // BankAccounts class' references array is initialized. Objects are not initialized/assigned.
        BankAccounts[] bankAccounts = new BankAccounts[3];

        for(int i = 0; i < bankAccounts.length; i++){
            //Each object needs to be initialized separately using Loop
            // assigning instances using manual constructor
            bankAccounts[i] = new BankAccounts(accNames[i], accBalances[i], accNumbers[i]);
        }

        // Printing object properties using for-each loop
        for (BankAccounts bnkAcc: bankAccounts){
            System.out.println("Account Name = " + bnkAcc.accName + ",\tAccount No. = " + bnkAcc.accNumber + ",\tAccount Balance = " + bnkAcc.getBalance());
        }
    }
}

/* QnA

 */
