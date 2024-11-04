public class Tester {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(8);
        p1.setY(6);
        System.out.println("The distance of point from origin is "+p1.distance());

        Point p2 = new Point();
        p2.setX(4);
        p2.setY(3);
        System.out.println("The distance between points is "+p1.distance(p2));
    }
}
