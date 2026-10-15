package H_Recursion;

public class D_BinarySearch {
    static void main() {
        int[] arr={1,2,3,4,55,66,78};
        System.out.println(binarysearch(arr,78,0,arr.length-1));
    }
    static int binarysearch(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
            return binarysearch(arr,target,s,mid-1);
        }
        return binarysearch(arr,target,mid+1,e);
    }
}
