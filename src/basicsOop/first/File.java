package basicsOop.first;

public class File {

    private String name;
    private Directory directory;

    public File(String name) {
        this.name = name;
    }

    public File(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
    }

    public Directory getDirectory() {
        return directory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
