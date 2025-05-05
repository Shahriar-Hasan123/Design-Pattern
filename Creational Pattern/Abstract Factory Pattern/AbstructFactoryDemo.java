public class AbstructFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.geFactory(false);
        Shape shape1 = shapeFactory.getShape("Square");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.geFactory(true);
        Shape shape3 = shapeFactory1.getShape("Rounded Square");
        shape3.draw();

        Shape shape4 = shapeFactory1.getShape("Rounded Rectangle");
        shape4.draw();
    }
}
