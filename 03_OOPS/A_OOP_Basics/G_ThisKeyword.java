/*
 * this keyword
 * ------------
 * this is a reference to the current object (the object whose
 * constructor or method is running).
 *
 * Main use: when a parameter has the same name as a field.
 * this.name is the field, name is the parameter.
 * Without this, "name = name" would just assign the parameter to itself.
 */
public class G_ThisKeyword {
    static class Student {
        int rollNo;
        String name;

        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Ali");
        System.out.println(s.rollNo + " " + s.name);   // 1 Ali
    }
}