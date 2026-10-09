package C_OOP_Principles;

/*
 * Principles of OOP
 * -----------------
 * The 4 principles of OOP are: Inheritance, Polymorphism, Encapsulation, Abstraction.
 *
 * Inheritance
 * -----------
 * Inheritance lets a class (child / subclass) reuse the fields and methods of
 * another class (parent / superclass) using the extends keyword.
 * It is an "is-a" relationship: a BoxWeight is a Box.
 * Benefit: code reuse, we do not write the same code again.
 */
public class A_Inheritance {
    static class Box {
        double length;
        double width;
        double height;

        Box(double length, double width, double height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }

        void info() {
            System.out.println("Box: " + length + " x " + width + " x " + height);
        }
    }

    // BoxWeight gets length, width, height and info() from Box, and adds weight
    static class BoxWeight extends Box {
        double weight;

        BoxWeight(double length, double width, double height, double weight) {
            super(length, width, height);   // calls the parent constructor (explained in C_SuperKeyword)
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        BoxWeight b = new BoxWeight(2, 3, 4, 5.5);
        b.info();                           // Box: 2.0 x 3.0 x 4.0 (inherited method)
        System.out.println(b.weight);       // 5.5

        // A parent reference can hold a child object,
        // but it can only access what the parent class has
        Box box = new BoxWeight(1, 1, 1, 9);
        box.info();                         // Box: 1.0 x 1.0 x 1.0
        // System.out.println(box.weight);  // compile error: Box has no weight
    }
}
