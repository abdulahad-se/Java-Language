package D_BinarySearch;

public class A_CodeForBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,23,34};
        System.out.println(binarySearch(arr,34));
    }
    static int binarySearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target < arr[mid]){
                end=mid-1;
            }else{
            start=mid+1;
            }
        }
    return -1;
    }
}
