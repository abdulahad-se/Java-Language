# 📚 01_Basics - Java Fundamentals

This folder presents Java fundamentals in a gradual order, starting with
program structure and ending with introductory object-oriented programming,
collections, and exception handling.

---

## 📁 Learning sequence

### 1. 🧱 Fundamentals and input

- **`A_firstjavacode.java`** - First Java program and console output.
- **`B_VariablesandDatatypes.java`** - Variables, `String`, and primitive data
  types such as `byte`, `int`, `long`, `float`, and `double`.
- **`C_BasicPrograms.java`** - Basic arithmetic, addition, and
  increment/decrement operators.
- **`D_input.java`** - Reading integers, decimals, characters, and complete
  lines with `Scanner`.
- **`E_Operators.java`** - Arithmetic, unary, relational, logical, assignment,
  bitwise, and ternary operators.

### 2. 🔀 Conditions and loops

- **`F_ConditionalStatements.java`** - `if`, `if-else`, nested conditions,
  `switch`, switch expressions, and ternary expressions.
- **`G_forLoop.java`** - Counting, even and odd numbers, sums, factorials,
  multiplication tables, `break`, and `continue`.
- **`H_whileLoop.java`** - `while` loops, reverse digits, digit counting,
  prime checking, `break`, and `continue`.
- **`I_doWhileloop.java`** - `do-while` loops, digit processing, and the
  guarantee that a `do-while` body runs at least once.

### 3. 🧮 Arrays, methods, and command-line programs

- **`J_Array.java`** - One-dimensional arrays, copying, reversing, bubble
  sorting, shuffling, searching, and minimum/maximum values.
- **`K_Functions.java`** - Methods, parameters, return values, `void` methods,
  Fibonacci, factorial, averages, and sums.
- **`L_CommandLine.java`** - Command-line arguments and a calculator using
  `main(String[] args)`, parsing, `switch`, and input error handling.
- **`M_Patterns.java`** - Nested loops for triangles, pyramids, diamonds, and
  number patterns.
- **`N_StringsAndStringBuilder.java`** - String comparison, character access,
  substring operations, replacement, splitting, palindrome checking, and
  `StringBuilder` modification.
- **`O_TwoDimensionalArray.java`** - 2D-array traversal, row totals, total,
  average, and finding the largest value.

### 4. 🧩 Introductory object-oriented programming

- **`P_ClassesAndObjects.java`** - Classes, objects, constructors, private
  fields, and instance methods.
- **`Q_ExceptionHandling.java`** - `try-catch-finally`, arithmetic exceptions,
  and array index exceptions.

---

## ▶️ How to run

Open a terminal in this directory and compile the file you want to run:

```text
javac A_firstjavacode.java
java A_firstjavacode
```

Replace the filename and class name with the example you want to study.
Examples that use `Scanner` wait for input in the terminal.

For the command-line calculator, provide three arguments:

```text
javac L_CommandLine.java
java L_CommandLine 12 + 5
```

---

## 🛣️ Recommended path

Study the files from `A` through `I` first. Then continue with arrays and
methods in `J` through `O`, followed by classes and objects in `P` and
exception handling in `Q`.
