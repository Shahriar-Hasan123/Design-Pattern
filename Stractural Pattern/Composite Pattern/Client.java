public class Client {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        
        File file1 = new File("abc.txt");
        File file2 = new File("xyz.php");
        File file3 = new File("pqr.java");

        root.add(home);
        home.add(user);

        home.add(file1);
        home.add(file2);
        user.add(file3);
        root.showDetails("");
    }
}


/*
import java.util.ArrayList;
import java.util.List;

// Component: Common interface for both File and Directory
interface FileSystemComponent {
    void showDetails(String indent);
}

// Leaf: Represents a File
class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}

// Composite: Represents a Directory
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "+ Directory: " + name);
        for (FileSystemComponent child : children) {
            child.showDetails(indent + "  "); // Indentation for hierarchy
        }
    }
}

// Client Code
public class CompositePatternDemo {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");

        root.add(home);
        home.add(user);
        home.add(new File("notes.txt"));
        user.add(new File("photo.jpg"));
        user.add(new File("document.pdf"));

        root.showDetails(""); // Print the whole tree structure
    }
}

 */