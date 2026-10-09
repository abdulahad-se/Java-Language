package E_Sorting;

import java.util.Arrays;

public class C_InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,4,3,6,5,1,11,12,14,13,23,20,21};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    static void insertionSort2(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
