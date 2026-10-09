public class J_JavaLab {
    public static void main(String[] args) {
        // Task 1: Runtime polymorphism through method overriding.
        Card[] cards = { new Valentine(), new Holiday(), new Birthday() };
        System.out.println("Task 1 - Greetings");
        for (Card card : cards) {
            card.greeting();
        }

        // Task 2: Aggregation between a course, students, and a teacher.
        StudentRecord[] students = {
            new StudentRecord("Abdul Ahad", 135),
            new StudentRecord("Raza", 102),
            new StudentRecord("Bilal", 115)
        };
        Teacher teacher = new Teacher("Sir Tauseef", "Software Engineering");
        Course course = new Course("Object-Oriented Programming", students, teacher);
        System.out.println("\nTask 2 - Course details");
        course.printDetails();

        // Task 3: Basic inheritance.
        Car car = new Car();
        System.out.println("\nTask 3 - Vehicle inheritance");
        car.start();
        car.drive();

        // Task 4: Multilevel inheritance.
        Manager manager = new Manager();
        System.out.println("\nTask 4 - Multilevel inheritance");
        manager.walk();
        manager.work();
        manager.lead();

        // Task 5: Hierarchical inheritance.
        Phone phone = new Phone();
        Laptop laptop = new Laptop();
        System.out.println("\nTask 5 - Hierarchical inheritance");
        phone.powerOn();
        phone.call();
        laptop.powerOn();
        laptop.code();
    }
}

class Card {
    public void greeting() {
        System.out.println("Greeting");
    }
}

class Valentine extends Card {
    @Override
    public void greeting() {
        System.out.println("Happy Valentine's Day");
    }
}

class Holiday extends Card {
    @Override
    public void greeting() {
        System.out.println("Season's greetings");
    }
}

class Birthday extends Card {
    @Override
    public void greeting() {
        System.out.println("Happy Birthday");
    }
}

class StudentRecord {
    private final String name;
    private final int rollNumber;

    StudentRecord(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

class Teacher {
    private final String name;
    private final String degree;

    Teacher(String name, String degree) {
        this.name = name;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }
}

class Course {
    private final String name;
    private final StudentRecord[] registeredStudents;
    private final Teacher teacher;

    Course(String name, StudentRecord[] registeredStudents, Teacher teacher) {
        this.name = name;
        this.registeredStudents = registeredStudents;
        this.teacher = teacher;
    }

    public void printDetails() {
        System.out.println("Course: " + name);
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Degree: " + teacher.getDegree());
        for (int index = 0; index < registeredStudents.length; index++) {
            System.out.println((index + 1) + ". "
                    + registeredStudents[index].getName()
                    + " | Roll number: "
                    + registeredStudents[index].getRollNumber());
        }
    }
}

class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

class Person {
    public void walk() {
        System.out.println("Person is walking");
    }
}

class Employee extends Person {
    public void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    public void lead() {
        System.out.println("Manager is leading");
    }
}

class Device {
    public void powerOn() {
        System.out.println("Device is powered on");
    }
}

class Phone extends Device {
    public void call() {
        System.out.println("Phone is calling");
    }
}

class Laptop extends Device {
    public void code() {
        System.out.println("Laptop is coding");
    }
}
