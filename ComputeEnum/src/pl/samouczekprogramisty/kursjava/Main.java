package pl.samouczekprogramisty.kursjava;
import pl.samouczekprogramisty.kursjava.compute.Compute;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(Compute.ADD.perform(2.5,3.5));
        System.out.println(Compute.SUB.perform(2.5,3.5));
        System.out.println(Compute.MUL.perform(2.5,3.5));
        try {
            System.out.println(Compute.DIV.perform(2.5,0));
        } catch(ArithmeticException e) {
            System.out.println("Don' divide by 0!");
        }

    }
}
