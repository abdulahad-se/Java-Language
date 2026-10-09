package F_Strings.A_String;

import java.util.ArrayList;

public class F_StringConcatenationOperator {
    static void main() {
        System.out.println('a'+'b');// output :195 bcz + operator converted it into integer values and add their values

        System.out.println("a"+"b");// output :ab

        System.out.println('a'+3);// output : 100

        System.out.println((char)('a'+3));// output : d

// note : when you are doing an addition or whatever with character it converts it into an ascii value and then uses that to solve that with strings it not doing this when you use the string "" .

        System.out.println("a"+1);// output : a1

// note : when an integer is concatenated and added with an string it is convert to its wrapper class Integer e.g int => Integer that will call .toString() , this is same as after few steps like this "a" +"1" => a1

        System.out.println("AbdulAhad"+new ArrayList<>());// output : AbdulAhad[]

        System.out.println("AbdulAhad"+new Integer(100));// output : AbdulAhad100

//        System.out.println(new Integer(56)+new ArrayList<>());// output : error

// note : The operator + in java is only defined for primitive and when of the value is string then we can also use it to objects but one object type is of string .

        System.out.println(new Integer(56)+" "+new ArrayList<>());// output : 56[] , so here we can see that as before there is error appearing when we try to concate them but as we use string so they both concat easily.

        System.out.println("a"+'b');// output :ab

// note : if one datatype is string answer will be in string





    }
}
