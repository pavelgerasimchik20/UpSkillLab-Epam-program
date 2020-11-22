package algorithmization.decompositionUsingMethods;

import java.math.BigInteger;

public class Task7 { // Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

    public static void main(String[] args) {

        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 9 ; i+=2) {
            sum = sum.add(factorial(i));  // проверено на калькуляторе )
        }
        System.out.println(sum);

    }

    static BigInteger factorial(int num) {
        BigInteger bigInteger = BigInteger.ONE;
        int runDigit = 1;
        for (; runDigit <= num; runDigit++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(runDigit));
        }
        return bigInteger;

    }
}
