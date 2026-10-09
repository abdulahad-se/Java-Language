package C_LinearSearch;

public class D_SearchInRange {
    public static void main(String[] args) {
        int[] numbers={1,2,3,5,12,23,34,45,56,67,78,89};
        int target=56;
        System.out.println(searchInRange(numbers,target,4,numbers.length-1));
    }
    static int searchInRange(int[] nums,int target,int start,int end){
        if(nums.length == 0){
            return -1;
        }
        for(int i=start; i<end; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
