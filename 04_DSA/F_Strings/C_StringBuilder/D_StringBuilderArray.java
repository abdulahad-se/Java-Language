package F_Strings.C_StringBuilder;

import java.util.Arrays;

public class D_StringBuilderArray {
    public static void main(String[] args) {

        // 1. Declare and create an array of 3 StringBuilder references
        // (slots are only references, all are null right now)
        StringBuilder[] arr = new StringBuilder[3];
        System.out.println(Arrays.toString(arr));   // [null, null, null]

        // 2. Calling a method on a null slot gives NullPointerException
        // arr[0].append("Hello");                  // NullPointerException

        // 3. Create an object for every slot
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder();
        }
        System.out.println(Arrays.toString(arr));   // [, , ] (three empty StringBuilders)

        // 4. Use each StringBuilder normally
        arr[0].append("Hello");
        arr[1].append("Java");
        arr[2].append("DSA");

        // 5. Modify one of them: each slot is a separate object
        arr[0].append(" World");

        // 6. Print using an enhanced for loop
        for (StringBuilder sb : arr) {
            System.out.println(sb);
        }
        // Hello World
        // Java
        // DSA

        // 7. Print using an index loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " -> " + arr[i]);
        }

        // 8. Create and fill in one step (array initializer)
        StringBuilder[] arr2 = {
                new StringBuilder("A"),
                new StringBuilder("B"),
                new StringBuilder("C")
        };

        // 9. Other StringBuilder methods work on each slot
        arr2[0].append("1");                        // A1
        arr2[1].insert(0, "X");                     // XB
        arr2[2].reverse();                          // C (single char, same)
        arr2[0].setCharAt(0, 'Z');                  // Z1
        System.out.println(Arrays.toString(arr2));  // [Z1, XB, C]

        // 10. Slots hold references: two slots can point to the same object
        StringBuilder shared = new StringBuilder("same");
        StringBuilder[] arr3 = {shared, shared};
        arr3[0].append("!");
        System.out.println(arr3[1]);                // same!  (both slots changed)

        // 11. Assigning a String directly is an error, we must use new
        // arr[0] = "Hello";                        // compile error
        arr[0] = new StringBuilder("Hello");        // correct

        // 12. Convert each StringBuilder to a String
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i].toString();
        }
        System.out.println(Arrays.toString(result)); // [Hello, Java, DSA]

        // 13. Length of the array vs length of each StringBuilder
        System.out.println(arr.length);              // 3 (number of slots)
        System.out.println(arr[0].length());         // 5 (characters in the first StringBuilder)
    }
}
