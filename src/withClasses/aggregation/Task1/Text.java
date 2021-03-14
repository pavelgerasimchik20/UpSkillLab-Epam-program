package withClasses.aggregation.Task1;

import java.util.Arrays;

public class Text {

    private final String title = "Title";
    private Sentence[] sentence;
    private Word word;
    private String text;

    public Text(Sentence... sentence) {
        this.text = Arrays.toString(sentence);
    }
    public Text(Word word) {
        this.text = word.toString();
    }

    public Text(String text) {
        this.text = text;
    }

    public void printTitle(){
        System.out.println(title);
    }

    public void printText(){
        System.out.println(text);
    }

    public String addText(String str){
        this.word = new Word(str);
        this.text += word.toString();
        return text;
    }


}