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
// Class functions are called = methods
// As a general rule, it is the methods that determine how a class’ data can be used.
// We can write many classes in 1 java class file at the same level. which can not be public. only the main java class of the file can be public
*/

public class _2_ClassObject {
    // We can write variables/attributes inside the class + outside main function --> can not perform operation here
    // We can also write methods/functions inside the class + outside main function --> can perform operations inside the method --> but it had to be called by the main function to perform that operation.
    int num = 5;
    double flt = 6.7;

    // A static method --> _2_ClassObject's instance creation is not required to call it.
    static void printMaxMin (int[] tempArr){
        int min = tempArr[0], max = tempArr[0];
        for (int i = 1; i < tempArr.length; i++){
            if(tempArr[i] > max){
                max = tempArr[i];
            }
            if (tempArr[i] < min){
                min = tempArr[i];
            }
        }
        System.out.println("\nMaximum value in the array is " + max + "\nMinimum Value in the array is " + min);
    }

    public static void main(String[] args) {
        // `new` keyword to create an instance/object of the class, before accessing the values of a class, even if it is the main class
        _2_ClassObject testObj = new _2_ClassObject();
        System.out.println(testObj.flt);    // use `.` operator to access attributes and methods

        int[] arr_1 = {7,3,9,8,13,1,5,19,15,2,4};
        printMaxMin(arr_1);
    }
}

/* QnA
1. Why JRE is set on IDE, but JDK is not? Difference between JDK and JRE?
 */