package OOPS;

public class Car {
    private String carModel = "Baleno";
    private String carMaker = "Maruti Suzuki";
    private int doorCount = 4;
    private String color = "Grey";
    private boolean isConvertible = false;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(String carMaker) {
        if(carMaker == null) carMaker = "Unknown";
        String lowerCaseCarmodel = carMaker.toLowerCase();
        switch (lowerCaseCarmodel){
            case "Tata","Maruti", "Mahindra" -> this.carMaker =carMaker;
            default -> this.carMaker = "Not Supported";
        }
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

     void describeCar() {
        System.out.println("Car is manufactured by : " + getCarMaker() + "\n Model : " + getCarModel() + "\n Color: " + getColor() + "\n Door Count: " + getDoorCount() + "\n It is " + (isConvertible() ? "" : "Not ") + "Convertible");
    }
}
