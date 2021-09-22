package Class;
import Utilities.AgeRange;
import Utilities.SimplyLinkedList;
import Exception.*;

public class Table {
    private int maxGuest;
    final private SimplyLinkedList <Guest> tableGuestList;

    public Table(int max) {
        this.maxGuest=max;
        tableGuestList = new SimplyLinkedList <Guest> ();
    }

    // GETTER
    public int getMaxGuest() { return this.maxGuest; }
    public SimplyLinkedList<Guest> getTableGuestList() { return this.tableGuestList; }

    // SETTER
    public void setMaxGuest(int newMax) { this.maxGuest=newMax; }

    // ADD TO LIST
    protected void addGuest(Guest newGuest) throws OverMaxExc, NotFriendlyExc, AgeTableExc {
        int size = this.tableGuestList.getSize();

        if (size==this.maxGuest)
            throw new OverMaxExc(newGuest);

        else if (size==0 && maxGuest>0) {
            this.tableGuestList.addLast(newGuest);
            System.out.println("guest " +newGuest.getName()+ " added!");
        }

        else {

            // ECCEZIONE PERSONE ANTIPATICHE
            for (int i=0; i<size; i++) {
                Guest cursore = this.tableGuestList.getElementInPosition(i);
                if (cursore.isHimUnfriendly(newGuest))
                    throw new NotFriendlyExc(cursore);
                else if (newGuest.isHimUnfriendly(cursore))
                    throw new NotFriendlyExc(newGuest);
            }

            // ECCEZIONE PERSONE ADULTE-ANZIANE
            boolean ageFlag = true;
            if (newGuest.getAgeRange() == AgeRange.Young){
                for (int i=0; i<size; i++) {
                    Guest cursore = tableGuestList.getElementInPosition(i);
                    if (cursore.getAgeRange()==AgeRange.Young)
                        ageFlag = false;
                }

                if (ageFlag) throw new AgeTableExc(newGuest);
            }

            tableGuestList.addLast(newGuest);
            System.out.println("guest " +newGuest.getName()+ " added!");
        }
    }

}