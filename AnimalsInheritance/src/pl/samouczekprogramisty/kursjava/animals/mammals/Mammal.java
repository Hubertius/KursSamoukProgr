package pl.samouczekprogramisty.kursjava.animals.mammals;

import pl.samouczekprogramisty.kursjava.animals.Animal;

public abstract class Mammal extends Animal {
    private String name;
    private int length;
    private int wage;

    public Mammal(String name, int wage, int length) {
        super(name, wage);
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString() + ", length: " + this.length;
    }
}
