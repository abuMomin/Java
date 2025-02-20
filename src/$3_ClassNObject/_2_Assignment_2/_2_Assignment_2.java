package $3_ClassNObject._2_Assignment_2;

import java.util.Random;

// Assignment Question: assets/files/pdf_2.pdf
public class _2_Assignment_2 {
    public static void main(String[] args) {
        Book[] bookstore = new Book[4];

        bookstore[0] = new Book();
        bookstore[1] = new Book(438,55);
        bookstore[2] = new Book(651, "The Devil on Earth: Israel", 15);
        bookstore[3] = new Book(582, "The Adventure of Gallilio", 45);

        bookstore[1].setName("Advance Learner");
        bookstore[0].setName("Data Structure and Algorithm");
        bookstore[0].setQuantity(50);

        for (Book book: bookstore) {
            book.printInfo();
        }

        bookstore[1].sellBooks(55);
        bookstore[2].sellBooks(10);

        for (int i = 0; i < bookstore.length; i++) {
            if(bookstore[i].getQuantity() == 0)
                bookstore[i] = null;
        }

        bookstore[2].buyBooks(111);
        bookstore[3].buyBooks(18);

        for (Book book: bookstore) {
            if (book == null)
                continue;
            else
                book.printInfo();
        }

        int sum = 0;
        for (int i = 0; i < bookstore.length; i++) {
            if (bookstore[i] == null)
                continue;
            sum += bookstore[i].getQuantity();
        }
        System.out.println("Total Books in the bookstore = " + sum);

    }
}

class Book {
    private int id;
    private String name;
    private int quantity;

    Book(){
        id = new Random().nextInt(1000);
    }

    Book(int id, int quantity){
        this.id = id;
        this.quantity = quantity;
    }

    public Book(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void sellBooks(int count){
        if(quantity >= count){
            quantity -= count;
            System.out.println("Sold " + count + " of " + name + " successfully");
        }
        else{
            System.out.println("Not enough Stock!");
        }
    }

    void buyBooks(int count){
        quantity += count;
        System.out.println("Purchased " + count + " of " + name + " successfully");
    }

    void printInfo(){
        System.out.printf("BOOK_ID: %d,\tBOOK_NAME: %s,\tBOOK_QUANTITY: %d%n", id,name,quantity);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
