package H_Recursion;

public class A_PrintNumbers {
     void main() {
        int num=5;
        print(num);

//         ---------------------
         int n=1;
         System.out.println(printnum(n));

//         ----------------------

         printnos(n);

    }
//    normally we do like this
void print(int n){
    System.out.println(n);
    print2(n);
}
    void print2(int n){
        System.out.println(n);
        print3(n);
    }
    void print3(int n){
        System.out.println(n);
        print4(n);

    }
    void print4(int n){
        System.out.println(n);
        print5(n);
    }
    void print5(int n){
        System.out.println(n);
    }



// but in recursion we do this something like this , let say we have to print he 5 numbers
    int printnum(int n){
        if(n == 5){
            return 5;
        }
        System.out.println(n);
        return printnum(n+1);
    }

//    doing the same question using void
    void printnos(int n){
         if(n == 5){
             System.out.println(5);
             return;
         }
        System.out.println(n);
         printnos(n+1);
    }

   }