package G_Patterns;

public class J_NumberPatternWithSymmetry {
    static void main() {
        pattern10(4);
    }
    static void pattern10(int n){
        n=2*n;
        for(int row=0; row<=n; row++){
            for(int col=0; col<=n; col++){
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
