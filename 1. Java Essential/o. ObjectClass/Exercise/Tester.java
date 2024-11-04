class Tester {
    public static void main(String[] args) {
        Customer c1 = new Customer(105, "Max", "8574637281");
        Customer c2 = new Customer(109, "Nick", "9453281756");
        Customer c3 = new Customer(109, "Nick", "9453281756");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
   }