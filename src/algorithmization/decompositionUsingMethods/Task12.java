package algorithmization.decompositionUsingMethods;

import java.util.Arrays;

public class Task12 {
    //  Даны натуральные числа К и N.
    // Написать метод(методы) формирования массива А, элементами которого являются числа,
    // сумма цифр которых равна К и которые не большее N.
    private static int lastDigit;
    private static char digit;
    private static int count;
    private static int i;

    public static void main(String[] args) {

        int K = 55;
        int N = 666;
        onCreateArray(K, N);
    }

    private static void onCreateArray(int k, int n) {
        int random;
        int[]array = new int[20];
        for (i = 0; k > 9;i++){
            random = (int) (Math.random()*10);
            array[i]= random;
            k-=random;
        }
        array[i]=k;
        System.out.println(Arrays.toString(array));
    }

}
