// NOTICE : This Lab Belong to Obejct Oriented Concept of Java.
// It has Multiple Classes in which one class that has methods , variables , constructors etc.
// While other is main class that intialize and print.

public class H_JavaLab {
    // Task 1
    class PowerLaw {
        int current, voltage, power;

        void value(int current, int voltage) {
            this.current = current;
            this.voltage = voltage;
        }

        void calculatepower() {
            power = current * voltage;
            System.out.println("The power is " + power);
        }

        void display() {
            System.out.println("The current is " + current);
            System.out.println("The voltage is" + voltage);
            System.out.println("The power is " + power);
        }
    }

    // This is Main Class of Task 1
    public class Mainja {
        public static void main(String[] args) {
            PowerLaw pl = new PowerLaw();
            pl.value(10, 20);
            pl.calculatepower();
            pl.display();
        }

    }

    // -------------------------------------------------------------

    // Task 2
    public class studentdata {
        int rollno, phonenumber;
        String address, name;

        studentdata(String name, int rollno, int phonenumber, String address) {
            this.rollno = rollno;
            this.phonenumber = phonenumber;
            this.address = address;
            this.name = name;
        }

        void display() {
            System.out.println("The name of student is" + name);
            System.out.println("The rollno of student is" + rollno);
            System.out.println("The phonenumber of student is" + phonenumber);
            System.out.println("The address of student is" + address);
        }
    }

    // This is the main class of Task 2
    public class showdata {
        public static void main(String[] args) {
            // studentdata sd1=new studentdata("Babar",999,99987547,"karachi");
            studentdata sd2 = new studentdata("Danish", 998, 9998, "karachi");
            // sd1.display();
            sd2.display();
        }
    }

    // --------------------------------------------------------------------------------

    // Task 3
    public class addjava {
        int getTotal(int a, int b) {
            return a + b;
        }
    }

    // This is main class of Task 3
    public class Mainjava {
        public static void main(String[] args) {
            addjava obj = new addjava();
            int result = obj.getTotal(10, 20);
            System.out.println("The sum of a and  b is " + result);

        }
    }

}
