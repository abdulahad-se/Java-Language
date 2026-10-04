import java.util.Scanner;

public class C_JavaLab {
    // Task 1.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the hour (0-23): ");
        int hour = input.nextInt();
        if (hour < 12) {
            System.out.println("Good Morning!");
        } else if (hour < 17) {
            System.out.println("Good Afternoon!");
        } else if (hour < 21) {
            System.out.println("Good Evening!");
        } else if (hour <= 23) {
            System.out.println("Good Night!");
        } else {
            System.out.println("Invalid hour entered.");
        }

        // ----------------------------------------------------------------

        // Task 2
        System.out.print("Enter base: ");
        double base = input.nextDouble();

        System.out.print("Enter exponent: ");
        double exponent = input.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // ----------------------------------------------------------------------------------------------

        // Task 3
        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = input.nextInt();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is a rectangle.");
        }

        // -----------------------------------------------------------

        // Task 4
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if (marks > 80) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else if (marks >= 45) {
            System.out.println("Grade: D");
        } else if (marks >= 25) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        // -------------------------------------------------------

        // Task 5
        // Generate a random number between 1 and 25
        // (int)(Math.random() * range) + min
        int randomNumber = (int) (Math.random() * 25) + 1;

        // Convert to ASCII character
        // 65 is 'A', so we add our random number to 64
        char character = (char) (64 + randomNumber);

        System.out.println("Random Number: " + randomNumber);
        System.out.println("Corresponding Character: " + character);

        // ------------------------------------------------------------------------

        // Task 6
        System.out.print("Number of classes held: ");
        double held = input.nextDouble();
        System.out.print("Number of classes attended: ");
        double attended = input.nextDouble();
        double percentage = (attended / held) * 100;
        System.out.println("Percentage of class attended: " + percentage + "%");
        if (percentage >= 75) {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is NOT allowed to sit in the exam.");
        }

        // -------------------------------------------------------------------------------------

        // Task 7
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("The distance between the two points is: " + distance);
        input.close();
    }
}
