public class I_doWhileloop {
    public static void main(String[] args) {
        // Basic while loop: 1 to 10
        System.out.println("Numbers 1 to 10");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();

        // Reverse counting: 10 to 1
        System.out.println(" Reverse counting (10 to 1)");
        int j = 10;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 1);
        System.out.println();

        // Even numbers using while
        System.out.println("Even numbers (1 to 20) ");
        int k = 2;
        do {
            System.out.print(k + " ");
            k += 2;
        } while (k <= 20);
        System.out.println();

        // Sum of first n natural numbers
        int n = 10;
        int sum = 0;
        int count = 1;
        do {
            sum += count;
            count++;
        } while (count <= n);
        System.out.println("Sum of first " + n + " natural numbers ");
        System.out.println("Sum = " + sum);

        // Factorial using while loop
        int num = 5;
        long factorial = 1;
        int temp = num;
        do {
            factorial *= temp;
            temp--;
        } while (temp >= 1);
        System.out.println("Factorial of " + num + " ----");
        System.out.println("Factorial = " + factorial);

        // Reverse digits of a number
        int original = 12345;
        int reversed = 0;
        int n2 = original;
        do {
            int digit = n2 % 10;
            reversed = reversed * 10 + digit;
            n2 /= 10;
        } while (n2 != 0);
        System.out.println("\n---- Reverse digits of " + original + " ----");
        System.out.println("Reversed = " + reversed);

        // Count digits of a number
        int number = 98765;
        int digitCount = 0;
        int temp2 = number;
        do {
            digitCount++;
            temp2 /= 10;
        } while (temp2 != 0);
        System.out.println("Count digits of " + number + " ----");
        System.out.println("Digit count = " + digitCount);

        // Check if a number is prime
        int primeCandidate = 29;
        boolean isPrime = true;
        int divisor = 2;
        if (primeCandidate <= 1) {
            isPrime = false;
        }
        do {
            if (primeCandidate % divisor == 0) {
                isPrime = false;
            }
            divisor++;
        } while (divisor * divisor <= primeCandidate && isPrime);
        System.out.println(" Prime check for " + primeCandidate + " ----");
        System.out.println(primeCandidate + " is prime? " + isPrime);

        // while loop with break
        System.out.println(" while loop with break (stop at 6)");
        int b = 1;
        while (b <= 10) {
            if (b == 6) {
                break;
            }
            System.out.print(b + " ");
            b++;
        }
        System.out.println();

        // while loop with continue
        System.out.println("\n---- while loop with continue (skip multiples of 3) ----");
        int c = 0;
        while (c < 10) {
            c++;
            if (c % 3 == 0) {
                continue;
            }
            System.out.print(c + " ");
        }
        System.out.println();

        // do-while loop
        System.out.println("\n---- do-while loop (1 to 5) ----");
        int d = 1;
        do {
            System.out.print(d + " ");
            d++;
        } while (d <= 5);
        System.out.println();

        // do-while runs at least once
        System.out.println("\n---- do-while runs at least once (condition false from start) ----");
        int e = 20;
        do {
            System.out.println("This runs once even though e = " + e + " and condition (e <= 10) is false");
        } while (e <= 10);
    }
}
