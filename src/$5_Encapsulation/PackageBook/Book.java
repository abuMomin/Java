package $5_Encapsulation.PackageBook;

import java.util.Random;

public class Book {
    private int id;
    public String name;
    public int quantity;
    public double price;

    public Book(String name, int quantity, double price) {
        id = new Random().nextInt(100000);
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void stockIn (int no_of_books_to_order){
        quantity += no_of_books_to_order;
    }

    public void sellBook (int no_of_books_to_sell){
        if(quantity >= no_of_books_to_sell){
            quantity -= no_of_books_to_sell;
        }
    }
    public void stockOut (){
        quantity = 0;
    }

    public void printBookDetails(){
        System.out.println("Book Name: " + name + ",\tQuantity: "+ quantity + ",\tPrice: " + price);
    }

    public int getId() {
        return id;
    }
}
