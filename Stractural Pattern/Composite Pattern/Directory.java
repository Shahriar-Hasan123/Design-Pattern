import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private List<FileSystem> children = new ArrayList<>();
    private String directoryName;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void add(FileSystem component) {
        children.add(component);
    }

    public void remove(FileSystem component) {
        children.remove(component);
    }

    public void showDetails(String space) {
        System.out.println(space + "-Directory: " + directoryName);
        for (FileSystem child : children)
            child.showDetails(space + " ");
    }

}
