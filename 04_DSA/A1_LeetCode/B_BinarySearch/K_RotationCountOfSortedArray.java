package A1_LeetCode.B_BinarySearch;

public class K_RotationCountOfSortedArray {
    public static void main(String[] args) {
        int[] arr={2,2,2,7,7,0,1,2};
        System.out.println(rotationCount(arr));
//        System.out.println(rotationCount(arr));
    }
    static int rotationCount(int[] arr){
        int pivot=findPeakInNonDupli(arr);
//            int pivot=findPeakInNonDupli(arr);
        if(pivot == -1){
            return 0;
        }
        return pivot+1;
    }
    static int findPeakInNonDupli(int[] arr){
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
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            start=mid+1;
        }
        return -1;
    }
    static int findPeakInDuplicates(int[] arr){
        int start=0;
        int end=arr.length-1;
        while( start <= end){
            int mid=start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end;
                }
                end--;
            } else if (arr[start]<arr[mid] || arr[mid]==arr[start] && arr[mid]>arr[end]) {
                start=mid+1;
            }
            end=mid-1;
        }
        return -1;
    }
}
