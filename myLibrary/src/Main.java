import Library.*;
import People.*;
import Utilities.*;
import Library.Book.Genre;

public class Main {
    public static void main(String[] args){
        System.out.println();

        // CREATING BOOKS
        Book GuerraEPace = new Book("Guerra e Pace", "Tolstoj", Genre.LITERATURE);
        Book IlMondoDiIeri = new Book("Il mondo di ieri", "Zweig", Genre.LITERATURE);
        Book  It= new Book("IT", "Stephen King", Genre.HORROR);

        // LIBRARY
        Library library = new Library();

        // LIBRARY-GESTOR
        LibraryGestor gestor = new LibraryGestor("Pasquale", "Bianco", "BNCPQL01B21F152R", library);

        try { System.out.println(library.getLast()); }
        catch (NoBookException ignored) {}

        library.addBook(GuerraEPace);

        try { System.out.println("The last book is:\n"+library.getLast()); }
        catch (NoBookException ignored) {}

        try { gestor.collect(); }
        catch (NoBookException ignored) {}

        library.addBook(It);

        try { System.out.println("The last book is:\n"+library.getLast()); }
            catch (NoBookException ignored) {}

        try { gestor.collect(); }
            catch (NoBookException ignored) {}

        try { System.out.println("The last book is:\n"+library.getLast()); }
        catch (NoBookException ignored) {}

        library.addBook(GuerraEPace);

    }
}
