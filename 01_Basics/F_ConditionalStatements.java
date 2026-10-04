import java.util.*;

class F_ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Simple if
        System.out.println("Simple if");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // if-else
        System.out.println("if-else");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        // if-else if-else ladder
        System.out.println("if-else if-else ladder");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Nested if
        System.out.println("Nested if");
        int number = sc.nextInt();
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is Positive and Even");
            } else {
                System.out.println(number + " is Positive and Odd");
            }
        } else {
            System.out.println(number + " is Negative or Zero");
        }

        // switch statement
        System.out.println("switch statement");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // switch expression (modern style, Java 14+)
        System.out.println("switch expression (modern)");
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("Day name: " + dayName);

        // Ternary Operators
        int numbers = 15;

        // Example 1: Check if number is even or odd
        String type = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + type);

        // Example 2: Check pass/fail status
        int score = 72;
        String status = (score >= 50) ? "Passed" : "Failed";
        System.out.println("Status: " + status);

        // Example 3: Find the maximum of two numbers
        int a = 20, b = 35;
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);

        sc.close();
    }
}
