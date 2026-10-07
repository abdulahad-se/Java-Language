package A1_LeetCode.B_BinarySearch;

public class B_FloorOfNumber {
    public static void main(String[] args) {
        int[] nums={2,3,5,9,14,16,18};
        System.out.println(floorOfNumber(nums,15));
    }
    static int floorOfNumber(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end;
    }
}
