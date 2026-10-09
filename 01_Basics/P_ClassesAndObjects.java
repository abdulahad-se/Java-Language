public class P_ClassesAndObjects {
    public static void main(String[] args) {
        Student firstStudent = new Student("Ali", 20);
        Student secondStudent = new Student("Sara", 21);

        firstStudent.printDetails();
        secondStudent.printDetails();
    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
