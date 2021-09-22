package PizzeriaPack;

import OrdinePack.Ordine;
import OrdinePack.TipoOrdine;
import QueuePack.myQueue;
import java.util.HashMap;

public class Pizzeria {
    private HashMap<TipoOrdine,myQueue> ordiniPizzeria;

    // COSTRUTTORE
    public Pizzeria() {
        ordiniPizzeria = new HashMap<>();
        ordiniPizzeria.put(TipoOrdine.Asporto, new myQueue());
        ordiniPizzeria.put(TipoOrdine.Domicilio, new myQueue());
    }

    // AGGIUNGI ORDINE
    public void addOrdine(Ordine newOrd) {
        this.ordiniPizzeria.get(newOrd.getTipoOrdine()).addElement(newOrd);
    }

    // RIMUOVI ORDINE
    public Ordine removeOrdine(TipoOrdine tipo) {
        return this.ordiniPizzeria.get(tipo).remove();
    }

    // LEGGI ORDINE
    public Ordine leggiOrdine(TipoOrdine tipo) {
        System.out.println("Il prossimo ordine è il seguente:\n" +
                this.ordiniPizzeria.get(tipo).prossimoOrdine());

        return this.ordiniPizzeria.get(tipo).prossimoOrdine();
    }

    // CODICE SENZA HASH MAP.. LA MERDA

    /*myQueue ordiniAsporto, ordiniDomicilio;

    // COSTRUTTORE
    public Pizzeria () {
        ordiniAsporto = new myQueue();
        ordiniDomicilio = new myQueue();
    }


    public void aggiungiOrdine(Ordine ordine, TipoOrdine tipo) {
        if (tipo == TipoOrdine.Asporto)
            ordiniAsporto.addElement(ordine);
        else if (tipo == TipoOrdine.Domicilio)
            ordiniDomicilio.addElement(ordine);
    }


    public Ordine rimuoviOrdine(TipoOrdine tipo) {
        if (tipo == TipoOrdine.Asporto) {
            Ordine temp = ordiniAsporto.getHead().getElement();
            ordiniAsporto.remove();
            return temp;
        }
        else if (tipo == TipoOrdine.Domicilio) {
            Ordine temp = ordiniDomicilio.getHead().getElement();
            ordiniDomicilio.remove();
            return temp;
        } else return null;
    }


    public Ordine leggiOrdine(TipoOrdine tipo) {

        switch (tipo) {
            case Asporto:
                if (ordiniAsporto.getSize() != 0)
                    return ordiniAsporto.getHead().getElement();
            case Domicilio:
                if (ordiniDomicilio.getSize() != 0)
                    return ordiniDomicilio.getHead().getElement();
            default:
                return null;
        }
    }*/


}