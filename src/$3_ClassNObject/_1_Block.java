package $3_ClassNObject;

/* Key Takeaways
// Scope of the variable
//Scope of variables -> a variable/method declared inside a block is only recognized by the other members of the same block/inner block.
 */
class Employee{

    //defined by class-> instance variables

    String name;
    int ID;
    double salary;

    Employee(){
        this.name = null; //emp2.name=name;
        ID=0;
        salary=0.0;
    }

    Employee(double val) {
        name=null;
        this.ID=0;
        salary=val;
    }

    //this.name->ins var, name->param
    Employee(String name, int ID, double salary){ //name=Jake, ID=123, salary=50000.0
        this.name=name;//parameter=parameter
        this.ID=ID;
        this.salary=salary;
    }

    //Scope of variables ->a variable/method declared inside a block is only recognized by the other members of the same block/inner block.
    void calculateInterest(double balance) //balance is only recognized inside the method
    {
        // Scope of this `BoxMain` and `interest` variable is only inside the `calculateInterest` method.
        double temp;
        float interest;
        if(balance > 10000)
        {
            int onlyIf = 2; // Scope of this `onlyIf` variable is only inside the if
            interest = 0.05f;
        }
        else
        {
            interest = 0.02f;
        }
    }

    double get() {return salary;}

    void updateSalary(int overtime) {
        this.salary=this.salary+this.salary*overtime*0.3;
        double temp= get();
    }
}
public class _1_Block {
    //Use of this keyword and Scope of variable
    public static void main(String[] args) {
        Employee emp1;//emp1->reference(null)
        emp1=new Employee();    // emp1 --> now, holds an object
        Employee emp2= new Employee("Jake", 123, 50000.0); //emp2->reference --> holds an object
        System.out.println(emp2.name+" "+emp2.ID+" "+emp2.salary);

    }

}

/* QnA

 */
