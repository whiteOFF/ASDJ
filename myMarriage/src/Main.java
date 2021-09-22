import Class.*;
import Utilities.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        // GUEST
        Guest Andrea = new Guest("Andrea", AgeRange.Young);
        Guest Maria = new Guest("Maria", AgeRange.Adult);
        Guest Luca = new Guest("Luca", AgeRange.Old);
        Guest Francesca = new Guest("Francesca", AgeRange.Young);
        Guest Giovanni = new Guest("Giovanni", AgeRange.Old);
        Guest Giorgia = new Guest("Giorgia", AgeRange.Adult);

        // UNFRIENDLY LIST
        Andrea.addToUnfriendlyList(Luca);
        Andrea.addToUnfriendlyList(Maria);
        Maria.addToUnfriendlyList(Francesca);
        Luca.addToUnfriendlyList(Giovanni);
        Francesca.addToUnfriendlyList(Andrea);
        Francesca.addToUnfriendlyList(Maria);
        Giovanni.addToUnfriendlyList(Luca);
        Giovanni.addToUnfriendlyList(Giorgia);

        // TAVOLO - SALA
        Table tavolo1 = new Table(3);
        Table tavolo2 = new Table(3);
        Restaurant sala = new Restaurant();

        sala.addTable(tavolo1);
        sala.addTable(tavolo2);

        // ADD PEOPLE
        sala.addGuest(Luca, tavolo1);
        sala.addGuest(Giorgia, tavolo1);
        sala.addGuest(Francesca, tavolo1);

        sala.addGuest(Andrea, tavolo2);
        sala.addGuest(Giovanni, tavolo2);
        sala.addGuest(Maria, tavolo2);

        // PRINTING
        int sizeTableList = sala.getTableList().getSize();
        for (int i=0; i<sizeTableList; i++) {
            System.out.println("Tavolo n°"+(i+1)+":");
            sala.printTableByIndex(i);
            System.out.println();
        }

        System.out.println("TAVOLO N°2:");
        sala.printTable(tavolo1);

    }

}