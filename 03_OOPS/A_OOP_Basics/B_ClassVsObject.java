/*
 * Object
 * ------
 * An object is a real instance of a class. It has its own copy of the
 * instance variables and takes memory.
 *
 * Class vs Object:
 * - Class  = logical entity (blueprint), no memory for fields.
 * - Object = physical entity (real thing), takes memory.
 * - One class can create many objects.
 *
 * Instance variables are accessed with the dot operator: object.field
 */
public class B_ClassVsObject {
    static class Student {
        int rollNo;
        String name;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.rollNo = 1;
        s1.name = "Ali";
        s2.rollNo = 2;
        s2.name = "Sara";

        // Every object has its own copy of the instance variables
        System.out.println(s1.name + " " + s1.rollNo);   // Ali 1
        System.out.println(s2.name + " " + s2.rollNo);   // Sara 2
    }
}