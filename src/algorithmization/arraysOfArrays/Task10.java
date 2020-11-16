package algorithmization.arraysOfArrays;

public class Task10 { // Найти положительные элементы главной диагонали квадратной матрицы.
    public static void main(String[] args) {

        int[][] matrix = {{-11, 2, 3, 23},
                          {0  ,-2, 6, 21},
                          {0  , 2, 6, 91},
                          {0  , 2, 4, 0}};
        int sum = 0;

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (i == j && matrix[i][j] > 0) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("трям- трям -> " + sum);
    }
}
