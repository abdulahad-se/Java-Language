package A1_LeetCode.B_BinarySearch;

public class I_LC33 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
    static int search(int[] nums,int target){
        int pivot=findpeak(nums);
        if(pivot==-1){
           return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);

    }
    static int findpeak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while( start <= end){
            int mid=start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid=start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end=mid-1;
            }else
                start=mid+1;
        }
        return -1;
    }
}
