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
        if(type.toLowerCase().equals("Wolf".toLowerCase())){
            System.out.print("Ow Woo!");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dog run, walk and wag their.");
        if(speed.toLowerCase().equals("slow".toLowerCase())){
            walk();
            wagTail();
        }else {
            bark();
            run();
        }
        System.out.println();
    }

    private void bark(){
        System.out.print("Woof! ");
    }

    private void run(){
        System.out.print("Dog running ");
    }

    private void walk(){
        System.out.print("Dog Walking ");
    }

    private void wagTail(){
        System.out.print("Wag Tailing ");
    }
}
