/*
 * Class
 * -----
 * A class is a blueprint (template) used to create objects.
 * It groups related data (fields) and behaviour (methods) in one place.
 * A class by itself does not take memory for its fields. Objects do.
 *
 * Key points:
 * - Fields (instance variables) store the data of an object.
 * - Methods define what an object can do.
 */
public class A_JavaClasses {
    static class Student {
        int rollNo;          // properties of an object
        String name;
        float marks;

        void greet() {       // behaviour
            System.out.println("Hi, I am " + name);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ali";
        s.greet();           // Hi, I am Ali
    }
}