import java.util.ArrayList;

/*
 * Wrapper classes
 * ---------------
 * A wrapper class turns a primitive into an object.
 * int -> Integer, double -> Double, char -> Character, boolean -> Boolean
 *
 * Why we need them:
 * - Collections like ArrayList work only with objects, not primitives.
 * - They give useful methods and constants (parseInt, MAX_VALUE).
 *
 * Autoboxing: primitive -> wrapper object (done automatically).
 * Unboxing:   wrapper object -> primitive (done automatically).
 *
 * Compare wrapper objects with equals(), not ==.
 */
public class K_WrapperClasses {
    public static void main(String[] args) {
        Integer a = 10;                  // autoboxing
        int b = a;                       // unboxing
        System.out.println(a + " " + b); // 10 10

        System.out.println(Integer.MAX_VALUE);         // 2147483647
        System.out.println(Integer.parseInt("123"));   // 123

        Integer x = 1000;
        Integer y = 1000;
        System.out.println(x.equals(y));               // true

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println(list);                      // [5]
    }
}
