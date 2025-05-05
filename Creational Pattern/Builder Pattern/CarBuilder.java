
public class CarBuilder {
    public int wheels;
    public String engine;
    public boolean airConditioning = false;
    public boolean sunroof = false;
    public String color = null;

    public CarBuilder(int wheels, String engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    public CarBuilder addAirConditioning() {
        this.airConditioning = true;
        return this;
    }

    public CarBuilder addSunroof() {
        this.sunroof = true;
        return this;
    }

    public CarBuilder addColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(this);
    }

}


