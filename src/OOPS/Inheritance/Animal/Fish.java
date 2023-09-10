package OOPS.Inheritance.Animal;

public class Fish extends Animal{
    private int gills;
    private int fins;
    public Fish(){}
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("Moving Muscles");
    }

    private void moveBackfin(){
        System.out.println("Moving BackFin");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed.toLowerCase().equals("fast".toLowerCase())){
            moveBackfin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
