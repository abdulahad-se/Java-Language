public class L_CommandLine {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Error: Please provide 3 arguments.");
            System.out.println("Usage: java QuickCalc <number1> <operator> <number2>");
            System.out.println("Example: java QuickCalc 12 + 5");
            return;
        }
        try {
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double num2 = Double.parseDouble(args[2]);
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                case "x":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Unsupported operator '" + operator + "'. Use +, -, *, or /.");
                    return;
            }

            System.out.printf("Result: %.2f %s %.2f = %.2f%n", num1, operator, num2, result);

        } catch (NumberFormatException e) {
            System.out.println("Error: First and third arguments must be valid numbers.");
        }
    }
}
