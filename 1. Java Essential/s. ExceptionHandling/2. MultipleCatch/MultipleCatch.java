public class MultipleCatch {
    public static void main(String[] args) {
        int a=2;
        int c=0;
        int[] arr = {1};
        int[] newArr = {1,2,3,4,5};
        try {
            c = 18/a;
            int n = arr.length;
            newArr[5] = 6;
        } catch(ArithmeticException ae) {
            System.out.println(c);
            System.out.println(ae);
        } catch(NullPointerException npe) {
            System.out.println(npe);
        } catch(ArrayIndexOutOfBoundsException aibe) {
            System.out.println(aibe);
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Good Job.");
    }
}