package B_ArrayArrayListQuestions;
import java.util.ArrayList;
import java.util.Scanner;
public class K_InputArrayList {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> number=new ArrayList<>();
       for(int i=0; i<5; i++){
           System.out.print("Enter the number on index:" +i+ " :");
           number.add(input.nextInt());
       }
       for(int i=0; i<number.size(); i++){
           System.out.println(number.get(i));
       }

    }
}
