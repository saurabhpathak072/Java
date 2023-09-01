package OOPS.Inheritance.Animal;

public class Dog extends  Animal{
    private String earShape;
    private String tailShape;
    public Dog() {
        super("Mutt","Big",400);
    }

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }


    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, (weight<15?"small":(weight<35?"medium":"large")), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type, double weight){
        this(type,weight,"Perky","Curled");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeVoice(){

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dog run, walk and wag their.");
    }
}
