package algorithmization.decompositionUsingMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task14 {  // Натуральное число, в записи которого n цифр, называется числом Армстронга,
    // если сумма его цифр, возведенная в степень n, равна самому числу.
    // Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию
    private static Scanner scanner = new Scanner(System.in);
    private static int exponent;
    private static long sum=0;

    public static void main(String[] args) {
        System.out.println(" Enter finish number: ");
        searchArmstrong(scanner.nextInt());

    }

    private static void searchArmstrong(int scanner) {
        List<Object> list = new ArrayList<>();
        for (int i = 1; i <= scanner; i++) {
            if (checkNumber(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    private static boolean checkNumber(int i) {
        exponent = 0;
        sum= 0;
        findExponent(i);
        decompositIntoNumbers(i);
        if(sum == i){
            return true;
        }else return false;
    }

    private static void decompositIntoNumbers(int i) {
        int[] arr = new int[exponent];
        while (i > 0) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = i % 10;
                i = i / 10;
                sum = (long) (sum + Math.pow(arr[j], exponent));
            }
        }
    }

    private static void findExponent(int i) {
        while (i > 0) {
            i /= 10;
            exponent++;
        }
    }

}
