public class Tester {
    public static void main(String[] args) {
        Point obj1 = new Point(3,4);
        System.out.println(obj1.distance());

        Point obj2 = new Point();
        obj2.setX(7);
        obj2.setY(8);
        System.out.println((int)obj2.distance(obj1));
    }
}
