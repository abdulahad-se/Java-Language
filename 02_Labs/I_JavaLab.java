public class I_JavaLab {

    // Task 1
    class Student {
        int roll_no, Semester;
        double Gpa;

        Student(int roll_no, int Semester, double Gpa) {
            this.roll_no = roll_no;
            this.Semester = Semester;
            this.Gpa = Gpa;
        }

        void get() {
            System.out.println(this.roll_no);
            System.out.println(this.Semester);
            System.out.println(this.Gpa);
        }

        void show() {
            System.out.println("The roll no::" + this.roll_no);
            System.out.println("The Semester::" + this.Semester);
            System.out.println("The Gpa::" + this.Gpa);
        }

    }

}

// Task 1 main class

public class Main {
    public static void main(String[] args) {
        Student st = new Student(135, 2, 3.27);
        st.get();
        st.show();
    }
}

// ---------------------------------------------------------------------

// Task 2

public class Rectangle {
    int length, width;

    Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    int calculateArea() {
        return this.length * this.width;
    }
}

// Task 2 main class

public class MainB {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 4);
        int area = rec.calculateArea();
        System.out.println("The area is " + area);
    }
}

// ----------------------------------------------------------------------

// Task 3

public class Mathematics {
    void Square(int side) {
        int area = side * side;
        System.out.println("The area in integer is" + area);
    }

    void Square(double side) {
        double area = side * side;
        System.out.println("The area in double is" + area);
    }
}

// Task 3 main class

public class MainE {
    public static void main(String[] args) {
        Mathematics math = new Mathematics();
        math.Square(23);
        math.Square(23.3);
    }
}

// ------------------------------------------------------------------------

// Task 4

public class Calculate {
    int length, breadth;

    void CalculateArea(int length, int breadth) {
        int recarea = length * breadth;
        System.out.println("The area of rectangle::" + recarea);
    }

    void CalculateArea(int side) {
        int area = side * side;
        System.out.println("The area of square is" + area);
    }
}

// Task 4 main class

public class MianD {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        cal.CalculateArea(10, 20);
        cal.CalculateArea(23);
    }
}

// ------------------------------------------------------------------

// Task 5

public class Student1 {
    String name;

    Student1() {
        this.name = "unknown";
    }

    Student1(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("The name of the student is" + this.name);
    }
}

// Task 5 main class

public class Student1 {
    String name;

    Student1() {
        this.name = "unknown";
    }

    Student1(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("The name of the student is" + this.name);
    }
}

// -------------------------------------------------------------------------------

// Task 6

public class OverLoadingDemo {

    void display(int a, double b) {
        System.out.println("Method 1 called (int, double): " + a + " and " + b);
    }

    void display(double a, double b) {
        System.out.println("Method 2 called (double, double): " + a + " and " + b);
    }

    void show(long n) {
        System.out.println("Method 3 called (long): " + n);
    }

    public static void main(String[] args) {
        OverLoadingDemo demo = new OverLoadingDemo();

        demo.display(10, 5.5);

        demo.display(10, 20);

        demo.show('A');
    }
}
