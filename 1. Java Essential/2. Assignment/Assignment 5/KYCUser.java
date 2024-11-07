public class KYCUser extends User {
    private static int rewardsPoints;

    public KYCUser(int id,String userName,String email,double walletBalance) {
        super(id,userName,email,walletBalance);
    }

    public static int getRewardsPoints() {
        return rewardsPoints;
    }
    public static void setRewardsPoints(int rewardsPoints) {
            KYCUser.rewardsPoints = rewardsPoints;
    }

    public boolean makePayment(double billAmount) {
        if(billAmount<=getWalletBalance()) {
            setWalletBalance(getWalletBalance()-billAmount);
            setRewardsPoints(getRewardsPoints()+(int)((billAmount*10)/100));
            return true;
        } return false;
    }
}
