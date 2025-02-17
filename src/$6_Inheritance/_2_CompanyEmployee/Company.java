package $6_Inheritance._2_CompanyEmployee;
/* Key Takeaways
// super keyword is necessary as --> the superclass has one parameter constructor only --> superclass constructor execution is mandatory before subclass constructor object creation.
// super keyword usage has to be the first operation in childclass, before any operation in its own constructor.
// abstract in details will be discussed later.
*/

import java.util.Random;

abstract class Employee{        // became an abstract superclass because it has at-least one property/method (here getSalary() method) abstract.
    String name;
    int id;
    Employee(String name){
        this.name = name;
        id = new Random().nextInt(10000);
    }
    abstract double getSalary();        // abstract method --> that MUST need to be implemented in the child class. --> no method body can remain

    void printDetails(){
        System.out.println("Employee Name: " + name +",\tID: "+id);
    }
}

class Salaried extends Employee{
    double salary = 25000;
    Salaried(String name) {
        // super keyword is necessary as --> the superclass has one parameter constructor only --> superclass constructor execution is mandatory before subclass constructor object creation.
        super(name);
    }
    double getSalary(){
        return salary;
    }
}
class Hourly extends Employee{
    double salary = 450;
    Hourly(String name) {
        super(name);
    }
    double getSalary(){
        return salary;
    }
}
class Commission extends Employee{
    double salary = 40000;
    Commission(String name) {
        super(name);
    }
    double getSalary(){
        return salary;
    }
}
class BaseCommission extends Employee{
    double salary = 55000;
    BaseCommission(String name) {
        super(name);
    }
    double getSalary(){
        return salary;
    }
}
public class Company {
    public static void main(String[] args) {
        Salaried emp_1 = new Salaried("Win");
        Hourly emp_2 = new Hourly("Chadni");
        Commission emp_3 = new Commission("Enan");
        BaseCommission emp_4 = new BaseCommission("Prithul");

        emp_1.printDetails();
        System.out.println(emp_1.getSalary());
        emp_2.printDetails();
        System.out.println(emp_2.getSalary());
        emp_3.printDetails();
        System.out.println(emp_3.getSalary());
        emp_4.printDetails();
        System.out.println(emp_4.getSalary());

    }
}

/* QnA
//
 */
