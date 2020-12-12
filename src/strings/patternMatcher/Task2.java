package strings.patternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String xml = "<notes>\n" +
                "\n" +
                "   <note id = \"1\">\n" +
                "\n" +
                "       <to>Вася</to>\n" +
                "\n" +
                "       <from>Света</from>\n" +
                "\n" +
                "       <heading>Напоминание</heading>\n" +
                "\n" +
                "       <body>Позвони мне завтра!</body>\n" +
                "\n" +
                "   </note>\n" +
                "\n" +
                "   <note id = \"2\">\n" +
                "\n" +
                "       <to>Петя</to>\n" +
                "\n" +
                "       <from>Маша</from>\n" +
                "\n" +
                "       <heading>Важное напоминание</heading>\n" +
                "\n" +
                "       <body/>\n" +
                "\n" +
                "   </note>\n" +
                "\n" +
                "</notes>";
        analyzer(xml);
    }
    private static void analyzer (String str){
        Matcher matcher = Pattern.compile("(<.*>)(</.*>)").matcher(str);

    }
}
