package Esami;

import Utilities.TipoCorso;

public class EsameMagistrale extends Esame{
    private boolean attivitaLaboratorio;

    public EsameMagistrale() {};
    public EsameMagistrale(String nome, String codice, boolean attLab){
        super(nome, codice, TipoCorso.MAGISTRALE);
        this.attivitaLaboratorio = attLab;
    }

    public boolean isLaboratorio(){ return attivitaLaboratorio; }
    public void setAttivitaLaboratorio(boolean lab) {this.attivitaLaboratorio = lab;}
}
