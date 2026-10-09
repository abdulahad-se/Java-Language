package G_Patterns;

public class E_InvertedRightAlignedTriangle {
    static void main() {
        int n=10;
        pattern5(n);
    }
    static void pattern5(int n){
        for(int i=n; i>=1; i--){
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
