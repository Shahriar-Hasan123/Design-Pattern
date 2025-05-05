public class NameCollection implements Collection {
    private String[] names = { "Hasan", "Karim", "Rakib", "Soruv" };

    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator {
        int index = 0;

        public boolean hasNext() {
            return index < names.length;
        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
