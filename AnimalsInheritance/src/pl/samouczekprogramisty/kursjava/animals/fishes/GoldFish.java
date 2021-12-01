package pl.samouczekprogramisty.kursjava.animals.fishes;

public class GoldFish extends Fish {
    private String name;
    private int wage;
    private double speed;
    private String color;

    public GoldFish(String name, int wage, double speed, String color) {
        super(name,wage,speed);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color: " + this.color;
    }
}
