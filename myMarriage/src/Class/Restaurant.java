package Class;

import Utilities.SimplyLinkedList;
import Exception.*;

public class Restaurant {
    SimplyLinkedList <Table> tableList;

    public Restaurant() { tableList = new SimplyLinkedList <Table> (); }

    // GETTER
    public SimplyLinkedList<Table> getTableList() { return tableList; }

    // ADD TABLE
    public void addTable(Table newTable) { tableList.addLast(newTable); }

    // ADD CUSTOMER
    public void addGuest(Guest newGuest, Table tavolo) {
        if (tableList.isElement(tavolo)) {
            try { tavolo.addGuest(newGuest);
            } catch (OverMaxExc | NotFriendlyExc | AgeTableExc ignored) {}
        }
    }

    public void printTable(Table tavolo) {
        if (tableList.isElement(tavolo))
            tavolo.getTableGuestList().printList();
    }

    public void printTableByIndex(int n) {
        if (tableList.getSize()>n)
            tableList.getElementInPosition(n).getTableGuestList().printList();
    }

}
