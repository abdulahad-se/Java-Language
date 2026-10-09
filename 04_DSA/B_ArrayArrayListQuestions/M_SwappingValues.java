package B_ArrayArrayListQuestions;

import java.util.Arrays;

public class M_SwappingValues {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,4,3};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
