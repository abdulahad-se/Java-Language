package C_OOP_Principles;

/*
 * Can we override static methods?
 * -------------------------------
 * No. Static methods belong to the class, not to an object, and overriding
 * works with objects (runtime). If the child writes a static method with the
 * same signature, it only HIDES the parent's one (method hiding).
 *
 * The method is chosen by the reference type, not by the object.
 * Also, @Override on a static method gives a compile error.
 */
public class J_OverridingStaticMethods {
    static class Parent {
        static void greet() {
            System.out.println("Parent greet");
        }
    }

    static class Child extends Parent {
        // @Override                        // compile error on a static method
        static void greet() {               // hides Parent.greet(), does not override it
            System.out.println("Child greet");
        }
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.greet();                          // Parent greet (reference type decides)

        Parent.greet();                     // Parent greet
        Child.greet();                      // Child greet
    }
}
