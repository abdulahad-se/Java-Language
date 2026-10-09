/*
 * Calling a constructor from another constructor
 * ----------------------------------------------
 * this(...) calls another constructor of the same class.
 * It avoids repeating the same initialization code.
 *
 * Rule (classic): this(...) is written as the first statement of the constructor.
 * Note: since Java 25 other statements are allowed before it, but they cannot use
 * the current object. In most courses and interviews, "first statement" is still
 * the expected answer.
 */
public class I_CallingConstructorFromConstructor {
    static class Student {
        int rollNo;
        String name;

        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        Student() {
            this(0, "Unknown");
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.rollNo + " " + s.name);   // 0 Unknown
    }
}