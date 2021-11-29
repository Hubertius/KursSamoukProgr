package pl.samouczekprogramisty.kursjava;

import pl.samouczekprogramisty.kursjava.dogs.Dog;
import pl.samouczekprogramisty.kursjava.birds.Bird;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Bird bird = new Bird("Raven", 5);
        Dog dog = new Dog("Schnauzer", 20);
        System.out.println(bird);
        System.out.println(dog);
    }


}
