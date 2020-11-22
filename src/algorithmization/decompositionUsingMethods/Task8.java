package algorithmization.decompositionUsingMethods;

import java.util.Scanner;

public class Task8 { // Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean checked=false;
        while (!checked) {
            System.out.println("Enter start position:");
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            if (k <= arr.length - 3) {
                int temp = getSum(arr, k);
                System.out.println("Result: " + temp);
                checked = true;
            } else {
                System.out.println("Min available index: " + (arr.length - 3) + "\nplease enter correct index");
            }
        }
    }

    public static int getSum(int[] array, int k) {
        return array[k] + array[k + 1] + array[k + 2];
    }
}
