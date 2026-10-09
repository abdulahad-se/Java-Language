package B_OOPS_Packages_Static;

/*
 * static keyword
 * --------------
 * A static member belongs to the class, not to any object.
 * - There is only ONE copy, shared by all objects.
 * - It can be used with the class name, without creating an object.
 *
 * Static variable: one shared value (like a counter).
 * Non-static (instance) variable: every object has its own copy.
 */
public class B_StaticElements {
    static class Human {
        String name;                    // instance variable: separate for every object
        static int population = 0;      // static variable: shared by all objects

        Human(String name) {
            this.name = name;
            population++;               // every new object updates the same variable
        }
    }

    public static void main(String[] args) {
        Human h1 = new Human("Ali");
        Human h2 = new Human("Sara");

        System.out.println(h1.name + " " + h2.name);       // Ali Sara
        System.out.println(Human.population);              // 2 (use the class name)
    }
}
