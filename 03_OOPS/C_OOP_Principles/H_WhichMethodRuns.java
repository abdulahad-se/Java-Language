package C_OOP_Principles;

/*
 * How overriding works and how Java decides which method to run
 * -------------------------------------------------------------
 * Parent p = new Child();
 *
 * - The OBJECT (Child) decides which overridden method runs.
 *   This is decided at runtime, called dynamic method dispatch.
 * - The REFERENCE type (Parent) decides what we are allowed to access.
 *   p can only use members that exist in Parent.
 * - Fields are NOT overridden. A field is chosen by the reference type.
 */
public class H_WhichMethodRuns {
    static class Parent {
        int x = 1;

        void show() {
            System.out.println("Parent show");
        }
    }

    static class Child extends Parent {
        int x = 2;

        @Override
        void show() {
            System.out.println("Child show");
        }

        void onlyChild() {
            System.out.println("Only in Child");
        }
    }

    public static void main(String[] args) {
        Parent p = new Child();

        p.show();                           // Child show (object decides the method)
        System.out.println(p.x);            // 1 (reference type decides the field)
        // p.onlyChild();                   // compile error: Parent has no onlyChild()

        ((Child) p).onlyChild();            // Only in Child (cast to Child first)

        Child c = new Child();
        c.show();                           // Child show
        System.out.println(c.x);            // 2
    }
}
