package algorithmization.decompositionUsingMethods;

public class Task17 { //  Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
    // Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {

        int num = 100;
        System.out.println(countSubtraction(num));
    }

    private static int countSubtraction(int num) {
        int n = num;
        int result = 0;
        while (num > 0) {
            num -= sumOfDigits(n);
            result++;
        }
        return result;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        int digits = countDigits(num);
        int[] arr = new int[digits];
        while (num > 0) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = num % 10;
                num = num / 10;
                sum += arr[j];
            }
        }
        return sum;
    }

    private static int countDigits(int i) {
        int digits = 0;
        while (i > 0) {
            i /= 10;
            digits++;
        }
        return digits;
    }
}



