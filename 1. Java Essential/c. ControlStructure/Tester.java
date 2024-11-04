public class Tester {
    public static void main(String[] args) {
        int number = 1623;
        int num = number;
        int count=0;
        // length of digits
        while(num!=0) {
            count++;
            num /= 10;
        }
        int num2 = number;
        int result = 0;
        while(num2!=0) {
            if(count%2==0) {
                int ans = num%10;
                result += ans*ans;
            } count--;
            num2 /= 10;
        } 
        if(result%9==0) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not Perfect number");
        }
    }
}
