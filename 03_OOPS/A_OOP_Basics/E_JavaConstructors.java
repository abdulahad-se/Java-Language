/*
 * Constructor
 * -----------
 * A constructor is a special method that runs automatically when an object
 * is created with new. It is used to set up (initialize) the object.
 *
 * Rules:
 * - Same name as the class.
 * - No return type (not even void).
 *
 * Default constructor:
 * If we do not write any constructor, Java adds one automatically.
 * It gives every field its default value:
 *   numbers -> 0, boolean -> false, objects (like String) -> null
 */
public class E_JavaConstructors {
    static class Student {
        int rollNo;
        String name;
        boolean passed;
    }

    public static void main(String[] args) {
        Student s = new Student();       // default constructor runs here

        System.out.println(s.rollNo);    // 0
        System.out.println(s.name);      // null
        System.out.println(s.passed);    // false
    }
}
