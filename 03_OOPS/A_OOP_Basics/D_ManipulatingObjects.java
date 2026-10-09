/*
 * Manipulating objects
 * --------------------
 * Objects are handled through references.
 * - Changing a field changes the object itself.
 * - Passing an object to a method passes a copy of its reference, so the
 *   method changes the same (original) object.
 * - Java is always pass-by-value: the method can change the object, but it
 *   cannot make the caller's variable point to another object.
 * - Assigning one reference to another (s2 = s1) does NOT copy the object.
 *   Both references point to the same object.
 */
public class D_ManipulatingObjects {
    static class Student {
        String name;
        int marks;
    }

    static void addBonus(Student s) {
        s.marks += 5;                    // changes the original object
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ali";
        s1.marks = 80;

        s1.marks = 90;                   // change a field directly

        addBonus(s1);
        System.out.println(s1.marks);    // 95

        Student s2 = s1;
        s2.name = "Sara";
        System.out.println(s1.name);     // Sara
    }
}
