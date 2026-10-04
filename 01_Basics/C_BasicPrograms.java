public class C_BasicPrograms {
    public static void main(String[] args) {
        // Adding two numbers
        double num1 = 20;
        double num2 = 30;
        double result = num1 + num2;
        System.out.println("The sum of number1 and number2 is" + result);

        // Adding more than two numbers
        double number1 = 10;
        double number2 = 20;
        double number3 = 100;
        double number4 = 30;
        double sum1 = number1 + number2;
        double sum2 = number3 + number4;
        double finalsum = sum1 + sum2;
        System.out.println("The sum of all 4 numbers is" + finalsum);

        // increment and decrement operator
        int a1 = 10;
        int a2 = 20;
        System.out.println("The increment" + a1++);
        System.out.println("The increment" + ++a1);
        System.out.println("The decrement" + a2--);
        System.out.println("The decrement" + --a2);
    }
}
