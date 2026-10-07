package A1_LeetCode.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class C_LC287 {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
        int ans=findDuplicates(nums);
        System.out.println(ans);
    }
    static int findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i] != i+1){
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                 }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr,int f,int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

}
