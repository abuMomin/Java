// Array is reference type in Java
// which means when array is passed as a parameter, the reference of the array is passed, not the copy of the array

class _3_Array{
    //Function to change array's first index
    public static void change(int[] temp){
        temp[0] = temp[1];
    }

    public static void main(String[] args){

        // array initialization while declaration using direct assignment
        int[] arr_1 = {1,2,3,4,5};

        // passing the array as parameter
        change(arr_1);

        //Printing the array as parameter to check whether array's reference is passed OR value is passed
        for (int i = 0; i < arr_1.length; i++){
            System.out.println(arr_1[i]);
        }
        System.out.println("Array is pass by reference or reference type.");

        // ARRAY INITALIZATION while DECLARATION
        int[] arr_2 = new int[10];      // each index value is 0
        int size = 15;
        double[] arr_3 = new double[size];  // each index value is 0.0

        // ARRAY INITALIZATION while DECLARATION --> direct assignment
        int[] arr_4 = {1,2,3,4,5};
        int[] arr_5;
        arr_5 = new int[]{5,6,7,8,9};
    }
}

/* QnA

 */