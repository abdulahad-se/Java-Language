package A_MethodFunctions.A_BasicFunctions;

public class H_PrimeMethod {
    public static void main(String[] args) {
        for (int number = 0; number <= 20; number++) {
            System.out.println(number + " is prime: " + isPrime(number));
        }
    }

    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
