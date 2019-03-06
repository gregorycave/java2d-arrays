package Java2DArrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int array[][] = {{3, -1, 4, 0}, {5, 9, -2, 6}, {5, 3, 7, -8}};
        System.out.println(Java2DArrays.sum(array));
        System.out.println(Arrays.toString(Java2DArrays.rowSums(array)));
        System.out.println(Arrays.toString(Java2DArrays.columnSums(array)));
        System.out.println(Java2DArrays.maxRowAbsSum(array));
    }
}