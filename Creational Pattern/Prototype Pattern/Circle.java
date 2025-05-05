public class Circle extends Shape {
    public Circle() throws InterruptedException    //throw exception for thread.sleep()
    {
        type = "Circle";
        Thread.sleep(2000);              
    }
    public void draw()
    {
        System.out.println("Inside Circle:: draw()");
    }
}
