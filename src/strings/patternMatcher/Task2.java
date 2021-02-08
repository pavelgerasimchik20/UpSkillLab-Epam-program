package strings.patternMatcher;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    private static final Pattern PATTERN = Pattern.compile("<(.|\\n)+?>");

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

    private static void analyzer(String str) {
        Matcher matcher = PATTERN.matcher(str);
        while (matcher.find()) {
            String tag = matcher.group();
            TagType type = findType(tag);
            String body = findBody(tag, type, str);
            System.out.println(tag + " " + type + (Objects.nonNull(body) ? ", body: " + body : ""));
        }
    }

    private static TagType findType(String tag) {
        Matcher matcher = Pattern.compile("</(.|\\n)+?>").matcher(tag);
        if (matcher.find()) {
            return TagType.END;
        }
        matcher = Pattern.compile("<(.|\\n)+?/>").matcher(tag);
        if (matcher.find()) {
            return TagType.EMPTY;
        }
        return TagType.START;
    }

    private static String findBody(String tag, TagType type, String str) {
        if (type != TagType.START) {
            return null;
        }
        String body = null;
        Matcher matcher = Pattern.compile("(\\w+)").matcher(tag);
        if (matcher.find()) {
            String tagName = matcher.group();
            System.out.println(tagName);
            matcher = Pattern.compile(tag + ".*" + "</" + tagName + ">").matcher(str);
            if (matcher.find()) {
                body = matcher.group();
                body = body.replace(tag, "");
                body = body.replace("</" + tagName + ">", "");
            }
        }
        return body;
    }

    private enum TagType {
        START("start"), EMPTY("empty"), END("end");
        private String name;

        TagType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
