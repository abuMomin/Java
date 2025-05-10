package $0_Practice;

import java.util.Random;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr2D_1 = get2D(2,3);
        int[][] arr2D_2 = get2D(3,3);

        System.out.print("Array 1");
        printArray(arr2D_1);
        System.out.print("\nArray 2");
        printArray(arr2D_2);

        int[][] arr2D_result = matrixMultiplication(arr2D_1, arr2D_2);

        System.out.print("\nResult: ");
        printArray(arr2D_result);
    }


    // generate 2D array
    static int[][] get2D (int row, int col){
        Random random = new Random();
        int[][] temp = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = random.nextInt(10);
            }
        }
        return temp;
    }

    static void printArray(int[][] temp){
        System.out.println("");
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    static int[][] matrixMultiplication (int[][] temp_1, int[][] temp_2){
        int row = temp_1.length;
        int col = temp_2[0].length;
        int[][] result = new int[row][col];
        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                result[i][j] = 0;
                for (int k = 0; k < col; k++){
                    result[i][j] += (temp_1[i][k] * temp_2[k][j]);
                }
            }
        }
        return result;
    }
}
