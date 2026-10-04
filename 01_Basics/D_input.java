import java.util.*;

public class D_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1:");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2:");
        int num2 = sc.nextInt();
        System.out.println("The sum of num1 and num2" + (num1 + num2));

        System.out.println("Enter the in1:");
        double in1 = sc.nextDouble();
        System.out.println("Enter the in2");
        double in2 = sc.nextDouble();
        System.out.println("The sum of in1 and in2" + (in1 + in2));

        System.out.print("Enter the character");
        char character = sc.next().charAt(0);
        System.out.println("Character" + character);

        System.out.print("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Name" + name);
    }
}
