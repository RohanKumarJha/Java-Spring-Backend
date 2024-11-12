public class Throw {
    public static void main(String[] args) {
        int a=20;
        int c=0;
        try {
            c = 18/a;
            if(c==0) {
                throw new ArithmeticException("Divide by zero");
            }
        } catch(ArithmeticException ae) {
            System.out.println(ae);
        } catch(Exception e) {
            System.out.println("Default Exception");
        } System.out.println("Good Job");
    }
}