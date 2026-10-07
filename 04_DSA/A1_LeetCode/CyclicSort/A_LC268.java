package A1_LeetCode.CyclicSort;

public class A_LC268 {
    public static void main(String[] args) {
        int[] arr={0,2,1,3};
        int ans=findMissing(arr);
        System.out.println(ans);
    }
    static int findMissing(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct=arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
