public class ExceptionHandling {
    public static void main(String[] args) {
        // Without Exception
        // int a=0;
        // int c=0;
        // c = 18/a;
        // System.out.println(c);
        // System.out.println("Good Job");

        // With Exception
        int a=0; 
        int c=0;
        try {
            c = 18/a;
        } catch(Exception e) {
            System.out.println(c);
        } System.out.println("Good Job");
    }
}