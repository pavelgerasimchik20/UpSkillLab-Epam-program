package basics.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 { // Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("Введите любое целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int inputDigit = scanner.nextInt();
            for (int startDigit = 1; startDigit < inputDigit; startDigit++) {
                sum += startDigit;
            }
            System.out.println("Результат: " + sum);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Необходимо ввести целое число !");
        }
    }
}
