/*
 * Creating our own constructor
 * ----------------------------
 * We write a constructor to set values while the object is being created.
 *
 * Important: once we write any constructor, Java stops providing the
 * default constructor. Calling new Student() then gives a compile error
 * unless we write that constructor ourselves.
 */
public class F_CreatingConstructors {
    static class Student {
        int rollNo;
        String name;

        Student(int r, String n) {
            rollNo = r;
            name = n;
        }
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Ali");
        System.out.println(s.rollNo + " " + s.name);   // 1 Ali

        // Student s2 = new Student();   // compile error: no default constructor now
    }
}
