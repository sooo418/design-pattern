package factory.first;

public class CarFactory {

    public Car createCar(String productName) {

        Car car = null;

        if (productName.equalsIgnoreCase("sonata")) {
            car = new Sonata(productName);
        } else if (productName.equalsIgnoreCase("genesis")) {
            car = new Genesis(productName);
        } else if (productName.equalsIgnoreCase("grandeur")) {
            car = new Grandeur(productName);
        }

        return car;
    }
}
