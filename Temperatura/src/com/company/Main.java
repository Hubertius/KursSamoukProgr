package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        temperature(Integer.valueOf(input));
    }

    public static void temperature(int temperature) {
        if(temperature < 0) {
            System.out.println("Temperature is BELOW 0");
        } else if(temperature == 0) {
            System.out.println("Temperature is EQUAL to 0");
        } else {
            System.out.println("Temperature is HIGHER than 0");
        }
    }
    
}
