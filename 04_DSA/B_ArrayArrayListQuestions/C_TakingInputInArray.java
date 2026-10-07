package B_ArrayArrayListQuestions;
import java.util.Scanner;
public class C_TakingInputInArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] nums=new int[5];
        for(int i=0; i<nums.length; i++){
            System.out.print("Enter the number :" +i+" :");
            nums[i]=input.nextInt();
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]+ " ");
        }
    }
}
