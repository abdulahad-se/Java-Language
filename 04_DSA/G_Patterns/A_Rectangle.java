package G_Patterns;

public class A_Rectangle {
    static void main() {
        int n=5;
        patter1(n);
    }
    static void patter1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
