package Session10;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;


public class Library {
    private List<String> books;

    public Library() {
        books = new ArrayList<>();

    }

    public void addBook(String book) {
        if (!book.isEmpty()) {
            books.add(book);
            System.out.println("Book added successfrully");
        } else {
            System.out.println("Book name is invalid");
        }
    }

    public List<String> getBooks() {
        //return Collections.unmodifiableList(books);
        return books;
    }
    public void displayBooks() {
        System.out.println("List of books: " + books);
    }
}
