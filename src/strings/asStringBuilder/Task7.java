package strings.asStringBuilder;

import javax.swing.*;

public class Task7 { // Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    // Например, если было введено "abc cde def", то должно быть выведено "abcdef".
    public static void main(String[] args) {

        removeDublicate();

    }

    private static void removeDublicate() {
        String str;
        str = JOptionPane.showInputDialog("Введите текст :");
        str = new StringBuilder(str).reverse().toString();
        str = str.replaceAll("\\s", "");
        str = str.replaceAll("(.)(?=.*\\1)", "");
        str = new StringBuilder(str).reverse().toString();

        JOptionPane.showMessageDialog(null, str);
    }

}
