public class Tester {
    public static void main(String[] args) {
        Shop sh1 = new Shop(20000.0,Category.LAPTOP);
        sh1.checkDiscountApplicability(sh1.getAmount(), sh1.getType());
        sh1.applyDiscount(sh1.getType());
    }
}
