package Social;

import java.util.HashMap;
import Utils.*;

public class Bacheca {
    private HashMap<String, Post> bacheca;

    // CONSTRUCTOR GETTER SETTER
    public Bacheca() {
        bacheca = new HashMap<>();
    }

    public HashMap<String, Post> getBacheca() { return this.bacheca; }
    public void setBacheca(HashMap<String, Post> newBac) { this.bacheca = newBac; }

    // ADD POST
    public Post addPost(Post newPost) {
        return this.bacheca.putIfAbsent(newPost.getCode(), newPost);
    }

    // COMMENT POST (TRIGGER FROM POST class)
    protected void commentPost(Post post, Commento commento) throws InvalidCommentExc {
        if (commento.getTesto().isBlank())
            throw new InvalidCommentExc();
        this.bacheca.get(post.getCode()).comment(commento);
    }

    // READ AND REMOVE
    protected void readComment(Post post) throws NoCommentsExc{
        if (this.bacheca.get(post.getCode()).getStackCommenti().isEmpty())
            throw new NoCommentsExc();
        System.out.println("\nLettura commenti post "+ post.getCode() + ":");
        while (!this.bacheca.get(post.getCode()).getStackCommenti().isEmpty())
            System.out.println(this.bacheca.get(post.getCode()).getStackCommenti().pop());
    }


}
