package People;

public class Person {

    protected String name, surname, cf;

    // CONSTRUCTOR
    public Person() {}
    public Person(String name, String surname, String cf) {
        this.name = name;
        this.surname = surname;
        this.cf = cf;
    }

    // GETTER
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getCf() { return cf; }

    // SETTER
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setCf(String cf) { this.cf = cf; }
}
