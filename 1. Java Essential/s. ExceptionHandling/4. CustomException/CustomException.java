class RohanException extends Exception {
    public RohanException(String str) {
        System.out.println(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int a=20;
        int c=0; 
        try {
            c = 18/a;
            if(c==0) {
                throw new RohanException("This is my Exception");
            }
        } catch(RohanException re) {
            System.out.println("I want to print something different");
        } catch(ArithmeticException ae) {
            System.out.println(ae);
        } catch(Exception e) {
            System.out.println(e);
        } System.out.println("Good Job");
    }
}