package A1_LeetCode.CyclicSort;

public class F_LC41 {
    public static void main(String[] args) {
    int[] nums={1,2};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums){
        int i=0;
        while(i < nums.length){
                int correctIndex=nums[i]-1;
                if (nums[i] > 0 && nums[i] <nums.length && nums[i] != nums[correctIndex]){
                    swap(nums,i,correctIndex);
                }else {
                    i++;
                }
        }
        for(int index=0; index<nums.length; index++){
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[] num,int a,int b){
        int temp=num[a];
        num[a]=num[b];
        num[b]=temp;
    }
}
