package OrdinePack;

public class Ordine {
    private static int codiceDiMantenimento=-1;
    private int codice;
    private float prezzo;
    private TipoOrdine tipoOrdine;
    private TipoPizza tipoPizza;

    // COSTRUTTORE
    public Ordine(float prezzo,TipoOrdine tipoOrdine,TipoPizza tipoPizza) {
        this.codice = ++codiceDiMantenimento;
        this.prezzo = prezzo;
        this.tipoOrdine = tipoOrdine;
        this.tipoPizza = tipoPizza;

    }

    // GETTER
    public int getCodice() { return codice; }
    public float getPrezzo() { return prezzo; }
    public TipoOrdine getTipoOrdine() { return tipoOrdine; }
    public TipoPizza getTipoPizza() { return tipoPizza; }

    // SETTER
    public void setCodice(int codice) { this.codice = codice; }
    public void setPrezzo(float prezzo) { this.prezzo = prezzo; }
    public void setTipoOrdine(TipoOrdine tipoOrdine) { this.tipoOrdine = tipoOrdine; }
    public void setTipoPizza(TipoPizza tipoPizza) { this.tipoPizza = tipoPizza; }

    // TO STRING
    public String toString() {
        return "- Codice ordine: "+ codice
                + "\n- Prezzo: "+ prezzo +"€"
                + "\n- Tipo Pizza: "+ tipoPizza
                + "\n- Tipo Ordine: "+ tipoOrdine +"\n";
    }
}
