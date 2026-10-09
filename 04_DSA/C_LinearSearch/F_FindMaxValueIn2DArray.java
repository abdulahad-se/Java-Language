package C_LinearSearch;

import java.util.Arrays;

public class F_FindMaxValueIn2DArray {
    public static void main(String[] args) {
        int[][] numbers={
                {10,2,39,40},
                {12,113,34,45},
                {12,43,960,56}
        };
        int ans=findMaxIn2D(numbers);
        System.out.println(ans);
    }
    static int findMaxIn2D(int[][] nums){
        if(nums.length==0){
            return -1;
        }
        int max=nums[0][0];
        for(int row=0; row<nums.length; row++){
            for(int col=0; col<nums[row].length; col++){
                if(nums[row][col]>max){
                    max=nums[row][col];
                }
            }
        }
        return max;
    }
}
