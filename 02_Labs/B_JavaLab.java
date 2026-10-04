import java.util.*;

public class B_JavaLab {
    // Task 1..
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        double exp = Math.pow(num1, num2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Exponentiation: " + exp);

        // --------------------------------------------------------------------

        // Task 2

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = celsius * (9.0 / 5.0) + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

        // -------------------------------------------------------------------------------------

        // Task 3
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Original number: " + number);
        number++;
        System.out.println("After increment (++): " + number);
        number--;
        System.out.println("After decrement (--): " + number);

        // -----------------------------------------------------------------

        // Task 4
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        System.out.println("Bitwise AND (&) result: " + andResult);
        System.out.println("Bitwise OR (|) result: " + orResult);
        System.out.println("Bitwise XOR (^) result: " + xorResult);
        input.close();
    }
}
