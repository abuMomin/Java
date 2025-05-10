package $4_PassByValue;
/* Key Takeaways
// Tutorial Link: https://www.youtube.com/watch?v=-5NC5_sI-vQ
// Java is ALWAYS pass by value. For primitive types it works in conventional way. However, for Object-types it works differently.
// For Object-types (Object, Array, String), while Java is still pass-by-value when it is passed in through method parameter, the value that's copied for objects is a reference “memory address of the object”, not the object itself.
// Therefore, in object-types, a copy of the reference (memory address) is passed.
// This means that if you modify the contents of the array/object within a method, those changes are reflected in the original array outside the method.
// Because both the original reference, and the copied reference, point to the same array in memory.
// However, as it passes memory address as pass-by-value, if we try to reassign_a_new_object to that reference (within an outside method), it changes its reference value, no changes are reflected outside that method in the original object.
// Here, it shows it's true pass-by-value property.
// Hence, Whether we try to swap object-types references OR try to reassign new object in that reference, no reflection is made outside the method.
// ------------------- EXCEPTION
// One exception is Strings, which are also Object but has IMMUTABLE property.  This means that once a String object is created, its contents cannot be changed.
// When you pass a String to a method, a copy of the reference is passed, just like with arrays/objects.
// Since Strings are immutable, any operation that seems to "modify" the String actually creates a new String object with different reference (even though the variable name is the same). The original String remains unchanged after they are created.
// When we pass a String to a method or function, a new String object is created with the same value, and any changes made to the parameter within the method or function have no effect on the original String object outside the method or function. the original reference remains pointed at the original String.
*/

public class _1_PassByValue {
    public static void main(String[] args) {
        System.out.println("----- Primitive Types ---- Conventional Pass-by-Value");
        int numb1 = 10, numb2 =20;
        swapNumbers(numb1, numb2);
        // original variables didn't change
        System.out.println("Swapping numbers don't work:\t"+ numb1 + "\t" + numb2);


        System.out.println("\n----- Object Types (Object) ---- Pass-by-Value but only Memory_Address_of_that_Reference");
        // Pass-by-value for Objects as well, but it passes the reference "value" of that object as pass-by-value
        CustomClass c1 = new CustomClass(5);
        CustomClass c2 = new CustomClass(10);

        // swapping objects
        swapObject(c1,c2);
        System.out.println("Swapping objects --> will not be reflected --> AS the reference value (memory address) is changing inside that `swapObject` method");
        c1.printData();
        c2.printData();

        // changing object properties
        changeObject(c1);
        System.out.println("Changing object properties --> will be reflected as the reference is referring to the object --> the reference value (memory address) is not changing inside that `changeObject` method");
        c1.printData();

        // reassigning new object in the reference
        reassignNewObject(c1);
        System.out.println("Reassigning new Object --> will not be reflected --> AS the reference value (memory address) is changing, and getting a new reference inside that `reassignNewObject` method");
        c1.printData();


        // ARRAY


        System.out.println("\n----- Object Types (Array) ---- Pass-by-Value but only Memory_Address_of_that_Reference");
        int[] array_1 = new int[]{2,5,7,9};
        int[] array_2 = {4,8,65,7};

        // swapping arrays
        swapArray(array_1, array_2);
        System.out.println("Swapping array (object) --> will not be reflected --> AS the reference value of the array (memory address) is changing inside that `swapArray` method");
        printArray(array_1);
        printArray(array_2);

        // changing array values
        changeArray(array_1);
        System.out.println("Changing Array values --> will be reflected as the reference is referring to the object --> the reference value of the array(memory address) is not changing inside that `changeArray` method");
        printArray(array_1);

        // reassigning new array in the reference
        reassigningNewArray(array_1);
        System.out.println("Reassigning new array --> will not be reflected --> AS the reference value of the array (memory address) is changing, and getting a new reference inside that `reassigningNewArray` method");
        printArray(array_1);


        // STRING


        System.out.println("\n----- Strings (Object Type) ---- Pass-by-Value but only Memory_Address_of_that_Reference AND String is immutable");
        String string1 = "Win", string2 = "Chadni";

        // swapping strings
        swapStrings(string1, string2);
        System.out.println("Swapping String (object) --> will not be reflected --> AS the reference value of the string (memory address) is changing inside that `swapStrings` method");
        System.out.println(string1 + "\t" + string2);

        // changing String's value
        changeString(string1);
        System.out.println("Changing String values --> will NOT be reflected on original string as String object is IMMUTABLE --> it creates a new string with in a different reference (can have same variable name) inside that `changeString` method");
        System.out.println(string1);
    }


    static void printArray(int[] temp){
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "\t");
        }
        System.out.println("");
    }
    static void swapObject(CustomClass c1, CustomClass c2){
        CustomClass temp = c1;
        c1 = c2;
        c2 = temp;
    }

    static void changeObject(CustomClass temp){
        temp.setData(50);
    }
    static void reassignNewObject(CustomClass temp){
        temp = new CustomClass(60);
    }


    static void changeArray(int[] temp){
        temp[0] = temp[1];
    }

    static void swapArray(int[] temp_1, int[] temp_2){
        int[] temp = temp_1;
        temp_1 = temp_2;
        temp_2 = temp;
    }
    static void reassigningNewArray(int[] temp){
        temp = new int[]{1,2,3,4};
    }
    static void swapNumbers (int numb1, int numb2){
        // swapping without creating a temporary variable
        numb2 = numb1*numb2;
        numb1 = numb2/numb1;
        numb2 = numb2/numb1;
    }

    static void swapStrings (String string1, String string2){
        String temp = string2;
        string2 = string1;
        string1 = temp;
    }

    static void changeString(String tempString){
        tempString = "Win is Changed";
    }
}

class CustomClass{
    private int a;

    CustomClass(int data){
        a = data;
    }

    void setData(int a){
        this.a = a;
    }

    void printData(){
        System.out.println("Custom Object data: " + a);
    }
}

/* QnA

 */

