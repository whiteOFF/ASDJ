package Persona;

import Esami.*;
import Utilities.*;

import java.util.Arrays;

public class Studente <T> extends Persona implements SvolgimentoEsameInterface {
    private String matricola;
    private TipoCorso tipoCorso;
    private T[] esami;
    private int contatore;

    // COSTRUTTORE
    public Studente() { this(null,null,null,null); };
    public Studente(String nome, String cognome, String matricola,TipoCorso tipoCorso) {
        super(nome, cognome);
        this.matricola = matricola;
        this.tipoCorso = tipoCorso;
        this.esami = (T[]) new Object[24];
        this.contatore = 0;
    }

    @Override
    public void partecipaLezioneEsame(Esame esame) throws InvalidPartecipaException {
        for (T esameIscritto: esami)
            if (esameIscritto==(T) esame){
                System.out.println(nome+" "+cognome+" sta partecipando a "+esame.getNome()+"!");
                return;
            }
        throw new InvalidPartecipaException(nome+" "+cognome, esame.getNome());
    }

    @Override
    public void iscrizioneEsame(Esame esame) throws InvalidIscrizioneException, InvalidNumberExamsException {
        if (esame.getTipoCorso() == this.tipoCorso){
            if (contatore==esami.length){
                throw new InvalidNumberExamsException(nome+" "+cognome, esame.getNome());
            } else {
                this.esami[contatore] = (T) esame;
                System.out.println(this.nome+" si è iscritto/a correttamente a "+esame.getNome()+"!");
                contatore++;
                return;
            }
        } else throw new InvalidIscrizioneException(nome+" "+cognome, esame.getNome());

    }

    @Override
    public String toString() {
        int count=0;
        for (T esame: esami)
            if (esame != null)
                count++;
        T[] esamiNew= (T[]) new Object[count];
        for (int i=0; i<count; i++)
            esamiNew[i]=esami[i];
        return "Studente {"+
                "nome='"+nome+'\''+
                ", cognome='"+cognome+'\''+
                ", matricola='"+matricola+'\''+
                ", tipoCorso="+tipoCorso+
                ", esami="+Arrays.toString(esamiNew)+
                ", contatore="+contatore+'}';
    }
}