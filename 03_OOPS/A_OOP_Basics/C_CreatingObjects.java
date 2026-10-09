/*
 * Creating objects and the new keyword
 * ------------------------------------
 * new creates an object at runtime and returns its reference.
 * This is called dynamic memory allocation.
 *
 * Memory:
 * - A local reference variable (s) lives in the stack.
 * - The object itself lives in the heap.
 *
 * Two steps (can be written in one line):
 * 1. Declaration:    Student s;           -> only a reference, no object yet
 * 2. Initialization: s = new Student();   -> object is created in heap
 *
 * A reference that points to nothing is null. Using it gives NullPointerException.
 */
public class C_CreatingObjects {
    static class Student {
        String name;
    }

    public static void main(String[] args) {
        Student s;
        s = new Student();
        s.name = "Ali";

        Student s2 = new Student();      // both steps in one line

        Student s3 = null;
        // System.out.println(s3.name);  // NullPointerException

        System.out.println(s.name);      // Ali
    }
}
