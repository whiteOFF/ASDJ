package Viventi;

public class Persona {
    protected String name, surname, CF;

    // COSTRUTTORE
    public Persona() {}
    public Persona(String name, String surname, String CF) {
        this.name = name;
        this.surname = surname;
        this.CF = CF;
    }

    // GETTER
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getCF() { return CF; }

    // SETTER
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setCF(String CF) { this.CF = CF; }
}
