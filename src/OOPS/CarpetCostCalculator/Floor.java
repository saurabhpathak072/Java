package OOPS.CarpetCostCalculator;

public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length<0?0d:length;
        this.width = width<0?0d:width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length<0?0d:length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width<0?0d:width;
    }

    public double  getArea(){
        return this.getLength() * this.getWidth();
    }

}
