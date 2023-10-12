package OOPs_Part_2.Polymorphism.Challenge1;

//public class Models {
//    private GasPoweredCar gasPoweredCar;
//    private ElectricCar electricCar;
//    private HybridCar hybridCar;
//
//    public GasPoweredCar getGasPoweredCar() {
//        return gasPoweredCar;
//    }
//}

class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinder;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinder are fired up, Ready!! %n",cylinder);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> Usage Exceeds the average ; %.2f %n",avgKmPerLiter);
    }
}

class ElectricCar {
    private double avgKmPerLiter;
    private int batterySize;
}

class HybridCar {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinder;
}
