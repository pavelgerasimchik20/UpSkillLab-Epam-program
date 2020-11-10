package firstModule.cycles;

import java.util.Scanner;

public class Task_5 { //  Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ну вот тут то можно вводить ЧТО УГОДНО без обработки и проверок : ");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        StringBuilder temporary = new StringBuilder("");
        for (char everyChar : charArray) {
            temporary.append(String.format("\\u%05x ", (int) everyChar));
        }
        System.out.println("На языке юникода это выглядит так: " + temporary);
    }
}
