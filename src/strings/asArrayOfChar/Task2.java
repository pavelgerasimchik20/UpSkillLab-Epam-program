package strings.asArrayOfChar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 { // Замените в строке все вхождения 'word' на 'letter'
    public static void main(String[] args) {

        String str = "     word isn`t a sparrow... word вылЕтит - не пойммаешь word! ";
        wordToLetter(str);
    }

    private static void wordToLetter(String str) {
        Pattern pattern = Pattern.compile("word");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            str = str.replace("word","letter");
        }
        System.out.println(str);
    }
}
