import bank_account.CalculateInterest;
import bank_account.CalculateSpecialInterest;

public class M_JavaLab {
    public static void main(String[] args) {
        // Task 1: Use a class from the bank_account package.
        CalculateInterest normalInterest = new CalculateInterest();
        System.out.println("Task 1 - Normal interest");
        normalInterest.calculateAmount(2000, 10);

        // Task 2: Use another class from the same package.
        CalculateSpecialInterest specialInterest = new CalculateSpecialInterest();
        System.out.println("\nTask 2 - Special interest");
        specialInterest.calculateAmount(2000, 10);

        // Task 3: Use both imported classes for separate records.
        System.out.println("\nTask 3 - Customer records");
        normalInterest.calculateAmount(1000, 5);
        specialInterest.calculateAmount(2000, 10);
    }
}
