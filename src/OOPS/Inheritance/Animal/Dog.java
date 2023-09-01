package OOPS.Inheritance.Animal;

public class Dog extends  Animal{
    public Dog() {
        super("Mutt","Big",400);
    }

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }
}
