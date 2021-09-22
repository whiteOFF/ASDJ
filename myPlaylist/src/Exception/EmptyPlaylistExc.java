package Exception;

public class EmptyPlaylistExc extends Exception{
    public EmptyPlaylistExc() {
        System.out.println("*".repeat(22)+"\nThe playlist is empty!\n"+"*".repeat(22)+"\n");
    }
}
