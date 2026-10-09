package G_Patterns;

public class F_HalfDiamond {
    static void main() {
        int n=5;
        pattern6(n);
    }
    static void pattern6(int n){
        for(int row=1; row<=2*n; row++){
            int col=row>n ? 2*n-row:row;
            for(int c=1; c<=col; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
