package pl.samouczekprogramisty.kursjava;
import pl.samouczekprogramisty.kursjava.weather.Weather;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Weather sunny = new Weather("Sunny", 25);
        Weather foggy = new Weather("Foggy", 5);
        Weather rainy = new Weather("Rainy", 7);

        System.out.println(sunny);
        System.out.println();
        System.out.println(foggy);
        System.out.println();
        System.out.println(rainy);
    }
}
