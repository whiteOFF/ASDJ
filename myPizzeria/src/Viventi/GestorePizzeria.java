package Viventi;

import OrdinePack.Ordine;
import OrdinePack.TipoOrdine;
import PizzeriaPack.Pizzeria;

public class GestorePizzeria extends Persona implements GestorePizzeriaInterface {
    private int stipendio, oreLavorative;
    Pizzeria pizzeria;

    // COSTRUTTORE
    public GestorePizzeria() {}
    public GestorePizzeria(String name, String surname, String CF, int stip, int ore, Pizzeria piz) {
        super(name, surname, CF);
        this.stipendio = stip;
        this.oreLavorative = ore;
        this.pizzeria = piz;
    }

    // GETTER
    public int getStipendio() { return stipendio; }
    public int getOreLavorative() { return oreLavorative; }

    // SETTER
    public void setStipendio(int stipendio) { this.stipendio = stipendio; }
    public void setOreLavorative(int oreLavorative) { this.oreLavorative = oreLavorative; }

    // TRIGGER METODI DI PIZZERIA
    @Override
    public void aggiungiOrdine(Ordine ord) { this.pizzeria.addOrdine(ord);
    }

    @Override
    public Ordine rimuoviOrdine(TipoOrdine tipo) {
        return this.pizzeria.removeOrdine(tipo);
    }

    @Override
    public Ordine leggiOrdine(TipoOrdine tipo) {
        return this.pizzeria.leggiOrdine(tipo);
    }
}
