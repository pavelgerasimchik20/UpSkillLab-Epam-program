package strings.asArrayOfChar;

import javax.swing.*;

public class Task4 { //  В строке найти количество чисел.
    public static void main(String[] args) {

        String str;
        int count = 0;
        str = JOptionPane.showInputDialog("Введите текст :");
        str = str.replaceAll("\\D+", " ");
        String trimStr = str.trim();
        String[] txt = trimStr.split(" +");
        for (String number: txt){
            count++;
        }
        JOptionPane.showMessageDialog(null, "Количество чисел в данном тексте = " + count);

    }
}
