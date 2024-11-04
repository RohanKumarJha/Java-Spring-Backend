public class Tester {
    public static void main(String[] args) {
        Traveller obj1 = new Traveller("Roger","AQW1344321");
        obj1.calculateFare();
        obj1.displayDatails();

        System.out.println();
        SeniorTraveller obj2 = new SeniorTraveller("Joey", "PJAMG7755TY");
        obj2.setAge(70);
        obj2.calculateFare();
        obj2.displayDatails();
    }
}
