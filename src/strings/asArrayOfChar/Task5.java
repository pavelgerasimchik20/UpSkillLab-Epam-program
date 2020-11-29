package strings.asArrayOfChar;

import javax.swing.*;

public class Task5 { // Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
    // заменить на одиночные пробелы. Крайние пробелы в строке удалить.
    public static void main(String[] args) {

        String str;
        str = JOptionPane.showInputDialog("Введите текст :");
        str = str.replaceAll("\\s+", " ");
        String trimStr = str.trim();

        JOptionPane.showMessageDialog(null, trimStr);

    }
}
