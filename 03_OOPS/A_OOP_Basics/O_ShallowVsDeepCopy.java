/*
 * Shallow Copy vs Deep Copy using Copy Constructors
 * -------------------------------------------------
 * This file demonstrates the difference between a shallow copy constructor 
 * (which copies references) and a deep copy constructor (which allocates new memory).
 */
public class O_ShallowVsDeepCopy {

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

    // --- 1. SHALLOW COPY STUDENT ---
    static class StudentShallow {
        int id;
        String name;
        Address address;

        StudentShallow(int id, String name, Address address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        // Shallow Copy Constructor: copies reference directly
        StudentShallow(StudentShallow other) {
            this.id = other.id;
            this.name = other.name;
            this.address = other.address; // SHARES the same Address object!
        }
    }

    // --- 2. DEEP COPY STUDENT ---
    static class StudentDeep {
        int id;
        String name;
        Address address;

        StudentDeep(int id, String name, Address address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        // Deep Copy Constructor: creates a brand-new Address object
        StudentDeep(StudentDeep other) {
            this.id = other.id;
            this.name = other.name;
            this.address = new Address(other.address); // NEW memory allocated!
        }
    }

    public static void main(String[] args) {
        System.out.println("=== SHALLOW COPY DEMO ===");
        Address addr1 = new Address("Karachi");
        StudentShallow originalShallow = new StudentShallow(1, "Ali", addr1);
        
        // Copying using shallow copy constructor
        StudentShallow copyShallow = new StudentShallow(originalShallow);

        System.out.println("Before modification - Original: " + originalShallow.address.city + ", Copy: " + copyShallow.address.city);
        
        // Modify copy's city
        copyShallow.address.city = "Quetta";
        
        // Original gets affected because they share the same address reference!
        System.out.println("After modifying copy to Quetta:");
        System.out.println("Original city: " + originalShallow.address.city); // Quetta (Affected!)
        System.out.println("Copy city: " + copyShallow.address.city);         // Quetta

        System.out.println("\n=== DEEP COPY DEMO ===");
        Address addr2 = new Address("Lahore");
        StudentDeep originalDeep = new StudentDeep(2, "Ahmed", addr2);
        
        // Copying using deep copy constructor
        StudentDeep copyDeep = new StudentDeep(originalDeep);

        System.out.println("Before modification - Original: " + originalDeep.address.city + ", Copy: " + copyDeep.address.city);
        
        // Modify copy's city
        copyDeep.address.city = "Islamabad";
        
        // Original remains safe because the deep copy has its own separate Address object!
        System.out.println("After modifying copy to Islamabad:");
        System.out.println("Original Deep city: " + originalDeep.address.city); // Lahore (Safe!)
        System.out.println("Deep copy city: " + copyDeep.address.city);         // Islamabad
    }
}
