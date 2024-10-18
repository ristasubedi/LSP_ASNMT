package org.howard.edu.lsp.midterm.question1;

/**
 * Represents a book in a library.
 * This class stores details about a book such as title, author, ISBN, and year of publication.
 */

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructor for the Book class.
     *
     * @param title         The title of the book.
     * @param author        The author of the book.
     * @param ISBN          The ISBN number of the book.
     * @param yearPublished The year the book was published.
     */
    
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The new title of the book.
     */
    
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The new author of the book.
     */
    
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the ISBN number of the book.
     *
     * @return The ISBN number of the book.
     */
    
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN number of the book.
     *
     * @param ISBN The new ISBN number of the book.
     */
    
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Gets the year the book was published.
     *
     * @return The year the book was published.
     */
    
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the year the book was published.
     *
     * @param yearPublished The new year of publication for the book.
     */
    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * Compares this book to another object. Two books are considered equal if
     * they have the same ISBN and author.
     *
     * @param obj The object to compare this book against.
     * @return true if the books are equal based on ISBN and author, false otherwise.
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    /**
     * Returns a string representation of the book, containing its title, author,
     * ISBN, and year of publication.
     *
     * @return A string representing the book's details.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}