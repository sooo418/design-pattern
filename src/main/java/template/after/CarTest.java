package template.after;

public class CarTest {

    public static void main(String[] args) {

        AICar myCar = new AICar();
        myCar.run();
        System.out.println("*****************************");

        ManualCar herCar = new ManualCar();
        herCar.run();
        System.out.println("*****************************");

        HybridCar yourCar = new HybridCar();
        yourCar.run();
        System.out.println("*****************************");
    }
}
