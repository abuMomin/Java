package $1_Basics;

/* Key Takeaways
// Array is reference type in Java
// which means when array is passed as a parameter, the reference of the array is passed, not the copy of the array
// Java arrays know their size (length property)
//Java multidimensional arrays need not be rectangular
//Java array elements are initialized by default
*/
class _3_Array{
    public static void main(String[] args){

        // array initialization while declaration using direct assignment
        int[] arr_1 = {1,2,3,4,5};

        // Array's length property
        System.out.println("arr_1 Array Size is " + arr_1.length); // Java knows its array size.

        // passing the array as parameter
        change(arr_1);

        //The reference value of the array is passed, thus changing the references creates changes in the Array
        printArray(arr_1);
        System.out.println("\nJava is always pass-by-value, Here, the reference value of array is passed. Thus, changing the references creates changes in the Array.");

        //--------------------------
        // ARRAY INITALIZATION while DECLARATION
        int[] arr_2 = new int[10];      // each index value is 0
        // new int[] --> constructor --> to create an array object
        int size = 15;
        double[] arr_3 = new double[size];  // each index value is 0.0
        printArray(arr_3);

        // ARRAY INITALIZATION while DECLARATION --> direct assignment
        int[] arr_4 = {1,2,3,4,5};
        int[] arr_5;
        arr_5 = new int[]{5,6,7,8,9};

        //-------------------
        // 2D array --> Direct Initialization
        int[][] arr_2D = {{1,2,3,}, {3,2},{4,7,1,98}};       // Java multi-dimensional arrays can be nonRECTANGULAR.
        printArray(arr_2D);
        System.out.println("A nonRectangular 2-D Array");

        // 2D array  --> Initialization using Loop
        int[][] arr_2D_2 = new int[10][12];
        for (int i = 0; i < arr_2D_2.length; i++){
            for (int j = 0; j < arr_2D_2[i].length; j++){
                arr_2D_2[i][j] = i+j;
            }
        }

        System.out.println("\nthe 2D length of arr_2D_2 is --> " + arr_2D_2.length + ", " +arr_2D_2[0].length); //get 2D array length

        //printing 2D array
        printArray(arr_2D_2);

    }


    //Function to change array's first index
    public static void change(int[] temp) {
        temp[0] = temp[1];
    }

    // Method to print 2D array
    public static void printArray(int[][] temp){
        System.out.print("\nPrinting 2D Array..............");
        for (int i = 0; i < temp.length; i++){
            System.out.println("");
            for (int j = 0; j < temp[i].length; j++){
                System.out.print(temp[i][j]+ "\t");
            }
        }
        System.out.println("");
    }

    // Method to print 1D array with the same name --> Method Overloading
    public static void printArray(int[] temp){
        System.out.println("\nPrinting Array..............");
        for (int i = 0; i < temp.length; i++){
            System.out.print(temp[i]+ "\t");
        }
        System.out.println("");
    }

    // Method to print 1D array of `double` datatype with the same name --> Method Overloading
    public static void printArray(double[] temp){
        System.out.println("\nPrinting Array of double..............");
        for (int i = 0; i < temp.length; i++){
            System.out.print(temp[i]+ "\t");
        }
        System.out.println("");
    }
}

/* QnA

 */