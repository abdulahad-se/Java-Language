package B_OOPS_Packages_Static.A_Packages;

import B_OOPS_Packages_Static.A_Packages.mypackage.Greeting;
import java.util.ArrayList;
/*
 * Package
 * -------
 * A package is a folder-like group of related classes.
 * It organizes code and avoids name conflicts (two classes can have the same
 * name if they are in different packages).
 * The package line must be the first line of the file and match the folder name.
 *
 * import statement
 * ----------------
 * import lets us use a class from another package without writing its full name.
 * Without import we must write the full name, like java.util.ArrayList.
 * java.lang (String, System, Math) is imported automatically.
 */
public class A_PackagesAndImport {
    public static void main(String[] args) {
        Greeting.sayHello("Ali");                          // Hello, Ali (imported class)

        ArrayList<Integer> list1 = new ArrayList<>();      // short name, because of import
        list1.add(1);
        System.out.println(list1);                         // [1]

        java.util.ArrayList<Integer> list2 = new java.util.ArrayList<>();   // full name, no import needed
        list2.add(2);
        System.out.println(list2);                         // [2]
    }
}
