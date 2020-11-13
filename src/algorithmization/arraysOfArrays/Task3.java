package algorithmization.arraysOfArrays;

public class Task3 { // Дана матрица. Вывести k-ю строку и p-й столбец матрицы.   Допустим третий и третий ...
    public static void main(String[] args) {

        int k = 3;
        int p = 3;
        int[][] array = {{7, 2, 0, 4, 15}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {0, 0, 0, 0, 0}, {1, 1, 1, 1, 1}};
        System.out.println("Output column: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][p - 1]);
        }
        System.out.println("Output row: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[k - 1][j] + " ");
        }
    }
}
