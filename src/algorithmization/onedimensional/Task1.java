package algorithmization.onedimensional;

public class Task1 { // В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
    public static void main(String[] args) {

        int sum = 0;
        int K = 3;
        int[] natural = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < natural.length; i++) {
            if (natural[i] % K == 0) {
                sum+=natural[i];
            }
        }
        System.out.println("Sum = "+ sum);
    }
}
