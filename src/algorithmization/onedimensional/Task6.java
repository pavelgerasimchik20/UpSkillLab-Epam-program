package algorithmization.onedimensional;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Task6 { //   Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.
    public static void main(String... args) {

        Random random = new Random();
        int sum = 0;
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            BigInteger bigInteger = BigInteger.valueOf(i+1); // из условия порядковый номер i+1, т.к. нумерация в массиве с 0...
            boolean probablePrime = bigInteger.isProbablePrime(i+1);
            if(probablePrime){
                sum+=array[i];
            }
        }
        System.out.println("Наш сгенерированный массив: " + Arrays.toString(array));
        System.out.println("Сумма по заданию: " + sum);
    }
}               // на калькуляторе перепроверил даже зачем-то ))
