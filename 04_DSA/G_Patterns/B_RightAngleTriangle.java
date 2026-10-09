package G_Patterns;

public class B_RightAngleTriangle {
    static void main() {
        int n=10;
        pattern2(n);
    }
    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
