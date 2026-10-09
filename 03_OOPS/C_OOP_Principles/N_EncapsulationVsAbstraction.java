package C_OOP_Principles;

/*
 * Encapsulation vs Abstraction
 * ----------------------------
 * Encapsulation: protects the DATA. Fields are private and accessed through
 *                methods. Solves the problem at the implementation level.
 * Abstraction:   hides the COMPLEXITY. The user sees only what is needed.
 *                Solves the problem at the design level.
 *
 * Example: a coffee machine.
 * - Abstraction:   the user only presses makeCoffee(), the steps are hidden.
 * - Encapsulation: water level is private, it can only change through refill().
 */
public class N_EncapsulationVsAbstraction {
    static class CoffeeMachine {
        private int water = 0;                      // encapsulation: private data

        void refill(int ml) {                       // controlled access to the data
            if (ml > 0) {
                water += ml;
            }
        }

        void makeCoffee() {                         // abstraction: one simple method
            if (water < 100) {
                System.out.println("Please refill water");
                return;
            }
            boilWater();
            grindBeans();
            water -= 100;
            System.out.println("Coffee is ready");
        }

        private void boilWater() {                  // hidden steps
            System.out.println("Boiling water");
        }

        private void grindBeans() {
            System.out.println("Grinding beans");
        }
    }

    public static void main(String[] args) {
        CoffeeMachine m = new CoffeeMachine();
        m.makeCoffee();                             // Please refill water
        m.refill(200);
        m.makeCoffee();
        // Boiling water
        // Grinding beans
        // Coffee is ready

        // m.boilWater();                           // compile error: private
        // m.water = 500;                           // compile error: private
    }
}
