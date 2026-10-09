package F_Strings.B_StringFormatting;

public class B_StringFormattingUsingPrintf {
        public static void main(String[] args) {

            // 1. printf prints directly (no need for println). Use %n for a new line
            System.out.printf("Name: %s, Age: %d%n", "Kunal", 22);       // Name: Kunal, Age: 22

            // 2. Basic specifiers
            System.out.printf("%d%n", 42);                // 42       (int)
            System.out.printf("%f%n", 3.14159);           // 3.141590 (double, 6 digits by default)
            System.out.printf("%s%n", "Java");            // Java     (String)
            System.out.printf("%c%n", 'A');               // A        (char)
            System.out.printf("%b%n", true);              // true     (boolean)
            System.out.printf("100%%%n");                 // 100%     (%% prints a % sign)

            // 3. Decimal places
            System.out.printf("%.2f%n", 3.14159);         // 3.14
            System.out.printf("%.0f%n", 2.5);             // 3        (rounded)

            // 4. Width: total space the value takes (right aligned by default)
            System.out.printf("%5d|%n", 42);              //    42|

            // 5. Left align with -
            System.out.printf("%-5d|%n", 42);             // 42   |

            // 6. Zero padding with 0
            System.out.printf("%05d%n", 42);              // 00042

            // 7. Width + decimal places together
            System.out.printf("%8.2f|%n", 3.14159);       //     3.14|

            // 8. Show sign with +
            System.out.printf("%+d%n", 42);               // +42

            // 9. Comma separator for big numbers
            System.out.printf("%,d%n", 1000000);          // 1,000,000

            // 10. Width and precision on Strings
            System.out.printf("%-10s|%n", "Kunal");       // Kunal     |
            System.out.printf("%.3s%n", "Kunal");         // Kun      (first 3 characters only)

            // 11. Upper case with capital letters
            System.out.printf("%S%n", "hello");           // HELLO

            // 12. Number systems
            System.out.printf("%x%n", 255);               // ff       (hexadecimal)
            System.out.printf("%X%n", 255);               // FF
            System.out.printf("%o%n", 8);                 // 10       (octal)

            // 13. Scientific notation
            System.out.printf("%e%n", 12345.678);         // 1.234568e+04

            // 14. Argument index: reuse or reorder arguments
            System.out.printf("%2$s %1$s%n", "World", "Hello");   // Hello World
            System.out.printf("%1$s %1$s%n", "Hi");               // Hi Hi

            // 15. Multiple values in one printf
            System.out.printf("%s scored %.1f%n", "Ali", 89.456); // Ali scored 89.5
        }
    }
