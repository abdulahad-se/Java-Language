package bank_account;

public class CalculateInterest {
    public void calculateAmount(double amount, double rate) {
        double interest = amount * rate / 100;
        System.out.println("Interest: " + interest);
        System.out.println("Final amount: " + (amount + interest));
    }
}
