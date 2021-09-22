package Utilities;

public class InvalidPartecipaException extends UniversitaException {
    public InvalidPartecipaException(String nomeUtente, String nomeEsame) {
        super(nomeUtente,nomeEsame);
        System.err.println(nomeUtente+" non è iscritto/a a '"+nomeEsame+"'.\n");
    }
}



