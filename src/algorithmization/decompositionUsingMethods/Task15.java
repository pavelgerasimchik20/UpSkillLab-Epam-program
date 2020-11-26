package algorithmization.decompositionUsingMethods;

public class Task15 extends Task14 { // Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789)
    public static void main(String[] args) {

        int n = 4;
        searchNumber(n);
    }

    private static void searchNumber(double n) {
        double arraySize = Math.pow(10, n);
        int[] array = new int[(int) arraySize];
        for (int i = 0; i < array.length; i++) {
            if (chechNumber(array[i])) {
                System.out.println(array[i]);
            }
        }
    }

    private static boolean chechNumber(int i) {
        if (i > 11) {
            findExponent(i);
            int[] arr = new int[exponent];
            while (i > 0) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = i % 10;
                    i = i / 10;
                }
            }
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] == arr[j + 1] + 1) {
                    return true;
                }
            }
        } else {
            return false;
        }
    }
}
