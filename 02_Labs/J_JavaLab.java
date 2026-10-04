public class J_JavaLab {
    // inheritance Lab

    // Task 1
    public class Card {
        public void greeting() {
            System.out.println("Greeting");
        }
    }

    public class Valentine extends Card {
        public void greeting() {
            System.out.println("Happy Valentine Day");
        }
    }

    public class Holiday extends Card {
        public void greeting() {
            System.out.println("Seasons Greeting");
        }
    }

    public class Birthday extends Card {
        public void greeting() {
            System.out.println("Happy Birthday");
        }
    }

    // Task 1 main Class
    public class showGreeting {
        public static void main(String[] args) {
            Card[] cardrack = { new Valentine(), new Holiday(), new Birthday() };
            System.out.println("Printing Cards");

            for (int i = 0; i < cardrack.length; i++) {
                cardrack[i].greeting();
            }
        }

        // --------------------------------------------------------------------------------

        // Task 2
        public class Student {
            private String name, address;
            private int roll_number;
            private double Gpa;

            Student(String name, String address, int roll_number, double Gpa) {
                this.name = name;
                this.address = address;
                this.roll_number = roll_number;
                this.Gpa = Gpa;
            }

            String getname() {
                return this.name;
            }

            String getadress() {
                return this.address;
            }

            int getrollnumber() {
                return this.roll_number;
            }

            double getGpa() {
                return this.Gpa;
            }
        }

        public class Teacher {
            private String name, Degree, address;
            private String telephone_number;

            Teacher(String name, String Degree, String address, String telephone_number) {
                this.name = name;
                this.Degree = Degree;
                this.address = address;
                this.telephone_number = telephone_number;
            }

            String getname() {
                return this.name;
            }

            String getDegree() {
                return this.Degree;
            }

            String getaddress() {
                return this.address;
            }

            String getTelephonenumber() {
                return this.telephone_number;
            }
        }

        public class Courses {
            private String name;
            private Student[] registered;
            private Teacher teacher;

            public Courses(String name, Student[] registered, Teacher teacher) {
                this.name = name;
                this.registered = registered;
                this.teacher = teacher;
            }

            public void printdetails() {
                System.out.println("--------------------");
                System.out.println("The name of course is:" + this.name);
                System.out.println("--------------------");
                System.out.println("The name of teacher is:" + teacher.getname());
                System.out.println("The degree of teacher is:" + teacher.getDegree());
                System.out.println("The address of teacher is:" + teacher.getaddress());
                System.out.println("The number of teacher is:" + teacher.getTelephonenumber());
                for (int i = 0; i < registered.length; i++) {
                    System.out.println((i + 1) + ". Name: " + registered[i].getname() + " | Roll#: "
                            + registered[i].getrollnumber());

                }
            }

            // Task 2 main class
            public class University {
                public static void main(String[] args) {
                    Student[] students = {
                            new Student("Abdul Ahad", "Karachi", 135, 3.27),
                            new Student("Raza", "Karachi", 102, 3.8),
                            new Student("Bilal", "karachi", 115, 3.8),
                            new Student("Mohammad", "karachi", 122, 3.7),
                            new Student("Aqeel", "karachi", 131, 3.6),
                    };
                    Teacher teacher = new Teacher("Sir Tauseef", "Software Engineering", "Karachi", "033390887979");
                    Courses course = new Courses("Object Oriented Programming", students, teacher);
                    course.printdetails();

                }

                // ---------------------------------------------------------------------------------

                // Task 3
                public class Vechile {
                    public void start() {
                        System.out.println("Vechile is Starting:");
                    }

                }

                public class Car extends Vechile {
                    public void drive() {
                        System.out.println("Car is Driving:");
                    }
                }

                // Task 3 main class
                public class showVechile {
                    public static void main(String[] args) {
                        Car car = new Car();
                        car.start();
                        car.drive();
                    }
                }

                // -----------------------------------------------------

                // Task 4
                public class Person {
                    public void walk() {
                        System.out.println("Person is walking");
                    }
                }

                public class Employee extends Person {
                    public void work() {
                        System.out.println("Employee is working");
                    }

                    public class Manager extends Employee {
                        public void lead() {
                            System.out.println("Employee is leading");
                        }
                    }

                    // Task 4 main class
public class showPerson {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.walk();
        manager.work();
        manager.lead();
    }
    
// -------------------------------------------------------------------------

    // Task 5
public class Device {
    public void powerOn(){
        System.out.println("Device is powered on:");
    }
}

public class Phone extends Device {
    public void call(){
        System.out.println("Phone is Calling:");
    }
    
}

public class Laptop extends Device {
    public void code(){
        System.out.println("Laptop is coding:");
    }
}

    // Task 5 main class
public class showDevice {
    public static void main(String[] args) {
    Phone phone=new Phone();
    Laptop laptop=new Laptop();
    phone.powerOn();
    phone.call();
    laptop.powerOn();
    laptop.code();
    }
}

}
