package OOPs_Part_2.Compositions.ComputerFactory;

public class Products {
    private String model;
    private String manufacturer;
    private int height;
    private int width;
    private int depth;

    public Products(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}
class Monitor extends Products{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x,int y, String color){
        System.out.println(String.format("draw pixel at %d,%d in color %s",x,y,color));
    }
}

class Motherboard extends Products{
    private int ramSlots;
    private int cardSlots;
    private String bios;
    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadPrograms(String programName){
        System.out.println("Program "+programName+" is Loading...");
    }
}

class ComputerCase extends Products{
    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }
}

