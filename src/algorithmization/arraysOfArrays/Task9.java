package algorithmization.arraysOfArrays;

public class Task9 { // Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
                     // Определить, какой столбец содержит максимальную сумму.
    public static void main(String[] args) {

        int i;
        int j = 0;
        boolean maximumFound = false;
        int numberColumn = 0;
        int sumInTheColumn = 0;
        int maxSumInTheColumn = 0;
        int[][] array = {{5, 2, 0, 4, 15},
                         {6, 7, 8, 9, 10},
                         {0, 2, 0, 4, 5},
                         {2, 0, 21, 0, 0},
                         {2, 1, 1, 1, 1}};
        while (!maximumFound) {
            for (i = 0; i < array.length; i++) {
                sumInTheColumn += array[i][j];
            }
            if (maxSumInTheColumn < sumInTheColumn) {
                maxSumInTheColumn = sumInTheColumn;
                numberColumn = j;
            }else if ( maxSumInTheColumn == sumInTheColumn){
                System.out.println("has been find more one column with MAX_VALUE !!!");
                System.exit(666);
            }
            sumInTheColumn = 0;
            j++;
            if(j == array[i-1].length){
                maximumFound=true;
            }
        }
        System.out.println("max sum= " + maxSumInTheColumn + ", number column= " + numberColumn);
    }
}

