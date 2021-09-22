package Esami;

import Utilities.TipoCorso;

public class Esame {
    protected String nome, codice;
    protected TipoCorso tipoCorso;

    // COSTRUTTORI
    public Esame() {};
    public Esame(String nome, String codice){
        this.nome = nome;
        this.codice = codice;
    }
    public Esame(String nome, String codice, TipoCorso tipoCorso){
        this(nome, codice);
        this.tipoCorso = tipoCorso;
    }

    // GETTER
    public String getNome(){ return nome; }
    public String getCodice(){ return codice; }
    public TipoCorso getTipoCorso(){ return tipoCorso; }

    // SETTER
    public void setNome(String nome) { this.nome = nome; }
    public void setCodice(String codice) { this.codice = codice; }
    public void setTipoCorso(TipoCorso tipoCorso) { this.tipoCorso = tipoCorso; }
}
