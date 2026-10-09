package B_OOPS_Packages_Static;

/*
 * Inner classes
 * -------------
 * A class written inside another class.
 *
 * Inner class (non-static): needs an object of the outer class,
 *   and can use the outer class's non-static members.
 * Static nested class: does not need an outer object,
 *   and can use only the outer class's static members.
 */
public class G_InnerClasses {
    static class Outer {
        int x = 10;                                 // non-static
        static int y = 20;                          // static

        class Inner {                               // inner class (non-static)
            void show() {
                System.out.println(x + " " + y);
            }
        }

        static class StaticNested {                 // static nested class
            void show() {
                System.out.println(y);              // only static members allowed
            }
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();      // needs an outer object
        inner.show();                               // 10 20

        Outer.StaticNested nested = new Outer.StaticNested();   // no outer object needed
        nested.show();                              // 20
    }
}
