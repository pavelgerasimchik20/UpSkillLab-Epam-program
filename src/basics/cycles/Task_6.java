package basics.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_6 { //  Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("m = ");
            int m = scan.nextInt();
            System.out.println("n = ");
            int n = scan.nextInt();
            System.out.println("Interval " + m + " ... " + n);

            for (; m <= n; m++) {
                System.out.println("Divisor " + m + " is: ");
                for (int i = m - 1; i > 1; i--) {
                    int b = m % i;
                    if (b == 0)
                        System.out.println("            " + i);
                }
            }

        }catch (InputMismatchException inputMismatchException){
            System.out.println(" Please, enter natural number !");
        }
    }

}
