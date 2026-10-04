public class M_JavaLab {

    // Packages

    // Tasks

    // package bank_account;
    public class Calculate_interest {
        public void calculateAmount(double amount, double rate) {
            double interestAmount = (amount * rate) / 100;
            System.out.println("The amount after interest amount" + interestAmount);
        }
    }

    // package bank_account;
    public class Calculate_Special_interest {
        public void calculateAmount(double amount, double rate) {
            double specialinterest = (amount * rate / 100) + 100;
            System.out.println("The amount after special interest is" + specialinterest);
        }

    }

    // package bank_account;
    public class showbank {
        public static void main(String[] args) {
            Calculate_interest calculateinterest = new Calculate_interest();
            Calculate_Special_interest calculatespecialinterest = new Calculate_Special_interest();
            calculateinterest.calculateAmount(2000, 1000);
            calculatespecialinterest.calculateAmount(20000, 1020);
        }
    }

    // import bank_account.*;
    public class CalculationRecord {
        public static void main(String[] args) {
            Calculate_interest customer = new Calculate_interest();
            customer.calculateAmount(1000, 5);
            Calculate_Special_interest employee = new Calculate_Special_interest();
            employee.calculateAmount(200, 10);
        }
    }

}
