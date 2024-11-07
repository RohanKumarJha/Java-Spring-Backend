public class EPayWallet {
    public static void processPaymentByUser(User user,double billAmount) {
        if(user.makePayment(billAmount)) {
            System.out.println("Congratulations "+user.getUserName()+", payment of "+billAmount+" was successful");
            System.out.println("Your wallet balance is "+user.getWalletBalance());
        } else {
            System.out.println("Sorry "+user.getUserName()+", not enough balance to make payment");
            System.out.println("Your wallet balance is "+user.getWalletBalance());
        }
    }
}
