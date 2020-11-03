package firstModule;

final class Task_1 {//Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

    private static double a, b, c, z;

    protected static double getResult(double a, double b, double c) {
        if (a == 3) {
            return c;
        } else {
            return z = ((((a - 3)) * b) / 2) + c;
        }
    }
}

class Test_1 {
    public static void main(String[] args) {
        double res = Task_1.getResult(13, 100, 10);
        System.out.println("z = " + res);
    }
}
