package basics.linear;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        double inputVal = 1, swapVal;
        while (inputVal != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ENTER DOUBLE VALUE in format XXX.YYY ");
            inputVal = scanner.nextDouble();
            swapVal = (inputVal * 1000) % 1000 + (int) inputVal / 1000.0;
            System.out.println(swapVal);
            System.out.println(" enter 0 to exit ");
        }
    }
}
