public class I_JavaLab {
    public static void main(String[] args) {
        // Task 1: Constructor and object example.
        Student student = new Student(135, 2, 3.27);
        student.display();

        // Task 2: Calculate the area of a rectangle.
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        // Task 3: Method overloading.
        Mathematics mathematics = new Mathematics();
        mathematics.square(23);
        mathematics.square(23.3);

        // Task 4: Overloaded methods with different parameters.
        Calculate calculate = new Calculate();
        calculate.calculateArea(10, 20);
        calculate.calculateArea(23);

        // Task 5: Constructor overloading.
        StudentProfile unknownStudent = new StudentProfile();
        StudentProfile namedStudent = new StudentProfile("Abdul Ahad");
        unknownStudent.display();
        namedStudent.display();

        // Task 6: Overloading with different parameter types.
        OverloadingDemo demo = new OverloadingDemo();
        demo.display(10, 5.5);
        demo.display(10, 20);
        demo.show('A');
    }
}

class Student {
    private final int rollNumber;
    private final int semester;
    private final double gpa;

    Student(int rollNumber, int semester, double gpa) {
        this.rollNumber = rollNumber;
        this.semester = semester;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + gpa);
    }
}

class Rectangle {
    private final int length;
    private final int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }
}

class Mathematics {
    public void square(int side) {
        System.out.println("Integer square: " + side * side);
    }

    public void square(double side) {
        System.out.println("Decimal square: " + side * side);
    }
}

class Calculate {
    public void calculateArea(int length, int breadth) {
        System.out.println("Rectangle area: " + length * breadth);
    }

    public void calculateArea(int side) {
        System.out.println("Square area: " + side * side);
    }
}

class StudentProfile {
    private final String name;

    StudentProfile() {
        this("Unknown");
    }

    StudentProfile(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student name: " + name);
    }
}

class OverloadingDemo {
    public void display(int first, double second) {
        System.out.println("Method 1: " + first + " and " + second);
    }

    public void display(double first, double second) {
        System.out.println("Method 2: " + first + " and " + second);
    }

    public void show(long number) {
        System.out.println("Method 3: " + number);
    }
}
