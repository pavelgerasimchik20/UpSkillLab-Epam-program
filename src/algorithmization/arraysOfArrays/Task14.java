package algorithmization.arraysOfArrays;

import java.util.Arrays;

public class Task14 { // Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
                      // ЭТО кстати невозможно, если матрица 3 на 10, то в последнем столбе 10 единиц не влезет в 3 ячейки, а m*n - прямоугольная матрица.
    public static void main(String[] args) {

        int m = (int) (Math.random() * 10+3);
        int n = (int) (Math.random() * 10+3);
        byte[][] binaryMatrix = new byte[m][n];

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||");

        for (int i = 0; i < binaryMatrix.length; i++) {
            for (int j = i; j < binaryMatrix[i].length; j++) {
                binaryMatrix[i][j]=1;
            }
        }
        for (int i = 0; i < binaryMatrix.length; i++) {
            for (int j = 0; j < binaryMatrix[i].length; j++) {
                System.out.print(binaryMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
