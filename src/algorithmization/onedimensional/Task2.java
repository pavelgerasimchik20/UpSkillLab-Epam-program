package algorithmization.onedimensional;

public class Task2 {  // Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен
    public static void main(String[] args) {

        long arrayLong[] = new long[]{-8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        long Z = -2;
        int count = 0;
        for (int i = 0; i < arrayLong.length; i++) {
            if (arrayLong[i] > Z) {
                arrayLong[i] = Z;
                count++;
            }
        }
        System.out.println("Amount replacements= " + count);
    }
}
