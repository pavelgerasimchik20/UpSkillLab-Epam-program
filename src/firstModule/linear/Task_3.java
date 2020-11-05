package firstModule.linear;

import static java.lang.Math.*;

public class Task_3 {

    private static final double X_TO_RADIANS = Math.toRadians(random() * 360);
    private static final double Y_TO_RADIANS = Math.toRadians(random() * 360);

    public static void main(String[] args) {

        double result = (sin(X_TO_RADIANS) + cos(Y_TO_RADIANS)) / (cos(X_TO_RADIANS) - sin(Y_TO_RADIANS)) * tan(X_TO_RADIANS*Y_TO_RADIANS);
        System.out.println("function calculation result --> " + result);
    }
}
