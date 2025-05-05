public class PrototypePatternDemo {
    public static void main(String[] args) throws InterruptedException {
        Shape orginalCircle = new Circle();
        System.out.println("Shape Type: " + orginalCircle.getType());
        orginalCircle.draw();

        // clone object
        Shape cloneCircle = (Shape) orginalCircle.clone();
        System.out.println("Shape Type: " + cloneCircle.getType());
        cloneCircle.draw();

        // same for Square

    }
}
