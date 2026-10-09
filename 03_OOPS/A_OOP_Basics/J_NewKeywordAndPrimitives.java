/*
 * Why we do not use new for primitive data types
 * -----------------------------------------------
 * Primitives (int, char, double, boolean...) store their value directly,
 * so no object is needed. A local primitive variable lives in the stack.
 * Objects are created in the heap with new, and the variable in the
 * stack only holds the reference to that object.
 *
 * Copying:
 * - Primitive copy  -> the value is copied (two independent variables).
 * - Reference copy  -> the address is copied (both point to one object).
 */
public class J_NewKeywordAndPrimitives {
    static class Student {
        String name;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;
        System.out.println(a);           // 10 (b is a separate copy)

        Student s1 = new Student();
        s1.name = "Ali";
        Student s2 = s1;                 // copies the reference, not the object
        s2.name = "Sara";
        System.out.println(s1.name);     // Sara (same object)
    }
}