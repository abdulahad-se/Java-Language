package B_ArrayArrayListQuestions;

public class G_2DArray {
    public static void main(String[] args) {
        int[][] nums2d = {
                {1,2,3,4},
                {4,5,6,7},
                {8,9,10,11}
        };
        for(int row=0; row< nums2d.length; row++){
            for(int column=0; column < nums2d[row].length;column++){
                System.out.print(nums2d[row][column]+ " ");
            }
        }
    }
}
