package OOPS.Point;

public class Point {
    private int x;
    private int y;
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point() {

    }

    public double distance(){
        double distance;
        distance = Math.sqrt((0-this.getX())*(0-this.getX()) + (0 - this.getY())*(0 - this.getY()));
        return distance;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point another){
        double distance;
        distance = Math.sqrt((another.getX()-this.getX())*(another.getX()-this.getX()) + (another.getY() - this.getY())*(another.getY() - this.getY()));
        return distance;
    }
    public double distance(int x, int y){
        double distance;
        distance = Math.sqrt((x-this.getX())*(x-this.getX()) + (y - this.getY())*(y - this.getY()));
        return distance;
    }

}
