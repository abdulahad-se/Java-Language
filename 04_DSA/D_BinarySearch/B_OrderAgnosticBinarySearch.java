package D_BinarySearch;

public class B_OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={20,18,17,15,12,10,9,3,1,0};
        System.out.println(orderAgnosticBs(arr,10));
    }
    static int orderAgnosticBs(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target< arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
