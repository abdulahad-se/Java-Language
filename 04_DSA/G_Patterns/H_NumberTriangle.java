package G_Patterns;

public class H_NumberTriangle {
    static void main() {
        pattern8(7);
    }
    static void pattern8(int n){
        for(int row=1; row<=n; row++){
            for(int spaces=0; spaces<n-row; spaces++){
                System.out.print(" ");
            }
            for(int col=row; col>=1; col--){
                System.out.print(col);
            }
            for(int col=2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
