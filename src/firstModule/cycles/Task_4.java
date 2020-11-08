package firstModule.cycles;

import java.math.BigInteger;
import java.util.Scanner;

public class Task_4 { // Составить программу нахождения произведения квадратов первых двухсот чисел

    public static void main(String[] args) {

            int num = 200;
            System.out.println("Произведение квадратов первых "+ num + " чисел = "+ Factorial.factorial(num));

    }
}
class Factorial {

    static BigInteger factorial(int num) {
        BigInteger bigInteger = BigInteger.ONE;
        int runDigit = 1;
        for (; runDigit <= num; runDigit++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(runDigit*runDigit));
        }
        return bigInteger;

    }
}

