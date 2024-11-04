public class Point {
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(((x-0)*(x-0))+((y-0)*(y-0)));
    }

    public double distance(Point point) {
        return Math.sqrt(((point.x-x)*(point.x-x))+((point.y)*point.y));
    }
}