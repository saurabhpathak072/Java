package OOPs_Part_2.Polymorphism.Exercise1;

public class Car {
    private boolean engine = true;
    private int cylinder;
    private String name;
    private int wheels = 4;

    public Car(int cylinder, String name) {
        this(true,cylinder,name,4);
    }
    public Car(boolean engine, int cylinder, String name, int wheels) {
        this.engine = engine;
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = wheels;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Cars -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}