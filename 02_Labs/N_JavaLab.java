import java.util.Scanner;

public class N_JavaLab {
    public static void main(String[] args) {
        // Task 1: Handle an array index exception.
        System.out.println("Task 1 - Array exception");
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array index does not exist.");
        } finally {
            System.out.println("Finally block executed.");
        }

        // Task 2: Handle arithmetic and argument exceptions.
        System.out.println("\nTask 2 - Built-in exceptions");
        try {
            int firstNumber = 10;
            int secondNumber = 0;
            System.out.println(firstNumber / secondNumber);
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        }

        try {
            withdrawAmount(5000);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        // Task 3: Custom checked exception for age validation.
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nTask 3 - Custom age exception");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            CinemaHall.checkAge(age);
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }

        // Task 4: Custom checked exception for deposits.
        System.out.println("\nTask 4 - Custom deposit exception");
        try {
            processDeposit(5000);
        } catch (InvalidDepositException exception) {
            System.out.println(exception.getMessage());
        }

        // Task 5: Validate voter registration.
        System.out.println("\nTask 5 - Voter registration");
        try {
            registerVoter("Abdul Ahad", age);
        } catch (AgeOutOfRangeException exception) {
            System.out.println(exception.getMessage());
        }

        scanner.close();
    }

    public static void withdrawAmount(int amount) {
        if (amount < 10000) {
            throw new IllegalArgumentException(
                    "At least 10000 is required for withdrawal.");
        }
        System.out.println("Amount withdrawn successfully.");
    }

    public static void processDeposit(int amount) throws InvalidDepositException {
        if (amount < 1000 || amount > 50000) {
            throw new InvalidDepositException(
                    "Deposit must be between 1000 and 50000.");
        }
        System.out.println("Money deposited successfully.");
    }

    public static void registerVoter(String name, int age)
            throws AgeOutOfRangeException {
        if (age < 18 || age > 120) {
            throw new AgeOutOfRangeException(
                    "Age must be between 18 and 120.");
        }
        System.out.println("Registration successful for " + name + ".");
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class CinemaHall {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                    "You must be 18 years old to enter the cinema hall.");
        }
        System.out.println("Enjoy your movie.");
    }
}

class InvalidDepositException extends Exception {
    InvalidDepositException(String message) {
        super(message);
    }
}

class AgeOutOfRangeException extends Exception {
    AgeOutOfRangeException(String message) {
        super(message);
    }
}
