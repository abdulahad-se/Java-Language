public class H_JavaLab {
    public static void main(String[] args) {
        // Task 1: Create an object and call its methods.
        PowerLaw powerLaw = new PowerLaw();
        powerLaw.setValues(10, 20);
        powerLaw.calculatePower();
        powerLaw.display();

        // Task 2: Use a constructor to initialize an object.
        StudentData student = new StudentData("Danish", 998, 9998, "Karachi");
        student.display();

        // Task 3: Call a method that returns a value.
        Addition addition = new Addition();
        System.out.println("The sum is " + addition.getTotal(10, 20));
    }
}

class PowerLaw {
    private int current;
    private int voltage;
    private int power;

    public void setValues(int current, int voltage) {
        this.current = current;
        this.voltage = voltage;
    }

    public void calculatePower() {
        power = current * voltage;
    }

    public void display() {
        System.out.println("The current is " + current);
        System.out.println("The voltage is " + voltage);
        System.out.println("The power is " + power);
    }
}

class StudentData {
    private final String name;
    private final int rollNumber;
    private final int phoneNumber;
    private final String address;

    StudentData(String name, int rollNumber, int phoneNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

class Addition {
    public int getTotal(int first, int second) {
        return first + second;
    }
}
