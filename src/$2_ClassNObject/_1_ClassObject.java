package $2_ClassNObject;
/* Key Takeaways
// A class is a blueprint or prototype from which objects are created. It defines what should be in each object and how each object should behave.
// An object is a software bundle of related state and behavior of a class. objects are often used to model the real-world.
// a class is a template for an object,
// and an object is an instance of a class.
// Class allows a function/method inside it which is the one of the main property of an OOP Language, than a Structured language such as, C.
// Class variables are called = attributes/properties/instance_variables.
// each instance of the class (that is, each object of the class) contains its own copy of these variables.
// Thus, the data for one object is separate and unique from the data for another.
// Class functions are called = Methods
// As a general rule, it is the Methods that determine how a class’ data can be used.
// We can write many classes in 1 java class file at the same level. which can not be public. only the main java class of the file can be public
*/

//-----------------
 /* in C
    struct Student{
    //Attributes->3
        int ID;
        String name;
        double cgpa;
    }student;
  */
class Student{
    int ID;         // attribute
    String name;    // attributes
    double cgpa;    // attributes

    double getCgpa (){      //method/function
        return cgpa;
    }
    void updateCgpa(double value){
        cgpa = (cgpa*value)/4;
    }
}

public class _1_ClassObject {
    // the main function/method
    public static void main(String[] args) {
        Student std_1; //a null reference in the memory --> which is able to hold an object of Student class.
        // when `new` keyword with constructor is used --> we assign an object to that null reference which has been created previously.
        std_1 = new Student();  // constructor --> to create an object --> a special method which has similar name to class name.

        std_1.name = "Win";
        std_1.ID = 5421;
        std_1.cgpa = 3.56;

        System.out.println(std_1.getCgpa());

        std_1.updateCgpa(3.5);
        System.out.println(std_1.getCgpa());
    }
}

/* QnA
1. Why JRE is set on IDE, but JDK is not? Difference between JDK and JRE?

2. How to generate Random strings in Java??
 */