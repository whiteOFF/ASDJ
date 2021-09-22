package Library;

import Utilities.NoBookException;
import Utilities.SimplyLinkedList;

public class Library {
    private SimplyLinkedList <Book> library;

    // CONSTRUCTOR
    public Library () {
        this.library = new SimplyLinkedList <Book> ();
    }

    // GET LAST
    public Book getLast() throws NoBookException {
        if (library.isEmpty()) throw new NoBookException();
        return library.getLast();
    }

    // ADD BOOK
    public void addBook(Book book) {
        System.out.println("Book added\n");
        library.addLast(book); }

    // REMOVE BOOK
    public void removeBook() { library.removeLast(); }
}
