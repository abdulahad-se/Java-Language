package C_OOP_Principles;

/*
 * Types of inheritance
 * --------------------
 * Single:       one child extends one parent                 (Dog extends Animal)
 * Multiple:     one child has more than one parent
 *               Java does NOT allow this with classes (confusion when both parents
 *               have the same method). We use interfaces instead.
 * Hierarchical: many children extend the same parent         (Dog and Cat extend Animal)
 * Hybrid:       a mix of the types above. In Java it is done using interfaces.
 */
public class D_TypesOfInheritance {
    static class Animal {
        void eat() {
            System.out.println("Eating");
        }
    }

    // Single inheritance
    static class Dog extends Animal {
        void bark() {
            System.out.println("Barking");
        }
    }

    // Hierarchical inheritance: Dog and Cat both extend Animal
    static class Cat extends Animal {
        void meow() {
            System.out.println("Meowing");
        }
    }

    interface Flyer {
        void fly();
    }

    interface Swimmer {
        void swim();
    }

    // Multiple inheritance through interfaces:
    // Duck implements two interfaces. Since it also extends Animal,
    // it is a hybrid (single + multiple).
    static class Duck extends Animal implements Flyer, Swimmer {
        public void fly() {
            System.out.println("Flying");
        }

        public void swim() {
            System.out.println("Swimming");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();                            // Eating (inherited)
        d.bark();                           // Barking

        new Cat().meow();                   // Meowing

        Duck duck = new Duck();
        duck.eat();                         // Eating
        duck.fly();                         // Flying
        duck.swim();                        // Swimming

        // class X extends Dog, Cat { }     // compile error: a class can extend only one class
    }
}
