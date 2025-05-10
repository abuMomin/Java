package $0_Practice;

public class SubArray {

    static int[][] generateArrayOfSubArrays(int[] nums) {
        int totalSubArrays = (nums.length * (nums.length + 1)) / 2;
        int[][] arrayOfSubArrays = new int[totalSubArrays][];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int index = 0;
                arrayOfSubArrays[count] = new int[(j - i) + 1];
                for (int k = i; k <= j; k++) {
                    arrayOfSubArrays[count][index] = nums[k];
                    index++;
                }
                count++;
            }
        }
        return arrayOfSubArrays;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 6, 2, 7, 1};
        int k = 6;
//        printSubArrays(nums);
        printArrayOfSubArrays(generateArrayOfSubArrays(nums));
    }

    static void printSubArrays(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("");
                count++;
            }
        }
        System.out.println("Total subarray: " + count);
    }

    static void printArrayOfSubArrays(int[][] arrofSubArrays) {
        for (int i = 0; i < arrofSubArrays.length; i++) {
            for (int j = 0; j < arrofSubArrays[i].length; j++) {
                System.out.print(arrofSubArrays[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

