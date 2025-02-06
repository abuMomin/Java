package $2_ClassNObject;
/* Key Takeaways
// Class allows a function/method inside it which is the one of the main property of an OOP Language, than a Structured language such as, C.
// We can write many classes in 1 java class file. which can not be public. only the main java class of the file can be public
// Class variables are called = attributes. Class functions are called = function
// an instance of a class is called = an object
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

public class _7_ClassObject {
    // the main function/method
    public static void main(String[] args) {
        Student std_1; //a null reference --> which holds the memory/space for an object of Student class.
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

 */