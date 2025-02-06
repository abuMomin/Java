package $2_ClassNObject;
/* Key Takeaways
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
 */