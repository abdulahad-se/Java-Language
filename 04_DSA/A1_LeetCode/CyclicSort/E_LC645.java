package A1_LeetCode.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E_LC645 {
    public static void main(String[] args) {
    int[] num={2,2};
    int[] ans=findErrorNums(num);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] num){
        int i=0;
        while(i < num.length){
            int correctIndex=num[i]-1;
            if(num[i] != num[correctIndex]){
                swap(num,i,correctIndex);
            }else{
                i++;
            }
        }
        for(int index=0; index<num.length; index++){
            if(num[index] != index+1){
              return new int[]{num[index], index + 1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] num,int a,int b){
        int temp=num[a];
        num[a]=num[b];
        num[b]=temp;
    }
}
