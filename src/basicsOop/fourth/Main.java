package basicsOop.fourth;

import basicsOop.fourth.dragonscave.Cave;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cave dragonsCave = new Cave();
        int value = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println(
                        "1 - Список сокровищ \n" +
                                "2 - Поиск самого дорогого сокровища \n" +
                                "3 - Подбор сокрощих на заданную сумму \n" +
                                "0 - EXIT"
                );
                value = scanner.nextInt();
                switch (value) {
                    case (1):
                        dragonsCave.show();
                        break;
                    case (2):
                        dragonsCave.findExpensive();
                        break;
                    case (3):
                        System.out.println("Введите сумму: ");
                        double sum = scanner.nextDouble();
                        dragonsCave.selectTreasure(sum);
                        break;
                    default:
                        System.out.println("Выберите корректный пункт в меню");
                        break;
                }
            } while (value != 0);
        } catch (InputMismatchException e) {
            System.out.println("Необходимо вводить число");
        }
    }
}
