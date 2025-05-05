public class Car {
    private int wheels;
    private String engine;
    private boolean airConditioning;
    private boolean sunroof;
    private String color;

    public Car(CarBuilder obj) {
        this.wheels = obj.wheels;
        this.engine = obj.engine;
        this.airConditioning = obj.airConditioning;
        this.sunroof = obj.sunroof;
        this.color = obj.color;
    }

    public void showSpecification() {
        System.out.println("Car Specifications");
        System.out.println("Wheels: " + wheels);
        System.out.println("Engine: " + engine);
        System.out.println("Air Conditioning: " + (airConditioning ? "Yes" : "No"));
        System.out.println("Sunroof: " + (sunroof ? "Yes" : "No"));
        System.out.println("Color: " + color);
    }

}