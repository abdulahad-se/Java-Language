package C_OOP_Principles;

/*
 * private keyword in inheritance
 * ------------------------------
 * A child class inherits everything from the parent, but it cannot directly
 * access the parent's private members. Only the parent class itself can.
 * To use a private field in the child, the parent gives a public getter method.
 */
public class B_PrivateKeyword {
    static class Box {
        private double length;              // private: only Box can access it

        Box(double length) {
            this.length = length;
        }

        double getLength() {                // getter gives safe access
            return length;
        }
    }

    static class BoxWeight extends Box {
        double weight;

        BoxWeight(double length, double weight) {
            super(length);
            this.weight = weight;
        }

        void show() {
            // System.out.println(length);  // compile error: length is private in Box
            System.out.println(getLength() + " " + weight);
        }
    }

    public static void main(String[] args) {
        BoxWeight b = new BoxWeight(5, 2.5);
        b.show();                           // 5.0 2.5
    }
}
