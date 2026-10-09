package B_ArrayArrayListQuestions;
import java.util.Arrays;
public class P_ReverseAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString((arr)));
    }
    static void reverse(int[] arr,int start,int end ){
       while(start < end){
           swap(arr,start,end);
           start++;
           end--;
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
