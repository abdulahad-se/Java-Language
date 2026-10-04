// public class K_JavaLab {

// // Task 1
// public class Processor {
// String name;
// double speed;

// Processor(String name, double speed) {
// this.name = name;
// this.speed = speed;
// }

// public class Computer {
// String brand;
// Processor processor;

// Computer(String brand, Processor processor) {
// this.brand = brand;
// this.processor = processor;
// }

// void compareProcessor(Computer other) {
// System.out.println(this.brand + " Processor: " + this.processor.name + " (" +
// this.speedDifference(other) + ")");

// double diff = this.processor.speed - other.processor.speed;
// System.out.println("The speed difference is: " + Math.abs(diff) + " GHz");
// }

// String speedDifference(Computer other) {
// return this.processor.speed + " GHz vs " + other.processor.speed + " GHz";
// }
// }

// public class MyComputer extends Computer {
// MyComputer(String brand, Processor processor) {
// super(brand, processor);
// }
// }

// public class YourComputer extends Computer {
// YourComputer(String brand, Processor processor) {
// super(brand, processor);
// }
// }

// // Task 1 main class
// public class showProcessor {
// public static void main(String[] args) {
// // Create the processors
// Processor i7 = new Processor("Intel i7", 3.5);
// Processor m3 = new Processor("Apple M3", 4.1);

// // Create the two computers
// MyComputer myComp = new MyComputer("My PC", i7);
// YourComputer yourComp = new YourComputer("Your Mac", m3);

// // Run the comparison method
// myComp.compareProcessor(yourComp);

// }
// }

// // ---------------------------------------------------------------

// // Task 2
// import java.util.*;

// public class Liquid {
// protected Scanner sc = new Scanner(System.in);
// double liquid;

// Liquid(double liquid) {
// this.liquid = liquid;
// }

// public void Add() {
// System.out.println("Enter the amount of liquid you want to add");
// this.liquid += sc.nextDouble();
// System.out.println("New amount after adding" + this.liquid);
// }

// public void Remove(){
// System.out.println("Enter the amount of liquid you want to remove");
// this.liquid-=sc.nextDouble();
// System.out.println("New amount after remove amount from the
// liquid"+this.liquid);
// }

// public void RemoveAll() {
// System.out.println("This method removes all liquid");
// this.liquid = 0;
// System.out.println("Amount after removing all amount ofliquid" +
// this.liquid);
// }

// }

// public class Coffee extends Liquid {
// Coffee(double liquid) {
// super(liquid);
// }

// public void Add() {
// System.out.println("Enter the amount to add");
// this.liquid += sc.nextDouble();
// System.out.println("New amount after adding" + this.liquid);
// }

// public void Remove() {
// System.out.println("Enter the amount to remove");
// this.liquid -= sc.nextDouble();
// System.out.println("New amount after removing" + this.liquid);
// }

// public void RemoveAll() {
// this.liquid = 0;
// }

// public void swirl() {
// System.out.println("The coffee is swirling");
// }
// }

// public class Milk extends Liquid {
// Milk(double liquid) {
// super(liquid);
// }

// public void Add() {
// System.out.println("Enter the amount to add");
// this.liquid += sc.nextDouble();
// System.out.println("New amount after adding " + this.liquid);
// }

// public void Remove() {
// System.out.println("Enter the amount to remove");
// this.liquid -= sc.nextDouble();
// System.out.println("New amount after removing " + this.liquid);
// }

// public void RemoveAll() {
// this.liquid = 0;
// }

// }

// // Task 2 main class
// public class showLiquid {
// public static void main(String[] args) {
// Liquid[] liquid = new Liquid[10];
// for (int i = 0; i < liquid.length; i++) {
// int choice = (int) (Math.random() * 3);
// if (choice == 0) {
// liquid[i] = new Liquid(100);
// } else if (choice == 1) {
// liquid[i] = new Coffee(200);
// } else {
// liquid[i] = new Milk(1000);
// }
// }
// for (int i = 0; i < liquid.length; i++) {
// System.out.println("----item----" + (i + 1) + "----");
// liquid[i].Add();
// liquid[i].Remove();
// liquid[i].RemoveAll();

// if (liquid[i] instanceof Coffee) {
// ((Coffee) liquid[i]).swirl();

// }
// }
// }
// }

// //
// ----------------------------------------------------------------------------

// // Task 3
// public class Purse {
// private double rupees;
// private double paisas;

// Purse() {
// this.rupees = rupees;
// this.paisas = paisas;
// }

// Purse(double rupees, double paisas) {
// this.rupees = rupees;
// this.paisas = paisas;
// }

// public void reset(){
// this.rupees=0;
// this.paisas=0;
// System.out.println("Value after reset of rupees"+this.rupees+"\nValue after
// reset of paisas"+this.paisas);
// }

// public double converttopaisas() {
// return (this.rupees * 100) + this.paisas;
// }

// public void add(double rupees,double paisas){
// this.rupees+=rupees;
// this.paisas+=paisas;
// System.out.println("Value after adding"+this.rupees+"\nValue after
// adding"+this.paisas);
// }

// public void delete(double rupees, double paisas) {
// double currenttotal = (this.rupees * 100) + this.paisas;
// double removemoney = (rupees * 100) + paisas;
// System.out.println("Removing money" + removemoney);
// if (removemoney <= currenttotal) {
// double remaining = currenttotal - removemoney;
// System.out.println(this.rupees = remaining / 100);
// System.out.println(this.paisas = remaining % 100);
// }
// }
// }

// // Task 3 main class
// public class showPurse {
// public static void main(String[] args) {
// Purse purse = new Purse();
// Purse purse1 = new Purse(2000, 50);
// System.out.println(purse.converttopaisas());
// System.out.println(purse1.converttopaisas());
// purse.add(2900, 150);
// purse1.add(3000, 100);
// purse.delete(1000, 30);
// purse1.delete(200, 40);
// purse.reset();
// purse1.reset();
// }

// }

// //
// --------------------------------------------------------------------------------

// Task 4

// public abstract class Shape {
// double length;
// double breadth;
// double radius;

// abstract void calculateArea();
// }

// public class Circle extends Shape {
// Circle(double radius) {
// super.radius = radius;
// }

// public void calculateArea() {
// System.out.println("The area of circle is" + (Math.PI * Math.pow(radius,
// 2)));
// }
// }

// public class Rectangle extends Shape {
// Rectangle(double breadth, double length) {
// super.breadth = breadth;
// super.length = length;
// }

// public void calculateArea() {
// System.out.println("The area of rectangle is" + breadth * length);
// }
// }

// // Task 4 main class
// public class showShape {
// public static void main(String[] args) {
// Circle circle = new Circle(99.2);
// Rectangle rectangle = new Rectangle(100, 90);
// circle.calculateArea();
// rectangle.calculateArea();

// }
// }

// }
