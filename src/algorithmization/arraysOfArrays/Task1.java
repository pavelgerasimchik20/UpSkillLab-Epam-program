package algorithmization.arraysOfArrays;

public class Task1 { //  Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
    public static void main(String[] args) {

        int[][] array = {{7, 2, 0, 4, 15}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {0, 0, 0, 0, 0}, {1, 1, 1, 1, 1}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j += 2) {
                if (array[0][j] > array[array.length - 1][j]) {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
