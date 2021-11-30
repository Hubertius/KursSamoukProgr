package pl.samouczekprogramisty.kursjava.mathoperations.add;

import pl.samouczekprogramisty.kursjava.mathoperations.Computation;

public class Addition implements Computation {

    @Override
    public double compute(double argument1, double argument2) {
        return argument1 + argument2;
    }
}
