public class Tester {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        System.out.println("The distance is "+p1.distance());

        Point p2 = new Point();
        p2.setX(6);
        p2.setY(8);
        System.out.println("The distance is "+p2.distance(p1));
    }
}
