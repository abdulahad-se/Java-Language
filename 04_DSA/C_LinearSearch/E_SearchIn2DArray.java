package C_LinearSearch;

import java.util.Arrays;

public class E_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] numbers={
                {1,2,3,4},
                {12,23,34,45},
                {32,43,46,56}
        };
        int[] ans=search2D(numbers,34);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2D(int[][] num,int target){
        if(num.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0; row<num.length; row++){
            for(int col=0; col<num[row].length; col++){
                if(num[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
