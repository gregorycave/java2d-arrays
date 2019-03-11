# java2d-arrays
A program to test writing methods which operate on two-dimensional arrays of integers

This program is for writing methods which operate on two-dimensional arrays of integers. It can be assumed that these arrays are rectangular - all rows have the same length. It can also be assumed each of these arrays has at least one row and that all rows are non-empty. For testing, an array is used with three rows and four columns with the following elements:
```
 3 -1  4  0
 5  9 -2  6
 5  3  7 -8
 ```
 

 # Part A
 
In the class Java2DArrays, there is a method:

```
public static int sum(int[][] array)
```

Given a rectangular 2D array, the method will return the sum of its elements. For example, if applied to the test array, the result will be 31. The method main() applies sum to the test array.

# Part B

In the class Java2DArrays, there is a method:

```
public static int[] rowSums(int[][] array)
```

Given a rectangular 2D array with n rows, the method returns an array of length n whose elements are the sums of the corresponding rows in the argument array. For example, if applied to the test array, the result will be an array of length 3 containing the elements (3+(-1)+4+0,5+9+(-2)+6, 5+3+7+(-8)) = (6,18,7).

# Part C

In the class Java2DArrays, there is a method:

```
public static int[] columnSums(int[][] array)
```

Given a rectangular 2D array with n columns, the method returns an array of length n whose elements are the sums of the corresponding columns in the argument array. For example, if applied to the test array, the result will be an array of length 4 containing the elements (3+5+5,(-1)+9+3, 4+(-2)+7, 0+6+(-8)) = (13,11,9,-2).

# Part D

In the class Java2DArrays, there is a method:

```
public static int maxRowAbsSum(int[][] array)
```

Given a rectangular 2D array, the method computes for each row the sum of the absolute values (https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#abs-int-) of the elements of that row. The method returns the maximum of these sums. For example, if applied to the test array, the method returns the value max (3+1+4+0,5+9+2+6, 5+3+7+8) = max (8,22,23) = 23.
