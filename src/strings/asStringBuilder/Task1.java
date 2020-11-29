package strings.asStringBuilder;

public class Task1 { // Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

    public static void main(String[] args) {

        System.out.println(" Наибольшее количество пробелов подряд = "+countMaxOfSpaces(text));
    }

    private static int countMaxOfSpaces(String text) {
        int count = 0;
        int maxValue = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                count++;
                if (count > maxValue) {
                    
                    maxValue = count;
                }
            } else count = 0;
        }return maxValue;
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

