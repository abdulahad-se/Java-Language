public class O_TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] marks = {
            { 78, 85, 90 },
            { 66, 72, 81 },
            { 92, 88, 95 }
        };

        int total = 0;
        int largest = marks[0][0];

        System.out.println("Two-dimensional array:");
        for (int row = 0; row < marks.length; row++) {
            int rowTotal = 0;
            for (int column = 0; column < marks[row].length; column++) {
                System.out.print(marks[row][column] + " ");
                total += marks[row][column];
                rowTotal += marks[row][column];
                if (marks[row][column] > largest) {
                    largest = marks[row][column];
                }
            }
            System.out.println("| Row total = " + rowTotal);
        }

        System.out.println("Total = " + total);
        System.out.println("Average = " + (double) total / (marks.length * marks[0].length));
        System.out.println("Largest value = " + largest);
    }
}
