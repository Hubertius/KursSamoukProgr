package pl.samouczekprogramisty.kursjava.human;

public class Human {
    private String name;
    private String surname;
    private String pesel;
    public Human(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        if(object instanceof Human) {
            Human anotherHuman = (Human) object;
            return this.name.equals(anotherHuman.name) && this.surname.equals(anotherHuman.surname) && this.pesel.equals(anotherHuman.pesel);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * 7 + this.surname.hashCode() * 7 + this.pesel.hashCode() * 7;
    }
}
