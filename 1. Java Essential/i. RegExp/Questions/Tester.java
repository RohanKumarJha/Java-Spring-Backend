public class Tester {
    public static void main(String[] args) {
        WebAddressValidator obj1 = new WebAddressValidator();
        if(obj1.isValidWebAddress("http://www.infosys.com")) {
            System.out.println("You have entered a valid web address");
        } else {
            System.out.println("You have entered an invalid web address");
        }

        WebAddressValidator obj2 = new WebAddressValidator();
        if(obj2.isValidWebAddress("http.www.infosys.au")) {
            System.out.println("You have entered a valid web address");
        } else {
            System.out.println("You have entered an invalid web address");
        }
    }
}
