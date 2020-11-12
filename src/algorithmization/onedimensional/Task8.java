package algorithmization.onedimensional;

import java.util.Arrays;

public class Task8 { // Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность, выбросив из исходной те члены,
    // которые равны min(а1 ,а2 ,..., аn).
    public static void main(String[] args) {

        int[] array = new int[]{3, 1, 5, 4, 3, 7, 8, 3, 9, 1, 7, 37, 1, 73, 1, 3, 2, 1, 1, 1, 2, 3, 1, 4, 66};
        System.out.println("Задан массив: " + Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент в заданном массиве: " + min);
        int countForMinValue = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == min) {
                countForMinValue++;
            }
        }
        int[] newArray = new int[array.length - countForMinValue];
        for (int k = 0, h = 0; h < newArray.length && k < array.length; k++) {
            if (array[k] != min) {
                newArray[h] = array[k];
                h++;                        // а вот тут было тяжелоооооо
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(newArray));
    }
}
