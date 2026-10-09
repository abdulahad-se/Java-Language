package F_Strings.E_ToStringMethod;

import java.util.ArrayList;

public class ToStringMethod {
    public static void main(String[] args) {

        // 1. Call toString() directly on an object
        // (toString() works only on objects; with a primitive int it gives an error, so we use Integer)
        Integer num = 123;
        String s = num.toString();
        System.out.println(s);                       // 123

        // 2. toString() returns a String, so String methods work on it
        System.out.println(num.toString().length()); // 3

        // 3. toString() on an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());         // [1, 2, 3]

        // 4. println(obj) is the same as println(obj.toString())
        System.out.println(list);                    // [1, 2, 3]

        // 5. Joining with a String calls toString() automatically
        System.out.println("List is: " + list);      // List is: [1, 2, 3]

        // 6. printf with %s also calls toString()
        System.out.printf("List is: %s%n", list);    // List is: [1, 2, 3]
    }
}
