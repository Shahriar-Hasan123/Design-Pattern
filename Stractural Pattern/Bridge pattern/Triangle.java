public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }
    public void applyColor()
    {
        System.out.print("Tringle filled with color ");
        color.applyColor();
    }

}

