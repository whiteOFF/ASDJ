import Social.*;
import Utils.*;

public class Main {
    public static void main(String[] args) {
        Bacheca bacheca = new Bacheca();
        Utente francesca = new Utente("Francesca", "Bianca", "f.bianca");
        Utente marco = new Utente("Marco", "Rossi", "m.rossi");

        Post postDiMarco = new Post("0000",marco, "Guardate la cover che ho registrato", "cover.mp4");
        (System.out).println(postDiMarco);
        bacheca.addPost(postDiMarco);

        Post postDiFrancesca = new Post("0001",francesca, "Finalmente una bella giornata di sole", "sole.jpg");
        (System.out).println(postDiFrancesca);
        bacheca.addPost(postDiFrancesca);

        try {
            marco.commentPost(postDiFrancesca,"Bellissima foto!",bacheca);
        } catch (InvalidCommentExc ignored) {}

        try {
            francesca.readComment(postDiFrancesca, bacheca);
            francesca.readComment(postDiMarco, bacheca);
        } catch (NoCommentsExc ignored) {}
    }
}