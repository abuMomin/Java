package $3_ClassNObject;
// Class-test Question: assets/files/pdf_3.pdf

import java.util.Scanner;

class Books{
    int quantity;
    String name;
    double price;

    void updateCount(int count){
        quantity += count;
    }

    void printDetails(){
        System.out.println(name + ":\t" + quantity + ",\t" + price);
    }

    double calculatePrice(){
        return quantity*price;
    }
}
public class _3_ClassTest_1 {
    public static void main(String[] args) {
        Books[] books = new Books[2];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++){
            System.out.println("Enter book " + (i+1) + " details (Quantity, Name, Price):");
                books[i] = new Books();
                books[i].quantity = scan.nextInt();
                scan.nextLine();
                books[i].name = scan.nextLine();
                books[i].price = scan.nextDouble();
        }

        System.out.println("Before update:");
        books[0].printDetails();
        books[1].printDetails();

        books[0].updateCount(4);
        books[1].updateCount(11);

        System.out.println("After update:");
        books[0].printDetails();
        System.out.println(books[0].calculatePrice());
        books[1].printDetails();
        System.out.println(books[1].calculatePrice());
    }
}
