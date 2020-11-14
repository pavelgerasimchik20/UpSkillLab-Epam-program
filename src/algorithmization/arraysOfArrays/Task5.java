package algorithmization.arraysOfArrays;

public class Task5 { //  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

    public static void main(String[] args) {

        int matrixSize = (int) (Math.random() * 13 + 1);
        int[][] squareMatrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                squareMatrix[i][j] = 1 + i;
            }
        }

        for (int i = 0; i < squareMatrix.length; i++){
            for (int j = matrixSize-i; j < squareMatrix.length; j++){
                squareMatrix[j][i] = 0;
            }
        }

        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.print(squareMatrix[i][j] + "\t");
            }
            System.out.println();             // нервыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыыы
        }
    }
}
