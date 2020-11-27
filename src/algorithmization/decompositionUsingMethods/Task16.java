package algorithmization.decompositionUsingMethods;

import java.util.Arrays;

public class Task16 { //Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    // Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

    private static long sum = 0;
    private static int n;

    public static void main(String[] args) {

        n = 3;
        findSum(n);

    }

    private static void findSum(int n) {
        int firstNumber = findFirstNum(n);
        int lastNumber = findLastNum(n);
        while (firstNumber <= lastNumber) {
            if (ofOdd(firstNumber)) {
                sum += firstNumber;
            }
            firstNumber++;
        }
        System.out.println(sum);
    }

    private static boolean ofOdd(int number) {
        String numberStr = "" + number;
        String[] array = numberStr.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("2") || array[i].equals("4") || array[i].equals("6") || array[i].equals("8") || array[i].equals("0")) {
                return false;
            }
        }
        return true;
    }

    private static int findFirstNum(int n) {
        int result = 0;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        for (int i = 0; i < arr.length; i++) {
            result = (int) (result + (arr[i] * Math.pow(10, i)));
        }
        return result;
    }

    private static int findLastNum(int n) {
        int result = 0;
        int[] arr = new int[n];
        Arrays.fill(arr, 9);
        for (int i = 0; i < arr.length; i++) {
            result = (int) (result + (arr[i] * Math.pow(10, i)));
        }
        return result;
    }
}
