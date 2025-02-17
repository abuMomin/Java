package $5_Encapsulation;
/* Key Takeaways
// Resource: assets/images/fig_1_Access_modifier_Chart.png
// -------------------
// Classes written in the same file in same package/folder =  classes written in separate file within same package/folder = same access.
// Java "import", by default, maintain absolute path referencing from `src` folder. Doesn't support relative path referencing.
// Access Modifiers --> public, private, protected, default (no modifier).
// public --> accessible (Class, methods, and instance_variables) to any classes/subclasses of same/different package. Just need to import its path from SOURCE folder.
//              Every method, instance_variable has to be made public in order to access everything from a public class.
// private --> only accessible to its own class.
                Mainly used for not providing direct access to sensitive information of instance_variables.
// protected --> accessible to same package classes/subclasses, and different package subclasses.
// default (no access modifier) --> act as public to other classes/subclasses in the same package. act as private for other classes/subclasses in a different package.
*/

import $5_Encapsulation.PackageBook.Book;

public class _1_AccessModifier_BookStore {
    // No. of books the library ever affiliated (sold, selling, will sell) with.
    static int booksOfStore = 5;
    public static void main(String[] args) {
        Book[] books = new Book[50];

        String[] booknames = {"Effective Java", "Java: The Complete Reference", "Head First Java", "Clean Code", "Java Concurrency in Practice"};
        double[] prices = {45.99, 39.99, 34.50, 42.00, 50.75};
        int[] stocks = {90, 97, 52, 47, 50};

        for (int i = 0; i < booksOfStore; i++) {
            books[i] = new Book(booknames[i], stocks[i], prices[i]);
        }

        books[2].stockOut();
        orderBook(books,"Cracking The Coding Interviews", 74, 69.00);
        viewAvailableBooks(books);

        books[2].stockIn(43);
        viewAvailableBooks(books);

        //viewing private data using get method
        System.out.println(books[0].getId());

    }

    static void orderBook(Book[] tempBooks, String name, int quantity,double price){
        tempBooks[booksOfStore] = new Book(name, quantity, price);
        booksOfStore++;
    }

    static void viewAvailableBooks (Book[] books){
        System.out.println("Printing all the available books: ");
        for (int i = 0; i < booksOfStore; i++){
            if (books[i].quantity > 0)
                books[i].printBookDetails();
        }
        System.out.println("");
    }
}

/* QnA

 */


