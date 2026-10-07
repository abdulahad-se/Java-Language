package A1_LeetCode.A_LinearSearch;

public class A_LC1295 {
    public static void main(String[] args) {
        int[] nums={18,124,9,1764,98,1};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] num){
        if(num.length==0){
            return -1;
        }
        int count=0;
        for(int i=0; i<num.length; i++){
            if(checkeven(num[i])){
                count++;
            }
        }
        return count;
    }
    static boolean checkeven(int num){
        int numberOfDigits=checkdigits(num);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }
    static int checkdigits(int num){
        if(num<0){
            num=num*-1;
        }
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
}
