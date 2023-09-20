package OOPS.Exercise;

public class Circle {
    private double radius;
    final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius<0?0: radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return getRadius()*getRadius()*PI;
    }

}
