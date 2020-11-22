package algorithmization.decompositionUsingMethods;

public class Task2 { // Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    public static void main(String[] args) {

        int nod = findNOD(findNOD(findNOD(12, 16), 40), 4);
        System.out.println("NOD -> " + nod);
    }

    public static int findNOD(int a, int b) {
        int c = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            c = a + b;
        }
        return c;
    }
}
