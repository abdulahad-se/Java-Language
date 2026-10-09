package G_Patterns;

public class C_RightAlignedTriangle {
    static void main() {
        int n=7;
        pattern3(n);
    }
    static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
