package A1_LeetCode.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class D_LC442 {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2,2,3};
        List<Integer> ans=findDuplicatesInArray(nums);
        System.out.println(ans);
    }
    static List<Integer> findDuplicatesInArray(int[] nums){
        int i=0;
        while(i < nums.length){
            int correct=nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int index=0; index<nums.length; index++){
            if(nums[index] != index+1 ){
                list.add(nums[index]);
            }
        }
        return list;
    }
    static void swap(int[] arr,int f,int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
