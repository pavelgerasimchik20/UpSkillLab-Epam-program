package basicsOop.first;

public class TextFile extends File {

    private String text = "" ;

    public TextFile(String name, Directory directory) {
        super(name, directory);
    }

    public TextFile(String name, Directory directory, String text) {
        super(name, directory);
        this.text = text;
    }

    public TextFile(String name) {
        super(name);
    }

    public TextFile(String name, String text) {
        super(name);
        this.text = text;
    }

    public void addText(String newtext) {
        text += newtext;
    }

    public TextFile createText(String text) {
        TextFile txt = new TextFile("New text");
        txt.addText(text);
        return txt;
    }

    public void renameFile(String newName) {
        this.setName(newName);
    }

    public void print() {
        System.out.println("FileName: " + super.getName() + "\nText: " + this.text);
    }

    public void remove() {
        this.text = "" ;
    }

}
