package A_MethodFunctions;

public class Questions {

//  public static void main(String[] args) {
//    Scanner input=new Scanner(System.in);
//    System.out.print("Enter the number 1 :");
//    int a=input.nextInt();
//    System.out.print("Enter the number 2 :");
//    int b=input.nextInt();
//    System.out.println("The sum of a and b is = to "+ sum(a,b));
//  }
//  public static int sum1(int a, int b){
//    return a+b;
//  }
//    public static void main(String[] args) {
//
//    }
//    public static void sum2(int a , int b){
//      int sum=a+b;
//      System.out.println("The sum of a and b is=" );
//    }

//    public static void main(String[] args) {
//        greeting();
//    }
//    public static void greeting(){
//        String message="How are you";
//        System.out.println(message);
//    }

//    public static void main(String[] args) {
//        System.out.println(greeting2());
//    }
//    public static String greeting2(){
//        return "How are you";
//    }

//    public static void main(String[] args) {
//        System.out.println(greet4("Ahad"));
//    }
//    static String greet4(String name){
//        String message="hi "+name;
//        return message;
//    }

//    With input
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        String name=input.nextLine();
//        System.out.println(greet5(name));
//    }
//    static String greet5(String name){
//        String message="Hey"+name;
//        return message;
//    }

//    Values Swapping
//public static void main(String[] args) {
//    int a=10;
//    int b=20;
//    swap(a,b);
//
//}
//static void swap(int a,int b){
//    int temp=a;
//    a=b;
//    b=temp;
//    System.out.println("After swapping a =" + a + "b = "+ b);
//}
//    Variable lenght Arguments
//public static void main(String[] args) {
//    name("Mirza","Abdul","Ahad","Baig");
//}
//static void name(String...name){
//    System.out.print(Arrays.toString(name));
//}

//    public static void main(String[] args) {
//        sum(1,2,3,4,5);
//    }
//    static void sum(int a,int...b){
//        for(int b1:b){
//            a+=b1;
//        }
//        System.out.println(a);
//    }

//    public static void main(String[] args) {
//        for(int i=0; i<21; i++){
//            System.out.println(isPrime(i));
//        }
//    }
//    static boolean isPrime(int n){
//        if(n<2){
//            return false;
//        }
//        int c=2;
//        while(c*c<=n){
//            if(n%c==0){
//                return false;
//            }
//            c++;
//        }
//        return c*c>n;
//    }

//    public static void main(String[] args) {
//        System.out.println(ArmStrong(153));
//    }
//    static boolean ArmStrong(int n){
//        int original=n;
//        int sum=0;
//        while(n>0){
//            int rem=n%10;
//            int cube=rem*rem*rem;
//            sum+=cube;
//            n/=10;
//        }
//        if(original == sum){
//            return true;
//        }
//        return false;
//    }
}


