package $0_Practice;

import java.util.Scanner;

public class GCD_LCM_euclidean {
    public static int gcdEuclidean(int num_1, int num_2){
        while(num_2 != 0){
            int temp = num_2;
            num_2 = num_1 % num_2;
            num_1 = temp;
        }
        return num_1;
    }
    public static long lcmEuclidean(long num_1, long num_2, long gcd){
        return (num_2*num_1)/gcd;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int numb_1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int numb_2 = scan.nextInt();

        int gcd = gcdEuclidean(numb_1, numb_2);
        long lcm = lcmEuclidean(numb_1, numb_2, gcd);

        System.out.println("GCD is : " + gcd);
        System.out.println("LCM is : " + lcm);
    }
}
