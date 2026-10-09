package C_OOP_Principles;

/*
 * final keyword with inheritance
 * ------------------------------
 * - final method: cannot be overridden by a child class.
 * - final class:  cannot be extended (no child class can be made from it).
 * - final variable: value cannot change after the first assignment.
 */
public class I_FinalKeyword {
    static class Parent {
        final void locked() {
            System.out.println("This method cannot be overridden");
        }

        void open() {
            System.out.println("This method can be overridden");
        }
    }

    static class Child extends Parent {
        // void locked() { }                // compile error: locked() is final

        @Override
        void open() {
            System.out.println("Child changed open()");
        }
    }

    static final class Utility {            // final class
        static final double PI = 3.14;      // final variable
    }

    // static class MyUtility extends Utility { }   // compile error: Utility is final

    public static void main(String[] args) {
        Child c = new Child();
        c.locked();                         // This method cannot be overridden
        c.open();                           // Child changed open()
        System.out.println(Utility.PI);     // 3.14
    }
}