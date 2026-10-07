package A1_LeetCode.B_BinarySearch;

import java.util.Arrays;

public class D_LC34 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,7,8,8,10};
        int[] ans=searchRange(nums,8);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int firstOccurence=BS(nums,target,true);
        int secondOccurence=BS(nums,target,false);
        ans[0]=firstOccurence;
        ans[1]=secondOccurence;
        return ans;
    }
    public static int BS(int[] arr,int target,boolean firstIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target < arr[mid]){
                end=mid-1;
            }else if(target > arr[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(firstIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
