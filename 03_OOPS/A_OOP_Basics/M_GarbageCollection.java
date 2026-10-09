/*
 * Garbage collection
 * ------------------
 * Garbage collection is Java's automatic memory cleanup.
 * When no reference points to an object, the object is no longer reachable
 * and the garbage collector can remove it from the heap.
 * We do not delete objects manually in Java.
 *
 * Key points:
 * - System.gc() is only a request, Java decides when to run it.
 * - finalize() is called by the garbage collector just before it removes
 *   an object. It is deprecated (for removal) in modern Java, so we only
 *   learn it. For cleanup use try-with-resources / AutoCloseable instead.
 * - finalize() output is not guaranteed to appear.
 */
public class M_GarbageCollection {
    static class Student {
        String name;

        @Override
        @SuppressWarnings({"deprecation", "removal"})
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed: " + name);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Student s = new Student();
        s.name = "Ali";

        s = null;                        // object is now eligible for garbage collection

        System.gc();                     // request only
        Thread.sleep(1000);              // give the garbage collector a moment
        System.out.println("End of main");
    }
}
