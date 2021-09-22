package Utils;

public class InvalidCommentExc extends Exception {
    public InvalidCommentExc() {
        System.out.println('\n' + "*".repeat(29) + "\nIl commento è privo di testo.\n");
    }
}
