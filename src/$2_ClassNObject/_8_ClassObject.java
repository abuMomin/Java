package $2_ClassNObject;
/* Key Takeaways

*/

public class _8_ClassObject {
    // We can write variables/attributes inside the class + outside main function --> can not perform operation here
    // We can also write methods/functions inside the class + outside main function --> can perform operations inside the method --> but it had to be called by the main function to perform that operation.
    int num = 5;
    double flt = 6.7;

    // A static method --> _8_ClassObject's instance creation is not required to call it.
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
        // new to create an instance of the class, before accessing the values of a class, even if it is the main class
        _8_ClassObject testObj = new _8_ClassObject();
        System.out.println(testObj.flt);

        int[] arr_1 = {7,3,9,8,13,1,5,19,15,2,4};
        printMaxMin(arr_1);
    }
}

/* QnA
1. Why JRE is set on IDE, but JDK is not? Difference between JDK and JRE?
 */