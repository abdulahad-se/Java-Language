public class M_Patterns {
    public static void main(String[] args) {
        // Basic Patterns using for loop

        // Right angle Triangle
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted Right Angle Triangle 
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Right Aligned Triangle
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Full Pyramid
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars with space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted Full Pyramid
        int n = 5;
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars with space
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
        // Half Diamond Pyramid
        public class HalfDiamond {
    public static void main(String[] args) {
        int n = 5;
        
        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    




        // Advance Patterns

        // Solid Star Diamond Shape
        java.util.Scanner sc=new java.util.Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1; i<=n; i++){
           for(int j=1; j<=n-i; j++){
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++){
               System.out.print("*");
           } 
           System.out.println();
           
       }
       for(int i=n; i>=1; i--){
           for(int j=1; j<=n-i; j++){
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++){
               System.out.print("*");
           } 
           System.out.println();
       }
           
       
       
       
    //    Palindromic Number Pyramid
       for(int i=1; i<=5; i++){
           for(int j=1; j<=n-i; j++){
               System.out.print("  ");
           }
           for(int j=i; j>=1; j--){
               System.out.print(j+" ");
           } 
           for(int j=2; j<=i; j++){
               System.out.print(" "+j);
           }
           System.out.println();
       }
           
        
        
        // Number Pyramid
       for(int i=1; i<=n; i++){
           for(int j=1; j<=n-i; j++){
               System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
               System.out.print(i+" ");
           } 
           System.out.println();
       }
            
        
        // Slanted Number Rhombus
        
       for(int i=1; i<=n; i++){
           
           for(int j=1; j<=n-i; j++){
               System.out.print(" ");
           }
           for(int j=1;j<=5; j++){
               System.out.print(j+" ");
           }
           System.out.println();
       }   
       
        
        
        
        // Butterfly Patterns 
       for(int i=1; i<=n; i++){
                System.out.print("*");
           }
           int spaces=2*(n-i);
           for(int j=1; j<=spaces; j++){
               System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println(); 
       }
       
       for(int i=n; i>=1; i--){
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           int spaces=2*(n-i);
           for(int j=1; j<=spaces; j++){
               System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
       
           System.out.println();   
       } 
    }
}
