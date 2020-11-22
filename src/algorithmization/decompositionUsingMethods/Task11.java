package algorithmization.decompositionUsingMethods;

public class Task11 { // Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

    private static int i;
    private static int j;

    public static void main(String[] args) {

        int firstNum = 134533;
        int secondNum = 1345;
        System.out.println(whoIsMore(firstNum,secondNum));

    }

    public static int whoIsMore(int a, int b) {
        int copyA = a;
        while (a > 0) {
            a = a / 10;
            i++;
        }
        int copyB=b;
        while (b > 0) {
            b = b / 10;
            j++;
        }
        if (i > j) {
            return copyA;
        } else if (j > i) {
            return copyB;
        } else {
            System.out.println("количество цифр в числах ровно");
        }
        return -1;
    }
}
