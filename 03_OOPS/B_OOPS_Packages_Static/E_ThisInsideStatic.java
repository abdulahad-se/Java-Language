package B_OOPS_Packages_Static;

/*
 * this keyword inside a static method
 * -----------------------------------
 * this means "the current object". A static method does not belong to any
 * object, so there is no current object and this cannot be used there.
 */
public class E_ThisInsideStatic {
    int value = 10;

    static void show() {
        // System.out.println(this.value);          // compile error: no this in static
    }

    void showNonStatic() {
        System.out.println(this.value);             // allowed: this exists here
    }

    public static void main(String[] args) {
        show();
        new E_ThisInsideStatic().showNonStatic();   // 10
    }
}
