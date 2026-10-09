public class D_JavaLab {
    public static void main(String[] args) {
        System.out.println("LOOPS JAVA LAB");
        System.out.println("==============");

        // Task 1: Print numbers using a for loop.
        System.out.println("\nTask 1 - for loop");
        for (int number = 1; number <= 10; number++) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Task 2: Calculate a sum using a while loop.
        System.out.println("\nTask 2 - while loop");
        int number = 1;
        int sum = 0;
        while (number <= 10) {
            sum += number;
            number++;
        }
        System.out.println("Sum from 1 to 10 = " + sum);

        // Task 3: Count down using a do-while loop.
        System.out.println("\nTask 3 - do-while loop");
        number = 5;
        do {
            System.out.print(number + " ");
            number--;
        } while (number >= 1);
        System.out.println();

        // Task 4: Use continue to skip even numbers.
        System.out.println("\nTask 4 - continue statement");
        for (number = 1; number <= 15; number++) {
            if (number % 2 == 0) {
                continue;
            }
            System.out.print(number + " ");
        }
        System.out.println();

        // Task 5: Use break after finding the first multiple of 7.
        System.out.println("\nTask 5 - break statement");
        for (number = 1; number <= 100; number++) {
            if (number % 7 == 0) {
                System.out.println("First multiple of 7 = " + number);
                break;
            }
        }

        // Task 6: Print a multiplication table using nested loops.
        System.out.println("\nTask 6 - nested loops");
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 5; column++) {
                System.out.printf("%4d", row * column);
            }
            System.out.println();
        }

        // Task 7: Calculate a factorial using a while loop.
        System.out.println("\nTask 7 - factorial");
        int factorialNumber = 5;
        int factorial = 1;
        number = 2;
        while (number <= factorialNumber) {
            factorial *= number;
            number++;
        }
        System.out.println(factorialNumber + "! = " + factorial);

        // Task 8: Count digits and calculate their sum using do-while.
        System.out.println("\nTask 8 - digit processing");
        int value = 4826;
        int remaining = value;
        int digitCount = 0;
        int digitSum = 0;
        do {
            digitSum += remaining % 10;
            digitCount++;
            remaining /= 10;
        } while (remaining > 0);
        System.out.println("Number of digits = " + digitCount);
        System.out.println("Sum of digits = " + digitSum);

        // Task 9: Print a number pattern using nested loops.
        System.out.println("\nTask 9 - number pattern");
        for (row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        // Task 10: Print prime numbers using a nested loop.
        System.out.println("\nTask 10 - prime numbers");
        for (number = 2; number <= 30; number++) {
            boolean prime = true;
            for (int divisor = 2; divisor * divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}
