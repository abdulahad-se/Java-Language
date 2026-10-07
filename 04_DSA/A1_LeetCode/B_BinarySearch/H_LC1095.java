package A1_LeetCode.B_BinarySearch;

public class H_LC1095 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,0};
        System.out.println(searchInMountain(arr,0));

    }
    static int searchInMountain(int[] arr,int target){
        int peak=findPeakInMountain(arr);
        int first=orderAgnosticBinarySearch(arr,target,0,peak);
        if(first!=-1){
            return first;
        }
        return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }
    static int findPeakInMountain(int[] arr){
        int start=0;
        int end=arr.length-1;
        while( start < end){
            int mid= start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end=mid;
            }else
                start=mid+1;
        }
        return start;
    }
    static int orderAgnosticBinarySearch(int[] arr, int target , int start,int end){
        boolean isAsc=arr[start]<arr[end];
        while(start <= end){
            int mid=start+(end-start)/2;
            if(isAsc){
                if(target==arr[mid]){
                    return mid;
                }
                if(target < arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else{
                if(target==arr[mid]){
                    return mid;
                }
                if(target > arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
