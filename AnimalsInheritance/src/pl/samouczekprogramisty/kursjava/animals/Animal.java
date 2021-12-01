package pl.samouczekprogramisty.kursjava.animals;

public abstract class Animal {
    private String name;
    private int wage;

    public Animal(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", wage: " + this.wage;
    }


}
