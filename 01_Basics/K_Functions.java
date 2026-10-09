import java.util.Scanner;

public class K_Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms: ");
        int terms = scanner.nextInt();
        fibonacciSeries(terms);

        System.out.println("Largest number: " + greaterNumber(12, 25));
        System.out.println("Eligible to vote: " + eligibleAge(20));
        System.out.println("Circumference: " + circumferenceRadius(5));
        System.out.println("Sum: " + printSum(10, 20));
        System.out.println("Odd number sum: " + printOddSum(10));
        System.out.println("Average: " + printAverage(10, 20, 30));
        System.out.println("Factorial: " + numberFact(5));

        counterNumber(5);
        scanner.close();
    }

    public static void fibonacciSeries(int terms) {
        int first = 0;
        int second = 1;
        for (int count = 1; count <= terms; count++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void counterNumber(int limit) {
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for (int number = -10; number <= limit; number++) {
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
    }

    public static String eligibleAge(int age) {
        return age >= 18 ? "Eligible to vote" : "Not eligible to vote";
    }

    public static double circumferenceRadius(double radius) {
        return 2 * Math.PI * radius;
    }

    public static int greaterNumber(int first, int second) {
        return first > second ? first : second;
    }

    public static int printOddSum(int limit) {
        int sum = 0;
        for (int number = 1; number <= limit; number++) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static double printAverage(int first, int second, int third) {
        return (first + second + third) / 3.0;
    }

    public static int numberFact(int number) {
        int factorial = 1;
        for (int current = number; current >= 1; current--) {
            factorial *= current;
        }
        return factorial;
    }

    public static int printSum(int first, int second) {
        return first + second;
    }
}
