package pl.samouczekprogramisty.kursjava.compute;

public enum Compute {
    ADD {
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUB {
        public double perform(double x, double y) {
            return x - y;
        }
    },
    MUL {
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DIV {
        public double perform(double x, double y) {
            if(y == 0) {
                throw new ArithmeticException();
            }
            return x * y;
        }
    };

    public abstract double perform(double x, double y);
}
