package basics.branching;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;
        if (x <= 3) {
            y = (Math.pow(x, 2) - 3 * x + 9);
        } else {
            y =( 1 / (Math.pow(x, 3) + 6) );
        }
        System.out.println("y= " + y);
    }
}
