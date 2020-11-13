package algorithmization.onedimensional;

public class Task7 { // Для последовательности элементов а1, а2, а3,...,аn. найти пару элементов, сумма которых будет наибольшей.

    static int firstPosition = 0;
    static int secondPositiom = 0;
    private static int sumTwoElem;

    public static void main(String[] args) {

        int[] array = new int[]{-500, 1250, -1, -222, 350, 999, -90, 0, 1, 565, 1250};
        searchMaxSumTwoElements(array);
        System.out.println("Найбольшая сумма элементов = " + sumTwoElem + "." +
                " Порядковые номера элементов: " + (firstPosition + 1) + " и " + (secondPositiom + 1));
    }

    public static int searchMaxSumTwoElements(int[] array) {

        sumTwoElem = array[0] + array[1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length && j != i; j++) {
                if (array[i] + array[j] > sumTwoElem) {
                    sumTwoElem = array[i] + array[j];
                    firstPosition = i;
                    secondPositiom = j;
                }
            }
        }
        return sumTwoElem;
    }
}
