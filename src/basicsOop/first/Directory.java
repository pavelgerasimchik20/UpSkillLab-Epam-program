package basicsOop.first;

public class Directory {

    private String path;

    public Directory(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "path='" + path + '\'' +
                '}';
    }
}
