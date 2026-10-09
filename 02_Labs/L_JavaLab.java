public class L_JavaLab {
    public static void main(String[] args) {
        // Task 1: A class implements an interface that extends another interface.
        Calculator calculator = new Calculator(2, 3);
        System.out.println("Task 1 - Interface inheritance");
        calculator.add();
        calculator.subtract();
        calculator.multiply();

        // Task 2: Different classes implement the same interface.
        Shape[] shapes = { new Circle(), new Square(), new RectangleShape() };
        System.out.println("\nTask 2 - Interface polymorphism");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

interface MultiplyOperation {
    void multiply();
}

interface ArithmeticOperations extends MultiplyOperation {
    void add();

    void subtract();
}

class Calculator implements ArithmeticOperations {
    private final int first;
    private final int second;

    Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void multiply() {
        System.out.println("Multiplication: " + first * second);
    }

    @Override
    public void add() {
        System.out.println("Addition: " + (first + second));
    }

    @Override
    public void subtract() {
        System.out.println("Subtraction: " + (first - second));
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a square");
    }
}

class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a rectangle");
    }
}
