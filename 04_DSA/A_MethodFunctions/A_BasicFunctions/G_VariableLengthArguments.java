package A_MethodFunctions.A_BasicFunctions;

public class G_VariableLengthArguments {
    public static void main(String[] args) {
        // Question 1: Find the sum of any number of integers.
        System.out.println("Question 1 - Sum: " + sum(1, 2, 3, 4, 5));

        // Question 2: Find the largest value from any number of integers.
        System.out.println("Question 2 - Largest: " + largest(12, 45, 7, 89, 23));

        // Question 3: Find the average of any number of decimal values.
        System.out.printf("Question 3 - Average: %.2f%n",
                average(10.5, 20.0, 15.5, 24.0));

        // Question 4: Count the even and odd values.
        int[] counts = countEvenAndOdd(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("Question 4 - Even values: " + counts[0]);
        System.out.println("Question 4 - Odd values: " + counts[1]);

        // Question 5: Join any number of words into one sentence.
        System.out.println("Question 5 - Sentence: "
                + joinWords("Java", "varargs", "make", "methods", "flexible"));
    }

    static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    static int largest(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required.");
        }

        int result = numbers[0];
        for (int number : numbers) {
            if (number > result) {
                result = number;
            }
        }
        return result;
    }

    static double average(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required.");
        }

        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }

    static int[] countEvenAndOdd(int... numbers) {
        int even = 0;
        int odd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[] { even, odd };
    }

    static String joinWords(String... words) {
        StringBuilder sentence = new StringBuilder();
        for (int index = 0; index < words.length; index++) {
            sentence.append(words[index]);
            if (index < words.length - 1) {
                sentence.append(" ");
            }
        }
        return sentence.toString();
    }
}
