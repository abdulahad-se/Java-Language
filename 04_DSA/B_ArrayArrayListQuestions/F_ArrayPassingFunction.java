package B_ArrayArrayListQuestions;

import java.util.Arrays;

public class F_ArrayPassingFunction {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10};
        arr(num);
        System.out.println(Arrays.toString(num));
    }
    static void arr(int[] arr){
        arr[0]=9;
    }
}
