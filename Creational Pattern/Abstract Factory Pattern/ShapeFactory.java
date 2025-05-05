public class ShapeFactory implements AbstractFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Square"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("Rectangle"))
            return new Reactangle();
        return null;
    }
}