package pl.samouczekprogramisty.kursjava.animals.fishes;

import pl.samouczekprogramisty.kursjava.animals.Animal;

public abstract class Fish extends Animal {
    private String name;
    private int wage;
    private double speed;

    public Fish(String name, int wage, double speed) {
        super(name, wage);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed: " + this.speed;
    }
}
