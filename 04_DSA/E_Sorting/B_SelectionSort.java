package E_Sorting;

import java.util.Arrays;

public class B_SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,4,3,6,5,1,11,12,14,13,23,20,21};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        for(int i=0; i < arr.length; i++){
            int last=arr.length-i-1;
            int maxIndex=max(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int max(int[] arr,int s,int e) {
        int max=s;
        for(int i=0; i <= e; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}

