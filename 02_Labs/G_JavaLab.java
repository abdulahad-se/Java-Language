public class G_JavaLab {
    public static void main(String[] args) {
        System.out.println("FUNCTIONS JAVA LAB");
        System.out.println("==================");

        // Task 1: A basic void method.
        System.out.println("\nTask 1 - void method");
        printWelcome();

        // Task 2: A method that receives arguments and returns a value.
        System.out.println("\nTask 2 - return method");
        System.out.println("Square of 6 = " + square(6));

        // Task 3: A method with multiple parameters.
        System.out.println("\nTask 3 - multiple parameters");
        System.out.println("Largest number = " + findLargest(18, 25, 21));

        // Task 4: Passing a one-dimensional array to a void method.
        int[] marks = { 72, 85, 91, 68, 79 };
        System.out.println("\nTask 4 - passing a 1D array");
        printArray(marks);

        // Task 5: Passing a one-dimensional array and returning a result.
        System.out.println("\nTask 5 - sum of a 1D array");
        System.out.println("Total = " + calculateTotal(marks));

        // Task 6: Returning the average of the values in an array.
        System.out.println("\nTask 6 - average of a 1D array");
        System.out.printf("Average = %.2f%n", calculateAverage(marks));

        // Task 7: Searching a one-dimensional array.
        System.out.println("\nTask 7 - search a 1D array");
        int foundIndex = search(marks, 91);
        System.out.println("91 found at index " + foundIndex);

        // Task 8: Passing and displaying a two-dimensional array.
        int[][] scores = {
            { 80, 75, 90 },
            { 65, 88, 72 },
            { 91, 84, 95 }
        };
        System.out.println("\nTask 8 - passing a 2D array");
        printMatrix(scores);

        // Task 9: Returning a calculated value from a two-dimensional array.
        System.out.println("\nTask 9 - 2D array diagonal sum");
        System.out.println("Diagonal sum = " + diagonalSum(scores));
    }

    // Task 1
    public static void printWelcome() {
        System.out.println("Welcome to the Java functions lab!");
    }

    // Task 2
    public static int square(int number) {
        return number * number;
    }

    // Task 3
    public static int findLargest(int first, int second, int third) {
        int largest = first;
        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }
        return largest;
    }

    // Task 4
    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Task 5
    public static int calculateTotal(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // Task 6
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        return (double) calculateTotal(numbers) / numbers.length;
    }

    // Task 7
    public static int search(int[] numbers, int target) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                return index;
            }
        }
        return -1;
    }

    // Task 8
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Task 9
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        int diagonalLength = Math.min(matrix.length, matrix[0].length);
        for (int index = 0; index < diagonalLength; index++) {
            sum += matrix[index][index];
        }
        return sum;
    }
}
