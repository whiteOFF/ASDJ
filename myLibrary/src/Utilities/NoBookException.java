package Utilities;

public class NoBookException extends Exception{
    public NoBookException() { super("There are no books in the library, yet!\n"); }

}
