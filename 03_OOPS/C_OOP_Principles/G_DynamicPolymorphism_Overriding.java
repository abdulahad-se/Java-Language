package C_OOP_Principles;

/*
 * Dynamic (runtime) polymorphism and Overriding
 * ---------------------------------------------
 * Overriding means the child class gives its own version of a method
 * that already exists in the parent class.
 *
 * Rules:
 * - Same method name and same parameters.
 * - Same return type (or a child type of it).
 * - Access cannot be weaker (public in parent cannot become private in child).
 * - Use @Override so the compiler checks it for us.
 */
public class G_DynamicPolymorphism_Overriding {
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();                          // Animal makes a sound

        Animal d = new Dog();               // parent reference, child object
        d.sound();                          // Dog barks

        Animal c = new Cat();
        c.sound();                          // Cat meows
    }
}
