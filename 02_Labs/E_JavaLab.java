// NOTICE : To run this code on your console in any java IDE at first you have to comment out 
// the task you want to run by using key like ctrl+// and write boiler plate code public static void main(String[] args) if you are using different files 
// Add extra braces as this different tasks are arrange in single file so that this why this whole program is comment out.

public class E_JavaLab {
    public static void main(String[] args) {
        // Task 1
        int[] numbers = { 10, 20, 30, 40, 50 };
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Average: " + (sum / numbers.length));

        // ---------------------------------------------------------------------

        // Task 2
        int[] arr = { 1, 2, 3, 4, 5 };
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }}

    // --------------------------------------------------------------------

    // Task 3
    int[] numArr = { 50, 10, 40, 20, 30 };
    String[] strArr = { "Banana", "Apple", "Orange", "Mango" };

    Arrays.sort(numArr);Arrays.sort(strArr);

    System.out.print("Sorted Numbers: ");for(
    int i = 0;i<numArr.length;i++)
    {
        System.out.print(numArr[i] + " ");
    }

    System.out.print("\nSorted Strings: ");for(
    int i = 0;i<strArr.length;i++)
    {
        System.out.print(strArr[i] + " ");
    }

    // ---------------------------------------------------------------

    // Task 4
    public static void main(String[] args) {
        String[]
        months={"january","febuary","March","April","May","june","july","august","September","october","november","december"};
        double[] decimals=new double[12];
        double sum=0;
        for(int i=0; i<months.length; i++){
        decimals[i]=Math.random()*100;
        sum+=decimals[i];
        System.out.println(months[i]+" "+decimals[i]);
        
        }
        System.out.println("Average"+sum/12);
        
        }}

    // --------------------------------------------------------

    // Task 5
    String input = "swiss";
    int[] freq = new int[256];

    for(
    int i = 0;i<input.length();i++)
    {
        freq[input.charAt(i)]++;
    }

    boolean found = false;
    // Using standard for loop to find the first one with count 1
    for(
    int i = 0;i<input.length();i++)
    {
        if (freq[input.charAt(i)] == 1) {
            System.out.println("First non-repeated character: " + input.charAt(i));
            found = true;
            break;
        }
    }if(!found)System.out.println("All characters are repeated");
    }

    // --------------------------------------------------
    // Task 6
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int n=10;
        for(int i=1; i<=n; i++){
        if (a%3!=0){
        System.out.print(a+",");
        }
        int c=a+b;
        a=b;
        b=c;
        }
        }}

    // ----------------------------------------------------------

    // Task 7
    String str = "Object oriented programming";
    char target = sc.next().charAt(0);
    int foundindex = -1;for(
    int i = 0;i<str.length();i++){

    if(str.charAt(i)==target)
    {
        foundindex = i;

        break;
    }

}if(foundindex!=-1){System.out.println("Character found at index"+foundindex);}else{System.out.println("Character not found");}}}

}}
