package B_OOPS_Packages_Static;

/*
 * Non-static member inside a static method
 * ----------------------------------------
 * A static method belongs to the class, so no object exists yet when it runs.
 * Because of that, it cannot use non-static (instance) members directly.
 * We must create an object first and use it.
 */
public class C_NonStaticInsideStatic {
    int age = 20;                                   // non-static variable

    void show() {                                   // non-static method
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {        // main is static
        // System.out.println(age);                 // compile error
        // show();                                  // compile error

        C_NonStaticInsideStatic obj = new C_NonStaticInsideStatic();
        System.out.println(obj.age);                // 20
        obj.show();                                 // Age: 20
    }
}
