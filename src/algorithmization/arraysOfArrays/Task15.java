package algorithmization.arraysOfArrays;

public class Task15 { //Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

    private static int min = -20;
    private static int max = 40;
    private static int replaceElement;

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] onCreateMatrix() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = min + (int) (Math.random() * (max - min + 1));
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        return matrix;
    }

    static int searchMaxVal(int[][] myMatrix) {
        replaceElement = myMatrix[0][0];
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (myMatrix[i][j] > replaceElement) {
                    replaceElement = myMatrix[i][j];
                }
            }
        }
        return replaceElement;
    }

    static void replace(int[][] myMatrix, int element) {
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (myMatrix[i][j] % 2 !=0) {
                    myMatrix[i][j]= element;
                }
            }
        }
    }
}

class Test {
    public static void main(String[] args) {

        int[][] myMatrix = Task15.onCreateMatrix();
        System.out.println("|||||||||||s|||||w|||||a|||||p||||||||||||");
        int maxVal = Task15.searchMaxVal(myMatrix);
        Task15.replace(myMatrix,maxVal);
        Task15.printMatrix(myMatrix);
    }
}