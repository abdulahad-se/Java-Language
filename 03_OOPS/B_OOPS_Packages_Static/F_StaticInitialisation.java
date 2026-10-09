package B_OOPS_Packages_Static;

/*
 * Initialisation of static variables
 * ----------------------------------
 * A static block runs only ONCE, when the class is loaded (first used).
 * It is used to initialize static variables that need more than one line.
 * A static block runs before any object is created.
 */
public class F_StaticInitialisation {
    static class Config {
        static int value;

        static {
            System.out.println("Static block runs once");
            value = 10;
        }
    }

    public static void main(String[] args) {
        System.out.println("Start of main");
        System.out.println(Config.value);           // class is loaded here, static block runs
        System.out.println(Config.value);           // static block does NOT run again
        // Start of main
        // Static block runs once
        // 10
        // 10
    }
}
