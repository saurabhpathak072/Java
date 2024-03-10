package OOPS;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarModel("XUV700");
        car.setCarMaker("Mahindra");
        car.setColor("Red");
        car.setConvertible(false);
        car.setDoorCount(4);
        car.describeCar();

        Car car1 = new Car();
        car1.setCarModel("Model X");
        car1.setCarMaker("Tesla");
        car1.setColor("Black");
        car1.setConvertible(true);
        car1.setDoorCount(2);
        car1.describeCar();
    }
}
