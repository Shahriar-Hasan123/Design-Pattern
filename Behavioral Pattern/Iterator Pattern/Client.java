public class Client {
    public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection();
        Iterator nameIterator = nameCollection.getIterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }
    }
}

