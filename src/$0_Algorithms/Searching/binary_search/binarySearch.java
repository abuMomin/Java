package $0_Algorithms.Searching.binary_search;

import java.util.Scanner;

public class binarySearch {
    public int search(int[] nums, int target) {
        int index = -1, start = 0, mid = 0, end = (nums.length -1);
        while( start <= end ){
            mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter target number to get it's index: ");
        int target = scan.nextInt();

        int index = new binarySearch().search(arr, target);

        if (index != -1)
            System.out.println("the index is = " + index);
        else
            System.out.println("Target not found in the array");
    }
}
