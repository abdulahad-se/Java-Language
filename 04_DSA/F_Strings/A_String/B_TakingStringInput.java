package F_Strings.A_String;
import java.util.Scanner;
public class B_TakingStringInput {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a name:");
        String name=sc.nextLine();
        System.out.println(name);
    }
}
