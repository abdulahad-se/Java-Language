package H_Recursion;

public class C_FibonacciSeries {
    static void main() {
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
