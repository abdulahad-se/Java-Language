
// Task 1.
import java.util.*;

public class A_JavaLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = sc.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters.");

        // ---------------------------------------------------------------------------------

        // Task 2

        System.out.print("Input the number of days: ");
        int totalDays = sc.nextInt();
        int months = totalDays / 30;
        int remainingDays = totalDays % 30;
        System.out.println(totalDays + " days are " + months + " months and " + remainingDays + " days.");

        // ----------------------------------------------------------------------------------------------------------------

        // Task 3

        System.out.print("Input weight in pounds: ");
        double weightPounds = sc.nextDouble();
        System.out.print("Input height in inches: ");
        double heightInches = sc.nextDouble();
        double weightKG = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;
        double BMI = weightKG / (heightMeters * heightMeters);
        System.out.println("Body Mass Index (BMI) is " + BMI);

        // ---------------------------------------------------------------------

        // Task 4

        System.out.print("Enter your Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter your Father's Name: ");
        String fatherName = sc.nextLine();
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter your Department: ");
        String department = sc.nextLine();
        System.out.print("Enter your Email ID: ");
        String email = sc.nextLine();
        System.out.println("Hello " + name + "! Welcome.");
        System.out.println("BIO-DATA RESULTS:");
        System.out.println("Name: " + name);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Email ID: " + email);

        // -----------------------------------------------------------------

        // Task 5

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);

        // --------------------------------------------------------------

        // Task 6

        System.out.print("Enter a three-digit number: ");
        int number = sc.nextInt();
        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;
        int sumed = firstDigit + secondDigit + thirdDigit;
        System.out.println(firstDigit + " + " + secondDigit + " + " + thirdDigit + " = " + sumed);
        sc.close();
    }
}
