/*
 * final keyword
 * -------------
 * final is used to make something fixed (constant).
 *
 * final variable: its value cannot change after the first assignment.
 * final object reference: the reference cannot point to another object,
 * but the data inside the object can still change.
 *
 * By convention, constants are written in UPPER_CASE.
 */
public class L_FinalKeyword {
    static class Student {
        String name;
    }

    public static void main(String[] args) {
        final int a = 10;
        // a = 20;                       // compile error

        final Student s = new Student();
        s.name = "Ali";
        s.name = "Sara";                 // allowed
        // s = new Student();            // compile error
        System.out.println(s.name);      // Sara
    }
}
