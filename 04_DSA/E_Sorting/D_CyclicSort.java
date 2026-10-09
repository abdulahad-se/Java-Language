package E_Sorting;

import java.util.Arrays;

public class D_CyclicSort {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,6,5,7,10,8,9};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
    }
    static  void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
