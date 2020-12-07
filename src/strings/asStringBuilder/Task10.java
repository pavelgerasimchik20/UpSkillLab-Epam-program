package strings.asStringBuilder;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 { // Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
    // восклицательным или вопросительным знаком. Определить количество предложений в строке X.

    public static void main(String... args) {

        String str;
        Pattern pattern = Pattern.compile("[.!?]");

        int count = 0;

        str = JOptionPane.showInputDialog("Введите текст :");
        Matcher matcherLower = pattern.matcher(str);
        while (matcherLower.find()) {
            System.out.println(matcherLower.group());
            count++;
        }

        JOptionPane.showMessageDialog(null, "suggestions = " + count );
    }
}
