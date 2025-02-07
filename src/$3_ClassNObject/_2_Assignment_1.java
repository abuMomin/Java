package $3_ClassNObject;
// Assignment Question: assets/files/pdf_1.pdf

import java.util.Scanner;

class Resources{
    String resourceName;
    int resourceCount;
    double resourceValue;

    double calculatePrice (int a){
        return (a/resourceCount)+resourceValue;
    }

    void updateCount(int num){
        resourceCount += num;
    }
}
public class _2_Assignment_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an array size: ");
        int n = scan.nextInt();

        int countEvenNumbers = 0;
        int[] evenNumbersArray = new int[n];
        int[] pennies = new int[n];
        System.out.println("Populate the array:");
        for (int i = 0; i < n; i++){
            pennies[i]= scan.nextInt();
            if(pennies[i] % 2 ==0) {
                evenNumbersArray[countEvenNumbers] = pennies[i];
                countEvenNumbers++;
            }
        }

        if(countEvenNumbers > 0){
            Resources[] resources = new Resources[countEvenNumbers];

            for(int i = 0; i < countEvenNumbers; i++){
                resources[i] = new Resources();
                System.out.print("\n Enter Even Resource "+ (i+1) +" Name: ");
                scan.nextLine();
                resources[i].resourceName= scan.nextLine();
                System.out.print("Enter Even Resource "+ (i+1) +" Count: ");
                resources[i].resourceCount= scan.nextInt();
                System.out.print("Enter Even Resource "+ (i+1) +" Value: ");
                resources[i].resourceValue= scan.nextDouble();

                System.out.println("Calculate Price: " + resources[i].calculatePrice(evenNumbersArray[i]));

                if(i+1 == countEvenNumbers){
                    System.out.println("Final Resource count before update: "+ resources[i].resourceCount);
                    resources[i].updateCount(10);
                    System.out.println("Final Resource count after update: "+ resources[i].resourceCount);
                }
            }
        }
    }
}
