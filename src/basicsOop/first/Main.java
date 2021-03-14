package basicsOop.first;

public class Main {

    public static void main(String[] args) {
        TextFile myText = new TextFile("myText", new Directory("by/gerasimchik/src/basicsOop/first/files/myText.txt"));
        TextFile newText = myText.createText("... this is my new text...");
        myText.addText("I am adding some text");
        myText.print();
        myText.remove();
        myText.renameFile("BHBSDBFDSBJJQKWF");
        myText.print();
        newText.print();
        newText.renameFile("Old text");
        newText.print();
        System.out.println("MyText->" + myText.getDirectory());
    }
}
