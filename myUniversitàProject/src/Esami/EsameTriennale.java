package Esami;

import Utilities.TipoCorso;

public class EsameTriennale extends Esame{
    private boolean aulaGrande;

    public EsameTriennale() {};
    public EsameTriennale(String nome, String codice, boolean aula){
        super(nome, codice, TipoCorso.TRIENNALE);
        this.aulaGrande = aula;
    }

    public boolean isAulaGrande(){ return aulaGrande; }
    public void setAulaGrande(boolean aula) {this.aulaGrande = aula;}

    @Override
    public String toString() { return nome+" "+codice; }
}
