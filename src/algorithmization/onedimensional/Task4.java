package algorithmization.onedimensional;

import java.util.Arrays;

public class Task4 { // Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
    public static void main(String[] args) {


        int[] arr = new int[]{33, 51, 74, 11, 8, 0, 13, 54, 78, 111};
        System.out.println("before " + Arrays.toString(arr));
        swapMinMaxElement(arr);
        System.out.println("after " + Arrays.toString(arr));

    }

    private static int[] swapMinMaxElement(int[] array) {

        int min = 1000;
        int max = 0;
        int minPosition = 0;
        int maxPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minPosition = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxPosition = i;
            }
        }
        int temporary = array[minPosition];
        array[minPosition] = array[maxPosition];
        array[maxPosition] = temporary;
        return array;
    }
}
