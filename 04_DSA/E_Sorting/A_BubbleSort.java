package E_Sorting;

import java.util.Arrays;

public class A_BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length;i++){
//            we use swapped for optimizaion as it work well without using boolean but then if the array is sorted then it will keep trasversing from rows and columns , the swapped help us to prevent that problem as if array is sorting it only run once then come out
            boolean swapped=false;
            for(int j=1; j<arr.length-1-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}

