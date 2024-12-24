// 2 types of datatype in Java, 1. Primitive type, 2. class/reference type
// Reference type = String, any_class_written_by_you
// Primitive type = int, short, long, float, double, bool, char, byte
class _2_DataType{
    public static void main(String[] args) {
        char temp[] = {'1', 'a', 'c'};  // array of character is String
        char tempChar = 'b';
        String name = "Win";    // string is reference type.
        System.out.println(tempChar);
        System.out.println(name+ " " + name.getClass().getName());

//        AUTO CONVERSION -> Smaller datatype to larger datatype is possible.
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
        String six = "6"
//        int num_2 = (int) six;    // String to int direct typecast not possible
        int num_3 = 3;
        String three = num_3+"";    // int to String typecast way 1
        String four = (String) three;    // int to String typecast way 2

        //Shift operator --> The binary value of the number will be shifted 1 bit Left/Right
        int num = 6;                // 0110
        int numRightShift = 6>>1;   // 0011
        int numLeftShift = 6<<1;    // 1100
        System.out.println(numRightShift + " " + numLeftShift);

    }

}

/* QnA
1. What is the difference, usecases, pros and cons of reference type and primitive type?
 */