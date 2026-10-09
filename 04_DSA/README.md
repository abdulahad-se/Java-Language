# 🧠 04_DSA - Data Structures and Algorithms

This folder contains Java practice for methods, arrays, strings, searching,
sorting, patterns, and LeetCode-style problem solving. The examples progress
from basic array operations to more advanced binary-search and cyclic-sort
problems.

---

## 📁 Folder structure

```text
04_DSA/
├── A_MethodFunctions/
├── A1_LeetCode/
├── B_ArrayArrayListQuestions/
├── C_LinearSearch/
├── D_BinarySearch/
├── E_Sorting/
├── F_Strings/
└── G_Patterns/
```

---

## 1. 🧩 Method functions

Folder: `A_MethodFunctions`

- **`Questions.java`** - Original method notes containing examples of return
  methods, `void` methods, parameters, swapping, varargs, prime checking, and
  Armstrong-number checking.
- **`A_BasicFunctions/A_ReturnSum.java`** - Method with parameters and a
  return value.
- **`A_BasicFunctions/B_VoidSum.java`** - `void` method with parameters.
- **`A_BasicFunctions/C_VoidGreeting.java`** - Basic `void` method.
- **`A_BasicFunctions/D_ReturnGreeting.java`** - Method returning a `String`.
- **`A_BasicFunctions/E_GreetingWithParameter.java`** - Passing a value into
  a method.
- **`A_BasicFunctions/F_SwapValues.java`** - Primitive pass-by-value
  demonstration.
- **`A_BasicFunctions/G_VariableLengthArguments.java`** - String varargs.
- **`A_BasicFunctions/Varargs.java`** - Five varargs exercises covering sum,
  maximum, average, even/odd counting, and joining words.
- **`A_BasicFunctions/I_PrimeMethod.java`** - Reusable prime-checking method.
- **`A_BasicFunctions/J_ArmstrongMethod.java`** - Armstrong-number method.

---

## 2. 🧮 Arrays and ArrayList

Folder: `B_ArrayArrayListQuestions`

This section covers:

- Array declaration and initialization
- Taking input in arrays
- Enhanced `for` loops
- `Arrays.toString()`
- Passing arrays to methods
- One-dimensional arrays
- Two-dimensional arrays
- 2D-array input and traversal
- `ArrayList`
- Nested `ArrayList`
- Swapping values
- Minimum and maximum values
- Reversing an array

Main files include:

- `A_SingleLineArrayDeclaration.java`
- `C_TakingInputInArray.java`
- `F_ArrayPassingFunction.java`
- `G_2DArray.java`
- `H_2dArrayInput.java`
- `I_UsingForEachIn2DArrays.java`
- `J_ArrayList.java`
- `L_NestedArrayList.java`
- `N_MinimumValueOfAnArray.java`
- `P_ReverseAnArray.java`

---

## 3. 🔎 Linear search

Folder: `C_LinearSearch`

Topics include:

- Linear search in a 1D array
- Searching with an enhanced `for` loop
- Searching inside a string
- Searching within a selected range
- Searching in a 2D array
- Finding the maximum value in a 2D array

Important examples:

- `A_CodeOfLinearSearch.java`
- `B_LinearSearchUsingForEachLoop.java`
- `C_SearchInString.java`
- `D_SearchInRange.java`
- `E_SearchIn2DArray.java`
- `F_FindMaxValueIn2DArray.java`

---

## 4. ⚡ Binary search

Folder: `D_BinarySearch`

- **`A_CodeForBinarySearch.java`** - Binary search in an ascending sorted
  array.
- **`B_OrderAgnosticBinarySearch.java`** - Binary search that supports both
  ascending and descending arrays.

Binary search requires the input array to be sorted.

---

## 5. 🔃 Sorting

Folder: `E_Sorting`

- **`A_BubbleSort.java`** - Bubble sort with an early-stop optimization.
- **`B_SelectionSort.java`** - Selection sort.
- **`C_InsertionSort.java`** - Insertion sort.
- **`D_CyclicSort.java`** - Index-based cyclic sort for values in a known
  range.

Study the first three sorting algorithms before moving to cyclic sort.

---

## 6. 🔤 Strings and StringBuilder

Folder: `F_Strings`

### Basic strings

Folder: `F_Strings/A_String`

- Printing strings
- Taking string input
- Passing strings to methods
- Traversing characters
- Checking palindromes
- String concatenation
- String performance

### String formatting

Folder: `F_Strings/B_StringFormatting`

- `String.format()`
- `printf()`
- Format specifiers
- Width and decimal precision

### StringBuilder

Folder: `F_Strings/C_StringBuilder`

- Creating a `StringBuilder`
- Passing `StringBuilder` to a method
- Taking input into a `StringBuilder`
- Using `StringBuilder` with arrays

### Related classes

- `D_PrintStreamClass/PrintStreamClass.java`
- `E_ToStringMethod/ToStringMethod.java`

These introduce `PrintStream` and `toString()`.

---

## 7. 🔺 Patterns

Folder: `G_Patterns`

Pattern exercises use nested loops to practice rows, columns, spaces, and
symmetry.

- `A_Rectangle.java`
- `B_RightAngleTriangle.java`
- `C_RightAlignedTriangle.java`
- `D_InvertedRightAngleTriangle.java`
- `E_InvertedRightAlignedTriangle.java`
- `F_HalfDiamond.java`
- `G_HalfAlignedDiamond.java`
- `H_NumberTriangle.java`
- `I_NumberDiamond.java`
- `J_NumberPatternWithSymmetry.java`

---

## 8. 🧪 LeetCode practice

Folder: `A1_LeetCode`

### Linear-search problems

Folder: `A1_LeetCode/A_LinearSearch`

- `A_LC1295.java` - Count numbers with an even number of digits.
- `B_LC1672.java` - Find the richest customer wealth.

### Binary-search problems

Folder: `A1_LeetCode/B_BinarySearch`

The collection includes problems involving:

- Ceiling and floor values
- Next greatest character
- First and last position
- Infinite sorted arrays
- Mountain arrays
- Peak indexes
- Rotated sorted arrays
- Duplicate values
- Rotation counts
- Split-array largest sum
- 2D-array binary search

### Cyclic-sort problems

Folder: `A1_LeetCode/CyclicSort`

The collection includes:

- Missing number
- All missing numbers
- Duplicate number
- All duplicate numbers
- Set mismatch
- First missing positive

---

## ▶️ How to run a file

Open a terminal in the folder containing the Java file, then compile and run
the class:

```text
javac A_CodeOfLinearSearch.java
java A_CodeOfLinearSearch
```

For files with packages, run the command from the `04_DSA` directory or use
your IDE's Java run configuration. The folder structure must match the
package declaration.

For example, a file in `C_LinearSearch` begins with:

```java
package C_LinearSearch;
```

Some input examples use `Scanner` and wait for values in the terminal.

---

## 🛣️ Recommended learning path

1. Study `A_MethodFunctions/A_BasicFunctions`.
2. Practice arrays and 2D arrays in `B_ArrayArrayListQuestions`.
3. Learn linear search in `C_LinearSearch`.
4. Learn binary search in `D_BinarySearch`.
5. Study bubble, selection, and insertion sort in `E_Sorting`.
6. Practice strings and `StringBuilder` in `F_Strings`.
7. Practice nested-loop patterns in `G_Patterns`.
8. Solve the problems in `A1_LeetCode` after learning the related algorithm.

---

## 🎯 Suggested next topics

After completing this folder, continue with:

- Recursion
- Merge sort
- Quick sort
- Two-pointer technique
- Sliding window
- Hash-based searching
- Linked lists
- Stacks and queues
- Trees and graphs
- Dynamic programming
