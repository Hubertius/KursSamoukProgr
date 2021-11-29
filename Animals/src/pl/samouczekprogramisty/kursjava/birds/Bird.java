package pl.samouczekprogramisty.kursjava.birds;

public class Bird {
    private String name;
    private int weight;

    public Bird(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName() + " with size of " + this.getWeight() + " kg.";
    }
}
