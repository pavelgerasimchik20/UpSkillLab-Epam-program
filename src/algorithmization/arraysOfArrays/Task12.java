package algorithmization.arraysOfArrays;

public class Task12 { // Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    public static void main(String[] args) {

        int[][] matrix = new int[10][10];
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
        System.out.println("||||||||||||||||||Сортируем строки по возрастанию||||||||||||||||||||");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = j + 1; k < matrix[j].length; k++) {
                    if (matrix[i][j] > matrix[i][k]) {
                        b = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = b;
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
        System.out.println("|||||||||||||||||||||Сортируем строки по убыванию||||||||||||||||||");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = j + 1; k < matrix[j].length; k++) {
                    if (matrix[i][j] < matrix[i][k]) {
                        b = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = b;
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

