public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public Point() {

    }
    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((x-0)*(x-0)+(y-0)*(y-0));
    }
    public double distance(Point point) {
        return Math.sqrt(((point.x-x)*(point.x-x))+((point.y-y)*(point.y-y)));
    }
}