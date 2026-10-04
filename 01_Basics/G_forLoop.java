import java.util.*;

public class G_forLoop {
    public static void main(String[] args) {

        // Basic for loop: 1 to 10
        System.out.println("Numbers 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Reverse counting: 10 to 1
        System.out.println("Reverse counting (10 to 1)");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Even numbers
        System.out.println("Even numbers (1 to 20)");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Odd numbers
        System.out.println("Odd numbers (1 to 20)");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sum of first n natural numbers
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers");
        System.out.println("Sum = " + sum);

        // Factorial using for loop
        int num = 5;
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num);
        System.out.println("Factorial = " + factorial);

        // Multiplication table of a number
        int table = 7;
        System.out.println("Multiplication Table of " + table);
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }

        // for loop with break
        System.out.println("for loop with break (stop at 6)");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // for loop with continue
        System.out.println("for loop with continue (skip multiples of 3)");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
