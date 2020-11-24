package algorithmization.decompositionUsingMethods;

import java.util.Scanner;

public class Task13 { // Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    // Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println("Введите число n: ");
            int n = scanner.nextInt();
            if (n > 2) {
                searchForTwins(n);
            } else {
                System.out.println("n должно быть больше 2");
            }
        } catch (Exception e) {
            System.out.println("какойт эксепшн )");
        }


    }

    private static void searchForTwins(int n) {
        int n2 = n * 2;
        int[] array = new int[n2 - n + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = n + i;
        }
        for (int j = 0, i = 2; j < array.length-2 || i < array.length; i++, j++) {
            System.out.println("Пара |" + array[j] + "| и |" + array[i] + "|");
        }
    }
}