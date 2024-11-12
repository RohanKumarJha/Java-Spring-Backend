public class TryFinally {
    public static void main(String[] args) {
        int c=0;
        try {
            c=18/c;
            System.out.println("Finally");
        }
        finally {
            System.out.println("Completed");
        }
    }
}