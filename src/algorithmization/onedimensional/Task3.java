package algorithmization.onedimensional;

import java.util.Arrays;

public class Task3 {// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

    public static void main(String[] args) {

        int moreAmount = 0;
        int lessAmount = 0;
        int zeroAmount = 0;
        int[] vINTik = new int[100];
        for (int i = 0; i < vINTik.length; i++) {
            vINTik[i] = (int) (Math.random() * 200 - 100);
            if (vINTik[i] > 0) {
                moreAmount++;
            } else if (vINTik[i] < 0) {
                lessAmount++;
            } else {
                zeroAmount++;
            }
        }
        System.out.println(Arrays.toString(vINTik) + "\nБольше нуля= " + moreAmount + " элементов\nМеньше нуля= " + lessAmount + " элементов\nНулей= " + zeroAmount + " шт.");
    }
}
