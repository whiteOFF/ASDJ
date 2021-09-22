import OrdinePack.*;
import PizzeriaPack.Pizzeria;
import Viventi.GestorePizzeria;

public class Main {

    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        GestorePizzeria gestore = new GestorePizzeria("Federica", "Bianca", "FDC22L", 1200, 130, pizzeria);

        Ordine ordine1 = new Ordine(6.99f, TipoOrdine.Asporto,TipoPizza.Capricciosa);
        Ordine ordine2 = new Ordine(7.99f, TipoOrdine.Asporto,TipoPizza.Vegetariana);
        Ordine ordine3 = new Ordine(7.99f, TipoOrdine.Domicilio,TipoPizza.Vegetariana);
        Ordine ordine4 = new Ordine(5.99f, TipoOrdine.Asporto,TipoPizza.Margherita);

        gestore.aggiungiOrdine(ordine1);
        gestore.aggiungiOrdine(ordine2);
        gestore.aggiungiOrdine(ordine3);
        gestore.aggiungiOrdine(ordine4);

        gestore.leggiOrdine(TipoOrdine.Asporto);
        gestore.leggiOrdine(TipoOrdine.Domicilio);

        gestore.rimuoviOrdine(TipoOrdine.Asporto);
        gestore.rimuoviOrdine(TipoOrdine.Domicilio);
    }
}
