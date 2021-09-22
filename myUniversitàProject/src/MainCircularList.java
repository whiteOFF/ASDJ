import Esami.EsameMagistrale;
import Esami.EsameTriennale;
import Nodes.CircularLinkedList;
import Persona.*;
import Utilities.InvalidIscrizioneException;
import Utilities.InvalidNumberExamsException;
import Utilities.TipoCorso;

public class MainCircularList {
    public static void main(String[] args) throws InvalidIscrizioneException, InvalidNumberExamsException {

        EsameTriennale Java = new EsameTriennale("Java","BA456",true);
        EsameTriennale Inglese = new EsameTriennale("Inglese","BA564",true);
        EsameTriennale Analisi = new EsameTriennale("Analisi","BA765",true);
        EsameTriennale Geometria = new EsameTriennale("Geometria","BA231",true);


        Studente <EsameTriennale> Pasquale = new Studente <EsameTriennale> ("Pasquale", "Bianco", "582212",TipoCorso.TRIENNALE);
        Studente <EsameTriennale> Mario = new Studente <EsameTriennale> ("Mario", "2", "568891",TipoCorso.TRIENNALE);
        Studente <EsameTriennale> Giorgio = new Studente <EsameTriennale> ("Giorgio", "3", "556247",TipoCorso.TRIENNALE);
        Studente <EsameTriennale> Federica = new Studente <EsameTriennale> ("Federica", "Chimienti", "447811",TipoCorso.TRIENNALE);

        CircularLinkedList <Studente<EsameTriennale>> studentsClassTriennale = new <Studente<EsameTriennale>> CircularLinkedList();

        studentsClassTriennale.addElement(Pasquale);
        studentsClassTriennale.addElement(Mario);
        studentsClassTriennale.addElement(Giorgio);

        System.out.println("Is Giorgio in the list? "+studentsClassTriennale.searchElement(Giorgio));
        System.out.println("Is Federica in the list? "+studentsClassTriennale.searchElement(Federica));
        System.out.println("Is Mario in the list? "+studentsClassTriennale.searchElement(Mario));
        System.out.println();

        studentsClassTriennale.addElement(Federica);

/*      System.out.println("Is Giorgio in the list? "+studentsClassTriennale.searchElement(Giorgio));
        System.out.println("Is Federica in the list? "+studentsClassTriennale.searchElement(Federica));
        System.out.println("Is Mario in the list? "+studentsClassTriennale.searchElement(Mario));
*/
        if (studentsClassTriennale.searchElement(Giorgio)) System.out.println("Giorgio è presente");
        else System.out.println("Giorgio è assente");
        if (studentsClassTriennale.searchElement(Federica)) System.out.println("Federica è presente");
        else System.out.println("Federica è assente");
        if (studentsClassTriennale.searchElement(Mario)) System.out.println("Mario è presente");
        else System.out.println("Mario è assente");

        studentsClassTriennale.removeElement(Pasquale);
        if (studentsClassTriennale.searchElement(Pasquale)) System.out.println("Pasquale è presente");
        else System.out.println("Pasquale è assente");

        studentsClassTriennale.removeElement(Mario);
        if (studentsClassTriennale.searchElement(Mario)) System.out.println("Mario è presente");
        else System.out.println("Mario è assente");

        System.out.println();

        Pasquale.iscrizioneEsame(Java);Giorgio.iscrizioneEsame(Java); Federica.iscrizioneEsame(Java);
        Pasquale.iscrizioneEsame(Analisi); Giorgio.iscrizioneEsame(Analisi); Federica.iscrizioneEsame(Analisi);
        Pasquale.iscrizioneEsame(Geometria); Giorgio.iscrizioneEsame(Geometria); Federica.iscrizioneEsame(Geometria);
        Pasquale.iscrizioneEsame(Inglese); Giorgio.iscrizioneEsame(Inglese); Federica.iscrizioneEsame(Inglese);
        System.out.println();

        studentsClassTriennale.printList();
        System.out.println();


    }
}
