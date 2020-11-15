package algorithmization.arraysOfArrays;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class Task7 { // Cформировать квадратную матрицу порядка N по правилу:

    public static void main(String[] args) {

        try {
            System.out.println("Введите размер матрицы ");
            Scanner n = new Scanner(System.in);
            int matrixSize = n.nextInt();
            System.out.println("Размер матрицы [" + matrixSize + "] на [" + matrixSize + "]");
            int countMoreZero = 0;
            double[][] squareMatrix = new double[matrixSize][matrixSize];
            for (int i = 0; i < squareMatrix.length; i++) {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    squareMatrix[i][j] = sin(pow(i, 2) - pow(j, 2) / matrixSize);
                    System.out.print(squareMatrix[i][j] + "   ");
                    if (squareMatrix[i][j] > 0) {
                        countMoreZero++;
                    }
                }
                System.out.println();
            }
            System.out.println("Количество положительных элементов = " + countMoreZero);
        }catch ( NegativeArraySizeException negativeArraySizeException){
            System.out.println("Введите положительное значение !");
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Введите целое число - это же размер матрицы !");
        }
    }
}
