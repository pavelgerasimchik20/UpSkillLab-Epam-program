package algorithmization.onedimensional;

public class Task7 { // Задание не понял, но метод 99 % будет таким )) Наверное смысл в сравнении сумм пар

    public static void main(String[] args) {

        double [] array = new double[20];
        

    }
    public static int searchSumTwoElements(int[] array) {
        int sumTwoElem = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > sumTwoElem) {
                sumTwoElem = array[i] + array[array.length - i - 1];
            }
        }
        return sumTwoElem;
    }
}
