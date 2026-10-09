import java.util.Random;

public class F_JavaLab {
    public static void main(String[] args) {
        int[][] numbers = {
            { 12, 7, 19, 4 },
            { 25, 10, 3, 18 },
            { 6, 21, 14, 9 }
        };

        System.out.println("2D ARRAY JAVA LAB");
        System.out.println("=================");

        // Task 1: Display all elements of a 2D array.
        System.out.println("\nTask 1 - print a 2D array");
        printMatrix(numbers);

        // Task 2: Calculate the total and average of all elements.
        System.out.println("\nTask 2 - total and average");
        System.out.println("Total = " + total(numbers));
        System.out.printf("Average = %.2f%n", average(numbers));

        // Task 3: Find the largest and smallest elements.
        System.out.println("\nTask 3 - find minimum and maximum");
        System.out.println("Smallest = " + minimum(numbers));
        System.out.println("Largest = " + maximum(numbers));

        // Task 4: Calculate the total of each row.
        System.out.println("\nTask 4 - row totals");
        printRowTotals(numbers);

        // Task 5: Calculate the total of each column.
        System.out.println("\nTask 5 - column totals");
        printColumnTotals(numbers);

        // Task 6: Search for a value and return its row and column.
        System.out.println("\nTask 6 - search for a value");
        int[] position = search(numbers, 18);
        if (position[0] == -1) {
            System.out.println("Value was not found.");
        } else {
            System.out.println("18 found at row " + position[0]
                    + ", column " + position[1]);
        }

        // Task 7: Create and display the transpose of the matrix.
        System.out.println("\nTask 7 - transpose the array");
        printMatrix(transpose(numbers));

        // Task 8: Sort every row in ascending order.
        System.out.println("\nTask 8 - sort every row");
        int[][] rowsToSort = {
            { 9, 2, 7, 4 },
            { 16, 5, 12, 1 },
            { 8, 15, 3, 11 }
        };
        sortRows(rowsToSort);
        printMatrix(rowsToSort);

        // Task 9: Shuffle all values while keeping the same matrix shape.
        System.out.println("\nTask 9 - shuffle the array");
        shuffle(numbers, new Random());
        printMatrix(numbers);
    }

    // Task 1
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }

    // Task 2
    public static int total(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    public static double average(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            count += row.length;
        }
        return count == 0 ? 0 : (double) total(matrix) / count;
    }

    // Task 3
    public static int minimum(int[][] matrix) {
        int result = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < result) {
                    result = value;
                }
            }
        }
        return result;
    }

    public static int maximum(int[][] matrix) {
        int result = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > result) {
                    result = value;
                }
            }
        }
        return result;
    }

    // Task 4
    public static void printRowTotals(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int value : matrix[row]) {
                sum += value;
            }
            System.out.println("Row " + row + " total = " + sum);
        }
    }

    // Task 5
    public static void printColumnTotals(int[][] matrix) {
        for (int column = 0; column < matrix[0].length; column++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][column];
            }
            System.out.println("Column " + column + " total = " + sum);
        }
    }

    // Task 6
    public static int[] search(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == target) {
                    return new int[] { row, column };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // Task 7
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                result[column][row] = matrix[row][column];
            }
        }
        return result;
    }

    // Task 8
    public static void sortRows(int[][] matrix) {
        for (int[] row : matrix) {
            for (int current = 0; current < row.length - 1; current++) {
                for (int next = current + 1; next < row.length; next++) {
                    if (row[current] > row[next]) {
                        int temporary = row[current];
                        row[current] = row[next];
                        row[next] = temporary;
                    }
                }
            }
        }
    }

    // Task 9
    public static void shuffle(int[][] matrix, Random random) {
        int totalValues = countValues(matrix);
        for (int current = totalValues - 1; current > 0; current--) {
            int selected = random.nextInt(current + 1);
            int[] currentPosition = positionOf(matrix, current);
            int[] selectedPosition = positionOf(matrix, selected);

            int temporary = matrix[currentPosition[0]][currentPosition[1]];
            matrix[currentPosition[0]][currentPosition[1]]
                    = matrix[selectedPosition[0]][selectedPosition[1]];
            matrix[selectedPosition[0]][selectedPosition[1]] = temporary;
        }
    }

    private static int countValues(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            count += row.length;
        }
        return count;
    }

    private static int[] positionOf(int[][] matrix, int flatIndex) {
        for (int row = 0; row < matrix.length; row++) {
            if (flatIndex < matrix[row].length) {
                return new int[] { row, flatIndex };
            }
            flatIndex -= matrix[row].length;
        }
        return new int[] { -1, -1 };
    }
}
