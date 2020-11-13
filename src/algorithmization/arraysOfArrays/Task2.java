package algorithmization.arraysOfArrays;

public class Task2 { // Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

    public static void main(String[] args) {

        double[][] matrixSquare = new double[5][5];
        for (int i = 0; i < matrixSquare.length; i++) {
            for (int j = 0; j < matrixSquare.length; j++) {
                matrixSquare[i][j] = Math.random() * -20 + 10;
                if (i == j) {
                    System.out.print(matrixSquare[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }
}
