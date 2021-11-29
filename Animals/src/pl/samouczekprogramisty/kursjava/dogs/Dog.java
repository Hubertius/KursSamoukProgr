package pl.samouczekprogramisty.kursjava.dogs;

public class Dog {

    private String name;
    private int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getweight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setweight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.getName() + "with wage of " + this.getweight() + " kg.";
    }
}
