package firstModule;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task_2 {

    public double a, b, c;

    public double getResult() {
        return (((b + sqrt(pow(b, 2) + 4 * a * c)) / 2) - pow(a, 3) * c + pow(b, -2));
    }
}

class Test_2 {
    public static void main(String[] args) {

        Task_2 task_2 = new Task_2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a value for _a_:");
        task_2.a = scanner.nextDouble();
        if (task_2.a != 0) {
            System.out.println("Please, enter a value for _b_:");
            task_2.b = scanner.nextDouble();
            System.out.println("Please, enter a value for _c_:");
            task_2.c = scanner.nextDouble();
            System.out.println("Result--> " + task_2.getResult());
        } else {
            System.out.println("0 is invalid value for _a_ !!!");
            System.exit(-1);
        }
    }
}
