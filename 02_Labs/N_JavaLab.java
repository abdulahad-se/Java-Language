public class N_JavaLab {

    // Task 1
    public class Example1 {
        public static void main(String[] args) {
            try {
                int[] numbers = { 1, 2, 3 };
                System.out.println(numbers[4]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds");
            } finally {
                System.out.println("Finally block executed");
            }
        }
    }

    // -----------------------------------------------------------------------

    // Task 2
    public class Example2 {
        public static void main(String[] args) {
            try {
                int a = 10;
                int b = 0;
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            } finally {
                System.out.println("Finally block executed");
            }
        }
    }

    // -----------------------------------------------------------------------

    // Task 3
    public class Example3 {
    public static void withdrawamount(int amount)throws IllegalArgumentException{
    if(amount<10000){
    throw new IllegalArgumentException("You are unable to get the requested
    withdraw amount.");
    }else{
    System.out.println("Amount Successfull Withdraws");
    }
    }

        public static void main(String[] args) {
            try {
                Example3.withdrawamount(20000);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Inside finally block");
            }
        }
    }

    // ---------------------------------------------------------------------

    // Task 4
    public class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }

        // }
        public class CinemaHall {
    public static void checkage(int age)throws InvalidAgeException{
    if(age<18){
    throw new InvalidAgeException("Not eligible: You must be 18 years old to
    enter the cinema Hall");
    }else{
    System.out.println("Enjoy your movie");
    }
    }

            public static void main(String[] args) {
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int age = sc.nextInt();
                try {
                    CinemaHall.checkage(age);
                } catch (InvalidAgeException e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("This block always run");
                }
            }
        }

        // -------------------------------------------------------------------

        // Task 5
        public class InvalidDepositException extends Exception {
            public InvalidDepositException(String message) {
                super(message);
            }
        }

        public class Deposit {
            public static void processdeposit(int amount) throws InvalidDepositException {
                if (amount < 1000 || amount > 50000) {
                    throw new InvalidDepositException("error");
                } else {
                    System.out.println("Money deposited");
                }
            }

            public static void main(String[] args) {
                java.util.Scanner sc = new java.util.Scanner(System.in);
                int amount = sc.nextInt();
                try {
                    Deposit.processdeposit(amount);
                } catch (InvalidDepositException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        // -------------------------------------------------------------------------

        // Task 6
        public class AgeOutOfRangeException extends Exception {
            private String error;

            public AgeOutOfRangeException(String message) {
                super(message);
                this.error = message;
            }

            public String toString() {
                return "AgeOutOfRangeException:" + this.error;
            }
        }

        public class Voter {
            public static void registervoter(String name, int age) throws AgeOutOfRangeException {
                if (age < 18 || age > 120) {
                    throw new AgeOutOfRangeException("Age must between 18 and 120");
                } else {
                    System.out.println("Registration Successful for:" + name);
                }
            }
        }

        public class Main {
            public static void main(String[] args) {
                java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.print("Enter your name:");
                String name = sc.nextLine();
                System.out.print("Enter your age :");
                int age = sc.nextInt();
                try {
                    Voter.registervoter(name, age);
                } catch (AgeOutOfRangeException e) {
                    System.out.println(e);
                }
            }
        }

}
