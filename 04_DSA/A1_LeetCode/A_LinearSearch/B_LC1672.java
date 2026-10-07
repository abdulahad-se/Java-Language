package A1_LeetCode.A_LinearSearch;

public class B_LC1672 {
    public static void main(String[] args) {
        int[][] accounts={
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(findwealth(accounts));
    }
    static int findwealth(int[][] accounts){
        int[] store=new int[accounts.length];
        int max=Integer.MIN_VALUE;
        for(int person=0; person<accounts.length; person++){
            int sum=0;
            for(int balance=0; balance<accounts[person].length; balance++){
                sum+=accounts[person][balance];
                store[person]=sum;
            }
        }
        for(int fm:store){
            if(fm>max){
                max=fm;
            }
        }
        return max;
    }
}
