package firstModule;

import static java.lang.Math.*;

public class Task_3 {

    private static final double X = Math.random() * 360;
    private static final double Y = Math.random() * 360;

    public static void main(String[] args) {

        double result = (sin(X) + cos(Y)) / (cos(X) - sin(Y)) * tan(X);
        System.out.println("function calculation result" + result);
    }
}
