package B_OOPS_Packages_Static;

import java.io.PrintStream;

/*
 * Internal working of System.out.println()
 * ----------------------------------------
 * System   -> a class (in java.lang)
 * out      -> a static variable inside System, of type PrintStream
 * println  -> a method of the PrintStream class
 *
 * Because out is static, we write System.out without creating a System object.
 * Below we build a small copy of the same idea.
 */
public class H_InternalWorking {
    static class MyPrintStream {
        void println(String s) {
            System.out.println(s);                  // real print
        }
    }

    static class MySystem {
        static final MyPrintStream out = new MyPrintStream();   // static variable
    }

    public static void main(String[] args) {
        MySystem.out.println("Same idea as System.out.println");

        PrintStream real = System.out;              // out is a PrintStream object
        real.println("Hello");
    }
}
