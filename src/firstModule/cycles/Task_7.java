package firstModule.cycles;

import java.util.Scanner;

public class Task_7 { // Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        numberEnter(firstNum);
        numberEnter(secondNum);
    }

    public static int[] numberEnter(int digit) {
        int[] array = new int[10];
        int i = 0;
        while (digit > 0) {
            array[i] = digit % 10;
            digit = digit / 10;
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] != 0) {
                System.out.print(" " + array[j]);
            }
        }
        System.out.println(" ");
        return array;
    }
}
