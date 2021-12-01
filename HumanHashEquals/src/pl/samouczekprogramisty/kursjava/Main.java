package pl.samouczekprogramisty.kursjava;
import pl.samouczekprogramisty.kursjava.human.Human;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human human = new Human("Adam", "Mickiewicz", "00301706676");
        Human secondHuman = new Human("Adam", "Mickiewicz", "00301706686");
        Human thirdHuman = new Human("Adam", "Mickiewicz", "00301706676");
        System.out.println(human.equals(secondHuman));
        System.out.println(human.equals(thirdHuman));
    }
}
