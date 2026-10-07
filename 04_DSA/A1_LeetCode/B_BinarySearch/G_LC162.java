package A1_LeetCode.B_BinarySearch;

public class G_LC162 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,5,4,3,2};
        System.out.println(findpeak(arr));
    }

    private static int findpeak(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start < end){
           int mid=start+(end-start)/2;
           if(arr[mid] > arr[mid+1]){
               end=mid;
           }else
               start=mid+1;
        }
        return end;
    }
}
