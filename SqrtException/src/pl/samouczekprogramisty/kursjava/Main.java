package pl.samouczekprogramisty.kursjava;
import java.io.IOException;
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double scoreValue = 0.0;
        try {
            String input = scanner.nextLine();
            Double doubleInput = Double.valueOf(input);
            if(doubleInput < 0.0) {
                throw new IllegalArgumentException("Wrong data in input (negative value)!");
            }
            scoreValue = Math.sqrt(doubleInput);
        } catch(NumberFormatException e ) {
            System.out.println("Your input was NOT A NUMBER!");
            System.out.println("You'll get 0 as final value, because of this exception!");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("You'll get 0 as final value, because of this exception!");
        } finally {
            System.out.println(scoreValue);
        }
    }
}
