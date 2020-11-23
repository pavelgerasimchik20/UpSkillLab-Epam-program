package algorithmization.decompositionUsingMethods;

import java.util.Arrays;

public class Task12 {
    //  Даны натуральные числа К и N.
    // Написать метод(методы) формирования массива А, элементами которого являются числа,
    // сумма цифр которых равна К и которые не большее N.
    private static int lastDigit;
    private static int digit;
    private static int count;
    private static int i;
    private static int K = 16;
    private static int N = 5000;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(createArrayA()));

    }

    private static int[] getArrayOfDigits(int k) {
        int random;
        int[] array = new int[20];
        for (i = 0; k > 9; i++) {
            random = (int) (Math.random() * 10);
            array[i] = random;
            k -= random;
        }
        array[i] = k;
        return array;
    }

    private static long getNumber(int[] arr) {
        long num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            num = (long) (num + arr[i] * Math.pow(10, i));
        }
        return num;
    }

    private static int[] createArrayA() {
        int[] arrayA = new int[10];
        for (int j = 0; j < arrayA.length; j++) {
            digit = (int) getNumber(getArrayOfDigits(K));
            if (digit < N) {
                arrayA[j]=digit;
            }
        }
        return arrayA;
    }
}
