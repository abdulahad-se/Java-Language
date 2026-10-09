package B_ArrayArrayListQuestions;

public class N_MinimumValueOfAnArray {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,12,23,-1,-2,20};
//        System.out.println(min(numbers));
        System.out.println(min2(numbers));
    }
    static int min(int[] num){
        int min=num[0];
        for(int i=0; i<num.length; i++){
            if(num[i] < min){
                min=num[i];
            }
        }
        return min;
    }

    static int min2(int[] num){
        int min=Integer.MAX_VALUE;
        for(int mini:num){
            if(mini < min){
                min=mini;
            }
        }
        return min;
    }
}
