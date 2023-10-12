package OOPs_Part_2.Polymorphism.Challenge1;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("2023 Maruti Suzuki Baleno Sigma");
        runRace(car);

        Car baleno = new GasPoweredCar("2023 Maruti Suzuki Baleno Sigma",
                15.4,6);
        runRace(baleno);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.runEngine();
    }
}
