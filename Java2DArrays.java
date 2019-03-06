package Java2DArrays;

public class Java2DArrays {
    public static int sum(int[][] array){
        int Sum = 0;
        for (int each = 0; each < array.length ; each++){
            for (int other = 0; other < array[each].length; other++){
                Sum += array[each][other];
            }
        }
        return Sum;
    }
    public static int[] rowSums(int[][] array){
        int len = array.length;
        int Rows[] = new int[len];
        for (int each = 0; each < len; each++ ) {
            for (int other = 0; other <  array[each].length; other++){
                Rows[each] += array[each][other];
            }
        }
        return Rows;
    }

    public static int[] columnSums(int[][] array){
        int Cols[] = new int[array[0].length];
        for (int each = 0; each < array.length; each++){
            for (int other = 0; other < array[each].length; other++){
                Cols[other] += array[each][other];
            }
        }
        return Cols;
    }

    public static int maxRowAbsSum(int[][] array){
        int Rows[] = new int[array.length];
        int Value = Integer.MIN_VALUE;
        for (int each = 0; each < array.length; each++){
            for (int other = 0; other < array[each].length; other++){
                Rows[each] += Math.abs(array[each][other]);
            }
        }
        for (int each = 0; each < Rows.length; each++) {
            if (Rows[each] > Value){
                Value = Rows[each];
            }
        }
        return Value;
    }
}