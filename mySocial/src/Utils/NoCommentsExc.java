package Utils;

public class NoCommentsExc extends Exception {
    public NoCommentsExc() {
        System.out.println('\n' + "*".repeat(40) + "\nIl post non ha ancora ricevuto commenti.\n");
    }
}
