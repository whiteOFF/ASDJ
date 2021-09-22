package Exception;

import Class.Guest;

public class AgeTableExc extends Exception {
    public AgeTableExc(Guest guest) {
        System.out.println("\n"+"*".repeat(93+guest.getName().length())+"\nImpossibile l'inserimento di "+guest.getName()+" poiché nel " +
                "tavolo sono presenti solo invitati adulti o anziani.\n"+"*".repeat(93+guest.getName().length())+"\n");
    }
}
