import java.util.Arrays;
import java.util.Scanner;

public class E_JavaLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Calculate the average of an array.
        int[] numbers = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Task 1 - Average: " + (double) sum / numbers.length);

        // Task 2: Reverse an array manually.
        int[] reversed = { 1, 2, 3, 4, 5 };
        for (int start = 0, end = reversed.length - 1; start < end;
                start++, end--) {
            int temporary = reversed[start];
            reversed[start] = reversed[end];
            reversed[end] = temporary;
        }
        System.out.println("Task 2 - Reversed array: "
                + Arrays.toString(reversed));

        // Task 3: Sort numeric and string arrays.
        int[] numericValues = { 50, 10, 40, 20, 30 };
        String[] textValues = { "Banana", "Apple", "Orange", "Mango" };
        Arrays.sort(numericValues);
        Arrays.sort(textValues);
        System.out.println("Task 3 - Sorted numbers: "
                + Arrays.toString(numericValues));
        System.out.println("Task 3 - Sorted strings: "
                + Arrays.toString(textValues));

        // Task 4: Store random monthly values and calculate their average.
        String[] months = { "January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November",
                "December" };
        double monthlySum = 0;
        for (String month : months) {
            double value = Math.random() * 100;
            monthlySum += value;
            System.out.printf("%s: %.2f%n", month, value);
        }
        System.out.printf("Task 4 - Monthly average: %.2f%n",
                monthlySum / months.length);

        // Task 5: Find the first non-repeated character.
        String input = "swiss";
        int[] frequency = new int[256];
        for (int index = 0; index < input.length(); index++) {
            frequency[input.charAt(index)]++;
        }
        char firstUnique = '\0';
        for (int index = 0; index < input.length(); index++) {
            if (frequency[input.charAt(index)] == 1) {
                firstUnique = input.charAt(index);
                break;
            }
        }
        System.out.println("Task 5 - First non-repeated character: "
                + (firstUnique == '\0' ? "None" : firstUnique));

        // Task 6: Print a Fibonacci series.
        int first = 0;
        int second = 1;
        System.out.print("Task 6 - Fibonacci series: ");
        for (int count = 1; count <= 10; count++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        // Task 7: Search for a character in a string.
        String sentence = "Object oriented programming";
        System.out.print("Enter a character to search: ");
        char target = scanner.next().charAt(0);
        int foundIndex = -1;
        for (int index = 0; index < sentence.length(); index++) {
            if (sentence.charAt(index) == target) {
                foundIndex = index;
                break;
            }
        }
        if (foundIndex >= 0) {
            System.out.println("Task 7 - Character found at index " + foundIndex);
        } else {
            System.out.println("Task 7 - Character not found");
        }

        scanner.close();
    }
}
