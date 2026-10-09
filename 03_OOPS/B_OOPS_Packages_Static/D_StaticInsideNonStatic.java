package B_OOPS_Packages_Static;

/*
 * Static member inside a non-static method
 * ----------------------------------------
 * A non-static method belongs to an object, and the class already exists
 * when an object exists. So it can use static members directly.
 * Rule: static cannot use non-static directly, but non-static can use static.
 */
public class D_StaticInsideNonStatic {
    static int count = 5;                           // static variable

    static void printCount() {                      // static method
        System.out.println("Count: " + count);
    }

    void show() {                                   // non-static method
        System.out.println(count);                  // allowed
        printCount();                               // allowed
    }

    public static void main(String[] args) {
        D_StaticInsideNonStatic obj = new D_StaticInsideNonStatic();
        obj.show();
        // 5
        // Count: 5
    }
}
