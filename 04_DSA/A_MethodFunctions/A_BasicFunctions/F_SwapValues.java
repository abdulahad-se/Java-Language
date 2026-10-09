package A_MethodFunctions.A_BasicFunctions;

public class F_SwapValues {
    public static void main(String[] args) {
        int first = 10;
        int second = 20;

        System.out.println("Before swapping: " + first + ", " + second);
        printSwappedValues(first, second);
    }

    static void printSwappedValues(int first, int second) {
        int temporary = first;
        first = second;
        second = temporary;
        System.out.println("Inside method: " + first + ", " + second);
        System.out.println("Java passes primitive values by value.");
    }
}
