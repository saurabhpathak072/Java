package OOPs_Part_2.Polymorphism.Challenge1;

class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinder;

//    public GasPoweredCar(String description) {
//        super(description);
//    }

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

class ElectricCar extends Car{
    private double avgKmPercharge;
    private int batterySize;
//    public ElectricCar(String description) {
//        super(description);
//    }

    public ElectricCar(String description, double avgKmPercharge, int batterySize) {
        super(description);
        this.avgKmPercharge = avgKmPercharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> Switch %d kWh battery on, Ready!! %n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> Usage under Average %.2f %n",avgKmPercharge);
    }
}

class HybridCar extends Car{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinder;

//    public HybridCar(String description){
//        super(description);
//    }

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinder) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinder are fired up, Ready!! %n",cylinder);
        System.out.printf("Hybrid -> Switch %d kWh battery on, Ready!! %n",batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> Usage below average ; %.2f %n",avgKmPerLiter);
    }
}
