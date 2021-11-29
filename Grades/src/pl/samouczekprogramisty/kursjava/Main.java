package pl.samouczekprogramisty.kursjava;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[][] grades = new double[3][4];
        double[] average = new double[3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.println("Write grades for " + (i+1) + " student: ") ;
            for(int j = 0; j < 4; j++) {
                System.out.print(j+1 + " grade: ");;
                grades[i][j] = Double.valueOf(scanner.nextLine());
                average[i] += grades[i][j];
            }
            average[i] /= 4;
            System.out.println("Average for the " + average[i] + " student.");
            System.out.println();
        }



    }
}
