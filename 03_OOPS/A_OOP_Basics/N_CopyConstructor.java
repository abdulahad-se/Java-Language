/*
 * Object Copying via Copy Constructor
 * -----------------------------------
 * Instead of using Java's built-in Cloneable interface, a "copy constructor" 
 * accepts an object of the same class as a parameter and copies its values 
 * into the new object being created.
 * 
 * - Shallow Copy: Copies field references directly.
 * - Deep Copy: Allocates new memory for nested objects inside the constructor.
 */
public class N_CopyConstructor {
    static class Address {
        String city;

        Address(String city) {
            this.city = city;
        }

        // Copy constructor for Address
        Address(Address other) {
            this.city = other.city;
        }
    }

    static class Student {
        int id;
        String name;
        Address address;

        // Normal parameterized constructor
        Student(int id, String name, Address address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        // Copy Constructor (Deep Copy implementation)
        Student(Student other) {
            this.id = other.id;
            this.name = other.name;
            // Deep copy: pass the nested object into its own copy constructor
            this.address = new Address(other.address);
        }
    }

    public static void main(String[] args) {
        Address addr = new Address("Karachi");
        Student original = new Student(1, "Ali", addr);

        // Creating a copy by passing the original object into the constructor
        Student copy = new Student(original);

        System.out.println("Original city: " + original.address.city); // Karachi
        System.out.println("Copy city: " + copy.address.city);         // Karachi

        // Modifying the copy's address does NOT affect the original (Deep Copy)
        copy.address.city = "Quetta";
        System.out.println("\nAfter modifying copy's city to Quetta:");
        System.out.println("Original city: " + original.address.city); // Karachi (Safe!)
        System.out.println("Copy city: " + copy.address.city);         // Quetta
    }
}
