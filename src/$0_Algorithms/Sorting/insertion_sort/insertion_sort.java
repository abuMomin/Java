package $0_Algorithms.Sorting.insertion_sort;

import java.util.Scanner;


public class insertion_sort {

                                                //insertion sorting method
    static int[] sorting(int[] arr2){
        int key, j;
        for (int i = 1; i < arr2.length; i++){
            key = arr2[i];
            j = i -1;
            while (j >= 0 && arr2[j] > key){
                arr2[j+1] = arr2[j];
                j--;
            }
            arr2[j+1] = key;
        }
        return arr2;
    }

                                                    //main function
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = scan.nextInt();

        System.out.print("Enter the Array elements : ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        //sorting method call
        arr = sorting(arr);
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
