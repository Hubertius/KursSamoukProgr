package pl.samouczekprogramisty.kursjava;

import pl.samouczekprogramisty.kursjava.mathoperations.Computation;
import pl.samouczekprogramisty.kursjava.mathoperations.add.Addition;
import pl.samouczekprogramisty.kursjava.mathoperations.mul.Multiplication;

import java.util.Scanner;


public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Multiply or add operation? [T|N]: ");
        String input = scanner.nextLine();
        if(input.equals("T") || input.equals("True") || input.equals("t") || input.equals("true")) {
            return true;
        }
        return false; // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private double getArgument() {

        return Double.valueOf(scanner.nextLine()); // tutaj pobierz liczbę od użytkownika
    }
}

