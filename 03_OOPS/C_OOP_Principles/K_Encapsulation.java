package C_OOP_Principles;
/*
 * Encapsulation
 * -------------
 * Encapsulation means wrapping the data (fields) and the methods that work
 * on that data together inside one class.
 *
 * Data hiding:
 * The fields are made private, so nobody outside can change them directly.
 * Outside code can only use public methods (getters / setters), and those
 * methods can check the data before changing it.
 * This keeps the data safe and valid.
 */
public class K_Encapsulation {
    static class Account {
        private String owner;               // hidden from outside
        private double balance;             // hidden from outside

        Account(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }

        double getBalance() {               // getter: read access
            return balance;
        }

        void deposit(double amount) {       // controlled change with validation
            if (amount > 0) {
                balance += amount;
            } else {
                System.out.println("Invalid amount");
            }
        }
    }

    public static void main(String[] args) {
        Account a = new Account("Ali", 1000);

        a.deposit(500);
        System.out.println(a.getBalance()); // 1500.0

        a.deposit(-10);                     // Invalid amount

        // a.balance = 1000000;             // compile error: balance is private
    }
}