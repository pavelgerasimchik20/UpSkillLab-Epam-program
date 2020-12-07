package strings.asArrayOfChar;

import java.util.Scanner;

public class Task3 { // В строке найти количество цифр.

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку для подсчета в ней цифр: ");
            String str = scanner.nextLine();
            int count = 0;
            char zn;
            for (int i = 0; i < str.length(); i++) {
                zn = str.charAt(i);
                if (zn == '1' || zn == '2' || zn == '3' || zn == '4' || zn == '5' || zn == '6' || zn == '7' || zn == '8' || zn == '9' || zn == '0')
                    count++;
            }
            System.out.println("В данной строке " + count + " цифр");
    }
}
