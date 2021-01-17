package withClasses.aggregation;

public class Task1 {
    public static void main(String[] args) {

        Text text = new Text(" new text by composition");
        text.printTitle();
        text.printText();
        text.addText(" I am new text");
        text.printText();
        text.addText(" Hello )) ");
        text.printText();
        System.out.println(text);
    }
}

class Text {
    private final String title = "It is the title";
    private Sentence sentence;
    private Word word;
    private String text;

    public void printTitle(){
        System.out.println(title);
    }
    public void printText(){
        System.out.println(text);
    }

    @Override
    public String toString() {
        return "I am text by toString:"+ text;
    }

    public Text(String text) {
        this.sentence = new Sentence(text);
        this.text = sentence.toString();
    }
    public String addText(String str){
        this.word = new Word(str);
        this.text += word.toString();
        return text;
    }
}

class Sentence {
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return sentence;
    }
}

class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }

}
