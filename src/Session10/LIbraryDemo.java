package Session10;

import java.util.List;


public class LIbraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("testbok");
        library.displayBooks();

        List<String> lib = library.getBooks();
        lib.add("New Book");
        library.displayBooks();




    }
}
