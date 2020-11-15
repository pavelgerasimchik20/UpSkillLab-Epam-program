package algorithmization.arraysOfArrays;

public class Task8 { // В числовой матрице поменять местами два любых столбца. Номера столбцов вводит пользователь с клавиатуры.

    public static void main(String[] args) {

        int x = 0;
        int y = 4;
        int[][] matrix = {{7, 2, 0, 4, 15, 16, 17},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {2, 0, 0, 0, 19},
                {1, 1, 1, 1, 13213}};
        System.out.println("Source...");
        printArray(matrix);
        swap(matrix, x, y);
        System.out.println("After swap...");
        printArray(matrix);

    }

    public static void swap(int[][] array, int x, int y) {
        for (int i = 0; i < array.length; i++) {
            var temp = array[i][x];
            array[i][x] = array[i][y];
            array[i][y] = temp;
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
