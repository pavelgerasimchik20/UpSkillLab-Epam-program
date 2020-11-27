package algorithmization.decompositionUsingMethods;

public class Task15  { // Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789)

    public static void main(String[] args) {

        int n = 3;
        findSequence(0, " ", n);

    }

    private static void findSequence(int start, String out, int n) {
        if (n == 0) {
            System.out.print(out + " ");
            return;
        }
        for (int i = start; i <= 9; i++) {
            String str = out + i;
            findSequence(i + 1, str, n - 1);
        }
    }

}
