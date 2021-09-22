package Persona;

public class Persona {
    protected String nome, cognome;

    // COSTRUTTORI
    public Persona() { this(null, null); }
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    // GETTER
    public String getNome(){ return this.nome; }
    public String getCognome(){ return this.cognome; }

    // SETTER
    public void setNome(String nuovoNome){ this.nome = nuovoNome; }
    public void setCognome(String nuovoCognome){ this.nome = nuovoCognome; }
}
