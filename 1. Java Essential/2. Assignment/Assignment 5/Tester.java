public class Tester {
    public static void main(String[] args) {
        User jack = new User(101, "Jack", "jack@infy.com", 1000);
        EPayWallet.processPaymentByUser(jack, 700); 

        KYCUser jill = new KYCUser(201, "Jill", "jill@infy.com", 3000);
        EPayWallet.processPaymentByUser(jill, 1500);
        System.out.println("You have "+KYCUser.getRewardsPoints()+" reward points");
        EPayWallet.processPaymentByUser(jill, 800);
        System.out.println("You have "+KYCUser.getRewardsPoints()+" reward points");
        EPayWallet.processPaymentByUser(jill, 900);
        System.out.println("You have "+KYCUser.getRewardsPoints()+" reward points");
    }
}

