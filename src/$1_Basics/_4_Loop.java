package $1_Basics;

import java.util.Random;
import java.util.Scanner;

/* Key Takeaways
// static methods --> Static Methods does not require to create a class instance (object) to CALL it. it can be by it's method if,
it is within the same class from where it has been called.
*/
public class _4_Loop {
    public static void main(String[] args) {
        //------- For Loop
        // generating 1-D array using a FOR-LOOP function
        int[] arr_1 = getArray(5);
        // printing 1-D array using for-Loop
        printArray(arr_1);

        // generating 2-D array using a FOR-LOOP function
        int[][] arr2D_1 = getArray(5,6);
        // printing 2-D array using for-Loop
        printArray(arr2D_1);


        //------ For Each Loop
        int[] arr_2 = getArray(7);
        //printing a 1-D array using for-Each loop
        printArrayForEachLoop(arr_2);

        int[][] arr2D_2 = getArray(6,5);
        // printing 2-D array using for-Each Loop
        printArrayForEachLoop(arr2D_2);


        // User input taking using ---> Scanner class
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter a number below 100: ");

        // while-Loop ----------
        int numForWhileLoop = (scan.nextInt()/5)*5;
        System.out.print("Count till 100 in interval of 5 ---> ");
        while (numForWhileLoop <= 100){
            System.out.print(numForWhileLoop + "\t");
            numForWhileLoop += 5;
        }
        System.out.println("");

    }

    // Generate a random 1-D array --> using FOR-LOOP
    static int[] getArray(int size){
        Random random = new Random();
        int[] temp = new int[size];
        for (int i = 0; i <size; i++){
            temp[i] = random.nextInt(100);
        }
        return temp;
    }

    // Generate a random 2-D array --> using FOR-LOOP. With the previous method name (but different parameter) --> Method Overloading
    static int[][] getArray(int row, int col){
        Random random = new Random();
        int[][] temp = new int[row][col];
        for (int i = 0; i <row; i++){
            for(int j = 0; j < col; j++){
                temp[i][j] = random.nextInt(100);
            }
        }
        return temp;
    }

    // Method to print 1D array using FOR-LOOP
    static void printArray(int[] temp){
        System.out.println("\nPrinting Array using FOR Loop..............");
        for (int i = 0; i < temp.length; i++){
            System.out.print(temp[i]+ "\t");
        }
        System.out.println("");
    }

    // Method to print 2D array using FOR-LOOP
    static void printArray(int[][] temp){
        System.out.print("\nPrinting 2D Array using FOR Loop..............");
        for (int i = 0; i < temp.length; i++){
            System.out.println("");
            for (int j = 0; j < temp[i].length; j++){
                System.out.print(temp[i][j]+ "\t");
            }
        }
        System.out.println("");
    }

    static void printArrayForEachLoop(int[] temp){
        System.out.println("\nPrinting Array using FOR-EACH Loop..............");
        for (int value: temp){
            System.out.print(value + "\t");
        }
        System.out.println("");
    }

    static void printArrayForEachLoop(int[][] temp){
        System.out.println("\nPrinting 2D-Array using FOR-EACH Loop..............");
        for (int[] row: temp){
            for(int value: row){
                System.out.print(value + "\t");
            }
            System.out.println("");
        }
    }

}

/* QnA

 */