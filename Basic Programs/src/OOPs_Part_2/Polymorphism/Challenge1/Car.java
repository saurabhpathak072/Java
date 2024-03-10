package OOPs_Part_2.Polymorphism.Challenge1;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> Engine Starts!!");
    }

    protected void runEngine(){
        System.out.println("Car -> Run Engine!!");

    }

    public void drive(){
        System.out.println("Car -> Drive!!, Type is : "+ getClass().getSimpleName());
        runEngine();
    }
}
