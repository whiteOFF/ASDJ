package Social;

public class Commento {
    private Utente utente;
    private String testo;

    // CONSTRUCTOR
    public Commento(Utente utente, String testo) {
        this.utente = utente;
        this.testo = testo;
    }

    // GETTER
    public Utente getUtente() { return utente; }
    public String getTesto() { return testo; }

    // SETTER
    public void setUtente(Utente utente) { this.utente = utente; }
    public void setTesto(String testo) { this.testo = testo; }

    @Override
    public String toString() {
        return "- Creatore commento: '" + this.utente +'\''+
                "\n- Testo commento: '" + this.testo +"'\n";
    }
}
