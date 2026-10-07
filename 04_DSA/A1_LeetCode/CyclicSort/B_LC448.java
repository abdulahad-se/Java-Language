package A1_LeetCode.CyclicSort;
import java.util.ArrayList;
public class B_LC448 {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans=findDissappearedNumber(arr);
        System.out.println(ans);
    }
    static ArrayList<Integer> findDissappearedNumber(int[] nums){
        int i=0;
        while( i < nums.length){
            int correctIndex=nums[i]-1;
            if( nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int index=0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
