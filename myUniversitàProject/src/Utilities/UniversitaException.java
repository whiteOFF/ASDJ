package Utilities;

public class UniversitaException extends Exception{
    protected String nomeUtente, nomeEsame;
    protected UniversitaException(String nomeUtente, String nomeEsame){
        this.nomeEsame=nomeEsame;
        this.nomeUtente=nomeUtente;
    }
}
