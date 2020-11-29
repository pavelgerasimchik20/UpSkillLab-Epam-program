package strings.asStringBuilder;

public class Task2 { // В строке вставить после каждого символа 'a' символ 'b'.

    public static void main(String[] args) {

        addB(text);
    }

    private static void addB(String text) {
        text = text.replaceAll("a","ab");
        System.out.println(text);
    }

    private static String text =
            "New divide" +
                    "I remembered black skies, the lightning all around me" +
                    "I remembered each flash as time began to blur" +
                    "Like a startling sign that fate had finally found me" +
                    "and your voice was all I heard, that I get what I deserve" +
                    "So give me reason to prove me wrong," +
                    "to wash this memory clean" +
                    "Let the floods cross the distance in your eyes" +
                    "Give me reason to fill this hole, connect the space between" +
                    "Let it be enough to reach the truth" +
                    "that lies across this new divide" +
                    "There was nothing insight, the memory's left abandoned" +
                    "There was no where to hide, the ashes fell like snow" +
                    "and the ground caved in between where we were standing" +
                    "and your voice was all I heard, that I get what I deserve" +
                    "So give me reason to prove me wrong," +
                    "to wash this memory clean" +
                    "Let the floods cross the distance in your eyes," +
                    "across this new          divide";

}
