package $1_Basics;

/* Key Takeaways
// 2 types of datatype in Java, 1. Primitive type, 2. class/reference type
// Reference type = String, any_class_written_by_you
// Primitive type =  byte, int, short, long, float, double, bool, char
// The == operator checks reference equality for objects and value equality for primitives.
// .equals() --> Compares the content of objects.
*/
class _2_DataTypeOperator {
    public static void main(String[] args) {
        char temp[] = {'1', 'a', 'c'};  // array of character is String
        char tempChar = 'b';
        String name = "Win";    // string is reference type.
        System.out.println(tempChar);
        System.out.println(name+ " " + name.getClass().getName());

        System.out.println(name.charAt(0));  // get character from String using Index

//      AUTO CONVERSION -> Smaller datatype to larger datatype is possible.
        byte nine = 9;
        int takeNine = nine;
//        byte cannotTakeNine = takeNine;
        double takeNineForDouble = takeNine;

        // Type Casting for larger datatype to smaller datatype
        double PI = 3.1416;
        byte takeCastedNine = (byte) takeNine;
        int takePI = (int) PI;

        // if I typecast int TO byte --> the LSB 8 bits will be casted to byte.

        // String typecast
        String six = "6";
//        int num_2 = (int) six;    // String to int direct typecast not possible
        int takeStringToInt = Integer.parseInt(six);       // casted to int, if the string includes other than int, throws exception.
        System.out.println(takeStringToInt);
        int num_3 = 3;
        String three = num_3+"";    // int to String typecast way 1
        String four = Integer.toString(num_3);    // int to String typecast way 2
        String five = String.valueOf(num_3);    // int to String typecast way 3

        //Shift operator --> The binary value of the number will be shifted 1 bit Left/Right
        int num = 6;                // 0110
        int numRightShift = 6>>1;   // 0011
        int numLeftShift = 6<<1;    // 1100
        int num2RightShift = 22>>2;   // 10110 --> 00101        // shifted to bits to right
        int num2LeftShift = 22<<2;   // 10110 --> 1011000        // shifted to bits to left

        System.out.println(numRightShift + " " + numLeftShift);
        System.out.println(num2RightShift + " " + num2LeftShift);

    }

}

/* QnA
1. What is the difference, usecases, pros and cons of reference type and primitive type?
    Ans: Primitive data type store simple values directly in memory and are not objects. Unlike primitive types,
    reference types store references (memory addresses) to the actual data. String holds a reference to the
    memory location where the actual string data is stored.
    Memory Allocation:
    Primitive Types: Memory is allocated on the stack.
    Reference Types: Memory is allocated on the heap, and the reference is stored on the stack.
    Default Values:
    Primitive Types: Have default values (e.g., 0 for numeric types, false for boolean).
    Reference Types: Default to null if not initialized.
    Mutability:
    Primitive Types: Immutable; the value cannot be changed once assigned.
    Reference Types: Can be mutable or immutable, depending on the object's design.
    Methods and Properties:
    Primitive Types: Do not have methods or properties.
    Reference Types: Being objects, they can have methods and properties.

2. How to get a particular index value from a String?
    Ans: using `chatAt(<INDEX>)` method.
        Exp: string_name.charAt(1);
 */