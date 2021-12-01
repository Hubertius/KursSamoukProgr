package pl.samouczekprogramisty.kursjava.animals.mammals;

public class Human extends Mammal {

    private final int  legs;
    private final int hands;

    public Human(String name, int wage, int length) {
        super(name, wage, length);
        this.legs = 2;
        this.hands = 2;
    }

    @Override
    public String toString() {
        return super.toString()  + "\nHuman has " + this.legs + " legs and " + this.hands + " hands.";
    }

}
