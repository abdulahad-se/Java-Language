package B_OOPS_Packages_Static.A_Packages.mypackage;

public class Greeting {
    // public: so that classes outside this package can use it
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}