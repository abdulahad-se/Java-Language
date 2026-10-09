package C_OOP_Principles;

/*
 * ========================================================
 * What is Abstraction?
 * ========================================================
 * Abstraction is the concept of hiding the implementation details 
 * and only showing the essential features/functionality to the user.
 * 
 * In Java:
 * 1. We achieve abstraction using 'abstract' classes and interfaces.
 * 2. An abstract class cannot be instantiated directly (you cannot do `new Parent()`).
 * 3. It can contain abstract methods (methods without a body) that 
 *    forcing the child classes to provide their own implementation.
 * 4. It can also contain normal methods, constructors, and static methods.
 * ========================================================
 */

// Abstract Class
abstract class Parent {
    int age;

    // Abstract constructor
    public Parent(int age) {
        this.age = age;
    }

    // Static method (allowed in abstract classes)
    static void hello() {
        System.out.println("Hey, this is a static method in Parent");
    }

    // Normal/Regular method (has a body)
    void normal() {
        System.out.println("This is a normal method inside an abstract class");
    }

    // Abstract methods - Hiding the "how" and focusing only on the "what".
    // Subclasses are forced to override these and provide their own definitions.
    abstract void career();
    abstract void partner();
}

// Subclass 1
class Son extends Parent {

    public Son(int age) {
        super(age); // calling abstract class constructor
    }

    @Override
    void career() {
        System.out.println("I am going to be a Software Engineer!");
    }

    @Override
    void partner() {
        System.out.println("I love coding!");
    }
}

// Subclass 2
class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Doctor!");
    }

    @Override
    void partner() {
        System.out.println("I love science!");
    }
}

// Main execution class
public class M_Abstraction {
    public static void main(String[] args) {
        // 1. Creating objects using child classes
        Son son = new Son(21);
        son.career();
        son.partner();
        son.normal();

        Daughter daughter = new Daughter(19);
        daughter.career();
        daughter.partner();

        // 2. Accessing static method using class name directly
        Parent.hello();

        // 3. ERROR: You cannot create an object of an abstract class directly!
        // Parent mom = new Parent(45); // Throws compilation error
    }
}