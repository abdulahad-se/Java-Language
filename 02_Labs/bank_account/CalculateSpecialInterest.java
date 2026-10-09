package bank_account;

public class CalculateSpecialInterest {
    public void calculateAmount(double amount, double rate) {
        double interest = amount * rate / 100;
        double finalAmount = amount + interest + 100;
        System.out.println("Interest: " + interest);
        System.out.println("Final amount with bonus: " + finalAmount);
    }
}
