package org.howard.edu.lsp.midterm.question1;


/**
 * A driver class to demonstrate the functionality of the Book class.
 * It creates instances of Book and tests the overridden equals() and toString() methods.
 */

public class BookDriver {

    /**
     * The main method to execute the Book class functionality.
     *
     * @param args Command line arguments (not used in this program).
     */

    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Checking equality between book1 and book2 (should be true)
        System.out.println("Book1 equals Book2? " + book1.equals(book2)); // Output: true

        // Checking equality between book1 and book3 (should be false)
        System.out.println("Book1 equals Book3? " + book1.equals(book3)); // Output: false

        // Displaying the string representation of each book
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
