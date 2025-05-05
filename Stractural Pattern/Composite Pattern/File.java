public class File implements FileSystem {
    private String fileName;

    public File(String fileName)
    {
        this.fileName = fileName;
    }
    public void showDetails(String space)
    {
        System.err.println(space+"-File: "+fileName);
    }
}
