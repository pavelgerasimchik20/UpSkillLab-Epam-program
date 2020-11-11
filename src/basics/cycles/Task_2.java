package basics.cycles;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a, b, x, h, y;

        System.out.println(" x= ");
        x = scanner.nextDouble();
        System.out.println("h =");
        h = scanner.nextDouble();
        System.out.println("a=");
        a = scanner.nextDouble();
        System.out.println("b=");
        b = scanner.nextDouble();

        for (x = a; x <= b; x += h) {

            if (x > 2) {
                y = x;
                System.out.println("y =" + y);
            } else {
                y = -x;
                System.out.println("y =" + y);
            }
        }
    }
}
