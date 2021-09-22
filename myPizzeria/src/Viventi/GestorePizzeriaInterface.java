package Viventi;

import OrdinePack.Ordine;
import OrdinePack.TipoOrdine;

public interface GestorePizzeriaInterface {
    public void aggiungiOrdine(Ordine ordine);
    public Ordine rimuoviOrdine(TipoOrdine tipo);
    public Ordine leggiOrdine(TipoOrdine tipo);
}
