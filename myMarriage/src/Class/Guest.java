package Class;

import Utilities.AgeRange;
import Utilities.SimplyLinkedList;

public class Guest {
    private String name;
    private AgeRange ageRange;
    final private SimplyLinkedList <Guest> unfriendlyList;

    public Guest(String name, AgeRange age) {
        this.ageRange = age;
        this.name = name;
        this.unfriendlyList = new SimplyLinkedList <Guest> ();
    }

    // GETTER
    public String getName() { return this.name; }
    public AgeRange getAgeRange() { return this.ageRange; }
    public SimplyLinkedList <Guest> getUnfriendlylist() { return this.unfriendlyList; }

    // SETTER
    public void setName(String newName) { this.name = newName; }
    public void setAgeRange(AgeRange newAgeRange) { this.ageRange = newAgeRange; }

    // ADD TO UNFRIENDLY LIST
    public void addToUnfriendlyList (Guest bad) {
        unfriendlyList.addLast(bad);
    }

    // VERIFICA INVITATO PRESENTE NELLA LISTA
    protected boolean isHimUnfriendly(Guest badSearch) {
        return unfriendlyList.isElement(badSearch);
    }

    @Override
    public String toString() {
        return "name: '"+ this.name+
                "', age range: '"+ this.ageRange.toString()+"'";
    }

}
