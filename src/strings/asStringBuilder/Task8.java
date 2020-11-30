package strings.asStringBuilder;

import javax.swing.*;

public class Task8 { //  Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    // Случай, когда самых длинных слов может быть несколько, не обрабатывать.
    public static void main(String[] args) {

        String str;
        String tmp = "";
        int count = 0;
        str = JOptionPane.showInputDialog("Введите текст :");
        String trimStr = str.trim();
        String[] txt = trimStr.split(" +");
        for (String number : txt) {
            if (number.length() > tmp.length()) {
            tmp = number;
            }
        }
        JOptionPane.showMessageDialog(null, tmp);
    }

}
