package algorithmization.onedimensional;

import java.util.Arrays;

import static java.lang.System.out;

public class Task9 { //  В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
    // Если таких чисел несколько, то определить наименьшее из них.

    public static void main(String[] args) {

        int[] arrayOriginal = {100, 11, 111, 110, 101, 11, 100, 101, 1, 100, 111, 11, 101, 110, 1,111};
        int[] arrayForDublicateAmount = new int[arrayOriginal.length];

        int countDublicate = 0;
        int maxRepeat;
        int valueWithMaxRepeat;

        out.println("Задан массив: ");

        for (int i = 0; i < arrayOriginal.length; i++) {
            out.print(arrayOriginal[i] + " ");
            for (int j = 0; j < arrayOriginal.length; j++) {
                if (arrayOriginal[i] == arrayOriginal[j]) {
                    countDublicate++;
                }
            }
            arrayForDublicateAmount[i] = countDublicate;
            countDublicate = 0;
        }
        // out.println("\n Колличества числа повторений элементов " + Arrays.toString(arrayForDublicateAmount)); Для понимания и проверки )

        maxRepeat = arrayForDublicateAmount[0];
        for (int i = 0; i < arrayForDublicateAmount.length; i++) {
            if (maxRepeat < arrayForDublicateAmount[i]) {
                maxRepeat = arrayForDublicateAmount[i];
            }
        }

        valueWithMaxRepeat = arrayOriginal[0];
        for (int i = 0; i < arrayForDublicateAmount.length; i++) {
            if (maxRepeat == arrayForDublicateAmount[i]) {
                if (valueWithMaxRepeat > arrayOriginal[i]) {
                    valueWithMaxRepeat = arrayOriginal[i];
                }
            }

        }
        out.print("\nНаименьшее число с наибольшим кол-вом повторений: " + valueWithMaxRepeat + "\nИндексы данного числа в массиве: ");
        for (int i = 0; i < arrayOriginal.length; i++) {
            if (arrayOriginal[i] == valueWithMaxRepeat) {
                out.print(i + " ");
            }
        }
    }
}
