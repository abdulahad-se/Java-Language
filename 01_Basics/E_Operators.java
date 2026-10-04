import java.util.*;

class E_operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 15, b = 4;
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Unary Operators
        int x = 10;
        System.out.println("Unary Operators");
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x)); // pre-increment
        System.out.println("x++ = " + (x++)); // post-increment
        System.out.println("x after post-increment = " + x);
        System.out.println("--x = " + (--x)); // pre-decrement
        System.out.println("x-- = " + (x--)); // post-decrement
        System.out.println("x after post-decrement = " + x);
        System.out.println("-x = " + (-x)); // unary minus
        System.out.println("!true = " + (!true)); // logical NOT

        // Relational Comparison Operators
        System.out.println("Relational Operators");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        boolean p = true, q = false;
        System.out.println("\n---- Logical Operators ----");
        System.out.println("p && q : " + (p && q)); // AND
        System.out.println("p || q : " + (p || q)); // OR
        System.out.println("!p     : " + (!p)); // NOT

        // Assignment Operators
        int c = 20;
        System.out.println("Assignment Operators");
        System.out.println("c = " + c);
        c += 5;
        System.out.println("c += 5 -> " + c);
        c -= 3;
        System.out.println("c -= 3 -> " + c);
        c *= 2;
        System.out.println("c *= 2 -> " + c);
        c /= 4;
        System.out.println("c /= 4 -> " + c);
        c %= 5;
        System.out.println("c %= 5 -> " + c);

        // Bitwise Operators
        int m = 6, n = 3; // 6 = 110, 3 = 011 in binary
        System.out.println("Bitwise Operators ");
        System.out.println("m & n  = " + (m & n)); // AND
        System.out.println("m | n  = " + (m | n)); // OR
        System.out.println("m ^ n  = " + (m ^ n)); // XOR
        System.out.println("~m     = " + (~m)); // NOT
        System.out.println("m << 1 = " + (m << 1)); // left shift
        System.out.println("m >> 1 = " + (m >> 1)); // right shift

        // Ternary Operator
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Ternary Operator");
        System.out.println(num + " is " + result);
    }
}
