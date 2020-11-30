package strings.asStringBuilder;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 { // Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
    // Учитывать только английские буквы.
    public static void main(String... args) {

        String str;
        Pattern patternLower = Pattern.compile("\\p{Lower}");
        Pattern patternUpper = Pattern.compile("\\p{Upper}");
        int countLower = 0;
        int countUpper = 0;
        str = JOptionPane.showInputDialog("Введите текст :");
        Matcher matcherLower = patternLower.matcher(str);
        while (matcherLower.find()) {
            countLower++;
        }
        Matcher matcherUpper = patternUpper.matcher(str);
        while (matcherUpper.find()) {
            countUpper++;
        }
        JOptionPane.showMessageDialog(null, "a lower-case character: " + countLower + "\na upper-case character: " + countUpper);
    }
}
