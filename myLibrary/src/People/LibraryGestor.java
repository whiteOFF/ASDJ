package People;

import Library.Library;
import Library.LibraryGestorInterface;
import Utilities.NoBookException;

public class LibraryGestor extends Person implements LibraryGestorInterface {
    private Library library;

    // CONSTRUCTOR
    public LibraryGestor (String name, String surname, String cf, Library lib) {
        super(name, surname, cf);
        this.library = lib;
    }

    // COLLECTING BOOKS
    public void collect() throws NoBookException {
        if (library.getLast() != null) {
            System.out.println("The following book has been collected: \n"+ this.library.getLast());
            library.removeBook();
        }
    }

}
