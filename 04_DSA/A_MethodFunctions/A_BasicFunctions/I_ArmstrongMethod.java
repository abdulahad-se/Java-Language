package A_MethodFunctions.A_BasicFunctions;

public class I_ArmstrongMethod {
    public static void main(String[] args) {
        int number = 153;
        System.out.println(number + " is Armstrong: " + isArmstrong(number));
    }

    static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return original == sum;
    }
}
