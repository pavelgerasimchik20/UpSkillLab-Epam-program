package algorithmization.arraysOfArrays;

public class Task6 { // бабочка )
    public static void main(String[] args) {

        final int matrixSize = 14;

        int[][] butterfly = new int[matrixSize][matrixSize];

        for (int i = 0; i < butterfly.length / 2 + 1; i++) {
            for (int j = i; j < butterfly.length - i; j++) {
                butterfly[i][j] = 1;
                butterfly[butterfly.length - i - 1][j] = 1;
            }
        }
        for (int i = 0; i< butterfly.length;i++) {
            for (int j=0; j< butterfly[i].length;j++) {
                System.out.print(" " + butterfly[i][j] + " ");
            }
            System.out.println();
        }
    }
}

