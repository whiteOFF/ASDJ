package Utilities;

public class InvalidNumberExamsException extends UniversitaException{
    public InvalidNumberExamsException(String nomeUtente, String nomeEsame){
        super(nomeUtente, nomeEsame);
        System.err.println(nomeEsame+" non può essere aggiunto/a agli esami di "+nomeUtente+" poiché è stato raggiunto il limite previsto di 24.\n");
    }
}
