package pl.samouczekprogramisty.kursjava;

import pl.samouczekprogramisty.kursjava.animals.Animal;
import pl.samouczekprogramisty.kursjava.animals.fishes.Fish;
import pl.samouczekprogramisty.kursjava.animals.fishes.GoldFish;
import pl.samouczekprogramisty.kursjava.animals.mammals.Mammal;
import pl.samouczekprogramisty.kursjava.animals.mammals.Human;

public class Main {

    public static void main(String[] args) {
        GoldFish goldFish = new GoldFish("WaterishMeriderish", 5, 10, "gold" );
        System.out.println(goldFish);
        System.out.println();

        Human human = new Human("Adam", 60, 180);
        System.out.println(human);
    }
}
