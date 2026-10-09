public class Q_ExceptionHandling {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 0;

        try {
            System.out.println(firstNumber / secondNumber);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Division attempt completed.");
        }

        try {
            int[] numbers = { 10, 20, 30 };
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("The requested array index does not exist.");
        }
    }
}
