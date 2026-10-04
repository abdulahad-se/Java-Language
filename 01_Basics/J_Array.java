import java.util.Random;

public class J_Array {
    public static void main(String[] args) {
        int[] original = { 12, 45, 3, 67, 23, 89, 5, 34 };

        System.out.println("Original Array");
        printArray(original);

        // Array Copy
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.println("\n---- Manually Copied Array ----");
        printArray(copy);

        // Array Reverse
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[i];
        }
        for (int i = 0; i < reversed.length / 2; i++) {
            int temp = reversed[i];
            reversed[i] = reversed[reversed.length - 1 - i];
            reversed[reversed.length - 1 - i] = temp;
        }
        System.out.println("Manually Reversed Array ");
        printArray(reversed);

        // Manual Sort Ascending (Bubble Sort)
        int[] sortedAsc = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            sortedAsc[i] = original[i];
        }
        for (int i = 0; i < sortedAsc.length - 1; i++) {
            for (int j = 0; j < sortedAsc.length - 1 - i; j++) {
                if (sortedAsc[j] > sortedAsc[j + 1]) {
                    int temp = sortedAsc[j];
                    sortedAsc[j] = sortedAsc[j + 1];
                    sortedAsc[j + 1] = temp;
                }
            }
        }
        System.out.println("Manually Sorted Ascending (Bubble Sort) ");
        printArray(sortedAsc);

        // Sort Descending (Bubble Sort)
        int[] sortedDesc = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            sortedDesc[i] = original[i];
        }
        for (int i = 0; i < sortedDesc.length - 1; i++) {
            for (int j = 0; j < sortedDesc.length - 1 - i; j++) {
                if (sortedDesc[j] < sortedDesc[j + 1]) {
                    int temp = sortedDesc[j];
                    sortedDesc[j] = sortedDesc[j + 1];
                    sortedDesc[j + 1] = temp;
                }
            }
        }
        System.out.println("Manually Sorted Descending (Bubble Sort) ");
        printArray(sortedDesc);

        // Array Shuffle
        int[] shuffled = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            shuffled[i] = original[i];
        }
        Random rand = new Random();
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        System.out.println("Manually Shuffled Array");
        printArray(shuffled);

        // Manual Linear Search
        int target = 67;
        int foundIndex = -1;
        for (int i = 0; i < original.length; i++) {
            if (original[i] == target) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Manual Linear Search for " + target + " ----");
        if (foundIndex != -1) {
            System.out.println(target + " found at index " + foundIndex);
        } else {
            System.out.println(target + " not found");
        }

        // Max and Min
        int max = original[0];
        int min = original[0];
        for (int i = 1; i < original.length; i++) {
            if (original[i] > max)
                max = original[i];
            if (original[i] < min)
                min = original[i];
        }
        System.out.println(" Manual Max and Min ");
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        // Confirm original array untouched
        System.out.println(" Original Array (unchanged, confirmed) ");
        printArray(original);
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
