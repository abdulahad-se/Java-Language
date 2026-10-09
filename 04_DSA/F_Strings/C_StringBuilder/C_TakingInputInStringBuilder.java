package F_Strings.C_StringBuilder;

import java.util.Scanner;

public class C_TakingInputInStringBuilder {
    static void main() {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        System.out.print("enter you name :");
        sb.append(sc.nextLine());
        System.out.print("enter your age :");
        sb.append(sc.nextLine());
    }
}
