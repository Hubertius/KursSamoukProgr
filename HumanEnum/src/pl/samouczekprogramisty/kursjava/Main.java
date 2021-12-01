package pl.samouczekprogramisty.kursjava;
import pl.samouczekprogramisty.kursjava.human.Human;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Human firstHuman = new Human("Adam", 17, Eyes.Green, Hair.Blonde);
        System.out.println(firstHuman);
        Human secondHuman = new Human("Robbert", 21, Eyes.Blue, Hair.Red);
        System.out.println(secondHuman);
    }
}
