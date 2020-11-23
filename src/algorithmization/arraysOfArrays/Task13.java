package algorithmization.arraysOfArrays;

public class Task13 { // Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];                //РЕШЕНА
        int min = 50;
        int max = 100;
        int b;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("||||||||||||||||||Сортируем столбцы по возрастанию||||||||||||||||||||");

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int k = i + 1; k < matrix.length; k++) {
                    if (matrix[i][j] > matrix[k][j]) {
                        int temp1 = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp1;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("|||||||||||||||||||||Сортируем столбцы по убыванию||||||||||||||||||");

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int k = i + 1; k < matrix.length; k++) {
                    if (matrix[i][j] < matrix[k][j]) {
                        int temp1 = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp1;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
