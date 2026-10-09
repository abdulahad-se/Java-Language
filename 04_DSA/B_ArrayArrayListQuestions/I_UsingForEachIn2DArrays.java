package B_ArrayArrayListQuestions;

public class I_UsingForEachIn2DArrays {
    public static void main(String[] args) {
        int[][] numbers={
                {1,2,1},
                {22,34,54},
                {65,67,89}
        };
        for(int[] row:numbers){
            for(int col:row){
                System.out.println(col);
            }
        }
    }
}
