public class Client {
    public static void main(String[] args) {
        System.out.println("Circle without border");
        Shape circle = new Circle();
        circle.draw();

        System.out.println("Circle with border");
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
    }
}
