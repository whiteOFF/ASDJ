package Exception;

import Class.Guest;

public class NotFriendlyExc extends Exception {
    public NotFriendlyExc(Guest guest) {
        System.out.println("\n"+"*".repeat(48+guest.getName().length())+"\nNel tavolo è presente un invitato antipatico a " +
                guest.getName()+"!\n"+"*".repeat(48+guest.getName().length())+"\n");
    }
}
