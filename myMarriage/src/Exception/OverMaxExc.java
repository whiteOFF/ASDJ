package Exception;

import Class.Guest;

public class OverMaxExc extends Exception {
    public OverMaxExc(Guest guest) {
        System.out.println("\n"+"*".repeat(55+guest.getName().length())+"\nImpossibile inserire "+guest.getName()+": numero massimo posti " +
                "disponibili nel tavolo raggiunto!\n"+"*".repeat(55+guest.getName().length())+"\n");
    }
}
