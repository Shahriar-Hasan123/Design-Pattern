public class Client {
    public static void main(String[] args) {
        Car car1 = new CarBuilder(4, "V8 Engine")
                .addColor("Black")
                .addAirConditioning()
                .addSunroof()
                .build();
        car1.showSpecification();

        System.out.println();
        Car car2 = new CarBuilder(4, "Tesla")
                .addAirConditioning()
                .build();
        car2.showSpecification();

    }
}


