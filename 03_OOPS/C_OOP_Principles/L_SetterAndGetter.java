package C_OOP_Principles;

/*
 * ========================================================
 * Getters and Setters in Java OOP
 * ========================================================
 * 1. Private fields: Variables are marked `private` so they cannot 
 *    be accessed directly from outside the class (Data Hiding).
 * 2. Getters: Public methods that return (get) the value of a private field.
 * 3. Setters: Public methods that update (set) the value of a private field,
 *    often including validation logic if needed.
 * ========================================================
 */

// Abstract Class
class Student {
    // Private fields (Encapsulation / Data Hiding)
    private String name;
    private int age;

    // --- Getter for name ---
    public String getName() {
        return name;
    }

    // --- Setter for name ---
    public void setName(String name) {
        this.name = name;
    }

    // --- Getter for age ---
    public int getAge() {
        return age;
    }

    // --- Setter for age (with optional validation) ---
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class L_SetterAndGetter {
    public static void main(String[] args) {
        Student student = new Student();

        // 1. Using Setters to assign values to private fields
        student.setName("Mirza");
        student.setAge(21);

        // 2. Using Getters to read values from private fields
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}