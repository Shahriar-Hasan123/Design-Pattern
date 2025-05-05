public class Client {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(new GreenColor());
        shape1.applyColor();

        Shape shape2 = new Pentagon(new ReadColor());
        shape2.applyColor();
    }
}

