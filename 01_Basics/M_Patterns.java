import java.util.Scanner;

public class M_Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the pattern size: ");
        int size = scanner.nextInt();

        System.out.println("\nRight triangle");
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nInverted triangle");
        for (int row = size; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nNumber pyramid");
        for (int row = 1; row <= size; row++) {
            for (int space = 1; space <= size - row; space++) {
                System.out.print("  ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

        System.out.println("\nDiamond");
        for (int row = 1; row <= size; row++) {
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= 2 * row - 1; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = size - 1; row >= 1; row--) {
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= 2 * row - 1; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
