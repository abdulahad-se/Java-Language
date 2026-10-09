package F_Strings.D_PrintStreamClass;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class PrintStreamClass {

        // "throws FileNotFoundException" is written because we create a file below.
        // If the file cannot be created, Java throws this exception.
        public static void main(String[] args) throws FileNotFoundException {

            // ============================================================
            // 1. System.out is a PrintStream object
            // ============================================================
            // We store System.out in a variable called "out" so we do not have to
            // type the long "System.out" again and again. Now out.println() and
            // System.out.println() work exactly the same.
            PrintStream out = System.out;
            out.println("System.out is a PrintStream");

            // ============================================================
            // 2. Difference between print() and println()
            // ============================================================
            // print()   -> prints the text and stays on the same line.
            // println() -> prints the text and then moves to a new line.
            out.print("Hello ");
            out.print("World");   // Output: Hello World (on one line)
            out.println();        // An empty println() just moves to a new line

            // ============================================================
            // 3. println() works with every data type
            // ============================================================
            // This is called "method overloading": methods with the same name
            // but for different data types.
            out.println(10);      // int (whole number)
            out.println(3.14);    // double (decimal number)
            out.println('A');     // char (single character, in single quotes)
            out.println(true);    // boolean (true or false)
            out.println("Kunal"); // String (text, in double quotes)

            // ============================================================
            // 4. printf() and format(): formatted output
            // ============================================================
            // printf means "print formatted". We write a template with % placeholders
            // and then give the values to fill them in.
            //
            // Common placeholders:
            //   %d   -> int (whole number)
            //   %f   -> float/double (decimal number)
            //   %s   -> String (text)
            //   %c   -> char (one character)
            //   %b   -> boolean (true/false)
            //   %n   -> new line (like println)
            //   %.2f -> show only 2 digits after the decimal point
            float a = 453.1274f;
            out.println(a);                                   // Output: 453.1274 (full number)
            out.printf("Formatted number is %.2f%n", a);      // Output: 453.13 (rounded to 2 digits)
            out.printf("Pi is %.3f%n", Math.PI);              // Output: 3.142 (rounded to 3 digits)
            out.printf("Hello my name is %s and I am %d years old%n", "Kunal", 22);
            // %s is replaced by "Kunal" and %d is replaced by 22
            out.printf("Grade: %c%n", 'A');                   // %c is replaced by 'A'
            out.printf("Is Java fun? %b%n", true);            // %b is replaced by true

            // format() is exactly the same as printf(). There is no difference.
            out.format("Name: %s, Age: %d%n", "Kunal", 22);

            // ============================================================
            // 5. String Concatenation (how the + operator behaves)
            // ============================================================
            // In Java, the work of + depends on what is on both sides:
            //   - Number + Number   -> addition
            //   - String + anything -> concatenation (joining)
            //
            // Remember: a char actually stores a number (its ASCII value).
            // 'a' = 97, 'b' = 98, 'c' = 99 ...

            out.println('a' + 'b');
            // char + char = number addition: 97 + 98 = 195

            out.println((char) ('a' + 3));
            // 'a' (97) + 3 = 100, and (char) converts it back to a character: 'd'

            out.println("a" + "b");
            // String + String = joined together: ab

            out.println("a" + 1);
            // String + number = the number becomes a String and is joined: a1

            out.println('a' + 'b' + "c");
            // Java works from left to right.
            // First 'a' + 'b' = 195 (addition), then 195 + "c" = "195c"

            out.println("a" + 'b' + 'c');
            // First "a" + 'b' = "ab" (it is now a String), then "ab" + 'c' = "abc"

            out.println("Kunal" + Integer.valueOf(56));
            // When an object is joined with a String, its toString() is called
            // automatically: Kunal56

            out.println("Kunal" + new ArrayList<>());
            // The toString() of an empty ArrayList gives "[]": Kunal[]

            out.println(56 + "" + new ArrayList<>());
            // 56 + "" = "56" (String), then joined with the ArrayList: 56[]

            // ============================================================
            // 6. Creating our own PrintStream: writing to a file
            // ============================================================
            // If we give a file name to PrintStream, it writes the output to that
            // file instead of the screen. An "output.txt" file will be created in
            // the project folder.
            PrintStream fileOut = new PrintStream("output.txt");
            fileOut.println("This line will go into the file");
            fileOut.printf("Value: %d%n", 100);
            fileOut.close();
            // Always call close(): it closes the file and makes sure the data is saved.

            // ============================================================
            // 7. Capturing output in memory (as a String)
            // ============================================================
            // ByteArrayOutputStream is like a "box" that stores data in memory.
            // If we connect a PrintStream to this box, the printed text does not
            // appear on the screen. It is collected inside the box instead.
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            PrintStream memory = new PrintStream(buffer);
            memory.print("Captured text");
            memory.flush();   // flush() pushes any remaining data into the box
            out.println("Buffer contains: " + buffer.toString());
            // buffer.toString() gives us all the text stored in the box

            // ============================================================
            // 8. Redirecting System.out (changing where the output goes)
            // ============================================================
            // System.setOut() tells Java where "System.out" should print from now on.
            System.setOut(memory);
            System.out.println("This will not appear on the console");  // It went into the memory box

            System.setOut(out);   // Restored the original console
            System.out.println("Back on the console now");              // This will appear on the screen

            // ============================================================
            // 9. checkError(): checking for errors
            // ============================================================
            // Unlike other streams, PrintStream does not throw an exception when an
            // error happens. It silently remembers the error. We can use checkError()
            // to ask whether any error happened.
            //   false -> no error happened
            //   true  -> an error happened somewhere
            out.println("Did an error occur? " + out.checkError());
        }
    }


