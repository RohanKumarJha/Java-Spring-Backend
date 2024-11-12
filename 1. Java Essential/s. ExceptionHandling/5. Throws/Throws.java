public class Throws {
    public static void show() throws ArithmeticException {
        int a=0;
        int c=0;
        c = 18/a;
        System.out.println(c);
    }
    public static void main(String[] args) {
        try {
            show();
        } catch(ArithmeticException ae) {
            System.out.println(ae);
        }
    }
}