package strings.asStringBuilder;

public class Task5 { // Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

    public static void main(String[] args) {

        countA(Task2.text);
    }

    private static int countA(String text) {
        int result = 0;
        char[] arr = text.toCharArray();
        for (char ch : arr) {
            if (ch == 'a') {
                result++;
            }
        }
        System.out.println(result);
        return result;
    }

}
