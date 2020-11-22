package algorithmization.decompositionUsingMethods;

import javax.swing.*;

public class Task1 { // Найти НОК и НОД двух чисел
    public int findNOD(int a, int b) {
        int c = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            c = a + b;
        }
        return c;
    }

    public int findNOK(int a, int b) {
        int c = (a * b) / findNOD(a, b);
        return c;
    }
}

class Main {
    public static void main(String[] args) {

        Task1 tsk = new Task1();
        int nod = tsk.findNOD(160, 1200);
        int nok = tsk.findNOK(160, 1200);
        JOptionPane.showMessageDialog(null, nod, "Наибольший общий делитель", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, nok, "Наименьшее общее кратное", JOptionPane.PLAIN_MESSAGE);

    }
}
