package algorithmization.decompositionUsingMethods;

import java.util.Arrays;

public class Task10 { // Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

    private static int i;

    public static void main(String[] args) {

        int N = 145_990;
        System.out.println(Arrays.toString(getArray(N)));
    }

    private static int[] getArray(int n) {
        int copyN = n;
        while (n > 0) {
            n = n / 10;
            i++;
        }
        int[] arr = new int[i];
        for (int j = 0; j <arr.length ; j++) {
            arr[j] = copyN % 10;
            copyN = copyN / 10;
        }
        return arr;
    }

}
