package C_OOP_Principles;

/*
 * Types of polymorphism
 * ---------------------
 * 1. Static (compile time) polymorphism  -> achieved by method OVERLOADING.
 *    The compiler decides which method to call while compiling.
 * 2. Dynamic (runtime) polymorphism      -> achieved by method OVERRIDING.
 *    Java decides which method to call while the program runs.
 *
 * Overloading
 * -----------
 * Same method name, different parameters (number, type or order).
 * Only the return type is not enough to overload a method.
 */
public class F_StaticPolymorphism_Overloading {
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {     // different parameter types
        return a + b;
    }

    static int sum(int a, int b, int c) {       // different number of parameters
        return a + b + c;
    }

    // static int sum(int a, int b) { ... }      // error: same parameters, even with another return type

    public static void main(String[] args) {
        System.out.println(sum(1, 2));          // 3
        System.out.println(sum(1.5, 2.5));      // 4.0
        System.out.println(sum(1, 2, 3));       // 6
    }
}
