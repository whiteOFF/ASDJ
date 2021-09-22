package Social;

import java.util.Stack;

public class Post {
    private String IDpost;
    private Utente creatorePost;
    private String didascalia;
    private String fileAllegato;
    private Stack<Commento> stackCommenti;

    // CONSTRUCTOR
    public Post(String ID, Utente creatorePost, String didascalia, String fileAllegato) {
        this.IDpost = ID;
        this.creatorePost = creatorePost;
        this.didascalia = didascalia;
        this.fileAllegato = fileAllegato;
        stackCommenti = new Stack<>();
    }

    // GETTER
    public String getCode() { return IDpost; }
    public Utente getCreatorePost() { return creatorePost; }
    public String getDidascalia() { return didascalia; }
    public String getFileAllegato() { return fileAllegato; }
    public Stack<Commento> getStackCommenti() { return stackCommenti; }

    // SETTER
    public void setCode(String IDpost) {
        this.IDpost = IDpost;
    }
    public void setCreatorePost(Utente creatorePost) {
        this.creatorePost = creatorePost;
    }
    public void setDidascalia(String didascalia) {
        this.didascalia = didascalia;
    }
    public void setFileAllegato(String fileAllegato) {
        this.fileAllegato = fileAllegato;
    }
    public void setStackCommenti(Stack<Commento> stackCommenti) {
        this.stackCommenti = stackCommenti;
    }

    // ADD COMMENT
    protected void comment(Commento commento) { this.stackCommenti.push(commento); }

    @Override
    public String toString() {
        return "\n- codice post= '"+ IDpost+
                "'\n- creatore post= '"+ creatorePost+
                "'\n- didascalia= \""+ didascalia+
                "\"\n- file allegato= '"+ fileAllegato+'\'';
    }
}