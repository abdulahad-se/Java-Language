package G_Patterns;

public class G_HalfAlignedDiamond {
    static void main() {
        pattern7(5);
    }
    static void pattern7(int n){
        for(int row=0; row<2*n; row++){
            int colInRows=row>n ? 2*n-row:row;
            int totalspaces=n-colInRows;
            for(int spaces=0; spaces<totalspaces; spaces++){
                System.out.print(" ");
            }
            for(int col=0; col<colInRows; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
