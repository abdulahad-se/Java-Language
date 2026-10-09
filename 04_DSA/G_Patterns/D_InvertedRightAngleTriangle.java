package G_Patterns;

public class D_InvertedRightAngleTriangle {
    static void main() {
        int n=10;
        pattern4(n);
    }
    static void pattern4(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
