package Social;

import Utils.*;

public class Utente {
    private String nome, cognome, nickname;

    // CONSTRUCTOR
    public Utente(String nome, String cognome, String nickname) {
        this.nome = nome;
        this.cognome = cognome;
        this.nickname = nickname;
    }

    // GETTER
    public String getNome() { return this.nome; }
    public String getCognome() { return this.cognome; }
    public String getEmail() { return this.nickname; }

    // SETTER
    public void setNome(String newNome) { this.nome = newNome; }
    public void setCognome(String newCognome) { this.cognome = newCognome; }
    public void setEmail(String newEmail) { this.nickname = newEmail; }

//    // POSTING
//    public Post publicPost(Post post, Bacheca bacheca) {
//        return bacheca.addPost(post); }
//
//    public Post publicPost(String didascalia, String file, Bacheca bacheca) {
//        return bacheca.addPost(new Post(this,didascalia, file));
//    }

    // COMMENTING
    public void commentPost(Post post, String didascalia, Bacheca bacheca) throws InvalidCommentExc {
        try { bacheca.commentPost(post,new Commento(this,didascalia)); }
        catch (InvalidCommentExc ignored){}
    }

    // READ COMMENT(S)
    public void readComment(Post post, Bacheca bacheca) throws NoCommentsExc {
        try { bacheca.readComment(post); }
        catch (NoCommentsExc ignored){}
    }

    @Override
    public String toString() {
        return this.nome + ' ' + this.cognome;
    }

}
