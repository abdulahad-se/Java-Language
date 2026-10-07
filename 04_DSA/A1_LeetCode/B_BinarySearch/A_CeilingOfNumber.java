package A1_LeetCode.B_BinarySearch;

public class A_CeilingOfNumber {
    public static void main(String[] args) {
        int[] nums={2,3,5,9,14,16,18};
        System.out.println(ceilingOfNumber(nums,15));
    }
    static int ceilingOfNumber(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if (target < arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}
