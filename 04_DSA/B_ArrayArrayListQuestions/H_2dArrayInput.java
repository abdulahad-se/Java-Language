package B_ArrayArrayListQuestions;
import java.util.Arrays;
import java.util.Scanner;
public class H_2dArrayInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] numbers=new int[3][3];
        for(int rows=0; rows<numbers.length; rows++){
            for(int col=0; col<numbers[rows].length; col++){
                System.out.print("Enter the number of row :"+ rows+ "and its column :"+ col +" :");
                numbers[rows][col]=input.nextInt();
            }
        }
//        We can write .toString only for 1d arrays .
//        for 2d we use Arrays.deepToString. and we can also print by using loop.
        System.out.println(Arrays.deepToString(numbers));


    }
}
