package C_OOP_Principles;

/*
 * super keyword
 * -------------
 * super refers to the parent class.
 *
 * Uses:
 * 1. super(...)      -> calls the parent constructor.
 * 2. super.method()  -> calls the parent's version of a method.
 * 3. super.field     -> accesses the parent's field when the child has the same name.
 *
 * Rule (classic): super(...) is written as the first statement of the constructor.
 * Note: since Java 25 other statements are allowed before it, but they cannot use
 * the current object. In most courses and interviews, "first statement" is still
 * the expected answer.
 *
 * The parent constructor always runs BEFORE the child constructor.
 * If we do not write super(...), Java adds super() automatically.
 */
public class C_SuperKeyword {
    static class Parent {
        int value = 10;

        Parent() {
            System.out.println("Parent constructor");
        }

        void show() {
            System.out.println("Parent show");
        }
    }

    static class Child extends Parent {
        int value = 20;

        Child() {
            super();                        // calls Parent()
            System.out.println("Child constructor");
        }

        @Override
        void show() {
            super.show();                   // calls the Parent version
            System.out.println("Child show");
        }

        void values() {
            System.out.println(value + " " + super.value);
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        // Parent constructor
        // Child constructor
        c.show();
        // Parent show
        // Child show
        c.values();                         // 20 10
    }
}