package $7_SubclassPolymorphism._1_SCPLYMRPSM;
/*
// Subclass Polymorphism
// 1. Parent class reference can refer to child class object
// 2. parent class reference only recognizes the members (properties, and methods) that are declared/defined inside parent class.
// Method execution in Subclass polymorphism
// The method should exist in superclass for calling it (using subclass-polymorphism).
// when the method is called in Subclass Polymorphism, execution occur in reverse order --> the lowest subclass method will be executed.
// if the lowest subclass doesn't override the method, then the execution will keep going back to its immediate superclass (for that method) till the method is found, and execute that one.
// How to call a distinct subclass method (which is unavailable in referenced superclass) in Subclass polymorphism  ->  have to do typecasting.
 */

class Parent{ //superclass
    private int privateVariable=3;      // will not be inherited
    protected int parentVariable=4;
    int var=7;
    // constructor
    public Parent(int a){
        System.out.println("Parent Class");
    }
    public void parentMethod(){
        System.out.println("Hello from parent Method "+ privateVariable);
    }
    public void method(){}
}

//subclass
class Child extends Parent { //class subclass extends superclass
    /* INHERITED
    public int parentVariable=4;
    int var = 7;
    public void parentMethod(){
        System.out.println("Hello from parent Method");
    }
    public void method(){}
     */
    public Child() {
        //default parent class constructor call-> When parent class constructor parameterless
        //or no defined constructor of parent class
        // otherwise we need to use "super" explicitly according to the parent class argument.
        super(5);
        System.out.println("Child Class");
    }

    public int childVariable = 5;
    public void childMethod() {
        System.out.println("Hello from child Method");
    }
    //method overriding->overwrite (not mandatory, its a choice)
    //method signature should remain unchanged --> return type, name, parameter list
    //only method body can be changed
    public void parentMethod() {
        childVariable = 10;
        System.out.println("Hello from parent Method inside child class");
        super.parentMethod();
    }

    public void originParentMethod(){
        super.parentMethod();   // child can now call the origin parentMethod()
    }
}

class GrandChild extends Child{
    /*  INHERITED
    // -- parent
    public int parentVariable=4;
    int var = 7;
    public void parentMethod(){
        System.out.println("Hello from parent Method");
    }
     public void method(){}
    //-- child
    public int childVariable=5;
    public void childMethod(){
        System.out.println("Hello from child Method");
    // inherited overridden parentMethod()
    public void parentMethod() {
        childVariable = 10;
        System.out.println("Hello from parent Method inside child class");
        super.parentMethod();
    }
    public void originParentMethod(){
        super.parentMethod();   // grandChild can now call the origin parentMethod()
    }
    }
     */
    public GrandChild(){
        //super() call is optional, because Child() constructor is parameterless

        System.out.println("Grandchild Class");
    }
    public int grandVar=6;
    public void parentMethod() {
        grandVar = 50;
        childVariable = 10;
        System.out.println("Hello from parent Method inside grandchild class\t" + grandVar);
    }

}

public class _1_SubclassPolymorphism {
    public static void main(String[] args) {
        // Subclass polymorphism
        Parent A = new Child();
        // The method should exist in superclass to call it using subclass-polymorphism
        // when the method is called in Subclass Polymorphism, execution  --> the lowest subclass method will be executed
        A.parentMethod();

        //A.childMethod();   -> Not possible as `childMethod()` doesn't exist in superclass --> have to do typecasting
        ((Child)A).childMethod();


        Parent C=new GrandChild();
        // if the subclass doesn't override the method, then the execution will keep going back to it's immediate superclass for that Method till the method is found.
        C.parentMethod();

        GrandChild gc_1 = new GrandChild();
        gc_1.originParentMethod();      // executed the inherited originParentMethod() from Child class

    }
}