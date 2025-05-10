package $2_ClassNObject;
/* Key Takeaways
// Instance Variable Initialization (3) -->  Constructor
// constructor is a method, has the same name as a CLASS, with no return type.
// constructor can never be explicitly called, always executed after new object creation.
// When no constructor is written in the class, the class assigns a default constructor.
// Default constructor --> initializes all the instance variables to their default values. --> therefore no parameter required.
// When manual constructor is written, default constructor dies.
// We can write multiple constructors as long as each constructor has different definition (parameter).
// Constructor can take input outside class --> A benefit.
// this Keyword --> this` is a reference which refers to the current object.
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
        // `this` refers the instance_variable of the current object, not the local parameter.
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
public class _4_constructor_this {
    public static void main(String[] args) {
        int[] accNumbers = {123541, 5435543, 4732645};
        String[] accNames = {"Win", "Enan", "Chadni"};
        double[] accBalances = {1500.00, 55000.45, 18000.50};

        // BankAccounts class' references array is initialized. Objects are not initialized/assigned.
        BankAccounts[] bankAccounts = new BankAccounts[3];

        for(int i = 0; i < bankAccounts.length; i++){
            //Each object needs to be initialized separately using Loop
            // assigning instances using manual constructors
            // constructor can never be explicitely called, always executed after new object creation.
            bankAccounts[i] = new BankAccounts(accNames[i], accBalances[i], accNumbers[i]);
        }

        // Printing object properties using for-each loop
        for (BankAccounts bnkAcc : bankAccounts) {
            System.out.println("Account Name = " + bnkAcc.accName + ",\tAccount No. = " + bnkAcc.accNumber + ",\tAccount Balance = " + bnkAcc.getBalance());
        }

    }
}

/* QnA

 */
