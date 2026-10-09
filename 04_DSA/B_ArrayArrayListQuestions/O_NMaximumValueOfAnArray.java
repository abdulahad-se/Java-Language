package B_ArrayArrayListQuestions;

public class O_NMaximumValueOfAnArray {
    public static void main(String[] args) {
        int[] arr={};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        for(int n:arr){
            if(n > max){
                max=n;
            }
        }
        return max;
    }
}
