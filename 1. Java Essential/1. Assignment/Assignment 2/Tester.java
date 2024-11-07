public class Tester {
    public static void main(String[] args) {
        BookMyMovie obj1 = new BookMyMovie(101, 5);
        obj1.calculateDiscount();
        System.out.println("Total amount for booking: "+obj1.calculateTicketAmount());
    }
}
