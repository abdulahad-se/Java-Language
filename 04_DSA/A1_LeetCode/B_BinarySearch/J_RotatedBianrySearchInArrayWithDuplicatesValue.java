package A1_LeetCode.B_BinarySearch;

public class J_RotatedBianrySearchInArrayWithDuplicatesValue {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,9};
        System.out.println(search(arr,2));
    }
    static int search(int[] arr,int target){
        int pivot=findpivot(arr);
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static  int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target < nums[mid]){
                end=mid-1;
            }else
                start=mid+1;
        }
        return -1;
    }
    static  int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return end;
                }
                end--;
            } else if (arr[start]<arr[mid] || arr[mid]==arr[start] && arr[mid]>arr[end] ) {
                start=mid+1;
            }else
                end=mid-1;
        }
        return -1;
    }
}
