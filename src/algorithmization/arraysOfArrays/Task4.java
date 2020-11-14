package algorithmization.arraysOfArrays;

import java.util.Arrays;

public class Task4 { // Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    public static void main(String[] args) {

        int count = 0;
        int matrixSize = (int) (Math.random() * 12+1);
        int[][] squareMatrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < squareMatrix.length; i++) {
            count=0;
            for (int j = 0; j < squareMatrix[i].length; j++) {
                if (i % 2 == 0) {
                    squareMatrix[i][j] = 1 + count;
                    System.out.print(squareMatrix[i][j] + "\t");
                    count++;
                }else{
                    squareMatrix[i][j] = matrixSize - count;
                    System.out.print(squareMatrix[i][j] + "\t");
                    count++;
                }
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(squareMatrix));
    }
}
