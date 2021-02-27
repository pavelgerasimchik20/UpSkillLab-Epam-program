package basicsOop.first;

public class File {

    private String name;
    private String header;
    private Directory directory;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
