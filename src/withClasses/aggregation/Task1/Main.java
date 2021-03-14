package withClasses.aggregation.Task1;

public class Main {
    public static void main(String[] args) {

        Text text = new Text(" new text by composition");
        text.printTitle();
        text.printText();
        text.addText(" I am new text");
        text.printText();
        text.addText(" Hello )) ");
        text.printText();

        Text text1 = new Text(new Word("new Sentence"));
        text1.printTitle();
        text1.printText();
        text1.addText("!!!");
        text1.printText();

        Text text2 = new Text(
                new Sentence("first sentence"),
                new Sentence("but sentence without capital letters.")
        );
        text2.printTitle();
        text2.printText();
        text2.addText(" Author.");
        text2.printText();
    }
}