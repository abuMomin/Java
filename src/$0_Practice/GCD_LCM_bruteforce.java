package $0_Practice;

import java.util.Scanner;

public class GCD_LCM_bruteforce {

    static int gcdBruteforce(int num_1, int num_2){
        int min = Math.min(num_1, num_2);
        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if (num_1 % i == 0 && num_2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    static long lcmBruteforce(long num_1, long num_2, long gcd){
        return (num_1 * num_2)/gcd;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int numb_1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int numb_2 = scan.nextInt();

        int gcd = gcdBruteforce(numb_1, numb_2);
        long lcm = lcmBruteforce(numb_1, numb_2, gcd);

        System.out.println("GCD is : " + gcd);
        System.out.println("LCM is : " + lcm);
    }
}
