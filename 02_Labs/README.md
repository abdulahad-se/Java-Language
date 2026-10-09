# 🧪 02_Labs - Practical Java Lab Exercises

This folder contains progressive Java lab programs. Each lab focuses on a
specific topic and includes runnable examples that build on the fundamentals
from `01_Basics`.

---

## 📁 Lab sequence

### 1. 🧮 Basic calculations and operators

- **`A_JavaLab.java`** - Unit conversions, days and months, BMI, biodata
  input, arithmetic, and digit-sum calculations.
- **`B_JavaLab.java`** - Arithmetic operations, temperature conversion,
  increment/decrement, exponentiation, and bitwise operators.
- **`C_JavaLab.java`** - Conditional logic, grading, greetings, random
  values, attendance eligibility, and distance between points.

### 2. 🔁 Loops and arrays

- **`D_JavaLab.java`** - `for`, `while`, and `do-while` loops, `break`,
  `continue`, nested loops, factorials, digit processing, patterns, and
  prime numbers.
- **`E_JavaLab.java`** - Array average, reversing, sorting, random monthly
  values, character frequency, Fibonacci numbers, and string searching.
- **`F_JavaLab.java`** - 2D arrays, totals, averages, minimum and maximum
  values, row and column totals, searching, transpose, row sorting, and
  shuffling.

### 3. 🧩 Methods and object-oriented programming

- **`G_JavaLab.java`** - `void` methods, return values, parameters, 1D-array
  parameters, 2D-array parameters, searching, and diagonal sums.
- **`H_JavaLab.java`** - Classes, objects, fields, constructors, instance
  methods, and returning values from object methods.
- **`I_JavaLab.java`** - Constructors, constructor overloading, method
  overloading, and overloaded methods with different parameter types.
- **`J_JavaLab.java`** - Inheritance, method overriding, runtime
  polymorphism, aggregation, multilevel inheritance, and hierarchical
  inheritance.
- **`K_JavaLab.java`** - Reserved OOP study notes for composition, abstract
  classes, and related inheritance examples. The current file is commented
  out.
- **`L_JavaLab.java`** - Interfaces, interface inheritance, implementing
  interfaces, and interface polymorphism.

### 4. 📦 Packages and exceptions

- **`M_JavaLab.java`** - Package declarations and imports using the
  `bank_account` package.
- **`N_JavaLab.java`** - Built-in exceptions, `try-catch-finally`,
  `throws`, custom exceptions, and validation.

### 5. 🏦 Package example

The `bank_account` folder contains the classes imported by `M_JavaLab.java`:

- **`bank_account/CalculateInterest.java`** - Normal interest calculation.
- **`bank_account/CalculateSpecialInterest.java`** - Interest calculation
  with a bonus amount.

---

## ▶️ How to run

Open a terminal in this directory and compile the lab you want to study:

```text
javac D_JavaLab.java
java D_JavaLab
```

Replace `D_JavaLab` with the class you want to run.

For the package example, compile the main file together with its package
classes:

```text
javac M_JavaLab.java bank_account\CalculateInterest.java bank_account\CalculateSpecialInterest.java
java M_JavaLab
```

Some labs use `Scanner` and wait for input in the terminal.

---

## 🛣️ Recommended learning path

Study the labs in this order:

1. `A_JavaLab.java` to `C_JavaLab.java` for calculations and conditions
2. `D_JavaLab.java` for loops
3. `E_JavaLab.java` and `F_JavaLab.java` for 1D and 2D arrays
4. `G_JavaLab.java` for methods
5. `H_JavaLab.java` and `I_JavaLab.java` for classes and constructors
6. `J_JavaLab.java` and `L_JavaLab.java` for inheritance and interfaces
7. `M_JavaLab.java` for packages
8. `N_JavaLab.java` for exception handling
