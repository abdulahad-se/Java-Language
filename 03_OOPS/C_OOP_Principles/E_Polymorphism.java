package C_OOP_Principles;

/*
 * Polymorphism
 * ------------
 * Polymorphism means "many forms": the same method name can behave
 * differently depending on the object.
 *
 * Example: every shape has an area() method, but a circle and a square
 * calculate the area in different ways.
 *
 * A parent reference can point to any child object, and calling the
 * method runs the child's version.
 */
public class E_Polymorphism {
    static class Shape {
        void area() {
            System.out.println("Area of a shape");
        }
    }

    static class Circle extends Shape {
        double r;

        Circle(double r) {
            this.r = r;
        }

        @Override
        void area() {
            System.out.printf("Circle area: %.2f%n", Math.PI * r * r);
        }
    }

    static class Square extends Shape {
        double side;

        Square(double side) {
            this.side = side;
        }

        @Override
        void area() {
            System.out.printf("Square area: %.2f%n", side * side);
        }
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(2);
        Shape s2 = new Square(3);
        s1.area();                          // Circle area: 12.57
        s2.area();                          // Square area: 9.00

        // One loop works for every shape
        Shape[] shapes = {new Circle(1), new Square(2), new Shape()};
        for (Shape s : shapes) {
            s.area();
        }
        // Circle area: 3.14
        // Square area: 4.00
        // Area of a shape
    }
}
