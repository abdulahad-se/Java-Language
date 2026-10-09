/*
 * Constructor overloading
 * -----------------------
 * A class can have more than one constructor, as long as their parameters
 * are different (number, type or order of parameters).
 * Java picks the constructor that matches the arguments given to new.
 * This gives flexibility in how an object can be created.
 */
public class H_ConstructorOverloading {
    static class Student {
        int rollNo;
        String name;

        Student() {
            name = "Unknown";
        }

        Student(String name) {
            this.name = name;
        }

        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Student().name);               // Unknown
        System.out.println(new Student("Ali").name);          // Ali
        System.out.println(new Student(1, "Sara").name);      // Sara
    }
}
