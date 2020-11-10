package firstModule.cycles;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Task_7 { // Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

    private static long firstNum;                      // long только для того, чтобы пользователь мог написать немного больше цифр в число  ))
    private static long secondNum;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            firstNum = scanner.nextLong();
            if (firstNum < 0) {
                firstNum = Math.abs(firstNum);
            }
            System.out.println("Enter second number: ");
            secondNum = scanner.nextLong();
            if (secondNum < 0) {
                secondNum = Math.abs(secondNum);
            }
            System.out.println("Common digits: " + compareArrays(createArray(firstNum), createArray(secondNum))); // омайгад... надеюсь это тебе понравится ))
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Enter integer number !");
        }
    }

    public static Long[] createArray(long anyNumber) {
        Long[] array = new Long[20];
        int i = 0;
        if (anyNumber == 0) {
            array[i] = Long.valueOf(0);
        }
        while (anyNumber > 0) {
            array[i] = anyNumber % 10;
            anyNumber = anyNumber / 10;
            i++;
        }
        return array;
    }

    public static Set<Long> compareArrays(Long[] a, Long[] b) {
        Set<Long> set = new HashSet();
        for (int i = 0; i < a.length; i++) {
            Long x = a[i];
            for (int j = 0; j < b.length; j++) {
                if (x == b[j] && x != null) {
                    set.add(b[j]);
                    break;
                }
            }
        }
        return set;
    }
}
