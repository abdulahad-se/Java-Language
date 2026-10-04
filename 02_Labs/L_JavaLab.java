public class L_JavaLab {

    // Task 1
    interface Y {
        void mull();
    }

    interface X extends Y {
        void add();

        void sub();
    }

    public class A implements X {
        int num1;
        int num2;

        A() {
            this.num1 = 0;
            this.num2 = 0;
        }

        A(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

    public void mull(){
    System.out.println("The multiplication of number1 and number2"+"
    "+(this.num1*this.num2));
    }

    public void add(){
    System.out.println("The addition of number1 and number2"+"
    "+(this.num1+this.num2));
    }

    public void sub(){
    System.out.println("The subtraction of number1 and number 2"+"
    "+(this.num1-this.num2));
    }

    }

    // Task 1 main class
    public class showA {
        public static void main(String[] args) {
            X x = new A();
            A x1 = new A(2, 3);
            x.add();
            x.sub();
            x.mull();
            x1.add();
            x1.sub();
            x1.mull();
        }
    }

    // ---------------------------------------------------------------------

    // Task 2
    public interface Shape {
        void Draw();
    }

    public class Circle implements Shape {
        public void Draw() {
            System.out.println("This is circle");
        }
    }

    public class Square implements Shape {
        public void Draw() {
            System.out.println("This is square");
        }
    }

    public class Rectangle implements Shape {
        public void Draw() {
            System.out.println("This is rectangle");
        }
    }

    // Task 2 main class
    public class showShape {
        public static void main(String[] args) {
            Shape[] shape = { new Circle(), new Square(), new Rectangle() };
            for (Shape shapes : shape) {
                shapes.Draw();
            }
        }
    }

}
