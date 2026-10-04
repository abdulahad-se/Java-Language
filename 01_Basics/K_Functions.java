public class K_Functions {
   public static void fibonacciSeries(int n){
       int a=0,b=1;
       for(int i=1; i<=n; i++){
           if(i%3==0){
               continue;
           }
           System.out.print(a+",");
           int c=a+b;
           a=b;
           b=c;
       }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        fibonacciSeries(n);
    }

    public static void counterNumber(int n) {
        int positive = 0, negative = 0, zeros = 0;
        for (int num = -10; num <= n; num++) {
            if (num > 0) {
                positive++;
                System.out.println("The positive numbers are" + positive);

            } else if (num < 0) {
                negative++;
                System.out.println("the negative numbers are" + negative);

            } else {
                zeros++;
                System.out.println("The zeros are" + zeros);

            }
        }

    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        counterNumber(n);

    }

    public static String eligibleAge(int age) {
        if (age > 18) {
            return "Eligible to vote";
        } else {
            return "Not eligible to vote";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(eligibleAge(age));
    }

    public static void circumferenceRadius(double radius) {
        double c = 2 * 3.14 * radius;
        System.out.println("The value of circumference is " + c);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int radius = sc.nextInt();
        circumferenceRadius(radius);

    }

    public static int greaterNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;

        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The max number is " + greaterNumber(a, b));
    }

    public static int printOddSum(int n, int sum) {

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("The sum off odd number is" + printOddSum(n, sum));

    }

    public static int printAverage(int a, int b, int c) {
        int avg = (int) (a + b + c) / 3;
        return avg;

    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average is" + printAverage(a, b, c));

    }

    public static int numberFact(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;

        }

        return fact;

    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Teh fact is " + numberFact(n));

    }

    public static int printSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum is" + printSum(a, b));
    }

}