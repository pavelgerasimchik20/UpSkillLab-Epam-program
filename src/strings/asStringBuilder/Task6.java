package strings.asStringBuilder;

public class Task6 { // Из заданной строки получить новую, повторив каждый символ дважды.

    public static void main(String[] args) {

        dublicationLetters(Task2.text);
    }

    private static void dublicationLetters(String text) {
        char[] chars = text.toCharArray();
        StringBuilder newtext = new StringBuilder("");
        for (char ch: chars) {
            newtext.append(ch);
            newtext.append(ch);
        }
        System.out.println(newtext);
    }
}
