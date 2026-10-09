package A_MethodFunctions.A_BasicFunctions;

public class E_GreetingWithParameter {
    public static void main(String[] args) {
        System.out.println(greeting("Ahad"));
    }

    static String greeting(String name) {
        return "Hi " + name;
    }
}
