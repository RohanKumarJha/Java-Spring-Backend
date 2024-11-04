public class Tester {
    public static void main(String[] args) {
        Customer obj1 = new Customer();
        obj1.findDiscountAndName("Regular:Jack");

        Customer obj2 = new Customer();
        obj2.findDiscountAndName("Privileged:Mary");
    }
}
