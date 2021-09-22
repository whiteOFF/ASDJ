package Utilities;

public class InvalidIscrizioneException extends UniversitaException {
    public InvalidIscrizioneException(String nomeUtente, String nomeEsame) {
        super(nomeUtente,nomeEsame);
        System.err.println(nomeUtente+ " non può iscriversi a '"+nomeEsame+"'  perché di un tipo differente di Corso.");
    }
}
