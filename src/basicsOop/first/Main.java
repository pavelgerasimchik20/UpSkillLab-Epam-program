package basicsOop.first;

public class Main {

    public static void main(String[] args) {
        TextFile myText = new TextFile("myText");
        TextFile newText = myText.createText("... this is my new text...");
        myText.addText("I am adding some text");
        myText.print();
        myText.remove();
        myText.renameFile("BHBSDBFDSBJJQKWF");
        myText.print();
        newText.print();
    }
}
