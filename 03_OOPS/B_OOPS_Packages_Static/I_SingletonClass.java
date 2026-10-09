package B_OOPS_Packages_Static;

/*
 * Singleton class
 * ---------------
 * A singleton class allows only ONE object to exist.
 * How:
 * 1. Make the constructor private (nobody outside can use new).
 * 2. Keep the single object in a private static variable.
 * 3. Give a public static method (getInstance) that returns that object.
 *
 * Note: this basic version is not thread-safe (fine for learning).
 */
public class I_SingletonClass {
    static class Singleton {
        private static Singleton instance;

        private Singleton() {
            System.out.println("Object created");
        }

        static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();      // Object created
        Singleton b = Singleton.getInstance();      // nothing printed, same object
        System.out.println(a == b);                 // true
    }
}
