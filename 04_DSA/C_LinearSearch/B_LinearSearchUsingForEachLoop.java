package C_LinearSearch;

public class B_LinearSearchUsingForEachLoop {
    public static void main(String[] args) {
        int[] num={23,45,1,2,8,19,-3,16,-11,28};
        int target=16;
        System.out.println(search(num,target));
    }
    static boolean search(int[] num,int target){
        if(num.length == 0){
            return false;
        }
        for(int nums:num){
            if(nums == target){
                return true;
            }
        }
        return false;
    }
}
