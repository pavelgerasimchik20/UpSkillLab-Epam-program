package algorithmization.arraysOfArrays;

import javax.swing.*;
import java.util.Arrays;

public class Task16 { // Магическим квадратом порядка n называется квадратная матрица размера nxn,
    // составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
    // Построить такой квадрат.
    public static void main(String[] args) {  // такое.... но зато авторский )))

        int age = Integer.parseInt(JOptionPane.showInputDialog(null,"Введи свой возраст ))","тут напиши сколько полных лет",JOptionPane.QUESTION_MESSAGE));
        onCreateMagicSquare(age);
    }

    private static void onCreateMagicSquare(int age) {
        int[][] magicSquare = new int[4][4];
        int i = 0;
        int j = 1;
        magicSquare[i][i] = age - 20;
        magicSquare[i][j] = j;
        magicSquare[i][j+1] = 12;
        magicSquare[i][j+2] = 7;

        magicSquare[j][i] = 11;
        magicSquare[j][i+1] = 8;
        magicSquare[j][j+1] = age-21;
        magicSquare[j][j+2] = 2;

        magicSquare[j+1][i] = 5;
        magicSquare[j+1][i+1] = 10;
        magicSquare[j+1][j+1] = 3;
        magicSquare[j+1][j+2] = age -18;

        magicSquare[3][i] = 4;
        magicSquare[3][i+1] = age -19;
        magicSquare[3][j+1] = 6;
        magicSquare[3][j+2] = 9;

        String exp = Arrays.toString(magicSquare[0]);
        String exp1 = Arrays.toString(magicSquare[1]);
        String exp2 = Arrays.toString(magicSquare[2]);
        String exp3 = Arrays.toString(magicSquare[3]);

        String res = exp+"\n"+exp1+"\n"+exp2+"\n"+exp3;

        JOptionPane.showConfirmDialog(null,res ,"Магический квадрат твоего возраста",JOptionPane.WARNING_MESSAGE);
    }
}
