import Esami.*;
import Persona.*;
import Utilities.*;

public class Main {
    public static void main(String[] args){
        // STUDENTI
        Studente <EsameTriennale> Francesca= new Studente <EsameTriennale> ("Francesca", "Bianca", "455684",TipoCorso.TRIENNALE);
        Studente <EsameMagistrale> Giordano= new Studente <EsameMagistrale> ("Giordano","Biondo","232655",TipoCorso.MAGISTRALE);

        // ESAMI
        EsameTriennale Java= new EsameTriennale("Java","Poliba165", true);
        EsameMagistrale Logica= new EsameMagistrale("Logica","Poliba451", true);

        // CORPO
        try { Giordano.iscrizioneEsame(Logica); }
        catch (InvalidIscrizioneException | InvalidNumberExamsException ignored) {}

        try { Francesca.iscrizioneEsame(Java); }
        catch (InvalidIscrizioneException | InvalidNumberExamsException ignored) {}

        try { Francesca.iscrizioneEsame(Logica); }
        catch (InvalidIscrizioneException | InvalidNumberExamsException ignored) {}

        try { Giordano.partecipaLezioneEsame(Logica); }
        catch (InvalidPartecipaException ignored) {}

        try { Francesca.partecipaLezioneEsame(Logica); }
        catch (InvalidPartecipaException ignored) {}
    }
}
