public class RoundedShapeFactory implements AbstractFactory{
    public Shape getShape(String shapeType)
    {
        if(shapeType.equalsIgnoreCase("RoundedSquare"))
            return new RoundedSquare();
        else if (shapeType.equalsIgnoreCase("RoundedRectangle"))
            return new RoundedRectangle();
        return null;
    }
}
