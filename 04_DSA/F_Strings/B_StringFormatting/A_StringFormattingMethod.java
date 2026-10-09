package F_Strings.B_StringFormatting;

public class A_StringFormattingMethod {
    public static void main(String[] args) {

        // 1. String.format() returns a String (printf only prints it)
        String s = String.format("Name: %s, Age: %d", "Kunal", 22);
        System.out.println(s);                                  // Name: Kunal, Age: 22

        // 2. Basic specifiers
        System.out.println(String.format("%d", 42));            // 42       (int)
        System.out.println(String.format("%f", 3.14159));       // 3.141590 (double, 6 digits by default)
        System.out.println(String.format("%s", "Java"));        // Java     (String)
        System.out.println(String.format("%c", 'A'));           // A        (char)
        System.out.println(String.format("%b", true));          // true     (boolean)
        System.out.println(String.format("100%%"));             // 100%     (%% prints a % sign)

        // 3. Decimal places
        System.out.println(String.format("%.2f", 3.14159));     // 3.14
        System.out.println(String.format("%.0f", 2.5));         // 3        (rounded)

        // 4. Width: total space the value takes (right aligned by default)
        System.out.println(String.format("%5d|", 42));          //    42|

        // 5. Left align with -
        System.out.println(String.format("%-5d|", 42));         // 42   |

        // 6. Zero padding with 0
        System.out.println(String.format("%05d", 42));          // 00042

        // 7. Width + decimal places together
        System.out.println(String.format("%8.2f|", 3.14159));   //     3.14|

        // 8. Show sign with +
        System.out.println(String.format("%+d", 42));           // +42

        // 9. Comma separator for big numbers
        System.out.println(String.format("%,d", 1000000));      // 1,000,000

        // 10. Width and precision on Strings
        System.out.println(String.format("%-10s|", "Kunal"));   // Kunal     |
        System.out.println(String.format("%.3s", "Kunal"));     // Kun      (first 3 characters only)

        // 11. Upper case with capital letters
        System.out.println(String.format("%S", "hello"));       // HELLO

        // 12. Number systems
        System.out.println(String.format("%x", 255));           // ff       (hexadecimal)
        System.out.println(String.format("%X", 255));           // FF
        System.out.println(String.format("%o", 8));             // 10       (octal)

        // 13. Scientific notation
        System.out.println(String.format("%e", 12345.678));     // 1.234568e+04

        // 14. Argument index: reuse or reorder arguments
        System.out.println(String.format("%2$s %1$s", "World", "Hello")); // Hello World
        System.out.println(String.format("%1$s %1$s", "Hi"));             // Hi Hi

        // 15. Same formats work with printf
        System.out.printf("%s scored %.1f%n", "Ali", 89.456);   // Ali scored 89.5
    }
}
